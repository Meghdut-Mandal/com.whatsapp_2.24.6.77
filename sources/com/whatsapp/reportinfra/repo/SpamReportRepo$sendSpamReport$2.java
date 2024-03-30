package com.whatsapp.reportinfra.repo;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.C009003v;
import X.C023509x;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2", f = "SpamReportRepo.kt", i = {0}, l = {154}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
public final class SpamReportRepo$sendSpamReport$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass141 $contact;
    public final /* synthetic */ AnonymousClass11F $jid;
    public final /* synthetic */ C009003v $reportLogic;
    public final /* synthetic */ String $reportOrigin;
    public final /* synthetic */ List $selectedMessages;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SpamReportRepo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpamReportRepo$sendSpamReport$2(AnonymousClass141 r2, AnonymousClass11F r3, SpamReportRepo spamReportRepo, String str, List list, C023509x r7, C009003v r8) {
        super(2, r7);
        this.this$0 = spamReportRepo;
        this.$jid = r3;
        this.$selectedMessages = list;
        this.$reportOrigin = str;
        this.$reportLogic = r8;
        this.$contact = r2;
    }

    public final C023509x create(Object obj, C023509x r10) {
        SpamReportRepo spamReportRepo = this.this$0;
        AnonymousClass11F r2 = this.$jid;
        List list = this.$selectedMessages;
        SpamReportRepo$sendSpamReport$2 spamReportRepo$sendSpamReport$2 = new SpamReportRepo$sendSpamReport$2(this.$contact, r2, spamReportRepo, this.$reportOrigin, list, r10, this.$reportLogic);
        spamReportRepo$sendSpamReport$2.L$0 = obj;
        return spamReportRepo$sendSpamReport$2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (X.C36401kF.A1Z(r9.A07) == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        if (r10 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
        if (r10.isEmpty() != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        if ((!r11) == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        r9.A00.A04(r6, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        r0 = r3.$reportLogic;
        r3.L$0 = r2;
        r3.label = 1;
        r1 = r0.invoke(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        if (r1 != r5) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        r9.A00.A02(r12, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, X.C65143Qx.A01(r8), 7, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r20
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r3 = r19
            int r0 = r3.label
            r4 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r4) goto L_0x00ff
            X.AnonymousClass0AN.A00(r1)
        L_0x0010:
            X.96o r1 = (X.C1900196o) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r1 instanceof X.C177778eM
            if (r0 == 0) goto L_0x002a
            X.2dJ r4 = X.AnonymousClass2dJ.A00
        L_0x001c:
            boolean r0 = r4 instanceof X.AnonymousClass2dJ
            if (r0 == 0) goto L_0x00f9
            com.whatsapp.reportinfra.repo.SpamReportRepo r7 = r3.this$0
            X.11F r6 = r3.$jid
            java.util.List r1 = r3.$selectedMessages
            X.141 r5 = r3.$contact
            goto L_0x00b4
        L_0x002a:
            boolean r0 = r1 instanceof X.C177768eL
            if (r0 == 0) goto L_0x003d
            X.8eL r1 = (X.C177768eL) r1
            X.9nx r1 = r1.A00
            X.2qE r0 = new X.2qE
            r0.<init>(r1)
        L_0x0037:
            X.2dI r4 = new X.2dI
            r4.<init>(r0)
            goto L_0x001c
        L_0x003d:
            boolean r0 = r1 instanceof X.C177788eN
            if (r0 == 0) goto L_0x00fa
            X.2qO r0 = X.C52922qO.A00
            goto L_0x0037
        L_0x0044:
            X.AnonymousClass0AN.A00(r1)
            java.lang.Object r2 = r3.L$0
            com.whatsapp.reportinfra.repo.SpamReportRepo r9 = r3.this$0
            X.11F r12 = r3.$jid
            java.util.List r10 = r3.$selectedMessages
            java.lang.String r8 = r3.$reportOrigin
            r6 = r10
            r0 = 0
            X.C36321k7.A0v(r12, r0, r8)
            r11 = 0
            if (r10 == 0) goto L_0x005f
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0070
        L_0x005f:
            X.12q r0 = r9.A05
            boolean r0 = r0.A0O(r12)
            if (r0 == 0) goto L_0x0070
            X.0yC r0 = r9.A07
            boolean r0 = X.C36401kF.A1Z(r0)
            r7 = 1
            if (r0 != 0) goto L_0x0071
        L_0x0070:
            r7 = 0
        L_0x0071:
            if (r10 == 0) goto L_0x0079
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0085
        L_0x0079:
            X.1Cv r1 = r9.A06
            r0 = 5
            java.util.ArrayList r6 = X.C24541Cv.A01(r1, r12, r0, r4, r7)
            X.AnonymousClass00C.A0B(r6)
            if (r10 == 0) goto L_0x008b
        L_0x0085:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x008c
        L_0x008b:
            r11 = 1
        L_0x008c:
            r0 = r11 ^ 1
            if (r0 == 0) goto L_0x00a3
            X.1Hr r1 = r9.A00
            r0 = 3
            r1.A04(r6, r0)
        L_0x0096:
            X.03v r0 = r3.$reportLogic
            r3.L$0 = r2
            r3.label = r4
            java.lang.Object r1 = r0.invoke(r6, r3)
            if (r1 != r5) goto L_0x0010
            return r5
        L_0x00a3:
            X.1Hr r11 = r9.A00
            int r16 = X.C65143Qx.A01(r8)
            r17 = 7
            r13 = 0
            r15 = r13
            r14 = r13
            r18 = r7
            r11.A02(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0096
        L_0x00b4:
            X.1NM r0 = r7.A03     // Catch:{ all -> 0x00e2 }
            r0.A0C(r6, r1)     // Catch:{ all -> 0x00e2 }
            X.1CR r2 = r7.A0A     // Catch:{ all -> 0x00e2 }
            boolean r0 = r2.A0k(r6)     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x00ce
            X.196 r1 = r7.A01     // Catch:{ all -> 0x00e2 }
            r0 = 0
            java.util.Set r0 = r1.A05(r6, r0)     // Catch:{ all -> 0x00e2 }
            r2.A0T(r6)     // Catch:{ all -> 0x00e2 }
            r1.A0Q(r0)     // Catch:{ all -> 0x00e2 }
        L_0x00ce:
            X.16D r2 = r7.A02     // Catch:{ all -> 0x00e2 }
            X.141 r1 = r2.A08(r6)     // Catch:{ all -> 0x00e2 }
            X.1NJ r0 = r7.A08     // Catch:{ all -> 0x00e2 }
            r0.A03(r1, r6)     // Catch:{ all -> 0x00e2 }
            r0 = 1
            r5.A0w = r0     // Catch:{ all -> 0x00e2 }
            r2.A0O(r5)     // Catch:{ all -> 0x00e2 }
            X.0AJ r1 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x00e2 }
            goto L_0x00e8
        L_0x00e2:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x00e8:
            com.whatsapp.reportinfra.repo.SpamReportRepo r0 = r3.this$0
            java.lang.String r3 = r3.$reportOrigin
            java.lang.Throwable r2 = X.AnonymousClass0AK.A00(r1)
            if (r2 == 0) goto L_0x00f9
            X.1Jb r1 = r0.A04
            X.8zz r0 = X.C188648zz.A0a
            r1.A01(r0, r3, r2)
        L_0x00f9:
            return r4
        L_0x00fa:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x00ff:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SpamReportRepo$sendSpamReport$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
