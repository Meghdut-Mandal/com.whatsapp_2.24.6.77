package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.0CL  reason: invalid class name */
public class AnonymousClass0CL extends C011705b {
    public Map A00 = new WeakHashMap();
    public final AnonymousClass0CK A01;

    public void A0d(View view, int i) {
        C011705b r0 = (C011705b) this.A00.get(view);
        if (r0 != null) {
            r0.A0d(view, i);
        } else {
            super.A0d(view, i);
        }
    }

    public void A0e(View view, AccessibilityEvent accessibilityEvent) {
        C011705b r0 = (C011705b) this.A00.get(view);
        if (r0 != null) {
            r0.A0e(view, accessibilityEvent);
        } else {
            super.A0e(view, accessibilityEvent);
        }
    }

    public void A0f(View view, AccessibilityEvent accessibilityEvent) {
        C011705b r0 = (C011705b) this.A00.get(view);
        if (r0 != null) {
            r0.A0f(view, accessibilityEvent);
        } else {
            super.A0f(view, accessibilityEvent);
        }
    }

    public boolean A0g(View view, AccessibilityEvent accessibilityEvent) {
        C011705b r0 = (C011705b) this.A00.get(view);
        if (r0 != null) {
            return r0.A0g(view, accessibilityEvent);
        }
        return this.A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean A0h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C011705b r0 = (C011705b) this.A00.get(viewGroup);
        if (r0 != null) {
            return r0.A0h(viewGroup, view, accessibilityEvent);
        }
        return super.A0h(viewGroup, view, accessibilityEvent);
    }

    public void A0i(View view, AccessibilityEvent accessibilityEvent) {
        C011705b r0 = (C011705b) this.A00.get(view);
        if (r0 != null) {
            r0.A0i(view, accessibilityEvent);
        } else {
            super.A0i(view, accessibilityEvent);
        }
    }

    public boolean A0j(View view, int i, Bundle bundle) {
        boolean A0j;
        RecyclerView recyclerView = this.A01.A00;
        if (recyclerView.A12() || recyclerView.getLayoutManager() == null) {
            return super.A0j(view, i, bundle);
        }
        C011705b r0 = (C011705b) this.A00.get(view);
        if (r0 != null) {
            A0j = r0.A0j(view, i, bundle);
        } else {
            A0j = super.A0j(view, i, bundle);
        }
        if (A0j) {
            return true;
        }
        return false;
    }

    public void A0k(View view, C07650Ys r4) {
        AnonymousClass0CP layoutManager;
        RecyclerView recyclerView = this.A01.A00;
        if (!recyclerView.A12() && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.A0a(view, r4);
            C011705b r0 = (C011705b) this.A00.get(view);
            if (r0 != null) {
                r0.A0k(view, r4);
                return;
            }
        }
        super.A0k(view, r4);
    }

    public AnonymousClass0X7 A0l(View view) {
        C011705b r0 = (C011705b) this.A00.get(view);
        if (r0 != null) {
            return r0.A0l(view);
        }
        return super.A0l(view);
    }

    public AnonymousClass0CL(AnonymousClass0CK r2) {
        this.A01 = r2;
    }
}
