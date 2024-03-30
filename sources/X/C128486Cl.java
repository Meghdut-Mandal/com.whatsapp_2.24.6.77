package X;

/* renamed from: X.6Cl  reason: invalid class name and case insensitive filesystem */
public final class C128486Cl {
    public final long A00;
    public final long A01;
    public final C24431Ck A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C128486Cl r7 = (C128486Cl) obj;
            if (this.A00 != r7.A00 || this.A01 != r7.A01 || !this.A04.equals(r7.A04) || !this.A03.equals(r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A04;
        objArr[1] = this.A03;
        C36361kB.A1W(objArr, this.A00);
        return AnonymousClass000.A0M(Long.valueOf(this.A01), objArr, 3);
    }

    public C128486Cl(C24431Ck r1, String str, String str2, long j, long j2) {
        this.A02 = r1;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FileMetadata{name='");
        char A002 = C90484aE.A00(this.A04, A0u);
        A0u.append(", md5Hash='");
        A0u.append(this.A03);
        A0u.append(A002);
        A0u.append(", sizeBytes=");
        A0u.append(this.A00);
        A0u.append(", updateTime=");
        A0u.append(this.A01);
        return AnonymousClass000.A0s(A0u);
    }
}
