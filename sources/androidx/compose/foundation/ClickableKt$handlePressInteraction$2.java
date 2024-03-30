package androidx.compose.foundation;

import X.AnonymousClass00S;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C120615rn;
import X.C161437mu;
import X.C161877nc;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", i = {0, 1, 2}, l = {307, 309, 316, 317, 326}, m = "invokeSuspend", n = {"delayJob", "success", "release"}, s = {"L$0", "Z$0", "L$0"})
public final class ClickableKt$handlePressInteraction$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass00S $delayPressInteraction;
    public final /* synthetic */ C120615rn $interactionData;
    public final /* synthetic */ C161437mu $interactionSource;
    public final /* synthetic */ long $pressPoint;
    public final /* synthetic */ C161877nc $this_handlePressInteraction;
    public /* synthetic */ Object L$0;
    public boolean Z$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$handlePressInteraction$2(C120615rn r2, C161877nc r3, C161437mu r4, C023509x r5, AnonymousClass00S r6, long j) {
        super(2, r5);
        this.$this_handlePressInteraction = r3;
        this.$pressPoint = j;
        this.$interactionSource = r4;
        this.$interactionData = r2;
        this.$delayPressInteraction = r6;
    }

    public final C023509x create(Object obj, C023509x r10) {
        C161877nc r2 = this.$this_handlePressInteraction;
        long j = this.$pressPoint;
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.$interactionData, r2, this.$interactionSource, r10, this.$delayPressInteraction, j);
        clickableKt$handlePressInteraction$2.L$0 = obj;
        return clickableKt$handlePressInteraction$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r5 = r14.label
            r0 = 5
            r2 = 4
            r4 = 3
            r6 = 2
            r1 = 1
            r10 = 0
            if (r5 == 0) goto L_0x001b
            if (r5 == r1) goto L_0x0040
            if (r5 == r6) goto L_0x005e
            if (r5 == r4) goto L_0x0086
            if (r5 == r2) goto L_0x00cb
            if (r5 == r0) goto L_0x00cb
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x001b:
            X.AnonymousClass0AN.A00(r15)
            java.lang.Object r0 = r14.L$0
            X.040 r0 = (X.AnonymousClass040) r0
            X.00S r11 = r14.$delayPressInteraction
            long r12 = r14.$pressPoint
            X.7mu r9 = r14.$interactionSource
            X.5rn r8 = r14.$interactionData
            androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1 r7 = new androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1
            r7.<init>(r8, r9, r10, r11, r12)
            X.0A6 r5 = X.C36391kE.A12(r7, r0)
            X.7nc r0 = r14.$this_handlePressInteraction
            r14.L$0 = r5
            r14.label = r1
            java.lang.Object r15 = r0.BwA(r14)
            if (r15 != r3) goto L_0x0047
            return r3
        L_0x0040:
            java.lang.Object r5 = r14.L$0
            X.03e r5 = (X.C007403e) r5
            X.AnonymousClass0AN.A00(r15)
        L_0x0047:
            boolean r1 = X.AnonymousClass000.A1X(r15)
            boolean r0 = r5.BL7()
            if (r0 == 0) goto L_0x00a2
            r14.L$0 = r10
            r14.Z$0 = r1
            r14.label = r6
            java.lang.Object r0 = X.C07570Yj.A00(r14, r5)
            if (r0 != r3) goto L_0x0063
            return r3
        L_0x005e:
            boolean r1 = r14.Z$0
            X.AnonymousClass0AN.A00(r15)
        L_0x0063:
            if (r1 == 0) goto L_0x00ce
            long r0 = r14.$pressPoint
            X.6er r5 = new X.6er
            r5.<init>(r0)
            X.6es r1 = new X.6es
            r1.<init>(r5)
            X.7mu r0 = r14.$interactionSource
            r14.L$0 = r1
            r14.label = r4
            X.6et r0 = (X.C136726et) r0
            X.05J r0 = r0.A00
            java.lang.Object r0 = r0.B6N(r5, r14)
            java.lang.Object r0 = X.AnonymousClass0AO.A00(r0)
            if (r0 != r3) goto L_0x008d
            return r3
        L_0x0086:
            java.lang.Object r1 = r14.L$0
            X.6es r1 = (X.C136716es) r1
            X.AnonymousClass0AN.A00(r15)
        L_0x008d:
            X.7mu r0 = r14.$interactionSource
            r14.L$0 = r10
            r14.label = r2
            X.6et r0 = (X.C136726et) r0
            X.05J r0 = r0.A00
            java.lang.Object r0 = r0.B6N(r1, r14)
            java.lang.Object r0 = X.AnonymousClass0AO.A00(r0)
            if (r0 != r3) goto L_0x00ce
            return r3
        L_0x00a2:
            X.5rn r0 = r14.$interactionData
            X.6er r0 = r0.A01
            if (r0 == 0) goto L_0x00ce
            X.7mu r2 = r14.$interactionSource
            if (r1 == 0) goto L_0x00c5
            X.6es r1 = new X.6es
            r1.<init>(r0)
        L_0x00b1:
            r14.L$0 = r10
            r0 = 5
            r14.label = r0
            X.6et r2 = (X.C136726et) r2
            X.05J r0 = r2.A00
            java.lang.Object r0 = r0.B6N(r1, r14)
            java.lang.Object r0 = X.AnonymousClass0AO.A00(r0)
            if (r0 != r3) goto L_0x00ce
            return r3
        L_0x00c5:
            X.6eq r1 = new X.6eq
            r1.<init>(r0)
            goto L_0x00b1
        L_0x00cb:
            X.AnonymousClass0AN.A00(r15)
        L_0x00ce:
            X.5rn r0 = r14.$interactionData
            r0.A01 = r10
            X.0AJ r3 = X.AnonymousClass0AJ.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$handlePressInteraction$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClickableKt$handlePressInteraction$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
