package com.gregpechiro.spellmaker.temp.dndSpell

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@CompileStatic
@Service
class DndSpellService {
	
	@Autowired
	DndSpellRepository repo

	List<DndSpell> findAll()  {
		repo.findAll()
	}

	DndSpell findOne(Integer id) {
		repo.findOne(id)
	}

	DndSpell save(DndSpell dndSpell) {
		repo.save(dndSpell)
	}
	
	def delete(Integer id) {
		repo.delete(id)
	}
}
