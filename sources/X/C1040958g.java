package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.58g  reason: invalid class name and case insensitive filesystem */
public final class C1040958g extends C20890yK {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;

    public C1040958g() {
        super(2208, new C18950u5(1, 20, 1000, false), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(7, this.A00);
        r3.Bpz(3, this.A01);
        r3.Bpz(14, this.A02);
        r3.Bpz(13, this.A03);
        r3.Bpz(12, this.A04);
        r3.Bpz(10, this.A05);
        r3.Bpz(9, this.A06);
        r3.Bpz(11, this.A07);
        r3.Bpz(8, this.A08);
        r3.Bpz(6, this.A09);
        r3.Bpz(5, this.A0A);
        r3.Bpz(4, this.A0B);
        r3.Bpz(2, this.A0C);
        r3.Bpz(1, this.A0D);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0J(C36331k8.A0K(C36331k8.A0M(C36331k8.A0N(C36331k8.A0O(C36331k8.A0Q(C36331k8.A0T(C36331k8.A0R(C36331k8.A0S(C36331k8.A0U(C36331k8.A0V(C36341k9.A0a(C36331k8.A0L(C36401kF.A0h(), this.A00, A1G), this.A01, A1G), this.A02, A1G), this.A03, A1G), this.A04, A1G), this.A05, A1G), this.A06, A1G), this.A07, A1G), this.A08, A1G), this.A09, A1G), this.A0A, A1G), this.A0B, A1G), this.A0C, A1G), this.A0D);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamAndroidDiskFootprintEvent {");
        C20910yM.A00(this.A00, "chatDatabaseSize", A0u);
        C20910yM.A00(this.A01, "chatUsageSize", A0u);
        C20910yM.A00(this.A02, "externalBackupsSize", A0u);
        C20910yM.A00(this.A03, "externalDatabasesSize", A0u);
        C20910yM.A00(this.A04, "externalMediaSize", A0u);
        C20910yM.A00(this.A05, "externalStorageAvailSize", A0u);
        C20910yM.A00(this.A06, "externalStorageTotalSize", A0u);
        C20910yM.A00(this.A07, "externalWhatsappFolderSize", A0u);
        C20910yM.A00(this.A08, "internalCachedirSize", A0u);
        C20910yM.A00(this.A09, "internalDatabasesSize", A0u);
        C20910yM.A00(this.A0A, "internalFilesdirSize", A0u);
        C20910yM.A00(this.A0B, "internalWhatsappFolderSize", A0u);
        C20910yM.A00(this.A0C, "storageAvailSize", A0u);
        return C36321k7.A0C(this.A0D, "storageTotalSize", A0u);
    }
}
