package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xe  reason: invalid class name and case insensitive filesystem */
public final class C66753Xe implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C66513Wg();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66753Xe) {
                C66753Xe r8 = (C66753Xe) obj;
                if (!(this.A06 == r8.A06 && this.A0I == r8.A0I && this.A03 == r8.A03 && this.A09 == r8.A09 && this.A00 == r8.A00 && this.A04 == r8.A04 && this.A07 == r8.A07 && this.A0A == r8.A0A && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A05 == r8.A05 && this.A08 == r8.A08 && this.A0D == r8.A0D && this.A0B == r8.A0B && this.A0E == r8.A0E && this.A0F == r8.A0F && this.A0H == r8.A0H && this.A0C == r8.A0C && this.A0G == r8.A0G)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeInt(this.A06);
        parcel.writeLong(this.A0I);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A08);
        parcel.writeLong(this.A0D);
        parcel.writeLong(this.A0B);
        parcel.writeLong(this.A0E);
        parcel.writeLong(this.A0F);
        parcel.writeLong(this.A0H);
        parcel.writeLong(this.A0C);
        parcel.writeLong(this.A0G);
    }

    public int hashCode() {
        int i = this.A06 * 31;
        return C36341k9.A02(this.A0G, C36321k7.A00(this.A0C, C36321k7.A00(this.A0H, C36321k7.A00(this.A0F, C36321k7.A00(this.A0E, C36321k7.A00(this.A0B, C36321k7.A00(this.A0D, (((((((((((((((((((C36321k7.A00(this.A0I, i) + this.A03) * 31) + this.A09) * 31) + this.A00) * 31) + this.A04) * 31) + this.A07) * 31) + this.A0A) * 31) + this.A01) * 31) + this.A02) * 31) + this.A05) * 31) + this.A08) * 31)))))));
    }

    public C66753Xe(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.A06 = i;
        this.A0I = j;
        this.A03 = i2;
        this.A09 = i3;
        this.A00 = i4;
        this.A04 = i5;
        this.A07 = i6;
        this.A0A = i7;
        this.A01 = i8;
        this.A02 = i9;
        this.A05 = i10;
        this.A08 = i11;
        this.A0D = j2;
        this.A0B = j3;
        this.A0E = j4;
        this.A0F = j5;
        this.A0H = j6;
        this.A0C = j7;
        this.A0G = j8;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ChatMemory(numberOfMessages=");
        A0u.append(this.A06);
        A0u.append(", overallSize=");
        A0u.append(this.A0I);
        A0u.append(", numberOfGifs=");
        A0u.append(this.A03);
        A0u.append(", numberOfTexts=");
        A0u.append(this.A09);
        A0u.append(", numberOfAudios=");
        A0u.append(this.A00);
        A0u.append(", numberOfImages=");
        A0u.append(this.A04);
        A0u.append(", numberOfPushToVideos=");
        A0u.append(this.A07);
        A0u.append(", numberOfVideos=");
        A0u.append(this.A0A);
        A0u.append(", numberOfContacts=");
        A0u.append(this.A01);
        A0u.append(", numberOfDocuments=");
        A0u.append(this.A02);
        A0u.append(", numberOfLocations=");
        A0u.append(this.A05);
        A0u.append(", numberOfStickers=");
        A0u.append(this.A08);
        A0u.append(", mediaGifBytes=");
        A0u.append(this.A0D);
        A0u.append(", mediaAudioBytes=");
        A0u.append(this.A0B);
        A0u.append(", mediaImageBytes=");
        A0u.append(this.A0E);
        A0u.append(", mediaPushToVideoBytes=");
        A0u.append(this.A0F);
        A0u.append(", mediaVideoBytes=");
        A0u.append(this.A0H);
        A0u.append(", mediaDocumentBytes=");
        A0u.append(this.A0C);
        A0u.append(", mediaStickerBytes=");
        return C36331k8.A0j(A0u, this.A0G);
    }

    public C66753Xe() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }
}
