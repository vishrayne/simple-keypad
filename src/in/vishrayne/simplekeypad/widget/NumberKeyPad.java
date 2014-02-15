package in.vishrayne.simplekeypad.widget;

import in.vishrayne.simplekeypad.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TableLayout;

public class NumberKeyPad extends TableLayout implements OnClickListener {

    static final int[] DIGIT_IDS = { R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5,
            R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.enter };

    private final String TAG = "NumPad";

    /**
     * This is the interface that we publish to our clients who are interested
     * in this number pad key-in events.
     * 
     * @author vishnu
     */
    public interface OnNumPadListener {
        /**
         * Called when the user make an action
         * 
         * @param key
         *            keyCode pressed
         */
        void onKeyPressed(String key);
    }

    private OnNumPadListener mNumPadListener;

    public NumberKeyPad(Context context) {
        super(context);
        setLayout(context);
    }

    public NumberKeyPad(Context context, AttributeSet attrs) {
        super(context, attrs);
        setLayout(context);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        for (int buttonID : DIGIT_IDS) {
            View buttonView = findViewById(buttonID);
            if (buttonView != null) {
                buttonView.setOnClickListener(this);
            } else {
                Log.e(TAG, "Couldn't bind button listener to id: " + buttonID);
            }
        }
    }

    @Override
    public void onClick(View v) {
        if (mNumPadListener == null) {
            Log.e(TAG, "No bound listener found for Numpad.");
            return;
        }

        mNumPadListener.onKeyPressed((String) v.getTag());
    }

    /**
     * Sets the numberpad key listener.
     * 
     * @param listener
     */
    public void setOnNumPadKeyListener(OnNumPadListener listener) {
        mNumPadListener = listener;
    }

    /**
     * Sets numpad_layout(res) as the content view.
     * 
     * @param context
     */
    private void setLayout(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.numpad_layout, this, true);
    }

}
