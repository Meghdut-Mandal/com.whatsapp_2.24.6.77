package X;

import com.whatsapp.community.CommunityMembersViewModel;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.4Lv  reason: invalid class name and case insensitive filesystem */
public final class C86674Lv extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ UserJid $selectedUserJid;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86674Lv(CommunityMembersViewModel communityMembersViewModel, UserJid userJid) {
        super(1);
        this.this$0 = communityMembersViewModel;
        this.$selectedUserJid = userJid;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1902597m r8 = (C1902597m) obj;
        AnonymousClass00C.A0D(r8, 0);
        if (!(r8 instanceof C187048x9) || !((C199909gD) ((C187048x9) r8).A00).A04.isEmpty()) {
            CommunityMembersViewModel communityMembersViewModel = this.this$0;
            UserJid userJid = this.$selectedUserJid;
            AnonymousClass05L r4 = communityMembersViewModel.A0N;
            do {
            } while (!r4.B3B(r4.getValue(), new AnonymousClass2Ew(userJid, new AnonymousClass49J(communityMembersViewModel), new AnonymousClass4J0(communityMembersViewModel))));
        } else {
            CommunityMembersViewModel communityMembersViewModel2 = this.this$0;
            C28391Sm r1 = communityMembersViewModel2.A07;
            AnonymousClass147 r3 = communityMembersViewModel2.A0I;
            UserJid userJid2 = this.$selectedUserJid;
            AnonymousClass00C.A0D(userJid2, 1);
            AnonymousClass180 r12 = ((C28401Sn) r1).A08;
            synchronized (r12) {
                r12.A01(r3, Collections.singletonList(userJid2));
            }
            AnonymousClass05L r2 = this.this$0.A0N;
            do {
            } while (!r2.B3B(r2.getValue(), AnonymousClass2Ey.A00));
        }
        return AnonymousClass0AJ.A00;
    }
}
