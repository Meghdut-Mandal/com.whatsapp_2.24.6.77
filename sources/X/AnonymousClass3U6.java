package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.community.JoinGroupBottomSheetFragment;

/* renamed from: X.3U6  reason: invalid class name */
public class AnonymousClass3U6 implements C88514Sz {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass3U6(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void Btf(Bitmap bitmap, ImageView imageView, boolean z) {
        if (this.A02 != 0) {
            AnonymousClass00C.A0D(imageView, 0);
        }
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            Btv(imageView);
        }
    }

    public void Btv(ImageView imageView) {
        AnonymousClass1Pp r1;
        Object obj;
        if (this.A02 != 0) {
            AnonymousClass00C.A0D(imageView, 0);
            r1 = ((AnonymousClass2I7) this.A01).getContactAvatars();
            obj = this.A00;
        } else {
            r1 = ((JoinGroupBottomSheetFragment) this.A00).A0P;
            obj = this.A01;
        }
        imageView.setImageDrawable(C36381kD.A0H(imageView.getContext(), r1.A02((AnonymousClass141) obj)));
    }
}
