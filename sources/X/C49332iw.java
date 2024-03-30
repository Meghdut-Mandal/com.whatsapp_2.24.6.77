package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.widget.ImageView;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.2iw  reason: invalid class name and case insensitive filesystem */
public class C49332iw extends C132446Tt {
    public final Context A00;
    public final ImageView A01;
    public final File A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        FileInputStream fileInputStream;
        Point A06 = AnonymousClass3T0.A06(this.A00);
        try {
            fileInputStream = new FileInputStream(this.A02);
            Bitmap bitmap = AnonymousClass6Y8.A0A(AnonymousClass3T0.A07(A06, true), fileInputStream).A02;
            fileInputStream.close();
            return bitmap;
        } catch (IOException | OutOfMemoryError e) {
            Log.e("LoadThumbnailWallpaperImageTask/error when loading wallpaper resource", e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        if (!C36431kI.A1Y(this)) {
            this.A01.setImageBitmap(bitmap);
        } else {
            bitmap.recycle();
        }
    }

    public C49332iw(Context context, ImageView imageView, File file) {
        this.A00 = context;
        this.A01 = imageView;
        this.A02 = file;
    }
}
