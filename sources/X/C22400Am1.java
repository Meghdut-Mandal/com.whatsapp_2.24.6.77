package X;

import android.os.Bundle;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.group.GroupRequireMembershipApprovalTooManyParticipantsDialog;

/* renamed from: X.Am1  reason: case insensitive filesystem */
public final class C22400Am1 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ GroupPermissionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22400Am1(GroupPermissionsActivity groupPermissionsActivity) {
        super(1);
        this.this$0 = groupPermissionsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C595534j r6 = (C595534j) obj;
        AnonymousClass00C.A0D(r6, 0);
        int i = r6.A01;
        int i2 = r6.A00;
        GroupRequireMembershipApprovalTooManyParticipantsDialog groupRequireMembershipApprovalTooManyParticipantsDialog = new GroupRequireMembershipApprovalTooManyParticipantsDialog();
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("remaining_capacity", i);
        A07.putInt("pending_request_count", i2);
        groupRequireMembershipApprovalTooManyParticipantsDialog.A17(A07);
        this.this$0.Btl(groupRequireMembershipApprovalTooManyParticipantsDialog, "group_join_request_group_too_full");
        return AnonymousClass0AJ.A00;
    }
}
