package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.3ov  reason: invalid class name and case insensitive filesystem */
public final class C76473ov implements C159657ji {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C225014r A01;
    public final /* synthetic */ AnonymousClass39F A02;
    public final /* synthetic */ C63363Jt A03;

    public C76473ov(C225014r r1, AnonymousClass39F r2, C63363Jt r3, int i) {
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
        this.A01 = r1;
    }

    public void BXS(AnonymousClass6PH r1, Map map) {
    }

    public void BiH(Map map) {
        if (map == null) {
            C45092Qa.A00(new C45092Qa(), this.A02.A04, this.A03, 5, this.A00);
            return;
        }
        Object obj = map.get("completed");
        if ((obj instanceof Boolean) && AnonymousClass000.A1X(obj)) {
            C45092Qa.A00(new C45092Qa(), this.A02.A04, this.A03, 8, this.A00);
        }
        Object obj2 = map.get("shouldReport");
        if ((obj2 instanceof Boolean) && AnonymousClass000.A1X(obj2)) {
            C20810yC r4 = this.A02.A03;
            UserJid userJid = this.A03.A02;
            C64743Pg r0 = new C64743Pg(r4, userJid, "chat", false);
            r0.A05 = false;
            r0.A08 = false;
            r0.A07 = false;
            r0.A01 = userJid;
            this.A01.Btm(r0.A01());
        }
    }
}
