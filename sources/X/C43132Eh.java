package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.community.CommunityNavigationActivity;
import com.whatsapp.conversationslist.ViewHolder;

/* renamed from: X.2Eh  reason: invalid class name and case insensitive filesystem */
public class C43132Eh extends C34401gz {
    public final /* synthetic */ CommunityNavigationActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43132Eh(Context context, C19460v5 r2, CommunityNavigationActivity communityNavigationActivity, C20230xE r4) {
        super(context, r2, r4);
        this.A00 = communityNavigationActivity;
    }

    public View.OnCreateContextMenuListener BEe() {
        return new C67163Yt(this);
    }

    public boolean BaP(ViewHolder viewHolder, ViewHolder viewHolder2, AnonymousClass11F r4, int i) {
        this.A00.A0b = r4;
        return false;
    }
}
