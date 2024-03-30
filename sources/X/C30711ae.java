package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1ae  reason: invalid class name and case insensitive filesystem */
public final class C30711ae extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C30661aZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30711ae(C30661aZ r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A01 = ((AnonymousClass9XG) this.this$0.A09.getValue()).A01();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : A01.entrySet()) {
            if (((B6C) entry.getValue()).BCR() == C188108z3.STUB_MESSAGE) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (entry2.getValue() instanceof B15) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object value = entry3.getValue();
            AnonymousClass00C.A0E(value, "null cannot be cast to non-null type com.whatsapp.historysync.integration.deserialization.HistorySyncStubMessageParser");
            B15 b15 = (B15) value;
            arrayList.add(new AnonymousClass9WA(b15, b15.BCE(), ((Number) entry3.getKey()).intValue()));
        }
        List<AnonymousClass9WA> A0c = C007103b.A0c(arrayList, new C23177B8l(1));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (AnonymousClass9WA r3 : A0c) {
            for (Object next : r3.A02) {
                Object obj = linkedHashMap3.get(next);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap3.put(next, obj);
                }
                ((List) obj).add(r3);
            }
        }
        return linkedHashMap3;
    }
}
