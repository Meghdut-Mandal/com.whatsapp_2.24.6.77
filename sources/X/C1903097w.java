package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: X.97w  reason: invalid class name and case insensitive filesystem */
public abstract class C1903097w {
    public static byte[] A00(InputStream inputStream) {
        ByteArrayOutputStream A0Q = C90524aI.A0Q();
        byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr, 0, ZipDecompressor.UNZIP_BUFFER_SIZE);
            if (read < 0) {
                return A0Q.toByteArray();
            }
            A0Q.write(bArr, 0, read);
        }
    }
}
