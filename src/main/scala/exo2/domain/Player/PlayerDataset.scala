package exo2.domain.Player
import exo2.domain.Player.Player
import exo2.parsers.DataRow

/**
 * Immutable covariant dataset of players.
 *
 * The type parameter A is covariant (+A). This means that if Goalkeeper
 * is a subtype of Player, then PlayerDataset[Goalkeeper] is also a subtype
 * of PlayerDataset[Player].
 *
 * This is appropriate because the dataset is immutable and only exposes
 * values of type A.
 */
case class PlayerDataset[+A <: Player](
  rows: List[DataRow],
  players: List[A]
):
  def map[B <: Player](f: A => B): PlayerDataset[B] =
    PlayerDataset(rows, players.map(f))

  def foreach(f: A => Unit): Unit =
    players.foreach(f)

  def goalkeepers: PlayerDataset[Goalkeeper] =
    PlayerDataset(
      rows,
      players.collect { case gk: Goalkeeper => gk }
    )
