package exo2

import exo2.domain.Stats.*

object StatsUnionDemo:

  def describe(stats: AnyStats): String =
    stats match
      case gk: GoalkeeperStats =>
        "Goalkeeper -> " + gk.summary
      case of: OutfieldStats =>
        "Outfield player -> " + of.summary