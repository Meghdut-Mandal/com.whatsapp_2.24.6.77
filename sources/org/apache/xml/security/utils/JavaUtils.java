package org.apache.xml.security.utils;

import X.C165577te;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.InputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JavaUtils {
    public static Log a;
    public static Class b;

    static {
        Class a2 = a("org.apache.xml.security.utils.JavaUtils");
        b = a2;
        a = LogFactory.getLog(a2.getName());
    }

    public static byte[] a(InputStream inputStream) {
        UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
        byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return unsyncByteArrayOutputStream.a();
            }
            unsyncByteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw C165577te.A0m(e);
        }
    }
}
