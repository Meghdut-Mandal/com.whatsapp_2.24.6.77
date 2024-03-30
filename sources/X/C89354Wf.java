package X;

import android.content.Context;
import com.whatsapp.payments.ui.PaymentContactPicker;
import com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperConfirmationActivity;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperPendingActivity;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity;
import com.whatsapp.permissions.RequestNotificationPermissionActivity;
import com.whatsapp.phonematching.CountryPicker;
import com.whatsapp.privacy.checkup.PrivacyCheckupHomeActivity;
import com.whatsapp.product.integrityappeals.NewsletterRequestReviewActivity;
import com.whatsapp.product.integrityappeals.NewsletterRequestReviewSelectReasonActivity;
import com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsActivity;
import com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeActivity;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity;
import com.whatsapp.product.newsletterenforcements.geosuspend.NewsletterGeosuspensionInfoActivity;
import com.whatsapp.product.newsletterenforcements.suspension.NewsletterSuspensionInfoActivity;
import com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsActivity;
import com.whatsapp.profile.AboutStatusPrivacyActivity;
import com.whatsapp.profile.CapturePhoto;
import com.whatsapp.profile.ProfileInfoActivity;
import com.whatsapp.profile.ProfilePhotoPrivacyActivity;
import com.whatsapp.profile.ProfilePhotoReminder;
import com.whatsapp.profile.ResetGroupPhoto;
import com.whatsapp.profile.ResetPhoto;
import com.whatsapp.profile.SetAboutInfo;
import com.whatsapp.qrcode.AuthenticationActivity;
import com.whatsapp.qrcode.DevicePairQrScannerActivity;
import com.whatsapp.qrcode.GroupLinkQrActivity;
import com.whatsapp.qrcode.contactqr.ContactQrActivity;
import com.whatsapp.qrcode.contactqr.QrSheetDeepLinkActivity;
import com.whatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.registration.EULA;
import com.whatsapp.registration.MaacGrantConsentActivity;
import com.whatsapp.registration.NotifyContactsSelector;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.SendSmsToWa;
import com.whatsapp.registration.VerifyCaptcha;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity;

/* renamed from: X.4Wf  reason: invalid class name and case insensitive filesystem */
public class C89354Wf implements C004101v {
    public Object A00;
    public final int A01;

    public C89354Wf(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass01G r1, int i) {
        r1.A1e(new C89354Wf(r1, i));
    }

    public void BUZ(Context context) {
        switch (this.A01) {
            case 0:
                ((C46632Zt) this.A00).A2F();
                return;
            case 1:
                ((PaymentContactPicker) this.A00).A2F();
                return;
            case 2:
                ((AnonymousClass2GI) this.A00).A2F();
                return;
            case 3:
                ((AnonymousClass24W) this.A00).A2F();
                return;
            case 4:
                ((C51032n5) this.A00).A2F();
                return;
            case 5:
                ((PaymentsUpdateRequiredActivity) this.A00).A2F();
                return;
            case 6:
                ((IndiaUpiMapperConfirmationActivity) this.A00).A2F();
                return;
            case 7:
                ((IndiaUpiMapperLinkActivity) this.A00).A2F();
                return;
            case 8:
                ((IndiaUpiMapperPendingActivity) this.A00).A2F();
                return;
            case 9:
                ((IndiaUpiMapperValuePropsActivity) this.A00).A2F();
                return;
            case 10:
                ((RequestNotificationPermissionActivity) this.A00).A2F();
                return;
            case 11:
                ((CountryPicker) this.A00).A2F();
                return;
            case 12:
                ((AnonymousClass24X) this.A00).A2F();
                return;
            case 13:
                ((PrivacyCheckupHomeActivity) this.A00).A2F();
                return;
            case 14:
                ((NewsletterRequestReviewActivity) this.A00).A2F();
                return;
            case 15:
                ((NewsletterRequestReviewSelectReasonActivity) this.A00).A2F();
                return;
            case 16:
                ((NewsletterAlertsActivity) this.A00).A2F();
                return;
            case 17:
                ((NewsletterAppealsOutcomeActivity) this.A00).A2F();
                return;
            case 18:
                ((EnforcedMessagesActivity) this.A00).A2F();
                return;
            case 19:
                ((NewsletterGeosuspensionInfoActivity) this.A00).A2F();
                return;
            case 20:
                ((NewsletterSuspensionInfoActivity) this.A00).A2F();
                return;
            case 21:
                ((NewsletterUserReportsActivity) this.A00).A2F();
                return;
            case 22:
                ((AboutStatusPrivacyActivity) this.A00).A2F();
                return;
            case 23:
            case 31:
                ((C39331s2) this.A00).A23();
                return;
            case 24:
                CapturePhoto capturePhoto = (CapturePhoto) this.A00;
                if (!capturePhoto.A04) {
                    capturePhoto.A04 = true;
                    C18800tq r1 = ((C27111My) ((C27101Mx) capturePhoto.generatedComponent())).A5g;
                    capturePhoto.A00 = C36351kA.A0M(r1);
                    capturePhoto.A01 = C36351kA.A0X(r1);
                    capturePhoto.A02 = C36341k9.A0V(r1);
                    capturePhoto.A03 = (AnonymousClass12U) r1.A7L.get();
                    return;
                }
                return;
            case 25:
                ((ProfileInfoActivity) this.A00).A2F();
                return;
            case 26:
                ((ProfilePhotoPrivacyActivity) this.A00).A2F();
                return;
            case 27:
                ((ProfilePhotoReminder) this.A00).A2F();
                return;
            case 28:
                ((ResetGroupPhoto) this.A00).A2F();
                return;
            case 29:
                ((ResetPhoto) this.A00).A2F();
                return;
            case 30:
                ((SetAboutInfo) this.A00).A2F();
                return;
            case 32:
                ((AuthenticationActivity) this.A00).A2F();
                return;
            case 33:
                ((DevicePairQrScannerActivity) this.A00).A2F();
                return;
            case 34:
                ((GroupLinkQrActivity) this.A00).A2F();
                return;
            case 38:
                ((ContactQrActivity) this.A00).A2F();
                return;
            case 39:
                ((QrSheetDeepLinkActivity) this.A00).A2F();
                return;
            case 40:
                ((QuickContactActivity) this.A00).A2F();
                return;
            case 41:
                ((ChangeNumberOverview) this.A00).A2F();
                return;
            case 42:
                ((EULA) this.A00).A2F();
                return;
            case 43:
                ((MaacGrantConsentActivity) this.A00).A2F();
                return;
            case 44:
                ((NotifyContactsSelector) this.A00).A2F();
                return;
            case 45:
                ((RegisterName) this.A00).A2F();
                return;
            case 46:
                ((SendSmsToWa) this.A00).A2F();
                return;
            case 47:
                ((VerifyCaptcha) this.A00).A2F();
                return;
            case 48:
                ((VerifyTwoFactorAuth) this.A00).A2F();
                return;
            case 49:
                ((DeviceConfirmationRegistrationActivity) this.A00).A2F();
                return;
            default:
                ((C225514w) this.A00).A2F();
                return;
        }
    }
}
