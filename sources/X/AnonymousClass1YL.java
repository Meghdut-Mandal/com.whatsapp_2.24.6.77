package X;

import android.util.LruCache;
import java.util.List;

/* renamed from: X.1YL  reason: invalid class name */
public final class AnonymousClass1YL {
    public final LruCache A00 = new LruCache(300);
    public final C19700wN A01;

    public AnonymousClass1YL(C19700wN r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
    }

    public final List A00(String str) {
        if (str == null) {
            return null;
        }
        List list = (List) this.A00.get(str);
        if (list == null) {
            this.A01.A0E("mention cache miss", (String) null, false);
        }
        return list;
    }

    public final void A01(String str, List list) {
        AnonymousClass00C.A0D(str, 0);
        this.A00.put(str, list);
    }
}
