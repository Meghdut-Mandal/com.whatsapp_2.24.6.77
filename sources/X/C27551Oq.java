package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.1Oq  reason: invalid class name and case insensitive filesystem */
public final class C27551Oq {
    public final C27291Nq A00;
    public final C19770wU A01;
    public final C19700wN A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass17X A04;
    public final AnonymousClass19A A05;

    public C27551Oq(C19700wN r2, AnonymousClass16D r3, AnonymousClass17X r4, C27291Nq r5, AnonymousClass19A r6, C19770wU r7) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r7, 2);
        AnonymousClass00C.A0D(r6, 3);
        AnonymousClass00C.A0D(r3, 4);
        AnonymousClass00C.A0D(r5, 5);
        AnonymousClass00C.A0D(r4, 6);
        this.A02 = r2;
        this.A01 = r7;
        this.A05 = r6;
        this.A03 = r3;
        this.A00 = r5;
        this.A04 = r4;
    }

    public final void A00(AnonymousClass147 r15) {
        AnonymousClass00C.A0D(r15, 0);
        AnonymousClass141 A0A = this.A03.A0A(r15);
        if (A0A != null && A0A.A12) {
            AnonymousClass17X r1 = this.A04;
            if (r1.A0C(r15) && !r1.A0D(r15)) {
                C76533p1 r8 = new C76533p1(this, r15);
                AnonymousClass19A r7 = this.A05;
                String A09 = r7.A09();
                r7.A0K(r8, new C203399nx(new C203399nx("membership_approval_requests", new AnonymousClass1AL[]{new AnonymousClass1AL("requestor_fetch", "true")}), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL("xmlns", "w:g2"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1AL((Jid) r15, "to")}), A09, 355, 32000);
            }
        }
    }
}
