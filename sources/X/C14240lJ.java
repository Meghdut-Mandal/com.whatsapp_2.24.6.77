package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {217, 217}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0lJ  reason: invalid class name and case insensitive filesystem */
public final class C14240lJ extends AnonymousClass0A1 implements C019408g {
    public final /* synthetic */ C009003v $transform;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14240lJ(C023509x r2, C009003v r3) {
        super(3, r2);
        this.$transform = r3;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        C14240lJ r1 = new C14240lJ((C023509x) obj3, this.$transform);
        r1.L$0 = obj;
        r1.L$1 = obj2;
        return r1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r3) goto L_0x0028
            if (r0 != r4) goto L_0x003b
            X.AnonymousClass0AN.A00(r7)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r7)
            java.lang.Object r2 = r6.L$0
            X.05G r2 = (X.AnonymousClass05G) r2
            java.lang.Object r1 = r6.L$1
            X.03v r0 = r6.$transform
            r6.L$0 = r2
            r6.label = r3
            java.lang.Object r7 = r0.invoke(r1, r6)
            if (r7 != r5) goto L_0x002f
            return r5
        L_0x0028:
            java.lang.Object r2 = r6.L$0
            X.05G r2 = (X.AnonymousClass05G) r2
            X.AnonymousClass0AN.A00(r7)
        L_0x002f:
            r0 = 0
            r6.L$0 = r0
            r6.label = r4
            java.lang.Object r0 = r2.B6N(r7, r6)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x003b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14240lJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
