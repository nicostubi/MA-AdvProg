package exo2.parsers

/**
 * Generic CSV row decoder using a parametrized type A.
 *
 * This abstraction separates CSV parsing concerns from domain modeling.
 * It allows the same decoding mechanism to be reused for multiple domain
 * types (e.g., Player, Club, Nationality).
 *
 * Using a parametrized type ensures compile-time type safety: each decoder
 * produces a value of a specific type without requiring casts.
 *
 * The Either return type represents a safe decoding result:
 *   - Left(error message) if decoding fails
 *   - Right(value of type A) if decoding succeeds
 */
trait RowDecoder[A]:
  def decode(row: DataRow): Either[String, A]