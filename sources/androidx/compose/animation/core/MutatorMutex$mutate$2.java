package androidx.compose.animation.core;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass5RS;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C118225nX;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {184, 132}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class MutatorMutex$mutate$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C006302t $block;
    public final /* synthetic */ AnonymousClass5RS $priority;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ C118225nX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(AnonymousClass5RS r2, C118225nX r3, C023509x r4, C006302t r5) {
        super(2, r4);
        this.$priority = r2;
        this.this$0 = r3;
        this.$block = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$priority, this.this$0, r6, this.$block);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00b5=Splitter:B:34:0x00b5, B:29:0x00ab=Splitter:B:29:0x00ab} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.0AO r8 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r10.label
            r7 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0036
            if (r0 == r9) goto L_0x0024
            if (r0 != r7) goto L_0x001f
            java.lang.Object r3 = r10.L$2
            X.5nX r3 = (X.C118225nX) r3
            java.lang.Object r2 = r10.L$1
            X.0qq r2 = (X.C17170qq) r2
            java.lang.Object r6 = r10.L$0
            X.AnonymousClass0AN.A00(r11)     // Catch:{ all -> 0x001c }
            goto L_0x00ab
        L_0x001c:
            r1 = move-exception
            goto L_0x00b5
        L_0x001f:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0e()
            throw r1
        L_0x0024:
            java.lang.Object r3 = r10.L$3
            X.5nX r3 = (X.C118225nX) r3
            java.lang.Object r1 = r10.L$2
            X.02t r1 = (X.C006302t) r1
            java.lang.Object r2 = r10.L$1
            X.0qq r2 = (X.C17170qq) r2
            java.lang.Object r6 = r10.L$0
            X.AnonymousClass0AN.A00(r11)
            goto L_0x009a
        L_0x0036:
            X.AnonymousClass0AN.A00(r11)
            java.lang.Object r0 = r10.L$0
            X.040 r0 = (X.AnonymousClass040) r0
            X.5RS r2 = r10.$priority
            X.02h r1 = r0.BAE()
            X.03x r0 = X.C007403e.A00
            X.02i r0 = r1.get(r0)
            X.AnonymousClass00C.A0B(r0)
            X.03e r0 = (X.C007403e) r0
            X.5nW r6 = new X.5nW
            r6.<init>(r2, r0)
            X.5nX r4 = r10.this$0
        L_0x0055:
            java.util.concurrent.atomic.AtomicReference r3 = r4.A00
            java.lang.Object r2 = r3.get()
            X.5nW r2 = (X.C118215nW) r2
            if (r2 == 0) goto L_0x0071
            X.5RS r1 = r6.A00
            X.5RS r0 = r2.A00
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L_0x0071
            java.lang.String r0 = "Current mutation had a higher priority"
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            r1.<init>(r0)
            throw r1
        L_0x0071:
            boolean r0 = r3.compareAndSet(r2, r6)
            if (r0 == 0) goto L_0x0055
            if (r2 == 0) goto L_0x0083
            X.03e r1 = r2.A01
            X.79I r0 = new X.79I
            r0.<init>()
            r1.B2S(r0)
        L_0x0083:
            X.5nX r3 = r10.this$0
            X.0qq r2 = r3.A01
            X.02t r1 = r10.$block
            r10.L$0 = r6
            r10.L$1 = r2
            r10.L$2 = r1
            r10.L$3 = r3
            r10.label = r9
            java.lang.Object r0 = r2.BOV(r5, r10)
            if (r0 != r8) goto L_0x009a
            return r8
        L_0x009a:
            r10.L$0 = r6     // Catch:{ all -> 0x00b4 }
            r10.L$1 = r2     // Catch:{ all -> 0x00b4 }
            r10.L$2 = r3     // Catch:{ all -> 0x00b4 }
            r10.L$3 = r5     // Catch:{ all -> 0x00b4 }
            r10.label = r7     // Catch:{ all -> 0x00b4 }
            java.lang.Object r11 = r1.invoke(r10)     // Catch:{ all -> 0x00b4 }
            if (r11 != r8) goto L_0x00ab
            return r8
        L_0x00ab:
            java.util.concurrent.atomic.AtomicReference r0 = r3.A00     // Catch:{ all -> 0x00bb }
            r0.compareAndSet(r6, r5)     // Catch:{ all -> 0x00bb }
            r2.BwJ(r5)
            return r11
        L_0x00b4:
            r1 = move-exception
        L_0x00b5:
            java.util.concurrent.atomic.AtomicReference r0 = r3.A00     // Catch:{ all -> 0x00bb }
            r0.compareAndSet(r6, r5)     // Catch:{ all -> 0x00bb }
            throw r1     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            r2.BwJ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.MutatorMutex$mutate$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MutatorMutex$mutate$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
