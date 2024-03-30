package X;

import android.content.Context;
import com.whatsapp.chatlock.ChatLockPrivacySettingsActivity;
import com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity;
import com.whatsapp.chatlock.ChatLockSettingsActivity;
import com.whatsapp.chatlock.HideLockedChatsActivity;
import com.whatsapp.community.CommunityHomeActivity;
import com.whatsapp.community.CommunityMembersActivity;
import com.whatsapp.community.CommunityNUXActivity;
import com.whatsapp.community.CommunityNavigationActivity;
import com.whatsapp.community.CommunitySettingsActivity;
import com.whatsapp.community.EditCommunityActivity;
import com.whatsapp.community.LinkExistingGroups;
import com.whatsapp.community.ManageGroupsInCommunityActivity;
import com.whatsapp.community.NewCommunityActivity;
import com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity;
import com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity;
import com.whatsapp.companiondevice.CompanionHelloConfirmationActivity;
import com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity;
import com.whatsapp.companiondevice.LinkedDevicesActivity;
import com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity;
import com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity;
import com.whatsapp.companionmode.registration.CompanionBootstrapActivity;
import com.whatsapp.companionmode.registration.CompanionPostLogoutActivity;
import com.whatsapp.companionmode.registration.RegisterAsCompanionActivity;
import com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity;
import com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity;
import com.whatsapp.contact.contactform.ContactFormActivity;
import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import com.whatsapp.contact.picker.AudienceSelectionContactPicker;
import com.whatsapp.contact.picker.ContactPickerHelp;
import com.whatsapp.contact.picker.ContactsAttachmentSelectorBottomSheet;
import com.whatsapp.contact.picker.ListMembersSelector;
import com.whatsapp.contact.picker.PhoneContactsSelectorBottomSheet;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.contact.picker.nativecontacts.NativeContactsMultipleContactPicker;
import com.whatsapp.contact.picker.nativecontacts.NativeContactsOptInActivity;
import com.whatsapp.contextualhelp.ContextualHelpActivity;
import com.whatsapp.conversation.EditBroadcastRecipientsSelector;
import com.whatsapp.conversation.EditMessageActivity;
import com.whatsapp.conversation.conversationrow.ContactSyncActivity;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.KeptMessagesActivity;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;

/* renamed from: X.4Wc  reason: invalid class name and case insensitive filesystem */
public class C89324Wc implements C004101v {
    public Object A00;
    public final int A01;

    public C89324Wc(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass01G r1, int i) {
        r1.A1e(new C89324Wc(r1, i));
    }

    public void BUZ(Context context) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((ChatLockPrivacySettingsActivity) obj).A2F();
                return;
            case 1:
                ((ChatLockRequestAuthInterstitialActivity) obj).A2F();
                return;
            case 2:
                ((ChatLockSettingsActivity) obj).A2F();
                return;
            case 3:
                ((HideLockedChatsActivity) obj).A2F();
                return;
            case 4:
                ((CommunityHomeActivity) obj).A2F();
                return;
            case 5:
                ((CommunityMembersActivity) obj).A2F();
                return;
            case 6:
                ((CommunityNUXActivity) obj).A2F();
                return;
            case 7:
                ((CommunityNavigationActivity) obj).A2F();
                return;
            case 8:
                ((CommunitySettingsActivity) obj).A2F();
                return;
            case 9:
                ((EditCommunityActivity) obj).A2F();
                return;
            case 10:
                ((LinkExistingGroups) obj).A2F();
                return;
            case 11:
                ((ManageGroupsInCommunityActivity) obj).A2F();
                return;
            case 12:
                ((NewCommunityActivity) obj).A2F();
                return;
            case 14:
                ((ReviewGroupsPermissionsBeforeLinkActivity) obj).A2F();
                return;
            case 15:
                ((DeactivateCommunityDisclaimerActivity) obj).A2F();
                return;
            case 16:
                ((MemberSuggestedGroupsManagementActivity) obj).A2F();
                return;
            case 17:
                ((CompanionHelloConfirmationActivity) obj).A2F();
                return;
            case 18:
                ((LinkedDeviceEditDeviceActivity) obj).A2F();
                return;
            case 19:
                ((LinkedDevicesActivity) obj).A2F();
                return;
            case 20:
                ((LinkedDevicesEnterCodeActivity) obj).A2F();
                return;
            case 21:
                ((ForcedOptInActivity) obj).A2F();
                return;
            case 22:
                ((CompanionBootstrapActivity) obj).A2F();
                return;
            case 23:
                ((CompanionPostLogoutActivity) obj).A2F();
                return;
            case 24:
                ((RegisterAsCompanionActivity) obj).A2F();
                return;
            case 25:
                ((RegisterAsCompanionEnterNumberActivity) obj).A2F();
                return;
            case 26:
                ((RegisterAsCompanionLinkCodeActivity) obj).A2F();
                return;
            case 27:
                ((ContactFormActivity) obj).A2F();
                return;
            case 28:
                ((AddGroupParticipantsSelector) obj).A2F();
                return;
            case 29:
                ((AudienceSelectionContactPicker) obj).A2F();
                return;
            case 30:
                ((AnonymousClass24H) obj).A2F();
                return;
            case 31:
                ((ContactPickerHelp) obj).A2F();
                return;
            case 32:
                ((AnonymousClass2GH) obj).A2F();
                return;
            case 33:
                ((ContactsAttachmentSelectorBottomSheet) obj).A2F();
                return;
            case 34:
                ((ListMembersSelector) obj).A2F();
                return;
            case 35:
                ((AnonymousClass27r) obj).A2F();
                return;
            case 36:
                ((PhoneContactsSelectorBottomSheet) obj).A2F();
                return;
            case 37:
                ((InviteNonWhatsAppContactPickerActivity) obj).A2F();
                return;
            case 38:
                ((NativeContactsMultipleContactPicker) obj).A2F();
                return;
            case 39:
                ((NativeContactsOptInActivity) obj).A2F();
                return;
            case 40:
                ((ContextualHelpActivity) obj).A2F();
                return;
            case 41:
                ((EditBroadcastRecipientsSelector) obj).A2F();
                return;
            case 42:
                ((EditMessageActivity) obj).A2F();
                return;
            case 43:
                ((ContactSyncActivity) obj).A2F();
                return;
            case 46:
                ((MediaAlbumActivity) obj).A2F();
                return;
            case 47:
                ((KeptMessagesActivity) obj).A2F();
                return;
            case 48:
                ((MessageDetailsActivity) obj).A2F();
                return;
            default:
                ((C225514w) obj).A2F();
                return;
        }
    }
}
