package X;

/* renamed from: X.A7f  reason: case insensitive filesystem */
public class C21068A7f implements C23019B0p {
    public C23019B0p[] A00;

    public boolean BNN(Class cls) {
        C23019B0p[] b0pArr = this.A00;
        int i = 0;
        while (!b0pArr[i].BNN(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass9LW BPr(Class cls) {
        C23019B0p[] b0pArr = this.A00;
        int i = 0;
        do {
            C23019B0p b0p = b0pArr[i];
            if (b0p.BNN(cls)) {
                return b0p.BPr(cls);
            }
            i++;
        } while (i < 2);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("No factory is available for message type: ");
        throw AnonymousClass001.A0E(AnonymousClass000.A0q(cls.getName(), A0u));
    }

    public C21068A7f(C23019B0p... b0pArr) {
        this.A00 = b0pArr;
    }
}
