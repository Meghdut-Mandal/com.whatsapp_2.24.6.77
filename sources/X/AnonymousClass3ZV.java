package X;

import android.view.ViewTreeObserver;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.3ZV  reason: invalid class name */
public class AnonymousClass3ZV implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AnonymousClass2Gc A00;
    public final /* synthetic */ AnonymousClass3BE A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass3ZV(AnonymousClass2Gc r1, AnonymousClass3BE r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }

    public boolean onPreDraw() {
        SelectionCheckView selectionCheckView = this.A01.A0F;
        C36351kA.A1D(selectionCheckView, this);
        selectionCheckView.A04(this.A02, true);
        return false;
    }
}
