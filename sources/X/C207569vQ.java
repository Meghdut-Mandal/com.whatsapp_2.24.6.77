package X;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* renamed from: X.9vQ  reason: invalid class name and case insensitive filesystem */
public class C207569vQ implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ SeekBarPreference A00;

    public C207569vQ(SeekBarPreference seekBarPreference) {
        this.A00 = seekBarPreference;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            SeekBarPreference seekBarPreference = this.A00;
            if (seekBarPreference.A0B || !seekBarPreference.A01) {
                seekBarPreference.A0S(seekBar);
                return;
            }
        }
        SeekBarPreference seekBarPreference2 = this.A00;
        int i2 = i + seekBarPreference2.A03;
        TextView textView = seekBarPreference2.A08;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.A00.A01 = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        SeekBarPreference seekBarPreference = this.A00;
        seekBarPreference.A01 = false;
        if (seekBar.getProgress() + seekBarPreference.A03 != seekBarPreference.A05) {
            seekBarPreference.A0S(seekBar);
        }
    }
}
