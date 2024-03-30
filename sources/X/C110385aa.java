package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.5aa  reason: invalid class name and case insensitive filesystem */
public class C110385aa implements C160077kQ {
    public Object A00;
    public Object A01;
    public final int A02;

    public C110385aa(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void BVM(Exception exc) {
        switch (this.A02) {
            case 2:
                ((C160057kO) this.A00).BVK();
                return;
            case 3:
                ((C160227kf) this.A01).BVK();
                return;
            default:
                AnonymousClass00C.A0D(exc, 0);
                ((C160057kO) this.A00).BWk(exc);
                return;
        }
    }

    public void BWk(Exception exc) {
        if (3 - this.A02 != 0) {
            AnonymousClass00C.A0D(exc, 0);
            ((C160057kO) this.A00).BWk(exc);
            return;
        }
        AnonymousClass00C.A0D(exc, 0);
        ((C160227kf) this.A01).BWl(exc, 480);
    }

    public void BiT(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        C006302t r1;
        Object obj;
        switch (this.A02) {
            case 0:
                C36321k7.A0w(x509Certificate, x509Certificate2);
                r1 = (C006302t) this.A01;
                obj = new AnonymousClass6C5(num, publicKey, x509Certificate, x509Certificate2);
                break;
            case 1:
                C36321k7.A0w(x509Certificate, x509Certificate2);
                r1 = (C006302t) this.A01;
                obj = new AnonymousClass6CP(num, publicKey, x509Certificate, x509Certificate2);
                break;
            case 2:
                C36321k7.A0w(x509Certificate, x509Certificate2);
                r1 = (C006302t) this.A01;
                obj = new AnonymousClass6CT(num, publicKey, x509Certificate, x509Certificate2);
                break;
            default:
                ((AnonymousClass737) this.A00).run();
                return;
        }
        r1.invoke(obj);
    }
}
