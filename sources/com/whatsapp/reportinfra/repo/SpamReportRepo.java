package com.whatsapp.reportinfra.repo;

import X.AnonymousClass00C;
import X.AnonymousClass16D;
import X.AnonymousClass196;
import X.AnonymousClass1CR;
import X.AnonymousClass1NJ;
import X.AnonymousClass1NM;
import X.C005502l;
import X.C20810yC;
import X.C220412q;
import X.C24541Cv;
import X.C25791Hr;
import X.C26151Jb;
import X.C36321k7;
import X.C36341k9;
import X.C64433Ny;

public final class SpamReportRepo {
    public final C25791Hr A00;
    public final AnonymousClass196 A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass1NM A03;
    public final C26151Jb A04;
    public final C220412q A05;
    public final C24541Cv A06;
    public final C20810yC A07;
    public final AnonymousClass1NJ A08;
    public final C64433Ny A09;
    public final AnonymousClass1CR A0A;
    public final C005502l A0B;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass141 r20, java.lang.String r21, java.util.List r22, X.C023509x r23) {
        /*
            r19 = this;
            r4 = r23
            r10 = r21
            boolean r0 = r4 instanceof X.C82733zB
            r9 = r19
            if (r0 == 0) goto L_0x0036
            r0 = r4
            X.3zB r0 = (X.C82733zB) r0
            int r3 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0036
            int r3 = r3 - r2
            r0.label = r3
        L_0x0018:
            java.lang.Object r7 = r0.result
            X.0AO r1 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r2 = r0.label
            r6 = 4
            r5 = 3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x005d
            if (r2 == r4) goto L_0x0054
            if (r2 == r3) goto L_0x004b
            if (r2 == r5) goto L_0x0041
            if (r2 != r6) goto L_0x003c
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.L$0
            com.whatsapp.reportinfra.repo.SpamReportRepo r9 = (com.whatsapp.reportinfra.repo.SpamReportRepo) r9
            goto L_0x0115
        L_0x0036:
            X.3zB r0 = new X.3zB
            r0.<init>(r9, r4)
            goto L_0x0018
        L_0x003c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0041:
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.L$0
            com.whatsapp.reportinfra.repo.SpamReportRepo r9 = (com.whatsapp.reportinfra.repo.SpamReportRepo) r9
            goto L_0x00ef
        L_0x004b:
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.L$0
            com.whatsapp.reportinfra.repo.SpamReportRepo r9 = (com.whatsapp.reportinfra.repo.SpamReportRepo) r9
            goto L_0x00ae
        L_0x0054:
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.L$0
            com.whatsapp.reportinfra.repo.SpamReportRepo r9 = (com.whatsapp.reportinfra.repo.SpamReportRepo) r9
            goto L_0x0088
        L_0x005d:
            X.AnonymousClass0AN.A00(r7)
            r7 = r20
            X.11F r8 = X.C36331k8.A0G(r7)     // Catch:{ Exception -> 0x012a }
            boolean r2 = r8 instanceof com.whatsapp.jid.UserJid     // Catch:{ Exception -> 0x012a }
            r11 = r22
            if (r2 == 0) goto L_0x008e
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8     // Catch:{ Exception -> 0x012a }
            r0.L$0 = r9     // Catch:{ Exception -> 0x012a }
            r0.L$1 = r10     // Catch:{ Exception -> 0x012a }
            r0.label = r4     // Catch:{ Exception -> 0x012a }
            r12 = 0
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendIndividualSpamReport$2 r13 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendIndividualSpamReport$2     // Catch:{ Exception -> 0x012a }
            r13.<init>(r8, r9, r10, r12)     // Catch:{ Exception -> 0x012a }
            X.02l r2 = r9.A0B     // Catch:{ Exception -> 0x012a }
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2 r6 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2     // Catch:{ Exception -> 0x012a }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x012a }
            java.lang.Object r7 = X.AnonymousClass0A2.A00(r0, r2, r6)     // Catch:{ Exception -> 0x012a }
            if (r7 != r1) goto L_0x008b
            return r1
        L_0x0088:
            X.AnonymousClass0AN.A00(r7)     // Catch:{ Exception -> 0x012a }
        L_0x008b:
            X.2uP r7 = (X.C55302uP) r7     // Catch:{ Exception -> 0x012a }
            return r7
        L_0x008e:
            boolean r2 = r8 instanceof X.AnonymousClass147     // Catch:{ Exception -> 0x012a }
            if (r2 == 0) goto L_0x00b4
            X.147 r8 = (X.AnonymousClass147) r8     // Catch:{ Exception -> 0x012a }
            r0.L$0 = r9     // Catch:{ Exception -> 0x012a }
            r0.L$1 = r10     // Catch:{ Exception -> 0x012a }
            r0.label = r3     // Catch:{ Exception -> 0x012a }
            r12 = 0
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendGroupSpamReport$2 r13 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendGroupSpamReport$2     // Catch:{ Exception -> 0x012a }
            r13.<init>(r8, r9, r10, r12)     // Catch:{ Exception -> 0x012a }
            X.02l r2 = r9.A0B     // Catch:{ Exception -> 0x012a }
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2 r6 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2     // Catch:{ Exception -> 0x012a }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x012a }
            java.lang.Object r7 = X.AnonymousClass0A2.A00(r0, r2, r6)     // Catch:{ Exception -> 0x012a }
            if (r7 != r1) goto L_0x00b1
            return r1
        L_0x00ae:
            X.AnonymousClass0AN.A00(r7)     // Catch:{ Exception -> 0x012a }
        L_0x00b1:
            X.2uP r7 = (X.C55302uP) r7     // Catch:{ Exception -> 0x012a }
            return r7
        L_0x00b4:
            boolean r2 = r8 instanceof X.C177528dw     // Catch:{ Exception -> 0x012a }
            if (r2 == 0) goto L_0x00f5
            r3 = 0
            if (r22 == 0) goto L_0x00c2
            boolean r2 = r11.isEmpty()     // Catch:{ Exception -> 0x012a }
            if (r2 != 0) goto L_0x00c2
            r4 = 0
        L_0x00c2:
            if (r4 != 0) goto L_0x00f5
            X.8dw r8 = (X.C177528dw) r8     // Catch:{ Exception -> 0x012a }
            X.3T1 r15 = X.C36411kG.A0n(r11, r3)     // Catch:{ Exception -> 0x012a }
            r0.L$0 = r9     // Catch:{ Exception -> 0x012a }
            r0.L$1 = r10     // Catch:{ Exception -> 0x012a }
            r0.label = r5     // Catch:{ Exception -> 0x012a }
            java.util.List r11 = X.C36371kC.A11(r15)     // Catch:{ Exception -> 0x012a }
            r12 = 0
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendStatusSpamReport$2 r13 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendStatusSpamReport$2     // Catch:{ Exception -> 0x012a }
            r14 = r8
            r16 = r9
            r17 = r10
            r18 = r12
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x012a }
            X.02l r2 = r9.A0B     // Catch:{ Exception -> 0x012a }
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2 r6 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2     // Catch:{ Exception -> 0x012a }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x012a }
            java.lang.Object r7 = X.AnonymousClass0A2.A00(r0, r2, r6)     // Catch:{ Exception -> 0x012a }
            if (r7 != r1) goto L_0x00f2
            return r1
        L_0x00ef:
            X.AnonymousClass0AN.A00(r7)     // Catch:{ Exception -> 0x012a }
        L_0x00f2:
            X.2uP r7 = (X.C55302uP) r7     // Catch:{ Exception -> 0x012a }
            return r7
        L_0x00f5:
            boolean r2 = r8 instanceof X.C28981Uw     // Catch:{ Exception -> 0x012a }
            if (r2 == 0) goto L_0x011b
            X.1Uw r8 = (X.C28981Uw) r8     // Catch:{ Exception -> 0x012a }
            r0.L$0 = r9     // Catch:{ Exception -> 0x012a }
            r0.L$1 = r10     // Catch:{ Exception -> 0x012a }
            r0.label = r6     // Catch:{ Exception -> 0x012a }
            r12 = 0
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendNewsLetterSpamReport$2 r13 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendNewsLetterSpamReport$2     // Catch:{ Exception -> 0x012a }
            r13.<init>(r8, r9, r10, r12)     // Catch:{ Exception -> 0x012a }
            X.02l r2 = r9.A0B     // Catch:{ Exception -> 0x012a }
            com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2 r6 = new com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2     // Catch:{ Exception -> 0x012a }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x012a }
            java.lang.Object r7 = X.AnonymousClass0A2.A00(r0, r2, r6)     // Catch:{ Exception -> 0x012a }
            if (r7 != r1) goto L_0x0118
            return r1
        L_0x0115:
            X.AnonymousClass0AN.A00(r7)     // Catch:{ Exception -> 0x012a }
        L_0x0118:
            X.2uP r7 = (X.C55302uP) r7     // Catch:{ Exception -> 0x012a }
            return r7
        L_0x011b:
            X.1Jb r1 = r9.A04     // Catch:{ Exception -> 0x012a }
            X.8zz r0 = X.C188648zz.A0b     // Catch:{ Exception -> 0x012a }
            r1.A00(r0, r10)     // Catch:{ Exception -> 0x012a }
            java.lang.String r1 = "SpamReportRepo: unrecognized jid"
            X.0wR r0 = new X.0wR     // Catch:{ Exception -> 0x012a }
            r0.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x012a }
            throw r0     // Catch:{ Exception -> 0x012a }
        L_0x012a:
            r2 = move-exception
            X.1Jb r1 = r9.A04
            X.8zz r0 = X.C188648zz.A0Z
            r1.A01(r0, r10, r2)
            X.2dI r7 = new X.2dI
            r7.<init>(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reportinfra.repo.SpamReportRepo.A00(X.141, java.lang.String, java.util.List, X.09x):java.lang.Object");
    }

    public SpamReportRepo(C25791Hr r2, AnonymousClass196 r3, AnonymousClass16D r4, AnonymousClass1NM r5, C26151Jb r6, C220412q r7, C24541Cv r8, C20810yC r9, AnonymousClass1NJ r10, C64433Ny r11, AnonymousClass1CR r12, C005502l r13) {
        C36321k7.A11(r9, r7, r4);
        AnonymousClass00C.A0D(r8, 5);
        C36321k7.A13(r12, r3, r10);
        AnonymousClass00C.A0D(r2, 10);
        C36341k9.A1G(r13, r5);
        this.A07 = r9;
        this.A05 = r7;
        this.A02 = r4;
        this.A04 = r6;
        this.A06 = r8;
        this.A0A = r12;
        this.A01 = r3;
        this.A08 = r10;
        this.A09 = r11;
        this.A00 = r2;
        this.A0B = r13;
        this.A03 = r5;
    }
}
