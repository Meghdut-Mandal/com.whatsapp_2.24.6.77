package X;

import com.whatsapp.community.communityInfo.CommunityHomeFragment;

/* renamed from: X.4JC  reason: invalid class name */
public final class AnonymousClass4JC extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CommunityHomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4JC(CommunityHomeFragment communityHomeFragment) {
        super(1);
        this.this$0 = communityHomeFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        CommunityHomeFragment communityHomeFragment = this.this$0;
        AnonymousClass00C.A0B(bool);
        if (bool.booleanValue()) {
            AnonymousClass3AS r3 = communityHomeFragment.A01;
            if (r3 == null) {
                throw C36331k8.A0d("subgroupsComponent");
            }
            r3.A05.BnA(new C89114Vh(r3, 1));
        }
        return AnonymousClass0AJ.A00;
    }
}
