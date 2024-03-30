package com.google.android.gms.vision.clearcut;

import X.C130476Lf;
import android.content.Context;

public class VisionClearcutLogger {
    public final C130476Lf zza;
    public boolean zzb = true;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:156|157|(4:160|161|162|158)|235|167|(1:169)(2:173|(3:175|176|177))|170) */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        r10 = java.util.ServiceLoader.load(r10, r9).iterator();
        r9 = X.AnonymousClass001.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0324, code lost:
        if (r10.hasNext() != false) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x032d, code lost:
        throw X.C165597tg.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0352, code lost:
        if (r9.size() == 1) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0354, code lost:
        r10 = (X.C200829iJ) r9.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x035a, code lost:
        X.C200829iJ.A03 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x035e, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0363, code lost:
        if (r9.size() != 0) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        r10 = (X.C200829iJ) X.AnonymousClass001.A0G(r3, java.util.Collection.class, "combine", new java.lang.Class[1], 0).invoke((java.lang.Object) null, new java.lang.Object[]{r9});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x037a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        r2 = new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0381, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0382, code lost:
        r2 = new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0388, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0389, code lost:
        r2 = new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
        if (r5 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x020f, code lost:
        if (r2 != false) goto L_0x0211;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x0314 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(int r22, X.AnonymousClass8ER r23) {
        /*
            r21 = this;
            r6 = r23
            int r5 = r6.zzc     // Catch:{ IOException -> 0x0412 }
            r0 = -1
            if (r5 != r0) goto L_0x0017
            X.9e6 r1 = X.C198729e6.A02     // Catch:{ IOException -> 0x0412 }
            java.lang.Class r0 = r6.getClass()     // Catch:{ IOException -> 0x0412 }
            X.B3T r0 = r1.A00(r0)     // Catch:{ IOException -> 0x0412 }
            int r5 = r0.zzb(r6)     // Catch:{ IOException -> 0x0412 }
            r6.zzc = r5     // Catch:{ IOException -> 0x0412 }
        L_0x0017:
            byte[] r4 = new byte[r5]     // Catch:{ IOException -> 0x0412 }
            X.8Dy r2 = new X.8Dy     // Catch:{ IOException -> 0x0412 }
            r2.<init>(r4, r5)     // Catch:{ IOException -> 0x0412 }
            X.9e6 r7 = X.C198729e6.A02     // Catch:{ IOException -> 0x0412 }
            java.lang.Class r0 = r6.getClass()     // Catch:{ IOException -> 0x0412 }
            X.B3T r1 = r7.A00(r0)     // Catch:{ IOException -> 0x0412 }
            X.A44 r0 = r2.A01     // Catch:{ IOException -> 0x0412 }
            if (r0 != 0) goto L_0x0031
            X.A44 r0 = new X.A44     // Catch:{ IOException -> 0x0412 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0412 }
        L_0x0031:
            r1.ByK(r0, r6)     // Catch:{ IOException -> 0x0412 }
            int r1 = r2.A02     // Catch:{ IOException -> 0x0412 }
            int r0 = r2.A00     // Catch:{ IOException -> 0x0412 }
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x040b
            r2 = 1
            r1 = 0
            r8 = r22
            if (r22 < 0) goto L_0x03f3
            r0 = 3
            if (r8 > r0) goto L_0x03f3
            r3 = r21
            boolean r0 = r3.zzb     // Catch:{ Exception -> 0x03e5 }
            if (r0 == 0) goto L_0x0298
            X.6Lf r0 = r3.zza     // Catch:{ Exception -> 0x03e5 }
            X.9LT r3 = new X.9LT     // Catch:{ Exception -> 0x03e5 }
            r3.<init>(r0, r4)     // Catch:{ Exception -> 0x03e5 }
            X.8DQ r6 = r3.A02     // Catch:{ Exception -> 0x03e5 }
            r6.A00 = r8     // Catch:{ Exception -> 0x03e5 }
            boolean r0 = r3.A01     // Catch:{ Exception -> 0x03e5 }
            if (r0 != 0) goto L_0x0291
            r3.A01 = r2     // Catch:{ Exception -> 0x03e5 }
            X.6Lf r9 = r3.A03     // Catch:{ Exception -> 0x03e5 }
            java.lang.String r5 = r9.A06     // Catch:{ Exception -> 0x03e5 }
            int r4 = r9.A01     // Catch:{ Exception -> 0x03e5 }
            r7 = 0
            X.90D r3 = r3.A00     // Catch:{ Exception -> 0x03e5 }
            X.8Ce r0 = new X.8Ce     // Catch:{ Exception -> 0x03e5 }
            r0.<init>(r3, r5, r4)     // Catch:{ Exception -> 0x03e5 }
            X.8Cd r8 = new X.8Cd     // Catch:{ Exception -> 0x03e5 }
            r8.<init>(r6, r0)     // Catch:{ Exception -> 0x03e5 }
            X.7cM r4 = r9.A03     // Catch:{ Exception -> 0x03e5 }
            X.A3A r4 = (X.A3A) r4     // Catch:{ Exception -> 0x03e5 }
            X.8Ce r0 = r8.A00     // Catch:{ Exception -> 0x03e5 }
            java.lang.String r5 = r0.A01     // Catch:{ Exception -> 0x03e5 }
            int r3 = r0.A00     // Catch:{ Exception -> 0x03e5 }
            X.8DQ r0 = r8.A08     // Catch:{ Exception -> 0x03e5 }
            if (r0 == 0) goto L_0x0089
            int r11 = r0.A00     // Catch:{ Exception -> 0x03e5 }
        L_0x007e:
            X.9mw r0 = X.A3A.A03     // Catch:{ Exception -> 0x03e5 }
            java.lang.Object r0 = r0.A04()     // Catch:{ Exception -> 0x03e5 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ Exception -> 0x03e5 }
            goto L_0x008b
        L_0x0089:
            r11 = 0
            goto L_0x007e
        L_0x008b:
            if (r0 != 0) goto L_0x0091
            if (r5 == 0) goto L_0x0270
            goto L_0x0123
        L_0x0091:
            if (r5 == 0) goto L_0x009a
            boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x03e5 }
            if (r0 != 0) goto L_0x009a
            goto L_0x00a2
        L_0x009a:
            if (r3 < 0) goto L_0x018b
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x03e5 }
            if (r5 == 0) goto L_0x018b
        L_0x00a2:
            android.content.Context r10 = r4.A00     // Catch:{ Exception -> 0x03e5 }
            if (r10 != 0) goto L_0x00fc
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x03e5 }
        L_0x00aa:
            java.util.Iterator r20 = r0.iterator()     // Catch:{ Exception -> 0x03e5 }
        L_0x00ae:
            boolean r0 = r20.hasNext()     // Catch:{ Exception -> 0x03e5 }
            if (r0 == 0) goto L_0x018b
            java.lang.Object r12 = r20.next()     // Catch:{ Exception -> 0x03e5 }
            X.8DF r12 = (X.AnonymousClass8DF) r12     // Catch:{ Exception -> 0x03e5 }
            int r0 = r12.zzbb     // Catch:{ Exception -> 0x03e5 }
            r0 = r0 & 1
            if (r0 != r2) goto L_0x00c6
            int r0 = r12.zzya     // Catch:{ Exception -> 0x03e5 }
            if (r0 == 0) goto L_0x00c6
            if (r0 != r11) goto L_0x00ae
        L_0x00c6:
            java.lang.String r0 = r12.zzbis     // Catch:{ Exception -> 0x03e5 }
            long r3 = X.A3A.A01(r10)     // Catch:{ Exception -> 0x03e5 }
            long r18 = X.A3A.A02(r0, r3)     // Catch:{ Exception -> 0x03e5 }
            long r5 = r12.zzbit     // Catch:{ Exception -> 0x03e5 }
            long r3 = r12.zzbiu     // Catch:{ Exception -> 0x03e5 }
            r12 = 0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x00ae
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ae
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x00e5
            long r18 = r18 % r3
            goto L_0x00f7
        L_0x00e5:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r14 = r16 % r3
            r12 = 1
            long r14 = r14 + r12
            long r18 = r18 & r16
            long r18 = r18 % r3
            long r14 = r14 + r18
            long r18 = r14 % r3
        L_0x00f7:
            int r0 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0281
            goto L_0x00ae
        L_0x00fc:
            java.util.concurrent.ConcurrentHashMap r12 = X.A3A.A07     // Catch:{ Exception -> 0x03e5 }
            java.lang.Object r6 = r12.get(r5)     // Catch:{ Exception -> 0x03e5 }
            X.9mw r6 = (X.C202919mw) r6     // Catch:{ Exception -> 0x03e5 }
            if (r6 != 0) goto L_0x011a
            X.9Jd r4 = X.A3A.A04     // Catch:{ Exception -> 0x03e5 }
            X.8DC r3 = X.AnonymousClass8DC.zzbir     // Catch:{ Exception -> 0x03e5 }
            X.AwA r0 = X.A3Q.A00     // Catch:{ Exception -> 0x03e5 }
            X.8Cw r6 = new X.8Cw     // Catch:{ Exception -> 0x03e5 }
            r6.<init>(r0, r4, r3, r5)     // Catch:{ Exception -> 0x03e5 }
            java.lang.Object r0 = r12.putIfAbsent(r5, r6)     // Catch:{ Exception -> 0x03e5 }
            X.9mw r0 = (X.C202919mw) r0     // Catch:{ Exception -> 0x03e5 }
            if (r0 == 0) goto L_0x011a
            r6 = r0
        L_0x011a:
            java.lang.Object r0 = r6.A04()     // Catch:{ Exception -> 0x03e5 }
            X.8DC r0 = (X.AnonymousClass8DC) r0     // Catch:{ Exception -> 0x03e5 }
            X.B6a r0 = r0.zzbiq     // Catch:{ Exception -> 0x03e5 }
            goto L_0x00aa
        L_0x0123:
            boolean r0 = r5.isEmpty()     // Catch:{ Exception -> 0x03e5 }
            if (r0 != 0) goto L_0x0270
        L_0x0129:
            android.content.Context r10 = r4.A00     // Catch:{ Exception -> 0x03e5 }
            if (r10 == 0) goto L_0x018b
            java.lang.Boolean r0 = X.A3A.A01     // Catch:{ Exception -> 0x03e5 }
            if (r0 != 0) goto L_0x0147
            X.0Bh r0 = X.C02640Bg.A00(r10)     // Catch:{ Exception -> 0x03e5 }
            java.lang.String r3 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x03e5 }
            int r0 = r0.checkCallingOrSelfPermission(r3)     // Catch:{ Exception -> 0x03e5 }
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x03e5 }
            X.A3A.A01 = r0     // Catch:{ Exception -> 0x03e5 }
        L_0x0147:
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x03e5 }
            if (r0 == 0) goto L_0x018b
            java.util.HashMap r4 = X.A3A.A06     // Catch:{ Exception -> 0x03e5 }
            java.lang.Object r3 = r4.get(r5)     // Catch:{ Exception -> 0x03e5 }
            X.9mw r3 = (X.C202919mw) r3     // Catch:{ Exception -> 0x03e5 }
            if (r3 != 0) goto L_0x0161
            X.9Jd r0 = X.A3A.A05     // Catch:{ Exception -> 0x03e5 }
            X.8Cv r3 = new X.8Cv     // Catch:{ Exception -> 0x03e5 }
            r3.<init>(r0, r5)     // Catch:{ Exception -> 0x03e5 }
            r4.put(r5, r3)     // Catch:{ Exception -> 0x03e5 }
        L_0x0161:
            java.lang.Object r3 = r3.A04()     // Catch:{ Exception -> 0x03e5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x03e5 }
            if (r3 == 0) goto L_0x018b
            r0 = 44
            int r0 = r3.indexOf(r0)     // Catch:{ Exception -> 0x03e5 }
            r5 = 0
            if (r0 < 0) goto L_0x026c
            java.lang.String r13 = r3.substring(r1, r0)     // Catch:{ Exception -> 0x03e5 }
            int r5 = r0 + 1
        L_0x0178:
            r0 = 47
            int r4 = r3.indexOf(r0, r5)     // Catch:{ Exception -> 0x03e5 }
            java.lang.String r11 = "LogSamplerImpl"
            if (r4 > 0) goto L_0x019c
            java.lang.String r0 = "Failed to parse the rule: "
            java.lang.String r0 = X.C90464aC.A0c(r0, r3)     // Catch:{ Exception -> 0x03e5 }
        L_0x0188:
            android.util.Log.e(r11, r0)     // Catch:{ Exception -> 0x03e5 }
        L_0x018b:
            X.7cN r3 = r9.A04     // Catch:{ Exception -> 0x03e5 }
            X.4rz r3 = (X.C98764rz) r3     // Catch:{ Exception -> 0x03e5 }
            X.0XK r0 = r3.A05     // Catch:{ Exception -> 0x03e5 }
            X.8BR r2 = new X.8BR     // Catch:{ Exception -> 0x03e5 }
            r2.<init>(r8, r0)     // Catch:{ Exception -> 0x03e5 }
            r0 = 2
            X.C07590Yl.A02(r3, r2, r0)     // Catch:{ Exception -> 0x03e5 }
            goto L_0x027a
        L_0x019c:
            java.lang.String r0 = r3.substring(r5, r4)     // Catch:{ NumberFormatException -> 0x0260 }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0260 }
            java.lang.String r0 = X.C165607th.A0o(r4, r3)     // Catch:{ NumberFormatException -> 0x0260 }
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0260 }
            r14 = 0
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x024a
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x024a
            X.8DF r11 = X.AnonymousClass8DF.zzbiv     // Catch:{ Exception -> 0x03e5 }
            r0 = 5
            java.lang.Object r11 = r11.A06(r0)     // Catch:{ Exception -> 0x03e5 }
            X.8Cx r11 = (X.C170308Cx) r11     // Catch:{ Exception -> 0x03e5 }
            X.8DB r11 = (X.AnonymousClass8DB) r11     // Catch:{ Exception -> 0x03e5 }
            r11.A01()     // Catch:{ Exception -> 0x03e5 }
            X.8DG r12 = r11.A00     // Catch:{ Exception -> 0x03e5 }
            X.8DF r12 = (X.AnonymousClass8DF) r12     // Catch:{ Exception -> 0x03e5 }
            java.util.Objects.requireNonNull(r13)     // Catch:{ Exception -> 0x03e5 }
            int r0 = r12.zzbb     // Catch:{ Exception -> 0x03e5 }
            r0 = r0 | 2
            r12.zzbb = r0     // Catch:{ Exception -> 0x03e5 }
            r12.zzbis = r13     // Catch:{ Exception -> 0x03e5 }
            r11.A01()     // Catch:{ Exception -> 0x03e5 }
            X.8DG r12 = r11.A00     // Catch:{ Exception -> 0x03e5 }
            X.8DF r12 = (X.AnonymousClass8DF) r12     // Catch:{ Exception -> 0x03e5 }
            int r0 = r12.zzbb     // Catch:{ Exception -> 0x03e5 }
            r0 = r0 | 4
            r12.zzbb = r0     // Catch:{ Exception -> 0x03e5 }
            r12.zzbit = r5     // Catch:{ Exception -> 0x03e5 }
            r11.A01()     // Catch:{ Exception -> 0x03e5 }
            X.8DG r5 = r11.A00     // Catch:{ Exception -> 0x03e5 }
            X.8DF r5 = (X.AnonymousClass8DF) r5     // Catch:{ Exception -> 0x03e5 }
            int r0 = r5.zzbb     // Catch:{ Exception -> 0x03e5 }
            r0 = r0 | 8
            r5.zzbb = r0     // Catch:{ Exception -> 0x03e5 }
            r5.zzbiu = r3     // Catch:{ Exception -> 0x03e5 }
            X.8DG r4 = r11.A00()     // Catch:{ Exception -> 0x03e5 }
            java.lang.Object r0 = r4.A06(r2)     // Catch:{ Exception -> 0x03e5 }
            java.lang.Byte r0 = (java.lang.Byte) r0     // Catch:{ Exception -> 0x03e5 }
            byte r0 = r0.byteValue()     // Catch:{ Exception -> 0x03e5 }
            if (r0 == r2) goto L_0x0211
            if (r0 == 0) goto L_0x027b
            X.B3S r0 = X.C165597tg.A0J(r4)     // Catch:{ Exception -> 0x03e5 }
            boolean r2 = r0.Byx(r4)     // Catch:{ Exception -> 0x03e5 }
            r0 = 2
            r4.A06(r0)     // Catch:{ Exception -> 0x03e5 }
            if (r2 == 0) goto L_0x027b
        L_0x0211:
            X.8DF r4 = (X.AnonymousClass8DF) r4     // Catch:{ Exception -> 0x03e5 }
            if (r4 == 0) goto L_0x018b
            java.lang.String r0 = r4.zzbis     // Catch:{ Exception -> 0x03e5 }
            long r2 = X.A3A.A01(r10)     // Catch:{ Exception -> 0x03e5 }
            long r16 = X.A3A.A02(r0, r2)     // Catch:{ Exception -> 0x03e5 }
            long r2 = r4.zzbit     // Catch:{ Exception -> 0x03e5 }
            long r4 = r4.zzbiu     // Catch:{ Exception -> 0x03e5 }
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x018b
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x018b
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0232
            long r16 = r16 % r4
            goto L_0x0244
        L_0x0232:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r12 = r14 % r4
            r10 = 1
            long r12 = r12 + r10
            long r16 = r16 & r14
            long r16 = r16 % r4
            long r12 = r12 + r16
            long r16 = r12 % r4
        L_0x0244:
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0281
            goto L_0x018b
        L_0x024a:
            r0 = 72
            java.lang.StringBuilder r2 = X.C90524aI.A0h(r0)     // Catch:{ Exception -> 0x03e5 }
            java.lang.String r0 = "negative values not supported: "
            r2.append(r0)     // Catch:{ Exception -> 0x03e5 }
            r2.append(r5)     // Catch:{ Exception -> 0x03e5 }
            java.lang.String r0 = "/"
            java.lang.String r0 = X.C36381kD.A0z(r0, r2, r3)     // Catch:{ Exception -> 0x03e5 }
            goto L_0x0188
        L_0x0260:
            r2 = move-exception
            java.lang.String r0 = "parseLong() failed while parsing: "
            java.lang.String r0 = X.C90464aC.A0c(r0, r3)     // Catch:{ Exception -> 0x03e5 }
            android.util.Log.e(r11, r0, r2)     // Catch:{ Exception -> 0x03e5 }
            goto L_0x018b
        L_0x026c:
            java.lang.String r13 = ""
            goto L_0x0178
        L_0x0270:
            if (r3 < 0) goto L_0x018b
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x03e5 }
            if (r5 == 0) goto L_0x018b
            goto L_0x0129
        L_0x027a:
            return
        L_0x027b:
            X.Ab0 r0 = new X.Ab0     // Catch:{ Exception -> 0x03e5 }
            r0.<init>()     // Catch:{ Exception -> 0x03e5 }
            goto L_0x0297
        L_0x0281:
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.A09     // Catch:{ Exception -> 0x03e5 }
            java.lang.String r0 = "Result must not be null"
            X.AnonymousClass006.A02(r2, r0)     // Catch:{ Exception -> 0x03e5 }
            X.0JQ r0 = new X.0JQ     // Catch:{ Exception -> 0x03e5 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x03e5 }
            r0.A06(r2)     // Catch:{ Exception -> 0x03e5 }
            return
        L_0x0291:
            java.lang.String r0 = "do not reuse LogEventBuilder"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ Exception -> 0x03e5 }
        L_0x0297:
            throw r0     // Catch:{ Exception -> 0x03e5 }
        L_0x0298:
            X.8ER r0 = X.AnonymousClass8ER.zzi     // Catch:{ Exception -> 0x03e5 }
            X.8EH r0 = X.AnonymousClass8EX.A01(r0)     // Catch:{ Exception -> 0x03e5 }
            X.8EG r0 = (X.AnonymousClass8EG) r0     // Catch:{ Exception -> 0x03e5 }
            X.9iJ r3 = X.C200829iJ.A01     // Catch:{ Exception -> 0x03dc }
            java.lang.Class<X.9iJ> r3 = X.C200829iJ.class
            X.9iJ r10 = X.C200829iJ.A03     // Catch:{ Exception -> 0x03dc }
            if (r10 != 0) goto L_0x0392
            monitor-enter(r3)     // Catch:{ Exception -> 0x03dc }
            X.9iJ r10 = X.C200829iJ.A03     // Catch:{ all -> 0x038f }
            if (r10 != 0) goto L_0x035c
            java.lang.Class<X.9a9> r10 = X.C196619a9.class
            java.lang.ClassLoader r9 = r10.getClassLoader()     // Catch:{ all -> 0x038f }
            boolean r6 = r3.equals(r3)     // Catch:{ all -> 0x038f }
            if (r6 == 0) goto L_0x02bc
            java.lang.String r6 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader"
            goto L_0x02e4
        L_0x02bc:
            java.lang.Package r8 = r3.getPackage()     // Catch:{ all -> 0x038f }
            java.lang.Package r6 = r10.getPackage()     // Catch:{ all -> 0x038f }
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x038f }
            if (r6 == 0) goto L_0x0345
            java.lang.Object[] r8 = X.AnonymousClass001.A0M()     // Catch:{ all -> 0x038f }
            java.lang.Package r6 = r3.getPackage()     // Catch:{ all -> 0x038f }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x038f }
            r8[r1] = r6     // Catch:{ all -> 0x038f }
            java.lang.String r6 = r3.getSimpleName()     // Catch:{ all -> 0x038f }
            r8[r2] = r6     // Catch:{ all -> 0x038f }
            java.lang.String r6 = "%s.BlazeGenerated%sLoader"
            java.lang.String r6 = java.lang.String.format(r6, r8)     // Catch:{ all -> 0x038f }
        L_0x02e4:
            java.lang.Class r8 = java.lang.Class.forName(r6, r2, r9)     // Catch:{ ClassNotFoundException -> 0x0314 }
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0306, InstantiationException -> 0x02ff, IllegalAccessException -> 0x030d, InvocationTargetException -> 0x02f8 }
            java.lang.reflect.Constructor r8 = r8.getConstructor(r6)     // Catch:{ NoSuchMethodException -> 0x0306, InstantiationException -> 0x02ff, IllegalAccessException -> 0x030d, InvocationTargetException -> 0x02f8 }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x0306, InstantiationException -> 0x02ff, IllegalAccessException -> 0x030d, InvocationTargetException -> 0x02f8 }
            r8.newInstance(r6)     // Catch:{ NoSuchMethodException -> 0x0306, InstantiationException -> 0x02ff, IllegalAccessException -> 0x030d, InvocationTargetException -> 0x02f8 }
            java.lang.NullPointerException r6 = X.C165597tg.A0g()     // Catch:{ ClassNotFoundException -> 0x0314 }
            throw r6     // Catch:{ ClassNotFoundException -> 0x0314 }
        L_0x02f8:
            r6 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x0314 }
            r8.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x0314 }
            goto L_0x0313
        L_0x02ff:
            r6 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x0314 }
            r8.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x0314 }
            goto L_0x0313
        L_0x0306:
            r6 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x0314 }
            r8.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x0314 }
            goto L_0x0313
        L_0x030d:
            r6 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x0314 }
            r8.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x0314 }
        L_0x0313:
            throw r8     // Catch:{ ClassNotFoundException -> 0x0314 }
        L_0x0314:
            java.util.ServiceLoader r6 = java.util.ServiceLoader.load(r10, r9)     // Catch:{ all -> 0x038f }
            java.util.Iterator r10 = r6.iterator()     // Catch:{ all -> 0x038f }
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x038f }
        L_0x0320:
            boolean r6 = r10.hasNext()     // Catch:{ all -> 0x038f }
            if (r6 == 0) goto L_0x034e
            r10.next()     // Catch:{ ServiceConfigurationError -> 0x032e }
            java.lang.NullPointerException r6 = X.C165597tg.A0g()     // Catch:{ ServiceConfigurationError -> 0x032e }
            throw r6     // Catch:{ ServiceConfigurationError -> 0x032e }
        L_0x032e:
            r16 = move-exception
            java.util.logging.Logger r11 = X.C196619a9.A00     // Catch:{ all -> 0x038f }
            java.util.logging.Level r12 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x038f }
            java.lang.String r8 = "Unable to load "
            java.lang.String r6 = r3.getSimpleName()     // Catch:{ all -> 0x038f }
            java.lang.String r15 = X.C90464aC.A0c(r8, r6)     // Catch:{ all -> 0x038f }
            java.lang.String r13 = "com.google.protobuf.GeneratedExtensionRegistryLoader"
            java.lang.String r14 = "load"
            r11.logp(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x038f }
            goto L_0x0320
        L_0x0345:
            java.lang.String r0 = r3.getName()     // Catch:{ all -> 0x038f }
            java.lang.IllegalArgumentException r2 = X.AnonymousClass001.A08(r0)     // Catch:{ all -> 0x038f }
            goto L_0x038e
        L_0x034e:
            int r6 = r9.size()     // Catch:{ all -> 0x038f }
            if (r6 != r2) goto L_0x035e
            java.lang.Object r10 = r9.get(r1)     // Catch:{ all -> 0x038f }
            X.9iJ r10 = (X.C200829iJ) r10     // Catch:{ all -> 0x038f }
        L_0x035a:
            X.C200829iJ.A03 = r10     // Catch:{ all -> 0x038f }
        L_0x035c:
            monitor-exit(r3)     // Catch:{ all -> 0x038f }
            goto L_0x0392
        L_0x035e:
            int r6 = r9.size()     // Catch:{ all -> 0x038f }
            r10 = 0
            if (r6 == 0) goto L_0x035a
            java.lang.String r11 = "combine"
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0381, IllegalAccessException -> 0x0388, InvocationTargetException -> 0x037a }
            java.lang.Class<java.util.Collection> r6 = java.util.Collection.class
            java.lang.reflect.Method r8 = X.AnonymousClass001.A0G(r3, r6, r11, r8, r1)     // Catch:{ NoSuchMethodException -> 0x0381, IllegalAccessException -> 0x0388, InvocationTargetException -> 0x037a }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x0381, IllegalAccessException -> 0x0388, InvocationTargetException -> 0x037a }
            r6[r1] = r9     // Catch:{ NoSuchMethodException -> 0x0381, IllegalAccessException -> 0x0388, InvocationTargetException -> 0x037a }
            java.lang.Object r10 = r8.invoke(r10, r6)     // Catch:{ NoSuchMethodException -> 0x0381, IllegalAccessException -> 0x0388, InvocationTargetException -> 0x037a }
            X.9iJ r10 = (X.C200829iJ) r10     // Catch:{ NoSuchMethodException -> 0x0381, IllegalAccessException -> 0x0388, InvocationTargetException -> 0x037a }
            goto L_0x035a
        L_0x037a:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x038f }
            r2.<init>(r0)     // Catch:{ all -> 0x038f }
            goto L_0x038e
        L_0x0381:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x038f }
            r2.<init>(r0)     // Catch:{ all -> 0x038f }
            goto L_0x038e
        L_0x0388:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x038f }
            r2.<init>(r0)     // Catch:{ all -> 0x038f }
        L_0x038e:
            throw r2     // Catch:{ all -> 0x038f }
        L_0x038f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x038f }
            goto L_0x03d1
        L_0x0392:
            boolean r3 = r0.A01     // Catch:{ Exception -> 0x03dc }
            if (r3 == 0) goto L_0x039b
            r0.A03()     // Catch:{ Exception -> 0x03dc }
            r0.A01 = r1     // Catch:{ Exception -> 0x03dc }
        L_0x039b:
            X.8EX r3 = r0.A00     // Catch:{ 8xe -> 0x03d2, IndexOutOfBoundsException -> 0x03d4, IOException -> 0x03ca }
            java.lang.Class r3 = r3.getClass()     // Catch:{ 8xe -> 0x03d2, IndexOutOfBoundsException -> 0x03d4, IOException -> 0x03ca }
            X.B3T r6 = r7.A00(r3)     // Catch:{ 8xe -> 0x03d2, IndexOutOfBoundsException -> 0x03d4, IOException -> 0x03ca }
            X.8EX r8 = r0.A00     // Catch:{ 8xe -> 0x03d2, IndexOutOfBoundsException -> 0x03d4, IOException -> 0x03ca }
            X.9cY r7 = new X.9cY     // Catch:{ 8xe -> 0x03d2, IndexOutOfBoundsException -> 0x03d4, IOException -> 0x03ca }
            r7.<init>(r10)     // Catch:{ 8xe -> 0x03d2, IndexOutOfBoundsException -> 0x03d4, IOException -> 0x03ca }
            r10 = 0
            r11 = r5
            r9 = r4
            r6.ByL(r7, r8, r9, r10, r11)     // Catch:{ 8xe -> 0x03d2, IndexOutOfBoundsException -> 0x03d4, IOException -> 0x03ca }
            java.lang.String r4 = "Would have logged:\n%s"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x03dc }
            X.C90514aH.A1Q(r0, r3, r1)     // Catch:{ Exception -> 0x03dc }
            java.lang.String r2 = "Vision"
            r0 = 6
            boolean r0 = android.util.Log.isLoggable(r2, r0)     // Catch:{ Exception -> 0x03dc }
            if (r0 == 0) goto L_0x040a
            java.lang.String r0 = java.lang.String.format(r4, r3)     // Catch:{ Exception -> 0x03dc }
            android.util.Log.e(r2, r0)     // Catch:{ Exception -> 0x03dc }
            return
        L_0x03ca:
            r2 = move-exception
            java.lang.String r0 = "Reading from byte array should not throw IOException."
            java.lang.RuntimeException r0 = X.C90524aI.A0e(r0, r2)     // Catch:{ Exception -> 0x03dc }
        L_0x03d1:
            throw r0     // Catch:{ Exception -> 0x03dc }
        L_0x03d2:
            r2 = move-exception
            goto L_0x03db
        L_0x03d4:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.8xe r2 = new X.8xe     // Catch:{ Exception -> 0x03dc }
            r2.<init>(r0)     // Catch:{ Exception -> 0x03dc }
        L_0x03db:
            throw r2     // Catch:{ Exception -> 0x03dc }
        L_0x03dc:
            r3 = move-exception
            java.lang.String r2 = "Parsing error"
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x03e5 }
            X.C109725Yr.A00(r2, r3, r0)     // Catch:{ Exception -> 0x03e5 }
            return
        L_0x03e5:
            r2 = move-exception
            X.5zc r0 = X.C112955ej.A00
            r0.A00(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "Failed to log"
            X.C109725Yr.A00(r0, r2, r1)
            return
        L_0x03f3:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            X.AnonymousClass000.A1L(r3, r8, r1)
            java.lang.String r2 = "Illegal event code: %d"
            java.lang.String r1 = "Vision"
            r0 = 4
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x040a
            java.lang.String r0 = java.lang.String.format(r2, r3)
            android.util.Log.i(r1, r0)
        L_0x040a:
            return
        L_0x040b:
            java.lang.String r0 = "Did not write as much data as expected."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ IOException -> 0x0412 }
            throw r0     // Catch:{ IOException -> 0x0412 }
        L_0x0412:
            r4 = move-exception
            java.lang.String r3 = "byte array"
            java.lang.String r2 = X.AnonymousClass000.A0k(r6)
            int r0 = X.C90474aD.A05(r2)
            int r1 = r0 + 62
            int r0 = r3.length()
            int r1 = r1 + r0
            java.lang.StringBuilder r1 = X.C90524aI.A0h(r1)
            java.lang.String r0 = "Serializing "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " to a "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " threw an IOException (should never happen)."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.RuntimeException r0 = X.C90524aI.A0e(r0, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.clearcut.VisionClearcutLogger.zza(int, X.8ER):void");
    }

    public VisionClearcutLogger(Context context) {
        this.zza = new C130476Lf(context);
    }
}
