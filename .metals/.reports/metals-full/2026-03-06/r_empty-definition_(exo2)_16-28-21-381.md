error id: file:///C:/Projects/HES/MA-AdvProg/exo2/src/main/scala/exo2/Player.scala:
file:///C:/Projects/HES/MA-AdvProg/exo2/src/main/scala/exo2/Player.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb

found definition using fallback; symbol positions
offset: 553
uri: file:///C:/Projects/HES/MA-AdvProg/exo2/src/main/scala/exo2/Player.scala
text:
```scala
package exo2

case class Player(name:String, age:Int, positions: PositionSet, stats: PlayerStats) 

object Player {
  def fromRow(row: DataRow): Player=
    val positions = PositionSet.fromString(row.position)
    val stats =
      if positions.contains(Position.Goalkeeper) then
        GoalkeeperStats(row.matches, row.mins, 0, 0)
      else
        OutfieldStats(row.matches, row.mins, row.goals, row.assists, row.passesAttempted, row.percPassesCompleted)
    Player(
      name = row.name,
      age = row.age,
      this.stats = stats,
      this.p@@ositions = positions
      /*club = club,
      nationality = nationality,
      positions = positions,*/
    )
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 