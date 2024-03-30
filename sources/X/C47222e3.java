package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperMockChatView;

/* renamed from: X.2e3  reason: invalid class name and case insensitive filesystem */
public class C47222e3 extends C38211o3 {
    public Resources A00;
    public Button A01;
    public FrameLayout A02;
    public ProgressBar A03;
    public WallpaperImagePreview A04 = ((WallpaperImagePreview) C012005e.A02(this, R.id.wallpaper_preview_background));
    public WallpaperImagePreview A05 = ((WallpaperImagePreview) C012005e.A02(this, R.id.wallpaper_preview_background_doodle));
    public WallpaperImagePreview A06;

    public C47222e3(Context context, Resources resources, String str, String str2) {
        super(context);
        this.A00 = resources;
        View.inflate(context, R.layout.f9nameremoved, this);
        WallpaperImagePreview wallpaperImagePreview = (WallpaperImagePreview) C012005e.A02(this, R.id.wallpaper_preview_blur);
        this.A06 = wallpaperImagePreview;
        wallpaperImagePreview.setImageDrawable((Drawable) null);
        ((WallpaperMockChatView) C012005e.A02(this, R.id.wallpaper_preview_mock_chat)).setMessages(str, str2, (C89004Uw) null);
        this.A02 = C36441kJ.A0T(this, R.id.wallpaper_preview_download_container);
        this.A03 = (ProgressBar) C012005e.A02(this, R.id.wallpaper_preview_progress_bar);
        this.A01 = (Button) C012005e.A02(this, R.id.wallpaper_preview_download_btn);
    }

    public void setBackgroundColor(int i) {
        this.A06.setVisibility(8);
        WallpaperImagePreview wallpaperImagePreview = this.A04;
        wallpaperImagePreview.setImageDrawable((Drawable) null);
        wallpaperImagePreview.setBackgroundColor(i);
    }

    public void setDownloadClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public void setWallpaper(Bitmap bitmap) {
        this.A06.setVisibility(8);
        this.A04.setImageBitmap(bitmap);
    }

    public void setWallpaper(Drawable drawable) {
        this.A06.setVisibility(8);
        this.A04.setImageDrawable(drawable);
    }
}
