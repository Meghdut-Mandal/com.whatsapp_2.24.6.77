package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import com.whatsapp.ConversationFragment;

/* renamed from: X.4Zb  reason: invalid class name and case insensitive filesystem */
public class C90094Zb implements ViewTreeObserver.OnGlobalLayoutListener {
    public Object A00;
    public final int A01;

    public C90094Zb(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onGlobalLayout() {
        boolean z;
        View findViewById;
        switch (this.A01) {
            case 0:
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.A00;
                C36351kA.A1C(horizontalScrollView, this);
                horizontalScrollView.fullScroll(66);
                return;
            case 1:
                ConversationFragment conversationFragment = (ConversationFragment) this.A00;
                C36351kA.A1C(conversationFragment.A02, this);
                C43472Ht r2 = conversationFragment.A02;
                if (r2.getWaBaseActivity() != null) {
                    r2.A04.A2W(true);
                    return;
                }
                return;
            default:
                AnonymousClass15G r5 = (AnonymousClass15G) this.A00;
                AnonymousClass1Q7 r4 = r5.A06;
                if (r4 != null) {
                    boolean z2 = true;
                    if (r5.A09) {
                        z = true;
                    } else {
                        View view = r5.A04;
                        z = false;
                        if (!(view == null || (findViewById = view.findViewById(r5.A00)) == null)) {
                            if (findViewById.getVisibility() != 0) {
                                z2 = false;
                            }
                            z = z2;
                        }
                    }
                    AnonymousClass1Q8 r42 = (AnonymousClass1Q8) r4;
                    r42.A03 = z;
                    C88814Ud r0 = r42.A00;
                    if (r0 != null) {
                        r0.setShouldHideCallDuration(z);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
