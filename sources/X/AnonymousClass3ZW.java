package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.R;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;

/* renamed from: X.3ZW  reason: invalid class name */
public class AnonymousClass3ZW implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ SolidColorWallpaperPreview A04;

    public boolean onPreDraw() {
        SolidColorWallpaperPreview solidColorWallpaperPreview = this.A04;
        C36351kA.A1D(solidColorWallpaperPreview.A07, this);
        View findViewById = solidColorWallpaperPreview.findViewById(R.id.wallpaper_preview_mock_chat);
        View findViewById2 = solidColorWallpaperPreview.findViewById(R.id.wallpaper_preview_mock_chat_dark);
        int[] A1O = C36441kJ.A1O();
        solidColorWallpaperPreview.A09.getLocationOnScreen(A1O);
        solidColorWallpaperPreview.A02 = this.A02 - A1O[0];
        solidColorWallpaperPreview.A03 = this.A03 - A1O[1];
        solidColorWallpaperPreview.A00 = ((float) this.A01) / C36441kJ.A01(solidColorWallpaperPreview.A09);
        solidColorWallpaperPreview.A01 = ((float) this.A00) / C36441kJ.A02(solidColorWallpaperPreview.A09);
        int A002 = (int) (C36341k9.A00(solidColorWallpaperPreview) * 20.0f);
        solidColorWallpaperPreview.A09.setPivotX(0.0f);
        solidColorWallpaperPreview.A09.setPivotY(0.0f);
        solidColorWallpaperPreview.A09.setScaleX(solidColorWallpaperPreview.A00);
        solidColorWallpaperPreview.A09.setScaleY(solidColorWallpaperPreview.A01);
        solidColorWallpaperPreview.A09.setTranslationX((float) solidColorWallpaperPreview.A02);
        solidColorWallpaperPreview.A09.setTranslationY((float) solidColorWallpaperPreview.A03);
        solidColorWallpaperPreview.A04.setAlpha(0.0f);
        solidColorWallpaperPreview.A06.setAlpha(0.0f);
        if (findViewById != null) {
            findViewById.setAlpha(0.0f);
            findViewById.setTranslationY((float) A002);
        }
        if (findViewById2 != null) {
            findViewById2.setAlpha(0.0f);
            findViewById2.setTranslationY((float) A002);
        }
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        solidColorWallpaperPreview.A05.setBackgroundColor(0);
        solidColorWallpaperPreview.A04.animate().setDuration(250).alpha(1.0f).setInterpolator(decelerateInterpolator);
        C36431kI.A0L(solidColorWallpaperPreview.A09, 250).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setInterpolator(decelerateInterpolator).setListener(new AnonymousClass4VJ(findViewById2, decelerateInterpolator, this, findViewById, 2));
        return true;
    }

    public AnonymousClass3ZW(SolidColorWallpaperPreview solidColorWallpaperPreview, int i, int i2, int i3, int i4) {
        this.A04 = solidColorWallpaperPreview;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }
}
