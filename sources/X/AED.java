package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivityBottomSheet;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Objects;

public class AED implements C88844Ug {
    public final C21100yf A00;
    public final AF7 A01;
    public final C20810yC A02;
    public final AE0 A03;
    public final C24611Dc A04 = C165607th.A0a("IndiaUpiPaymentQrManager");
    public final C202699mR A05;

    public DialogFragment BGM(AnonymousClass11F r2, String str, String str2, int i) {
        String str3;
        if (i != 3) {
            str3 = "SCANNED_QR_CODE";
        } else {
            str3 = "GALLERY_QR_CODE";
        }
        return IndiaUpiQrCodeScannedDialogFragment.A03(r2, str, str3, str2);
    }

    public void BJh(AnonymousClass01I r1, String str, int i, int i2) {
    }

    public boolean BNe(String str, int i, int i2) {
        return false;
    }

    public void A00(Activity activity, AnonymousClass11F r19, B1D b1d, String str, String str2, String str3, int i, boolean z) {
        Class cls;
        int i2;
        String str4;
        C20810yC r4 = this.A02;
        AE0 ae0 = this.A03;
        Activity activity2 = activity;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        if (!C202809mh.A02(r4, ae0.A0B()) || !C202809mh.A03(r4, str5)) {
            C203479o6 A012 = C203479o6.A01(str5, str6);
            String A002 = AE0.A00(ae0);
            B1D b1d2 = b1d;
            if (A012 != null && (str4 = A012.A0O) != null && str4.equalsIgnoreCase(A002)) {
                i2 = R.string.f12nameremoved;
            } else if (b1d != null && str != null && str5.startsWith("upi://mandate") && r4.A0E(2211)) {
                C202699mR r6 = this.A05;
                Objects.requireNonNull(b1d2);
                r6.A08(activity2, A012, new C203029n9(b1d2, 0), str7, true);
                return;
            } else if (C202759mb.A04(r4, A012)) {
                i2 = R.string.f12nameremoved;
            } else {
                if (AnonymousClass3MR.A00(r4)) {
                    cls = IndiaUpiSendPaymentActivityBottomSheet.class;
                } else {
                    cls = IndiaUpiSendPaymentActivity.class;
                }
                Intent A0H = C36441kJ.A0H(activity2, cls);
                C21100yf r12 = this.A00;
                AnonymousClass11F r13 = r19;
                if (z) {
                    C202759mb.A02(A0H, r12, r13, A012, str7, false);
                    A0H.putExtra("extra_return_result_and_finish_on_send_money_complete", true);
                    activity2.startActivityForResult(A0H, i);
                } else {
                    C202759mb.A02(A0H, r12, r13, A012, str7, true);
                    activity2.startActivity(A0H);
                }
                if (b1d != null) {
                    b1d2.Bfj();
                    return;
                }
                return;
            }
            String string = activity2.getString(i2);
            this.A01.BOm(C36381kD.A0m(), (Integer) null, "qr_code_scan_error", str7);
            C39001qm A003 = AnonymousClass3LW.A00(activity2);
            B83.A01(A003, b1d2, 13, R.string.f12nameremoved);
            A003.A0p(string);
            B87.A00(A003, b1d2, 6);
            C36341k9.A11(A003);
            return;
        }
        Intent A0H2 = C36441kJ.A0H(activity2, IndiaUpiInternationalValidateQrActivity.class);
        try {
            A0H2.putExtra("INTERNATIONAL_QR_PAYLOAD", URLEncoder.encode(str5, DefaultCrypto.UTF_8));
        } catch (UnsupportedEncodingException e) {
            this.A04.A0A("Url encode of qr payload failure: ", e);
        }
        A0H2.putExtra("INTERNATIONAL_QR_SOURCE", str6);
        C165597tg.A0z(A0H2, str7);
        activity2.startActivity(A0H2);
    }

    public void Bu6(Activity activity, AnonymousClass11F r11, String str, String str2) {
        A00(activity, r11, C21232ADo.A00, str, "SCANNED_QR_CODE", str2, 0, false);
    }

    public AED(C21100yf r2, C20810yC r3, AE0 ae0, AF7 af7, C202699mR r6) {
        this.A03 = ae0;
        this.A00 = r2;
        this.A01 = af7;
        this.A02 = r3;
        this.A05 = r6;
    }

    public String BFT(String str) {
        C203479o6 A002 = C203479o6.A00(Uri.parse(str), "SCANNED_QR_CODE");
        if (A002 != null) {
            return A002.A0O;
        }
        return null;
    }

    public boolean BNd(String str) {
        C203479o6 A002 = C203479o6.A00(Uri.parse(str), "SCANNED_QR_CODE");
        if (!AnonymousClass000.A1P(str.startsWith("upi://mandate") ? 1 : 0) ? A002 != null : !(!this.A02.A0E(2211) || A002 == null || A002.A0L != null)) {
            if (!TextUtils.isEmpty(A002.A0O)) {
                return true;
            }
        }
        return false;
    }
}
