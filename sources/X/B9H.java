package X;

import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel;

public class B9H implements AnonymousClass04G {
    public Object A00;
    public final int A01;

    public B9H(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public AnonymousClass04R B3o(Class cls) {
        C200169gl r0;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment = (GroupMembershipApprovalRequestsFragment) obj;
                C191609Dq r1 = groupMembershipApprovalRequestsFragment.A00;
                if (r1 != null) {
                    AnonymousClass147 r12 = groupMembershipApprovalRequestsFragment.A07;
                    if (r12 != null) {
                        C19970wo A0V = C36351kA.A0V(r1.A00.A02);
                        C32591ds r2 = r1.A00;
                        C18800tq r13 = r2.A02;
                        C19770wU A0Z = C36341k9.A0Z(r13);
                        C220412q A0a = C36351kA.A0a(r13);
                        C21010yW A0g = C36351kA.A0g(r13);
                        return new C167727yh((AnonymousClass1LV) r13.A1q.get(), C36341k9.A0R(r13), C36341k9.A0S(r13), A0V, A0a, (AnonymousClass1PF) r13.A3s.get(), C36351kA.A0b(r13), A0g, C32581dr.A0S(r2.A01), r12, A0Z);
                    }
                    throw C36331k8.A0d("groupJid");
                }
                throw C36331k8.A0d("pendingRequestsViewModelFactory");
            case 1:
                r0 = ((IndiaUpiNumberSettingsActivity) obj).A0E;
                break;
            default:
                r0 = ((IndiaUpiProfileDetailsActivity) obj).A05;
                break;
        }
        return new IndiaUpiNumberSettingsViewModel(r0);
    }

    public /* synthetic */ AnonymousClass04R B46(AnonymousClass04K r2, Class cls) {
        return AnonymousClass0QC.A00(this, cls);
    }
}
