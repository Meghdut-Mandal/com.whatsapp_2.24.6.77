package X;

/* renamed from: X.6sj  reason: invalid class name and case insensitive filesystem */
public class C144736sj implements C30631aW {
    public final AnonymousClass189 A00;
    public final AnonymousClass187 A01;
    public final AnonymousClass18I A02;

    public void BV3() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a6, code lost:
        r4 = X.C90524aI.A07(r7.get(r5));
        X.C36321k7.A1V("axolotl found keys ready to be deleted, uploaded at or before: ", X.AnonymousClass000.A0u(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cd, code lost:
        if (r4 <= 0) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cf, code lost:
        r11 = r12.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r10 = r11.B1k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r9 = r12.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r3 = r9.A02;
        r1 = X.C36441kJ.A1R();
        r7 = java.lang.String.valueOf(r4);
        r1[0] = r7;
        r6 = r3.A03("prekeys", "sent_to_server = 1 AND upload_timestamp <= ?", "SignalPreKeyStore/deleteExpiredSentPreKeys", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r9.close();
        r5 = r12.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r4 = r5.A02;
        r1 = X.C36441kJ.A1R();
        r1[0] = r7;
        r2 = r4.A03("prekey_uploads", "upload_timestamp <= ?", "SignalPreKeyStore/deleteExpiredPreKeyUpload", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r5.close();
        r1 = X.AnonymousClass000.A0u();
        r1.append("axolotl deleted expired uploaded keys:");
        r1.append(r6);
        X.C36321k7.A1T(" timestamp rows:", r1, r2);
        r10.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0127, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012c, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0131, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0135, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0136, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0140, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0153, code lost:
        r0 = "axolotl deleteExpiredServerPreKeys, nothing expiring yet";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0174, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015a A[SYNTHETIC, Splitter:B:73:0x015a] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C144736sj r16) {
        /*
            r1 = r16
            X.18I r0 = r1.A02
            X.79X r16 = r0.A07()
            X.189 r1 = r1.A00     // Catch:{ all -> 0x0185 }
            r1.A0N()     // Catch:{ all -> 0x0185 }
            X.18I r0 = r1.A0K     // Catch:{ all -> 0x0185 }
            X.79X r15 = r0.A07()     // Catch:{ all -> 0x0185 }
            X.18u r0 = r1.A00     // Catch:{ all -> 0x0179 }
            X.18s r3 = r0.A02     // Catch:{ all -> 0x0179 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ all -> 0x0179 }
            X.0yf r1 = r3.A00     // Catch:{ all -> 0x0179 }
            X.0yh r0 = X.C21100yf.A1t     // Catch:{ all -> 0x0179 }
            int r0 = r1.A04(r0)     // Catch:{ all -> 0x0179 }
            long r0 = (long) r0     // Catch:{ all -> 0x0179 }
            long r13 = r2.toSeconds(r0)     // Catch:{ all -> 0x0179 }
            X.18o r2 = r3.A03     // Catch:{ all -> 0x0179 }
            X.0wo r8 = r2.A00     // Catch:{ all -> 0x0179 }
            long r0 = X.C36371kC.A09(r8)     // Catch:{ all -> 0x0179 }
            long r0 = r0 - r13
            X.18M r12 = r2.A01     // Catch:{ all -> 0x0179 }
            X.1M0 r4 = r12.A04()     // Catch:{ all -> 0x0179 }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x016f }
            java.lang.String r6 = "prekeys"
            java.lang.String r2 = "direct_distribution = 1 AND upload_timestamp < ?"
            java.lang.String[] r1 = X.C36341k9.A1b(r0)     // Catch:{ all -> 0x016f }
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredDirectDistributionPreKeys"
            int r2 = r3.A03(r6, r2, r0, r1)     // Catch:{ all -> 0x016f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x016f }
            java.lang.String r0 = "axolotl deleted expired direct distribution keys:"
            X.C36321k7.A1T(r0, r1, r2)     // Catch:{ all -> 0x016f }
            r4.close()     // Catch:{ all -> 0x0179 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0179 }
            X.1M0 r4 = r12.get()     // Catch:{ all -> 0x0179 }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x016f }
            java.lang.String r2 = "SELECT upload_timestamp FROM prekey_uploads ORDER BY _id DESC"
            r1 = 0
            java.lang.String r0 = "SignalPreKeyStore/getAllPreKeyUploads"
            android.database.Cursor r3 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x016f }
            java.lang.String r0 = "upload_timestamp"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0163 }
        L_0x006a:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x0078
            long r0 = r3.getLong(r2)     // Catch:{ all -> 0x0163 }
            X.C36391kE.A1W(r7, r0)     // Catch:{ all -> 0x0163 }
            goto L_0x006a
        L_0x0078:
            r3.close()     // Catch:{ all -> 0x016f }
            r4.close()     // Catch:{ all -> 0x0179 }
            int r1 = r7.size()     // Catch:{ all -> 0x0179 }
            r0 = 3
            if (r1 < r0) goto L_0x0145
            java.lang.String r0 = "axolotl found more than 2 upload generations"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0179 }
            r5 = 2
        L_0x008b:
            int r0 = r7.size()     // Catch:{ all -> 0x0179 }
            r9 = 0
            if (r5 >= r0) goto L_0x0153
            int r0 = r5 + -2
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x0179 }
            long r3 = X.C90524aI.A07(r0)     // Catch:{ all -> 0x0179 }
            long r3 = r3 + r13
            long r1 = X.C36371kC.A09(r8)     // Catch:{ all -> 0x0179 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b8
            java.lang.Object r0 = r7.get(r5)     // Catch:{ all -> 0x0179 }
            long r4 = X.C90524aI.A07(r0)     // Catch:{ all -> 0x0179 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0179 }
            java.lang.String r0 = "axolotl found keys ready to be deleted, uploaded at or before: "
            X.C36321k7.A1V(r0, r1, r4)     // Catch:{ all -> 0x0179 }
            goto L_0x00cb
        L_0x00b8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0179 }
            java.lang.String r0 = "axolotl not deleting prekeys for upload timestamp:"
            r1.append(r0)     // Catch:{ all -> 0x0179 }
            java.lang.Object r0 = r7.get(r5)     // Catch:{ all -> 0x0179 }
            X.C36321k7.A1N(r0, r1)     // Catch:{ all -> 0x0179 }
            int r5 = r5 + 1
            goto L_0x008b
        L_0x00cb:
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0153
            X.1M0 r11 = r12.A04()     // Catch:{ all -> 0x0179 }
            X.71s r10 = r11.B1k()     // Catch:{ all -> 0x0140 }
            X.1M0 r9 = r12.A04()     // Catch:{ all -> 0x0136 }
            X.14e r3 = r9.A02     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "sent_to_server = 1 AND upload_timestamp <= ?"
            java.lang.String[] r1 = X.C36441kJ.A1R()     // Catch:{ all -> 0x012c }
            r8 = 0
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x012c }
            r1[r8] = r7     // Catch:{ all -> 0x012c }
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredSentPreKeys"
            int r6 = r3.A03(r6, r2, r0, r1)     // Catch:{ all -> 0x012c }
            r9.close()     // Catch:{ all -> 0x0136 }
            X.1M0 r5 = r12.A04()     // Catch:{ all -> 0x0136 }
            X.14e r4 = r5.A02     // Catch:{ all -> 0x0127 }
            java.lang.String r3 = "prekey_uploads"
            java.lang.String r2 = "upload_timestamp <= ?"
            java.lang.String[] r1 = X.C36441kJ.A1R()     // Catch:{ all -> 0x0127 }
            r1[r8] = r7     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredPreKeyUpload"
            int r2 = r4.A03(r3, r2, r0, r1)     // Catch:{ all -> 0x0127 }
            r5.close()     // Catch:{ all -> 0x0136 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = "axolotl deleted expired uploaded keys:"
            r1.append(r0)     // Catch:{ all -> 0x0136 }
            r1.append(r6)     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = " timestamp rows:"
            X.C36321k7.A1T(r0, r1, r2)     // Catch:{ all -> 0x0136 }
            r10.A00()     // Catch:{ all -> 0x0136 }
            r10.close()     // Catch:{ all -> 0x0140 }
            r11.close()     // Catch:{ all -> 0x0179 }
            goto L_0x0158
        L_0x0127:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0131 }
            goto L_0x0135
        L_0x012c:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0131 }
            goto L_0x0135
        L_0x0131:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0136 }
        L_0x0135:
            throw r1     // Catch:{ all -> 0x0136 }
        L_0x0136:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x013b }
            goto L_0x013f
        L_0x013b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0140 }
        L_0x013f:
            throw r1     // Catch:{ all -> 0x0140 }
        L_0x0140:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0174 }
            goto L_0x0178
        L_0x0145:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0179 }
            java.lang.String r0 = "axolotl deleteExpiredServerPreKeys, not enough key uploads yet:"
            X.C36341k9.A1N(r0, r1, r7)     // Catch:{ all -> 0x0179 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0179 }
            goto L_0x0155
        L_0x0153:
            java.lang.String r0 = "axolotl deleteExpiredServerPreKeys, nothing expiring yet"
        L_0x0155:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0179 }
        L_0x0158:
            if (r15 == 0) goto L_0x015d
            r15.close()     // Catch:{ all -> 0x0185 }
        L_0x015d:
            if (r16 == 0) goto L_0x0162
            r16.close()
        L_0x0162:
            return
        L_0x0163:
            r1 = move-exception
            if (r3 == 0) goto L_0x016e
            r3.close()     // Catch:{ all -> 0x016a }
            goto L_0x016e
        L_0x016a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x016f }
        L_0x016e:
            throw r1     // Catch:{ all -> 0x016f }
        L_0x016f:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0174 }
            goto L_0x0178
        L_0x0174:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0179 }
        L_0x0178:
            throw r1     // Catch:{ all -> 0x0179 }
        L_0x0179:
            r1 = move-exception
            if (r15 == 0) goto L_0x0184
            r15.close()     // Catch:{ all -> 0x0180 }
            goto L_0x0184
        L_0x0180:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0185 }
        L_0x0184:
            throw r1     // Catch:{ all -> 0x0185 }
        L_0x0185:
            r1 = move-exception
            if (r16 == 0) goto L_0x0190
            r16.close()     // Catch:{ all -> 0x018c }
            throw r1
        L_0x018c:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0190:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144736sj.A00(X.6sj):void");
    }

    public void BV2() {
        if (this.A00.A0X()) {
            A00(this);
            return;
        }
        AnonymousClass187 r2 = this.A01;
        r2.A00.submit(new C81113wU((Object) this, 20));
    }

    public C144736sj(AnonymousClass189 r1, AnonymousClass187 r2, AnonymousClass18I r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
