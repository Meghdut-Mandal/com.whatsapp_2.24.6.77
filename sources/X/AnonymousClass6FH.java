package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6FH  reason: invalid class name */
public abstract class AnonymousClass6FH {
    public final AnonymousClass19A A00;
    public final String A01;
    public final AnonymousClass3MB A02;
    public final C19770wU A03;

    public abstract int A00(boolean z);

    public final C28201Rs A02(Set set) {
        AnonymousClass00C.A0D(set, 0);
        C28201Rs A0t = C36441kJ.A0t();
        AnonymousClass736.A00(this.A03, this, set, A0t, 45);
        return A0t;
    }

    public abstract String A03();

    public abstract HashSet A04();

    public abstract void A05(String str, Set set, boolean z);

    public AnonymousClass6FH(AnonymousClass19A r1, AnonymousClass3MB r2, C19770wU r3, String str) {
        this.A01 = str;
        this.A03 = r3;
        this.A00 = r1;
        this.A02 = r2;
    }

    public final C28201Rs A01() {
        C28201Rs A0t = C36441kJ.A0t();
        AnonymousClass19A r8 = this.A00;
        String A09 = r8.A09();
        C203399nx r3 = new C203399nx(new C203399nx("list", AnonymousClass3MB.A00(this.A01, A03())), "privacy", (AnonymousClass1AL[]) null);
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[4];
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09, r2, 0);
        C36341k9.A1V(r2, 1);
        C36351kA.A1N("xmlns", "privacy", r2);
        C36361kB.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r2);
        r8.A0F(new C165487tV(this, A0t, 4), C36391kE.A0m(r3, r2), A09, A00(true), 32000);
        return A0t;
    }
}
