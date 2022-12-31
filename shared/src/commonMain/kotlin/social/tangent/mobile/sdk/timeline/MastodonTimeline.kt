package social.tangent.mobile.sdk.timeline

import social.tangent.mobile.api.entities.Status
import social.tangent.mobile.sdk.Mastodon

class MastodonTimeline(val mastodon: Mastodon) {

    val api get() = mastodon.api
    val token get() = mastodon.token

    suspend fun head(): List<Status> {
        return mastodon.api.getHomeTimeline(
            mastodon.bearer()
        )
    }
}