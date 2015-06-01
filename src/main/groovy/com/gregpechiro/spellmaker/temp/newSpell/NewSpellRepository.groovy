package com.gregpechiro.spellmaker.temp.newSpell

import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository

@CompileStatic
interface NewSpellRepository extends JpaRepository<NewSpell, Integer> {
}