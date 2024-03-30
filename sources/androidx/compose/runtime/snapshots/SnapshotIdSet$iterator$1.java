package androidx.compose.runtime.snapshots;

import X.AnonymousClass09z;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C14090kx;
import X.C1496472d;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {295, 300, 307}, m = "invokeSuspend", n = {"$this$sequence", "belowBound", "$this$sequence", "index", "$this$sequence", "index"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
public final class SnapshotIdSet$iterator$1 extends C14090kx implements C009003v {
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C1496472d this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(C1496472d r1, C023509x r2) {
        super(r2);
        this.this$0 = r1;
    }

    public final C023509x create(Object obj, C023509x r4) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, r4);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        if (r5 >= 64) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r9 < 64) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.0AO r14 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r2 = r15.label
            r7 = 0
            r12 = 1
            r1 = 3
            r0 = 2
            r8 = 64
            r10 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r4) goto L_0x0044
            if (r2 == r0) goto L_0x009e
            if (r2 != r1) goto L_0x00b7
            int r9 = r15.I$0
            java.lang.Object r6 = r15.L$0
            X.0hk r6 = (X.C12250hk) r6
            X.AnonymousClass0AN.A00(r16)
        L_0x001f:
            int r9 = r9 + 1
            if (r9 >= r8) goto L_0x00bc
        L_0x0023:
            X.72d r5 = r15.this$0
            long r1 = r5.A02
            long r3 = r12 << r9
            long r1 = r1 & r3
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x001f
            int r1 = r9 + 64
            int r0 = r5.A00
            int r1 = r1 + r0
            java.lang.Integer r1 = X.C90524aI.A0a(r1)
            r15.L$0 = r6
            r15.L$1 = r7
            r15.I$0 = r9
            r0 = 3
        L_0x003e:
            r15.label = r0
            r6.A01(r1, r15)
            return r14
        L_0x0044:
            int r3 = r15.I$1
            int r0 = r15.I$0
            java.lang.Object r2 = r15.L$1
            int[] r2 = (int[]) r2
            java.lang.Object r6 = r15.L$0
            X.0hk r6 = (X.C12250hk) r6
            X.AnonymousClass0AN.A00(r16)
            int r1 = r0 + 1
            goto L_0x0065
        L_0x0056:
            X.AnonymousClass0AN.A00(r16)
            java.lang.Object r6 = r15.L$0
            X.0hk r6 = (X.C12250hk) r6
            X.72d r0 = r15.this$0
            int[] r2 = r0.A03
            if (r2 == 0) goto L_0x007b
            int r3 = r2.length
            r1 = 0
        L_0x0065:
            if (r1 >= r3) goto L_0x007b
            r0 = r2[r1]
            java.lang.Integer r0 = X.C90524aI.A0a(r0)
            r15.L$0 = r6
            r15.L$1 = r2
            r15.I$0 = r1
            r15.I$1 = r3
            r15.label = r4
            r6.A01(r0, r15)
            return r14
        L_0x007b:
            X.72d r0 = r15.this$0
            long r1 = r0.A01
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00ac
            r5 = 0
        L_0x0084:
            X.72d r4 = r15.this$0
            long r2 = r4.A01
            long r0 = r12 << r5
            long r2 = r2 & r0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            int r0 = r4.A00
            int r0 = r0 + r5
            java.lang.Integer r1 = X.C90524aI.A0a(r0)
            r15.L$0 = r6
            r15.L$1 = r7
            r15.I$0 = r5
            r0 = 2
            goto L_0x003e
        L_0x009e:
            int r5 = r15.I$0
            java.lang.Object r6 = r15.L$0
            X.0hk r6 = (X.C12250hk) r6
            X.AnonymousClass0AN.A00(r16)
        L_0x00a7:
            int r5 = r5 + 1
            if (r5 >= r8) goto L_0x00ac
            goto L_0x0084
        L_0x00ac:
            X.72d r0 = r15.this$0
            long r1 = r0.A02
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00bc
            r9 = 0
            goto L_0x0023
        L_0x00b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x00bc:
            X.0AJ r14 = X.AnonymousClass0AJ.A00
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SnapshotIdSet$iterator$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
