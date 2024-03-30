package X;

import android.view.ViewTreeObserver;
import com.whatsapp.wds.components.search.WDSSearchView;

/* renamed from: X.3Za  reason: invalid class name and case insensitive filesystem */
public final class C67233Za implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ WDSSearchView A00;
    public final /* synthetic */ AnonymousClass00S A01;

    public C67233Za(WDSSearchView wDSSearchView, AnonymousClass00S r2) {
        this.A00 = wDSSearchView;
        this.A01 = r2;
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            WDSSearchView wDSSearchView = this.A00;
            wDSSearchView.post(new C1501574e(this.A01, 13));
            wDSSearchView.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
