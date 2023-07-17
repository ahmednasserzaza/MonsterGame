import factories.BalancedMonsterFactory
import factories.MonsterFactory
import factories.RandomMonsterFactory

fun main() {

    val randomMonsterFactory : MonsterFactory = RandomMonsterFactory()
    val balancedMonsterFactory : MonsterFactory = BalancedMonsterFactory()

    val randomMonster = randomMonsterFactory.createMonster()
    val balancedMonster = balancedMonsterFactory.createMonster()

    randomMonster.attack()
    balancedMonster.attack()
}