package androidx.compose.runtime;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C019408g;
import X.C023509x;
import X.C162267oJ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1003}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
public final class Recomposer$recompositionRunner$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C019408g $block;
    public final /* synthetic */ C162267oJ $parentFrameClock;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(C162267oJ r2, Recomposer recomposer, C023509x r4, C019408g r5) {
        super(2, r4);
        this.this$0 = recomposer;
        this.$block = r5;
        this.$parentFrameClock = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.$parentFrameClock, this.this$0, r6, this.$block);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C114285gy r11) {
        /*
        L_0x0000:
            X.05L r6 = androidx.compose.runtime.Recomposer.A0M
            java.lang.Object r5 = r6.getValue()
            X.7oD r5 = (X.C162207oD) r5
            r4 = r5
            X.79j r4 = (X.C1513979j) r4
            X.79c r7 = r4.A00
            java.lang.Object r3 = r7.get(r11)
            X.6Jb r3 = (X.C129936Jb) r3
            if (r3 == 0) goto L_0x0070
            X.6YE r2 = r7.A00
            r1 = 0
            int r0 = X.AnonymousClass000.A0J(r11)
            X.6YE r1 = r2.A0L(r11, r0, r1)
            if (r2 == r1) goto L_0x002b
            if (r1 != 0) goto L_0x0079
            X.79c r7 = X.C1513279c.A02
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>"
            X.AnonymousClass00C.A0E(r7, r0)
        L_0x002b:
            java.lang.Object r9 = r3.A01
            X.6Hj r10 = X.C129536Hj.A00
            r8 = 0
            if (r9 == r10) goto L_0x0049
            r8 = 1
            java.lang.Object r0 = r7.get(r9)
            X.AnonymousClass00C.A0B(r0)
            X.6Jb r0 = (X.C129936Jb) r0
            java.lang.Object r2 = r3.A00
            java.lang.Object r1 = r0.A01
            X.6Jb r0 = new X.6Jb
            r0.<init>(r1, r2)
            X.79c r7 = r7.A04(r9, r0)
        L_0x0049:
            java.lang.Object r3 = r3.A00
            r2 = 0
            if (r3 == r10) goto L_0x0063
            r2 = 1
            java.lang.Object r0 = r7.get(r3)
            X.AnonymousClass00C.A0B(r0)
            X.6Jb r0 = (X.C129936Jb) r0
            java.lang.Object r1 = r0.A00
            X.6Jb r0 = new X.6Jb
            r0.<init>(r9, r1)
            X.79c r7 = r7.A04(r3, r0)
        L_0x0063:
            if (r8 == 0) goto L_0x0067
            java.lang.Object r3 = r4.A01
        L_0x0067:
            if (r2 == 0) goto L_0x006b
            java.lang.Object r9 = r4.A02
        L_0x006b:
            X.79j r4 = new X.79j
            r4.<init>(r7, r3, r9)
        L_0x0070:
            if (r5 == r4) goto L_0x0078
            boolean r0 = r6.B3B(r5, r4)
            if (r0 == 0) goto L_0x0000
        L_0x0078:
            return
        L_0x0079:
            int r0 = r7.size()
            int r0 = r0 + -1
            X.79c r7 = new X.79c
            r7.<init>(r1, r0)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$recompositionRunner$2.A01(X.5gy):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0125, code lost:
        r5 = th;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0126, code lost:
        r7.dispose();
        r1 = r14.this$0;
        r0 = androidx.compose.runtime.Recomposer.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012f, code lost:
        monitor-enter(r1.A0C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0132, code lost:
        if (r1.A06 == r3) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0134, code lost:
        r1.A06 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0136, code lost:
        androidx.compose.runtime.Recomposer.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x013a, code lost:
        A01(r14.this$0.A0B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0141, code lost:
        throw r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.0AO r9 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r14.label
            r4 = 0
            r10 = 1
            if (r0 == 0) goto L_0x001d
            if (r0 != r10) goto L_0x0018
            java.lang.Object r7 = r14.L$1
            X.7dp r7 = (X.C157617dp) r7
            java.lang.Object r3 = r14.L$0
            X.AnonymousClass0AN.A00(r15)     // Catch:{ all -> 0x0015 }
            goto L_0x0104
        L_0x0015:
            r5 = move-exception
            goto L_0x0126
        L_0x0018:
            java.lang.IllegalStateException r5 = X.AnonymousClass000.A0e()
            throw r5
        L_0x001d:
            X.AnonymousClass0AN.A00(r15)
            java.lang.Object r0 = r14.L$0
            X.040 r0 = (X.AnonymousClass040) r0
            X.02h r0 = r0.BAE()
            X.03e r3 = X.C07570Yj.A01(r0)
            androidx.compose.runtime.Recomposer r1 = r14.this$0
            X.05L r0 = androidx.compose.runtime.Recomposer.A0M
            java.lang.Object r2 = r1.A0C
            monitor-enter(r2)
            java.lang.Throwable r0 = r1.A02     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x014f
            int r0 = X.C108185Sm.A00(r1)     // Catch:{ all -> 0x0150 }
            if (r0 <= 0) goto L_0x0142
            X.03e r0 = r1.A06     // Catch:{ all -> 0x0150 }
            if (r0 != 0) goto L_0x0149
            r1.A06 = r3     // Catch:{ all -> 0x0150 }
            androidx.compose.runtime.Recomposer.A01(r1)     // Catch:{ all -> 0x0150 }
            monitor-exit(r2)
            androidx.compose.runtime.Recomposer r1 = r14.this$0
            X.7Xt r0 = new X.7Xt
            r0.<init>(r1)
            X.6fm r7 = X.AnonymousClass6VV.A01(r0)
            androidx.compose.runtime.Recomposer r0 = r14.this$0
            X.5gy r11 = r0.A0B
        L_0x0056:
            X.05L r8 = androidx.compose.runtime.Recomposer.A0M
            java.lang.Object r6 = r8.getValue()
            X.7oD r6 = (X.C162207oD) r6
            r5 = r6
            X.79j r5 = (X.C1513979j) r5
            X.79c r2 = r5.A00
            boolean r0 = r2.containsKey(r11)
            if (r0 != 0) goto L_0x007d
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0086
            X.6Jb r0 = new X.6Jb
            r0.<init>()
            X.79c r0 = r2.A04(r11, r0)
            X.79j r5 = new X.79j
            r5.<init>(r0, r11, r11)
        L_0x007d:
            if (r6 == r5) goto L_0x00af
            boolean r0 = r8.B3B(r6, r5)
            if (r0 == 0) goto L_0x0056
            goto L_0x00af
        L_0x0086:
            java.lang.Object r12 = r5.A02
            java.lang.Object r0 = r2.get(r12)
            X.AnonymousClass00C.A0B(r0)
            X.6Jb r0 = (X.C129936Jb) r0
            java.lang.Object r1 = r0.A01
            X.6Jb r0 = new X.6Jb
            r0.<init>(r1, r11)
            X.79c r2 = r2.A04(r12, r0)
            X.6Hj r1 = X.C129536Hj.A00
            X.6Jb r0 = new X.6Jb
            r0.<init>(r12, r1)
            X.79c r1 = r2.A04(r11, r0)
            java.lang.Object r0 = r5.A01
            X.79j r5 = new X.79j
            r5.<init>(r1, r0, r11)
            goto L_0x007d
        L_0x00af:
            androidx.compose.runtime.Recomposer r0 = r14.this$0     // Catch:{ all -> 0x0125 }
            java.lang.Object r1 = r0.A0C     // Catch:{ all -> 0x0125 }
            monitor-enter(r1)     // Catch:{ all -> 0x0125 }
            java.util.List r13 = androidx.compose.runtime.Recomposer.A00(r0)     // Catch:{ all -> 0x0122 }
            monitor-exit(r1)     // Catch:{ all -> 0x0125 }
            r12 = 0
            int r11 = r13.size()     // Catch:{ all -> 0x0125 }
        L_0x00be:
            if (r12 >= r11) goto L_0x00ee
            java.lang.Object r0 = r13.get(r12)     // Catch:{ all -> 0x0125 }
            X.7my r0 = (X.C161477my) r0     // Catch:{ all -> 0x0125 }
            X.6fP r0 = (X.C136986fP) r0     // Catch:{ all -> 0x0125 }
            java.lang.Object r8 = r0.A0C     // Catch:{ all -> 0x0125 }
            monitor-enter(r8)     // Catch:{ all -> 0x0125 }
            X.72c r0 = r0.A08     // Catch:{ all -> 0x00eb }
            java.lang.Object[] r6 = r0.A08     // Catch:{ all -> 0x00eb }
            r5 = 0
            int r2 = r6.length     // Catch:{ all -> 0x00eb }
        L_0x00d1:
            if (r5 >= r2) goto L_0x00e7
            r1 = r6[r5]     // Catch:{ all -> 0x00eb }
            boolean r0 = r1 instanceof X.C136976fO     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x00e4
            X.6fO r1 = (X.C136976fO) r1     // Catch:{ all -> 0x00eb }
            if (r1 == 0) goto L_0x00e4
            X.7iF r0 = r1.A05     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x00e4
            r0.BKq(r1, r4)     // Catch:{ all -> 0x00eb }
        L_0x00e4:
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00e7:
            monitor-exit(r8)     // Catch:{ all -> 0x0125 }
            int r12 = r12 + 1
            goto L_0x00be
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0125 }
            throw r0     // Catch:{ all -> 0x0125 }
        L_0x00ee:
            X.08g r2 = r14.$block     // Catch:{ all -> 0x0125 }
            X.7oJ r1 = r14.$parentFrameClock     // Catch:{ all -> 0x0125 }
            androidx.compose.runtime.Recomposer$recompositionRunner$2$3 r0 = new androidx.compose.runtime.Recomposer$recompositionRunner$2$3     // Catch:{ all -> 0x0125 }
            r0.<init>(r1, r4, r2)     // Catch:{ all -> 0x0125 }
            r14.L$0 = r3     // Catch:{ all -> 0x0125 }
            r14.L$1 = r7     // Catch:{ all -> 0x0125 }
            r14.label = r10     // Catch:{ all -> 0x0125 }
            java.lang.Object r0 = X.C009403z.A00(r14, r0)     // Catch:{ all -> 0x0125 }
            if (r0 != r9) goto L_0x0104
            return r9
        L_0x0104:
            r7.dispose()
            androidx.compose.runtime.Recomposer r1 = r14.this$0
            X.05L r0 = androidx.compose.runtime.Recomposer.A0M
            java.lang.Object r2 = r1.A0C
            monitor-enter(r2)
            X.03e r0 = r1.A06     // Catch:{ all -> 0x0150 }
            if (r0 != r3) goto L_0x0114
            r1.A06 = r4     // Catch:{ all -> 0x0150 }
        L_0x0114:
            androidx.compose.runtime.Recomposer.A01(r1)     // Catch:{ all -> 0x0150 }
            monitor-exit(r2)
            androidx.compose.runtime.Recomposer r0 = r14.this$0
            X.5gy r0 = r0.A0B
            A01(r0)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0122:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0125 }
            throw r0     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r5 = move-exception
        L_0x0126:
            r7.dispose()
            androidx.compose.runtime.Recomposer r1 = r14.this$0
            X.05L r0 = androidx.compose.runtime.Recomposer.A0M
            java.lang.Object r2 = r1.A0C
            monitor-enter(r2)
            X.03e r0 = r1.A06     // Catch:{ all -> 0x0150 }
            if (r0 != r3) goto L_0x0136
            r1.A06 = r4     // Catch:{ all -> 0x0150 }
        L_0x0136:
            androidx.compose.runtime.Recomposer.A01(r1)     // Catch:{ all -> 0x0150 }
            monitor-exit(r2)
            androidx.compose.runtime.Recomposer r0 = r14.this$0
            X.5gy r0 = r0.A0B
            A01(r0)
            throw r5
        L_0x0142:
            java.lang.String r0 = "Recomposer shut down"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0150 }
            goto L_0x014f
        L_0x0149:
            java.lang.String r0 = "Recomposer already running"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ all -> 0x0150 }
        L_0x014f:
            throw r0     // Catch:{ all -> 0x0150 }
        L_0x0150:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$recompositionRunner$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Recomposer$recompositionRunner$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
