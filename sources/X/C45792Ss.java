package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Ss  reason: invalid class name and case insensitive filesystem */
public final class C45792Ss extends C20890yK {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Long A0B;
    public Long A0C;
    public String A0D;
    public String A0E;

    public C45792Ss() {
        super(1342, C36431kI.A0q(), 0, -1);
    }

    public void serialize(C28991Ux r3) {
        AnonymousClass00C.A0D(r3, 0);
        r3.Bpz(18, this.A0D);
        r3.Bpz(9, this.A0E);
        r3.Bpz(12, this.A00);
        r3.Bpz(4, this.A01);
        r3.Bpz(7, this.A06);
        r3.Bpz(10, this.A07);
        r3.Bpz(16, this.A02);
        r3.Bpz(5, this.A03);
        r3.Bpz(14, this.A08);
        r3.Bpz(6, this.A04);
        r3.Bpz(3, this.A05);
        r3.Bpz(8, this.A09);
        r3.Bpz(1, this.A0B);
        r3.Bpz(2, this.A0C);
        r3.Bpz(17, this.A0A);
    }

    public Map getFieldsMap() {
        LinkedHashMap A1G = C36431kI.A1G();
        A1G.put(C36331k8.A0V(C36331k8.A0S(C36331k8.A0P(C36331k8.A0M(C36331k8.A0U(C36331k8.A0R(18, this.A0D, A1G), this.A0E, A1G), this.A00, A1G), this.A01, A1G), this.A06, A1G), this.A07, A1G), (Object) null);
        C36331k8.A1Q((Object) null, A1G, 19);
        A1G.put(C36351kA.A0t(C36331k8.A0K(C36331k8.A0J(C36331k8.A0Q(C36331k8.A0L(C36331k8.A0O(C36341k9.A0a(C36331k8.A0N(C36341k9.A0b(C36401kF.A0l(16, this.A02, A1G), (Object) null, A1G), (Object) null, A1G), this.A03, A1G), this.A08, A1G), this.A04, A1G), this.A05, A1G), this.A09, A1G), this.A0B, A1G), this.A0C, A1G), this.A0A);
        return A1G;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WamRegistrationComplete {");
        C20910yM.A00(this.A0D, "appCampaignDownloadSource", A0u);
        C20910yM.A00(this.A0E, "deviceIdentifier", A0u);
        C20910yM.A00(this.A00, "registrationAllowNotifications", A0u);
        C20910yM.A00(this.A01, "registrationAttemptSkipWithNoVertical", A0u);
        C20910yM.A00(C36331k8.A0h(this.A06), "registrationContactsPermissionSource", A0u);
        C20910yM.A00(C36331k8.A0h(this.A07), "registrationGoogleDriveBackupStatus", A0u);
        C20910yM.A00(this.A02, "registrationIsWfs", A0u);
        C20910yM.A00(this.A03, "registrationProfilePictureSet", A0u);
        C20910yM.A00(C36331k8.A0h(this.A08), "registrationProfilePictureSource", A0u);
        C20910yM.A00(this.A04, "registrationProfilePictureTapped", A0u);
        C20910yM.A00(this.A05, "registrationRetryFetchingBizProfile", A0u);
        C20910yM.A00(C36331k8.A0h(this.A09), "registrationStoragePermissionSource", A0u);
        C20910yM.A00(this.A0B, "registrationT", A0u);
        C20910yM.A00(this.A0C, "registrationTForFillBusinessInfoScreen", A0u);
        return C36321k7.A0C(C36331k8.A0h(this.A0A), "registrationWfsSource", A0u);
    }
}
