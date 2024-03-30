package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8tJ  reason: invalid class name and case insensitive filesystem */
public final class C184978tJ extends C118095nK {
    public static final ArrayList A03 = C165567td.A0e("false", "true");
    public final C183998rj A00;
    public final String A01;
    public final List A02;

    public C184978tJ(C203399nx r5) {
        C203399nx.A0A(r5, "options");
        this.A01 = C203379ns.A07(r5, "is_available", "#elementValue", A03);
        this.A00 = (C183998rj) C203379ns.A02(r5, AKH.A00, new String[]{"product_id"});
        this.A02 = C203539oF.A08(r5, AKI.A00, new String[]{"option"}, 2);
        this.A00 = r5;
    }
}
