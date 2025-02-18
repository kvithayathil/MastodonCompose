package social.androiddev.common.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun MastodonTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit
) {
    MaterialTheme(
        colors = if (!useDarkTheme) {
            lightColors
        } else {
            darkColors
        }, typography = SocialTypography, content = content
    )
}
