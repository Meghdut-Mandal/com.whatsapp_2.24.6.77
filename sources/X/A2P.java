package X;

import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;

public class A2P implements B32 {
    public ImageReader A00;
    public final int A01;
    public final ImageReader.OnImageAvailableListener A02 = new C23143B7d(this, 0);
    public volatile AnonymousClass9PF A03;

    public Surface BI4() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    public void BKK(int i, int i2, int i3) {
        this.A00 = ImageReader.newInstance(i, i2, this.A01, 1);
    }

    public void Bm5(Handler handler, AnonymousClass9PF r4) {
        if (this.A00 != null) {
            this.A03 = r4;
            this.A00.setOnImageAvailableListener(this.A02, handler);
        }
    }

    public void release() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
            this.A00.close();
            this.A00 = null;
        }
        this.A03 = null;
    }

    public A2P(int i) {
        this.A01 = i;
    }

    public int BCY() {
        return this.A01;
    }
}
