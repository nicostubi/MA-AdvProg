package exo2

enum Position:
  case Goalkeeper, Defender, Midfielder, Forward

object Position {

  def fromString(value: String): Position = 
    value.trim match
      case "GK" => Position.Goalkeeper
      case "DF" => Position.Defender
      case "MF" => Position.Midfielder
      case "FW" => Position.Forward
    
}