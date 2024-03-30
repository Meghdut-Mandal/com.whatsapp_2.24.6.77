package androidx.compose.foundation.gestures;

import X.C019408g;
import X.C023509x;

public abstract class TapGestureDetectorKt {
    public static final C019408g A00 = new TapGestureDetectorKt$NoPressGesture$1((C023509x) null);

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0117, code lost:
        r1 = X.C107935Rl.Final;
        r7.L$0 = r9;
        r7.L$1 = r8;
        r7.label = 2;
        r2 = r9.B1d(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0124, code lost:
        if (r2 != r6) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0126, code lost:
        return r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[LOOP:0: B:12:0x003c->B:15:0x004a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0133 A[EDGE_INSN: B:58:0x0133->B:55:0x0133 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0050 A[EDGE_INSN: B:59:0x0050->B:17:0x0050 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0134 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0117 A[EDGE_INSN: B:67:0x0117->B:49:0x0117 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0133 A[EDGE_INSN: B:69:0x0133->B:55:0x0133 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C161887nd r17, X.C107935Rl r18, X.C023509x r19) {
        /*
            r3 = r19
            r9 = r17
            r8 = r18
            boolean r0 = r3 instanceof X.AnonymousClass7A1
            if (r0 == 0) goto L_0x0127
            r7 = r3
            X.7A1 r7 = (X.AnonymousClass7A1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0127
            int r2 = r2 - r1
            r7.label = r2
        L_0x0018:
            java.lang.Object r2 = r7.result
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r7.label
            r19 = 0
            r5 = 1
            if (r1 == 0) goto L_0x004d
            if (r1 == r5) goto L_0x005d
            r0 = 2
            if (r1 != r0) goto L_0x012e
            java.lang.Object r8 = r7.L$1
            X.5Rl r8 = (X.C107935Rl) r8
            java.lang.Object r9 = r7.L$0
            X.7nd r9 = (X.C161887nd) r9
            X.AnonymousClass0AN.A00(r2)
        L_0x0033:
            X.5rt r2 = (X.C120675rt) r2
            java.util.List r3 = r2.A02
            int r2 = r3.size()
            r1 = 0
        L_0x003c:
            if (r1 >= r2) goto L_0x0050
            java.lang.Object r0 = r3.get(r1)
            X.6E5 r0 = (X.AnonymousClass6E5) r0
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0133
            int r1 = r1 + 1
            goto L_0x003c
        L_0x004d:
            X.AnonymousClass0AN.A00(r2)
        L_0x0050:
            r7.L$0 = r9
            r7.L$1 = r8
            r7.label = r5
            java.lang.Object r2 = r9.B1d(r8, r7)
            if (r2 != r6) goto L_0x0068
            return r6
        L_0x005d:
            java.lang.Object r8 = r7.L$1
            X.5Rl r8 = (X.C107935Rl) r8
            java.lang.Object r9 = r7.L$0
            X.7nd r9 = (X.C161887nd) r9
            X.AnonymousClass0AN.A00(r2)
        L_0x0068:
            X.5rt r2 = (X.C120675rt) r2
            java.util.List r11 = r2.A02
            int r3 = r11.size()
            r2 = 0
        L_0x0071:
            if (r2 >= r3) goto L_0x0134
            java.lang.Object r1 = r11.get(r2)
            X.6E5 r1 = (X.AnonymousClass6E5) r1
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x008a
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x008a
            boolean r0 = r1.A0B
            if (r0 != 0) goto L_0x008a
            int r2 = r2 + 1
            goto L_0x0071
        L_0x008a:
            int r10 = r11.size()
            r4 = 0
        L_0x008f:
            if (r4 >= r10) goto L_0x0117
            java.lang.Object r14 = r11.get(r4)
            X.6E5 r14 = (X.AnonymousClass6E5) r14
            boolean r0 = r14.A00()
            if (r0 != 0) goto L_0x0133
            r0 = r9
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.4iG r12 = r0.A04
            long r2 = r12.A00
            X.6gp r0 = X.AnonymousClass6VZ.A02(r12)
            X.7k5 r0 = r0.A0A
            long r0 = r0.BEJ()
            long r17 = X.AnonymousClass6QY.A02(r12, r0)
            float r1 = X.AnonymousClass6X0.A01(r17)
            int r0 = X.C90494aF.A08(r2)
            float r13 = (float) r0
            float r1 = r1 - r13
            r15 = 0
            float r1 = java.lang.Math.max(r15, r1)
            r16 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r16
            float r0 = X.AnonymousClass6X0.A00(r17)
            int r12 = X.C90474aD.A03(r2)
            float r12 = (float) r12
            float r0 = r0 - r12
            float r0 = java.lang.Math.max(r15, r0)
            float r0 = r0 / r16
            long r15 = X.C90464aC.A0B(r1, r0)
            int r0 = r14.A04
            if (r0 != r5) goto L_0x010c
            long r0 = r14.A06
            float r14 = X.C133206Xf.A00(r0)
            float r3 = X.C133206Xf.A01(r0)
            float r0 = X.AnonymousClass6X0.A01(r15)
            float r2 = -r0
            float r0 = X.AnonymousClass6X0.A01(r15)
            float r13 = r13 + r0
            float r0 = X.AnonymousClass6X0.A00(r15)
            float r1 = -r0
            float r0 = X.AnonymousClass6X0.A00(r15)
            float r12 = r12 + r0
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0133
            int r0 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0133
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0133
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0113
            return r19
        L_0x010c:
            boolean r0 = X.AnonymousClass6G7.A00(r14, r2)
            if (r0 == 0) goto L_0x0113
            return r19
        L_0x0113:
            int r4 = r4 + 1
            goto L_0x008f
        L_0x0117:
            X.5Rl r1 = X.C107935Rl.Final
            r7.L$0 = r9
            r7.L$1 = r8
            r0 = 2
            r7.label = r0
            java.lang.Object r2 = r9.B1d(r1, r7)
            if (r2 != r6) goto L_0x0033
            return r6
        L_0x0127:
            X.7A1 r7 = new X.7A1
            r7.<init>(r3)
            goto L_0x0018
        L_0x012e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0133:
            return r19
        L_0x0134:
            java.lang.Object r0 = X.C36391kE.A0t(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(X.7nd, X.5Rl, X.09x):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067 A[SYNTHETIC] */
    public static final java.lang.Object A01(X.C161887nd r9, X.C107935Rl r10, X.C023509x r11, boolean r12) {
        /*
            boolean r0 = r11 instanceof X.AnonymousClass7AV
            if (r0 == 0) goto L_0x0061
            r8 = r11
            X.7AV r8 = (X.AnonymousClass7AV) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0061
            int r2 = r2 - r1
            r8.label = r2
        L_0x0012:
            java.lang.Object r1 = r8.result
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 != r6) goto L_0x006c
            boolean r12 = r8.Z$0
            java.lang.Object r10 = r8.L$1
            X.5Rl r10 = (X.C107935Rl) r10
            java.lang.Object r9 = r8.L$0
            X.7nd r9 = (X.C161887nd) r9
            X.AnonymousClass0AN.A00(r1)
        L_0x002a:
            X.5rt r1 = (X.C120675rt) r1
            java.util.List r5 = r1.A02
            int r4 = r5.size()
            r3 = 0
            r2 = 0
        L_0x0034:
            if (r2 >= r4) goto L_0x0067
            java.lang.Object r1 = r5.get(r2)
            X.6E5 r1 = (X.AnonymousClass6E5) r1
            if (r12 == 0) goto L_0x0044
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x0052
        L_0x0044:
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x0052
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0052
            int r2 = r2 + 1
            goto L_0x0034
        L_0x004f:
            X.AnonymousClass0AN.A00(r1)
        L_0x0052:
            r8.L$0 = r9
            r8.L$1 = r10
            r8.Z$0 = r12
            r8.label = r6
            java.lang.Object r1 = r9.B1d(r10, r8)
            if (r1 != r7) goto L_0x002a
            return r7
        L_0x0061:
            X.7AV r8 = new X.7AV
            r8.<init>(r11)
            goto L_0x0012
        L_0x0067:
            java.lang.Object r0 = r5.get(r3)
            return r0
        L_0x006c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(X.7nd, X.5Rl, X.09x, boolean):java.lang.Object");
    }
}
