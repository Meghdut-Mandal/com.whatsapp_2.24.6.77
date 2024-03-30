package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.5M1  reason: invalid class name */
public final class AnonymousClass5M1 extends C132446Tt {
    public final String A00;
    public final WeakReference A01;

    public AnonymousClass5M1(ImageView imageView, String str) {
        AnonymousClass00C.A0D(imageView, 2);
        this.A00 = str;
        this.A01 = AnonymousClass001.A0F(imageView);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
