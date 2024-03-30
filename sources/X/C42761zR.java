package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.1zR  reason: invalid class name and case insensitive filesystem */
public class C42761zR extends AnonymousClass07S {
    public final /* synthetic */ PopupNotification A00;

    public C42761zR(PopupNotification popupNotification) {
        this.A00 = popupNotification;
    }

    public int A0H() {
        return C36371kC.A06(this.A00.A1J);
    }

    public Object A0I(ViewGroup viewGroup, int i) {
        PopupNotification popupNotification = this.A00;
        RelativeLayout relativeLayout = new RelativeLayout(popupNotification);
        ScrollView scrollView = new ScrollView(popupNotification);
        AnonymousClass3T1 A0n = C36411kG.A0n(popupNotification.A1J, i);
        View A01 = PopupNotification.A01(popupNotification, A0n);
        relativeLayout.setTag(A0n.A1J);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        scrollView.addView(A01);
        relativeLayout.addView(scrollView, layoutParams);
        viewGroup.addView(relativeLayout);
        return relativeLayout;
    }

    public void A0J(ViewGroup viewGroup, Object obj, int i) {
        viewGroup.removeView((View) obj);
    }

    public boolean A0K(View view, Object obj) {
        return C36361kB.A1a(view, obj);
    }
}
