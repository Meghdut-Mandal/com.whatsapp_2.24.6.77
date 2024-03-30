package X;

import com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity;
import com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel;
import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;
import com.whatsapp.settings.SettingsSetupUserProxyActivity;
import com.whatsapp.userban.ui.fragment.BanAppealFormFragment;

/* renamed from: X.4VZ  reason: invalid class name */
public class AnonymousClass4VZ extends AnonymousClass023 {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4VZ(Object obj, int i) {
        super(true);
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        switch (this.A01) {
            case 0:
                FavoriteCallListActivity favoriteCallListActivity = (FavoriteCallListActivity) this.A00;
                if (!favoriteCallListActivity.A09) {
                    ((FavoriteCallListViewModel) favoriteCallListActivity.A0B.getValue()).A0S(false);
                    return;
                } else {
                    favoriteCallListActivity.finish();
                    return;
                }
            case 1:
                ReportToAdminMessagesActivity.A01((ReportToAdminMessagesActivity) this.A00);
                return;
            case 2:
                SettingsSetupUserProxyActivity.A01((SettingsSetupUserProxyActivity) this.A00);
                return;
            default:
                ((BanAppealFormFragment) this.A00).A06.A0T();
                return;
        }
    }
}
