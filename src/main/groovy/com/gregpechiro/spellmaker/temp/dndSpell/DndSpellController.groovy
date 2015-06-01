package com.gregpechiro.spellmaker.temp.dndSpell
import com.gregpechiro.spellmaker.temp.dndSpellDescriptor.DndSpellDescriptorService
import com.gregpechiro.spellmaker.temp.newSpell.NewSpell
import com.gregpechiro.spellmaker.temp.newSpell.NewSpellService
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@CompileStatic
@Controller
class DndSpellController {

	@Autowired
	DndSpellService dndSpellService

	@Autowired
	DndSpellDescriptorService descriptorService

	@Autowired
	NewSpellService newSpellService

	@RequestMapping(value = "/test")
	@ResponseBody
	Object test(Model model) {
		def spell = new NewSpell()
		def dndSpell = dndSpellService.findOne(2621)
		def descriptors = descriptorService.findBySpell(dndSpell.id)
		spell.descriptors = new ArrayList<>()
		mergeProperties(dndSpell, spell)
		if (descriptors != null) {
			def descriptorStrings = new ArrayList<String>()
			descriptors.each { descriptor ->
				descriptorStrings.add(descriptor.dndSpelldescriptor.name)
			}
			spell.descriptors = String.join(", ", descriptorStrings)
		}
		spell.school = (dndSpell.dndSpellschool != null) ? dndSpell.dndSpellschool.name : ""
		spell.subschool = (dndSpell.dndSpellsubschool != null) ? dndSpell.dndSpellsubschool.name : ""
		spell.rulebook = (dndSpell.dndRulebook != null) ? dndSpell.dndRulebook.name : ""
		//model.addAllAttributes([spell : spell])
		spell
	}

	@RequestMapping("/merge")
	String merge(Model model) {
		def dndspells = dndSpellService.findAll()
		def newSpells = new ArrayList<NewSpell>()
		dndspells.each { dndSpell ->
			def spell = new NewSpell()
			def descriptors = descriptorService.findBySpell(dndSpell.id)
			spell.descriptors = new ArrayList<>()
			mergeProperties(dndSpell, spell)
			if (descriptors != null) {
				def descriptorStrings = new ArrayList<String>()
				descriptors.each { descriptor ->
					descriptorStrings.add(descriptor.dndSpelldescriptor.name)
				}
				spell.descriptors = String.join(", ", descriptorStrings)
			}
			spell.school = (dndSpell.dndSpellschool != null) ? dndSpell.dndSpellschool.name : ""
			spell.subschool = (dndSpell.dndSpellsubschool != null) ? dndSpell.dndSpellsubschool.name : ""
			spell.rulebook = (dndSpell.dndRulebook != null) ? dndSpell.dndRulebook.name : ""
			newSpells.add(spell)
		}
		newSpellService.save(newSpells)
		model.addAttribute("spell", newSpellService.findOne(1))
		"merge"
	}

	@RequestMapping(value = "/newspell/{id}")
	String newSpell(Model model, @PathVariable Integer id) {
		model.addAttribute("spell", newSpellService.findOne(id))
		"test"
	}

	static def mergeProperties(source, target) {
		source.properties.each { key, value ->
			if (target.hasProperty(key as String) && !(key in ['class', 'metaClass']) && value != null)
				target[key as String] = value
		}
	}
}
