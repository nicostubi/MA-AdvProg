package exo2.csv

import exo2.domain.Club.Club
import exo2.domain.Nationality.Nationality
import exo2.domain.Player.*
import exo2.domain.Position.PositionSet
import exo2.domain.Stats.GoalkeeperStats
import exo2.domain.Stats.OutfieldStats

object PlayerRowDecoder extends RowDecoder[Player]:

  def decode(row: DataRow): Either[String, Player] =
    try
      val positionSet = PositionSet.fromString(row.position)

  //     TODO
  //       passesAttempted: Int,
  // percPassesCompleted: Option[Double],
  // yellowCards: Int,
  // redCards: Int

      if positionSet.isGoalkeeper then
        Right(
          Goalkeeper(
            name = row.name,
            club = Club(row.club),
            nationality = Nationality(row.nationality),
            positions = positionSet,
            age = row.age,
            matches = row.matches,
            starts = row.starts,
            mins = row.mins,
            stats = GoalkeeperStats(
              matches = row.matches,
              minutes = row.mins,
              passesAttempted = row.passesAttempted,
              percPassesCompleted = row.percPassesCompleted,
              yellowCards = row.yellowCards,
              redCards = row.redCards
            )
          )
        )
      else
        Right(
          OutfieldPlayer(
            name = row.name,
            club = Club(row.club),
            nationality = Nationality(row.nationality),
            positions = positionSet,
            age = row.age,
            matches = row.matches,
            starts = row.starts,
            mins = row.mins,
            stats = OutfieldStats(
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
          )
        )
    catch
      case e: Exception =>
        Left(s"Failed to decode player '${row.name}': ${e.getMessage}")