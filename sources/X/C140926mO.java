package X;

import android.content.Context;
import java.io.File;
import java.util.Comparator;

/* renamed from: X.6mO  reason: invalid class name and case insensitive filesystem */
public class C140926mO implements C157887eq, C157897er {
    public C118635oU A00;
    public C157887eq A01;
    public Comparator A02;

    public C157877ep B3b(C125255za r2) {
        return this.A01.B3b(r2);
    }

    public C140926mO(Context context, C157887eq r4) {
        this.A01 = r4;
        this.A00 = new C118635oU(context);
        this.A02 = new C163897qw(this, 7);
    }

    public File BnH(AnonymousClass6MU r1, File file) {
        C109565Yb.A00(this, r1, file);
        return file;
    }

    public C140926mO() {
    }
}
