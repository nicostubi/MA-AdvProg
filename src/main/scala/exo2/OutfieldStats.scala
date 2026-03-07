package exo2

case class OutfieldStats(matches: Int, minutes: Int, goals: Int, assists: Int,  passesAttempted: Int, percPassesCompleted: Option[Double]) 
  extends PlayerStats