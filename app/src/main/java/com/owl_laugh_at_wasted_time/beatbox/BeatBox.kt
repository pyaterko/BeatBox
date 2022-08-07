package com.owl_laugh_at_wasted_time.beatbox

import android.content.res.AssetManager

private const val SOUNDS_FOLDER = "sample_sounds"

class BeatBox(private val assets: AssetManager)
{

    val sounds: List<Sound>
    init {
        sounds = loadSounds()
    }
    fun loadSounds(): List<Sound> {

        val soundNames: Array<String>
        try {
            soundNames = assets.list(SOUNDS_FOLDER)!!
        } catch (e: Exception) {
            return emptyList()
        }
        val sounds = mutableListOf<Sound>()
        soundNames.forEach { filename ->
            val assetPath = "$SOUNDS_FOLDER/$filename"
            val sound = Sound(assetPath)
            sounds.add(sound)
        }
        return sounds
    }

}