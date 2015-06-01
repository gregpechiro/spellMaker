package com.gregpechiro.spellmaker.temp.newSpell

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class NewSpell {

	@Id
	@GeneratedValue
	Integer id

	String school
	String subschool
	String rulebook
	String descriptors
	Integer page
	@Column(columnDefinition = "LONGTEXT")
	String descriptionHtml
	String name, castingTime, spellRange, target, effect, area, duration, savingThrow, spellResistance
	Boolean verbalComponent, somaticComponent, materialComponent, arcaneFocusComponent, divineFocusComponent, xpComponent, metaBreathComponent, trueNameComponent, corruptComponent
}
