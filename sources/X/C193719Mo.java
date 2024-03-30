package X;

import android.graphics.Bitmap;
import com.facebook.animated.webp.WebPImage;

/* renamed from: X.9Mo  reason: invalid class name and case insensitive filesystem */
public class C193719Mo {
    public final Bitmap A00;
    public final Bitmap A01;
    public final C199039eb A02;
    public final AnonymousClass1HG A03;
    public final AnonymousClass9IX A04;

    public C193719Mo(Bitmap bitmap, WebPImage webPImage, AnonymousClass1HG r11, String str, int i, int i2) {
        this.A03 = r11;
        this.A00 = bitmap;
        this.A04 = new AnonymousClass9IX(webPImage.getFrameDurations(), webPImage.getFrameCount());
        this.A02 = new C199039eb(bitmap, webPImage, str, i, i2);
        this.A01 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }
}
