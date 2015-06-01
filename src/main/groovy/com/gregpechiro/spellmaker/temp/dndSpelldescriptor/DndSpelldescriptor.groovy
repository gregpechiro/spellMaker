package com.gregpechiro.spellmaker.temp.dndSpelldescriptor

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class DndSpelldescriptor {

	@Id
	@GeneratedValue
	Integer id

	String name, slug
}

