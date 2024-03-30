package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0CK  reason: invalid class name */
public class AnonymousClass0CK extends C011705b {
    public final RecyclerView A00;
    public final AnonymousClass0CL A01;

    public AnonymousClass0CK(RecyclerView recyclerView) {
        AnonymousClass0CL r1;
        this.A00 = recyclerView;
        C011705b A0m = A0m();
        if (A0m == null || !(A0m instanceof AnonymousClass0CL)) {
            r1 = new AnonymousClass0CL(this);
        } else {
            r1 = (AnonymousClass0CL) A0m;
        }
        this.A01 = r1;
    }

    public void A0i(View view, AccessibilityEvent accessibilityEvent) {
        AnonymousClass0CP layoutManager;
        super.A0i(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.A00.A12() && (layoutManager = ((RecyclerView) view).getLayoutManager()) != null) {
            layoutManager.A1B(accessibilityEvent);
        }
    }

    public boolean A0j(View view, int i, Bundle bundle) {
        AnonymousClass0CP layoutManager;
        if (super.A0j(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView.A12() || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return false;
        }
        RecyclerView recyclerView2 = layoutManager.A07;
        return layoutManager.A0i(bundle, recyclerView2.A0x, recyclerView2.A0y, i);
    }

    public void A0k(View view, C07650Ys r5) {
        AnonymousClass0CP layoutManager;
        super.A0k(view, r5);
        RecyclerView recyclerView = this.A00;
        if (!recyclerView.A12() && (layoutManager = recyclerView.getLayoutManager()) != null) {
            RecyclerView recyclerView2 = layoutManager.A07;
            layoutManager.A0b(r5, recyclerView2.A0x, recyclerView2.A0y);
        }
    }

    public C011705b A0m() {
        return this.A01;
    }
}
