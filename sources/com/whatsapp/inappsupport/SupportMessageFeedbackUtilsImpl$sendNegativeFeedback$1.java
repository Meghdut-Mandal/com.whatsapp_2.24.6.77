package com.whatsapp.inappsupport;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass3IT;
import X.C009003v;
import X.C023509x;
import X.C225314u;
import X.C65263Rj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1", f = "SupportMessageFeedbackUtilsImpl.kt", i = {}, l = {86, 87}, m = "invokeSuspend", n = {}, s = {})
public final class SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C225314u $dialogActivity;
    public final /* synthetic */ AnonymousClass3IT $feedbackData;
    public int label;
    public final /* synthetic */ C65263Rj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1(C225314u r2, C65263Rj r3, AnonymousClass3IT r4, C023509x r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$feedbackData = r4;
        this.$dialogActivity = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1(this.$dialogActivity, this.this$0, this.$feedbackData, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r1) goto L_0x002c
            if (r0 != r6) goto L_0x0044
            X.AnonymousClass0AN.A00(r8)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r8)
            X.3Rj r0 = r7.this$0
            X.36x r4 = r0.A03
            X.3IT r3 = r7.$feedbackData
            r7.label = r1
            X.02l r2 = r4.A02
            r1 = 0
            com.whatsapp.inappsupport.network.SendSupportMessageFeedbackProtocolHelper$sendFeedback$2 r0 = new com.whatsapp.inappsupport.network.SendSupportMessageFeedbackProtocolHelper$sendFeedback$2
            r0.<init>(r3, r4, r1)
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r7, r2, r0)
            if (r0 != r5) goto L_0x002f
            return r5
        L_0x002c:
            X.AnonymousClass0AN.A00(r8)
        L_0x002f:
            X.3Rj r4 = r7.this$0
            X.02l r3 = r4.A04
            X.14u r2 = r7.$dialogActivity
            r1 = 0
            com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1$1 r0 = new com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1$1
            r0.<init>(r2, r4, r1)
            r7.label = r6
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r7, r3, r0)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x0044:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SupportMessageFeedbackUtilsImpl$sendNegativeFeedback$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
