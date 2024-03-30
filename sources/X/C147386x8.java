package X;

import android.content.Context;
import com.whatsapp.R;
import java.math.BigDecimal;

/* renamed from: X.6x8  reason: invalid class name and case insensitive filesystem */
public class C147386x8 implements C157457cz {
    public AnonymousClass16X A00;
    public final Context A01;
    public final C18820ts A02;
    public final AnonymousClass16U A03;
    public final AnonymousClass16X A04;
    public final C123415wS A05;
    public final AnonymousClass16X A06;

    public static C120045qs A00(C147386x8 r9, String str, BigDecimal bigDecimal, int i, boolean z) {
        AnonymousClass16X r0;
        int i2;
        if (i == 0) {
            r0 = r9.A00;
        } else {
            r0 = r9.A06;
        }
        BigDecimal bigDecimal2 = r0.A00;
        C123415wS r8 = r9.A05;
        if (r8 != null) {
            i2 = 0;
            int A1a = C36341k9.A1a(bigDecimal, bigDecimal2);
            BigDecimal A012 = C202809mh.A01(r8.A03, bigDecimal);
            if (A012.compareTo(bigDecimal2) > 0 || (A012.compareTo(bigDecimal2) == 0 && str.endsWith(".") && !z)) {
                return new C120045qs(3, C36391kE.A0v(r8.A00, r8.A02.B7e(r8.A01, bigDecimal2), new Object[A1a], 0, R.string.f12nameremoved));
            }
        } else {
            i2 = 0;
            if (bigDecimal.compareTo(bigDecimal2) > 0 || (bigDecimal.compareTo(bigDecimal2) == 0 && str.endsWith(".") && !z)) {
                return new C120045qs(3, C36391kE.A0v(r9.A01, r9.A03.B7e(r9.A02, bigDecimal2), AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
            }
        }
        return new C120045qs(i2, "");
    }

    public C147386x8(Context context, C18820ts r2, AnonymousClass16U r3, AnonymousClass16X r4, AnonymousClass16X r5, AnonymousClass16X r6, C123415wS r7) {
        this.A01 = context;
        this.A05 = r7;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = r4;
        this.A04 = r5;
        this.A06 = r6;
    }
}
