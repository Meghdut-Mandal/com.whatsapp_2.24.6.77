package X;

import java.io.File;

/* renamed from: X.0lS  reason: invalid class name and case insensitive filesystem */
public final class C14330lS extends C14340lT {
    public int A00;
    public boolean A01;
    public boolean A02;
    public File[] A03;
    public final /* synthetic */ C13460ju A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14330lS(File file, C13460ju r2) {
        super(file);
        this.A04 = r2;
    }

    public File A00() {
        int i;
        if (!this.A01 && this.A03 == null) {
            File[] listFiles = this.A00.listFiles();
            this.A03 = listFiles;
            if (listFiles == null) {
                this.A01 = true;
            }
        }
        File[] fileArr = this.A03;
        if (fileArr != null && (i = this.A00) < fileArr.length) {
            this.A00 = i + 1;
            return fileArr[i];
        } else if (this.A02) {
            return null;
        } else {
            this.A02 = true;
            return this.A00;
        }
    }
}
