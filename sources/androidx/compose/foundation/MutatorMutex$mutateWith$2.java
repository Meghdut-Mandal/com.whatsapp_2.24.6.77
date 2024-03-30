package androidx.compose.foundation;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass5RT;
import X.C009003v;
import X.C023509x;
import X.C118245nZ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {220, 173}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
public final class MutatorMutex$mutateWith$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C009003v $block;
    public final /* synthetic */ AnonymousClass5RT $priority;
    public final /* synthetic */ Object $receiver;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ C118245nZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutateWith$2(AnonymousClass5RT r2, C118245nZ r3, Object obj, C023509x r5, C009003v r6) {
        super(2, r5);
        this.$priority = r2;
        this.this$0 = r3;
        this.$block = r6;
        this.$receiver = obj;
    }

    public final C023509x create(Object obj, C023509x r8) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$receiver, r8, this.$block);
        mutatorMutex$mutateWith$2.L$0 = obj;
        return mutatorMutex$mutateWith$2;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x00b3=Splitter:B:29:0x00b3, B:34:0x00bd=Splitter:B:34:0x00bd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.0AO r8 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r10.label
            r7 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r9) goto L_0x0024
            if (r0 != r7) goto L_0x001f
            java.lang.Object r4 = r10.L$2
            X.5nZ r4 = (X.C118245nZ) r4
            java.lang.Object r3 = r10.L$1
            X.0qq r3 = (X.C17170qq) r3
            java.lang.Object r6 = r10.L$0
            X.AnonymousClass0AN.A00(r11)     // Catch:{ all -> 0x001c }
            goto L_0x00b3
        L_0x001c:
            r1 = move-exception
            goto L_0x00bd
        L_0x001f:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0e()
            throw r1
        L_0x0024:
            java.lang.Object r4 = r10.L$4
            X.5nZ r4 = (X.C118245nZ) r4
            java.lang.Object r2 = r10.L$3
            java.lang.Object r1 = r10.L$2
            X.03v r1 = (X.C009003v) r1
            java.lang.Object r3 = r10.L$1
            X.0qq r3 = (X.C17170qq) r3
            java.lang.Object r6 = r10.L$0
            X.AnonymousClass0AN.A00(r11)
            goto L_0x00a0
        L_0x0038:
            X.AnonymousClass0AN.A00(r11)
            java.lang.Object r0 = r10.L$0
            X.040 r0 = (X.AnonymousClass040) r0
            X.5RT r2 = r10.$priority
            X.02h r1 = r0.BAE()
            X.03x r0 = X.C007403e.A00
            X.02i r0 = r1.get(r0)
            X.AnonymousClass00C.A0B(r0)
            X.03e r0 = (X.C007403e) r0
            X.5nY r6 = new X.5nY
            r6.<init>(r2, r0)
            X.5nZ r4 = r10.this$0
        L_0x0057:
            java.util.concurrent.atomic.AtomicReference r3 = r4.A00
            java.lang.Object r2 = r3.get()
            X.5nY r2 = (X.C118235nY) r2
            if (r2 == 0) goto L_0x0073
            X.5RT r1 = r6.A00
            X.5RT r0 = r2.A00
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L_0x0073
            java.lang.String r0 = "Current mutation had a higher priority"
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            r1.<init>(r0)
            throw r1
        L_0x0073:
            boolean r0 = r3.compareAndSet(r2, r6)
            if (r0 == 0) goto L_0x0057
            if (r2 == 0) goto L_0x0085
            X.03e r1 = r2.A01
            X.79J r0 = new X.79J
            r0.<init>()
            r1.B2S(r0)
        L_0x0085:
            X.5nZ r4 = r10.this$0
            X.0qq r3 = r4.A01
            X.03v r1 = r10.$block
            java.lang.Object r2 = r10.$receiver
            r10.L$0 = r6
            r10.L$1 = r3
            r10.L$2 = r1
            r10.L$3 = r2
            r10.L$4 = r4
            r10.label = r9
            java.lang.Object r0 = r3.BOV(r5, r10)
            if (r0 != r8) goto L_0x00a0
            return r8
        L_0x00a0:
            r10.L$0 = r6     // Catch:{ all -> 0x00bc }
            r10.L$1 = r3     // Catch:{ all -> 0x00bc }
            r10.L$2 = r4     // Catch:{ all -> 0x00bc }
            r10.L$3 = r5     // Catch:{ all -> 0x00bc }
            r10.L$4 = r5     // Catch:{ all -> 0x00bc }
            r10.label = r7     // Catch:{ all -> 0x00bc }
            java.lang.Object r11 = r1.invoke(r2, r10)     // Catch:{ all -> 0x00bc }
            if (r11 != r8) goto L_0x00b3
            return r8
        L_0x00b3:
            java.util.concurrent.atomic.AtomicReference r0 = r4.A00     // Catch:{ all -> 0x00c3 }
            r0.compareAndSet(r6, r5)     // Catch:{ all -> 0x00c3 }
            r3.BwJ(r5)
            return r11
        L_0x00bc:
            r1 = move-exception
        L_0x00bd:
            java.util.concurrent.atomic.AtomicReference r0 = r4.A00     // Catch:{ all -> 0x00c3 }
            r0.compareAndSet(r6, r5)     // Catch:{ all -> 0x00c3 }
            throw r1     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            r3.BwJ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MutatorMutex$mutateWith$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MutatorMutex$mutateWith$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
