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

import social.tangent.mobile.api.entities.Account
import social.tangent.mobile.api.entities.Status
import social.tangent.mobile.api.entities.Tag

/**
 * Represents the results of a search.
 * @see https://docs.joinmastodon.org/entities/results/
 */
@Serializable
data class Results(
  /**
   * Description: Accounts which match the given query
   * Type: Array of Account
   * Version history: Added in x.x.x
   */
  val accounts: List<Account>,
  /**
   * Description: Statuses which match the given query
   * Type: Array of Status
   * Version history: Added in x.x.x
   */
  val statuses: List<Status>,
  /**
   * Description: Hashtags which match the given query
   * Type: Array of Tag (v2). Array of String (v1).
   * Version history: v1 added in 1.1.0 and deprecated in 3.0.0. v2 added in 2.4.1 and replaced v1 in 3.0.0.
   * 
   * Note: Made an executive decision to keep v2.
   */
  val hashtags: List<Tag>
)
