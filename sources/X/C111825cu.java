package X;

import java.util.Formatter;

/* renamed from: X.5cu  reason: invalid class name and case insensitive filesystem */
public abstract class C111825cu {
    public static String A00(StringBuilder sb, Formatter formatter, long j) {
        Object[] objArr;
        String str;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long A0B = C36391kE.A0B(j + 500);
        long j2 = A0B % 60;
        long j3 = (A0B / 60) % 60;
        long j4 = A0B / 3600;
        sb.setLength(0);
        if (j4 > 0) {
            objArr = C36441kJ.A1Q();
            AnonymousClass000.A1M(objArr, 0, j4);
            AnonymousClass000.A1M(objArr, 1, j3);
            AnonymousClass000.A1M(objArr, 2, j2);
            str = "%d:%02d:%02d";
        } else {
            objArr = new Object[2];
            AnonymousClass000.A1M(objArr, 0, j3);
            AnonymousClass000.A1M(objArr, 1, j2);
            str = "%02d:%02d";
        }
        return formatter.format(str, objArr).toString();
    }
}
