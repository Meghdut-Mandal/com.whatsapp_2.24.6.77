package X;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.0cd  reason: invalid class name and case insensitive filesystem */
public class C09600cd implements C16660ps {
    public final String A00;
    public final HashMap A01 = AnonymousClass001.A0J();

    public C09600cd(String str) {
        this.A00 = str;
    }

    public File BBp(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.A01.get(decode);
        if (file != null) {
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw AnonymousClass001.A08(AnonymousClass000.A0l(file2, "Failed to resolve canonical path for ", AnonymousClass000.A0u()));
            }
        } else {
            throw AnonymousClass001.A08(AnonymousClass000.A0l(uri, "Unable to find configured root for ", AnonymousClass000.A0u()));
        }
    }
}
