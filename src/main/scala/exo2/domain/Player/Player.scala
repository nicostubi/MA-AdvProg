package exo2.domain.Player
import exo2.domain.Club.Club
import exo2.domain.Nationality.Nationality
import exo2.domain.Stats.PlayerStats
import exo2.domain.Position.PositionSet

/**
 * Common supertype for all players in the dataset.
 *
 * This trait represents the shared information available for every player,
 * regardless of whether the player is a goalkeeper or an outfield player.
 *
 * It is intentionally used as a parent type so that Goalkeeper and
 * OutfieldPlayer can be modeled as subtypes. This makes covariance in
 * PlayerDataset meaningful.
 */
trait Player:
  def name: String
  def age: Int
  def club: Club
  def nationality: Nationality
  def positions: PositionSet
  def matches: Int 
  def starts: Int 
  def mins: Int
  def stats: PlayerStats

  def displayFull: String =
    "Name: " + name +
    ", Age: " + age +
    ", Club: " + club.name +
    ", Nationality: " + nationality.code +
    ", Positions: " + positions.positions +
    ", Stats: " + stats.summary

  def displayLight: String =
    name + " | Positions: " + positions.positions.mkString(", ")
