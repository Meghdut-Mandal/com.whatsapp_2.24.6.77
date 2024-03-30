package X;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.1ZB  reason: invalid class name */
public final class AnonymousClass1ZB extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1Z9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1ZB(AnonymousClass1Z9 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.this$0.A04.A03().iterator();
        while (it.hasNext()) {
            C128646Db r1 = (C128646Db) it.next();
            linkedHashMap.put(Integer.valueOf(r1.A00), r1);
        }
        return linkedHashMap;
    }
}
