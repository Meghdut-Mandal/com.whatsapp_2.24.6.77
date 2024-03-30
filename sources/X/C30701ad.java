package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ad  reason: invalid class name and case insensitive filesystem */
public final class C30701ad extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C30661aZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30701ad(C30661aZ r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A01 = ((AnonymousClass9XG) this.this$0.A09.getValue()).A01();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : A01.entrySet()) {
            if (((B6C) entry.getValue()).BCR() == C188108z3.CUSTOM_MESSAGE) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (entry2.getValue() instanceof C21196ACe) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            int intValue = ((Number) entry3.getKey()).intValue();
            Object value = entry3.getValue();
            AnonymousClass00C.A0E(value, "null cannot be cast to non-null type com.whatsapp.historysync.integration.deserialization.HistorySyncCustomMessageParser");
            arrayList.add(new C195609Vc((C21196ACe) value, intValue));
        }
        return C007103b.A0c(arrayList, new C23177B8l(0));
    }
}
