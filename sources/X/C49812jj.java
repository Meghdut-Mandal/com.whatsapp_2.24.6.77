package X;

import android.graphics.Bitmap;
import com.whatsapp.status.playback.content.BlurFrameLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.2jj  reason: invalid class name and case insensitive filesystem */
public final class C49812jj extends C132446Tt {
    public final WeakReference A00;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Bitmap[] bitmapArr = (Bitmap[]) objArr;
        AnonymousClass00C.A0D(bitmapArr, 0);
        Bitmap copy = bitmapArr[0].copy(Bitmap.Config.ARGB_8888, true);
        AnonymousClass00C.A08(copy);
        C55762v9.A00(16, copy);
        return copy;
    }

    public void A09() {
        this.A00.clear();
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        AnonymousClass00C.A0D(bitmap, 0);
        BlurFrameLayout blurFrameLayout = (BlurFrameLayout) this.A00.get();
        if (blurFrameLayout != null) {
            Bitmap bitmap2 = blurFrameLayout.A01;
            if (bitmap2 == null) {
                blurFrameLayout.setAlpha(0.0f);
                blurFrameLayout.A02 = blurFrameLayout.animate().alpha(1.0f).setDuration(500);
            } else {
                bitmap2.recycle();
            }
            blurFrameLayout.A01 = bitmap;
            blurFrameLayout.invalidate();
        }
    }

    public C49812jj(BlurFrameLayout blurFrameLayout) {
        this.A00 = AnonymousClass001.A0F(blurFrameLayout);
    }
}
