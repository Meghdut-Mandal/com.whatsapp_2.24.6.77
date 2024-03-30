package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

/* renamed from: X.3fr  reason: invalid class name and case insensitive filesystem */
public class C70873fr implements C88754Tx {
    public final /* synthetic */ AnonymousClass28c A00;
    public final /* synthetic */ WallPaperView A01;
    public final /* synthetic */ Runnable A02;

    public C70873fr(AnonymousClass28c r1, WallPaperView wallPaperView, Runnable runnable) {
        this.A00 = r1;
        this.A02 = runnable;
        this.A01 = wallPaperView;
    }

    public void B2u() {
        C36401kF.A1K(this.A01);
    }

    public void Bsl(Drawable drawable) {
        AnonymousClass28c.A00(drawable, this.A00);
    }

    public void BxR() {
        this.A02.run();
    }
}
