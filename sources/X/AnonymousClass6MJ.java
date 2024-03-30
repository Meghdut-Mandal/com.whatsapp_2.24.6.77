package X;

import java.util.Map;
import java.util.Objects;

/* renamed from: X.6MJ  reason: invalid class name */
public final class AnonymousClass6MJ {
    public final C20810yC A00;

    public AnonymousClass6MJ(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass5SG A01(C128716Di r5, AnonymousClass6PG r6, String str) {
        AnonymousClass00C.A0D(r5, 0);
        Objects.requireNonNull("2.24.6.77");
        AnonymousClass6OD A002 = AnonymousClass6OD.A00("2.24.6.77");
        if (r6 == null || A002 == null || this.A00.A0E(5247)) {
            return AnonymousClass5SG.VALID;
        }
        AnonymousClass5SG A003 = A00(A002, String.valueOf(r5.A01), r6.A02);
        AnonymousClass5SG r2 = AnonymousClass5SG.VALID;
        if (A003 == r2 && (A003 = A00(A002, r5.A02, r6.A00)) == r2 && (str == null || (A003 = A00(A002, str, r6.A01)) == r2)) {
            return r2;
        }
        return A003;
    }

    public static final AnonymousClass5SG A00(AnonymousClass6OD r2, String str, Map map) {
        String str2;
        String str3;
        AnonymousClass6OD A002;
        AnonymousClass6OD A003;
        if (str == null) {
            str = "";
        }
        Map A15 = C90514aH.A15(str, map);
        if (A15 == null) {
            return AnonymousClass5SG.UNKNOWN_VERSION;
        }
        AnonymousClass6AG r1 = (AnonymousClass6AG) A15.get("release");
        if (r1 == null || (((str2 = r1.A01) != null && (A003 = AnonymousClass6OD.A00(str2)) != null && r2.A01(A003) < 0) || ((str3 = r1.A00) != null && (A002 = AnonymousClass6OD.A00(str3)) != null && r2.A01(A002) > 0))) {
            return AnonymousClass5SG.NOT_COMPATIBLE;
        }
        return AnonymousClass5SG.VALID;
    }
}
