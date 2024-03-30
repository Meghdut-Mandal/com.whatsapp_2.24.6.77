package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.8g2  reason: invalid class name */
public class AnonymousClass8g2 extends AnonymousClass5MM {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final AnonymousClass17Y A03;
    public final AnonymousClass16T A04;
    public final C29221Vu A05;
    public final C29121Vk A06;
    public final AnonymousClass1EU A07;
    public final C201219j5 A08;
    public final AnonymousClass9Qt A09;
    public final C19770wU A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public AnonymousClass8g2(Context context, AnonymousClass17Y r9, C19600wD r10, AnonymousClass16T r11, C29221Vu r12, C24601Db r13, C29121Vk r14, AnonymousClass1EU r15, C201219j5 r16, AnonymousClass9Qt r17, C117705mh r18, C111495cN r19, C19770wU r20, String str, String str2, String str3, int i, int i2) {
        super(r10, r13, r14, r18, r19);
        this.A02 = context;
        this.A03 = r9;
        this.A0A = r20;
        this.A07 = r15;
        this.A08 = r16;
        this.A06 = r14;
        this.A04 = r11;
        this.A05 = r12;
        this.A0D = str;
        this.A0C = str2;
        this.A09 = r17;
        this.A0B = str3;
        this.A01 = i;
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass00I r0 = (AnonymousClass00I) obj;
        String str = (String) r0.A00;
        C202059ky r2 = (C202059ky) r0.A01;
        if (str == null) {
            this.A09.A00((C175798b4) null, r2, (ArrayList) null, false);
            return;
        }
        C29121Vk r12 = this.A06;
        String A092 = r12.A06.A09();
        String str2 = this.A0B;
        String str3 = this.A0C;
        Locale locale = Locale.US;
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1L(A0L, this.A00, 0);
        String format = String.format(locale, "%02d", A0L);
        String num = Integer.toString(this.A01);
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C165567td.A1E(A0T);
        C203539oF.A0E(A0T, A092);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "retokenize-card");
        if (C203539oF.A0P(str2, 1, 200, false)) {
            C36331k8.A1D(A0a, "credential_id", str2);
        }
        if (C203539oF.A0P(str3, 1, 1000, false)) {
            C36331k8.A1D(A0a, "nonce", str3);
        }
        if (C203539oF.A0P(format, 2, 2, false)) {
            C36331k8.A1D(A0a, "card_expiry_month", format);
        }
        if (C203539oF.A0P(num, 4, 4, false)) {
            C36331k8.A1D(A0a, "card_expiry_year", num);
        }
        if (C203539oF.A0V(str, 1, false)) {
            C36331k8.A1D(A0a, "token", str);
        }
        r12.A0G(new B7H(this.A02, this.A05, this.A03, this, 6), C165567td.A0I(A0a, A0T), A092, AnonymousClass6X5.A0L);
    }

    public List A0G() {
        ArrayList A0I = AnonymousClass001.A0I();
        C36341k9.A1H("csc", this.A0D, A0I);
        return A0I;
    }
}
