package exo2.demos

import exo2.domain.Player.Player
import exo2.domain.Player.PlayerDataset
import exo2.domain.Player.Goalkeeper

/**
 * Small demonstration of covariance with PlayerDataset[+A].
 *
 * Because PlayerDataset is covariant, a PlayerDataset[Goalkeeper]
 * can be used where a PlayerDataset[Player] is expected.
 */
object CovarianceDemo:

  def printNames(dataset: PlayerDataset[Player]): Unit =
    dataset.players.foreach(player => println(player.displayLight))

  def printNamesOfGoalkeepers(dataset: PlayerDataset[Goalkeeper]): Unit =
    dataset.players.foreach(goalkeeper => println(goalkeeper.displayLight))