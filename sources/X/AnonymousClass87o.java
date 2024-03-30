package X;

import android.graphics.Bitmap;
import java.util.Objects;

/* renamed from: X.87o  reason: invalid class name */
public abstract class AnonymousClass87o extends C20967A1a implements B6M {
    public AU0 A00;
    public final C199209eu A01;
    public volatile Bitmap A02;

    public void close() {
        AU0 au0;
        synchronized (this) {
            au0 = this.A00;
            this.A00 = null;
            this.A02 = null;
        }
        if (au0 != null) {
            au0.close();
        }
    }

    public int getSizeInBytes() {
        Bitmap bitmap = this.A02;
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    public AnonymousClass87o(AU0 au0, C199209eu r3) {
        AU0 A002 = au0.A00();
        Objects.requireNonNull(A002);
        this.A00 = A002;
        this.A02 = (Bitmap) A002.A01();
        this.A01 = r3;
    }
}
