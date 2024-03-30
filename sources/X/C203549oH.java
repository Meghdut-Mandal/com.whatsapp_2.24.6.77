package X;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.9oH  reason: invalid class name and case insensitive filesystem */
public class C203549oH {
    public Set A00 = C36441kJ.A16();
    public Set A01 = C36441kJ.A16();
    public Set A02 = C36441kJ.A16();
    public Set A03 = C36441kJ.A16();
    public Set A04 = C36441kJ.A16();
    public Set A05 = C36441kJ.A16();
    public Set A06;
    public Set A07;
    public Set A08;
    public Set A09;
    public Set A0A;
    public Set A0B;

    public static int A00(Collection collection) {
        int i = 0;
        if (collection != null) {
            for (Object next : collection) {
                i += next instanceof byte[] ? AnonymousClass124.A00((byte[]) next) : next.hashCode();
            }
        }
        return i;
    }

    public static boolean A06(String str, String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        String[] A052 = AnonymousClass11q.A05(str2);
        String[] A053 = AnonymousClass11q.A05(str);
        int length = A053.length;
        int length2 = A052.length;
        if (length > length2) {
            int i = length - length2;
            int i2 = -1;
            while (!A053[i - 1].equals("")) {
                while (true) {
                    i2++;
                    if (i2 >= length2) {
                        return true;
                    }
                    if (i2 != -1) {
                        if (!A052[i2].equalsIgnoreCase(A053[i2 + i])) {
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean A07(Collection collection, Collection collection2) {
        boolean equals;
        if (collection != collection2) {
            if (!(collection == null || collection2 == null || collection.size() != collection2.size())) {
                for (Object next : collection) {
                    for (Object next2 : collection2) {
                        if (next != next2) {
                            if (!(next == null || next2 == null)) {
                                if (!(next instanceof byte[]) || !(next2 instanceof byte[])) {
                                    equals = next.equals(next2);
                                } else {
                                    equals = Arrays.equals((byte[]) next, (byte[]) next2);
                                }
                                if (equals) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A09(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = 0;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        while (i < length) {
            bArr4[i] = (byte) (bArr2[i] & bArr3[i]);
            i = C165617ti.A07(bArr5, bArr[i] & bArr3[i], i);
        }
        return Arrays.equals(bArr4, bArr5);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C203549oH)) {
            return false;
        }
        C203549oH r4 = (C203549oH) obj;
        return A07(r4.A00, this.A00) && A07(r4.A01, this.A01) && A07(r4.A02, this.A02) && A07(r4.A03, this.A03) && A07(r4.A05, this.A05) && A07(r4.A04, this.A04) && A07(r4.A06, this.A06) && A07(r4.A07, this.A07) && A07(r4.A08, this.A08) && A07(r4.A09, this.A09) && A07(r4.A0B, this.A0B) && A07(r4.A0A, this.A0A);
    }

    public int hashCode() {
        return A00(this.A00) + A00(this.A01) + A00(this.A02) + A00(this.A03) + A00(this.A05) + A00(this.A04) + A00(this.A06) + A00(this.A07) + A00(this.A08) + A00(this.A09) + A00(this.A0B) + A00(this.A0A);
    }

    public static boolean A04(String str, String str2) {
        boolean A062;
        String A0o = C165607th.A0o(str.indexOf(64), str);
        if (str2.indexOf(64) != -1) {
            if (!str.equalsIgnoreCase(str2)) {
                A062 = A0o.equalsIgnoreCase(str2.substring(1));
            }
            return true;
        } else if (str2.charAt(0) != '.') {
            A062 = A0o.equalsIgnoreCase(str2);
        } else {
            A062 = A06(A0o, str2);
        }
        if (!A062) {
            return false;
        }
        return true;
    }

    public static boolean A05(String str, String str2) {
        boolean A062;
        String A0o = C165607th.A0o(str.indexOf(58), str);
        int indexOf = A0o.indexOf("//");
        if (indexOf != -1) {
            A0o = A0o.substring(indexOf + 2);
        }
        int lastIndexOf = A0o.lastIndexOf(58);
        if (lastIndexOf != -1) {
            A0o = A0o.substring(0, lastIndexOf);
        }
        String A0o2 = C165607th.A0o(A0o.indexOf(58), A0o);
        String A0o3 = C165607th.A0o(A0o2.indexOf(64), A0o2);
        int indexOf2 = A0o3.indexOf(47);
        if (indexOf2 != -1) {
            A0o3 = A0o3.substring(0, indexOf2);
        }
        if (!str2.startsWith(".")) {
            A062 = A0o3.equalsIgnoreCase(str2);
        } else {
            A062 = A06(A0o3, str2);
        }
        if (A062) {
            return true;
        }
        return false;
    }

    public void A0A(C22641As7 as7) {
        Set<C22656AsM> set = this.A00;
        C22656AsM A042 = C22656AsM.A04(as7);
        if (!set.isEmpty()) {
            for (C22656AsM A082 : set) {
                if (A08(A042, A082)) {
                    throw new C1888891d("Subject distinguished name is from an excluded subtree");
                }
            }
        }
    }

    public void A0B(C22641As7 as7) {
        Set<C22656AsM> set = this.A06;
        C22656AsM A042 = C22656AsM.A04(as7.A00);
        if (set == null) {
            return;
        }
        if (!set.isEmpty() || A042.A0H() != 0) {
            for (C22656AsM A082 : set) {
                if (A08(A042, A082)) {
                    return;
                }
            }
            throw new C1888891d("Subject distinguished name is not from a permitted subtree");
        }
    }

    private String A01(Set set) {
        int length;
        int i;
        StringBuilder A0p = C90484aE.A0p();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (A0p.length() > 1) {
                A0p.append(",");
            }
            byte[] bArr = (byte[]) it.next();
            StringBuilder A0u = AnonymousClass000.A0u();
            int i2 = 0;
            while (true) {
                length = bArr.length;
                i = length / 2;
                if (i2 >= i) {
                    break;
                }
                if (A0u.length() > 0) {
                    A0u.append(".");
                }
                A0u.append(Integer.toString(bArr[i2] & 255));
                i2++;
            }
            A0u.append("/");
            boolean z = true;
            while (i < length) {
                if (z) {
                    z = false;
                } else {
                    A0u.append(".");
                }
                A0u.append(Integer.toString(bArr[i] & 255));
                i++;
            }
            C36351kA.A1K(A0u, A0p);
        }
        return C90474aD.A0g(A0p);
    }

    public static String A02(Set set) {
        StringBuilder A0p = C90484aE.A0p();
        for (Object A002 : set) {
            if (A0p.length() > 1) {
                A0p.append(",");
            }
            C22610Arc A003 = C22610Arc.A00(A002);
            A0p.append(A003.A01.A01);
            A0p.append(":");
            try {
                byte[] A082 = A003.A00.Bve().A08();
                A0p.append(C202439lp.A00(A082, A082.length));
            } catch (IOException e) {
                C36351kA.A1K(e, A0p);
            }
        }
        return C90474aD.A0g(A0p);
    }

    public static final void A03(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(AnonymousClass11q.A00);
    }

    public static boolean A08(C22656AsM asM, C22656AsM asM2) {
        boolean A052;
        if (asM2.A0H() >= 1 && asM2.A0H() <= asM.A0H()) {
            C22633Arz A002 = C22633Arz.A00(asM2.A0J(0));
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i < asM.A0H()) {
                    if (C202769md.A05(A002, C22633Arz.A00(asM.A0J(i)))) {
                        break;
                    }
                    i2 = i;
                    i++;
                } else {
                    i = i2;
                    break;
                }
            }
            if (asM2.A0H() <= asM.A0H() - i) {
                int i3 = 0;
                while (i3 < asM2.A0H()) {
                    C22633Arz A003 = C22633Arz.A00(asM2.A0J(i3));
                    C22633Arz A004 = C22633Arz.A00(asM.A0J(i + i3));
                    if (A003.A00.A00.length == A004.A00.A00.length && A003.A0A().A01.A0G(A004.A0A().A01)) {
                        if (A003.A00.A00.length != 1 || !A003.A0A().A01.A0G(C22689Ast.A0W)) {
                            A052 = C202769md.A05(A003, A004);
                        } else {
                            A052 = A004.A0A().A00.toString().startsWith(A003.A0A().A00.toString());
                        }
                        if (A052) {
                            i3++;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A03(A0u, "permitted:");
        Set set = this.A06;
        if (set != null) {
            A03(A0u, "DN:");
            A03(A0u, set.toString());
        }
        Set set2 = this.A07;
        if (set2 != null) {
            A03(A0u, "DNS:");
            A03(A0u, set2.toString());
        }
        Set set3 = this.A08;
        if (set3 != null) {
            A03(A0u, "Email:");
            A03(A0u, set3.toString());
        }
        Set set4 = this.A0B;
        if (set4 != null) {
            A03(A0u, "URI:");
            A03(A0u, set4.toString());
        }
        Set set5 = this.A09;
        if (set5 != null) {
            A03(A0u, "IP:");
            A03(A0u, A01(set5));
        }
        Set set6 = this.A0A;
        if (set6 != null) {
            A03(A0u, "OtherName:");
            A03(A0u, A02(set6));
        }
        A03(A0u, "excluded:");
        if (!this.A00.isEmpty()) {
            A03(A0u, "DN:");
            A03(A0u, this.A00.toString());
        }
        if (!this.A01.isEmpty()) {
            A03(A0u, "DNS:");
            A03(A0u, this.A01.toString());
        }
        if (!this.A02.isEmpty()) {
            A03(A0u, "Email:");
            A03(A0u, this.A02.toString());
        }
        if (!this.A05.isEmpty()) {
            A03(A0u, "URI:");
            A03(A0u, this.A05.toString());
        }
        if (!this.A03.isEmpty()) {
            A03(A0u, "IP:");
            A03(A0u, A01(this.A03));
        }
        if (!this.A04.isEmpty()) {
            A03(A0u, "OtherName:");
            A03(A0u, A02(this.A04));
        }
        return A0u.toString();
    }
}
