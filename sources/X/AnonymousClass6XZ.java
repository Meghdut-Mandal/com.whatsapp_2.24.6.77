package X;

import android.os.CancellationSignal;
import android.util.Base64;
import com.whatsapp.R;
import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.6XZ  reason: invalid class name */
public abstract class AnonymousClass6XZ {
    public static final byte[] A00 = Base64.decode("f84Z7HXNlLvU8vledkRkLCXBWB16jaE3gyDeRPPkwtQ=", 2);
    public static final String A01;

    public static int A00(C105535Fa r6, int i, long j, long j2) {
        int i2;
        int i3;
        int i4;
        int i5 = (int) ((((double) j) * 100.0d) / ((double) j2));
        if (i != i5) {
            Iterator A0s = C36361kB.A0s(r6);
            while (A0s.hasNext()) {
                ChatTransferViewModel chatTransferViewModel = ((C146936wP) A0s.next()).A00;
                chatTransferViewModel.A00 = i5;
                if (chatTransferViewModel.A06) {
                    i2 = R.string.f12nameremoved;
                    int i6 = 50;
                    if (chatTransferViewModel.A0S.A05()) {
                        i6 = 98;
                    }
                    i4 = 100 - i6;
                    i3 = 100 - i4;
                } else {
                    i2 = R.string.f12nameremoved;
                    i3 = 50;
                    if (chatTransferViewModel.A0S.A05()) {
                        i3 = 98;
                    }
                    i4 = 0;
                }
                chatTransferViewModel.A0Y(i2, i4 + ((i5 * i3) / 100));
                if (chatTransferViewModel.A02 != 1) {
                    chatTransferViewModel.A02 = 1;
                }
            }
        }
        return i5;
    }

    public static void A06(C25711Hj r5, InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        CipherInputStream cipherInputStream;
        try {
            byte[] A0H = C18750th.A0H(16);
            Cipher A19 = C90514aH.A19();
            A19.init(1, C90494aF.A0m(bArr), new IvParameterSpec(A0H));
            cipherInputStream = new CipherInputStream(inputStream, A19);
            outputStream.write(A0H);
            if (r5 != null) {
                AnonymousClass6YY.A0D(r5, cipherInputStream, outputStream);
            } else {
                AnonymousClass6YY.A0J(cipherInputStream, outputStream);
            }
            cipherInputStream.close();
            return;
        } catch (GeneralSecurityException e) {
            throw new AnonymousClass5R7("Failed to encrypt stream", e, 1);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static AnonymousClass6TD A01(CancellationSignal cancellationSignal, InputStream inputStream) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        try {
            byte[] bArr = new byte[16];
            if (inputStream.read(bArr) != -1) {
                return new AnonymousClass6TD(ByteBuffer.wrap(bArr, 0, 4).getInt(), ByteBuffer.wrap(bArr, 4, 8).getLong(), ByteBuffer.wrap(bArr, 12, 4).getInt());
            }
            throw C90524aI.A0X("No bytes to read");
        } catch (SocketException unused) {
            throw new AnonymousClass5R7();
        }
    }

    public static void A02(CancellationSignal cancellationSignal, AnonymousClass6TD r4, OutputStream outputStream) {
        FileInputStream A0U;
        if (cancellationSignal != null) {
            try {
                cancellationSignal.throwIfCanceled();
            } catch (SocketException unused) {
                throw new AnonymousClass5R7();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putInt(r4.A01);
        allocate.putLong(4, r4.A02);
        allocate.putInt(12, r4.A00);
        outputStream.write(allocate.array());
        outputStream.flush();
        if (r4 instanceof AnonymousClass5D9) {
            AnonymousClass5D9 r42 = (AnonymousClass5D9) r4;
            A0U = C90524aI.A0U(r42.A01);
            byte[] bArr = r42.A03;
            if (bArr != null) {
                A06(r42.A00, A0U, outputStream, bArr);
            } else {
                AnonymousClass6YY.A0J(A0U, outputStream);
            }
            outputStream.flush();
            A0U.close();
            return;
        } else if (r4 instanceof AnonymousClass5D8) {
            AnonymousClass5D8 r43 = (AnonymousClass5D8) r4;
            byte[] bArr2 = r43.A03;
            if (bArr2 != null) {
                A06((C25711Hj) null, C90524aI.A0P(r43.A00), outputStream, bArr2);
            } else {
                outputStream.write(r43.A00);
            }
            outputStream.flush();
            return;
        } else {
            return;
        }
        throw th;
    }

    public static void A04(C105535Fa r3, Exception exc) {
        int i;
        if (exc instanceof AnonymousClass7h1) {
            i = ((AnonymousClass7h1) exc).BEE();
            C36321k7.A1T("fpm/TransferUtils/error code received during transfer: ", AnonymousClass000.A0u(), i);
        } else {
            Log.e("fpm/TransferUtils/failure during transfer process: ", exc);
            i = 1;
        }
        exc.getMessage();
        r3.A02(i);
    }

    public static void A05(C25711Hj r5, InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        IOException th;
        try {
            byte[] bArr2 = new byte[16];
            if (inputStream.read(bArr2) != -1) {
                Cipher A19 = C90514aH.A19();
                A19.init(2, C90494aF.A0m(bArr), new IvParameterSpec(bArr2));
                CipherOutputStream cipherOutputStream = new CipherOutputStream(outputStream, A19);
                if (r5 != null) {
                    try {
                        AnonymousClass6YY.A0D(r5, inputStream, cipherOutputStream);
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                } else {
                    AnonymousClass6YY.A0J(inputStream, cipherOutputStream);
                }
                cipherOutputStream.close();
                return;
            }
            th = C90524aI.A0X("No bytes to read");
            throw th;
        } catch (GeneralSecurityException e) {
            throw new AnonymousClass5R7("Failed to decrypt stream", e, 105);
        }
    }

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("msgstore.db.crypt");
        A01 = C36381kD.A10(A0u, AnonymousClass5U6.UNENCRYPTED.version);
    }

    public static void A03(CancellationSignal cancellationSignal, C25711Hj r2, File file, InputStream inputStream, byte[] bArr, long j) {
        FileOutputStream A0W;
        cancellationSignal.throwIfCanceled();
        try {
            AnonymousClass5RB r1 = new AnonymousClass5RB(inputStream, j);
            if (bArr != null) {
                A0W = C90524aI.A0W(file);
                A05(r2, r1, A0W, bArr);
                A0W.close();
                return;
            }
            AnonymousClass6YY.A0T(file, r1, j);
            return;
        } catch (SocketException unused) {
            throw new AnonymousClass5R7();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
