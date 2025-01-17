package com.github.jing332.tts_server_android.constant

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.annotation.StyleRes
import com.github.jing332.tts_server_android.R

enum class AppTheme(
    @StyleRes val styleId: Int,
    @StringRes val strId: Int,
    @ColorRes val colorId: Int = 0
) {
    Default(R.style.Theme_TtsServer, R.string.default_str, R.color.seed),
    SkyBlue(R.style.Theme_TtsServer_SkyBlue, R.string.theme_sky_blue, R.color.sky_blue_seed),
    SakuraPink(
        R.style.Theme_TtsServer_SakuraPink,
        R.string.theme_sakura_pink,
        R.color.sakura_pink_seed
    ),
    Cyan(R.style.Theme_TtsServer_Cyan, R.string.theme_cyan, R.color.cyan_seed),
    LilacBrown(
        R.style.Theme_TtsServer_LilacBrown,
        R.string.theme_lilac_brown,
        R.color.lilac_brown_seed
    ),
    PeacockGreen(
        R.style.Theme_TtsServer_PeacockGreen,
        R.string.theme_peacock_green,
        R.color.peacock_green_seed
    ),
    Golden(R.style.Theme_TtsServer_Golden, R.string.theme_golden, R.color.golden_seed),
    SorghumRed(
        R.style.Theme_TtsServer_SorghumRed,
        R.string.theme_sorghum_red,
        R.color.sorghum_red_seed
    ),
    EmeraldGreen(
        R.style.Theme_TtsServer_EmeraldGreen,
        R.string.theme_emerald_green,
        R.color.emerald_green_seed
    ),
    RedGold(R.style.Theme_TtsServer_RedGold, R.string.theme_red_gold, R.color.red_gold_seed),
    InkGrey(R.style.Theme_TtsServer_InkGrey, R.string.theme_ink_grey, R.color.ink_grey_seed),
}