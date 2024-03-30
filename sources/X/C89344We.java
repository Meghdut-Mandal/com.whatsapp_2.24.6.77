package X;

import android.content.Context;
import com.whatsapp.inappsupport.ui.SupportVideoActivity;
import com.whatsapp.instrumentation.ui.InstrumentationAuthActivity;
import com.whatsapp.insufficientstoragespace.InsufficientStorageSpaceActivity;
import com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity;
import com.whatsapp.interopui.compose.InteropComposeSelectIntegratorActivity;
import com.whatsapp.interopui.optin.InteropOptInSelectIntegratorsActivity;
import com.whatsapp.interopui.setting.InteropSettingsActivity;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import com.whatsapp.invites.SMSPreviewInviteGroupParticipantsActivity;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.lastseen.PresencePrivacyActivity;
import com.whatsapp.location.LiveLocationPrivacyActivity;
import com.whatsapp.loginfailure.LogoutMessageActivity;
import com.whatsapp.mediaview.MediaViewActivity;
import com.whatsapp.messaging.ViewOnceViewerActivity;
import com.whatsapp.migration.export.ui.ExportMigrationDataExportedActivity;
import com.whatsapp.migration.transfer.ui.P2pTransferQrScannerActivity;
import com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector;
import com.whatsapp.newsletter.ui.ShareNewsletterInviteLinkActivity;
import com.whatsapp.newsletter.ui.delete.DeleteNewsletterActivity;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity;
import com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity;
import com.whatsapp.newsletter.ui.mv.NewsletterCreateMVUpsellActivity;
import com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity;
import com.whatsapp.newsletter.ui.mv.NewsletterSelectToUpgradeMVActivity;
import com.whatsapp.newsletter.ui.mv.NewsletterUpgradeToMVActivity;
import com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity;
import com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity;
import com.whatsapp.newsletter.ui.waitlist.NewsletterWaitListActivity;
import com.whatsapp.notification.OtpOneTapNotificationHandlerActivity;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.passkey.PasskeyCreateEducationScreen;
import com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactOmbudsmanActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactSupportP2pActivity;
import com.whatsapp.payments.ui.BrazilPaymentDPOActivity;
import com.whatsapp.payments.ui.BrazilPaymentIntegrityAppealActivity;
import com.whatsapp.payments.ui.BrazilPaymentReportPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.whatsapp.payments.ui.CheckoutLiteWebViewActivity;
import com.whatsapp.payments.ui.IndiaUpiContactPicker;
import com.whatsapp.payments.ui.IndiaUpiPaymentsBlockScreenShareActivity;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity;

/* renamed from: X.4We  reason: invalid class name and case insensitive filesystem */
public class C89344We implements C004101v {
    public Object A00;
    public final int A01;

    public C89344We(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass01G r1, int i) {
        r1.A1e(new C89344We(r1, i));
    }

    public void BUZ(Context context) {
        switch (this.A01) {
            case 0:
                ((SupportVideoActivity) this.A00).A2F();
                return;
            case 1:
                ((InstrumentationAuthActivity) this.A00).A2F();
                return;
            case 2:
                ((InsufficientStorageSpaceActivity) this.A00).A2F();
                return;
            case 3:
                ((InteropComposeEnterInfoActivity) this.A00).A2F();
                return;
            case 4:
                ((InteropComposeSelectIntegratorActivity) this.A00).A2F();
                return;
            case 5:
                ((InteropOptInSelectIntegratorsActivity) this.A00).A2F();
                return;
            case 6:
                ((InteropSettingsActivity) this.A00).A2F();
                return;
            case 7:
                ((InviteGroupParticipantsActivity) this.A00).A2F();
                return;
            case 8:
                ((SMSPreviewInviteGroupParticipantsActivity) this.A00).A2F();
                return;
            case 9:
                ((ViewGroupInviteActivity) this.A00).A2F();
                return;
            case 10:
                ((PresencePrivacyActivity) this.A00).A2F();
                return;
            case 11:
                ((LiveLocationPrivacyActivity) this.A00).A2F();
                return;
            case 12:
                ((LogoutMessageActivity) this.A00).A2F();
                return;
            case 13:
                ((MediaViewActivity) this.A00).A2F();
                return;
            case 14:
                ((ViewOnceViewerActivity) this.A00).A2F();
                return;
            case 15:
                ((ExportMigrationDataExportedActivity) this.A00).A2F();
                return;
            case 16:
                ((P2pTransferQrScannerActivity) this.A00).A2F();
                return;
            case 17:
                ((AnonymousClass2Dm) this.A00).A2F();
                return;
            case 18:
                ((InviteNewsletterAdminSelector) this.A00).A2F();
                return;
            case 20:
                ((ShareNewsletterInviteLinkActivity) this.A00).A2F();
                return;
            case 21:
                ((DeleteNewsletterActivity) this.A00).A2F();
                return;
            case 22:
                ((NewsletterDirectoryActivity) this.A00).A2F();
                return;
            case 24:
                ((NewsletterDirectoryCategoriesActivity) this.A00).A2F();
                return;
            case 25:
                ((NewsletterCreateMVActivity) this.A00).A2F();
                return;
            case 26:
                ((NewsletterCreateMVUpsellActivity) this.A00).A2F();
                return;
            case 27:
                ((NewsletterEditMVActivity) this.A00).A2F();
                return;
            case 28:
                ((NewsletterSelectToUpgradeMVActivity) this.A00).A2F();
                return;
            case 29:
                ((NewsletterUpgradeToMVActivity) this.A00).A2F();
                return;
            case 30:
                ((NewsletterSettingsActivity) this.A00).A2F();
                return;
            case 31:
                ((NewsletterTransferOwnershipActivity) this.A00).A2F();
                return;
            case 32:
                ((NewsletterWaitListActivity) this.A00).A2F();
                return;
            case 33:
                OtpOneTapNotificationHandlerActivity otpOneTapNotificationHandlerActivity = (OtpOneTapNotificationHandlerActivity) this.A00;
                if (!otpOneTapNotificationHandlerActivity.A05) {
                    otpOneTapNotificationHandlerActivity.A05 = true;
                    C18800tq r1 = ((C27111My) ((C27101Mx) otpOneTapNotificationHandlerActivity.generatedComponent())).A5g;
                    otpOneTapNotificationHandlerActivity.A00 = C36351kA.A0M(r1);
                    otpOneTapNotificationHandlerActivity.A04 = C36341k9.A0Z(r1);
                    otpOneTapNotificationHandlerActivity.A02 = (AnonymousClass1TF) r1.AV5.get();
                    otpOneTapNotificationHandlerActivity.A03 = C36351kA.A0n(r1);
                    otpOneTapNotificationHandlerActivity.A01 = (AnonymousClass1Y3) r1.A2N.get();
                    return;
                }
                return;
            case 34:
                ((PopupNotification) this.A00).A2F();
                return;
            case 35:
                ((PasskeyCreateEducationScreen) this.A00).A2F();
                return;
            case 36:
                ((IndiaUpiPaymentInvitePickerActivity) this.A00).A2F();
                return;
            case 37:
                ((C430424q) this.A00).A2F();
                return;
            case 38:
                ((BrazilPaymentContactOmbudsmanActivity) this.A00).A2F();
                return;
            case 39:
                ((AnonymousClass2ZX) this.A00).A2F();
                return;
            case 40:
                ((BrazilPaymentContactSupportP2pActivity) this.A00).A2F();
                return;
            case 41:
                ((BrazilPaymentDPOActivity) this.A00).A2F();
                return;
            case 42:
                ((BrazilPaymentIntegrityAppealActivity) this.A00).A2F();
                return;
            case 43:
                ((AnonymousClass24V) this.A00).A2F();
                return;
            case 44:
                ((BrazilPaymentReportPaymentActivity) this.A00).A2F();
                return;
            case 45:
                ((BrazilPaymentSettingsActivity) this.A00).A2F();
                return;
            case 46:
                ((CheckoutLiteWebViewActivity) this.A00).A2F();
                return;
            case 47:
                ((IndiaUpiContactPicker) this.A00).A2F();
                return;
            case 48:
                ((IndiaUpiPaymentsBlockScreenShareActivity) this.A00).A2F();
                return;
            case 49:
                ((IndiaUpiQrCodeScanActivity) this.A00).A2F();
                return;
            default:
                ((C225514w) this.A00).A2F();
                return;
        }
    }
}
