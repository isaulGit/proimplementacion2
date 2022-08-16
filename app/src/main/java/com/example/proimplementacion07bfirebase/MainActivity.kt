package com.example.proimplementacion07bfirebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proimplementacion07bfirebase.ui.theme.Proimplementacion07bfirebaseTheme
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.database.core.Context
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

private lateinit var firebaseAnalytics: FirebaseAnalytics

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        firebaseAnalytics = Firebase.analytics
        super.onCreate(savedInstanceState)
        setContent {
            Proimplementacion07bfirebaseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")



    // Write a message to the database
  //  val database = Firebase.database
 //   val myRef = database.getReference("message")
/*
    myRef.setValue("Hello, World!")
val algo: Context
*/
    //val analiytics : FirebaseAnalytics = FirebaseAnalytics.getInstance()
//val analytics = Firebase.analytics
    val bundle = Bundle()
    bundle.putString("message","integracion de Firebase Completa")
    firebaseAnalytics.logEvent("InitScreen", bundle)


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Proimplementacion07bfirebaseTheme {
        Greeting("Android")
    }
}
