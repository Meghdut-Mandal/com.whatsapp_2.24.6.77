package androidx.compose.foundation;

import X.AnonymousClass00S;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C120615rn;
import X.C161437mu;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", i = {1}, l = {301, 304}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
public final class ClickableKt$handlePressInteraction$2$delayJob$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass00S $delayPressInteraction;
    public final /* synthetic */ C120615rn $interactionData;
    public final /* synthetic */ C161437mu $interactionSource;
    public final /* synthetic */ long $pressPoint;
    public Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2$delayJob$1(C120615rn r2, C161437mu r3, C023509x r4, AnonymousClass00S r5, long j) {
        super(2, r4);
        this.$delayPressInteraction = r5;
        this.$pressPoint = j;
        this.$interactionSource = r3;
        this.$interactionData = r2;
    }

    public final C023509x create(Object obj, C023509x r9) {
        AnonymousClass00S r4 = this.$delayPressInteraction;
        long j = this.$pressPoint;
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.$interactionData, this.$interactionSource, r9, r4, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0034
            if (r0 != r4) goto L_0x0053
            java.lang.Object r2 = r5.L$0
            X.6er r2 = (X.C136706er) r2
            X.AnonymousClass0AN.A00(r6)
        L_0x0013:
            X.5rn r0 = r5.$interactionData
            r0.A01 = r2
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x001a:
            X.AnonymousClass0AN.A00(r6)
            X.00S r0 = r5.$delayPressInteraction
            java.lang.Object r0 = r0.invoke()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x0037
            long r0 = X.C112155dR.A00
            r5.label = r2
            java.lang.Object r0 = X.C07330Xf.A00(r5, r0)
            if (r0 != r3) goto L_0x0037
            return r3
        L_0x0034:
            X.AnonymousClass0AN.A00(r6)
        L_0x0037:
            long r0 = r5.$pressPoint
            X.6er r2 = new X.6er
            r2.<init>(r0)
            X.7mu r0 = r5.$interactionSource
            r5.L$0 = r2
            r5.label = r4
            X.6et r0 = (X.C136726et) r0
            X.05J r0 = r0.A00
            java.lang.Object r0 = r0.B6N(r2, r5)
            java.lang.Object r0 = X.AnonymousClass0AO.A00(r0)
            if (r0 != r3) goto L_0x0013
            return r3
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClickableKt$handlePressInteraction$2$delayJob$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
