package exo2

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
) extends PlayerStats {

  def summary: String =
    "matches=" + matches +
    ", minutes=" + minutes +
    ", goals=" + goals +
    ", assists=" + assists +
    ", passesAttempted=" + passesAttempted +
    ", percPassesCompleted=" + percPassesCompleted.getOrElse("N/A") +
    ", penaltyGoals=" + penaltyGoals +
    ", penaltyAttempted=" + penaltyAttempted +
    ", xG=" + xG.getOrElse("N/A") +
    ", xA=" + xA.getOrElse("N/A") +
    ", yellowCards=" + yellowCards +
    ", redCards=" + redCards
}