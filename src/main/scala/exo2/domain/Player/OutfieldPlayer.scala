package exo2.domain.Player

import exo2.domain.Club.Club
import exo2.domain.Nationality.Nationality
import exo2.domain.Position.PositionSet
import exo2.domain.Stats.OutfieldStats

/**
 * Domain model for outfield players.
 *
 * Outfield players are modeled as a subtype of Player because they share the
 * same common player information, but expose a different statistics model
 * from goalkeepers.
 */
case class OutfieldPlayer(
  name: String,
  age: Int,
  club: Club,
  nationality: Nationality,
  positions: PositionSet,
  matches: Int,
  starts: Int,
  mins: Int,
  stats: OutfieldStats
) extends Player