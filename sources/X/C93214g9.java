package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4g9  reason: invalid class name and case insensitive filesystem */
public final class C93214g9 extends AppCompatSeekBar {
    public C93214g9(Context context) {
        super(context, (AttributeSet) null);
    }

    public final void A00(C120765s2 r3, int i) {
        List list;
        setSplitTrack(false);
        setThumb(getContext().getDrawable(R.drawable.parametric_slider_thumb));
        r3.A00 = getThumb();
        getViewTreeObserver().addOnGlobalLayoutListener(new C135836dL(this, r3, i));
        C128436Cg r0 = r3.A02;
        if (r0 != null && (list = r0.A03) != null) {
            A01(list);
        }
    }

    public final void A01(List list) {
        setBackground((Drawable) null);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass000.A1F(A0I, Color.parseColor(C90464aC.A0f(AnonymousClass001.A0C(it), AnonymousClass000.A0u(), '#')));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, C007103b.A0m(A0I));
        gradientDrawable.setCornerRadius(100.0f);
        setProgressDrawable(gradientDrawable);
        setThumbOffset(C14960mT.A01(((float) 10) * (((float) AnonymousClass000.A0X(C36371kC.A0B(this)).densityDpi) / ((float) 160))));
    }
}
