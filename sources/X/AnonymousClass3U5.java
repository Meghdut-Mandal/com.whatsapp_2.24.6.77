package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.3U5  reason: invalid class name */
public class AnonymousClass3U5 implements C88514Sz {
    public Object A00;
    public final int A01;

    public AnonymousClass3U5(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Btf(Bitmap bitmap, ImageView imageView, boolean z) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Btv(imageView);
        }
    }

    public void Btv(ImageView imageView) {
        if (this.A01 != 0) {
            ((AnonymousClass1Pp) this.A00).A06(imageView, R.drawable.avatar_contact_voip);
        } else {
            imageView.setImageResource(R.drawable.avatar_contact);
        }
    }
}
