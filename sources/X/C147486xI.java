package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.6xI  reason: invalid class name and case insensitive filesystem */
public final class C147486xI implements C160487l5 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final long A05;

    public int BJ9() {
        return 1;
    }

    public boolean BLi(C160487l5 r4) {
        if (r4 instanceof C147486xI) {
            C147486xI r42 = (C147486xI) r4;
            if (AnonymousClass14B.A0G(this.A02, r42.A02) && this.A00 == r42.A00 && this.A01 == r42.A01 && this.A04 == r42.A04 && this.A03 == r42.A03) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C147486xI(String str, int i, int i2, long j, boolean z, boolean z2) {
        this.A05 = j;
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
        this.A03 = z2;
    }

    public /* synthetic */ Jid BDD() {
        return null;
    }

    public long BGt() {
        return this.A05;
    }
}
