package se.codeunlimited.clicklistenerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val liveDataCounter = MutableLiveData<Int>().apply { value = 0 } // Set initial value to update UI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var clickCounter = 0
        ex1UpdateUiDirectly.setOnClickListener {
            (it as Button).text = "Clicked: ${++clickCounter} times"
        }

        ex2UpdateUiDirectly.setOnClickListener {
            liveDataCounter.value = (liveDataCounter.value ?: 0) + 1
        }

        liveDataCounter.observe(this, Observer {
            ex2UpdateUiDirectly.text = "Clicked: $it times"
        })
    }
}
