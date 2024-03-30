package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;

/* renamed from: X.6ze  reason: invalid class name and case insensitive filesystem */
public final class C148926ze implements C160527l9 {
    public final int A00;

    public /* synthetic */ void BXv() {
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r6) {
        int i;
        AnonymousClass00C.A0D(view, 0);
        if (bitmap != null && bitmap.getWidth() > (i = this.A00) && bitmap.getHeight() > i) {
            if (view instanceof ViewStub) {
                view = C36391kE.A0L(new AnonymousClass1RJ(view), 0);
                AnonymousClass00C.A08(view);
            }
            ImageView imageView = (ImageView) view;
            imageView.setVisibility(0);
            imageView.setImageBitmap(bitmap);
        }
    }

    public /* synthetic */ void Btu(View view) {
    }

    public C148926ze(int i) {
        this.A00 = i;
    }

    public int BHb() {
        return this.A00;
    }
}
