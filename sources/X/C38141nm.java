package X;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.1nm  reason: invalid class name and case insensitive filesystem */
public class C38141nm extends FrameLayout {
    public int A00 = -1;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ C38891qO A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38141nm(Activity activity, Context context, C38891qO r4) {
        super(context);
        this.A02 = r4;
        this.A01 = activity;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int rotation = this.A01.getWindowManager().getDefaultDisplay().getRotation();
        int i5 = this.A00;
        if (!(i5 == -1 || i5 == rotation)) {
            C38891qO r2 = this.A02;
            if (!r2.A02 || r2.A03) {
                C38891qO.A02(r2);
            } else {
                r2.A03 = true;
                r2.A06.getViewTreeObserver().addOnGlobalLayoutListener(r2.A05);
            }
        }
        this.A00 = rotation;
        super.onLayout(z, i, i2, i3, i4);
    }
}
