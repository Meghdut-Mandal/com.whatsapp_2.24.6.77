package X;

import android.app.Application;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9l2  reason: invalid class name and case insensitive filesystem */
public final class C202099l2 {
    public final Application A00;
    public final C19730wQ A01;
    public final C18820ts A02;

    public static final BigDecimal A01(Date date, List list) {
        C132386Tk r7;
        C36331k8.A1I(list, date);
        AnonymousClass6B4 r0 = (AnonymousClass6B4) C007103b.A0M(list);
        if (r0 != null) {
            r7 = r0.A02.A04;
        } else {
            r7 = null;
        }
        BigDecimal bigDecimal = new BigDecimal(0);
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                AnonymousClass6B4 A0M = C165617ti.A0M(it);
                C207269up r4 = A0M.A02;
                long j = A0M.A00;
                if (!AnonymousClass00C.A0J(r7, r4.A04)) {
                    break;
                }
                BigDecimal bigDecimal2 = r4.A06;
                C134726bV r1 = r4.A02;
                if (bigDecimal2 == null) {
                    bigDecimal2 = null;
                } else if (r1 != null && r1.A00(date)) {
                    bigDecimal2 = r1.A00;
                }
                BigDecimal bigDecimal3 = r4.A06;
                if (!(bigDecimal2 == null || bigDecimal3 == null)) {
                    BigDecimal subtract = bigDecimal3.subtract(bigDecimal2);
                    AnonymousClass00C.A08(subtract);
                    if (subtract.compareTo(BigDecimal.ZERO) > 0) {
                        BigDecimal subtract2 = bigDecimal3.subtract(bigDecimal2);
                        AnonymousClass00C.A08(subtract2);
                        BigDecimal valueOf = BigDecimal.valueOf(j);
                        AnonymousClass00C.A08(valueOf);
                        BigDecimal multiply = subtract2.multiply(valueOf);
                        AnonymousClass00C.A08(multiply);
                        bigDecimal = bigDecimal.add(multiply);
                        AnonymousClass00C.A08(bigDecimal);
                    }
                }
            } else if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
                return bigDecimal;
            }
        }
        return null;
    }

    public static final BigDecimal A02(List list) {
        AnonymousClass00C.A0D(list, 0);
        BigDecimal bigDecimal = new BigDecimal(0);
        Iterator it = list.iterator();
        C132386Tk r5 = null;
        while (it.hasNext()) {
            AnonymousClass6B4 A0M = C165617ti.A0M(it);
            C207269up r0 = A0M.A02;
            long j = A0M.A00;
            C132386Tk r2 = r0.A04;
            BigDecimal bigDecimal2 = r0.A06;
            if (bigDecimal2 == null || r2 == null || (r5 != null && !r5.equals(r2))) {
                return null;
            }
            BigDecimal valueOf = BigDecimal.valueOf(j);
            AnonymousClass00C.A08(valueOf);
            BigDecimal multiply = bigDecimal2.multiply(valueOf);
            AnonymousClass00C.A08(multiply);
            bigDecimal = bigDecimal.add(multiply);
            AnonymousClass00C.A08(bigDecimal);
            r5 = r2;
        }
        return bigDecimal;
    }

    public final String A04(BigDecimal bigDecimal, List list, boolean z) {
        C132386Tk r2;
        C206439tP r0 = (C206439tP) C007103b.A0M(list);
        if (r0 != null) {
            r2 = r0.A01;
        } else {
            r2 = null;
        }
        if (bigDecimal == null || r2 == null || bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            return null;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        if (z) {
            A0u.append(8722);
        }
        String A0q = AnonymousClass000.A0q(r2.A03(this.A02, bigDecimal, true), A0u);
        AnonymousClass00C.A08(A0q);
        return A0q;
    }

    public C202099l2(Application application, C19730wQ r2, C18820ts r3) {
        C36321k7.A11(application, r3, r2);
        this.A00 = application;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static final BigDecimal A00(C128826Dt r5, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list) {
        C132386Tk r2;
        float f;
        BigDecimal subtract;
        C206439tP r0 = (C206439tP) C007103b.A0M(list);
        if (r0 != null) {
            r2 = r0.A01;
        } else {
            r2 = null;
        }
        if (bigDecimal == null || r5 == null || r2 == null) {
            return null;
        }
        int i = r5.A00;
        if (i == 1) {
            return C129676Ia.A00(r2, C36371kC.A0A(AnonymousClass097.A04(r5.A03)));
        }
        if (i != 2) {
            return null;
        }
        if (!(bigDecimal2 == null || (subtract = bigDecimal.subtract(bigDecimal2)) == null)) {
            bigDecimal = subtract;
        }
        int A002 = C132386Tk.A00(r2.A00);
        String str = r5.A03;
        Float f2 = null;
        try {
            if (AnonymousClass0RV.A00.A03(str)) {
                f2 = Float.valueOf(Float.parseFloat(str));
                if (f2 != null) {
                    f = f2.floatValue();
                    BigDecimal multiply = bigDecimal.multiply(C165617ti.A0b(String.valueOf(((double) f) / 100.0d)));
                    AnonymousClass00C.A08(multiply);
                    return multiply.setScale(A002, RoundingMode.UP);
                }
            }
        } catch (NumberFormatException unused) {
        }
        f = 0.0f;
        BigDecimal multiply2 = bigDecimal.multiply(C165617ti.A0b(String.valueOf(((double) f) / 100.0d)));
        AnonymousClass00C.A08(multiply2);
        return multiply2.setScale(A002, RoundingMode.UP);
    }

    public final String A03(BigDecimal bigDecimal, BigDecimal bigDecimal2, List list) {
        C132386Tk r0;
        BigDecimal subtract;
        C206439tP r02 = (C206439tP) C007103b.A0M(list);
        if (r02 != null) {
            r0 = r02.A01;
        } else {
            r0 = null;
        }
        if (bigDecimal == null || r0 == null) {
            return null;
        }
        if (!(bigDecimal2 == null || (subtract = bigDecimal.subtract(bigDecimal2)) == null)) {
            bigDecimal = subtract;
        }
        return A04(bigDecimal, list, false);
    }
}
