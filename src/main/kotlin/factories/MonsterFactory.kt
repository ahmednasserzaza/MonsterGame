package factories

import monsters.Monster

interface MonsterFactory {
    fun createMonster(): Monster
}