package X;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* renamed from: X.61k  reason: invalid class name and case insensitive filesystem */
public class C1258261k {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C16680pu A01;

    public C1258261k(ImageView imageView, C16680pu r2) {
        this.A01 = r2;
        this.A00 = imageView;
    }

    public void A00(Bitmap bitmap) {
        Number number = (Number) this.A01.get();
        if (number != null) {
            Paint A0K = C36441kJ.A0K();
            A0K.setColorFilter(new PorterDuffColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN));
            Bitmap A09 = C90524aI.A09(bitmap.getWidth(), bitmap.getHeight());
            C90524aI.A0A(A09).drawBitmap(bitmap, 0.0f, 0.0f, A0K);
            this.A00.setImageBitmap(A09);
            return;
        }
        this.A00.setImageBitmap(bitmap);
    }
}
