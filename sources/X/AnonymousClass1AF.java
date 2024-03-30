package X;

import java.util.HashMap;
import java.util.Set;

/* renamed from: X.1AF  reason: invalid class name */
public final class AnonymousClass1AF extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass005 $handlers;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1AF(AnonymousClass005 r2) {
        super(0);
        this.$handlers = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj = this.$handlers.get();
        AnonymousClass00C.A08(obj);
        Set<AnonymousClass1LZ> set = (Set) obj;
        AnonymousClass00C.A0D(set, 0);
        HashMap hashMap = new HashMap();
        for (AnonymousClass1LZ r1 : set) {
            String A0C = r1.A0C();
            AnonymousClass00C.A08(A0C);
            hashMap.put(A0C, r1);
        }
        return hashMap;
    }
}
