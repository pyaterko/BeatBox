package com.owl_laugh_at_wasted_time.beatbox

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class SoundViewModel(private val beatBox: BeatBox) : BaseObservable() {

    var sound: Sound? = null
        set(sound) {
            field = sound
            notifyChange()
        }
    @get:Bindable
    val title: String?
        get() = sound?.name
}