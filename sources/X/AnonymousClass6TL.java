package X;

import java.util.Map;

/* renamed from: X.6TL  reason: invalid class name */
public final class AnonymousClass6TL {
    public final C19700wN A00;
    public final C19630wG A01;
    public final AnonymousClass1KW A02;
    public final AnonymousClass1KV A03;
    public final C20810yC A04;
    public final C18910u1 A05 = C165307tD.A00(this, 8);
    public final C19970wo A06;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedList A01(X.C1494971l r3) {
        /*
            r1 = 0
            java.io.InputStream[] r0 = r3.A00
            r3 = r0[r1]
            int r0 = r3.available()     // Catch:{ all -> 0x0030 }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0030 }
            r3.read(r0)     // Catch:{ all -> 0x0030 }
            java.io.ByteArrayInputStream r0 = X.C90524aI.A0P(r0)     // Catch:{ all -> 0x0030 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0030 }
            r2.<init>(r0)     // Catch:{ all -> 0x0030 }
            java.lang.Object r1 = r2.readObject()     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = "null cannot be cast to non-null type java.util.LinkedList<kotlin.collections.Map<kotlin.String, kotlin.String?>>"
            X.AnonymousClass00C.A0E(r1, r0)     // Catch:{ all -> 0x0029 }
            java.util.LinkedList r1 = (java.util.LinkedList) r1     // Catch:{ all -> 0x0029 }
            r2.close()     // Catch:{ all -> 0x0030 }
            r3.close()
            return r1
        L_0x0029:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002b }
        L_0x002b:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0030 }
            throw r0     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6TL.A01(X.71l):java.util.LinkedList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r3.length() == 0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A02(java.lang.String r13) {
        /*
            r12 = this;
            r1 = 0
            X.AnonymousClass00C.A0D(r13, r1)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            X.1KW r0 = r12.A02     // Catch:{ Exception -> 0x0050 }
            X.0u1 r0 = r0.A00     // Catch:{ Exception -> 0x0050 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0050 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ Exception -> 0x0050 }
            java.lang.String r3 = X.C36371kC.A0t(r0, r13)     // Catch:{ Exception -> 0x0050 }
            if (r3 == 0) goto L_0x001f
            int r2 = r3.length()     // Catch:{ Exception -> 0x0050 }
            r0 = 0
            if (r2 != 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = ","
            java.util.List r0 = X.C90494aF.A0i(r3, r0)     // Catch:{ Exception -> 0x0050 }
            java.lang.String[] r7 = X.C36431kI.A1b(r0)     // Catch:{ Exception -> 0x0050 }
            int r6 = r7.length     // Catch:{ Exception -> 0x0050 }
            r4 = 0
        L_0x002e:
            if (r4 >= r6) goto L_0x0070
            r3 = r7[r4]     // Catch:{ Exception -> 0x0050 }
            X.0u1 r0 = r12.A05     // Catch:{ Exception -> 0x0050 }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x0050 }
            X.71z r2 = (X.C1496071z) r2     // Catch:{ Exception -> 0x0050 }
            java.lang.String r0 = X.C90464aC.A0d(r13, r3)     // Catch:{ Exception -> 0x0050 }
            X.71l r0 = r2.A0B(r0)     // Catch:{ Exception -> 0x0050 }
            if (r0 == 0) goto L_0x004d
            java.util.LinkedList r0 = A01(r0)     // Catch:{ Exception -> 0x0050 }
            if (r0 == 0) goto L_0x004d
            r5.addAll(r0)     // Catch:{ Exception -> 0x0050 }
        L_0x004d:
            int r4 = r4 + 1
            goto L_0x002e
        L_0x0050:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FlowsLogger/readSessionDataForFlowsMessageId throws exception"
            X.C36321k7.A1W(r0, r2, r3)
            X.0wN r4 = r12.A00
            java.lang.String r3 = r3.getMessage()
            X.0yC r2 = r12.A04
            r0 = 3178(0xc6a, float:4.453E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 != 0) goto L_0x006b
            r3 = 0
        L_0x006b:
            java.lang.String r0 = "FlowsLogger/readSessionDataForFlowsMessageId"
            r4.A0E(r0, r3, r1)
        L_0x0070:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00cb
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r5.iterator()
        L_0x007e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r3 = r4.next()
            java.util.Map r3 = (java.util.Map) r3
            X.AnonymousClass00C.A0D(r3, r1)
            java.lang.String r0 = "data"
            java.lang.String r6 = X.C36431kI.A1A(r0, r3)
            r5 = 0
            if (r6 == 0) goto L_0x00c5
            java.lang.String r0 = "extension_id"
            java.lang.String r7 = X.C36431kI.A1A(r0, r3)
            if (r7 == 0) goto L_0x00c5
            java.lang.String r0 = "session_id"
            java.lang.String r8 = X.C36431kI.A1A(r0, r3)
            if (r8 == 0) goto L_0x00c5
            java.lang.String r0 = "name"
            java.lang.String r10 = X.C36431kI.A1A(r0, r3)
            if (r10 == 0) goto L_0x00c5
            java.lang.String r0 = "t"
            java.lang.String r9 = X.C36431kI.A1A(r0, r3)
            if (r9 == 0) goto L_0x00c5
            java.lang.String r0 = "entry_point"
            java.lang.String r11 = X.C36431kI.A1A(r0, r3)
            if (r11 != 0) goto L_0x00c0
            java.lang.String r11 = "message_cta"
        L_0x00c0:
            X.6DH r5 = new X.6DH
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x00c5:
            if (r5 == 0) goto L_0x007e
            r2.add(r5)
            goto L_0x007e
        L_0x00cb:
            X.09w r2 = X.C023409w.A00
        L_0x00cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6TL.A02(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01fc, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.util.Map r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            r3 = 0
            X.AnonymousClass00C.A0D(r10, r3)     // Catch:{ all -> 0x0209 }
            X.C36321k7.A0x(r11, r12)     // Catch:{ all -> 0x0209 }
            X.1KV r5 = r9.A03     // Catch:{ IOException -> 0x01fd }
            X.6BP r0 = r5.A01(r10)     // Catch:{ IOException -> 0x01fd }
            if (r0 == 0) goto L_0x0017
            int r0 = r0.A00     // Catch:{ IOException -> 0x01fd }
        L_0x0012:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01fd }
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x0012
        L_0x0019:
            if (r0 == 0) goto L_0x0030
            java.lang.String r2 = r0.toString()     // Catch:{ IOException -> 0x01fd }
            if (r2 == 0) goto L_0x0030
            X.0wo r0 = r9.A06     // Catch:{ IOException -> 0x01fd }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ IOException -> 0x01fd }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x01fd }
            X.6DH r6 = A00(r11, r12, r0, r2, r14)     // Catch:{ IOException -> 0x01fd }
            goto L_0x0040
        L_0x0030:
            X.0wo r0 = r9.A06     // Catch:{ IOException -> 0x01fd }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ IOException -> 0x01fd }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x01fd }
            java.lang.String r0 = "message_cta"
            X.6DH r6 = A00(r11, r12, r1, r0, r14)     // Catch:{ IOException -> 0x01fd }
        L_0x0040:
            if (r6 != 0) goto L_0x0052
            java.lang.String r0 = "FlowsLogger/storeDataForReporting data to be stored is missing parameters"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x01fd }
            X.0wN r2 = r9.A00     // Catch:{ IOException -> 0x01fd }
            java.lang.String r1 = "userActions/storeDataForReporting"
            java.lang.String r0 = "data to be stored is missing parameters"
            r2.A0E(r1, r0, r3)     // Catch:{ IOException -> 0x01fd }
            goto L_0x0207
        L_0x0052:
            java.lang.String r4 = X.C90464aC.A0d(r10, r11)     // Catch:{ IOException -> 0x01fd }
            X.0u1 r3 = r9.A05     // Catch:{ IOException -> 0x01fd }
            java.lang.Object r0 = r3.get()     // Catch:{ IOException -> 0x01fd }
            X.71z r0 = (X.C1496071z) r0     // Catch:{ IOException -> 0x01fd }
            X.66k r8 = X.C1496071z.A00(r0, r4)     // Catch:{ IOException -> 0x01fd }
            if (r8 == 0) goto L_0x0207
            r7 = 0
            r0 = 6
            X.011[] r2 = new X.AnonymousClass011[r0]     // Catch:{ IOException -> 0x01fd }
            java.lang.String r1 = r6.A02     // Catch:{ IOException -> 0x01fd }
            java.lang.String r0 = "data"
            X.C36341k9.A1J(r0, r1, r2, r7)     // Catch:{ IOException -> 0x01fd }
            java.lang.String r1 = r6.A00     // Catch:{ IOException -> 0x01fd }
            java.lang.String r0 = "extension_id"
            X.C90464aC.A1F(r0, r1, r2)     // Catch:{ IOException -> 0x01fd }
            java.lang.String r1 = r6.A05     // Catch:{ IOException -> 0x01fd }
            java.lang.String r0 = "session_id"
            X.C90474aD.A1F(r0, r1, r2)     // Catch:{ IOException -> 0x01fd }
            java.lang.String r1 = r6.A01     // Catch:{ IOException -> 0x01fd }
            java.lang.String r0 = "t"
            X.C90474aD.A1G(r0, r1, r2)     // Catch:{ IOException -> 0x01fd }
            java.lang.String r1 = r6.A04     // Catch:{ IOException -> 0x01fd }
            java.lang.String r0 = "name"
            X.C90484aE.A1H(r0, r1, r2)     // Catch:{ IOException -> 0x01fd }
            java.lang.String r1 = r6.A03     // Catch:{ IOException -> 0x01fd }
            java.lang.String r0 = "entry_point"
            X.011 r1 = X.C36441kJ.A19(r0, r1)     // Catch:{ IOException -> 0x01fd }
            r0 = 5
            r2[r0] = r1     // Catch:{ IOException -> 0x01fd }
            java.util.LinkedHashMap r2 = X.C000400e.A07(r2)     // Catch:{ IOException -> 0x01fd }
            java.lang.Object r0 = r3.get()     // Catch:{ IOException -> 0x01fd }
            X.71z r0 = (X.C1496071z) r0     // Catch:{ IOException -> 0x01fd }
            X.71l r1 = r0.A0B(r4)     // Catch:{ IOException -> 0x01fd }
            if (r1 == 0) goto L_0x00cb
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)     // Catch:{ IOException -> 0x01fd }
            java.util.LinkedList r6 = A01(r1)     // Catch:{ IOException -> 0x01fd }
            X.0yC r1 = r9.A04     // Catch:{ IOException -> 0x01fd }
            r0 = 3211(0xc8b, float:4.5E-42)
            int r1 = r1.A07(r0)     // Catch:{ IOException -> 0x01fd }
            boolean r0 = X.AnonymousClass000.A1R(r1)
            X.C18740tg.A0B(r0)     // Catch:{ IOException -> 0x01fd }
        L_0x00bd:
            int r0 = r6.size()     // Catch:{ IOException -> 0x01fd }
            if (r0 < r1) goto L_0x00c7
            r6.poll()     // Catch:{ IOException -> 0x01fd }
            goto L_0x00bd
        L_0x00c7:
            r6.add(r2)     // Catch:{ IOException -> 0x01fd }
            goto L_0x00d4
        L_0x00cb:
            java.util.List r0 = X.C36371kC.A11(r2)     // Catch:{ IOException -> 0x01fd }
            java.util.LinkedList r6 = new java.util.LinkedList     // Catch:{ IOException -> 0x01fd }
            r6.<init>(r0)     // Catch:{ IOException -> 0x01fd }
        L_0x00d4:
            java.io.ByteArrayOutputStream r4 = X.C90524aI.A0Q()     // Catch:{ IOException -> 0x01fd }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x01f6 }
            r2.<init>(r4)     // Catch:{ all -> 0x01f6 }
            r2.writeObject(r6)     // Catch:{ all -> 0x01ef }
            r2.close()     // Catch:{ all -> 0x01f6 }
            byte[] r1 = r4.toByteArray()     // Catch:{ all -> 0x01f6 }
            r4.close()     // Catch:{ IOException -> 0x01fd }
            X.AnonymousClass00C.A08(r1)     // Catch:{ IOException -> 0x01fd }
            X.5Qz r0 = r8.A00()     // Catch:{ IOException -> 0x00f8 }
            r0.write(r1)     // Catch:{ IOException -> 0x00f8 }
            r8.A01()     // Catch:{ IOException -> 0x00f8 }
            goto L_0x0102
        L_0x00f8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x01fd }
            java.lang.String r0 = "FlowsLogger/FcsConfigDiskCache/writeToDisk: "
            X.C36321k7.A1J(r2, r0, r1)     // Catch:{ IOException -> 0x01fd }
        L_0x0102:
            if (r13 == 0) goto L_0x010e
            X.6BP r0 = r5.A01(r10)     // Catch:{ IOException -> 0x01fd }
            if (r0 == 0) goto L_0x0171
            int r0 = r0.A00     // Catch:{ IOException -> 0x01fd }
            if (r0 != 0) goto L_0x0171
        L_0x010e:
            X.0yC r1 = r9.A04     // Catch:{ IOException -> 0x01fd }
            r0 = 3212(0xc8c, float:4.501E-42)
            int r8 = r1.A07(r0)     // Catch:{ IOException -> 0x01fd }
            boolean r0 = X.AnonymousClass000.A1R(r8)
            X.C18740tg.A0B(r0)     // Catch:{ IOException -> 0x01fd }
            X.1KW r0 = r9.A02     // Catch:{ IOException -> 0x01fd }
            X.0u1 r6 = r0.A00     // Catch:{ IOException -> 0x01fd }
            java.lang.Object r0 = r6.get()     // Catch:{ IOException -> 0x01fd }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ IOException -> 0x01fd }
            r7 = 0
            java.lang.String r2 = r0.getString(r10, r7)     // Catch:{ IOException -> 0x01fd }
            if (r2 == 0) goto L_0x01e7
            int r0 = r2.length()     // Catch:{ IOException -> 0x01fd }
            if (r0 == 0) goto L_0x01e7
            java.lang.String r5 = ","
            java.lang.String[] r1 = new java.lang.String[]{r5}     // Catch:{ IOException -> 0x01fd }
            r0 = 0
            java.util.List r0 = X.AnonymousClass099.A0L(r2, r1, r0)     // Catch:{ IOException -> 0x01fd }
            java.util.ArrayList r4 = X.C90504aG.A0u(r0)     // Catch:{ IOException -> 0x01fd }
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()     // Catch:{ IOException -> 0x01fd }
        L_0x0147:
            int r0 = r4.size()     // Catch:{ IOException -> 0x01fd }
            if (r0 < r8) goto L_0x01b5
            java.lang.Object r0 = X.C007103b.A0N(r4)     // Catch:{ IOException -> 0x01fd }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r11)     // Catch:{ IOException -> 0x01fd }
            if (r0 != 0) goto L_0x01b5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r10)     // Catch:{ IOException -> 0x01fd }
            r0 = 58
            r1.append(r0)     // Catch:{ IOException -> 0x01fd }
            java.lang.Object r0 = X.AnonymousClass3R6.A00(r4)     // Catch:{ IOException -> 0x01fd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x01fd }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ IOException -> 0x01fd }
            r2.add(r0)     // Catch:{ IOException -> 0x01fd }
            X.AnonymousClass03Y.A09(r4)     // Catch:{ IOException -> 0x01fd }
            goto L_0x0147
        L_0x0171:
            X.1KW r5 = r9.A02     // Catch:{ IOException -> 0x01fd }
            X.0u1 r0 = r5.A00     // Catch:{ IOException -> 0x01fd }
            java.lang.Object r2 = r0.get()     // Catch:{ IOException -> 0x01fd }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ IOException -> 0x01fd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x01fd }
            java.lang.String r0 = "messageless_flow_ids_per_business_"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r13, r1)     // Catch:{ IOException -> 0x01fd }
            r4 = 0
            java.lang.String r1 = r2.getString(r0, r4)     // Catch:{ IOException -> 0x01fd }
            if (r1 == 0) goto L_0x01b0
            int r0 = r1.length()     // Catch:{ IOException -> 0x01fd }
            if (r0 == 0) goto L_0x01b0
            java.lang.String r2 = ","
            java.util.List r0 = X.C90494aF.A0i(r1, r2)     // Catch:{ IOException -> 0x01fd }
            java.util.ArrayList r1 = X.C90504aG.A0u(r0)     // Catch:{ IOException -> 0x01fd }
            boolean r0 = r1.contains(r10)     // Catch:{ IOException -> 0x01fd }
            if (r0 != 0) goto L_0x010e
            r1.add(r10)     // Catch:{ IOException -> 0x01fd }
            java.lang.String r0 = ""
            java.lang.String r0 = X.C007103b.A0Q(r2, r0, r0, r1, r4)     // Catch:{ IOException -> 0x01fd }
            r5.A04(r13, r0)     // Catch:{ IOException -> 0x01fd }
            goto L_0x010e
        L_0x01b0:
            r5.A04(r13, r10)     // Catch:{ IOException -> 0x01fd }
            goto L_0x010e
        L_0x01b5:
            java.lang.Object r0 = X.C007103b.A0N(r4)     // Catch:{ IOException -> 0x01fd }
            boolean r0 = X.AnonymousClass00C.A0J(r0, r11)     // Catch:{ IOException -> 0x01fd }
            if (r0 != 0) goto L_0x01c2
            r4.add(r11)     // Catch:{ IOException -> 0x01fd }
        L_0x01c2:
            java.lang.String r0 = ""
            java.lang.String r1 = X.C007103b.A0Q(r5, r0, r0, r4, r7)     // Catch:{ IOException -> 0x01fd }
            android.content.SharedPreferences$Editor r0 = X.C90504aG.A0H(r6)     // Catch:{ IOException -> 0x01fd }
            X.C36341k9.A0x(r0, r10, r1)     // Catch:{ IOException -> 0x01fd }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IOException -> 0x01fd }
        L_0x01d3:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x01fd }
            if (r0 == 0) goto L_0x0207
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)     // Catch:{ IOException -> 0x01fd }
            java.lang.Object r0 = r3.get()     // Catch:{ IOException -> 0x01fd }
            X.71z r0 = (X.C1496071z) r0     // Catch:{ IOException -> 0x01fd }
            r0.A0C(r1)     // Catch:{ IOException -> 0x01fd }
            goto L_0x01d3
        L_0x01e7:
            android.content.SharedPreferences$Editor r0 = X.C90504aG.A0H(r6)     // Catch:{ IOException -> 0x01fd }
            X.C36341k9.A0x(r0, r10, r11)     // Catch:{ IOException -> 0x01fd }
            goto L_0x0207
        L_0x01ef:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01f1 }
        L_0x01f1:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x01f6 }
            throw r0     // Catch:{ all -> 0x01f6 }
        L_0x01f6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01f8 }
        L_0x01f8:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ IOException -> 0x01fd }
            throw r0     // Catch:{ IOException -> 0x01fd }
        L_0x01fd:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0209 }
            java.lang.String r0 = "FlowsLogger/FlowsReportingDiskCache/storeDataForReporting: "
            X.C36321k7.A1W(r0, r1, r2)     // Catch:{ all -> 0x0209 }
        L_0x0207:
            monitor-exit(r9)
            return
        L_0x0209:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6TL.A03(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public static final AnonymousClass6DH A00(String str, String str2, String str3, String str4, Map map) {
        try {
            Object obj = map.get("data");
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            return new AnonymousClass6DH(C90474aD.A0k((Map) obj), str2, str, str3, C90464aC.A0a("screen", map), str4);
        } catch (Exception unused) {
            return null;
        }
    }

    public AnonymousClass6TL(C19700wN r2, C19970wo r3, C19630wG r4, AnonymousClass1KW r5, AnonymousClass1KV r6, C20810yC r7) {
        C36321k7.A1B(r5, r2, r4, r7, r3);
        AnonymousClass00C.A0D(r6, 6);
        this.A02 = r5;
        this.A00 = r2;
        this.A01 = r4;
        this.A04 = r7;
        this.A06 = r3;
        this.A03 = r6;
    }
}
