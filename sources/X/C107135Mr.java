package X;

import com.whatsapp.Mp4Ops;
import java.io.File;

/* renamed from: X.5Mr  reason: invalid class name and case insensitive filesystem */
public abstract class C107135Mr extends C132446Tt {
    public final C25371Ga A00;
    public final C159467jP A01;
    public final String A02;
    public final C19700wN A03;
    public final Mp4Ops A04;
    public final C20050ww A05;
    public final AnonymousClass1AV A06;
    public final C19970wo A07;
    public final C20810yC A08;
    public final boolean A09;
    public final C24341Cb A0A;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        File file;
        AnonymousClass63X r5 = (AnonymousClass63X) obj;
        C25371Ga r3 = this.A00;
        String str = this.A02;
        byte[] bArr = null;
        if (r5 == null) {
            file = null;
        } else {
            file = r5.A00;
            bArr = r5.A01;
        }
        r3.BXx(file, str, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d0, code lost:
        if (r0 == null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d5, code lost:
        if (r1 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01de, code lost:
        r2.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0104, code lost:
        r6 = X.C25541Gs.A04(r8);
        r20 = X.C19970wo.A00(r20) - r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0110, code lost:
        if (r10.A09 == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0112, code lost:
        r4 = r10.A06;
        r7 = r10.A0A;
        com.whatsapp.Mp4Ops.A00(r4, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0121, code lost:
        if (r10.A08.A0E(8037) != false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0123, code lost:
        com.whatsapp.GifHelper.A00(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012a, code lost:
        if (r22.isCancelled() == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r0.close();
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r7 = r3.B81(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013c, code lost:
        if (r7 == null) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013e, code lost:
        r10 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0144, code lost:
        if (X.C90484aE.A1W(r10) == false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0156, code lost:
        if (X.C90524aI.A0S(r10).getAbsolutePath().equals(r8.getAbsolutePath()) != false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0158, code lost:
        r0.close();
        X.AnonymousClass6YY.A0P(r8);
        r13 = new X.AnonymousClass63X(X.C90524aI.A0S(r10), r7.A02, -1, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016d, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r0.close();
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r3.Bmb(new X.C121635tS(r8.getAbsolutePath(), r6, r9), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0187, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r15 = new X.AnonymousClass63X(r8, r6, r18, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r0.close();
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a1, code lost:
        r3 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01bd A[SYNTHETIC, Splitter:B:96:0x01bd] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c2 A[Catch:{ IOException -> 0x01c5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass63X A0G() {
        /*
            r23 = this;
            r10 = r23
            java.lang.String r9 = r10.A02
            X.4c6 r0 = r10.A02
            r22 = r0
            boolean r0 = r22.isCancelled()
            r13 = 0
            if (r0 != 0) goto L_0x0028
            X.7jP r3 = r10.A01
            X.5tS r1 = r3.B81(r9)
            if (r1 == 0) goto L_0x0029
            java.lang.String r0 = r1.A00
            java.io.File r14 = X.C90524aI.A0S(r0)
            byte[] r15 = r1.A02
            r16 = -1
            r18 = -1
            X.63X r13 = new X.63X
            r13.<init>(r14, r15, r16, r18)
        L_0x0028:
            return r13
        L_0x0029:
            X.0wo r0 = r10.A07
            r20 = r0
            long r16 = X.C19970wo.A00(r20)
            r0 = 10
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            java.net.URL r1 = X.C90524aI.A0j(r9)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            java.net.URLConnection r2 = r1.openConnection()     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            X.AnonymousClass00C.A0E(r2, r0)     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ Exception -> 0x01b0, all -> 0x01ae }
            r2.connect()     // Catch:{ Exception -> 0x01b3, all -> 0x01db }
            int r1 = r2.getResponseCode()     // Catch:{ Exception -> 0x01b3, all -> 0x01db }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0055
            r2.disconnect()
            goto L_0x0177
        L_0x0055:
            int r12 = r2.getContentLength()     // Catch:{ Exception -> 0x01b3, all -> 0x01db }
            X.0ww r0 = r10.A05     // Catch:{ Exception -> 0x01b3, all -> 0x01db }
            r11 = 0
            X.5RE r1 = X.AnonymousClass5RE.A00(r0, r2, r11)     // Catch:{ Exception -> 0x01b3, all -> 0x01db }
            boolean r0 = r10 instanceof X.C1043559i     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            if (r0 == 0) goto L_0x00b8
            r6 = r10
            X.59i r6 = (X.C1043559i) r6     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            X.7jP r4 = r6.A01     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            boolean r0 = r4 instanceof X.C145776uV     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            if (r0 == 0) goto L_0x0098
            X.6uV r4 = (X.C145776uV) r4     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            java.lang.String r0 = r6.A02     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            X.AnonymousClass00C.A0D(r0, r11)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            X.C145776uV.A00(r4)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            com.facebook.stash.core.FileStash r5 = r4.A00     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            java.lang.StringBuilder r4 = X.C36421kH.A0f(r5)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            java.lang.String r0 = X.C18750th.A04(r0)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            r4.append(r0)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            java.lang.String r0 = ".gif"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r4)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            java.io.File r8 = r5.insertFile(r0)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            X.AnonymousClass00C.A08(r8)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
        L_0x0091:
            java.io.FileOutputStream r0 = X.C90524aI.A0W(r8)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x00d3
        L_0x0098:
            X.0wG r0 = r6.A00     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            android.content.Context r4 = r0.A00     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            java.lang.String r0 = "gif/gif_preview_cache"
            java.io.File r5 = X.C55722v5.A00(r4, r0)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            if (r5 == 0) goto L_0x01a5
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            java.lang.String r0 = r6.A02     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            java.lang.String r0 = X.C18750th.A04(r0)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            r4.append(r0)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            java.lang.String r0 = ".gif"
            java.io.File r8 = X.C90464aC.A0K(r5, r0, r4)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            goto L_0x0091
        L_0x00b8:
            r0 = r10
            X.59h r0 = (X.AnonymousClass59h) r0     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            X.0y0 r5 = r0.A00     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            java.lang.String r0 = X.AnonymousClass1GW.A0K()     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            r4.append(r0)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            java.lang.String r0 = ".mp4"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r4)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            java.io.File r8 = r5.A0X(r0)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            goto L_0x0091
        L_0x00d3:
            byte[] r7 = new byte[r4]     // Catch:{ Exception -> 0x01a3 }
            r18 = 0
        L_0x00d7:
            int r6 = r1.read(r7)     // Catch:{ Exception -> 0x01a3 }
            r4 = -1
            if (r6 == r4) goto L_0x0104
            boolean r4 = r22.isCancelled()     // Catch:{ Exception -> 0x01a3 }
            if (r4 == 0) goto L_0x00e9
            r1.close()     // Catch:{ Exception -> 0x01a3 }
            goto L_0x016e
        L_0x00e9:
            long r4 = (long) r6     // Catch:{ Exception -> 0x01a3 }
            long r18 = r18 + r4
            if (r12 <= 0) goto L_0x00ff
            java.lang.Object[] r13 = X.AnonymousClass001.A0L()     // Catch:{ Exception -> 0x01a3 }
            r4 = 100
            long r4 = r4 * r18
            long r14 = (long) r12     // Catch:{ Exception -> 0x01a3 }
            long r4 = r4 / r14
            int r14 = (int) r4     // Catch:{ Exception -> 0x01a3 }
            X.AnonymousClass000.A1L(r13, r14, r11)     // Catch:{ Exception -> 0x01a3 }
            r10.A0F(r13)     // Catch:{ Exception -> 0x01a3 }
        L_0x00ff:
            r0.write(r7, r11, r6)     // Catch:{ Exception -> 0x01a3 }
            r13 = 0
            goto L_0x00d7
        L_0x0104:
            byte[] r6 = X.C25541Gs.A04(r8)     // Catch:{ Exception -> 0x01a3 }
            long r20 = X.C19970wo.A00(r20)     // Catch:{ Exception -> 0x01a3 }
            long r20 = r20 - r16
            boolean r4 = r10.A09     // Catch:{ Exception -> 0x01a3 }
            if (r4 == 0) goto L_0x0126
            X.1AV r4 = r10.A06     // Catch:{ Exception -> 0x01a3 }
            X.1Cb r7 = r10.A0A     // Catch:{ Exception -> 0x01a3 }
            com.whatsapp.Mp4Ops.A00(r4, r7, r8)     // Catch:{ Exception -> 0x01a3 }
            X.0yC r5 = r10.A08     // Catch:{ Exception -> 0x01a3 }
            r4 = 8037(0x1f65, float:1.1262E-41)
            boolean r4 = r5.A0E(r4)     // Catch:{ Exception -> 0x01a3 }
            if (r4 != 0) goto L_0x0126
            com.whatsapp.GifHelper.A00(r7, r8)     // Catch:{ Exception -> 0x01a3 }
        L_0x0126:
            boolean r4 = r22.isCancelled()     // Catch:{ Exception -> 0x01a3 }
            if (r4 == 0) goto L_0x0137
            r0.close()     // Catch:{ IOException -> 0x0132 }
            r1.close()     // Catch:{ IOException -> 0x0132 }
        L_0x0132:
            r2.disconnect()
            goto L_0x01ca
        L_0x0137:
            monitor-enter(r3)     // Catch:{ Exception -> 0x01a3 }
            X.5tS r7 = r3.B81(r9)     // Catch:{ all -> 0x019e }
            if (r7 == 0) goto L_0x017b
            java.lang.String r10 = r7.A00     // Catch:{ all -> 0x019e }
            boolean r4 = X.C90484aE.A1W(r10)     // Catch:{ all -> 0x019e }
            if (r4 == 0) goto L_0x017b
            java.io.File r4 = X.C90524aI.A0S(r10)     // Catch:{ all -> 0x019e }
            java.lang.String r5 = r4.getAbsolutePath()     // Catch:{ all -> 0x019e }
            java.lang.String r4 = r8.getAbsolutePath()     // Catch:{ all -> 0x019e }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x019e }
            if (r4 != 0) goto L_0x017b
            r0.close()     // Catch:{ all -> 0x019e }
            X.AnonymousClass6YY.A0P(r8)     // Catch:{ all -> 0x019e }
            java.io.File r14 = X.C90524aI.A0S(r10)     // Catch:{ all -> 0x019e }
            byte[] r15 = r7.A02     // Catch:{ all -> 0x019e }
            r16 = -1
            r18 = -1
            X.63X r13 = new X.63X     // Catch:{ all -> 0x019e }
            r13.<init>(r14, r15, r16, r18)     // Catch:{ all -> 0x019e }
            monitor-exit(r3)     // Catch:{ all -> 0x019e }
        L_0x016e:
            r0.close()     // Catch:{ IOException -> 0x0174 }
            r1.close()     // Catch:{ IOException -> 0x0174 }
        L_0x0174:
            r2.disconnect()
        L_0x0177:
            android.net.TrafficStats.clearThreadStatsTag()
            return r13
        L_0x017b:
            java.lang.String r5 = r8.getAbsolutePath()     // Catch:{ all -> 0x019e }
            X.5tS r4 = new X.5tS     // Catch:{ all -> 0x019e }
            r4.<init>(r5, r6, r9)     // Catch:{ all -> 0x019e }
            r3.Bmb(r4, r9)     // Catch:{ all -> 0x019e }
            monitor-exit(r3)     // Catch:{ all -> 0x019e }
            X.63X r15 = new X.63X     // Catch:{ Exception -> 0x01a3, all -> 0x01a1 }
            r16 = r8
            r17 = r6
            r15.<init>(r16, r17, r18, r20)     // Catch:{ Exception -> 0x01a3, all -> 0x01a1 }
            r0.close()     // Catch:{ IOException -> 0x0197 }
            r1.close()     // Catch:{ IOException -> 0x0197 }
        L_0x0197:
            r2.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r15
        L_0x019e:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x019e }
            throw r4     // Catch:{ Exception -> 0x01a3, all -> 0x01a1 }
        L_0x01a1:
            r3 = move-exception
            goto L_0x01d2
        L_0x01a3:
            r3 = move-exception
            goto L_0x01b8
        L_0x01a5:
            java.lang.String r0 = "GifCache/gifpreviewdownloadaction/createtempfile/error creating directory"
            java.io.IOException r0 = X.C90524aI.A0X(r0)     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
            throw r0     // Catch:{ Exception -> 0x01b6, all -> 0x01ac }
        L_0x01ac:
            r3 = move-exception
            goto L_0x01d7
        L_0x01ae:
            r3 = move-exception
            goto L_0x01e1
        L_0x01b0:
            r3 = move-exception
            r2 = 0
            goto L_0x01b4
        L_0x01b3:
            r3 = move-exception
        L_0x01b4:
            r1 = 0
            goto L_0x01b7
        L_0x01b6:
            r3 = move-exception
        L_0x01b7:
            r0 = 0
        L_0x01b8:
            com.whatsapp.util.Log.w((java.lang.Throwable) r3)     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x01c0
            r0.close()     // Catch:{ IOException -> 0x01c5 }
        L_0x01c0:
            if (r1 == 0) goto L_0x01c5
            r1.close()     // Catch:{ IOException -> 0x01c5 }
        L_0x01c5:
            if (r2 == 0) goto L_0x01ca
            r2.disconnect()
        L_0x01ca:
            android.net.TrafficStats.clearThreadStatsTag()
            r13 = 0
            return r13
        L_0x01cf:
            r3 = move-exception
            if (r0 == 0) goto L_0x01d5
        L_0x01d2:
            r0.close()     // Catch:{ IOException -> 0x01dc }
        L_0x01d5:
            if (r1 == 0) goto L_0x01dc
        L_0x01d7:
            r1.close()     // Catch:{ IOException -> 0x01dc }
            goto L_0x01dc
        L_0x01db:
            r3 = move-exception
        L_0x01dc:
            if (r2 == 0) goto L_0x01e1
            r2.disconnect()
        L_0x01e1:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107135Mr.A0G():X.63X");
    }

    public C107135Mr(C19700wN r1, Mp4Ops mp4Ops, C20050ww r3, AnonymousClass1AV r4, C24341Cb r5, C19970wo r6, C20810yC r7, C25371Ga r8, C159467jP r9, String str, boolean z) {
        this.A07 = r6;
        this.A04 = mp4Ops;
        this.A08 = r7;
        this.A03 = r1;
        this.A05 = r3;
        this.A06 = r4;
        this.A0A = r5;
        this.A02 = str;
        this.A00 = r8;
        this.A09 = z;
        this.A01 = r9;
    }
}
