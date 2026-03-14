package exo2.domain
import exo2.domain.Player
import exo2.csv.DataRow

case class PlayerDataset(rows: List[DataRow], players: List[Player])
