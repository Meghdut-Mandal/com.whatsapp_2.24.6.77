package X;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity;

/* renamed from: X.8it  reason: invalid class name and case insensitive filesystem */
public abstract class C179008it extends C179088j3 implements B1N, C22964AzG {
    public C175748az A00;
    public AnonymousClass8gP A01;
    public String A02;
    public final C24611Dc A03 = C165587tf.A0X("IndiaUpiBaseResetPinActivity");
    public final BroadcastReceiver A04 = new C23131B6m(this, 5);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass17Y r2 = this.A05;
        AnonymousClass19A r3 = this.A0H;
        C29131Vl r10 = this.A0D;
        C202269lR r4 = this.A0L;
        C29121Vk r7 = this.A0M;
        C195479Ul r8 = this.A06;
        AF7 af7 = this.A0S;
        this.A01 = new AnonymousClass8gP(this, r2, r3, r4, this.A0M, this.A0K, r7, r8, af7, r10);
        AnonymousClass0YC.A00(getApplicationContext()).A02(this.A04, new IntentFilter("TRIGGER_OTP"));
    }

    public void A4K() {
        if (this instanceof IndiaUpiDebitCardVerificationActivity) {
            IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity = (IndiaUpiDebitCardVerificationActivity) this;
            AnonymousClass8gP r3 = indiaUpiDebitCardVerificationActivity.A01;
            C175898bF r2 = indiaUpiDebitCardVerificationActivity.A05.A08;
            C18740tg.A06(r2);
            r3.A01((C135086c7) null, (C175818b6) r2, indiaUpiDebitCardVerificationActivity, "BANK");
            return;
        }
        IndiaUpiAadhaarCardVerificationActivity indiaUpiAadhaarCardVerificationActivity = (IndiaUpiAadhaarCardVerificationActivity) this;
        AnonymousClass8gP r32 = indiaUpiAadhaarCardVerificationActivity.A01;
        C175748az r0 = indiaUpiAadhaarCardVerificationActivity.A02;
        if (r0 == null) {
            throw C36331k8.A0d("bankAccount");
        }
        C175898bF r22 = r0.A08;
        C18740tg.A06(r22);
        r32.A01(indiaUpiAadhaarCardVerificationActivity.A03, (C175818b6) r22, indiaUpiAadhaarCardVerificationActivity, "AADHAAR");
    }

    public void A4L(C175748az r4) {
        this.A00 = r4;
        Bu1(R.string.f12nameremoved);
        C24611Dc r2 = this.A03;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("onResume with states: ");
        C165567td.A17(r2, this.A04, A0u);
        if (!this.A04.A07.contains("upi-get-challenge") && this.A0M.A09().A00 == null) {
            this.A04.A01("upi-get-challenge");
            A4A();
        } else if (!this.A04.A07.contains("upi-get-challenge")) {
            A4E();
        }
    }

    public void BZk(C202059ky r5, String str) {
        Integer num;
        C175748az r0;
        this.A0S.A06(this.A00, r5, 1);
        if (!TextUtils.isEmpty(str) && (r0 = this.A00) != null && r0.A08 != null) {
            A4K();
        } else if (r5 != null && !AEA.A02(this, "upi-list-keys", r5.A00, true)) {
            if (this.A04.A05("upi-list-keys")) {
                this.A0M.A0F();
                this.A08.A02();
                return;
            }
            C24611Dc r3 = this.A03;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("onListKeys: ");
            C175898bF r1 = null;
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            A0u.append(num);
            A0u.append(" bankAccount: ");
            A0u.append(this.A00);
            A0u.append(" countrydata: ");
            C175748az r02 = this.A00;
            if (r02 != null) {
                r1 = r02.A08;
            }
            A0u.append(r1);
            C165567td.A18(r3, " failed; ; showErrorAndFinish", A0u);
            A4D();
        }
    }

    public void Bc3(C202059ky r4) {
        this.A0S.A06(this.A00, r4, 16);
        if (!AEA.A02(this, "upi-generate-otp", r4.A00, true)) {
            this.A03.A06("onRequestOtp failed; showErrorAndFinish");
            A13(this, new C199729fr(R.string.f12nameremoved));
        }
    }

    public void BgO(C202059ky r5) {
        int i;
        this.A0S.A06(this.A00, r5, 6);
        if (r5 == null) {
            this.A03.A06("onSetPin success; showSuccessAndFinish");
            C36331k8.A1F(new B7V(this, 1), this.A04);
            return;
        }
        Bnv();
        if (!AEA.A02(this, "upi-set-mpin", r5.A00, true)) {
            Bundle A07 = AnonymousClass001.A07();
            A07.putInt("error_code", r5.A00);
            C175748az r0 = this.A00;
            if (!(r0 == null || r0.A08 == null)) {
                int i2 = r5.A00;
                if (i2 == 11460 || i2 == 11461) {
                    i = 14;
                } else if (i2 == 11456 || i2 == 11471) {
                    i = 13;
                } else if (i2 == 11458 || i2 == 11457) {
                    i = 17;
                } else {
                    i = 10;
                    if (i2 != 11459) {
                        i = 16;
                        if (i2 != 11496) {
                            if (i2 == 11499) {
                                i = 23;
                            } else {
                                this.A03.A06("onSetPin failed; showErrorAndFinish");
                            }
                        }
                    }
                }
                AnonymousClass3SJ.A02(this, A07, i);
                return;
            }
            A4D();
        }
    }

    public Dialog onCreateDialog(int i, Bundle bundle) {
        if (i == 10) {
            String A0D = this.A0M.A0D();
            return A48(new C1503274v(10, A0D, this), this.A09.A02(bundle, getString(R.string.f12nameremoved)), 10, R.string.f12nameremoved, R.string.f12nameremoved);
        } else if (i == 23) {
            return A48(new AVX(this, 42), this.A09.A02(bundle, getString(R.string.f12nameremoved)), 23, R.string.f12nameremoved, R.string.f12nameremoved);
        } else if (i == 13) {
            this.A0M.A0G();
            return A48(new AVX(this, 41), this.A09.A02(bundle, getString(R.string.f12nameremoved)), 13, R.string.f12nameremoved, R.string.f12nameremoved);
        } else if (i == 14) {
            return A48(new AVX(this, 39), this.A09.A02(bundle, getString(R.string.f12nameremoved)), 14, R.string.f12nameremoved, R.string.f12nameremoved);
        } else if (i == 16) {
            return A48(new AVX(this, 40), this.A09.A02(bundle, getString(R.string.f12nameremoved)), 16, R.string.f12nameremoved, R.string.f12nameremoved);
        } else if (i != 17) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass6PS r4 = this.A09;
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L, 6, 0);
            return A48((Runnable) null, r4.A02(bundle, getString(R.string.f12nameremoved, A0L)), 17, R.string.f12nameremoved, R.string.f12nameremoved);
        }
    }

    public static void A13(C179008it r3, C199729fr r4) {
        r3.Bnv();
        if (r4.A00 == 0) {
            r4.A00 = R.string.f12nameremoved;
        }
        if (r3.A0k) {
            r3.A3v();
            Intent A0H = C36441kJ.A0H(r3, IndiaUpiOnboardingErrorEducationActivity.class);
            if (AnonymousClass000.A1V(r4.A01)) {
                A0H.putExtra("error", r4.A01(r3));
            }
            A0H.putExtra("error", r4.A00);
            r3.A42(A0H);
            r3.A33(A0H, true);
            return;
        }
        r3.BO6(r4.A01(r3));
    }

    public void A4C() {
        super.A4C();
        Bwu(getString(R.string.f12nameremoved));
    }

    public void A4F() {
        Bu1(R.string.f12nameremoved);
        super.A4F();
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass0YC.A00(getApplicationContext()).A01(this.A04);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0k = bundle.getBoolean("inSetupSavedInst");
        C175748az r0 = (C175748az) bundle.getParcelable("bankAccountSavedInst");
        if (r0 != null) {
            this.A00 = r0;
            this.A00.A08 = (C175898bF) bundle.getParcelable("countryDataSavedInst");
        }
        if (bundle.containsKey("seqNumSavedInst")) {
            this.A02 = bundle.getString("seqNumSavedInst");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C175898bF r1;
        super.onSaveInstanceState(bundle);
        if (this.A0k) {
            bundle.putBoolean("inSetupSavedInst", true);
        }
        C175748az r12 = this.A00;
        if (r12 != null) {
            bundle.putParcelable("bankAccountSavedInst", r12);
        }
        C175748az r0 = this.A00;
        if (!(r0 == null || (r1 = r0.A08) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        String str = this.A02;
        if (str != null) {
            bundle.putString("seqNumSavedInst", str);
        }
    }

    public Dialog onCreateDialog(int i) {
        return onCreateDialog(i, (Bundle) null);
    }
}
