package X;

import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.whatsapp.group.GroupPendingRequestsViewModel$sendAction$1;
import java.util.List;

/* renamed from: X.Aly  reason: case insensitive filesystem */
public final class C22397Aly extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ GroupMembershipApprovalRequestsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22397Aly(GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        super(1);
        this.this$0 = groupMembershipApprovalRequestsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C16310ox r1;
        int A0I = AnonymousClass000.A0I(obj);
        AnonymousClass17Y r0 = this.this$0.A01;
        if (r0 != null) {
            if (r0.A0M()) {
                C167727yh r4 = this.this$0.A06;
                if (r4 == null) {
                    throw C36331k8.A0a();
                }
                List A0w = C36401kF.A0w(r4.A02);
                if (A0w != null) {
                    r1 = (C16310ox) A0w.get(A0I);
                } else {
                    r1 = null;
                }
                if (r1 instanceof ACW) {
                    ACW acw = (ACW) r1;
                    C188508zh r2 = C188508zh.A03;
                    acw.A04 = r2;
                    r4.A04.A0C(r1);
                    C36331k8.A1T(new GroupPendingRequestsViewModel$sendAction$1(r2, acw, r4, (C023509x) null, A0I), C109325Xd.A00(r4));
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("globalUi");
    }
}
