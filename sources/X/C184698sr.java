package X;

import java.util.ArrayList;

/* renamed from: X.8sr  reason: invalid class name and case insensitive filesystem */
public final class C184698sr extends C118095nK {
    public static final ArrayList A01 = C36351kA.A10(new String[]{"DIRECT_UPLOAD", "FETCHED", "FETCH_FAILED", "FETCH_FALLBACK_ON_PREVIOUS", "NO_STATUS", "NOT_FETCHED", "NO_URLS", "OUTDATED", "PARTIAL_FETCH"});
    public final String A00;

    public C184698sr(C203399nx r3) {
        C203399nx.A0A(r3, "image_fetch_status");
        this.A00 = C203379ns.A08(r3, "#elementValue", A01);
        this.A00 = r3;
    }
}
