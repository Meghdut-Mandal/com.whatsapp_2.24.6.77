package X;

import com.whatsapp.R;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3tI  reason: invalid class name and case insensitive filesystem */
public class C79173tI implements C88634Tl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GroupChatInfoActivity A01;

    public C79173tI(GroupChatInfoActivity groupChatInfoActivity, int i) {
        this.A01 = groupChatInfoActivity;
        this.A00 = i;
    }

    public void BbO() {
        AnonymousClass3SJ.A00(this.A01, 1);
    }

    public void Bcz(boolean z) {
        Runnable runnable;
        Log.i("group_info/onclick_deleteGroup");
        int i = this.A00;
        GroupChatInfoActivity groupChatInfoActivity = this.A01;
        if (i == 8) {
            runnable = new AnonymousClass75B(37, (Object) groupChatInfoActivity, z);
        } else if (!AnonymousClass22g.A0q(groupChatInfoActivity)) {
            C36331k8.A1F(new C49882jq(groupChatInfoActivity, groupChatInfoActivity.A03, groupChatInfoActivity.A1Y, z), groupChatInfoActivity.A04);
            return;
        } else {
            runnable = C81053wO.A00;
        }
        if (C36431kI.A1R(groupChatInfoActivity)) {
            groupChatInfoActivity.Bu2(R.string.f12nameremoved, R.string.f12nameremoved);
            groupChatInfoActivity.A1P.A0A(new AnonymousClass2VO(groupChatInfoActivity.A0K, groupChatInfoActivity, groupChatInfoActivity.A1J, groupChatInfoActivity.A1Y, runnable));
            return;
        }
        groupChatInfoActivity.A05.A06(R.string.f12nameremoved, 0);
    }
}
