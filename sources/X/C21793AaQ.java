package X;

import java.security.cert.CertSelector;
import java.security.cert.Certificate;

/* renamed from: X.AaQ  reason: case insensitive filesystem */
public class C21793AaQ implements B6O {
    public final CertSelector A00;

    public C21793AaQ(CertSelector certSelector) {
        this.A00 = certSelector;
    }

    public Object clone() {
        return new C21793AaQ(this.A00);
    }

    public /* bridge */ /* synthetic */ boolean BPQ(Object obj) {
        return this.A00.match((Certificate) obj);
    }
}
