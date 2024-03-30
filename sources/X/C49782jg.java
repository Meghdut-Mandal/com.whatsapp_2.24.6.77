package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Pair;
import java.lang.ref.WeakReference;

/* renamed from: X.2jg  reason: invalid class name and case insensitive filesystem */
public final class C49782jg extends C132446Tt {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Bitmap.CompressFormat A03;
    public final Bitmap A04;
    public final Rect A05;
    public final Uri A06;
    public final C21060yb A07;
    public final C20060wx A08;
    public final WeakReference A09;
    public final boolean A0A;

    /* JADX WARNING: type inference failed for: r11v6, types: [android.util.Pair] */
    /* JADX WARNING: type inference failed for: r11v8, types: [android.util.Pair] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (X.AnonymousClass099.A0O(r1, "No space", false) != true) goto L_0x0072;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[SYNTHETIC, Splitter:B:11:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063 A[Catch:{ all -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c A[Catch:{ IOException -> 0x0052, all -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022 A[Catch:{ IOException -> 0x0052, all -> 0x004f }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r13) {
        /*
            r12 = this;
            java.lang.String r3 = "no-space"
            android.net.Uri r4 = r12.A06
            java.lang.String r0 = r4.getPath()
            r11 = 0
            if (r0 == 0) goto L_0x010a
            java.io.File r6 = new java.io.File
            r6.<init>(r0)
            r10 = 75
        L_0x0012:
            r9 = 0
            r5 = 1
            X.0yb r0 = r12.A07     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            X.0ya r0 = r0.A0O()     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "CompressImageTask/save-output cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            goto L_0x0027
        L_0x0022:
            java.io.OutputStream r7 = r0.A07(r4)     // Catch:{ IOException -> 0x0052, all -> 0x004f }
            goto L_0x0028
        L_0x0027:
            r7 = r11
        L_0x0028:
            if (r7 == 0) goto L_0x0031
            android.graphics.Bitmap r1 = r12.A04     // Catch:{ IOException -> 0x004d }
            android.graphics.Bitmap$CompressFormat r0 = r12.A03     // Catch:{ IOException -> 0x004d }
            r1.compress(r0, r10, r7)     // Catch:{ IOException -> 0x004d }
        L_0x0031:
            int r10 = r10 + -10
            X.AnonymousClass14X.A02(r7)
            int r1 = r12.A01
            if (r1 == 0) goto L_0x004b
            if (r10 <= 0) goto L_0x004b
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x004b
            long r7 = r6.length()
            long r0 = (long) r1
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0012
        L_0x004b:
            r10 = 0
            goto L_0x008d
        L_0x004d:
            r2 = move-exception
            goto L_0x0054
        L_0x004f:
            r0 = move-exception
            goto L_0x0106
        L_0x0052:
            r2 = move-exception
            r7 = r11
        L_0x0054:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = "CompressImageTask/cannot save: "
            X.C36321k7.A1M(r4, r0, r1, r2)     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0104 }
            if (r1 == 0) goto L_0x0072
            java.lang.String r0 = "No space"
            boolean r1 = X.AnonymousClass099.A0O(r1, r0, r9)     // Catch:{ all -> 0x0104 }
            r0 = 1
            if (r1 == r5) goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 == 0) goto L_0x0077
            r2 = r3
            goto L_0x0079
        L_0x0077:
            java.lang.String r2 = "io-error"
        L_0x0079:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0104 }
            android.content.Intent r0 = X.C36431kI.A0D()     // Catch:{ all -> 0x0104 }
            android.content.Intent r0 = r0.putExtra(r2, r5)     // Catch:{ all -> 0x0104 }
            android.util.Pair r11 = X.C36441kJ.A0Q(r1, r0)     // Catch:{ all -> 0x0104 }
            X.AnonymousClass14X.A02(r7)
            r10 = 1
        L_0x008d:
            long r1 = r6.length()
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00b7
            X.0wx r0 = r12.A08
            long r1 = r0.A01()
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = "CompressImageTask/nospace"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            android.content.Intent r0 = X.C36431kI.A0D()
            android.content.Intent r0 = r0.putExtra(r3, r5)
            android.util.Pair r11 = X.C36441kJ.A0Q(r1, r0)
            r10 = 1
        L_0x00b7:
            if (r10 != 0) goto L_0x010a
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x00e5
            int r3 = r12.A00
            if (r3 == r5) goto L_0x00e5
            if (r3 == 0) goto L_0x00e5
            boolean r0 = X.C203859oz.A0P     // Catch:{ IOException -> 0x00db }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ IOException -> 0x00db }
            X.9oz r2 = new X.9oz     // Catch:{ IOException -> 0x00db }
            r2.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x00db }
            java.lang.String r1 = "Orientation"
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x00db }
            r2.A0b(r1, r0)     // Catch:{ IOException -> 0x00db }
            r2.A0a()     // Catch:{ IOException -> 0x00db }
            goto L_0x00e5
        L_0x00db:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CompressImageTask/exif/cannot save: "
            X.C36321k7.A1M(r4, r0, r1, r2)
        L_0x00e5:
            android.content.Intent r2 = X.C36431kI.A0D()
            r2.setData(r4)
            android.graphics.Rect r1 = r12.A05
            java.lang.String r0 = "rect"
            r2.putExtra(r0, r1)
            int r1 = r12.A02
            java.lang.String r0 = "rotate"
            r2.putExtra(r0, r1)
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r11 = X.C36441kJ.A0Q(r0, r2)
            return r11
        L_0x0104:
            r0 = move-exception
            r11 = r7
        L_0x0106:
            X.AnonymousClass14X.A02(r11)
            throw r0
        L_0x010a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49782jg.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        this.A04.recycle();
        Activity A0D = C36441kJ.A0D(this.A09);
        if (A0D != null) {
            if (pair != null) {
                Object obj2 = pair.first;
                AnonymousClass00C.A07(obj2);
                A0D.setResult(AnonymousClass000.A0I(obj2), (Intent) pair.second);
            }
            A0D.finish();
        }
    }

    public C49782jg(Activity activity, Bitmap.CompressFormat compressFormat, Bitmap bitmap, Rect rect, Uri uri, C21060yb r7, C20060wx r8, int i, int i2, int i3, boolean z) {
        C36321k7.A0x(r8, r7);
        C36381kD.A1K(compressFormat, 5, bitmap);
        this.A08 = r8;
        this.A07 = r7;
        this.A06 = uri;
        this.A03 = compressFormat;
        this.A01 = i;
        this.A04 = bitmap;
        this.A05 = rect;
        this.A0A = z;
        this.A00 = i2;
        this.A02 = i3;
        this.A09 = AnonymousClass001.A0F(activity);
    }
}
