package X;

import java.util.Set;

/* renamed from: X.3K6  reason: invalid class name */
public final class AnonymousClass3K6 {
    public long A00;
    public Integer A01 = null;
    public final long A02;
    public final AnonymousClass3T1 A03;
    public final C64933Qa A04;
    public final Set A05;

    public AnonymousClass3K6(AnonymousClass3T1 r3, C64933Qa r4, Set set, long j, long j2) {
        AnonymousClass00C.A0D(r4, 2);
        this.A02 = j;
        this.A04 = r4;
        this.A00 = j2;
        this.A03 = r3;
        this.A05 = set;
        set.add(Long.valueOf(j));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3K6) {
                AnonymousClass3K6 r8 = (AnonymousClass3K6) obj;
                if (this.A02 != r8.A02 || !AnonymousClass00C.A0J(this.A04, r8.A04) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A05, C36351kA.A05(this.A03, C36321k7.A00(this.A00, C36351kA.A05(this.A04, AnonymousClass000.A08(this.A02) * 31)))) + AnonymousClass000.A0H(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CommentMessagePreview(parentMessageRowId=");
        A0u.append(this.A02);
        A0u.append(", parentMessageKey=");
        A0u.append(this.A04);
        A0u.append(", parentMessageSortId=");
        A0u.append(this.A00);
        A0u.append(", lastCommentMessage=");
        A0u.append(this.A03);
        A0u.append(", parentMessageRowIds=");
        A0u.append(this.A05);
        A0u.append(", unseenSenderCount=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
