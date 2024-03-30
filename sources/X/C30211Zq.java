package X;

/* renamed from: X.1Zq  reason: invalid class name and case insensitive filesystem */
public final class C30211Zq {
    public final C220412q A00;
    public final C30201Zp A01;
    public final AnonymousClass1ZM A02;

    public C30211Zq(C220412q r2, AnonymousClass1ZM r3, C30201Zp r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.C05600Qi.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0109, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C28981Uw r14, java.util.List r15, java.util.List r16) {
        /*
            r13 = this;
            r3 = 1
            r0 = 2
            r2 = r16
            X.AnonymousClass00C.A0D(r2, r0)
            X.12q r1 = r13.A00
            r0 = 0
            X.3Qp r4 = r1.A09(r14, r0)
            boolean r0 = r4 instanceof X.C44072La
            if (r0 == 0) goto L_0x014d
            X.2La r4 = (X.C44072La) r4
            if (r4 == 0) goto L_0x014d
            java.util.Iterator r12 = r2.iterator()
        L_0x001a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r8 = r12.next()
            X.3T1 r8 = (X.AnonymousClass3T1) r8
            X.1Zp r7 = r13.A01
            r11 = 0
            X.AnonymousClass00C.A0D(r8, r11)
            X.12P r0 = r7.A02     // Catch:{ all -> 0x0065 }
            X.1M0 r10 = r0.A05()     // Catch:{ all -> 0x0065 }
            X.14e r9 = r10.A02     // Catch:{ all -> 0x005e }
            java.lang.String r6 = "newsletter_message_enforcements"
            java.lang.String r5 = "message_row_id = ?"
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x005e }
            long r0 = r8.A1N     // Catch:{ all -> 0x005e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x005e }
            r2[r11] = r0     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/removeMessageEnforcement"
            r9.A03(r6, r5, r0, r2)     // Catch:{ all -> 0x005e }
            r10.close()     // Catch:{ all -> 0x0065 }
            X.1DQ r0 = r7.A00     // Catch:{ all -> 0x0065 }
            android.os.Handler r2 = r0.A02     // Catch:{ all -> 0x0065 }
            r1 = 40
            X.1jB r0 = new X.1jB     // Catch:{ all -> 0x0065 }
            r0.<init>(r7, r8, r1)     // Catch:{ all -> 0x0065 }
            boolean r0 = r2.post(r0)     // Catch:{ all -> 0x0065 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0065 }
            goto L_0x006b
        L_0x005e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            X.C05600Qi.A00(r10, r1)     // Catch:{ all -> 0x0065 }
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x006b:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)
            if (r1 == 0) goto L_0x001a
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/failed to remove message enforcement"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x001a
        L_0x0077:
            X.1Zp r5 = r13.A01
            java.util.ArrayList r1 = r5.A00(r4)
            r0 = 10
            int r0 = X.AnonymousClass03U.A06(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x008c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r1.next()
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Qa r0 = r0.A1J
            r3.add(r0)
            goto L_0x008c
        L_0x009e:
            java.util.Iterator r10 = r15.iterator()
        L_0x00a2:
            r9 = 0
        L_0x00a3:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0123
            java.lang.Object r6 = r10.next()
            X.3T1 r6 = (X.AnonymousClass3T1) r6
            X.3Qa r2 = r6.A1J
            boolean r0 = r3.contains(r2)
            if (r0 == 0) goto L_0x00d1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "NewsletterMessageEnforcementUpdater/skipping adding enforcement for msg: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " due to already existing"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00a3
        L_0x00d1:
            X.12P r0 = r5.A02     // Catch:{ all -> 0x010e }
            X.1M0 r8 = r0.A05()     // Catch:{ all -> 0x010e }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0107 }
            r7.<init>()     // Catch:{ all -> 0x0107 }
            java.lang.String r2 = "message_row_id"
            long r0 = r6.A1N     // Catch:{ all -> 0x0107 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0107 }
            r7.put(r2, r0)     // Catch:{ all -> 0x0107 }
            X.14e r2 = r8.A02     // Catch:{ all -> 0x0107 }
            java.lang.String r1 = "newsletter_message_enforcements"
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/insertMessageEnforcement"
            r2.A05(r1, r0, r7)     // Catch:{ all -> 0x0107 }
            r8.close()     // Catch:{ all -> 0x010e }
            X.1DQ r0 = r5.A00     // Catch:{ all -> 0x010e }
            android.os.Handler r2 = r0.A02     // Catch:{ all -> 0x010e }
            r1 = 41
            X.1jB r0 = new X.1jB     // Catch:{ all -> 0x010e }
            r0.<init>(r5, r6, r1)     // Catch:{ all -> 0x010e }
            boolean r0 = r2.post(r0)     // Catch:{ all -> 0x010e }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x010e }
            goto L_0x0114
        L_0x0107:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ all -> 0x010e }
            throw r0     // Catch:{ all -> 0x010e }
        L_0x010e:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x0114:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)
            if (r1 == 0) goto L_0x0121
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/failed to insert message enforcement"
            com.whatsapp.util.Log.e(r0, r1)
            if (r9 == 0) goto L_0x00a2
        L_0x0121:
            r9 = 1
            goto L_0x00a3
        L_0x0123:
            if (r9 == 0) goto L_0x013a
            X.1ZM r3 = r13.A02
            X.2pQ r0 = X.C52432pQ.MESSAGE_ENFORCEMENT
            r2 = 1
            int r1 = r4.A01
            int r0 = r0.bitPosition
            int r2 = r2 << r0
            r2 = r2 | r1
        L_0x0130:
            X.1Ja r1 = r3.A00
            X.1Uw r0 = r4.A0J()
            r1.A08(r0, r2)
            return
        L_0x013a:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0152
            X.1ZM r3 = r13.A02
            X.2pQ r0 = X.C52432pQ.MESSAGE_ENFORCEMENT
            r2 = 1
            int r1 = r4.A01
            int r0 = r0.bitPosition
            int r2 = r2 << r0
            int r2 = ~r2
            r2 = r2 & r1
            goto L_0x0130
        L_0x014d:
            java.lang.String r0 = "NewsletterMessageEnforcementUpdater/Unexpectedly couldn't find newsletter to update"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30211Zq.A00(X.1Uw, java.util.List, java.util.List):void");
    }
}
