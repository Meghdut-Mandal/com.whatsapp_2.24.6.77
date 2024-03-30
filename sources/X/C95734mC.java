package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4mC  reason: invalid class name and case insensitive filesystem */
public class C95734mC extends AnonymousClass0IE {
    public int A00 = 0;
    public C120815s7 A01;
    public boolean A02 = true;
    public int A03 = 0;

    public void A0D(String str) {
        int i = 0;
        if (str != null) {
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        i = Integer.MIN_VALUE;
                        break;
                    } else {
                        return;
                    }
                case 100571:
                    if (str.equals("end")) {
                        this.A03 = 1;
                        return;
                    }
                    return;
                case 109757538:
                    if (str.equals("start")) {
                        this.A03 = -1;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        this.A03 = i;
    }

    public void A02() {
        C120815s7 r0 = this.A01;
        if (r0 != null) {
            r0.A01.A07((RecyclerView) null);
        }
    }

    public float A06(DisplayMetrics displayMetrics) {
        float f = 25.0f / ((float) displayMetrics.densityDpi);
        if (!this.A02) {
            return f * 0.1f;
        }
        return f;
    }

    public int A0A(int i, int i2, int i3, int i4, int i5) {
        if (this.A03 == Integer.MIN_VALUE) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
        return super.A0A(i, i2, i3, i4, i5);
    }

    public int A0B(View view, int i) {
        int i2;
        AnonymousClass0CP r0 = this.A02;
        if (r0 == null || !r0.A1N()) {
            i2 = 0;
        } else {
            i2 = this.A00;
        }
        return super.A0B(view, i) + i2;
    }

    public int A0C(View view, int i) {
        int i2;
        AnonymousClass0CP r0 = this.A02;
        if (r0 == null || !r0.A1O()) {
            i2 = 0;
        } else {
            i2 = this.A00;
        }
        return super.A0C(view, i) + i2;
    }

    public C95734mC(Context context) {
        super(context);
    }

    public void A03() {
        super.A03();
        C120815s7 r3 = this.A01;
        if (r3 != null) {
            r3.A02.A01 = null;
            r3.A00.A0v(new C162517oi(r3, 2));
        }
    }

    public int A07() {
        return this.A03;
    }

    public int A08() {
        return this.A03;
    }
}
