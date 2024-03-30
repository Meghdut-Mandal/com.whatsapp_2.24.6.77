package X;

/* renamed from: X.3qF  reason: invalid class name and case insensitive filesystem */
public class C77283qF implements AnonymousClass4TY {
    public final /* synthetic */ C62093Et A00;
    public final /* synthetic */ AnonymousClass141 A01;

    public String BDe() {
        return "type_of_chat";
    }

    public C77283qF(C62093Et r1, AnonymousClass141 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void B5q(C21820zr r4) {
        String str;
        AnonymousClass141 r1 = this.A01;
        if (r1.A0G()) {
            int A0A = this.A00.A02.A07.A0A((AnonymousClass144) C36381kD.A0e(r1, AnonymousClass147.class));
            if (A0A < 32) {
                str = "GROUP_32";
            } else if (A0A < 64) {
                str = "GROUP_64";
            } else if (A0A < 128) {
                str = "GROUP_128";
            } else if (A0A < 256) {
                str = "GROUP_256";
            } else if (A0A < 512) {
                str = "GROUP_512";
            } else {
                str = "GROUP_MORE_512";
            }
        } else if (r1.A0H instanceof C28981Uw) {
            str = "newsletter";
        } else {
            str = "one_to_one";
        }
        r4.A00(str.length(), "type_of_chat", str);
    }
}
