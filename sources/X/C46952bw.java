package X;

import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.2bw  reason: invalid class name and case insensitive filesystem */
public class C46952bw extends AnonymousClass2bU implements AnonymousClass4RU {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public UserJid A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public BigDecimal A0A;

    public C46952bw(C65013Qj r10, C64933Qa r11, C46952bw r12, long j) {
        super(r10, r11, r12, r12.A1I, j, true);
        this.A07 = r12.A07;
        this.A08 = r12.A08;
        this.A00 = r12.A00;
        this.A02 = r12.A02;
        this.A03 = r12.A03;
        this.A06 = r12.A06;
        this.A04 = r12.A04;
        this.A09 = r12.A09;
        this.A05 = r12.A05;
        this.A0A = r12.A0A;
        this.A01 = r12.A01;
    }

    public void A1j(byte[] bArr, boolean z) {
        if (bArr.length > 0) {
            this.A02 = 1;
            if (A0V() != null) {
                super.A1D(bArr, z);
            }
        }
    }

    public AnonymousClass3T1 B32(C64933Qa r7) {
        long j = this.A0I;
        return new C46952bw(this.A01, r7, this, j);
    }

    public C46952bw(C64933Qa r2, long j) {
        super(r2, 44, j);
    }
}
