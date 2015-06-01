package com.gregpechiro.spellmaker.temp.dndRulebook

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class DndRulebook {

	@Id
	@GeneratedValue
	Integer id

	String dnd_edition_id, name, abbr, description, year, official_url, slug, image, published

}
