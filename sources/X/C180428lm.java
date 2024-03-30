package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.8lm  reason: invalid class name and case insensitive filesystem */
public class C180428lm extends C200239gv {
    public final C18820ts A00;
    public final AnonymousClass1EV A01;
    public final C20380xT A02;
    public final C32681e1 A03;
    public final Resources A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C180428lm(android.content.res.Resources r13, X.AnonymousClass185 r14, X.C19970wo r15, X.C18820ts r16, X.AnonymousClass1A5 r17, X.C20810yC r18, X.AnonymousClass1EV r19, X.AnonymousClass1EU r20, X.AnonymousClass1FR r21, X.C20380xT r22, X.C32681e1 r23) {
        /*
            r12 = this;
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A03 = r11
            r12.A04 = r13
            r0 = r22
            r12.A02 = r0
            r12.A00 = r5
            r12.A01 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180428lm.<init>(android.content.res.Resources, X.185, X.0wo, X.0ts, X.1A5, X.0yC, X.1EV, X.1EU, X.1FR, X.0xT, X.1e1):void");
    }

    public HashMap A05(Context context, C202319lY r13, C207199ui r14) {
        Context context2 = context;
        C202319lY r6 = r13;
        HashMap A05 = super.A05(context, r13, r14);
        List<C206909uC> list = r14.A0L;
        if (list != null && list.size() > 0) {
            for (C206909uC r8 : list) {
                String str = r8.A01;
                if (("pix_static_code".equals(str) || "pix_dynamic_code".equals(str)) && this.A03.A0E(4780)) {
                    A05.put(6, A01(context2, r6, (C206929uE) null, r8, context.getString(R.string.f12nameremoved), 6));
                }
            }
        }
        return A05;
    }

    public static SpannableString A00(Context context, C180428lm r10) {
        String[] strArr = {r10.A03.A09(3014)};
        return r10.A03.A01(context, r10.A04.getString(R.string.f12nameremoved), new Runnable[]{AWI.A00, AWJ.A00, AWK.A00}, new String[]{"payment-protection-link"}, strArr);
    }

    public HashMap A04(Context context) {
        HashMap A042 = super.A04(context);
        A042.put(C36381kD.A0m(), context.getString(R.string.f12nameremoved));
        return A042;
    }
}
