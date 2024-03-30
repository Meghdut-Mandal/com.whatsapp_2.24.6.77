package X;

/* renamed from: X.69F  reason: invalid class name */
public final class AnonymousClass69F {
    public final AnonymousClass62O A00 = new AnonymousClass62O();
    public final AnonymousClass62O A01 = new AnonymousClass62O();

    public final void A00(C137846gp r3) {
        AnonymousClass62O r1 = this.A00;
        if (r3.A09 != null) {
            r1.A00.remove(r3);
            AnonymousClass62O r12 = this.A01;
            if (r3.A09 != null) {
                r12.A00.remove(r3);
                return;
            }
            throw AnonymousClass001.A09("DepthSortedSet.remove called on an unattached node");
        }
        throw AnonymousClass001.A09("DepthSortedSet.remove called on an unattached node");
    }

    public final void A01(C137846gp r3, boolean z) {
        AnonymousClass62O r1 = this.A00;
        if (!z) {
            if (!r1.A00.contains(r3)) {
                r1 = this.A01;
            } else {
                return;
            }
        }
        if (r3.A09 != null) {
            r1.A00.add(r3);
            return;
        }
        throw AnonymousClass001.A09("DepthSortedSet.add called on an unattached node");
    }

    public final boolean A02() {
        if (!this.A01.A00.isEmpty() || !this.A00.A00.isEmpty()) {
            return false;
        }
        return true;
    }
}
