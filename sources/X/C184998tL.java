package X;

import java.util.ArrayList;

/* renamed from: X.8tL  reason: invalid class name and case insensitive filesystem */
public final class C184998tL extends C118095nK {
    public static final ArrayList A04 = C165567td.A0e("ACTIVE", "INACTIVE");
    public final C184038rn A00;
    public final C184908tC A01;
    public final String A02;
    public final C203399nx A03;

    public C184998tL(C203399nx r11) {
        Object obj;
        Object obj2;
        C203399nx.A0A(r11, "account");
        C203539oF.A07(r11, String.class, C90474aD.A0Y(), C165577te.A0a(), (Object) null, new String[]{"merchant", "gateway_name"}, false);
        this.A02 = C203379ns.A09(r11, A04, new String[]{"merchant", "status"});
        AJV ajv = AJV.A00;
        String[] strArr = {"merchant"};
        AnonymousClass00C.A0D(r11, 0);
        try {
            obj = C203539oF.A06(r11, ajv, strArr);
        } catch (C235919b unused) {
            obj = null;
        }
        this.A00 = (C184038rn) obj;
        try {
            obj2 = C203539oF.A06(r11, AJW.A00, new String[]{"merchant"});
        } catch (C235919b unused2) {
            obj2 = null;
        }
        this.A01 = (C184908tC) obj2;
        this.A03 = (C203399nx) C203539oF.A05(r11, AJX.A00, C165607th.A1b(r11, this, "merchant"));
    }
}
