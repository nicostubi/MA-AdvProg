package exo2.parsers

// jpc this looks like an auxiliary class, not a part of the "real" data model: Player, Position, etc.
// In a new version of Scala (3.7) now we can do something like:
// type DataRow2 (name: String, club:String, position:String, age:Int ) which would be ideal for this case

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

