package X;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1H9  reason: invalid class name */
public class AnonymousClass1H9 implements AnonymousClass1H8 {
    public final Map A00 = new HashMap();

    public Bitmap B87(C1275268q r5, boolean z) {
        Bitmap bitmap;
        Map map = this.A00;
        synchronized (map) {
            SoftReference softReference = (SoftReference) map.get(new AnonymousClass6AA(r5, z));
            if (softReference == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) softReference.get();
                if (bitmap == null) {
                    AnonymousClass6XG.A01(C67653aG.A00, map.entrySet());
                }
            }
        }
        return bitmap;
    }

    public void Bma(Bitmap bitmap, C1275268q r5, boolean z) {
        Map map = this.A00;
        synchronized (map) {
            map.put(new AnonymousClass6AA(r5, z), new SoftReference(bitmap));
        }
    }
}
