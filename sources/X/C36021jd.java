package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.1jd  reason: invalid class name and case insensitive filesystem */
public class C36021jd extends C24511Cs {
    public Object A00;
    public final int A01;

    public C36021jd(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C36021jd r1) {
        C34751ha r0;
        if (r1.A01 == 0 && (r0 = ((C34621hN) r1.A00).A07) != null) {
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
            if (!callsHistoryFragmentV2ViewModel.A0H) {
                Log.i("CallsHistoryViewModel/onHavingLeftGroup skip due to no active observer");
            } else if (callsHistoryFragmentV2ViewModel.A00 > 0) {
                callsHistoryFragmentV2ViewModel.A0M.A02();
            }
        }
    }

    public void A06(Set set) {
        switch (this.A01) {
            case 1:
                ((C34471h6) this.A00).A00.A0M(new ArrayList(set));
                return;
            case 2:
                ConversationsFragment.A0H((ConversationsFragment) this.A00);
                return;
            case 3:
                ((C24481Cp) this.A00).A0A();
                return;
            default:
                return;
        }
    }

    public void A04(AnonymousClass147 r1) {
        A00(this);
    }

    public void A05(AnonymousClass147 r1) {
        A00(this);
    }
}
