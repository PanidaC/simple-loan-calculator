package th.ac.su.simpleloancalculator

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.ResultReceiver
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var total = findViewById<TextView>(R.id.totalTv)

        val a = intent.getStringExtra("a")
        total.setText(a)

        val back = findViewById<Button>(R.id.backBtn)
            back.setOnClickListener {
                var intent = Intent()
                setResult(Activity.RESULT_OK,intent)
                finish()
            }

    }
}