package X;

import java.util.Map;

/* renamed from: X.5tp  reason: invalid class name and case insensitive filesystem */
public final class C121855tp {
    public final C19730wQ A00;
    public final Map A01;
    public final C10880fN A02 = new C10880fN("\\$\\[(.*?)\\]");

    public C121855tp(C19730wQ r6) {
        AnonymousClass00C.A0D(r6, 1);
        this.A00 = r6;
        AnonymousClass011[] r3 = new AnonymousClass011[2];
        C36341k9.A1J("USER.PHONE_NUMBER", new C109245Wv(this, 0), r3, 0);
        C36341k9.A1J("USER.PUSH_NAME", new C109245Wv(this, 1), r3, 1);
        this.A01 = C000400e.A07(r3);
    }
}
