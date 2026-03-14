package exo2

case class PositionSet(positions: Set[Position]) : // {

  // def contains = positions.contains  jpc: this could probably replace the method below, you may check 

  def contains(position: Position): Boolean = 
    positions.contains(position)

  def isGoalkeeper: Boolean =   // jpc: consider making it a val ?
    positions.contains(Position.Goalkeeper)

  def isOutfieldPlayer: Boolean =
    !isGoalkeeper
//}

object PositionSet : //{

  def fromString(value: String): PositionSet =
    PositionSet(value.split(",").map(_.trim).map(Position.fromString).toSet)
//}