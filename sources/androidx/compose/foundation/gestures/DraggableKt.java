package androidx.compose.foundation.gestures;

import X.C136546ea;
import X.C157487dc;

public abstract class DraggableKt {
    public static final C157487dc A00 = new C136546ea();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        if (r12.A00() == false) goto L_0x0196;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0165 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C158747iA r13, X.C161887nd r14, X.C128316Bt r15, X.C023509x r16, X.AnonymousClass00S r17, X.C006302t r18) {
        /*
            r4 = r16
            r6 = r18
            r5 = r17
            r1 = r15
            r11 = r13
            r10 = r14
            boolean r0 = r4 instanceof X.AnonymousClass7B9
            if (r0 == 0) goto L_0x022b
            r9 = r4
            X.7B9 r9 = (X.AnonymousClass7B9) r9
            int r3 = r9.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x022b
            int r3 = r3 - r2
            r9.label = r3
        L_0x001b:
            java.lang.Object r14 = r9.result
            X.0AO r8 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r4 = r9.label
            r0 = 4
            r15 = 3
            r3 = 2
            r13 = 0
            r2 = 1
            r12 = 0
            if (r4 == 0) goto L_0x0058
            if (r4 == r2) goto L_0x0070
            if (r4 == r3) goto L_0x00c3
            if (r4 == r15) goto L_0x012c
            if (r4 != r0) goto L_0x0232
            long r4 = r9.J$0
            float r7 = r9.F$0
            java.lang.Object r12 = r9.L$5
            X.6E5 r12 = (X.AnonymousClass6E5) r12
            java.lang.Object r6 = r9.L$4
            X.0fF r6 = (X.C10800fF) r6
            java.lang.Object r10 = r9.L$3
            X.7nd r10 = (X.C161887nd) r10
            java.lang.Object r3 = r9.L$2
            X.03v r3 = (X.C009003v) r3
            java.lang.Object r2 = r9.L$1
            X.0fF r2 = (X.C10800fF) r2
            java.lang.Object r11 = r9.L$0
            X.7iA r11 = (X.C158747iA) r11
            X.AnonymousClass0AN.A00(r14)
        L_0x0050:
            boolean r0 = r12.A00()
            if (r0 == 0) goto L_0x0196
        L_0x0056:
            r12 = 0
        L_0x0057:
            return r12
        L_0x0058:
            X.AnonymousClass0AN.A00(r14)
            X.5Rl r0 = X.C107935Rl.Initial
            r9.L$0 = r10
            r9.L$1 = r6
            r9.L$2 = r5
            r9.L$3 = r1
            r9.L$4 = r11
            r9.label = r2
            java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r10, r0, r9, r13)
            if (r14 != r8) goto L_0x0087
            return r8
        L_0x0070:
            java.lang.Object r11 = r9.L$4
            X.7iA r11 = (X.C158747iA) r11
            java.lang.Object r1 = r9.L$3
            X.6Bt r1 = (X.C128316Bt) r1
            java.lang.Object r5 = r9.L$2
            X.00S r5 = (X.AnonymousClass00S) r5
            java.lang.Object r6 = r9.L$1
            X.02t r6 = (X.C006302t) r6
            java.lang.Object r10 = r9.L$0
            X.7nd r10 = (X.C161887nd) r10
            X.AnonymousClass0AN.A00(r14)
        L_0x0087:
            X.6E5 r14 = (X.AnonymousClass6E5) r14
            boolean r0 = X.C90464aC.A1Y(r14, r6)
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r5.invoke()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x00ae
            X.6Jc r0 = r14.A01
            r0.A00 = r2
            r0.A01 = r2
            X.C129566Ho.A00(r14, r1)
            long r1 = X.C133206Xf.A03
            X.6Xf r0 = new X.6Xf
            r0.<init>(r1)
            X.011 r12 = X.C36441kJ.A19(r14, r0)
            return r12
        L_0x00ae:
            r9.L$0 = r10
            r9.L$1 = r1
            r9.L$2 = r11
            r9.L$3 = r12
            r9.L$4 = r12
            r9.label = r3
            X.5Rl r0 = X.C107935Rl.Main
            java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r10, r0, r9, r13)
            if (r14 != r8) goto L_0x00d2
            return r8
        L_0x00c3:
            java.lang.Object r11 = r9.L$2
            X.7iA r11 = (X.C158747iA) r11
            java.lang.Object r1 = r9.L$1
            X.6Bt r1 = (X.C128316Bt) r1
            java.lang.Object r10 = r9.L$0
            X.7nd r10 = (X.C161887nd) r10
            X.AnonymousClass0AN.A00(r14)
        L_0x00d2:
            X.6E5 r14 = (X.AnonymousClass6E5) r14
            X.C129566Ho.A00(r14, r1)
            X.0fF r2 = new X.0fF
            r2.<init>()
            long r4 = X.C133206Xf.A03
            r2.element = r4
            X.7YA r3 = new X.7YA
            r3.<init>(r1, r2)
            long r0 = r14.A05
            int r14 = r14.A04
            r6 = r10
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r6 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r6
            X.4iG r7 = r6.A04
            X.5rt r6 = r7.A01
            boolean r6 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A00(r6, r0)
            if (r6 != 0) goto L_0x0056
            X.6gp r6 = X.AnonymousClass6VZ.A02(r7)
            X.7k5 r7 = r6.A0A
            r6 = 2
            boolean r6 = X.AnonymousClass000.A1S(r14, r6)
            float r7 = r7.BIT()
            if (r6 == 0) goto L_0x010a
            float r6 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A00
            float r7 = r7 * r6
        L_0x010a:
            X.0fF r6 = new X.0fF
            r6.<init>()
            r6.element = r0
        L_0x0111:
            r9.L$0 = r11
            r9.L$1 = r2
            r9.L$2 = r3
            r9.L$3 = r10
            r9.L$4 = r6
            r9.L$5 = r12
            r9.F$0 = r7
            r9.J$0 = r4
            r9.label = r15
            X.5Rl r0 = X.C107935Rl.Main
            java.lang.Object r14 = r10.B1d(r0, r9)
            if (r14 != r8) goto L_0x0147
            return r8
        L_0x012c:
            long r4 = r9.J$0
            float r7 = r9.F$0
            java.lang.Object r6 = r9.L$4
            X.0fF r6 = (X.C10800fF) r6
            java.lang.Object r10 = r9.L$3
            X.7nd r10 = (X.C161887nd) r10
            java.lang.Object r3 = r9.L$2
            X.03v r3 = (X.C009003v) r3
            java.lang.Object r2 = r9.L$1
            X.0fF r2 = (X.C10800fF) r2
            java.lang.Object r11 = r9.L$0
            X.7iA r11 = (X.C158747iA) r11
            X.AnonymousClass0AN.A00(r14)
        L_0x0147:
            X.5rt r14 = (X.C120675rt) r14
            java.util.List r14 = r14.A02
            int r18 = r14.size()
        L_0x014f:
            r0 = r18
            if (r13 >= r0) goto L_0x0165
            java.lang.Object r12 = r14.get(r13)
            r0 = r12
            X.6E5 r0 = (X.AnonymousClass6E5) r0
            long r15 = r0.A05
            long r0 = r6.element
            int r17 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r17 == 0) goto L_0x0166
            int r13 = r13 + 1
            goto L_0x014f
        L_0x0165:
            r12 = 0
        L_0x0166:
            X.6E5 r12 = (X.AnonymousClass6E5) r12
            if (r12 == 0) goto L_0x0056
            boolean r0 = r12.A00()
            if (r0 != 0) goto L_0x0056
            boolean r0 = r12.A0C
            if (r0 == 0) goto L_0x019b
            boolean r0 = r12.A0B
            if (r0 != 0) goto L_0x019b
            int r13 = r14.size()
            r12 = 0
        L_0x017d:
            if (r12 >= r13) goto L_0x018d
            java.lang.Object r1 = r14.get(r12)
            r0 = r1
            X.6E5 r0 = (X.AnonymousClass6E5) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x018e
            int r12 = r12 + 1
            goto L_0x017d
        L_0x018d:
            r1 = 0
        L_0x018e:
            X.6E5 r1 = (X.AnonymousClass6E5) r1
            if (r1 == 0) goto L_0x0056
            long r0 = r1.A05
            r6.element = r0
        L_0x0196:
            r15 = 3
            r13 = 0
            r12 = 0
            goto L_0x0111
        L_0x019b:
            long r13 = r12.A06
            long r0 = r12.A07
            long r0 = X.C133206Xf.A02(r13, r0)
            long r4 = X.C133206Xf.A03(r4, r0)
            r0 = r11
            X.7r1 r0 = (X.C163947r1) r0
            int r1 = r0.A00
            if (r1 == 0) goto L_0x01d6
            float r0 = X.C133206Xf.A01(r4)
        L_0x01b2:
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x01db
            X.5Rl r1 = X.C107935Rl.Final
            r9.L$0 = r11
            r9.L$1 = r2
            r9.L$2 = r3
            r9.L$3 = r10
            r9.L$4 = r6
            r9.L$5 = r12
            r9.F$0 = r7
            r9.J$0 = r4
            r0 = 4
            r9.label = r0
            java.lang.Object r0 = r10.B1d(r1, r9)
            if (r0 != r8) goto L_0x0050
            return r8
        L_0x01d6:
            float r0 = X.C133206Xf.A00(r4)
            goto L_0x01b2
        L_0x01db:
            if (r1 == 0) goto L_0x020d
            float r1 = X.C133206Xf.A01(r4)
            float r0 = X.C133206Xf.A01(r4)
            float r0 = java.lang.Math.signum(r0)
            float r0 = r0 * r7
            float r1 = r1 - r0
            float r0 = X.C133206Xf.A00(r4)
            long r0 = X.C90464aC.A0B(r0, r1)
        L_0x01f3:
            X.6Xf r4 = new X.6Xf
            r4.<init>(r0)
            r3.invoke(r12, r4)
            boolean r0 = r12.A00()
            if (r0 == 0) goto L_0x0224
            long r1 = r2.element
            X.6Xf r0 = new X.6Xf
            r0.<init>(r1)
            X.011 r12 = X.C36441kJ.A19(r12, r0)
            return r12
        L_0x020d:
            float r1 = X.C133206Xf.A00(r4)
            float r0 = X.C133206Xf.A00(r4)
            float r0 = java.lang.Math.signum(r0)
            float r0 = r0 * r7
            float r1 = r1 - r0
            float r0 = X.C133206Xf.A01(r4)
            long r0 = X.C90464aC.A0B(r1, r0)
            goto L_0x01f3
        L_0x0224:
            long r4 = X.C133206Xf.A03
            r15 = 3
            r12 = 0
            r13 = 0
            goto L_0x0111
        L_0x022b:
            X.7B9 r9 = new X.7B9
            r9.<init>(r4)
            goto L_0x001b
        L_0x0232:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.A00(X.7iA, X.7nd, X.6Bt, X.09x, X.00S, X.02t):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008a, code lost:
        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.A00(((androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r15).A04.A01, r1) != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        if (X.C90464aC.A1Y(r10, r7) != false) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0059 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C161887nd r15, X.C023509x r16, X.C006302t r17, X.C006302t r18, long r19) {
        /*
            r7 = r17
            r1 = r19
            r6 = r18
            r8 = r16
            boolean r0 = r8 instanceof X.C151747At
            if (r0 == 0) goto L_0x00d4
            r5 = r8
            X.7At r5 = (X.C151747At) r5
            int r4 = r5.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L_0x00d4
            int r4 = r4 - r3
            r5.label = r4
        L_0x001a:
            java.lang.Object r10 = r5.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x007c
            if (r0 != r3) goto L_0x00db
            java.lang.Object r8 = r5.L$4
            X.0fF r8 = (X.C10800fF) r8
            java.lang.Object r9 = r5.L$3
            X.7nd r9 = (X.C161887nd) r9
            java.lang.Object r15 = r5.L$2
            X.7nd r15 = (X.C161887nd) r15
            java.lang.Object r6 = r5.L$1
            X.02t r6 = (X.C006302t) r6
            java.lang.Object r7 = r5.L$0
            X.02t r7 = (X.C006302t) r7
            X.AnonymousClass0AN.A00(r10)
        L_0x003c:
            X.5rt r10 = (X.C120675rt) r10
            java.util.List r11 = r10.A02
            int r14 = r11.size()
            r13 = 0
        L_0x0045:
            if (r13 >= r14) goto L_0x0059
            java.lang.Object r10 = r11.get(r13)
            r0 = r10
            X.6E5 r0 = (X.AnonymousClass6E5) r0
            long r2 = r0.A05
            long r0 = r8.element
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 == 0) goto L_0x005a
            int r13 = r13 + 1
            goto L_0x0045
        L_0x0059:
            r10 = 0
        L_0x005a:
            X.6E5 r10 = (X.AnonymousClass6E5) r10
            if (r10 == 0) goto L_0x008c
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r10.A0B
            r12 = 1
            if (r0 != 0) goto L_0x00c0
            int r3 = r11.size()
            r2 = 0
        L_0x006c:
            if (r2 >= r3) goto L_0x00a1
            java.lang.Object r1 = r11.get(r2)
            r0 = r1
            X.6E5 r0 = (X.AnonymousClass6E5) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00a2
            int r2 = r2 + 1
            goto L_0x006c
        L_0x007c:
            X.AnonymousClass0AN.A00(r10)
            r0 = r15
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.4iG r0 = r0.A04
            X.5rt r0 = r0.A01
            boolean r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A00(r0, r1)
            if (r0 == 0) goto L_0x0098
        L_0x008c:
            r0 = 0
        L_0x008d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0092:
            r6.invoke(r10)
            long r1 = r10.A05
            r3 = 1
        L_0x0098:
            X.0fF r8 = new X.0fF
            r8.<init>()
            r8.element = r1
            r9 = r15
            goto L_0x00ab
        L_0x00a1:
            r1 = 0
        L_0x00a2:
            X.6E5 r1 = (X.AnonymousClass6E5) r1
            if (r1 == 0) goto L_0x00c7
            long r0 = r1.A05
            r8.element = r0
        L_0x00aa:
            r3 = 1
        L_0x00ab:
            r5.L$0 = r7
            r5.L$1 = r6
            r5.L$2 = r15
            r5.L$3 = r9
            r5.L$4 = r8
            r5.label = r3
            X.5Rl r0 = X.C107935Rl.Main
            java.lang.Object r10 = r9.B1d(r0, r5)
            if (r10 != r4) goto L_0x003c
            return r4
        L_0x00c0:
            r12 = 0
            boolean r0 = X.C90464aC.A1Y(r10, r7)
            if (r0 == 0) goto L_0x00aa
        L_0x00c7:
            boolean r0 = r10.A00()
            if (r0 != 0) goto L_0x008c
            if (r12 == 0) goto L_0x0092
            r6.invoke(r10)
            r0 = 1
            goto L_0x008d
        L_0x00d4:
            X.7At r5 = new X.7At
            r5.<init>(r8)
            goto L_0x001a
        L_0x00db:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.A01(X.7nd, X.09x, X.02t, X.02t, long):java.lang.Object");
    }
}
