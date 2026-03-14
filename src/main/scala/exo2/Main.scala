package exo2
import exo2.parsers.DatasetManager
import exo2.render.PlayerRenderer
import exo2.demos.ContravarianceDemo
import exo2.demos.CovarianceDemo
import exo2.domain.Stats.GoalkeeperStats
import exo2.domain.Stats.OutfieldStats

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

  println()
  println("contravariance demo")

  ContravarianceDemo.printDataset(dataset, PlayerRenderer)

  println()
  println("PlayerRenderer works for Goalkeeper because Renderer is contravariant")
  ContravarianceDemo.printDataset(goalkeepers, PlayerRenderer)

  println()
  println("union types demo")

  dataset.players.foreach { player =>
    val description = StatsUnionDemo.describe(player.stats match
      case gk: GoalkeeperStats => gk
      case of: OutfieldStats   => of
    )
    println(player.name + " => " + description)
  }