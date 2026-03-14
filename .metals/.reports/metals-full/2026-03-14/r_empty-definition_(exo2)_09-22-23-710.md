error id: file:///C:/Projects/HES/MA-AdvProg/exo2/src/main/scala/exo2/csv/DatasetManager.scala:DataRow
file:///C:/Projects/HES/MA-AdvProg/exo2/src/main/scala/exo2/csv/DatasetManager.scala
empty definition using pc, found symbol in pc: 
semanticdb not found

found definition using fallback; symbol DataRow
offset: 180
uri: file:///C:/Projects/HES/MA-AdvProg/exo2/src/main/scala/exo2/csv/DatasetManager.scala
text:
```scala
package exo2.csv

import scala.io.Source
import exo2.domain.Player
import exo2.csv.DataRow

object DatasetManager {

  def load(path: String): PlayerDataset =
    val rows: List[Da@@taRow] = readLines(path).map(parseRow)

    val players: List[Player] = rows.map(Player.fromRow)

    PlayerDataset(rows, players)

  private def readLines(path: String): List[String] =
    Source.fromFile(path, "UTF-8").getLines().drop(1).toList

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
      percPassesCompleted = cols(11).toDoubleOption,
      penaltyGoals = cols(12).toInt,
      penaltyAttempted = cols(13).toInt,
      xG = cols(14).toDoubleOption,
      xA = cols(15).toDoubleOption,
      yellowCards = cols(16).toInt,
      redCards = cols(17).toInt
    )
  
  private def splitCsv(line: String): List[String] =
    line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)").map(_.replace("\"", "")).toList
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 