package X;

/* renamed from: X.3sv  reason: invalid class name and case insensitive filesystem */
public final class C78943sv implements AnonymousClass4UH {
    public final AnonymousClass3NV A00;

    public C78943sv(AnonymousClass3NV r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BOc(String str) {
        AnonymousClass00C.A0D(str, 0);
        C224714l.A01();
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append("/unique_xpost_id: ");
        String str2 = "";
        String string = AnonymousClass3NV.A00(this.A00).getString("pref_debug_session_id", str2);
        if (string != null) {
            str2 = string;
        }
        C36321k7.A1a(A0v, str2);
    }

    public /* synthetic */ void BOg(AnonymousClass37W r1) {
    }

    public /* synthetic */ void BOw(String str) {
    }
}
