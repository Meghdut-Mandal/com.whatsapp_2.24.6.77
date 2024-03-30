package X;

import java.util.Map;

/* renamed from: X.4NV  reason: invalid class name */
public final class AnonymousClass4NV extends AnonymousClass00R implements C009003v {
    public static final AnonymousClass4NV A00 = new AnonymousClass4NV();

    public AnonymousClass4NV() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Map.Entry entry = (Map.Entry) obj;
        Map.Entry entry2 = (Map.Entry) obj2;
        C36321k7.A0w(entry, entry2);
        return Integer.valueOf(Float.compare(C36441kJ.A03(entry2.getValue()), C36441kJ.A03(entry.getValue())));
    }
}
