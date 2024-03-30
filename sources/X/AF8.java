package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.payments.care.csat.CsatSurveyBloksActivity;
import com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity;
import com.whatsapp.payments.ui.BrazilDyiReportActivity;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivityBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactOmbudsmanActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactSupportActivity;
import com.whatsapp.payments.ui.BrazilPaymentContactSupportP2pActivity;
import com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentReportPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import com.whatsapp.payments.ui.BrazilSmbPaymentActivity;
import com.whatsapp.payments.ui.BrazilSmbPaymentActivityBottomSheet;
import com.whatsapp.payments.ui.BrazilViralityLinkVerifierActivity;
import com.whatsapp.payments.ui.IncentiveValuePropsActivity;
import com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiIncentivesValuePropsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.payments.ui.IndiaUpiQuickBuyActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivityBottomSheet;
import com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity;
import com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity;
import com.whatsapp.payments.ui.P2mLitePaymentSettingsActivity;
import com.whatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.whatsapp.support.DescribeProblemActivity;
import com.whatsapp.util.Log;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

public abstract class AF8 implements B66 {
    public C19970wo A00;
    public AnonymousClass1EZ A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass171 A03;
    public final C19630wG A04;
    public final AnonymousClass1EU A05;
    public final AnonymousClass1FR A06;
    public final String A07;
    public final C21060yb A08;

    public boolean B2P() {
        return true;
    }

    public int BAW(String str) {
        return 1000;
    }

    public C203399nx BEM(C207119ua r4) {
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[3];
        C36351kA.A1N("currency", C207119ua.A00(r4, r2), r2);
        return C203399nx.A04("money", r2);
    }

    public String BI8(String str) {
        return null;
    }

    public Intent BIU(Context context, String str) {
        return null;
    }

    public C175828b8 BKZ() {
        return null;
    }

    public boolean B2O() {
        if (this instanceof C178658gt) {
            return true;
        }
        return false;
    }

    public void B6d(C202319lY r3, C202319lY r4) {
        C201599jw r0;
        String str;
        if ((this instanceof C178658gt) && r4 != null) {
            C201599jw r1 = C202319lY.A00(r3).A0G;
            C175928bI A002 = C202319lY.A00(r4);
            if (r1 != null && (r0 = A002.A0G) != null && (str = r0.A0D) != null) {
                r1.A0I = str;
            }
        }
    }

    public Class B89() {
        if (this instanceof C178658gt) {
            return IndiaUpiBankAccountDetailsActivity.class;
        }
        if (this instanceof C178648gs) {
            return BrazilPaymentCardDetailsActivity.class;
        }
        return null;
    }

    public Intent B8A(Context context) {
        if (this instanceof C178648gs) {
            return C36441kJ.A0H(context, BrazilAccountRecoveryPinActivity.class);
        }
        return null;
    }

    public Class B8B() {
        if (this instanceof C178658gt) {
            return IndiaUpiPaymentsAccountSetupActivity.class;
        }
        if (this instanceof C178648gs) {
            return BrazilPayBloksActivity.class;
        }
        return null;
    }

    public Intent B8C(Context context) {
        if (!(this instanceof C178648gs)) {
            return null;
        }
        Intent A0F = C165597tg.A0F(context);
        A0F.putExtra("screen_name", C201649k3.A01(((C178648gs) this).A0P, "p2p_context", false));
        C1025050g.A01(A0F, "referral_screen", "payment_home");
        C1025050g.A01(A0F, "onboarding_context", "generic_context");
        return A0F;
    }

    public Class B9Z() {
        if (this instanceof C178658gt) {
            return IndiaUpiCheckBalanceActivity.class;
        }
        return null;
    }

    public String B9a() {
        if (this instanceof C178658gt) {
            return "upi_p2p_check_balance";
        }
        return "";
    }

    public AnonymousClass9RR B9r() {
        boolean z = this instanceof C178658gt;
        C19630wG r3 = this.A04;
        AnonymousClass171 r2 = this.A03;
        AnonymousClass16D r1 = this.A02;
        if (z) {
            return new C178388fr(r1, r2, r3);
        }
        return new AnonymousClass9RR(r1, r2, r3);
    }

    public Class BA5() {
        if (this instanceof C178648gs) {
            return BrazilPaymentContactOmbudsmanActivity.class;
        }
        return null;
    }

    public Class BA6() {
        if (this instanceof C178658gt) {
            return DescribeProblemActivity.class;
        }
        if (this instanceof C178648gs) {
            return BrazilPaymentContactSupportActivity.class;
        }
        return null;
    }

    public Class BA7() {
        if (!(this instanceof C178648gs) || !((C178648gs) this).A0L.A02.A0E(1615)) {
            return null;
        }
        return BrazilPaymentContactSupportP2pActivity.class;
    }

    public B34 BAG() {
        if (this instanceof C178658gt) {
            return ((C178658gt) this).A0F;
        }
        if (this instanceof C178648gs) {
            return ((C178648gs) this).A0C;
        }
        return null;
    }

    public C196129Xv BAH() {
        if (this instanceof C178658gt) {
            return ((C178658gt) this).A0C;
        }
        return null;
    }

    public C23083B3q BAJ() {
        if (this instanceof C178658gt) {
            return ((C178658gt) this).A0D;
        }
        if (!(this instanceof C178648gs)) {
            return null;
        }
        C178648gs r0 = (C178648gs) this;
        C19630wG r1 = r0.A04;
        C20810yC r3 = r0.A0B;
        C18820ts r2 = r0.A0A;
        AnonymousClass1EV r7 = r0.A0L;
        C23075B3f b3f = r0.A0M;
        return new AE9(r1, r2, r3, r0.A0E, r0.A0I, r0.A0K, r7, b3f);
    }

    public B0z BAK() {
        if (this instanceof C178658gt) {
            C178658gt r0 = (C178658gt) this;
            C19630wG r2 = r0.A04;
            C20050ww r1 = r0.A03;
            AnonymousClass1EU r6 = r0.A05;
            return new AAN(r1, r2, r0.A0F, r0.A0I, r0.A0K, r6);
        } else if (!(this instanceof C178648gs)) {
            return null;
        } else {
            C178648gs r02 = (C178648gs) this;
            C19970wo r3 = r02.A08;
            AnonymousClass17Y r12 = r02.A02;
            C20050ww r22 = r02.A05;
            AnonymousClass1EU r8 = r02.A05;
            C24601Db r7 = r02.A0J;
            return new AAO(r12, r22, r3, r02.A0G, r02.A0H, r02.A0I, r7, r8, r02.A0N);
        }
    }

    public B2X BAP() {
        if (this instanceof C178658gt) {
            return ((C178658gt) this).A0H;
        }
        if (this instanceof C178648gs) {
            return ((C178648gs) this).A0F;
        }
        return null;
    }

    public AnonymousClass9Tc BAj() {
        if (!(this instanceof C178658gt)) {
            return null;
        }
        C178658gt r0 = (C178658gt) this;
        C19970wo r2 = r0.A06;
        C20810yC r4 = r0.A0A;
        C19630wG r3 = r0.A04;
        C21100yf r1 = r0.A02;
        AnonymousClass1FR r10 = r0.A06;
        C202699mR r9 = r0.A0S;
        AnonymousClass1EZ r6 = r0.A0I;
        AF7 af7 = r0.A0O;
        return new C178398fs(r1, r2, r3, r4, r0.A0F, r6, r0.A0L, af7, r9, r10);
    }

    public Intent BAs(Context context, Uri uri, boolean z) {
        if (!(this instanceof C178658gt)) {
            return C36441kJ.A0H(context, BFl());
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT_SIGNUP ");
        Class<IndiaUpiPaymentSettingsActivity> cls = IndiaUpiPaymentSettingsActivity.class;
        C36321k7.A1N(cls, A0u);
        Intent A0H = C36441kJ.A0H(context, cls);
        A0H.putExtra("extra_is_invalid_deep_link_url", z);
        A0H.putExtra("referral_screen", "deeplink");
        A0H.putExtra("extra_deep_link_url", uri);
        return A0H;
    }

    public Intent BAt(Context context, Uri uri) {
        int length;
        if (this instanceof C178658gt) {
            C178658gt r2 = (C178658gt) this;
            boolean A002 = C1901196y.A00(uri, r2.A0P);
            if (r2.A0I.A0D() || A002) {
                return r2.BAs(context, uri, A002);
            }
            Log.i("PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT_SIGNUP for new user");
            Intent BAs = r2.BAs(context, uri, false);
            BAs.putExtra("actual_deep_link", uri.toString());
            AnonymousClass3M9.A01(BAs, "deepLink");
            return BAs;
        } else if (this instanceof C178648gs) {
            C178648gs r22 = (C178648gs) this;
            if (C1901196y.A00(uri, r22.A0O)) {
                Intent A0H = C36441kJ.A0H(context, BrazilPaymentSettingsActivity.class);
                C165597tg.A0z(A0H, "deeplink");
                return A0H;
            }
            Intent BFp = r22.BFp(context, "generic_context", "deeplink");
            BFp.putExtra("extra_deep_link_url", uri);
            String stringExtra = BFp.getStringExtra("screen_name");
            if ("brpay_p_pin_nux_create".equals(stringExtra) || "brpay_p_compliance_kyc_next_screen_router".equals(stringExtra)) {
                C1025050g.A01(BFp, "deep_link_continue_setup", "1");
            }
            if (r22.A0P.A07("p2p_context")) {
                return BFp;
            }
            String queryParameter = uri.getQueryParameter("c");
            if (queryParameter != null && (length = queryParameter.length()) >= 5 && !(!queryParameter.substring(length - 5, length).equals("9Y6XA"))) {
                return BFp;
            }
            C1025050g.A01(BFp, "campaign_id", uri.getQueryParameter("c"));
            return BFp;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("PAY: DeepLinkActivity handle DEEP_LINK_PAYMENT_SIGNUP for new user");
            Class B8B = B8B();
            C36321k7.A1N(B8B, A0u);
            Intent A0H2 = C36441kJ.A0H(context, B8B);
            AnonymousClass3M9.A01(A0H2, "deepLink");
            return A0H2;
        }
    }

    public int BB6() {
        if (this instanceof C178648gs) {
            return R.style.f13nameremoved;
        }
        return 0;
    }

    public Intent BBM(Context context, String str, String str2) {
        if (this instanceof C178638gr) {
            Intent A0D = C36431kI.A0D();
            A0D.setClassName(context.getPackageName(), "com.whatsapp.payments.ui.P2mLiteDyiReportActivity");
            A0D.putExtra("extra_paymentProvider", str2);
            A0D.putExtra("extra_paymentAccountType", str);
            return A0D;
        } else if (!(this instanceof C178648gs)) {
            return null;
        } else {
            Intent A0H = C36441kJ.A0H(context, BrazilDyiReportActivity.class);
            A0H.putExtra("extra_paymentProvider", str2);
            A0H.putExtra("extra_paymentAccountType", str);
            return A0H;
        }
    }

    public Intent BCa(Context context) {
        Intent A0H;
        if (this instanceof C178658gt) {
            A0H = C36441kJ.A0H(context, IndiaUpiIncentivesValuePropsActivity.class);
            A0H.putExtra("extra_payments_entry_type", 1);
            A0H.putExtra("extra_banner_type", 20);
        } else if (!(this instanceof C178648gs)) {
            return null;
        } else {
            A0H = C36441kJ.A0H(context, IncentiveValuePropsActivity.class);
        }
        A0H.putExtra("referral_screen", "in_app_banner");
        return A0H;
    }

    public Intent BCo(Context context) {
        if (this instanceof C178648gs) {
            return C36441kJ.A0H(context, BHH());
        }
        if (this.A01.A0E() || this.A01.A0C()) {
            return C36441kJ.A0H(context, this.A05.A05().BHH());
        }
        Intent A0H = C36441kJ.A0H(context, this.A05.A05().B8B());
        A0H.putExtra("extra_setup_mode", 1);
        return A0H;
    }

    public String BDo(C207249un r2) {
        if (this instanceof C178658gt) {
            return ((C178658gt) this).A0G.A03(r2);
        }
        return "";
    }

    public AnonymousClass9jA BE1() {
        if (this instanceof C178648gs) {
            return ((C178648gs) this).A0D;
        }
        return null;
    }

    public Class BET(Bundle bundle) {
        String A0p;
        if (!(this instanceof C178648gs)) {
            return null;
        }
        String string = bundle.getString("nfm_action");
        if (TextUtils.isEmpty(string)) {
            A0p = "[PAY]: BrazilPayNFMController -- NFM action not passed";
        } else {
            switch (string.hashCode()) {
                case -229223458:
                    if (string.equals("wa_payment_learn_more")) {
                        return WaInAppBrowsingActivity.class;
                    }
                    break;
                case 48886399:
                    if (string.equals("payments_care_csat")) {
                        return CsatSurveyBloksActivity.class;
                    }
                    break;
                case 127237947:
                    if (string.equals("wa_payment_fbpin_reset")) {
                        return BrazilPayBloksActivity.class;
                    }
                    break;
                case 540952115:
                    if (string.equals("wa_payment_transaction_details")) {
                        return BrazilPaymentTransactionDetailActivity.class;
                    }
                    break;
            }
            A0p = AnonymousClass000.A0p("[PAY]: BrazilPayNFMController -- Unsupported NFM action: ", string, AnonymousClass000.A0u());
        }
        Log.e(A0p);
        return null;
    }

    public C22958AzA BFB() {
        if (this instanceof C178658gt) {
            return new AEI(((C178658gt) this).A0M);
        }
        if (this instanceof C178648gs) {
            return new AEH();
        }
        return null;
    }

    public List BFH(C202319lY r5, C64933Qa r6) {
        C207119ua r1;
        C175708av r12 = r5.A0A;
        if (r5.A0K() || r12 == null || (r1 = r12.A01) == null) {
            return null;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        C203399nx.A0B(BEM(r1), "amount", A0I, new AnonymousClass1AL[0]);
        return A0I;
    }

    public C200169gl BFJ() {
        if (this instanceof C178658gt) {
            return ((C178658gt) this).A0Q;
        }
        return null;
    }

    public AnonymousClass9P4 BFK() {
        return new AnonymousClass9P4();
    }

    public C88704Ts BFL(C18820ts r2, C20810yC r3, C29931Yo r4, AnonymousClass9P4 r5) {
        return new C21128A9o(r2, r3, r4, r5);
    }

    public B1E BFN() {
        if (this instanceof C178658gt) {
            C178658gt r0 = (C178658gt) this;
            C20810yC r5 = r0.A0A;
            AnonymousClass17Y r1 = r0.A01;
            C19630wG r2 = r0.A04;
            C19770wU r14 = r0.A0U;
            AnonymousClass19A r6 = r0.A0B;
            C29131Vl r13 = r0.A0T;
            AnonymousClass1EU r11 = r0.A05;
            C202269lR r8 = r0.A0E;
            C29121Vk r10 = r0.A0N;
            return new AE4(r1, r2, r0.A08, r0.A09, r5, r6, r0.A0C, r8, r0.A0J, r10, r11, r0.A0R, r13, r14);
        } else if (this instanceof C178648gs) {
            return new AE3();
        } else {
            return null;
        }
    }

    public String BFO() {
        if (this instanceof C178638gr) {
            return null;
        }
        boolean z = this instanceof C178658gt;
        return null;
    }

    public B2Y BFP() {
        if (this instanceof C178658gt) {
            return ((C178658gt) this).A0P;
        }
        if (this instanceof C178648gs) {
            return ((C178648gs) this).A0O;
        }
        return null;
    }

    public C1262463d BFQ(C19630wG r3, C24601Db r4) {
        if (this instanceof C178658gt) {
            return new C105645Fm(((C178658gt) this).A05, r3, r4);
        }
        if (this instanceof C178648gs) {
            return new C178668gu(((C178648gs) this).A07, r3, r4);
        }
        return new C1262463d(this.A08, r3, r4);
    }

    public int BFR() {
        if (!(this instanceof C178638gr) && !(this instanceof C178658gt) && !(this instanceof C178648gs)) {
            return 0;
        }
        return R.string.f12nameremoved;
    }

    public Class BFS() {
        if (this instanceof C178648gs) {
            return BrazilFbPayHubActivity.class;
        }
        return null;
    }

    public C63533Kk BFU() {
        if (this instanceof C178658gt) {
            return new AnonymousClass2ZV();
        }
        if (this instanceof C178648gs) {
            return new AnonymousClass2ZU();
        }
        return null;
    }

    public Class BFV() {
        if (this instanceof C178658gt) {
            return IndiaPaymentTransactionHistoryActivity.class;
        }
        if (this instanceof C178648gs) {
            return PaymentTransactionHistoryActivity.class;
        }
        return null;
    }

    public int BFX() {
        if (this instanceof C178658gt) {
            return R.string.f12nameremoved;
        }
        return 0;
    }

    public Pattern BFY() {
        if (this instanceof C178658gt) {
            return C190929Aw.A00;
        }
        return null;
    }

    public C196199Yc BFZ() {
        if (this instanceof C178658gt) {
            C178658gt r0 = (C178658gt) this;
            C19970wo r5 = r0.A06;
            C20810yC r7 = r0.A0A;
            C33771fu r2 = r0.A04;
            AnonymousClass1FR r9 = r0.A06;
            return new C178418fu(r0.A00, r2, r0.A02, r0.A03, r5, r0.A07, r7, r0.A0I, r9);
        } else if (!(this instanceof C178648gs)) {
            return null;
        } else {
            C178648gs r02 = (C178648gs) this;
            C19970wo r52 = r02.A08;
            C20810yC r72 = r02.A0B;
            C33771fu r22 = r02.A06;
            AnonymousClass1FR r92 = r02.A0Q;
            return new C178408ft(r02.A01, r22, r02.A02, r02.A03, r52, r02.A0A, r72, r02.A0P, r92);
        }
    }

    public C193609Md BFa() {
        if (!(this instanceof C178658gt)) {
            return null;
        }
        C178658gt r0 = (C178658gt) this;
        C19970wo r1 = r0.A06;
        C20810yC r3 = r0.A0A;
        return new C193609Md(r1, r0.A04, r3, r0.A0I, r0.A06);
    }

    public /* synthetic */ Pattern BFb() {
        if (this instanceof C178658gt) {
            return C190929Aw.A01;
        }
        return null;
    }

    public String BFc(C23083B3q b3q, AnonymousClass3T1 r3) {
        return this.A06.A0X(b3q, r3);
    }

    public AnonymousClass9S9 BFe() {
        if (!(this instanceof C178648gs)) {
            return null;
        }
        C178648gs r1 = (C178648gs) this;
        return new AnonymousClass9S9(r1.A04.A00, r1.A00, r1.A03, r1.A05);
    }

    public Class BFf() {
        if (this instanceof C178658gt) {
            return IndiaUpiVpaContactInfoActivity.class;
        }
        return null;
    }

    public int BFg() {
        if (this instanceof C178658gt) {
            return R.string.f12nameremoved;
        }
        return 0;
    }

    public Class BFh() {
        if (this instanceof C178658gt) {
            return IndiaUpiProfileDetailsActivity.class;
        }
        return null;
    }

    public Intent BFi(Context context, String str, int i) {
        if (!(this instanceof C178658gt)) {
            return null;
        }
        Intent A0H = C36441kJ.A0H(context, IndiaUpiQrTabActivity.class);
        A0H.putExtra("extra_payments_entry_type", 14);
        C165597tg.A0z(A0H, "main_qr_code_camera");
        return A0H;
    }

    public C88844Ug BFj() {
        if (this instanceof C178658gt) {
            C178658gt r0 = (C178658gt) this;
            AE0 ae0 = r0.A0F;
            return new AED(r0.A02, r0.A0A, ae0, r0.A0O, r0.A0S);
        } else if (this instanceof C178648gs) {
            return new AEC(((C178648gs) this).A0B);
        } else {
            return null;
        }
    }

    public Class BFk() {
        if (this instanceof C178638gr) {
            return P2mLiteOrderDetailsActivity.class;
        }
        if (this instanceof C178658gt) {
            return IndiaUpiQuickBuyActivity.class;
        }
        if (this instanceof C178648gs) {
            return BrazilOrderDetailsActivity.class;
        }
        return null;
    }

    public Class BFl() {
        if (this instanceof C178638gr) {
            return P2mLitePaymentSettingsActivity.class;
        }
        if (this instanceof C178658gt) {
            return IndiaUpiPaymentSettingsActivity.class;
        }
        if (this instanceof C178648gs) {
            return BrazilPaymentSettingsActivity.class;
        }
        return null;
    }

    public C193859Ne BFm() {
        if (!(this instanceof C178648gs)) {
            return null;
        }
        C178648gs r0 = (C178648gs) this;
        return new C193859Ne(r0.A02, r0.A03, r0.A08, r0.A0J, r0.A0Q, r0.A0R);
    }

    public Class BFo() {
        if (this instanceof C178648gs) {
            return BrazilViralityLinkVerifierActivity.class;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent BFp(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C178658gt
            if (r0 == 0) goto L_0x001a
            android.content.Intent r2 = X.C165597tg.A0G(r5)
            java.lang.String r1 = "extra_payments_entry_type"
            r0 = 1
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_skip_value_props_display"
            r0 = 0
            r2.putExtra(r1, r0)
            java.lang.String r0 = "inAppBanner"
            X.AnonymousClass3M9.A01(r2, r0)
            return r2
        L_0x001a:
            boolean r0 = r4 instanceof X.C178648gs
            if (r0 == 0) goto L_0x0075
            r2 = r4
            X.8gs r2 = (X.C178648gs) r2
            java.lang.String r0 = "in_app_banner"
            if (r7 != r0) goto L_0x0065
            X.0yC r1 = r2.A0B
            r0 = 567(0x237, float:7.95E-43)
        L_0x0029:
            boolean r3 = r1.A0E(r0)
        L_0x002d:
            X.9k3 r2 = r2.A0P
            r1 = 0
            java.lang.String r0 = "merchant_account_linking_context"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0060
            java.lang.String r1 = X.C201649k3.A00(r2)
        L_0x003c:
            if (r3 == 0) goto L_0x0056
            if (r1 == 0) goto L_0x0056
            android.content.Intent r2 = X.C165597tg.A0F(r5)
            java.lang.String r0 = "screen_name"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "referral_screen"
            X.C1025050g.A01(r2, r0, r7)
        L_0x004e:
            java.lang.String r1 = "onboarding_context"
            java.lang.String r0 = "generic_context"
            X.C1025050g.A01(r2, r1, r0)
            return r2
        L_0x0056:
            java.lang.Class<com.whatsapp.payments.ui.BrazilPaymentSettingsActivity> r0 = com.whatsapp.payments.ui.BrazilPaymentSettingsActivity.class
            android.content.Intent r2 = X.C36441kJ.A0H(r5, r0)
            X.C165597tg.A0z(r2, r7)
            goto L_0x004e
        L_0x0060:
            java.lang.String r1 = X.C201649k3.A01(r2, r6, r1)
            goto L_0x003c
        L_0x0065:
            java.lang.String r0 = "alt_virality"
            if (r7 != r0) goto L_0x006e
            X.0yC r1 = r2.A0B
            r0 = 570(0x23a, float:7.99E-43)
            goto L_0x0029
        L_0x006e:
            java.lang.String r0 = "deeplink"
            boolean r3 = X.C36361kB.A1a(r7, r0)
            goto L_0x002d
        L_0x0075:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AF8.BFp(android.content.Context, java.lang.String, java.lang.String):android.content.Intent");
    }

    public Class BFv() {
        if (this instanceof C178658gt) {
            return IndiaUpiPinPrimerFullSheetActivity.class;
        }
        return null;
    }

    public Class BGg() {
        if (this instanceof C178648gs) {
            return BrazilPaymentReportPaymentActivity.class;
        }
        return null;
    }

    public int BGz(C202319lY r3) {
        C201599jw r0;
        int A002;
        if (!(this instanceof C178658gt) || (r0 = C202319lY.A00(r3).A0G) == null || (A002 = r0.A00()) == 1 || A002 == 2 || A002 == 4 || A002 != 6) {
            return R.string.f12nameremoved;
        }
        return R.string.f12nameremoved;
    }

    public Class BHH() {
        if (this instanceof C178658gt) {
            if (AnonymousClass3MR.A00(((C178658gt) this).A0A)) {
                return IndiaUpiSendPaymentActivityBottomSheet.class;
            }
            return IndiaUpiSendPaymentActivity.class;
        } else if (!(this instanceof C178648gs)) {
            return null;
        } else {
            C178648gs r2 = (C178648gs) this;
            boolean A012 = r2.A0L.A01();
            boolean A002 = AnonymousClass3MR.A00(r2.A0B);
            if (A012) {
                if (A002) {
                    return BrazilSmbPaymentActivityBottomSheet.class;
                }
                return BrazilSmbPaymentActivity.class;
            } else if (A002) {
                return BrazilPaymentActivityBottomSheet.class;
            } else {
                return BrazilPaymentActivity.class;
            }
        }
    }

    public int BIX(C202319lY r2) {
        if ((this instanceof C178658gt) || (this instanceof C178648gs)) {
            return AnonymousClass1FR.A00(r2);
        }
        return R.color.f6nameremoved;
    }

    public int BIZ(C202319lY r2) {
        AnonymousClass1FR r0;
        if (this instanceof C178658gt) {
            r0 = this.A06;
        } else if (!(this instanceof C178648gs)) {
            return 0;
        } else {
            r0 = ((C178648gs) this).A0Q;
        }
        return r0.A0C(r2);
    }

    public boolean BK1() {
        if (this instanceof C178648gs) {
            return ((C178648gs) this).A0P.A03.A03();
        }
        return false;
    }

    public C175848bA BKT() {
        if (this instanceof C178658gt) {
            return new C175818b6();
        }
        if (this instanceof C178648gs) {
            return new C175808b5();
        }
        return null;
    }

    public C175858bB BKU() {
        if (this instanceof C178648gs) {
            return new AnonymousClass8b7();
        }
        return null;
    }

    public C175728ax BKV() {
        if (this instanceof C178658gt) {
            return new C175698au();
        }
        if (this instanceof C178648gs) {
            return new C175688at();
        }
        return null;
    }

    public C175838b9 BKW() {
        if (this instanceof C178648gs) {
            return new C175738ay();
        }
        return null;
    }

    public C175888bE BKX() {
        if (this instanceof C178648gs) {
            return new C175868bC();
        }
        return null;
    }

    public boolean BLW() {
        if ((this instanceof C178658gt) || (this instanceof C178648gs)) {
            return true;
        }
        return false;
    }

    public boolean BMa() {
        if (this instanceof C178658gt) {
            return true;
        }
        return false;
    }

    public boolean BMh(Uri uri) {
        B2Y b2y;
        if (this instanceof C178658gt) {
            b2y = ((C178658gt) this).A0P;
        } else if (!(this instanceof C178648gs)) {
            return false;
        } else {
            b2y = ((C178648gs) this).A0O;
        }
        return C1901196y.A00(uri, b2y);
    }

    public boolean BNg(AnonymousClass971 r2) {
        if ((this instanceof C178658gt) || (this instanceof C178648gs)) {
            return true;
        }
        return false;
    }

    public void BOh(Uri uri) {
        String queryParameter;
        int length;
        String str;
        if (this instanceof C178658gt) {
            AE8 ae8 = ((C178658gt) this).A0P;
            if (!uri.getQueryParameterNames().isEmpty()) {
                String queryParameter2 = uri.getQueryParameter("campaignID");
                String str2 = null;
                if (queryParameter2 == null) {
                    str = "Unknown signup url";
                } else {
                    if (C1901196y.A00(uri, ae8)) {
                        str = "Blocked signup url";
                    } else {
                        str = null;
                    }
                    try {
                        JSONObject A1B = C36441kJ.A1B();
                        A1B.put("campaign_id", queryParameter2);
                        str2 = A1B.toString();
                    } catch (Exception e) {
                        Log.e("IN PAY: error logging campaign id", e);
                    }
                }
                C176658cT r1 = new C176658cT();
                r1.A0b = "deeplink";
                r1.A08 = C36381kD.A0m();
                r1.A0Z = str2;
                r1.A0T = str;
                ae8.A00.BOl(r1);
            }
        } else if (this instanceof C178648gs) {
            C178648gs r0 = (C178648gs) this;
            AE7 ae7 = r0.A0O;
            boolean A072 = r0.A0P.A07("generic_context");
            String queryParameter3 = uri.getQueryParameter("c");
            if ("br".equals(ae7.A00.A0D(uri)) && queryParameter3 != null) {
                if (A072 || ((queryParameter = uri.getQueryParameter("c")) != null && (length = queryParameter.length()) >= 5 && !(!queryParameter.substring(length - 5, length).equals("9Y6XA")))) {
                    C131606Ps r4 = new C131606Ps((String) null, new C131606Ps[0]);
                    r4.A03("campaign_id", queryParameter3);
                    ae7.A01.BOp(r4, 0, (Integer) null, "deeplink", (String) null);
                }
            }
        }
    }

    public void BQa(Context context, C225014r r6, C202319lY r7) {
        if (this instanceof C178648gs) {
            C178648gs r3 = (C178648gs) this;
            C20810yC r2 = r3.A0B;
            if (r2.A0E(7242)) {
                C201649k3 r1 = r3.A0P;
                if (r1.A07("p2p_context") && r1.A03.A03() && AnonymousClass3RH.A01(r3.A09, r2, r3.A0J)) {
                    ArrayList arrayList = BrazilPaymentIncomeCollectionBottomSheet.A05;
                    r6.Btn(C54962tq.A00(r3.A0M, new C21321AGz(context, r6, r7, r3), "receive_flow"), "BrazilPaymentIncomeCollectionBottomSheet");
                    return;
                }
            }
            r3.A00(context, r6);
            return;
        }
        C18740tg.A06(r7);
        Intent A0H = C36441kJ.A0H(context, B8B());
        A0H.putExtra("extra_setup_mode", 2);
        A0H.putExtra("extra_receive_nux", true);
        if (r7.A0A != null && !TextUtils.isEmpty((CharSequence) null)) {
            A0H.putExtra("extra_onboarding_provider", (String) null);
        }
        AnonymousClass3M9.A01(A0H, "acceptPayment");
        context.startActivity(A0H);
    }

    public void Blk(C202009kr r6, List list) {
        if (this instanceof C178658gt) {
            r6.A02 = 0;
            r6.A03 = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C201599jw r0 = C202319lY.A00((C202319lY) it.next()).A0G;
                if (r0 != null) {
                    if (C202699mR.A03(r0.A0E)) {
                        r6.A03++;
                    } else {
                        r6.A02++;
                    }
                }
            }
        }
    }

    public void Bsr(C24631De r5) {
        if (this instanceof C178658gt) {
            C178658gt r3 = (C178658gt) this;
            C202159l8 A022 = r5.A02();
            if (A022 == C202159l8.A0F) {
                AnonymousClass16U r2 = A022.A02;
                ((AnonymousClass16W) r2).A00 = C165587tf.A0P(C21100yf.A1n, r3.A02, r2);
            }
        } else if (this instanceof C178648gs) {
            C178648gs r32 = (C178648gs) this;
            C202159l8 A023 = r5.A02();
            if (A023 == C202159l8.A0E) {
                AnonymousClass16U r22 = A023.A02;
                ((AnonymousClass16W) r22).A00 = C165587tf.A0P(C21100yf.A1j, r32.A04, r22);
            }
        }
    }

    public boolean Bt9() {
        if (this instanceof C178648gs) {
            return true;
        }
        return false;
    }

    public boolean BtL() {
        if (this instanceof C178648gs) {
            return ((C178648gs) this).A0P.A05();
        }
        return false;
    }

    public AF8(AnonymousClass16D r1, AnonymousClass171 r2, C21060yb r3, C19630wG r4, AnonymousClass1EU r5, AnonymousClass1FR r6, String str) {
        this.A07 = str;
        this.A04 = r4;
        this.A06 = r6;
        this.A03 = r2;
        this.A02 = r1;
        this.A08 = r3;
        this.A05 = r5;
    }

    public /* synthetic */ String BAk() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015c, code lost:
        if (r0 != null) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List BFI(X.C202319lY r6, X.C64933Qa r7) {
        /*
            r5 = this;
            boolean r0 = r6.A0K()
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.lang.String r1 = "type"
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "request"
            X.C36381kD.A1M(r1, r0, r2)
            X.11F r0 = r7.A00
            boolean r0 = X.AnonymousClass143.A0G(r0)
            if (r0 == 0) goto L_0x0023
            com.whatsapp.jid.UserJid r1 = r6.A0E
            X.C18740tg.A06(r1)
            java.lang.String r0 = "sender"
            X.C165577te.A16(r1, r0, r2)
        L_0x0023:
            java.lang.String r1 = r6.A0K
            if (r1 == 0) goto L_0x002c
            java.lang.String r0 = "request-id"
            X.C36381kD.A1M(r0, r1, r2)
        L_0x002c:
            X.8av r0 = r6.A0A
            if (r0 == 0) goto L_0x0041
            long r0 = r0.A09()
            long r0 = X.C36391kE.A0B(r0)
            java.lang.String r1 = java.lang.Long.toString(r0)
            java.lang.String r0 = "expiry-ts"
            X.C36381kD.A1M(r0, r1, r2)
        L_0x0041:
            java.lang.String r0 = r6.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x005c
            java.lang.String r1 = r6.A0G
            java.lang.String r0 = "country"
            X.C36381kD.A1M(r0, r1, r2)
            int r3 = r6.A04
            java.lang.String r1 = "version"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r1, (int) r3)
        L_0x0059:
            r2.add(r0)
        L_0x005c:
            return r2
        L_0x005d:
            java.lang.String r0 = "send"
            X.C36381kD.A1M(r1, r0, r2)
            int r1 = r6.A03
            r0 = 100
            if (r1 != r0) goto L_0x028c
            java.lang.String r1 = "p2m"
        L_0x006a:
            java.lang.String r0 = "transaction-type"
            X.C36381kD.A1M(r0, r1, r2)
            X.11F r0 = r7.A00
            boolean r0 = X.AnonymousClass143.A0G(r0)
            if (r0 == 0) goto L_0x0081
            com.whatsapp.jid.UserJid r1 = r6.A0D
            X.C18740tg.A06(r1)
            java.lang.String r0 = "receiver"
            X.C165577te.A16(r1, r0, r2)
        L_0x0081:
            java.util.ArrayList r4 = r6.A0N
            r1 = 0
            r3 = 1
            if (r4 == 0) goto L_0x009c
            int r0 = r4.size()
            if (r0 != r3) goto L_0x009c
            java.lang.Object r0 = r4.get(r1)
            X.9K8 r0 = (X.AnonymousClass9K8) r0
            X.9un r0 = r0.A01
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "credential-id"
            X.C36381kD.A1M(r0, r1, r2)
        L_0x009c:
            X.8av r4 = r6.A0A
            if (r4 == 0) goto L_0x00e4
            boolean r0 = r4 instanceof X.C175938bJ
            if (r0 == 0) goto L_0x0160
            X.8bJ r4 = (X.C175938bJ) r4
            java.lang.String r0 = r4.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00b5
            java.lang.String r1 = r4.A05
            java.lang.String r0 = "nonce"
            X.C165567td.A1P(r0, r1, r2)
        L_0x00b5:
            java.lang.String r0 = r4.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c4
            java.lang.String r1 = r4.A04
            java.lang.String r0 = "device-id"
            X.C165567td.A1P(r0, r1, r2)
        L_0x00c4:
            java.lang.Boolean r0 = r4.A02
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = X.C165617ti.A0Y(r0)
            java.lang.String r0 = "is_first_send"
            X.C165567td.A1P(r0, r1, r2)
        L_0x00d5:
            java.lang.String r0 = r4.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e4
            java.lang.String r1 = r4.A06
            java.lang.String r0 = "psp_transaction_id"
            X.C165567td.A1P(r0, r1, r2)
        L_0x00e4:
            java.lang.String r0 = r6.A0K
            boolean r0 = X.C203419nz.A07(r0)
            if (r0 == 0) goto L_0x00f6
            java.lang.String r1 = r6.A0K
            X.C18740tg.A06(r1)
            java.lang.String r0 = "id"
            X.C36381kD.A1M(r0, r1, r2)
        L_0x00f6:
            java.lang.String r0 = r6.A0M
            if (r0 == 0) goto L_0x0113
            X.1EU r0 = r5.A05
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r4 = r0.A05
            java.lang.String r1 = r6.A0M
            r0 = 0
            X.9lY r0 = X.C165587tf.A0R(r4, r1, r0)
            if (r0 == 0) goto L_0x0113
            java.lang.String r1 = r0.A0K
            if (r1 == 0) goto L_0x0113
            java.lang.String r0 = "request-id"
            X.C36381kD.A1M(r0, r1, r2)
        L_0x0113:
            int r0 = r6.A00
            if (r0 != r3) goto L_0x011e
            java.lang.String r1 = "buyer"
            java.lang.String r0 = "payment_initiator"
            X.C36381kD.A1M(r0, r1, r2)
        L_0x011e:
            java.lang.String r0 = r6.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0138
            java.lang.String r1 = r6.A0G
            java.lang.String r0 = "country"
            X.C36381kD.A1M(r0, r1, r2)
            int r0 = r6.A04
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "version"
            X.C36381kD.A1M(r0, r1, r2)
        L_0x0138:
            X.1EU r1 = r5.A05
            java.lang.String r0 = r6.A0G
            X.9e3 r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x005c
            java.lang.String r0 = r6.A0I
            X.B66 r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x005c
            X.B2X r1 = r0.BAP()
            if (r1 == 0) goto L_0x005c
            boolean r0 = r1.BNR()
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = r6.A0H
            X.1AL r0 = r1.B7r(r0)
            if (r0 == 0) goto L_0x005c
            goto L_0x0059
        L_0x0160:
            boolean r0 = r4 instanceof X.C175918bH
            if (r0 == 0) goto L_0x017d
            X.8bH r4 = (X.C175918bH) r4
            X.AnonymousClass00C.A0D(r2, r3)
            java.lang.String r1 = r4.A04
            if (r1 == 0) goto L_0x0172
            java.lang.String r0 = "psp_transaction_id"
            X.C165567td.A1P(r0, r1, r2)
        L_0x0172:
            java.lang.String r1 = r4.A03
            if (r1 == 0) goto L_0x00e4
            java.lang.String r0 = "psp_receipt_url"
            X.C165567td.A1P(r0, r1, r2)
            goto L_0x00e4
        L_0x017d:
            boolean r0 = r4 instanceof X.C175928bI
            if (r0 == 0) goto L_0x0278
            X.8bI r4 = (X.C175928bI) r4
            X.6c7 r0 = r4.A0D
            boolean r0 = X.C202349ld.A02(r0)
            if (r0 != 0) goto L_0x0198
            X.6c7 r0 = r4.A0D
            java.lang.Object r1 = X.C165577te.A0g(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "mpin"
            X.C165567td.A1P(r0, r1, r2)
        L_0x0198:
            java.lang.String r0 = r4.A0S
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01a7
            java.lang.String r1 = r4.A0S
            java.lang.String r0 = "seq-no"
            X.C165567td.A1P(r0, r1, r2)
        L_0x01a7:
            java.lang.String r0 = r4.A0Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01b6
            java.lang.String r1 = r4.A0Q
            java.lang.String r0 = "sender-vpa"
            X.C165567td.A1P(r0, r1, r2)
        L_0x01b6:
            java.lang.String r0 = r4.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01c5
            java.lang.String r1 = r4.A0R
            java.lang.String r0 = "sender-vpa-id"
            X.C165567td.A1P(r0, r1, r2)
        L_0x01c5:
            java.lang.String r0 = r4.A0O
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01d4
            java.lang.String r1 = r4.A0O
            java.lang.String r0 = "receiver-vpa"
            X.C165567td.A1P(r0, r1, r2)
        L_0x01d4:
            java.lang.String r0 = r4.A0P
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01e3
            java.lang.String r1 = r4.A0P
            java.lang.String r0 = "receiver-vpa-id"
            X.C165567td.A1P(r0, r1, r2)
        L_0x01e3:
            X.6c7 r0 = r4.A0A
            boolean r0 = X.C202349ld.A02(r0)
            if (r0 != 0) goto L_0x01f6
            X.6c7 r0 = r4.A0A
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "receiver-name"
            X.C165567td.A1P(r0, r1, r2)
        L_0x01f6:
            X.6c7 r0 = r4.A0B
            boolean r0 = X.C202349ld.A02(r0)
            if (r0 != 0) goto L_0x0209
            X.6c7 r0 = r4.A0B
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "sender-name"
            X.C165567td.A1P(r0, r1, r2)
        L_0x0209:
            java.lang.String r0 = r4.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0218
            java.lang.String r1 = r4.A0J
            java.lang.String r0 = "device-id"
            X.C165567td.A1P(r0, r1, r2)
        L_0x0218:
            X.6c7 r0 = r4.A0C
            boolean r0 = X.C202349ld.A02(r0)
            if (r0 != 0) goto L_0x022d
            X.6c7 r0 = r4.A0C
            java.lang.Object r1 = X.C165577te.A0g(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "upi-bank-info"
            X.C165567td.A1P(r0, r1, r2)
        L_0x022d:
            java.lang.String r0 = r4.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x023c
            java.lang.String r1 = r4.A0M
            java.lang.String r0 = "mcc"
            X.C165567td.A1P(r0, r1, r2)
        L_0x023c:
            java.lang.Boolean r0 = r4.A0I
            if (r0 == 0) goto L_0x024d
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = X.C165617ti.A0Y(r0)
            java.lang.String r0 = "is_first_send"
            X.C165567td.A1P(r0, r1, r2)
        L_0x024d:
            X.9uo r0 = r4.A02
            if (r0 == 0) goto L_0x0258
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "ref-id"
            X.C165567td.A1P(r0, r1, r2)
        L_0x0258:
            java.lang.String r0 = r4.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0267
            java.lang.String r1 = r4.A0N
            java.lang.String r0 = "purpose-code"
            X.C165567td.A1P(r0, r1, r2)
        L_0x0267:
            java.lang.String r0 = r4.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e4
            java.lang.String r1 = r4.A0L
            java.lang.String r0 = "mandate-transaction-id"
            X.C165567td.A1P(r0, r1, r2)
            goto L_0x00e4
        L_0x0278:
            boolean r0 = r4 instanceof X.C175908bG
            if (r0 == 0) goto L_0x0290
            X.8bG r4 = (X.C175908bG) r4
            X.AnonymousClass00C.A0D(r2, r3)
            java.lang.String r1 = r4.A01
            if (r1 == 0) goto L_0x00e4
            java.lang.String r0 = "psp_transaction_id"
            X.C165567td.A1P(r0, r1, r2)
            goto L_0x00e4
        L_0x028c:
            java.lang.String r1 = "p2p"
            goto L_0x006a
        L_0x0290:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AF8.BFI(X.9lY, X.3Qa):java.util.List");
    }

    public String getName() {
        return this.A07;
    }
}
