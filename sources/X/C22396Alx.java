package X;

import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.whatsapp.group.GroupPendingRequestsViewModel$sendAction$1;
import java.util.List;

/* renamed from: X.Alx  reason: case insensitive filesystem */
public final class C22396Alx extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ GroupMembershipApprovalRequestsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22396Alx(GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        super(1);
        this.this$0 = groupMembershipApprovalRequestsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C16310ox r2;
        int A0I = AnonymousClass000.A0I(obj);
        AnonymousClass17Y r0 = this.this$0.A01;
        if (r0 != null) {
            if (r0.A0M()) {
                C167727yh r5 = this.this$0.A06;
                if (r5 == null) {
                    throw C36331k8.A0a();
                }
                List A0w = C36401kF.A0w(r5.A02);
                if (A0w != null) {
                    r2 = (C16310ox) A0w.get(A0I);
                } else {
                    r2 = null;
                }
                if (r2 instanceof ACW) {
                    ACW acw = (ACW) r2;
                    C188508zh r3 = C188508zh.A02;
                    acw.A04 = r3;
                    acw.A01 = C19970wo.A00(r5.A08);
                    r5.A04.A0C(r2);
                    C36331k8.A1T(new GroupPendingRequestsViewModel$sendAction$1(r3, acw, r5, (C023509x) null, A0I), C109325Xd.A00(r5));
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("globalUi");
    }
}
