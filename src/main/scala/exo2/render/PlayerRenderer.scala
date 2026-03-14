package exo2.render

import exo2.domain.Player.Player

/**
 * Renderer is contravariant in A (-A).
 *
 * A renderer capable of handling a supertype (Player) can also render
 * any subtype (e.g., Goalkeeper or OutfieldPlayer).
 *
 * This matches the intuition that a general renderer can be reused
 * for more specific types.
 */
object PlayerRenderer extends Renderer[Player]:

  def render(player: Player): String =
    player.displayLight