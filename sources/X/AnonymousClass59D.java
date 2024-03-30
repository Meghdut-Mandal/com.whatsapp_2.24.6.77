package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: X.59D  reason: invalid class name */
public class AnonymousClass59D extends C74863mI implements C88924Uo {
    public /* bridge */ /* synthetic */ AnonymousClass4V2 A04(Cursor cursor) {
        long j = cursor.getLong(0);
        long j2 = cursor.getLong(2);
        if (j2 == 0) {
            j2 = cursor.getLong(7) * 1000;
        }
        return new AnonymousClass2UG(A03(j), this.A05, cursor.getString(1), cursor.getString(6), cursor.getInt(4), j, j2, cursor.getLong(8));
    }

    public Cursor A02() {
        String[] strArr;
        ContentResolver contentResolver = this.A05.A00;
        Uri uri = this.A03;
        String[] strArr2 = C113735g2.A01;
        String A06 = A06();
        String str = this.A06;
        if (str != null) {
            String[] strArr3 = C113735g2.A00;
            strArr = C36441kJ.A1S();
            System.arraycopy(strArr3, 0, strArr, 0, 1);
            strArr[1] = str;
        } else {
            strArr = C113735g2.A00;
        }
        return MediaStore.Images.Media.query(contentResolver, uri, strArr2, A06, strArr, A05());
    }

    public final String A06() {
        String str;
        if (this.A06 == null) {
            str = "(mime_type in (?))";
        } else {
            str = "(mime_type in (?)) AND bucket_id = ?";
        }
        StringBuilder A0i = C90524aI.A0i(str);
        if (this.A02 && C19550w8.A07()) {
            A0i.append(" AND ");
            A0i.append("is_favorite=1");
        }
        return C36381kD.A0y(A0i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap B90() {
        /*
            r14 = this;
            android.net.Uri r0 = r14.A03
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "distinct"
            java.lang.String r0 = "true"
            android.net.Uri r9 = X.C90484aE.A0M(r2, r1, r0)
            X.0ya r0 = r14.A05
            android.content.ContentResolver r8 = r0.A00
            java.lang.String r7 = "bucket_display_name"
            java.lang.String r6 = "bucket_id"
            java.lang.String[] r10 = new java.lang.String[]{r7, r6}
            java.lang.String r11 = r14.A06()
            java.lang.String r3 = r14.A06
            if (r3 == 0) goto L_0x0035
            java.lang.String[] r2 = X.C113735g2.A00
            r1 = 1
            java.lang.String[] r12 = X.C36441kJ.A1S()
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r12, r0, r1)
            r12[r1] = r3
        L_0x002f:
            r13 = 0
            android.database.Cursor r5 = android.provider.MediaStore.Images.Media.query(r8, r9, r10, r11, r12, r13)
            goto L_0x0038
        L_0x0035:
            java.lang.String[] r12 = X.C113735g2.A00
            goto L_0x002f
        L_0x0038:
            java.util.HashMap r4 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x005f
            int r3 = r5.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0065 }
            int r2 = r5.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0065 }
        L_0x0046:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x005f
            java.lang.String r1 = r5.getString(r3)     // Catch:{ all -> 0x0065 }
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = ""
        L_0x0054:
            java.lang.String r0 = r5.getString(r2)     // Catch:{ all -> 0x0065 }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ all -> 0x0065 }
            r4.put(r0, r1)     // Catch:{ all -> 0x0065 }
            goto L_0x0046
        L_0x005f:
            if (r5 == 0) goto L_0x0064
            r5.close()
        L_0x0064:
            return r4
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass59D.B90():java.util.HashMap");
    }

    public AnonymousClass59D(Uri uri, C21060yb r2, C20810yC r3, AnonymousClass1A2 r4, String str, int i, boolean z) {
        super(uri, r2, r3, r4, str, i, z);
    }
}
