package X;

import android.net.Uri;

/* renamed from: X.5gV  reason: invalid class name and case insensitive filesystem */
public abstract class C114015gV {
    public static final Uri A00;
    public static final Uri A01;
    public static final Uri A02;
    public static final String A03;

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("com.whatsapp");
        String A0q = AnonymousClass000.A0q(".provider.migrate.ios", A0u);
        A03 = A0q;
        Uri build = new Uri.Builder().scheme("content").authority(A0q).build();
        A00 = build;
        A02 = Uri.withAppendedPath(build, "files");
        A01 = Uri.withAppendedPath(build, "file");
    }
}
