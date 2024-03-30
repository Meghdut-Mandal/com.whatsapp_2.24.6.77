package X;

import java.io.IOException;
import java.util.Enumeration;

public class AXq implements Enumeration {
    public C187118xI A00;
    public Object A01;

    public boolean hasMoreElements() {
        return AnonymousClass000.A1V(this.A01);
    }

    public Object nextElement() {
        Object obj = this.A01;
        if (obj != null) {
            try {
                this.A01 = this.A00.A06();
                return obj;
            } catch (IOException e) {
                throw new AnonymousClass92R(AnonymousClass000.A0l(e, "malformed DER construction: ", AnonymousClass000.A0u()), e);
            }
        } else {
            throw C165617ti.A0e();
        }
    }

    public AXq(byte[] bArr) {
        C187118xI r0 = new C187118xI(bArr, true);
        this.A00 = r0;
        try {
            this.A01 = r0.A06();
        } catch (IOException e) {
            throw new AnonymousClass92R(AnonymousClass000.A0l(e, "malformed DER construction: ", AnonymousClass000.A0u()), e);
        }
    }
}
