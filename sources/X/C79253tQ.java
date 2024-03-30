package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.3tQ  reason: invalid class name and case insensitive filesystem */
public final class C79253tQ implements C160527l9 {
    public final int A00;

    public C79253tQ(C19630wG r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = C36421kH.A0B(r3).getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public /* synthetic */ void BXv() {
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(view, 0);
        if (bitmap != null) {
            ((ImageView) view).setImageBitmap(bitmap);
        } else {
            Btu(view);
        }
    }

    public void Btu(View view) {
        ImageView imageView;
        Drawable A002;
        Bitmap A003;
        AnonymousClass00C.A0D(view, 0);
        if ((view instanceof ImageView) && (imageView = (ImageView) view) != null && (A002 = AnonymousClass00E.A00(imageView.getContext(), R.drawable.ic_gallery_placeholder)) != null && (A003 = C55642ux.A00(A002)) != null) {
            imageView.setImageBitmap(A003);
        }
    }

    public int BHb() {
        return this.A00;
    }
}
