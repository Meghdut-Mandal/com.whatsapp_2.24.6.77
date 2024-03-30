package X;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* renamed from: X.9v7  reason: invalid class name and case insensitive filesystem */
public class C207379v7 implements View.OnKeyListener {
    public final /* synthetic */ SeekBarPreference A00;

    public C207379v7(SeekBarPreference seekBarPreference) {
        this.A00 = seekBarPreference;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            SeekBarPreference seekBarPreference = this.A00;
            if (!((!seekBarPreference.A09 && (i == 21 || i == 22)) || i == 23 || i == 66)) {
                SeekBar seekBar = seekBarPreference.A00;
                if (seekBar != null) {
                    return seekBar.onKeyDown(i, keyEvent);
                }
                Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
                return false;
            }
        }
        return false;
    }
}
