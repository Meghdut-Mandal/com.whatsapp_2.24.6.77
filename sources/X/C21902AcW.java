package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.AcW  reason: case insensitive filesystem */
public class C21902AcW extends LinkedHashMap<K, V> {
    public final /* synthetic */ AnonymousClass9H1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21902AcW(AnonymousClass9H1 r3, int i) {
        super(i, 0.75f, true);
        this.this$0 = r3;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        return C90474aD.A1T(size(), this.this$0.A00);
    }
}
