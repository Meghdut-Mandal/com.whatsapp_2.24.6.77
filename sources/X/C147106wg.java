package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.6wg  reason: invalid class name and case insensitive filesystem */
public abstract class C147106wg implements B1C {
    public final int A00;

    public abstract String A00(Context context);

    public WaImageView BJ4(Context context) {
        WaImageView waImageView = new WaImageView(context);
        waImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        waImageView.setImageResource(this.A00);
        AnonymousClass06T.A01(PorterDuff.Mode.SRC_IN, waImageView);
        AnonymousClass06T.A00(ColorStateList.valueOf(C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved)), waImageView);
        if (A00(context) != null) {
            waImageView.setContentDescription(A00(context));
        }
        return waImageView;
    }

    public C147106wg(int i) {
        this.A00 = i;
    }
}
