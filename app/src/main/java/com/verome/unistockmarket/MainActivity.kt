package com.verome.unistockmarket

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.verome.unistockmarket.ui.theme.StockMarketAppTheme
import com.verome.unistockmarket.presentation.company_info.CompanyInfoScreen
import com.verome.unistockmarket.presentation.company_listings.CompanyListingsScreen
import com.verome.unistockmarket.util.Constants
import com.verome.unistockmarket.util.Screen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            StockMarketAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavHost(navController = navController, startDestination = Screen.CompanyListings.route) {
                        composable(route = Screen.CompanyListings.route) {
                            CompanyListingsScreen({companyId ->
                                navController.navigate(Screen.CompanyInfo.route + "/{$companyId}")
                            })
                        }
                        composable(route = Screen.CompanyInfo.route + "/{${Constants.PARAM_COMPANY_SYMBOL}}") {
                            CompanyInfoScreen()
                        }
                    }
                }
            }
        }
    }
}