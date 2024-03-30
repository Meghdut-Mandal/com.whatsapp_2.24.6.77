package X;

/* renamed from: X.4vD  reason: invalid class name and case insensitive filesystem */
public final class C100554vD extends C118835oo {
    public final AnonymousClass69R A00;
    public final AnonymousClass72B A01;
    public final long A02;
    public final Integer A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C100554vD) {
                C100554vD r8 = (C100554vD) obj;
                if (!AnonymousClass00C.A0J(this.A00, r8.A00) || !AnonymousClass00C.A0J(this.A01, r8.A01) || this.A02 != r8.A02 || this.A03 != r8.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A002 = C36321k7.A00(this.A02, (C36391kE.A0A(this.A00) + AnonymousClass000.A0H(this.A01)) * 31);
        Integer num = this.A03;
        return C90494aF.A0B(num, AnonymousClass5ZA.A00(num), A002) * 31;
    }

    public C100554vD(AnonymousClass69R r1, AnonymousClass72B r2, Integer num, long j) {
        super(num, j);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = j;
        this.A03 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CachedComponentQueryResponse(response=");
        A0u.append(this.A00);
        A0u.append(", resources=");
        A0u.append(this.A01);
        A0u.append(", responseTimestampMs=");
        A0u.append(this.A02);
        A0u.append(", queryPurpose=");
        A0u.append(AnonymousClass5ZA.A00(this.A03));
        A0u.append(", cleanup=");
        return AnonymousClass000.A0m((Object) null, A0u);
    }
}
