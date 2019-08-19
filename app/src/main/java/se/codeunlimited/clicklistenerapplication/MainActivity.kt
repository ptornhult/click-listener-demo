package se.codeunlimited.clicklistenerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var clickCounter = 0
        val ex1UpdateUiDirectly = findViewById<Button>(R.id.ex1UpdateUiDirectly)
        ex1UpdateUiDirectly.setOnClickListener {
            (it as Button).text = "Clicked: ${++clickCounter} times"
        }
    }
}
