package com.owl_laugh_at_wasted_time.beatbox

import android.content.res.AssetManager

private const val SOUNDS_FOLDER = "sample_sounds"

class BeatBox(private val assets: AssetManager)
{
    fun loadSounds(): List<String> {
        try {
            val soundNames = assets.list(SOUNDS_FOLDER)!!
            return soundNames.asList()
        } catch (e: Exception) {
            return emptyList()
        }
    }
}