package X;

import java.io.File;

/* renamed from: X.63X  reason: invalid class name */
public final class AnonymousClass63X {
    public final File A00;
    public final byte[] A01;
    public final long A02;
    public final long A03;

    public AnonymousClass63X(File file, byte[] bArr, long j, long j2) {
        this.A00 = file;
        this.A02 = j;
        this.A03 = j2;
        this.A01 = bArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DownloadResult{fileSize=");
        A0u.append(this.A02);
        A0u.append(", roundTripTime=");
        A0u.append(this.A03);
        return AnonymousClass000.A0s(A0u);
    }
}
