package X;

/* renamed from: X.18m  reason: invalid class name and case insensitive filesystem */
public final class C234418m {
    public final C19970wo A00;
    public final C233918h A01;
    public final AnonymousClass18M A02;
    public final C20810yC A03;

    public C234418m(C19970wo r2, C233918h r3, AnonymousClass18M r4, C20810yC r5) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r3, 4);
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
    }

    public final String[] A01(AnonymousClass6EZ r8, C64933Qa r9, Long l, String str) {
        AnonymousClass00C.A0D(str, 0);
        if (l != null) {
            long longValue = l.longValue();
            String str2 = r9.A01;
            AnonymousClass00C.A07(str2);
            return new String[]{str, String.valueOf(longValue), String.valueOf(r8.A01), String.valueOf(r8.A00), str2};
        }
        String str3 = r8.A02;
        AnonymousClass00C.A08(str3);
        String str4 = r9.A01;
        AnonymousClass00C.A07(str4);
        return new String[]{str, str3, String.valueOf(r8.A01), String.valueOf(r8.A00), str4};
    }

    public final String A00(C64933Qa r3, Long l) {
        StringBuilder sb;
        String str;
        String str2;
        if (l != null) {
            str = "msg_key_remote_jid  = ? AND recipient_lid_identifier = ? AND recipient_type = ? AND device_id = ? AND msg_key_from_me ";
        } else {
            sb = new StringBuilder();
            str = "msg_key_remote_jid  = ? AND recipient_id = ? AND recipient_type = ? AND device_id = ? AND msg_key_from_me ";
        }
        sb.append(str);
        if (r3.A02) {
            str2 = " != ";
        } else {
            str2 = " = ";
        }
        sb.append(str2);
        sb.append(" 0 AND msg_key_id = ?");
        return sb.toString();
    }
}
