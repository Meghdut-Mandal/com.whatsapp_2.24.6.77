package X;

/* renamed from: X.9fy  reason: invalid class name and case insensitive filesystem */
public final class C199789fy {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199789fy) {
                C199789fy r5 = (C199789fy) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A02 * 31) + this.A01) * 31) + this.A00;
    }

    public C199789fy(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CommunityUnreadInfo(unseenMessageCount=");
        A0u.append(this.A02);
        A0u.append(", unseenImportantMessageCount=");
        A0u.append(this.A01);
        A0u.append(", unreadSubgroupCount=");
        return C36321k7.A0G(A0u, this.A00);
    }

    public C199789fy() {
        this(0, 0, 0);
    }
}
