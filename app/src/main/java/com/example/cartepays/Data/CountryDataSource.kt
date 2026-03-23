package com.example.cartepays.Data

import com.example.cartepays.R
import com.example.cartepays.model.Country

class CountryDataSource {
    fun loadCountries(): List<Country> {
        return listOf(
            Country(R.string.nigeria_name, R.string.nigeria_capital, R.string.nigeria_code, R.drawable.nigeria),
            Country(R.string.philippines_name, R.string.philippines_capital, R.string.philippines_code, R.drawable.philippines),
            Country(R.string.allemagne_name, R.string.allemagne_capital, R.string.allemagne_code, R.drawable.allemange),
            Country(R.string.bresil_name, R.string.bresil_capital, R.string.bresil_code, R.drawable.bresil),
            Country(R.string.canada_name, R.string.canada_capital, R.string.canada_code, R.drawable.canada),
            Country(R.string.chine_name, R.string.chine_capital, R.string.chine_code, R.drawable.chine),
            Country(R.string.coredusud_name, R.string.coredusud_capital, R.string.coredusud_code, R.drawable.coredusud),
            Country(R.string.france_name, R.string.france_capital, R.string.france_code, R.drawable.france),
            Country(R.string.japon_name, R.string.japon_capital, R.string.japon_code, R.drawable.japon),
            Country(R.string.uk_name, R.string.uk_capital, R.string.uk_code, R.drawable.uk)
        )
    }
}
