package X;

import java.text.Collator;
import java.util.Map;

/* renamed from: X.4NS  reason: invalid class name */
public final class AnonymousClass4NS extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ Collator $collator;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4NS(Collator collator) {
        super(2);
        this.$collator = collator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        C36321k7.A0w(entry, entry2);
        String str = (String) entry.getValue();
        String str2 = (String) entry2.getValue();
        int compare = this.$collator.compare(str, str2);
        String str3 = C20690y0.A0H;
        if (!AnonymousClass00C.A0J(str3, str)) {
            String str4 = C20690y0.A0D;
            if (!AnonymousClass00C.A0J(str4, str)) {
                if (AnonymousClass00C.A0J(str4, str2) || AnonymousClass00C.A0J(str3, str2)) {
                    compare = 1;
                }
                return Integer.valueOf(compare);
            }
        }
        compare = -1;
        return Integer.valueOf(compare);
    }
}
