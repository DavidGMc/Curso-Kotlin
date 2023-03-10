package apps.cdsoftware.mycursokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import apps.cdsoftware.mycursokotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val  binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var nombre = "cesar"
        print(nombre)
        binding.textView.text=nombre


    }
}