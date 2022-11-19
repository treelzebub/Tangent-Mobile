/****************************************************
** DO NOT EDIT THIS FILE BY HAND!                  **
** This file was automatically generated by Martok **
** More info at https://github.com/asarazan/martok **
*****************************************************/
package social.tangent.mobile.api.entities

import kotlinx.serialization.*

import social.tangent.mobile.api.entities.Field

/**
 * Represents display or publishing preferences of user's own account.
 * Returned as an additional entity when verifying and updated credentials, as an attribute of Account.
 * @see https://docs.joinmastodon.org/entities/source/
 */
@Serializable
data class Source(

  /**
   * Description: Profile bio.
   * Type: String
   * Version history: Added in 1.5.0
   */
  val note: String,

  /**
   * Description: Metadata about the account.
   * Type: Array of Field
   * Version history: Added in 2.4.0
   */
  val fields: List<Field>,

  /**
   * Description: The default post privacy to be used for new statuses.
   * Type: String (Enumerable, oneOf)
   * public = Public post
   * unlisted = Unlisted post
   * private = Followers-only post
   * direct = Direct post
   * Version history: Added in 1.5.0
   */
  val privacy: Privacy? = null,

  /**
   * Description: Whether new statuses should be marked sensitive by default.
   * Type: Boolean
   * Version history: Added in 1.5.0
   */
  val sensitive: Boolean? = null,

  /**
   * Description: The default posting language for new statuses.
   * Type: String (ISO 639-1 language two-letter code)
   * Version history: Added in 2.4.2
   */
  val language: String? = null,

  /**
   * Description: The number of pending follow requests.
   * Type: Number
   * Version history: Added in 3.0.0.
   * @precision long
   */
  @SerialName("follow_requests_count")
  val followRequestsCount: Long? = null
) {

  @Serializable
  enum class Privacy(
    val serialName: String
  ) {
    @SerialName("public") PUBLIC("public"),
    @SerialName("unlisted") UNLISTED("unlisted"),
    @SerialName("private") PRIVATE("private"),
    @SerialName("direct") DIRECT("direct");
  }
}
