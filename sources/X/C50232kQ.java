package X;

import android.net.Uri;
import java.lang.ref.WeakReference;

/* renamed from: X.2kQ  reason: invalid class name and case insensitive filesystem */
public class C50232kQ extends C132446Tt {
    public String A00;
    public final Uri A01;
    public final AnonymousClass1GX A02;
    public final WeakReference A03;

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass67E A00(android.graphics.Bitmap r10, X.C198559dm r11) {
        /*
            r3 = r10
            int r1 = r10.getWidth()
            int r0 = r10.getHeight()
            int r1 = r1 * r0
            int[] r4 = new int[r1]
            int r6 = r10.getWidth()
            int r9 = r10.getWidth()
            int r10 = r10.getHeight()
            r5 = 0
            r7 = 0
            r8 = 0
            r3.getPixels(r4, r5, r6, r7, r8, r9, r10)
            int r2 = r3.getWidth()
            int r0 = r3.getHeight()
            X.8Sk r1 = new X.8Sk
            r1.<init>(r2, r4, r0)
            r0 = 0
            X.67E r0 = X.C1901897f.A00(r1, r11, r0)     // Catch:{ 92A -> 0x0033, all -> 0x0031 }
            goto L_0x0033
        L_0x0031:
            r0 = move-exception
            throw r0
        L_0x0033:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50232kQ.A00(android.graphics.Bitmap, X.9dm):X.67E");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r5.getConfig();
        r5.isRecycled();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        com.whatsapp.util.Log.e("contactQrActivity/checkImageForQrCode/ioexception");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[ExcHandler: 1X5 | IOException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r13) {
        /*
            r12 = this;
            r11 = 0
            X.1GX r6 = r12.A02     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            android.net.Uri r7 = r12.A01     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            r8 = 2000(0x7d0, float:2.803E-42)
            r10 = 1
            r9 = 2000(0x7d0, float:2.803E-42)
            android.graphics.Bitmap r5 = r6.A0f(r7, r8, r9, r10, r11)     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            X.9dm r4 = new X.9dm     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            r4.<init>()     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            X.67E r3 = A00(r5, r4)     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
        L_0x0017:
            r6 = 1
            if (r3 != 0) goto L_0x0065
            int r0 = r5.getWidth()     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            double r0 = (double) r0     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            r9 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r0 = r0 / r9
            r7 = 4644337115725824000(0x4074000000000000, double:320.0)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0065
            int r0 = r5.getHeight()     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            double r0 = (double) r0     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            double r0 = r0 / r9
            r7 = 4647151865492930560(0x407e000000000000, double:480.0)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0065
            int r0 = r5.getWidth()     // Catch:{ IllegalArgumentException -> 0x005a, 1X5 | IOException -> 0x0078 }
            double r0 = (double) r0     // Catch:{ IllegalArgumentException -> 0x005a, 1X5 | IOException -> 0x0078 }
            double r0 = r0 / r9
            double r0 = java.lang.Math.floor(r0)     // Catch:{ IllegalArgumentException -> 0x005a, 1X5 | IOException -> 0x0078 }
            int r3 = (int) r0     // Catch:{ IllegalArgumentException -> 0x005a, 1X5 | IOException -> 0x0078 }
            int r0 = r5.getHeight()     // Catch:{ IllegalArgumentException -> 0x005a, 1X5 | IOException -> 0x0078 }
            double r0 = (double) r0     // Catch:{ IllegalArgumentException -> 0x005a, 1X5 | IOException -> 0x0078 }
            double r0 = r0 / r9
            double r1 = java.lang.Math.floor(r0)     // Catch:{ IllegalArgumentException -> 0x005a, 1X5 | IOException -> 0x0078 }
            int r0 = (int) r1     // Catch:{ IllegalArgumentException -> 0x005a, 1X5 | IOException -> 0x0078 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r5, r3, r0, r6)     // Catch:{ IllegalArgumentException -> 0x005a, 1X5 | IOException -> 0x0078 }
            r5.recycle()     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            X.67E r3 = A00(r0, r4)     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            r5 = r0
            goto L_0x0017
        L_0x005a:
            r5.getConfig()     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            r5.isRecycled()     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            return r0
        L_0x0065:
            r5.recycle()     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            if (r3 != 0) goto L_0x006f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            return r0
        L_0x006f:
            java.lang.String r0 = r3.A02     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            r12.A00 = r0     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ 1X5 | IOException -> 0x0078, OutOfMemoryError -> 0x007e }
            return r0
        L_0x0078:
            java.lang.String r0 = "contactQrActivity/checkImageForQrCode/ioexception"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0084
        L_0x007e:
            r1 = move-exception
            java.lang.String r0 = "CheckImageForQrCodeAsyncTask/OOM "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0084:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50232kQ.A08(java.lang.Object[]):java.lang.Object");
    }

    public C50232kQ(Uri uri, AnonymousClass4RW r3, AnonymousClass1GX r4) {
        this.A02 = r4;
        this.A03 = AnonymousClass001.A0F(r3);
        this.A01 = uri;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int A0I = AnonymousClass000.A0I(obj);
        AnonymousClass4RW r1 = (AnonymousClass4RW) this.A03.get();
        if (r1 != null) {
            r1.BfH(this.A00, A0I);
        }
    }
}
