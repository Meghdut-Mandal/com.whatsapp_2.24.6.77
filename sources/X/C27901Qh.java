package X;

/* renamed from: X.1Qh  reason: invalid class name and case insensitive filesystem */
public final class C27901Qh {
    public static final C27911Qi A04 = new C27911Qi();
    public final C28001Qr A00;
    public final CharSequence A01;
    public final Integer A02;
    public final CharSequence A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27901Qh) {
                C27901Qh r5 = (C27901Qh) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        CharSequence charSequence = this.A03;
        int i = 0;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.A01;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        C28001Qr r0 = this.A00;
        int hashCode3 = (hashCode2 + (r0 == null ? 0 : r0.hashCode())) * 31;
        Integer num = this.A02;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WDSToolbarViewState(title=");
        sb.append(this.A03);
        sb.append(", subtitle=");
        sb.append(this.A01);
        sb.append(", iconSet=");
        sb.append(this.A00);
        sb.append(", backgroundColor=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C27901Qh(C28001Qr r1, CharSequence charSequence, CharSequence charSequence2, Integer num) {
        this.A03 = charSequence;
        this.A01 = charSequence2;
        this.A00 = r1;
        this.A02 = num;
    }

    public C27901Qh() {
        this((C28001Qr) null, (CharSequence) null, (CharSequence) null, (Integer) null);
    }
}
