package com.example.appoftheday.view

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.appoftheday.R
import com.example.appoftheday.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {



//first er filter name, second er ta msg. Mainly helps in identifying about what exactly your code is doing and what is the current data it works with.
 //this helps in debugging. View this on Logcat and see ur msg and then debug
        Log.i("Harry","OnCreate")//https://medium.com/android-news/logging-in-android-cfcd50cdc1ae#:~:text=The%20Android%20framework%20has%20it,Log.




        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show()//context means where u want to show ur output
        //here 'this' means this activity(MainActivity)
    //https://medium.com/@huseyinozkoc/what-is-the-context-in-android-b3c8ff5918ba (best explanation of context)


//super inherit all the properties of the function concerned(here onCreate) and we are adding new features in onCreate
        super.onCreate(savedInstanceState)





        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root  //root is not a id, it is the starting of the xml file
        setContentView(view)  //ekhan obdhi amra jani (in the entire app -> make the content as the above xml)




        setSupportActionBar(binding.toolbar)//nav bar -> action bar -> top bar




        //navController -> logic for multiple pages
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)



        var count=0

        binding.fab.setOnClickListener { view ->
            count=count+1//every time i click the email btn it will increase the count
            Snackbar.make(view, "Count" + count , Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .setAnchorView(R.id.fab).show()
        }
    }

    override fun onStart(){
        Log.i("Harry","OnStart")
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show()
        super.onStart()
    }

    override fun onResume() {
        Log.i("Harry","OnResume")
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show()
        super.onResume()
    }

    override fun onPause(){
        Log.i("Harry","OnPause")
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop(){
        Log.i("Harry","OnStop")
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onDestroy(){
        Log.i("Harry","OnDestroy")
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}