package exo2

case class DataRow(
  name: String,
  club: String,
  nationality: String,
  position: String,
  age: Int,
  matches: Int,
  starts: Int,
  mins: Int,
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
)
