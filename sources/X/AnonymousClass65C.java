package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.65C  reason: invalid class name */
public class AnonymousClass65C {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final C19460v5 A03;
    public final C19700wN A04;
    public final C19730wQ A05;
    public final C19420v0 A06;
    public final C20810yC A07;
    public final AnonymousClass19A A08;
    public final AnonymousClass005 A09;
    public final AnonymousClass005 A0A;
    public final AnonymousClass005 A0B;

    public C99424tL A00(UserJid userJid) {
        AnonymousClass19A r6 = this.A08;
        String A092 = r6.A09();
        C36321k7.A1Q("BizVNameXmppMethods/sendGetBizVNameCert; iq=", A092, AnonymousClass000.A0u());
        C99424tL r3 = new C99424tL();
        C203399nx r4 = new C203399nx("verified_name", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) userJid, "jid")});
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[3];
        C36331k8.A1R(A092, r2, 0);
        C36341k9.A1L("xmlns", "w:biz", r2, 1);
        C36351kA.A1N(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r2);
        r6.A0K(new C165337tG(userJid, this, r3, 12), C36391kE.A0m(r4, r2), A092, 118, 32000);
        return r3;
    }

    public AnonymousClass65C(C19460v5 r1, C19700wN r2, C19730wQ r3, C19420v0 r4, C20810yC r5, AnonymousClass19A r6, AnonymousClass005 r7, AnonymousClass005 r8, AnonymousClass005 r9, AnonymousClass005 r10, AnonymousClass005 r11, AnonymousClass005 r12) {
        this.A07 = r5;
        this.A04 = r2;
        this.A05 = r3;
        this.A08 = r6;
        this.A02 = r7;
        this.A00 = r8;
        this.A01 = r9;
        this.A06 = r4;
        this.A03 = r1;
        this.A09 = r10;
        this.A0B = r11;
        this.A0A = r12;
    }
}
