package X;

/* renamed from: X.2MA  reason: invalid class name */
public class AnonymousClass2MA extends AnonymousClass3PG {
    public int A00;
    public final int A01;
    public final CharSequence A02;

    public int A02(long j, int i) {
        int codePointAt;
        int i2 = (int) (j & 15);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int codePointAt2 = Character.codePointAt(this.A02, i + i4);
            i4 += Character.charCount(codePointAt2);
            if (codePointAt2 == 65039) {
                i3--;
            }
            i3++;
        }
        int i5 = i + i4;
        if (i5 >= this.A01 || (codePointAt = Character.codePointAt(this.A02, i5)) != 65039) {
            return i4;
        }
        return i4 + Character.charCount(codePointAt);
    }

    public int A03(long j, int i) {
        if (j != -1) {
            return A02(j, i);
        }
        return Character.charCount(Character.codePointAt(this.A02, i));
    }

    public AnonymousClass2MA(CharSequence charSequence) {
        this.A02 = charSequence;
        this.A01 = charSequence.length();
    }
}
