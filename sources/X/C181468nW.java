package X;

/* renamed from: X.8nW  reason: invalid class name and case insensitive filesystem */
public class C181468nW extends C181758nz {
    public String A00;

    public C181468nW(C64933Qa r2, long j) {
        super(r2, 83, j);
    }

    public static String A00(String str) {
        String str2 = "invite_link";
        if (!str2.equals(str)) {
            str2 = "linked_group_join";
            if (!str2.equals(str)) {
                str2 = "non_admin_add";
                if (!str2.equals(str)) {
                    return null;
                }
            }
        }
        return str2;
    }

    public String A0c() {
        return this.A00;
    }
}
