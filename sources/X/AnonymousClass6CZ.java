package X;

import java.util.List;

/* renamed from: X.6CZ  reason: invalid class name */
public final class AnonymousClass6CZ {
    public final /* synthetic */ List A00;
    public final /* synthetic */ AnonymousClass692 A01;
    public final /* synthetic */ C34971hw A02;
    public final /* synthetic */ String A03;

    public AnonymousClass6CZ(AnonymousClass692 r1, C34971hw r2, String str, List list) {
        this.A03 = str;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = list;
    }

    public void A00(C1511478k r4) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CrosspostRequestSessionManager/eligibility retry error for session: ");
        String str = this.A03;
        A0u.append(str);
        AnonymousClass00C.A0D(AnonymousClass000.A0l(r4, " with exception:", A0u), 0);
        StringBuilder A0t = C36401kF.A0t(str, 1);
        A0t.append("CrosspostRequestSessionManager/[Retry]Error encountered for session: ");
        A0t.append(str);
        AnonymousClass00C.A0D(AnonymousClass000.A0l(r4, " with exception: ", A0t), 0);
    }
}
