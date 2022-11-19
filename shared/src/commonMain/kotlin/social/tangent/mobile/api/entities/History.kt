/****************************************************
** DO NOT EDIT THIS FILE BY HAND!                  **
** This file was automatically generated by Martok **
** More info at https://github.com/asarazan/martok **
*****************************************************/
package social.tangent.mobile.api.entities

import kotlinx.serialization.*

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
