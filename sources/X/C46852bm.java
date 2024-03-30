package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.2bm  reason: invalid class name and case insensitive filesystem */
public class C46852bm extends C46882bp implements AnonymousClass4RU {
    public int A00;
    public UserJid A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public BigDecimal A0A;
    public BigDecimal A0B;

    public C46852bm A1j(C65013Qj r9, C64933Qa r10, long j, boolean z) {
        C65013Qj r2 = r9;
        C64933Qa r3 = r10;
        long j2 = j;
        if (this instanceof AnonymousClass2c6) {
            AnonymousClass2c6 r4 = (AnonymousClass2c6) this;
            C18740tg.A06(r9);
            AnonymousClass00C.A0B(r9);
            C46852bm r1 = new AnonymousClass2c6(r2, r3, r4, j2, false);
            if (C203369nr.A07(r4)) {
                r1 = new C46852bm(r2, r3, r4, j2, false);
            }
            if (!z) {
                r1.A02 = null;
            }
            return r1;
        }
        C18740tg.A06(r9);
        C46852bm r12 = new C46852bm(r2, r3, this, j2, false);
        if (!z) {
            r12.A02 = null;
        }
        return r12;
    }

    public C46852bm(C64933Qa r2, int i, long j) {
        super(r2, 97, j);
    }

    public String A1k() {
        StringBuilder A0u = AnonymousClass000.A0u();
        if (!TextUtils.isEmpty(this.A09)) {
            A0u.append(this.A09);
        }
        if (!TextUtils.isEmpty(this.A02)) {
            if (!TextUtils.isEmpty(A0u)) {
                A0u.append("\n");
            }
            A0u.append(this.A02);
        }
        if (!TextUtils.isEmpty(this.A05)) {
            if (!TextUtils.isEmpty(A0u)) {
                A0u.append("\n");
            }
            A0u.append(this.A05);
        }
        return A0u.toString();
    }

    public C46852bm(C65013Qj r2, C64933Qa r3, C46852bm r4, long j, boolean z) {
        super(r2, r3, r4, j, z);
        this.A01 = r4.A01;
        this.A06 = r4.A06;
        this.A09 = r4.A09;
        this.A04 = r4.A04;
        this.A03 = r4.A03;
        this.A0A = r4.A0A;
        this.A0B = r4.A0B;
        this.A08 = r4.A08;
        this.A07 = r4.A07;
        this.A00 = r4.A00;
        this.A02 = r4.A02;
        this.A05 = r4.A05;
    }

    public C46852bm(C64933Qa r2, long j) {
        super(r2, 23, j);
    }
}
