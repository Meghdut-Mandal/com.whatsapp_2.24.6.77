package com.whatsapp.community.deactivate;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1", f = "DeactivateCommunityDisclaimerActivity.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
public final class DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ DeactivateCommunityDisclaimerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1(DeactivateCommunityDisclaimerActivity deactivateCommunityDisclaimerActivity, C023509x r3) {
        super(2, r3);
        this.this$0 = deactivateCommunityDisclaimerActivity;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        if (r3 != 404) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r3) goto L_0x00a7
            X.AnonymousClass0AN.A00(r7)
        L_0x000c:
            X.2rd r7 = (X.C53632rd) r7
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = r6.this$0
            r0.Bnv()
            boolean r0 = r7 instanceof X.AnonymousClass2F6
            if (r0 == 0) goto L_0x0052
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r5 = r6.this$0
            r4 = 2131888627(0x7f1209f3, float:1.9411895E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2 = 0
            X.171 r1 = r5.A03
            if (r1 == 0) goto L_0x004d
            X.141 r0 = r5.A05
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "parentGroupContact"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x002e:
            X.AnonymousClass0AN.A00(r7)
            com.whatsapp.community.deactivate.DeactivateCommunityIQProtocolHelper r2 = com.whatsapp.community.deactivate.DeactivateCommunityIQProtocolHelper.A00
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = r6.this$0
            X.19A r1 = r0.A07
            if (r1 == 0) goto L_0x00ac
            X.147 r0 = r0.A06
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "parentGroupJid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0044:
            r6.label = r3
            java.lang.Object r7 = r2.A00(r0, r1, r6)
            if (r7 != r4) goto L_0x000c
            return r4
        L_0x004d:
            java.lang.RuntimeException r0 = X.C36331k8.A0c()
            throw r0
        L_0x0052:
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.community.deactivate.DeactivateCommunityIQProtocolHelper.DeactivateCommunityResult.Error"
            X.AnonymousClass00C.A0E(r7, r0)
            X.2F5 r7 = (X.AnonymousClass2F5) r7
            int r3 = r7.A00
            r0 = -2
            r2 = -1
            if (r3 == r0) goto L_0x0070
            if (r3 == r2) goto L_0x0070
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L_0x0070
            r0 = 401(0x191, float:5.62E-43)
            if (r3 == r0) goto L_0x0080
            r0 = 404(0x194, float:5.66E-43)
            r1 = 2131888622(0x7f1209ee, float:1.9411885E38)
            if (r3 == r0) goto L_0x0073
        L_0x0070:
            r1 = 2131888625(0x7f1209f1, float:1.941189E38)
        L_0x0073:
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = r6.this$0
            android.view.View r0 = r0.A00
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "mainView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0080:
            r1 = 2131888621(0x7f1209ed, float:1.9411882E38)
            goto L_0x0073
        L_0x0084:
            X.4t3 r0 = X.C99304t3.A00(r0, r1, r2)
            r0.A0P()
            goto L_0x009d
        L_0x008c:
            java.lang.String r0 = r1.A0H(r0)
            java.lang.String r1 = X.C36351kA.A0x(r5, r0, r3, r2, r4)
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r0 = r6.this$0
            X.1Sq r0 = r0.A01
            if (r0 == 0) goto L_0x00a0
            r0.BNz(r5, r1)
        L_0x009d:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00a0:
            java.lang.String r0 = "communityNavigator"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x00ac:
            java.lang.String r0 = "messageClient"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
