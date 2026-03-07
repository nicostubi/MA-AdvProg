package exo2

case class Player(name:String, age:Int, positions: PositionSet, stats: PlayerStats) 

object Player {
  def fromRow(row: DataRow): Player=
    val pos = PositionSet.fromString(row.position)
    val stat =
      if pos.contains(Position.Goalkeeper) then
        GoalkeeperStats(row.matches, row.mins, 0, 0)
      else
        OutfieldStats(row.matches, row.mins, row.goals, row.assists, row.passesAttempted, row.percPassesCompleted)
    Player(
      name = row.name,
      age = row.age,
      positions = pos,
      stats = stat,

      /*club = club,
      nationality = nationality,
      positions = positions,*/
    )
}