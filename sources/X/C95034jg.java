package X;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;

/* renamed from: X.4jg  reason: invalid class name and case insensitive filesystem */
public final class C95034jg extends C114385hA implements C161627nD {
    public final AndroidEdgeEffectOverscrollEffect A00;

    public /* synthetic */ C161267mT Bva(C161267mT r2) {
        return AnonymousClass5WL.A00(this, r2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C95034jg)) {
            return false;
        }
        return AnonymousClass00C.A0J(this.A00, ((C95034jg) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C95034jg(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C006302t r2) {
        super(r2);
        this.A00 = androidEdgeEffectOverscrollEffect;
    }

    public /* synthetic */ boolean B0v(C006302t r2) {
        return C90464aC.A1Y(this, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        if (r0 != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ad, code lost:
        if (r0 != false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B5y(X.C161667nH r10) {
        /*
            r9 = this;
            r10.B63()
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r4 = r9.A00
            long r0 = r4.A01
            boolean r0 = X.AnonymousClass6X0.A03(r0)
            if (r0 != 0) goto L_0x00fb
            X.7bT r0 = r10.BBD()
            X.7m3 r1 = X.C128306Bs.A00(r0)
            X.7n1 r0 = r4.A0E
            int r0 = r0.BCn()
            r4.A00 = r0
            android.graphics.Canvas r0 = X.C112335dj.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas"
            X.AnonymousClass00C.A0E(r1, r0)
            X.6g3 r1 = (X.C137386g3) r1
            android.graphics.Canvas r5 = r1.A00
            android.widget.EdgeEffect r2 = r4.A08
            float r0 = X.C129216Fw.A00(r2)
            r8 = 1
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x003a
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A0B(r5, r2, r4, r10)
            r2.finish()
        L_0x003a:
            android.widget.EdgeEffect r1 = r4.A07
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x00fc
            boolean r7 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A0A(r5, r1, r4, r10)
            float r0 = X.C129216Fw.A00(r1)
            X.C129216Fw.A01(r2, r0, r3)
        L_0x004d:
            android.widget.EdgeEffect r6 = r4.A0C
            float r0 = X.C129216Fw.A00(r6)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x005d
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A09(r5, r6, r4, r10)
            r6.finish()
        L_0x005d:
            android.widget.EdgeEffect r2 = r4.A0B
            boolean r0 = r2.isFinished()
            if (r0 != 0) goto L_0x008d
            int r1 = r5.save()
            X.69B r0 = r4.A0D
            X.7b9 r0 = r0.A01
            X.6ew r0 = (X.C136756ew) r0
            float r0 = r0.A03
            float r0 = r10.Bvq(r0)
            r5.translate(r3, r0)
            boolean r0 = r2.draw(r5)
            r5.restoreToCount(r1)
            if (r0 != 0) goto L_0x0085
            r0 = r7
            r7 = 0
            if (r0 == 0) goto L_0x0086
        L_0x0085:
            r7 = 1
        L_0x0086:
            float r0 = X.C129216Fw.A00(r2)
            X.C129216Fw.A01(r6, r0, r3)
        L_0x008d:
            android.widget.EdgeEffect r2 = r4.A0A
            float r0 = X.C129216Fw.A00(r2)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A0A(r5, r2, r4, r10)
            r2.finish()
        L_0x009d:
            android.widget.EdgeEffect r1 = r4.A09
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x00b7
            boolean r0 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A0B(r5, r1, r4, r10)
            if (r0 != 0) goto L_0x00af
            r0 = r7
            r7 = 0
            if (r0 == 0) goto L_0x00b0
        L_0x00af:
            r7 = 1
        L_0x00b0:
            float r0 = X.C129216Fw.A00(r1)
            X.C129216Fw.A01(r2, r0, r3)
        L_0x00b7:
            android.widget.EdgeEffect r2 = r4.A06
            float r0 = X.C129216Fw.A00(r2)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00dd
            int r1 = r5.save()
            X.69B r0 = r4.A0D
            X.7b9 r0 = r0.A01
            X.6ew r0 = (X.C136756ew) r0
            float r0 = r0.A03
            float r0 = r10.Bvq(r0)
            r5.translate(r3, r0)
            r2.draw(r5)
            r5.restoreToCount(r1)
            r2.finish()
        L_0x00dd:
            android.widget.EdgeEffect r1 = r4.A05
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x00f6
            boolean r0 = androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A09(r5, r1, r4, r10)
            if (r0 != 0) goto L_0x00ee
            if (r7 != 0) goto L_0x00ee
            r8 = 0
        L_0x00ee:
            float r0 = X.C129216Fw.A00(r1)
            X.C129216Fw.A01(r2, r0, r3)
            r7 = r8
        L_0x00f6:
            if (r7 == 0) goto L_0x00fb
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A08(r4)
        L_0x00fb:
            return
        L_0x00fc:
            r7 = 0
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95034jg.B5y(X.7nH):void");
    }

    public /* synthetic */ Object B7V(Object obj, C009003v r3) {
        return r3.invoke(obj, this);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DrawOverscrollModifier(overscrollEffect=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
