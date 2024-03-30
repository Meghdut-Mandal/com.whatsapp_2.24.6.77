package X;

/* renamed from: X.1Oa  reason: invalid class name and case insensitive filesystem */
public class C27391Oa {
    public final AnonymousClass1KK A00;
    public final C26421Kc A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass185 A03;
    public final C20780y9 A04;
    public final C19700wN A05;
    public final AnonymousClass17Y A06;
    public final C21010yW A07;

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0282, code lost:
        if (r0 == null) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (r10.get(r2) == null) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x015b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0192  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C63143Ix A00(java.util.Map r18, java.util.Map r19, java.util.Map r20, java.util.Map r21) {
        /*
            r17 = this;
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Set r0 = r18.entrySet()
            java.util.Iterator r12 = r0.iterator()
        L_0x001c:
            boolean r0 = r12.hasNext()
            r6 = r17
            if (r0 == 0) goto L_0x013c
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r1 = r19
            java.lang.Object r4 = r1.get(r2)
            X.9Oj r4 = (X.C194169Oj) r4
            r8 = 0
            if (r4 == 0) goto L_0x00b1
            X.9K4 r7 = r4.A09
            if (r7 == 0) goto L_0x00b1
            com.whatsapp.jid.UserJid r10 = r7.A01     // Catch:{ 19b -> 0x0109 }
            if (r10 == 0) goto L_0x0051
            X.9nx r1 = r7.A02     // Catch:{ 19b -> 0x0109 }
            if (r1 == 0) goto L_0x0051
            java.lang.String r0 = "profile"
            X.9nx r0 = r1.A0c(r0)     // Catch:{ 19b -> 0x0109 }
            X.9uZ r8 = X.C203059nD.A01(r10, r0)     // Catch:{ 19b -> 0x0109 }
        L_0x0051:
            r10 = r20
            if (r20 == 0) goto L_0x0062
            boolean r0 = r10.containsKey(r2)
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r10.get(r2)
            r1 = 1
            if (r0 != 0) goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            r0 = 0
            if (r8 == 0) goto L_0x0067
            r0 = 1
        L_0x0067:
            if (r1 == 0) goto L_0x0094
            if (r0 == 0) goto L_0x0079
            java.lang.Object r1 = r10.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r0 = r8.A0L
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x007f
        L_0x0079:
            r3.add(r2)
            r9.put(r2, r8)
        L_0x007f:
            X.9K3 r0 = r7.A00
            if (r0 == 0) goto L_0x0097
            r11.put(r2, r0)
            boolean r0 = r4.A0M
            if (r0 == 0) goto L_0x001c
            X.185 r0 = r6.A03
            X.3L0 r0 = r0.A02(r2)
            r5.put(r2, r0)
            goto L_0x001c
        L_0x0094:
            if (r0 != 0) goto L_0x0079
            goto L_0x007f
        L_0x0097:
            r0 = r21
            if (r21 == 0) goto L_0x00a1
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x001c
        L_0x00a1:
            X.185 r1 = r6.A03
            X.3L0 r0 = r1.A02(r2)
            if (r0 == 0) goto L_0x00ac
            r3.add(r2)
        L_0x00ac:
            r1.A03(r2)
            goto L_0x001c
        L_0x00b1:
            java.lang.Object r0 = r0.getValue()
            X.9Ok r0 = (X.C194179Ok) r0
            r10 = 0
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x001c
            X.185 r8 = r6.A03
            X.3L0 r7 = r8.A02(r2)
            X.1KK r4 = r6.A00
            X.9uZ r0 = r4.A07(r2)
            if (r0 == 0) goto L_0x00cd
            r10 = 1
        L_0x00cd:
            if (r2 == 0) goto L_0x00e0
            r1 = 0
            X.9uZ r0 = r4.A07(r2)
            boolean r0 = X.AnonymousClass1KK.A05(r1, r0)
            if (r0 == 0) goto L_0x00e0
            r1 = 0
            X.1DV r0 = r4.A0A
            r0.A01(r2, r1)
        L_0x00e0:
            X.1LE r0 = r4.A06
            r0.A07(r2)
            r8.A03(r2)
            if (r7 == 0) goto L_0x0106
            if (r10 == 0) goto L_0x001c
            X.0y9 r1 = r6.A04
            java.lang.Class<X.0xM> r0 = X.C20310xM.class
            X.00M r1 = r1.A01(r0)
            X.0xM r1 = (X.C20310xM) r1
            X.3TT r0 = X.AnonymousClass3TT.A01(r7)
            X.3H2 r0 = r0.A02()
            r1.A0c(r2, r0)
        L_0x0101:
            r3.add(r2)
            goto L_0x001c
        L_0x0106:
            if (r10 == 0) goto L_0x001c
            goto L_0x0101
        L_0x0109:
            r2 = move-exception
            X.C18740tg.A0A(r2)
            X.0wN r4 = r6.A05
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "source=ContactSyncBusinessUpdater message="
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = "CorruptStreamException"
            r0 = 0
            r4.A0E(r1, r2, r0)
            int r3 = r3.size()
            X.0wy r2 = X.C20070wy.of()
            X.0y7 r1 = X.C20760y7.of()
            X.3Ix r0 = new X.3Ix
            r0.<init>(r1, r2, r3)
            return r0
        L_0x013c:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0221
            X.1KK r10 = r6.A00
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Set r0 = r9.entrySet()
            java.util.Iterator r14 = r0.iterator()
        L_0x015b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r0 = r14.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r8 = r0.getKey()
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            java.lang.Object r12 = r0.getValue()
            X.9uZ r12 = (X.C207109uZ) r12
            if (r12 == 0) goto L_0x01b6
            int r13 = r12.A00
        L_0x0177:
            X.9uZ r1 = r10.A07(r8)
            if (r13 == 0) goto L_0x01a6
            r0 = 1
            if (r13 == r0) goto L_0x019c
            r0 = 2
            if (r13 != r0) goto L_0x01a6
            boolean r0 = X.AnonymousClass1KK.A04(r10, r12, r1)
            if (r0 == 0) goto L_0x018c
            r7.add(r8)
        L_0x018c:
            boolean r0 = X.AnonymousClass1KK.A05(r12, r1)
            if (r0 == 0) goto L_0x015b
            r1 = 0
            X.AnonymousClass00C.A0D(r8, r1)
            X.1DV r0 = r10.A0A
            r0.A01(r8, r1)
            goto L_0x015b
        L_0x019c:
            boolean r0 = X.AnonymousClass1KK.A03(r10, r12, r1)
            if (r0 == 0) goto L_0x018c
            r4.add(r8)
            goto L_0x018c
        L_0x01a6:
            if (r12 == 0) goto L_0x018c
            int r0 = r12.A00
            if (r0 != 0) goto L_0x018c
            if (r1 == 0) goto L_0x018c
            int r0 = r1.A00
            if (r0 == 0) goto L_0x018c
            r2.add(r8)
            goto L_0x018c
        L_0x01b6:
            r13 = 0
            goto L_0x0177
        L_0x01b8:
            X.1LE r0 = r10.A06
            r0.A08(r9)
            X.AnonymousClass1KK.A01(r10, r4)
            X.AnonymousClass1KK.A02(r10, r7)
            X.AnonymousClass1KK.A00(r10, r2)
            java.util.Set r0 = r9.entrySet()
            java.util.Iterator r12 = r0.iterator()
        L_0x01ce:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0221
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r8 = r0.getKey()
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            java.lang.Object r7 = r0.getValue()
            X.9uZ r7 = (X.C207109uZ) r7
            X.1KM r4 = r10.A04
            X.0yC r2 = r4.A0B
            r1 = 4208(0x1070, float:5.897E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x021d
            r2 = 0
            X.AnonymousClass00C.A0D(r8, r2)
            X.1KL r0 = r10.A03
            int r0 = r0.A00()
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 <= 0) goto L_0x01ce
            if (r7 == 0) goto L_0x01ce
            boolean r0 = r7.A0X
            if (r0 == 0) goto L_0x01ce
            java.lang.String r1 = r8.getRawString()
            X.0v0 r0 = r4.A0A
            r0.A1K(r1)
            r0.A1L(r1)
            X.A8l r0 = new X.A8l
            r0.<init>(r10)
            r4.A03(r0, r7, r8, r2)
            goto L_0x01ce
        L_0x021d:
            r10.A0F(r7, r8)
            goto L_0x01ce
        L_0x0221:
            X.15o r4 = X.C20760y7.builder()
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0389
            X.185 r13 = r6.A03
            X.C18740tg.A00()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Set r0 = r11.entrySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x024c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x033a
            java.lang.Object r12 = r16.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r1 = r12.getKey()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.13u r0 = com.whatsapp.jid.DeviceJid.Companion
            if (r1 == 0) goto L_0x0337
            com.whatsapp.jid.DeviceJid r11 = r1.getPrimaryDevice()
        L_0x0266:
            X.C18740tg.A06(r11)
            X.189 r14 = r13.A04
            boolean r0 = r14.A0X()
            if (r0 == 0) goto L_0x0301
            X.3xg r0 = new X.3xg
            r0.<init>(r14, r11)
            X.189 r1 = r0.A00
            com.whatsapp.jid.DeviceJid r0 = r0.A01
            X.6EZ r0 = X.C133256Xm.A02(r0)
            X.3FZ r0 = r1.A0B(r0)
        L_0x0282:
            if (r0 != 0) goto L_0x0287
        L_0x0284:
            r10.add(r11)
        L_0x0287:
            java.lang.Object r0 = r12.getValue()
            if (r0 == 0) goto L_0x02e3
            java.lang.Object r0 = r12.getValue()
            X.9K3 r0 = (X.AnonymousClass9K3) r0
            byte[] r0 = r0.A02
            if (r0 == 0) goto L_0x02e3
            com.whatsapp.jid.UserJid r15 = r11.userJid
            java.lang.Object r0 = r12.getValue()
            X.9K3 r0 = (X.AnonymousClass9K3) r0
            byte[] r14 = r0.A02
            java.lang.Object r0 = r12.getValue()
            X.9K3 r0 = (X.AnonymousClass9K3) r0
            int r1 = r0.A00
            java.lang.Object r0 = r12.getValue()
            X.9K3 r0 = (X.AnonymousClass9K3) r0
            X.3ur r12 = r0.A01
            X.3ur r0 = new X.3ur
            r0.<init>(r12)
            boolean r0 = X.AnonymousClass185.A00(r13, r15, r0, r14, r1)
            if (r0 == 0) goto L_0x02c1
            com.whatsapp.jid.UserJid r0 = r11.userJid
            r2.add(r0)
        L_0x02c1:
            com.whatsapp.jid.UserJid r0 = r11.userJid
            X.3L0 r0 = r13.A02(r0)
            if (r0 == 0) goto L_0x02d3
            int r0 = r0.A02
            if (r0 == 0) goto L_0x02d8
            boolean r0 = r10.contains(r11)
            if (r0 != 0) goto L_0x02d8
        L_0x02d3:
            r10.add(r11)
            goto L_0x024c
        L_0x02d8:
            boolean r0 = r8.contains(r11)
            if (r0 != 0) goto L_0x024c
            r8.add(r11)
            goto L_0x024c
        L_0x02e3:
            com.whatsapp.jid.UserJid r15 = r11.userJid
            java.lang.Object r0 = r12.getValue()
            X.9K3 r0 = (X.AnonymousClass9K3) r0
            int r14 = r0.A00
            java.lang.Object r0 = r12.getValue()
            X.9K3 r0 = (X.AnonymousClass9K3) r0
            X.3ur r1 = r0.A01
            r0 = 0
            boolean r0 = r13.A05(r15, r1, r14, r0)
            if (r0 == 0) goto L_0x024c
            r7.add(r11)
            goto L_0x024c
        L_0x0301:
            X.187 r0 = r13.A05     // Catch:{ InterruptedException | ExecutionException -> 0x0314 }
            X.3xg r1 = new X.3xg     // Catch:{ InterruptedException | ExecutionException -> 0x0314 }
            r1.<init>(r14, r11)     // Catch:{ InterruptedException | ExecutionException -> 0x0314 }
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0314 }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0314 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0314 }
            goto L_0x0282
        L_0x0314:
            r1 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "VerifiedNameManager/storeVerifiedNameCerts, vname: failed to get identity entry for jid = "
            r14.append(r0)
            java.lang.Object r0 = r12.getKey()
            r14.append(r0)
            java.lang.String r0 = " error = "
            r14.append(r0)
            r14.append(r1)
            java.lang.String r0 = r14.toString()
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0284
        L_0x0337:
            r11 = 0
            goto L_0x0266
        L_0x033a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "VerifiedNameManager/storeVerifiedNameCerts, vname: jidsWithLevelOrPrivacyUpdate = "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0361
            X.0y9 r1 = r6.A04
            java.lang.Class<X.0xN> r0 = X.C20320xN.class
            X.00M r0 = r1.A01(r0)
            X.0xN r0 = (X.C20320xN) r0
            r0.A01(r10)
        L_0x0361:
            java.util.Iterator r1 = r7.iterator()
        L_0x0365:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0377
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            com.whatsapp.jid.UserJid r0 = r0.userJid
            r3.add(r0)
            goto L_0x0365
        L_0x0377:
            java.util.Iterator r1 = r2.iterator()
        L_0x037b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0391
            java.lang.Object r0 = r1.next()
            r3.add(r0)
            goto L_0x037b
        L_0x0389:
            java.util.List r8 = java.util.Collections.emptyList()
            java.util.Set r7 = java.util.Collections.emptySet()
        L_0x0391:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x03b9
            X.17Y r2 = r6.A06
            r1 = 30
            X.1iV r0 = new X.1iV
            r0.<init>(r6, r8, r9, r1)
            r2.A0H(r0)
            java.util.Iterator r1 = r8.iterator()
        L_0x03a7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03b9
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            com.whatsapp.jid.UserJid r0 = r0.userJid
            r4.add((java.lang.Object) r0)
            goto L_0x03a7
        L_0x03b9:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x03d5
            java.util.Iterator r1 = r7.iterator()
        L_0x03c3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03d5
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            com.whatsapp.jid.UserJid r0 = r0.userJid
            r4.add((java.lang.Object) r0)
            goto L_0x03c3
        L_0x03d5:
            X.16D r0 = r6.A02
            r0.A0N()
            int r3 = r3.size()
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r5)
            X.0y7 r1 = r4.build()
            X.3Ix r0 = new X.3Ix
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27391Oa.A00(java.util.Map, java.util.Map, java.util.Map, java.util.Map):X.3Ix");
    }

    public C27391Oa(C19700wN r1, AnonymousClass17Y r2, AnonymousClass1KK r3, C26421Kc r4, AnonymousClass16D r5, AnonymousClass185 r6, C20780y9 r7, C21010yW r8) {
        this.A06 = r2;
        this.A05 = r1;
        this.A07 = r8;
        this.A02 = r5;
        this.A03 = r6;
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = r7;
    }
}
