package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.HomeActivity;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.2vM  reason: invalid class name and case insensitive filesystem */
public class C55892vM implements AnonymousClass04S {
    public Object A00;
    public final int A01;

    public C55892vM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BTH(Object obj) {
        switch (this.A01) {
            case 0:
                HomeActivity.A14((HomeActivity) this.A00, (String) obj);
                return;
            case 1:
                HomeActivity.A15((HomeActivity) this.A00, false);
                return;
            case 4:
                ((ConversationsFragment) this.A00).A1I.setContentIndicatorText((String) obj);
                return;
            case 5:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                AnonymousClass3K5 r6 = (AnonymousClass3K5) obj;
                if (r6.A03.ordinal() != 0) {
                    AnonymousClass11F r2 = r6.A04.A0H;
                    if (r2 != null) {
                        C61953Ed r1 = r6.A05;
                        if (r1 == null || !r1.A00() || r1.A01 <= 0) {
                            View view = r6.A01;
                            if (view != null) {
                                ConversationsFragment.A0E(view, r6.A02, conversationsFragment, r2);
                                return;
                            }
                            return;
                        }
                        int i = r6.A00;
                        C34231gf r0 = conversationsFragment.A1Q;
                        if (r0 != null) {
                            i += r0.getCount();
                        }
                        ConversationsFragment.A0N(conversationsFragment, r2, i);
                        return;
                    }
                    return;
                }
                conversationsFragment.A1m((Intent) null, r6.A04);
                return;
            case 6:
                ConversationsFragment conversationsFragment2 = (ConversationsFragment) this.A00;
                if (obj == C51502nv.DISMISS_BUTTON) {
                    C36331k8.A0w(C19420v0.A00(conversationsFragment2.A1h), "is_chat_list_suggestions_dismissed", true);
                    conversationsFragment2.A1q(C36341k9.A0G(conversationsFragment2).getString(R.string.f12nameremoved), C36341k9.A0G(conversationsFragment2).getString(R.string.f12nameremoved), new C35161iF((Object) conversationsFragment2, 33));
                    return;
                }
                return;
            default:
                C36331k8.A1J(this.A00, obj);
                return;
        }
    }
}
