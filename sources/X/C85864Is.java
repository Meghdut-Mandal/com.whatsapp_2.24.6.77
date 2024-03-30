package X;

import com.whatsapp.community.CommunityFragment;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.4Is  reason: invalid class name and case insensitive filesystem */
public final class C85864Is extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CommunityFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85864Is(CommunityFragment communityFragment) {
        super(1);
        this.this$0 = communityFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GroupJid groupJid = (GroupJid) obj;
        AnonymousClass00C.A0D(groupJid, 0);
        CommunityFragment communityFragment = this.this$0;
        C28431Sq r1 = communityFragment.A08;
        if (r1 != null) {
            r1.Bkw(communityFragment.A0d(), communityFragment, groupJid);
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("communityNavigator");
    }
}
