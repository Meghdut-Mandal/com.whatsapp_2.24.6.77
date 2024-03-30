package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import com.whatsapp.R;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import java.io.File;
import java.io.Serializable;

/* renamed from: X.2e0  reason: invalid class name and case insensitive filesystem */
public abstract class C47212e0 extends C47202du implements AnonymousClass15P {
    public Button A00;
    public AnonymousClass16D A01;
    public AnonymousClass171 A02;

    public String A3i() {
        int i;
        if (this.A00 == null) {
            boolean A0A = AnonymousClass1RC.A0A(this);
            i = R.string.f12nameremoved;
            if (A0A) {
                i = R.string.f12nameremoved;
            }
        } else {
            boolean z = this.A01;
            i = R.string.f12nameremoved;
            if (z) {
                i = R.string.f12nameremoved;
            }
        }
        return getString(i);
    }

    public void A3j(AnonymousClass11F r6) {
        if (this instanceof DownloadableWallpaperPreviewActivity) {
            DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = (DownloadableWallpaperPreviewActivity) this;
            Intent A0D = C36431kI.A0D();
            int currentItem = downloadableWallpaperPreviewActivity.A00.getCurrentItem();
            if (currentItem < downloadableWallpaperPreviewActivity.A02.size()) {
                C64383Nt r4 = downloadableWallpaperPreviewActivity.A01;
                String path = ((Uri) downloadableWallpaperPreviewActivity.A02.get(downloadableWallpaperPreviewActivity.A00.getCurrentItem())).getPath();
                C18740tg.A06(path);
                File A022 = r4.A02.A02(new File(path).getName().split("\\.")[0]);
                C18740tg.A06(A022);
                A0D.setData(Uri.fromFile(A022));
                A0D.putExtra("FROM_INTERNAL_DOWNLOADS_KEY", true);
            } else {
                A0D.putExtra("selected_res_id", (Serializable) downloadableWallpaperPreviewActivity.A03.get(currentItem - downloadableWallpaperPreviewActivity.A02.size()));
            }
            C36341k9.A0t(A0D, r6);
            C36331k8.A0o(downloadableWallpaperPreviewActivity, A0D);
        } else if (this instanceof SolidColorWallpaperPreview) {
            SolidColorWallpaperPreview solidColorWallpaperPreview = (SolidColorWallpaperPreview) this;
            Intent A0D2 = C36431kI.A0D();
            A0D2.putExtra("wallpaper_color_file", solidColorWallpaperPreview.A0C[solidColorWallpaperPreview.A09.getCurrentItem()]);
            A0D2.putExtra("wallpaper_doodle_overlay", solidColorWallpaperPreview.A08.isChecked());
            C36341k9.A0t(A0D2, r6);
            solidColorWallpaperPreview.setResult(-1, A0D2);
            solidColorWallpaperPreview.finish();
        } else if (this instanceof GalleryWallpaperPreview) {
            C81203wd.A02(this.A04, this, r6, 2);
        } else {
            Intent A0D3 = C36431kI.A0D();
            C36341k9.A0t(A0D3, r6);
            A0D3.putExtra("is_default", true);
            C36331k8.A0o(this, A0D3);
        }
    }

    public void Bgm(int i, int i2) {
        AnonymousClass11F r0;
        if (i == 100) {
            if (i2 == 0) {
                r0 = this.A00;
            } else {
                r0 = null;
            }
            A3j(r0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        Button button = (Button) C03570Gk.A0B(this, R.id.set_wallpaper_button);
        this.A00 = button;
        AnonymousClass3Y8.A00(button, this, 36);
    }
}
