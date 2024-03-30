package androidx.preference;

import X.C167847z5;
import X.C36441kJ;
import android.content.SharedPreferences;
import android.os.Parcelable;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference {
    public Set A00 = C36441kJ.A16();
    public CharSequence[] A01;
    public CharSequence[] A02;

    public void A0C(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C167847z5.class)) {
            super.A0C(parcelable);
            return;
        }
        C167847z5 r3 = (C167847z5) parcelable;
        super.A0C(r3.getSuperState());
        A0S(r3.A00);
    }

    public void A0S(Set set) {
        Set set2 = this.A00;
        set2.clear();
        set2.addAll(set);
        if (A0Q()) {
            Set<String> set3 = null;
            if (A0Q()) {
                set3 = this.A0E.A01().getStringSet(this.A0J, (Set) null);
            }
            if (!set.equals(set3)) {
                SharedPreferences.Editor A002 = this.A0E.A00();
                A002.putStringSet(this.A0J, set);
                if (!this.A0E.A08) {
                    A002.apply();
                }
            }
        }
        A05();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r1 = 2130969196(0x7f04026c, float:1.7547067E38)
            r0 = 16842897(0x1010091, float:2.3693964E-38)
            int r2 = X.AnonymousClass0Yh.A00(r4, r1, r0)
            r1 = 0
            r3.<init>(r4, r5, r2, r1)
            java.util.HashSet r0 = X.C36441kJ.A16()
            r3.A00 = r0
            int[] r0 = X.AnonymousClass9BI.A05
            android.content.res.TypedArray r2 = r4.obtainStyledAttributes(r5, r0, r2, r1)
            r0 = 2
            java.lang.CharSequence[] r0 = r2.getTextArray(r0)
            if (r0 != 0) goto L_0x0025
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
        L_0x0025:
            r3.A01 = r0
            r0 = 3
            r1 = 1
            java.lang.CharSequence[] r0 = r2.getTextArray(r0)
            if (r0 != 0) goto L_0x0033
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
        L_0x0033:
            r3.A02 = r0
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
