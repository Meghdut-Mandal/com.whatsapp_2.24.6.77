package X;

import com.whatsapp.R;

/* renamed from: X.3TL  reason: invalid class name */
public abstract class AnonymousClass3TL {
    public static final int[] A00 = {R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved};

    public static int A00(String str) {
        if ("all".equals(str)) {
            return 0;
        }
        if ("contacts".equals(str)) {
            return 1;
        }
        if ("none".equals(str)) {
            return 2;
        }
        if ("contact_blacklist".equals(str)) {
            return 3;
        }
        if ("match_last_seen".equals(str)) {
            return 4;
        }
        if ("known".equals(str)) {
            return 5;
        }
        if ("contact_allowlist".equals(str)) {
            return 6;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(java.lang.String r5, int r6) {
        /*
            java.lang.String r0 = "stickers"
            boolean r0 = r0.equals(r5)
            r4 = 6
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0014
            if (r6 == r4) goto L_0x0012
            if (r6 == r2) goto L_0x0012
            r0 = 2
            if (r6 != r0) goto L_0x0013
        L_0x0012:
            r3 = 1
        L_0x0013:
            return r3
        L_0x0014:
            java.lang.String r0 = "online"
            boolean r0 = r0.equals(r5)
            r1 = 4
            if (r0 == 0) goto L_0x0022
            if (r6 == 0) goto L_0x0012
            if (r6 != r1) goto L_0x0013
            goto L_0x0012
        L_0x0022:
            r0 = 3
            if (r6 != r0) goto L_0x0046
            java.lang.String r0 = "status"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "groupadd"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "last"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "profile"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0013
            goto L_0x0012
        L_0x0046:
            if (r6 == r4) goto L_0x0013
            if (r6 == r1) goto L_0x0013
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TL.A03(java.lang.String, int):boolean");
    }

    public static String A01(String str) {
        switch (str.hashCode()) {
            case -1012222381:
                if (str.equals("online")) {
                    return "privacy_online";
                }
                break;
            case -892481550:
                if (str.equals("status")) {
                    return "privacy_status";
                }
                break;
            case -309425751:
                if (str.equals("profile")) {
                    return "privacy_profile_photo";
                }
                break;
            case 3314326:
                if (str.equals("last")) {
                    return "privacy_last_seen";
                }
                break;
            case 506363330:
                if (str.equals("groupadd")) {
                    return "privacy_groupadd";
                }
                break;
            case 548632963:
                if (str.equals("calladd")) {
                    return "privacy_calladd";
                }
                break;
            case 1531715286:
                if (str.equals("stickers")) {
                    return "privacy_stickers";
                }
                break;
            case 1974548689:
                if (str.equals("readreceipts")) {
                    return "read_receipts_enabled";
                }
                break;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Unrecognized category: ");
        throw AnonymousClass000.A0c(str, A0u);
    }

    public static String A02(String str, int i) {
        switch (i) {
            case 1:
                return "contacts";
            case 2:
                return "none";
            case 3:
                return "contact_blacklist";
            case 4:
                if ("online".equals(str)) {
                    return "match_last_seen";
                }
                return "all";
            case 5:
                return "known";
            case 6:
                return "contact_allowlist";
            default:
                return "all";
        }
    }
}
