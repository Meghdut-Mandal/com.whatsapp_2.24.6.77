package X;

import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.whatsapp.GifHelper;

/* renamed from: X.59C  reason: invalid class name */
public class AnonymousClass59C extends C74863mI {
    public AnonymousClass4V2 A04(Cursor cursor) {
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        long j2 = cursor.getLong(2);
        if (j2 == 0) {
            j2 = cursor.getLong(6) * ((long) 1000);
        }
        String string2 = cursor.getString(5);
        long j3 = cursor.getLong(7);
        if (string == null || !GifHelper.A01(C90524aI.A0S(string))) {
            return new AnonymousClass59B(A03(j), this.A05, string, string2, j, j2, j3);
        }
        return new AnonymousClass2UF(A03(j), this.A05, string, string2, j, j2, j3);
    }

    public Cursor A02() {
        return MediaStore.Images.Media.query(this.A05.A00, this.A03, C113265fG.A00, A06(), (String[]) null, A05());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap B90() {
        /*
            r8 = this;
            android.net.Uri r0 = r8.A03
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "distinct"
            java.lang.String r0 = "true"
            android.net.Uri r3 = X.C90484aE.A0M(r2, r1, r0)
            X.0ya r0 = r8.A05
            android.content.ContentResolver r2 = r0.A00
            java.lang.String r1 = "bucket_display_name"
            java.lang.String r0 = "bucket_id"
            java.lang.String[] r4 = new java.lang.String[]{r1, r0}
            java.lang.String r5 = r8.A06()
            java.lang.String r7 = r8.A05()
            r6 = 0
            android.database.Cursor r5 = android.provider.MediaStore.Images.Media.query(r2, r3, r4, r5, r6, r7)
            java.util.HashMap r4 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x0054 }
            if (r5 == 0) goto L_0x004e
            int r3 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0054 }
            int r2 = r5.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0054 }
        L_0x0035:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r1 = r5.getString(r3)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = r5.getString(r2)     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = ""
        L_0x0047:
            X.AnonymousClass00C.A0B(r1)     // Catch:{ all -> 0x0054 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0035
        L_0x004e:
            if (r5 == 0) goto L_0x0053
            r5.close()
        L_0x0053:
            return r4
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass59C.B90():java.util.HashMap");
    }

    public final String A06() {
        StringBuilder A0u = AnonymousClass000.A0u();
        String str = this.A06;
        if (str != null) {
            A0u.append("bucket_id = '");
            A0u.append(str);
            A0u.append("'");
        }
        if (this.A02 && C19550w8.A07()) {
            if (A0u.length() > 0) {
                A0u.append(" AND ");
            }
            A0u.append("is_favorite=1");
        }
        return C36381kD.A0y(A0u);
    }

    public AnonymousClass59C(Uri uri, C21060yb r2, C20810yC r3, AnonymousClass1A2 r4, String str, int i, boolean z) {
        super(uri, r2, r3, r4, str, i, z);
    }
}
