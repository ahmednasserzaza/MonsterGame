package factories

import monsters.Bear
import monsters.Lion
import monsters.Monster
import monsters.Wolf

class BalancedMonsterFactory : MonsterFactory {
    override fun createMonster(): Monster {
        val currentTime = System.currentTimeMillis()

        return when (currentTime % 3) {
            0L -> Lion() // Create a monsters.Lion
            1L -> Bear() // Create a monsters.Bear
            else -> Wolf() // Create a monsters.Wolf
        }
    }
}