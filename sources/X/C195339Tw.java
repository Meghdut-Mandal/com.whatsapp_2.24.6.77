package X;

/* renamed from: X.9Tw  reason: invalid class name and case insensitive filesystem */
public class C195339Tw {
    public char[] A00 = new char[15];
    public int A01 = -1;

    public void A00(char c) {
        int i = this.A01 + 1;
        this.A01 = i;
        char[] cArr = this.A00;
        int length = cArr.length;
        if (length <= i) {
            char[] cArr2 = new char[((length * 2) + 1)];
            System.arraycopy(cArr, 0, cArr2, 0, length);
            this.A00 = cArr2;
            cArr = cArr2;
        }
        cArr[this.A01] = c;
    }

    public String toString() {
        return new String(this.A00, 0, this.A01 + 1);
    }
}
