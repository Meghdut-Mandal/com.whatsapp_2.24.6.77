package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.1ZC  reason: invalid class name */
public final class AnonymousClass1ZC extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1Z9 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1ZC(AnonymousClass1Z9 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList A02 = this.this$0.A04.A02();
        int A022 = C000300d.A02(AnonymousClass03U.A06(A02, 10));
        if (A022 < 16) {
            A022 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(A022);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap2.put(Integer.valueOf(((C64683Pa) next).A05.A00), next);
        }
        linkedHashMap.putAll(C000400e.A06(linkedHashMap2));
        return linkedHashMap;
    }
}
