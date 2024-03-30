package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.6xE  reason: invalid class name and case insensitive filesystem */
public final class C147446xE implements C160487l5 {
    public final int A00;
    public final long A01;

    public boolean BLi(C160487l5 r6) {
        if (r6 instanceof C147446xE) {
            C147446xE r62 = (C147446xE) r6;
            if (this.A01 == r62.A01 && this.A00 == r62.A00) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C147446xE(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }

    public /* synthetic */ Jid BDD() {
        return null;
    }

    public long BGt() {
        return this.A01;
    }

    public int BJ9() {
        return this.A00;
    }
}
