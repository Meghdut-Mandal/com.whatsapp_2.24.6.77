package X;

/* renamed from: X.6Lc  reason: invalid class name and case insensitive filesystem */
public class C130446Lc {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public static C130446Lc A00(String str) {
        String str2 = str;
        if (str == null) {
            throw new AnonymousClass5V3(0, "Passed empty string");
        } else if (str2.contains("fpm")) {
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            int i = 0;
            for (String split : str2.split("[?&](?!\\?)")) {
                String[] split2 = split.split("=", 2);
                String str12 = split2[0];
                switch (str12.hashCode()) {
                    case -1509711297:
                        str10 = A01("ssidField", str12, str10, split2);
                        break;
                    case -992105987:
                        str8 = A01("peerID", str12, str8, split2);
                        break;
                    case -316978332:
                        str11 = A01("ssidPasswordField", str12, str11, split2);
                        break;
                    case 3050020:
                        str6 = A01("cert", str12, str6, split2);
                        break;
                    case 351608024:
                        if (!str12.equals("version")) {
                            break;
                        } else {
                            i = Integer.parseInt(split2[1]);
                            break;
                        }
                    case 359746605:
                        str9 = A01("ipAddressField", str12, str9, split2);
                        break;
                    case 607796785:
                        str5 = A01("sessionID", str12, str5, split2);
                        break;
                    case 1450587441:
                        str7 = A01("authToken", str12, str7, split2);
                        break;
                    case 1809169577:
                        str4 = A01("authMethod", str12, str4, split2);
                        break;
                    case 1874684019:
                        str3 = A01("platform", str12, str3, split2);
                        break;
                }
            }
            if (i == 0) {
                throw new AnonymousClass5V3(2, "Required field not found in QR code: version");
            } else if (str3 == null) {
                throw new AnonymousClass5V3(2, "Required field not found in QR code: platform");
            } else if (!str3.equals("android")) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Platform field=");
                A0u.append(str3);
                throw new AnonymousClass5V3(2, AnonymousClass000.A0q(", which is not currently supported", A0u));
            } else if (str5 == null) {
                throw new AnonymousClass5V3(2, "Required field not found in QR code: sessionID");
            } else if (str4 == null) {
                throw new AnonymousClass5V3(2, "Required field not found in QR code: authMethod");
            } else if (str6 == null) {
                throw new AnonymousClass5V3(2, "Required field not found in QR code: cert");
            } else if (str7 != null) {
                return new C130446Lc(str5, str6, str7, str8, str9, str10, str11);
            } else {
                throw new AnonymousClass5V3(2, "Required field not found in QR code: authToken");
            }
        } else if (AnonymousClass3O3.A07.A01(str2) != null) {
            throw new AnonymousClass5V3(1, "Scanned qr code that was generated for companion linking");
        } else {
            throw new AnonymousClass5V3(0, "Scanned qr code that was not generated for chat transfer");
        }
    }

    public C130446Lc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A01 = str4;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = str5;
        this.A02 = str6;
        this.A03 = str7;
    }

    public static String A01(Object obj, String str, String str2, String[] strArr) {
        if (!str.equals(obj)) {
            return str2;
        }
        return strArr[1];
    }
}
