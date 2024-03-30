package X;

import android.content.Context;
import android.graphics.Color;
import com.whatsapp.R;

/* renamed from: X.06g  reason: invalid class name and case insensitive filesystem */
public class C014406g {
    public static final int A05 = ((int) Math.round(5.1000000000000005d));
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;

    public int A00(int i, float f) {
        float f2;
        int i2;
        if (!this.A04 || C018107s.A06(i, 255) != this.A01) {
            return i;
        }
        float f3 = this.A00;
        if (f3 <= 0.0f || f <= 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = Math.min(((((float) Math.log1p((double) (f / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        int alpha = Color.alpha(i);
        int A002 = C014606i.A00(f2, C018107s.A06(i, 255), this.A03);
        if (f2 > 0.0f && (i2 = this.A02) != 0) {
            A002 = C018107s.A05(C018107s.A06(i2, A05), A002);
        }
        return C018107s.A06(A002, alpha);
    }

    public C014406g(Context context) {
        boolean A042 = C014506h.A04(context, R.attr.f4nameremoved, false);
        int A012 = C014606i.A01(context, R.attr.f4nameremoved);
        int A013 = C014606i.A01(context, R.attr.f4nameremoved);
        int A014 = C014606i.A01(context, R.attr.f4nameremoved);
        float f = context.getResources().getDisplayMetrics().density;
        this.A04 = A042;
        this.A03 = A012;
        this.A02 = A013;
        this.A01 = A014;
        this.A00 = f;
    }
}
