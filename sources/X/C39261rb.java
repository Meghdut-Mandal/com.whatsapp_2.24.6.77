package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whatsapp.WaTabLayout;

/* renamed from: X.1rb  reason: invalid class name and case insensitive filesystem */
public class C39261rb extends C011705b {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ WaTabLayout A02;

    public C39261rb(View view, WaTabLayout waTabLayout, int i) {
        this.A02 = waTabLayout;
        this.A01 = view;
        this.A00 = i;
    }

    public void A0k(View view, C07650Ys r5) {
        super.A0k(view, r5);
        r5.A07(this.A01);
        r5.A0K(new AnonymousClass0SL(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, this.A00, 1, false)));
    }
}
