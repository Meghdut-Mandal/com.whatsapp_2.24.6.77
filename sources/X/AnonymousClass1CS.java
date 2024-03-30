package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1CS  reason: invalid class name */
public class AnonymousClass1CS {
    public Cipher A00;
    public Cipher A01;
    public Cipher A02;
    public Cipher A03;
    public Cipher A04;
    public Cipher A05;
    public boolean A06;

    public static synchronized void A03(AnonymousClass1CS r2) {
        synchronized (r2) {
            if (!r2.A06) {
                r2.A03 = Cipher.getInstance("AES/GCM/NoPadding");
                r2.A00 = Cipher.getInstance("AES/GCM/NoPadding");
                r2.A04 = Cipher.getInstance("AES/GCM/NoPadding");
                r2.A01 = Cipher.getInstance("AES/GCM/NoPadding");
                r2.A05 = Cipher.getInstance("AES/GCM/NoPadding");
                r2.A02 = Cipher.getInstance("AES/GCM/NoPadding");
                r2.A06 = true;
            }
        }
    }

    public synchronized ZipInputStream A04(AnonymousClass5U6 r3, InputStream inputStream, AtomicLong atomicLong, byte[] bArr, byte[] bArr2) {
        ZipInputStream zipInputStream;
        int ordinal = r3.ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unsupported key selector ");
                        sb.append(r3);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    zipInputStream = new ZipInputStream(inputStream);
                } else if (!(bArr == null || bArr2 == null)) {
                    A03(this);
                    Cipher cipher = this.A02;
                    C18740tg.A06(cipher);
                    zipInputStream = A01(inputStream, atomicLong, cipher, bArr, bArr2);
                }
            }
            if (!(bArr == null || bArr2 == null)) {
                A03(this);
                Cipher cipher2 = this.A01;
                C18740tg.A06(cipher2);
                zipInputStream = A01(inputStream, atomicLong, cipher2, bArr, bArr2);
            }
        }
        if (!(bArr == null || bArr2 == null)) {
            A03(this);
            Cipher cipher3 = this.A00;
            C18740tg.A06(cipher3);
            zipInputStream = A01(inputStream, atomicLong, cipher3, bArr, bArr2);
        }
        zipInputStream = new ZipInputStream(inputStream);
        return zipInputStream;
    }

    public synchronized ZipOutputStream A05(AnonymousClass5U6 r3, OutputStream outputStream, byte[] bArr, byte[] bArr2) {
        ZipOutputStream zipOutputStream;
        int ordinal = r3.ordinal();
        if (ordinal == 1) {
            A03(this);
            Cipher cipher = this.A03;
            C18740tg.A06(cipher);
            zipOutputStream = new ZipOutputStream(A02(outputStream, cipher, bArr, bArr2));
        } else if (ordinal == 3) {
            A03(this);
            Cipher cipher2 = this.A04;
            C18740tg.A06(cipher2);
            zipOutputStream = new ZipOutputStream(A02(outputStream, cipher2, bArr, bArr2));
        } else if (ordinal == 4) {
            A03(this);
            Cipher cipher3 = this.A05;
            C18740tg.A06(cipher3);
            zipOutputStream = new ZipOutputStream(A02(outputStream, cipher3, bArr, bArr2));
        } else if (ordinal == 0) {
            zipOutputStream = new ZipOutputStream(outputStream);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("unsupported key selector ");
            sb.append(r3);
            throw new IllegalArgumentException(sb.toString());
        }
        return zipOutputStream;
    }

    public static InflaterInputStream A00(InputStream inputStream, AtomicLong atomicLong, Cipher cipher, byte[] bArr, byte[] bArr2) {
        cipher.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return new InflaterInputStream(new AnonymousClass79Z(inputStream, atomicLong, cipher));
    }

    public static ZipInputStream A01(InputStream inputStream, AtomicLong atomicLong, Cipher cipher, byte[] bArr, byte[] bArr2) {
        cipher.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return new ZipInputStream(new AnonymousClass79Z(inputStream, atomicLong, cipher));
    }

    public static CipherOutputStream A02(OutputStream outputStream, Cipher cipher, byte[] bArr, byte[] bArr2) {
        cipher.init(1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return new CipherOutputStream(outputStream, cipher);
    }
}
