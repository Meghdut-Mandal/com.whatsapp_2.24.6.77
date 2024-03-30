package X;

import android.content.Intent;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;

/* renamed from: X.3yB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C82123yB implements C009003v {
    public final /* synthetic */ RegisterPhone A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C82123yB(RegisterPhone registerPhone, boolean z) {
        this.A00 = registerPhone;
        this.A01 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        RegisterPhone registerPhone = this.A00;
        boolean z = this.A01;
        String str = (String) obj2;
        if (obj == C51972og.SUCCESS) {
            C29501Ww.A02(registerPhone.A0J, 20, true);
            int A03 = C36361kB.A03(registerPhone.A0P.A07);
            long j = registerPhone.A04;
            long j2 = registerPhone.A05;
            long j3 = registerPhone.A06;
            long j4 = registerPhone.A02;
            int A012 = AnonymousClass24S.A01(registerPhone);
            boolean A1S = AnonymousClass000.A1S(C36361kB.A03(registerPhone.A0P.A00), 3);
            int A032 = C36361kB.A03(registerPhone.A0P.A0E);
            Intent A0B = C36381kD.A0B(registerPhone);
            A0B.putExtra("flash_type", A03);
            A0B.putExtra("sms_retry_time", j);
            A0B.putExtra("voice_retry_time", j2);
            A0B.putExtra("wa_old_retry_time", j3);
            A0B.putExtra("email_otp_retry_time", j4);
            A0B.putExtra("wa_old_eligible", A012);
            A0B.putExtra("fraud_eligible", A1S);
            A0B.putExtra("passkey_solved_challenge", str);
            A0B.putExtra("silent_auth_eligible", A032);
            A0B.putExtra("code_verification_mode", 0);
            registerPhone.startActivity(A0B);
            registerPhone.finish();
            return null;
        } else if (z) {
            C81153wY.A00(registerPhone.A05, registerPhone, 7);
            return null;
        } else {
            RegisterPhone.A0o(registerPhone, true);
            return null;
        }
    }
}
