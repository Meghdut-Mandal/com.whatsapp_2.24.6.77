package X;

import java.util.ArrayList;

/* renamed from: X.5PW  reason: invalid class name */
public final class AnonymousClass5PW extends C118095nK {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"dark", "light"});

    public AnonymousClass5PW(C203399nx r11) {
        C203399nx r3 = r11;
        C203399nx.A0A(r11, "theme");
        Class<String> cls = String.class;
        Long A0Y = C90474aD.A0Y();
        C203379ns.A03(r3, cls, A0Y, 10L, (Object) null, new String[]{"background", "#elementValue"}, false);
        C203379ns.A03(r3, cls, A0Y, 10L, (Object) null, new String[]{"primary_text", "#elementValue"}, false);
        C203379ns.A03(r3, cls, A0Y, 10L, (Object) null, new String[]{"secondary_text", "#elementValue"}, false);
        C203379ns.A0A(r11, A00, new String[]{"mode"});
        this.A00 = r11;
    }
}
