package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.6sC  reason: invalid class name and case insensitive filesystem */
public class C144446sC implements C88514Sz {
    public final int A00;
    public final AnonymousClass1Pp A01;

    public void Btf(Bitmap bitmap, ImageView imageView, boolean z) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Btv(imageView);
        }
    }

    public void Btv(ImageView imageView) {
        imageView.setImageBitmap(AnonymousClass1Pp.A01(imageView.getContext(), this.A01, (float) Integer.MIN_VALUE, R.drawable.vec_ic_avatar_community, this.A00));
    }

    public C144446sC(AnonymousClass1Pp r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
