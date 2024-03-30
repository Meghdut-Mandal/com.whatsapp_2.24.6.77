package X;

/* renamed from: X.6DB  reason: invalid class name */
public final class AnonymousClass6DB {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6DB) {
                AnonymousClass6DB r5 = (AnonymousClass6DB) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A05 == r5.A05 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((this.A01 * 31) + this.A00) * 31) + this.A03) * 31) + this.A02) * 31) + this.A05) * 31) + this.A04;
    }

    public AnonymousClass6DB(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A02 = i4;
        this.A05 = i5;
        this.A04 = i6;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GlobalSERPLoggingData(contactCount=");
        A0u.append(this.A01);
        A0u.append(", chatCount=");
        A0u.append(this.A00);
        A0u.append(", invitableContactsCount=");
        A0u.append(this.A03);
        A0u.append(", groupsInCommonCount=");
        A0u.append(this.A02);
        A0u.append(", messageCount=");
        A0u.append(this.A05);
        A0u.append(", mediaPillCount=");
        return C36321k7.A0G(A0u, this.A04);
    }
}
