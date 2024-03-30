package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.9XQ  reason: invalid class name */
public abstract class AnonymousClass9XQ {
    public final Context A00;
    public final AnonymousClass17Y A01;
    public final C19730wQ A02;
    public final C19970wo A03;
    public final AnonymousClass16S A04;
    public final C29221Vu A05;
    public final C29121Vk A06;
    public final AnonymousClass1EU A07;
    public final C200049gU A08;
    public final C195219Sy A09;

    public void A01() {
        Log.i("PAY: BrazilStepUpVerificationBase getProviderEncryptionKeyAsync");
        C200049gU r8 = this.A08;
        AF3 A012 = r8.A01("VISA", "STEP-UP");
        if (A012 == null) {
            new AnonymousClass9SR(this.A00, this.A01, this.A05, this.A06, r8, "STEP-UP").A00(new C23196B9e(this, 1), "VISA");
            return;
        }
        A02((C202059ky) null, A012);
    }

    public void A02(C202059ky r5, AF3 af3) {
        AnonymousClass9RZ r0;
        C194699Qu r02;
        if (this instanceof AnonymousClass8g6) {
            AnonymousClass8g6 r2 = (AnonymousClass8g6) this;
            if (r5 != null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("PAY: BrazilVerifyCardSendAuthCodeAction  onProviderKeyFetched auth code failure ");
                C36321k7.A1Z(A0u, r5.A07);
                r02 = r2.A02;
            } else {
                String A042 = r2.A01.A04(af3, r2.A03);
                if (TextUtils.isEmpty(A042)) {
                    Log.e("PAY: BrazilVerifyCardSendAuthCodeAction  onProviderKeyFetched auth code failure");
                    r02 = r2.A02;
                    r5 = C202059ky.A00();
                } else {
                    Log.i("PAY: BrazilVerifyCardSendAuthCodeAction onProviderKeyFetched success");
                    AnonymousClass8g6.A00(r2, A042);
                    return;
                }
            }
            r02.A00(r5);
            return;
        }
        AnonymousClass8g7 r3 = (AnonymousClass8g7) this;
        if (r5 != null) {
            r0 = r3.A04;
        } else {
            String A043 = r3.A02.A04(af3, r3.A06);
            if (TextUtils.isEmpty(A043)) {
                Log.e("PAY: BrazilVerifyCardOTPSendAction encryptAndSendOtp/enc otp failure");
                r0 = r3.A04;
                r5 = C202059ky.A00();
            } else {
                Log.i("PAY: BrazilVerifyCardOTPSendAction encryptAndSendOtp");
                AnonymousClass8g7.A00(r3, A043);
                return;
            }
        }
        r0.A00((C175798b4) null, r5);
    }

    public void A03(C202059ky r12, String str) {
        if (this instanceof AnonymousClass8g6) {
            throw null;
        }
        AnonymousClass8g7 r3 = (AnonymousClass8g7) this;
        if (r12 != null || str == null) {
            r3.A04.A00((C175798b4) null, r12);
            return;
        }
        r3.A09.A00(str);
        C200049gU r9 = r3.A08;
        AF3 A012 = r9.A01("ELO", "ADD-CARD");
        if (A012 == null) {
            new AnonymousClass9SR(r3.A00, r3.A01, r3.A05, r3.A06, r9, "ADD-CARD").A00(new C23196B9e(r3, 2), "FB");
            return;
        }
        AnonymousClass8g7.A00(r3, r3.A02.A03((AF2) A012.A00, r3.A06));
    }

    public AnonymousClass9XQ(Context context, AnonymousClass17Y r2, C19730wQ r3, C19970wo r4, AnonymousClass16S r5, C29221Vu r6, C29121Vk r7, AnonymousClass1EU r8, C200049gU r9, C195219Sy r10) {
        this.A03 = r4;
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r8;
        this.A09 = r10;
        this.A06 = r7;
        this.A05 = r6;
        this.A08 = r9;
    }
}
