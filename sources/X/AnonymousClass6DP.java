package X;

import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.6DP  reason: invalid class name */
public final class AnonymousClass6DP {
    public Integer A00;
    public UUID A01;
    public int A02;
    public AnonymousClass6X2 A03;
    public AnonymousClass6X2 A04;
    public Set A05;
    public final int A06;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass6DP r4 = (AnonymousClass6DP) obj;
            if (this.A02 == r4.A02 && this.A06 == r4.A06 && this.A01.equals(r4.A01) && this.A00 == r4.A00 && this.A03.equals(r4.A03) && this.A05.equals(r4.A05)) {
                return this.A04.equals(r4.A04);
            }
        }
        return false;
    }

    public int hashCode() {
        int A0A = C36391kE.A0A(this.A01);
        Integer num = this.A00;
        int A0B = C90494aF.A0B(num, AnonymousClass6GL.A00(num), A0A) * 31;
        return ((C36351kA.A05(this.A04, (C36351kA.A05(this.A03, A0B) + this.A05.hashCode()) * 31) + this.A02) * 31) + this.A06;
    }

    public AnonymousClass6DP(AnonymousClass6X2 r2, AnonymousClass6X2 r3, Integer num, List list, UUID uuid, int i, int i2) {
        this.A01 = uuid;
        this.A00 = num;
        this.A03 = r2;
        this.A05 = C90524aI.A0k(list);
        this.A04 = r3;
        this.A02 = i;
        this.A06 = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WorkInfo{mId='");
        A0u.append(this.A01);
        A0u.append('\'');
        A0u.append(", mState=");
        A0u.append(AnonymousClass6GL.A00(this.A00));
        A0u.append(", mOutputData=");
        A0u.append(this.A03);
        A0u.append(", mTags=");
        A0u.append(this.A05);
        A0u.append(", mProgress=");
        return C90464aC.A0X(this.A04, A0u);
    }
}
