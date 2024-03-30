package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.animated.webp.WebPImage;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import com.whatsapp.stickers.WebpInfo;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1HB  reason: invalid class name */
public class AnonymousClass1HB {
    public final WebpUtils A00;
    public final C19630wG A01;
    public volatile C1496071z A02;
    public volatile boolean A03;

    public static WebPImage A02(byte[] bArr) {
        try {
            return WebPImage.createFromByteArray(bArr, (AnonymousClass9WW) null);
        } catch (UnsatisfiedLinkError e) {
            Log.e("WebPImageLoader/createWebPImageFromBytes/unsatisfiedLinkError", e);
            return null;
        } catch (IllegalArgumentException e2) {
            Log.e("WebPImageLoader/createWebPImageFromBytes/failed to create webp image object", e2);
            return null;
        }
    }

    private C1496071z A03() {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03) {
                    File file = new File(this.A01.A00.getCacheDir(), "webp_static_cache");
                    if (file.exists() || file.mkdirs()) {
                        try {
                            this.A02 = C1496071z.A01((C117715mi) null, file, 2097152);
                        } catch (IOException e) {
                            Log.e("WebPImageLoader/getDiskLruCache error opening cache", e);
                        }
                    } else {
                        Log.e("WebPImageLoader/getDiskLruCache could not init directory");
                    }
                    this.A03 = true;
                }
            }
        }
        return this.A02;
    }

    public static String A04(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace("/", "-"));
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        return sb.toString();
    }

    public Bitmap A06(File file, String str, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream;
        String A04 = A04(i, i2, str);
        Bitmap A012 = A01(this, A04);
        if (A012 == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.outHeight = i2;
            options.outWidth = i;
            WebpInfo A013 = this.A00.A01(file.getAbsolutePath());
            if (A013 == null || A013.numFrames != 1) {
                A012 = null;
            } else {
                options.inSampleSize = AnonymousClass6Y8.A00(A013.width, A013.height, i, i2, 1);
                A012 = WebpBitmapFactoryImpl.hookDecodeFile(file.getAbsolutePath(), options);
            }
            if (A012 != null) {
                A05(A012, A04);
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        AnonymousClass6YY.A0J(fileInputStream, byteArrayOutputStream);
                        Bitmap A07 = A07(str, byteArrayOutputStream.toByteArray(), i, i2);
                        byteArrayOutputStream.close();
                        fileInputStream.close();
                        return A07;
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                } catch (FileNotFoundException | IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("loadStaticImageAsBitmapFromFile/getting sticker bitmap failed:");
                    sb.append(str);
                    Log.e(sb.toString(), e);
                    return null;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        return A012;
        throw th;
    }

    public AnonymousClass1HB(C19630wG r2, WebpUtils webpUtils) {
        this.A01 = r2;
        this.A00 = webpUtils;
        try {
            AnonymousClass10B.A00(r2.A00);
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086 A[Catch:{ IllegalStateException -> 0x008a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A00(com.facebook.animated.webp.WebPImage r9, X.AnonymousClass1HB r10, java.lang.String r11, int r12, int r13) {
        /*
            int r0 = r9.getFrameCount()     // Catch:{ IllegalStateException -> 0x008a }
            r3 = 0
            if (r0 <= 0) goto L_0x0083
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x0079, IllegalArgumentException -> 0x005e }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r12, r13, r0)     // Catch:{ OutOfMemoryError -> 0x0079, IllegalArgumentException -> 0x005e }
            r0 = 0
            com.facebook.animated.webp.WebPFrame r2 = r9.getFrame((int) r0)     // Catch:{ IllegalStateException -> 0x008a }
            int r8 = r2.getWidth()     // Catch:{ IllegalStateException -> 0x008a }
            int r7 = r2.getHeight()     // Catch:{ IllegalStateException -> 0x008a }
            int r1 = r9.getWidth()     // Catch:{ IllegalStateException -> 0x008a }
            int r0 = r9.getHeight()     // Catch:{ IllegalStateException -> 0x008a }
            if (r0 != r7) goto L_0x002a
            if (r1 != r8) goto L_0x002a
            r2.renderFrame(r12, r13, r4)     // Catch:{ IllegalStateException -> 0x008a }
            goto L_0x0084
        L_0x002a:
            float r5 = (float) r12     // Catch:{ IllegalStateException -> 0x008a }
            float r0 = (float) r1     // Catch:{ IllegalStateException -> 0x008a }
            float r5 = r5 / r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x007d }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r12, r13, r0)     // Catch:{ OutOfMemoryError -> 0x007d }
            float r0 = (float) r8     // Catch:{ IllegalStateException -> 0x008a }
            float r0 = r0 * r5
            double r0 = (double) r0     // Catch:{ IllegalStateException -> 0x008a }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ IllegalStateException -> 0x008a }
            int r8 = (int) r0     // Catch:{ IllegalStateException -> 0x008a }
            float r0 = (float) r7     // Catch:{ IllegalStateException -> 0x008a }
            float r0 = r0 * r5
            double r0 = (double) r0     // Catch:{ IllegalStateException -> 0x008a }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ IllegalStateException -> 0x008a }
            int r7 = (int) r0     // Catch:{ IllegalStateException -> 0x008a }
            r2.renderFrame(r8, r7, r6)     // Catch:{ IllegalStateException -> 0x008a }
            android.graphics.Canvas r7 = new android.graphics.Canvas     // Catch:{ IllegalStateException -> 0x008a }
            r7.<init>(r4)     // Catch:{ IllegalStateException -> 0x008a }
            int r0 = r2.getXOffset()     // Catch:{ IllegalStateException -> 0x008a }
            float r1 = (float) r0     // Catch:{ IllegalStateException -> 0x008a }
            float r1 = r1 * r5
            int r0 = r2.getYOffset()     // Catch:{ IllegalStateException -> 0x008a }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x008a }
            float r0 = r0 * r5
            r7.drawBitmap(r6, r1, r0, r3)     // Catch:{ IllegalStateException -> 0x008a }
            r6.recycle()     // Catch:{ IllegalStateException -> 0x008a }
            goto L_0x0084
        L_0x005e:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x008a }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x008a }
            java.lang.String r0 = "WebPImageLoader/createStaticImage creating bitmap "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x008a }
            r1.append(r12)     // Catch:{ IllegalStateException -> 0x008a }
            java.lang.String r0 = "x"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x008a }
            r1.append(r13)     // Catch:{ IllegalStateException -> 0x008a }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x008a }
            goto L_0x0080
        L_0x0079:
            r2 = move-exception
            java.lang.String r0 = "WebPImageLoader/createStaticImage creating bitmap"
            goto L_0x0080
        L_0x007d:
            r2 = move-exception
            java.lang.String r0 = "WebPImageLoader/createStaticImage creating framebitmap"
        L_0x0080:
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ IllegalStateException -> 0x008a }
        L_0x0083:
            r4 = r3
        L_0x0084:
            if (r4 == 0) goto L_0x0089
            r10.A05(r4, r11)     // Catch:{ IllegalStateException -> 0x008a }
        L_0x0089:
            return r4
        L_0x008a:
            r1 = move-exception
            java.lang.String r0 = "WebPImageLoader/createBitmapFromWebPImageAndCache/failed to create static image"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HB.A00(com.facebook.animated.webp.WebPImage, X.1HB, java.lang.String, int, int):android.graphics.Bitmap");
    }

    public static Bitmap A01(AnonymousClass1HB r3, String str) {
        C1494971l r0;
        InputStream inputStream;
        C1496071z A032 = r3.A03();
        if (A032 != null) {
            try {
                r0 = A032.A0B(str);
            } catch (IOException e) {
                Log.e("WebPImageLoader/error getting bitmap from cache", e);
                r0 = null;
            }
            if (r0 == null) {
                return null;
            }
            try {
                inputStream = r0.A00[0];
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                return decodeStream;
            } catch (IOException unused) {
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return null;
        throw th;
    }

    private void A05(Bitmap bitmap, String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        C1496071z A032 = A03();
        if (A032 != null) {
            try {
                C1269666k A002 = C1496071z.A00(A032, str);
                if (A002 != null) {
                    C107815Qz A003 = A002.A00();
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        A003.write(byteArray, 0, byteArray.length);
                        A002.A01();
                        byteArrayOutputStream.close();
                        A003.close();
                        return;
                    } catch (Throwable th) {
                        A003.close();
                        throw th;
                    }
                } else {
                    return;
                }
            } catch (IOException e) {
                Log.e("WebPImageLoader/saving bitmap to cache", e);
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            return;
        }
        throw th;
    }

    public Bitmap A07(String str, byte[] bArr, int i, int i2) {
        String A04 = A04(i, i2, str);
        Bitmap A012 = A01(this, A04);
        if (A012 != null) {
            return A012;
        }
        WebPImage A022 = A02(bArr);
        if (A022 == null) {
            return null;
        }
        return A00(A022, this, A04, i, i2);
    }
}
