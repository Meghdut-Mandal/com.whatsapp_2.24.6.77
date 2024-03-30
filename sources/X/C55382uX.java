package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.whatsapp.R;

/* renamed from: X.2uX  reason: invalid class name and case insensitive filesystem */
public abstract class C55382uX {
    public static final GradientDrawable A00(Context context, Bitmap bitmap) {
        int A00;
        if (bitmap != null) {
            A00 = -16777216;
            C200089ga r0 = new AnonymousClass9UJ(bitmap).A00().A01;
            if (r0 != null) {
                A00 = r0.A05;
            }
        } else {
            A00 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        }
        int A03 = C018107s.A03(0.3f, A00, -1);
        int A032 = C018107s.A03(0.3f, A00, -16777216);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int[] A1O = C36441kJ.A1O();
        A1O[0] = A03;
        A1O[1] = A032;
        return new GradientDrawable(orientation, A1O);
    }
}
