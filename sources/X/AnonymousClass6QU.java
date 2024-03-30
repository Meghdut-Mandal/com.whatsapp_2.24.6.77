package X;

/* renamed from: X.6QU  reason: invalid class name */
public abstract class AnonymousClass6QU {
    public static final long A00(AnonymousClass6FX r13, float f, float f2, float f3, float f4) {
        boolean z;
        long A00;
        float f5 = f3;
        float f6 = f4;
        float A02 = r13.A02(0);
        if (f <= r13.A01(0) && A02 <= f) {
            float A022 = r13.A02(1);
            if (f2 <= r13.A01(1) && A022 <= f2) {
                float A023 = r13.A02(2);
                if (f3 <= r13.A01(2) && A023 <= f3 && 0.0f <= f4 && f4 <= 1.0f) {
                    if (r13 instanceof C94564iQ) {
                        z = ((C94564iQ) r13).A0A;
                    } else {
                        z = false;
                    }
                    if (z) {
                        A00 = (((long) ((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f)))) & 4294967295L) << 32;
                    } else if (((int) (r13.A01 >> 32)) == 3) {
                        int i = r13.A00;
                        if (i != -1) {
                            float f7 = AnonymousClass72V.A00;
                            short A002 = C109055Wc.A00(f);
                            short A003 = C109055Wc.A00(f2);
                            long j = (((long) A003) & 65535) << 32;
                            A00 = j | ((((long) A002) & 65535) << 48) | ((((long) C109055Wc.A00(f5)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) i) & 63);
                        } else {
                            throw AnonymousClass001.A08("Unknown color space, please use a color space in ColorSpaces");
                        }
                    } else {
                        throw AnonymousClass001.A08("Color only works with ColorSpaces with 3 components");
                    }
                    long j2 = C133336Xx.A01;
                    return A00;
                }
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("red = ");
        A0u.append(f);
        A0u.append(", green = ");
        A0u.append(f2);
        A0u.append(", blue = ");
        A0u.append(f5);
        A0u.append(", alpha = ");
        A0u.append(f6);
        throw C90464aC.A0P(r13, " outside the range for ", A0u);
    }
}
