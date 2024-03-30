package X;

/* renamed from: X.0U5  reason: invalid class name */
public class AnonymousClass0U5 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass0D3 A04;
    public AnonymousClass0D3 A05;

    public AnonymousClass0U5(AnonymousClass0D3 r1, AnonymousClass0D3 r2, int i, int i2, int i3, int i4) {
        this.A05 = r1;
        this.A04 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ChangeInfo{oldHolder=");
        A0u.append(this.A05);
        A0u.append(", newHolder=");
        A0u.append(this.A04);
        A0u.append(", fromX=");
        A0u.append(this.A00);
        A0u.append(", fromY=");
        A0u.append(this.A01);
        A0u.append(", toX=");
        A0u.append(this.A02);
        A0u.append(", toY=");
        A0u.append(this.A03);
        return AnonymousClass000.A0s(A0u);
    }
}
