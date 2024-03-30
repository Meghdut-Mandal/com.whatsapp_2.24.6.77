package X;

/* renamed from: X.9S4  reason: invalid class name */
public final class AnonymousClass9S4 {
    public int A00 = -1;
    public C188638zy A01;
    public C202039kw A02;
    public AnonymousClass3DX A03;
    public Integer A04;

    public String toString() {
        String str;
        StringBuilder A0h = C90524aI.A0h(200);
        A0h.append("<<\n");
        A0h.append(" mode: ");
        A0h.append(this.A01);
        A0h.append("\n ecLevel: ");
        Integer num = this.A04;
        if (num != null) {
            str = C196679aM.A00(num);
        } else {
            str = "null";
        }
        A0h.append(str);
        A0h.append("\n version: ");
        A0h.append(this.A02);
        A0h.append("\n maskPattern: ");
        A0h.append(this.A00);
        AnonymousClass3DX r1 = this.A03;
        if (r1 == null) {
            A0h.append("\n matrix: null\n");
        } else {
            A0h.append("\n matrix:\n");
            A0h.append(r1);
        }
        return AnonymousClass000.A0q(">>\n", A0h);
    }
}
