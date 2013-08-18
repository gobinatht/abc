package com.abc;

import android.app.Activity;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    private Button CameraCapture;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        CameraCapture = (Button)findViewById(R.id.camerabutton) ;
        CameraCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivityForResult(intent, 0);

            }

        });
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)    {
        if (resultCode == Activity.RESULT_OK && requestCode == 0) {
            String result = data.toURI();
            System.out.print(result);

        }
    }
}
