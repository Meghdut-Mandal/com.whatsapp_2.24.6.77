package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.R;

/* renamed from: X.3ef  reason: invalid class name and case insensitive filesystem */
public final class C70143ef implements C88514Sz {
    public int A00 = R.drawable.avatar_contact;
    public final C19630wG A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final C20810yC A04;

    public void Btf(Bitmap bitmap, ImageView imageView, boolean z) {
        AnonymousClass00C.A0D(imageView, 0);
        if (bitmap != null) {
            imageView.setTag(R.id.show_placeholder_image, (Object) null);
            imageView.setImageBitmap(bitmap);
            return;
        }
        Btv(imageView);
    }

    public void Btv(ImageView imageView) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        AnonymousClass00C.A0D(imageView, 0);
        if (this.A04.A0E(7984)) {
            imageView.setTag(R.id.show_placeholder_image, C36371kC.A0m());
            ((C19770wU) this.A03.get()).Boy(new AVb(this, imageView, 0));
            return;
        }
        Drawable A002 = AnonymousClass00E.A00(this.A01.A00, this.A00);
        if ((A002 instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) A002) != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public C70143ef(C19630wG r2, C20810yC r3, AnonymousClass005 r4, AnonymousClass005 r5) {
        C36321k7.A18(r2, r3, r4, r5);
        this.A01 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }
}
