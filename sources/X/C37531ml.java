package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1ml  reason: invalid class name and case insensitive filesystem */
public class C37531ml extends ViewGroup {
    public final /* synthetic */ C37921nQ A00;

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        float f2 = (float) (i3 - i);
        int i6 = i4 - i2;
        C37921nQ r9 = this.A00;
        C65923Tz r1 = r9.A03;
        int i7 = C65923Tz.A0Z;
        float f3 = f2 / ((float) r1.A01);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            float f4 = ((float) i8) * f3;
            View childAt = getChildAt(i8);
            if (C36351kA.A1Y(r9.A00)) {
                i5 = (int) f4;
                f = f4 + f3;
            } else {
                f = f2 - f4;
                i5 = (int) (f - f3);
            }
            childAt.layout(i5, 0, (int) f, i6);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37531ml(Context context, C37921nQ r2) {
        super(context);
        this.A00 = r2;
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        C65923Tz r6 = this.A00.A03;
        int i3 = C65923Tz.A0Z;
        float f = (float) (size / r6.A01);
        for (int i4 = 0; i4 < childCount; i4++) {
            float f2 = ((float) i4) * f;
            C36411kG.A1B(getChildAt(i4), ((int) (f2 + f)) - ((int) f2), 1073741824);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), r6.A06);
    }
}
