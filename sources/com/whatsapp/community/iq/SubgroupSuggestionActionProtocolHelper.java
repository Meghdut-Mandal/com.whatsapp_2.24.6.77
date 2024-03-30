package com.whatsapp.community.iq;

import X.AnonymousClass19A;

public final class SubgroupSuggestionActionProtocolHelper {
    public final AnonymousClass19A A00;

    /* JADX WARNING: type inference failed for: r2v15, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v72, types: [X.33b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x029a  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass147 r26, java.util.List r27, java.util.List r28, java.util.List r29, X.C023509x r30) {
        /*
            r25 = this;
            r3 = r30
            boolean r0 = r3 instanceof X.C82553yt
            r4 = r25
            if (r0 == 0) goto L_0x01c2
            r13 = r3
            X.3yt r13 = (X.C82553yt) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01c2
            int r2 = r2 - r1
            r13.label = r2
        L_0x0016:
            java.lang.Object r3 = r13.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r1 = r13.label
            r7 = 1
            r0 = 10
            if (r1 == 0) goto L_0x0102
            if (r1 != r7) goto L_0x02ab
            java.lang.Object r1 = r13.L$0
            X.33b r1 = (X.C592133b) r1
            X.AnonymousClass0AN.A00(r3)
        L_0x002a:
            X.96o r3 = (X.C1900196o) r3
            boolean r2 = r3 instanceof X.C177778eM
            if (r2 == 0) goto L_0x029a
            X.8eM r3 = (X.C177778eM) r3
            X.9nx r6 = r3.A00
            r17 = 0
            java.lang.String r2 = "iq"
            X.C203399nx.A0A(r6, r2)
            X.9nx r13 = r1.A00
            java.lang.String r1 = "type"
            java.lang.String[] r11 = new java.lang.String[]{r1}
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r1 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            r1 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            r12 = 0
            java.lang.String r10 = "result"
            X.C203379ns.A03(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r1 = "from"
            java.lang.String[] r23 = new java.lang.String[]{r1}
            java.lang.Class<X.147> r14 = X.AnonymousClass147.class
            java.lang.String r1 = "to"
            java.lang.String[] r18 = new java.lang.String[]{r1}
            r19 = 0
            r15 = r8
            r16 = r9
            java.lang.Object r22 = X.C203379ns.A03(r13, r14, r15, r16, r17, r18, r19)
            r24 = 1
            r18 = r6
            r19 = r14
            r20 = r8
            r21 = r9
            X.C203379ns.A03(r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r1 = "id"
            java.lang.String[] r20 = new java.lang.String[]{r1}
            java.lang.String[] r18 = new java.lang.String[]{r1}
            r19 = 0
            r14 = r7
            java.lang.Object r19 = X.C203379ns.A03(r13, r14, r15, r16, r17, r18, r19)
            r21 = 1
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r9
            X.C203379ns.A03(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r5 = "sub_group_suggestions_action"
            java.lang.String r1 = "approve"
            java.lang.String[] r2 = new java.lang.String[]{r5, r1}
            X.6y1 r1 = X.C147936y1.A00
            java.lang.Object r3 = X.C203379ns.A02(r6, r1, r2)
            X.1jK r3 = (X.C35831jK) r3
            java.lang.String r1 = "reject"
            java.lang.String[] r2 = new java.lang.String[]{r5, r1}
            X.6y2 r1 = X.AnonymousClass6y2.A00
            java.lang.Object r2 = X.C203379ns.A02(r6, r1, r2)
            X.1jK r2 = (X.C35831jK) r2
            java.lang.String r1 = "cancel"
            java.lang.String[] r4 = new java.lang.String[]{r5, r1}
            X.6y3 r1 = X.C147946y3.A00
            java.lang.Object r4 = X.C203379ns.A02(r6, r1, r4)
            X.1jK r4 = (X.C35831jK) r4
            java.lang.String[] r15 = new java.lang.String[]{r5}
            X.3pp r14 = X.C77023pp.A00
            r16 = 1
            r18 = 1
            r13 = r6
            java.util.ArrayList r1 = X.C203539oF.A09(r13, r14, r15, r16, r18)
            r1.get(r12)
            if (r4 == 0) goto L_0x01ec
            java.lang.Object r1 = r4.A00
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x01ec
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r1.iterator()
        L_0x00ed:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x01c9
            java.lang.Object r4 = r5.next()
            r1 = r4
            X.1jM r1 = (X.C35851jM) r1
            java.lang.Object r1 = r1.A01
            if (r1 == 0) goto L_0x00ed
            r6.add(r4)
            goto L_0x00ed
        L_0x0102:
            X.AnonymousClass0AN.A00(r3)
            X.19A r10 = r4.A00
            java.lang.String r12 = r10.A09()
            r9 = 0
            r2 = r27
            if (r27 == 0) goto L_0x0136
            int r1 = X.AnonymousClass03U.A06(r2, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r1)
            java.util.Iterator r4 = r2.iterator()
        L_0x011d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0138
            java.lang.Object r1 = r4.next()
            X.3Hu r1 = (X.C62853Hu) r1
            X.147 r3 = r1.A00
            com.whatsapp.jid.UserJid r2 = r1.A01
            X.1jQ r1 = new X.1jQ
            r1.<init>((X.AnonymousClass147) r3, (com.whatsapp.jid.UserJid) r2)
            r6.add(r1)
            goto L_0x011d
        L_0x0136:
            r8 = r9
            goto L_0x013e
        L_0x0138:
            r1 = 2
            X.1jQ r8 = new X.1jQ
            r8.<init>((java.util.List) r6, (int) r1)
        L_0x013e:
            r2 = r28
            if (r28 == 0) goto L_0x0168
            int r1 = X.AnonymousClass03U.A06(r2, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r6 = r2.iterator()
        L_0x014f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x016a
            java.lang.Object r1 = r6.next()
            X.3Hu r1 = (X.C62853Hu) r1
            X.147 r3 = r1.A00
            com.whatsapp.jid.UserJid r2 = r1.A01
            X.1jQ r1 = new X.1jQ
            r1.<init>((X.AnonymousClass147) r3, (com.whatsapp.jid.UserJid) r2)
            r4.add(r1)
            goto L_0x014f
        L_0x0168:
            r6 = r9
            goto L_0x0170
        L_0x016a:
            r1 = 6
            X.1jQ r6 = new X.1jQ
            r6.<init>((java.util.List) r4, (int) r1)
        L_0x0170:
            r2 = r29
            if (r29 == 0) goto L_0x019c
            int r1 = X.AnonymousClass03U.A06(r2, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r3 = r2.iterator()
        L_0x0181:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0196
            java.lang.Object r2 = r3.next()
            X.147 r2 = (X.AnonymousClass147) r2
            X.1jQ r1 = new X.1jQ
            r1.<init>(r2)
            r4.add(r1)
            goto L_0x0181
        L_0x0196:
            r1 = 4
            X.1jQ r9 = new X.1jQ
            r9.<init>((java.util.List) r4, (int) r1)
        L_0x019c:
            X.1jS r1 = new X.1jS
            r15 = r26
            r14 = r1
            r16 = r8
            r17 = r6
            r18 = r9
            r19 = r12
            r14.<init>((X.AnonymousClass147) r15, (X.C35891jQ) r16, (X.C35891jQ) r17, (X.C35891jQ) r18, (java.lang.String) r19)
            X.9nx r11 = r1.A00
            X.AnonymousClass00C.A08(r11)
            r13.L$0 = r1
            r13.label = r7
            r14 = 391(0x187, float:5.48E-43)
            r15 = 32000(0x7d00, double:1.581E-319)
            r17 = 0
            java.lang.Object r3 = r10.A08(r11, r12, r13, r14, r15, r17)
            if (r3 != r5) goto L_0x002a
            return r5
        L_0x01c2:
            X.3yt r13 = new X.3yt
            r13.<init>(r4, r3)
            goto L_0x0016
        L_0x01c9:
            int r1 = X.AnonymousClass03U.A06(r6, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r1)
            java.util.Iterator r4 = r6.iterator()
        L_0x01d6:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x01ee
            java.lang.Object r1 = r4.next()
            X.1jM r1 = (X.C35851jM) r1
            java.lang.Object r1 = r1.A02
            X.8rq r1 = (X.C184068rq) r1
            java.lang.Object r1 = r1.A00
            r5.add(r1)
            goto L_0x01d6
        L_0x01ec:
            X.09w r5 = X.C023409w.A00
        L_0x01ee:
            if (r3 == 0) goto L_0x023b
            java.lang.Object r1 = r3.A00
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x023b
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r1.iterator()
        L_0x01ff:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0214
            java.lang.Object r3 = r4.next()
            r1 = r3
            X.1jL r1 = (X.C35841jL) r1
            java.lang.Object r1 = r1.A00
            if (r1 == 0) goto L_0x01ff
            r6.add(r3)
            goto L_0x01ff
        L_0x0214:
            int r1 = X.AnonymousClass03U.A06(r6, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r3 = r6.iterator()
        L_0x0221:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x023d
            java.lang.Object r1 = r3.next()
            X.1jL r1 = (X.C35841jL) r1
            java.lang.Object r1 = r1.A01
            X.8t3 r1 = (X.C184818t3) r1
            java.lang.Object r1 = r1.A01
            X.8rq r1 = (X.C184068rq) r1
            java.lang.Object r1 = r1.A00
            r4.add(r1)
            goto L_0x0221
        L_0x023b:
            X.09w r4 = X.C023409w.A00
        L_0x023d:
            if (r2 == 0) goto L_0x028a
            java.lang.Object r1 = r2.A00
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x028a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r1.iterator()
        L_0x024e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0263
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.1jM r1 = (X.C35851jM) r1
            java.lang.Object r1 = r1.A02
            if (r1 == 0) goto L_0x024e
            r6.add(r2)
            goto L_0x024e
        L_0x0263:
            int r0 = X.AnonymousClass03U.A06(r6, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r6.iterator()
        L_0x0270:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x028c
            java.lang.Object r0 = r1.next()
            X.1jM r0 = (X.C35851jM) r0
            java.lang.Object r0 = r0.A01
            X.8t3 r0 = (X.C184818t3) r0
            java.lang.Object r0 = r0.A01
            X.8rq r0 = (X.C184068rq) r0
            java.lang.Object r0 = r0.A00
            r2.add(r0)
            goto L_0x0270
        L_0x028a:
            X.09w r2 = X.C023409w.A00
        L_0x028c:
            java.util.ArrayList r0 = X.C007103b.A0S(r4, r5)
            java.util.ArrayList r0 = X.C007103b.A0S(r2, r0)
            X.2F8 r1 = new X.2F8
            r1.<init>(r0)
            return r1
        L_0x029a:
            boolean r0 = r3 instanceof X.C177768eL
            if (r0 != 0) goto L_0x02a8
            boolean r0 = r3 instanceof X.C177788eN
            if (r0 != 0) goto L_0x02a8
            X.0jS r1 = new X.0jS
            r1.<init>()
            throw r1
        L_0x02a8:
            X.2F9 r1 = X.AnonymousClass2F9.A00
            return r1
        L_0x02ab:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.iq.SubgroupSuggestionActionProtocolHelper.A00(X.147, java.util.List, java.util.List, java.util.List, X.09x):java.lang.Object");
    }

    public SubgroupSuggestionActionProtocolHelper(AnonymousClass19A r1) {
        this.A00 = r1;
    }
}
