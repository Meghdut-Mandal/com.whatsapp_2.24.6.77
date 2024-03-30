package X;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;

/* renamed from: X.0yu  reason: invalid class name and case insensitive filesystem */
public class C21250yu extends LinkedHashMap<AnonymousClass9UI, SSLSession> {
    public final /* synthetic */ C21230ys this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21250yu(C21230ys r4) {
        super(64, 0.75f, true);
        this.this$0 = r4;
    }

    public boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.this$0.A02) {
            return true;
        }
        return false;
    }
}
