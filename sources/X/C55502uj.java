package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import com.whatsapp.R;

/* renamed from: X.2uj  reason: invalid class name and case insensitive filesystem */
public abstract class C55502uj {
    public static final LayerDrawable A00(Context context, int i) {
        AnonymousClass00C.A0D(context, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        ShapeDrawable A0F = C36411kG.A0F();
        A0F.setIntrinsicHeight(dimensionPixelSize);
        A0F.setIntrinsicWidth(dimensionPixelSize);
        A0F.getPaint().setColor(i);
        Drawable A00 = AnonymousClass00E.A00(context, R.drawable.vec_ic_voice_status);
        int A01 = C65103Qt.A01(context, 14.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{A0F, A00});
        layerDrawable.setLayerInset(1, A01, A01, A01, A01);
        return layerDrawable;
    }
}
