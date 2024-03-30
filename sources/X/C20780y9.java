package X;

import java.util.Map;

/* renamed from: X.0y9  reason: invalid class name and case insensitive filesystem */
public final class C20780y9 {
    public final Map A00;

    public C20780y9(Map map) {
        AnonymousClass00C.A0D(map, 1);
        this.A00 = map;
    }

    public static final AnonymousClass005 A00(C20780y9 r1, Class cls) {
        AnonymousClass005 r0 = (AnonymousClass005) r1.A00.get(cls);
        if (r0 != null) {
            return r0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No bridge with type ");
        sb.append(cls);
        sb.append(" was registered.");
        throw new IllegalStateException(sb.toString());
    }

    public final AnonymousClass00M A01(Class cls) {
        Object obj = A00(this, cls).get();
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type T of com.whatsapp.dependencybridge.DependencyBridgeRegistry.getBridge");
        return (AnonymousClass00M) obj;
    }
}
