package com.example.myshopj.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class noviruseditText(context : Context, attributeSet:AttributeSet) : AppCompatEditText(context,attributeSet) {
    init {
        applyFont()
    }

    private fun applyFont(){
      val mdtTypeFace: Typeface =
              Typeface.createFromAsset(context.assets,"proximanova.ttf")
        typeface = mdtTypeFace
    }
}