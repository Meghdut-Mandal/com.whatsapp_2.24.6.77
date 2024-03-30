package X;

import android.content.Context;
import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;
import com.whatsapp.conversation.conversationrow.message.reporttoadmin.reporttoadminreporterslist.ReportToAdminReportersActivity;
import com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity;
import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import com.whatsapp.conversationslist.ArchiveNotificationSettingActivity;
import com.whatsapp.conversationslist.ArchivedConversationsActivity;
import com.whatsapp.conversationslist.InteropConversationsActivity;
import com.whatsapp.conversationslist.LockedConversationsActivity;
import com.whatsapp.corruptinstallation.CorruptInstallationActivity;
import com.whatsapp.crop.CropImage;
import com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureActivity;
import com.whatsapp.dmsetting.ChangeDMSettingActivity;
import com.whatsapp.dmsetting.DisappearingMessagesSettingActivity;
import com.whatsapp.documentpicker.AudioPickerBottomSheetActivity;
import com.whatsapp.documentpicker.DocumentPickerBottomSheetActivity;
import com.whatsapp.email.EmailVerificationActivity;
import com.whatsapp.email.UpdateEmailActivity;
import com.whatsapp.email.VerifyEmailActivity;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.event.EventsActivity;
import com.whatsapp.events.EventCreationActivity;
import com.whatsapp.expiringgroups.ChangeExpiringGroupsSettingActivity;
import com.whatsapp.extensions.webview.WaFlowsWebViewBottomsheetModalActivity;
import com.whatsapp.framework.alerts.ui.AlertCardListActivity;
import com.whatsapp.gallerypicker.GalleryPickerLauncher;
import com.whatsapp.greenalert.GreenAlertActivity;
import com.whatsapp.group.EditGroupAdminsSelector;
import com.whatsapp.group.GroupAddPrivacyActivity;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.group.GroupMembersSelector;
import com.whatsapp.group.GroupPendingParticipantsActivity;
import com.whatsapp.group.GroupProfileEmojiEditor;
import com.whatsapp.group.HistorySettingActivity;
import com.whatsapp.group.newgroup.NewGroup;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.identity.ScanQrCodeActivity;
import com.whatsapp.inappbugreporting.BugReportingCategoriesActivity;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import com.whatsapp.inappsupport.ui.FaqItemActivityV2;
import com.whatsapp.inappsupport.ui.SupportAiActivity;

/* renamed from: X.4Wd  reason: invalid class name and case insensitive filesystem */
public class C89334Wd implements C004101v {
    public Object A00;
    public final int A01;

    public C89334Wd(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass01G r1, int i) {
        r1.A1e(new C89334Wd(r1, i));
    }

    public void BUZ(Context context) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass2JE) this.A00).A2F();
                return;
            case 1:
                ((ReportToAdminMessagesActivity) this.A00).A2F();
                return;
            case 2:
                ((ReportToAdminReportersActivity) this.A00).A2F();
                return;
            case 3:
                ((C225514w) this.A00).A2F();
                return;
            case 4:
                ((SelectedImageAndVideoAlbumActivity) this.A00).A2F();
                return;
            case 5:
                ((SingleSelectedMessageActivity) this.A00).A2F();
                return;
            case 6:
                ((ArchiveNotificationSettingActivity) this.A00).A2F();
                return;
            case 7:
                ((ArchivedConversationsActivity) this.A00).A2F();
                return;
            case 8:
                ((InteropConversationsActivity) this.A00).A2F();
                return;
            case 9:
                ((LockedConversationsActivity) this.A00).A2F();
                return;
            case 10:
                ((CorruptInstallationActivity) this.A00).A2F();
                return;
            case 11:
                ((CropImage) this.A00).A2F();
                return;
            case 12:
                ((ConsumerDisclosureActivity) this.A00).A2F();
                return;
            case 13:
                ((AnonymousClass26n) this.A00).A2F();
                return;
            case 14:
                ((ChangeDMSettingActivity) this.A00).A2F();
                return;
            case 15:
                ((DisappearingMessagesSettingActivity) this.A00).A2F();
                return;
            case 16:
                ((AudioPickerBottomSheetActivity) this.A00).A2F();
                return;
            case 17:
                ((AnonymousClass27s) this.A00).A2F();
                return;
            case 18:
                ((DocumentPickerBottomSheetActivity) this.A00).A2F();
                return;
            case 19:
                ((EmailVerificationActivity) this.A00).A2F();
                return;
            case 20:
                ((UpdateEmailActivity) this.A00).A2F();
                return;
            case 21:
                ((VerifyEmailActivity) this.A00).A2F();
                return;
            case 22:
                ((ChangeEphemeralSettingActivity) this.A00).A2F();
                return;
            case 23:
                ((EventsActivity) this.A00).A2F();
                return;
            case 24:
                ((EventCreationActivity) this.A00).A2F();
                return;
            case 25:
                ((ChangeExpiringGroupsSettingActivity) this.A00).A2F();
                return;
            case 26:
                ((WaFlowsWebViewBottomsheetModalActivity) this.A00).A2F();
                return;
            case 27:
                ((AlertCardListActivity) this.A00).A2F();
                return;
            case 28:
                ((AnonymousClass26l) this.A00).A2F();
                return;
            case 29:
                ((AnonymousClass26U) this.A00).A2F();
                return;
            case 30:
                GalleryPickerLauncher galleryPickerLauncher = (GalleryPickerLauncher) this.A00;
                if (!galleryPickerLauncher.A03) {
                    galleryPickerLauncher.A03 = true;
                    C18800tq r1 = ((C27111My) ((C27101Mx) galleryPickerLauncher.generatedComponent())).A5g;
                    galleryPickerLauncher.A01 = C36341k9.A0V(r1);
                    galleryPickerLauncher.A02 = C36391kE.A0k(r1);
                    galleryPickerLauncher.A00 = C36351kA.A0X(r1);
                    return;
                }
                return;
            case 31:
                ((C430224o) this.A00).A2F();
                return;
            case 32:
                ((GreenAlertActivity) this.A00).A2F();
                return;
            case 33:
                ((EditGroupAdminsSelector) this.A00).A2F();
                return;
            case 34:
                ((GroupAddPrivacyActivity) this.A00).A2F();
                return;
            case 35:
                ((GroupAdminPickerActivity) this.A00).A2F();
                return;
            case 36:
                ((GroupChatInfoActivity) this.A00).A2F();
                return;
            case 37:
                ((GroupMembersSelector) this.A00).A2F();
                return;
            case 38:
                ((GroupPendingParticipantsActivity) this.A00).A2F();
                return;
            case 39:
                ((GroupProfileEmojiEditor) this.A00).A2F();
                return;
            case 40:
                ((HistorySettingActivity) this.A00).A2F();
                return;
            case 41:
                ((NewGroup) this.A00).A2F();
                return;
            case 42:
                ((IdentityVerificationActivity) this.A00).A2F();
                return;
            case 43:
                ((ScanQrCodeActivity) this.A00).A2F();
                return;
            case 44:
                ((BugReportingCategoriesActivity) this.A00).A2F();
                return;
            case 45:
                ((InAppBugReportingActivity) this.A00).A2F();
                return;
            case 46:
                ((ContactUsActivity) this.A00).A2F();
                return;
            case 47:
                ((FaqItemActivityV2) this.A00).A2F();
                return;
            case 48:
                ((SupportAiActivity) this.A00).A2F();
                return;
            default:
                ((C430324p) this.A00).A2F();
                return;
        }
    }
}
