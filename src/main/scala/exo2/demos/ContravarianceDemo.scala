package exo2.demos

import exo2.domain.Player.*
import exo2.render.*

object ContravarianceDemo:

  def printDataset[A <: Player](dataset: PlayerDataset[A], renderer: Renderer[A]): Unit =
    dataset.players.foreach(p => println(renderer.render(p)))