package X;

import java.util.Map;

/* renamed from: X.5ZF  reason: invalid class name */
public abstract class AnonymousClass5ZF {
    public static Object A00(C124125xd r4, Map map) {
        if (!map.containsKey("initial_lispy")) {
            return map.get("initial");
        }
        try {
            return AnonymousClass5ZN.A00(AnonymousClass6MO.A01, new C142256oa((AnonymousClass6IL) null, C36431kI.A1A("initial_lispy", map), r4.A06), r4);
        } catch (AnonymousClass5VI e) {
            AnonymousClass6RS.A00((C1271967i) null, "StateModule", "Exception gettin initial_lispy value", e);
            return null;
        }
    }
}
