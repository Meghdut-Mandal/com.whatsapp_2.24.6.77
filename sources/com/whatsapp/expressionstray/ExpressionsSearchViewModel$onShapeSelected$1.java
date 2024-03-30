package com.whatsapp.expressionstray;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass6AC;
import X.C009003v;
import X.C023509x;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$onShapeSelected$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {345, 346}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$onShapeSelected$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass6AC $shape;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$onShapeSelected$1(Context context, ExpressionsSearchViewModel expressionsSearchViewModel, AnonymousClass6AC r4, C023509x r5) {
        super(2, r5);
        this.$shape = r4;
        this.$context = context;
        this.this$0 = expressionsSearchViewModel;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ExpressionsSearchViewModel$onShapeSelected$1(this.$context, this.this$0, this.$shape, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r6) goto L_0x0039
            if (r0 != r5) goto L_0x004b
            X.AnonymousClass0AN.A00(r8)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r8)
            X.6AC r0 = r7.$shape
            X.7mX r3 = r0.A00
            android.content.Context r2 = r7.$context
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r0 = r7.this$0
            X.0ts r1 = r0.A09
            r0 = 0
            X.6Ft r2 = r3.B4v(r2, r1, r0)
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r0 = r7.this$0
            X.05J r1 = r0.A0J
            X.AnonymousClass00C.A0B(r2)
            X.552 r0 = new X.552
            r0.<init>(r2)
            r7.label = r6
            java.lang.Object r0 = r1.B6N(r0, r7)
            if (r0 != r4) goto L_0x003c
            return r4
        L_0x0039:
            X.AnonymousClass0AN.A00(r8)
        L_0x003c:
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r0 = r7.this$0
            X.05J r1 = r0.A0J
            X.556 r0 = X.AnonymousClass556.A00
            r7.label = r5
            java.lang.Object r0 = r1.B6N(r0, r7)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x004b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.ExpressionsSearchViewModel$onShapeSelected$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsSearchViewModel$onShapeSelected$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
