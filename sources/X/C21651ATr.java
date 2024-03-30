package X;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.ATr  reason: case insensitive filesystem */
public final class C21651ATr implements Closeable {
    public final int A00;
    public final Map A01;
    public final ConcurrentHashMap A02;

    public final LinkedHashMap A00() {
        ConcurrentHashMap concurrentHashMap = this.A02;
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator A10 = C36371kC.A10(concurrentHashMap);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            AU0 au0 = (AU0) A11.getValue();
            AnonymousClass00C.A0B(au0);
            if (au0.A02() && !((Bitmap) au0.A01()).isRecycled()) {
                C36411kG.A1T(A1G, A11);
            }
        }
        return A1G;
    }

    public void close() {
        ConcurrentHashMap concurrentHashMap = this.A02;
        Collection<AU0> values = concurrentHashMap.values();
        AnonymousClass00C.A08(values);
        for (AU0 close : values) {
            close.close();
        }
        concurrentHashMap.clear();
    }

    public C21651ATr(Map map, Map map2) {
        int i;
        Bitmap bitmap;
        this.A01 = map2;
        this.A02 = new ConcurrentHashMap(map);
        Iterator A0z = AnonymousClass000.A0z(map);
        int i2 = 0;
        while (A0z.hasNext()) {
            AU0 au0 = (AU0) A0z.next();
            if (!au0.A02() || (bitmap = (Bitmap) au0.A01()) == null) {
                i = 0;
            } else {
                try {
                    i = bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                    i = bitmap.getByteCount();
                }
            }
            i2 += i;
        }
        this.A00 = i2;
    }
}
