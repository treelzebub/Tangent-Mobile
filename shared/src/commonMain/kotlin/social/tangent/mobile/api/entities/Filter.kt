/****************************************************
** DO NOT EDIT THIS FILE BY HAND!                  **
** This file was automatically generated by Martok **
** More info at https://github.com/asarazan/martok **
*****************************************************/
package social.tangent.mobile.api.entities

import kotlinx.serialization.*

/**
 * Represents a user-defined filter for determining which statuses should not be shown to the user.
 * @see https://docs.joinmastodon.org/entities/filter/
 */
@Serializable
data class Filter(

  /**
   * Description: The ID of the filter in the database.
   * Type: String (cast from an integer, but not guaranteed to be a number)
   * Version history: Added in 2.4.3
   */
  val id: String,

  /**
   * Description: The text to be filtered.
   * Type: String
   * Version history: Added in 2.4.3
   */
  val phrase: String,

  /**
   * Description: The contexts in which the filter should be applied.
   * Type: Array of String (Enumerable anyOf)
   * home = home timeline and lists
   * notifications = notifications timeline
   * public = public timelines
   * thread = expanded thread of a detailed status
   * Version history: Added in 2.4.3
   */
  val context: List<ContextItem>,

  /**
   * Description: When the filter should no longer be applied
   * Type: String (ISO 8601 Datetime), or null if the filter does not expire
   * Version history: Added in 2.4.3
   * @DateTime
   */
  @SerialName("expires_at")
  @Serializable(with = kotlinx.datetime.serializers.InstantIso8601Serializer::class)
  val expiresAt: kotlinx.datetime.Instant? = null,

  /**
   * Description: Should matching entities in home and notifications be dropped by the server?
   * Type: Boolean
   * Version history: Added in 2.4.3
   */
  val irreversible: Boolean,

  /**
   * Description: Should the filter consider word boundaries?
   * Type: Boolean
   * Version history: Added in 2.4.3
   * 
   * If whole_word is true , client app should do:
   * Define ‘word constituent character’ for your app. In the official implementation, it’s [A-Za-z0-9_] in JavaScript, and [[:word:]] in Ruby. Ruby uses the POSIX character class (Letter | Mark | Decimal_Number | Connector_Punctuation).
   * If the phrase starts with a word character, and if the previous character before matched range is a word character, its matched range should be treated to not match.
   * If the phrase ends with a word character, and if the next character after matched range is a word character, its matched range should be treated to not match.
   */
  @SerialName("whole_word")
  val wholeWord: Boolean
) {

  @Serializable
  enum class ContextItem(
    val serialName: String
  ) {
    @SerialName("home") HOME("home"),
    @SerialName("notifications") NOTIFICATIONS("notifications"),
    @SerialName("public") PUBLIC("public"),
    @SerialName("thread") THREAD("thread");
  }
}
