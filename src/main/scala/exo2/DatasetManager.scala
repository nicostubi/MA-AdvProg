package exo2

import scala.io.Source

object DatasetManager {

  def load(path: String): Dataset=
    val lines = Source.fromFile(path, "UTF-8").getLines().drop(1)
    val rows = lines.toList.map(parseRow)
    val players: List[Player] = rows.map(row => Player.fromRow(row))
    Dataset(rows, players)

  private def parseRow(line: String): DataRow=

    val cols = splitCsv(line)

    DataRow(
      name = cols(0),
      club = cols(1),
      nationality = cols(2),
      position = cols(3),
      age = cols(4).toInt,
      matches = cols(5).toInt,
      starts = cols(6).toInt,
      mins = cols(7).toInt,
      goals = cols(8).toInt,
      assists = cols(9).toInt,
      passesAttempted = cols(10).toInt,
      percPassesCompleted = Option(cols(11)).filter(_.nonEmpty).map(_.toDouble),
      penaltyGoals = cols(12).toInt,
      penaltyAttempted = cols(13).toInt,
      xG = Option(cols(14)).filter(_.nonEmpty).map(_.toDouble),
      xA = Option(cols(15)).filter(_.nonEmpty).map(_.toDouble),
      yellowCards = cols(16).toInt,
      redCards = cols(17).toInt
    )
  
  private def splitCsv(line: String): List[String] =
    line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)").map(_.replace("\"", "")).toList
}
