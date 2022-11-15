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

/**
 * Represents daily usage history of a hashtag.
 * @see https://docs.joinmastodon.org/entities/history/
 */
@Serializable
data class History(
  /**
   * Description: UNIX timestamp on midnight of the given day.
   * Type: String (UNIX timestamp)
   * Version history: Added in 2.4.1
   */
  val day: String,
  /**
   * Description: the counted usage of the tag within that day.
   * Type: String (cast from an integer)
   * Version history: Added in 2.4.1
   */
  val uses: String,
  /**
   * Description: the total of accounts using the tag within that day.
   * Type: String (cast from an integer)
   * Version history: Added in 2.4.1
   */
  val accounts: String
)
