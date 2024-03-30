package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;

/* renamed from: X.1ra  reason: invalid class name and case insensitive filesystem */
public class C39251ra extends C011705b {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DynamicButtonsLayout A01;

    public C39251ra(DynamicButtonsLayout dynamicButtonsLayout, int i) {
        this.A01 = dynamicButtonsLayout;
        this.A00 = i;
    }

    public void A0k(View view, C07650Ys r7) {
        super.A0k(view, r7);
        DynamicButtonsLayout dynamicButtonsLayout = this.A01;
        r7.A0A(new AnonymousClass0Yd(16, (CharSequence) C36381kD.A0r(dynamicButtonsLayout.getContext(), ((AnonymousClass3EY) dynamicButtonsLayout.A02.get(this.A00)).A03, AnonymousClass001.A0L(), R.string.f12nameremoved)));
    }
}
