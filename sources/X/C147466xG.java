package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.6xG  reason: invalid class name and case insensitive filesystem */
public class C147466xG implements C160487l5 {
    public final long A00;
    public final AnonymousClass141 A01;
    public final long A02;

    public int BJ9() {
        return 4;
    }

    public Jid BDD() {
        return this.A01.A0H;
    }

    public boolean BLi(C160487l5 r7) {
        if (r7 instanceof C147466xG) {
            C147466xG r72 = (C147466xG) r7;
            if (AnonymousClass00C.A0J(this.A01.A0H, r72.A01.A0H) && this.A02 == r72.A02 && this.A00 == r72.A00) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C147466xG(AnonymousClass141 r1, long j, long j2) {
        this.A00 = j;
        this.A01 = r1;
        this.A02 = j2;
    }

    public long BGt() {
        return this.A02;
    }
}
