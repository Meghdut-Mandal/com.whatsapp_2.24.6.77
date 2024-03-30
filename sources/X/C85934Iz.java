package X;

import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Iz  reason: invalid class name and case insensitive filesystem */
public final class C85934Iz extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85934Iz(CommunityMembersViewModel communityMembersViewModel) {
        super(1);
        this.this$0 = communityMembersViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UserJid userJid = (UserJid) obj;
        AnonymousClass00C.A0D(userJid, 0);
        CommunityMembersViewModel.A02(this.this$0, userJid);
        return AnonymousClass0AJ.A00;
    }
}
