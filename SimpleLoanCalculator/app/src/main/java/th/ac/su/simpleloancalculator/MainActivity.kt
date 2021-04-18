package th.ac.su.simpleloancalculator

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.ResultReceiver
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moneyW = findViewById<EditText>(R.id.moneyTv)
        val interest = findViewById<EditText>(R.id.interestTv)
        val year = findViewById<EditText>(R.id.yearTv)
        val calculate = findViewById<Button>(R.id.calculateBtn)

        calculate.setOnClickListener {
            var a: Double = moneyW.text.toString().toDouble()
            var b: Double = interest.text.toString().toDouble()
            var c: Double = year.text.toString().toDouble()

            var total: Double = (a+(a*(b/100)*c))/c*12

            var intent = Intent(this@MainActivity, ResultActivity::class.java)
            intent.putExtra("a",a.toString())
            intent.putExtra("b",b.toString())
            intent.putExtra("c",c.toString())
            intent.putExtra("total",total.toString())
            startActivity(intent)
        }

    }


}