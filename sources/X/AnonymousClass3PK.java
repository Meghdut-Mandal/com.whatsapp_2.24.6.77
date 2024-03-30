package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.3PK  reason: invalid class name */
public final class AnonymousClass3PK {
    public static final WeakHashMap A01 = new WeakHashMap();
    public final WeakReference A00;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r1 = r4.A00.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == r4) goto L_0x001f
            r2 = 0
            if (r5 == 0) goto L_0x0020
            boolean r0 = X.C36381kD.A1Y(r5, r4)
            if (r0 == 0) goto L_0x0020
            java.lang.ref.WeakReference r0 = r4.A00
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0020
            X.3PK r5 = (X.AnonymousClass3PK) r5
            java.lang.ref.WeakReference r0 = r5.A00
            java.lang.Object r0 = r0.get()
            if (r1 == r0) goto L_0x001f
            r3 = 0
        L_0x001f:
            return r3
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3PK.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return AnonymousClass000.A0J(this.A00.get());
    }

    public AnonymousClass3PK(View view) {
        this.A00 = AnonymousClass001.A0F(view);
    }
}
