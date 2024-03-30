package X;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* renamed from: X.3U7  reason: invalid class name */
public abstract class AnonymousClass3U7 {
    public static Bitmap A00(Context context, Resources resources) {
        InputStream openRawResource;
        Point A06 = AnonymousClass3T0.A06(context);
        try {
            openRawResource = resources.openRawResource(R.drawable.default_wallpaper);
            Bitmap bitmap = AnonymousClass6Y8.A0A(AnonymousClass3T0.A07(A06, true), openRawResource).A02;
            if (openRawResource != null) {
                openRawResource.close();
            }
            Objects.requireNonNull(bitmap);
            bitmap.setDensity(0);
            return bitmap;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static BitmapDrawable A02(Context context, Resources resources) {
        AnonymousClass00C.A0D(context, 0);
        if (context instanceof Activity) {
            ((C27111My) ((C27101Mx) C19570wA.A00(C27101Mx.class, context))).A3L.get();
        }
        Bitmap A00 = A00(context, resources);
        if (A00 != null) {
            return new BitmapDrawable(resources, A00);
        }
        Log.w("wallpaper/cannot decode default wallpaper");
        return null;
    }

    public static Drawable A04(Context context, AnonymousClass17Y r9, int i, int i2, int i3) {
        Bitmap bitmap;
        Drawable drawable = null;
        try {
            Drawable drawable2 = context.getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper").getDrawable(i);
            try {
                Bitmap bitmap2 = ((BitmapDrawable) drawable2).getBitmap();
                if (bitmap2 == null) {
                    bitmap2 = null;
                } else {
                    float f = (float) i2;
                    float height = ((float) bitmap2.getHeight()) / ((float) i3);
                    if (((float) bitmap2.getWidth()) / f > height) {
                        int width = (int) (((float) bitmap2.getWidth()) / height);
                        if (width > 0 && i3 > 0 && i2 > 0) {
                            bitmap = Bitmap.createScaledBitmap(bitmap2, width, i3, true);
                            bitmap2 = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - i2) / 2, 0, i2, i3);
                        }
                    } else {
                        int height2 = (int) ((((float) bitmap2.getHeight()) * f) / ((float) bitmap2.getWidth()));
                        if (height2 > 0 && i3 > 0 && i2 > 0) {
                            bitmap = Bitmap.createScaledBitmap(bitmap2, i2, height2, true);
                            bitmap2 = Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() - i3) / 2, i2, i3);
                        }
                    }
                    if (bitmap2 != bitmap) {
                        bitmap.recycle();
                    }
                }
                if (bitmap2 != null) {
                    return new BitmapDrawable((Resources) null, bitmap2);
                }
                r9.A04(R.string.f12nameremoved, 0);
                return drawable2;
            } catch (PackageManager.NameNotFoundException | OutOfMemoryError | RuntimeException e) {
                e = e;
                drawable = drawable2;
                Log.e("wallpaper/set-global-wallpaper", e);
                r9.A04(R.string.f12nameremoved, 0);
                return drawable;
            }
        } catch (PackageManager.NameNotFoundException | OutOfMemoryError | RuntimeException e2) {
            e = e2;
            Log.e("wallpaper/set-global-wallpaper", e);
            r9.A04(R.string.f12nameremoved, 0);
            return drawable;
        }
    }

    public static BitmapDrawable A01(Context context, int i, boolean z) {
        Resources resources = context.getResources();
        int i2 = R.array.f3nameremoved;
        if (z) {
            i2 = R.array.f3nameremoved;
        }
        int[] intArray = resources.getIntArray(i2);
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
        createBitmap.setPixel(0, 0, intArray[i]);
        return C36421kH.A0C(context, createBitmap);
    }

    public static BitmapDrawable A03(Context context, Resources resources, File file) {
        if (file.exists()) {
            try {
                Bitmap bitmap = AnonymousClass6Y8.A09(AnonymousClass3T0.A07(AnonymousClass3T0.A06(context), true), file).A02;
                if (bitmap != null) {
                    return new BitmapDrawable(resources, bitmap);
                }
            } catch (OutOfMemoryError e) {
                Log.e((Throwable) e);
            }
        }
        return null;
    }

    public static void A05(Context context, Drawable drawable, int i) {
        drawable.setColorFilter(new PorterDuffColorFilter(C018107s.A06(AnonymousClass00F.A00(context, R.color.f6nameremoved), (int) ((((float) i) / 100.0f) * 255.0f)), PorterDuff.Mode.DARKEN));
    }
}
