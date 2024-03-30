package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.6zf  reason: invalid class name and case insensitive filesystem */
public final class C148936zf implements C160527l9 {
    public final ImageView A00;
    public final AnonymousClass1SV A01;

    public /* synthetic */ void BXv() {
    }

    public int BHb() {
        return this.A01.A09(this.A00.getContext());
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r5) {
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            this.A00.setVisibility(8);
            return;
        }
        ImageView imageView = this.A00;
        imageView.setVisibility(0);
        imageView.setImageBitmap(bitmap);
    }

    public void Btu(View view) {
        this.A00.setImageDrawable(new ColorDrawable(-7829368));
    }

    public C148936zf(ImageView imageView, AnonymousClass1SV r2) {
        this.A00 = imageView;
        this.A01 = r2;
    }
}
