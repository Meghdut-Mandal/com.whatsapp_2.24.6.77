package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.6TG  reason: invalid class name */
public class AnonymousClass6TG {
    public static final Charset A05 = Charset.forName(DefaultCrypto.UTF_8);
    public final String A00;
    public final ByteBuffer A01;
    public final C121145sf[] A02;
    public final AtomicReferenceArray A03;
    public final AtomicReferenceArray A04;

    public AnonymousClass63L A00(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A03;
        AnonymousClass63L r4 = (AnonymousClass63L) atomicReferenceArray.get(i);
        if (r4 == null) {
            int i2 = this.A02[0].A02 + (i * 16);
            ByteBuffer byteBuffer = this.A01;
            int i3 = byteBuffer.getInt(i2);
            int i4 = byteBuffer.getInt(i2 + 4);
            short s = byteBuffer.getShort(i2 + 8);
            byteBuffer.getShort(i2 + 10);
            r4 = new AnonymousClass63L(this, i3, i4, s);
            if (!atomicReferenceArray.compareAndSet(i, (Object) null, r4)) {
                return (AnonymousClass63L) atomicReferenceArray.get(i);
            }
        }
        return r4;
    }

    public Object A01(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A04;
        Object obj = atomicReferenceArray.get(i);
        if (obj != null) {
            return obj;
        }
        int i2 = this.A02[1].A02 + (i * 16);
        ByteBuffer byteBuffer = this.A01;
        int i3 = byteBuffer.getInt(i2);
        int i4 = byteBuffer.getInt(i2 + 4);
        byteBuffer.getInt(i2 + 8);
        byteBuffer.getInt();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i3);
        duplicate.limit(i3 + i4);
        byte[] bArr = new byte[duplicate.remaining()];
        duplicate.get(bArr);
        String str = new String(bArr, A05);
        if (atomicReferenceArray.compareAndSet(i, (Object) null, str)) {
            return str;
        }
        return atomicReferenceArray.get(i);
    }

    public AnonymousClass6TG(String str, ByteBuffer byteBuffer, AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2, C121145sf[] r5) {
        Objects.requireNonNull(byteBuffer);
        this.A01 = byteBuffer;
        Objects.requireNonNull(r5);
        this.A02 = r5;
        this.A00 = str;
        Objects.requireNonNull(atomicReferenceArray);
        this.A03 = atomicReferenceArray;
        Objects.requireNonNull(atomicReferenceArray2);
        this.A04 = atomicReferenceArray2;
    }
}
