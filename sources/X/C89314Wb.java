package X;

import android.content.Context;
import com.whatsapp.CatalogMediaView;
import com.whatsapp.ShareCatalogLinkActivity;
import com.whatsapp.ShareProductLinkActivity;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.account.delete.DeleteAccountActivity;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.account.delete.DeleteAccountFeedback;
import com.whatsapp.accountswitching.routing.AccountSwitchingRoutingActivity;
import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.avatar.home.AvatarHomeActivity;
import com.whatsapp.avatar.privacy.AvatarStickerPrivacySettings;
import com.whatsapp.backup.encryptedbackup.EncBackupMainActivity;
import com.whatsapp.backup.google.RestoreTransferSelectorActivity;
import com.whatsapp.biz.compliance.view.BusinessComplianceDetailActivity;
import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaView;
import com.whatsapp.biz.linkedaccounts.LinkedIGPostsSummaryViewActivity;
import com.whatsapp.biz.product.view.activity.ProductBottomSheetTransparentActivity;
import com.whatsapp.blockbusiness.BlockBusinessActivity;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryActivity;
import com.whatsapp.bonsai.onboarding.BonsaiOnboardingActivity;
import com.whatsapp.bridge.wfs.ui.LinkedUsersActivity;
import com.whatsapp.businessupsell.BusinessAppEducation;
import com.whatsapp.businessupsell.BusinessProfileEducation;
import com.whatsapp.calling.VoipAppUpdateActivity;
import com.whatsapp.calling.VoipNotAllowedActivity;
import com.whatsapp.calling.VoipPermissionsActivity;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet;
import com.whatsapp.calling.calllink.view.CallLinkActivity;
import com.whatsapp.calling.favorite.FavoritePicker;
import com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity;
import com.whatsapp.calling.psa.view.GroupCallPsaActivity;
import com.whatsapp.calling.schedulecall.upcomingcalls.view.UpcomingScheduledCallsActivity;
import com.whatsapp.calling.spam.CallSpamActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.chatlock.ChatLockConfirmSecretCodeActivity;
import com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity;

/* renamed from: X.4Wb  reason: invalid class name and case insensitive filesystem */
public class C89314Wb implements C004101v {
    public Object A00;
    public final int A01;

    public C89314Wb(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass01G r1, int i) {
        r1.A1e(new C89314Wb(r1, i));
    }

    public void BUZ(Context context) {
        switch (this.A01) {
            case 0:
                ((C429924c) this.A00).A2F();
                return;
            case 1:
                ((CatalogMediaView) this.A00).A2F();
                return;
            case 2:
                ((C43462Hr) this.A00).A2F();
                return;
            case 3:
                ((AnonymousClass24I) this.A00).A2F();
                return;
            case 4:
                ((AnonymousClass27h) this.A00).A2F();
                return;
            case 5:
                ((ShareCatalogLinkActivity) this.A00).A2F();
                return;
            case 7:
                ((ShareProductLinkActivity) this.A00).A2F();
                return;
            case 9:
                ((AcceptInviteLinkActivity) this.A00).A2F();
                return;
            case 10:
                ((DeleteAccountActivity) this.A00).A2F();
                return;
            case 11:
                ((DeleteAccountConfirmation) this.A00).A2F();
                return;
            case 12:
                ((DeleteAccountFeedback) this.A00).A2F();
                return;
            case 13:
                AccountSwitchingRoutingActivity accountSwitchingRoutingActivity = (AccountSwitchingRoutingActivity) this.A00;
                if (!accountSwitchingRoutingActivity.A07) {
                    accountSwitchingRoutingActivity.A07 = true;
                    C18800tq r1 = ((C27111My) ((C27101Mx) accountSwitchingRoutingActivity.generatedComponent())).A5g;
                    accountSwitchingRoutingActivity.A01 = C36351kA.A0R(r1);
                    accountSwitchingRoutingActivity.A06 = (C21570zS) r1.A9Z.get();
                    accountSwitchingRoutingActivity.A00 = (AnonymousClass1VX) r1.A1V.get();
                    accountSwitchingRoutingActivity.A03 = C36351kA.A0Y(r1);
                    accountSwitchingRoutingActivity.A02 = (AnonymousClass6TO) r1.AAB.get();
                    accountSwitchingRoutingActivity.A05 = (AnonymousClass12U) r1.A7L.get();
                    accountSwitchingRoutingActivity.A04 = (C19900wh) r1.A9J.get();
                    return;
                }
                return;
            case 14:
                ((AnonymousClass27q) this.A00).A2F();
                return;
            case 15:
                ((AppAuthSettingsActivity) this.A00).A2F();
                return;
            case 16:
                ((AppAuthenticationActivity) this.A00).A2F();
                return;
            case 17:
                ((C430024d) this.A00).A2F();
                return;
            case 18:
                ((AvatarHomeActivity) this.A00).A2F();
                return;
            case 19:
                ((AvatarStickerPrivacySettings) this.A00).A2F();
                return;
            case 20:
                ((EncBackupMainActivity) this.A00).A2F();
                return;
            case 21:
                ((RestoreTransferSelectorActivity) this.A00).A2F();
                return;
            case 22:
                ((BusinessComplianceDetailActivity) this.A00).A2F();
                return;
            case 23:
                ((LinkedAccountMediaView) this.A00).A2F();
                return;
            case 24:
                ((LinkedIGPostsSummaryViewActivity) this.A00).A2F();
                return;
            case 25:
                ((ProductBottomSheetTransparentActivity) this.A00).A2F();
                return;
            case 26:
                ((BlockBusinessActivity) this.A00).A2F();
                return;
            case 27:
                ((BonsaiDiscoveryActivity) this.A00).A2F();
                return;
            case 28:
                ((BonsaiOnboardingActivity) this.A00).A2F();
                return;
            case 29:
                ((LinkedUsersActivity) this.A00).A2F();
                return;
            case 30:
                ((BusinessAppEducation) this.A00).A2F();
                return;
            case 31:
                ((BusinessProfileEducation) this.A00).A2F();
                return;
            case 32:
                ((VoipAppUpdateActivity) this.A00).A2F();
                return;
            case 33:
                ((VoipNotAllowedActivity) this.A00).A2F();
                return;
            case 34:
                VoipPermissionsActivity voipPermissionsActivity = (VoipPermissionsActivity) this.A00;
                if (!voipPermissionsActivity.A08) {
                    voipPermissionsActivity.A08 = true;
                    C18800tq r12 = ((C27111My) ((C27101Mx) voipPermissionsActivity.generatedComponent())).A5g;
                    voipPermissionsActivity.A00 = C36351kA.A0M(r12);
                    voipPermissionsActivity.A06 = C36351kA.A0g(r12);
                    voipPermissionsActivity.A07 = C36351kA.A0q(r12);
                    voipPermissionsActivity.A01 = C36391kE.A0Y(r12);
                    voipPermissionsActivity.A02 = C36341k9.A0R(r12);
                    voipPermissionsActivity.A04 = (AnonymousClass1HJ) r12.A1O.get();
                    voipPermissionsActivity.A03 = C36351kA.A0X(r12);
                    voipPermissionsActivity.A05 = C36341k9.A0V(r12);
                    return;
                }
                return;
            case 35:
                ((CallLogActivity) this.A00).A2F();
                return;
            case 36:
                ((GroupCallLogActivity) this.A00).A2F();
                return;
            case 37:
                ((AnonymousClass2GG) this.A00).A2F();
                return;
            case 38:
                ((GroupCallParticipantPickerSheet) this.A00).A2F();
                return;
            case 39:
                ((CallLinkActivity) this.A00).A2F();
                return;
            case 40:
                ((FavoritePicker) this.A00).A2F();
                return;
            case 41:
                ((FavoriteCallListActivity) this.A00).A2F();
                return;
            case 42:
                ((GroupCallPsaActivity) this.A00).A2F();
                return;
            case 43:
                ((UpcomingScheduledCallsActivity) this.A00).A2F();
                return;
            case 44:
                ((CallSpamActivity) this.A00).A2F();
                return;
            case 46:
                ((ContactInfoActivity) this.A00).A2F();
                return;
            case 47:
                ((ListChatInfoActivity) this.A00).A2F();
                return;
            case 48:
                ((ChatLockConfirmSecretCodeActivity) this.A00).A2F();
                return;
            case 49:
                ((ChatLockCreateSecretCodeActivity) this.A00).A2F();
                return;
            default:
                ((C225514w) this.A00).A2F();
                return;
        }
    }
}
