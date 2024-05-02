package net.ezra.ui.contact


import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.ui.theme.AppTheme
import androidx.compose.ui.res.stringResource

@Stable
@Composable
fun ContactScreen(navController: NavHostController) {

























//    Column {
//
//
//    Text(text = "this is the contact page")
//
//    Text(
//        modifier = Modifier
//            .clickable {
//                navController.navigate(ROUTE_HOME) {
//                    popUpTo(ROUTE_CONTACT) { inclusive = true }
//                }
//            },
//        text = "Contact"
//    )
//
//
//
//
//
//
//    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ContactScreen(rememberNavController())
}

