package com.gregpechiro.spellmaker.temp.dndSpellsubschool

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class DndSpellsubschool {

	@Id
	@GeneratedValue
	Integer id

	String name, slug
}
