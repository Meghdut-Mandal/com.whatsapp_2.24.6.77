package X;

import java.util.List;

/* renamed from: X.2dP  reason: invalid class name */
public final class AnonymousClass2dP extends C132056Ry implements AnonymousClass7gQ {
    public final AnonymousClass141 A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2dP(AnonymousClass141 r2, List list) {
        super(r2, 38);
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = list;
    }

    public AnonymousClass11F BDC() {
        return C36351kA.A0j(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InvitableContactListItem{contact=");
        A0u.append(this.A00);
        return AnonymousClass000.A0s(A0u);
    }
}
