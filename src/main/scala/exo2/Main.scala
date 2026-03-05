package exo2

@main def run()=
  val dataset = DatasetManager.load("src/main/scala/exo2/09-PremierLeague.csv")
  println(dataset.rows.size + " records loaded")
  dataset.players.foreach(player => println("Name: " + player.name + " Age: " + player.age))
  /*
listy.foreach(i => println(s"*$i*"))
artists.foreach(artist => println(artist.name))
*/