package X;

import org.json.JSONObject;

/* renamed from: X.64M  reason: invalid class name */
public final class AnonymousClass64M {
    public Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final C20810yC A05;

    public AnonymousClass64M(C20810yC r2, Integer num, String str, String str2, String str3, boolean z) {
        AnonymousClass00C.A0D(r2, 1);
        this.A05 = r2;
        this.A03 = str;
        this.A04 = z;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = num;
    }

    public final String A00() {
        String str;
        String valueOf;
        String str2;
        if (!this.A05.A0E(5841)) {
            return null;
        }
        JSONObject A1B = C36441kJ.A1B();
        JSONObject A1B2 = C36441kJ.A1B();
        A1B2.put("product", "994766073959253");
        A1B2.put("surface", this.A03);
        boolean z = this.A04;
        if (z) {
            str = "upload";
        } else {
            String str3 = this.A02;
            str = "other";
            if (C90494aF.A1Z(str3, "image") || C90494aF.A1Z(str3, "photo") || C90494aF.A1Z(str3, "sticker") || C90494aF.A1Z(str3, "ppic")) {
                str = "image";
            } else if (C90494aF.A1Z(str3, "video") || C90494aF.A1Z(str3, "gif") || C90494aF.A1Z(str3, "ptv")) {
                str = "video";
            } else if (C90494aF.A1Z(str3, "ptt") || C90494aF.A1Z(str3, "audio")) {
                str = "audio";
            } else if (C90494aF.A1Z(str3, "document")) {
                str = "document";
            }
        }
        A1B2.put("request_category", str);
        A1B2.put("is_ad", "0");
        if (!z && (str2 = this.A01) != null) {
            String str4 = "prefetch";
            if (!C90494aF.A1Z(str2, str4)) {
                str4 = "fetch";
            }
            A1B2.put("purpose", str4);
        }
        Integer num = this.A00;
        if (!(num == null || (valueOf = String.valueOf(num.intValue())) == null)) {
            A1B2.put("retry_attempt", valueOf);
        }
        JSONObject A0x = C90484aE.A0x(A1B2, "network_tags", A1B);
        A0x.put("media_type", this.A02);
        A1B.put("application_tags", A0x);
        return C36381kD.A0y(A1B);
    }
}
