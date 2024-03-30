package X;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: X.120  reason: invalid class name */
public abstract class AnonymousClass120 implements C219411z {
    public byte[] A09(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        A07(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }

    public AnonymousClass121 Bve() {
        return (AnonymousClass121) this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C219411z)) {
            return false;
        }
        return Bve().A0G(((C219411z) obj).Bve());
    }

    public int hashCode() {
        return Bve().hashCode();
    }

    public void A07(OutputStream outputStream, String str) {
        if (this instanceof AnonymousClass121) {
            C200179gm.A00(outputStream, str).A03((AnonymousClass121) this, true);
            return;
        }
        C200179gm.A00(outputStream, str).A03(Bve(), true);
    }

    public byte[] A08() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this instanceof AnonymousClass121) {
            new C200179gm(byteArrayOutputStream).A03((AnonymousClass121) this, true);
        } else {
            new C200179gm(byteArrayOutputStream).A03(Bve(), true);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
