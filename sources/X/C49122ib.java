package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.2ib  reason: invalid class name and case insensitive filesystem */
public final class C49122ib extends C132446Tt {
    public final String A00;
    public final WeakReference A01;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        byte[] decode = Base64.decode(this.A00, 0);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        AnonymousClass00C.A08(decodeByteArray);
        return decodeByteArray;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView == null) {
            return;
        }
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setImageBitmap(bitmap);
    }

    public C49122ib(ImageView imageView, String str) {
        this.A00 = str;
        this.A01 = AnonymousClass001.A0F(imageView);
    }
}
