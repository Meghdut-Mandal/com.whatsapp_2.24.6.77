package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.settings.chat.wallpaper.WallpaperDownloadFailedDialogFragment;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;

/* renamed from: X.3Dr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C61853Dr {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C47222e3 A01;
    public final /* synthetic */ C47272eD A02;

    public /* synthetic */ C61853Dr(C47222e3 r1, C47272eD r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public final void A00(AnonymousClass35Y r7) {
        View view;
        C47272eD r1 = this.A02;
        C47222e3 r4 = this.A01;
        int i = this.A00;
        Bitmap bitmap = r7.A01;
        if (bitmap != null) {
            r4.setWallpaper(bitmap);
        }
        int i2 = r7.A00;
        if (i2 == 2) {
            DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = r1.A01.A01;
            downloadableWallpaperPreviewActivity.A08.add(Integer.valueOf(i));
            if (downloadableWallpaperPreviewActivity.A00.getCurrentItem() == i) {
                downloadableWallpaperPreviewActivity.A00.setEnabled(true);
            }
            view = r4.A02;
        } else if (i2 == 1) {
            r4.A02.setVisibility(0);
            r4.A03.setVisibility(0);
            view = r4.A01;
        } else {
            C597335b r12 = r1.A01;
            if (!r12.A00) {
                r12.A00 = true;
                DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity2 = r12.A01;
                WallpaperDownloadFailedDialogFragment wallpaperDownloadFailedDialogFragment = new WallpaperDownloadFailedDialogFragment();
                Bundle A07 = AnonymousClass001.A07();
                A07.putInt("ERROR_STATE_KEY", i2);
                wallpaperDownloadFailedDialogFragment.A17(A07);
                downloadableWallpaperPreviewActivity2.Btm(wallpaperDownloadFailedDialogFragment);
            }
            r4.A02.setVisibility(0);
            r4.A03.setVisibility(8);
            r4.A01.setVisibility(0);
            return;
        }
        view.setVisibility(8);
    }
}
