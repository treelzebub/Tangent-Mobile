package social.tangent.mobile.api.entities

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonContentPolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonObject

import social.tangent.mobile.api.entities.History

/**
 * Represents a hashtag used within the content of a status.
 * @see https://docs.joinmastodon.org/entities/tag/
 */
@Serializable
data class Tag(
  /**
   * Description: The value of the hashtag after the # sign.
   * Type: String
   * Version history: Added in 0.9.0
   */
  val name: String,
  /**
   * Description: A link to the hashtag on the instance.
   * Type: String (URL)
   * Version history: Added in 0.9.0
   */
  val url: String,
  /**
   * Description: Usage statistics for given days.
   * Type: Array of History
   * Version history: Added in 2.4.1
   */
  val history: List<History>? = null
)
