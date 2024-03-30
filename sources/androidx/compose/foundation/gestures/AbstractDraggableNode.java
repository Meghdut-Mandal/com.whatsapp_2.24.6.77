package androidx.compose.foundation.gestures;

import X.AnonymousClass00S;
import X.C006302t;
import X.C019408g;
import X.C023109s;
import X.C023509x;
import X.C05750Qx;
import X.C107935Rl;
import X.C112395dp;
import X.C120675rt;
import X.C128316Bt;
import X.C136626ej;
import X.C136656em;
import X.C136726et;
import X.C151827Id;
import X.C153947Qh;
import X.C161437mu;
import X.C161847nZ;
import X.C161867nb;
import X.C17500rW;
import X.C18010sR;
import X.C94114hf;
import X.C94464iG;

public abstract class AbstractDraggableNode extends C94114hf implements C161847nZ, C17500rW {
    public C161437mu A00;
    public AnonymousClass00S A01;
    public C006302t A02;
    public C019408g A03;
    public C019408g A04;
    public boolean A05;
    public boolean A06;
    public C136626ej A07;
    public final C161867nb A08;
    public final C128316Bt A09 = new C128316Bt();
    public final AnonymousClass00S A0A = new C151827Id(this);
    public final C006302t A0B = new C153947Qh(this);
    public final C18010sR A0C;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(androidx.compose.foundation.gestures.AbstractDraggableNode r8, X.C93394gU r9, X.C023509x r10, X.AnonymousClass040 r11) {
        /*
            boolean r0 = r10 instanceof X.C151737As
            if (r0 == 0) goto L_0x00ad
            r6 = r10
            X.7As r6 = (X.C151737As) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ad
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r3) goto L_0x0050
            if (r0 == r4) goto L_0x007f
            if (r0 != r7) goto L_0x00b4
            X.AnonymousClass0AN.A00(r1)
        L_0x0026:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0029:
            X.AnonymousClass0AN.A00(r1)
            X.6ej r2 = r8.A07
            if (r2 == 0) goto L_0x005d
            X.7mu r0 = r8.A00
            if (r0 == 0) goto L_0x005d
            X.6em r1 = new X.6em
            r1.<init>(r2)
            r6.L$0 = r8
            r6.L$1 = r11
            r6.L$2 = r9
            r6.label = r3
            X.6et r0 = (X.C136726et) r0
            X.05J r0 = r0.A00
            java.lang.Object r0 = r0.B6N(r1, r6)
            java.lang.Object r0 = X.AnonymousClass0AO.A00(r0)
            if (r0 != r5) goto L_0x005d
            return r5
        L_0x0050:
            java.lang.Object r9 = r6.L$2
            X.4gU r9 = (X.C93394gU) r9
            java.lang.Object r11 = r6.L$1
            java.lang.Object r8 = r6.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r8 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r8
            X.AnonymousClass0AN.A00(r1)
        L_0x005d:
            X.6ej r0 = new X.6ej
            r0.<init>()
            X.7mu r1 = r8.A00
            if (r1 == 0) goto L_0x0090
            r6.L$0 = r8
            r6.L$1 = r11
            r6.L$2 = r9
            r6.L$3 = r0
            r6.label = r4
            X.6et r1 = (X.C136726et) r1
            X.05J r1 = r1.A00
            java.lang.Object r1 = r1.B6N(r0, r6)
            java.lang.Object r1 = X.AnonymousClass0AO.A00(r1)
            if (r1 != r5) goto L_0x0090
            return r5
        L_0x007f:
            java.lang.Object r0 = r6.L$3
            X.6ej r0 = (X.C136626ej) r0
            java.lang.Object r9 = r6.L$2
            X.4gU r9 = (X.C93394gU) r9
            java.lang.Object r11 = r6.L$1
            java.lang.Object r8 = r6.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r8 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r8
            X.AnonymousClass0AN.A00(r1)
        L_0x0090:
            r8.A07 = r0
            X.08g r4 = r8.A03
            long r2 = r9.A00
            X.6Xf r1 = new X.6Xf
            r1.<init>(r2)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r0
            r6.L$3 = r0
            r6.label = r7
            java.lang.Object r0 = r4.BKt(r11, r1, r6)
            if (r0 != r5) goto L_0x0026
            return r5
        L_0x00ad:
            X.7As r6 = new X.7As
            r6.<init>(r8, r10)
            goto L_0x0012
        L_0x00b4:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.A00(androidx.compose.foundation.gestures.AbstractDraggableNode, X.4gU, X.09x, X.040):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(androidx.compose.foundation.gestures.AbstractDraggableNode r8, X.C93404gV r9, X.C023509x r10, X.AnonymousClass040 r11) {
        /*
            boolean r0 = r10 instanceof X.C151617Ag
            if (r0 == 0) goto L_0x0075
            r6 = r10
            X.7Ag r6 = (X.C151617Ag) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0075
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0027
            if (r0 == r3) goto L_0x004e
            if (r0 != r7) goto L_0x007b
            X.AnonymousClass0AN.A00(r1)
        L_0x0024:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0027:
            X.AnonymousClass0AN.A00(r1)
            X.6ej r2 = r8.A07
            if (r2 == 0) goto L_0x005d
            X.7mu r0 = r8.A00
            if (r0 == 0) goto L_0x005b
            X.6en r1 = new X.6en
            r1.<init>(r2)
            r6.L$0 = r8
            r6.L$1 = r11
            r6.L$2 = r9
            r6.label = r3
            X.6et r0 = (X.C136726et) r0
            X.05J r0 = r0.A00
            java.lang.Object r0 = r0.B6N(r1, r6)
            java.lang.Object r0 = X.AnonymousClass0AO.A00(r0)
            if (r0 != r5) goto L_0x005b
            return r5
        L_0x004e:
            java.lang.Object r9 = r6.L$2
            X.4gV r9 = (X.C93404gV) r9
            java.lang.Object r11 = r6.L$1
            java.lang.Object r8 = r6.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r8 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r8
            X.AnonymousClass0AN.A00(r1)
        L_0x005b:
            r8.A07 = r4
        L_0x005d:
            X.08g r3 = r8.A04
            long r1 = r9.A00
            X.6Wz r0 = new X.6Wz
            r0.<init>(r1)
            r6.L$0 = r4
            r6.L$1 = r4
            r6.L$2 = r4
            r6.label = r7
            java.lang.Object r0 = r3.BKt(r11, r0, r6)
            if (r0 != r5) goto L_0x0024
            return r5
        L_0x0075:
            X.7Ag r6 = new X.7Ag
            r6.<init>(r8, r10)
            goto L_0x0012
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.A01(androidx.compose.foundation.gestures.AbstractDraggableNode, X.4gV, X.09x, X.040):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(androidx.compose.foundation.gestures.AbstractDraggableNode r8, X.C023509x r9, X.AnonymousClass040 r10) {
        /*
            boolean r0 = r9 instanceof X.AnonymousClass7AT
            if (r0 == 0) goto L_0x006d
            r6 = r9
            X.7AT r6 = (X.AnonymousClass7AT) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006d
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r1 = r6.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0027
            if (r0 == r3) goto L_0x004c
            if (r0 != r7) goto L_0x0073
            X.AnonymousClass0AN.A00(r1)
        L_0x0024:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0027:
            X.AnonymousClass0AN.A00(r1)
            X.6ej r2 = r8.A07
            if (r2 == 0) goto L_0x0057
            X.7mu r0 = r8.A00
            if (r0 == 0) goto L_0x0055
            X.6em r1 = new X.6em
            r1.<init>(r2)
            r6.L$0 = r8
            r6.L$1 = r10
            r6.label = r3
            X.6et r0 = (X.C136726et) r0
            X.05J r0 = r0.A00
            java.lang.Object r0 = r0.B6N(r1, r6)
            java.lang.Object r0 = X.AnonymousClass0AO.A00(r0)
            if (r0 != r5) goto L_0x0055
            return r5
        L_0x004c:
            java.lang.Object r10 = r6.L$1
            java.lang.Object r8 = r6.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r8 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r8
            X.AnonymousClass0AN.A00(r1)
        L_0x0055:
            r8.A07 = r4
        L_0x0057:
            X.08g r3 = r8.A04
            long r1 = X.C133156Wz.A01
            X.6Wz r0 = new X.6Wz
            r0.<init>(r1)
            r6.L$0 = r4
            r6.L$1 = r4
            r6.label = r7
            java.lang.Object r0 = r3.BKt(r10, r0, r6)
            if (r0 != r5) goto L_0x0024
            return r5
        L_0x006d:
            X.7AT r6 = new X.7AT
            r6.<init>(r8, r9)
            goto L_0x0012
        L_0x0073:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.A02(androidx.compose.foundation.gestures.AbstractDraggableNode, X.09x, X.040):java.lang.Object");
    }

    public final void A0G() {
        C136626ej r2 = this.A07;
        if (r2 != null) {
            C161437mu r0 = this.A00;
            if (r0 != null) {
                ((C136726et) r0).A00.BwB(new C136656em(r2));
            }
            this.A07 = null;
        }
    }

    /* renamed from: BT3 */
    public void BkO() {
        this.A08.BT3();
    }

    public void Bcv(C120675rt r2, C107935Rl r3, long j) {
        this.A08.Bcv(r2, r3, j);
    }

    public AbstractDraggableNode(C161437mu r3, AnonymousClass00S r4, C006302t r5, C019408g r6, C019408g r7, boolean z) {
        this.A02 = r5;
        this.A05 = z;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r6;
        this.A04 = r7;
        AbstractDraggableNode$pointerInputNode$1 abstractDraggableNode$pointerInputNode$1 = new AbstractDraggableNode$pointerInputNode$1(this, (C023509x) null);
        C120675rt r0 = C112395dp.A00;
        C94464iG r02 = new C94464iG(abstractDraggableNode$pointerInputNode$1);
        A0F(r02);
        this.A08 = r02;
        this.A0C = C05750Qx.A00(C023109s.A00, Integer.MAX_VALUE);
    }

    public /* synthetic */ boolean BKp() {
        return false;
    }

    public /* synthetic */ boolean Bst() {
        return false;
    }
}
