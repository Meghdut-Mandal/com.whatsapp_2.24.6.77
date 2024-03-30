package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.6z8  reason: invalid class name and case insensitive filesystem */
public class C148606z8 implements C160167kZ {
    public final String A00;
    public final WeakReference A01;

    public void BZo(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && this.A00.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void BZy() {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && this.A00.equals(imageView.getTag())) {
            imageView.setImageResource(R.drawable.selector_sticker_pack_error);
        }
    }

    public void Ba3(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && this.A00.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public C148606z8(ImageView imageView, String str) {
        this.A01 = AnonymousClass001.A0F(imageView);
        this.A00 = str;
        imageView.setTag(str);
    }
}
