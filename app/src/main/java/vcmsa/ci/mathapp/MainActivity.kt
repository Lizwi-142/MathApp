package vcmsa.ci.mathapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //start code
        // step1 : access the elements
        //create all the value for the elements
        val editText = findViewById<EditText>(R.id.editTextText)
        val editTextText2 = findViewById<EditText>(R.id.editTextText2)
        val editTextText3 = findViewById<EditText>(R.id.editTextText3)
        val radioAdd = findViewById<TextView>(R.id.radioAdd)
        val radioSubtract = findViewById<TextView>(R.id.radioSubtract)
        val radioMultiply = findViewById<TextView>(R.id.radioMultiply)
        val radioDivide = findViewById<TextView>(R.id.radioDivide)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
       val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)

         // setting what happens when the button is clicked
btnCalculate.setOnClickListener {
    //get the values from the edit text
    val num1 = editText.text.toString().trim()
    val num2 = editTextText2.text.toString().trim()
//check if the value is empty
    if (num1.toString().isEmpty() || num2.toString().isEmpty()) {
        Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show()
        return@setOnClickListener
    }
    //convert the values to integers
    val num3 = num1.toInt()
    val num4 = num2.toInt()
    val selected = radioGroup.checkedRadioButtonId
        //check if no radio button is selected
    if (selected == -1) {
        //if no radio button is select,show a toast message
        Toast.makeText(this, "Please select an operation", Toast.LENGTH_SHORT).show()
        return@setOnClickListener}
        var result = 0
        var operation = ""
        if (selected == R.id.radioAdd) {
            //if the add radio button is selected, perform addition
            result = num3 + num4
            operation = "Addition"
            editTextText3.text = "The answer is $result"
            Toast.makeText(this, "The answer is $result", Toast.LENGTH_SHORT).show()
        } else if (selected == R.id.radioSubtract) {
            //if the subtract radio button is selected, perform subtraction
            result = num3 - num4
            operation = "subtraction"
            editTextText3.text = "The answer is $result"
            Toast.makeText(this, "The answer is $result", Toast.LENGTH_SHORT).show()
        } else if (selected == R.id.radioMultiply) {
            //if the multiply radio button is selected, perform multiplication
            result = num3 * num4
            operation = "Addition"
            editTextText3.text = "The answer is $result"
            Toast.makeText(this, "The answer is $result", Toast.LENGTH_SHORT).show()
        }else if (selected == R.id.radioDivide) {
            //if the divide radio button is selected, perform division
            result = num3 / num4
            operation = "Divide"
            editTextText3.text = "The answer is  $result"
            Toast.makeText(this, "The answer is $result", Toast.LENGTH_SHORT).show()}
            //if the value is zero, show a toast message
            else{Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show()}
            }

        }
    }




