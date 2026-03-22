package exo2.domain.Stats
import exo2.domain.Stats.PlayerStats

case class OutfieldStats(
  matches: Int,
  minutes: Int,
  goals: Int,
  assists: Int,
  passesAttempted: Int,
  percPassesCompleted: Option[Double],
  penaltyGoals: Int,
  penaltyAttempted: Int,
  xG: Option[Double],
  xA: Option[Double],
  yellowCards: Int,
  redCards: Int
) extends PlayerStats:

  def summary: String =
    "matches=" + matches +
    ", minutes=" + minutes +
    ", goals=" + goals +
    ", assists=" + assists