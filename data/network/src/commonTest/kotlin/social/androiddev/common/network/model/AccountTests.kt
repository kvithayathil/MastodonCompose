package social.androiddev.common.network.model

import com.google.common.truth.Truth
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.junit.Test

class AccountTests {
    @Test
    fun `deserialize required fields should succeed`() = runBlocking {
        // given
        val json: String = javaClass.classLoader.getResource("response_account_required.json").readText()

        // when
        val account = Json.decodeFromString<Account>(json)

        // then
        Truth.assertThat(account.id).isEqualTo("23634")
    }
}
