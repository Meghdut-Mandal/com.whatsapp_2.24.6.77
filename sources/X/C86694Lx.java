package X;

import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.community.subgroup.views.CommunityViewGroupsView;

/* renamed from: X.4Lx  reason: invalid class name and case insensitive filesystem */
public final class C86694Lx extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass01L $activity;
    public final /* synthetic */ CommunityViewGroupsView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86694Lx(AnonymousClass01L r2, CommunityViewGroupsView communityViewGroupsView) {
        super(1);
        this.$activity = r2;
        this.this$0 = communityViewGroupsView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0I = AnonymousClass000.A0I(obj);
        Resources resources = this.$activity.getResources();
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L, A0I);
        String string = resources.getString(R.string.f12nameremoved, A0L);
        AnonymousClass00C.A08(string);
        this.this$0.A05.setTitle(string);
        return AnonymousClass0AJ.A00;
    }
}
