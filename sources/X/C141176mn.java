package X;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.6mn  reason: invalid class name and case insensitive filesystem */
public class C141176mn implements AnonymousClass7ez {
    public final Context A00;
    public final boolean A01;
    public final HashMap A02 = AnonymousClass001.A0J();

    /* JADX WARNING: Can't wrap try/catch for region: R(4:29|(2:31|32)|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0074, code lost:
        if (r9 == null) goto L_0x007f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0073 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass65N B78(android.net.Uri r31) {
        /*
            r30 = this;
            r4 = r30
            java.util.HashMap r3 = r4.A02
            r1 = r31
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r3.get(r1)
            X.65N r0 = (X.AnonymousClass65N) r0
            return r0
        L_0x0013:
            java.lang.String r0 = "SystemVideoMetadataExtractor.extract"
            android.os.Trace.beginSection(r0)
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            boolean r2 = r4.A01     // Catch:{ Exception -> 0x0125 }
            if (r2 == 0) goto L_0x007a
            r9 = 0
            android.content.Context r2 = r4.A00     // Catch:{ SecurityException -> 0x0074, all -> 0x006d }
            android.content.ContentResolver r4 = r2.getContentResolver()     // Catch:{ SecurityException -> 0x0074, all -> 0x006d }
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r9 = r4.openAssetFileDescriptor(r1, r2)     // Catch:{ FileNotFoundException -> 0x005d }
            if (r9 == 0) goto L_0x0066
            java.io.FileDescriptor r8 = r9.getFileDescriptor()     // Catch:{ SecurityException -> 0x0074, all -> 0x006d }
            boolean r2 = r8.valid()     // Catch:{ SecurityException -> 0x0074, all -> 0x006d }
            if (r2 == 0) goto L_0x0056
            long r6 = r9.getDeclaredLength()     // Catch:{ SecurityException -> 0x0074, all -> 0x006d }
            r4 = 0
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0048
            r0.setDataSource(r8)     // Catch:{ SecurityException -> 0x0074, all -> 0x006d }
            goto L_0x0076
        L_0x0048:
            long r12 = r9.getStartOffset()     // Catch:{ SecurityException -> 0x0074, all -> 0x006d }
            long r14 = r9.getDeclaredLength()     // Catch:{ SecurityException -> 0x0074, all -> 0x006d }
            r10 = r0
            r11 = r8
            r10.setDataSource(r11, r12, r14)     // Catch:{ SecurityException -> 0x0074, all -> 0x006d }
            goto L_0x0076
        L_0x0056:
            java.lang.String r2 = "file description invalid"
            java.lang.IllegalArgumentException r5 = X.AnonymousClass001.A08(r2)     // Catch:{ SecurityException -> 0x0074, all -> 0x006d }
            goto L_0x006c
        L_0x005d:
            r4 = move-exception
            java.lang.String r2 = "file not found"
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ SecurityException -> 0x0074, all -> 0x006d }
            r5.<init>(r2, r4)     // Catch:{ SecurityException -> 0x0074, all -> 0x006d }
            goto L_0x006c
        L_0x0066:
            java.lang.String r2 = "file descriptor null"
            java.lang.IllegalArgumentException r5 = X.AnonymousClass001.A08(r2)     // Catch:{ SecurityException -> 0x0074, all -> 0x006d }
        L_0x006c:
            throw r5     // Catch:{ SecurityException -> 0x0074, all -> 0x006d }
        L_0x006d:
            r2 = move-exception
            if (r9 == 0) goto L_0x0073
            r9.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            throw r2     // Catch:{ Exception -> 0x0125 }
        L_0x0074:
            if (r9 == 0) goto L_0x007f
        L_0x0076:
            r9.close()     // Catch:{ IOException -> 0x007f }
            goto L_0x007f
        L_0x007a:
            android.content.Context r2 = r4.A00     // Catch:{ Exception -> 0x0125 }
            r0.setDataSource(r2, r1)     // Catch:{ Exception -> 0x0125 }
        L_0x007f:
            java.io.File r2 = X.C90484aE.A0c(r1)     // Catch:{ Exception -> 0x0125 }
            long r27 = r2.length()     // Catch:{ Exception -> 0x0125 }
            r2 = 18
            r4 = -1
            int r17 = A00(r0, r2, r4)     // Catch:{ Exception -> 0x0125 }
            r2 = 19
            int r18 = A00(r0, r2, r4)     // Catch:{ Exception -> 0x0125 }
            r4 = 0
            r2 = 24
            int r19 = A00(r0, r2, r4)     // Catch:{ Exception -> 0x0125 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0125 }
            r4 = 30
            r2 = 3
            r7 = 1
            if (r5 < r4) goto L_0x00b3
            r4 = 36
            int r6 = A00(r0, r4, r2)     // Catch:{ Exception -> 0x0125 }
            r5 = 7
            r4 = 6
            if (r6 == r4) goto L_0x00b1
            if (r6 != r5) goto L_0x00b6
            r2 = 7
            goto L_0x00b6
        L_0x00b1:
            r2 = 6
            goto L_0x00b6
        L_0x00b3:
            r21 = 1
            goto L_0x00bc
        L_0x00b6:
            r4 = 35
            int r21 = A00(r0, r4, r7)     // Catch:{ Exception -> 0x0125 }
        L_0x00bc:
            r4 = 9
            java.lang.String r5 = r0.extractMetadata(r4)     // Catch:{ Exception -> 0x0125 }
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0125 }
            if (r4 == 0) goto L_0x00cb
            r23 = 0
            goto L_0x00d2
        L_0x00cb:
            long r23 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x00d0 }
            goto L_0x00d2
        L_0x00d0:
            r23 = 0
        L_0x00d2:
            r4 = 20
            java.lang.String r5 = r0.extractMetadata(r4)     // Catch:{ Exception -> 0x0125 }
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0125 }
            if (r4 == 0) goto L_0x00e1
            r25 = -1
            goto L_0x00e8
        L_0x00e1:
            long r25 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x00e6 }
            goto L_0x00e8
        L_0x00e6:
            r25 = -1
        L_0x00e8:
            r4 = 23
            java.lang.String r10 = r0.extractMetadata(r4)     // Catch:{ Exception -> 0x0125 }
            r4 = 5
            java.lang.String r11 = r0.extractMetadata(r4)     // Catch:{ Exception -> 0x0125 }
            r4 = 16
            java.lang.String r5 = r0.extractMetadata(r4)     // Catch:{ Exception -> 0x0125 }
            r4 = 4
            java.lang.String r14 = r0.extractMetadata(r4)     // Catch:{ Exception -> 0x0125 }
            r6 = 0
            boolean r29 = X.AnonymousClass000.A1V(r5)
            r22 = -1
            java.lang.String r15 = "VIDEO"
            X.65N r5 = new X.65N     // Catch:{ Exception -> 0x0125 }
            r8 = r6
            r9 = r6
            r12 = r6
            r13 = r6
            r16 = r6
            r7 = r6
            r20 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r29)     // Catch:{ Exception -> 0x0125 }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0125 }
            r3.put(r1, r5)     // Catch:{ Exception -> 0x0125 }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0125 }
            android.os.Trace.endSection()
            r0.release()     // Catch:{ all -> 0x0124 }
        L_0x0124:
            return r5
        L_0x0125:
            r4 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = "Exception in extractMediaMetadata isFileExists: "
            r5.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r1.getPath()     // Catch:{ all -> 0x0187 }
            boolean r2 = X.C90484aE.A1W(r2)     // Catch:{ all -> 0x0187 }
            r5.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = " path is: "
            r5.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r1.getPath()     // Catch:{ all -> 0x0187 }
            r5.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = " is readable: "
            r5.append(r2)     // Catch:{ all -> 0x0187 }
            java.io.File r2 = X.C90484aE.A0c(r1)     // Catch:{ all -> 0x0187 }
            boolean r2 = r2.canRead()     // Catch:{ all -> 0x0187 }
            r5.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = " is writable: "
            r5.append(r2)     // Catch:{ all -> 0x0187 }
            java.io.File r2 = X.C90484aE.A0c(r1)     // Catch:{ all -> 0x0187 }
            boolean r2 = r2.canWrite()     // Catch:{ all -> 0x0187 }
            r5.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = " file size in bytes: "
            r5.append(r2)     // Catch:{ all -> 0x0187 }
            java.io.File r2 = X.C90484aE.A0c(r1)     // Catch:{ all -> 0x0187 }
            long r2 = r2.length()     // Catch:{ all -> 0x0187 }
            r5.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = " file uri is: "
            r5.append(r2)     // Catch:{ all -> 0x0187 }
            X.C36351kA.A1K(r1, r5)     // Catch:{ all -> 0x0187 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0187 }
            java.lang.RuntimeException r1 = X.C90524aI.A0e(r1, r4)     // Catch:{ all -> 0x0187 }
            throw r1     // Catch:{ all -> 0x0187 }
        L_0x0187:
            r1 = move-exception
            android.os.Trace.endSection()
            r0.release()     // Catch:{ all -> 0x018e }
        L_0x018e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C141176mn.B78(android.net.Uri):X.65N");
    }

    public C141176mn(Context context, boolean z) {
        this.A00 = context;
        this.A01 = z;
    }

    public static int A00(MediaMetadataRetriever mediaMetadataRetriever, int i, int i2) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(i);
        if (TextUtils.isEmpty(extractMetadata)) {
            return i2;
        }
        try {
            return Integer.parseInt(extractMetadata);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }
}
