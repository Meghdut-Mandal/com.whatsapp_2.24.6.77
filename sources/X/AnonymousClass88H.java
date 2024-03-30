package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.88H  reason: invalid class name */
public final class AnonymousClass88H extends C53062qe {
    public static final AnonymousClass88H A02;
    public static final AnonymousClass88H A03;
    public static final AnonymousClass88H A04;
    public static final List A05;
    public static final AnonymousClass88H A06;
    public static final AnonymousClass88H A07;
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass88H) {
                AnonymousClass88H r5 = (AnonymousClass88H) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        AnonymousClass88H r6 = new AnonymousClass88H(ZipDecompressor.UNZIP_BUFFER_SIZE, "Success");
        A04 = r6;
        AnonymousClass88H r5 = new AnonymousClass88H(4097, "Failure");
        A06 = r5;
        AnonymousClass88H r4 = new AnonymousClass88H(4098, "NotSupported");
        A07 = r4;
        AnonymousClass88H r3 = new AnonymousClass88H(4160, "InvalidIdentifier");
        A02 = r3;
        AnonymousClass88H r2 = new AnonymousClass88H(4161, "InvalidSignature");
        A03 = r2;
        AnonymousClass88H[] r1 = new AnonymousClass88H[5];
        C36321k7.A1F(r6, r5, r4, r2, r1);
        A05 = C36341k9.A0m(r3, r1, 4);
    }

    public int hashCode() {
        return C90504aG.A0B(this.A01, this.A00 * 31);
    }

    public AnonymousClass88H(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(0x");
        Object[] objArr = new Object[1];
        AnonymousClass000.A1J(objArr, this.A00);
        A0u.append(C90504aG.A0m("%04x", Arrays.copyOf(objArr, 1)));
        A0u.append(": ");
        return C36321k7.A0E(this.A01, A0u);
    }
}
