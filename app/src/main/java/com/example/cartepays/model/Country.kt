package com.example.cartepays.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Country(
    @StringRes val stringResourceId: Int,
    @StringRes val stringCapitalId: Int,
    @StringRes val stringCodeId: Int,
    @DrawableRes val imageResourceId: Int
)
