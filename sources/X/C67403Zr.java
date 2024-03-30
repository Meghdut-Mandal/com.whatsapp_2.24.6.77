package X;

import android.widget.SeekBar;
import com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity;

/* renamed from: X.3Zr  reason: invalid class name and case insensitive filesystem */
public class C67403Zr implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ WallpaperCurrentPreviewActivity A00;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public C67403Zr(WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity) {
        this.A00 = wallpaperCurrentPreviewActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onProgressChanged(android.widget.SeekBar r4, int r5, boolean r6) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x001a
            if (r6 == 0) goto L_0x001a
            com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity r2 = r3.A00
            X.3Gb r0 = r2.A0N
            if (r0 == 0) goto L_0x001a
            android.graphics.drawable.Drawable r1 = r0.A00
            if (r1 == 0) goto L_0x001a
            int r0 = r4.getProgress()
            X.AnonymousClass3U7.A05(r2, r1, r0)
            com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview r0 = r2.A0O
            r0.setImageDrawable(r1)
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67403Zr.onProgressChanged(android.widget.SeekBar, int, boolean):void");
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (seekBar != null) {
            int progress = seekBar.getProgress();
            WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity = this.A00;
            AnonymousClass11F A0Z = C36401kF.A0Z(wallpaperCurrentPreviewActivity.getIntent(), "chat_jid");
            AnonymousClass3T0 r4 = wallpaperCurrentPreviewActivity.A0M;
            if (r4 instanceof C47232e6) {
                C47232e6 r42 = (C47232e6) r4;
                Object obj = C47232e6.A00(wallpaperCurrentPreviewActivity, A0Z, r42).A00;
                C18740tg.A06(obj);
                AnonymousClass37Q r0 = (AnonymousClass37Q) obj;
                C47232e6.A04(wallpaperCurrentPreviewActivity, A0Z, new AnonymousClass37Q(Integer.valueOf(progress), r0.A01, r0.A02), r42);
            }
        }
    }
}
