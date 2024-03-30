package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.1gL  reason: invalid class name and case insensitive filesystem */
public final class C34031gL extends View {
    public final /* synthetic */ int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34031gL(Activity activity, int i) {
        super(activity);
        this.A00 = i;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.A00, 1073741824));
    }
}
