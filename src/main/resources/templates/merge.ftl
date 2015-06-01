<!DOCTYPE html>
<html>
	<head>
		<title>DND Spell Complete</title>
	</head>

	<body>
		<h4>Should Be Merged</h4>
		<p>Id: ${spell.id}</p>
		<p>Spell School: ${(spell.school)!}</p>
		<p>Spell Sub School: ${(spell.subschool)!}</p>
		<p>Rulebook: ${(spell.rulebook)!}</p>
		<p>Page: ${(spell.page)!}</p>
		<p>Descriptors: ${(spell.descriptors)!}</p>
		<p>Name: ${(spell.name)!}</p>
		<p>Casting Time: ${(spell.castingTime)!}</p>
		<p>Spell Range: ${(spell.spellRange)!}</p>
		<p>Target: ${(spell.target )!}</p>
		<p>Effect: ${(spell.effect)!}</p>
		<p>Area: ${(spell.area)!}</p>
		<p>Duration: ${(spell.duration)!}</p>
		<p>Saving Throw: ${(spell.savingThrow)!}</p>
		<p>Spell Resistance: ${(spell.spellResistance)!}</p>
		<p>Verbal Component: ${(spell.verbalComponent?c)!}</p>
		<p>Somatic Component: ${(spell.somaticComponent?c)!}</p>
		<p>Material Component: ${(spell.materialComponent?c)!}</p>
		<p>Arcane Focus Component: ${(spell.arcaneFocusComponent?c)!}</p>
		<p>Divine Focus Component: ${(spell.divineFocusComponent?c)!}</p>
		<p>XP Component: ${(spell.xpComponent?c)!}</p>
		<p>Meta Breath Component: ${(spell.metaBreathComponent?c)!}</p>
		<p>True Name Component: ${(spell.trueNameComponent?c)!}</p>
		<p>Corrupt Component: ${(spell.corruptComponent?c)!}</p>
		<p>Description:</p>
		<br/>
		${(spell.descriptionHtml)!}
	</body>
<html>