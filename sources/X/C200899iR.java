package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.9iR  reason: invalid class name and case insensitive filesystem */
public class C200899iR {
    public final C19730wQ A00;
    public final C19630wG A01;
    public final C18820ts A02;
    public final AnonymousClass1EU A03;
    public final AnonymousClass1FR A04;

    public static String A00(C19970wo r7, C200899iR r8, long j) {
        if (j <= 0) {
            return null;
        }
        Context context = r8.A01.A00;
        Object[] A0L = AnonymousClass001.A0L();
        C18820ts r2 = r8.A02;
        return C36391kE.A0v(context, AnonymousClass6XI.A03(r2, C20040wv.A05(r2, r7.A08(j)), C165607th.A0q(r7, r2, j)), A0L, 0, R.string.f12nameremoved);
    }

    public static boolean A01(C202319lY r2) {
        int i = r2.A03;
        if (i == 100 || i == 200) {
            return true;
        }
        return false;
    }

    public C200899iR(C19730wQ r1, C19630wG r2, C18820ts r3, AnonymousClass1EU r4, AnonymousClass1FR r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }
}
