package X;

/* renamed from: X.68J  reason: invalid class name */
public final class AnonymousClass68J {
    public final C161337ma A00;

    public boolean equals(Object obj) {
        C161337ma r1 = this.A00;
        if (!(obj instanceof AnonymousClass68J) || !AnonymousClass00C.A0J(r1, ((AnonymousClass68J) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        C161337ma r2 = this.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SkippableUpdater(composer=");
        return AnonymousClass000.A0m(r2, A0u);
    }

    public /* synthetic */ AnonymousClass68J(C161337ma r1) {
        this.A00 = r1;
    }
}
