package androidx.compose.runtime;

import X.AnonymousClass00S;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {144, 148, 170}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass00S $block;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(C023509x r2, AnonymousClass00S r3) {
        super(2, r2);
        this.$block = r3;
    }

    public final C023509x create(Object obj, C023509x r4) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(r4, this.$block);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0104, code lost:
        if (r2 != 8) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010e, code lost:
        if (r22 == false) goto L_0x0111;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5 A[Catch:{ all -> 0x0169 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be A[Catch:{ all -> 0x0169 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0119 A[Catch:{ all -> 0x0169 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0120 A[Catch:{ all -> 0x0169 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r13 = r25
            X.0AO r9 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r8 = r24
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L_0x0049
            if (r1 == r2) goto L_0x0032
            r0 = 2
            if (r1 == r0) goto L_0x0018
            r0 = 3
            if (r1 == r0) goto L_0x0032
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0018:
            int r1 = r8.I$0
            java.lang.Object r10 = r8.L$5
            java.lang.Object r6 = r8.L$4
            X.7dp r6 = (X.C157617dp) r6
            java.lang.Object r7 = r8.L$3
            X.0r7 r7 = (X.C17330r7) r7
            java.lang.Object r5 = r8.L$2
            X.02t r5 = (X.C006302t) r5
            java.lang.Object r4 = r8.L$1
            X.0GB r4 = (X.AnonymousClass0GB) r4
            java.lang.Object r3 = r8.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            goto L_0x00b7
        L_0x0032:
            java.lang.Object r10 = r8.L$5
            java.lang.Object r6 = r8.L$4
            X.7dp r6 = (X.C157617dp) r6
            java.lang.Object r7 = r8.L$3
            X.0r7 r7 = (X.C17330r7) r7
            java.lang.Object r5 = r8.L$2
            X.02t r5 = (X.C006302t) r5
            java.lang.Object r4 = r8.L$1
            X.0GB r4 = (X.AnonymousClass0GB) r4
            java.lang.Object r3 = r8.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            goto L_0x009a
        L_0x0049:
            X.AnonymousClass0AN.A00(r13)
            java.lang.Object r3 = r8.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            r0 = 6
            X.0GB r4 = new X.0GB
            r4.<init>(r0)
            X.7RA r5 = new X.7RA
            r5.<init>(r4)
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = X.C023109s.A00
            X.0iw r7 = X.C05750Qx.A00(r0, r1)
            X.7Xu r0 = new X.7Xu
            r0.<init>(r7)
            X.6fm r6 = X.AnonymousClass6VV.A01(r0)
            androidx.compose.runtime.snapshots.Snapshot r0 = X.AnonymousClass6YQ.A00()     // Catch:{ all -> 0x0169 }
            androidx.compose.runtime.snapshots.Snapshot r11 = r0.A07(r5)     // Catch:{ all -> 0x0169 }
            X.00S r0 = r8.$block     // Catch:{ all -> 0x0169 }
            androidx.compose.runtime.snapshots.Snapshot r1 = r11.A06()     // Catch:{ all -> 0x0164 }
            java.lang.Object r10 = r0.invoke()     // Catch:{ all -> 0x015f }
            X.C1269066c.A00(r1)     // Catch:{ all -> 0x0164 }
            r11.A0B()     // Catch:{ all -> 0x0169 }
            r8.L$0 = r3     // Catch:{ all -> 0x0169 }
            r8.L$1 = r4     // Catch:{ all -> 0x0169 }
            r8.L$2 = r5     // Catch:{ all -> 0x0169 }
            r8.L$3 = r7     // Catch:{ all -> 0x0169 }
            r8.L$4 = r6     // Catch:{ all -> 0x0169 }
            r8.L$5 = r10     // Catch:{ all -> 0x0169 }
            r8.label = r2     // Catch:{ all -> 0x0169 }
            java.lang.Object r0 = r3.B6N(r10, r8)     // Catch:{ all -> 0x0169 }
            if (r0 != r9) goto L_0x009d
            return r9
        L_0x009a:
            X.AnonymousClass0AN.A00(r13)     // Catch:{ all -> 0x0169 }
        L_0x009d:
            r8.L$0 = r3     // Catch:{ all -> 0x0169 }
            r8.L$1 = r4     // Catch:{ all -> 0x0169 }
            r8.L$2 = r5     // Catch:{ all -> 0x0169 }
            r8.L$3 = r7     // Catch:{ all -> 0x0169 }
            r8.L$4 = r6     // Catch:{ all -> 0x0169 }
            r8.L$5 = r10     // Catch:{ all -> 0x0169 }
            r0 = 0
            r8.I$0 = r0     // Catch:{ all -> 0x0169 }
            r0 = 2
            r8.label = r0     // Catch:{ all -> 0x0169 }
            java.lang.Object r13 = r7.Bmx(r8)     // Catch:{ all -> 0x0169 }
            if (r13 == r9) goto L_0x015e
            r1 = 0
            goto L_0x00ba
        L_0x00b7:
            X.AnonymousClass0AN.A00(r13)     // Catch:{ all -> 0x0169 }
        L_0x00ba:
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0169 }
        L_0x00bc:
            if (r1 != 0) goto L_0x0110
            java.lang.Object[] r0 = r4.A03     // Catch:{ all -> 0x0169 }
            r23 = r0
            long[] r15 = r4.A02     // Catch:{ all -> 0x0169 }
            int r0 = r15.length     // Catch:{ all -> 0x0169 }
            int r14 = r0 + -2
            r22 = 1
            if (r14 < 0) goto L_0x010b
            r12 = 0
        L_0x00cc:
            r20 = r15[r12]     // Catch:{ all -> 0x0169 }
            long r16 = X.AnonymousClass000.A0Q(r20)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r16 = r16 & r1
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0106
            int r0 = r12 - r14
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r2 = 8 - r0
            r1 = 0
        L_0x00e7:
            if (r1 >= r2) goto L_0x0104
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r18 & r20
            r16 = 128(0x80, double:6.32E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ff
            int r0 = r12 << 3
            int r0 = r0 + r1
            r0 = r23[r0]     // Catch:{ all -> 0x0169 }
            boolean r0 = r13.contains(r0)     // Catch:{ all -> 0x0169 }
            if (r0 == 0) goto L_0x00ff
            goto L_0x010d
        L_0x00ff:
            long r20 = r20 >> r11
            int r1 = r1 + 1
            goto L_0x00e7
        L_0x0104:
            if (r2 != r11) goto L_0x010b
        L_0x0106:
            if (r12 == r14) goto L_0x010b
            int r12 = r12 + 1
            goto L_0x00cc
        L_0x010b:
            r22 = 0
        L_0x010d:
            r1 = 0
            if (r22 == 0) goto L_0x0111
        L_0x0110:
            r1 = 1
        L_0x0111:
            java.lang.Object r13 = r7.BwC()     // Catch:{ all -> 0x0169 }
            boolean r0 = r13 instanceof X.C06340Tf     // Catch:{ all -> 0x0169 }
            if (r0 == 0) goto L_0x011a
            r13 = 0
        L_0x011a:
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0169 }
            if (r13 != 0) goto L_0x00bc
            if (r1 == 0) goto L_0x009d
            r4.A04()     // Catch:{ all -> 0x0169 }
            androidx.compose.runtime.snapshots.Snapshot r0 = X.AnonymousClass6YQ.A00()     // Catch:{ all -> 0x0169 }
            androidx.compose.runtime.snapshots.Snapshot r11 = r0.A07(r5)     // Catch:{ all -> 0x0169 }
            X.00S r0 = r8.$block     // Catch:{ all -> 0x0169 }
            androidx.compose.runtime.snapshots.Snapshot r2 = r11.A06()     // Catch:{ all -> 0x0164 }
            java.lang.Object r1 = r0.invoke()     // Catch:{ all -> 0x0159 }
            X.C1269066c.A00(r2)     // Catch:{ all -> 0x0164 }
            r11.A0B()     // Catch:{ all -> 0x0169 }
            boolean r0 = X.AnonymousClass00C.A0J(r1, r10)     // Catch:{ all -> 0x0169 }
            if (r0 != 0) goto L_0x009d
            r8.L$0 = r3     // Catch:{ all -> 0x0169 }
            r8.L$1 = r4     // Catch:{ all -> 0x0169 }
            r8.L$2 = r5     // Catch:{ all -> 0x0169 }
            r8.L$3 = r7     // Catch:{ all -> 0x0169 }
            r8.L$4 = r6     // Catch:{ all -> 0x0169 }
            r8.L$5 = r1     // Catch:{ all -> 0x0169 }
            r0 = 3
            r8.label = r0     // Catch:{ all -> 0x0169 }
            java.lang.Object r0 = r3.B6N(r1, r8)     // Catch:{ all -> 0x0169 }
            if (r0 == r9) goto L_0x015e
            r10 = r1
            goto L_0x009d
        L_0x0159:
            r0 = move-exception
            X.C1269066c.A00(r2)     // Catch:{ all -> 0x0164 }
            goto L_0x0163
        L_0x015e:
            return r9
        L_0x015f:
            r0 = move-exception
            X.C1269066c.A00(r1)     // Catch:{ all -> 0x0164 }
        L_0x0163:
            throw r0     // Catch:{ all -> 0x0164 }
        L_0x0164:
            r0 = move-exception
            r11.A0B()     // Catch:{ all -> 0x0169 }
            throw r0     // Catch:{ all -> 0x0169 }
        L_0x0169:
            r0 = move-exception
            r6.dispose()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
