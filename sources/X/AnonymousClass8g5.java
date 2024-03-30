package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.8g5  reason: invalid class name */
public class AnonymousClass8g5 extends AnonymousClass5MM {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final AnonymousClass17Y A03;
    public final C19730wQ A04;
    public final C19600wD A05;
    public final C19970wo A06;
    public final AnonymousClass16T A07;
    public final AnonymousClass19A A08;
    public final C29221Vu A09;
    public final C24601Db A0A;
    public final C29121Vk A0B;
    public final AnonymousClass1EU A0C;
    public final C24611Dc A0D = C165597tg.A0S("BaseTokenAddCardAction");
    public final C195219Sy A0E;
    public final C201219j5 A0F;
    public final C194689Qs A0G;
    public final C29131Vl A0H;
    public final C117705mh A0I;
    public final C111495cN A0J;
    public final C19770wU A0K;
    public final Boolean A0L;
    public final String A0M;
    public final String A0N;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str;
        C24611Dc r4;
        String str2;
        AnonymousClass00I r0 = (AnonymousClass00I) obj;
        C202059ky r3 = null;
        if (r0 != null) {
            String str3 = (String) r0.A00;
            r3 = (C202059ky) r0.A01;
            if (str3 != null) {
                Log.i("PAY: BrazilAddCardAction sendAddCard token success");
                String A002 = C237919w.A00(this.A04, this.A06);
                AnonymousClass19A r18 = this.A08;
                String A092 = r18.A09();
                ArrayList arrayList = C185878uw.A00;
                String A012 = this.A0H.A01();
                Locale locale = Locale.US;
                Object[] A0L2 = AnonymousClass001.A0L();
                int i = this.A00;
                AnonymousClass000.A1L(A0L2, i, 0);
                String format = String.format(locale, "%02d", A0L2);
                int i2 = this.A01;
                String num = Integer.toString(i2);
                Boolean bool = this.A0L;
                if (bool == null || bool.booleanValue()) {
                    str = "1";
                } else {
                    str = "0";
                }
                C195219Sy r8 = this.A0E;
                String str4 = this.A0M;
                C193879Ng r13 = r8.A00;
                C185648uZ r32 = null;
                if (r13 != null && r13.A00 == 5) {
                    String str5 = r13.A02;
                    r13.A02 = null;
                    String A003 = r8.A0G.A00(5);
                    String A072 = r8.A0D.A07();
                    StringBuilder A0u = AnonymousClass000.A0u();
                    AnonymousClass000.A1D(str5, A003, A072, A0u);
                    A0u.append(str4.replaceAll("\\s", ""));
                    A0u.append(i);
                    Locale locale2 = Locale.US;
                    Object[] A0L3 = AnonymousClass001.A0L();
                    AnonymousClass000.A1L(A0L3, i2 % 100, 0);
                    String A0q = AnonymousClass000.A0q(String.format(locale2, "%02d", A0L3), A0u);
                    AnonymousClass6VM r02 = r8.A0B;
                    String A062 = r02.A06(A0q);
                    if (A062 == null) {
                        r4 = r8.A01;
                        str2 = "device_signature is null";
                    } else {
                        String A073 = r02.A07(A0q);
                        if (A073 == null) {
                            r4 = r8.A01;
                            str2 = "wallet_signature is null";
                        } else if (str5 == null) {
                            r4 = r8.A01;
                            str2 = "challenge_id is null";
                        } else {
                            r32 = new C185648uZ(A062, A073, str5);
                        }
                    }
                    r4.A05(str2);
                }
                AnonymousClass6QB A0T = C36421kH.A0T();
                C165567td.A1D(A0T);
                C203539oF.A0E(A0T, A092);
                AnonymousClass6QB A0a = C165587tf.A0a();
                C36331k8.A1D(A0a, "action", "br-add-card");
                C203539oF.A0G(A0a, A012, false);
                if (C203539oF.A0P(A002, 1, 1000, false)) {
                    C36331k8.A1D(A0a, "nonce", A002);
                }
                if (C203539oF.A0P(format, 2, 2, false)) {
                    C36331k8.A1D(A0a, "card-expiry-month", format);
                }
                if (C203539oF.A0P(num, 4, 4, false)) {
                    C36331k8.A1D(A0a, "card-expiry-year", num);
                }
                if (C203539oF.A0V(str3, 1, false)) {
                    C36331k8.A1D(A0a, "token", str3);
                }
                A0a.A08(str, "is_first_card", C185878uw.A00);
                C165587tf.A1C(A0a, r32);
                AnonymousClass19A r6 = r18;
                r6.A0E(new B7H(this.A02, this.A09, this.A03, this, 0), C165567td.A0I(A0a, A0T), A092, 204, 0);
                return;
            }
        }
        C36321k7.A1K(r3, "PAY: BrazilAddCardAction token error: ", AnonymousClass000.A0u());
        this.A0G.A00((C175798b4) null, r3, (ArrayList) null, false, false);
    }

    public List A0G() {
        ArrayList A0I2 = AnonymousClass001.A0I();
        C36341k9.A1H("creditCardNumber", this.A0M, A0I2);
        C36341k9.A1H("csc", this.A0N, A0I2);
        return A0I2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8g5(android.content.Context r13, X.AnonymousClass17Y r14, X.C19730wQ r15, X.C19600wD r16, X.C19970wo r17, X.AnonymousClass16T r18, X.AnonymousClass19A r19, X.C29221Vu r20, X.C24601Db r21, X.C29121Vk r22, X.AnonymousClass1EU r23, X.C195219Sy r24, X.C201219j5 r25, X.C194689Qs r26, X.C29131Vl r27, X.C117705mh r28, X.C111495cN r29, X.C19770wU r30, java.lang.Boolean r31, java.lang.String r32, java.lang.String r33, int r34, int r35) {
        /*
            r12 = this;
            r2 = r30
            r4 = r23
            r3 = r27
            r10 = r28
            X.C36321k7.A1B(r14, r2, r10, r3, r4)
            r9 = r22
            r8 = r21
            r7 = r16
            r11 = r29
            r5 = r20
            X.C36321k7.A1C(r8, r11, r9, r7, r5)
            r1 = r32
            r0 = r33
            X.C36341k9.A1G(r1, r0)
            r6 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r12.A03 = r14
            r12.A0K = r2
            r12.A0I = r10
            r12.A0H = r3
            r12.A0C = r4
            r12.A0A = r8
            r12.A0J = r11
            r12.A0B = r9
            r12.A05 = r7
            r12.A09 = r5
            r12.A0M = r1
            r12.A0N = r0
            r0 = r34
            r12.A00 = r0
            r0 = r35
            r12.A01 = r0
            java.lang.String r0 = "BaseTokenAddCardAction"
            X.1Dc r0 = X.C165597tg.A0S(r0)
            r12.A0D = r0
            r0 = r17
            r12.A06 = r0
            r12.A02 = r13
            r12.A04 = r15
            r0 = r19
            r12.A08 = r0
            r0 = r25
            r12.A0F = r0
            r0 = r24
            r12.A0E = r0
            r0 = r18
            r12.A07 = r0
            r0 = r31
            r12.A0L = r0
            r0 = r26
            r12.A0G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8g5.<init>(android.content.Context, X.17Y, X.0wQ, X.0wD, X.0wo, X.16T, X.19A, X.1Vu, X.1Db, X.1Vk, X.1EU, X.9Sy, X.9j5, X.9Qs, X.1Vl, X.5mh, X.5cN, X.0wU, java.lang.Boolean, java.lang.String, java.lang.String, int, int):void");
    }
}
