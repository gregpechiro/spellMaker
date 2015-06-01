package com.gregpechiro.spellmaker.temp.dndSpell
import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository

@CompileStatic
interface DndSpellRepository extends JpaRepository<DndSpell, Integer> {
}