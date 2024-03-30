package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.3tS  reason: invalid class name and case insensitive filesystem */
public class C79273tS implements C160527l9 {
    public final int A00;
    public final ImageView A01;
    public final AnonymousClass1SV A02;

    public /* synthetic */ void BXv() {
    }

    public int BHb() {
        return this.A02.A09(this.A01.getContext());
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r5) {
        ImageView imageView = this.A01;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(this.A00);
        }
    }

    public void Btu(View view) {
        this.A01.setImageDrawable(new ColorDrawable(-7829368));
    }

    public C79273tS(ImageView imageView, AnonymousClass1SV r2, int i) {
        this.A02 = r2;
        this.A01 = imageView;
        this.A00 = i;
    }
}
