package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: X.As1  reason: case insensitive filesystem */
public class C22635As1 extends AnonymousClass120 {
    public static final Hashtable A06;
    public static final Hashtable A07;
    public static final Hashtable A08;
    public static final Hashtable A09;
    public static final Hashtable A0A;
    public static final Hashtable A0B;
    public static final AnonymousClass122 A0C;
    public static final AnonymousClass122 A0D;
    public static final AnonymousClass122 A0E;
    public static final AnonymousClass122 A0F;
    public static final AnonymousClass122 A0G;
    public static final AnonymousClass122 A0H;
    public static final AnonymousClass122 A0I;
    public static final AnonymousClass122 A0J = C165617ti.A0f("2.5.4.54");
    public static final AnonymousClass122 A0K;
    public static final AnonymousClass122 A0L;
    public static final AnonymousClass122 A0M;
    public static final AnonymousClass122 A0N;
    public static final AnonymousClass122 A0O;
    public static final AnonymousClass122 A0P;
    public static final AnonymousClass122 A0Q;
    public static final AnonymousClass122 A0R;
    public static final AnonymousClass122 A0S;
    public static final AnonymousClass122 A0T;
    public static final AnonymousClass122 A0U;
    public static final AnonymousClass122 A0V;
    public static final AnonymousClass122 A0W;
    public static final AnonymousClass122 A0X;
    public static final AnonymousClass122 A0Y;
    public static final AnonymousClass122 A0Z;
    public static final AnonymousClass122 A0a;
    public static final AnonymousClass122 A0b;
    public static final AnonymousClass122 A0c;
    public static final AnonymousClass122 A0d;
    public static final AnonymousClass122 A0e;
    public static final AnonymousClass122 A0f;
    public static final AnonymousClass122 A0g;
    public static final AnonymousClass122 A0h;
    public static final AnonymousClass122 A0i;
    public static final AnonymousClass122 A0j;
    public static final AnonymousClass122 A0k;
    public static final Boolean A0l = new Boolean(false);
    public static final Boolean A0m = new Boolean(true);
    public Vector A00 = new Vector();
    public Vector A01 = new Vector();
    public Vector A02 = new Vector();
    public int A03;
    public C22656AsM A04;
    public boolean A05;

    public C22635As1() {
    }

    public int hashCode() {
        if (!this.A05) {
            this.A05 = true;
            int i = 0;
            while (true) {
                Vector vector = this.A01;
                if (i == vector.size()) {
                    break;
                }
                String A012 = A01(A00((String) this.A02.elementAt(i)));
                int hashCode = this.A03 ^ vector.elementAt(i).hashCode();
                this.A03 = hashCode;
                this.A03 = A012.hashCode() ^ hashCode;
                i++;
            }
        }
        return this.A03;
    }

    static {
        AnonymousClass122 A0f2 = C165617ti.A0f("2.5.4.6");
        A0D = A0f2;
        AnonymousClass122 A0f3 = C165617ti.A0f("2.5.4.10");
        A0U = A0f3;
        AnonymousClass122 A0f4 = C165617ti.A0f("2.5.4.11");
        A0V = A0f4;
        AnonymousClass122 A0f5 = C165617ti.A0f("2.5.4.12");
        A0f = A0f5;
        AnonymousClass122 A0f6 = C165617ti.A0f("2.5.4.3");
        A0E = A0f6;
        AnonymousClass122 A0f7 = C165617ti.A0f("2.5.4.5");
        A0b = A0f7;
        AnonymousClass122 A0f8 = C165617ti.A0f("2.5.4.9");
        A0d = A0f8;
        A0a = A0f7;
        AnonymousClass122 A0f9 = C165617ti.A0f("2.5.4.7");
        A0R = A0f9;
        AnonymousClass122 A0f10 = C165617ti.A0f("2.5.4.8");
        A0c = A0f10;
        AnonymousClass122 A0f11 = C165617ti.A0f("2.5.4.4");
        A0e = A0f11;
        AnonymousClass122 A0f12 = C165617ti.A0f("2.5.4.42");
        A0P = A0f12;
        AnonymousClass122 A0f13 = C165617ti.A0f("2.5.4.43");
        A0Q = A0f13;
        AnonymousClass122 A0f14 = C165617ti.A0f("2.5.4.44");
        A0O = A0f14;
        AnonymousClass122 A0f15 = C165617ti.A0f("2.5.4.45");
        A0i = A0f15;
        AnonymousClass122 A0f16 = C165617ti.A0f("2.5.4.15");
        A0C = A0f16;
        AnonymousClass122 A0f17 = C165617ti.A0f("2.5.4.17");
        A0Y = A0f17;
        AnonymousClass122 A0f18 = C165617ti.A0f("2.5.4.46");
        A0K = A0f18;
        AnonymousClass122 A0f19 = C165617ti.A0f("2.5.4.65");
        A0Z = A0f19;
        AnonymousClass122 A0f20 = C165617ti.A0f("1.3.6.1.5.5.7.9.1");
        A0H = A0f20;
        AnonymousClass122 A0f21 = C165617ti.A0f("1.3.6.1.5.5.7.9.2");
        A0W = A0f21;
        AnonymousClass122 A0f22 = C165617ti.A0f("1.3.6.1.5.5.7.9.3");
        A0N = A0f22;
        AnonymousClass122 A0f23 = C165617ti.A0f("1.3.6.1.5.5.7.9.4");
        A0F = A0f23;
        AnonymousClass122 A0f24 = C165617ti.A0f("1.3.6.1.5.5.7.9.5");
        A0G = A0f24;
        AnonymousClass122 A0f25 = C165617ti.A0f("1.3.36.8.3.14");
        A0T = A0f25;
        AnonymousClass122 A0f26 = C165617ti.A0f("2.5.4.16");
        A0X = A0f26;
        AnonymousClass122 r29 = B4N.A09;
        A0g = r29;
        AnonymousClass122 r28 = B4N.A07;
        A0S = r28;
        AnonymousClass122 r4 = C219311y.A1u;
        A0M = r4;
        AnonymousClass122 r27 = C219311y.A24;
        A0k = r27;
        AnonymousClass122 r26 = C219311y.A23;
        A0j = r26;
        A0L = r4;
        AnonymousClass122 A0f27 = C165617ti.A0f("0.9.2342.19200300.100.1.25");
        A0I = A0f27;
        AnonymousClass122 A0f28 = C165617ti.A0f("0.9.2342.19200300.100.1.1");
        A0h = A0f28;
        Hashtable hashtable = new Hashtable();
        A07 = hashtable;
        Hashtable hashtable2 = new Hashtable();
        A0A = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        A09 = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        A06 = hashtable4;
        A08 = hashtable;
        A0B = hashtable4;
        hashtable.put(A0f2, "C");
        hashtable.put(A0f3, "O");
        hashtable.put(A0f5, "T");
        hashtable.put(A0f4, "OU");
        hashtable.put(A0f6, "CN");
        hashtable.put(A0f9, "L");
        hashtable.put(A0f10, "ST");
        hashtable.put(A0f7, "SERIALNUMBER");
        hashtable.put(r4, "E");
        hashtable.put(A0f27, "DC");
        hashtable.put(A0f28, "UID");
        hashtable.put(A0f8, "STREET");
        hashtable.put(A0f11, "SURNAME");
        hashtable.put(A0f12, "GIVENNAME");
        hashtable.put(A0f13, "INITIALS");
        hashtable.put(A0f14, "GENERATION");
        hashtable.put(r26, "unstructuredAddress");
        hashtable.put(r27, "unstructuredName");
        hashtable.put(A0f15, "UniqueIdentifier");
        hashtable.put(A0f18, "DN");
        hashtable.put(A0f19, "Pseudonym");
        hashtable.put(A0f26, "PostalAddress");
        hashtable.put(A0f25, "NameAtBirth");
        hashtable.put(A0f23, "CountryOfCitizenship");
        hashtable.put(A0f24, "CountryOfResidence");
        hashtable.put(A0f22, "Gender");
        hashtable.put(A0f21, "PlaceOfBirth");
        hashtable.put(A0f20, "DateOfBirth");
        hashtable.put(A0f17, "PostalCode");
        hashtable.put(A0f16, "BusinessCategory");
        hashtable.put(r29, "TelephoneNumber");
        hashtable.put(r28, "Name");
        hashtable2.put(A0f2, "C");
        hashtable2.put(A0f3, "O");
        hashtable2.put(A0f4, "OU");
        hashtable2.put(A0f6, "CN");
        hashtable2.put(A0f9, "L");
        hashtable2.put(A0f10, "ST");
        hashtable2.put(A0f8, "STREET");
        hashtable2.put(A0f27, "DC");
        hashtable2.put(A0f28, "UID");
        hashtable3.put(A0f2, "C");
        hashtable3.put(A0f3, "O");
        hashtable3.put(A0f4, "OU");
        hashtable3.put(A0f6, "CN");
        hashtable3.put(A0f9, "L");
        hashtable3.put(A0f10, "ST");
        hashtable3.put(A0f8, "STREET");
        hashtable4.put("c", A0f2);
        hashtable4.put("o", A0f3);
        hashtable4.put("t", A0f5);
        hashtable4.put("ou", A0f4);
        hashtable4.put("cn", A0f6);
        hashtable4.put("l", A0f9);
        hashtable4.put("st", A0f10);
        hashtable4.put("sn", A0f7);
        hashtable4.put("serialnumber", A0f7);
        hashtable4.put("street", A0f8);
        hashtable4.put("emailaddress", r4);
        hashtable4.put("dc", A0f27);
        hashtable4.put("e", r4);
        hashtable4.put("uid", A0f28);
        hashtable4.put("surname", A0f11);
        hashtable4.put("givenname", A0f12);
        hashtable4.put("initials", A0f13);
        hashtable4.put("generation", A0f14);
        hashtable4.put("unstructuredaddress", r26);
        hashtable4.put("unstructuredname", r27);
        hashtable4.put("uniqueidentifier", A0f15);
        hashtable4.put("dn", A0f18);
        hashtable4.put("pseudonym", A0f19);
        hashtable4.put("postaladdress", A0f26);
        hashtable4.put("nameofbirth", A0f25);
        hashtable4.put("countryofcitizenship", A0f23);
        hashtable4.put("countryofresidence", A0f24);
        hashtable4.put("gender", A0f22);
        hashtable4.put("placeofbirth", A0f21);
        hashtable4.put("dateofbirth", A0f20);
        hashtable4.put("postalcode", A0f17);
        hashtable4.put("businesscategory", A0f16);
        hashtable4.put("telephonenumber", r29);
        hashtable4.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r28);
    }

    public AnonymousClass121 Bve() {
        C22656AsM asM = this.A04;
        if (asM != null) {
            return asM;
        }
        C202169lB r4 = new C202169lB();
        C202169lB r1 = new C202169lB();
        Vector vector = this.A01;
        if (0 != vector.size()) {
            C202169lB.A00().A06((AnonymousClass120) vector.elementAt(0));
            this.A02.elementAt(0);
            throw AnonymousClass001.A0A("getConvertedValue");
        }
        C22675Asf A012 = C202169lB.A01(new C22678Asi(r1), r4);
        this.A04 = A012;
        return A012;
    }

    public boolean equals(Object obj) {
        C22635As1 as1;
        Object obj2 = obj;
        if (obj2 != this) {
            boolean z = obj2 instanceof C22635As1;
            if (z || (obj2 instanceof C22656AsM)) {
                if (!Bve().A0G(((C219411z) obj2).Bve())) {
                    if (z) {
                        try {
                            as1 = (C22635As1) obj2;
                        } catch (IllegalArgumentException unused) {
                            return false;
                        }
                    } else {
                        if (obj2 instanceof C22641As7) {
                            obj2 = ((C22641As7) obj2).A00;
                        } else if (obj == null) {
                            as1 = null;
                        }
                        as1 = new C22635As1(C22656AsM.A04(obj2));
                    }
                    Vector vector = this.A01;
                    int size = vector.size();
                    Vector vector2 = as1.A01;
                    if (size == vector2.size()) {
                        boolean[] zArr = new boolean[size];
                        int i = -1;
                        int i2 = size - 1;
                        int i3 = -1;
                        if (vector.elementAt(0).equals(vector2.elementAt(0))) {
                            i = size;
                            i2 = 0;
                            i3 = 1;
                        }
                        while (i2 != i) {
                            AnonymousClass121 r4 = (AnonymousClass121) vector.elementAt(i2);
                            String str = (String) this.A02.elementAt(i2);
                            for (int i4 = 0; i4 < size; i4++) {
                                if (!zArr[i4] && r4.A0G((AnonymousClass121) vector2.elementAt(i4))) {
                                    String A002 = A00(str);
                                    String A003 = A00((String) as1.A02.elementAt(i4));
                                    if (A002.equals(A003) || A01(A002).equals(A01(A003))) {
                                        zArr[i4] = true;
                                        i2 += i3;
                                    }
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

    public String toString() {
        Hashtable hashtable = A07;
        StringBuffer A0x = C165607th.A0x();
        Vector vector = new Vector();
        StringBuffer stringBuffer = null;
        int i = 0;
        while (true) {
            Vector vector2 = this.A01;
            if (i >= vector2.size()) {
                break;
            }
            if (AnonymousClass000.A1X(this.A00.elementAt(i))) {
                stringBuffer.append('+');
                A02((String) this.A02.elementAt(i), stringBuffer, hashtable, (AnonymousClass122) vector2.elementAt(i));
            } else {
                stringBuffer = C165607th.A0x();
                A02((String) this.A02.elementAt(i), stringBuffer, hashtable, (AnonymousClass122) vector2.elementAt(i));
                vector.addElement(stringBuffer);
            }
            i++;
        }
        boolean z = true;
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (z) {
                z = false;
            } else {
                A0x.append(',');
            }
            A0x.append(vector.elementAt(i2).toString());
        }
        return A0x.toString();
    }

    public C22635As1(C22656AsM asM) {
        Boolean bool;
        Vector vector;
        this.A04 = asM;
        Enumeration A0I2 = asM.A0I();
        while (A0I2.hasMoreElements()) {
            C22657AsN A012 = C22657AsN.A01(((C219411z) A0I2.nextElement()).Bve());
            int i = 0;
            while (true) {
                C219411z[] r1 = A012.A00;
                if (i < r1.length) {
                    C22656AsM A042 = C22656AsM.A04(r1[i].Bve());
                    if (A042.A0H() == 2) {
                        this.A01.addElement(AnonymousClass122.A01(A042.A0J(0)));
                        C219411z A032 = C22656AsM.A03(A042);
                        if (!(A032 instanceof B0I) || (A032 instanceof C22670Asa)) {
                            try {
                                Vector vector2 = this.A02;
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("#");
                                byte[] A1V = C165597tg.A1V(A032);
                                byte[] A033 = C202439lp.A03(A1V, 0, A1V.length);
                                int length = A033.length;
                                char[] cArr = new char[length];
                                for (int i2 = 0; i2 != length; i2++) {
                                    cArr[i2] = (char) (A033[i2] & 255);
                                }
                                vector2.addElement(AnonymousClass000.A0q(new String(cArr), A0u));
                            } catch (IOException unused) {
                                throw AnonymousClass001.A08("cannot encode value");
                            }
                        } else {
                            String BHz = ((B0I) A032).BHz();
                            if (BHz.length() <= 0 || BHz.charAt(0) != '#') {
                                vector = this.A02;
                            } else {
                                vector = this.A02;
                                BHz = AnonymousClass000.A0p("\\", BHz, AnonymousClass000.A0u());
                            }
                            vector.addElement(BHz);
                        }
                        Vector vector3 = this.A00;
                        if (i != 0) {
                            bool = A0m;
                        } else {
                            bool = A0l;
                        }
                        vector3.addElement(bool);
                        i++;
                    } else {
                        throw AnonymousClass001.A08("badly sized pair");
                    }
                }
            }
        }
    }

    private String A00(String str) {
        String A002 = AnonymousClass11q.A00(str.trim());
        int length = A002.length();
        if (length <= 0 || C165597tg.A00(A002) != '#') {
            return A002;
        }
        try {
            AnonymousClass121 A003 = AnonymousClass121.A00(C202439lp.A02(A002, length - 1));
            if (A003 instanceof B0I) {
                return AnonymousClass11q.A00(((B0I) A003).BHz().trim());
            }
            return A002;
        } catch (IOException e) {
            throw AnonymousClass000.A0f(e, "unknown encoding in name: ", AnonymousClass000.A0u());
        }
    }

    public static String A01(String str) {
        StringBuffer A0x = C165607th.A0x();
        int length = str.length();
        if (length != 0) {
            char A002 = C165597tg.A00(str);
            A0x.append(A002);
            int i = 1;
            while (i < length) {
                char charAt = str.charAt(i);
                if (A002 != ' ' || charAt != ' ') {
                    A0x.append(charAt);
                }
                i++;
                A002 = charAt;
            }
        }
        return A0x.toString();
    }

    public static void A02(String str, StringBuffer stringBuffer, Hashtable hashtable, AnonymousClass122 r9) {
        int i;
        String str2 = (String) hashtable.get(r9);
        if (str2 == null) {
            str2 = r9.A01;
        }
        stringBuffer.append(str2);
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && C165597tg.A00(str) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (i < length2 && stringBuffer.charAt(i) == ' ') {
            stringBuffer.insert(i, "\\");
            length = i + 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 > i && stringBuffer.charAt(length2) == ' ') {
                stringBuffer.insert(length2, '\\');
            }
        }
        while (i <= length2) {
            char charAt = stringBuffer.charAt(i);
            if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                switch (charAt) {
                    case ';':
                    case AnonymousClass8SX.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER:
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        continue;
                }
            }
            stringBuffer.insert(i, "\\");
            i += 2;
            length2++;
        }
    }
}
