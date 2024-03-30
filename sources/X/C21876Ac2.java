package X;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.Ac2  reason: case insensitive filesystem */
public class C21876Ac2 extends X509CRLEntry {
    public C22604ArW A00;
    public C22641As7 A01;
    public volatile int A02;
    public volatile boolean A03;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21876Ac2)) {
            return super.equals(this);
        }
        C21876Ac2 ac2 = (C21876Ac2) obj;
        if (!this.A03 || !ac2.A03 || this.A02 == ac2.A02) {
            return this.A00.equals(ac2.A00);
        }
        return false;
    }

    public X500Principal getCertificateIssuer() {
        C22641As7 as7 = this.A01;
        if (as7 == null) {
            return null;
        }
        try {
            return new X500Principal(as7.A08());
        } catch (IOException unused) {
            return null;
        }
    }

    public Set getCriticalExtensionOIDs() {
        return A00(true);
    }

    public byte[] getEncoded() {
        try {
            return this.A00.A09("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public Set getNonCriticalExtensionOIDs() {
        return A00(false);
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty();
    }

    public int hashCode() {
        if (!this.A03) {
            this.A02 = super.hashCode();
            this.A03 = true;
        }
        return this.A02;
    }

    private HashSet A00(boolean z) {
        C22608Ara A0A = this.A00.A0A();
        if (A0A == null) {
            return null;
        }
        HashSet A16 = C36441kJ.A16();
        Enumeration elements = A0A.A01.elements();
        while (elements.hasMoreElements()) {
            AnonymousClass122 r1 = (AnonymousClass122) elements.nextElement();
            if (z == C22608Ara.A00(r1, A0A).A02) {
                A16.add(r1.A01);
            }
        }
        return A16;
    }

    public Date getRevocationDate() {
        return C22639As5.A00(C22656AsM.A03(this.A00.A01)).A0B();
    }

    public BigInteger getSerialNumber() {
        return new BigInteger(C22654AsK.A01(C22656AsM.A02(this.A00.A01)).A00);
    }

    public boolean hasExtensions() {
        return AnonymousClass000.A1V(this.A00.A0A());
    }

    public String toString() {
        Object obj;
        StringBuffer A0x = C165607th.A0x();
        String str = AnonymousClass11q.A00;
        A0x.append("      userCertificate: ");
        A0x.append(getSerialNumber());
        A0x.append(str);
        A0x.append("       revocationDate: ");
        A0x.append(getRevocationDate());
        A0x.append(str);
        A0x.append("       certificateIssuer: ");
        A0x.append(getCertificateIssuer());
        A0x.append(str);
        C22608Ara A0A = this.A00.A0A();
        if (A0A != null) {
            Enumeration elements = A0A.A01.elements();
            if (elements.hasMoreElements()) {
                String str2 = "   crlEntryExtensions:";
                loop0:
                while (true) {
                    A0x.append(str2);
                    while (true) {
                        A0x.append(str);
                        while (true) {
                            if (!elements.hasMoreElements()) {
                                break loop0;
                            }
                            AnonymousClass122 r6 = (AnonymousClass122) elements.nextElement();
                            C22634As0 A002 = C22608Ara.A00(r6, A0A);
                            C22659AsP asP = A002.A01;
                            if (asP != null) {
                                C187118xI A032 = C187118xI.A03(A0x, asP, A002);
                                try {
                                    if (r6.A0G(C22634As0.A0T)) {
                                        obj = C22628Aru.A00(C22652AsI.A01(A032.A06()));
                                    } else if (r6.A0G(C22634As0.A0A)) {
                                        A0x.append("Certificate issuer: ");
                                        AnonymousClass121 A06 = A032.A06();
                                        if (A06 != null) {
                                            obj = new C22631Arx(C22656AsM.A04(A06));
                                        } else {
                                            obj = null;
                                        }
                                    } else {
                                        A0x.append(r6.A01);
                                        A0x.append(" value = ");
                                        A0x.append(C196359Zi.A00(A032.A06()));
                                        A0x.append(str);
                                    }
                                    A0x.append(obj);
                                    A0x.append(str);
                                } catch (Exception unused) {
                                    A0x.append(r6.A01);
                                    A0x.append(" value = ");
                                    str2 = "*****";
                                }
                            }
                        }
                    }
                }
            }
        }
        return A0x.toString();
    }

    public C21876Ac2(C22641As7 as7, C22604ArW arW, boolean z) {
        C22634As0 A002;
        this.A00 = arW;
        C22641As7 as72 = null;
        if (z) {
            AnonymousClass122 r1 = C22634As0.A0A;
            C22608Ara A0A = arW.A0A();
            if (A0A == null || (A002 = C22608Ara.A00(r1, A0A)) == null) {
                as72 = as7;
            } else {
                try {
                    C22640As6[] A003 = C22631Arx.A00(C22634As0.A00(A002));
                    int i = 0;
                    while (true) {
                        if (i >= A003.length) {
                            break;
                        } else if (A003[i].A00 == 4) {
                            as72 = C22641As7.A01(A003[i].A01);
                            break;
                        } else {
                            i++;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        this.A01 = as72;
    }

    public byte[] getExtensionValue(String str) {
        C22634As0 as0;
        AnonymousClass122 A0f = C165617ti.A0f(str);
        C22608Ara A0A = this.A00.A0A();
        if (A0A != null) {
            as0 = C22608Ara.A00(A0f, A0A);
        } else {
            as0 = null;
        }
        if (as0 == null) {
            return null;
        }
        try {
            return as0.A01.A08();
        } catch (Exception e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            throw AnonymousClass000.A0g(C90494aF.A0c(e, "Exception encoding: ", A0u), A0u);
        }
    }
}
