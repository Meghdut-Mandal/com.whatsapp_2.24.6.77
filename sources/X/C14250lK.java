package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {333, 262}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0lK  reason: invalid class name and case insensitive filesystem */
public final class C14250lK extends AnonymousClass0A1 implements C019408g {
    public final /* synthetic */ C019508h $transform$inlined;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14250lK(C023509x r2, C019508h r3) {
        super(3, r2);
        this.$transform$inlined = r3;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        C14250lK r1 = new C14250lK((C023509x) obj3, this.$transform$inlined);
        r1.L$0 = obj;
        r1.L$1 = obj2;
        return r1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.0AO r8 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r9.label
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r6) goto L_0x0031
            if (r0 != r7) goto L_0x0044
            X.AnonymousClass0AN.A00(r10)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r10)
            java.lang.Object r5 = r9.L$0
            X.05G r5 = (X.AnonymousClass05G) r5
            java.lang.Object r4 = r9.L$1
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            X.08h r3 = r9.$transform$inlined
            r0 = 0
            r2 = r4[r0]
            r1 = r4[r6]
            r0 = r4[r7]
            r9.L$0 = r5
            r9.label = r6
            java.lang.Object r10 = r3.BKu(r2, r1, r0, r9)
            if (r10 != r8) goto L_0x0038
            return r8
        L_0x0031:
            java.lang.Object r5 = r9.L$0
            X.05G r5 = (X.AnonymousClass05G) r5
            X.AnonymousClass0AN.A00(r10)
        L_0x0038:
            r0 = 0
            r9.L$0 = r0
            r9.label = r7
            java.lang.Object r0 = r5.B6N(r10, r9)
            if (r0 != r8) goto L_0x000f
            return r8
        L_0x0044:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14250lK.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
