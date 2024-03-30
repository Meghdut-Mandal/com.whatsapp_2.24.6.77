package X;

import android.util.Log;

/* renamed from: X.6QA  reason: invalid class name */
public final class AnonymousClass6QA {
    public static final AnonymousClass08V A0K = C136246e0.A00;
    public static final String A0L;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public C132316Tb A09;
    public AnonymousClass6X2 A0A;
    public AnonymousClass6X2 A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public final int A0I;
    public final String A0J;

    public static int A00(C162187oA r3, AnonymousClass6QA r4) {
        r3.B1o(7, r4.A04);
        r3.B1o(8, r4.A05);
        r3.B1o(9, r4.A03);
        r3.B1o(10, (long) r4.A01);
        return r4.A0C.intValue();
    }

    public static void A03(C162187oA r3, AnonymousClass6QA r4, String str) {
        r3.B1q(1, str);
        r3.B1o(2, (long) AnonymousClass6XU.A01(r4.A0E));
        r3.B1q(3, r4.A0G);
        String str2 = r4.A0F;
        if (str2 == null) {
            r3.B1p(4);
        } else {
            r3.B1q(4, str2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6QA) {
                AnonymousClass6QA r8 = (AnonymousClass6QA) obj;
                if (!(AnonymousClass00C.A0J(this.A0J, r8.A0J) && this.A0E == r8.A0E && AnonymousClass00C.A0J(this.A0G, r8.A0G) && AnonymousClass00C.A0J(this.A0F, r8.A0F) && AnonymousClass00C.A0J(this.A0A, r8.A0A) && AnonymousClass00C.A0J(this.A0B, r8.A0B) && this.A04 == r8.A04 && this.A05 == r8.A05 && this.A03 == r8.A03 && AnonymousClass00C.A0J(this.A09, r8.A09) && this.A01 == r8.A01 && this.A0C == r8.A0C && this.A02 == r8.A02 && this.A06 == r8.A06 && this.A07 == r8.A07 && this.A08 == r8.A08 && this.A0H == r8.A0H && this.A0D == r8.A0D && this.A00 == r8.A00 && this.A0I == r8.A0I)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        String A012 = AnonymousClass6VD.A01("WorkSpec");
        AnonymousClass00C.A08(A012);
        A0L = A012;
    }

    public static int A01(C162187oA r3, AnonymousClass6QA r4, int i) {
        r3.B1o(11, (long) i);
        r3.B1o(12, r4.A02);
        r3.B1o(13, r4.A06);
        r3.B1o(14, r4.A07);
        r3.B1o(15, r4.A08);
        r3.B1o(16, r4.A0H ? 1 : 0);
        return r4.A0D.intValue();
    }

    public static void A02(C162187oA r11, AnonymousClass6QA r12, int i) {
        r11.B1o(17, (long) i);
        r11.B1o(18, (long) r12.A00);
        r11.B1o(19, (long) r12.A0I);
        C132316Tb r4 = r12.A09;
        r11.B1o(20, (long) AnonymousClass6XU.A00(r4.A02));
        r11.B1o(21, r4.A05 ? 1 : 0);
        r11.B1o(22, r4.A00() ? 1 : 0);
        r11.B1o(23, r4.A04 ? 1 : 0);
        r11.B1o(24, r4.A07 ? 1 : 0);
        r11.B1o(25, r4.A01);
        r11.B1o(26, r4.A00);
        r11.B1m(27, AnonymousClass6XU.A07(r4.A03));
    }

    public final long A04() {
        long j;
        long j2;
        int i;
        if (this.A0E != C023109s.A00 || (i = this.A01) <= 0) {
            long j3 = this.A05;
            long j4 = 0;
            if (AnonymousClass000.A1P((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)))) {
                int i2 = this.A00;
                long j5 = this.A06;
                if (i2 == 0) {
                    j5 += this.A04;
                }
                long j6 = this.A03;
                if (j6 != j3) {
                    if (i2 == 0) {
                        j4 = ((long) -1) * j6;
                    }
                    j5 += j3;
                } else if (i2 != 0) {
                    j4 = j3;
                }
                return j5 + j4;
            }
            long j7 = this.A06;
            if (j7 == 0) {
                j7 = System.currentTimeMillis();
            }
            j2 = this.A04;
        } else {
            Integer num = this.A0C;
            Integer num2 = C023109s.A01;
            long j8 = this.A02;
            if (num == num2) {
                j = j8 * ((long) i);
            } else {
                j = (long) Math.scalb((float) j8, i - 1);
            }
            j2 = this.A06;
            if (j > 18000000) {
                j = 18000000;
            }
        }
        return j2 + j;
    }

    public int hashCode() {
        String str;
        String str2;
        int A042 = C36421kH.A04(this.A0J);
        Integer num = this.A0E;
        int A0B2 = C90494aF.A0B(num, AnonymousClass6GL.A00(num), A042) * 31;
        int A052 = (C36351kA.A05(this.A09, C36321k7.A00(this.A03, C36321k7.A00(this.A05, C36321k7.A00(this.A04, C36351kA.A05(this.A0B, C36351kA.A05(this.A0A, (C36381kD.A08(this.A0G, A0B2) + C36341k9.A09(this.A0F)) * 31)))))) + this.A01) * 31;
        int intValue = this.A0C.intValue();
        if (1 != intValue) {
            str = "EXPONENTIAL";
        } else {
            str = "LINEAR";
        }
        int A002 = C36321k7.A00(this.A08, C36321k7.A00(this.A07, C36321k7.A00(this.A06, C36321k7.A00(this.A02, (A052 + str.hashCode() + intValue) * 31))));
        boolean z = this.A0H;
        if (z) {
            z = true;
        }
        int i = (A002 + (z ? 1 : 0)) * 31;
        int intValue2 = this.A0D.intValue();
        if (1 != intValue2) {
            str2 = "RUN_AS_NON_EXPEDITED_WORK_REQUEST";
        } else {
            str2 = "DROP_WORK_REQUEST";
        }
        return ((((i + str2.hashCode() + intValue2) * 31) + this.A00) * 31) + this.A0I;
    }

    public AnonymousClass6QA(C132316Tb r3, AnonymousClass6X2 r4, AnonymousClass6X2 r5, Integer num, Integer num2, Integer num3, String str, String str2, String str3, int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        C36321k7.A0y(str, str2);
        this.A0J = str;
        this.A0E = num;
        this.A0G = str2;
        this.A0F = str3;
        this.A0A = r4;
        this.A0B = r5;
        this.A04 = j;
        this.A05 = j2;
        this.A03 = j3;
        this.A09 = r3;
        this.A01 = i;
        this.A0C = num2;
        this.A02 = j4;
        this.A06 = j5;
        this.A07 = j6;
        this.A08 = j7;
        this.A0H = z;
        this.A0D = num3;
        this.A00 = i2;
        this.A0I = i3;
    }

    public final void A05(long j, long j2) {
        if (j < 900000) {
            AnonymousClass6VD.A00();
            Log.w(A0L, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j3 = j;
        if (j < 900000) {
            j3 = 900000;
        }
        this.A05 = j3;
        long j4 = j2;
        if (j2 < 300000) {
            AnonymousClass6VD.A00();
            Log.w(A0L, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.A05) {
            AnonymousClass6VD.A00();
            Log.w(A0L, C36381kD.A0z("Flex duration greater than interval duration; Changed to ", AnonymousClass000.A0u(), j));
        }
        this.A03 = C15040mb.A04(j4, 300000, this.A05);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("{WorkSpec: ");
        A0u.append(this.A0J);
        return AnonymousClass000.A0s(A0u);
    }
}
