package se.codeunlimited.clicklistenerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var clickCounter = 0
        ex1UpdateUiDirectly.setOnClickListener {
            (it as Button).text = "Clicked: ${++clickCounter} times"
        }
    }
}
