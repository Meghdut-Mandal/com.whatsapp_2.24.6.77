package X;

import java.util.ArrayList;

/* renamed from: X.8sb  reason: invalid class name and case insensitive filesystem */
public final class C184538sb extends C118095nK {
    public static final ArrayList A00 = C165567td.A0e("false", "true");
    public static final ArrayList A01 = C165567td.A0f("account_setting", "bulk_change", "chat_setting");

    public C184538sb(C203399nx r6) {
        C203399nx.A0A(r6, "ephemeral");
        C203379ns.A0D(r6, Long.class, C36411kG.A0t(), 2147483647L, new String[]{"expiration"});
        C203379ns.A0H(r6, "trigger", A01);
        C203379ns.A0H(r6, "initiated_by_me", A00);
        this.A00 = r6;
    }
}
