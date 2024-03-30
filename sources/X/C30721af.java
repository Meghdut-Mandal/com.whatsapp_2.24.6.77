package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1af  reason: invalid class name and case insensitive filesystem */
public final class C30721af extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C30661aZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30721af(C30661aZ r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A01 = ((AnonymousClass9XG) this.this$0.A09.getValue()).A01();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : A01.entrySet()) {
            if (((B6C) entry.getValue()).BCR() == C188108z3.E2E_MESSAGE) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (entry2.getValue() instanceof C21197ACf) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            int intValue = ((Number) entry3.getKey()).intValue();
            Object value = entry3.getValue();
            AnonymousClass00C.A0E(value, "null cannot be cast to non-null type com.whatsapp.historysync.integration.deserialization.HistorySyncE2eMessageParser");
            arrayList.add(new C195619Vd((C21197ACf) value, intValue));
        }
        int A02 = C000300d.A02(AnonymousClass03U.A06(arrayList, 10));
        if (A02 < 16) {
            A02 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(A02);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap3.put(Integer.valueOf(((C195619Vd) next).A00), next);
        }
        return linkedHashMap3;
    }
}
