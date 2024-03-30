package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* renamed from: X.6Y8  reason: invalid class name */
public abstract class AnonymousClass6Y8 {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r2 == 3) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(android.graphics.Bitmap.Config r2, int r3, int r4) {
        /*
            int r3 = r3 * r4
            int[] r0 = X.C113125f2.A00
            int r2 = X.C90524aI.A03(r2, r0)
            r0 = 1
            r1 = 4
            if (r2 == r0) goto L_0x0013
            r0 = 2
            if (r2 == r0) goto L_0x0012
            r0 = 3
            r1 = 1
            if (r2 != r0) goto L_0x0013
        L_0x0012:
            r1 = 2
        L_0x0013:
            int r3 = r3 * r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Y8.A01(android.graphics.Bitmap$Config, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        if (r13 < 0) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.C130396Kx r11, int r12, int r13) {
        /*
            r9 = 1
            if (r12 < 0) goto L_0x0006
            r2 = 1
            if (r13 >= 0) goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "bitmaputils/wrong raw image/"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ","
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r13)
            X.C18740tg.A0D(r2, r0)
            if (r2 != 0) goto L_0x001f
            return r9
        L_0x001f:
            android.graphics.BitmapFactory$Options r0 = r11.A03
            int r8 = r0.inSampleSize
            long r3 = r11.A02
            r10 = r12
            r2 = r13
            r7 = 1
        L_0x0028:
            long r5 = (long) r10
            long r0 = (long) r2
            long r5 = r5 * r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x003d
            r1 = 2
            int r0 = r10 + -1
            int r0 = r0 / r1
            int r10 = r0 + 1
            int r0 = r2 + -1
            int r0 = r0 / r1
            int r2 = r0 + 1
            int r7 = r7 * 2
            goto L_0x0028
        L_0x003d:
            r1 = 25000000(0x17d7840, double:1.2351641E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004b
            if (r7 <= r9) goto L_0x004b
            java.lang.String r0 = "bitmaputils/findInSampleSizeByMaxPixels/downsizing image exceeding max spec pixels"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x004b:
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x0054
            int r12 = java.lang.Math.max(r12, r13)
            r13 = r12
        L_0x0054:
            int r2 = java.lang.Math.max(r8, r7)
            int r1 = r11.A01
            int r0 = r11.A00
            int r0 = A00(r12, r13, r1, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Y8.A02(X.6Kx, int, int):int");
    }

    public static Bitmap A03(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(bitmap.getWidth() * bitmap.getHeight())];
        bitmap2.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int i = 0;
        int i2 = 0;
        loop0:
        while (true) {
            if (i2 >= bitmap2.getWidth()) {
                i2 = 0;
                break;
            }
            for (int i3 = 0; i3 < bitmap2.getHeight(); i3++) {
                if (iArr[(bitmap2.getWidth() * i3) + i2] != 0) {
                    break loop0;
                }
            }
            i2++;
        }
        int i4 = 0;
        loop2:
        while (true) {
            if (i4 >= bitmap2.getHeight()) {
                break;
            }
            for (int i5 = i2; i5 < bitmap2.getWidth(); i5++) {
                if (iArr[(bitmap2.getWidth() * i4) + i5] != 0) {
                    i = i4;
                    break loop2;
                }
            }
            i4++;
        }
        int width2 = bitmap2.getWidth();
        loop4:
        while (true) {
            width2--;
            if (width2 < i2) {
                break;
            }
            int height2 = bitmap2.getHeight();
            while (true) {
                height2--;
                if (height2 >= i) {
                    if (iArr[(bitmap2.getWidth() * height2) + width2] != 0) {
                        width = width2;
                        break loop4;
                    }
                }
            }
        }
        int height3 = bitmap2.getHeight();
        loop6:
        while (true) {
            height3--;
            if (height3 < i) {
                break;
            }
            int width3 = bitmap2.getWidth();
            while (true) {
                width3--;
                if (width3 >= i2) {
                    if (iArr[(bitmap2.getWidth() * height3) + width3] != 0) {
                        height = height3;
                        break loop6;
                    }
                }
            }
        }
        try {
            return Bitmap.createBitmap(bitmap2, i2, i, width - i2, height - i);
        } catch (OutOfMemoryError e) {
            Log.e("BitmapUtils/trimTransparentEdges", e);
            return bitmap2;
        }
    }

    public static C121225sn A0A(C130396Kx r2, InputStream inputStream) {
        return A07((AnonymousClass67H) null, r2, inputStream, false);
    }

    public static int A00(int i, int i2, int i3, int i4, int i5) {
        int i6 = ((i - 1) / i5) + 1;
        int i7 = ((i2 - 1) / i5) + 1;
        while (((i6 - 1) / 2) + 1 >= i3 && ((i7 - 1) / 2) + 1 >= i4) {
            i6 = ((i6 - 1) / 2) + 1;
            i7 = ((i7 - 1) / 2) + 1;
            i5 *= 2;
        }
        return i5;
    }

    public static Path A06(RectF rectF) {
        RectF rectF2 = new RectF(rectF);
        float min = Math.min(rectF2.width(), rectF2.height());
        rectF2.right = rectF2.left + min;
        rectF2.bottom = rectF2.top + min;
        Path A0M = C36441kJ.A0M();
        A0M.moveTo(rectF2.centerX(), rectF2.top);
        float f = rectF2.left;
        float f2 = rectF2.top;
        float f3 = f;
        float f4 = f2;
        A0M.cubicTo(f, f2, f3, f4, f, rectF2.centerY());
        float f5 = rectF2.left;
        float f6 = rectF2.bottom;
        A0M.cubicTo(f5, f6, f5, f6, rectF2.centerX(), rectF2.bottom);
        float f7 = rectF2.right;
        float f8 = rectF2.bottom;
        float f9 = f7;
        float f10 = f8;
        A0M.cubicTo(f7, f8, f9, f10, f7, rectF2.centerY());
        float f11 = rectF2.right;
        float f12 = rectF2.top;
        A0M.cubicTo(f11, f12, f11, f12, rectF2.centerX(), rectF2.top);
        A0M.close();
        return A0M;
    }

    public static C121225sn A07(AnonymousClass67H r1, C130396Kx r2, InputStream inputStream, boolean z) {
        try {
            return A08(r1, r2, AnonymousClass14X.A04(new C116575ko(inputStream).A00), z);
        } catch (IOException e) {
            Log.e("bitmaputils/decoder failed", e);
            return new C121225sn(0, 0, (Bitmap) null);
        }
    }

    public static C121225sn A08(AnonymousClass67H r12, C130396Kx r13, byte[] bArr, boolean z) {
        AnonymousClass011 r10;
        Bitmap bitmap;
        Bitmap bitmap2;
        Object A0I;
        BitmapFactory.Options options = r13.A03;
        if (!options.inJustDecodeBounds) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = null;
        if (i <= 0 || i2 <= 0) {
            Log.e("bitmaputils/decodeRawBytes bad image", new Throwable());
            return new C121225sn(i, i2, (Bitmap) null);
        }
        options.inSampleSize = A02(r13, i, i2);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        if (!z) {
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            C18740tg.A06(r12);
            options.inMutable = true;
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            C002000v r6 = r12.A00;
            synchronized (r6) {
                Integer valueOf = Integer.valueOf(A01(Bitmap.Config.ARGB_8888, i3, i4));
                TreeSet treeSet = r12.A02;
                if (!C007103b.A0j(treeSet, valueOf)) {
                    valueOf = (Integer) treeSet.ceiling(valueOf);
                }
                r10 = null;
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    HashMap hashMap = r12.A01;
                    Integer valueOf2 = Integer.valueOf(intValue);
                    LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(valueOf2);
                    if (!(linkedHashSet == null || linkedHashSet.isEmpty() || (A0I = C007103b.A0I(linkedHashSet)) == null)) {
                        linkedHashSet.remove(A0I);
                        if (linkedHashSet.isEmpty()) {
                            treeSet.remove(valueOf2);
                        }
                        Object A05 = r6.A05(A0I);
                        if (A05 != null) {
                            r10 = C36441kJ.A19(A05, A0I);
                        }
                    }
                }
            }
            bitmap = null;
            if (r10 != null) {
                bitmap2 = (Bitmap) r10.first;
                str = (String) r10.second;
                if (bitmap2 != null) {
                    options.inBitmap = bitmap2;
                }
            } else {
                bitmap2 = null;
            }
            try {
                bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            } catch (IllegalArgumentException unused) {
                Log.e("bitmaputils/decode failed with bitmap pool");
                if (!(bitmap2 == null || str == null)) {
                    synchronized (r6) {
                        r6.A08(str, bitmap2);
                        r12.A00(bitmap2.getWidth(), bitmap2.getHeight(), str);
                    }
                }
            }
        }
        return new C121225sn(i, i2, bitmap);
    }

    public static C121225sn A09(C130396Kx r5, File file) {
        BitmapFactory.Options options = r5.A03;
        if (!options.inJustDecodeBounds) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        Bitmap bitmap = null;
        if (i <= 0 || i2 <= 0) {
            Log.e("bitmapcache/decodeFile bad image", new Throwable());
        } else {
            options.inSampleSize = A02(r5, i, i2);
            options.inJustDecodeBounds = false;
            try {
                bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            } catch (Throwable th) {
                Log.w("bitmaputils/error-on-decode-api21+", th);
            }
        }
        return new C121225sn(i, i2, bitmap);
    }

    public static Bitmap A04(Bitmap bitmap, int i, int i2) {
        RectF A0L = C90514aH.A0L((float) bitmap.getWidth(), bitmap.getHeight());
        float f = (float) i2;
        float f2 = (float) (i - i2);
        RectF rectF = new RectF(f, f, f2, f2);
        Matrix A0B = C90524aI.A0B();
        A0B.setRectToRect(A0L, rectF, Matrix.ScaleToFit.CENTER);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, bitmap.getConfig());
        Canvas A0A = C90524aI.A0A(createBitmap);
        A0A.drawColor(0);
        A0A.drawBitmap(bitmap, A0B, C36441kJ.A0L(2));
        return createBitmap;
    }

    public static Bitmap A05(Bitmap bitmap, ColorFilter colorFilter, float f) {
        Bitmap A09 = C90524aI.A09(bitmap.getWidth(), bitmap.getHeight());
        Canvas A0A = C90524aI.A0A(A09);
        Paint A0E = C36371kC.A0E();
        A0E.setColorFilter(colorFilter);
        float f2 = (float) (((double) f) * 0.70710678118d);
        float f3 = -f2;
        A0A.drawBitmap(bitmap, f3, f3, A0E);
        A0A.drawBitmap(bitmap, f2, f3, A0E);
        A0A.drawBitmap(bitmap, f3, f2, A0E);
        A0A.drawBitmap(bitmap, f2, f2, A0E);
        float f4 = -f;
        A0A.drawBitmap(bitmap, f4, 0.0f, A0E);
        A0A.drawBitmap(bitmap, 0.0f, f4, A0E);
        A0A.drawBitmap(bitmap, f, 0.0f, A0E);
        A0A.drawBitmap(bitmap, 0.0f, f, A0E);
        A0E.setColorFilter((ColorFilter) null);
        A0A.drawBitmap(bitmap, 0.0f, 0.0f, A0E);
        return A09;
    }

    public static String A0B(Bitmap bitmap) {
        ByteArrayOutputStream A0Q = C90524aI.A0Q();
        C90514aH.A1F(bitmap, A0Q);
        String encodeToString = Base64.encodeToString(A0Q.toByteArray(), 0);
        AnonymousClass14X.A02(A0Q);
        return encodeToString;
    }
}
