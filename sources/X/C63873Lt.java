package X;

/* renamed from: X.3Lt  reason: invalid class name and case insensitive filesystem */
public abstract class C63873Lt {
    public static final AnonymousClass1XQ A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        int length = str.length();
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(str, i);
            i += Character.charCount(codePointAt);
            iArr[i2] = codePointAt;
            i2++;
        }
        int[] iArr2 = new int[i2];
        System.arraycopy(iArr, 0, iArr2, 0, i2);
        return new AnonymousClass1XQ(iArr2);
    }

    public static final String A01(int[] iArr) {
        StringBuilder A0i = C36341k9.A0i(iArr);
        for (int appendCodePoint : iArr) {
            A0i.appendCodePoint(appendCodePoint);
        }
        return C36381kD.A0y(A0i);
    }
}
