package androidx.preference;

import X.AnonymousClass80G;
import X.AnonymousClass9BI;
import X.C167877z8;
import X.C207379v7;
import X.C207569vQ;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.R;

public class SeekBarPreference extends Preference {
    public SeekBar A00;
    public boolean A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View.OnKeyListener A06 = new C207379v7(this);
    public SeekBar.OnSeekBarChangeListener A07 = new C207569vQ(this);
    public TextView A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public static void A00(SeekBarPreference seekBarPreference, int i, boolean z) {
        int i2 = seekBarPreference.A03;
        if (i < i2) {
            i = i2;
        }
        int i3 = seekBarPreference.A02;
        if (i > i3) {
            i = i3;
        }
        if (i != seekBarPreference.A05) {
            seekBarPreference.A05 = i;
            TextView textView = seekBarPreference.A08;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (seekBarPreference.A0Q()) {
                int i4 = ~i;
                if (seekBarPreference.A0Q()) {
                    i4 = seekBarPreference.A0E.A01().getInt(seekBarPreference.A0J, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor A002 = seekBarPreference.A0E.A00();
                    A002.putInt(seekBarPreference.A0J, i);
                    if (!seekBarPreference.A0E.A08) {
                        A002.apply();
                    }
                }
            }
            if (z) {
                seekBarPreference.A05();
            }
        }
    }

    public void A0S(SeekBar seekBar) {
        int progress = this.A03 + seekBar.getProgress();
        if (progress != this.A05) {
            A0R(Integer.valueOf(progress));
            A00(this, progress, false);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f4nameremoved, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9BI.A0A, R.attr.f4nameremoved, 0);
        this.A03 = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.A03;
        i = i < i2 ? i2 : i;
        if (i != this.A02) {
            this.A02 = i;
            A05();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.A04) {
            this.A04 = Math.min(this.A02 - this.A03, Math.abs(i3));
            A05();
        }
        this.A09 = obtainStyledAttributes.getBoolean(2, true);
        this.A0A = obtainStyledAttributes.getBoolean(5, false);
        this.A0B = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public void A0C(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C167877z8.class)) {
            super.A0C(parcelable);
            return;
        }
        C167877z8 r3 = (C167877z8) parcelable;
        super.A0C(r3.getSuperState());
        this.A05 = r3.A02;
        this.A03 = r3.A01;
        this.A02 = r3.A00;
        A05();
    }

    public void A0G(AnonymousClass80G r4) {
        super.A0G(r4);
        r4.A0H.setOnKeyListener(this.A06);
        this.A00 = (SeekBar) r4.A0B(R.id.seekbar);
        TextView textView = (TextView) r4.A0B(R.id.seekbar_value);
        this.A08 = textView;
        if (this.A0A) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.A08 = null;
        }
        SeekBar seekBar = this.A00;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.A07);
        this.A00.setMax(this.A02 - this.A03);
        int i = this.A04;
        SeekBar seekBar2 = this.A00;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.A04 = seekBar2.getKeyProgressIncrement();
        }
        this.A00.setProgress(this.A05 - this.A03);
        int i2 = this.A05;
        TextView textView2 = this.A08;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.A00.setEnabled(A0O());
    }
}
