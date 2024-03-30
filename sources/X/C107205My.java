package X;

import android.content.Context;
import android.webkit.URLUtil;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.5My  reason: invalid class name and case insensitive filesystem */
public class C107205My extends C132446Tt {
    public static final HashMap A0A = AnonymousClass001.A0J();
    public final int A00;
    public final long A01;
    public final C20050ww A02;
    public final AnonymousClass1O7 A03;
    public final C19630wG A04;
    public final C124245xp A05;
    public final AnonymousClass1O9 A06;
    public final C21080yd A07;
    public final C20020wt A08;
    public final C19770wU A09;

    public static void A01(C20050ww r7, AnonymousClass1O7 r8, C19630wG r9, C124245xp r10, AnonymousClass1O9 r11, C21080yd r12, C20020wt r13, C19770wU r14, int i, long j) {
        HashMap hashMap = A0A;
        synchronized (hashMap) {
            AnonymousClass11F r4 = r10.A03;
            if (hashMap.containsKey(r4)) {
                C107205My r3 = (C107205My) hashMap.get(r4);
                C124245xp r2 = r3.A05;
                if (!r2.A06.equals(r10.A06)) {
                    r3.A0D(true);
                    hashMap.remove(r2.A03);
                } else if (r3.A06() != 1) {
                    hashMap.remove(r2.A03);
                }
            }
            C107205My r6 = new C107205My(r7, r8, r9, r10, r11, r12, r13, r14, i, j);
            hashMap.put(r4, r6);
            C36331k8.A1F(r6, r14);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        if (r8 != 0) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0150, code lost:
        r3 = r4;
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0153, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0154, code lost:
        r3 = r4;
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0191, code lost:
        com.whatsapp.util.Log.w("ProfilePictureDownload: Fatal error connecting to CDN ", r2);
        r13 = new X.C123465wX(r14, r15, 1, 4, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a2, code lost:
        com.whatsapp.util.Log.w("ProfilePictureDownload: Transient error connecting to CDN ", r2);
        r13 = new X.C123465wX(r14, r15, 0, 4, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b4, code lost:
        r4.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01cc, code lost:
        if (r4 == null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cf, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d0, code lost:
        r3 = r4;
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d2, code lost:
        r4.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d5, code lost:
        if (r3 != null) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01dc, code lost:
        com.whatsapp.util.Log.w("ProfilePictureDownload: Could not close connection input stream", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x014f A[ExcHandler: 5VB (e X.5VB), Splitter:B:15:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0191 A[Catch:{ all -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a2 A[Catch:{ all -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b9 A[SYNTHETIC, Splitter:B:79:0x01b9] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01cf A[ExcHandler: all (th java.lang.Throwable), Splitter:B:15:0x0064] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r20) {
        /*
            r19 = this;
            r14 = r19
            X.0wG r0 = r14.A04
            android.content.Context r0 = r0.A00
            java.io.File r15 = A00(r0, r14)
            boolean r0 = r15.createNewFile()     // Catch:{ IOException -> 0x01fa }
            if (r0 != 0) goto L_0x0015
            long r2 = r15.length()     // Catch:{ IOException -> 0x01fa }
            goto L_0x0017
        L_0x0015:
            r2 = 0
        L_0x0017:
            java.lang.String r7 = "ProfilePictureDownload: Could not close connection input stream"
            java.lang.String r6 = "ProfilePictureDownload: Could not close FileOutputStream "
            r0 = 1
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x01e8 }
            r5.<init>(r15, r0)     // Catch:{ FileNotFoundException -> 0x01e8 }
            r4 = 0
            X.5xp r0 = r14.A05     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            java.net.URL r9 = r0.A06     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            java.net.URLConnection r1 = r9.openConnection()     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            boolean r0 = r1 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            if (r0 == 0) goto L_0x0157
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            X.0yd r0 = r14.A07     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            X.8qR r0 = r0.A02()     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            r1.setSSLSocketFactory(r0)     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            X.C90464aC.A1S(r1)     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            X.0wt r0 = r14.A08     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            java.lang.String r8 = r0.A02()     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            java.lang.String r0 = "User-Agent"
            r1.setRequestProperty(r0, r8)     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            r10 = 0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0064
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            java.lang.String r0 = "bytes="
            r8.append(r0)     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            r8.append(r2)     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            java.lang.String r0 = "-"
            java.lang.String r8 = X.AnonymousClass000.A0q(r0, r8)     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            java.lang.String r0 = "Range"
            r1.setRequestProperty(r0, r8)     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
        L_0x0064:
            r1.connect()     // Catch:{ IOException -> 0x0153, 5VB -> 0x014f, all -> 0x01cf }
            int r0 = r1.getResponseCode()     // Catch:{ IOException -> 0x0153, 5VB -> 0x014f, all -> 0x01cf }
            r13 = 200(0xc8, float:2.8E-43)
            r11 = 0
            r10 = 206(0xce, float:2.89E-43)
            int r8 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r8 <= 0) goto L_0x0077
            r13 = 206(0xce, float:2.89E-43)
        L_0x0077:
            if (r0 != r13) goto L_0x0137
            X.0ww r3 = r14.A02     // Catch:{ IOException -> 0x0153, 5VB -> 0x014f, all -> 0x01cf }
            r12 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x0153, 5VB -> 0x014f, all -> 0x01cf }
            X.5RE r4 = X.C132776Vf.A00(r3, r4, r2, r1)     // Catch:{ IOException -> 0x0153, 5VB -> 0x014f, all -> 0x01cf }
            r11 = 8192(0x2000, float:1.14794E-41)
            byte[] r8 = new byte[r11]     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
        L_0x0088:
            int r3 = r4.read(r8, r12, r11)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            r2 = -1
            if (r3 == r2) goto L_0x00a6
            boolean r2 = X.C36431kI.A1Y(r14)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            if (r2 == 0) goto L_0x00a2
            r16 = 1
            X.5wX r13 = new X.5wX     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            r17 = 1
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            goto L_0x012f
        L_0x00a2:
            r5.write(r8, r12, r3)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            goto L_0x0088
        L_0x00a6:
            r5.flush()     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            if (r0 != r10) goto L_0x00cb
            java.lang.String r2 = "Content-Range"
            java.lang.String r3 = r1.getHeaderField(r2)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            boolean r2 = r3.isEmpty()     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            if (r2 != 0) goto L_0x00c9
            java.lang.String r2 = "/"
            java.lang.String[] r8 = r3.split(r2)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            int r3 = r8.length     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            r2 = 2
            if (r3 != r2) goto L_0x00c9
            r2 = 1
            r2 = r8[r2]     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            int r8 = java.lang.Integer.parseInt(r2)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            goto L_0x00cf
        L_0x00c9:
            r8 = -1
            goto L_0x00d1
        L_0x00cb:
            int r8 = r1.getContentLength()     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
        L_0x00cf:
            if (r8 == 0) goto L_0x010e
        L_0x00d1:
            long r2 = (long) r8     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            long r11 = r15.length()     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            int r10 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x010e
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            java.lang.String r2 = "ProfilePictureDownload: Length mismatch between CDN response and stored file: "
            r3.append(r2)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            r3.append(r9)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            java.lang.String r2 = " responseCode:"
            r3.append(r2)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            r3.append(r0)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            java.lang.String r2 = " contentLength:"
            r3.append(r2)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            r3.append(r8)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            java.lang.String r2 = " fileLength:"
            X.C90464aC.A19(r15, r2, r3)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            r16 = 1
            r17 = 6
            X.5wX r13 = new X.5wX     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            goto L_0x012f
        L_0x010e:
            r16 = 2
            r17 = 1
            X.5wX r13 = new X.5wX     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x011a, 5VB -> 0x014f, all -> 0x01cf }
            goto L_0x012f
        L_0x011a:
            r8 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0153, 5VB -> 0x014f, all -> 0x01cf }
            java.lang.String r2 = "ProfilePictureDownload: IO Exception in middle of download: "
            X.C36321k7.A1L(r8, r2, r3)     // Catch:{ IOException -> 0x0153, 5VB -> 0x014f, all -> 0x01cf }
            r16 = 0
            r17 = 5
            X.5wX r13 = new X.5wX     // Catch:{ IOException -> 0x0153, 5VB -> 0x014f, all -> 0x01cf }
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x0153, 5VB -> 0x014f, all -> 0x01cf }
        L_0x012f:
            r1.disconnect()
            r4.close()     // Catch:{ IOException -> 0x01bd }
            goto L_0x01c1
        L_0x0137:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0153, 5VB -> 0x014f, all -> 0x01cf }
            java.lang.String r2 = "ProfilePictureDownload: Non Success Response from CDN: "
            X.C36321k7.A1U(r2, r3, r0)     // Catch:{ IOException -> 0x0153, 5VB -> 0x014f, all -> 0x01cf }
            r16 = 1
            r17 = 6
            X.5wX r13 = new X.5wX     // Catch:{ IOException -> 0x0153, 5VB -> 0x014f, all -> 0x01cf }
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x0153, 5VB -> 0x014f, all -> 0x01cf }
            r1.disconnect()
            goto L_0x01c1
        L_0x014f:
            r2 = move-exception
            r3 = r4
            r4 = r1
            goto L_0x0172
        L_0x0153:
            r2 = move-exception
            r3 = r4
            r4 = r1
            goto L_0x0185
        L_0x0157:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            java.lang.String r0 = "Could not get HTTPS Connection:"
            r2.append(r0)     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            java.lang.String r0 = X.AnonymousClass000.A0k(r1)     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r2)     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            X.5VB r0 = new X.5VB     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            r0.<init>(r14, r1)     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
            throw r0     // Catch:{ IOException -> 0x0183, 5VB -> 0x0170, all -> 0x016e }
        L_0x016e:
            r2 = move-exception
            goto L_0x01df
        L_0x0170:
            r2 = move-exception
            r3 = r4
        L_0x0172:
            java.lang.String r0 = "ProfilePictureDownload: "
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cb }
            r16 = 0
            r17 = 4
            r18 = -1
            X.5wX r13 = new X.5wX     // Catch:{ all -> 0x01cb }
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01cb }
            goto L_0x01b2
        L_0x0183:
            r2 = move-exception
            r3 = r4
        L_0x0185:
            boolean r0 = r2 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x01cb }
            if (r0 != 0) goto L_0x01a2
            boolean r0 = r2 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x01cb }
            if (r0 != 0) goto L_0x01a2
            boolean r0 = r2 instanceof java.net.ConnectException     // Catch:{ all -> 0x01cb }
            if (r0 != 0) goto L_0x01a2
            java.lang.String r0 = "ProfilePictureDownload: Fatal error connecting to CDN "
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cb }
            r16 = 1
            r17 = 4
            r18 = -1
            X.5wX r13 = new X.5wX     // Catch:{ all -> 0x01cb }
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01cb }
            goto L_0x01b2
        L_0x01a2:
            java.lang.String r0 = "ProfilePictureDownload: Transient error connecting to CDN "
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x01cb }
            r16 = 0
            r17 = 4
            r18 = -1
            X.5wX r13 = new X.5wX     // Catch:{ all -> 0x01cb }
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01cb }
        L_0x01b2:
            if (r4 == 0) goto L_0x01b7
            r4.disconnect()
        L_0x01b7:
            if (r3 == 0) goto L_0x01c1
            r3.close()     // Catch:{ IOException -> 0x01bd }
            goto L_0x01c1
        L_0x01bd:
            r0 = move-exception
            com.whatsapp.util.Log.w(r7, r0)
        L_0x01c1:
            r5.close()     // Catch:{ IOException -> 0x01c5 }
            goto L_0x01ca
        L_0x01c5:
            r0 = move-exception
            com.whatsapp.util.Log.w(r6, r0)
            return r13
        L_0x01ca:
            return r13
        L_0x01cb:
            r2 = move-exception
            if (r4 == 0) goto L_0x01d5
            goto L_0x01d2
        L_0x01cf:
            r2 = move-exception
            r3 = r4
            r4 = r1
        L_0x01d2:
            r4.disconnect()
        L_0x01d5:
            if (r3 == 0) goto L_0x01df
            r3.close()     // Catch:{ IOException -> 0x01db }
            goto L_0x01df
        L_0x01db:
            r0 = move-exception
            com.whatsapp.util.Log.w(r7, r0)
        L_0x01df:
            r5.close()     // Catch:{ IOException -> 0x01e3 }
            throw r2
        L_0x01e3:
            r0 = move-exception
            com.whatsapp.util.Log.w(r6, r0)
            throw r2
        L_0x01e8:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: Could not open FileOutputStream "
            com.whatsapp.util.Log.w(r0, r1)
            r17 = 5
            r18 = -1
            X.5wX r13 = new X.5wX
            r16 = 1
            r13.<init>(r14, r15, r16, r17, r18)
            return r13
        L_0x01fa:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: Failed, could not create temp file:"
            com.whatsapp.util.Log.w(r0, r1)
            r16 = 1
            r17 = 5
            r18 = -1
            X.5wX r13 = new X.5wX
            r13.<init>(r14, r15, r16, r17, r18)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107205My.A08(java.lang.Object[]):java.lang.Object");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r14) {
        /*
            r13 = this;
            X.5wX r14 = (X.C123465wX) r14
            int r1 = r14.A02
            r0 = 2
            if (r1 != r0) goto L_0x003c
            java.io.File r0 = r14.A03
            long r2 = r0.length()
            int r1 = (int) r2
            byte[] r4 = new byte[r1]
            java.io.FileInputStream r3 = X.C90524aI.A0U(r0)     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0038 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002e }
            r2.<init>(r3)     // Catch:{ all -> 0x002e }
            r0 = 0
            r2.read(r4, r0, r1)     // Catch:{ all -> 0x0024 }
            r2.close()     // Catch:{ all -> 0x002e }
            r3.close()     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0038 }
            goto L_0x0061
        L_0x0024:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0029 }
            goto L_0x002d
        L_0x0029:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x002e }
        L_0x002d:
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0038 }
        L_0x0037:
            throw r1     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: IO Exception while reading the picture download file"
            goto L_0x005e
        L_0x003c:
            if (r1 != 0) goto L_0x006a
            int r1 = r13.A00
            r0 = 3
            if (r1 >= r0) goto L_0x006a
            X.0wG r4 = r13.A04
            X.0wt r8 = r13.A08
            X.0wU r9 = r13.A09
            X.0ww r2 = r13.A02
            X.0yd r7 = r13.A07
            X.1O7 r3 = r13.A03
            X.1O9 r6 = r13.A06
            X.5xp r5 = r13.A05
            int r10 = r1 + 1
            long r11 = r13.A01
            A01(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x005b:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: Could not find picture download file"
        L_0x005e:
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0061:
            X.5xp r1 = r13.A05
            r1.A00 = r4
            X.1O7 r0 = r13.A03
            r0.A03(r1)
        L_0x006a:
            X.1O9 r4 = r13.A06
            int r7 = r14.A01
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r13.A01
            java.lang.Long r6 = X.C90504aG.A0h(r2, r0)
            java.io.File r2 = r14.A03
            long r0 = r2.length()
            java.lang.Double r5 = X.C90524aI.A0Z(r0)
            int r9 = r14.A00
            r8 = 2
            r4.A00(r5, r6, r7, r8, r9)
            java.util.HashMap r1 = A0A
            monitor-enter(r1)
            X.5xp r0 = r13.A05     // Catch:{ all -> 0x0097 }
            X.11F r0 = r0.A03     // Catch:{ all -> 0x0097 }
            r1.remove(r0)     // Catch:{ all -> 0x0097 }
            monitor-exit(r1)     // Catch:{ all -> 0x0097 }
            r2.delete()
            return
        L_0x0097:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0097 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107205My.A0C(java.lang.Object):void");
    }

    public C107205My(C20050ww r1, AnonymousClass1O7 r2, C19630wG r3, C124245xp r4, AnonymousClass1O9 r5, C21080yd r6, C20020wt r7, C19770wU r8, int i, long j) {
        this.A04 = r3;
        this.A08 = r7;
        this.A09 = r8;
        this.A02 = r1;
        this.A07 = r6;
        this.A03 = r2;
        this.A06 = r5;
        this.A05 = r4;
        this.A00 = i;
        this.A01 = j;
    }

    public static File A00(Context context, C107205My r3) {
        File A0w = C36441kJ.A0w(context.getCacheDir(), "ProfilePictureTemp");
        A0w.mkdirs();
        return C36441kJ.A0w(A0w, URLUtil.guessFileName(r3.A05.A06.toString(), (String) null, (String) null));
    }
}
