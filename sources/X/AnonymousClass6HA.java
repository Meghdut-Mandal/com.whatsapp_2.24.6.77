package X;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.6HA  reason: invalid class name */
public abstract class AnonymousClass6HA {
    public static String A01(C18820ts r8, long j) {
        if (j < 10000) {
            Locale A0x = C36401kF.A0x(r8);
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, 0, j);
            return String.format(A0x, "%,d", objArr);
        }
        double d = (double) j;
        double pow = Math.pow(1000.0d, (double) ((int) (Math.log(d) / Math.log(1000.0d))));
        double d2 = d / pow;
        long j2 = j / ((long) pow);
        if (d2 == ((double) j2) || ((int) (d2 * 10.0d)) % 10 == 0) {
            return String.valueOf(j2);
        }
        NumberFormat instance = NumberFormat.getInstance();
        instance.setMinimumFractionDigits(1);
        instance.setMaximumFractionDigits(1);
        instance.setRoundingMode(RoundingMode.DOWN);
        return instance.format(d2);
    }

    public static String A00(long j) {
        if (j < 10000) {
            return null;
        }
        int log = (int) (Math.log((double) j) / Math.log(1000.0d));
        if (log > 3) {
            log = 3;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        C90514aH.A1R("KMB", A0u, log - 1);
        return AnonymousClass000.A0q("", A0u);
    }
}
