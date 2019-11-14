package uc.benkkstudio.ratingdilalogsample;

import androidx.appcompat.app.AppCompatActivity;
import uc.benkkstudio.ratingdialog.RatingDialog;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    RatingDialog mRatingDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRatingDialog = new RatingDialog(this);
        mRatingDialog.setRatingDialogListener(new RatingDialog.RatingDialogInterFace() {
            @Override
            public void onDismiss() {
                Log.wtf("RATELISTERNER","onDismiss ");
            }

            @Override
            public void onSubmit(float rating) {
                Log.wtf("RATELISTERNER","onSubmit "+rating);
            }

            @Override
            public void onRatingChanged(float rating) {
                Log.wtf("RATELISTERNER","onRatingChanged "+rating);
            }
        });
    }
    public void onBackPressed(){
        mRatingDialog.showDialog();
    }
}
