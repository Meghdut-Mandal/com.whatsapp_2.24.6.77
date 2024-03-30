package androidx.compose.ui.platform;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C18010sR;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"})
public final class GlobalSnapshotManager$ensureStarted$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C18010sR $channel;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(C023509x r2, C18010sR r3) {
        super(2, r2);
        this.$channel = r3;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new GlobalSnapshotManager$ensureStarted$1(r4, this.$channel);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new GlobalSnapshotManager$ensureStarted$1((C023509x) obj2, this.$channel).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0055: MOVE  (r1v3 java.util.concurrent.CancellationException) = (r3v1 'th' java.util.concurrent.CancellationException)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037 A[Catch:{ all -> 0x004b }] */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 != r3) goto L_0x0015
            java.lang.Object r2 = r6.L$1
            X.0iv r2 = (X.C12950iv) r2
            java.lang.Object r4 = r6.L$0
            X.0r7 r4 = (X.C17330r7) r4
            X.AnonymousClass0AN.A00(r7)     // Catch:{ all -> 0x004d }
            goto L_0x0030
        L_0x0015:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x001a:
            X.AnonymousClass0AN.A00(r7)
            X.0sR r4 = r6.$channel
            X.0iv r2 = r4.BNo()     // Catch:{ all -> 0x004d }
        L_0x0023:
            r6.L$0 = r4     // Catch:{ all -> 0x004d }
            r6.L$1 = r2     // Catch:{ all -> 0x004d }
            r6.label = r3     // Catch:{ all -> 0x004d }
            java.lang.Object r7 = r2.A01(r6)     // Catch:{ all -> 0x004d }
            if (r7 != r5) goto L_0x0030
            goto L_0x0044
        L_0x0030:
            r1 = 0
            boolean r0 = X.AnonymousClass000.A1X(r7)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0045
            r2.A00()     // Catch:{ all -> 0x004b }
            java.util.concurrent.atomic.AtomicBoolean r1 = X.C113575fl.A00     // Catch:{ all -> 0x004b }
            r0 = 0
            r1.set(r0)     // Catch:{ all -> 0x004b }
            X.AnonymousClass6VV.A04()     // Catch:{ all -> 0x004b }
            goto L_0x0023
        L_0x0044:
            return r5
        L_0x0045:
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x004b }
            r4.B2S(r1)
            return r0
        L_0x004b:
            r3 = move-exception
            goto L_0x004e
        L_0x004d:
            r3 = move-exception
        L_0x004e:
            throw r3     // Catch:{ all -> 0x004f }
        L_0x004f:
            r2 = move-exception
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x0059
            r1 = r3
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
            if (r1 != 0) goto L_0x0063
        L_0x0059:
            java.lang.String r0 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
            r1.<init>(r0)
            r1.initCause(r3)
        L_0x0063:
            r4.B2S(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
