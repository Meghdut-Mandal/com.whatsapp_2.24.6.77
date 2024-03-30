package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.6sB  reason: invalid class name and case insensitive filesystem */
public final class C144436sB implements C88514Sz {
    public void Btf(Bitmap bitmap, ImageView imageView, boolean z) {
        AnonymousClass00C.A0D(imageView, 0);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Btv(imageView);
        }
    }

    public void Btv(ImageView imageView) {
        AnonymousClass00C.A0D(imageView, 0);
        imageView.setImageResource(R.drawable.avatar_contact);
    }
}
