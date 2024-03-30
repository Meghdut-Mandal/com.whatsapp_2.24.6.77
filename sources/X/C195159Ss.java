package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9Ss  reason: invalid class name and case insensitive filesystem */
public class C195159Ss {
    public final AnonymousClass16T A00;
    public final AnonymousClass1EU A01;
    public final Context A02;
    public final AnonymousClass17Y A03;
    public final C19730wQ A04;
    public final C19970wo A05;
    public final AnonymousClass19A A06;
    public final AnonymousClass6VM A07;
    public final C29221Vu A08;
    public final C29121Vk A09;
    public final AnonymousClass646 A0A;
    public final C29131Vl A0B;
    public final String A0C;

    public void A00(B1J b1j) {
        AnonymousClass1EU r11 = this.A01;
        AnonymousClass16S A0O = C165617ti.A0O(r11);
        String str = this.A0C;
        C207249un A072 = A0O.A07(str);
        C18740tg.A06(A072);
        C175798b4 r0 = (C175798b4) A072;
        AnonymousClass8b7 r2 = (AnonymousClass8b7) r0.A08;
        B1J b1j2 = b1j;
        if (r2 != null) {
            if (r2.A07) {
                C19970wo r5 = this.A05;
                new C199019eZ(this.A02, this.A03, this.A04, r5, this.A00, this.A06, this.A07, this.A08, this.A09, r11, new AEP(r0, b1j2, this), this.A0A).A01(r0);
                return;
            } else if (r2.A0a) {
                b1j2.BTB(r0);
                return;
            }
        }
        AnonymousClass19A r4 = this.A06;
        String A092 = r4.A09();
        String A012 = this.A0B.A01();
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1E(A0T);
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        C203539oF.A0E(A0T, A092);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "br-get-verification-methods");
        C203539oF.A0D(A0a, str);
        C203539oF.A0G(A0a, A012, false);
        C203399nx A0I = C165567td.A0I(A0a, A0T);
        r4.A0E(new B7J(this.A02, this.A08, this.A03, this, b1j2, 5), A0I, A092, 204, 0);
    }

    public C195159Ss(Context context, AnonymousClass17Y r2, C19730wQ r3, C19970wo r4, AnonymousClass16T r5, AnonymousClass19A r6, AnonymousClass6VM r7, C29221Vu r8, C29121Vk r9, AnonymousClass1EU r10, AnonymousClass646 r11, C29131Vl r12, String str) {
        this.A05 = r4;
        this.A02 = context;
        this.A03 = r2;
        this.A04 = r3;
        this.A06 = r6;
        this.A0B = r12;
        this.A01 = r10;
        this.A09 = r9;
        this.A0A = r11;
        this.A00 = r5;
        this.A07 = r7;
        this.A08 = r8;
        this.A0C = str;
    }
}
