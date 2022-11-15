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

import social.tangent.mobile.api.entities.Status

/**
 * Represents the tree around a given status. Used for reconstructing threads of statuses.
 * @see https://docs.joinmastodon.org/entities/context/
 */
@Serializable
data class Context(
  /**
   * Description: Parents in the thread.
   * Type: Array of Status
   * Version history: Added in 0.6.0
   */
  val ancestors: List<Status>,
  /**
   * Description: Children in the thread.
   * Type: Array of Status
   * Version history: Added in 0.6.0
   */
  val descendants: List<Status>
)
