package com.gregpechiro.spellmaker.temp.dndSpellschool

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class DndSpellschool {

	@Id
	@GeneratedValue
	Integer id

	String name, slug
}
