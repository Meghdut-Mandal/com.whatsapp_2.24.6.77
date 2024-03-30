package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9Y0  reason: invalid class name */
public abstract class AnonymousClass9Y0 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C23061B2i A06;
    public B2B A07;
    public AnonymousClass9GG A08;
    public C209379zu A09;
    public boolean A0A;
    public boolean A0B;
    public final C194819Rj A0C = new C194819Rj();

    public void A00(boolean z) {
        int i;
        if (z) {
            this.A08 = new AnonymousClass9GG();
            this.A04 = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.A01 = i;
        this.A05 = -1;
        this.A02 = 0;
    }

    public boolean A01(AnonymousClass9GG r11, C202309lW r12, long j) {
        if (this instanceof C1688882k) {
            C1688882k r7 = (C1688882k) this;
            boolean z = true;
            if (!r7.A00) {
                byte[] copyOf = Arrays.copyOf(r12.A02, r12.A00);
                byte b = copyOf[9] & 255;
                ArrayList A14 = C36441kJ.A14(3);
                A14.add(copyOf);
                A14.add(C165597tg.A1U((((long) (((copyOf[11] & 255) << 8) | (copyOf[10] & 255))) * 1000000000) / 48000));
                A14.add(C165597tg.A1U((((long) 3840) * 1000000000) / 48000));
                AnonymousClass7c0 r0 = C207099uY.CREATOR;
                C199159en r1 = new C199159en();
                r1.A0P = null;
                r1.A0R = "audio/opus";
                r1.A0N = null;
                r1.A03 = -1;
                r1.A09 = -1;
                r1.A04 = b;
                r1.A0E = 48000;
                r1.A0S = A14;
                r1.A0K = null;
                r1.A0F = 0;
                r1.A0Q = null;
                r11.A00 = new C207099uY(r1);
                r7.A00 = true;
                return true;
            }
            if (r12.A03() != 1332770163) {
                z = false;
            }
            r12.A0I(0);
            return z;
        }
        C1688682i r3 = (C1688682i) this;
        byte[] bArr = r12.A02;
        if (r3.A00 == null) {
            AnonymousClass9MB r02 = new AnonymousClass9MB(bArr);
            r3.A00 = r02;
            int i = r02.A02;
            if (i == 0) {
                i = -1;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, r12.A00);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            AnonymousClass9MB r03 = r3.A00;
            int i2 = r03.A00;
            int i3 = r03.A03;
            int i4 = r03.A01;
            AnonymousClass7c0 r04 = C207099uY.CREATOR;
            C199159en r13 = new C199159en();
            r13.A0P = null;
            r13.A0R = "audio/flac";
            r13.A0N = null;
            r13.A03 = i2 * i3 * i4;
            r13.A09 = i;
            r13.A04 = i4;
            r13.A0E = i3;
            r13.A0S = singletonList;
            r13.A0K = null;
            r13.A0F = 0;
            r13.A0Q = null;
            r11.A00 = new C207099uY(r13);
            return true;
        }
        byte b2 = bArr[0];
        if ((b2 & Byte.MAX_VALUE) == 3) {
            C209169zZ r5 = new C209169zZ(r3);
            r3.A01 = r5;
            r12.A0J(1);
            byte[] bArr2 = r12.A02;
            int i5 = r12.A01;
            int i6 = i5 + 1;
            r12.A01 = i6;
            int i7 = i6 + 1;
            r12.A01 = i7;
            int A082 = C165597tg.A08(bArr2, i6, (bArr2[i5] & 255) << 16);
            r12.A01 = i7 + 1;
            int i8 = ((bArr2[i7] & 255) | A082) / 18;
            r5.A01 = new long[i8];
            r5.A02 = new long[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                r5.A01[i9] = r12.A08();
                r5.A02[i9] = r12.A08();
                r12.A0J(2);
            }
            return true;
        } else if (b2 != -1) {
            return true;
        } else {
            C209169zZ r05 = r3.A01;
            if (r05 == null) {
                return false;
            }
            r05.A00 = j;
            r11.A01 = r05;
            return false;
        }
    }
}
