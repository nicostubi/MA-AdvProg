package exo2.domain.Stats
import exo2.domain.Stats.PlayerStats

case class GoalkeeperStats(
  matches: Int,
  minutes: Int,
  passesAttempted: Int,
  percPassesCompleted: Option[Double],
  yellowCards: Int,
  redCards: Int
) extends PlayerStats:

  def summary: String =
    "matches=" + matches +
    ", minutes=" + minutes +
    ", passesAttempted=" + passesAttempted +
    ", percPassesCompleted=" + percPassesCompleted.map(_.toString).getOrElse("N/A") +
    ", yellowCards=" + yellowCards +
    ", redCards=" + redCards