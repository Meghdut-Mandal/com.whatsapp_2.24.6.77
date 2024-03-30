package X;

/* renamed from: X.2bC  reason: invalid class name */
public final class AnonymousClass2bC extends C63663Kx {
    public int A00;
    public Long A01;
    public Long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass2bC) {
                AnonymousClass2bC r5 = (AnonymousClass2bC) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A02);
    }

    public AnonymousClass2bC(Long l, Long l2, int i) {
        this.A00 = i;
        this.A01 = l;
        this.A02 = l2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ParentMessage(replyCount=");
        A0u.append(this.A00);
        A0u.append(", lastCommentMessageRowId=");
        A0u.append(this.A01);
        A0u.append(", lastCommentMessageTs=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
