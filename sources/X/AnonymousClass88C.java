package X;

import java.util.UUID;

/* renamed from: X.88C  reason: invalid class name */
public final class AnonymousClass88C extends C53062qe {
    public final AnonymousClass887 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final UUID A09;
    public final String A0A;

    public AnonymousClass88C(AnonymousClass887 r2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, UUID uuid) {
        AnonymousClass00C.A0D(uuid, 1);
        this.A09 = uuid;
        this.A00 = r2;
        this.A01 = str;
        this.A06 = str2;
        this.A0A = str3;
        this.A08 = str4;
        this.A03 = str5;
        this.A04 = str6;
        this.A02 = str7;
        this.A05 = str8;
        this.A07 = str9;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass88C) {
                AnonymousClass88C r5 = (AnonymousClass88C) obj;
                if (!AnonymousClass00C.A0J(this.A09, r5.A09) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A0A, r5.A0A) || !AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((C36391kE.A0A(this.A09) + AnonymousClass000.A0H(this.A00)) * 31) + C36341k9.A09(this.A01)) * 31) + C36341k9.A09(this.A06)) * 31) + C36341k9.A09(this.A0A)) * 31) + C36341k9.A09(this.A08)) * 31) + C36341k9.A09(this.A03)) * 31) + C36341k9.A09(this.A04)) * 31) + C36341k9.A09(this.A02)) * 31) + C36341k9.A09(this.A05)) * 31) + C36421kH.A05(this.A07);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LinkedDeviceConfig(serviceUUID=");
        A0u.append(this.A09);
        A0u.append(", linkSecurity=");
        A0u.append(this.A00);
        A0u.append(", BtcAddress=");
        A0u.append(this.A01);
        A0u.append(", firmwareVersion=");
        A0u.append(this.A06);
        A0u.append(", deviceSerial=");
        A0u.append(this.A0A);
        A0u.append(", ipAddress=");
        A0u.append(this.A08);
        A0u.append(", deviceImageAssetURI=");
        A0u.append(this.A03);
        A0u.append(", deviceModelName=");
        A0u.append(this.A04);
        A0u.append(", buildFlavor=");
        A0u.append(this.A02);
        A0u.append(", deviceName=");
        A0u.append(this.A05);
        A0u.append(", hardwareType=");
        return C36321k7.A0E(this.A07, A0u);
    }
}
