package X;

/* renamed from: X.3nm  reason: invalid class name and case insensitive filesystem */
public final class C75773nm implements AnonymousClass4TL {
    public final /* synthetic */ C44072La A00;
    public final /* synthetic */ AnonymousClass3E9 A01;
    public final /* synthetic */ C023509x A02;

    public C75773nm(C44072La r1, AnonymousClass3E9 r2, C023509x r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BQf(C28981Uw r3, C51952oe r4, Throwable th) {
        if (!AnonymousClass00C.A0J(r3, this.A00.A06())) {
            return;
        }
        if (r4 == C51952oe.FOLLOW || r4 == C51952oe.UNFOLLOW) {
            this.A01.A00.unregisterObserver(this);
            this.A02.resumeWith(new C46612Yx(r4, th));
        }
    }

    public void BQi(C28981Uw r4, C51952oe r5) {
        C52382pL r2;
        if (AnonymousClass00C.A0J(r4, this.A00.A06())) {
            if (r5 == C51952oe.FOLLOW) {
                r2 = C52382pL.SUBSCRIBED;
            } else if (r5 == C51952oe.UNFOLLOW) {
                r2 = C52382pL.GUEST;
            } else {
                return;
            }
            this.A01.A00.unregisterObserver(this);
            this.A02.resumeWith(new C46602Yw(r2));
        }
    }
}
