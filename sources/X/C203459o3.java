package X;

/* renamed from: X.9o3  reason: invalid class name and case insensitive filesystem */
public class C203459o3 implements C22880Axb {
    public Object A00;
    public final int A01;

    public C203459o3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bj9() {
        switch (this.A01) {
            case 0:
                A2F a2f = (A2F) this.A00;
                if (!a2f.A0H) {
                    return;
                }
                if (a2f.A0F == 1 || a2f.A0F == 7) {
                    a2f.A0F = 0;
                    a2f.A09 = false;
                    a2f.A02 = new C21829Ab6("Failed to start operation. Operation timed out.");
                    return;
                } else if (a2f.A0F == 2 || a2f.A0F == 3 || a2f.A0F == 4) {
                    a2f.A0F = 0;
                    return;
                } else {
                    return;
                }
            case 1:
                A2R a2r = (A2R) this.A00;
                a2r.A03 = 0;
                a2r.A05 = false;
                return;
            default:
                A2E a2e = (A2E) this.A00;
                a2e.A08 = C36381kD.A0j();
                a2e.A06 = new C21829Ab6("Photo capture failed. Still capture timed out.");
                return;
        }
    }
}
