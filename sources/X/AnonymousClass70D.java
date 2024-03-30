package X;

import java.util.Map;

/* renamed from: X.70D  reason: invalid class name */
public final class AnonymousClass70D implements C16360p7 {
    public final C108215Sq A00;
    public final AnonymousClass6PH A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final String A05;

    public AnonymousClass70D(C108215Sq r2, AnonymousClass6PH r3, String str, String str2, String str3, String str4, Map map) {
        C36331k8.A1G(str2, 3, str3);
        this.A00 = r2;
        this.A03 = str;
        this.A05 = str3;
        this.A02 = str4;
        this.A04 = map;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FcsResourceExecutionEvent: ");
        A0u.append(this.A00);
        A0u.append(" resourceId = ");
        A0u.append(this.A03);
        A0u.append(" stateName = ");
        A0u.append(this.A05);
        A0u.append(" error = ");
        return AnonymousClass000.A0o(this.A01, A0u);
    }
}
