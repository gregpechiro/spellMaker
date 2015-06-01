package com.gregpechiro.spellmaker.temp.dndSpellDescriptor

import com.gregpechiro.spellmaker.temp.dndSpelldescriptor.DndSpelldescriptor

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class DndSpellDescriptors {

	@Id
	@GeneratedValue
	Integer id

	Integer spellId

	@ManyToOne
	@JoinColumn(name="spelldescriptor_id")
	DndSpelldescriptor dndSpelldescriptor

}
