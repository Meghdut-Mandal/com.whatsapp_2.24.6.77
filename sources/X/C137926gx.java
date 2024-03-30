package X;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.6gx  reason: invalid class name and case insensitive filesystem */
public final class C137926gx implements AnonymousClass7e2 {
    public final float[] A00;
    public final int[] A01 = C36441kJ.A1O();

    public C137926gx(float[] fArr) {
        this.A00 = fArr;
    }

    private final void A00(View view, float[] fArr) {
        float[] fArr2;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            A00((View) parent, fArr);
            fArr2 = this.A00;
            AnonymousClass6VX.A02(fArr2);
            AnonymousClass6VX.A03(fArr2, -((float) view.getScrollX()), -((float) view.getScrollY()));
            AnonymousClass6RE.A01(fArr, fArr2);
            AnonymousClass6VX.A02(fArr2);
            AnonymousClass6VX.A03(fArr2, (float) view.getLeft(), (float) view.getTop());
            AnonymousClass6RE.A01(fArr, fArr2);
        } else {
            int[] iArr = this.A01;
            view.getLocationInWindow(iArr);
            fArr2 = this.A00;
            AnonymousClass6VX.A02(fArr2);
            AnonymousClass6VX.A03(fArr2, -((float) view.getScrollX()), -((float) view.getScrollY()));
            AnonymousClass6RE.A01(fArr, fArr2);
            AnonymousClass6VX.A02(fArr2);
            AnonymousClass6VX.A03(fArr2, (float) iArr[0], (float) iArr[1]);
            AnonymousClass6RE.A01(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            AnonymousClass5WX.A00(matrix, fArr2);
            AnonymousClass6RE.A01(fArr, fArr2);
        }
    }

    public void B2D(View view, float[] fArr) {
        AnonymousClass6VX.A02(fArr);
        A00(view, fArr);
    }
}
