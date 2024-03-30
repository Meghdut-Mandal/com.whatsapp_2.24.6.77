package X;

import java.util.LinkedHashMap;

/* renamed from: X.1F5  reason: invalid class name */
public final class AnonymousClass1F5 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1F4 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1F5(AnonymousClass1F4 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass005 r0 = this.this$0.A04;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = r0.get();
        AnonymousClass00C.A08(obj);
        for (AnonymousClass4U1 r2 : (Iterable) obj) {
            for (Number intValue : r2.BI3()) {
                linkedHashMap.put(Integer.valueOf(intValue.intValue()), r2);
            }
        }
        return linkedHashMap;
    }
}
