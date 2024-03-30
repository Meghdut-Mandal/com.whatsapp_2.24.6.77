package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.A7h  reason: case insensitive filesystem */
public abstract class C21070A7h implements B63 {
    public int memoizedHashCode = 0;

    public int A0k(C23073B3d b3d) {
        int i;
        C170918Hz r4 = (C170918Hz) this;
        if (r4.A0t()) {
            if (b3d == null) {
                b3d = C165577te.A0O(r4);
            }
            i = b3d.BHM(r4);
            if (i < 0) {
                throw C90464aC.A0R("serialized size must be non-negative, was ", AnonymousClass000.A0u(), i);
            }
        } else {
            i = r4.memoizedSerializedSize & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                if (b3d == null) {
                    b3d = C165577te.A0O(r4);
                }
                int BHM = b3d.BHM(r4);
                if (BHM >= 0) {
                    r4.memoizedSerializedSize = (BHM & Integer.MAX_VALUE) | (r4.memoizedSerializedSize & Integer.MIN_VALUE);
                    return BHM;
                }
                throw C90464aC.A0R("serialized size must be non-negative, was ", AnonymousClass000.A0u(), BHM);
            }
        }
        return i;
    }

    public AnonymousClass8I5 A0l() {
        try {
            int A0k = A0k((C23073B3d) null);
            C22898AyA ayA = C21674AUx.A01;
            byte[] bArr = new byte[A0k];
            AnonymousClass8IA r0 = new AnonymousClass8IA(bArr, A0k);
            Bxe(r0);
            r0.A05();
            return new AnonymousClass8I5(bArr);
        } catch (IOException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C165567td.A1N(this, "Serializing ", A0u);
            A0u.append(" to a ");
            A0u.append("ByteString");
            throw C90524aI.A0e(AnonymousClass000.A0q(" threw an IOException (should never happen).", A0u), e);
        }
    }

    public void A0m(OutputStream outputStream) {
        int A0k = A0k((C23073B3d) null);
        boolean z = CodedOutputStream.A01;
        int A00 = C165567td.A00(A0k) + A0k;
        if (A00 > 4096) {
            A00 = ZipDecompressor.UNZIP_BUFFER_SIZE;
        }
        AnonymousClass8IB r1 = new AnonymousClass8IB(outputStream, A00);
        r1.A08(A0k);
        Bxe(r1);
        if (r1.A00 > 0) {
            AnonymousClass8IB.A03(r1);
        }
    }

    public void A0n(OutputStream outputStream) {
        int A0k = A0k((C23073B3d) null);
        if (A0k > 4096) {
            A0k = ZipDecompressor.UNZIP_BUFFER_SIZE;
        }
        AnonymousClass8IB r1 = new AnonymousClass8IB(outputStream, A0k);
        Bxe(r1);
        if (r1.A00 > 0) {
            AnonymousClass8IB.A03(r1);
        }
    }

    public byte[] A0o() {
        try {
            int A0k = A0k((C23073B3d) null);
            byte[] bArr = new byte[A0k];
            AnonymousClass8IA r0 = new AnonymousClass8IA(bArr, A0k);
            Bxe(r0);
            r0.A05();
            return bArr;
        } catch (IOException e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            C165567td.A1N(this, "Serializing ", A0u);
            A0u.append(" to a ");
            A0u.append("byte array");
            throw C90524aI.A0e(AnonymousClass000.A0q(" threw an IOException (should never happen).", A0u), e);
        }
    }
}
