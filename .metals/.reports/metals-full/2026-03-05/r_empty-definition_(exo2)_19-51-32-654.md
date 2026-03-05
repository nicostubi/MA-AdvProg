error id: file:///C:/Projects/HES/MA-AdvProg/exo2/src/main/scala/exo2/Main.scala:DatasetLoader
file:///C:/Projects/HES/MA-AdvProg/exo2/src/main/scala/exo2/Main.scala
empty definition using pc, found symbol in pc: 
semanticdb not found

found definition using fallback; symbol DatasetLoader
offset: 68
uri: file:///C:/Projects/HES/MA-AdvProg/exo2/src/main/scala/exo2/Main.scala
text:
```scala
package exo2

@main def run(): Unit = {

  val dataset =
    Dataset@@Loader.load("09-PremierLeague.csv")

  println(dataset.rows.size)

}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 