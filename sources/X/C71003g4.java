package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.community.CommunityNavigationActivity;

/* renamed from: X.3g4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71003g4 implements C33391fF {
    public final /* synthetic */ CommunityNavigationActivity A00;

    public /* synthetic */ C71003g4(CommunityNavigationActivity communityNavigationActivity) {
        this.A00 = communityNavigationActivity;
    }

    public final void B03(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        CommunityNavigationActivity communityNavigationActivity = this.A00;
        if (!communityNavigationActivity.isFinishing() && !communityNavigationActivity.isDestroyed()) {
            C99304t3 A01 = C99304t3.A01(communityNavigationActivity.findViewById(16908290), charSequence, 0);
            A01.A0Z(charSequence2, onClickListener);
            A01.A0X(C36351kA.A01(communityNavigationActivity, R.attr.f4nameremoved, R.color.f6nameremoved));
            A01.A0P();
        }
    }
}
