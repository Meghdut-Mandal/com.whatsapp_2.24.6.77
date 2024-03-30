package com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C39961uN;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesViewModel$fetchReportedMessages$1", f = "ReportToAdminMessagesViewModel.kt", i = {1}, l = {96, 100}, m = "invokeSuspend", n = {"reports"}, s = {"L$0"})
public final class ReportToAdminMessagesViewModel$fetchReportedMessages$1 extends AnonymousClass0A1 implements C009003v {
    public Object L$0;
    public int label;
    public final /* synthetic */ C39961uN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportToAdminMessagesViewModel$fetchReportedMessages$1(C39961uN r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ReportToAdminMessagesViewModel$fetchReportedMessages$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ReportToAdminMessagesViewModel$fetchReportedMessages$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r13.label
            r4 = 0
            r1 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0021
            if (r0 == r3) goto L_0x0033
            if (r0 != r1) goto L_0x00b0
            java.lang.Object r5 = r13.L$0
            X.AnonymousClass0AN.A00(r14)
        L_0x0012:
            r4 = r14
        L_0x0013:
            X.1uN r0 = r13.this$0
            X.00s r1 = r0.A02
            X.011 r0 = X.C36441kJ.A19(r4, r5)
        L_0x001b:
            r1.A0C(r0)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0021:
            X.AnonymousClass0AN.A00(r14)
            X.1uN r0 = r13.this$0
            com.whatsapp.reporttoadmin.xmpp.RtaXmppClient r2 = r0.A07
            X.147 r0 = r0.A06
            r13.label = r3
            java.lang.Object r14 = r2.A02(r0, r13)
            if (r14 != r6) goto L_0x0036
            return r6
        L_0x0033:
            X.AnonymousClass0AN.A00(r14)
        L_0x0036:
            X.2uR r14 = (X.C55322uR) r14
            boolean r0 = r14 instanceof X.AnonymousClass2dL
            if (r0 == 0) goto L_0x00a4
            X.2dL r14 = (X.AnonymousClass2dL) r14
            java.lang.Object r5 = r14.A00
            java.util.List r5 = (java.util.List) r5
            X.1uN r3 = r13.this$0
            X.2xw r7 = r3.A03
            java.util.ArrayList r12 = X.C36321k7.A0J(r5)
            java.util.Iterator r2 = r5.iterator()
        L_0x004e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r2.next()
            X.8t4 r0 = (X.C184828t4) r0
            java.lang.String r0 = r0.A01
            X.AnonymousClass00C.A08(r0)
            r12.add(r0)
            goto L_0x004e
        L_0x0063:
            X.1Mz r0 = r7.A00
            X.0tq r2 = r0.A01
            X.0wo r8 = X.C36351kA.A0V(r2)
            X.004 r0 = r2.A1k
            java.lang.Object r9 = r0.get()
            X.163 r9 = (X.AnonymousClass163) r9
            X.004 r0 = r2.A2b
            java.lang.Object r10 = r0.get()
            X.12g r10 = (X.AnonymousClass12g) r10
            X.004 r0 = r2.A5G
            java.lang.Object r11 = r0.get()
            X.12P r11 = (X.AnonymousClass12P) r11
            X.39U r7 = new X.39U
            r7.<init>(r8, r9, r10, r11, r12)
            r3.A00 = r7
            X.1uN r0 = r13.this$0
            X.39U r3 = r0.A00
            if (r3 == 0) goto L_0x0013
            X.147 r2 = r0.A06
            r13.L$0 = r5
            r13.label = r1
            X.02m r1 = X.AnonymousClass19R.A01
            com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2 r0 = new com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2
            r0.<init>(r4, r2, r3, r4)
            java.lang.Object r14 = X.AnonymousClass0A2.A00(r13, r1, r0)
            if (r14 != r6) goto L_0x0012
            return r6
        L_0x00a4:
            X.1uN r0 = r13.this$0
            X.00s r1 = r0.A02
            X.09w r0 = X.C023409w.A00
            X.011 r0 = X.C36441kJ.A19(r4, r0)
            goto L_0x001b
        L_0x00b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesViewModel$fetchReportedMessages$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
