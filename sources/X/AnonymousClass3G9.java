package X;

import com.whatsapp.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3G9  reason: invalid class name */
public final class AnonymousClass3G9 {
    public final C18820ts A00;
    public final C19970wo A01;

    public final String A00(long j) {
        String A06;
        C19970wo r0 = this.A01;
        C18820ts r8 = this.A00;
        long A08 = r0.A08(j);
        long currentTimeMillis = System.currentTimeMillis();
        int A002 = AnonymousClass6XI.A00(currentTimeMillis, A08);
        if (A002 == 0) {
            int i = (int) ((currentTimeMillis - A08) / 60000);
            if (i < 1) {
                A06 = r8.A0B(R.string.f12nameremoved);
            } else {
                long j2 = (long) i;
                if (j2 >= TimeUnit.HOURS.toMinutes(1)) {
                    return AnonymousClass3UM.A00(r8, A08);
                }
                Object[] objArr = new Object[1];
                Locale A0x = C36401kF.A0x(r8);
                Object[] objArr2 = new Object[1];
                char A1b = C36361kB.A1b(objArr2, i);
                String format = String.format(A0x, "%d", Arrays.copyOf(objArr2, 1));
                AnonymousClass00C.A08(format);
                objArr[A1b] = format;
                A06 = r8.A0K(objArr, 270, j2);
            }
        } else if (A002 == 1) {
            A06 = C20040wv.A01(r8);
        } else if (A002 < 7) {
            A06 = C20040wv.A06(r8, A08);
        } else {
            String A09 = C20040wv.A09(r8, A08);
            AnonymousClass00C.A08(A09);
            return A09;
        }
        AnonymousClass00C.A0B(A06);
        return A06;
    }

    public final String A01(Object[] objArr, int i, long j) {
        String A0L = this.A00.A0L(Arrays.copyOf(objArr, 1), i, j);
        AnonymousClass00C.A08(A0L);
        return A0L;
    }

    public AnonymousClass3G9(C19970wo r1, C18820ts r2) {
        C36321k7.A0x(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
