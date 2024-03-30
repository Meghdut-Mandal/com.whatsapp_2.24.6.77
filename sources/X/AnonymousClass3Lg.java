package X;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.3Lg  reason: invalid class name */
public abstract class AnonymousClass3Lg {
    public static String A00(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        Long[] lArr = new Long[11];
        lArr[0] = Long.valueOf(j2);
        C36421kH.A1P(lArr, j);
        C36361kB.A1W(lArr, j9);
        lArr[3] = Long.valueOf(j10);
        lArr[4] = Long.valueOf(j11);
        lArr[5] = Long.valueOf(j5);
        lArr[6] = Long.valueOf(j7);
        lArr[7] = Long.valueOf(j8);
        lArr[8] = Long.valueOf(j3);
        lArr[9] = Long.valueOf(j4);
        lArr[10] = Long.valueOf(j6);
        return TextUtils.join(",", Arrays.asList(lArr));
    }

    public static String A01(String str) {
        return AnonymousClass000.A0q("_voip", AnonymousClass000.A0v(str));
    }
}
