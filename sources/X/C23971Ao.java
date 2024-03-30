package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Ao  reason: invalid class name and case insensitive filesystem */
public final class C23971Ao {
    public final C20690y0 A00;
    public final C23901Ah A01;

    public C23971Ao(C20690y0 r2, C23901Ah r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final Bitmap A01(File file, String str, int i, int i2) {
        try {
            AnonymousClass9Y2 A09 = this.A01.A09(file, str);
            if (A09 != null) {
                return A00(C1901397a.A00(A09), i, i2);
            }
        } catch (OutOfMemoryError e) {
            Log.w("LottieUtils/getThumbnailBitmap OOM getting thumbnail bitmap", e);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0047, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C165737u4 A02(java.lang.String r8, byte[] r9) {
        /*
            r7 = this;
            r6 = 0
            X.1Ah r5 = r7.A01     // Catch:{ OutOfMemoryError -> 0x005a }
            if (r8 != 0) goto L_0x0014
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ OutOfMemoryError -> 0x005a }
            r4.<init>(r9)     // Catch:{ OutOfMemoryError -> 0x005a }
            java.lang.String r8 = X.AnonymousClass6UG.A02(r4)     // Catch:{ all -> 0x0041 }
            X.AnonymousClass00C.A08(r8)     // Catch:{ all -> 0x0041 }
            r4.close()     // Catch:{ OutOfMemoryError -> 0x005a }
        L_0x0014:
            X.00v r3 = r5.A00     // Catch:{ OutOfMemoryError -> 0x005a }
            java.lang.Object r0 = r3.A04(r8)     // Catch:{ OutOfMemoryError -> 0x005a }
            X.9Y2 r0 = (X.AnonymousClass9Y2) r0     // Catch:{ OutOfMemoryError -> 0x005a }
            if (r0 != 0) goto L_0x0055
            int r0 = r9.length     // Catch:{ OutOfMemoryError -> 0x005a }
            long r1 = (long) r0     // Catch:{ OutOfMemoryError -> 0x005a }
            X.00v r0 = r5.A01     // Catch:{ OutOfMemoryError -> 0x005a }
            java.lang.Object r0 = r0.A04(r8)     // Catch:{ OutOfMemoryError -> 0x005a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ OutOfMemoryError -> 0x005a }
            if (r0 != 0) goto L_0x0048
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ OutOfMemoryError -> 0x005a }
            r4.<init>(r9)     // Catch:{ OutOfMemoryError -> 0x005a }
            X.011 r0 = X.C23901Ah.A03(r5, r4, r8, r1)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0041 }
            goto L_0x003b
        L_0x003a:
            r0 = r6
        L_0x003b:
            r4.close()     // Catch:{ OutOfMemoryError -> 0x005a }
            if (r0 == 0) goto L_0x0060
            goto L_0x0048
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ OutOfMemoryError -> 0x005a }
            throw r0     // Catch:{ OutOfMemoryError -> 0x005a }
        L_0x0048:
            X.6Nn r0 = X.C203529oE.A05(r0)     // Catch:{ OutOfMemoryError -> 0x005a }
            java.lang.Object r0 = r0.A00     // Catch:{ OutOfMemoryError -> 0x005a }
            X.9Y2 r0 = (X.AnonymousClass9Y2) r0     // Catch:{ OutOfMemoryError -> 0x005a }
            if (r0 == 0) goto L_0x0060
            r3.A08(r8, r0)     // Catch:{ OutOfMemoryError -> 0x005a }
        L_0x0055:
            X.7u4 r6 = X.C1901397a.A00(r0)     // Catch:{ OutOfMemoryError -> 0x005a }
            return r6
        L_0x005a:
            r1 = move-exception
            java.lang.String r0 = "LottieUtils/getFullLottieDrawable OOM getting thumbnail bitmap"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0060:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23971Ao.A02(java.lang.String, byte[]):X.7u4");
    }

    public final AnonymousClass3S2 A03(String str) {
        StringBuilder sb;
        String str2;
        try {
            String A0A = this.A01.A0A(new File(str));
            if (A0A != null) {
                return AnonymousClass3S2.A00(new JSONObject(A0A).getJSONObject("customProps"));
            }
        } catch (JSONException e) {
            e = e;
            sb = new StringBuilder();
            str2 = "LottieUtils/getMetadataFromPath error getting metadata json ";
            sb.append(str2);
            sb.append(e.getMessage());
            Log.w(sb.toString());
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder();
            str2 = "LottieUtils/getMetadataFromPath exception retrieving lottie file ";
            sb.append(str2);
            sb.append(e.getMessage());
            Log.w(sb.toString());
            return null;
        }
        return null;
    }

    public static final Bitmap A00(Drawable drawable, int i, int i2) {
        C165737u4 r1;
        if ((drawable instanceof C165737u4) && (r1 = (C165737u4) drawable) != null) {
            r1.setBounds(r1.A0F.A04);
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        AnonymousClass00C.A08(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(0);
        float f = (float) i;
        float f2 = (float) i2;
        canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        canvas.save();
        canvas.scale(f / ((float) Math.max(drawable.getIntrinsicWidth(), 1)), f2 / ((float) Math.max(drawable.getIntrinsicHeight(), 1)));
        drawable.draw(canvas);
        canvas.restore();
        return createBitmap;
    }
}
