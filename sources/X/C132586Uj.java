package X;

import android.content.SharedPreferences;
import java.util.AbstractCollection;
import org.json.JSONTokener;

/* renamed from: X.6Uj  reason: invalid class name and case insensitive filesystem */
public final class C132586Uj {
    public static final C132586Uj A00 = new C132586Uj();

    public static final String A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        String A0b = C90464aC.A0b(str);
        AnonymousClass00C.A08(A0b);
        return A0b;
    }

    public final String A02(AnonymousClass1KW r4, String str, boolean z) {
        String str2;
        AnonymousClass00C.A0D(str, 0);
        Object A0t = C36371kC.A0t((SharedPreferences) r4.A00.get(), "flows_salt_for_logging_message_id");
        if (A0t == null) {
            A0t = new AnonymousClass7M6(r4);
        }
        if (z) {
            str2 = "_qpl";
        } else {
            str2 = "_wam";
        }
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append(A0t);
        return A00(AnonymousClass000.A0q(str2, A0v));
    }

    public static final boolean A01(C128716Di r2, C20810yC r3) {
        Object nextValue = new JSONTokener(C36431kI.A19(r3, 7187)).nextValue();
        AnonymousClass00C.A0B(nextValue);
        Object A002 = AnonymousClass6HO.A00(nextValue);
        AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Int> }");
        return C36381kD.A1Z((AbstractCollection) A002, r2.A01);
    }
}
