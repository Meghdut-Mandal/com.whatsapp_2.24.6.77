package X;

/* renamed from: X.1aQ  reason: invalid class name and case insensitive filesystem */
public class C30571aQ {
    public final C29911Yl A00;
    public final C20310xM A01;
    public final C30781al A02;
    public final AnonymousClass1SR A03;
    public final C29571Xd A04;
    public final C25221Fl A05;
    public final C26171Jd A06;
    public final AnonymousClass1YE A07;
    public final AnonymousClass1ST A08;
    public final AnonymousClass1DL A09;
    public final C26191Jf A0A;
    public final AnonymousClass19L A0B;
    public final C25291Fs A0C;
    public final AnonymousClass1A1 A0D;
    public final C30581aR A0E;

    public C30571aQ(C29911Yl r1, C20310xM r2, C30781al r3, AnonymousClass1SR r4, C29571Xd r5, C25221Fl r6, C26171Jd r7, AnonymousClass1YE r8, AnonymousClass1ST r9, C30581aR r10, AnonymousClass1DL r11, C26191Jf r12, AnonymousClass19L r13, C25291Fs r14, AnonymousClass1A1 r15) {
        this.A09 = r11;
        this.A01 = r2;
        this.A03 = r4;
        this.A0D = r15;
        this.A0E = r10;
        this.A0A = r12;
        this.A0B = r13;
        this.A06 = r7;
        this.A04 = r5;
        this.A08 = r9;
        this.A00 = r1;
        this.A02 = r3;
        this.A07 = r8;
        this.A05 = r6;
        this.A0C = r14;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v95, resolved type: X.8mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v114, resolved type: X.8mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v115, resolved type: X.8mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v116, resolved type: X.8mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v117, resolved type: X.8mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v118, resolved type: X.8mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v119, resolved type: X.8mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v123, resolved type: X.8mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v125, resolved type: X.8mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v132, resolved type: X.8mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v133, resolved type: X.8mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v136, resolved type: X.8mm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v141, resolved type: X.5J7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v142, resolved type: X.5J6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v143, resolved type: X.8mk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v144, resolved type: X.8mk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v145, resolved type: X.8ml} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v146, resolved type: X.8ml} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v147, resolved type: X.8ml} */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x088b, code lost:
        if (r6 != false) goto L_0x081d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0b39, code lost:
        if (r11 > 0) goto L_0x0b3b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0dee, code lost:
        if (r3 == 3) goto L_0x0df0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x0fcc, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x0fd1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:515:0x0dd9, B:614:0x0fc1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0860  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0ba1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C30571aQ r54, X.AnonymousClass3T1 r55, X.C21337AHp r56) {
        /*
            r3 = r56
            r0 = r55
            java.lang.String r2 = r3.A0i
            java.lang.String r1 = "peer"
            boolean r2 = r1.equals(r2)
            r1 = r54
            if (r2 == 0) goto L_0x0ec4
            X.1aR r1 = r1.A0E
            r43 = r1
            if (r55 == 0) goto L_0x1523
            com.whatsapp.jid.DeviceJid r3 = r0.A1T
            if (r3 == 0) goto L_0x00f1
            X.0wQ r2 = r1.A00
            com.whatsapp.jid.UserJid r1 = r3.userJid
            boolean r1 = r2.A0M(r1)
            if (r1 == 0) goto L_0x00f1
            boolean r1 = r0 instanceof X.C180998ml
            if (r1 == 0) goto L_0x0c7b
            X.8ml r0 = (X.C180998ml) r0
            java.lang.String r1 = "PeerMessageHandler/handleKeyShareMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = r43
            X.1A9 r7 = r1.A05     // Catch:{ 198 -> 0x00d8 }
            com.whatsapp.jid.DeviceJid r6 = r0.A1T     // Catch:{ 198 -> 0x00d8 }
            r9 = 0
            if (r6 == 0) goto L_0x0cb0
            java.util.HashMap r2 = r0.A1Z()     // Catch:{ 198 -> 0x00d8 }
            java.util.Collection r1 = r2.values()     // Catch:{ 198 -> 0x00d8 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ 198 -> 0x00d8 }
            r3.<init>(r1)     // Catch:{ 198 -> 0x00d8 }
            r1 = 0
            r3.remove(r1)     // Catch:{ 198 -> 0x00d8 }
            r7.A0A(r3)     // Catch:{ 198 -> 0x00d8 }
            java.util.Set r5 = r2.keySet()     // Catch:{ 198 -> 0x00d8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 198 -> 0x00d8 }
            r2.<init>()     // Catch:{ 198 -> 0x00d8 }
            java.lang.String r1 = "SyncdKeyManager/handleAppStateSyncKeyShareMessage syncdKeyIds = "
            r2.append(r1)     // Catch:{ 198 -> 0x00d8 }
            r2.append(r5)     // Catch:{ 198 -> 0x00d8 }
            java.lang.String r1 = r2.toString()     // Catch:{ 198 -> 0x00d8 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 198 -> 0x00d8 }
            int r2 = r5.size()     // Catch:{ 198 -> 0x00d8 }
            int r1 = r3.size()     // Catch:{ 198 -> 0x00d8 }
            if (r2 != r1) goto L_0x006f
            r9 = 1
        L_0x006f:
            X.1AI r4 = r7.A08     // Catch:{ 198 -> 0x00d8 }
            r1 = 39
            java.util.ArrayList r1 = r4.A04(r1)     // Catch:{ 198 -> 0x00d8 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ 198 -> 0x00d8 }
            r3.<init>()     // Catch:{ 198 -> 0x00d8 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ 198 -> 0x00d8 }
        L_0x0080:
            boolean r1 = r8.hasNext()     // Catch:{ 198 -> 0x00d8 }
            if (r1 == 0) goto L_0x00ac
            java.lang.Object r2 = r8.next()     // Catch:{ 198 -> 0x00d8 }
            X.8mk r2 = (X.C180988mk) r2     // Catch:{ 198 -> 0x00d8 }
            if (r9 != 0) goto L_0x0096
            com.whatsapp.jid.DeviceJid r1 = r2.A00     // Catch:{ 198 -> 0x00d8 }
            boolean r1 = r6.equals(r1)     // Catch:{ 198 -> 0x00d8 }
            if (r1 == 0) goto L_0x0080
        L_0x0096:
            java.util.Set r1 = r2.A00     // Catch:{ 198 -> 0x00d8 }
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)     // Catch:{ 198 -> 0x00d8 }
            boolean r1 = r5.equals(r1)     // Catch:{ 198 -> 0x00d8 }
            if (r1 == 0) goto L_0x0080
            long r1 = r2.A1N     // Catch:{ 198 -> 0x00d8 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ 198 -> 0x00d8 }
            r3.add(r1)     // Catch:{ 198 -> 0x00d8 }
            goto L_0x0080
        L_0x00ac:
            r4.A07(r3)     // Catch:{ 198 -> 0x00d8 }
            boolean r1 = X.AnonymousClass1A9.A03(r7)     // Catch:{ 198 -> 0x00d8 }
            if (r1 != 0) goto L_0x00cf
            java.lang.String r1 = "PeerMessageHandler/handleKeyShareMessage trySync"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 198 -> 0x00d8 }
            r1 = r43
            X.0wU r4 = r1.A07     // Catch:{ 198 -> 0x00d8 }
            X.196 r3 = r1.A04     // Catch:{ 198 -> 0x00d8 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ 198 -> 0x00d8 }
            r2 = 31
            X.1j8 r1 = new X.1j8     // Catch:{ 198 -> 0x00d8 }
            r1.<init>(r3, r2)     // Catch:{ 198 -> 0x00d8 }
            r4.Boy(r1)     // Catch:{ 198 -> 0x00d8 }
            goto L_0x0cb0
        L_0x00cf:
            r3 = 30
            r2 = 0
            X.198 r1 = new X.198     // Catch:{ 198 -> 0x00d8 }
            r1.<init>(r3, r2)     // Catch:{ 198 -> 0x00d8 }
            throw r1     // Catch:{ 198 -> 0x00d8 }
        L_0x00d8:
            r3 = move-exception
            r1 = r43
            X.196 r2 = r1.A04     // Catch:{ all -> 0x00e8 }
            int r1 = r3.errorCode     // Catch:{ all -> 0x00e8 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00e8 }
            r2.A0K(r1)     // Catch:{ all -> 0x00e8 }
            goto L_0x0cb0
        L_0x00e8:
            r2 = move-exception
            r1 = r43
            X.1DL r1 = r1.A06
            r1.A08(r0)
            throw r2
        L_0x00f1:
            java.lang.String r1 = "PeerMessageHandler/ received peer message from unknown device"
            goto L_0x011a
        L_0x00f4:
            boolean r1 = r0 instanceof X.AnonymousClass5J8
            if (r1 == 0) goto L_0x0340
            X.5J8 r0 = (X.AnonymousClass5J8) r0
            java.lang.String r1 = "PeerMessageHandler/handleNonMessageDataRequestMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = r43
            X.1aX r1 = r1.A01
            int r3 = r0.A00
            com.whatsapp.jid.DeviceJid r5 = r0.A1T
            if (r5 != 0) goto L_0x011f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestMessage no remoteDeviceJid, requestType = "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
        L_0x011a:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0cb0
        L_0x011f:
            if (r3 != 0) goto L_0x02bc
            X.3Qa r2 = r0.A1J
            java.lang.String r6 = r2.A01
            java.util.Set r4 = r0.A01
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "NonMessageDataRequestManager/handleStickerReUploadRequest handle sticker upload request, id="
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = "; size="
            r3.append(r2)
            int r2 = r4.size()
            r3.append(r2)
            java.lang.String r2 = "; remoteDeviceJid"
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x0cb0
            X.9Sb r9 = new X.9Sb
            r9.<init>(r1, r5, r6, r4)
            X.0wU r2 = r1.A0M
            r6 = 0
            X.0wk r8 = new X.0wk
            r8.<init>(r2, r6)
            java.util.Set r2 = r9.A07
            java.util.Iterator r17 = r2.iterator()
        L_0x0168:
            boolean r2 = r17.hasNext()
            if (r2 == 0) goto L_0x0cb0
            java.lang.Object r5 = r17.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L_0x018b
            java.lang.String r2 = "NonMessageDataRequestManager/uploadSticker/empty file hash"
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x017f:
            X.918 r3 = X.AnonymousClass918.NOT_FOUND
            r4 = 0
        L_0x0182:
            X.74y r2 = new X.74y
            r2.<init>(r9, r3, r4, r5)
            r8.execute(r2)
            goto L_0x0168
        L_0x018b:
            X.1aY r3 = r1.A0K
            monitor-enter(r3)
            X.00v r2 = r3.A00     // Catch:{ all -> 0x0dba }
            if (r2 != 0) goto L_0x0193
            goto L_0x019a
        L_0x0193:
            java.lang.Object r4 = r2.A04(r5)     // Catch:{ all -> 0x0dba }
            X.6c4 r4 = (X.C135066c4) r4     // Catch:{ all -> 0x0dba }
            goto L_0x019b
        L_0x019a:
            r4 = 0
        L_0x019b:
            monitor-exit(r3)
            if (r4 != 0) goto L_0x01c9
            X.005 r2 = r1.A0N
            java.lang.Object r2 = r2.get()
            X.5Ar r2 = (X.C104665Ar) r2
            X.6c4 r4 = r2.A0D(r5)
            if (r4 != 0) goto L_0x01c9
            X.1Ar r2 = r1.A0J
            X.6c4 r4 = r2.A01(r5)
            if (r4 != 0) goto L_0x01c9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "NonMessageDataRequestManager/uploadSticker not find the sticker. hash="
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r2)
            goto L_0x017f
        L_0x01c9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "rmr_sticker_upload_job_id_"
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            byte[] r2 = r2.getBytes()
            java.util.UUID r2 = java.util.UUID.nameUUIDFromBytes(r2)
            java.lang.String r7 = r2.toString()
            X.1Y5 r12 = r1.A0H
            X.1DE r2 = r12.A00
            X.5z2 r11 = r2.A03(r7, r6)
            java.lang.String r10 = "; jobId="
            if (r11 == 0) goto L_0x0232
            r15 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r11.A05
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r2
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 < 0) goto L_0x022e
            long r15 = java.lang.System.currentTimeMillis()
            long r2 = r11.A04
            long r15 = r15 - r2
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            int r2 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0232
            int r3 = r11.A01
            r2 = 15
            if (r3 < r2) goto L_0x0232
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "NonMessageDataRequestManager/uploadSticker has reached the maximum retry in a day, hash="
            r3.append(r2)
            r3.append(r5)
            r3.append(r10)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x022e:
            X.918 r3 = X.AnonymousClass918.SUCCESS
            goto L_0x0182
        L_0x0232:
            X.1Av r3 = r1.A01
            java.lang.String r2 = r4.A0D
            java.io.File r11 = r3.A04(r5, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "NonMessageDataRequestManager/uploadSticker start upload the sticker, hash="
            r3.append(r2)
            r3.append(r5)
            r3.append(r10)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r2 = 32
            byte[] r2 = new byte[r2]
            X.005 r3 = r1.A0O
            java.lang.Object r3 = r3.get()
            java.util.Random r3 = (java.util.Random) r3
            r3.nextBytes(r2)
            r3 = 1
            X.3Ot r13 = new X.3Ot
            r13.<init>(r6, r6, r3)
            X.1Gl r22 = X.C25471Gl.A0d
            android.net.Uri r18 = android.net.Uri.fromFile(r11)
            r20 = 0
            r28 = 1
            X.0wo r3 = r1.A07
            long r10 = X.C19970wo.A00(r3)
            X.6Rx r3 = new X.6Rx
            r3.<init>(r2, r10)
            r25 = 0
            r26 = 0
            r27 = 0
            r19 = r3
            r21 = r13
            r23 = r20
            r24 = r7
            X.3Rg r3 = X.C65233Rg.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.1D0 r10 = r1.A0G
            X.6vi r7 = r10.A08(r3, r6)
            java.lang.String r3 = "mms"
            r7.A0X = r3
            X.5z2 r3 = r7.A0M
            r12.A00(r3)
            X.70U r3 = new X.70U
            r18 = r3
            r19 = r9
            r20 = r1
            r21 = r7
            r22 = r4
            r23 = r5
            r24 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r7.A06(r3, r8)
            java.lang.String r2 = "rmr upload sticker"
            r10.A0E(r7, r2)
            goto L_0x0168
        L_0x02bc:
            r2 = 1
            if (r3 != r2) goto L_0x05e1
            X.3Qa r2 = r0.A1J
            java.lang.String r6 = r2.A01
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "NonMessageDataRequestManager/handleRecentStickerInitRequest jid="
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.39H r7 = new X.39H
            r7.<init>(r5)
            r2 = 1
            r7.A03 = r2
            X.1Cz r3 = r1.A0I
            r11 = 0
            com.whatsapp.jid.DeviceJid r5 = r7.A04
            X.3I3 r4 = r7.A00
            boolean r9 = r7.A02
            boolean r8 = r7.A01
            X.0wQ r2 = r3.A02
            boolean r2 = r2.A0L()
            if (r2 != 0) goto L_0x0331
            X.4uP r2 = X.C100064uP.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x032b }
            X.8NN r2 = r2.A0p()     // Catch:{ Exception -> 0x032b }
            X.4tx r2 = (X.C99784tx) r2     // Catch:{ Exception -> 0x032b }
            X.5UH r7 = X.AnonymousClass5UH.NON_BLOCKING_DATA     // Catch:{ Exception -> 0x032b }
            r2.A0Y(r7)     // Catch:{ Exception -> 0x032b }
            X.C24581Cz.A08(r3, r2)     // Catch:{ Exception -> 0x032b }
            if (r9 == 0) goto L_0x0307
            X.C24581Cz.A06(r3, r2)     // Catch:{ Exception -> 0x032b }
        L_0x0307:
            if (r8 == 0) goto L_0x030c
            X.C24581Cz.A07(r3, r2)     // Catch:{ Exception -> 0x032b }
        L_0x030c:
            r17 = 0
            r13 = 0
            r14 = 5
            r15 = 100
            r19 = -1
            r16 = 0
            r21 = -1
            r23 = -1
            r25 = 0
            r27 = 0
            r29 = -1
            r31 = 0
            r7 = r4
            r8 = r5
            r9 = r3
            r10 = r2
            r12 = r11
            X.C24581Cz.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23, r25, r27, r29, r31)     // Catch:{ Exception -> 0x032b }
            goto L_0x0331
        L_0x032b:
            r3 = move-exception
            java.lang.String r2 = "history-sync-send-methods/sendNonBlockingDataMessages: error"
            com.whatsapp.util.Log.e(r2, r3)
        L_0x0331:
            X.1Ho r1 = r1.A03
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r7 = 1
            r5 = r1
            r5.A01(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0cb0
        L_0x0340:
            boolean r1 = r0 instanceof X.C181008mm
            if (r1 == 0) goto L_0x0cb0
            X.8mm r0 = (X.C181008mm) r0
            java.lang.String r1 = "PeerMessageHandler/handleNonMessageDataRequestResponseMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r1 = r0 instanceof X.AnonymousClass8Y0
            if (r1 == 0) goto L_0x0be1
            r1 = r43
            X.1aX r10 = r1.A01
            r4 = r0
            X.8Y0 r4 = (X.AnonymousClass8Y0) r4
            X.0yC r3 = r10.A0D
            r2 = 2155(0x86b, float:3.02E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r1, r3, r2)
            if (r1 == 0) goto L_0x05de
            X.0wo r1 = r10.A07
            long r18 = X.C19970wo.A00(r1)
            java.util.Map r1 = r4.A00
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r20 = r1.iterator()
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
        L_0x0377:
            boolean r1 = r20.hasNext()
            if (r1 == 0) goto L_0x059d
            java.lang.Object r12 = r20.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r3 = r12.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r12.getValue()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            X.918 r1 = X.AnonymousClass918.SUCCESS
            if (r2 != r1) goto L_0x0487
            int r8 = r8 + 1
            java.lang.Object r1 = r12.getValue()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.second
            X.8SA r2 = (X.AnonymousClass8SA) r2
            if (r2 != 0) goto L_0x03b8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestResponseMessage no sticker for successful fileHash="
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0377
        L_0x03b8:
            X.6c4 r12 = new X.6c4
            r12.<init>()
            int r11 = r2.bitField0_
            r1 = r11 & 1
            if (r1 == 0) goto L_0x03c7
            java.lang.String r1 = r2.url_
            r12.A0H = r1
        L_0x03c7:
            r11 = r11 & 2
            r1 = 0
            if (r11 == 0) goto L_0x03cd
            r1 = 1
        L_0x03cd:
            r11 = 2
            if (r1 == 0) goto L_0x03dc
            X.AUx r1 = r2.fileSha256_
            byte[] r1 = r1.A06()
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r11)
            r12.A0E = r1
        L_0x03dc:
            int r1 = r2.bitField0_
            r1 = r1 & 4
            if (r1 == 0) goto L_0x03ee
            X.AUx r1 = r2.fileEncSha256_
            byte[] r1 = r1.A06()
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r11)
            r12.A09 = r1
        L_0x03ee:
            int r1 = r2.bitField0_
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0401
            X.AUx r1 = r2.mediaKey_
            byte[] r11 = r1.A06()
            r1 = 1
            java.lang.String r1 = android.util.Base64.encodeToString(r11, r1)
            r12.A0C = r1
        L_0x0401:
            int r11 = r2.bitField0_
            r1 = r11 & 16
            if (r1 == 0) goto L_0x040b
            java.lang.String r1 = r2.mimetype_
            r12.A0D = r1
        L_0x040b:
            int r1 = r2.height_
            r12.A02 = r1
            int r1 = r2.width_
            r12.A03 = r1
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x041b
            java.lang.String r1 = r2.directPath_
            r12.A07 = r1
        L_0x041b:
            long r1 = r2.fileLength_
            int r11 = (int) r1
            r12.A00 = r11
            java.lang.String r1 = r12.A0E
            X.196 r14 = r10.A06
            if (r14 == 0) goto L_0x042d
            if (r1 != 0) goto L_0x0439
            java.lang.String r1 = "SyncManager/onReceiveRmrFavoriteResponse receive empty fileHash"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x042d:
            X.1ai r1 = r10.A0C
            X.C18740tg.A00()
            X.18P r1 = r1.A00
            X.1M0 r13 = r1.A04()
            goto L_0x046b
        L_0x0439:
            X.1AE r2 = r14.A0T
            java.lang.String r1 = "favoriteSticker"
            X.1LZ r1 = r2.A00(r1)
            if (r1 == 0) goto L_0x042d
            boolean r1 = r14.A0S()
            if (r1 == 0) goto L_0x042d
            X.0wU r13 = r14.A0W
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "rmrFavoriteStickerResponse_"
            r2.append(r1)
            java.lang.String r1 = r12.A0E
            r2.append(r1)
            java.lang.String r11 = r2.toString()
            r2 = 30
            X.1j2 r1 = new X.1j2
            r1.<init>(r14, r12, r2)
            r13.Boz(r1, r11)
            int r7 = r7 + 1
            goto L_0x042d
        L_0x046b:
            X.14e r14 = r13.A02     // Catch:{ all -> 0x0dbd }
            java.lang.String r12 = "rmr_response_error"
            java.lang.String r11 = "file_key = ?  AND rmr_source =? "
            r1 = 2
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0dbd }
            r2[r9] = r3     // Catch:{ all -> 0x0dbd }
            r3 = 1
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0dbd }
            r2[r3] = r1     // Catch:{ all -> 0x0dbd }
            java.lang.String r1 = "RequestMediaReUploadResponseErrorStore.deleteResponseError"
            r14.A03(r12, r11, r1, r2)     // Catch:{ all -> 0x0dbd }
            r13.close()
            goto L_0x0377
        L_0x0487:
            X.918 r1 = X.AnonymousClass918.GENERAL_ERROR
            java.lang.String r11 = "; result="
            if (r2 != r1) goto L_0x056c
            int r6 = r6 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestResponseMessage general fail fileHash="
            r2.append(r1)
            r2.append(r3)
            r2.append(r11)
            java.lang.Object r1 = r12.getValue()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            com.whatsapp.jid.DeviceJid r1 = r4.A1T
            X.1ai r13 = r10.A0C
            if (r1 == 0) goto L_0x04c8
            int r12 = r1.getDevice()
        L_0x04b7:
            X.3Rf r11 = new X.3Rf
            r1 = r18
            r11.<init>(r12, r3, r1)
            X.C18740tg.A00()
            X.18P r12 = r13.A00
            X.1M0 r3 = r12.A04()
            goto L_0x04ca
        L_0x04c8:
            r12 = 0
            goto L_0x04b7
        L_0x04ca:
            X.71s r17 = r3.B1k()     // Catch:{ all -> 0x0fd6 }
            java.lang.String r2 = r11.A04     // Catch:{ all -> 0x0dd8 }
            int r1 = r11.A02     // Catch:{ all -> 0x0dd8 }
            r21 = r1
            X.C18740tg.A00()     // Catch:{ all -> 0x0dd8 }
            X.1M0 r12 = r12.get()     // Catch:{ all -> 0x0dd8 }
            X.14e r15 = r12.A02     // Catch:{ all -> 0x0dce }
            java.lang.String r14 = "SELECT file_key, rmr_source, failure_count, response_device_id, last_fetch_timestamp FROM rmr_response_error WHERE file_key = ?  AND rmr_source =?  AND response_device_id =? "
            r1 = 3
            java.lang.String[] r13 = new java.lang.String[r1]     // Catch:{ all -> 0x0dce }
            r13[r9] = r2     // Catch:{ all -> 0x0dce }
            r16 = 1
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0dce }
            r13[r16] = r1     // Catch:{ all -> 0x0dce }
            r16 = 2
            java.lang.String r1 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x0dce }
            r13[r16] = r1     // Catch:{ all -> 0x0dce }
            java.lang.String r1 = "RequestMediaReUploadResponseErrorStore.GET_RESPONSE_FROM_FILE_ID"
            android.database.Cursor r13 = r15.A09(r14, r1, r13)     // Catch:{ all -> 0x0dce }
            boolean r1 = r13.moveToNext()     // Catch:{ all -> 0x0dc2 }
            if (r1 == 0) goto L_0x050b
            X.3Rf r14 = X.C65223Rf.A00(r13)     // Catch:{ all -> 0x0dc2 }
            r13.close()     // Catch:{ all -> 0x0dce }
            r12.close()     // Catch:{ all -> 0x0dd8 }
            goto L_0x0512
        L_0x050b:
            r13.close()     // Catch:{ all -> 0x0dce }
            r12.close()     // Catch:{ all -> 0x0dd8 }
            r14 = 0
        L_0x0512:
            r12 = 1
            if (r14 == 0) goto L_0x0518
            int r1 = r14.A00     // Catch:{ all -> 0x0dd8 }
            int r12 = r12 + r1
        L_0x0518:
            r11.A00 = r12     // Catch:{ all -> 0x0dd8 }
            if (r14 == 0) goto L_0x0525
            java.lang.String r13 = r14.A04     // Catch:{ all -> 0x0dd8 }
            int r12 = r14.A03     // Catch:{ all -> 0x0dd8 }
            int r1 = r14.A02     // Catch:{ all -> 0x0dd8 }
            X.C30751ai.A00(r3, r13, r12, r1)     // Catch:{ all -> 0x0dd8 }
        L_0x0525:
            r1 = 5
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x0dd8 }
            r12.<init>(r1)     // Catch:{ all -> 0x0dd8 }
            java.lang.String r1 = "file_key"
            r12.put(r1, r2)     // Catch:{ all -> 0x0dd8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0dd8 }
            java.lang.String r1 = "rmr_source"
            r12.put(r1, r2)     // Catch:{ all -> 0x0dd8 }
            int r1 = r11.A00     // Catch:{ all -> 0x0dd8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0dd8 }
            java.lang.String r1 = "failure_count"
            r12.put(r1, r2)     // Catch:{ all -> 0x0dd8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x0dd8 }
            java.lang.String r1 = "response_device_id"
            r12.put(r1, r2)     // Catch:{ all -> 0x0dd8 }
            long r1 = r11.A01     // Catch:{ all -> 0x0dd8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0dd8 }
            java.lang.String r1 = "last_fetch_timestamp"
            r12.put(r1, r2)     // Catch:{ all -> 0x0dd8 }
            X.14e r11 = r3.A02     // Catch:{ all -> 0x0dd8 }
            java.lang.String r2 = "rmr_response_error"
            java.lang.String r1 = "RequestMediaReUploadResponseErrorStore.insertResponseError"
            r11.A04(r2, r1, r12)     // Catch:{ all -> 0x0dd8 }
            r17.A00()     // Catch:{ all -> 0x0dd8 }
            r17.close()     // Catch:{ all -> 0x0fd6 }
            r3.close()
            goto L_0x0377
        L_0x056c:
            int r5 = r5 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestResponseMessage non-retry fail fileHash="
            r2.append(r1)
            r2.append(r3)
            r2.append(r11)
            java.lang.Object r1 = r12.getValue()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            com.whatsapp.jid.DeviceJid r1 = r4.A1T
            X.1ai r2 = r10.A0C
            if (r1 == 0) goto L_0x059b
            int r1 = r1.getDevice()
        L_0x0596:
            r2.A01(r3, r9, r1)
            goto L_0x0377
        L_0x059b:
            r1 = 0
            goto L_0x0596
        L_0x059d:
            X.1Ho r10 = r10.A03
            java.util.Map r1 = r4.A00
            int r2 = r1.size()
            java.lang.String r4 = r4.A00
            X.2Rh r3 = new X.2Rh
            r3.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r3.A00 = r1
            long r1 = (long) r2
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.A03 = r1
            long r1 = (long) r8
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.A05 = r1
            long r1 = (long) r7
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.A04 = r1
            long r1 = (long) r6
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.A01 = r1
            long r1 = (long) r5
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.A02 = r1
            r3.A06 = r4
            X.0yW r1 = r10.A00
            r1.Bly(r3)
            goto L_0x0cb0
        L_0x05de:
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestResponseMessage not enabled"
            goto L_0x05f8
        L_0x05e1:
            r2 = 2
            if (r3 != r2) goto L_0x05fd
            X.3Qa r2 = r0.A1J
            java.lang.String r6 = r2.A01
            java.util.Set r4 = r0.A01
            X.0yC r7 = r1.A0D
            r3 = 2156(0x86c, float:3.021E-42)
            X.0yV r2 = X.C21000yV.A02
            boolean r2 = X.C20800yB.A01(r2, r7, r3)
            if (r2 != 0) goto L_0x08ef
            java.lang.String r1 = "NonMessageDataRequestManager/handleLinkPreviewRequest abprop disabled"
        L_0x05f8:
            com.whatsapp.util.Log.w((java.lang.String) r1)
            goto L_0x0cb0
        L_0x05fd:
            r2 = 3
            if (r3 != r2) goto L_0x063f
            X.3Qa r2 = r0.A1J
            java.lang.String r9 = r2.A01
            java.util.Set r4 = r0.A01
            long r2 = r0.A0I
            r41 = r2
            X.0yC r3 = r1.A0D
            r2 = 4135(0x1027, float:5.794E-42)
            X.0yV r12 = X.C21000yV.A02
            boolean r2 = X.C20800yB.A01(r12, r3, r2)
            if (r2 != 0) goto L_0x0621
            r2 = 3337(0xd09, float:4.676E-42)
            boolean r2 = X.C20800yB.A01(r12, r3, r2)
            if (r2 != 0) goto L_0x0621
            java.lang.String r1 = "NonMessageDataRequestManager/handleHistorySyncOnDemandRequest not enabled"
            goto L_0x05f8
        L_0x0621:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "NonMessageDataRequestManager/handleHistorySyncOnDemandRequest sessionId="
            r3.append(r2)
            r3.append(r9)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            int r3 = r4.size()
            r2 = 1
            if (r3 == r2) goto L_0x092b
            java.lang.String r1 = "NonMessageDataRequestManager/handleHistorySyncOnDemandRequest dataIdentifiers size is not 1"
            goto L_0x05f8
        L_0x063f:
            r2 = 4
            if (r3 != r2) goto L_0x08dc
            X.1ag r3 = r1.A05
            X.3Qa r1 = r0.A1J
            java.lang.String r13 = r1.A01
            java.util.Set r14 = r0.A01
            r1 = 1
            X.AnonymousClass00C.A0D(r13, r1)
            r1 = 2
            X.AnonymousClass00C.A0D(r14, r1)
            X.0yC r11 = r3.A05
            r1 = 3579(0xdfb, float:5.015E-42)
            X.0yV r10 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r10, r11, r1)
            if (r1 != 0) goto L_0x0661
            java.lang.String r1 = "PlaceholderMessageResendHelper/handlePlaceholderMessageResendRequest abprop disabled"
            goto L_0x05f8
        L_0x0661:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "PlaceholderMessageResendHelper/handlePlaceholderMessageResendRequest size="
            r2.append(r1)
            int r1 = r14.size()
            r2.append(r1)
            java.lang.String r1 = "; jid="
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L_0x068b
            java.lang.String r1 = "PlaceholderMessageResendHelper/handlePlaceholderMessageResendRequest msg key list is empty"
            goto L_0x011a
        L_0x068b:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r18 = r14.iterator()
        L_0x0694:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x0801
            java.lang.Object r2 = r18.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r9 = "PlaceholderMessageResendHelper/handlePlaceholderMessageResendRequest error in parsing request"
            boolean r1 = X.AnonymousClass9ZV.A00(r5)
            r8 = 0
            if (r1 == 0) goto L_0x06be
            X.0wN r6 = r3.A00
            java.lang.String r4 = "unexpected-hosted-device"
            java.lang.String r2 = "peer placeholder backfill request from hosted device, rejecting"
            r1 = 0
            r6.A0E(r4, r2, r1)
            X.918 r1 = X.AnonymousClass918.GENERAL_ERROR
            X.9VX r2 = new X.9VX
            r2.<init>(r8, r1)
        L_0x06ba:
            r12.add(r2)
            goto L_0x0694
        L_0x06be:
            r1 = 2
            byte[] r2 = android.util.Base64.decode(r2, r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.8SW r1 = X.AnonymousClass8SW.DEFAULT_INSTANCE     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.8Hz r2 = X.C170918Hz.A08(r1, r2)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.8SW r2 = (X.AnonymousClass8SW) r2     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            if (r2 != 0) goto L_0x06da
            java.lang.String r1 = "PlaceholderMessageResendHelper/handlePlaceholderMessageResendRequest no message key in request"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.918 r1 = X.AnonymousClass918.GENERAL_ERROR     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.9VX r2 = new X.9VX     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            r2.<init>(r8, r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            goto L_0x06ba
        L_0x06da:
            int r4 = r2.bitField0_     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            r1 = r4 & 1
            if (r1 == 0) goto L_0x07cc
            r1 = r4 & 2
            if (r1 == 0) goto L_0x07cc
            r1 = r4 & 4
            if (r1 == 0) goto L_0x07cc
            java.lang.String r1 = r2.id_     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            if (r1 == 0) goto L_0x07cc
            X.13q r1 = X.AnonymousClass11F.A00     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            java.lang.String r1 = r2.remoteJid_     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.11F r6 = X.C222713q.A01(r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            boolean r4 = r2.fromMe_     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            java.lang.String r1 = r2.id_     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.3Qa r2 = new X.3Qa     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            r2.<init>(r6, r1, r4)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.1A1 r1 = r3.A07     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.3T1 r4 = r1.A03(r2)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            if (r4 != 0) goto L_0x0712
            java.lang.String r1 = "NonMessageDataRequestManager/handlePlaceholderMessageResendRequest message not found"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.918 r1 = X.AnonymousClass918.NOT_FOUND     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.9VX r2 = new X.9VX     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            r2.<init>(r8, r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            goto L_0x06ba
        L_0x0712:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            boolean r1 = r4.A1T(r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            if (r1 == 0) goto L_0x0727
            java.lang.String r1 = "NonMessageDataRequestManager/handlePlaceholderMessageResendRequest peer backfills not supported on hosted messages"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.918 r1 = X.AnonymousClass918.GENERAL_ERROR     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.9VX r2 = new X.9VX     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            r2.<init>(r8, r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            goto L_0x06ba
        L_0x0727:
            X.19g r2 = r3.A04     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            int r1 = r5.getDevice()     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.3SB r1 = r2.A08(r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            if (r1 == 0) goto L_0x07be
            long r6 = r1.A05     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            long r1 = r4.A0I     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            int r15 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r15 > 0) goto L_0x07be
            r1 = 3639(0xe37, float:5.1E-42)
            int r15 = X.C20800yB.A00(r10, r11, r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            r1 = 14
            if (r15 <= r1) goto L_0x0747
            r15 = 14
        L_0x0747:
            X.0wo r1 = r3.A03     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            long r16 = X.C19970wo.A00(r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            long r1 = r4.A0I     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            long r16 = r16 - r1
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = (long) r15     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            long r1 = r1 * r6
            int r6 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x07be
            boolean r1 = r4 instanceof X.AnonymousClass2cW     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            if (r1 == 0) goto L_0x076e
            r1 = r4
            X.2cW r1 = (X.AnonymousClass2cW) r1     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.3F4 r1 = r1.A00     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            boolean r1 = r1.A07     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            if (r1 == 0) goto L_0x076e
            java.lang.String r1 = "NonMessageDataRequestManager/handlePlaceholderMessageResendRequest message type is excluded explicitly"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            goto L_0x0694
        L_0x076e:
            X.1aZ r2 = r3.A06     // Catch:{ 1Fu -> 0x07aa }
            X.5SH r1 = X.AnonymousClass5SH.FOR_COMPANION_SYNC     // Catch:{ 1Fu -> 0x07aa }
            X.63Y r1 = X.C110955bV.A00(r1)     // Catch:{ 1Fu -> 0x07aa }
            X.6CO r1 = r1.A00()     // Catch:{ 1Fu -> 0x07aa }
            X.8NK r2 = r2.A01(r1, r4)     // Catch:{ 1Fu -> 0x07aa }
            X.918 r4 = X.AnonymousClass918.SUCCESS     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.8Nt r1 = X.C172418Nt.DEFAULT_INSTANCE     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.8NN r7 = r1.A0p()     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.8Hz r1 = r2.A0R()     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.8I5 r6 = r1.A0l()     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            r7.A0S()     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.8Hz r2 = r7.A00     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.8Nt r2 = (X.C172418Nt) r2     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            int r1 = r2.bitField0_     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            r1 = r1 | 1
            r2.bitField0_ = r1     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            r2.webMessageInfoBytes_ = r6     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.8Hz r1 = r7.A0R()     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.8Nt r1 = (X.C172418Nt) r1     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.9VX r2 = new X.9VX     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            r2.<init>(r1, r4)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            goto L_0x06ba
        L_0x07aa:
            r2 = move-exception
            java.lang.String r1 = "PlaceholderMessageResendHelper/handlePlaceholderMessageResendRequest invalid message"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            java.lang.String r1 = "PlaceholderMessageResendHelper/handlePlaceholderMessageResendRequest fail to convert to web message info"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.918 r1 = X.AnonymousClass918.GENERAL_ERROR     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.9VX r2 = new X.9VX     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            r2.<init>(r8, r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            goto L_0x06ba
        L_0x07be:
            java.lang.String r1 = "NonMessageDataRequestManager/handlePlaceholderMessageResendRequest message not within time boundary"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.918 r1 = X.AnonymousClass918.GENERAL_ERROR     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.9VX r2 = new X.9VX     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            r2.<init>(r8, r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            goto L_0x06ba
        L_0x07cc:
            java.lang.String r1 = "NonMessageDataRequestManager/handlePlaceholderMessageResendRequest missing required fields in message key"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.918 r1 = X.AnonymousClass918.GENERAL_ERROR     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            X.9VX r2 = new X.9VX     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            r2.<init>(r8, r1)     // Catch:{ IllegalArgumentException -> 0x07f4, 186 -> 0x07e7, 0wR -> 0x07da }
            goto L_0x06ba
        L_0x07da:
            r1 = move-exception
            com.whatsapp.util.Log.e(r9, r1)
            X.918 r1 = X.AnonymousClass918.GENERAL_ERROR
            X.9VX r2 = new X.9VX
            r2.<init>(r8, r1)
            goto L_0x06ba
        L_0x07e7:
            r1 = move-exception
            com.whatsapp.util.Log.e(r9, r1)
            X.918 r1 = X.AnonymousClass918.GENERAL_ERROR
            X.9VX r2 = new X.9VX
            r2.<init>(r8, r1)
            goto L_0x06ba
        L_0x07f4:
            r1 = move-exception
            com.whatsapp.util.Log.e(r9, r1)
            X.918 r1 = X.AnonymousClass918.GENERAL_ERROR
            X.9VX r2 = new X.9VX
            r2.<init>(r8, r1)
            goto L_0x06ba
        L_0x0801:
            boolean r6 = r12 instanceof java.util.Collection
            if (r6 == 0) goto L_0x08b5
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x08b5
            r18 = 0
        L_0x080d:
            X.1Ho r4 = r3.A01
            int r17 = r14.size()
            if (r6 == 0) goto L_0x0864
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x0864
            r21 = 0
        L_0x081d:
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x088e
            r22 = 0
        L_0x0825:
            r16 = 4
            r19 = 0
            r20 = 0
            r14 = r4
            r15 = r13
            r14.A01(r15, r16, r17, r18, r19, r20, r21, r22)
            X.1ah r8 = r3.A02
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "NonMessageDataRequestSendMethod/sendPlaceholderResendResponseMessage placeholder message resend stanzaId="
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = "; remoteDeviceJid"
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = "; placeholderMessageResendResponseResultSize="
            r2.append(r1)
            int r1 = r12.size()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x0ba1
            java.lang.String r1 = "NonMessageDataRequestSendMethod/sendPlaceholderResendResponseMessage placeholder message resend result is empty"
            goto L_0x05f8
        L_0x0864:
            java.util.Iterator r7 = r12.iterator()
            r21 = 0
        L_0x086a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x088b
            java.lang.Object r1 = r7.next()
            X.9VX r1 = (X.AnonymousClass9VX) r1
            X.918 r2 = r1.A01
            X.918 r1 = X.AnonymousClass918.GENERAL_ERROR
            if (r2 != r1) goto L_0x086a
            int r21 = r21 + 1
            if (r21 >= 0) goto L_0x086a
            X.AnonymousClass03T.A04()
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x088b:
            if (r6 == 0) goto L_0x088e
            goto L_0x081d
        L_0x088e:
            java.util.Iterator r6 = r12.iterator()
            r22 = 0
        L_0x0894:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0825
            java.lang.Object r1 = r6.next()
            X.9VX r1 = (X.AnonymousClass9VX) r1
            X.918 r2 = r1.A01
            X.918 r1 = X.AnonymousClass918.NOT_FOUND
            if (r2 != r1) goto L_0x0894
            int r22 = r22 + 1
            if (r22 >= 0) goto L_0x0894
            X.AnonymousClass03T.A04()
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x08b5:
            java.util.Iterator r4 = r12.iterator()
            r18 = 0
        L_0x08bb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x080d
            java.lang.Object r1 = r4.next()
            X.9VX r1 = (X.AnonymousClass9VX) r1
            X.918 r2 = r1.A01
            X.918 r1 = X.AnonymousClass918.SUCCESS
            if (r2 != r1) goto L_0x08bb
            int r18 = r18 + 1
            if (r18 >= 0) goto L_0x08bb
            X.AnonymousClass03T.A04()
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x08dc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "NonMessageDataRequestManager/handleNonMessageDataRequestMessage unknown type="
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            goto L_0x05f8
        L_0x08ef:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "NonMessageDataRequestManager/handleLinkPreviewRequest size="
            r3.append(r2)
            int r2 = r4.size()
            r3.append(r2)
            java.lang.String r2 = "; jid="
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0919
            java.lang.String r1 = "NonMessageDataRequestManager/handleLinkPreviewRequest urls is empty"
            goto L_0x011a
        L_0x0919:
            X.0wU r3 = r1.A0M
            r12 = 4
            X.1ip r2 = new X.1ip
            r7 = r2
            r8 = r1
            r9 = r4
            r10 = r5
            r11 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            r3.Bp1(r2)
            goto L_0x0cb0
        L_0x092b:
            r3 = 0
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.Object[] r2 = r4.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r3 = r2[r3]
            r2 = 2
            byte[] r3 = android.util.Base64.decode(r3, r2)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.8RE r2 = X.AnonymousClass8RE.DEFAULT_INSTANCE     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.8Hz r6 = X.C170918Hz.A08(r2, r3)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.8RE r6 = (X.AnonymousClass8RE) r6     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            int r3 = r6.bitField0_     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r2 = r3 & 1
            if (r2 == 0) goto L_0x0b88
            r2 = r3 & 2
            if (r2 == 0) goto L_0x0b88
            r2 = r3 & 4
            if (r2 == 0) goto L_0x0b88
            r2 = r3 & 8
            if (r2 == 0) goto L_0x0b88
            java.lang.String r3 = r6.chatJid_     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.13q r2 = X.AnonymousClass11F.A00     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.11F r4 = X.C222713q.A01(r3)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r10 = r6.oldestMsgId_     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            boolean r8 = r6.oldestMsgFromMe_     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            int r11 = r6.onDemandMsgCount_     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.1Cz r1 = r1.A0I     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            boolean r2 = r4 instanceof X.C28981Uw     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            if (r2 != 0) goto L_0x0cb0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r3.<init>()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r2 = "HistorySyncSendMethods/sendHistorySyncOnDemandResponse sessionId="
            r3.append(r2)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r3.append(r9)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r2 = r3.toString()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.19g r2 = r1.A0M     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            int r13 = r5.getDevice()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.3SB r6 = r2.A08(r13)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r23 = 4
            r7 = 3
            if (r6 != 0) goto L_0x09ab
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r3.<init>()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r2 = "HistorySyncSendMethods/sendHistorySyncOnDemandResponse no device info for device id "
            r3.append(r2)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r3.append(r13)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r2 = r3.toString()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.1Ho r2 = r1.A06     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
        L_0x09a6:
            r2.A00(r1, r9)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            goto L_0x0cb0
        L_0x09ab:
            long r13 = r6.A05     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.1Cy r2 = r1.A05     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.0yC r3 = r2.A01     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r2 = 3642(0xe3a, float:5.104E-42)
            int r3 = X.C20800yB.A00(r12, r3, r2)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r2 = 365(0x16d, float:5.11E-43)
            int r3 = java.lang.Math.min(r3, r2)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r2 = 0
            int r2 = java.lang.Math.max(r3, r2)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            long r2 = (long) r2     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r15 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r15
            long r29 = r13 - r2
            r2 = 1
            if (r10 == 0) goto L_0x09e8
            X.3Qa r3 = new X.3Qa     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r3.<init>(r4, r10, r8)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.1A1 r2 = r1.A0X     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.3T1 r2 = r2.A03(r3)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            if (r2 != 0) goto L_0x09e6
            java.lang.String r2 = "HistorySyncSendMethods/sendHistorySyncOnDemandResponse failed to find oldest message on companion"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.1Ho r2 = r1.A06     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            goto L_0x09a6
        L_0x09e6:
            long r2 = r2.A1N     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
        L_0x09e8:
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r15.<init>()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.0xM r10 = r1.A0C     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.0wo r8 = r1.A09     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            long r36 = X.C19970wo.A00(r8)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r8 = 5000(0x1388, float:7.006E-42)
            int r33 = java.lang.Math.min(r11, r8)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.17T r8 = r10.A0j     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r31 = r8
            r32 = r4
            r34 = r2
            long r21 = r31.A05(r32, r33, r34, r36)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r20 = 1
            r19 = 0
            r11 = 1
            int r8 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            r16 = 0
            if (r8 <= 0) goto L_0x0a15
            r16 = 1
        L_0x0a15:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r11.<init>()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r8 = X.AnonymousClass2xD.A0J     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r11.append(r8)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r8 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r11.append(r8)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r8 = " AND _id >= ? "
            r11.append(r8)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            if (r16 == 0) goto L_0x0a30
            java.lang.String r8 = " AND _id < ? "
            r11.append(r8)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
        L_0x0a30:
            java.lang.String r8 = " ORDER BY _id DESC"
            r11.append(r8)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r12 = r11.toString()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r18 = 2
            if (r16 == 0) goto L_0x0a65
            r8 = 4
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.163 r8 = r10.A0H     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            long r16 = r8.A08(r4)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r8 = java.lang.String.valueOf(r16)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r11[r19] = r8     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r8 = java.lang.String.valueOf(r36)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r11[r20] = r8     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r8 = java.lang.String.valueOf(r21)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r11[r18] = r8     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r11[r7] = r2     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
        L_0x0a5e:
            X.12P r2 = r10.A0c     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.1M0 r3 = r2.get()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            goto L_0x0a80
        L_0x0a65:
            java.lang.String[] r11 = new java.lang.String[r7]     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.163 r2 = r10.A0H     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            long r2 = r2.A08(r4)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r11[r19] = r2     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r2 = java.lang.String.valueOf(r36)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r11[r20] = r2     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r2 = java.lang.String.valueOf(r21)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r11[r18] = r2     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            goto L_0x0a5e
        L_0x0a80:
            X.14e r7 = r3.A02     // Catch:{ all -> 0x0b7e }
            java.lang.String r2 = "GET_HISTORY_MESSAGE_FOR_JID"
            android.database.Cursor r7 = r7.A09(r12, r2, r11)     // Catch:{ all -> 0x0b7e }
            r3.close()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.6CO r26 = X.C24581Cz.A01(r6, r1)     // Catch:{ all -> 0x0b77 }
            X.1HI r10 = r1.A0V     // Catch:{ all -> 0x0b77 }
            r16 = 0
            r24 = r10
            r25 = r7
            r27 = r16
            r28 = r15
            java.util.LinkedHashMap r6 = r24.A02(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0b77 }
            boolean r2 = r7.moveToFirst()     // Catch:{ all -> 0x0b77 }
            if (r2 == 0) goto L_0x0ac6
            X.1A1 r2 = r1.A0X     // Catch:{ all -> 0x0b77 }
            X.3T1 r2 = r2.A00(r7)     // Catch:{ all -> 0x0b77 }
            if (r2 == 0) goto L_0x0ac6
            long r2 = r2.A0I     // Catch:{ all -> 0x0b77 }
            int r8 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x0ac6
            java.lang.String r2 = "HistorySyncSendMethods/sendHistorySyncOnDemandResponse fetch message with ts after device pairing unexpectedly"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0b77 }
            X.1Ho r2 = r1.A06     // Catch:{ all -> 0x0b77 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0b77 }
            r2.A00(r1, r9)     // Catch:{ all -> 0x0b77 }
            r7.close()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            goto L_0x0cb0
        L_0x0ac6:
            boolean r2 = r7.moveToLast()     // Catch:{ all -> 0x0b77 }
            r8 = 0
            if (r2 == 0) goto L_0x0ae6
            X.1A1 r2 = r1.A0X     // Catch:{ all -> 0x0b77 }
            X.3T1 r12 = r2.A00(r7)     // Catch:{ all -> 0x0b77 }
            if (r12 == 0) goto L_0x0ae6
            X.17U r11 = r1.A0F     // Catch:{ all -> 0x0b77 }
            long r2 = r12.A1O     // Catch:{ all -> 0x0b77 }
            boolean r13 = r11.A07(r4, r2)     // Catch:{ all -> 0x0b77 }
            long r2 = r12.A0I     // Catch:{ all -> 0x0b77 }
            int r11 = (r2 > r29 ? 1 : (r2 == r29 ? 0 : -1))
            r12 = 0
            if (r11 >= 0) goto L_0x0ae8
            r12 = 1
            goto L_0x0ae8
        L_0x0ae6:
            r12 = 0
            r13 = 0
        L_0x0ae8:
            int r11 = r7.getCount()     // Catch:{ all -> 0x0b77 }
            r7.close()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.4uP r2 = X.C100064uP.DEFAULT_INSTANCE     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.8NN r2 = r2.A0p()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.4tx r2 = (X.C99784tx) r2     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.5UH r3 = X.AnonymousClass5UH.ON_DEMAND     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r2.A0Y(r3)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r2.A0U(r8)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r3 = 100
            r2.A0V(r3)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            boolean r3 = r15.isEmpty()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            if (r3 != 0) goto L_0x0b0d
            r2.A0Z(r15)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
        L_0x0b0d:
            java.lang.Object r3 = r6.get(r4)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            if (r3 == 0) goto L_0x0b2b
            java.lang.Object r4 = r6.get(r4)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.C18740tg.A06(r4)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.4tv r4 = (X.C99764tv) r4     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.8Hz r3 = r4.A00     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.4uT r3 = (X.C100104uT) r3     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.B6c r3 = r3.messages_     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            int r8 = r3.size()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            if (r12 != 0) goto L_0x0b3b
            if (r13 == 0) goto L_0x0b3e
            goto L_0x0b41
        L_0x0b2b:
            X.1DM r3 = r1.A08     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.util.HashMap r6 = r3.A09()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.util.HashMap r3 = r3.A0A()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.4tv r4 = r10.A00(r4, r6, r3)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            if (r11 <= 0) goto L_0x0b3e
        L_0x0b3b:
            X.5UB r3 = X.AnonymousClass5UB.COMPLETE_ON_DEMAND_SYNC_BUT_MORE_MSG_REMAIN_ON_PRIMARY     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            goto L_0x0b43
        L_0x0b3e:
            X.5UB r3 = X.AnonymousClass5UB.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            goto L_0x0b43
        L_0x0b41:
            X.5UB r3 = X.AnonymousClass5UB.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
        L_0x0b43:
            r4.A0U(r3)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.8Hz r3 = r4.A0R()     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            X.4uT r3 = (X.C100104uT) r3     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r2.A0X(r3)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r23 = 6
            r24 = 100
            r28 = -1
            long r3 = (long) r8     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r36 = 0
            r22 = 0
            r25 = 0
            r30 = -1
            r32 = -1
            r38 = -1
            r40 = 0
            r17 = r5
            r18 = r1
            r19 = r2
            r20 = r9
            r21 = r16
            r26 = r41
            r34 = r3
            X.C24581Cz.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r32, r34, r36, r38, r40)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            goto L_0x0cb0
        L_0x0b77:
            r2 = move-exception
            if (r7 == 0) goto L_0x0b87
            r7.close()     // Catch:{ all -> 0x0b83 }
            goto L_0x0b87
        L_0x0b7e:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x0b83 }
            goto L_0x0b87
        L_0x0b83:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
        L_0x0b87:
            throw r2     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
        L_0x0b88:
            X.1Ho r2 = r1.A03     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            r2.A00(r1, r9)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            java.lang.String r1 = "NonMessageDataRequestManager/handleHistorySyncOnDemandRequest missing required fields in request"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 0wR | 186 | IllegalArgumentException -> 0x0b99 }
            goto L_0x0cb0
        L_0x0b99:
            r2 = move-exception
            java.lang.String r1 = "NonMessageDataRequestManager/handleHistorySyncOnDemandRequest error in parsing request"
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x0cb0
        L_0x0ba1:
            X.0wQ r1 = r8.A00
            r1.A0G()
            com.whatsapp.jid.PhoneUserJid r6 = r1.A03
            if (r6 != 0) goto L_0x0bae
            java.lang.String r1 = "NonMessageDataRequestSendMethod/sendPlaceholderResendResponseMessage myUserJid is null"
            goto L_0x011a
        L_0x0bae:
            X.19w r4 = r8.A04
            X.0wo r1 = r8.A02
            long r1 = X.C19970wo.A00(r1)
            r3 = 1
            X.3Qa r3 = r4.A02(r6, r3)
            X.8Xy r4 = new X.8Xy
            r4.<init>(r3, r13, r1)
            r4.A00 = r5
            r4.A1Z(r12)
            X.1AI r1 = r8.A03
            long r6 = r1.A01(r4)
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0bd5
            java.lang.String r1 = "NonMessageDataRequestSendMethod/sendPlaceholderResendResponseMessage unable to add placeholder message resend peer message"
            goto L_0x011a
        L_0x0bd5:
            X.164 r2 = r8.A01
            com.whatsapp.jobqueue.job.SendPeerMessageJob r1 = new com.whatsapp.jobqueue.job.SendPeerMessageJob
            r1.<init>(r5, r4)
            r2.A01(r1)
            goto L_0x0cb0
        L_0x0be1:
            boolean r1 = r0 instanceof X.C174658Xy
            if (r1 == 0) goto L_0x0c61
            r1 = r43
            X.1aX r4 = r1.A01
            r1 = r0
            X.8Xy r1 = (X.C174658Xy) r1
            java.util.List r1 = r1.A00
            java.util.Iterator r5 = r1.iterator()
        L_0x0bf2:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0cb0
            java.lang.Object r2 = r5.next()
            X.8Qi r2 = (X.C173088Qi) r2
            int r1 = r2.mediaUploadResult_
            X.918 r3 = X.AnonymousClass918.A00(r1)
            if (r3 != 0) goto L_0x0c08
            X.918 r3 = X.AnonymousClass918.GENERAL_ERROR
        L_0x0c08:
            X.918 r1 = X.AnonymousClass918.SUCCESS
            if (r3 == r1) goto L_0x0c21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "NonMessageDataRequestManager/handlePlaceholderResendResponse media error="
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
        L_0x0c1d:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0bf2
        L_0x0c21:
            X.8Nt r1 = r2.placeholderMessageResendResponse_
            if (r1 != 0) goto L_0x0c27
            X.8Nt r1 = X.C172418Nt.DEFAULT_INSTANCE
        L_0x0c27:
            X.AUx r2 = r1.webMessageInfoBytes_
            X.8SU r1 = X.AnonymousClass8SU.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0c5e, 1Tb -> 0x0c5b }
            X.8Hz r3 = X.C170918Hz.A04(r2, r1)     // Catch:{ 186 -> 0x0c5e, 1Tb -> 0x0c5b }
            X.8SU r3 = (X.AnonymousClass8SU) r3     // Catch:{ 186 -> 0x0c5e, 1Tb -> 0x0c5b }
            X.5SH r1 = X.AnonymousClass5SH.FOR_COMPANION_SYNC     // Catch:{ 186 -> 0x0c5e, 1Tb -> 0x0c5b }
            X.68v r2 = new X.68v     // Catch:{ 186 -> 0x0c5e, 1Tb -> 0x0c5b }
            r2.<init>(r1)     // Catch:{ 186 -> 0x0c5e, 1Tb -> 0x0c5b }
            X.1aZ r1 = r4.A0E     // Catch:{ 186 -> 0x0c5e, 1Tb -> 0x0c5b }
            X.3T1 r3 = r1.A02(r2, r3)     // Catch:{ 186 -> 0x0c5e, 1Tb -> 0x0c5b }
            X.3Qa r2 = r3.A1J
            boolean r1 = r2.A02
            if (r1 == 0) goto L_0x0c47
            r1 = 1
            r3.A1Y = r1
        L_0x0c47:
            X.1A1 r1 = r4.A0L
            X.3T1 r1 = r1.A03(r2)
            if (r1 == 0) goto L_0x0bf2
            boolean r1 = X.C203359nq.A0C(r1)
            if (r1 == 0) goto L_0x0bf2
            X.0xM r1 = r4.A09
            r1.A0P(r3)
            goto L_0x0bf2
        L_0x0c5b:
            java.lang.String r1 = "NonMessageDataRequestManager/handlePlaceholderResendResponse could not parse wmi"
            goto L_0x0c1d
        L_0x0c5e:
            java.lang.String r1 = "NonMessageDataRequestManager/handlePlaceholderResendResponse invalid buffer"
            goto L_0x0c1d
        L_0x0c61:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "PeerMessageHandler/handleNonMessageDataRequestResponseMessage unexpected type="
            r2.append(r1)
            boolean r1 = r0 instanceof X.C174648Xx
            if (r1 == 0) goto L_0x0c79
            r1 = -1
        L_0x0c70:
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x011a
        L_0x0c79:
            r1 = 2
            goto L_0x0c70
        L_0x0c7b:
            boolean r1 = r0 instanceof X.C180988mk
            if (r1 == 0) goto L_0x0cb8
            X.8mk r0 = (X.C180988mk) r0
            java.lang.String r1 = "PeerMessageHandler/handleKeyRequestMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = r43
            X.1A9 r6 = r1.A05
            com.whatsapp.jid.DeviceJid r5 = r0.A1T
            r4 = 0
            if (r5 == 0) goto L_0x0cb0
            java.util.Set r1 = r0.A00
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            java.util.HashMap r3 = X.AnonymousClass1A9.A00(r6, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "SyncdKeyManager/handleAppStateSyncKeyRequestMessage syncdKeyMap = "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r6.A09(r5, r3, r4)
        L_0x0cb0:
            r1 = r43
            X.1DL r1 = r1.A06
            r1.A08(r0)
            return
        L_0x0cb8:
            boolean r1 = r0 instanceof X.AnonymousClass5J6
            if (r1 == 0) goto L_0x0d33
            X.5J6 r0 = (X.AnonymousClass5J6) r0
            r1 = 2
            java.lang.Object[] r3 = new java.lang.Object[r1]
            long r1 = r0.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            r1 = 0
            r3[r1] = r2
            java.util.Set r6 = r0.A01
            r1 = 1
            r3[r1] = r6
            java.lang.String r1 = "PeerMessageHandler/handleFatalExceptionNotificationMessage: time = %s; collectionNames=%s"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = r43
            X.196 r5 = r1.A04
            monitor-enter(r5)
            com.whatsapp.jid.DeviceJid r1 = r0.A1T     // Catch:{ all -> 0x0dde }
            if (r1 == 0) goto L_0x0d20
            X.19g r2 = r5.A0P     // Catch:{ all -> 0x0dde }
            int r1 = r1.getDevice()     // Catch:{ all -> 0x0dde }
            X.3SB r3 = r2.A08(r1)     // Catch:{ all -> 0x0dde }
            if (r3 == 0) goto L_0x0d20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0dde }
            r2.<init>()     // Catch:{ all -> 0x0dde }
            java.lang.String r1 = "sync-manager/handleFatalExceptionOnCompanion companion: "
            r2.append(r1)     // Catch:{ all -> 0x0dde }
            com.whatsapp.jid.DeviceJid r1 = r3.A07     // Catch:{ all -> 0x0dde }
            int r1 = r1.getDevice()     // Catch:{ all -> 0x0dde }
            r2.append(r1)     // Catch:{ all -> 0x0dde }
            java.lang.String r1 = "; ["
            r2.append(r1)     // Catch:{ all -> 0x0dde }
            X.2qA r1 = r3.A08     // Catch:{ all -> 0x0dde }
            r2.append(r1)     // Catch:{ all -> 0x0dde }
            r1 = 40
            r2.append(r1)     // Catch:{ all -> 0x0dde }
            java.lang.String r1 = r3.A09     // Catch:{ all -> 0x0dde }
            r2.append(r1)     // Catch:{ all -> 0x0dde }
            java.lang.String r1 = ")]"
            r2.append(r1)     // Catch:{ all -> 0x0dde }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0dde }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0dde }
        L_0x0d20:
            X.0wN r4 = r5.A05     // Catch:{ all -> 0x0dde }
            java.lang.String r3 = "app-sate-sync-handle-fatal-exception-on-companion"
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0dde }
            r1 = 0
            r4.A0E(r3, r2, r1)     // Catch:{ all -> 0x0dde }
            r1 = 0
            r5.A0K(r1)     // Catch:{ all -> 0x0dde }
            monitor-exit(r5)     // Catch:{ all -> 0x0dde }
            goto L_0x0cb0
        L_0x0d33:
            boolean r1 = r0 instanceof X.AnonymousClass5J7
            if (r1 == 0) goto L_0x0d98
            X.5J7 r0 = (X.AnonymousClass5J7) r0
            java.lang.String r1 = "PeerMessageHandler/handleInitialSecurityNotificationSettingSyncMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = r43
            X.1aj r6 = r1.A03
            java.lang.Object r4 = r6.A04
            monitor-enter(r4)
            X.0wQ r1 = r6.A00     // Catch:{ all -> 0x0de4 }
            boolean r1 = r1.A0L()     // Catch:{ all -> 0x0de4 }
            if (r1 != 0) goto L_0x0d55
            java.lang.String r1 = "ReceiveSecurityNotificationSettingManager/ received in primary mode"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0de4 }
        L_0x0d52:
            monitor-exit(r4)     // Catch:{ all -> 0x0de4 }
            goto L_0x0cb0
        L_0x0d55:
            X.0wp r7 = r6.A02     // Catch:{ all -> 0x0de4 }
            android.content.SharedPreferences r2 = X.C19980wp.A00(r7)     // Catch:{ all -> 0x0de4 }
            java.lang.String r5 = "has_received_security_notification_setting"
            r1 = 0
            boolean r1 = r2.getBoolean(r5, r1)     // Catch:{ all -> 0x0de4 }
            if (r1 != 0) goto L_0x0d52
            X.0v0 r1 = r6.A03     // Catch:{ all -> 0x0de4 }
            boolean r3 = r0.A00     // Catch:{ all -> 0x0de4 }
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r1)     // Catch:{ all -> 0x0de4 }
            java.lang.String r1 = "security_notifications"
            android.content.SharedPreferences$Editor r1 = r2.putBoolean(r1, r3)     // Catch:{ all -> 0x0de4 }
            r1.apply()     // Catch:{ all -> 0x0de4 }
            android.content.SharedPreferences r1 = X.C19980wp.A00(r7)     // Catch:{ all -> 0x0de4 }
            android.content.SharedPreferences$Editor r2 = r1.edit()     // Catch:{ all -> 0x0de4 }
            r1 = 1
            android.content.SharedPreferences$Editor r1 = r2.putBoolean(r5, r1)     // Catch:{ all -> 0x0de4 }
            r1.apply()     // Catch:{ all -> 0x0de4 }
            X.1ak r3 = r6.A01     // Catch:{ all -> 0x0de4 }
            monitor-enter(r3)     // Catch:{ all -> 0x0de4 }
            X.349 r1 = r3.A00     // Catch:{ all -> 0x0de1 }
            if (r1 == 0) goto L_0x0d96
            X.3ty r2 = r1.A01     // Catch:{ all -> 0x0de1 }
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0de1 }
            r2.A0C(r1)     // Catch:{ all -> 0x0de1 }
        L_0x0d96:
            monitor-exit(r3)     // Catch:{ all -> 0x0de4 }
            goto L_0x0d52
        L_0x0d98:
            boolean r1 = r0 instanceof X.AnonymousClass5J9
            if (r1 == 0) goto L_0x00f4
            X.5J9 r0 = (X.AnonymousClass5J9) r0
            java.lang.String r1 = "PeerMessageHandler/handleHistorySyncNoticationMessage"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = r43
            X.1aS r4 = r1.A02
            X.0wQ r1 = r4.A00
            boolean r1 = r1.A0L()
            if (r1 != 0) goto L_0x0de7
            java.lang.String r1 = "ReceiveHistorySyncManager/ Received history sync as primary device"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.1DL r1 = r4.A0A
            r1.A08(r0)
            return
        L_0x0dba:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0dbd:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0fdb }
            throw r1
        L_0x0dc2:
            r1 = move-exception
            if (r13 == 0) goto L_0x0dcd
            r13.close()     // Catch:{ all -> 0x0dc9 }
            goto L_0x0dcd
        L_0x0dc9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0dce }
        L_0x0dcd:
            throw r1     // Catch:{ all -> 0x0dce }
        L_0x0dce:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0dd3 }
            goto L_0x0dd7
        L_0x0dd3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0dd8 }
        L_0x0dd7:
            throw r1     // Catch:{ all -> 0x0dd8 }
        L_0x0dd8:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0fd1 }
            goto L_0x0fd5
        L_0x0dde:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0dde }
            throw r0
        L_0x0de1:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0de4 }
            throw r0     // Catch:{ all -> 0x0de4 }
        L_0x0de4:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0de4 }
            throw r0
        L_0x0de7:
            int r3 = r0.A03
            r1 = 2
            if (r3 == r1) goto L_0x0df0
            r1 = 3
            r9 = 0
            if (r3 != r1) goto L_0x0df1
        L_0x0df0:
            r9 = 1
        L_0x0df1:
            X.1Id r6 = r4.A02
            int r1 = r0.A01
            long r1 = (long) r1
            int r8 = r0.A00
            X.2RN r5 = new X.2RN
            r5.<init>()
            java.lang.String r7 = X.C25911Id.A00(r6)
            r5.A05 = r7
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r5.A03 = r1
            X.0wo r1 = r6.A01
            long r1 = X.C19970wo.A00(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r5.A04 = r1
            java.lang.Integer r1 = X.AnonymousClass1AB.A01(r3)
            r5.A00 = r1
            java.lang.Integer r1 = X.AnonymousClass1AB.A00(r3)
            r5.A01 = r1
            long r1 = (long) r8
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r5.A02 = r1
            X.0yW r1 = r6.A03
            r1.Bly(r5)
            long r5 = r0.A05
            if (r9 == 0) goto L_0x0e7e
            int r2 = r0.A00
        L_0x0e33:
            byte[] r14 = r0.A0J
            r9 = 0
            java.lang.String r10 = r0.A0D
            java.lang.String r11 = r0.A0B
            java.lang.String r12 = r0.A0C
            X.3Qa r1 = r0.A1J
            java.lang.String r13 = r1.A01
            byte[] r15 = r0.A0I
            X.0wo r1 = r4.A06
            long r20 = X.C19970wo.A00(r1)
            r1 = 0
            X.6Lp r8 = new X.6Lp
            r17 = r2
            r18 = r5
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20)
            if (r3 != 0) goto L_0x0e77
            X.0wp r3 = r4.A05
            org.json.JSONObject r2 = r3.A01()
            if (r2 != 0) goto L_0x0e77
            org.json.JSONObject r2 = X.C30591aS.A00(r1, r1)
            android.content.SharedPreferences r1 = X.C19980wp.A00(r3)
            android.content.SharedPreferences$Editor r3 = r1.edit()
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "history_sync_companion_state"
            android.content.SharedPreferences$Editor r1 = r3.putString(r1, r2)
            r1.apply()
        L_0x0e77:
            X.1aT r7 = r4.A09
            X.C18740tg.A00()
            r6 = 1
            goto L_0x0e80
        L_0x0e7e:
            r2 = 0
            goto L_0x0e33
        L_0x0e80:
            X.18P r1 = r7.A00     // Catch:{ SQLiteConstraintException -> 0x0ea4 }
            X.1M0 r5 = r1.A04()     // Catch:{ SQLiteConstraintException -> 0x0ea4 }
            X.1aU r3 = r7.A01     // Catch:{ all -> 0x0e9a }
            java.lang.String r2 = "INSERT INTO history_sync_companion (message_id, sync_type, chunk_order, media_key, media_hash, media_enc_hash, file_size, direct_path, local_path, start_time, inline_payload) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            java.lang.String r1 = "HistorySyncCompanionStore.INSERT_CHUNK"
            X.6QI r1 = r3.A00(r2, r1, r6)     // Catch:{ all -> 0x0e9a }
            X.C30601aT.A00(r1, r8)     // Catch:{ all -> 0x0e9a }
            r1.A02()     // Catch:{ all -> 0x0e9a }
            r5.close()     // Catch:{ SQLiteConstraintException -> 0x0ea4 }
            goto L_0x0ec0
        L_0x0e9a:
            r2 = move-exception
            r5.close()     // Catch:{ all -> 0x0e9f }
            goto L_0x0ea3
        L_0x0e9f:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ SQLiteConstraintException -> 0x0ea4 }
        L_0x0ea3:
            throw r2     // Catch:{ SQLiteConstraintException -> 0x0ea4 }
        L_0x0ea4:
            r5 = move-exception
            X.1aU r3 = r7.A01
            java.lang.String r2 = "UPDATE history_sync_companion SET message_id = ?, sync_type = ?, chunk_order = ?, media_key = ?, media_hash = ?, media_enc_hash = ?, file_size = ?, direct_path = ?, local_path = ?, start_time = ?, inline_payload = ?  WHERE message_id = ?"
            java.lang.String r1 = "HistorySyncCompanionStore.UPDATE_CHUNK"
            X.6QI r3 = r3.A00(r2, r1, r6)
            X.C30601aT.A00(r3, r8)
            r2 = 12
            java.lang.String r1 = r8.A08
            r3.A06(r2, r1)
            int r1 = r3.A01()
            if (r1 == r6) goto L_0x0ec0
            throw r5
        L_0x0ec0:
            r4.A01(r0)
            return
        L_0x0ec4:
            X.19L r6 = r1.A0B
            long r4 = r3.A07
            r2 = 0
            X.9ju r4 = X.AnonymousClass19L.A00(r6, r2, r4)
            if (r4 == 0) goto L_0x0ed3
            r2 = 4
            r4.A04(r2)
        L_0x0ed3:
            if (r55 != 0) goto L_0x0f79
            X.1al r5 = r1.A02
            X.12P r0 = r5.A02
            X.1M0 r8 = r0.A05()
            X.1A1 r7 = r5.A05     // Catch:{ all -> 0x0f74 }
            X.3Qa r0 = r3.BE4()     // Catch:{ all -> 0x0f74 }
            X.3T1 r0 = r7.A03(r0)     // Catch:{ all -> 0x0f74 }
            if (r0 == 0) goto L_0x0eff
            r8.close()
            boolean r2 = r3.A12
            X.3Qa r0 = r3.A0R
            if (r0 != 0) goto L_0x0ef4
            X.3Qa r0 = r3.A0Q
        L_0x0ef4:
            r0.toString()
            if (r2 != 0) goto L_0x1523
            X.1DL r0 = r1.A09
            r0.A0C(r3)
            return
        L_0x0eff:
            X.3Qa r2 = r3.BE4()     // Catch:{ all -> 0x0f74 }
            long r0 = r3.A18     // Catch:{ all -> 0x0f74 }
            X.2c2 r4 = new X.2c2     // Catch:{ all -> 0x0f74 }
            r4.<init>(r2, r0)     // Catch:{ all -> 0x0f74 }
            r3.A02(r4)     // Catch:{ all -> 0x0f74 }
            int r0 = r3.A04     // Catch:{ all -> 0x0f74 }
            r4.A00 = r0     // Catch:{ all -> 0x0f74 }
            java.lang.String r0 = r3.A0j     // Catch:{ all -> 0x0f74 }
            if (r0 == 0) goto L_0x0f50
            com.whatsapp.jid.UserJid r1 = r3.A0K     // Catch:{ all -> 0x0f74 }
            if (r1 == 0) goto L_0x0f50
            X.3Qa r0 = r3.BE4()     // Catch:{ all -> 0x0f74 }
            X.11F r6 = r0.A00     // Catch:{ all -> 0x0f74 }
            X.0wQ r0 = r5.A00     // Catch:{ all -> 0x0f74 }
            boolean r2 = r0.A0M(r1)     // Catch:{ all -> 0x0f74 }
            java.lang.String r0 = r3.A0j     // Catch:{ all -> 0x0f74 }
            X.3Qa r1 = new X.3Qa     // Catch:{ all -> 0x0f74 }
            r1.<init>(r6, r0, r2)     // Catch:{ all -> 0x0f74 }
            X.1Jf r0 = r5.A04     // Catch:{ all -> 0x0f74 }
            X.3Qa r1 = r0.A01(r1)     // Catch:{ all -> 0x0f74 }
            com.whatsapp.jid.UserJid r0 = r3.A0K     // Catch:{ all -> 0x0f74 }
            X.9Vv r6 = new X.9Vv     // Catch:{ all -> 0x0f74 }
            r6.<init>(r0, r1)     // Catch:{ all -> 0x0f74 }
            X.3Qa r0 = r6.A01     // Catch:{ all -> 0x0f74 }
            X.3T1 r0 = r7.A03(r0)     // Catch:{ all -> 0x0f74 }
            if (r0 == 0) goto L_0x0f6b
            long r1 = r0.A1N     // Catch:{ all -> 0x0f74 }
            X.2bB r0 = new X.2bB     // Catch:{ all -> 0x0f74 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0f74 }
            r4.A0u(r0)     // Catch:{ all -> 0x0f74 }
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r4.A0j(r0)     // Catch:{ all -> 0x0f74 }
        L_0x0f50:
            X.0yC r2 = r5.A03     // Catch:{ all -> 0x0f74 }
            r1 = 5718(0x1656, float:8.013E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x0f74 }
            boolean r0 = X.C20800yB.A01(r0, r2, r1)     // Catch:{ all -> 0x0f74 }
            if (r0 == 0) goto L_0x0f6b
            X.9VY r0 = r3.A08     // Catch:{ all -> 0x0f74 }
            if (r0 == 0) goto L_0x0f6b
            byte[] r2 = r0.A00     // Catch:{ all -> 0x0f74 }
            r1 = 0
            X.9WK r0 = new X.9WK     // Catch:{ all -> 0x0f74 }
            r0.<init>(r1, r2, r1)     // Catch:{ all -> 0x0f74 }
            r4.A0y(r0)     // Catch:{ all -> 0x0f74 }
        L_0x0f6b:
            X.0xM r0 = r5.A01     // Catch:{ all -> 0x0f74 }
            r0.A0P(r4)     // Catch:{ all -> 0x0f74 }
            r8.close()
            return
        L_0x0f74:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0fdb }
            throw r1
        L_0x0f79:
            boolean r2 = X.C66013Ui.A0n(r0)
            if (r2 == 0) goto L_0x0f86
            X.1SR r2 = r1.A03
            r1 = 1
            r2.A04(r0, r1)
            return
        L_0x0f86:
            boolean r2 = r0 instanceof X.AnonymousClass2bH
            if (r2 == 0) goto L_0x0fe0
            X.1Fl r6 = r1.A05
            r5 = r0
            X.2bH r5 = (X.AnonymousClass2bH) r5
            X.184 r7 = r6.A04
            int r2 = r5.A00
            boolean r2 = r7.A02(r2)
            if (r2 == 0) goto L_0x14e0
            X.3Qp r4 = X.C25221Fl.A01(r6, r5)
            if (r4 == 0) goto L_0x0fe0
            X.3un r9 = r4.A0b
            X.3Qa r2 = r5.A1J
            X.11F r8 = r2.A00
            long r12 = r5.A0I
            int r11 = r5.A00
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            boolean r2 = X.AnonymousClass184.A00(r7, r8, r9, r10, r11, r12)
            if (r2 != 0) goto L_0x0fe0
            int r2 = r5.A0C
            if (r2 != 0) goto L_0x0fe0
            X.12P r2 = r6.A02
            X.1M0 r3 = r2.A05()
            X.71s r2 = r3.B1k()     // Catch:{ all -> 0x0fd6 }
            r6.A05(r4, r5)     // Catch:{ all -> 0x0fcc }
            r2.A00()     // Catch:{ all -> 0x0fcc }
            r2.close()     // Catch:{ all -> 0x0fd6 }
            goto L_0x14dd
        L_0x0fcc:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0fd1 }
            goto L_0x0fd5
        L_0x0fd1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0fd6 }
        L_0x0fd5:
            throw r1     // Catch:{ all -> 0x0fd6 }
        L_0x0fd6:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0fdb }
            throw r1
        L_0x0fdb:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0fe0:
            boolean r2 = r0 instanceof X.AnonymousClass2bY
            if (r2 == 0) goto L_0x10b0
            X.1Fl r10 = r1.A05
            r7 = r0
            X.2bY r7 = (X.AnonymousClass2bY) r7
            X.3Qa r2 = r7.A1J
            X.11F r9 = r2.A00
            r6 = 1
            if (r9 != 0) goto L_0x0ffc
            java.lang.String r2 = "EphemeralSettingMessageStore/incomingEphemeralSyncResponse/no chat"
        L_0x0ff2:
            com.whatsapp.util.Log.w((java.lang.String) r2)
        L_0x0ff5:
            java.lang.String r2 = "DecryptMessageHandler/incomingEphemeralSyncResponse/do not process ESR"
            com.whatsapp.util.Log.w((java.lang.String) r2)
            goto L_0x14e0
        L_0x0ffc:
            X.0yC r5 = r10.A06
            r4 = 2714(0xa9a, float:3.803E-42)
            X.0yV r2 = X.C21000yV.A02
            boolean r2 = X.C20800yB.A01(r2, r5, r4)
            if (r2 != 0) goto L_0x1017
            java.lang.String r2 = "EphemeralSettingMessageStore/incomingEphemeralSyncResponse/esr abprop off"
            com.whatsapp.util.Log.w((java.lang.String) r2)
            X.1Fk r3 = r10.A05
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        L_0x1013:
            r3.A01(r9, r2)
            goto L_0x0ff5
        L_0x1017:
            X.184 r4 = r10.A04
            int r2 = r7.A00
            boolean r2 = r4.A02(r2)
            if (r2 != 0) goto L_0x102f
            X.1Fk r3 = r10.A05
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.A01(r9, r2)
            java.lang.String r2 = "EphemeralSettingMessageStore/incomingEphemeralSyncResponse/invalid duration"
            goto L_0x0ff2
        L_0x102f:
            X.3Qp r2 = X.C25221Fl.A01(r10, r7)
            if (r2 != 0) goto L_0x1042
            java.lang.String r2 = "EphemeralSettingMessageStore/incomingEphemeralSyncResponse/not a user or no chat"
            com.whatsapp.util.Log.w((java.lang.String) r2)
            X.1Fk r3 = r10.A05
            r2 = 7
        L_0x103d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x1013
        L_0x1042:
            X.3un r11 = r2.A0b
            int r8 = r7.A00
            long r4 = r7.A01
            int r2 = r7.A00
            X.3un r6 = new X.3un
            r6.<init>(r8, r4, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "EphemeralSettingMessageStore/incomingEphemeralSyncResponse/current ephemeral info "
            r4.append(r2)
            r4.append(r11)
            java.lang.String r2 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "EphemeralSettingMessageStore/incomingEphemeralSyncResponse/incoming ephemeral info "
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            long r6 = r7.A01
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            boolean r2 = r9 instanceof com.whatsapp.jid.UserJid
            r8 = 0
            if (r2 != 0) goto L_0x108d
            java.lang.String r2 = "EphemeralSettingMessageUtils/incomingEphemeralSyncResponse/not one-to-one chat"
        L_0x1084:
            com.whatsapp.util.Log.w((java.lang.String) r2)
            if (r8 != 0) goto L_0x10b0
            X.1Fk r3 = r10.A05
            r2 = 4
            goto L_0x103d
        L_0x108d:
            if (r4 != 0) goto L_0x1092
            java.lang.String r2 = "EphemeralSettingMessageUtils/incomingEphemeralSyncResponse/no EST timestamp"
            goto L_0x1084
        L_0x1092:
            if (r11 != 0) goto L_0x1097
            java.lang.String r2 = "EphemeralSettingMessageUtils/incomingEphemeralSyncResponse/no ephemeral info"
            goto L_0x1084
        L_0x1097:
            long r4 = r11.ephemeralSettingTimestamp
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x109e
            r8 = 1
        L_0x109e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "EphemeralSettingMessageUtils/incomingEphemeralSyncResponse/newer EST "
            r4.append(r2)
            r4.append(r8)
            java.lang.String r2 = r4.toString()
            goto L_0x1084
        L_0x10b0:
            boolean r2 = r0 instanceof X.AnonymousClass2bM
            if (r2 == 0) goto L_0x10c5
            X.1YE r4 = r1.A07
            X.1C7 r3 = r4.A04
            r2 = 36
            X.1j7 r1 = new X.1j7
            r1.<init>(r4, r0, r2)
            r0 = 52
            r3.A01(r1, r0)
            return
        L_0x10c5:
            boolean r2 = r0 instanceof X.C180848mW
            r9 = 0
            if (r2 == 0) goto L_0x13ab
            X.8mW r0 = (X.C180848mW) r0
            java.lang.String r5 = r0.A03
            java.lang.String r6 = r0.A01
            java.lang.String r15 = r0.A02
            long r7 = r0.A00
            r55 = r7
            if (r5 == 0) goto L_0x1106
            if (r6 == 0) goto L_0x1106
            X.1ST r4 = r1.A08
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            r54 = r0
            X.0yC r8 = r4.A0A
            X.0yV r7 = X.C21000yV.A01
            r0 = 1539(0x603, float:2.157E-42)
            boolean r0 = X.C20800yB.A01(r7, r8, r0)
            if (r0 == 0) goto L_0x10fe
            boolean r0 = X.AnonymousClass143.A0G(r54)
            if (r0 == 0) goto L_0x1109
            r2 = 7881(0x1ec9, float:1.1044E-41)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r8, r2)
            if (r0 != 0) goto L_0x1109
        L_0x10fe:
            X.1DL r1 = r1.A09
            java.lang.String r0 = "medianotify"
            r1.A0E(r3, r0, r9)
            return
        L_0x1106:
            java.lang.String r0 = "DecryptMessageHandler/handleMediaNotifyMessage wrong data in medianotify message"
            goto L_0x1125
        L_0x1109:
            boolean r0 = X.C25161Ff.A00(r5)
            if (r0 != 0) goto L_0x1129
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "ExpressPathUtils/getMmsTypeFromExpressPathUrl Receive non express path url in media notify message. url = "
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x1123:
            java.lang.String r0 = "mediadownloadmanager/queueexpresspathdownload invalid expressPathUrl stop"
        L_0x1125:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x10fe
        L_0x1129:
            java.lang.String r0 = "/document/"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x113f
            X.1Gl r0 = X.C25471Gl.A0A
        L_0x1133:
            X.1Ff r10 = r4.A0G
            r2 = 0
            boolean r10 = r10.A02(r0, r2)
            if (r10 == 0) goto L_0x1176
            java.lang.String r0 = "mediadownloadmanager/queueexpresspathdownload force_ip is set"
            goto L_0x1125
        L_0x113f:
            java.lang.String r0 = "/image/"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x114a
            X.1Gl r0 = X.C25471Gl.A0D
            goto L_0x1133
        L_0x114a:
            java.lang.String r0 = "/video/"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x1155
            X.1Gl r0 = X.C25471Gl.A0i
            goto L_0x1133
        L_0x1155:
            java.lang.String r0 = "/audio/"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x1160
            X.1Gl r0 = X.C25471Gl.A05
            goto L_0x1133
        L_0x1160:
            java.lang.String r0 = "/gif/"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x116b
            X.1Gl r0 = X.C25471Gl.A04
            goto L_0x1133
        L_0x116b:
            java.lang.String r0 = "/sticker/"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x1123
            X.1Gl r0 = X.C25471Gl.A0d
            goto L_0x1133
        L_0x1176:
            X.1GO r10 = r4.A0D
            r35 = 1
            r18 = 0
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r16 = r10
            r17 = r0
            r19 = r55
            boolean r10 = r16.A02(r17, r18, r19, r21, r22, r23, r24, r25)
            if (r10 != 0) goto L_0x11d2
            java.lang.String r5 = "mediadownloadmanager/queueexpresspathdownload auto download not enabled, ignore ep download  "
            com.whatsapp.util.Log.i((java.lang.String) r5)
            X.1DT r7 = r4.A06
            r4 = 24
        L_0x119b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            X.58z r5 = new X.58z
            r5.<init>()
            r4 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.A0F = r4
            r5.A0I = r6
            int r0 = r0.A00
            int r0 = X.AnonymousClass6UH.A01(r0, r2, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0J = r0
            X.C18740tg.A06(r4)
            X.C18740tg.A06(r6)
            X.0yW r4 = r7.A0E
            r2 = 2810(0xafa, float:3.938E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r8, r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x1261
            r4.Bly(r5)
            goto L_0x10fe
        L_0x11d2:
            X.1BS r14 = r4.A0L
            java.lang.Object r13 = r14.A0I
            monitor-enter(r13)
            android.net.Uri r10 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x13a8 }
            java.lang.String r12 = r10.getHost()     // Catch:{ all -> 0x13a8 }
            X.5yq r10 = r14.A00     // Catch:{ all -> 0x13a8 }
            if (r10 != 0) goto L_0x11f0
            X.0yC r11 = r14.A08     // Catch:{ all -> 0x13a8 }
            r10 = 7246(0x1c4e, float:1.0154E-41)
            boolean r7 = X.C20800yB.A01(r7, r11, r10)     // Catch:{ all -> 0x13a8 }
            if (r7 == 0) goto L_0x11f0
            r14.A0D()     // Catch:{ all -> 0x13a8 }
        L_0x11f0:
            X.5yq r10 = r14.A00     // Catch:{ all -> 0x13a8 }
            r7 = 1
            if (r10 == 0) goto L_0x123f
            if (r12 == 0) goto L_0x123f
            java.util.List r7 = r10.A0A     // Catch:{ all -> 0x13a8 }
            java.util.Iterator r14 = r7.iterator()     // Catch:{ all -> 0x13a8 }
        L_0x11fd:
            boolean r7 = r14.hasNext()     // Catch:{ all -> 0x13a8 }
            if (r7 == 0) goto L_0x125a
            java.lang.Object r10 = r14.next()     // Catch:{ all -> 0x13a8 }
            X.65F r10 = (X.AnonymousClass65F) r10     // Catch:{ all -> 0x13a8 }
            java.lang.String r11 = r10.A04     // Catch:{ all -> 0x13a8 }
            boolean r7 = r12.equals(r11)     // Catch:{ all -> 0x13a8 }
            if (r7 != 0) goto L_0x123d
            java.lang.String r10 = r10.A00     // Catch:{ all -> 0x13a8 }
            boolean r7 = r12.equals(r10)     // Catch:{ all -> 0x13a8 }
            if (r7 != 0) goto L_0x123d
            if (r11 == 0) goto L_0x122b
            java.lang.String r7 = "^media-([a-zA-Z]{3})([0-9]*-[0-9]*)\\.cdn.whatsapp.net$"
            boolean r7 = r11.matches(r7)     // Catch:{ all -> 0x13a8 }
            if (r7 == 0) goto L_0x122b
            r7 = 9
            boolean r7 = r12.regionMatches(r2, r11, r2, r7)     // Catch:{ all -> 0x13a8 }
            if (r7 != 0) goto L_0x123d
        L_0x122b:
            if (r10 == 0) goto L_0x11fd
            java.lang.String r7 = "^media-([a-zA-Z]{3})([0-9]*-[0-9]*)\\.cdn.whatsapp.net$"
            boolean r7 = r10.matches(r7)     // Catch:{ all -> 0x13a8 }
            if (r7 == 0) goto L_0x11fd
            r7 = 9
            boolean r7 = r12.regionMatches(r2, r10, r2, r7)     // Catch:{ all -> 0x13a8 }
            if (r7 == 0) goto L_0x11fd
        L_0x123d:
            monitor-exit(r13)     // Catch:{ all -> 0x13a8 }
            goto L_0x1268
        L_0x123f:
            X.0wN r12 = r14.A05     // Catch:{ all -> 0x13a8 }
            java.lang.String r11 = "RoutingResponse"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a8 }
            r6.<init>()     // Catch:{ all -> 0x13a8 }
            java.lang.String r5 = "null routing or host:"
            r6.append(r5)     // Catch:{ all -> 0x13a8 }
            if (r10 == 0) goto L_0x1250
            r7 = 0
        L_0x1250:
            r6.append(r7)     // Catch:{ all -> 0x13a8 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x13a8 }
            r12.A0E(r11, r5, r2)     // Catch:{ all -> 0x13a8 }
        L_0x125a:
            monitor-exit(r13)     // Catch:{ all -> 0x13a8 }
            X.1DT r7 = r4.A06
            r4 = 23
            goto L_0x119b
        L_0x1261:
            X.0u5 r0 = X.C25161Ff.A05
            r4.Blx(r5, r0)
            goto L_0x10fe
        L_0x1268:
            java.util.HashMap r7 = r4.A0Q
            monitor-enter(r7)
            if (r15 == 0) goto L_0x128e
            boolean r2 = r7.containsKey(r15)     // Catch:{ all -> 0x13a5 }
            if (r2 == 0) goto L_0x128e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a5 }
            r2.<init>()     // Catch:{ all -> 0x13a5 }
            java.lang.String r0 = "MediaDownloadManager/isExpressPathDownloadDuplicated Existing regular download job "
            r2.append(r0)     // Catch:{ all -> 0x13a5 }
            java.lang.Object r0 = r7.get(r15)     // Catch:{ all -> 0x13a5 }
            r2.append(r0)     // Catch:{ all -> 0x13a5 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x13a5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x13a5 }
            monitor-exit(r7)     // Catch:{ all -> 0x13a5 }
            goto L_0x10fe
        L_0x128e:
            monitor-exit(r7)     // Catch:{ all -> 0x13a5 }
            java.util.HashMap r2 = r4.A0R
            monitor-enter(r2)
            boolean r7 = r2.containsKey(r6)     // Catch:{ all -> 0x13a2 }
            if (r7 == 0) goto L_0x12b3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x13a2 }
            r4.<init>()     // Catch:{ all -> 0x13a2 }
            java.lang.String r0 = "MediaDownloadManager/isExpressPathDownloadDuplicated Existing express path download job "
            r4.append(r0)     // Catch:{ all -> 0x13a2 }
            java.lang.Object r0 = r2.get(r6)     // Catch:{ all -> 0x13a2 }
            r4.append(r0)     // Catch:{ all -> 0x13a2 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x13a2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x13a2 }
            monitor-exit(r2)     // Catch:{ all -> 0x13a2 }
            goto L_0x10fe
        L_0x12b3:
            monitor-exit(r2)     // Catch:{ all -> 0x13a2 }
            X.0y0 r8 = r4.A03
            java.lang.String r25 = "application/octet-stream"
            X.1Gl r7 = X.C25471Gl.A0A
            r34 = 8
            if (r0 == r7) goto L_0x12c4
            X.1Gl r7 = X.C25471Gl.A0i
            if (r0 != r7) goto L_0x1337
            r34 = 3
        L_0x12c4:
            r13 = 0
            r7 = r8
            r8 = r0
            r10 = r6
            r11 = r15
            r12 = r5
            java.io.File r19 = r7.A0K(r8, r9, r10, r11, r12, r13)
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r23 = r7.toString()
            r39 = 0
            r33 = 2
            r36 = 3
            X.68C r12 = new X.68C
            r16 = r9
            r17 = r9
            r18 = r9
            r22 = r9
            r26 = r9
            r27 = r9
            r28 = r9
            r29 = r9
            r30 = r9
            r31 = 0
            r32 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r13 = r9
            r20 = r5
            r21 = r15
            r24 = r6
            r37 = r55
            r14 = r9
            r15 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            X.1TO r10 = r4.A02
            android.os.ConditionVariable r11 = r4.A01
            int r14 = X.C203229nZ.A00(r54)
            r15 = -1
            r13 = 1
            r17 = 1
            X.4xN r7 = r10.A00(r11, r12, r13, r14, r15, r17)
            X.6vd r0 = new X.6vd
            r0.<init>(r7, r4, r6)
            r7.B0M(r0)
            monitor-enter(r2)
            goto L_0x1355
        L_0x1337:
            X.1Gl r7 = X.C25471Gl.A0D
            if (r0 != r7) goto L_0x133e
            r34 = 2
            goto L_0x12c4
        L_0x133e:
            X.1Gl r7 = X.C25471Gl.A05
            if (r0 != r7) goto L_0x1345
            r34 = 4
            goto L_0x12c4
        L_0x1345:
            X.1Gl r7 = X.C25471Gl.A04
            if (r0 != r7) goto L_0x134d
            r34 = 11
            goto L_0x12c4
        L_0x134d:
            X.1Gl r7 = X.C25471Gl.A0d
            if (r0 != r7) goto L_0x12c4
            r34 = 16
            goto L_0x12c4
        L_0x1355:
            boolean r0 = r2.containsKey(r6)     // Catch:{ all -> 0x139f }
            if (r0 != 0) goto L_0x1382
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x139f }
            r5.<init>()     // Catch:{ all -> 0x139f }
            java.lang.String r0 = "mediadownloadmanager/queueexpresspathdownload enqueue media job: "
            r5.append(r0)     // Catch:{ all -> 0x139f }
            r5.append(r7)     // Catch:{ all -> 0x139f }
            java.lang.String r0 = " enc hash: "
            r5.append(r0)     // Catch:{ all -> 0x139f }
            r5.append(r6)     // Catch:{ all -> 0x139f }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x139f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x139f }
            r2.put(r6, r7)     // Catch:{ all -> 0x139f }
            X.0wU r0 = r4.A0O     // Catch:{ all -> 0x139f }
            r0.Boy(r7)     // Catch:{ all -> 0x139f }
        L_0x137f:
            monitor-exit(r2)     // Catch:{ all -> 0x139f }
            goto L_0x10fe
        L_0x1382:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x139f }
            r4.<init>()     // Catch:{ all -> 0x139f }
            java.lang.String r0 = "mediadownloadmanager/queueexpresspathdownload media job: "
            r4.append(r0)     // Catch:{ all -> 0x139f }
            r4.append(r7)     // Catch:{ all -> 0x139f }
            java.lang.String r0 = " already exists enc hash: "
            r4.append(r0)     // Catch:{ all -> 0x139f }
            r4.append(r6)     // Catch:{ all -> 0x139f }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x139f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x139f }
            goto L_0x137f
        L_0x139f:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x139f }
            throw r1
        L_0x13a2:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x13a2 }
            throw r1
        L_0x13a5:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x13a5 }
            throw r1
        L_0x13a8:
            r1 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x13a8 }
            throw r1
        L_0x13ab:
            r2 = 131072(0x20000, float:1.83671E-40)
            boolean r2 = r0.A1T(r2)
            if (r2 == 0) goto L_0x13b9
            X.1Xd r1 = r1.A04
            r1.A03(r0)
            return
        L_0x13b9:
            com.whatsapp.jid.UserJid r2 = r0.A0L()
            boolean r2 = X.C197029b1.A00(r2)
            if (r2 == 0) goto L_0x1404
            X.1A1 r2 = r1.A0D
            X.3Qa r4 = r0.A1J
            X.3T1 r2 = r2.A03(r4)
            if (r2 != 0) goto L_0x13ef
            X.1Jf r2 = r1.A0A
            X.3T1 r2 = r2.A00(r4)
            if (r2 != 0) goto L_0x13ef
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "DecryptMessageHandler/handleBotResponseFirstMessage/storing first msg: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0xM r1 = r1.A01
            r1.A0P(r0)
            return
        L_0x13ef:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "DecryptMessageHandler/handleBotResponseFirstMessage/first msg already stored: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x1404:
            X.1Yl r8 = r1.A00
            X.3Kx r4 = r0.A0P()
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r2 = r0.A1T(r2)
            if (r2 == 0) goto L_0x1431
            if (r4 == 0) goto L_0x1431
            java.lang.Long r2 = r4.A04()
            if (r2 == 0) goto L_0x1424
            long r6 = r2.longValue()
            r4 = 0
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x1431
        L_0x1424:
            X.8SX r2 = r3.A0L
            if (r2 == 0) goto L_0x142c
            byte[] r9 = r2.A0o()
        L_0x142c:
            r8.BJX(r0, r9)
            goto L_0x14e0
        L_0x1431:
            X.3JM r2 = r0.A0a()
            if (r2 == 0) goto L_0x14fc
            X.3JM r2 = r0.A0a()
            X.2ow r4 = r2.A01
            X.2ow r2 = X.C52132ow.A02
            if (r4 != r2) goto L_0x14fc
            X.3JM r6 = r0.A0a()
            X.9Vv r2 = r6.A02
            r16 = 0
            if (r2 != 0) goto L_0x148c
            r7 = r9
        L_0x144c:
            X.1Fs r6 = r1.A0C
            X.3JM r4 = r0.A0a()
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            boolean r2 = r0.A1T(r2)
            if (r2 == 0) goto L_0x14e6
            if (r4 == 0) goto L_0x14e6
            long r4 = r4.A00
            r10 = 0
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x14e6
            X.8SX r2 = r3.A0L
            if (r2 == 0) goto L_0x146c
            byte[] r16 = r2.A0o()
        L_0x146c:
            X.3JM r3 = r0.A0a()
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            boolean r2 = r0.A1T(r2)
            r4 = 1
            if (r2 == 0) goto L_0x1487
            if (r3 == 0) goto L_0x1487
            X.9Vv r2 = r3.A02
            if (r2 != 0) goto L_0x14ae
            X.0wN r3 = r6.A00
            java.lang.String r2 = "MessageParentAssociationManager/handleOrphanMessageWithParentAssociation/parent association info's parent key is null"
        L_0x1483:
            r3.A0E(r2, r9, r4)
            goto L_0x14e0
        L_0x1487:
            X.0wN r3 = r6.A00
            java.lang.String r2 = "MessageParentAssociationManager/handleOrphanMessageWithParentAssociation/parent association info is null"
            goto L_0x1483
        L_0x148c:
            X.1A1 r4 = r1.A0D
            X.3Qa r2 = r2.A01
            X.3T1 r7 = r4.A03(r2)
            if (r7 == 0) goto L_0x144c
            X.3Qa r4 = r7.A1J
            com.whatsapp.jid.UserJid r2 = r7.A0L()
            X.9Vv r8 = new X.9Vv
            r8.<init>(r2, r4)
            long r4 = r7.A1N
            X.2ow r6 = r6.A01
            X.3JM r2 = new X.3JM
            r2.<init>(r6, r8, r4)
            r0.A14(r2)
            goto L_0x144c
        L_0x14ae:
            X.3Qa r13 = r0.A1J
            X.AnonymousClass00C.A07(r13)
            X.11F r11 = r0.A0J()
            X.3Qa r7 = r2.A01
            X.11F r12 = r2.A00
            long r2 = r0.A0I
            r5 = 4
            X.9XS r10 = new X.9XS
            r17 = r9
            r18 = 4
            r19 = 1
            r20 = r2
            r14 = r7
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.1Ft r2 = r6.A01
            int r2 = r2.A01(r10)
            if (r2 == r5) goto L_0x14e0
            X.0wN r3 = r6.A00
            java.lang.String r2 = "MessageParentAssociationManager/handleOrphanMessageWithParentAssociation/Failed to store orphan message"
            r3.A0E(r2, r9, r4)
            goto L_0x14e0
        L_0x14dd:
            r3.close()
        L_0x14e0:
            X.1DL r1 = r1.A09
            r1.A08(r0)
            return
        L_0x14e6:
            X.0xM r2 = r1.A01
            r2.A0P(r0)
            if (r7 == 0) goto L_0x1523
            r1 = 256(0x100, float:3.59E-43)
            boolean r0 = r7.A1R(r1)
            if (r0 != 0) goto L_0x1523
            r7.A0h(r1)
            r2.A0k(r7)
            return
        L_0x14fc:
            X.0xM r3 = r1.A01
            r3.A0P(r0)
            X.3Kx r2 = r0.A0P()
            if (r2 == 0) goto L_0x1523
            boolean r0 = r2 instanceof X.AnonymousClass2bB
            if (r0 == 0) goto L_0x1523
            X.9Vv r0 = r2.A01()
            if (r0 == 0) goto L_0x1523
            X.1A1 r1 = r1.A0D
            X.3Qa r0 = r0.A01
            X.3T1 r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x1523
            r0 = 16
            r1.A0h(r0)
            r3.A0k(r1)
        L_0x1523:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30571aQ.A00(X.1aQ, X.3T1, X.AHp):void");
    }
}
