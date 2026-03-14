package exo2.csv
import exo2.domain.Player

object PlayerRowDecoder extends RowDecoder[Player]:
  def decode(row: DataRow): Either[String, Player] =
    try
      Right(Player.fromRow(row))
    catch
      case e: Exception =>
        Left(s"Failed to decode player '${row.name}': ${e.getMessage()}")