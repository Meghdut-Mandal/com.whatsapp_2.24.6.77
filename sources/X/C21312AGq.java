package X;

/* renamed from: X.AGq  reason: case insensitive filesystem */
public class C21312AGq implements C23035B1g {
    public static final int[] A00 = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

    public /* bridge */ /* synthetic */ boolean BNb(Object obj) {
        int i;
        int[] iArr;
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence != null) {
            String str = C36411kG.A0y(charSequence, "[^\\d]").toString();
            int length = str.length();
            boolean z = this instanceof C179248jl;
            if (z) {
                i = 14;
            } else {
                i = 11;
            }
            if (length == i) {
                if (z) {
                    iArr = C179248jl.A00;
                } else {
                    iArr = A00;
                }
                int i2 = length - 2;
                int i3 = 0;
                int i4 = 0;
                while (i3 < i2) {
                    int i5 = i3 + 1;
                    i4 += iArr[i5] * C165607th.A09(str, i3);
                    i3 = i5;
                }
                int i6 = 11 - (i4 % 11);
                if (i6 > 9) {
                    i6 = 0;
                }
                if (C165607th.A09(str, i2) == i6) {
                    int i7 = length - 1;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i7; i9++) {
                        i8 += iArr[i9] * C165607th.A09(str, i9);
                    }
                    int i10 = 11 - (i8 % 11);
                    if (i10 > 9) {
                        i10 = 0;
                    }
                    if (C165607th.A09(str, i7) == i10) {
                        int i11 = 1;
                        while (str.charAt(i11 - 1) == str.charAt(i11)) {
                            i11++;
                            if (i11 >= length) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ CharSequence BpE(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        AnonymousClass00C.A0D(charSequence, 0);
        return C36411kG.A0y(charSequence, "[^\\d]");
    }
}
