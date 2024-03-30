package X;

import android.util.LruCache;

/* renamed from: X.1Ko  reason: invalid class name and case insensitive filesystem */
public final class C26541Ko extends LruCache {
    public C26541Ko() {
        super(5242880);
    }

    public /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj2;
        AnonymousClass00C.A0D(bArr, 1);
        return bArr.length;
    }
}
