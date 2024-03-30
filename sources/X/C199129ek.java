package X;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.9ek  reason: invalid class name and case insensitive filesystem */
public class C199129ek {
    public static final long[] A0K = {3, 2, 15};
    public HandlerThread A00;
    public B1L A01;
    public C166077uz A02;
    public String A03;
    public String A04;
    public final AnonymousClass17Y A05;
    public final C19630wG A06;
    public final AnonymousClass16T A07;
    public final C20810yC A08;
    public final AnonymousClass19A A09;
    public final AE0 A0A;
    public final C29221Vu A0B;
    public final AnonymousClass9YX A0C;
    public final AnonymousClass1EU A0D;
    public final AF7 A0E;
    public final AnonymousClass5GM A0F;
    public final C201529jn A0G;
    public final C29131Vl A0H;
    public final C19770wU A0I;
    public final C202269lR A0J;

    public C199129ek(AnonymousClass17Y r10, C19630wG r11, AnonymousClass16T r12, C20810yC r13, AnonymousClass19A r14, C175818b6 r15, C202269lR r16, AE0 ae0, C29221Vu r18, AnonymousClass1EU r19, B1L b1l, AF7 af7, AnonymousClass5GM r22, C201529jn r23, C29131Vl r24, C19770wU r25) {
        String A0A2;
        String str;
        this.A08 = r13;
        this.A05 = r10;
        this.A06 = r11;
        this.A0I = r25;
        this.A09 = r14;
        C29131Vl r7 = r24;
        this.A0H = r7;
        this.A0D = r19;
        C202269lR r4 = r16;
        this.A0J = r4;
        this.A07 = r12;
        this.A0B = r18;
        AE0 ae02 = ae0;
        this.A0A = ae02;
        this.A0G = r23;
        this.A0E = af7;
        this.A0F = r22;
        this.A0C = r4.A04;
        this.A01 = b1l;
        C175818b6 r3 = r15;
        this.A03 = r4.A04(r15);
        C175718aw A002 = C202269lR.A00(r15, r4);
        if (A002 != null) {
            Bundle bundle = A002.A00;
            if (bundle != null) {
                str = bundle.getString("transactionPrefix");
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle2 = A002.A00;
                if (bundle2 != null) {
                    A0A2 = bundle2.getString("transactionPrefix");
                } else {
                    A0A2 = null;
                }
                this.A04 = A0A2;
                HandlerThread handlerThread = new HandlerThread("PAY: device binding iq sender");
                this.A00 = handlerThread;
                handlerThread.start();
                this.A02 = new C166077uz(this.A00.getLooper(), r3, r4, ae02, this, r7, this.A03);
            }
        }
        A0A2 = r4.A0A.A0A();
        this.A04 = A0A2;
        HandlerThread handlerThread2 = new HandlerThread("PAY: device binding iq sender");
        this.A00 = handlerThread2;
        handlerThread2.start();
        this.A02 = new C166077uz(this.A00.getLooper(), r3, r4, ae02, this, r7, this.A03);
    }

    public void A00(C175818b6 r25, String str) {
        String A042;
        Log.i("PAY: sendGetBankAccounts called");
        AnonymousClass9YX r13 = this.A0C;
        r13.A02("upi-get-accounts");
        AnonymousClass19A r12 = this.A09;
        String A092 = r12.A09();
        AE0 ae0 = this.A0A;
        C175818b6 r2 = r25;
        if (!TextUtils.isEmpty(ae0.A0B())) {
            A042 = ae0.A0B();
        } else {
            A042 = this.A0J.A04(r2);
        }
        ArrayList arrayList = AnonymousClass8v0.A00;
        String A012 = this.A0H.A01();
        Long A15 = C36431kI.A15(r2.A0B);
        String str2 = r2.A09;
        AnonymousClass5GM r10 = null;
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1E(A0T);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C203539oF.A0E(A0T, A092);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-get-accounts");
        C203539oF.A0G(A0a, A012, false);
        if (C203539oF.A0L(A15, -9007199254740991L, 9007199254740991L, false)) {
            C36411kG.A1K(A0a, "code", A15.longValue());
        }
        if (C203539oF.A0R(A042, 1, false)) {
            C36331k8.A1D(A0a, "provider-type", A042);
        }
        if (str2 != null && C203539oF.A0U(str2, 0, true)) {
            C36331k8.A1D(A0a, "bank-ref-id", str2);
        }
        A0a.A08(str, "account-type", AnonymousClass8v0.A00);
        C203399nx A0I2 = C165567td.A0I(A0a, A0T);
        boolean A0E2 = this.A08.A0E(2227);
        String str3 = "in_upi_get_accounts_tag";
        if (A0E2) {
            this.A0F.A01(185478423, str3);
        }
        AF7 af7 = this.A0E;
        af7.A07((C202059ky) null, 18, 0);
        Context context = this.A06.A00;
        AnonymousClass17Y r1 = this.A05;
        C29221Vu r0 = this.A0B;
        if (A0E2) {
            r10 = this.A0F;
        } else {
            str3 = null;
        }
        C165577te.A19(r12, new B7L(context, r1, r0, r13, this, af7, r10, str3, 3), A0I2, A092);
    }
}
