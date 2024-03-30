package X;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: X.6V9  reason: invalid class name */
public final class AnonymousClass6V9 {
    public static final String[] A0B = {"e1.whatsapp.net.", "e2.whatsapp.net.", "e3.whatsapp.net.", "e4.whatsapp.net.", "e5.whatsapp.net.", "e6.whatsapp.net.", "e7.whatsapp.net.", "e8.whatsapp.net.", "e9.whatsapp.net.", "e10.whatsapp.net.", "e11.whatsapp.net.", "e12.whatsapp.net.", "e13.whatsapp.net.", "e14.whatsapp.net.", "e15.whatsapp.net.", "e16.whatsapp.net."};
    public int A00 = 0;
    public int A01;
    public final Random A02;
    public final int A03;
    public final int A04;
    public final C221112x A05;
    public final C20810yC A06;
    public final AnonymousClass3QR A07;
    public final String A08;
    public final List A09;
    public final List A0A;

    private AnonymousClass6L6 A00(String str, int i, boolean z, boolean z2) {
        AnonymousClass6L6 A022 = this.A05.A02(str, z, z2);
        A022.A00 = i;
        C36321k7.A1Q("ConnectionSequence/tryResolveDomainName; host=", str, AnonymousClass000.A0u());
        return A022;
    }

    public AnonymousClass6L6 A03() {
        AnonymousClass6L6 r6;
        InetSocketAddress inetSocketAddress;
        Short sh;
        int i = this.A00;
        boolean z = false;
        switch (i) {
            case 0:
                throw AnonymousClass001.A09("Must call moveToNext first");
            case 1:
                C18740tg.A06((Object) null);
                new C119555q3(3, false);
                throw new NullPointerException("getAddress");
            case 2:
                C119555q3 r4 = new C119555q3(3, false);
                List list = this.A0A;
                return new AnonymousClass6L6(r4, ((AnonymousClass6DF) list.get(this.A01)).A03, ((AnonymousClass6DF) list.get(this.A01)).A02.shortValue(), ((AnonymousClass6DF) list.get(this.A01)).A05);
            case 3:
                return new AnonymousClass6L6(new C119555q3(3, false), InetAddress.getByName(this.A08), this.A03, false);
            case 4:
                return new AnonymousClass6L6(new C119555q3(3, false), InetAddress.getByName(this.A08), this.A04, false);
            case 5:
                int i2 = 5222;
                if (this.A02.nextBoolean()) {
                    i2 = 443;
                }
                return A00("g.whatsapp.net", i2, false, false);
            case 6:
                int i3 = 5222;
                if (this.A02.nextBoolean()) {
                    i3 = 443;
                }
                AnonymousClass6L6 A002 = C221112x.A00(this.A05, "g.whatsapp.net", false, false);
                A002.A00 = i3;
                return A002;
            case 7:
                int i4 = 5222;
                Random random = this.A02;
                if (random.nextBoolean()) {
                    i4 = 443;
                }
                String str = A0B[random.nextInt(16)];
                if (i4 == 443) {
                    z = true;
                }
                return A00(str, i4, true, z);
            case 8:
                List list2 = this.A09;
                AnonymousClass6DF r0 = (AnonymousClass6DF) list2.get(this.A01);
                InetAddress inetAddress = r0.A03;
                if (inetAddress == null || (sh = r0.A02) == null) {
                    inetSocketAddress = null;
                } else {
                    inetSocketAddress = new InetSocketAddress(inetAddress, sh.shortValue());
                }
                C18740tg.A06(inetSocketAddress);
                return new AnonymousClass6L6(new C119555q3(4, false), inetSocketAddress.getAddress(), inetSocketAddress.getPort(), ((AnonymousClass6DF) list2.get(this.A01)).A05);
            case 9:
                r6 = A00("g.whatsapp.net", 80, false, false);
                break;
            case 10:
                AnonymousClass6L6 A003 = C221112x.A00(this.A05, "g.whatsapp.net", false, false);
                A003.A00 = 80;
                A003.A01 = true;
                return A003;
            case 11:
                r6 = A00(A0B[this.A02.nextInt(16)], 80, true, false);
                break;
            case 12:
                AnonymousClass3QR r3 = this.A07;
                if (r3 == null || C55182uD.A00(r3)) {
                    throw AnonymousClass001.A09("User proxy should not be null or empty in this state.");
                }
                return A00(r3.A03, r3.A00, true, r3.A06);
            case 13:
                int i5 = 5222;
                if (this.A02.nextBoolean()) {
                    i5 = 443;
                }
                return A00("g-fallback.whatsapp.net", i5, false, false);
            case 14:
                r6 = A00("g-fallback.whatsapp.net", 80, false, false);
                break;
            case 15:
                throw AnonymousClass001.A09("Cannot retrieve address past end");
            default:
                throw C90464aC.A0R("Unrecognized state ", AnonymousClass000.A0u(), i);
        }
        r6.A01 = true;
        return r6;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (android.text.TextUtils.isEmpty(r7.A08) == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        r7.A00 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (android.text.TextUtils.isEmpty(r7.A08) != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        r7.A00 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (r1 >= r7.A09.size()) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        r7.A00 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        r7.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r7.A00 == 15) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05() {
        /*
            r7 = this;
            int r1 = r7.A00
            r5 = 3
            r6 = 9
            r3 = 0
            r4 = 5
            r2 = 15
            switch(r1) {
                case 0: goto L_0x0012;
                case 1: goto L_0x004d;
                case 2: goto L_0x0034;
                case 3: goto L_0x0050;
                case 4: goto L_0x004a;
                case 5: goto L_0x0052;
                case 6: goto L_0x0072;
                case 7: goto L_0x0075;
                case 8: goto L_0x0061;
                case 9: goto L_0x0078;
                case 10: goto L_0x007b;
                case 11: goto L_0x004d;
                case 12: goto L_0x004d;
                case 13: goto L_0x007d;
                case 14: goto L_0x0080;
                default: goto L_0x000c;
            }
        L_0x000c:
            int r0 = r7.A00
            if (r0 == r2) goto L_0x0011
            r3 = 1
        L_0x0011:
            return r3
        L_0x0012:
            X.3QR r0 = r7.A07
            if (r0 == 0) goto L_0x001f
            boolean r0 = X.C55182uD.A00(r0)
            if (r0 != 0) goto L_0x001f
            r0 = 12
            goto L_0x0081
        L_0x001f:
            java.util.List r0 = r7.A0A
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0029
            r0 = 2
            goto L_0x0081
        L_0x0029:
            java.lang.String r0 = r7.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x004a
        L_0x0031:
            r7.A00 = r5
            goto L_0x000c
        L_0x0034:
            int r0 = r7.A01
            int r1 = r0 + 1
            r7.A01 = r1
            java.util.List r0 = r7.A0A
            int r0 = r0.size()
            if (r1 < r0) goto L_0x000c
            java.lang.String r0 = r7.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0031
        L_0x004a:
            r7.A00 = r4
            goto L_0x000c
        L_0x004d:
            r7.A00 = r2
            goto L_0x000c
        L_0x0050:
            r0 = 4
            goto L_0x0081
        L_0x0052:
            java.util.List r0 = r7.A09
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x006f
            r0 = 8
            r7.A00 = r0
            r7.A01 = r3
            goto L_0x000c
        L_0x0061:
            int r0 = r7.A01
            int r1 = r0 + 1
            r7.A01 = r1
            java.util.List r0 = r7.A09
            int r0 = r0.size()
            if (r1 < r0) goto L_0x000c
        L_0x006f:
            r7.A00 = r6
            goto L_0x000c
        L_0x0072:
            r0 = 10
            goto L_0x0081
        L_0x0075:
            r0 = 11
            goto L_0x0081
        L_0x0078:
            r0 = 13
            goto L_0x0081
        L_0x007b:
            r0 = 7
            goto L_0x0081
        L_0x007d:
            r0 = 14
            goto L_0x0081
        L_0x0080:
            r0 = 6
        L_0x0081:
            r7.A00 = r0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6V9.A05():boolean");
    }

    public AnonymousClass6V9(C221112x r4, C20810yC r5, AnonymousClass3QR r6, String str, List list, Random random) {
        List list2;
        this.A05 = r4;
        this.A06 = r5;
        this.A07 = r6;
        this.A08 = str;
        this.A02 = random;
        this.A0A = AnonymousClass001.A0I();
        this.A09 = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass6DF r1 = (AnonymousClass6DF) it.next();
            if (r1.A04) {
                list2 = this.A0A;
            } else {
                list2 = this.A09;
            }
            list2.add(r1);
        }
        boolean nextBoolean = random.nextBoolean();
        int i = 443;
        this.A03 = nextBoolean ? 443 : 5222;
        this.A04 = nextBoolean ? 5222 : i;
    }

    public static Integer A01(int i) {
        int i2;
        switch (i) {
            case 1:
            case 5:
            case 9:
                i2 = 2;
                break;
            case 2:
            case 3:
            case 4:
                i2 = 1;
                break;
            case 6:
            case 10:
                i2 = 5;
                break;
            case 7:
            case 11:
                i2 = 6;
                break;
            case 8:
                i2 = 3;
                break;
            case 13:
            case 14:
                i2 = 4;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i2);
    }

    public int A02() {
        return this.A00;
    }

    public void A04(int i) {
        this.A00 = i;
    }
}
