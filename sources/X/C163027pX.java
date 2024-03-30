package X;

import android.content.Context;
import com.whatsapp.account.remove.RemoveAccountActivity;
import com.whatsapp.accountlinking.webauthutil.FxWebAuthLauncherActivity;
import com.whatsapp.accountsync.CallContactLandingActivity;
import com.whatsapp.accountsync.LoginActivity;
import com.whatsapp.authgraphql.ui.CommonBloksActivity;
import com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.blockinguserinteraction.BlockingUserInteractionActivity;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryFrequentContactedActivity;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;
import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.whatsapp.camera.LauncherCameraActivity;
import com.whatsapp.documentpicker.DocumentPreviewActivity;
import com.whatsapp.extensions.phoenix.PhoenixFlowsBottomSheetActivity;
import com.whatsapp.gifvideopreview.GifVideoPreviewActivity;
import com.whatsapp.inappsupport.ui.SupportBloksActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker2BottomSheet;
import com.whatsapp.location.LocationPickerBottomSheet;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.messaging.CaptivePortalActivity;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.migration.export.ui.ExportMigrationActivity;
import com.whatsapp.migration.transfer.ui.ChatTransferActivity;
import com.whatsapp.payments.care.csat.CsatSurveyBloksActivity;
import com.whatsapp.payments.ui.BusinessHubActivity;
import com.whatsapp.payments.ui.IncentiveValuePropsActivity;
import com.whatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity;
import com.whatsapp.payments.ui.P2mLiteWebViewActivity;
import com.whatsapp.polls.PollCreatorBottomSheetActivity;

/* renamed from: X.7pX  reason: invalid class name and case insensitive filesystem */
public class C163027pX implements C004101v {
    public Object A00;
    public final int A01;

    public C163027pX(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass01G r1, int i) {
        r1.A1e(new C163027pX(r1, i));
    }

    public void BUZ(Context context) {
        switch (this.A01) {
            case 0:
            case 3:
            case 6:
                ((C224814n) this.A00).A2F();
                return;
            case 4:
                ((RemoveAccountActivity) this.A00).A2F();
                return;
            case 5:
                FxWebAuthLauncherActivity fxWebAuthLauncherActivity = (FxWebAuthLauncherActivity) this.A00;
                if (!fxWebAuthLauncherActivity.A01) {
                    fxWebAuthLauncherActivity.A01 = true;
                    fxWebAuthLauncherActivity.A00 = (C131616Pt) ((C27111My) ((C27101Mx) fxWebAuthLauncherActivity.generatedComponent())).A5g.ABk.get();
                    return;
                }
                return;
            case 7:
                ((CallContactLandingActivity) this.A00).A2F();
                return;
            case 8:
                ((LoginActivity) this.A00).A2F();
                return;
            case 9:
                ((C100854w8) this.A00).A2F();
                return;
            case 10:
                ((CommonBloksActivity) this.A00).A2F();
                return;
            case 11:
                ((AvatarProfilePhotoActivity) this.A00).A2F();
                return;
            case 13:
                ((GoogleDriveNewUserSetupActivity) this.A00).A2F();
                return;
            case 14:
                ((RestoreFromBackupActivity) this.A00).A2F();
                return;
            case 15:
                ((SettingsGoogleDrive) this.A00).A2F();
                return;
            case 16:
                ((BlockingUserInteractionActivity) this.A00).A2F();
                return;
            case 18:
                ((C100994wR) this.A00).A2F();
                return;
            case 19:
                ((C101004wU) this.A00).A2F();
                return;
            case 20:
                ((BusinessDirectoryFrequentContactedActivity) this.A00).A2F();
                return;
            case 21:
                ((BusinessDirectorySERPMapViewActivity) this.A00).A2F();
                return;
            case 22:
                ((DirectorySetLocationMapActivity) this.A00).A2F();
                return;
            case 24:
                ((C100934wH) this.A00).A2F();
                return;
            case 25:
                ((LauncherCameraActivity) this.A00).A2F();
                return;
            case 26:
                ((DocumentPreviewActivity) this.A00).A2F();
                return;
            case 27:
                ((PhoenixFlowsBottomSheetActivity) this.A00).A2F();
                return;
            case 28:
                ((GifVideoPreviewActivity) this.A00).A2F();
                return;
            case 29:
                ((SupportBloksActivity) this.A00).A2F();
                return;
            case 30:
                ((GroupChatLiveLocationsActivity) this.A00).A2F();
                return;
            case 31:
                ((GroupChatLiveLocationsActivity2) this.A00).A2F();
                return;
            case 32:
                ((C100954wJ) this.A00).A2F();
                return;
            case 33:
                ((C100944wI) this.A00).A2F();
                return;
            case 34:
                ((LocationPicker2BottomSheet) this.A00).A2F();
                return;
            case 35:
                ((LocationPickerBottomSheet) this.A00).A2F();
                return;
            case 36:
                ((MediaComposerActivity) this.A00).A2F();
                return;
            case 37:
                ((CaptivePortalActivity) this.A00).A2F();
                return;
            case 38:
                ((GoogleMigrateImporterActivity) this.A00).A2F();
                return;
            case 39:
                ((ExportMigrationActivity) this.A00).A2F();
                return;
            case 40:
                ((ChatTransferActivity) this.A00).A2F();
                return;
            case 42:
                ((CsatSurveyBloksActivity) this.A00).A2F();
                return;
            case 43:
                ((BusinessHubActivity) this.A00).A2F();
                return;
            case 44:
                ((IncentiveValuePropsActivity) this.A00).A2F();
                return;
            case 45:
                ((C101014wV) this.A00).A2F();
                return;
            case 46:
                ((MerchantPayoutTransactionHistoryActivity) this.A00).A2F();
                return;
            case 47:
                ((P2mLiteWebViewActivity) this.A00).A2F();
                return;
            case 48:
                ((C100964wK) this.A00).A2F();
                return;
            case 49:
                ((PollCreatorBottomSheetActivity) this.A00).A2F();
                return;
            default:
                ((C225514w) this.A00).A2F();
                return;
        }
    }
}
