package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.6xH  reason: invalid class name and case insensitive filesystem */
public final class C147476xH implements C160487l5 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public long BGt() {
        return -1;
    }

    public int BJ9() {
        return 0;
    }

    public boolean BLi(C160487l5 r4) {
        if (!(r4 instanceof C147476xH)) {
            return false;
        }
        C147476xH r42 = (C147476xH) r4;
        if (AnonymousClass14B.A0G(this.A02, r42.A02) && this.A03 == r42.A03 && this.A01 == r42.A01 && this.A00 == r42.A00) {
            return true;
        }
        return false;
    }

    public C147476xH(int i, int i2, String str, boolean z) {
        this.A02 = str;
        this.A03 = z;
        this.A00 = i;
        this.A01 = i2;
    }

    public /* synthetic */ Jid BDD() {
        return null;
    }
}
