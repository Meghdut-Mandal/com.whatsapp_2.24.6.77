package X;

import java.text.ParseException;

/* renamed from: X.9cp  reason: invalid class name and case insensitive filesystem */
public class C198049cp {
    public static final int[] A05 = {32, 32, 32, 32, 32};
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public C198049cp(AnonymousClass9W7 r10) {
        ParseException parseException;
        int[] iArr = A05;
        int i = 0;
        int i2 = 0;
        do {
            i2 += iArr[i];
            i++;
        } while (i < 5);
        byte[] A002 = AnonymousClass6R0.A00(r10.A02, "WhatsApp Mutation Keys".getBytes(C19430v1.A0D), i2);
        if (A002 != null) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                try {
                    int i5 = iArr[i3];
                    if (i5 < 0) {
                        parseException = new ParseException(AnonymousClass000.A0r("Invalid length: ", AnonymousClass000.A0u(), i5), 0);
                        break;
                    }
                    i4 += i5;
                    i3++;
                    if (i3 >= 5) {
                        if (A002.length >= i4) {
                            byte[][] bArr = new byte[5][];
                            int i6 = 0;
                            int i7 = 0;
                            do {
                                int i8 = iArr[i6];
                                bArr[i6] = new byte[i8];
                                System.arraycopy(A002, i7, bArr[i6], 0, i8);
                                i7 += i8;
                                i6++;
                            } while (i6 < 5);
                            this.A02 = bArr[0];
                            this.A03 = bArr[1];
                            this.A04 = bArr[2];
                            this.A01 = bArr[3];
                            this.A00 = bArr[4];
                            return;
                        }
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Input too small: ");
                        parseException = new ParseException(AnonymousClass000.A0q(C196879ag.A00(A002), A0u), 0);
                    }
                } catch (ParseException e) {
                    throw new C176138bd(e);
                }
            }
        } else {
            parseException = new ParseException("Null input", 0);
        }
        throw parseException;
    }
}
