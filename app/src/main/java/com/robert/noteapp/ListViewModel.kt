package com.robert.noteapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {

    var notes = MutableLiveData(
        arrayOf(
            "First note",
            "Second note",
            "Third note",
            "Fourth note",
            "Fifth note"
        )
    )


}