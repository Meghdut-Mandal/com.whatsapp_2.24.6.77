package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1L5  reason: invalid class name */
public final class AnonymousClass1L5 extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass1L4 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1L5(AnonymousClass1L4 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Set singleton = Collections.singleton("com.bloks.www.whatsapp.commerce.address_message");
        AnonymousClass00C.A08(singleton);
        Collection<C122455us> values = ((Map) this.this$0.A01.getValue()).values();
        ArrayList arrayList = new ArrayList(AnonymousClass03U.A06(values, 10));
        for (C122455us r0 : values) {
            arrayList.add(r0.A01);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (!AnonymousClass00C.A0J(next, "com.bloks.www.whatsapp.commerce.galaxy_message") && !AnonymousClass00C.A0J(next, "com.bloks.www.whatsapp.commerce.extensions_message_v2")) {
                arrayList2.add(next);
            }
        }
        return C13640kC.A04(arrayList2, singleton);
    }
}
