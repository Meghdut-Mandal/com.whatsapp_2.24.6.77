package X;

import android.os.Bundle;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.settings.chat.wallpaper.DefaultWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;

/* renamed from: X.2e1  reason: invalid class name */
public abstract class AnonymousClass2e1 extends AnonymousClass24U {
    public AnonymousClass11F A00 = null;
    public boolean A01 = false;

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this instanceof DownloadableWallpaperPickerActivity) {
            i = R.layout.f9nameremoved;
        } else {
            C47212e0 r1 = (C47212e0) this;
            if (r1 instanceof GalleryWallpaperPreview) {
                i = R.layout.f9nameremoved;
            } else if (r1 instanceof DefaultWallpaperPreview) {
                i = R.layout.f9nameremoved;
            } else {
                i = R.layout.f9nameremoved;
            }
        }
        setContentView(i);
        AnonymousClass1R1.A04((ViewGroup) C03570Gk.A0B(this, R.id.container), new C89854Yd(this, 12));
        AnonymousClass1R1.A03(this);
        AnonymousClass1RC.A05(this, C224314h.A01(this, R.attr.f4nameremoved));
        this.A01 = C36421kH.A1T(getIntent(), "is_using_global_wallpaper");
        this.A00 = C36401kF.A0Z(getIntent(), "chat_jid");
        C36431kI.A0Q(this, C36361kB.A0N(this)).A0U(true);
        C36341k9.A0y(findViewById(R.id.separator));
    }
}
