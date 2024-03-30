package X;

import android.content.Context;

/* renamed from: X.6GU  reason: invalid class name */
public abstract class AnonymousClass6GU {
    public static boolean A01(Context context, C1271967i r1) {
        if (r1 != null) {
            return r1.A03;
        }
        return AnonymousClass000.A1S(AnonymousClass000.A0U(context).uiMode & 48, 32);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r3 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(android.content.Context r5, X.C108465Tp r6, X.C1271967i r7) {
        /*
            java.util.Objects.requireNonNull(r6)
            boolean r1 = A01(r5, r7)
            r0 = 2132083050(0x7f15016a, float:1.9806231E38)
            if (r1 == 0) goto L_0x000f
            r0 = 2132083049(0x7f150169, float:1.980623E38)
        L_0x000f:
            android.view.ContextThemeWrapper r4 = new android.view.ContextThemeWrapper
            r4.<init>(r5, r0)
            r0 = 1
            r3 = 0
            int[] r2 = new int[r0]     // Catch:{ NotFoundException -> 0x0028 }
            int r0 = r6.attr     // Catch:{ NotFoundException -> 0x0028 }
            r1 = 0
            r2[r1] = r0     // Catch:{ NotFoundException -> 0x0028 }
            android.content.res.TypedArray r3 = r4.obtainStyledAttributes(r2)     // Catch:{ NotFoundException -> 0x0028 }
            int r0 = r6.lightModeFallBackColorInt     // Catch:{ NotFoundException -> 0x0028 }
            int r0 = r3.getColor(r1, r0)     // Catch:{ NotFoundException -> 0x0028 }
            goto L_0x0033
        L_0x0028:
            r1 = move-exception
            boolean r0 = X.C108825Vb.isDebugBuild()     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0037
            int r0 = r6.lightModeFallBackColorInt     // Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x0036
        L_0x0033:
            r3.recycle()
        L_0x0036:
            return r0
        L_0x0037:
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            if (r3 == 0) goto L_0x003e
            r3.recycle()
        L_0x003e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6GU.A00(android.content.Context, X.5Tp, X.67i):int");
    }
}
