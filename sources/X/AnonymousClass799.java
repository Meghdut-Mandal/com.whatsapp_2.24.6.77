package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.799  reason: invalid class name */
public class AnonymousClass799 extends LinkedHashMap<String, String> {
    public final /* synthetic */ C21330z2 this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass799(C21330z2 r4) {
        super(64, 0.75f, true);
        this.this$1 = r4;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        return C90474aD.A1T(size(), 64);
    }
}
