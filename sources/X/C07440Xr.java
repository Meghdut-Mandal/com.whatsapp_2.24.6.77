package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Xr  reason: invalid class name and case insensitive filesystem */
public abstract class C07440Xr {
    public static final C002000v A00 = new C002000v(16);
    public static final AnonymousClass007 A01 = new AnonymousClass007(0);
    public static final Object A02 = new Object();
    public static final ExecutorService A03;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) SearchActionVerificationClientService.NOTIFICATION_ID, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C12530iF());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        A03 = threadPoolExecutor;
    }

    public static Cursor A00(ContentResolver contentResolver, Uri uri, String[] strArr, String[] strArr2) {
        return contentResolver.query(uri, strArr, "query = ?", strArr2, (String) null, (CancellationSignal) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        r2 = r7.authority;
        r7 = X.AnonymousClass001.A0I();
        r12 = new android.net.Uri.Builder().scheme("content").authority(r2).build();
        r16 = new android.net.Uri.Builder().scheme("content").authority(r2).appendPath("file").build();
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r6 = A00(r26.getContentResolver(), r12, new java.lang.String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new java.lang.String[]{r13.A03});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f2, code lost:
        if (r6 == null) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f8, code lost:
        if (r6.getCount() <= 0) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fa, code lost:
        r10 = r6.getColumnIndex("result_code");
        r7 = X.AnonymousClass001.A0I();
        r15 = r6.getColumnIndex("_id");
        r5 = r6.getColumnIndex("file_id");
        r4 = r6.getColumnIndex("font_ttc_index");
        r3 = r6.getColumnIndex("font_weight");
        r2 = r6.getColumnIndex("font_italic");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x011a, code lost:
        if (r6.moveToNext() == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011d, code lost:
        if (r10 == -1) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011f, code lost:
        r22 = r6.getInt(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0124, code lost:
        r22 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0126, code lost:
        if (r4 == -1) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0128, code lost:
        r20 = r6.getInt(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012d, code lost:
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012f, code lost:
        if (r5 != -1) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0131, code lost:
        r19 = android.content.ContentUris.withAppendedId(r12, r6.getLong(r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013a, code lost:
        r19 = android.content.ContentUris.withAppendedId(r16, r6.getLong(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0144, code lost:
        if (r3 == -1) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0146, code lost:
        r21 = r6.getInt(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014b, code lost:
        r21 = 400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014d, code lost:
        if (r2 == -1) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014f, code lost:
        r23 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0155, code lost:
        if (r6.getInt(r2) == 1) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0157, code lost:
        r23 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0159, code lost:
        r7.add(new X.AnonymousClass0TI(r19, r20, r21, r22, r23));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0167, code lost:
        r2 = new X.AnonymousClass0SZ((X.AnonymousClass0TI[]) r7.toArray(new X.AnonymousClass0TI[0]), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0175, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0176, code lost:
        if (r6 != null) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r6.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0WP A01(android.content.Context r26, X.AnonymousClass0U3 r27, java.lang.String r28, int r29) {
        /*
            X.00v r17 = A00
            r25 = r28
            r1 = r25
            r0 = r17
            java.lang.Object r2 = r0.A04(r1)
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2
            if (r2 != 0) goto L_0x01ca
            r14 = 0
            android.content.pm.PackageManager r4 = r26.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01ab }
            r26.getResources()     // Catch:{ NameNotFoundException -> 0x01ab }
            r13 = r27
            java.lang.String r3 = r13.A01     // Catch:{ NameNotFoundException -> 0x01ab }
            r8 = 0
            android.content.pm.ProviderInfo r7 = r4.resolveContentProvider(r3, r8)     // Catch:{ NameNotFoundException -> 0x01ab }
            if (r7 == 0) goto L_0x0183
            java.lang.String r1 = r7.packageName     // Catch:{ NameNotFoundException -> 0x01ab }
            java.lang.String r2 = r13.A02     // Catch:{ NameNotFoundException -> 0x01ab }
            boolean r0 = r1.equals(r2)     // Catch:{ NameNotFoundException -> 0x01ab }
            if (r0 == 0) goto L_0x0193
            r0 = 64
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x01ab }
            android.content.pm.Signature[] r3 = r0.signatures     // Catch:{ NameNotFoundException -> 0x01ab }
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()     // Catch:{ NameNotFoundException -> 0x01ab }
            int r2 = r3.length     // Catch:{ NameNotFoundException -> 0x01ab }
            r1 = 0
        L_0x003b:
            if (r1 >= r2) goto L_0x0049
            r0 = r3[r1]     // Catch:{ NameNotFoundException -> 0x01ab }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x01ab }
            r6.add(r0)     // Catch:{ NameNotFoundException -> 0x01ab }
            int r1 = r1 + 1
            goto L_0x003b
        L_0x0049:
            java.util.Comparator r5 = X.AnonymousClass0RG.A00     // Catch:{ NameNotFoundException -> 0x01ab }
            java.util.Collections.sort(r6, r5)     // Catch:{ NameNotFoundException -> 0x01ab }
            java.util.List r4 = r13.A04     // Catch:{ NameNotFoundException -> 0x01ab }
            if (r4 != 0) goto L_0x0056
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ NameNotFoundException -> 0x01ab }
        L_0x0056:
            int r0 = r4.size()     // Catch:{ NameNotFoundException -> 0x01ab }
            if (r8 >= r0) goto L_0x017c
            java.lang.Object r0 = r4.get(r8)     // Catch:{ NameNotFoundException -> 0x01ab }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ NameNotFoundException -> 0x01ab }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x01ab }
            r3.<init>(r0)     // Catch:{ NameNotFoundException -> 0x01ab }
            java.util.Collections.sort(r3, r5)     // Catch:{ NameNotFoundException -> 0x01ab }
            int r1 = r6.size()     // Catch:{ NameNotFoundException -> 0x01ab }
            int r0 = r3.size()     // Catch:{ NameNotFoundException -> 0x01ab }
            if (r1 != r0) goto L_0x0090
            r2 = 0
        L_0x0075:
            int r0 = r6.size()     // Catch:{ NameNotFoundException -> 0x01ab }
            if (r2 >= r0) goto L_0x0093
            java.lang.Object r1 = r6.get(r2)     // Catch:{ NameNotFoundException -> 0x01ab }
            byte[] r1 = (byte[]) r1     // Catch:{ NameNotFoundException -> 0x01ab }
            java.lang.Object r0 = r3.get(r2)     // Catch:{ NameNotFoundException -> 0x01ab }
            byte[] r0 = (byte[]) r0     // Catch:{ NameNotFoundException -> 0x01ab }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ NameNotFoundException -> 0x01ab }
            if (r0 == 0) goto L_0x0090
            int r2 = r2 + 1
            goto L_0x0075
        L_0x0090:
            int r8 = r8 + 1
            goto L_0x0056
        L_0x0093:
            java.lang.String r2 = r7.authority     // Catch:{ NameNotFoundException -> 0x01ab }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ NameNotFoundException -> 0x01ab }
            android.net.Uri$Builder r0 = new android.net.Uri$Builder     // Catch:{ NameNotFoundException -> 0x01ab }
            r0.<init>()     // Catch:{ NameNotFoundException -> 0x01ab }
            java.lang.String r1 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r1)     // Catch:{ NameNotFoundException -> 0x01ab }
            android.net.Uri$Builder r0 = r0.authority(r2)     // Catch:{ NameNotFoundException -> 0x01ab }
            android.net.Uri r12 = r0.build()     // Catch:{ NameNotFoundException -> 0x01ab }
            android.net.Uri$Builder r0 = new android.net.Uri$Builder     // Catch:{ NameNotFoundException -> 0x01ab }
            r0.<init>()     // Catch:{ NameNotFoundException -> 0x01ab }
            android.net.Uri$Builder r0 = r0.scheme(r1)     // Catch:{ NameNotFoundException -> 0x01ab }
            android.net.Uri$Builder r1 = r0.authority(r2)     // Catch:{ NameNotFoundException -> 0x01ab }
            java.lang.String r0 = "file"
            android.net.Uri$Builder r0 = r1.appendPath(r0)     // Catch:{ NameNotFoundException -> 0x01ab }
            android.net.Uri r16 = r0.build()     // Catch:{ NameNotFoundException -> 0x01ab }
            r6 = 0
            java.lang.String r9 = "_id"
            java.lang.String r5 = "file_id"
            java.lang.String r4 = "font_ttc_index"
            java.lang.String r21 = "font_variation_settings"
            java.lang.String r3 = "font_weight"
            java.lang.String r2 = "font_italic"
            java.lang.String r10 = "result_code"
            r19 = r5
            r20 = r4
            r22 = r3
            r23 = r2
            r24 = r10
            r18 = r9
            java.lang.String[] r15 = new java.lang.String[]{r18, r19, r20, r21, r22, r23, r24}     // Catch:{ all -> 0x0175 }
            android.content.ContentResolver r1 = r26.getContentResolver()     // Catch:{ all -> 0x0175 }
            r11 = 1
            r8 = 0
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ all -> 0x0175 }
            java.lang.String r13 = r13.A03     // Catch:{ all -> 0x0175 }
            r0[r8] = r13     // Catch:{ all -> 0x0175 }
            android.database.Cursor r6 = A00(r1, r12, r15, r0)     // Catch:{ all -> 0x0175 }
            if (r6 == 0) goto L_0x0167
            int r0 = r6.getCount()     // Catch:{ all -> 0x0175 }
            if (r0 <= 0) goto L_0x0164
            int r10 = r6.getColumnIndex(r10)     // Catch:{ all -> 0x0175 }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0175 }
            int r15 = r6.getColumnIndex(r9)     // Catch:{ all -> 0x0175 }
            int r5 = r6.getColumnIndex(r5)     // Catch:{ all -> 0x0175 }
            int r4 = r6.getColumnIndex(r4)     // Catch:{ all -> 0x0175 }
            int r3 = r6.getColumnIndex(r3)     // Catch:{ all -> 0x0175 }
            int r2 = r6.getColumnIndex(r2)     // Catch:{ all -> 0x0175 }
        L_0x0116:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x0164
            r9 = -1
            if (r10 == r9) goto L_0x0124
            int r22 = r6.getInt(r10)     // Catch:{ all -> 0x0175 }
            goto L_0x0126
        L_0x0124:
            r22 = 0
        L_0x0126:
            if (r4 == r9) goto L_0x012d
            int r20 = r6.getInt(r4)     // Catch:{ all -> 0x0175 }
            goto L_0x012f
        L_0x012d:
            r20 = 0
        L_0x012f:
            if (r5 != r9) goto L_0x013a
            long r0 = r6.getLong(r15)     // Catch:{ all -> 0x0175 }
            android.net.Uri r19 = android.content.ContentUris.withAppendedId(r12, r0)     // Catch:{ all -> 0x0175 }
            goto L_0x0144
        L_0x013a:
            long r0 = r6.getLong(r5)     // Catch:{ all -> 0x0175 }
            r13 = r16
            android.net.Uri r19 = android.content.ContentUris.withAppendedId(r13, r0)     // Catch:{ all -> 0x0175 }
        L_0x0144:
            if (r3 == r9) goto L_0x014b
            int r21 = r6.getInt(r3)     // Catch:{ all -> 0x0175 }
            goto L_0x014d
        L_0x014b:
            r21 = 400(0x190, float:5.6E-43)
        L_0x014d:
            if (r2 == r9) goto L_0x0157
            int r0 = r6.getInt(r2)     // Catch:{ all -> 0x0175 }
            r23 = 1
            if (r0 == r11) goto L_0x0159
        L_0x0157:
            r23 = 0
        L_0x0159:
            X.0TI r0 = new X.0TI     // Catch:{ all -> 0x0175 }
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0175 }
            r7.add(r0)     // Catch:{ all -> 0x0175 }
            goto L_0x0116
        L_0x0164:
            r6.close()     // Catch:{ NameNotFoundException -> 0x01ab }
        L_0x0167:
            X.0TI[] r0 = new X.AnonymousClass0TI[r8]     // Catch:{ NameNotFoundException -> 0x01ab }
            java.lang.Object[] r0 = r7.toArray(r0)     // Catch:{ NameNotFoundException -> 0x01ab }
            X.0TI[] r0 = (X.AnonymousClass0TI[]) r0     // Catch:{ NameNotFoundException -> 0x01ab }
            X.0SZ r2 = new X.0SZ     // Catch:{ NameNotFoundException -> 0x01ab }
            r2.<init>(r0, r8)     // Catch:{ NameNotFoundException -> 0x01ab }
            goto L_0x01e3
        L_0x0175:
            r1 = move-exception
            if (r6 == 0) goto L_0x01aa
            r6.close()     // Catch:{ NameNotFoundException -> 0x01ab }
            goto L_0x01aa
        L_0x017c:
            r0 = 1
            X.0SZ r2 = new X.0SZ     // Catch:{ NameNotFoundException -> 0x01ab }
            r2.<init>(r14, r0)     // Catch:{ NameNotFoundException -> 0x01ab }
            goto L_0x01e3
        L_0x0183:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ NameNotFoundException -> 0x01ab }
            java.lang.String r0 = "No package found for authority: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)     // Catch:{ NameNotFoundException -> 0x01ab }
            android.content.pm.PackageManager$NameNotFoundException r1 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ NameNotFoundException -> 0x01ab }
            r1.<init>(r0)     // Catch:{ NameNotFoundException -> 0x01ab }
            goto L_0x01aa
        L_0x0193:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ NameNotFoundException -> 0x01ab }
            java.lang.String r0 = "Found content provider "
            r1.append(r0)     // Catch:{ NameNotFoundException -> 0x01ab }
            r1.append(r3)     // Catch:{ NameNotFoundException -> 0x01ab }
            java.lang.String r0 = ", but package was not "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ NameNotFoundException -> 0x01ab }
            android.content.pm.PackageManager$NameNotFoundException r1 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ NameNotFoundException -> 0x01ab }
            r1.<init>(r0)     // Catch:{ NameNotFoundException -> 0x01ab }
        L_0x01aa:
            throw r1     // Catch:{ NameNotFoundException -> 0x01ab }
        L_0x01ab:
            r1 = -1
            X.0WP r0 = new X.0WP
            r0.<init>((int) r1)
            return r0
        L_0x01b2:
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x01d8
            X.08A r1 = X.AnonymousClass089.A01
            r2 = r29
            r0 = r26
            android.graphics.Typeface r2 = r1.A05(r0, r14, r3, r2)
            r0 = -3
            if (r2 == 0) goto L_0x01ea
            r1 = r25
            r0 = r17
            r0.A08(r1, r2)
        L_0x01ca:
            X.0WP r1 = new X.0WP
            r1.<init>((android.graphics.Typeface) r2)
            return r1
        L_0x01d0:
            X.0TI[] r3 = r2.A01
            if (r3 == 0) goto L_0x01ea
            int r2 = r3.length
            if (r2 == 0) goto L_0x01ea
            r1 = 0
        L_0x01d8:
            r0 = r3[r1]
            int r0 = r0.A00
            if (r0 == 0) goto L_0x01b2
            if (r0 < 0) goto L_0x01e1
            r4 = r0
        L_0x01e1:
            r0 = r4
            goto L_0x01ea
        L_0x01e3:
            int r1 = r2.A00
            r4 = -3
            r0 = 1
            if (r1 == 0) goto L_0x01d0
            r0 = -2
        L_0x01ea:
            X.0WP r1 = new X.0WP
            r1.<init>((int) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07440Xr.A01(android.content.Context, X.0U3, java.lang.String, int):X.0WP");
    }
}
