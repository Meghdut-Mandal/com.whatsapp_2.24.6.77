package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.transformation.ExpandableBehavior;

/* renamed from: X.6dR  reason: invalid class name and case insensitive filesystem */
public class C135896dR implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C013705z A02;
    public final /* synthetic */ ExpandableBehavior A03;

    public C135896dR(View view, C013705z r2, ExpandableBehavior expandableBehavior, int i) {
        this.A03 = expandableBehavior;
        this.A01 = view;
        this.A00 = i;
        this.A02 = r2;
    }

    public boolean onPreDraw() {
        View view = this.A01;
        C36351kA.A1D(view, this);
        ExpandableBehavior expandableBehavior = this.A03;
        if (expandableBehavior.A00 == this.A00) {
            C013705z r0 = this.A02;
            expandableBehavior.A0R((View) r0, view, ((AnonymousClass060) r0).A0D.A01, false);
        }
        return false;
    }
}
