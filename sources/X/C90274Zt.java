package X;

import com.whatsapp.community.communityInfo.CAGInfoViewModel;
import com.whatsapp.group.GroupChatInfoActivity;

/* renamed from: X.4Zt  reason: invalid class name and case insensitive filesystem */
public class C90274Zt implements C87824Qh {
    public Object A00;
    public final int A01;

    public C90274Zt(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bjx() {
        if (this.A01 != 0) {
            GroupChatInfoActivity.A19((GroupChatInfoActivity) this.A00);
        } else {
            CAGInfoViewModel.A02((CAGInfoViewModel) this.A00);
        }
    }
}
