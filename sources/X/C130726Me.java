package X;

import android.util.Base64OutputStream;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.6Me  reason: invalid class name and case insensitive filesystem */
public final class C130726Me {
    public static final Map A02 = AnonymousClass001.A0J();
    public final Object A00 = C36441kJ.A11();
    public final AnonymousClass004 A01;

    public String A00() {
        String str;
        FileInputStream A0U;
        Base64OutputStream base64OutputStream;
        try {
            File file = (File) this.A01.get();
            A0U = C90524aI.A0U(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
            base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
            byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
            while (true) {
                int read = A0U.read(bArr);
                if (read != -1) {
                    base64OutputStream.write(bArr, 0, read);
                } else {
                    base64OutputStream.close();
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString(DefaultCrypto.UTF_8);
                    A0U.close();
                    base64OutputStream.close();
                    return byteArrayOutputStream2;
                }
            }
        } catch (IOException e) {
            if (e.getMessage() != null) {
                str = e.getMessage();
            } else {
                str = "description N/A";
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("[I/O error: ");
            A0u.append(str);
            return C90474aD.A0g(A0u);
        } catch (Throwable th) {
            A0U.close();
            base64OutputStream.close();
            throw th;
        }
    }

    public C130726Me(AnonymousClass004 r2) {
        this.A01 = r2;
    }
}
