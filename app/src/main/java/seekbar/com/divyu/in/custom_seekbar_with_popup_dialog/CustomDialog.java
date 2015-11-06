package seekbar.com.divyu.in.custom_seekbar_with_popup_dialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by divyanshu on 06/11/15.
 */
public class CustomDialog extends Dialog {

    Button pay_BTN;
    Button noThanksBTN;
    TextView explanation;
    String mExplanation;
    HoloCircleSeekBar picker;
    private HoloCircleSeekBar seekBar;
    public CustomDialog(final Context context, String explanationString, int progressValue) {
        super(context);
        mExplanation = explanationString;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        explanation = (TextView)findViewById(R.id.description);
        explanation.setText(mExplanation);

        picker = (HoloCircleSeekBar) findViewById(R.id.picker);
        picker.setValue(progressValue);
        picker.setEnabled(false);

        pay_BTN=(Button)findViewById(R.id.pay_BTN);
        pay_BTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        noThanksBTN=(Button)findViewById(R.id.cancel_BTN);
        noThanksBTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {dismiss();}
        });
    }


}

