
package com.example.recipeapp.preferences


import com.russhwolf.settings.Settings

expect class MultiplatformSettingsFactory {
    fun getSettings():  Settings
}