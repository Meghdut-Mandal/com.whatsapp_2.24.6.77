package X;

/* renamed from: X.64Q  reason: invalid class name */
public class AnonymousClass64Q {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public AnonymousClass64Q(String str, String str2, String str3, int i, int i2, int i3) {
        this.A00 = i;
        this.A04 = str;
        this.A02 = i2;
        this.A01 = i3;
        this.A05 = str2;
        this.A03 = str3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamsysMMSUploadRequest{mediaType=");
        A0u.append(this.A00);
        A0u.append(", filePath='");
        char A002 = C90484aE.A00(this.A04, A0u);
        A0u.append(", uploadType=");
        A0u.append(this.A02);
        A0u.append(", uploadOptions=");
        A0u.append(this.A01);
        A0u.append(", transferOptions=");
        A0u.append(7);
        A0u.append(", loggingId='");
        A0u.append(this.A05);
        A0u.append(A002);
        A0u.append(", connBlockJSONStr='");
        A0u.append(this.A03);
        A0u.append(A002);
        return AnonymousClass000.A0s(A0u);
    }
}
