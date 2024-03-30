package X;

import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: X.0ed  reason: invalid class name and case insensitive filesystem */
public final class C10640ed implements C15990oN {
    public static final C17110qj A01 = new C10580eW();
    public final C17110qj A00;

    public C10640ed() {
        C17110qj r1;
        C17110qj[] r4 = new C17110qj[2];
        r4[0] = C10600eY.A00;
        try {
            r1 = (C17110qj) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            r1 = A01;
        }
        r4[1] = r1;
        C10590eX r2 = new C10590eX(r4);
        Charset charset = AnonymousClass0WB.A00;
        Objects.requireNonNull(r2, "messageInfoFactory");
        this.A00 = r2;
    }
}
