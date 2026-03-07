package exo2

case class Player(name:String, age:Int, club: Club, nationality: Nationality, positions: PositionSet, stats: PlayerStats) {

  def summary: String =
    "Name: " + name +
    ", Age: " + age +
    ", Club: " + club.name +
    ", Nationality: " + nationality.code +
    ", Positions: " + positions.positions +
    ", Stats: " + stats.summary
}

object Player {

  def fromRow(row: DataRow): Player =
    val positions = PositionSet.fromString(row.position)
    val club = Club(row.club)
    val nationality = Nationality(row.nationality)

    val stats: PlayerStats =
      if positions.isGoalkeeper then
        GoalkeeperStats(
          matches = row.matches,
          minutes = row.mins,
          passesAttempted = row.passesAttempted,
          percPassesCompleted = row.percPassesCompleted,
          yellowCards = row.yellowCards,
          redCards = row.redCards
        )
      else
        OutfieldStats(
          matches = row.matches,
          minutes = row.mins,
          goals = row.goals,
          assists = row.assists,
          passesAttempted = row.passesAttempted,
          percPassesCompleted = row.percPassesCompleted,
          penaltyGoals = row.penaltyGoals,
          penaltyAttempted = row.penaltyAttempted,
          xG = row.xG,
          xA = row.xA,
          yellowCards = row.yellowCards,
          redCards = row.redCards
        )

    Player(
      name = row.name,
      age = row.age,
      club = club,
      nationality = nationality,
      positions = positions,
      stats = stats
    )
}