package com.example.elartesano.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.elartesano.R


val Sansita = FontFamily(
    Font(R.font.sansita_blackitalic,FontWeight.Normal, FontStyle.Italic),
    Font(R.font.sansita_bold, FontWeight.Bold),
    Font(R.font.sansita_bolditalic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.sansita_extrabold, FontWeight.ExtraBold),
    Font(R.font.sansita_extrabolditalic, FontWeight.ExtraBold, FontStyle.Italic),
    Font(R.font.sansita_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.sansita_regular, FontWeight.Normal),
    Font(R.font.sansita_slack, FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = Sansita,
        fontWeight = FontWeight.Light,
        fontSize = 82.sp
    ),
    h2 = TextStyle(
        fontFamily = Sansita,
        fontWeight = FontWeight.Light,
        fontSize = 51.sp
    ),
    h3 = TextStyle(
        fontFamily = Sansita,
        fontWeight = FontWeight.Normal,
        fontSize = 41.sp
    ),
    h4 = TextStyle(
        fontFamily = Sansita,
        fontWeight = FontWeight.Normal,
        fontSize = 29.sp
    ),
    h5 = TextStyle(
        fontFamily = Sansita,
        fontWeight = FontWeight.Normal,
        fontSize = 21.sp
    ),
    h6 = TextStyle(
        fontFamily = Sansita,
        fontWeight = FontWeight.Medium,
        fontSize = 17.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = Sansita,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = Sansita,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp
    ),
    body1 = TextStyle(
        fontFamily = Sansita,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    body2 = TextStyle(
        fontFamily = Sansita,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    button = TextStyle(
        fontFamily = Sansita,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),
    caption = TextStyle(
        fontFamily = Sansita,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp
    ),
    overline = TextStyle(
        fontFamily = Sansita,
        fontWeight = FontWeight.Normal,
        fontSize = 9.sp
    )
)
