package X;

import java.io.File;

/* renamed from: X.6Li  reason: invalid class name and case insensitive filesystem */
public class C130506Li {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final File A05;
    public final String A06;
    public final String A07;

    public C130506Li(File file, int i) {
        this.A04 = i;
        this.A05 = file;
        this.A07 = null;
        this.A06 = null;
        this.A00 = -1;
        this.A01 = -1;
        this.A03 = -1;
        this.A02 = -1;
    }

    public C130506Li(C130586Lq r2, C130586Lq r3, File file, int i) {
        this.A04 = i;
        this.A05 = file;
        this.A07 = r2.A0A;
        this.A01 = r2.A00;
        this.A03 = r2.A05;
        this.A06 = r3.A0A;
        this.A00 = r3.A00;
        this.A02 = r3.A05;
    }
}
