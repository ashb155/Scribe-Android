// SPDX-License-Identifier: GPL-3.0-or-later

package be.scri.ui.screens

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import be.scri.ui.screens.about.AboutScreen

@Composable
fun ConjugateAboutScreen(
    onPrivacyPolicyClick: () -> Unit,
    onThirdPartyLicensesClick: () -> Unit,
    onWikiClick: () -> Unit,
    resetHints: () -> Unit,
    context: Context,
    modifier: Modifier = Modifier,
) {
    AboutScreen(
        onPrivacyPolicyClick = onPrivacyPolicyClick,
        onThirdPartyLicensesClick = onThirdPartyLicensesClick,
        onWikiClick = onWikiClick,
        resetHints = resetHints,
        context = context,
        modifier = modifier,
        isConjugateApp = true,
    )
}
