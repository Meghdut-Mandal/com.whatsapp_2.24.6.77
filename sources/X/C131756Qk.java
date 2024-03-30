package X;

import android.app.Application;
import android.content.Context;
import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Qk  reason: invalid class name and case insensitive filesystem */
public abstract class C131756Qk {
    public static void A01(Context context, C121065sX r5, AnonymousClass6MO r6, AnonymousClass65A r7, Map map) {
        AnonymousClass6WZ r3 = new AnonymousClass6WZ(new AnonymousClass6XK(r5.A00, new C140456lc(-1), (String) null), AnonymousClass6IK.A00, C131196Oc.A00);
        if (context instanceof Application) {
            AnonymousClass6RS.A01("BloksInterpreterHelper", "Creating BloksContext with Application Context. This may break the ability to execute navigation actions correctly");
        }
        C1271967i A00 = C133266Xn.A00(context, new SparseArray(), r3, r7, r5.A02);
        r3.A03(A00, new C141986o9(), Collections.emptyMap());
        AnonymousClass6JI.A00(A00(r5, A00, map), r6, r5.A01);
    }

    public static C100674vP A00(C121065sX r6, C1271967i r7, Map map) {
        C130486Lg r5 = r6.A00;
        C133266Xn.A01(r7).A06(new AnonymousClass6XK(r5, new C140456lc(-1), (String) null), AnonymousClass6XK.A03(r5.A02, map));
        return C100674vP.A00(r7, r6.A01, (List) null);
    }

    public static void A02(C1271967i r1, C140456lc r2, AnonymousClass6MO r3, C160377ku r4) {
        AnonymousClass6JI.A00(C100674vP.A00(r1, r4, r2.A08), r3, r4);
    }
}
