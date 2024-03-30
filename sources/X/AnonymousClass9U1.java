package X;

import android.text.TextUtils;
import androidx.preference.Preference;

/* renamed from: X.9U1  reason: invalid class name */
public class AnonymousClass9U1 {
    public String A00;
    public int A01;
    public int A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass9U1)) {
            return false;
        }
        AnonymousClass9U1 r4 = (AnonymousClass9U1) obj;
        if (this.A01 == r4.A01 && this.A02 == r4.A02 && TextUtils.equals(this.A00, r4.A00)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A00, (C165617ti.A01(this.A01) + this.A02) * 31);
    }

    public AnonymousClass9U1(Preference preference) {
        this.A00 = AnonymousClass000.A0k(preference);
        this.A01 = preference.A01;
        this.A02 = preference.A03;
    }
}
