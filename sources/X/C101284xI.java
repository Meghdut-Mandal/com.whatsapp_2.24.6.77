package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.4xI  reason: invalid class name and case insensitive filesystem */
public final class C101284xI extends AnonymousClass6FF {
    public final AnonymousClass00T A00;

    public static final long A00(AnonymousClass6SG r2, C101284xI r3) {
        int hashCode = r2.A00.hashCode();
        if (r3.A01 != null) {
            return C90474aD.A0A(hashCode, 16321564);
        }
        UserFlowLogger userFlowLogger = r3.A00;
        if (userFlowLogger != null) {
            return userFlowLogger.generateFlowId(16321564, hashCode);
        }
        throw C36381kD.A0l();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101284xI(C20810yC r3, C148326yg r4) {
        super((UserFlowLogger) r4.A02.getValue(), (AnonymousClass5JT) null);
        C36321k7.A0x(r3, r4);
        this.A00 = C001400p.A00(C000800j.PUBLICATION, new AnonymousClass7JZ(r3));
    }
}
