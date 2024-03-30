package X;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: X.9ZW  reason: invalid class name */
public abstract class AnonymousClass9ZW {
    public static byte[] A00(byte[] bArr) {
        if (bArr != null) {
            try {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte b = wrap.get();
                byte[] bArr2 = new byte[3];
                wrap.get(bArr2);
                int A01 = C203439o1.A01(bArr2);
                byte[] bArr3 = new byte[A01];
                wrap.get(bArr3);
                if (AnonymousClass99n.A00.contains(Byte.valueOf(b)) && A01 <= 16777215) {
                    return bArr3;
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Received an invalid handshake - type ");
                A0u.append(b);
                A0u.append(" len ");
                A0u.append(A01);
                throw C165567td.A0D(A0u, (byte) 80);
            } catch (BufferUnderflowException e) {
                throw C165577te.A0V("Invalid handshake message", e, (byte) 80);
            }
        } else {
            throw C165567td.A0E("Illegal argument - handshake is null", (byte) 80);
        }
    }

    public static byte[] A01(byte[] bArr, byte b) {
        int length;
        if (!AnonymousClass99n.A00.contains(Byte.valueOf(b)) || bArr == null || (length = bArr.length) > 16777215) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Illegal arguments -  type ");
            A0u.append(b);
            A0u.append(" msg is null or bigger than");
            A0u.append(16777215);
            throw C165567td.A0D(A0u, (byte) 80);
        }
        ByteBuffer allocate = ByteBuffer.allocate(length + 4);
        allocate.put(b);
        allocate.put(C203439o1.A07(length));
        allocate.put(bArr);
        return allocate.array();
    }
}
