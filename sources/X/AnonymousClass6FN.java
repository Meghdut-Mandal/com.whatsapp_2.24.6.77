package X;

import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: X.6FN  reason: invalid class name */
public abstract class AnonymousClass6FN {
    public final byte[] A00;
    public final byte[] A01;

    public C100094uS A00() {
        C99934uC r1;
        if (this instanceof C102124yp) {
            r1 = ((C102124yp) this).A00;
        } else if (!(this instanceof C102114yo)) {
            return null;
        } else {
            r1 = ((C102114yo) this).A00;
        }
        if ((r1.bitField0_ & 8) == 0) {
            return null;
        }
        C100094uS r0 = r1.backupMetadata_;
        if (r0 == null) {
            return C100094uS.DEFAULT_INSTANCE;
        }
        return r0;
    }

    public void A01(OutputStream outputStream) {
        C99934uC r0;
        if (this instanceof C102114yo) {
            r0 = ((C102114yo) this).A00;
        } else {
            C102134yq r1 = (C102134yq) this;
            if (r1 instanceof C102124yp) {
                r0 = ((C102124yp) r1).A00;
            } else {
                C1264263x r6 = r1.A00;
                int i = 0;
                byte[][] bArr = {AnonymousClass6YO.A00, new byte[]{Byte.parseByte(r6.A00)}, r6.A04, r6.A02, r6.A01};
                do {
                    byte[] bArr2 = bArr[i];
                    Arrays.toString(bArr2);
                    outputStream.write(bArr2);
                    i++;
                } while (i < 5);
                return;
            }
        }
        r0.A0m(outputStream);
    }

    public AnonymousClass6FN(byte[] bArr, byte[] bArr2) {
        this.A00 = bArr;
        this.A01 = bArr2;
    }
}
