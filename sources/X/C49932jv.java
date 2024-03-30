package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.2jv  reason: invalid class name and case insensitive filesystem */
public class C49932jv extends C132446Tt {
    public final int A00;
    public final Context A01;
    public final Resources A02;
    public final WallpaperImagePreview A03;
    public final WallpaperImagePreview A04;
    public final int A05;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        InputStream openRawResource;
        Resources resources = this.A02;
        if (resources != null) {
            Point A06 = AnonymousClass3T0.A06(this.A01);
            try {
                openRawResource = resources.openRawResource(this.A00);
                Bitmap bitmap = AnonymousClass6Y8.A0A(AnonymousClass3T0.A07(A06, true), openRawResource).A02;
                if (openRawResource != null) {
                    openRawResource.close();
                }
                return bitmap;
            } catch (IOException | OutOfMemoryError e) {
                Log.e("LoadWallpaperImageTask/error when loading wallpaper resource", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return null;
        throw th;
    }

    public void A0A() {
        Resources resources = this.A02;
        if (resources != null) {
            WallpaperImagePreview wallpaperImagePreview = this.A04;
            wallpaperImagePreview.setImageDrawable(resources.getDrawable(this.A05));
            wallpaperImagePreview.setVisibility(0);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        if (!C36431kI.A1Y(this)) {
            this.A03.setImageBitmap(bitmap);
            this.A04.animate().setDuration(500).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).setListener(new AnonymousClass4VL(this, 20));
            return;
        }
        bitmap.recycle();
    }

    public C49932jv(Context context, Resources resources, WallpaperImagePreview wallpaperImagePreview, WallpaperImagePreview wallpaperImagePreview2, int i, int i2) {
        this.A01 = context;
        this.A04 = wallpaperImagePreview;
        this.A03 = wallpaperImagePreview2;
        this.A02 = resources;
        this.A05 = i;
        this.A00 = i2;
    }
}
