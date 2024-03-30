package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.3Us  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C66113Us implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ConversationsFragment A01;

    public /* synthetic */ C66113Us(ConversationsFragment conversationsFragment, int i) {
        this.A01 = conversationsFragment;
        this.A00 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ConversationsFragment conversationsFragment = this.A01;
        int i = this.A00;
        int A012 = C36361kB.A01(valueAnimator);
        ViewGroup.LayoutParams layoutParams = conversationsFragment.A1J.A03.getLayoutParams();
        layoutParams.height = A012;
        conversationsFragment.A1J.A03.setLayoutParams(layoutParams);
        conversationsFragment.A1J.A02.setTranslationY((float) (A012 - i));
    }
}
