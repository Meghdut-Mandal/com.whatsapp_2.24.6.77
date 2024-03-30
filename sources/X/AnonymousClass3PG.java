package X;

/* renamed from: X.3PG  reason: invalid class name */
public abstract class AnonymousClass3PG {
    public static final String A00 = String.valueOf(9633);

    public int A00() {
        if (this instanceof AnonymousClass2MA) {
            AnonymousClass2MA r3 = (AnonymousClass2MA) this;
            int i = r3.A00;
            if (i >= r3.A01) {
                return 0;
            }
            int codePointAt = Character.codePointAt(r3.A02, i);
            r3.A00 += Character.charCount(codePointAt);
            return codePointAt;
        }
        AnonymousClass2M9 r32 = (AnonymousClass2M9) this;
        int i2 = r32.A00;
        int[] iArr = r32.A01;
        if (i2 >= iArr.length) {
            return 0;
        }
        int i3 = iArr[i2];
        r32.A00 = i2 + 1;
        return i3;
    }

    public int[] A01() {
        if (!(this instanceof AnonymousClass2MA)) {
            return ((AnonymousClass2M9) this).A01;
        }
        AnonymousClass2MA r4 = (AnonymousClass2MA) this;
        int i = r4.A01;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = Character.codePointAt(r4.A02, i2);
        }
        return iArr;
    }
}
