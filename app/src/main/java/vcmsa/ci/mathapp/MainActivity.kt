package vcmsa.ci.mathapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
        val editButton = findViewById<Button>(R.id.Button)
        val edtsubtract = findViewById<Button>(R.id.edtsubtract)
val edtMultiplication  = findViewById<Button>(R.id.edtMultiplication)
val edtDivision = findViewById<Button>(R.id.edtDivision)



        //set lick listener for the editButton button
        edtDivision.setOnClickListener {
            val secondnumber2 = editText.text.toString().toDoubleOrNull()
            val thirdnumber3 = editTextText2.text.toString().toDoubleOrNull()
            if (secondnumber2 != null && thirdnumber3 != null) {
                val Totalvalue =  thirdnumber3/ secondnumber2
                editTextText3.setText(Totalvalue.toString())
            } else {
                Toast.makeText(this, "please enter valid Number", Toast.LENGTH_SHORT).show()
            }
        }




        //set lick listener for the editButton button
        edtMultiplication.setOnClickListener {
            val secondnumber = editText.text.toString().toDoubleOrNull()
            val thirdnumber = editTextText2.text.toString().toDoubleOrNull()
            if (secondnumber != null && thirdnumber != null) {
                val Totalvalue = secondnumber * thirdnumber
                editTextText3.setText(Totalvalue.toString())
            } else {
                Toast.makeText(this, "please enter valid Number", Toast.LENGTH_SHORT).show()
            }
        }

                //set lick listener for the editButton button
                edtsubtract.setOnClickListener {
                    val numberTwo = editText.text.toString().toDoubleOrNull()
                    val numberThree = editTextText2.text.toString().toDoubleOrNull()
                    if (numberTwo != null && numberThree != null) {
                        val Totalvalue = numberTwo - numberThree
                        editTextText3.setText(Totalvalue.toString())
                    } else {
                        Toast.makeText(this, "please enter valid Number", Toast.LENGTH_SHORT).show()
                    }
                }

                //set lick listener for the editButton button
                editButton.setOnClickListener {
                    val number2 = editText.text.toString().toDoubleOrNull()
                    val number3 = editTextText2.text.toString().toDoubleOrNull()
                    if (number2 != null && number3 != null) {
                        val Totalvalue = number2 + number3
                        editTextText3.setText(Totalvalue.toString())
                    } else {
                        Toast.makeText(this, "please enter valid Number", Toast.LENGTH_SHORT).show()
                    }

                }
            }
        }

