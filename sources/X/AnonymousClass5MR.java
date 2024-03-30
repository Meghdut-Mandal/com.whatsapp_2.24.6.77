package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import java.lang.ref.SoftReference;

/* renamed from: X.5MR  reason: invalid class name */
public class AnonymousClass5MR extends C132446Tt {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImageView A02;
    public final /* synthetic */ C135106c9 A03;
    public final /* synthetic */ C29971Ys A04;
    public final /* synthetic */ String A05;

    public AnonymousClass5MR(ImageView imageView, C135106c9 r2, C29971Ys r3, String str, int i, int i2) {
        this.A04 = r3;
        this.A05 = str;
        this.A03 = r2;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = imageView;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            ImageView imageView = this.A02;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(imageView.getResources(), bitmap);
            this.A04.A02.put(this.A05, new SoftReference(bitmapDrawable));
            imageView.setImageDrawable(bitmapDrawable);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }
}
