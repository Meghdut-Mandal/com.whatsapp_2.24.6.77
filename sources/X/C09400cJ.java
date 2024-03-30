package X;

/* renamed from: X.0cJ  reason: invalid class name and case insensitive filesystem */
public class C09400cJ implements C16990qX {
    public final /* synthetic */ C09460cP A00;

    public C09400cJ(C09460cP r1) {
        this.A00 = r1;
    }

    public void BTt(C016307a r3, boolean z) {
        if (r3 instanceof AnonymousClass0FZ) {
            r3.A01().A0F(false);
        }
        C16990qX r0 = this.A00.A09;
        if (r0 != null) {
            r0.BTt(r3, z);
        }
    }

    public boolean Bbv(C016307a r4) {
        C09460cP r2 = this.A00;
        if (r4 == r2.A08) {
            return false;
        }
        r2.A00 = ((AnonymousClass0FZ) r4).getItem().getItemId();
        C16990qX r0 = r2.A09;
        if (r0 != null) {
            return r0.Bbv(r4);
        }
        return false;
    }
}
