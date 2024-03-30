package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.EOFException;
import java.io.InputStream;

/* renamed from: X.6Rp  reason: invalid class name and case insensitive filesystem */
public abstract class C131976Rp {
    public static final C119755qP A00 = new C119755qP(30, 72);
    public static final C119755qP A01 = new C119755qP(48, 96);
    public static final byte[] A02 = {69, 120, 105, 102, 0};
    public static final byte[] A03 = {74, 70, 73, 70, 0};
    public static final byte[] A04 = {74, 70, 88, 88, 0};
    public static final int[] A05 = {0, 208, 209, 210, 211, 212, 213, 214, 215};

    public static void A00(InputStream inputStream, int i) {
        byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
        while (i > 0) {
            int min = Math.min(Math.min(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, i), EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            int i2 = 0;
            while (i2 < min) {
                int read = inputStream.read(bArr, i2, min - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 != -1) {
                i -= 1024;
            } else {
                throw new EOFException(AnonymousClass000.A0r("Unexpected EOF skipping ", AnonymousClass000.A0u(), i));
            }
        }
    }
}
