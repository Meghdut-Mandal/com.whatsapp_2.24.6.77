package X;

import android.net.Uri;

/* renamed from: X.3mE  reason: invalid class name and case insensitive filesystem */
public abstract class C74823mE implements AnonymousClass4V2 {
    public final long A00;
    public final Uri A01;
    public final C21050ya A02;
    public final String A03;
    public final long A04;
    public final long A05;
    public final String A06;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A00(long r6, int r8) {
        /*
            r5 = this;
            android.net.Uri r2 = r5.A01
            X.0ya r1 = r5.A02
            r4 = 0
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r3 = r1.A05(r2, r0)     // Catch:{ IOException -> 0x0020, IllegalArgumentException -> 0x0024, NullPointerException -> 0x001c }
            android.graphics.Bitmap r2 = X.AnonymousClass3R8.A01(r3, r8, r6)     // Catch:{ all -> 0x0015 }
            if (r3 == 0) goto L_0x002b
            r3.close()     // Catch:{ IOException -> 0x0020, IllegalArgumentException -> 0x0024, NullPointerException -> 0x001c }
            goto L_0x002b
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ IOException -> 0x0020, IllegalArgumentException -> 0x0024, NullPointerException -> 0x001c }
            throw r0     // Catch:{ IOException -> 0x0020, IllegalArgumentException -> 0x0024, NullPointerException -> 0x001c }
        L_0x001c:
            r1 = move-exception
            java.lang.String r0 = "Util/makeBitmap/NullPointerException/"
            goto L_0x0027
        L_0x0020:
            r1 = move-exception
            java.lang.String r0 = "Util/makeBitmap/IOException/"
            goto L_0x0027
        L_0x0024:
            r1 = move-exception
            java.lang.String r0 = "Util/makeBitmap/IllegalArgumentException/"
        L_0x0027:
            com.whatsapp.util.Log.e(r0, r1)
            r2 = r4
        L_0x002b:
            if (r2 == 0) goto L_0x003a
            r1 = r5
            boolean r0 = r5 instanceof X.AnonymousClass2UG
            if (r0 == 0) goto L_0x003b
            X.2UG r1 = (X.AnonymousClass2UG) r1
            int r0 = r1.A00
        L_0x0036:
            android.graphics.Bitmap r2 = X.AnonymousClass3R8.A00(r2, r0)
        L_0x003a:
            return r2
        L_0x003b:
            r0 = 0
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74823mE.A00(long, int):android.graphics.Bitmap");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C74823mE)) {
            return false;
        }
        return AnonymousClass00C.A0J(this.A01, ((C74823mE) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        return C36381kD.A0y(this.A01);
    }

    public C74823mE(Uri uri, C21050ya r2, String str, String str2, long j, long j2, long j3) {
        this.A02 = r2;
        this.A00 = j;
        this.A01 = uri;
        this.A03 = str;
        this.A06 = str2;
        this.A05 = j2;
        this.A04 = j3;
    }

    public Uri B7k() {
        return this.A01;
    }

    public long BAn() {
        return this.A05;
    }

    public /* synthetic */ long BBF() {
        return 0;
    }

    public String BEF() {
        return this.A06;
    }

    public long getContentLength() {
        return this.A04;
    }
}
