package ir.sematec.ap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("ActivityLifecycle:" , "onCreate");
    }

    @Override
    protected void onStart( ) {
        super.onStart();

        Log.d("ActivityLifecycle:" , "onStart");
    }

    @Override
    protected void onResume( ) {
        super.onResume();

        Log.d("ActivityLifecycle:" , "onResume");
    }

    @Override
    protected void onPause( ) {
        super.onPause();

        Log.d("ActivityLifecycle:" , "onPause");
    }

    @Override
    protected void onStop( ) {
        super.onStop();

        Log.d("ActivityLifecycle:" , "onStop");
    }

    @Override
    protected void onDestroy( ) {
        super.onDestroy();

        Log.d("ActivityLifecycle:" , "onDestroy");
    }
}