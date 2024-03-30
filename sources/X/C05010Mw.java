package X;

import java.util.Arrays;

/* renamed from: X.0Mw  reason: invalid class name and case insensitive filesystem */
public final class C05010Mw extends C10930fS {
    public final C10970fW A00;

    public C05010Mw(C10970fW r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r4.A00;
        r2 = r1.A04();
        r0 = ((X.C05010Mw) r5).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r5) {
        /*
            r4 = this;
            X.0fS r5 = (X.C10930fS) r5
            int r3 = r5.A02()
            r2 = 2
            if (r2 != r3) goto L_0x0028
            X.0Mw r5 = (X.C05010Mw) r5
            X.0fW r1 = r4.A00
            int r2 = r1.A04()
            X.0fW r0 = r5.A00
            int r3 = r0.A04()
            if (r2 != r3) goto L_0x0028
            byte[] r2 = r1.A05()
            byte[] r1 = r0.A05()
            java.util.Comparator r0 = X.AnonymousClass0Vs.A00
            int r2 = r0.compare(r2, r1)
            return r2
        L_0x0028:
            int r2 = r2 - r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05010Mw.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C05010Mw) obj).A00);
    }

    public final String toString() {
        AnonymousClass0XB r10;
        C04960Mr r9 = (C04960Mr) AnonymousClass0X2.A00;
        AnonymousClass0X2 r2 = r9.A02;
        if (r2 == null) {
            AnonymousClass0XB r8 = r9.A00;
            char[] cArr = r8.A07;
            int length = cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    r10 = r8;
                    break;
                }
                char c = cArr[i];
                if (c < 'a' || c > 'z') {
                    i++;
                } else {
                    int i2 = 0;
                    while (true) {
                        int i3 = 65;
                        if (i2 < length) {
                            char c2 = cArr[i2];
                            if (c2 < 'A' || c2 > 'Z') {
                                i2++;
                            } else {
                                throw AnonymousClass001.A09("Cannot call upperCase() on a mixed-case alphabet");
                            }
                        } else {
                            char[] cArr2 = new char[length];
                            for (int i4 = 0; i4 < length; i4++) {
                                char c3 = cArr[i4];
                                if (c3 >= 'a' && c3 <= 'z') {
                                    c3 ^= ' ';
                                }
                                cArr2[i4] = (char) c3;
                            }
                            r10 = new AnonymousClass0XB(r8.A04.concat(".upperCase()"), cArr2);
                            if (r8.A05 && !r10.A05) {
                                byte[] bArr = r10.A06;
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                do {
                                    int i5 = i3 | 32;
                                    byte b = bArr[i3];
                                    byte b2 = bArr[i5];
                                    if (b == -1) {
                                        copyOf[i3] = b2;
                                    } else {
                                        char c4 = (char) i3;
                                        char c5 = (char) i5;
                                        if (b2 == -1) {
                                            copyOf[i5] = b;
                                        } else {
                                            Object[] A0M = AnonymousClass001.A0M();
                                            A0M[0] = Character.valueOf(c4);
                                            A0M[1] = Character.valueOf(c5);
                                            throw AnonymousClass001.A09(AnonymousClass0QX.A00("Can't ignoreCase() since '%s' and '%s' encode different values", A0M));
                                        }
                                    }
                                    i3++;
                                } while (i3 <= 90);
                                String str = r10.A04;
                                r10 = new AnonymousClass0XB(str.concat(".ignoreCase()"), r10.A07, copyOf, true);
                            }
                        }
                    }
                }
            }
            if (r10 == r8) {
                r2 = r9;
            } else {
                r2 = r9.A02(r10, r9.A01);
            }
            r9.A02 = r2;
        }
        byte[] A05 = this.A00.A05();
        String A002 = r2.A00(A05, A05.length);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("h'");
        A0u.append(A002);
        return AnonymousClass000.A0q("'", A0u);
    }

    public final int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, 2);
        return AnonymousClass000.A0L(this.A00, A0M);
    }

    public final int A02() {
        return 2;
    }
}
