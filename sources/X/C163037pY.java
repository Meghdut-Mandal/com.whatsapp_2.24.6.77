package X;

import android.content.Context;
import com.whatsapp.polls.PollResultsActivity;
import com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerActivity;
import com.whatsapp.profile.WebImagePicker;
import com.whatsapp.settings.SettingsChatHistory;
import com.whatsapp.settings.SettingsJidNotificationActivity;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import com.whatsapp.wabloks.ui.WaBloksGenericBottomSheetActivity;
import com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity;
import com.whatsapp.waffle.wfac.ui.WfacBanActivity;
import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity;
import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity;

/* renamed from: X.7pY  reason: invalid class name and case insensitive filesystem */
public class C163037pY implements C004101v {
    public Object A00;
    public final int A01;

    public C163037pY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass01G r1, int i) {
        r1.A1e(new C163037pY(r1, i));
    }

    public void BUZ(Context context) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((PollResultsActivity) obj).A2F();
                return;
            case 1:
                ((PrivacyDisclosureContainerActivity) obj).A2F();
                return;
            case 2:
                ((WebImagePicker) obj).A2F();
                return;
            case 3:
                ((SettingsChatHistory) obj).A2F();
                return;
            case 4:
                ((SettingsJidNotificationActivity) obj).A2F();
                return;
            case 5:
                ((StickerStorePackPreviewActivity) obj).A2F();
                return;
            case 6:
                ((C107285Nl) obj).A2F();
                return;
            case 7:
                ((C100974wL) obj).A2F();
                return;
            case 8:
                ((AnonymousClass5OZ) obj).A2F();
                return;
            case 9:
                ((WaBloksGenericBottomSheetActivity) obj).A2F();
                return;
            case 10:
                ((AnonymousClass5OX) obj).A2F();
                return;
            case 11:
                ((C100984wM) obj).A2F();
                return;
            case 12:
                ((AnonymousClass5OT) obj).A2F();
                return;
            case 13:
                ((BloksCDSBottomSheetActivity) obj).A2F();
                return;
            case 14:
                ((WfacBanActivity) obj).A2F();
                return;
            case 15:
                ((AccountLinkingNativeAuthActivity) obj).A2F();
                return;
            default:
                ((AccountLinkingWebAuthActivity) obj).A2F();
                return;
        }
    }
}
