package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.6xJ  reason: invalid class name and case insensitive filesystem */
public class C147496xJ implements C160487l5 {
    public final long A00;
    public final AnonymousClass141 A01;
    public final C180858mX A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final Long A06;

    public int BJ9() {
        return 2;
    }

    public Jid BDD() {
        AnonymousClass141 r0 = this.A01;
        if (r0 != null) {
            return r0.A0H;
        }
        return null;
    }

    public long BGt() {
        C180858mX r0 = this.A02;
        if (r0 != null) {
            return r0.A1N;
        }
        Long l = this.A06;
        if (l != null) {
            return l.longValue();
        }
        return -1;
    }

    public boolean BLi(C160487l5 r7) {
        AnonymousClass11F r1;
        if (r7 instanceof C147496xJ) {
            C147496xJ r72 = (C147496xJ) r7;
            if (AnonymousClass14B.A0G(this.A03, r72.A03) && AnonymousClass14B.A0G(this.A04, r72.A04) && BGt() == r72.BGt() && AnonymousClass00C.A0J(BDD(), r72.BDD())) {
                AnonymousClass141 r0 = this.A01;
                AnonymousClass11F r2 = null;
                if (r0 != null) {
                    r1 = r0.A0H;
                } else {
                    r1 = null;
                }
                AnonymousClass141 r02 = r72.A01;
                if (r02 != null) {
                    r2 = r02.A0H;
                }
                if (!AnonymousClass00C.A0J(r1, r2) || !AnonymousClass00C.A0J(this.A06, r72.A06) || this.A00 != r72.A00) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public C147496xJ(AnonymousClass141 r1, C180858mX r2, Long l, String str, String str2, long j, boolean z) {
        this.A02 = r2;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A05 = z;
        this.A01 = r1;
        this.A06 = l;
    }
}
