package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.3FN  reason: invalid class name */
public class AnonymousClass3FN {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C20690y0 A03;
    public final C19730wQ A04;
    public final AnonymousClass1T1 A05;
    public final AnonymousClass16D A06;
    public final AnonymousClass171 A07;
    public final C19970wo A08;
    public final C19630wG A09;
    public final C18820ts A0A;
    public final AnonymousClass163 A0B;
    public final AnonymousClass12P A0C;
    public final C24881Ed A0D;
    public final AnonymousClass1FR A0E;
    public final AnonymousClass1AW A0F;
    public final AnonymousClass1A1 A0G;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0184, code lost:
        if (r6.contains(r14) == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x021a, code lost:
        if (r5 == null) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0621, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0623, code lost:
        r4.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x075d, code lost:
        if (r25 == null) goto L_0x0767;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x080a, code lost:
        if (r0 == false) goto L_0x080c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x017f A[Catch:{ IOException -> 0x01b3, all -> 0x0219 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01ac A[Catch:{ IOException -> 0x01b3, all -> 0x0219 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01d3 A[SYNTHETIC, Splitter:B:138:0x01d3] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x023a A[SYNTHETIC, Splitter:B:183:0x023a] */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0616 A[Catch:{ IOException -> 0x0723, all -> 0x0751 }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x067b A[Catch:{ IOException -> 0x0723, all -> 0x0751 }] */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x0715 A[SYNTHETIC, Splitter:B:402:0x0715] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3NO A01(X.AnonymousClass11F r31, java.lang.String r32, boolean r33) {
        /*
            r30 = this;
            r10 = 0
            X.14g r20 = new X.14g
            r0 = r20
            r0.<init>((boolean) r10)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "EmailMessageStore/loadMessagesForEmail/"
            r15 = r31
            java.lang.String r1 = X.AnonymousClass000.A0l(r15, r0, r1)
            r0 = r20
            r0.A04(r1)
            r8 = r30
            X.0y0 r11 = r8.A03
            r0 = r32
            java.io.File r7 = r11.A0S(r0)
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            r29 = 0
            if (r33 == 0) goto L_0x0033
            int r9 = r8.A00
        L_0x002d:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0036
        L_0x0033:
            int r9 = r8.A01
            goto L_0x002d
        L_0x0036:
            X.12P r0 = r8.A0C     // Catch:{ SQLiteException -> 0x022f }
            X.1M0 r28 = r0.get()     // Catch:{ SQLiteException -> 0x022f }
            r0 = r28
            X.14e r3 = r0.A02     // Catch:{ all -> 0x0225 }
            java.lang.String r2 = X.AnonymousClass2xD.A09     // Catch:{ all -> 0x0225 }
            java.lang.String[] r1 = X.C36441kJ.A1S()     // Catch:{ all -> 0x0225 }
            X.163 r0 = r8.A0B     // Catch:{ all -> 0x0225 }
            X.C36331k8.A19(r0, r15, r1, r10)     // Catch:{ all -> 0x0225 }
            java.lang.String r4 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0225 }
            r0 = 1
            r1[r0] = r4     // Catch:{ all -> 0x0225 }
            java.lang.String r0 = "GET_MESSAGES_EMAIL_SAMPLE_SQL"
            android.database.Cursor r5 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x0225 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x0212
            java.util.HashSet r4 = X.C36441kJ.A16()     // Catch:{ all -> 0x0219 }
            r18 = 0
            r3 = 0
        L_0x0065:
            X.1A1 r0 = r8.A0G     // Catch:{ all -> 0x0219 }
            X.3T1 r2 = r0.A01(r5, r15)     // Catch:{ all -> 0x0219 }
            if (r2 == 0) goto L_0x0206
            int r1 = r2.A1I     // Catch:{ all -> 0x0219 }
            r0 = 88
            if (r1 == r0) goto L_0x0206
            r0 = 87
            if (r1 == r0) goto L_0x0206
            int r3 = r3 + 1
            r12 = 128(0x80, double:6.32E-322)
            long r18 = r18 + r12
            r0 = 1
            r27 = 0
            r25 = 0
            if (r1 == r0) goto L_0x0189
            r0 = 2
            if (r1 == r0) goto L_0x0189
            r0 = 3
            if (r1 == r0) goto L_0x0189
            r0 = 4
            if (r1 == r0) goto L_0x00c7
            r0 = 9
            if (r1 == r0) goto L_0x0189
            r0 = 20
            if (r1 == r0) goto L_0x0189
            r0 = 23
            if (r1 == r0) goto L_0x0189
            r0 = 37
            if (r1 == r0) goto L_0x0189
            r0 = 81
            if (r1 == r0) goto L_0x01b9
            r0 = 13
            if (r1 == r0) goto L_0x0189
            r0 = 14
            if (r1 == r0) goto L_0x00c7
            r0 = 25
            if (r1 == r0) goto L_0x0189
            r0 = 26
            if (r1 == r0) goto L_0x0189
            r0 = 28
            if (r1 == r0) goto L_0x0189
            r0 = 29
            if (r1 == r0) goto L_0x0189
            boolean r0 = r2.A1F()     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x01b9
            byte[] r0 = r2.A1V()     // Catch:{ all -> 0x0219 }
            int r0 = r0.length     // Catch:{ all -> 0x0219 }
            long r0 = (long) r0     // Catch:{ all -> 0x0219 }
            goto L_0x01b0
        L_0x00c7:
            boolean r13 = r2 instanceof X.AnonymousClass2bX     // Catch:{ all -> 0x0219 }
            if (r13 == 0) goto L_0x010c
            r0 = r2
            X.2bX r0 = (X.AnonymousClass2bX) r0     // Catch:{ all -> 0x0219 }
            java.lang.String r14 = r0.A00     // Catch:{ all -> 0x0219 }
        L_0x00d0:
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0219 }
            java.lang.String r1 = ""
            if (r14 == 0) goto L_0x00de
            java.lang.String r0 = "[?:\\/*\"<>|\\x00-\\x1F]"
            java.lang.String r1 = r14.replaceAll(r0, r1)     // Catch:{ all -> 0x0219 }
        L_0x00de:
            r12.append(r1)     // Catch:{ all -> 0x0219 }
            java.lang.String r0 = ".vcf"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r12)     // Catch:{ all -> 0x0219 }
            java.io.File r14 = r11.A0X(r0)     // Catch:{ all -> 0x0219 }
            boolean r0 = r14.exists()     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x0105
            long r23 = r14.lastModified()     // Catch:{ all -> 0x0219 }
            long r21 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0219 }
            r0 = 60000(0xea60, double:2.9644E-319)
            long r21 = r21 - r0
            int r0 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r0 >= 0) goto L_0x0105
            X.AnonymousClass6YY.A0P(r14)     // Catch:{ all -> 0x0219 }
        L_0x0105:
            boolean r0 = r14.exists()     // Catch:{ all -> 0x0219 }
            if (r0 != 0) goto L_0x0180
            goto L_0x0119
        L_0x010c:
            boolean r0 = r2 instanceof X.AnonymousClass2bW     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x0116
            r0 = r2
            X.2bW r0 = (X.AnonymousClass2bW) r0     // Catch:{ all -> 0x0219 }
            java.lang.String r14 = r0.A00     // Catch:{ all -> 0x0219 }
            goto L_0x00d0
        L_0x0116:
            r14 = r27
            goto L_0x00d0
        L_0x0119:
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0173 }
            r12.<init>(r14)     // Catch:{ IOException -> 0x0173 }
            java.lang.String r1 = X.C19430v1.A0B     // Catch:{ all -> 0x0169 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0169 }
            r0.<init>(r12, r1)     // Catch:{ all -> 0x0169 }
            if (r13 == 0) goto L_0x0128
            goto L_0x0145
        L_0x0128:
            boolean r1 = r2 instanceof X.AnonymousClass2bW     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x0155
            r1 = r2
            X.2bW r1 = (X.AnonymousClass2bW) r1     // Catch:{ all -> 0x015f }
            java.util.List r1 = r1.A1X()     // Catch:{ all -> 0x015f }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x015f }
        L_0x0137:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x0155
            java.lang.String r1 = X.AnonymousClass001.A0C(r13)     // Catch:{ all -> 0x015f }
            r0.write(r1)     // Catch:{ all -> 0x015f }
            goto L_0x0137
        L_0x0145:
            r1 = r2
            X.2bX r1 = (X.AnonymousClass2bX) r1     // Catch:{ all -> 0x015f }
            java.lang.String r13 = r1.A1X()     // Catch:{ all -> 0x015f }
            if (r13 == 0) goto L_0x0128
            java.lang.String r1 = r1.A1X()     // Catch:{ all -> 0x015f }
            r0.write(r1)     // Catch:{ all -> 0x015f }
        L_0x0155:
            r0.flush()     // Catch:{ all -> 0x015f }
            r0.close()     // Catch:{ all -> 0x0169 }
            r12.close()     // Catch:{ IOException -> 0x0173 }
            goto L_0x0179
        L_0x015f:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0164 }
            goto L_0x0168
        L_0x0164:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0169 }
        L_0x0168:
            throw r1     // Catch:{ all -> 0x0169 }
        L_0x0169:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x016e }
            goto L_0x0172
        L_0x016e:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ IOException -> 0x0173 }
        L_0x0172:
            throw r0     // Catch:{ IOException -> 0x0173 }
        L_0x0173:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/getExportChatMessagesFile/vcard-msgs/write-failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0219 }
        L_0x0179:
            boolean r0 = r6.contains(r14)     // Catch:{ all -> 0x0219 }
            if (r0 != 0) goto L_0x01b9
            goto L_0x0186
        L_0x0180:
            boolean r0 = r6.contains(r14)     // Catch:{ all -> 0x0219 }
            if (r0 != 0) goto L_0x01b9
        L_0x0186:
            r27 = r14
            goto L_0x01a6
        L_0x0189:
            if (r33 == 0) goto L_0x01b9
            boolean r0 = r2 instanceof X.AnonymousClass2bU     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x01b9
            r0 = r2
            X.2bU r0 = (X.AnonymousClass2bU) r0     // Catch:{ all -> 0x0219 }
            X.3Qj r0 = r0.A01     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x01b9
            java.io.File r1 = r0.A0I     // Catch:{ all -> 0x0219 }
            if (r1 == 0) goto L_0x01b9
            boolean r0 = r0.A0V     // Catch:{ IOException -> 0x01b3 }
            if (r0 != 0) goto L_0x01a4
            boolean r0 = r11.A0h(r1)     // Catch:{ IOException -> 0x01b3 }
            if (r0 == 0) goto L_0x01b9
        L_0x01a4:
            r27 = r1
        L_0x01a6:
            boolean r0 = r27.exists()     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x01b9
            long r0 = r27.length()     // Catch:{ all -> 0x0219 }
        L_0x01b0:
            long r25 = r25 + r0
            goto L_0x01b9
        L_0x01b3:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/getExportChatMessagesFile/unexpected exception"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0219 }
        L_0x01b9:
            java.lang.Long r1 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x0219 }
            r0 = r27
            X.00I r0 = X.C36441kJ.A0W(r0, r1)     // Catch:{ all -> 0x0219 }
            java.lang.Object r12 = r0.A00     // Catch:{ all -> 0x0219 }
            java.io.File r12 = (java.io.File) r12     // Catch:{ all -> 0x0219 }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x0219 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0219 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0219 }
            long r18 = r18 + r0
            if (r3 >= r9) goto L_0x0212
            long r0 = r8.A02     // Catch:{ all -> 0x0210 }
            int r13 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x0212
            java.lang.String r0 = "_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0210 }
            long r16 = r5.getLong(r0)     // Catch:{ all -> 0x0210 }
            if (r12 == 0) goto L_0x0206
            boolean r0 = r12.exists()     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x0206
            boolean r0 = r4.contains(r12)     // Catch:{ all -> 0x0219 }
            if (r0 != 0) goto L_0x0206
            r6.add(r10, r12)     // Catch:{ all -> 0x0219 }
            r4.add(r12)     // Catch:{ all -> 0x0219 }
            boolean r0 = r2 instanceof X.AnonymousClass2bU     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x0206
            X.2bU r2 = (X.AnonymousClass2bU) r2     // Catch:{ all -> 0x0219 }
            X.3Qj r0 = r2.A01     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x0206
            boolean r0 = r0.A0f     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x0206
            goto L_0x020d
        L_0x0206:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0219 }
            if (r0 != 0) goto L_0x0065
            goto L_0x0212
        L_0x020d:
            r29 = 2
            goto L_0x0212
        L_0x0210:
            r1 = move-exception
            goto L_0x021c
        L_0x0212:
            r5.close()     // Catch:{ all -> 0x0225 }
            r28.close()     // Catch:{ SQLiteException -> 0x022f }
            goto L_0x0235
        L_0x0219:
            r1 = move-exception
            if (r5 == 0) goto L_0x0224
        L_0x021c:
            r5.close()     // Catch:{ all -> 0x0220 }
            goto L_0x0224
        L_0x0220:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0225 }
        L_0x0224:
            throw r1     // Catch:{ all -> 0x0225 }
        L_0x0225:
            r1 = move-exception
            r28.close()     // Catch:{ all -> 0x022a }
            goto L_0x022e
        L_0x022a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x022f }
        L_0x022e:
            throw r1     // Catch:{ SQLiteException -> 0x022f }
        L_0x022f:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/getStartIdAndCollectFiles/error "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0235:
            r1 = 2
            r0 = r29
            if (r0 == r1) goto L_0x080d
            java.io.FileOutputStream r23 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x07ef, IOException -> 0x07fc }
            r0 = r23
            r0.<init>(r7)     // Catch:{ FileNotFoundException -> 0x07ef, IOException -> 0x07fc }
            java.lang.String r2 = X.C19430v1.A0B     // Catch:{ all -> 0x07e5 }
            java.io.OutputStreamWriter r22 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x07e5 }
            r1 = r22
            r1.<init>(r0, r2)     // Catch:{ all -> 0x07e5 }
            r5 = 0
            r18 = 0
            X.12P r0 = r8.A0C     // Catch:{ SQLiteException -> 0x0772 }
            X.1M0 r21 = r0.get()     // Catch:{ SQLiteException -> 0x0772 }
            r0 = r21
            X.14e r3 = r0.A02     // Catch:{ all -> 0x0768 }
            java.lang.String r2 = X.AnonymousClass2xD.A0A     // Catch:{ all -> 0x0768 }
            java.lang.String[] r1 = X.C36441kJ.A1S()     // Catch:{ all -> 0x0768 }
            X.163 r0 = r8.A0B     // Catch:{ all -> 0x0768 }
            X.C36331k8.A19(r0, r15, r1, r10)     // Catch:{ all -> 0x0768 }
            java.lang.String r4 = java.lang.Long.toString(r16)     // Catch:{ all -> 0x0768 }
            r0 = 1
            r1[r0] = r4     // Catch:{ all -> 0x0768 }
            java.lang.String r0 = "GET_MESSAGES_EMAIL_SQL"
            android.database.Cursor r25 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x0768 }
            boolean r0 = r25.moveToFirst()     // Catch:{ all -> 0x075c }
            if (r0 == 0) goto L_0x0755
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x075c }
            r24 = 0
        L_0x027b:
            X.1A1 r0 = r8.A0G     // Catch:{ all -> 0x0751 }
            r1 = r25
            X.3T1 r3 = r0.A01(r1, r15)     // Catch:{ all -> 0x0751 }
            if (r3 == 0) goto L_0x0748
            int r2 = r3.A1I     // Catch:{ all -> 0x0751 }
            r0 = 88
            if (r2 == r0) goto L_0x0748
            r0 = 87
            if (r2 == r0) goto L_0x0748
            int r24 = r24 + 1
            boolean r11 = X.AnonymousClass143.A0G(r15)     // Catch:{ all -> 0x0751 }
            X.0ts r9 = r8.A0A     // Catch:{ all -> 0x0751 }
            X.0wo r10 = r8.A08     // Catch:{ all -> 0x0751 }
            long r0 = r3.A0I     // Catch:{ all -> 0x0751 }
            long r0 = r10.A08(r0)     // Catch:{ all -> 0x0751 }
            java.lang.String r10 = X.C20040wv.A09(r9, r0)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = X.AnonymousClass3UM.A00(r9, r0)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = X.AnonymousClass6XI.A03(r9, r10, r0)     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = " - "
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            boolean r0 = X.C66013Ui.A0p(r3)     // Catch:{ all -> 0x0751 }
            if (r0 != 0) goto L_0x02cf
            X.3Qa r0 = r3.A1J     // Catch:{ all -> 0x0751 }
            boolean r1 = r0.A02     // Catch:{ all -> 0x0751 }
            if (r1 == 0) goto L_0x02d9
            X.0wQ r0 = r8.A04     // Catch:{ all -> 0x0751 }
            X.0wh r0 = r0.A0A     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r0.A02()     // Catch:{ all -> 0x0751 }
        L_0x02c7:
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = ": "
            r4.append(r0)     // Catch:{ all -> 0x0751 }
        L_0x02cf:
            r26 = 0
            java.lang.String r12 = "\n"
            r14 = 1
            r16 = 0
            if (r2 == r14) goto L_0x05d6
            goto L_0x030e
        L_0x02d9:
            if (r11 == 0) goto L_0x02dc
            goto L_0x02e3
        L_0x02dc:
            X.171 r10 = r8.A07     // Catch:{ all -> 0x0751 }
            X.16D r1 = r8.A06     // Catch:{ all -> 0x0751 }
            X.11F r0 = r0.A00     // Catch:{ all -> 0x0751 }
            goto L_0x02ed
        L_0x02e3:
            X.11F r0 = r3.A0J()     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x02f2
            X.171 r10 = r8.A07     // Catch:{ all -> 0x0751 }
            X.16D r1 = r8.A06     // Catch:{ all -> 0x0751 }
        L_0x02ed:
            java.lang.String r0 = X.C36381kD.A0u(r1, r10, r0)     // Catch:{ all -> 0x0751 }
            goto L_0x02c7
        L_0x02f2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = "EmailMessageStore/appendDateTimeAndName/missing_rmt_src:"
            r1.append(r0)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = X.C66013Ui.A0F(r3)     // Catch:{ all -> 0x0751 }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x0751 }
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0751 }
            r0 = 2131895200(0x7f1223a0, float:1.9425226E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0751 }
            goto L_0x02c7
        L_0x030e:
            r0 = 2
            if (r2 == r0) goto L_0x05d6
            r0 = 3
            if (r2 == r0) goto L_0x05d6
            r0 = 4
            if (r2 == r0) goto L_0x0599
            r0 = 5
            if (r2 == r0) goto L_0x0566
            r0 = 20
            if (r2 == r0) goto L_0x05d6
            r0 = 21
            if (r2 == r0) goto L_0x0544
            r0 = 25
            if (r2 == r0) goto L_0x05d6
            r0 = 26
            if (r2 == r0) goto L_0x05d6
            r0 = 36
            if (r2 == r0) goto L_0x0523
            r0 = 37
            if (r2 == r0) goto L_0x05d6
            r0 = 44
            if (r2 == r0) goto L_0x04f9
            r0 = 45
            if (r2 == r0) goto L_0x04e5
            r0 = 54
            if (r2 == r0) goto L_0x04e5
            r0 = 55
            if (r2 == r0) goto L_0x04e5
            r0 = 62
            if (r2 == r0) goto L_0x04e5
            r0 = 63
            if (r2 == r0) goto L_0x04e5
            r0 = 81
            if (r2 == r0) goto L_0x04d9
            r0 = 82
            if (r2 == r0) goto L_0x04cd
            switch(r2) {
                case 9: goto L_0x05d6;
                case 10: goto L_0x03a7;
                case 11: goto L_0x03cc;
                case 12: goto L_0x03d8;
                case 13: goto L_0x05d6;
                case 14: goto L_0x0599;
                case 15: goto L_0x0383;
                case 16: goto L_0x0370;
                case 23: goto L_0x05d6;
                case 52: goto L_0x04e5;
                case 57: goto L_0x04e5;
                case 66: goto L_0x03e4;
                case 78: goto L_0x0441;
                case 85: goto L_0x04e5;
                case 92: goto L_0x044d;
                default: goto L_0x0355;
            }     // Catch:{ all -> 0x0751 }
        L_0x0355:
            switch(r2) {
                case 28: goto L_0x05d6;
                case 29: goto L_0x05d6;
                case 30: goto L_0x0566;
                case 31: goto L_0x0364;
                default: goto L_0x0358;
            }     // Catch:{ all -> 0x0751 }
        L_0x0358:
            if (r2 == 0) goto L_0x064b
            r0 = 27
            if (r2 == r0) goto L_0x064b
            r0 = 32
            if (r2 == r0) goto L_0x064b
            goto L_0x0642
        L_0x0364:
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0751 }
            r0 = 2131888642(0x7f120a02, float:1.9411925E38)
            X.C36351kA.A14(r1, r4, r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x0370:
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0751 }
            r0 = 2131889021(0x7f120b7d, float:1.9412694E38)
            X.C36351kA.A14(r1, r4, r0)     // Catch:{ all -> 0x0751 }
            r0 = r3
            X.2br r0 = (X.C46902br) r0     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x066b
            goto L_0x0623
        L_0x0383:
            X.3Qa r1 = r3.A1J     // Catch:{ all -> 0x0751 }
            X.11F r0 = r1.A00     // Catch:{ all -> 0x0751 }
            boolean r0 = r0 instanceof X.C28981Uw     // Catch:{ all -> 0x0751 }
            boolean r1 = r1.A02     // Catch:{ all -> 0x0751 }
            if (r1 == 0) goto L_0x0396
            r1 = 2131893744(0x7f121df0, float:1.9422273E38)
            if (r0 == 0) goto L_0x039e
            r1 = 2131893745(0x7f121df1, float:1.9422275E38)
            goto L_0x039e
        L_0x0396:
            r1 = 2131893742(0x7f121dee, float:1.942227E38)
            if (r0 == 0) goto L_0x039e
            r1 = 2131893743(0x7f121def, float:1.9422271E38)
        L_0x039e:
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0751 }
            X.C36351kA.A14(r0, r4, r1)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x03a7:
            r0 = r3
            X.5J5 r0 = (X.AnonymousClass5J5) r0     // Catch:{ all -> 0x0751 }
            int r9 = r0.A1X()     // Catch:{ all -> 0x0751 }
            if (r9 == 0) goto L_0x03c0
            if (r9 == r14) goto L_0x03bc
            r1 = 2
            r0 = 2131895850(0x7f12262a, float:1.9426545E38)
            if (r9 == r1) goto L_0x03c3
            r0 = 2131895654(0x7f122566, float:1.9426147E38)
            goto L_0x03c3
        L_0x03bc:
            r0 = 2131895651(0x7f122563, float:1.9426141E38)
            goto L_0x03c3
        L_0x03c0:
            r0 = 2131895848(0x7f122628, float:1.942654E38)
        L_0x03c3:
            X.0wG r1 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r1 = r1.A00     // Catch:{ all -> 0x0751 }
            X.C36351kA.A14(r1, r4, r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x03cc:
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0751 }
            r0 = 2131888642(0x7f120a02, float:1.9411925E38)
            X.C36351kA.A14(r1, r4, r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x03d8:
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0751 }
            r0 = 2131888496(0x7f120970, float:1.9411629E38)
            X.C36351kA.A14(r1, r4, r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x03e4:
            r1 = r3
            X.2bS r1 = (X.AnonymousClass2bS) r1     // Catch:{ all -> 0x0751 }
            X.0wG r10 = r8.A09     // Catch:{ all -> 0x0751 }
            r0 = 2131893157(0x7f121ba5, float:1.9421083E38)
            java.lang.String r0 = r10.A01(r0)     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            r4.append(r12)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r1.A03     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            r4.append(r12)     // Catch:{ all -> 0x0751 }
            java.util.List r0 = r1.A05     // Catch:{ all -> 0x0751 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x0751 }
        L_0x0404:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x066b
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x0751 }
            X.3PS r11 = (X.AnonymousClass3PS) r11     // Catch:{ all -> 0x0751 }
            r9 = 2131891829(0x7f121675, float:1.941839E38)
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r11.A03     // Catch:{ all -> 0x0751 }
            r1[r5] = r0     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r10.A02(r9, r1)     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            X.C36421kH.A1N(r4)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = "("
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            android.content.res.Resources r9 = X.C36421kH.A0B(r10)     // Catch:{ all -> 0x0751 }
            r1 = 2131755224(0x7f1000d8, float:1.9141321E38)
            int r0 = r11.A00     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = X.C36321k7.A0B(r9, r0, r5, r1)     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            r4.append(r12)     // Catch:{ all -> 0x0751 }
            goto L_0x0404
        L_0x0441:
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0751 }
            r0 = 2131895736(0x7f1225b8, float:1.9426313E38)
            X.C36351kA.A14(r1, r4, r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x044d:
            boolean r0 = r3 instanceof X.AnonymousClass2bT     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x066b
            r13 = r3
            X.2bT r13 = (X.AnonymousClass2bT) r13     // Catch:{ all -> 0x0751 }
            X.0wG r11 = r8.A09     // Catch:{ all -> 0x0751 }
            r9 = 2131889421(0x7f120d0d, float:1.9413505E38)
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r13.A05     // Catch:{ all -> 0x0751 }
            r1[r5] = r0     // Catch:{ all -> 0x0751 }
            A00(r11, r4, r1, r9)     // Catch:{ all -> 0x0751 }
            long r0 = r13.A00     // Catch:{ all -> 0x0751 }
            r10 = 2131889419(0x7f120d0b, float:1.9413501E38)
            java.lang.Object[] r9 = new java.lang.Object[r14]     // Catch:{ all -> 0x0751 }
            X.AnonymousClass000.A1M(r9, r5, r0)     // Catch:{ all -> 0x0751 }
            A00(r11, r4, r9, r10)     // Catch:{ all -> 0x0751 }
            boolean r9 = r13.A06     // Catch:{ all -> 0x0751 }
            r1 = 2131889371(0x7f120cdb, float:1.9413404E38)
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ all -> 0x0751 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0751 }
            r0[r5] = r10     // Catch:{ all -> 0x0751 }
            A00(r11, r4, r0, r1)     // Catch:{ all -> 0x0751 }
            if (r9 != 0) goto L_0x066b
            java.lang.String r9 = r13.A03     // Catch:{ all -> 0x0751 }
            if (r9 == 0) goto L_0x048f
            r1 = 2131889380(0x7f120ce4, float:1.9413422E38)
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ all -> 0x0751 }
            r0[r5] = r9     // Catch:{ all -> 0x0751 }
            A00(r11, r4, r0, r1)     // Catch:{ all -> 0x0751 }
        L_0x048f:
            java.lang.String r9 = r13.A04     // Catch:{ all -> 0x0751 }
            if (r9 == 0) goto L_0x049d
            r1 = 2131889391(0x7f120cef, float:1.9413444E38)
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ all -> 0x0751 }
            r0[r5] = r9     // Catch:{ all -> 0x0751 }
            A00(r11, r4, r0, r1)     // Catch:{ all -> 0x0751 }
        L_0x049d:
            X.3J7 r10 = r13.A01     // Catch:{ all -> 0x0751 }
            if (r10 == 0) goto L_0x066b
            java.lang.String r9 = r10.A02     // Catch:{ all -> 0x0751 }
            if (r9 == 0) goto L_0x04af
            r1 = 2131889395(0x7f120cf3, float:1.9413452E38)
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ all -> 0x0751 }
            r0[r5] = r9     // Catch:{ all -> 0x0751 }
            A00(r11, r4, r0, r1)     // Catch:{ all -> 0x0751 }
        L_0x04af:
            java.lang.String r9 = r10.A01     // Catch:{ all -> 0x0751 }
            if (r9 == 0) goto L_0x04bd
            r1 = 2131889393(0x7f120cf1, float:1.9413448E38)
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ all -> 0x0751 }
            r0[r5] = r9     // Catch:{ all -> 0x0751 }
            A00(r11, r4, r0, r1)     // Catch:{ all -> 0x0751 }
        L_0x04bd:
            X.3IM r1 = r10.A00     // Catch:{ all -> 0x0751 }
            if (r1 == 0) goto L_0x066b
            r0 = 2131889396(0x7f120cf4, float:1.9413454E38)
            java.lang.Object[] r9 = new java.lang.Object[r14]     // Catch:{ all -> 0x0751 }
            r9[r5] = r1     // Catch:{ all -> 0x0751 }
            A00(r11, r4, r9, r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x04cd:
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0751 }
            r0 = 2131895703(0x7f122597, float:1.9426247E38)
            X.C36351kA.A14(r1, r4, r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x04d9:
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0751 }
            r0 = 2131889506(0x7f120d62, float:1.9413677E38)
            X.C36351kA.A14(r1, r4, r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x04e5:
            r1 = r3
            X.B1o r1 = (X.C23043B1o) r1     // Catch:{ all -> 0x0751 }
            X.1AW r0 = r8.A0F     // Catch:{ all -> 0x0751 }
            X.9gz r0 = r0.A01(r1)     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x066b
            java.lang.String r0 = r0.A09()     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x04f9:
            r1 = r3
            X.2bw r1 = (X.C46952bw) r1     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r1.A08     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = X.C65853Ts.A03(r9, r1)     // Catch:{ all -> 0x0751 }
            boolean r9 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0751 }
            if (r9 != 0) goto L_0x0511
            r4.append(r12)     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
        L_0x0511:
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x0751 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0751 }
            if (r0 != 0) goto L_0x066b
            r4.append(r12)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x0523:
            r11 = r3
            X.2bH r11 = (X.AnonymousClass2bH) r11     // Catch:{ all -> 0x0751 }
            X.1T1 r10 = r8.A05     // Catch:{ all -> 0x0751 }
            X.3Qa r1 = r3.A1J     // Catch:{ all -> 0x0751 }
            boolean r0 = r1.A02     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x0541
            X.0wQ r0 = r8.A04     // Catch:{ all -> 0x0751 }
            com.whatsapp.jid.PhoneUserJid r9 = X.C36441kJ.A0n(r0)     // Catch:{ all -> 0x0751 }
        L_0x0534:
            int r1 = r11.A00     // Catch:{ all -> 0x0751 }
            int r0 = r11.A04     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r10.A0K(r9, r1, r0, r14)     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x0541:
            X.11F r9 = r1.A00     // Catch:{ all -> 0x0751 }
            goto L_0x0534
        L_0x0544:
            r0 = r3
            X.8mj r0 = (X.C180978mj) r0     // Catch:{ all -> 0x0751 }
            java.lang.String r11 = r0.A00     // Catch:{ all -> 0x0751 }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0751 }
            if (r0 != 0) goto L_0x066b
            X.1Ed r10 = r8.A0D     // Catch:{ all -> 0x0751 }
            r0 = -1
            r9 = r26
            X.9lY r1 = r10.A0L(r11, r9, r0)     // Catch:{ all -> 0x0751 }
            if (r1 == 0) goto L_0x066b
            X.1FR r0 = r8.A0E     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r0.A0V(r1, r3)     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x0566:
            r11 = r3
            X.2bs r11 = (X.C46912bs) r11     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r11.A1a()     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x0579
            java.lang.String r0 = r11.A1a()     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            r4.append(r12)     // Catch:{ all -> 0x0751 }
        L_0x0579:
            java.lang.String r0 = r11.A02     // Catch:{ all -> 0x0751 }
            if (r0 != 0) goto L_0x0626
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r10 = r0.A00     // Catch:{ all -> 0x0751 }
            r9 = 2131889022(0x7f120b7e, float:1.9412696E38)
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ all -> 0x0751 }
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = "https://maps.google.com/?q="
            java.lang.String r0 = X.AnonymousClass2bL.A00(r11, r0, r13)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = X.C36391kE.A0v(r10, r0, r1, r5, r9)     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x0599:
            boolean r0 = r3 instanceof X.AnonymousClass2bX     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x05c9
            r0 = r3
            X.2bX r0 = (X.AnonymousClass2bX) r0     // Catch:{ all -> 0x0751 }
            java.lang.String r10 = r0.A00     // Catch:{ all -> 0x0751 }
        L_0x05a2:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0751 }
            java.lang.String r1 = ""
            if (r10 == 0) goto L_0x05b0
            java.lang.String r0 = "[?:\\/*\"<>|\\x00-\\x1F]"
            java.lang.String r1 = r10.replaceAll(r0, r1)     // Catch:{ all -> 0x0751 }
        L_0x05b0:
            r9.append(r1)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = ".vcf"
            java.lang.String r9 = X.AnonymousClass000.A0q(r0, r9)     // Catch:{ all -> 0x0751 }
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0751 }
            r0 = 2131889020(0x7f120b7c, float:1.9412692E38)
            java.lang.String r0 = X.C36351kA.A0w(r1, r9, r14, r0)     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x05c9:
            boolean r0 = r3 instanceof X.AnonymousClass2bW     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x05d3
            r0 = r3
            X.2bW r0 = (X.AnonymousClass2bW) r0     // Catch:{ all -> 0x0751 }
            java.lang.String r10 = r0.A00     // Catch:{ all -> 0x0751 }
            goto L_0x05a2
        L_0x05d3:
            r10 = r26
            goto L_0x05a2
        L_0x05d6:
            r10 = r3
            X.2bU r10 = (X.AnonymousClass2bU) r10     // Catch:{ all -> 0x0751 }
            if (r33 == 0) goto L_0x0636
            boolean r0 = r10.A1g()     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x062a
            java.io.File r13 = X.AnonymousClass2bU.A01(r10)     // Catch:{ all -> 0x0751 }
            X.C18740tg.A06(r13)     // Catch:{ all -> 0x0751 }
            long r16 = r13.length()     // Catch:{ all -> 0x0751 }
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r11 = r0.A00     // Catch:{ all -> 0x0751 }
            r9 = 2131889020(0x7f120b7c, float:1.9412692E38)
            java.lang.Object[] r1 = new java.lang.Object[r14]     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r13.getName()     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = X.C36391kE.A0v(r11, r0, r1, r5, r9)     // Catch:{ all -> 0x0751 }
        L_0x05fd:
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r10.A1a()     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x0612
            boolean r1 = X.C202359le.A04(r10)     // Catch:{ all -> 0x0751 }
            if (r1 != 0) goto L_0x0612
            r4.append(r12)     // Catch:{ all -> 0x0751 }
        L_0x060f:
            r4.append(r0)     // Catch:{ all -> 0x0751 }
        L_0x0612:
            boolean r0 = r3 instanceof X.C46852bm     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x066b
            r0 = r3
            X.2bm r0 = (X.C46852bm) r0     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r0.A1k()     // Catch:{ all -> 0x0751 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0751 }
            if (r1 != 0) goto L_0x066b
        L_0x0623:
            r4.append(r12)     // Catch:{ all -> 0x0751 }
        L_0x0626:
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x062a:
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0751 }
            r0 = 2131889496(0x7f120d58, float:1.9413657E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0751 }
            goto L_0x05fd
        L_0x0636:
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0751 }
            r0 = 2131889496(0x7f120d58, float:1.9413657E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0751 }
            goto L_0x060f
        L_0x0642:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = "EmailMessageStore/processmessage/type/unknown: "
            X.C36321k7.A1U(r0, r1, r2)     // Catch:{ all -> 0x0751 }
        L_0x064b:
            X.9lY r0 = r3.A0M     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x065b
            X.1FR r0 = r8.A0E     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r0.A0Z(r3)     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            r4.append(r12)     // Catch:{ all -> 0x0751 }
        L_0x065b:
            boolean r0 = r3 instanceof X.AnonymousClass2bI     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x0698
            X.1T1 r1 = r8.A05     // Catch:{ all -> 0x0751 }
            r0 = r3
            X.2bI r0 = (X.AnonymousClass2bI) r0     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r1.A0O(r0, r5)     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
        L_0x066b:
            X.37E r1 = X.C61583Cq.A00(r3)     // Catch:{ all -> 0x0751 }
            r0 = r26
            java.lang.String r0 = X.C202359le.A02(r1, r0)     // Catch:{ all -> 0x0751 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0751 }
            if (r1 != 0) goto L_0x06e7
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0751 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0751 }
            if (r1 != 0) goto L_0x0688
            r4.append(r12)     // Catch:{ all -> 0x0751 }
        L_0x0688:
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            X.37E r0 = X.C61583Cq.A00(r3)     // Catch:{ all -> 0x0751 }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x0751 }
            java.util.List r11 = r0.A02     // Catch:{ all -> 0x0751 }
            r4.append(r12)     // Catch:{ all -> 0x0751 }
            goto L_0x06b5
        L_0x0698:
            boolean r0 = r3 instanceof X.AnonymousClass2cW     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x06a7
            r0 = r3
            X.2cW r0 = (X.AnonymousClass2cW) r0     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r0.A1d()     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x06a7:
            int r0 = r3.A0D()     // Catch:{ all -> 0x0751 }
            if (r0 == r14) goto L_0x066b
            java.lang.String r0 = r3.A0b()     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            goto L_0x066b
        L_0x06b5:
            r10 = 0
        L_0x06b6:
            int r0 = r11.size()     // Catch:{ all -> 0x0751 }
            if (r10 >= r0) goto L_0x06e7
            int r14 = r10 + 1
            X.0wG r0 = r8.A09     // Catch:{ all -> 0x0751 }
            android.content.Context r13 = r0.A00     // Catch:{ all -> 0x0751 }
            r9 = 2131887292(0x7f1204bc, float:1.9409187E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = X.C36391kE.A0v(r13, r0, r1, r5, r9)     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            X.C36421kH.A1N(r4)     // Catch:{ all -> 0x0751 }
            java.lang.Object r0 = r11.get(r10)     // Catch:{ all -> 0x0751 }
            X.3EY r0 = (X.AnonymousClass3EY) r0     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
            r4.append(r12)     // Catch:{ all -> 0x0751 }
            r10 = r14
            goto L_0x06b6
        L_0x06e7:
            if (r2 != 0) goto L_0x070d
            r1 = 131072(0x20000, float:1.83671E-40)
            int r0 = r3.A0A     // Catch:{ all -> 0x0751 }
            r0 = r0 & r1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x070d
            com.whatsapp.jid.UserJid r0 = r3.A0L()     // Catch:{ all -> 0x0751 }
            boolean r0 = X.C197029b1.A00(r0)     // Catch:{ all -> 0x0751 }
            if (r0 != 0) goto L_0x070d
            X.C36421kH.A1N(r4)     // Catch:{ all -> 0x0751 }
            X.0wG r1 = r8.A09     // Catch:{ all -> 0x0751 }
            r0 = 2131889497(0x7f120d59, float:1.941366E38)
            java.lang.String r0 = r1.A01(r0)     // Catch:{ all -> 0x0751 }
            r4.append(r0)     // Catch:{ all -> 0x0751 }
        L_0x070d:
            long r18 = r18 + r16
            int r0 = r4.length()     // Catch:{ all -> 0x0751 }
            if (r0 <= 0) goto L_0x0748
            java.lang.StringBuilder r0 = X.C36381kD.A11(r4)     // Catch:{ IOException -> 0x0723 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r12, r0)     // Catch:{ IOException -> 0x0723 }
            r1 = r22
            r1.write(r0)     // Catch:{ IOException -> 0x0723 }
            goto L_0x0741
        L_0x0723:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x073c
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0751 }
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0751 }
            if (r0 == 0) goto L_0x073c
            java.lang.String r0 = "loadforemail/no-space"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0751 }
            throw r2     // Catch:{ all -> 0x0751 }
        L_0x073c:
            java.lang.String r0 = "EmailMessageStore/collectMessages/txt-msgs/write-failed"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0751 }
        L_0x0741:
            int r0 = r4.length()     // Catch:{ all -> 0x0751 }
            r4.delete(r5, r0)     // Catch:{ all -> 0x0751 }
        L_0x0748:
            boolean r0 = r25.moveToNext()     // Catch:{ all -> 0x0751 }
            if (r0 != 0) goto L_0x027b
            r5 = r24
            goto L_0x0755
        L_0x0751:
            r1 = move-exception
            r5 = r24
            goto L_0x075f
        L_0x0755:
            r25.close()     // Catch:{ all -> 0x0768 }
            r21.close()     // Catch:{ SQLiteException -> 0x0772 }
            goto L_0x0778
        L_0x075c:
            r1 = move-exception
            if (r25 == 0) goto L_0x0767
        L_0x075f:
            r25.close()     // Catch:{ all -> 0x0763 }
            goto L_0x0767
        L_0x0763:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0768 }
        L_0x0767:
            throw r1     // Catch:{ all -> 0x0768 }
        L_0x0768:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x076d }
            goto L_0x0771
        L_0x076d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x0772 }
        L_0x0771:
            throw r1     // Catch:{ SQLiteException -> 0x0772 }
        L_0x0772:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/collectMessages/error "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x07db }
        L_0x0778:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x07db }
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x07db }
            X.00I r2 = X.C36441kJ.A0W(r1, r0)     // Catch:{ all -> 0x07db }
            r22.flush()     // Catch:{ all -> 0x07db }
            r22.close()     // Catch:{ all -> 0x07e5 }
            r23.close()     // Catch:{ FileNotFoundException -> 0x07ef, IOException -> 0x07fc }
            X.0wo r0 = r8.A08
            long r0 = X.C19970wo.A00(r0)
            boolean r0 = r7.setLastModified(r0)
            if (r0 != 0) goto L_0x07a2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "EmailMessageStore/loadMessagesForEmail failed to set timestamp for "
            X.C36321k7.A1J(r7, r0, r1)
        L_0x07a2:
            java.lang.Object r0 = r2.A00
            int r5 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r0 = r2.A01
            long r1 = X.C36431kI.A09(r0)
            long r3 = r7.length()
            long r1 = r1 + r3
            r0 = 0
            r6.add(r0, r7)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "EmailMessageStore/loadMessagesForEmail/total count:"
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = "/total attach file:"
            X.C36341k9.A1N(r0, r3, r6)
            java.lang.String r0 = "/total size:"
            X.C36321k7.A1V(r0, r3, r1)
            r20.A01()
            if (r5 != 0) goto L_0x07d5
            r6.clear()
        L_0x07d5:
            X.3NO r0 = new X.3NO
            r0.<init>((java.util.List) r6)
            return r0
        L_0x07db:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x07e0 }
            goto L_0x07e4
        L_0x07e0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x07e5 }
        L_0x07e4:
            throw r1     // Catch:{ all -> 0x07e5 }
        L_0x07e5:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x07ea }
            goto L_0x07ee
        L_0x07ea:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x07ef, IOException -> 0x07fc }
        L_0x07ee:
            throw r1     // Catch:{ FileNotFoundException -> 0x07ef, IOException -> 0x07fc }
        L_0x07ef:
            r1 = move-exception
            java.lang.String r0 = "EmailMessageStore/loadMessagesForEmail cannot create attachment file"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 1
            X.3NO r0 = new X.3NO
            r0.<init>((int) r1)
            return r0
        L_0x07fc:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x080c
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            r1 = 3
            if (r0 != 0) goto L_0x080d
        L_0x080c:
            r1 = 4
        L_0x080d:
            X.3NO r0 = new X.3NO
            r0.<init>((int) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3FN.A01(X.11F, java.lang.String, boolean):X.3NO");
    }

    public static void A00(C19630wG r2, StringBuilder sb, Object[] objArr, int i) {
        sb.append(r2.A02(i, objArr));
        sb.append("\n");
    }

    public AnonymousClass3FN(C20690y0 r5, C19730wQ r6, AnonymousClass1T1 r7, AnonymousClass16D r8, AnonymousClass171 r9, C19970wo r10, C19630wG r11, C18820ts r12, AnonymousClass163 r13, AnonymousClass12P r14, C24881Ed r15, C20810yC r16, AnonymousClass1FR r17, AnonymousClass1AW r18, AnonymousClass1A1 r19) {
        this.A09 = r11;
        this.A08 = r10;
        this.A0B = r13;
        this.A04 = r6;
        this.A03 = r5;
        this.A0E = r17;
        this.A06 = r8;
        this.A07 = r9;
        this.A0A = r12;
        this.A0G = r19;
        this.A0C = r14;
        this.A0D = r15;
        this.A05 = r7;
        this.A0F = r18;
        C20810yC r1 = r16;
        this.A00 = r1.A07(7604);
        this.A01 = r1.A07(7605);
        this.A02 = C36441kJ.A0B(r1, 7606) * SearchActionVerificationClientService.MS_TO_NS;
    }
}
