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
 * Represents a file or media attachment that can be added to a status.
 * @see https://docs.joinmastodon.org/entities/attachment/
 */
@Serializable
data class Attachment(
  /**
   * Description: The ID of the attachment in the database.
   * Type: String (cast from an integer but not guaranteed to be a number)
   * Version history: Added in 0.6.0.
   */
  val id: String,
  /**
   * Description: The type of the attachment.
   * Type: String (Enumerable, oneOf)
   * unknown = unsupported or unrecognized file type
   * image = Static image
   * gifv = Looping, soundless animation
   * video = Video clip
   * audio = Audio track
   * Version history: Added in 0.6.0. Audio added in 2.9.1.
   */
  val type: Type,
  /**
   * Description: The location of the original full-size attachment.
   * Type: String (URL)
   * Version history: Added in 0.6.0.
   */
  val url: String,
  /**
   * Description: The location of a scaled-down preview of the attachment.
   * Type: String (URL)
   * Version history: Added in 0.6.0.
   */
  @SerialName("preview_url") val previewUrl: String,
  /**
   * Description: The location of the full-size original attachment on the remote website.
   * Type: String (URL), or null if the attachment is local
   * Version history: Added in 0.6.0.
   */
  @SerialName("remote_url") val remoteUrl: String? = null,
  /**
   * Description: Metadata returned by Paperclip.
   * Type: Hash
   * Version history: Added in 1.5.0. meta[focus] added in 2.3.0.
   * 
   * May contain subtrees small and original, as well as various other top-level properties.
   * 
   * More importantly, there may be another top-level focus Hash object as of 2.3.0,
   * with coordinates can be used for smart thumbnail cropping – see Focal points for more.
   */
  val meta: JsonObject? = null,
  /**
   * Description: Alternate text that describes what is in the media attachment, to be used for the visually impaired or when media attachments do not load.
   * Type: String
   * Version history: Added in 2.0.0
   */
  val description: String? = null,
  /**
   * Description: A hash computed by the BlurHash algorithm, for generating colorful preview thumbnails when media has not been downloaded yet.
   * Type: String
   * Version history: Added in 2.8.1
   */
  val blurhash: String? = null,
  /**
   * Description: A shorter URL for the attachment.
   * Type: String (URL)
   * Version history: Added in 0.6.0 and deprecated in 3.5.0.
   */
  @SerialName("text_url") val textUrl: String? = null
) {
  @Serializable
  enum class Type(
    val serialName: String
  ) {
    @SerialName("image") IMAGE("image"),
    @SerialName("video") VIDEO("video"),
    @SerialName("gifv") GIFV("gifv");
  }
}
