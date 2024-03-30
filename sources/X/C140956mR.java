package X;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.6mR  reason: invalid class name and case insensitive filesystem */
public class C140956mR implements C160597lG {
    public final C157957ey A00;
    public final File A01;

    public boolean BNZ(String str) {
        return false;
    }

    public Collection B8V() {
        String[] list = this.A01.list();
        if (list == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(list);
    }

    public long BNm(String str) {
        return C36441kJ.A0w(this.A01, str).lastModified();
    }

    public long BNn(String str) {
        return AnonymousClass6Qf.A00(C36441kJ.A0w(this.A01, str));
    }

    public boolean Bnd(String str) {
        return this.A00.B5E(C36441kJ.A0w(this.A01, str));
    }

    public C140956mR(C157957ey r1, File file) {
        this.A00 = r1;
        this.A01 = file;
    }
}
