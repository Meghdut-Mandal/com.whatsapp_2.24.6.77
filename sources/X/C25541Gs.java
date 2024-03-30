package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.ConditionVariable;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1Gs  reason: invalid class name and case insensitive filesystem */
public class C25541Gs {
    public final AnonymousClass1Ax A00;

    public static Bitmap A00(RectF rectF, C87994Qz r20, int i, int i2, int i3, int i4, long j, boolean z, boolean z2) {
        C37001le r7;
        Bitmap bitmap;
        Bitmap A08;
        float f;
        float f2;
        float f3;
        float f4;
        byte[] embeddedPicture;
        try {
            r7 = new C37001le();
            ConditionVariable conditionVariable = C18740tg.A00;
            r20.B3M(r7);
            int i5 = i3;
            long j2 = j;
            if (Build.VERSION.SDK_INT < 27 || i3 <= 0) {
                bitmap = null;
            } else {
                bitmap = r7.getScaledFrameAtTime(j2, 0, i5, i5);
            }
            if (bitmap == null) {
                if (z2) {
                    bitmap = r7.getFrameAtTime(j2, 3);
                } else {
                    bitmap = r7.getFrameAtTime(j2);
                }
            }
            if (bitmap == null) {
                bitmap = r7.getFrameAtTime();
            }
            if (bitmap == null && (embeddedPicture = r7.getEmbeddedPicture()) != null) {
                bitmap = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length, C56722wm.A00);
            }
            if (bitmap != null) {
                int i6 = i;
                if (i > 0) {
                    int i7 = i2;
                    if (i2 > 0) {
                        Bitmap createBitmap = Bitmap.createBitmap(i6, i7, bitmap.getConfig());
                        Matrix matrix = new Matrix();
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        float f5 = (float) width;
                        float f6 = (float) height;
                        float f7 = f5 / f6;
                        float f8 = (float) i6;
                        float f9 = (float) i7;
                        float f10 = f8 / f9;
                        int i8 = (f7 > f10 ? 1 : (f7 == f10 ? 0 : -1));
                        if (i8 > 0) {
                            f3 = f8 / f5;
                            f = (f9 - (((float) (height * i)) / f5)) / 2.0f;
                            f2 = 0.0f;
                        } else {
                            f3 = f9 / f6;
                            f2 = (f8 - (((float) (width * i2)) / f6)) / 2.0f;
                            f = 0.0f;
                        }
                        matrix.postScale(f3, f3);
                        matrix.postTranslate(f2, f);
                        if (rectF != null) {
                            if (i8 > 0) {
                                f4 = rectF.width();
                            } else {
                                f4 = (rectF.width() * f10) / f7;
                            }
                            float f11 = f4 / 2.0f;
                            matrix.postScale(f11, f11, f8 / 2.0f, f9 / 2.0f);
                            matrix.postTranslate((rectF.centerX() * f8) / 2.0f, ((-rectF.centerY()) * f9) / 2.0f);
                        }
                        new Canvas(createBitmap).drawBitmap(bitmap, matrix, (Paint) null);
                        bitmap = createBitmap;
                    }
                }
            }
            if (!(bitmap == null || i3 <= 0 || bitmap == (A08 = AnonymousClass1GW.A08(bitmap, (Matrix) null, i5, i5)))) {
                bitmap.recycle();
                bitmap = A08;
            }
            if (!(bitmap == null || !z || bitmap.getConfig() == Bitmap.Config.ARGB_8888)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                int i9 = i4;
                if (i4 > 0) {
                    C55762v9.A00(i9, bitmap);
                }
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                bitmap.recycle();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDither = true;
                options.inInputShareable = true;
                options.inPurgeable = true;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, C56722wm.A00);
            }
            if (bitmap == null) {
                Log.w("mediafileutils/createVideoThumbnail/no bitmap created");
            }
            r7.close();
            return bitmap;
        } catch (RuntimeException e) {
            Log.e("mediafileutils/createVideoThumbnail/corrupt video file", e);
            return null;
        } catch (IOException e2) {
            Log.e("mediafileutils/createVideoThumbnail/unable to load video", e2);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static Bitmap A01(File file) {
        boolean z;
        String str;
        if (file == null) {
            Log.e("mediafileutils/createVideoThumbnail/file=null");
            return null;
        }
        try {
            C21656ATx.A04(file);
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        if (!z) {
            return A00((RectF) null, new C146386vW(file), 0, 0, -1, 0, 0, false, false);
        }
        try {
            return C21656ATx.A00(file);
        } catch (IOException | IllegalArgumentException e) {
            e = e;
            str = "mediafileutils/createGifThumbnail/gif file not read ";
            Log.e(str, e);
            return null;
        } catch (Exception e2) {
            e = e2;
            str = "mediafileutils/createGifThumbnail/unexpected gif exception ";
            Log.e(str, e);
            return null;
        }
    }

    public byte[] A05(Uri uri, int i, int i2, int i3) {
        String str;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap A05 = this.A00.A05(uri, i, i2, true, true);
            if (i3 > 0) {
                C55762v9.A00(i3, A05);
            }
            A05.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
            A05.recycle();
            byteArrayOutputStream.close();
            return bArr;
        } catch (C25551Gt e) {
            e = e;
            str = "thumbnailutils/getImageThumb/file is not an image";
            Log.e(str, e);
            return bArr;
        } catch (IOException e2) {
            e = e2;
            str = "thumbnailutils/getImageThumb/unable to load image";
            Log.e(str, e);
            return bArr;
        } catch (OutOfMemoryError e3) {
            e = e3;
            str = "thumbnailutils/getImageThumb/out of memory when generating the thumbnail";
            Log.e(str, e);
            return bArr;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static Bitmap A02(File file, long j) {
        C37001le r2;
        if (j == 0) {
            return A01(file);
        }
        Bitmap bitmap = null;
        try {
            r2 = new C37001le();
            r2.setDataSource(file.getAbsolutePath());
            bitmap = r2.getFrameAtTime(j);
            r2.close();
            return bitmap;
        } catch (Exception | NoSuchMethodError unused) {
            return bitmap;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static byte[] A03(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("orig_thumbnail/width:");
        sb.append(bitmap.getWidth());
        sb.append("/height:");
        sb.append(bitmap.getHeight());
        sb.append("/maxDimension:");
        sb.append(i);
        Log.i(sb.toString());
        if (bitmap.getWidth() > i || bitmap.getHeight() > i) {
            float f = (float) i;
            float max = Math.max(((float) bitmap.getWidth()) / f, ((float) bitmap.getHeight()) / f);
            Rect rect = new Rect(0, 0, (int) (((float) bitmap.getWidth()) / max), (int) (((float) bitmap.getHeight()) / max));
            rect.right = Math.max(rect.right, 1);
            rect.bottom = Math.max(rect.bottom, 1);
            Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            Bitmap.Config config = bitmap.getConfig();
            try {
                int width = rect.width();
                int height = rect.height();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                paint.setDither(true);
                canvas.drawBitmap(bitmap, rect2, rect, paint);
                bitmap.recycle();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("rescaled_thumbnail/width:");
                sb2.append(createBitmap.getWidth());
                sb2.append("/height:");
                sb2.append(createBitmap.getHeight());
                Log.i(sb2.toString());
                bitmap = createBitmap;
            } catch (OutOfMemoryError e) {
                Log.e("video-thumbnail/scale/out-of-memory", e);
                bitmap.recycle();
                throw e;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        bitmap.recycle();
        return byteArray;
    }

    public C25541Gs(AnonymousClass1Ax r1) {
        this.A00 = r1;
    }

    public static byte[] A04(File file) {
        return A03(A01(file), 100);
    }
}
