package X;

import java.security.cert.CertSelector;
import java.security.cert.PKIXParameters;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9dA  reason: invalid class name and case insensitive filesystem */
public class C198259dA {
    public int A00;
    public List A01;
    public List A02;
    public Map A03;
    public Map A04;
    public Set A05;
    public C21793AaQ A06;
    public boolean A07;
    public boolean A08;
    public final PKIXParameters A09;
    public final Date A0A;
    public final Date A0B;

    public static void A00(C198259dA r1) {
        r1.A02 = new ArrayList();
        r1.A04 = new HashMap();
        r1.A01 = new ArrayList();
        r1.A03 = new HashMap();
        r1.A00 = 0;
        r1.A08 = false;
    }

    public C198259dA(AXM axm) {
        A00(this);
        this.A09 = axm.A01;
        this.A0B = axm.A03;
        this.A0A = axm.A02;
        this.A06 = axm.A09;
        this.A02 = C36441kJ.A15(axm.A05);
        this.A04 = new HashMap(axm.A07);
        this.A01 = C36441kJ.A15(axm.A04);
        this.A03 = new HashMap(axm.A06);
        this.A08 = axm.A0B;
        this.A00 = axm.A00;
        this.A07 = axm.A0A;
        this.A05 = axm.A08;
    }

    public C198259dA(PKIXParameters pKIXParameters) {
        A00(this);
        this.A09 = (PKIXParameters) pKIXParameters.clone();
        CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
        if (targetCertConstraints != null) {
            this.A06 = new C21793AaQ(new C192159Fx(targetCertConstraints).A00);
        }
        Date date = pKIXParameters.getDate();
        this.A0B = date;
        this.A0A = date == null ? new Date() : date;
        this.A07 = pKIXParameters.isRevocationEnabled();
        this.A05 = pKIXParameters.getTrustAnchors();
    }
}
