package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.9Zb  reason: invalid class name */
public abstract class AnonymousClass9Zb {
    public static SpannableStringBuilder A00(Context context, C18820ts r3, AnonymousClass16U r4, AnonymousClass16X r5) {
        SpannableStringBuilder A0P = C36441kJ.A0P(A01(r3, r4, r5, 0, true));
        if (C1892492v.A00 == null) {
            try {
                C1892492v.A00 = C015006m.A03(context, R.font.payment_icons_regular);
                return A0P;
            } catch (Resources.NotFoundException unused) {
                Log.e("PAY: PaymentsTypeface/loadTypefaceSync could not load font R.font.payment_icons_regular");
            }
        }
        return A0P;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(X.C18820ts r9, X.AnonymousClass16U r10, X.AnonymousClass16X r11, int r12, boolean r13) {
        /*
            r1 = r10
            X.16V r1 = (X.AnonymousClass16V) r1
            r8 = 1
            r3 = r9
            if (r12 != r8) goto L_0x0052
            java.lang.String r4 = r1.A02
            java.lang.String r5 = r1.A03
            java.math.BigDecimal r6 = r11.A00
            int r7 = r6.scale()
        L_0x0011:
            java.lang.String r2 = X.AnonymousClass6US.A00(r3, r4, r5, r6, r7, r8)
        L_0x0015:
            java.lang.String r0 = r10.B7c(r9, r11)
            int r1 = r6.scale()
            java.lang.StringBuilder r4 = X.C90524aI.A0i(r2)
            int r3 = r2.indexOf(r0)
            int r2 = r0.length()
            int r0 = r1 + 1
            if (r1 > 0) goto L_0x002e
            r0 = 0
        L_0x002e:
            int r1 = r2 - r0
            int r1 = r1 + r3
            int r3 = r3 + r2
            int r0 = r6.signum()
            if (r0 == 0) goto L_0x0048
            int r0 = r6.scale()
            if (r0 <= 0) goto L_0x0048
            java.math.BigDecimal r0 = r6.stripTrailingZeros()
            int r0 = r0.scale()
            if (r0 > 0) goto L_0x004d
        L_0x0048:
            if (r13 == 0) goto L_0x004d
            r4.delete(r1, r3)
        L_0x004d:
            java.lang.String r0 = r4.toString()
            return r0
        L_0x0052:
            r0 = 2
            java.lang.String r4 = r1.A02
            if (r12 != r0) goto L_0x0061
            java.lang.String r5 = r1.A03
            java.math.BigDecimal r6 = r11.A00
            int r7 = r6.scale()
            r8 = 0
            goto L_0x0011
        L_0x0061:
            java.math.BigDecimal r6 = r11.A00
            int r7 = r6.scale()
            java.lang.String r5 = r1.A03
            java.lang.String r2 = X.AnonymousClass6US.A01(r3, r4, r5, r6, r7, r8)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Zb.A01(X.0ts, X.16U, X.16X, int, boolean):java.lang.String");
    }
}
