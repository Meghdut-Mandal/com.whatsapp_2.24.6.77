package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.2Vx  reason: invalid class name */
public abstract class AnonymousClass2Vx extends C37551mn {
    public Activity A00;
    public AnonymousClass026 A01 = new C89854Yd(this, 10);
    public AnonymousClass1JL A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Vx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
    }

    public abstract void A06(boolean z);

    public final void setSplitWindowManager(AnonymousClass1JL r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final AnonymousClass1JL getSplitWindowManager() {
        AnonymousClass1JL r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("splitWindowManager");
    }

    public final Activity getActivity() {
        return this.A00;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSplitWindowManager().A06(this.A01);
    }

    public final void setActivity(Activity activity) {
        this.A00 = activity;
    }
}
