package X;

import java.io.IOException;

/* renamed from: X.As6  reason: case insensitive filesystem */
public class C22640As6 extends AnonymousClass120 implements C16580pk {
    public int A00;
    public C219411z A01;

    public C22640As6(C219411z r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public C22640As6(C22641As7 as7) {
        this.A01 = as7;
        this.A00 = 4;
    }

    public C22640As6(String str) {
        this.A00 = 1;
        this.A01 = new C22671Asb(str);
    }

    public static String A00(C22640As6 as6) {
        return AnonymousClass11q.A02(C22671Asb.A01(as6.A01).A00);
    }

    public static C22640As6 A01(Object obj) {
        C219411z r1;
        if (obj == null || (obj instanceof C22640As6)) {
            return (C22640As6) obj;
        }
        if (obj instanceof C22658AsO) {
            C22658AsO asO = (C22658AsO) obj;
            int i = asO.A00;
            switch (i) {
                case 0:
                case 3:
                case 5:
                    r1 = C22656AsM.A05(asO, false);
                    break;
                case 1:
                case 2:
                case 6:
                    AnonymousClass121 A012 = C22658AsO.A01(asO);
                    if (!(A012 instanceof C22671Asb)) {
                        r1 = new C22671Asb(C22659AsP.A03(A012));
                        break;
                    } else {
                        r1 = C22671Asb.A01(A012);
                        break;
                    }
                case 4:
                    C200109gd r0 = C22641As7.A05;
                    return new C22640As6(C22641As7.A01(C22656AsM.A05(asO, true)), i);
                case 7:
                    r1 = C22659AsP.A02(asO, false);
                    break;
                case 8:
                    AnonymousClass121 A013 = C22658AsO.A01(asO);
                    if (!(A013 instanceof AnonymousClass122)) {
                        byte[] A03 = C22659AsP.A03(A013);
                        r1 = (AnonymousClass120) AnonymousClass122.A02.get(new AnonymousClass123(A03));
                        if (r1 == null) {
                            r1 = new AnonymousClass122(A03);
                            break;
                        }
                    } else {
                        r1 = AnonymousClass122.A01(A013);
                        break;
                    }
                    break;
                default:
                    throw AnonymousClass000.A0d("unknown tag: ", AnonymousClass000.A0u(), i);
            }
            return new C22640As6(r1, i);
        } else if (obj instanceof byte[]) {
            try {
                return A01(AnonymousClass121.A00((byte[]) obj));
            } catch (IOException unused) {
                throw AnonymousClass001.A08("unable to parse encoded general name");
            }
        } else {
            throw C165567td.A0N(obj, "unknown object in getInstance: ", AnonymousClass000.A0u());
        }
    }

    public AnonymousClass121 Bve() {
        int i = this.A00;
        return new C22681Asl(this.A01, i, AnonymousClass000.A1S(i, 4));
    }

    public String toString() {
        String A002;
        Object A012;
        StringBuffer A0x = C165607th.A0x();
        int i = this.A00;
        A0x.append(i);
        A0x.append(": ");
        if (!(i == 1 || i == 2)) {
            if (i == 4) {
                A012 = C22641As7.A01(this.A01);
            } else if (i != 6) {
                A012 = this.A01;
            }
            A002 = A012.toString();
            return C165597tg.A0n(A002, A0x);
        }
        A002 = A00(this);
        return C165597tg.A0n(A002, A0x);
    }
}
