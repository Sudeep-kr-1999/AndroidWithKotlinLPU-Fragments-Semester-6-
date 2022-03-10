package sudeep.example.androidfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class DynamicFragmentOrientationExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_fragment_orientation_example)
        val fm:FragmentManager=supportFragmentManager;
        val fragmentTransaction:FragmentTransaction=fm.beginTransaction();
        val displaymode=resources.configuration.orientation;

//        displaymode==1 means portrait else landscape
        if (displaymode==1){
            val f1=DynamicFragOrientExOne();
            fragmentTransaction.replace(android.R.id.content,f1);
        }else{
            val f2=DynamicFragOrientExTwo();
            fragmentTransaction.replace(android.R.id.content,f2);
        }
        fragmentTransaction.commit();
    }
}