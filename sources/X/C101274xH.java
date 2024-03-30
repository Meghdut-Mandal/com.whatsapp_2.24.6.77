package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Map;

/* renamed from: X.4xH  reason: invalid class name and case insensitive filesystem */
public final class C101274xH extends AnonymousClass6FF {
    public long A00;
    public final Map A01;
    public final C116505kh A02;

    public C101274xH(C116505kh r2, AnonymousClass5JT r3, Map map) {
        super((UserFlowLogger) null, r3);
        this.A02 = r2;
        this.A01 = map;
    }

    public static final long A00(AnonymousClass6SG r2, C101274xH r3) {
        int hashCode = r2.A01.hashCode();
        if (r3.A01 != null) {
            return C90474aD.A0A(hashCode, 22421767);
        }
        UserFlowLogger userFlowLogger = r3.A00;
        if (userFlowLogger != null) {
            return userFlowLogger.generateFlowId(22421767, hashCode);
        }
        throw C36381kD.A0l();
    }
}
