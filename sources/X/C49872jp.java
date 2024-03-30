package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: X.2jp  reason: invalid class name and case insensitive filesystem */
public class C49872jp extends C132446Tt {
    public final Context A00;
    public final Uri A01;
    public final C64383Nt A02;
    public final C61853Dr A03;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:61|62) */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("DownloadableWallpaperStorage/storeFullResolutionWallpaper : rename failed, from ");
        r1.append(r5);
        X.C36321k7.A1J(r3, " to ", r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0163 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r19) {
        /*
            r18 = this;
            r8 = r18
            android.net.Uri r0 = r8.A01
            java.lang.String r0 = r0.getPath()
            X.C18740tg.A06(r0)
            java.io.File r6 = new java.io.File
            r6.<init>(r0)
            X.3Nt r5 = r8.A02
            android.content.Context r7 = r8.A00
            android.graphics.Bitmap r4 = X.C64383Nt.A00(r7, r6)
            r3 = 0
            if (r4 == 0) goto L_0x0028
            r2 = 1
            X.35Y[] r1 = new X.AnonymousClass35Y[r2]
            X.35Y r0 = new X.35Y
            r0.<init>(r2, r4)
            r1[r3] = r0
            r8.A0F(r1)
        L_0x0028:
            java.lang.String r1 = r6.getName()
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r1.split(r0)
            r8 = r0[r3]
            X.3Qb r6 = r5.A02
            java.io.File r0 = r6.A02(r8)
            if (r0 == 0) goto L_0x004a
            android.graphics.Bitmap r1 = X.C64383Nt.A00(r7, r0)
            X.C18740tg.A06(r1)
            r0 = 2
            X.35Y r3 = new X.35Y
            r3.<init>(r0, r1)
            return r3
        L_0x004a:
            X.0wD r0 = r5.A01
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x005e
            r1 = 3
            r0 = 1
            X.C18740tg.A0B(r0)
            r0 = 0
            X.35Y r3 = new X.35Y
            r3.<init>(r1, r0)
            return r3
        L_0x005e:
            X.3Nu r3 = r5.A03     // Catch:{ IOException -> 0x01aa }
            X.0wG r0 = r3.A00     // Catch:{ IOException -> 0x01aa }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x01aa }
            float r1 = X.C36341k9.A00(r0)     // Catch:{ IOException -> 0x01aa }
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00a1
            java.lang.String r2 = "xxhdpi"
        L_0x0070:
            java.util.HashMap r4 = X.AnonymousClass001.A0J()     // Catch:{ IOException -> 0x01aa }
            java.lang.String r1 = "category"
            java.lang.String r0 = "wallpaper"
            r4.put(r1, r0)     // Catch:{ IOException -> 0x01aa }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r8)     // Catch:{ IOException -> 0x01aa }
            java.lang.String r0 = "_"
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ IOException -> 0x01aa }
            java.lang.String r0 = "id"
            r4.put(r0, r1)     // Catch:{ IOException -> 0x01aa }
            X.0yC r2 = r3.A01     // Catch:{ IOException -> 0x01aa }
            X.1Be r1 = r3.A03     // Catch:{ IOException -> 0x01aa }
            java.lang.String r0 = "wa/static/downloadable"
            android.net.Uri$Builder r0 = X.AnonymousClass6XA.A00(r2, r1, r0)     // Catch:{ IOException -> 0x01aa }
            java.lang.String r1 = X.AnonymousClass6XA.A03(r0, r4)     // Catch:{ IOException -> 0x01aa }
            X.13E r0 = r3.A02     // Catch:{ IOException -> 0x01aa }
            X.6v1 r2 = X.C64393Nu.A00(r0, r3, r1)     // Catch:{ IOException -> 0x01aa }
            if (r2 != 0) goto L_0x00b1
            goto L_0x00a4
        L_0x00a1:
            java.lang.String r2 = "hdpi"
            goto L_0x0070
        L_0x00a4:
            r1 = 4
            r0 = 1
            X.C18740tg.A0B(r0)     // Catch:{ all -> 0x019e }
            r0 = 0
            X.35Y r3 = new X.35Y     // Catch:{ all -> 0x019e }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x019e }
            goto L_0x01b5
        L_0x00b1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r8)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = ".jpg"
            java.lang.String r9 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x019e }
            r13 = 0
            X.0ww r3 = r6.A00     // Catch:{ IOException -> 0x0189 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x0189 }
            java.lang.Integer r0 = X.C36431kI.A13()     // Catch:{ IOException -> 0x0189 }
            X.5RE r0 = r2.B8D(r3, r1, r0)     // Catch:{ IOException -> 0x0189 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0189 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0189 }
            X.0wG r12 = r6.A01     // Catch:{ all -> 0x017f }
            android.content.Context r0 = r12.A00     // Catch:{ all -> 0x017f }
            java.io.File r1 = r0.getCacheDir()     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "downloadable/wallpaper_tmp"
            java.io.File r1 = X.C36441kJ.A0w(r1, r0)     // Catch:{ all -> 0x017f }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x017f }
            if (r0 != 0) goto L_0x00f0
            boolean r0 = X.AnonymousClass6YY.A0R(r1)     // Catch:{ all -> 0x017f }
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Could not prepare temporary cache subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x017f }
            goto L_0x017b
        L_0x00f0:
            r16 = 0
            java.io.File r5 = X.C36441kJ.A0w(r1, r9)     // Catch:{ all -> 0x017f }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x017f }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0175 }
            r10.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0175 }
        L_0x00ff:
            r14 = 8192(0x2000, double:4.0474E-320)
            long r14 = r14 + r16
            r0 = 2097152(0x200000, double:1.0361308E-317)
            int r3 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0122
            int r1 = r4.read(r11)     // Catch:{ all -> 0x0118 }
            r0 = -1
            if (r1 == r0) goto L_0x0122
            r10.write(r11, r13, r1)     // Catch:{ all -> 0x0118 }
            long r0 = (long) r1     // Catch:{ all -> 0x0118 }
            long r16 = r16 + r0
            goto L_0x00ff
        L_0x0118:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x011d }
            goto L_0x0121
        L_0x011d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x0175 }
        L_0x0121:
            throw r1     // Catch:{ FileNotFoundException -> 0x0175 }
        L_0x0122:
            r10.close()     // Catch:{ FileNotFoundException -> 0x0175 }
            if (r3 <= 0) goto L_0x012d
            java.lang.String r0 = "DownloadableWallpaperStorage: File being saved is too large."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x017f }
            goto L_0x017b
        L_0x012d:
            android.content.Context r0 = r12.A00     // Catch:{ all -> 0x017f }
            java.io.File r1 = r0.getFilesDir()     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "downloadable/wallpaper"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)     // Catch:{ all -> 0x017f }
            java.io.File r3 = X.C36441kJ.A0w(r0, r9)     // Catch:{ all -> 0x017f }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x017f }
            if (r0 == 0) goto L_0x0146
            r3.delete()     // Catch:{ all -> 0x017f }
        L_0x0146:
            X.1Aw r0 = r6.A02     // Catch:{ IOException -> 0x0163 }
            X.AnonymousClass6YY.A0C(r0, r5, r3)     // Catch:{ IOException -> 0x0163 }
            r4.close()     // Catch:{ IOException -> 0x0189 }
            java.io.File r0 = r6.A02(r8)     // Catch:{ all -> 0x019e }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x019e }
            android.graphics.Bitmap r1 = X.C64383Nt.A00(r7, r0)     // Catch:{ all -> 0x019e }
            X.C18740tg.A06(r1)     // Catch:{ all -> 0x019e }
            r0 = 2
            X.35Y r3 = new X.35Y     // Catch:{ all -> 0x019e }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x019e }
            goto L_0x019a
        L_0x0163:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x017f }
            java.lang.String r0 = "DownloadableWallpaperStorage/storeFullResolutionWallpaper : rename failed, from "
            r1.append(r0)     // Catch:{ all -> 0x017f }
            r1.append(r5)     // Catch:{ all -> 0x017f }
            java.lang.String r0 = " to "
            X.C36321k7.A1J(r3, r0, r1)     // Catch:{ all -> 0x017f }
            goto L_0x017b
        L_0x0175:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperStorage/storeFullResolutionWallpaper/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x017f }
        L_0x017b:
            r4.close()     // Catch:{ IOException -> 0x0189 }
            goto L_0x018f
        L_0x017f:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0184 }
            goto L_0x0188
        L_0x0184:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0189 }
        L_0x0188:
            throw r1     // Catch:{ IOException -> 0x0189 }
        L_0x0189:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperStorage/storeFullResolutionWallpaper/Failed!"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x019e }
        L_0x018f:
            r1 = 5
            r0 = 1
            X.C18740tg.A0B(r0)     // Catch:{ all -> 0x019e }
            r0 = 0
            X.35Y r3 = new X.35Y     // Catch:{ all -> 0x019e }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x019e }
        L_0x019a:
            r2.close()     // Catch:{ IOException -> 0x01aa }
            goto L_0x01b5
        L_0x019e:
            r1 = move-exception
            if (r2 == 0) goto L_0x01a9
            r2.close()     // Catch:{ all -> 0x01a5 }
            goto L_0x01a9
        L_0x01a5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x01aa }
        L_0x01a9:
            throw r1     // Catch:{ IOException -> 0x01aa }
        L_0x01aa:
            r1 = 4
            r0 = 1
            X.C18740tg.A0B(r0)     // Catch:{ all -> 0x01b9 }
            r0 = 0
            X.35Y r3 = new X.35Y     // Catch:{ all -> 0x01b9 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x01b9 }
        L_0x01b5:
            android.net.TrafficStats.clearThreadStatsTag()
            return r3
        L_0x01b9:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49872jp.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass35Y r2 = (AnonymousClass35Y) obj;
        if (!C36431kI.A1Y(this)) {
            this.A03.A00(r2);
            return;
        }
        Bitmap bitmap = r2.A01;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public /* bridge */ /* synthetic */ void A0E(Object[] objArr) {
        this.A03.A00(((AnonymousClass35Y[]) objArr)[0]);
    }

    public C49872jp(Context context, Uri uri, C64383Nt r3, C61853Dr r4) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = uri;
        this.A03 = r4;
    }
}
