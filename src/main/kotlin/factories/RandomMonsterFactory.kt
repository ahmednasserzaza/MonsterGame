package factories

import monsters.Bear
import monsters.Lion
import monsters.Monster
import monsters.Wolf

class RandomMonsterFactory : MonsterFactory {
    override fun createMonster(): Monster {

        return when ((0..2).random()) { // Generate a random number (0, 1, or 2)
            0 -> Lion() // Create a monsters.Lion
            1 -> Bear() // Create a monsters.Bear
            else -> Wolf() // Create a monsters.Wolf
        }
    }
}