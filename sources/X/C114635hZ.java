package X;

import android.graphics.Bitmap;

/* renamed from: X.5hZ  reason: invalid class name and case insensitive filesystem */
public final class C114635hZ {
    public Bitmap A00;

    public static C114635hZ A00(Bitmap bitmap) {
        return new C114635hZ(bitmap.copy(bitmap.getConfig(), false));
    }

    public C114635hZ(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
