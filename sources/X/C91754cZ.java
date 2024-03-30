package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.4cZ  reason: invalid class name and case insensitive filesystem */
public class C91754cZ extends InputFilter.AllCaps {
    public final /* synthetic */ C100364ut A00;

    public C91754cZ(C100364ut r1) {
        this.A00 = r1;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return String.valueOf(charSequence).toLowerCase(C36401kF.A0x(this.A00.A00.A06));
    }
}
