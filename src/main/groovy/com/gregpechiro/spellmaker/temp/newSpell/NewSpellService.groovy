package com.gregpechiro.spellmaker.temp.newSpell

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@Service
class NewSpellService {
	
	@Autowired
	NewSpellRepository repo

	List<NewSpell> findAll()  {
		repo.findAll()
	}

	NewSpell findOne(Integer id) {
		repo.findOne(id)
	}

	NewSpell save(NewSpell newSpell) {
		repo.save(newSpell)
	}

	def save(List<NewSpell> newSpells) {
		repo.save(newSpells)
	}
	
	def delete(Integer id) {
		repo.delete(id)
	}
}
