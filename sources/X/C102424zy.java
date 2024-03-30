package X;

/* renamed from: X.4zy  reason: invalid class name and case insensitive filesystem */
public class C102424zy extends C142266ob {
    public final C159977kG A00;

    public C102424zy(C159977kG r4) {
        super("wa.action.GalaxyInit", "bk.action.wa.extension.GetChatJid", "bk.action.wa.extension.GetMsgKeyId");
        this.A00 = r4;
    }

    public /* bridge */ /* synthetic */ Object B6u(AnonymousClass6MO r6, C115215iW r7, C124125xd r8) {
        C100674vP r82 = (C100674vP) r8;
        String str = r7.A00;
        short s = -1;
        switch (str.hashCode()) {
            case 763389172:
                s = C90504aG.A0y("wa.action.GalaxyInit", str);
                break;
            case 1263410359:
                if (str.equals("bk.action.wa.extension.GetChatJid")) {
                    return this.A00.B9X(C142326oh.A01(r82));
                }
                break;
            case 2066585071:
                if (str.equals("bk.action.wa.extension.GetMsgKeyId")) {
                    return this.A00.BEN(C142326oh.A01(r82));
                }
                break;
        }
        if (s == 0) {
            this.A00.Bpp(C142326oh.A01(r82), new C1260062e(r82, r6, this), C90494aF.A0k(r6.A00, 0));
        }
        return null;
    }
}
