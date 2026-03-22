package exo2.render

/**
 * Contravariant renderer for values of type A.
 *
 * The type parameter is contravariant (-A): a renderer capable of handling
 * a supertype can also handle any of its subtypes.
 */
trait Renderer[-A]:
  def render(value: A): String