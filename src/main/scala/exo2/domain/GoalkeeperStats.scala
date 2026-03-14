package exo2.domain
import exo2.domain.PlayerStats

case class GoalkeeperStats(
  matches: Int,
  minutes: Int,
  passesAttempted: Int,
  percPassesCompleted: Option[Double],
  yellowCards: Int,
  redCards: Int
) extends PlayerStats {

  def summary: String =
    "matches=" + matches +
    ", minutes=" + minutes +
    ", passesAttempted=" + passesAttempted +
    ", percPassesCompleted=" + percPassesCompleted.getOrElse("N/A") +
    ", yellowCards=" + yellowCards +
    ", redCards=" + redCards
}