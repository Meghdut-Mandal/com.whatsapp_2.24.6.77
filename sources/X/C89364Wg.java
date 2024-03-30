package X;

import android.content.Context;
import com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity;
import com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity;
import com.whatsapp.registration.deviceswitching.DeviceSwitchingSelfServeEducationScreen;
import com.whatsapp.registration.directmigration.RequestPermissionFromSisterAppActivity;
import com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity;
import com.whatsapp.registration.email.EmailEducationScreen;
import com.whatsapp.registration.email.RegisterEmail;
import com.whatsapp.registration.email.VerifyEmail;
import com.whatsapp.registration.parole.CustomRegistrationBlockActivity;
import com.whatsapp.registration.phonenumberentry.ChangeNumber;
import com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import com.whatsapp.report.ReportActivity;
import com.whatsapp.settings.About;
import com.whatsapp.settings.Licenses;
import com.whatsapp.settings.Settings;
import com.whatsapp.settings.SettingsAccount;
import com.whatsapp.settings.SettingsCallingPrivacyActivity;
import com.whatsapp.settings.SettingsChat;
import com.whatsapp.settings.SettingsDataUsageActivity;
import com.whatsapp.settings.SettingsHelpV2;
import com.whatsapp.settings.SettingsNetworkUsage;
import com.whatsapp.settings.SettingsNotifications;
import com.whatsapp.settings.SettingsPasskeys;
import com.whatsapp.settings.SettingsPrivacy;
import com.whatsapp.settings.SettingsPrivacyAdvancedActivity;
import com.whatsapp.settings.SettingsSecurity;
import com.whatsapp.settings.SettingsSetupUserProxyActivity;
import com.whatsapp.settings.SettingsUserProxyActivity;
import com.whatsapp.settings.autoconf.ShareAutoConfVerifierActivity;
import com.whatsapp.settings.chat.wallpaper.DefaultWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity;
import com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity;
import com.whatsapp.softenforcementsmb.BusinessPolicyView;
import com.whatsapp.spamwarning.SpamWarningActivity;
import com.whatsapp.status.audienceselector.StatusPrivacyActivity;
import com.whatsapp.status.playback.MyStatusesActivity;

/* renamed from: X.4Wg  reason: invalid class name and case insensitive filesystem */
public class C89364Wg implements C004101v {
    public Object A00;
    public final int A01;

    public C89364Wg(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass01G r1, int i) {
        r1.A1e(new C89364Wg(r1, i));
    }

    public void BUZ(Context context) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((OldDeviceMoveAccountNoticeActivity) obj).A2F();
                return;
            case 1:
                ((OldDeviceSecureAccountActivity) obj).A2F();
                return;
            case 2:
                ((DeviceSwitchingSelfServeEducationScreen) obj).A2F();
                return;
            case 3:
                ((RequestPermissionFromSisterAppActivity) obj).A2F();
                return;
            case 4:
                ((RestoreFromConsumerDatabaseActivity) obj).A2F();
                return;
            case 5:
                ((EmailEducationScreen) obj).A2F();
                return;
            case 6:
                ((RegisterEmail) obj).A2F();
                return;
            case 7:
                ((VerifyEmail) obj).A2F();
                return;
            case 8:
                ((AnonymousClass26H) obj).A2F();
                return;
            case 9:
                ((CustomRegistrationBlockActivity) obj).A2F();
                return;
            case 10:
                ((ChangeNumber) obj).A2F();
                return;
            case 11:
                ((ChangeNumberNotifyContacts) obj).A2F();
                return;
            case 13:
                ((AnonymousClass2d8) obj).A2F();
                return;
            case 14:
                ((VerifyPhoneNumber) obj).A2F();
                return;
            case 15:
                ((ReportActivity) obj).A2F();
                return;
            case 16:
                ((About) obj).A2F();
                return;
            case 17:
                ((Licenses) obj).A2F();
                return;
            case 19:
                ((Settings) obj).A2F();
                return;
            case 20:
                ((SettingsAccount) obj).A2F();
                return;
            case 21:
                ((SettingsCallingPrivacyActivity) obj).A2F();
                return;
            case 22:
                ((SettingsChat) obj).A2F();
                return;
            case 23:
                ((SettingsDataUsageActivity) obj).A2F();
                return;
            case 24:
                ((SettingsHelpV2) obj).A2F();
                return;
            case 25:
                ((SettingsNetworkUsage) obj).A2F();
                return;
            case 26:
                ((SettingsNotifications) obj).A2F();
                return;
            case 27:
                ((SettingsPasskeys) obj).A2F();
                return;
            case 28:
                ((SettingsPrivacy) obj).A2F();
                return;
            case 29:
                ((SettingsPrivacyAdvancedActivity) obj).A2F();
                return;
            case 30:
                ((SettingsSecurity) obj).A2F();
                return;
            case 31:
                ((SettingsSetupUserProxyActivity) obj).A2F();
                return;
            case 32:
                ((SettingsUserProxyActivity) obj).A2F();
                return;
            case 33:
                ((ShareAutoConfVerifierActivity) obj).A2F();
                return;
            case 36:
                ((DefaultWallpaperPreview) obj).A2F();
                return;
            case 37:
                ((GalleryWallpaperPreview) obj).A2F();
                return;
            case 38:
                ((SolidColorWallpaper) obj).A2F();
                return;
            case 39:
                ((SolidColorWallpaperPreview) obj).A2F();
                return;
            case 40:
                ((WallpaperCategoriesActivity) obj).A2F();
                return;
            case 41:
                ((WallpaperCurrentPreviewActivity) obj).A2F();
                return;
            case 42:
                ((DownloadableWallpaperPickerActivity) obj).A2F();
                return;
            case 43:
                ((DownloadableWallpaperPreviewActivity) obj).A2F();
                return;
            case 44:
                ((ShareGroupInviteLinkActivity) obj).A2F();
                return;
            case 45:
                ((BusinessPolicyView) obj).A2F();
                return;
            case 46:
                ((SpamWarningActivity) obj).A2F();
                return;
            case 47:
                ((StatusPrivacyActivity) obj).A2F();
                return;
            case 48:
                ((AnonymousClass24Y) obj).A2F();
                return;
            case 49:
                ((MyStatusesActivity) obj).A2F();
                return;
            default:
                ((C225514w) obj).A2F();
                return;
        }
    }
}
