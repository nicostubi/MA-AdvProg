package exo2
import exo2.csv.DatasetManager

@main def run()=
  val dataset = DatasetManager.load("src/main/scala/exo2/data/09-PremierLeague.csv")
  println(dataset.rows.size + " records loaded")
  dataset.players.foreach(player => println(player.summary))
