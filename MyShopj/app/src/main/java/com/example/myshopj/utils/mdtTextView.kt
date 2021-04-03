package com.example.myshopj.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class mdtTextView(context : Context, attributeSet:AttributeSet) : AppCompatTextView(context,attributeSet) {
    init {
        applyFont()
    }

    private fun applyFont(){
      val mdtTypeFace: Typeface =
              Typeface.createFromAsset(context.assets,"proximanova.ttf")
        typeface = mdtTypeFace
    }
}