package com.gregpechiro.spellmaker.temp.dndSpellDescriptor
import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

@CompileStatic
interface DndSpellDescriptorRepository extends JpaRepository<DndSpellDescriptors, Integer> {

	@Query("SELECT d FROM DndSpellDescriptors d WHERE d.spellId=:spellId")
	List<DndSpellDescriptors> findBySpell(@Param("spellId") Integer spellId)
}