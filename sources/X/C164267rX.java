package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.7rX  reason: invalid class name and case insensitive filesystem */
public class C164267rX implements FilenameFilter {
    public String A00;
    public final int A01;

    public C164267rX(String str, int i) {
        this.A01 = i;
        this.A00 = str;
    }

    public final boolean accept(File file, String str) {
        int i = this.A01;
        String str2 = this.A00;
        if (i != 0) {
            return str.endsWith(str2);
        }
        return str.startsWith(str2);
    }
}
