package X;

import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;

public class A2O implements B32 {
    public ImageReader A00;
    public AnonymousClass9PF A01;
    public final ImageReader.OnImageAvailableListener A02 = new C23143B7d(this, 2);

    public int BCY() {
        return 35;
    }

    public Surface BI4() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    public void BKK(int i, int i2, int i3) {
        this.A00 = ImageReader.newInstance(i, i2, 35, 1);
    }

    public void Bm5(Handler handler, AnonymousClass9PF r4) {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            this.A01 = r4;
            imageReader.setOnImageAvailableListener(this.A02, handler);
        }
    }

    public void release() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
            this.A00.close();
            this.A00 = null;
        }
        this.A01 = null;
    }
}
