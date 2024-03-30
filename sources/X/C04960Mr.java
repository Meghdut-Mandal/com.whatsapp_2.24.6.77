package X;

/* renamed from: X.0Mr  reason: invalid class name and case insensitive filesystem */
public class C04960Mr extends AnonymousClass0X2 {
    public final AnonymousClass0XB A00;
    public final Character A01;
    public volatile AnonymousClass0X2 A02;

    public void A01(Appendable appendable, byte[] bArr, int i, int i2) {
        int i3 = 0;
        C07320Xe.A02(0, i2, bArr.length);
        while (i3 < i2) {
            int i4 = this.A00.A03;
            A03(appendable, bArr, i3, Math.min(i4, i2 - i3));
            i3 += i4;
        }
    }

    public final void A03(Appendable appendable, byte[] bArr, int i, int i2) {
        C07320Xe.A02(i, i + i2, bArr.length);
        AnonymousClass0XB r6 = this.A00;
        int i3 = r6.A03;
        int i4 = 0;
        if (i2 <= i3) {
            long j = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                j = (j | ((long) (bArr[i + i5] & 255))) << 8;
            }
            int i6 = r6.A01;
            int i7 = ((i2 + 1) * 8) - i6;
            while (i4 < i2 * 8) {
                appendable.append(r6.A07[r6.A00 & ((int) (j >>> (i7 - i4)))]);
                i4 += i6;
            }
            if (this.A01 != null) {
                while (i4 < i3 * 8) {
                    appendable.append('=');
                    i4 += i6;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C04960Mr) {
            C04960Mr r4 = (C04960Mr) obj;
            if (this.A00.equals(r4.A00)) {
                Character ch = this.A01;
                Character ch2 = r4.A01;
                if (ch == ch2) {
                    return true;
                }
                if (ch == null || !ch.equals(ch2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ AnonymousClass000.A0H(this.A01);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        AnonymousClass0XB r0 = this.A00;
        sb.append(r0);
        if (8 % r0.A01 != 0) {
            Character ch = this.A01;
            if (ch == null) {
                str = ".omitPadding()";
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                str = "')";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public C04960Mr(AnonymousClass0XB r6, Character ch) {
        this.A00 = r6;
        if (ch != null) {
            byte[] bArr = r6.A06;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw AnonymousClass001.A08(AnonymousClass0QX.A00("Padding character %s was already in alphabet", ch));
            }
        }
        this.A01 = ch;
    }

    public AnonymousClass0X2 A02(AnonymousClass0XB r2, Character ch) {
        throw null;
    }
}
