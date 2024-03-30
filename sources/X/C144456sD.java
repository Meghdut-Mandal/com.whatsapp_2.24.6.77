package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.filter.FilterUtils;
import java.util.HashSet;

/* renamed from: X.6sD  reason: invalid class name and case insensitive filesystem */
public class C144456sD implements C88514Sz {
    public boolean A00;
    public final AnonymousClass1PM A01;
    public final HashSet A02 = C36441kJ.A16();
    public final AnonymousClass1Pp A03;

    private void A00(Bitmap bitmap, ImageView imageView, String str) {
        if (C36381kD.A1Z(this.A02, imageView.hashCode())) {
            Bitmap bitmap2 = null;
            if (str != null && !this.A00) {
                bitmap2 = (Bitmap) this.A01.A09(str);
            }
            this.A00 = false;
            if (bitmap2 != null) {
                imageView.setImageBitmap(bitmap2);
                return;
            }
            try {
                Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                if (copy != null) {
                    FilterUtils.blurNative(copy, 30, 2);
                    if (str != null) {
                        this.A01.A0D(str, copy);
                    }
                    imageView.setImageBitmap(copy);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void Btf(Bitmap bitmap, ImageView imageView, boolean z) {
        String str;
        if (bitmap != null) {
            if (imageView.getTag() instanceof String) {
                str = (String) imageView.getTag();
            } else {
                str = null;
            }
            A00(bitmap, imageView, str);
            return;
        }
        Btv(imageView);
    }

    public void Btv(ImageView imageView) {
        A00(this.A03.A03(imageView.getContext(), R.drawable.avatar_contact_voip), imageView, "default_avatar");
    }

    public C144456sD(AnonymousClass1PM r2, AnonymousClass1Pp r3) {
        this.A03 = r3;
        this.A01 = r2;
    }
}
