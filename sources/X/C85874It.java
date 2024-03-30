package X;

import android.app.Activity;
import com.whatsapp.community.CommunityFragment;

/* renamed from: X.4It  reason: invalid class name and case insensitive filesystem */
public final class C85874It extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CommunityFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85874It(CommunityFragment communityFragment) {
        super(1);
        this.this$0 = communityFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass147 r3 = (AnonymousClass147) obj;
        AnonymousClass00C.A0D(r3, 0);
        CommunityFragment communityFragment = this.this$0;
        if (communityFragment.A08 != null) {
            Activity A01 = C24801Dv.A01(communityFragment.A1D(), AnonymousClass01L.class);
            A01.startActivity(AnonymousClass190.A0t(A01, r3));
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("communityNavigator");
    }
}
