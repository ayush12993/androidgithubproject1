package com.example.myshopj.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class mdtButton(context : Context, attributeSet:AttributeSet) : AppCompatButton(context,attributeSet) {
    init {
        applyFont()
    }

    private fun applyFont(){
      val mdtTypeFace: Typeface =
              Typeface.createFromAsset(context.assets,"proximanova.ttf")
        typeface = mdtTypeFace
    }
}