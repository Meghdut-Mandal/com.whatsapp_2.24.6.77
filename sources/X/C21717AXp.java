package X;

import java.util.Enumeration;
import java.util.Iterator;
import javax.net.ssl.SSLSession;

/* renamed from: X.AXp  reason: case insensitive filesystem */
public class C21717AXp implements Enumeration {
    public SSLSession A00;
    public final /* synthetic */ C21230ys A01;
    public final /* synthetic */ Iterator A02;

    public C21717AXp(C21230ys r1, Iterator it) {
        this.A01 = r1;
        this.A02 = it;
    }

    public boolean hasMoreElements() {
        SSLSession sSLSession;
        if (this.A00 != null) {
            return true;
        }
        do {
            Iterator it = this.A02;
            if (it.hasNext()) {
                sSLSession = (SSLSession) it.next();
            } else {
                this.A00 = null;
                return false;
            }
        } while (!sSLSession.isValid());
        this.A00 = sSLSession;
        return true;
    }

    public /* bridge */ /* synthetic */ Object nextElement() {
        if (hasMoreElements()) {
            byte[] id = this.A00.getId();
            this.A00 = null;
            return id;
        }
        throw C165617ti.A0e();
    }
}
