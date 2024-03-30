package androidx.preference;

import X.C165597tg;
import X.C167867z7;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcelable;
import android.util.AttributeSet;

public abstract class TwoStatePreference extends Preference {
    public CharSequence A00;
    public CharSequence A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void A0C(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C167867z7.class)) {
            super.A0C(parcelable);
            return;
        }
        C167867z7 r3 = (C167867z7) parcelable;
        super.A0C(r3.getSuperState());
        A0T(r3.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S(android.view.View r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0021
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r3.A02
            r2 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.CharSequence r0 = r3.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0022
            java.lang.CharSequence r0 = r3.A01
        L_0x0015:
            r4.setText(r0)
        L_0x0018:
            int r0 = r4.getVisibility()
            if (r2 == r0) goto L_0x0021
            r4.setVisibility(r2)
        L_0x0021:
            return
        L_0x0022:
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0031
            java.lang.CharSequence r0 = r3.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0031
            java.lang.CharSequence r0 = r3.A00
            goto L_0x0015
        L_0x0031:
            java.lang.CharSequence r1 = r3.A04()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x003f
            r4.setText(r1)
            goto L_0x0018
        L_0x003f:
            r2 = 8
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.A0S(android.view.View):void");
    }

    public void A0T(boolean z) {
        boolean z2 = true;
        if (this.A02 == z) {
            z2 = false;
            if (this.A04) {
                return;
            }
        }
        this.A02 = z;
        this.A04 = true;
        if (A0Q()) {
            boolean z3 = !z;
            if (A0Q()) {
                z3 = this.A0E.A01().getBoolean(this.A0J, z3);
            }
            if (z != z3) {
                SharedPreferences.Editor A002 = this.A0E.A00();
                A002.putBoolean(this.A0J, z);
                if (!this.A0E.A08) {
                    A002.apply();
                }
            }
        }
        if (z2) {
            C165597tg.A17(this);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public TwoStatePreference(Context context) {
        this(context, (AttributeSet) null);
    }
}
