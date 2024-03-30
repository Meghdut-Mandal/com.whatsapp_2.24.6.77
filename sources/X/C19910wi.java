package X;

import java.io.File;

/* renamed from: X.0wi  reason: invalid class name and case insensitive filesystem */
public class C19910wi {
    public final File A00;
    public final File A01;
    public final Object A02 = new Object();

    public C19910wi(File file) {
        this.A01 = file;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".bak");
        this.A00 = new File(sb.toString());
    }
}
