package X;

import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import java.util.List;

/* renamed from: X.6E2  reason: invalid class name */
public final class AnonymousClass6E2 {
    public final int A00;
    public final ARRequestAsset$CompressionMethod A01;
    public final C108425Tl A02;
    public final AnonymousClass6B3 A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6E2) {
                AnonymousClass6E2 r5 = (AnonymousClass6E2) obj;
                if (this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A0A, r5.A0A) || !AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A09, r5.A09) || !AnonymousClass00C.A0J(this.A06, r5.A06) || this.A00 != r5.A00 || this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A0B, r5.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A082 = C36381kD.A08(this.A09, C36381kD.A08(this.A07, C36381kD.A08(this.A0A, C36381kD.A08(this.A05, C36381kD.A08(this.A08, C36381kD.A08(this.A04, C36391kE.A0A(this.A02)))))));
        return C36401kF.A02(this.A0B, C36351kA.A05(this.A03, C36351kA.A05(this.A01, (C36381kD.A08(this.A06, A082) + this.A00) * 31)));
    }

    public AnonymousClass6E2(ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod, C108425Tl r2, AnonymousClass6B3 r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i) {
        this.A02 = r2;
        this.A04 = str;
        this.A08 = str2;
        this.A05 = str3;
        this.A0A = str4;
        this.A07 = str5;
        this.A09 = str6;
        this.A06 = str7;
        this.A00 = i;
        this.A01 = aRRequestAsset$CompressionMethod;
        this.A03 = r3;
        this.A0B = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NativeMLModelAssetMetadata(name=");
        A0u.append(this.A02);
        A0u.append(", identifier=");
        A0u.append(this.A04);
        A0u.append(", cacheKey=");
        A0u.append(this.A08);
        A0u.append(", sourceContentHash=");
        A0u.append(this.A05);
        A0u.append(", md5Hash=");
        A0u.append(this.A0A);
        A0u.append(", assetHandle=");
        A0u.append(this.A07);
        A0u.append(", creationTime=");
        A0u.append(this.A09);
        A0u.append(", url=");
        A0u.append(this.A06);
        A0u.append(", fileSizeBytes=");
        A0u.append(this.A00);
        A0u.append(", compressionMethod=");
        A0u.append(this.A01);
        A0u.append(", metadata=");
        A0u.append(this.A03);
        A0u.append(", deltaCache=");
        return AnonymousClass000.A0m(this.A0B, A0u);
    }
}
