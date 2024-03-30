package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.whatsapp.R;

public class BAT implements AnonymousClass004 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public BAT(View view, C174518Xi r2, C18820ts r3, int i) {
        this.A03 = i;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = view;
    }

    public final Object get() {
        int i;
        int right;
        int right2;
        if (this.A03 != 0) {
            C174518Xi r2 = (C174518Xi) this.A00;
            View view = (View) this.A02;
            Resources resources = r2.A02;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
            boolean A1X = C36401kF.A1X((C18820ts) this.A01);
            int left = view.getLeft();
            if (A1X) {
                right2 = (int) (((((float) view.getRight()) - AZ4.A00(r2.A0A)) - ((float) resources.getDimensionPixelSize(R.dimen.f7nameremoved))) + 0.5f);
            } else {
                left = (int) (((float) left) + AZ4.A00(r2.A0A) + ((float) resources.getDimensionPixelSize(R.dimen.f7nameremoved)) + 0.5f);
                right2 = view.getRight();
            }
            return new Rect(left, dimensionPixelSize, right2, (int) (((float) dimensionPixelSize) + AZ4.A00(r2.A0C) + 0.5f));
        }
        C174518Xi r3 = (C174518Xi) this.A00;
        View view2 = (View) this.A02;
        Resources resources2 = r3.A02;
        float dimensionPixelSize2 = ((float) resources2.getDimensionPixelSize(R.dimen.f7nameremoved)) + AZ4.A00(r3.A0C);
        boolean A1X2 = C36401kF.A1X((C18820ts) this.A01);
        int left2 = view2.getLeft();
        if (A1X2) {
            i = (int) (dimensionPixelSize2 + 0.5f);
            right = (int) (((((float) view2.getRight()) - AZ4.A00(r3.A0A)) - ((float) resources2.getDimensionPixelSize(R.dimen.f7nameremoved))) + 0.5f);
        } else {
            left2 = (int) (((float) left2) + AZ4.A00(r3.A0A) + ((float) resources2.getDimensionPixelSize(R.dimen.f7nameremoved)) + 0.5f);
            i = (int) (dimensionPixelSize2 + 0.5f);
            right = view2.getRight();
        }
        return new Rect(left2, i, right, (int) (dimensionPixelSize2 + AZ4.A00(r3.A0B) + 0.5f));
    }
}
