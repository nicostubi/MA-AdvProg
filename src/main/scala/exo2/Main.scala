package exo2
import exo2.csv.DatasetManager

@main def run()=
  val dataset = DatasetManager.load("src/main/scala/exo2/data/09-PremierLeague.csv")

  println(dataset.rows.size + " records loaded")
  println("original dataset")
  dataset.players.foreach(player => println(player.displayFull))

  println()
  println("covariance demo - print all names")
  CovarianceDemo.printNames(dataset)

  println()
  println("covariance demo - print all goalkeeper names")
  val goalkeepers = dataset.goalkeepers
  CovarianceDemo.printNamesOfGoalkeepers(goalkeepers)

  println()
  println("covariance demo - a goalkeeper dataset can be used as a player dataset")
  CovarianceDemo.printNames(goalkeepers)