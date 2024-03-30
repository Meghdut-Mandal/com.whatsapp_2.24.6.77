package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import androidx.cardview.widget.CardView;

/* renamed from: X.0cY  reason: invalid class name and case insensitive filesystem */
public class C09550cY implements C17030qb {
    public void BqG(ColorStateList colorStateList, C15670nn r6) {
        C03230Dr r3 = (C03230Dr) ((C09540cX) r6).A00;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        r3.A02 = colorStateList;
        r3.A08.setColor(colorStateList.getColorForState(r3.getState(), r3.A02.getDefaultColor()));
        r3.invalidateSelf();
    }

    public void BrA(C15670nn r11, float f) {
        C09540cX r112 = (C09540cX) r11;
        C03230Dr r3 = (C03230Dr) r112.A00;
        CardView cardView = r112.A01;
        boolean z = cardView.A00;
        boolean z2 = cardView.A01;
        if (!(f == r3.A00 && r3.A03 == z && r3.A04 == z2)) {
            r3.A00 = f;
            r3.A03 = z;
            r3.A04 = z2;
            C03230Dr.A00((Rect) null, r3);
            r3.invalidateSelf();
        }
        if (!cardView.A00) {
            cardView.A03.set(0, 0, 0, 0);
            Rect rect = cardView.A02;
            C09550cY.super.setPadding(0 + rect.left, 0 + rect.top, 0 + rect.right, 0 + rect.bottom);
            return;
        }
        C03230Dr r0 = (C03230Dr) r112.A00;
        float f2 = r0.A00;
        float f3 = r0.A01;
        boolean z3 = cardView.A01;
        float f4 = f2;
        double d = C03200Do.A00;
        if (z3) {
            f4 = (float) (((double) f2) + ((1.0d - d) * ((double) f3)));
        }
        int ceil = (int) Math.ceil((double) f4);
        float f5 = f2 * 1.5f;
        if (z3) {
            f5 = (float) (((double) f5) + ((1.0d - C03200Do.A00) * ((double) f3)));
        }
        int ceil2 = (int) Math.ceil((double) f5);
        cardView.A03.set(ceil, ceil2, ceil, ceil2);
        Rect rect2 = cardView.A02;
        C09550cY.super.setPadding(ceil + rect2.left, ceil2 + rect2.top, ceil + rect2.right, ceil2 + rect2.bottom);
    }
}
