package X;

import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.59F  reason: invalid class name */
public final class AnonymousClass59F extends C74863mI implements C88924Uo {
    public AnonymousClass4V2 A04(Cursor cursor) {
        Cursor cursor2 = cursor;
        File file = null;
        if (cursor2.isClosed()) {
            return null;
        }
        long j = cursor2.getLong(0);
        String string = cursor2.getString(1);
        long j2 = cursor2.getLong(5);
        if (j2 == 0) {
            j2 = cursor2.getLong(4) * ((long) 1000);
        }
        String string2 = cursor2.getString(2);
        int i = cursor2.getInt(3);
        long j3 = cursor2.getLong(7);
        if (string != null) {
            file = C90524aI.A0S(string);
        }
        if (i != 3) {
            if ("image/gif".equals(string2) && file != null) {
                try {
                    C21656ATx.A04(file);
                    try {
                        if (!(!C21656ATx.A04(file).A02)) {
                        }
                    } catch (IOException e) {
                        Log.e("LoadMediaFromCursor/Image/Gif/IsSingleFrameGif/IOException", e);
                    } catch (OutOfMemoryError e2) {
                        Log.e("LoadMediaFromCursor/Image/Gif/IsSingleFrameGif/OutOfMemory", e2);
                    }
                } catch (IOException unused) {
                }
            }
            return new AnonymousClass2UG(A03(j), this.A05, string, string2, cursor2.getInt(6), j, j2, j3);
        } else if (!GifHelper.A01(file)) {
            return new AnonymousClass59B(A03(j), this.A05, string, string2, j, j2, j3);
        }
        return new AnonymousClass2UF(A03(j), this.A05, string, string2, j, j2, j3);
    }

    private final String A00() {
        StringBuilder A0i = C90524aI.A0i("media_type in (1, 3)");
        if (this.A06 != null) {
            A0i.append(" AND ");
            A0i.append("bucket_id=?");
        }
        if (this.A02 && C19550w8.A07()) {
            A0i.append(" AND ");
            A0i.append("is_favorite=1");
        }
        return C36381kD.A0y(A0i);
    }

    public Cursor A02() {
        String[] A1b;
        C21050ya r1 = this.A05;
        Uri uri = this.A03;
        String[] strArr = C113255fF.A00;
        String A00 = A00();
        String str = this.A06;
        if (str == null) {
            A1b = null;
        } else {
            A1b = C90474aD.A1b(str);
        }
        return r1.A03(uri, strArr, A00, A1b, A05());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap B90() {
        /*
            r12 = this;
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            android.net.Uri r0 = r12.A03
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "distinct"
            java.lang.String r0 = "true"
            android.net.Uri r7 = X.C90484aE.A0M(r2, r1, r0)
            X.0ya r6 = r12.A05
            java.lang.String r2 = "bucket_display_name"
            java.lang.String r1 = "bucket_id"
            java.lang.String[] r8 = new java.lang.String[]{r2, r1}
            java.lang.String r9 = r12.A00()
            java.lang.String r0 = r12.A06
            if (r0 != 0) goto L_0x002d
            r10 = 0
        L_0x0025:
            r11 = 0
            android.database.Cursor r4 = r6.A03(r7, r8, r9, r10, r11)
            if (r4 == 0) goto L_0x0063
            goto L_0x0032
        L_0x002d:
            java.lang.String[] r10 = X.C90474aD.A1b(r0)
            goto L_0x0025
        L_0x0032:
            int r3 = r4.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x005c }
            int r2 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x005c }
        L_0x003a:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0063
            java.lang.String r1 = r4.getString(r2)     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x003a
            int r0 = r1.length()     // Catch:{ all -> 0x005c }
            boolean r0 = X.AnonymousClass000.A1R(r0)
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = r4.getString(r3)     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = ""
        L_0x0058:
            r5.put(r1, r0)     // Catch:{ all -> 0x005c }
            goto L_0x003a
        L_0x005c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x0063:
            if (r4 == 0) goto L_0x0068
            r4.close()
        L_0x0068:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass59F.B90():java.util.HashMap");
    }

    public AnonymousClass59F(Uri uri, C21060yb r2, C20810yC r3, AnonymousClass1A2 r4, String str, int i, boolean z) {
        super(uri, r2, r3, r4, str, i, z);
    }
}
