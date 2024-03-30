package X;

import java.util.Objects;

/* renamed from: X.4tK  reason: invalid class name and case insensitive filesystem */
public class C99414tK extends AnonymousClass6MC {
    public final AnonymousClass6DS A00;
    public final Character A01;
    public transient AnonymousClass6MC A02;

    public boolean equals(Object obj) {
        if (!(obj instanceof C99414tK)) {
            return false;
        }
        C99414tK r4 = (C99414tK) obj;
        if (!this.A00.equals(r4.A00) || !C1897595l.A00(this.A01, r4.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode() ^ AnonymousClass000.A0K(this.A01, AnonymousClass001.A0L());
    }

    public String toString() {
        String str;
        StringBuilder A0i = C90524aI.A0i("BaseEncoding.");
        AnonymousClass6DS r0 = this.A00;
        C36351kA.A1K(r0, A0i);
        if (8 % r0.A00 != 0) {
            Character ch = this.A01;
            if (ch == null) {
                str = ".omitPadding()";
            } else {
                A0i.append(".withPadChar('");
                A0i.append(ch);
                str = "')";
            }
            A0i.append(str);
        }
        return A0i.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r2 == -1) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C99414tK(X.AnonymousClass6DS r4, java.lang.Character r5) {
        /*
            r3 = this;
            r3.<init>()
            java.util.Objects.requireNonNull(r4)
            r3.A00 = r4
            if (r5 == 0) goto L_0x0019
            char r2 = r5.charValue()
            byte[] r1 = r4.A05
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0019
            byte r2 = r1[r2]
            r0 = -1
            r1 = 0
            if (r2 != r0) goto L_0x001a
        L_0x0019:
            r1 = 1
        L_0x001a:
            java.lang.String r0 = "Padding character %s was already in alphabet"
            X.C20740y5.A05(r5, r0, r1)
            r3.A01 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99414tK.<init>(X.6DS, java.lang.Character):void");
    }

    public void A00(Appendable appendable, byte[] bArr, int i, int i2) {
        Objects.requireNonNull(appendable);
        C20740y5.A03(i, i + i2, bArr.length);
        AnonymousClass6DS r5 = this.A00;
        int i3 = r5.A02;
        int i4 = 0;
        C20740y5.A06(C90504aG.A1U(i2, i3));
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & 255))) << 8;
        }
        int i6 = r5.A00;
        int i7 = ((i2 + 1) * 8) - i6;
        while (i4 < i2 * 8) {
            appendable.append(r5.A06[((int) (j >>> (i7 - i4))) & r5.A01]);
            i4 += i6;
        }
        Character ch = this.A01;
        if (ch != null) {
            while (i4 < i3 * 8) {
                appendable.append(ch.charValue());
                i4 += i6;
            }
        }
    }
}
