package X;

/* renamed from: X.6yW  reason: invalid class name and case insensitive filesystem */
public abstract class C148226yW implements AnonymousClass7hQ {
    public final C24451Cm A00;
    public final C19770wU A01;

    public static Long A00() {
        return 4L;
    }

    public static void A01(AnonymousClass19A r7, C236119d r8, C203399nx r9, String str) {
        r7.A0E(r8, r9, str, 255, 32000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011f, code lost:
        if (r7 != null) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0121, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0122, code lost:
        X.C18740tg.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0125, code lost:
        if (r6 == null) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0127, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0128, code lost:
        X.C18740tg.A0C(r1);
        r5 = r15.A0A;
        r4 = r5.A00;
        r3 = r4.A09();
        r0 = X.C107565Pl.A00;
        r2 = new X.C107565Pl(new X.C35891jQ(A00(), 11), r3, r7);
        X.C36321k7.A1Q("encb/EncryptedBackupProtocolHelper/sendBeginLoginIq id=", r3, X.AnonymousClass000.A0u());
        A01(r4, new X.C165347tH(r15, r5, r2, r6, 1), r2.A00, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0160, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0193, code lost:
        if (r10 == null) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0195, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0196, code lost:
        X.C18740tg.A0C(r1);
        r3 = r15.A0A;
        r2 = r3.A00;
        r9 = r2.A09();
        r6 = new X.C35911jS(new X.C35891jQ(A00(), 14), (X.C107455Pa) null, r9, r10, 22);
        X.C36321k7.A1Q("encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess id=", r9, X.AnonymousClass000.A0u());
        r4 = r6.A00;
        r1 = new X.C165337tG(r15, r3, r6, 9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r20 = this;
            r15 = r20
            boolean r0 = r15 instanceof X.C101524xq
            if (r0 == 0) goto L_0x003b
            X.4xq r15 = (X.C101524xq) r15
            X.1Cl r7 = r15.A01
            r0 = 1
            X.19A r6 = r7.A00
            java.lang.String r5 = r6.A09()
            java.lang.Long r4 = X.C36441kJ.A0y(r0)
            java.lang.Long r2 = A00()
            r1 = 18
            X.1jQ r0 = new X.1jQ
            r0.<init>((java.lang.Long) r2, (int) r1)
            X.1jS r3 = new X.1jS
            r3.<init>((X.C35891jQ) r0, (java.lang.Long) r4, (java.lang.String) r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendUpdateMigrationIq id="
            X.C36321k7.A1Q(r0, r5, r1)
            X.9nx r2 = r3.A00
            r1 = 11
            X.7tG r0 = new X.7tG
            r0.<init>(r15, r7, r3, r1)
            A01(r6, r0, r2, r5)
            return
        L_0x003b:
            boolean r0 = r15 instanceof X.C101514xp
            if (r0 == 0) goto L_0x0100
            X.4xp r15 = (X.C101514xp) r15
            java.lang.Object r3 = r15.A0B
            monitor-enter(r3)
            int r2 = r15.A00     // Catch:{ all -> 0x00fd }
            monitor-exit(r3)     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x0085
            r1 = 0
            r0 = 1
            if (r2 == r0) goto L_0x00b4
            byte[] r9 = r15.A04
            if (r9 == 0) goto L_0x0052
            r1 = 1
        L_0x0052:
            X.C18740tg.A0C(r1)
            X.1Cl r3 = r15.A0A
            X.19A r2 = r3.A00
            java.lang.String r8 = r2.A09()
            java.lang.Long r1 = A00()
            r0 = 15
            X.1jQ r6 = new X.1jQ
            r6.<init>((java.lang.Long) r1, (int) r0)
            r7 = 0
            r10 = 23
            X.1jS r5 = new X.1jS
            r5.<init>((X.C35891jQ) r6, (X.C107465Pb) r7, (java.lang.String) r8, (byte[]) r9, (int) r10)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendFinishRegIq id="
            X.C36321k7.A1Q(r0, r8, r1)
            X.9nx r4 = r5.A00
            r0 = 7
            X.7tG r1 = new X.7tG
            r1.<init>(r15, r3, r5, r0)
        L_0x0081:
            A01(r2, r1, r4, r8)
            return
        L_0x0085:
            X.1Cl r3 = r15.A0A
            X.19A r2 = r3.A00
            java.lang.String r8 = r2.A09()
            java.lang.Long r1 = A00()
            r0 = 17
            X.1jQ r10 = new X.1jQ
            r10.<init>((java.lang.Long) r1, (int) r0)
            r11 = 0
            r14 = 25
            X.1jS r9 = new X.1jS
            r12 = r11
            r13 = r8
            r9.<init>((X.C35891jQ) r10, (X.C107485Pd) r11, (java.lang.Long) r12, (java.lang.String) r13, (int) r14)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendInitRegIq id="
            X.C36321k7.A1Q(r0, r8, r1)
            X.9nx r4 = r9.A00
            r0 = 6
            X.7tG r1 = new X.7tG
            r1.<init>(r15, r3, r9, r0)
            goto L_0x0081
        L_0x00b4:
            monitor-enter(r3)
            byte[] r7 = r15.A06     // Catch:{ all -> 0x00fa }
            byte[] r6 = r15.A03     // Catch:{ all -> 0x00fa }
            monitor-exit(r3)     // Catch:{ all -> 0x00fa }
            if (r7 != 0) goto L_0x00bd
            r0 = 0
        L_0x00bd:
            X.C18740tg.A0C(r0)
            if (r6 == 0) goto L_0x00c3
            r1 = 1
        L_0x00c3:
            X.C18740tg.A0C(r1)
            X.1Cl r5 = r15.A0A
            X.19A r4 = r5.A00
            java.lang.String r3 = r4.A09()
            java.lang.Long r2 = A00()
            r1 = 12
            X.1jQ r0 = new X.1jQ
            r0.<init>((java.lang.Long) r2, (int) r1)
            X.1jS r2 = new X.1jS
            r2.<init>((X.C35891jQ) r0, (java.lang.String) r3, (byte[]) r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendBeginRegIq id="
            X.C36321k7.A1Q(r0, r3, r1)
            X.9nx r0 = r2.A00
            X.6xi r14 = new X.6xi
            r19 = r6
            r16 = r5
            r17 = r2
            r18 = r7
            r14.<init>(r15, r16, r17, r18, r19)
            A01(r4, r14, r0, r3)
            return
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00fa }
            throw r0
        L_0x00fd:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00fd }
            throw r0
        L_0x0100:
            boolean r0 = r15 instanceof X.C101504xo
            if (r0 == 0) goto L_0x01cd
            X.4xo r15 = (X.C101504xo) r15
            java.lang.Object r3 = r15.A0B
            monitor-enter(r3)
            int r2 = r15.A00     // Catch:{ all -> 0x01ca }
            monitor-exit(r3)     // Catch:{ all -> 0x01ca }
            if (r2 == 0) goto L_0x0164
            r1 = 0
            r0 = 1
            monitor-enter(r3)
            if (r2 == r0) goto L_0x011a
            byte[] r10 = r15.A07     // Catch:{ all -> 0x0117 }
            monitor-exit(r3)     // Catch:{ all -> 0x0117 }
            goto L_0x0193
        L_0x0117:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0117 }
            throw r0
        L_0x011a:
            byte[] r7 = r15.A06     // Catch:{ all -> 0x0161 }
            byte[] r6 = r15.A05     // Catch:{ all -> 0x0161 }
            monitor-exit(r3)     // Catch:{ all -> 0x0161 }
            if (r7 != 0) goto L_0x0122
            r0 = 0
        L_0x0122:
            X.C18740tg.A0C(r0)
            if (r6 == 0) goto L_0x0128
            r1 = 1
        L_0x0128:
            X.C18740tg.A0C(r1)
            X.1Cl r5 = r15.A0A
            X.19A r4 = r5.A00
            java.lang.String r3 = r4.A09()
            java.util.ArrayList r0 = X.C107565Pl.A00
            java.lang.Long r2 = A00()
            r1 = 11
            X.1jQ r0 = new X.1jQ
            r0.<init>((java.lang.Long) r2, (int) r1)
            X.5Pl r2 = new X.5Pl
            r2.<init>(r0, r3, r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendBeginLoginIq id="
            X.C36321k7.A1Q(r0, r3, r1)
            X.9nx r0 = r2.A00
            r19 = 1
            X.7tH r14 = new X.7tH
            r16 = r5
            r17 = r2
            r18 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            A01(r4, r14, r0, r3)
            return
        L_0x0161:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0161 }
            throw r0
        L_0x0164:
            X.1Cl r3 = r15.A0A
            X.19A r2 = r3.A00
            java.lang.String r9 = r2.A09()
            java.lang.Long r1 = A00()
            r0 = 16
            X.1jQ r6 = new X.1jQ
            r6.<init>((java.lang.Long) r1, (int) r0)
            r7 = 0
            r10 = 24
            X.1jS r5 = new X.1jS
            r8 = r7
            r5.<init>((X.C35891jQ) r6, (X.C107475Pc) r7, (java.lang.Long) r8, (java.lang.String) r9, (int) r10)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendInitLoginIq id="
            X.C36321k7.A1Q(r0, r9, r1)
            X.9nx r4 = r5.A00
            r0 = 8
            X.7tG r1 = new X.7tG
            r1.<init>(r15, r3, r5, r0)
            goto L_0x01c6
        L_0x0193:
            if (r10 == 0) goto L_0x0196
            r1 = 1
        L_0x0196:
            X.C18740tg.A0C(r1)
            X.1Cl r3 = r15.A0A
            X.19A r2 = r3.A00
            java.lang.String r9 = r2.A09()
            java.lang.Long r1 = A00()
            r0 = 14
            X.1jQ r7 = new X.1jQ
            r7.<init>((java.lang.Long) r1, (int) r0)
            r8 = 0
            r11 = 22
            X.1jS r6 = new X.1jS
            r6.<init>((X.C35891jQ) r7, (X.C107455Pa) r8, (java.lang.String) r9, (byte[]) r10, (int) r11)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess id="
            X.C36321k7.A1Q(r0, r9, r1)
            X.9nx r4 = r6.A00
            r0 = 9
            X.7tG r1 = new X.7tG
            r1.<init>(r15, r3, r6, r0)
        L_0x01c6:
            A01(r2, r1, r4, r9)
            return
        L_0x01ca:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01ca }
            throw r0
        L_0x01cd:
            X.4xn r15 = (X.C101494xn) r15
            X.1Cl r6 = r15.A01
            X.19A r5 = r6.A00
            java.lang.String r4 = r5.A09()
            java.lang.Long r2 = A00()
            r1 = 13
            X.1jQ r0 = new X.1jQ
            r0.<init>((java.lang.Long) r2, (int) r1)
            X.1jS r3 = new X.1jS
            r3.<init>((X.C35891jQ) r0, (java.lang.String) r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendDeleteAccountIq id="
            X.C36321k7.A1Q(r0, r4, r1)
            X.9nx r2 = r3.A00
            r1 = 10
            X.7tG r0 = new X.7tG
            r0.<init>(r15, r6, r3, r1)
            A01(r5, r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148226yW.A02():void");
    }

    public void BWq(String str, int i, int i2) {
        AnonymousClass7hQ r2;
        C19770wU r4;
        long longValue;
        C1497072l r1;
        String str2;
        if (this instanceof C101494xn) {
            C101494xn r5 = (C101494xn) this;
            Long A002 = r5.A00.A00();
            if ((i == 500 || i == 3) && A002 != null) {
                r4 = r5.A01;
                longValue = A002.longValue();
                r1 = new C1497072l(r5, 1);
                str2 = "DeleteAccountHandler/onError";
            } else {
                r5.A00.BWq(str, i, i2);
                return;
            }
        } else {
            Long A003 = this.A00.A00();
            if ((i == 500 || i == 3) && A003 != null) {
                r4 = this.A01;
                longValue = A003.longValue();
                r1 = new C1497072l(this, 2);
                str2 = "HsmCommandHandler/onError";
            } else {
                if (this instanceof C101524xq) {
                    r2 = ((C101524xq) this).A00;
                } else if (this instanceof C101514xp) {
                    C101514xp r3 = (C101514xp) this;
                    synchronized (r3.A0B) {
                        r2 = r3.A02;
                        if (r2 == null) {
                            r2 = new C164597s4(r3, 1);
                            r3.A02 = r2;
                        }
                    }
                } else if (this instanceof C101504xo) {
                    C101504xo r32 = (C101504xo) this;
                    synchronized (r32.A0B) {
                        AnonymousClass7hQ r22 = r32.A04;
                        if (r22 == null) {
                            r22 = new C164597s4(r32, 0);
                            r32.A04 = r22;
                        }
                    }
                } else {
                    r2 = ((C101494xn) this).A00;
                }
                r2.BWq(str, i, i2);
                return;
            }
        }
        r4.BpM(r1, str2, longValue);
    }

    public C148226yW(C24451Cm r1, C19770wU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
