package X;

import android.view.ViewTreeObserver;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.9vD  reason: invalid class name and case insensitive filesystem */
public class C207439vD implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C166357vb A00;
    public final /* synthetic */ AnonymousClass9LY A01;
    public final /* synthetic */ boolean A02;

    public C207439vD(C166357vb r1, AnonymousClass9LY r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }

    public boolean onPreDraw() {
        AnonymousClass9LY r3 = this.A01;
        r3.A02.getViewTreeObserver().removeOnPreDrawListener(this);
        SelectionCheckView selectionCheckView = r3.A02;
        boolean z = this.A02;
        selectionCheckView.A04(z, true);
        C166357vb.A00(this.A00, r3.A02, z);
        return false;
    }
}
