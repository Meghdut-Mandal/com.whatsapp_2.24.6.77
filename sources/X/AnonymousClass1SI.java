package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.HomeActivity;

/* renamed from: X.1SI  reason: invalid class name */
public class AnonymousClass1SI implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ HomeActivity A01;

    public AnonymousClass1SI(View view, HomeActivity homeActivity) {
        this.A01 = homeActivity;
        this.A00 = view;
    }

    public boolean onPreDraw() {
        this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        this.A01.A05.A0H(new C35641j1((Object) this, 33));
        return true;
    }
}
