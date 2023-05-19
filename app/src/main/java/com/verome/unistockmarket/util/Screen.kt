package com.verome.unistockmarket.util

sealed class Screen(val route: String) {
    object CompanyListings: Screen("company_listings")
    object CompanyInfo: Screen("company_info")
}
