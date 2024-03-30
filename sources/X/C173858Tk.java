package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.8Tk  reason: invalid class name and case insensitive filesystem */
public abstract class C173858Tk extends AnonymousClass155 {
    public static void A0s(C202269lR r2, AE0 ae0, IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity) {
        ae0.B5D(r2.A04(indiaUpiDeviceBindStepActivity.A0A), true);
    }

    public static void A0t(C131606Ps r2, C178848hw r3) {
        r2.A02("is_alias_resolved", 1);
        if (!TextUtils.isEmpty(r3.A0P)) {
            r2.A03("receiver_platform", r3.A0P);
        }
    }

    public static void A0v(IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity, AnonymousClass9Td r3) {
        r3.A00.A0C(3);
        indiaUpiDeviceBindStepActivity.A0K.A00.A0C(3);
    }

    public static Intent A01(Context context, C199729fr r4) {
        Intent intent = new Intent(context, IndiaUpiOnboardingErrorEducationActivity.class);
        if (r4.A01 != null) {
            intent.putExtra("error_text", r4.A01(context));
        }
        return intent;
    }

    public static Integer A0I(String str, StringBuilder sb) {
        sb.append("onListKeys: ");
        if (str != null) {
            return Integer.valueOf(str.length());
        }
        return null;
    }

    public static String A0J(C179128jE r1) {
        return r1.A3t(r1.A0M.A0A());
    }

    public static String A0K(C179128jE r0) {
        return r0.A0M.A0B();
    }

    public static String A0L(C179128jE r2) {
        if (r2.A0N.A08(r2.A0a)) {
            return "CREDIT";
        }
        return null;
    }

    public static String A0M(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity) {
        return indiaUpiSendPaymentActivity.A04.A00(indiaUpiSendPaymentActivity.A0S, indiaUpiSendPaymentActivity.A0c, indiaUpiSendPaymentActivity.A0n);
    }

    public static void A0i(C27111My r1, C18800tq r2, C18830tt r3, C179148jG r4, Object obj) {
        r4.A0N = (C24631De) obj;
        r4.A0K = (C29221Vu) r2.A6A.get();
        r4.A0S = r2.AGc();
        r4.A05 = (C19630wG) r2.A91.get();
        r4.A0C = r2.ADd();
        r4.A0Z = (C28441Sr) r2.A1g.get();
        r4.A03 = (C1033354w) r3.A5C.get();
        r4.A04 = (C20430xY) r2.A2H.get();
        r4.A0O = (AnonymousClass1EV) r2.A6K.get();
        r4.A0W = C27111My.A2y(r1);
        r4.A0L = r2.AGU();
        r4.A0T = (AnonymousClass1YQ) r2.A69.get();
        r4.A06 = (AnonymousClass1A5) r2.A2K.get();
        r4.A0R = C27111My.A2s(r1);
        r4.A0V = C27111My.A2w(r1);
    }

    public static void A0j(C27111My r1, C18800tq r2, C18830tt r3, BrazilPaymentActivity brazilPaymentActivity, C19890wg r5) {
        brazilPaymentActivity.A0Y = r5;
        brazilPaymentActivity.A0N = (AnonymousClass6VG) r3.AAa.get();
        brazilPaymentActivity.A0H = (C200049gU) r2.AW3.get();
        brazilPaymentActivity.A0G = (C29931Yo) r2.AVT.get();
        brazilPaymentActivity.A0D = (AnonymousClass1DR) r2.A6G.get();
        brazilPaymentActivity.A0F = (C29971Ys) r2.AVP.get();
        brazilPaymentActivity.A0Q = (C201649k3) r3.A5T.get();
        brazilPaymentActivity.A0M = (AnonymousClass5GL) r3.A5R.get();
        brazilPaymentActivity.A0T = C27111My.A2x(r1);
        brazilPaymentActivity.A0V = (C202199lE) r3.A5G.get();
        brazilPaymentActivity.A0W = (AnonymousClass9UG) r3.A5J.get();
        brazilPaymentActivity.A0E = (C1262363c) r3.A5M.get();
        brazilPaymentActivity.A09 = C27111My.A2m(r1);
    }

    public static void A0k(C27111My r1, C18800tq r2, C18830tt r3, C179108jC r4) {
        r4.A00 = (C18820ts) r2.A9X.get();
        r4.A0D = (C29131Vl) r2.A67.get();
        r4.A01 = (AEA) r3.A2H.get();
        r4.A06 = C27111My.A2p(r1);
        r4.A05 = (C24641Df) r2.AW0.get();
        r4.A09 = (AnonymousClass6PS) r2.A68.get();
        r4.A0B = (AFF) r3.A9B.get();
        r4.A0A = (AFC) r3.A63.get();
        r4.A0C = (C194949Rw) r3.A62.get();
    }

    public static void A0l(C18800tq r1, C18830tt r2, AnonymousClass1Pp r3, C179098jA r4) {
        r4.A00 = r3;
        r4.A0B = (C202699mR) r2.A2F.get();
        r4.A0C = (C198629dt) r1.APP.get();
        r4.A01 = (C20830yE) r1.A9E.get();
        r4.A07 = (AnonymousClass3EU) r2.AAg.get();
        r4.A02 = (AnonymousClass16T) r1.A66.get();
        r4.A0A = (C199849g7) r1.A6C.get();
        r4.A06 = (AnonymousClass2ZN) r1.AVK.get();
        r4.A08 = (AnonymousClass1XA) r1.A6L.get();
        r4.A0D = r1.AHh();
    }

    public static void A0m(C18800tq r1, C18830tt r2, C27731Pn r3, C178848hw r4) {
        r4.A02 = r3;
        r4.A01 = (AnonymousClass1Pp) r1.A28.get();
        r4.A0N = (C198629dt) r1.APP.get();
        r4.A04 = (AnonymousClass12O) r1.A98.get();
        r4.A03 = (C20830yE) r1.A9E.get();
        r4.A07 = (AnonymousClass16T) r1.A66.get();
        r4.A0K = (C199849g7) r1.A6C.get();
        r4.A0A = (AnonymousClass2ZN) r1.AVK.get();
        r4.A0C = (AnonymousClass1XA) r1.A6L.get();
        r4.A0B = r2.A7n();
        r4.A0G = (C199799fz) r2.A97.get();
        r4.A0O = r1.AHh();
        r4.A0I = (C198199d4) r1.APM.get();
    }

    public static void A0n(C18800tq r1, C18830tt r2, BrazilPaymentActivity brazilPaymentActivity) {
        brazilPaymentActivity.A0Z = (C32681e1) r2.A2Y.get();
        brazilPaymentActivity.A04 = (AnonymousClass171) r1.A90.get();
        brazilPaymentActivity.A05 = (C18820ts) r1.A9X.get();
        brazilPaymentActivity.A0X = (C29131Vl) r1.A67.get();
        brazilPaymentActivity.A08 = (C201269jE) r2.A5H.get();
        brazilPaymentActivity.A0C = (C24601Db) r1.A6D.get();
        brazilPaymentActivity.A07 = (C147166wm) r2.A5F.get();
    }

    public static void A0p(C18800tq r1, C18830tt r2, C179128jE r3) {
        r3.A04 = (AnonymousClass3DY) r1.A7b.get();
        r3.A0D = (AnonymousClass13E) r1.A96.get();
        r3.A0P = (C24601Db) r1.A6D.get();
        r3.A0N = (C201659k4) r1.APO.get();
        r3.A0L = (C202269lR) r1.A48.get();
        r3.A0J = (C199499fP) r2.A5B.get();
        r3.A0S = (AF7) r1.A47.get();
        r3.A0M = (AE0) r1.A49.get();
        r3.A0R = (C1033154u) r1.AVf.get();
        r3.A0V = (AnonymousClass5GM) r2.A2I.get();
        r3.A05 = (C20050ww) r1.A7v.get();
    }

    public static void A0r(C176658cT r1, C179128jE r2) {
        r2.A0S.BOl(r1);
    }

    public static void A0u(AF7 af7, IndiaUpiBankAccountAddedLandingActivity indiaUpiBankAccountAddedLandingActivity, Integer num, Integer num2) {
        AF7 af72 = af7;
        af72.A08(IndiaUpiBankAccountAddedLandingActivity.A0z(indiaUpiBankAccountAddedLandingActivity), num, num2, indiaUpiBankAccountAddedLandingActivity.A0b, "registration_complete", (String) null);
    }

    public static void A0w(C179108jC r1) {
        r1.A0M.A0F();
        r1.Bnv();
        r1.Bu1(R.string.f12nameremoved);
        r1.A08.A02();
    }

    public static boolean A0x(C179148jG r0) {
        return r0.A0I.A0D();
    }

    public static boolean A0y(C179048iy r3) {
        return r3.A0O.A0J(r3.A08, r3.A09);
    }

    public C173858Tk() {
        B7Y.A00(this, 32);
    }

    public static Parcelable A07(Activity activity) {
        return activity.getIntent().getParcelableExtra("extra_bank_account");
    }

    public static AnonymousClass07B A0F(C179128jE r2) {
        r2.A3y(R.drawable.onboarding_actionbar_home_close, R.id.scroll_view);
        return r2.getSupportActionBar();
    }

    public static C179648kT A0G(C18830tt r0) {
        return (C179648kT) r0.A99.get();
    }

    public static WDSButton A0H(TextView textView, IndiaUpiBankAccountAddedLandingActivity indiaUpiBankAccountAddedLandingActivity, int i) {
        textView.setText(i);
        indiaUpiBankAccountAddedLandingActivity.A07.setVisibility(8);
        return indiaUpiBankAccountAddedLandingActivity.A06;
    }

    public static void A0O(View view, C207249un r2) {
        Bitmap A0A = r2.A0A();
        ImageView imageView = (ImageView) C012005e.A02(view, R.id.provider_icon);
        if (A0A != null) {
            imageView.setImageBitmap(A0A);
        } else {
            imageView.setImageResource(R.drawable.av_bank);
        }
    }

    public static void A0Q(TextView textView, IndiaUpiBankAccountAddedLandingActivity indiaUpiBankAccountAddedLandingActivity, int i) {
        textView.setText(i);
        indiaUpiBankAccountAddedLandingActivity.A02.setText(R.string.f12nameremoved);
    }

    public static void A0h(C27111My r1, C18800tq r2, C18830tt r3, C179148jG r4) {
        r4.A0Q = (AnonymousClass9SJ) r3.AAu.get();
        r4.A0H = (AnonymousClass19A) r2.A4x.get();
        r4.A0P = (AnonymousClass1EU) r2.A6M.get();
        r4.A07 = (C20310xM) r2.A2S.get();
        r4.A0e = (AnonymousClass1A1) r2.A3H.get();
        r4.A0b = r2.AIv();
        r4.A0I = (AnonymousClass1EZ) r2.A65.get();
        r4.A08 = (AnonymousClass1VZ) r2.A6B.get();
        r4.A0X = C27111My.A2z(r1);
        r4.A0M = (C29121Vk) r2.A6I.get();
        r4.A0d = (AnonymousClass1HA) r2.A84.get();
    }

    public static void A0o(C18800tq r1, C18830tt r2, BrazilPaymentActivity brazilPaymentActivity) {
        brazilPaymentActivity.A0K = (C195219Sy) r2.A5P.get();
        brazilPaymentActivity.A0P = (C201219j5) r2.A5I.get();
        brazilPaymentActivity.A0a = (C64813Pn) r2.A9Z.get();
        brazilPaymentActivity.A0O = (C196039Xk) r2.AAd.get();
        brazilPaymentActivity.A0J = (C23075B3f) r2.A0R.get();
        brazilPaymentActivity.A0L = (AnonymousClass646) r1.ATw.get();
        brazilPaymentActivity.A06 = (AnonymousClass16T) r1.A66.get();
        brazilPaymentActivity.A0S = (C199849g7) r1.A6C.get();
        brazilPaymentActivity.A0B = (AnonymousClass2ZN) r1.AVK.get();
        brazilPaymentActivity.A0I = (AnonymousClass6PS) r1.A68.get();
        brazilPaymentActivity.A0A = (AnonymousClass6VM) r1.ACd.get();
    }

    public static void A0q(C18800tq r1, C18830tt r2, C179128jE r3) {
        r3.A0j = r2.AAl;
        r3.A0W = (AnonymousClass1FR) r1.A6O.get();
        r3.A07 = (C24881Ed) r1.A6H.get();
        r3.A0Q = (AnonymousClass1DR) r1.A6G.get();
        r3.A06 = (AnonymousClass171) r1.A90.get();
        r3.A0C = (C21010yW) r1.A79.get();
    }
}
