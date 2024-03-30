package X;

import java.util.UUID;

/* renamed from: X.1Sp  reason: invalid class name and case insensitive filesystem */
public final class C28421Sp {
    public Integer A00;
    public String A01;

    public final String A00() {
        String str = this.A01;
        if (str == null) {
            str = UUID.randomUUID().toString();
            this.A01 = str;
            AnonymousClass00C.A0E(str, "null cannot be cast to non-null type kotlin.String");
            this.A01 = str;
        }
        AnonymousClass00C.A0E(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }
}
