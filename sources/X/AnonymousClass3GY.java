package X;

import java.io.File;

/* renamed from: X.3GY  reason: invalid class name */
public class AnonymousClass3GY {
    public final File A00;
    public final long A01;
    public final long A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass3GY) || !this.A00.equals(((AnonymousClass3GY) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A00);
    }

    public AnonymousClass3GY(File file) {
        this.A00 = file;
        this.A01 = file.lastModified();
        this.A02 = file.length();
        this.A03 = file.getName();
    }
}
