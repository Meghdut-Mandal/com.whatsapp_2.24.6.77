package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.9XR  reason: invalid class name */
public class AnonymousClass9XR {
    public final Context A00;
    public final AnonymousClass17Y A01;
    public final C20310xM A02;
    public final C29221Vu A03;
    public final C24601Db A04;
    public final C29121Vk A05;
    public final AnonymousClass1XA A06;
    public final AnonymousClass1EU A07;
    public final C19770wU A08;
    public final C29131Vl A09;

    public void A00(AnonymousClass1XD r16) {
        C29121Vk r9 = this.A05;
        String A092 = r9.A06.A09();
        String A012 = this.A09.A01();
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C165567td.A1E(A0T);
        C203539oF.A0E(A0T, A092);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "delete");
        if (A012 != null) {
            C203539oF.A0G(A0a, A012, true);
        }
        C203399nx A0I = C165567td.A0I(A0a, A0T);
        C36331k8.A0w(C90494aF.A0E(this.A04), "is_payment_account_created", false);
        r9.A0G(new B7J(this.A00, this.A03, this.A01, this, r16, 9), A0I, A092, AnonymousClass6X5.A0L);
    }

    public AnonymousClass9XR(Context context, AnonymousClass17Y r2, C20310xM r3, C29221Vu r4, C24601Db r5, C29121Vk r6, AnonymousClass1XA r7, AnonymousClass1EU r8, C29131Vl r9, C19770wU r10) {
        this.A00 = context;
        this.A01 = r2;
        this.A08 = r10;
        this.A09 = r9;
        this.A07 = r8;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A03 = r4;
    }

    public void A01(AnonymousClass9SB r8, C203399nx r9, String str, String str2, byte[] bArr) {
        ArrayList A0I = AnonymousClass001.A0I();
        if (r9 != null) {
            A0I.add(r9);
        }
        if (bArr != null) {
            C203399nx.A0D("password", A0I, bArr, new AnonymousClass1AL[0]);
        }
        C29121Vk r2 = this.A05;
        AnonymousClass1AL[] r4 = new AnonymousClass1AL[4];
        C36341k9.A1L("action", "generate-payments-dyi-report", r4, 0);
        C36341k9.A1L("version", "1", r4, 1);
        C36341k9.A1L("nonce", str, r4, 2);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2, r4, 3);
        r2.A0F(new B7J(this.A00, this.A03, this.A01, this, r8, 10), C203399nx.A05("account", r4, C165577te.A1b(A0I, 0)), "get");
    }
}
