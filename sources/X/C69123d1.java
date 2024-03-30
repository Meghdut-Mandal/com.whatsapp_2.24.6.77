package X;

/* renamed from: X.3d1  reason: invalid class name and case insensitive filesystem */
public final class C69123d1 implements C19710wO, C30631aW {
    public final C234318l A00;
    public final C233618e A01;
    public final C233218a A02;
    public final AnonymousClass12P A03;
    public final C231817m A04;
    public final AnonymousClass18M A05;
    public final C231617k A06;
    public final AnonymousClass199 A07;

    public String BIB() {
        return "CleanAllLIDDevicesAndIdentityKeysToRecoverFromS344119Cron";
    }

    public /* synthetic */ void BRL() {
    }

    public /* synthetic */ void BV2() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0109, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0128, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        X.C05600Qi.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x012d, code lost:
        X.C05600Qi.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0130, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0133, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0137, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r12 = this;
            java.lang.String r2 = "CleanAllLIDDevicesAndIdentityKeysToRecoverFromS344119Cron/alreadyCleanedUpV4"
            monitor-enter(r2)
            X.199 r7 = r12.A07     // Catch:{ all -> 0x013a }
            java.lang.String r1 = r7.A07(r2)     // Catch:{ all -> 0x013a }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x013a }
            if (r0 != 0) goto L_0x0015
            boolean r0 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ all -> 0x013a }
            if (r0 != 0) goto L_0x0138
        L_0x0015:
            java.lang.String r0 = "CleanAllLIDDevicesAndIdentityKeysToRecoverFromS344119Cron/cleanUp/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x013a }
            X.12P r0 = r12.A03     // Catch:{ all -> 0x013a }
            X.1M0 r3 = r0.A05()     // Catch:{ all -> 0x013a }
            X.71s r5 = r3.B1k()     // Catch:{ all -> 0x0131 }
            X.17k r6 = r12.A06     // Catch:{ all -> 0x0126 }
            X.12P r0 = r6.A02     // Catch:{ all -> 0x0126 }
            X.1M0 r8 = r0.A05()     // Catch:{ all -> 0x0126 }
            X.71s r9 = r8.B1k()     // Catch:{ all -> 0x011c }
            X.14e r4 = r8.A02     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = "DELETE from user_device WHERE _id in (SELECT user_device._id from user_device LEFT JOIN jid ON jid._id = user_device.device_jid_row_id WHERE jid.type = 19) "
            java.lang.String r0 = "CLEAR_ALL_LID_DEVICES_TO_RECOVER_FROM_S344119_USER_DEVICE_TABLE"
            r4.A0D(r1, r0)     // Catch:{ all -> 0x0112 }
            r9.A00()     // Catch:{ all -> 0x0112 }
            X.17l r4 = r6.A04     // Catch:{ all -> 0x0112 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x0112 }
            r1 = 43
            X.1j6 r0 = new X.1j6     // Catch:{ all -> 0x0112 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0112 }
            r8.B5o(r0)     // Catch:{ all -> 0x0112 }
            r9.close()     // Catch:{ all -> 0x011c }
            r8.close()     // Catch:{ all -> 0x0126 }
            X.17m r6 = r12.A04     // Catch:{ all -> 0x0126 }
            X.12P r0 = r6.A01     // Catch:{ all -> 0x0126 }
            X.1M0 r8 = r0.A05()     // Catch:{ all -> 0x0126 }
            X.71s r9 = r8.B1k()     // Catch:{ all -> 0x011c }
            X.14e r4 = r8.A02     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = "DELETE from user_device_info WHERE user_jid_row_id in (SELECT user_device_info.user_jid_row_id from user_device_info LEFT JOIN jid ON jid._id = user_device_info.user_jid_row_id WHERE jid.type = 18) "
            java.lang.String r0 = "CLEAR_ALL_LID_DEVICES_INFO_TO_RECOVER_FROM_S344119_USER_DEVICE_INFO_TABLE"
            r4.A0D(r1, r0)     // Catch:{ all -> 0x0112 }
            r9.A00()     // Catch:{ all -> 0x0112 }
            java.util.Map r4 = r6.A03     // Catch:{ all -> 0x0112 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x0112 }
            r1 = 40
            X.1j6 r0 = new X.1j6     // Catch:{ all -> 0x0112 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0112 }
            r8.B5o(r0)     // Catch:{ all -> 0x0112 }
            r9.close()     // Catch:{ all -> 0x011c }
            r8.close()     // Catch:{ all -> 0x0126 }
            r5.A00()     // Catch:{ all -> 0x0126 }
            r5.close()     // Catch:{ all -> 0x0131 }
            r3.close()     // Catch:{ all -> 0x013a }
            X.18M r0 = r12.A05     // Catch:{ all -> 0x013a }
            X.1M0 r3 = r0.A04()     // Catch:{ all -> 0x013a }
            X.71s r6 = r3.B1k()     // Catch:{ all -> 0x0131 }
            X.18l r0 = r12.A00     // Catch:{ all -> 0x010e }
            X.18M r0 = r0.A04     // Catch:{ all -> 0x010e }
            X.1M0 r8 = r0.A04()     // Catch:{ all -> 0x010e }
            X.14e r5 = r8.A02     // Catch:{ all -> 0x0107 }
            java.lang.String r4 = "identities"
            java.lang.String r10 = "recipient_type = ? "
            java.lang.String r11 = "1"
            java.lang.String[] r1 = new java.lang.String[]{r11}     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = "SignalIdentityKeyStore/removeAllLidIdentitiesToRecoverFromS344119"
            int r0 = r5.A03(r4, r10, r0, r1)     // Catch:{ all -> 0x0107 }
            long r0 = (long) r0     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0107 }
            java.lang.String r9 = "axolotl deleted "
            r4.append(r9)     // Catch:{ all -> 0x0107 }
            r4.append(r0)     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = " identities for all LID devices"
            X.C36321k7.A1a(r4, r0)     // Catch:{ all -> 0x0107 }
            r8.close()     // Catch:{ all -> 0x010e }
            X.18e r0 = r12.A01     // Catch:{ all -> 0x010e }
            X.18M r0 = r0.A02     // Catch:{ all -> 0x010e }
            X.1M0 r8 = r0.A04()     // Catch:{ all -> 0x010e }
            X.14e r5 = r8.A02     // Catch:{ all -> 0x0107 }
            java.lang.String r4 = "sessions"
            java.lang.String[] r1 = new java.lang.String[]{r11}     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = "SignalSessionStore/removeAllLidSessionsToRecoverFromS344119"
            int r0 = r5.A03(r4, r10, r0, r1)     // Catch:{ all -> 0x0107 }
            long r4 = (long) r0     // Catch:{ all -> 0x0107 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r9)     // Catch:{ all -> 0x0107 }
            r1.append(r4)     // Catch:{ all -> 0x0107 }
            java.lang.String r0 = " sessions for all LID devices"
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x0107 }
            r8.close()     // Catch:{ all -> 0x010e }
            r1 = 26
            X.72o r0 = new X.72o     // Catch:{ all -> 0x010e }
            r0.<init>(r12, r1)     // Catch:{ all -> 0x010e }
            r3.B5o(r0)     // Catch:{ all -> 0x010e }
            r6.A00()     // Catch:{ all -> 0x010e }
            r6.close()     // Catch:{ all -> 0x0131 }
            r3.close()     // Catch:{ all -> 0x013a }
            java.lang.String r0 = "CleanAllLIDDevicesAndIdentityKeysToRecoverFromS344119Cron/cleanUp/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x013a }
            r0 = 1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x013a }
            X.AnonymousClass199.A04(r7, r2, r0)     // Catch:{ all -> 0x013a }
            goto L_0x0138
        L_0x0107:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ all -> 0x010e }
            throw r0     // Catch:{ all -> 0x010e }
        L_0x010e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0110 }
        L_0x0110:
            r1 = move-exception
            goto L_0x012d
        L_0x0112:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0117 }
            goto L_0x011b
        L_0x0117:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x011c }
        L_0x011b:
            throw r1     // Catch:{ all -> 0x011c }
        L_0x011c:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0121 }
            goto L_0x0125
        L_0x0121:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0126 }
        L_0x0125:
            throw r1     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r1 = move-exception
            X.C05600Qi.A00(r5, r0)     // Catch:{ all -> 0x0131 }
            goto L_0x0130
        L_0x012d:
            X.C05600Qi.A00(r6, r0)     // Catch:{ all -> 0x0131 }
        L_0x0130:
            throw r1     // Catch:{ all -> 0x0131 }
        L_0x0131:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x013a }
            throw r0     // Catch:{ all -> 0x013a }
        L_0x0138:
            monitor-exit(r2)
            return
        L_0x013a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69123d1.A00():void");
    }

    public C69123d1(C234318l r1, C233618e r2, C233218a r3, AnonymousClass12P r4, C231817m r5, AnonymousClass18M r6, C231617k r7, AnonymousClass199 r8) {
        C36321k7.A18(r7, r3, r8, r6);
        C36321k7.A13(r4, r5, r1);
        this.A06 = r7;
        this.A02 = r3;
        this.A07 = r8;
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
    }

    public void BRM() {
        A00();
    }

    public void BV3() {
        A00();
    }
}
