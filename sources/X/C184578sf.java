package X;

import java.util.ArrayList;

/* renamed from: X.8sf  reason: invalid class name and case insensitive filesystem */
public final class C184578sf extends C118095nK {
    public static final ArrayList A01 = C165567td.A0e("false", "true");
    public final String A00;

    public C184578sf(C203399nx r10) {
        C203399nx r2 = r10;
        C203399nx.A0A(r10, "screen");
        Class<String> cls = String.class;
        Long A0P = C165567td.A0P();
        Long A0Q = C165567td.A0Q();
        this.A00 = (String) C203379ns.A00.A0Z(r2, cls, A0P, A0Q, (Object) null, new String[]{"app_id"}, false);
        C203539oF.A07(r2, cls, A0P, A0Q, (Object) null, new String[]{"bloks_server_params"}, false);
        C203539oF.A07(r2, cls, A0P, A0Q, (Object) null, new String[]{"sources"}, false);
        C203379ns.A0H(r10, "is_entry_screen", A01);
        this.A00 = r10;
    }
}
