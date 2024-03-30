package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0lM  reason: invalid class name and case insensitive filesystem */
public final class C14270lM extends AnonymousClass0A1 implements C019408g {
    public final /* synthetic */ C019408g $transform;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14270lM(C023509x r2, C019408g r3) {
        super(3, r2);
        this.$transform = r3;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        C14270lM r1 = new C14270lM((C023509x) obj3, this.$transform);
        r1.L$0 = obj;
        r1.L$1 = obj2;
        return r1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r7 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r5) goto L_0x002f
            if (r0 != r6) goto L_0x0042
            X.AnonymousClass0AN.A00(r9)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r9)
            java.lang.Object r4 = r8.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            java.lang.Object r3 = r8.L$1
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            X.08g r2 = r8.$transform
            r0 = 0
            r1 = r3[r0]
            r0 = r3[r5]
            r8.L$0 = r4
            r8.label = r5
            java.lang.Object r9 = r2.BKt(r1, r0, r8)
            if (r9 != r7) goto L_0x0036
            return r7
        L_0x002f:
            java.lang.Object r4 = r8.L$0
            X.05G r4 = (X.AnonymousClass05G) r4
            X.AnonymousClass0AN.A00(r9)
        L_0x0036:
            r0 = 0
            r8.L$0 = r0
            r8.label = r6
            java.lang.Object r0 = r4.B6N(r9, r8)
            if (r0 != r7) goto L_0x000f
            return r7
        L_0x0042:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14270lM.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
