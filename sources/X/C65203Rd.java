package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3Rd  reason: invalid class name and case insensitive filesystem */
public final class C65203Rd {
    public final C19420v0 A00;
    public final C63563Kn A01;
    public final List A02;
    public final C18820ts A03;

    public C65203Rd(C19420v0 r7, C18820ts r8, C63563Kn r9) {
        AnonymousClass00C.A0D(r8, 1);
        C36341k9.A1E(r7, 2, r9);
        this.A03 = r8;
        this.A00 = r7;
        this.A01 = r9;
        C10830fI[] r5 = new C10830fI[2];
        r5[0] = new C10830fI(Integer.valueOf(R.drawable.vec_ic_stickers_magic), Integer.valueOf(R.string.f12nameremoved), Integer.valueOf(R.string.f12nameremoved));
        this.A02 = C36341k9.A0m(new C10830fI(Integer.valueOf(R.drawable.vec_ic_stickers_expression), Integer.valueOf(R.string.f12nameremoved), Integer.valueOf(R.string.f12nameremoved)), r5, 1);
    }

    public static final AnonymousClass1p1 A00(Context context, C10830fI r4, float f) {
        Drawable drawable;
        String str = null;
        AnonymousClass1p1 r1 = new AnonymousClass1p1(context);
        Number number = (Number) r4.first;
        if (number != null) {
            drawable = C013105r.A01(context, number.intValue());
        } else {
            drawable = null;
        }
        r1.setIconDrawableRes(drawable);
        Number number2 = (Number) r4.second;
        if (number2 != null) {
            str = context.getString(number2.intValue());
        }
        r1.setText(str);
        r1.setSecondaryText(context.getString(AnonymousClass000.A0I(r4.third)));
        if (f != -1.0f) {
            r1.setSecondaryTextSize(f);
        }
        return r1;
    }

    public static final void A01(View view, LinearLayout linearLayout, C65203Rd r8, Integer num, int i, int i2) {
        int i3;
        LinearLayout.LayoutParams A0N = C36371kC.A0N();
        View view2 = view;
        view.setLayoutParams(A0N);
        int i4 = i;
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = i;
        }
        AnonymousClass1JZ.A06(view2, r8.A03, i3, A0N.topMargin, i4, i2);
        linearLayout.addView(view2);
    }
}
