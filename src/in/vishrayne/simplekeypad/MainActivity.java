package in.vishrayne.simplekeypad;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;

public class MainActivity extends Activity {

    // private EditText focusedET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Returns current focused {@link EditText}, as set by
     * {@link #setFocusedET(EditText)}
     * 
     * @return {@link EditText} editText
     */
    // private EditText getFocusedET() {
    // return focusedET;
    // }

    /**
     * Sets focus to the given {@link EditText}. Calling this method
     * automatically enables the focused widget's label.
     * 
     * @param et
     *            The editText to be focused.
     */
    // private void setFocusedET(EditText et) {
    // this.focusedET = et;
    // et.setCursorVisible(false);
    //
    // if (pinConfirmET == null)
    // return;
    //
    // boolean isPinCurrent = et == pinCurrentET;
    // pinCurrentLabel.setEnabled(isPinCurrent);
    // pinConfirmLabel.setEnabled(!isPinCurrent);
    // }
    //
    // @Override
    // public void onKeyPressed(String key) {
    // if (key.equalsIgnoreCase("enter")) {
    // if (isValidPin()) {
    // Log.i(Constants.TAG, String.format("%s, confirm: %s",
    // pinCurrentET.getText(), pinConfirmET.getText()));
    // Toast.makeText(this, String.format("%s, confirm: %s",
    // pinCurrentET.getText(), pinConfirmET.getText()),
    // Toast.LENGTH_LONG).show();
    // }
    // return;
    // }
    //
    // if (getFocusedET().length() < 4) {
    // getFocusedET().append(key);
    // } else {
    // if (pinConfirmET == null) {
    // return;
    // } else {
    // if (pinConfirmET != getFocusedET()) {
    // setFocusedET(pinConfirmET);
    // getFocusedET().append(key);
    // }
    // }
    // }
    // }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
