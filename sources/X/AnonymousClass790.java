package X;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.790  reason: invalid class name */
public class AnonymousClass790 extends HashMap<String, Object> {
    public final /* synthetic */ C97824qK this$0;
    public final /* synthetic */ String val$surface;

    public AnonymousClass790(C97824qK r3, String str) {
        this.this$0 = r3;
        this.val$surface = str;
        put("surface", str);
        BlockingQueue blockingQueue = C97824qK.A03;
        put("bytes_downloaded", Long.valueOf(r3.A01.get()));
        put("cache_hit_count", Long.valueOf(r3.A00.get()));
        put("cache_miss_count", Long.valueOf(r3.A01.get()));
    }
}
