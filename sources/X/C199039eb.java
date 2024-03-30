package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.facebook.animated.webp.WebPImage;

/* renamed from: X.9eb  reason: invalid class name and case insensitive filesystem */
public class C199039eb {
    public int A00 = 0;
    public Bitmap A01;
    public Bitmap A02;
    public Canvas A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Bitmap A08;
    public final WebPImage A09;
    public final String A0A;
    public final Paint A0B;

    public synchronized void finalize() {
        this.A09.dispose();
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            bitmap.recycle();
            this.A01 = null;
        }
        Bitmap bitmap2 = this.A02;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.A02 = null;
        }
        super.finalize();
    }

    public static void A00(Canvas canvas, AnonymousClass9N2 r10, C199039eb r11) {
        int i = r10.A02;
        float f = r11.A04;
        int i2 = r10.A03;
        canvas.drawRect(((float) i) * f, ((float) i2) * f, ((float) (i + r10.A01)) * f, ((float) (i2 + r10.A00)) * f, r11.A0B);
    }

    public C199039eb(Bitmap bitmap, WebPImage webPImage, String str, int i, int i2) {
        this.A0A = str;
        this.A09 = webPImage;
        this.A08 = bitmap;
        Paint paint = new Paint();
        this.A0B = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        C165587tf.A0v(paint, PorterDuff.Mode.SRC);
        this.A07 = webPImage.getFrameCount();
        this.A06 = i;
        this.A05 = i2;
        this.A04 = ((float) i) / ((float) webPImage.getWidth());
    }
}
