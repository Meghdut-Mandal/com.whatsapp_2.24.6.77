package X;

import android.content.Context;
import com.whatsapp.status.playback.StatusReplyActivity;
import com.whatsapp.status.seeall.StatusSeeAllActivity;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;
import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.support.Remove;
import com.whatsapp.support.faq.FaqItemActivity;
import com.whatsapp.systemstatus.SystemStatusActivity;
import com.whatsapp.textstatus.AddTextStatusActivity;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.whatsapp.thunderstorm.ThunderstormQrCodeActivity;
import com.whatsapp.twofactor.AddEmailActivity;
import com.whatsapp.twofactor.SettingsTwoFactorAuthActivity;
import com.whatsapp.twofactor.TwoFactorAuthActivity;
import com.whatsapp.updates.ui.statusmuting.MutedStatusesActivity;
import com.whatsapp.userban.ui.BanAppealActivity;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import com.whatsapp.waquickpromotionclient.ui.PushPsaNotificationActivity;
import com.whatsapp.writenfctag.WriteNfcTagActivity;
import com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity;
import com.whatsapp.xfamily.groups.ui.GroupMembersSelectorActivity;
import com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity;

/* renamed from: X.4Wh  reason: invalid class name and case insensitive filesystem */
public class C89374Wh implements C004101v {
    public Object A00;
    public final int A01;

    public C89374Wh(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass01G r1, int i) {
        r1.A1e(new C89374Wh(r1, i));
    }

    public void BUZ(Context context) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass261) this.A00).A2F();
                return;
            case 1:
                ((StatusReplyActivity) this.A00).A2F();
                return;
            case 2:
                ((StatusSeeAllActivity) this.A00).A2F();
                return;
            case 3:
                ((C430524r) this.A00).A2F();
                return;
            case 4:
                AddThirdPartyStickerPackActivity addThirdPartyStickerPackActivity = (AddThirdPartyStickerPackActivity) this.A00;
                if (!addThirdPartyStickerPackActivity.A03) {
                    addThirdPartyStickerPackActivity.A03 = true;
                    C27111My r2 = (C27111My) ((C27101Mx) addThirdPartyStickerPackActivity.generatedComponent());
                    C18800tq r1 = r2.A5g;
                    addThirdPartyStickerPackActivity.A02 = C36341k9.A0Z(r1);
                    addThirdPartyStickerPackActivity.A00 = C36351kA.A0g(r1);
                    addThirdPartyStickerPackActivity.A01 = C27111My.A3Q(r2);
                    return;
                }
                return;
            case 5:
                ((StorageUsageActivity) this.A00).A2F();
                return;
            case 6:
                ((AnonymousClass26R) this.A00).A2F();
                return;
            case 7:
                ((AnonymousClass26V) this.A00).A2F();
                return;
            case 8:
                Remove remove = (Remove) this.A00;
                if (!remove.A00) {
                    remove.A00 = true;
                    remove.generatedComponent();
                    return;
                }
                return;
            case 9:
                ((FaqItemActivity) this.A00).A2F();
                return;
            case 10:
                ((AnonymousClass27t) this.A00).A2F();
                return;
            case 11:
                ((SystemStatusActivity) this.A00).A2F();
                return;
            case 12:
                ((AddTextStatusActivity) this.A00).A2F();
                return;
            case 13:
                ((TextStatusComposerActivity) this.A00).A2F();
                return;
            case 14:
                ((C430124e) this.A00).A2F();
                return;
            case 15:
                ((ThunderstormQrCodeActivity) this.A00).A2F();
                return;
            case 16:
                ((AddEmailActivity) this.A00).A2F();
                return;
            case 17:
                ((SettingsTwoFactorAuthActivity) this.A00).A2F();
                return;
            case 18:
                ((TwoFactorAuthActivity) this.A00).A2F();
                return;
            case 19:
                ((MutedStatusesActivity) this.A00).A2F();
                return;
            case 20:
                ((BanAppealActivity) this.A00).A2F();
                return;
            case 21:
                ((ViewSharedContactArrayActivity) this.A00).A2F();
                return;
            case 22:
                ((PushPsaNotificationActivity) this.A00).A2F();
                return;
            case 23:
                ((AnonymousClass24Z) this.A00).A2F();
                return;
            case 24:
                ((WriteNfcTagActivity) this.A00).A2F();
                return;
            case 25:
                ((ShareToFacebookActivity) this.A00).A2F();
                return;
            case 26:
                ((GroupMembersSelectorActivity) this.A00).A2F();
                return;
            default:
                ((LinkExistingGroupActivity) this.A00).A2F();
                return;
        }
    }
}
