package com.whatsapp.inappsupport;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C225314u;
import X.C65263Rj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1", f = "SupportMessageFeedbackUtilsImpl.kt", i = {}, l = {78, 79}, m = "invokeSuspend", n = {}, s = {})
public final class SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C225314u $dialogActivity;
    public final /* synthetic */ String $messageId;
    public int label;
    public final /* synthetic */ C65263Rj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1(C225314u r2, C65263Rj r3, String str, C023509x r5) {
        super(2, r5);
        this.$messageId = str;
        this.this$0 = r3;
        this.$dialogActivity = r2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        String str = this.$messageId;
        return new SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1(this.$dialogActivity, this.this$0, str, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r7) goto L_0x003b
            if (r0 != r6) goto L_0x0053
            X.AnonymousClass0AN.A00(r9)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r9)
            java.lang.String r2 = r8.$messageId
            r1 = 0
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            java.util.List r0 = X.C36371kC.A11(r0)
            X.3IT r4 = new X.3IT
            r4.<init>(r2, r0)
            X.3Rj r0 = r8.this$0
            X.36x r3 = r0.A03
            r8.label = r7
            X.02l r2 = r3.A02
            r1 = 0
            com.whatsapp.inappsupport.network.SendSupportMessageFeedbackProtocolHelper$sendFeedback$2 r0 = new com.whatsapp.inappsupport.network.SendSupportMessageFeedbackProtocolHelper$sendFeedback$2
            r0.<init>(r4, r3, r1)
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r8, r2, r0)
            if (r0 != r5) goto L_0x003e
            return r5
        L_0x003b:
            X.AnonymousClass0AN.A00(r9)
        L_0x003e:
            X.3Rj r4 = r8.this$0
            X.02l r3 = r4.A04
            X.14u r2 = r8.$dialogActivity
            r1 = 0
            com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1$1 r0 = new com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1$1
            r0.<init>(r2, r4, r1)
            r8.label = r6
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r8, r3, r0)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
