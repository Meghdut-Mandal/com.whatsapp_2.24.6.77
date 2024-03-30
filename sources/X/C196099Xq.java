package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Xq  reason: invalid class name and case insensitive filesystem */
public class C196099Xq {
    public final long A00;
    public final AnonymousClass11F A01;
    public final UserJid A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C196099Xq r5 = (C196099Xq) obj;
            if (this.A04 != r5.A04 || !this.A03.equals(r5.A03) || !this.A01.equals(r5.A01) || !C1901797e.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        C165577te.A1V(objArr, this.A04);
        objArr[1] = this.A03;
        objArr[2] = this.A01;
        return AnonymousClass000.A0M(this.A02, objArr, 3);
    }

    public C196099Xq(AnonymousClass11F r1, UserJid userJid, String str, long j, boolean z) {
        this.A00 = j;
        this.A04 = z;
        this.A03 = str;
        this.A01 = r1;
        this.A02 = userJid;
    }

    public AnonymousClass8PS A00() {
        AnonymousClass8NG A0i = AnonymousClass8SW.A0i();
        A0i.A0V(this.A03);
        boolean z = this.A04;
        A0i.A0Y(z);
        AnonymousClass11F r0 = this.A01;
        AnonymousClass8NG.A00(r0, A0i);
        if (AnonymousClass143.A0G(r0) && !z) {
            C165607th.A1C(this.A02, A0i);
        }
        AnonymousClass8NN A0p = AnonymousClass8PS.DEFAULT_INSTANCE.A0p();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.A00);
        if (seconds > 0) {
            AnonymousClass8PS r1 = (AnonymousClass8PS) C90524aI.A0H(A0p);
            r1.bitField0_ |= 2;
            r1.timestamp_ = seconds;
        }
        AnonymousClass8PS r12 = (AnonymousClass8PS) C90524aI.A0H(A0p);
        r12.key_ = AnonymousClass8NN.A0G(A0i);
        r12.bitField0_ |= 1;
        return (AnonymousClass8PS) A0p.A0R();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SyncdMessage{timestamp=");
        A0u.append(this.A00);
        A0u.append(", isFromMe=");
        A0u.append(this.A04);
        A0u.append(", messageId=");
        A0u.append(this.A03);
        A0u.append(", remoteJid=");
        A0u.append(this.A01);
        A0u.append(", participant=");
        return C90464aC.A0X(this.A02, A0u);
    }
}
