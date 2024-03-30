package X;

import android.graphics.Bitmap;
import android.util.Base64;
import com.whatsapp.stickers.WebpUtils;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: X.1YP  reason: invalid class name */
public final class AnonymousClass1YP {
    public final C24041Av A00;
    public final C20050ww A01;
    public final C20840yF A02;
    public final WebpUtils A03;

    public AnonymousClass1YP(C24041Av r2, C20050ww r3, C20840yF r4, WebpUtils webpUtils) {
        AnonymousClass00C.A0D(webpUtils, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r4, 4);
        this.A03 = webpUtils;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public static final C135066c4 A00(File file, String str, String str2) {
        C135066c4 r3 = new C135066c4((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, 0, 0, 0, false, false, false, false, false, false);
        r3.A0H = str2;
        String str3 = str;
        r3.A0E = str3;
        r3.A0B = str3;
        r3.A0D = "image/webp";
        r3.A00 = (int) file.length();
        r3.A03 = 512;
        r3.A02 = 512;
        r3.A02(file.getAbsolutePath(), 1);
        return r3;
    }

    public final C135066c4 A01(Bitmap bitmap, String str) {
        AnonymousClass00C.A0D(str, 1);
        byte[] bytes = str.getBytes(AnonymousClass0S4.A05);
        AnonymousClass00C.A08(bytes);
        String valueOf = String.valueOf(C18750th.A04(Base64.encodeToString(bytes, 2)));
        File A04 = this.A00.A04(valueOf, "image/webp");
        if (!A04.exists()) {
            FileOutputStream fileOutputStream = new FileOutputStream(A04);
            bitmap.compress(Bitmap.CompressFormat.WEBP, 70, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        return A00(A04, valueOf, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C135066c4 A02(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            r3 = 0
            X.AnonymousClass00C.A0D(r10, r3)
            java.nio.charset.Charset r0 = X.AnonymousClass0S4.A05
            byte[] r1 = r10.getBytes(r0)
            X.AnonymousClass00C.A08(r1)
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            java.lang.String r0 = X.C18750th.A04(r0)
            java.lang.String r6 = java.lang.String.valueOf(r0)
            if (r11 == 0) goto L_0x0043
            X.0yF r4 = r9.A02
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r1 = 47
            r0 = 45
            java.lang.String r0 = r6.replace(r1, r0)
            r2.append(r0)
            java.lang.String r0 = ".webp"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.io.File r7 = r4.A00(r0)
        L_0x003b:
            boolean r0 = r7.exists()
            if (r0 != 0) goto L_0x00d1
            r8 = 0
            goto L_0x004c
        L_0x0043:
            X.1Av r1 = r9.A00
            java.lang.String r0 = "image/webp"
            java.io.File r7 = r1.A04(r6, r0)
            goto L_0x003b
        L_0x004c:
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00a6 }
            r1.<init>(r10)     // Catch:{ Exception -> 0x00a6 }
            r0 = 9
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Exception -> 0x00a6 }
            java.net.URLConnection r5 = r1.openConnection()     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.AnonymousClass00C.A0E(r5, r0)     // Catch:{ Exception -> 0x00a6 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x00a6 }
            r5.connect()     // Catch:{ Exception -> 0x00a3, all -> 0x00ad }
            X.0ww r2 = r9.A01     // Catch:{ Exception -> 0x00a3, all -> 0x00ad }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00a3, all -> 0x00ad }
            java.io.InputStream r0 = r5.getInputStream()     // Catch:{ Exception -> 0x00a3, all -> 0x00ad }
            X.5RE r4 = new X.5RE     // Catch:{ Exception -> 0x00a3, all -> 0x00ad }
            r4.<init>(r2, r0, r8, r1)     // Catch:{ Exception -> 0x00a3, all -> 0x00ad }
            java.lang.String r0 = ".webp"
            boolean r0 = X.AnonymousClass099.A0O(r10, r0, r3)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x007f
            X.AnonymousClass6YY.A0S(r7, r4)     // Catch:{ all -> 0x009c }
            goto L_0x0098
        L_0x007f:
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch:{ all -> 0x009c }
            X.AnonymousClass00C.A0B(r3)     // Catch:{ all -> 0x009c }
            r2 = 80
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x009c }
            r1.<init>(r7)     // Catch:{ all -> 0x009c }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch:{ all -> 0x009c }
            r3.compress(r0, r2, r1)     // Catch:{ all -> 0x009c }
            r1.flush()     // Catch:{ all -> 0x009c }
            r1.close()     // Catch:{ all -> 0x009c }
        L_0x0098:
            r4.close()     // Catch:{ Exception -> 0x00a3, all -> 0x00ad }
            goto L_0x00cb
        L_0x009c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ Exception -> 0x00a3, all -> 0x00ad }
            throw r0     // Catch:{ Exception -> 0x00a3, all -> 0x00ad }
        L_0x00a3:
            r0 = move-exception
            r8 = r5
            goto L_0x00a7
        L_0x00a6:
            r0 = move-exception
        L_0x00a7:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x00ab }
            goto L_0x00b8
        L_0x00ab:
            r0 = move-exception
            goto L_0x00af
        L_0x00ad:
            r0 = move-exception
            r8 = r5
        L_0x00af:
            if (r8 == 0) goto L_0x00b4
            r8.disconnect()
        L_0x00b4:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x00b8:
            if (r8 == 0) goto L_0x00bd
            r8.disconnect()
        L_0x00bd:
            android.net.TrafficStats.clearThreadStatsTag()
            java.lang.String r0 = "StickerMaker/createFromUrl/local file cannot be created"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
        L_0x00cb:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x00d1:
            X.6c4 r0 = A00(r7, r6, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YP.A02(java.lang.String, boolean):X.6c4");
    }

    public final void A03(C135066c4 r5) {
        byte[] bArr;
        String str = r5.A0A;
        byte[] bArr2 = null;
        if (str != null) {
            WebpUtils webpUtils = this.A03;
            File file = new File(str);
            AnonymousClass3S2 r0 = r5.A04;
            if (r0 != null) {
                bArr = r0.A02();
            } else {
                bArr = null;
            }
            webpUtils.A02(file, bArr);
        }
        String str2 = r5.A0E;
        if (str2 != null) {
            File A04 = this.A00.A04(str2, r5.A0D);
            WebpUtils webpUtils2 = this.A03;
            AnonymousClass3S2 r02 = r5.A04;
            if (r02 != null) {
                bArr2 = r02.A02();
            }
            webpUtils2.A02(A04, bArr2);
        }
    }
}
