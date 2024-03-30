package com.whatsapp.calling.screenshare;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C131176Oa;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.screenshare.ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1", f = "ScreenShareLoggingHelper.kt", i = {}, l = {228, 229}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C131176Oa this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1(C131176Oa r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r2) goto L_0x0020
            if (r0 != r4) goto L_0x0036
            X.AnonymousClass0AN.A00(r7)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r7)
            r0 = 2000(0x7d0, double:9.88E-321)
            r6.label = r2
            java.lang.Object r0 = X.C07330Xf.A00(r6, r0)
            if (r0 != r5) goto L_0x0023
            return r5
        L_0x0020:
            X.AnonymousClass0AN.A00(r7)
        L_0x0023:
            X.6Oa r3 = r6.this$0
            X.02l r2 = r3.A0Q
            r1 = 0
            com.whatsapp.calling.screenshare.ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1$1 r0 = new com.whatsapp.calling.screenshare.ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1$1
            r0.<init>(r1)
            r6.label = r4
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r6, r2, r0)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x0036:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.screenshare.ScreenShareLoggingHelper$updateFrameCountAndTotalDuration$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
