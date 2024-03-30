package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.6z9  reason: invalid class name and case insensitive filesystem */
public class C148616z9 implements C160167kZ {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C106675Ku A01;
    public final /* synthetic */ String A02;

    public C148616z9(ImageView imageView, C106675Ku r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = imageView;
    }

    public void BZo(Bitmap bitmap) {
        String str = this.A02;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void BZy() {
        String str = this.A02;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageResource(R.drawable.selector_sticker_pack_error);
        }
    }

    public void Ba3(Bitmap bitmap) {
        String str = this.A02;
        ImageView imageView = this.A00;
        if (str.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
