package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Yt  reason: invalid class name and case insensitive filesystem */
public class C29981Yt {
    public AnonymousClass777 A00;
    public final C20690y0 A01;
    public final C20050ww A02;
    public final C19420v0 A03;
    public final AnonymousClass13E A04;
    public final C21080yd A05;
    public final C24651Dg A06;
    public final AtomicBoolean A07 = new AtomicBoolean(false);

    /* JADX WARNING: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016f  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:54:0x0126=Splitter:B:54:0x0126, B:49:0x011c=Splitter:B:49:0x011c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A00() {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicBoolean r4 = r15.A07
            r3 = 0
            r0 = 1
            boolean r0 = r4.compareAndSet(r3, r0)
            if (r0 == 0) goto L_0x0178
            X.777 r0 = new X.777
            r0.<init>()
            r15.A00 = r0
            java.lang.String r6 = "PaymentBackgroundBatchFetcher: "
            r0 = 18
            android.net.TrafficStats.setThreadStatsTag(r0)
            java.lang.String r2 = ""
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0059
            r5 = 0
        L_0x0021:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = "/payments/background"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x003d:
            r2.append(r0)
            java.lang.String r0 = "/all.zip"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r5 = r0.toString()
            goto L_0x0070
        L_0x0056:
            java.lang.String r0 = "https://static.whatsapp.net/payments/background"
            goto L_0x003d
        L_0x0059:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "https://www."
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ".facebook.com/cdn/cacheable/whatsapp"
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            goto L_0x0021
        L_0x0070:
            X.13E r7 = r15.A04     // Catch:{ Exception -> 0x013e }
            X.0yd r2 = r15.A05     // Catch:{ Exception -> 0x013e }
            X.0v0 r10 = r15.A03     // Catch:{ Exception -> 0x013e }
            X.005 r0 = r10.A00     // Catch:{ Exception -> 0x013e }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x013e }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ Exception -> 0x013e }
            java.lang.String r9 = "payment_background_batch_etag"
            r0 = 0
            java.lang.String r0 = r1.getString(r9, r0)     // Catch:{ Exception -> 0x013e }
            X.6v1 r2 = r7.A02(r2, r5, r0)     // Catch:{ Exception -> 0x013e }
            java.net.HttpURLConnection r12 = r2.A01     // Catch:{ all -> 0x0134 }
            int r1 = r12.getResponseCode()     // Catch:{ all -> 0x0134 }
            r0 = 304(0x130, float:4.26E-43)
            java.lang.String r13 = "payment_backgrounds_batch_last_fetch_timestamp"
            if (r1 != r0) goto L_0x009e
            r10.A1Z(r13)     // Catch:{ all -> 0x0134 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x0134 }
            r7.<init>()     // Catch:{ all -> 0x0134 }
            goto L_0x011c
        L_0x009e:
            int r1 = r12.getResponseCode()     // Catch:{ all -> 0x0134 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00aa
            r12.getResponseCode()     // Catch:{ all -> 0x0134 }
            goto L_0x0126
        L_0x00aa:
            X.0ww r7 = r15.A02     // Catch:{ all -> 0x0134 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0134 }
            r0 = 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0134 }
            X.5RE r0 = r2.B8D(r7, r1, r0)     // Catch:{ all -> 0x0134 }
            byte[] r0 = X.AnonymousClass14X.A04(r0)     // Catch:{ all -> 0x0134 }
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0134 }
            r8.<init>(r0)     // Catch:{ all -> 0x0134 }
            java.lang.String r11 = "PAY: PaymentBackgroundBatchFetcher/unzipBatchBackgrounds"
            java.util.zip.ZipInputStream r14 = new java.util.zip.ZipInputStream     // Catch:{ FileNotFoundException | IOException -> 0x00ed }
            r14.<init>(r8)     // Catch:{ FileNotFoundException | IOException -> 0x00ed }
            X.0y0 r0 = r15.A01     // Catch:{ all -> 0x00e3 }
            java.io.File r1 = r0.A0F()     // Catch:{ all -> 0x00e3 }
            X.2TD r0 = new X.2TD     // Catch:{ all -> 0x00e3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e3 }
            r0.A01(r14)     // Catch:{ all -> 0x00e3 }
            java.util.Set r0 = r0.A01     // Catch:{ all -> 0x00e3 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x00e3 }
            r7.<init>(r0)     // Catch:{ all -> 0x00e3 }
            r14.close()     // Catch:{ FileNotFoundException | IOException -> 0x00ed }
            goto L_0x00f2
        L_0x00e3:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x00e8 }
            goto L_0x00ec
        L_0x00e8:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException | IOException -> 0x00ed }
        L_0x00ec:
            throw r1     // Catch:{ FileNotFoundException | IOException -> 0x00ed }
        L_0x00ed:
            r0 = move-exception
            com.whatsapp.util.Log.e(r11, r0)     // Catch:{ all -> 0x012a }
            r7 = 0
        L_0x00f2:
            if (r7 == 0) goto L_0x0123
            r10.A1Z(r13)     // Catch:{ all -> 0x012a }
            java.lang.String r0 = "etag"
            java.lang.String r1 = r12.getHeaderField(r0)     // Catch:{ all -> 0x012a }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x012a }
            if (r0 != 0) goto L_0x0119
            if (r1 != 0) goto L_0x010e
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r10)     // Catch:{ all -> 0x012a }
            android.content.SharedPreferences$Editor r0 = r0.remove(r9)     // Catch:{ all -> 0x012a }
            goto L_0x0116
        L_0x010e:
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r10)     // Catch:{ all -> 0x012a }
            android.content.SharedPreferences$Editor r0 = r0.putString(r9, r1)     // Catch:{ all -> 0x012a }
        L_0x0116:
            r0.apply()     // Catch:{ all -> 0x012a }
        L_0x0119:
            r8.close()     // Catch:{ all -> 0x0134 }
        L_0x011c:
            r2.close()     // Catch:{ Exception -> 0x013e }
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x015d
        L_0x0123:
            r8.close()     // Catch:{ all -> 0x0134 }
        L_0x0126:
            r2.close()     // Catch:{ Exception -> 0x013e }
            goto L_0x0159
        L_0x012a:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x012f }
            goto L_0x0133
        L_0x012f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0134 }
        L_0x0133:
            throw r1     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0139 }
            goto L_0x013d
        L_0x0139:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x013e }
        L_0x013d:
            throw r1     // Catch:{ Exception -> 0x013e }
        L_0x013e:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0173 }
            r1.<init>()     // Catch:{ all -> 0x0173 }
            r1.append(r6)     // Catch:{ all -> 0x0173 }
            r1.append(r5)     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = " Exception: "
            r1.append(r0)     // Catch:{ all -> 0x0173 }
            r1.append(r2)     // Catch:{ all -> 0x0173 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0173 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0173 }
        L_0x0159:
            android.net.TrafficStats.clearThreadStatsTag()
            r7 = 0
        L_0x015d:
            X.777 r2 = r15.A00
            if (r7 != 0) goto L_0x016f
            java.lang.String r1 = "PAY: PaymentBackgroundBatchFetcher/batch background download failed"
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            r2.BVM(r0)
        L_0x016b:
            r4.set(r3)
            return r7
        L_0x016f:
            r2.BVO(r7)
            goto L_0x016b
        L_0x0173:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0178:
            r1 = 0
            X.777 r0 = r15.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0184 }
            if (r0 == 0) goto L_0x0184
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0184 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ InterruptedException | ExecutionException -> 0x0184 }
            return r0
        L_0x0184:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29981Yt.A00():java.util.Set");
    }

    public C29981Yt(C20690y0 r3, C20050ww r4, C19420v0 r5, AnonymousClass13E r6, C24651Dg r7, C21080yd r8) {
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = r8;
        this.A04 = r6;
        this.A03 = r5;
        this.A06 = r7;
    }
}
