package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {956, 958}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
/* renamed from: X.0kw  reason: invalid class name and case insensitive filesystem */
public final class C14080kw extends C14090kx implements C009003v {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ C007503f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14080kw(C023509x r1, C007503f r2) {
        super(r1);
        this.this$0 = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C023509x r3, C12250hk r4) {
        return ((C14080kw) create(r4, r3)).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final C023509x create(Object obj, C023509x r4) {
        C14080kw r0 = new C14080kw(r4, this.this$0);
        r0.L$0 = obj;
        return r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0038
            if (r0 == r3) goto L_0x006d
            if (r0 != r4) goto L_0x0068
            java.lang.Object r3 = r6.L$2
            X.03o r3 = (X.C008303o) r3
            java.lang.Object r1 = r6.L$1
            java.lang.Object r2 = r6.L$0
            X.0hk r2 = (X.C12250hk) r2
            X.AnonymousClass0AN.A00(r7)
        L_0x0019:
            X.03o r3 = r3.A03()
        L_0x001d:
            boolean r0 = X.AnonymousClass00C.A0J(r3, r1)
            if (r0 != 0) goto L_0x0070
            boolean r0 = r3 instanceof X.C008703s
            if (r0 == 0) goto L_0x0019
            r0 = r3
            X.03s r0 = (X.C008703s) r0
            X.03f r0 = r0.A00
            r6.L$0 = r2
            r6.L$1 = r1
            r6.L$2 = r3
            r6.label = r4
        L_0x0034:
            r2.A01(r0, r6)
            return r5
        L_0x0038:
            X.AnonymousClass0AN.A00(r7)
            java.lang.Object r2 = r6.L$0
            X.0hk r2 = (X.C12250hk) r2
            X.03f r0 = r6.this$0
            java.lang.Object r1 = r0.A0X()
            boolean r0 = r1 instanceof X.C008703s
            if (r0 == 0) goto L_0x0050
            X.03s r1 = (X.C008703s) r1
            X.03f r0 = r1.A00
            r6.label = r3
            goto L_0x0034
        L_0x0050:
            boolean r0 = r1 instanceof X.C007903j
            if (r0 == 0) goto L_0x0070
            X.03j r1 = (X.C007903j) r1
            X.0nO r1 = r1.BDY()
            if (r1 == 0) goto L_0x0070
            java.lang.Object r3 = r1.A02()
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            X.AnonymousClass00C.A0E(r3, r0)
            X.03o r3 = (X.C008303o) r3
            goto L_0x001d
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x006d:
            X.AnonymousClass0AN.A00(r7)
        L_0x0070:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14080kw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
