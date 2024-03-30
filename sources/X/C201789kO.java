package X;

import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.9kO  reason: invalid class name and case insensitive filesystem */
public abstract class C201789kO {
    public static C22641As7 A00(Object obj) {
        if (obj instanceof X509Certificate) {
            return A01((X509Certificate) obj);
        }
        throw AnonymousClass001.A0A("getIssuer");
    }

    public static C22641As7 A01(X509Certificate x509Certificate) {
        if (x509Certificate instanceof C22843Aws) {
            C22641As7 as7 = ((C21879Ac5) ((C22843Aws) x509Certificate)).c.A03.A05;
            if (as7 != null) {
                return as7;
            }
            throw C165617ti.A0V();
        } else if (x509Certificate != null) {
            return A03(x509Certificate.getIssuerX500Principal());
        } else {
            throw C165617ti.A0V();
        }
    }

    public static C22641As7 A02(X509Certificate x509Certificate) {
        if (!(x509Certificate instanceof C22843Aws)) {
            return A03(x509Certificate.getSubjectX500Principal());
        }
        C22641As7 as7 = ((C21879Ac5) ((C22843Aws) x509Certificate)).c.A03.A06;
        if (as7 != null) {
            return as7;
        }
        throw C165617ti.A0V();
    }

    public static C22641As7 A03(X500Principal x500Principal) {
        if (x500Principal != null) {
            byte[] encoded = x500Principal.getEncoded();
            if (encoded != null) {
                C22641As7 A01 = C22641As7.A01(encoded);
                if (A01 != null) {
                    return A01;
                }
                throw C165617ti.A0V();
            }
            throw C165617ti.A0V();
        }
        throw C165617ti.A0V();
    }
}
