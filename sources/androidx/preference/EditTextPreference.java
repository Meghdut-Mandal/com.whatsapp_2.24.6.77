package androidx.preference;

import X.C167827z3;
import android.os.Parcelable;

public class EditTextPreference extends DialogPreference {
    public String A00;

    public void A0C(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C167827z3.class)) {
            super.A0C(parcelable);
            return;
        }
        C167827z3 r3 = (C167827z3) parcelable;
        super.A0C(r3.getSuperState());
        A0S(r3.A00);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r1 = 2130969242(0x7f04029a, float:1.754716E38)
            r0 = 16842898(0x1010092, float:2.3693967E-38)
            int r1 = X.AnonymousClass0Yh.A00(r4, r1, r0)
            r2 = 0
            r3.<init>(r4, r5, r1, r2)
            int[] r0 = X.AnonymousClass9BI.A03
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r5, r0, r1, r2)
            boolean r0 = r1.getBoolean(r2, r2)
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 == 0) goto L_0x002e
            X.9xS r0 = X.C207989xS.A00
            if (r0 != 0) goto L_0x0029
            X.9xS r0 = new X.9xS
            r0.<init>()
            X.C207989xS.A00 = r0
        L_0x0029:
            r3.A0C = r0
            r3.A05()
        L_0x002e:
            r1.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void A0S(String str) {
        boolean A0P = A0P();
        this.A00 = str;
        A0K(str);
        boolean A0P2 = A0P();
        if (A0P2 != A0P) {
            A0L(A0P2);
        }
        A05();
    }
}
