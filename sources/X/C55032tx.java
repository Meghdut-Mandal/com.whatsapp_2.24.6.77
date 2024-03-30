package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.2tx  reason: invalid class name and case insensitive filesystem */
public abstract class C55032tx {
    public static String A00(Context context, AnonymousClass16D r6, AnonymousClass171 r7, AnonymousClass3T1 r8) {
        AnonymousClass11F r0;
        C64933Qa r1 = r8.A1J;
        if (r1.A02) {
            return context.getString(R.string.f12nameremoved);
        }
        AnonymousClass11F r12 = r1.A00;
        if (AnonymousClass143.A0G(r12)) {
            r0 = r8.A0J();
        } else {
            r0 = r12;
        }
        if (r0 == null) {
            return "";
        }
        AnonymousClass141 A0D = r6.A0D(r0);
        int A0A = r7.A0A(r12);
        AnonymousClass34G A0E = r7.A0E(A0D, A0A, false, true);
        String str = A0E.A01;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        r7.A0G(A0E.A00, A0D, A0A);
        return str2;
    }
}
