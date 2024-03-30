package X;

/* renamed from: X.03k  reason: invalid class name and case insensitive filesystem */
public final class C008003k implements C007903j {
    public final boolean A00;

    public C15470nO BDY() {
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        if (this.A00) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    public C008003k(boolean z) {
        this.A00 = z;
    }

    public boolean BL7() {
        return this.A00;
    }
}
