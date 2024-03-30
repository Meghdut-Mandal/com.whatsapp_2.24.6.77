package X;

/* renamed from: X.9R7  reason: invalid class name */
public final class AnonymousClass9R7 {
    public final int A00;
    public final byte[] A01;

    public String toString() {
        byte[] bArr = this.A01;
        int i = this.A00;
        byte b = bArr[i];
        StringBuilder A0h = C90524aI.A0h(b * 2);
        for (int i2 = 0; i2 < b; i2++) {
            byte b2 = bArr[(i2 * 2) + i + 1];
            char c = '[';
            if (b2 != 0) {
                c = '.';
                if (b2 != 1) {
                    c = '*';
                    if (b2 == 2) {
                        continue;
                    } else if (b2 == 3) {
                        A0h.append(bArr[(i2 * 2) + i + 2]);
                        c = ';';
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    continue;
                }
            }
            A0h.append(c);
        }
        return A0h.toString();
    }

    public AnonymousClass9R7(byte[] bArr, int i) {
        this.A01 = bArr;
        this.A00 = i;
    }
}
