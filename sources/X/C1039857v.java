package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.57v  reason: invalid class name and case insensitive filesystem */
public final class C1039857v extends C20890yK {
    public Boolean A00;
    public Double A01;
    public Integer A02;
    public Long A03;

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(9, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(1, this.A02);
        r3.Bpz(3, this.A03);
    }

    public C1039857v() {
        super(468, C20890yK.DEFAULT_SAMPLING_RATE, 0, -1);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        C36321k7.A1b(A1G, 7);
        A1G.put(C36331k8.A0M(C36401kF.A0i(), this.A00, A1G), this.A01);
        C36321k7.A1b(A1G, 6);
        A1G.put(C36331k8.A0K(C36331k8.A0N(C36331k8.A0L(C36361kB.A0i(), this.A02, A1G), this.A03, A1G), (Object) null, A1G), (Object) null);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamProfilePicUpload {");
        C20910yM.A00(this.A00, "profilePicIsAvatar", A0u);
        C20910yM.A00(this.A01, "profilePicSize", A0u);
        C20910yM.A00(C36331k8.A0h(this.A02), "profilePicUploadResult", A0u);
        return C36321k7.A0C(this.A03, "profilePicUploadT", A0u);
    }
}
