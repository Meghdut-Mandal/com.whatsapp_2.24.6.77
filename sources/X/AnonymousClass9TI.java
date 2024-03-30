package X;

import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.GCMParameterSpec;
import javax.net.ssl.SSLException;

/* renamed from: X.9TI  reason: invalid class name */
public abstract class AnonymousClass9TI {
    public synchronized void A01(byte[] bArr, int i, int i2, byte b) {
        C21240yt r0;
        if (bArr == null) {
            r0 = C165567td.A0E("Data cannot be null", (byte) 80);
        } else if (AnonymousClass99m.A00.contains(Byte.valueOf(b))) {
            while (i2 > 16384) {
                A00(bArr, i, 16384, b);
                i += 16384;
                i2 -= 16384;
            }
            if (i2 > 0) {
                A00(bArr, i, i2, b);
            }
        } else {
            r0 = C165567td.A0E("Invalid content type", (byte) 80);
        }
        throw r0;
    }

    public void A00(byte[] bArr, int i, int i2, byte b) {
        short s;
        byte b2 = b;
        if (this instanceof AnonymousClass8fC) {
            AnonymousClass8fC r5 = (AnonymousClass8fC) this;
            try {
                ByteBuffer allocate = ByteBuffer.allocate(i2 + 5);
                allocate.put(b2);
                if (b2 != 22 || r5.A01) {
                    Set set = AnonymousClass9BG.A03;
                    s = 771;
                } else {
                    r5.A01 = true;
                    Set set2 = AnonymousClass9BG.A03;
                    s = 769;
                }
                allocate.putShort(s);
                C203439o1.A05(i2, allocate);
                allocate.put(bArr, i, i2);
                r5.A00.write(allocate.array());
            } catch (SocketException | SocketTimeoutException e) {
                throw new C21240yt(new SSLException(e), (byte) 80, true);
            } catch (IOException e2) {
                throw C165577te.A0W(e2);
            }
        } else {
            AnonymousClass8fD r7 = (AnonymousClass8fD) this;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
            ByteBuffer allocate2 = ByteBuffer.allocate(copyOfRange.length + 1);
            allocate2.put(copyOfRange);
            allocate2.put(b2);
            allocate2.put(new byte[0]);
            byte[] array = allocate2.array();
            ByteBuffer allocate3 = ByteBuffer.allocate(5);
            allocate3.put((byte) 23);
            Set set3 = AnonymousClass9BG.A03;
            allocate3.putShort(771);
            int length = array.length;
            C22822AwX awX = r7.A01;
            synchronized (C21290yy.class) {
                if (C21290yy.A00 == null) {
                    C21290yy.A00 = new C21290yy();
                }
            }
            C203439o1.A05(length + 16, allocate3);
            long j = r7.A00;
            byte[] array2 = allocate3.array();
            C21223ADf aDf = (C21223ADf) awX;
            try {
                aDf.A00.init(1, aDf.A01, new GCMParameterSpec(128, C21222ADe.A00(aDf.A02, j)));
                aDf.A00.updateAAD(array2);
                byte[] doFinal = aDf.A00.doFinal(array, 0, length);
                r7.A00++;
                try {
                    ByteBuffer allocate4 = ByteBuffer.allocate(doFinal.length + 5);
                    allocate4.put(allocate3.array());
                    allocate4.put(doFinal);
                    r7.A02.write(allocate4.array());
                } catch (SocketException | SocketTimeoutException e3) {
                    throw new C21240yt(new SSLException(e3), (byte) 80, true);
                } catch (IOException e4) {
                    throw C165577te.A0W(e4);
                }
            } catch (BadPaddingException e5) {
                throw C165577te.A0V("Bad padding", e5, (byte) 80);
            } catch (IllegalBlockSizeException e6) {
                throw C165577te.A0V("Illegal block size ", e6, (byte) 80);
            } catch (InvalidAlgorithmParameterException e7) {
                throw C165577te.A0V("Invalid Algorithm Params", e7, (byte) 80);
            } catch (InvalidKeyException e8) {
                throw C165577te.A0V(" Invalid Key", e8, (byte) 80);
            }
        }
    }
}
