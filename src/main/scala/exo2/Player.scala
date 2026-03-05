package exo2

case class Player(name:String, age:Int) 

object Player {
  def fromRow(row: DataRow): Player=
    Player(
      name = row.name,
      age = row.age,
      /*club = club,
      nationality = nationality,
      positions = positions,
      stats = stats*/
    )
}