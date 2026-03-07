package exo2

@main def run()=
  val dataset = DatasetManager.load("src/main/scala/exo2/09-PremierLeague.csv")
  println(dataset.rows.size + " records loaded")
  dataset.players.foreach(player => println(player.summary))
