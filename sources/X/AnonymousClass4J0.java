package X;

import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4J0  reason: invalid class name */
public final class AnonymousClass4J0 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4J0(CommunityMembersViewModel communityMembersViewModel) {
        super(1);
        this.this$0 = communityMembersViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UserJid userJid = (UserJid) obj;
        AnonymousClass00C.A0D(userJid, 0);
        CommunityMembersViewModel communityMembersViewModel = this.this$0;
        if (communityMembersViewModel.A08.A09()) {
            CommunityMembersViewModel.A02(communityMembersViewModel, userJid);
        } else {
            AnonymousClass05L r3 = communityMembersViewModel.A0N;
            do {
            } while (!r3.B3B(r3.getValue(), new AnonymousClass2Ev(new AnonymousClass49I(communityMembersViewModel))));
        }
        return AnonymousClass0AJ.A00;
    }
}
