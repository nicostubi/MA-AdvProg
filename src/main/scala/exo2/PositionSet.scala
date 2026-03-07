package exo2

case class PositionSet(positions: Set[Position]) {

  def contains(position: Position): Boolean =
    positions.contains(position)

  def isGoalkeeper: Boolean =
    positions.contains(Position.Goalkeeper)

  def isOutfieldPlayer: Boolean =
    !isGoalkeeper
}

object PositionSet {

  def fromString(value: String): PositionSet =
    PositionSet(value.split(",").map(_.trim).map(Position.fromString).toSet)
}