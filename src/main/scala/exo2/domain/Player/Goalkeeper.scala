package exo2.domain.Player

import exo2.domain.Club.Club
import exo2.domain.Nationality.Nationality
import exo2.domain.Position.PositionSet
import exo2.domain.Stats.GoalkeeperStats

/**
 * Domain model for goalkeepers.
 *
 * Goalkeepers are modeled as a subtype of Player because they share the same
 * core identity and metadata as other players, while having their own
 * specialized statistics.
 */
case class Goalkeeper(
  name: String,
  age: Int,
  club: Club,
  nationality: Nationality,
  positions: PositionSet,
  matches: Int,
  starts: Int,
  mins: Int,
  stats: GoalkeeperStats
) extends Player