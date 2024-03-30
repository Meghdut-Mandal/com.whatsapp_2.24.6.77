package X;

import android.util.Pair;
import java.util.Locale;

/* renamed from: X.3Lq  reason: invalid class name and case insensitive filesystem */
public abstract class C63843Lq {
    public static void A01(C65063Qo r2, String str) {
        r2.A01(A00("message", str, "message_row_id=old._id"));
    }

    public static void A02(C65063Qo r1, String str, String str2) {
        r1.A01(A00(str, str2, "message_row_id=old.message_row_id"));
    }

    public static Pair A00(String str, String str2, String str3) {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = str;
        A0M[1] = str2;
        String lowerCase = String.format("%s_bd_for_%s_trigger", A0M).toLowerCase(Locale.getDefault());
        Object[] objArr = new Object[4];
        objArr[0] = lowerCase;
        C36411kG.A1Q(str, str2, objArr, 1);
        objArr[3] = str3;
        return C36441kJ.A0Q(lowerCase, String.format("CREATE TRIGGER %s BEFORE DELETE ON %s BEGIN DELETE FROM %s WHERE %s; END", objArr));
    }

    public static void A03(C65063Qo r2, String str, String str2, String str3) {
        Pair A00 = A00(str, str2, str3);
        r2.A08((String) A00.first, (String) A00.second);
    }

    public static void A04(C65063Qo r2, String str, String str2, String str3) {
        Pair A00 = A00(str, str2, str3);
        AnonymousClass00C.A0B(A00);
        r2.A08((String) A00.first, (String) A00.second);
    }

    public static void A05(C65063Qo r1, String str, String str2, String str3) {
        r1.A01(A00(str, str2, str3));
    }
}
