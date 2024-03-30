package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.3ee  reason: invalid class name and case insensitive filesystem */
public class C70133ee implements C88514Sz {
    public final AnonymousClass1Pp A00;
    public final AnonymousClass141 A01;
    public final C27751Pr A02;
    public final AnonymousClass1EM A03;

    public void Btf(Bitmap bitmap, ImageView imageView, boolean z) {
        if (bitmap != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null || z) {
                imageView.setImageBitmap(bitmap);
                return;
            }
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                if (layerDrawable.getNumberOfLayers() > 0) {
                    drawable = layerDrawable.getDrawable(layerDrawable.getNumberOfLayers() - 1);
                }
            }
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(bitmap)});
            transitionDrawable.setCrossFadeEnabled(false);
            transitionDrawable.startTransition(300);
            imageView.setImageDrawable(transitionDrawable);
            return;
        }
        Btv(imageView);
    }

    public C70133ee(AnonymousClass1Pp r1, AnonymousClass141 r2, C27751Pr r3, AnonymousClass1EM r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void Btv(ImageView imageView) {
        int i = R.drawable.avatar_contact;
        AnonymousClass7fA r3 = C68483by.A00;
        AnonymousClass141 r2 = this.A01;
        if (r2 != null) {
            i = this.A00.A02(r2);
            if (this.A03.A06(C65533Sl.A01(r2.A0H))) {
                r3 = C68493bz.A00;
            }
        }
        C27751Pr r0 = this.A02;
        imageView.setImageDrawable(C27751Pr.A00(C36361kB.A09(imageView), imageView.getResources(), r3, r0.A00, i));
    }
}
