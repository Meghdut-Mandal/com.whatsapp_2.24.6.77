package X;

import java.util.Enumeration;

/* renamed from: X.As7  reason: case insensitive filesystem */
public class C22641As7 extends AnonymousClass120 implements C16580pk {
    public static C200109gd A05 = C22691Asv.A0e;
    public C22675Asf A00;
    public C200109gd A01;
    public C22633Arz[] A02;
    public int A03;
    public boolean A04;

    public C22641As7(C200109gd r3, C22633Arz[] arzArr) {
        this.A01 = r3;
        C22633Arz[] arzArr2 = (C22633Arz[]) arzArr.clone();
        this.A02 = arzArr2;
        this.A00 = new C22675Asf((C219411z[]) arzArr2);
    }

    public C22641As7(C22641As7 as7, C200109gd r3) {
        this.A01 = r3;
        this.A02 = as7.A02;
        this.A00 = as7.A00;
    }

    public static C22641As7 A02(Object obj, C200109gd r3) {
        if (obj instanceof C22641As7) {
            return new C22641As7((C22641As7) obj, r3);
        }
        if (obj != null) {
            return new C22641As7(C22656AsM.A04(obj), r3);
        }
        return null;
    }

    public C22633Arz[] A0A() {
        return (C22633Arz[]) this.A02.clone();
    }

    public AnonymousClass121 Bve() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        boolean z;
        int i;
        if (obj != this) {
            if (!(obj instanceof C22641As7) && !(obj instanceof C22656AsM)) {
                return false;
            }
            C219411z r13 = (C219411z) obj;
            if (!this.A00.A0G(r13.Bve())) {
                try {
                    C200109gd r3 = this.A01;
                    C22641As7 as7 = new C22641As7(C22656AsM.A04(r13.Bve()), A05);
                    if (r3 instanceof C22690Asu) {
                        C22633Arz[] A0A = A0A();
                        C22633Arz[] A0A2 = as7.A0A();
                        int length = A0A.length;
                        if (length != A0A2.length) {
                            return false;
                        }
                        for (int i2 = 0; i2 != length; i2++) {
                            if (!C202769md.A05(A0A[i2], A0A2[i2])) {
                                return false;
                            }
                        }
                        return true;
                    }
                    C22633Arz[] A0A3 = A0A();
                    C22633Arz[] A0A4 = as7.A0A();
                    int length2 = A0A3.length;
                    int length3 = A0A4.length;
                    if (length2 != length3) {
                        return false;
                    }
                    if (A0A3[0].A0A() == null || A0A4[0].A0A() == null) {
                        z = false;
                    } else {
                        z = !A0A3[0].A0A().A01.A0G(A0A4[0].A0A().A01);
                    }
                    for (int i3 = 0; i3 != length2; i3++) {
                        C22633Arz arz = A0A3[i3];
                        int i4 = 0;
                        if (z) {
                            i = length3 - 1;
                            while (i >= 0) {
                                if (A0A4[i] == null || !C202769md.A05(arz, A0A4[i])) {
                                    i--;
                                }
                            }
                            return false;
                        }
                        while (i != length3) {
                            if (A0A4[i] == null || !C202769md.A05(arz, A0A4[i])) {
                                i4 = i + 1;
                            }
                        }
                        return false;
                        A0A4[i] = null;
                    }
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        return this.A01.A01(this);
    }

    public static C22641As7 A01(Object obj) {
        if (obj instanceof C22641As7) {
            return (C22641As7) obj;
        }
        if (obj != null) {
            return new C22641As7(C22656AsM.A04(obj), A05);
        }
        return null;
    }

    public int hashCode() {
        if (this.A04) {
            return this.A03;
        }
        this.A04 = true;
        C22633Arz[] A0A = A0A();
        int i = 0;
        for (int i2 = 0; i2 != A0A.length; i2++) {
            C22633Arz arz = A0A[i2];
            if (arz.A00.A00.length > 1) {
                C22624Arq[] A0B = arz.A0B();
                for (int i3 = 0; i3 != A0B.length; i3++) {
                    C22624Arq arq = A0B[i3];
                    i = (i ^ arq.A01.hashCode()) ^ C202769md.A01(C202769md.A02(arq.A00)).hashCode();
                }
            } else {
                i = (i ^ arz.A0A().A01.hashCode()) ^ C202769md.A01(C202769md.A02(A0A[i2].A0A().A00)).hashCode();
            }
        }
        this.A03 = i;
        return i;
    }

    public C22641As7(C22656AsM asM, C200109gd r8) {
        C22675Asf asf;
        this.A01 = r8;
        this.A02 = new C22633Arz[asM.A0H()];
        Enumeration A0I = asM.A0I();
        boolean z = true;
        int i = 0;
        while (A0I.hasMoreElements()) {
            Object nextElement = A0I.nextElement();
            C22633Arz A002 = C22633Arz.A00(nextElement);
            z &= C36361kB.A1a(A002, nextElement);
            this.A02[i] = A002;
            i++;
        }
        if (z) {
            asf = (C22675Asf) asM.A0B();
        } else {
            asf = new C22675Asf((C219411z[]) this.A02);
        }
        this.A00 = asf;
    }

    public static String A00(String str) {
        int i;
        int length = str.length();
        if (length == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(length);
        if (charArray[0] == '\\' && charArray[1] == '#') {
            i = 2;
            stringBuffer.append("\\#");
        } else {
            i = 0;
        }
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        char c = 0;
        while (i != charArray.length) {
            char c2 = charArray[i];
            if (c2 != ' ') {
                z3 = true;
                if (c2 == '\"') {
                    if (!z) {
                        z2 = !z2;
                        z = false;
                        i++;
                    }
                } else if (c2 == '\\') {
                    if (!z && !z2) {
                        i2 = stringBuffer.length();
                        z = true;
                        i++;
                    }
                } else if (c2 != ' ') {
                    if (z && '0' <= c2 && (c2 <= '9' || ('a' > c2 ? !('A' > c2 || c2 > 'F') : c2 <= 'f'))) {
                        if (c != 0) {
                            stringBuffer.append((char) ((C202769md.A00(c) * 16) + C202769md.A00(c2)));
                            z = false;
                            c = 0;
                        } else {
                            c = c2;
                        }
                        i++;
                    }
                }
                stringBuffer.append(c2);
                z = false;
                i++;
            }
            if (!z && !z3) {
                i++;
            }
            stringBuffer.append(c2);
            z = false;
            i++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i2 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.Arz[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.122[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.122} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: X.122} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.String} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22641As7() {
        /*
            r12 = this;
            java.lang.String r1 = "CN=WAUser"
            X.9gd r5 = A05
            r0 = 44
            X.9UP r4 = new X.9UP
            r4.<init>(r1, r0)
            X.9c6 r6 = new X.9c6
            r6.<init>(r5)
        L_0x0010:
            int r1 = r4.A01
            java.lang.String r0 = r4.A02
            int r0 = r0.length()
            boolean r0 = X.C36381kD.A1U(r1, r0)
            if (r0 == 0) goto L_0x014d
            java.lang.String r2 = r4.A00()
            r1 = 43
            int r0 = r2.indexOf(r1)
            java.lang.String r11 = "badly formatted directory string"
            r9 = 61
            if (r0 <= 0) goto L_0x0105
            X.9UP r10 = new X.9UP
            r10.<init>(r2, r1)
            java.lang.String r0 = r10.A00()
            X.9UP r3 = new X.9UP
            r3.<init>(r0, r9)
            java.lang.String r2 = r3.A00()
            int r1 = r3.A01
            java.lang.String r0 = r3.A02
            int r0 = r0.length()
            boolean r0 = X.C36381kD.A1U(r1, r0)
            if (r0 == 0) goto L_0x0143
            java.lang.String r8 = r3.A00()
            java.lang.String r0 = r2.trim()
            X.122 r3 = r5.A03(r0)
            int r1 = r10.A01
            java.lang.String r0 = r10.A02
            int r0 = r0.length()
            boolean r0 = X.C36381kD.A1U(r1, r0)
            if (r0 == 0) goto L_0x0128
            java.util.Vector r7 = new java.util.Vector
            r7.<init>()
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
        L_0x0072:
            r7.addElement(r3)
            java.lang.String r0 = A00(r8)
            r2.addElement(r0)
            int r1 = r10.A01
            java.lang.String r0 = r10.A02
            int r0 = r0.length()
            boolean r0 = X.C36381kD.A1U(r1, r0)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = r10.A00()
            X.9UP r8 = new X.9UP
            r8.<init>(r0, r9)
            java.lang.String r3 = r8.A00()
            int r1 = r8.A01
            java.lang.String r0 = r8.A02
            int r0 = r0.length()
            boolean r0 = X.C36381kD.A1U(r1, r0)
            if (r0 == 0) goto L_0x013e
            java.lang.String r8 = r8.A00()
            java.lang.String r0 = r3.trim()
            X.122 r3 = r5.A03(r0)
            goto L_0x0072
        L_0x00b2:
            int r10 = r7.size()
            X.122[] r9 = new X.AnonymousClass122[r10]
            r1 = 0
        L_0x00b9:
            if (r1 == r10) goto L_0x00c4
            java.lang.Object r0 = r7.elementAt(r1)
            r9[r1] = r0
            int r1 = r1 + 1
            goto L_0x00b9
        L_0x00c4:
            int r11 = r2.size()
            java.lang.String[] r7 = new java.lang.String[r11]
            r1 = 0
        L_0x00cb:
            if (r1 == r11) goto L_0x00d6
            java.lang.Object r0 = r2.elementAt(r1)
            r7[r1] = r0
            int r1 = r1 + 1
            goto L_0x00cb
        L_0x00d6:
            X.11z[] r8 = new X.C219411z[r11]
            r3 = 0
        L_0x00d9:
            if (r3 == r11) goto L_0x00ea
            X.9gd r2 = r6.A01
            r1 = r9[r3]
            r0 = r7[r3]
            X.11z r0 = r2.A02(r0, r1)
            r8[r3] = r0
            int r3 = r3 + 1
            goto L_0x00d9
        L_0x00ea:
            X.Arq[] r7 = new X.C22624Arq[r10]
            r3 = 0
        L_0x00ed:
            if (r3 == r10) goto L_0x00fd
            r2 = r9[r3]
            r1 = r8[r3]
            X.Arq r0 = new X.Arq
            r0.<init>(r1, r2)
            r7[r3] = r0
            int r3 = r3 + 1
            goto L_0x00ed
        L_0x00fd:
            java.util.Vector r2 = r6.A00
            X.Arz r1 = new X.Arz
            r1.<init>((X.C22624Arq[]) r7)
            goto L_0x0139
        L_0x0105:
            X.9UP r3 = new X.9UP
            r3.<init>(r2, r9)
            java.lang.String r2 = r3.A00()
            int r1 = r3.A01
            java.lang.String r0 = r3.A02
            int r0 = r0.length()
            boolean r0 = X.C36381kD.A1U(r1, r0)
            if (r0 == 0) goto L_0x0148
            java.lang.String r8 = r3.A00()
            java.lang.String r0 = r2.trim()
            X.122 r3 = r5.A03(r0)
        L_0x0128:
            java.lang.String r1 = A00(r8)
            X.9gd r0 = r6.A01
            X.11z r0 = r0.A02(r1, r3)
            java.util.Vector r2 = r6.A00
            X.Arz r1 = new X.Arz
            r1.<init>(r0, r3)
        L_0x0139:
            r2.addElement(r1)
            goto L_0x0010
        L_0x013e:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r11)
            throw r0
        L_0x0143:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r11)
            throw r0
        L_0x0148:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r11)
            throw r0
        L_0x014d:
            java.util.Vector r4 = r6.A00
            int r3 = r4.size()
            X.Arz[] r2 = new X.C22633Arz[r3]
            r1 = 0
        L_0x0156:
            if (r1 == r3) goto L_0x0161
            java.lang.Object r0 = r4.elementAt(r1)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0156
        L_0x0161:
            X.9gd r1 = r6.A01
            X.As7 r0 = new X.As7
            r0.<init>((X.C200109gd) r1, (X.C22633Arz[]) r2)
            X.Arz[] r0 = r0.A0A()
            r12.<init>((X.C200109gd) r5, (X.C22633Arz[]) r0)
            r12.A01 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22641As7.<init>():void");
    }
}
