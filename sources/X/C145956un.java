package X;

import java.io.IOException;

/* renamed from: X.6un  reason: invalid class name and case insensitive filesystem */
public final class C145956un implements C160087kR {
    public final String A00;
    public final /* synthetic */ AnonymousClass5OK A01;

    public C145956un(AnonymousClass5OK r2, String str) {
        AnonymousClass00C.A0D(str, 2);
        this.A01 = r2;
        this.A00 = str;
    }

    public void B2J(C123815x8 r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error (");
        A0u.append(this.A00);
        C36321k7.A1a(A0u, ") has been sent to business.");
    }

    public void BVL(IOException iOException) {
        StringBuilder A0i = C36341k9.A0i(iOException);
        A0i.append("Failed to send ");
        A0i.append(this.A00);
        C36351kA.A1Q(" error to business.", A0i, iOException);
    }

    public void BWk(Exception exc) {
        StringBuilder A0i = C36341k9.A0i(exc);
        A0i.append("Failed to send ");
        A0i.append(this.A00);
        C36351kA.A1Q(" error to business.", A0i, exc);
    }
}
