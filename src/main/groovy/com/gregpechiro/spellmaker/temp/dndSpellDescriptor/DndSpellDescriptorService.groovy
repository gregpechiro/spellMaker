package com.gregpechiro.spellmaker.temp.dndSpellDescriptor

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@Service
class DndSpellDescriptorService {
	
	@Autowired
	DndSpellDescriptorRepository repo

	List<DndSpellDescriptors> findAll()  {
		repo.findAll()
	}

	List<DndSpellDescriptors> findBySpell(Integer spellId) {
		repo.findBySpell(spellId)
	}

	DndSpellDescriptors findOne(Integer id) {
		repo.findOne(id)
	}

	DndSpellDescriptors save(DndSpellDescriptors dndSpellDescriptor) {
		repo.save(dndSpellDescriptor)
	}
	
	def delete(Integer id) {
		repo.delete(id)
	}
}
