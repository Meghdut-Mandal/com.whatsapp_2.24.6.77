package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1QC  reason: invalid class name */
public class AnonymousClass1QC {
    public final C20690y0 A00;
    public final AnonymousClass179 A01;
    public final C21060yb A02;
    public final C19630wG A03;
    public final C20830yE A04;
    public final C19420v0 A05;
    public final AnonymousClass1QE A06;
    public final AnonymousClass1QG A07;
    public final C24341Cb A08;
    public final C20060wx A09;

    public static Uri A00(String str, String str2, String str3) {
        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.whatsapp.provider.MigrationContentProvider").appendPath("media");
        if (str != null) {
            appendPath.appendQueryParameter("query_param_country_code", str);
        }
        if (str2 != null) {
            appendPath.appendQueryParameter("query_param_phone_number", str2);
        }
        if (str3 != null) {
            appendPath.appendQueryParameter("path", str3);
        }
        return appendPath.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        if (r4.A0h().equals(((android.content.SharedPreferences) r6.get()).getString("registration_sibling_app_phone_number", (java.lang.String) null)) == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r20 = this;
            java.lang.String r0 = "MediaMigrationUtil/moveMediaIfNeeded/moveMediaFromSisterApp"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = r20
            X.0v0 r4 = r3.A05
            java.lang.String r2 = r4.A0f()
            X.005 r6 = r4.A00
            java.lang.Object r1 = r6.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "registration_sibling_app_country_code"
            r5 = 0
            java.lang.String r0 = r1.getString(r0, r5)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = r4.A0h()
            java.lang.Object r1 = r6.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "registration_sibling_app_phone_number"
            java.lang.String r0 = r1.getString(r0, r5)
            boolean r0 = r2.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaMigrationUtil/shouldMoveAllMediaFromOtherApp/samePhoneNumberAsOtherApp= "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 != 0) goto L_0x0061
            X.1QE r1 = r3.A06
            r0 = 3
            X.1QF r1 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/did-not-move-phone-number-not-matched"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0061:
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/moving media from sister app"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0y0 r0 = r3.A00
            r0.A0d()
            java.lang.String r5 = "Media"
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = "WhatsApp Business"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r5)
            X.179 r0 = r3.A01
            r19 = r0
            java.io.File r9 = r19.A04()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/moving from= "
            r1.append(r0)
            java.lang.String r0 = r2.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = " and to= "
            r1.append(r0)
            java.lang.String r0 = r9.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yE r7 = r3.A04
            boolean r0 = r7.A0D()
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/destination-permission-not-granted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1QE r1 = r3.A06
            r0 = 6
        L_0x00b9:
            X.1QF r1 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
            return
        L_0x00c2:
            X.0wG r0 = r3.A03
            android.content.Context r8 = r0.A00
            java.lang.String[] r6 = X.AnonymousClass3TA.A04()
            int r5 = r6.length
            r1 = 0
        L_0x00cc:
            if (r1 >= r5) goto L_0x00e2
            r0 = r6[r1]
            boolean r0 = X.C20830yE.A01(r8, r0)
            if (r0 != 0) goto L_0x00df
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/origin-permission-not-granted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1QE r1 = r3.A06
            r0 = 5
            goto L_0x00b9
        L_0x00df:
            int r1 = r1 + 1
            goto L_0x00cc
        L_0x00e2:
            boolean r0 = A01(r9)
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/destination-folder-not-empty-did-not-move"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1QE r1 = r3.A06
            r0 = 2
            goto L_0x00b9
        L_0x00f1:
            boolean r0 = X.AnonymousClass179.A01()
            if (r0 != 0) goto L_0x0106
            boolean r0 = A01(r2)
            if (r0 == 0) goto L_0x0106
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/origin-folder-is-empty-nothing-to-move"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1QE r1 = r3.A06
            r0 = 4
            goto L_0x00b9
        L_0x0106:
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/all-conditions-are-met"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            X.AnonymousClass6YY.A0H(r9, r0)
            java.io.File r0 = r19.A04()
            r0.mkdir()
            boolean r0 = X.AnonymousClass179.A01()
            if (r0 != 0) goto L_0x0131
            boolean r0 = r7.A0D()
            if (r0 == 0) goto L_0x0131
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0131
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0131
            r2.listFiles()
        L_0x0131:
            java.lang.String r1 = r4.A0f()
            java.lang.String r0 = r4.A0h()
            r5 = 0
            android.net.Uri r7 = A00(r1, r0, r5)
            r2 = 0
            X.0yb r0 = r3.A02     // Catch:{ Exception -> 0x0291 }
            r18 = r0
            X.0ya r6 = r18.A0O()     // Catch:{ Exception -> 0x0291 }
            r9 = r5
            r10 = r5
            r11 = r5
            r8 = r5
            android.database.Cursor r7 = r6.A03(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0291 }
            if (r7 == 0) goto L_0x0295
            int r9 = r7.getCount()     // Catch:{ all -> 0x0287 }
            if (r9 != 0) goto L_0x015e
            java.lang.String r0 = "MediaMigrationUtil/moveMediaWithContentProvider/origin-folder-is-empty-nothing-to-move"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0287 }
            goto L_0x0283
        L_0x015e:
            X.1QG r10 = r3.A07     // Catch:{ all -> 0x0287 }
            X.17Y r8 = r10.A03     // Catch:{ all -> 0x0287 }
            java.lang.Runnable r6 = r10.A02     // Catch:{ all -> 0x0287 }
            r0 = 500(0x1f4, double:2.47E-321)
            r8.A0I(r6, r0)     // Catch:{ all -> 0x0287 }
            r12 = 0
            r11 = 0
        L_0x016b:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x0272
            java.lang.String r13 = r7.getString(r2)     // Catch:{ all -> 0x0287 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0287 }
            r1.<init>()     // Catch:{ all -> 0x0287 }
            java.lang.String r0 = "MediaMigrationUtil/moveMediaWithContentProvider/file = "
            r1.append(r0)     // Catch:{ all -> 0x0287 }
            r1.append(r13)     // Catch:{ all -> 0x0287 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0287 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0287 }
            java.io.File r0 = r19.A04()     // Catch:{ all -> 0x0287 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0287 }
            r1.<init>(r0, r13)     // Catch:{ all -> 0x0287 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0287 }
            r17 = 0
            if (r0 == 0) goto L_0x01bd
            boolean r0 = r1.delete()     // Catch:{ all -> 0x0287 }
            if (r0 != 0) goto L_0x01bd
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0287 }
            r14.<init>()     // Catch:{ all -> 0x0287 }
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFile/file = "
            r14.append(r0)     // Catch:{ all -> 0x0287 }
            r14.append(r1)     // Catch:{ all -> 0x0287 }
            java.lang.String r0 = " already exists"
            r14.append(r0)     // Catch:{ all -> 0x0287 }
        L_0x01b2:
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x0287 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0287 }
            if (r17 != 0) goto L_0x026a
            goto L_0x0254
        L_0x01bd:
            X.0ya r15 = r18.A0O()     // Catch:{ IOException | SecurityException -> 0x0229 }
            java.lang.String r14 = r4.A0f()     // Catch:{ IOException | SecurityException -> 0x0229 }
            java.lang.String r0 = r4.A0h()     // Catch:{ IOException | SecurityException -> 0x0229 }
            android.net.Uri r14 = A00(r14, r0, r13)     // Catch:{ IOException | SecurityException -> 0x0229 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r16 = r15.A05(r14, r0)     // Catch:{ IOException | SecurityException -> 0x0229 }
            if (r16 == 0) goto L_0x0254
            java.io.FileDescriptor r0 = r16.getFileDescriptor()     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x021b
            java.io.File r0 = r1.getParentFile()     // Catch:{ all -> 0x021f }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x021f }
            r0.mkdirs()     // Catch:{ all -> 0x021f }
            java.io.FileOutputStream r14 = new java.io.FileOutputStream     // Catch:{ all -> 0x021f }
            r14.<init>(r1)     // Catch:{ all -> 0x021f }
            java.io.FileDescriptor r0 = r16.getFileDescriptor()     // Catch:{ all -> 0x0211 }
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch:{ all -> 0x0211 }
            r15.<init>(r0)     // Catch:{ all -> 0x0211 }
            java.nio.channels.FileChannel r1 = r15.getChannel()     // Catch:{ all -> 0x0207 }
            java.nio.channels.WritableByteChannel r0 = java.nio.channels.Channels.newChannel(r14)     // Catch:{ all -> 0x0207 }
            X.AnonymousClass6YY.A0K(r1, r0)     // Catch:{ all -> 0x0207 }
            r15.close()     // Catch:{ all -> 0x0211 }
            r14.close()     // Catch:{ all -> 0x021f }
            r17 = 1
            goto L_0x021b
        L_0x0207:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x020c }
            goto L_0x0210
        L_0x020c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0211 }
        L_0x0210:
            throw r1     // Catch:{ all -> 0x0211 }
        L_0x0211:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0216 }
            goto L_0x021a
        L_0x0216:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x021f }
        L_0x021a:
            throw r1     // Catch:{ all -> 0x021f }
        L_0x021b:
            r16.close()     // Catch:{ IOException | SecurityException -> 0x0229 }
            goto L_0x022d
        L_0x021f:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0224 }
            goto L_0x0228
        L_0x0224:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException | SecurityException -> 0x0229 }
        L_0x0228:
            throw r1     // Catch:{ IOException | SecurityException -> 0x0229 }
        L_0x0229:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0287 }
        L_0x022d:
            if (r17 == 0) goto L_0x0254
            X.0ya r14 = r18.A0O()     // Catch:{ all -> 0x0287 }
            java.lang.String r1 = r4.A0f()     // Catch:{ all -> 0x0287 }
            java.lang.String r0 = r4.A0h()     // Catch:{ all -> 0x0287 }
            android.net.Uri r0 = A00(r1, r0, r13)     // Catch:{ all -> 0x0287 }
            int r0 = r14.A01(r0, r5, r5)     // Catch:{ all -> 0x0287 }
            if (r0 > 0) goto L_0x026a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0287 }
            r14.<init>()     // Catch:{ all -> 0x0287 }
            java.lang.String r0 = "MediaMigrationUtil/deleteMediaFile/Could not delete "
            r14.append(r0)     // Catch:{ all -> 0x0287 }
            r14.append(r13)     // Catch:{ all -> 0x0287 }
            goto L_0x01b2
        L_0x0254:
            int r12 = r12 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0287 }
            r1.<init>()     // Catch:{ all -> 0x0287 }
            java.lang.String r0 = "MediaMigrationUtil/moveMediaWithContentProvider/Failed to move file = "
            r1.append(r0)     // Catch:{ all -> 0x0287 }
            r1.append(r13)     // Catch:{ all -> 0x0287 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0287 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0287 }
        L_0x026a:
            int r11 = r11 + 1
            r10.A00 = r11     // Catch:{ all -> 0x0287 }
            r10.A01 = r9     // Catch:{ all -> 0x0287 }
            goto L_0x016b
        L_0x0272:
            float r1 = (float) r12     // Catch:{ all -> 0x0287 }
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            float r0 = (float) r9     // Catch:{ all -> 0x0287 }
            float r1 = r1 / r0
            double r4 = (double) r1     // Catch:{ all -> 0x0287 }
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0283
            r7.close()     // Catch:{ Exception -> 0x0291 }
            goto L_0x02a0
        L_0x0283:
            r7.close()     // Catch:{ Exception -> 0x0291 }
            goto L_0x0295
        L_0x0287:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x028c }
            goto L_0x0290
        L_0x028c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0291 }
        L_0x0290:
            throw r1     // Catch:{ Exception -> 0x0291 }
        L_0x0291:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x02be }
        L_0x0295:
            X.1QG r0 = r3.A07
            X.17Y r1 = r0.A03
            java.lang.Runnable r0 = r0.A02
            r1.A0G(r0)
            r2 = 0
            goto L_0x02a4
        L_0x02a0:
            r8.A0G(r6)
            r2 = 1
        L_0x02a4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaMigrationUtil/moveMediaFolderFromSisterApp/successfully-renamed = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1QE r1 = r3.A06
            r0 = r2 ^ 1
            goto L_0x00b9
        L_0x02be:
            r2 = move-exception
            X.1QG r0 = r3.A07
            X.17Y r1 = r0.A03
            java.lang.Runnable r0 = r0.A02
            r1.A0G(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QC.A02():void");
    }

    public AnonymousClass1QC(C20690y0 r1, AnonymousClass179 r2, C24341Cb r3, C21060yb r4, C19630wG r5, C20830yE r6, C19420v0 r7, C20060wx r8, AnonymousClass1QE r9, AnonymousClass1QG r10) {
        this.A03 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A09 = r8;
        this.A02 = r4;
        this.A08 = r3;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r9;
        this.A07 = r10;
    }

    public static boolean A01(File file) {
        StringBuilder sb;
        String str;
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MediaMigrationUtil/mediaFolderIsEmpty/no-files-in-folder: ");
            sb2.append(file);
            Log.i(sb2.toString());
        } else {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory() && !A01(file2)) {
                    sb = new StringBuilder();
                    str = "MediaMigrationUtil/mediaFolderIsEmpty/is-directory-and-contain-media-file-name: ";
                } else if (file2.isDirectory() || ".nomedia".equals(file2.getName())) {
                    i++;
                } else {
                    sb = new StringBuilder();
                    str = "MediaMigrationUtil/mediaFolderIsEmpty/is-file-and-is-media-file-file-name: ";
                }
                sb.append(str);
                sb.append(file2);
                Log.i(sb.toString());
                return false;
            }
        }
        return true;
    }
}
