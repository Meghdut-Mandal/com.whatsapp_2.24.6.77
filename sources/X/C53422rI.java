package X;

import com.whatsapp.wds.components.search.WDSSearchView;

/* renamed from: X.2rI  reason: invalid class name and case insensitive filesystem */
public abstract class C53422rI {
    public static final void A00(WDSSearchView wDSSearchView, AnonymousClass00S r3) {
        AnonymousClass00C.A0D(wDSSearchView, 0);
        if (wDSSearchView.hasWindowFocus()) {
            wDSSearchView.A08.requestFocus();
            wDSSearchView.post(new C1501574e(r3, 13));
            return;
        }
        wDSSearchView.getViewTreeObserver().addOnWindowFocusChangeListener(new C67233Za(wDSSearchView, r3));
        wDSSearchView.A08.requestFocus();
    }
}
