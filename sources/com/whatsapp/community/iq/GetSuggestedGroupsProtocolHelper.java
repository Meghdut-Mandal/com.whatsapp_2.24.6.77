package com.whatsapp.community.iq;

import X.AnonymousClass19A;
import java.util.concurrent.TimeUnit;

public final class GetSuggestedGroupsProtocolHelper {
    public final AnonymousClass19A A00;

    static {
        TimeUnit.SECONDS.toMillis(30);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C194519Qb r25, X.AnonymousClass147 r26, X.AnonymousClass147 r27, X.C023509x r28) {
        /*
            r24 = this;
            r5 = r28
            r14 = r26
            r2 = r25
            boolean r0 = r5 instanceof X.C82783zG
            r11 = r24
            if (r0 == 0) goto L_0x003a
            r0 = r5
            X.3zG r0 = (X.C82783zG) r0
            int r4 = r0.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r3
            if (r1 == 0) goto L_0x003a
            int r4 = r4 - r3
            r0.label = r4
        L_0x001a:
            java.lang.Object r9 = r0.result
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r5 = r0.label
            r8 = 5
            r3 = 4
            r7 = 3
            r6 = 2
            r10 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0049
            if (r5 == r10) goto L_0x007a
            if (r5 == r6) goto L_0x01d8
            if (r5 == r7) goto L_0x0040
            if (r5 == r3) goto L_0x01d8
            if (r5 == r8) goto L_0x01d8
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x003a:
            X.3zG r0 = new X.3zG
            r0.<init>(r11, r5)
            goto L_0x001a
        L_0x0040:
            java.lang.Object r2 = r0.L$0
            X.9Qb r2 = (X.C194519Qb) r2
            X.AnonymousClass0AN.A00(r9)     // Catch:{ 19b -> 0x01c4 }
            goto L_0x01db
        L_0x0049:
            X.AnonymousClass0AN.A00(r9)
            X.19A r9 = r11.A00
            java.lang.String r3 = r9.A09()
            X.1jS r5 = new X.1jS
            r1 = r27
            r5.<init>((X.AnonymousClass147) r14, (X.AnonymousClass147) r1, (java.lang.String) r3)
            X.9nx r1 = r5.A00
            X.AnonymousClass00C.A08(r1)
            r0.L$0 = r14
            r0.L$1 = r2
            r0.L$2 = r5
            r0.label = r10
            r19 = 403(0x193, float:5.65E-43)
            r20 = 32000(0x7d00, double:1.581E-319)
            r22 = 0
            r15 = r9
            r16 = r1
            r17 = r3
            r18 = r0
            java.lang.Object r9 = r15.A08(r16, r17, r18, r19, r20, r22)
            if (r9 != r4) goto L_0x0089
            return r4
        L_0x007a:
            java.lang.Object r5 = r0.L$2
            X.1jS r5 = (X.C35911jS) r5
            java.lang.Object r2 = r0.L$1
            X.9Qb r2 = (X.C194519Qb) r2
            java.lang.Object r14 = r0.L$0
            X.147 r14 = (X.AnonymousClass147) r14
            X.AnonymousClass0AN.A00(r9)
        L_0x0089:
            X.96o r9 = (X.C1900196o) r9
            X.8eN r1 = X.C177788eN.A00
            boolean r3 = X.AnonymousClass00C.A0J(r9, r1)
            r1 = 0
            if (r3 == 0) goto L_0x00a2
            r0.L$0 = r1
            r0.L$1 = r1
            r0.L$2 = r1
            r0.label = r6
            java.lang.Object r0 = r2.A00(r1, r0)
            goto L_0x01d5
        L_0x00a2:
            boolean r3 = r9 instanceof X.C177768eL
            if (r3 == 0) goto L_0x00de
            X.8eL r9 = (X.C177768eL) r9     // Catch:{ 19b -> 0x00db }
            X.9nx r3 = r9.A00     // Catch:{ 19b -> 0x00db }
            X.8vQ r9 = new X.8vQ     // Catch:{ 19b -> 0x00db }
            r9.<init>(r3, r5)     // Catch:{ 19b -> 0x00db }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ 19b -> 0x00db }
            r8.<init>()     // Catch:{ 19b -> 0x00db }
            java.lang.String r3 = "Fetching subgroup suggestions failed: "
            r8.append(r3)     // Catch:{ 19b -> 0x00db }
            X.B01 r3 = r9.A00     // Catch:{ 19b -> 0x00db }
            java.lang.Long r3 = r3.B9o()     // Catch:{ 19b -> 0x00db }
            long r5 = r3.longValue()     // Catch:{ 19b -> 0x00db }
            r8.append(r5)     // Catch:{ 19b -> 0x00db }
            java.lang.String r3 = r8.toString()     // Catch:{ 19b -> 0x00db }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 19b -> 0x00db }
            r0.L$0 = r2     // Catch:{ 19b -> 0x00db }
            r0.L$1 = r1     // Catch:{ 19b -> 0x00db }
            r0.L$2 = r1     // Catch:{ 19b -> 0x00db }
            r0.label = r7     // Catch:{ 19b -> 0x00db }
            java.lang.Object r0 = r2.A00(r9, r0)     // Catch:{ 19b -> 0x00db }
            goto L_0x01d5
        L_0x00db:
            r3 = move-exception
            goto L_0x01c5
        L_0x00de:
            boolean r3 = r9 instanceof X.C177778eM
            if (r3 == 0) goto L_0x01db
            X.8eM r9 = (X.C177778eM) r9
            X.9nx r15 = r9.A00
            java.lang.String r3 = "iq"
            X.C203399nx.A0A(r15, r3)
            X.9nx r6 = r5.A00
            X.AMo r5 = X.C21466AMo.A00
            java.lang.String r7 = "sub_group_suggestions"
            java.lang.String[] r3 = new java.lang.String[]{r7}
            java.lang.Object r3 = X.C203539oF.A06(r15, r5, r3)
            X.8si r3 = (X.C184608si) r3
            X.3pi r9 = new X.3pi
            r9.<init>(r6)
            r5 = 0
            java.lang.String[] r6 = new java.lang.String[r5]
            X.C203539oF.A06(r15, r9, r6)
            java.lang.String r6 = "sub_group_suggestion"
            java.lang.String[] r17 = new java.lang.String[]{r7, r6}
            X.AMp r16 = X.C21467AMp.A00
            r18 = 0
            r20 = 1000(0x3e8, double:4.94E-321)
            r9 = 0
            java.util.ArrayList r6 = X.C203539oF.A09(r15, r16, r17, r18, r20)
            java.lang.String[] r17 = new java.lang.String[]{r7}
            X.3po r16 = X.C77013po.A00
            r18 = 1
            r20 = 1
            java.util.ArrayList r7 = X.C203539oF.A09(r15, r16, r17, r18, r20)
            r7.get(r5)
            java.lang.String r5 = r3.A00
            X.AnonymousClass00C.A08(r5)
            r3 = 10
            int r7 = X.AnonymousClass03U.A06(r6, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r7)
            java.util.Iterator r12 = r6.iterator()
        L_0x013c:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x01a5
            java.lang.Object r10 = r12.next()
            X.8sK r10 = (X.C184368sK) r10
            X.8rq r6 = r10.A02
            if (r6 == 0) goto L_0x01a3
            java.lang.Object r6 = r6.A00
            java.lang.Number r6 = (java.lang.Number) r6
        L_0x0150:
            if (r6 != 0) goto L_0x019e
            r21 = 0
        L_0x0154:
            X.8sj r6 = r10.A03
            if (r6 == 0) goto L_0x019c
            java.lang.String r7 = r6.A00
        L_0x015a:
            java.lang.String r6 = "true"
            boolean r23 = X.AnonymousClass00C.A0J(r7, r6)
            X.8t3 r6 = r10.A00
            java.lang.Object r7 = r6.A01
            X.8rq r7 = (X.C184068rq) r7
            java.lang.Object r15 = r7.A00
            X.147 r15 = (X.AnonymousClass147) r15
            X.AnonymousClass00C.A08(r15)
            java.lang.String r11 = r10.A05
            X.8rq r7 = r10.A01
            if (r7 == 0) goto L_0x019a
            java.lang.Object r7 = r7.A00
            X.8rj r7 = (X.C183998rj) r7
            if (r7 == 0) goto L_0x019a
            java.lang.String r7 = r7.A00
        L_0x017b:
            java.lang.Object r6 = r6.A00
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            X.AnonymousClass00C.A08(r6)
            java.lang.Long r10 = r10.A04
            X.AnonymousClass00C.A08(r10)
            long r19 = r10.longValue()
            X.3KN r13 = new X.3KN
            r17 = r11
            r18 = r7
            r16 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r21, r23)
            r3.add(r13)
            goto L_0x013c
        L_0x019a:
            r7 = r1
            goto L_0x017b
        L_0x019c:
            r7 = r1
            goto L_0x015a
        L_0x019e:
            long r21 = r6.longValue()
            goto L_0x0154
        L_0x01a3:
            r6 = r1
            goto L_0x0150
        L_0x01a5:
            X.3Hy r6 = new X.3Hy
            r6.<init>(r5, r3)
            r0.L$0 = r1
            r0.L$1 = r1
            r0.L$2 = r1
            r0.label = r8
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r3 = r2.A00
            X.147 r2 = r2.A01
            java.util.List r1 = r6.A00
            r3.A06(r2, r1)
            java.lang.Object r0 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager.A01(r3, r2, r0, r9)
            if (r0 == r4) goto L_0x01d5
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            goto L_0x01d5
        L_0x01c4:
            r3 = move-exception
        L_0x01c5:
            com.whatsapp.util.Log.e((java.lang.Throwable) r3)
            r0.L$0 = r1
            r0.L$1 = r1
            r0.L$2 = r1
            r3 = 4
            r0.label = r3
            java.lang.Object r0 = r2.A00(r1, r0)
        L_0x01d5:
            if (r0 != r4) goto L_0x01db
            return r4
        L_0x01d8:
            X.AnonymousClass0AN.A00(r9)
        L_0x01db:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.iq.GetSuggestedGroupsProtocolHelper.A00(X.9Qb, X.147, X.147, X.09x):java.lang.Object");
    }

    public GetSuggestedGroupsProtocolHelper(AnonymousClass19A r1) {
        this.A00 = r1;
    }
}
