package X;

import java.util.Map;

/* renamed from: X.5Z6  reason: invalid class name */
public abstract class AnonymousClass5Z6 {
    public static C140456lc A00(C1271967i r7, C100674vP r8, C140456lc r9) {
        C1271967i r3 = r7;
        AnonymousClass6WZ A01 = C133266Xn.A01(r7);
        C131536Pl r4 = r8.A01;
        if (r4 == null) {
            C132926Vv.A02("Tree resources can only be read from the UI Thread");
            r4 = A01.A03.A01((Map) null, A01.A07);
        }
        C124105xb A00 = C132896Vr.A00(AnonymousClass6IB.A00, r3, r4, (C124105xb) null, r9, r7.A02.A01.B8s(), C131196Oc.A00);
        if (!A00.A03.isEmpty()) {
            AnonymousClass6RS.A01("BloksBind", "Undefined Behavior: BloksBind::evaluate() returned controller binding operations");
        }
        return A00.A02;
    }
}
