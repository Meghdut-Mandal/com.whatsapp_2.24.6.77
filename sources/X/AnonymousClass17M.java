package X;

import java.util.Map;

/* renamed from: X.17M  reason: invalid class name */
public final class AnonymousClass17M extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass17H $systemMessagePlatform;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass17M(AnonymousClass17H r2) {
        super(0);
        this.$systemMessagePlatform = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C193839Nb r2;
        AnonymousClass17H r5 = this.$systemMessagePlatform;
        C019308f r4 = new C019308f(B6G.class);
        synchronized (r5) {
            Map map = r5.A02;
            Object obj = map.get(r4);
            if (obj == null) {
                AnonymousClass9UU r1 = (AnonymousClass9UU) r5.A03.getValue();
                AnonymousClass00C.A08(r1);
                C197769cL r0 = (C197769cL) r5.A04.getValue();
                AnonymousClass00C.A08(r0);
                obj = new C193839Nb(r1, r0, r4);
                map.put(r4, obj);
            }
            r2 = (C193839Nb) obj;
        }
        return r2;
    }
}
