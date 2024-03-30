package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.4cQ  reason: invalid class name and case insensitive filesystem */
public final class C91674cQ extends Handler {
    public final Context A00;
    public final /* synthetic */ AnonymousClass6XN A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91674cQ(Context context, Looper looper, AnonymousClass6XN r3) {
        super(looper);
        this.A01 = r3;
        C18740tg.A06(looper);
        this.A00 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        if (r0 == null) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r17) {
        /*
            r16 = this;
            r1 = r16
            X.6XN r6 = r1.A01
            r7 = r17
            android.os.Bundle r0 = r7.getData()
            java.lang.String r4 = "tag_bundle_key"
            java.lang.String r3 = X.C36431kI.A17(r0, r4)
            android.content.Context r8 = r1.A00
            java.util.concurrent.ConcurrentHashMap r5 = r6.A0c
            java.lang.Object r0 = r5.get(r3)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0045
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0045
        L_0x0022:
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r1)
            r5.put(r3, r0)
            java.lang.Object r2 = r7.obj
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0044
            r2.setTag(r1)
            X.4cM r1 = r6.A0J
            r0 = 0
            android.os.Message r1 = android.os.Message.obtain(r1, r0, r0, r0, r2)
            android.os.Bundle r0 = X.C36431kI.A0I(r4, r3)
            r1.setData(r0)
            r1.sendToTarget()
        L_0x0044:
            return
        L_0x0045:
            java.util.concurrent.ConcurrentHashMap r9 = r6.A0d
            java.lang.Object r0 = r9.get(r3)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r10 = r0.get()
            X.6Ft r10 = (X.C129196Ft) r10
            if (r10 == 0) goto L_0x00b4
        L_0x0057:
            java.lang.String r2 = r10.A0B(r8)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168302(0x7f070c2e, float:1.7950902E38)
            int r1 = r1.getDimensionPixelSize(r0)
            boolean r0 = r10.A0N()
            if (r0 == 0) goto L_0x0071
            int r0 = r6.A01
            r10.A0G(r0)
        L_0x0071:
            boolean r0 = r10.A0O()
            if (r0 == 0) goto L_0x007c
            float r0 = r6.A00
            r10.A0F(r0)
        L_0x007c:
            boolean r0 = r10 instanceof X.AnonymousClass5CZ
            if (r0 == 0) goto L_0x00aa
            r0 = r10
            X.5CZ r0 = (X.AnonymousClass5CZ) r0
            android.graphics.drawable.Drawable r0 = r0.A00
        L_0x0085:
            if (r0 != 0) goto L_0x00a3
        L_0x0087:
            android.graphics.RectF r11 = X.C36441kJ.A0N()
            r12 = 0
            float r14 = (float) r1
            r13 = 0
            r15 = r14
            r10.A0J(r11, r12, r13, r14, r15)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r1, r0)
            android.graphics.Canvas r0 = X.C90524aI.A0A(r1)
            r10.A0I(r0)
            android.graphics.drawable.BitmapDrawable r0 = X.C36421kH.A0C(r8, r1)
        L_0x00a3:
            X.5qV r1 = new X.5qV
            r1.<init>(r0, r2)
            goto L_0x0022
        L_0x00aa:
            boolean r0 = r10 instanceof X.AnonymousClass5CX
            if (r0 == 0) goto L_0x0087
            r0 = r10
            X.5CX r0 = (X.AnonymousClass5CX) r0
            android.graphics.drawable.Drawable r0 = r0.A00
            goto L_0x0085
        L_0x00b4:
            java.util.concurrent.ConcurrentHashMap r0 = r6.A0e
            java.lang.Object r2 = r0.get(r3)
            X.7mX r2 = (X.C161307mX) r2
            if (r2 == 0) goto L_0x0044
            X.0ts r1 = r6.A0B
            r0 = 1
            X.6Ft r10 = r2.B4v(r8, r1, r0)
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r10)
            r9.put(r3, r0)
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91674cQ.handleMessage(android.os.Message):void");
    }
}
