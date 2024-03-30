package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.3ec  reason: invalid class name and case insensitive filesystem */
public class C70113ec implements C88514Sz {
    public void Btf(Bitmap bitmap, ImageView imageView, boolean z) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Btv(imageView);
        }
    }

    public void Btv(ImageView imageView) {
        imageView.setImageResource(R.drawable.avatar_contact);
    }
}
