package X;

import android.content.Context;
import com.whatsapp.avatar.privacy.AvatarStickerAllowListPickerActivity;
import com.whatsapp.biz.BusinessProfileExtraFieldsActivity;
import com.whatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.blocklist.BlockList;
import com.whatsapp.businesscollection.view.activity.CollectionProductListActivity;
import com.whatsapp.catalogcategory.view.activity.CatalogAllCategoryActivity;
import com.whatsapp.conversationslist.SmsDefaultAppWarning;
import com.whatsapp.group.GroupAddBlacklistPickerActivity;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.lastseen.LastSeenBlockListPickerActivity;
import com.whatsapp.newsletter.ui.NewsletterEditActivity;
import com.whatsapp.newsletter.ui.NewsletterEditDescriptionActivity;
import com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto;
import com.whatsapp.payments.GlobalPaymentTransactionDetailActivity;
import com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity;
import com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsAddPaymentMethodActivity;
import com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsConsumerOnboardingActivity;
import com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity;
import com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsResetPinActivity;
import com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsTransactionConfirmationActivity;
import com.whatsapp.payments.phoenix.flowconfigurationservice.resource.permission.FcsRequestPermissionActivity;
import com.whatsapp.payments.receiver.IndiaUpiPayIntentReceiverActivity;
import com.whatsapp.payments.ui.BrazilDyiReportActivity;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;
import com.whatsapp.payments.ui.BrazilMerchantDetailsListActivity;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.BrazilPaymentCareTransactionSelectorActivity;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import com.whatsapp.payments.ui.BrazilPixKeySettingActivity;
import com.whatsapp.payments.ui.BrazilViralityLinkVerifierActivity;
import com.whatsapp.payments.ui.GlobalPaymentOrderDetailsActivity;
import com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity;
import com.whatsapp.payments.ui.IndiaUpiAccountRecoveryFinishActivity;

public class B7Y implements C004101v {
    public Object A00;
    public final int A01;

    public B7Y(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass01G r1, int i) {
        r1.A1e(new B7Y(r1, i));
    }

    public void BUZ(Context context) {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 1:
                ((AvatarStickerAllowListPickerActivity) obj).A2F();
                return;
            case 2:
                ((BusinessProfileExtraFieldsActivity) obj).A2F();
                return;
            case 3:
                ((CatalogCategoryTabsActivity) obj).A2F();
                return;
            case 4:
                ((CatalogListActivity) obj).A2F();
                return;
            case 6:
                ((ProductListActivity) obj).A2F();
                return;
            case 8:
                ((ProductDetailActivity) obj).A2F();
                return;
            case 9:
                ((BlockList) obj).A2F();
                return;
            case 10:
                ((CollectionProductListActivity) obj).A2F();
                return;
            case 12:
                ((CatalogAllCategoryActivity) obj).A2F();
                return;
            case 14:
                ((SmsDefaultAppWarning) obj).A2F();
                return;
            case 15:
                ((GroupAddBlacklistPickerActivity) obj).A2F();
                return;
            case 16:
                ((GroupPermissionsActivity) obj).A2F();
                return;
            case 17:
                ((LastSeenBlockListPickerActivity) obj).A2F();
                return;
            case 19:
                ((AnonymousClass8fY) obj).A2F();
                return;
            case 20:
                ((NewsletterEditActivity) obj).A2F();
                return;
            case 21:
                ((NewsletterEditDescriptionActivity) obj).A2F();
                return;
            case 22:
                ((ViewNewsletterProfilePhoto) obj).A2F();
                return;
            case 23:
                ((GlobalPaymentTransactionDetailActivity) obj).A2F();
                return;
            case 24:
                ((IndiaUpiBankPickerActivity) obj).A2F();
                return;
            case 25:
                ((IndiaUpiFcsAddPaymentMethodActivity) obj).A2F();
                return;
            case 26:
                ((IndiaUpiFcsConsumerOnboardingActivity) obj).A2F();
                return;
            case 27:
                ((IndiaUpiFcsPinHandlerActivity) obj).A2F();
                return;
            case 28:
                ((IndiaUpiFcsResetPinActivity) obj).A2F();
                return;
            case 29:
                ((IndiaUpiFcsTransactionConfirmationActivity) obj).A2F();
                return;
            case 30:
                ((FcsRequestPermissionActivity) obj).A2F();
                return;
            case 31:
                ((IndiaUpiPayIntentReceiverActivity) obj).A2F();
                return;
            case 33:
                ((BrazilDyiReportActivity) obj).A2F();
                return;
            case 34:
                ((BrazilFbPayHubActivity) obj).A2F();
                return;
            case 35:
                ((BrazilMerchantDetailsListActivity) obj).A2F();
                return;
            case 36:
                ((BrazilOrderDetailsActivity) obj).A2F();
                return;
            case 37:
                ((BrazilPayBloksActivity) obj).A2F();
                return;
            case 38:
                ((C178768hI) obj).A2F();
                return;
            case 39:
                ((BrazilPaymentCardDetailsActivity) obj).A2F();
                return;
            case 40:
                ((BrazilPaymentCareTransactionSelectorActivity) obj).A2F();
                return;
            case 41:
                ((BrazilPaymentTransactionDetailActivity) obj).A2F();
                return;
            case 42:
                ((BrazilPixKeySettingActivity) obj).A2F();
                return;
            case 43:
                ((C178758hH) obj).A2F();
                return;
            case 44:
                ((BrazilViralityLinkVerifierActivity) obj).A2F();
                return;
            case 45:
                ((C173908Tp) obj).A2F();
                return;
            case 47:
                ((GlobalPaymentOrderDetailsActivity) obj).A2F();
                return;
            case 48:
                ((IndiaPaymentTransactionHistoryActivity) obj).A2F();
                return;
            case 49:
                ((IndiaUpiAccountRecoveryFinishActivity) obj).A2F();
                return;
            default:
                ((C225514w) obj).A2F();
                return;
        }
    }
}
