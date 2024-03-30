package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.3Zc  reason: invalid class name and case insensitive filesystem */
public class C67253Zc implements Animation.AnimationListener {
    public final int A00;
    public final /* synthetic */ PhoneContactsSelector A01;

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    public C67253Zc(PhoneContactsSelector phoneContactsSelector, int i) {
        this.A01 = phoneContactsSelector;
        this.A00 = i;
    }

    public void onAnimationEnd(Animation animation) {
        PhoneContactsSelector phoneContactsSelector = this.A01;
        phoneContactsSelector.A03.clearAnimation();
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(phoneContactsSelector.A03);
        A0a.setMargins(A0a.leftMargin, this.A00, A0a.rightMargin, A0a.bottomMargin);
        phoneContactsSelector.A03.setLayoutParams(A0a);
    }
}
