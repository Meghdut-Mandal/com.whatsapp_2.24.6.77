package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.9uf  reason: invalid class name and case insensitive filesystem */
public final class C207169uf implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(49);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public B5W A0A;
    public AnonymousClass5RZ A0B;
    public C206849u6 A0C;
    public C207239um A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final float A0N;
    public final String A0O;
    public final String A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.A0D.writeToParcel(parcel, i);
        parcel.writeString(this.A0F);
        parcel.writeLong(this.A07);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A05);
        parcel.writeString(this.A0G);
        C36391kE.A1E(parcel, this.A0B);
        parcel.writeString(A00(this.A0E));
        this.A0C.writeToParcel(parcel, i);
        parcel.writeLong(this.A09);
        parcel.writeByte(this.A0I ? (byte) 1 : 0);
        parcel.writeByte(this.A0K ? (byte) 1 : 0);
        parcel.writeByte(this.A0M ? (byte) 1 : 0);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0L ? (byte) 1 : 0);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0O);
        parcel.writeFloat(this.A0N);
        parcel.writeByte(this.A0S ? (byte) 1 : 0);
        parcel.writeByte(this.A0R ? (byte) 1 : 0);
        parcel.writeByte(this.A0J ? (byte) 1 : 0);
        parcel.writeByte(this.A0Q ? (byte) 1 : 0);
    }

    public C207169uf(Parcel parcel) {
        Integer num;
        this.A0D = (C207239um) C207239um.CREATOR.createFromParcel(parcel);
        this.A0F = parcel.readString();
        this.A07 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0H = parcel.readString();
        this.A05 = parcel.readInt();
        this.A0G = parcel.readString();
        this.A0B = AnonymousClass5RZ.valueOf(parcel.readString());
        String readString = parcel.readString();
        if (readString.equals("Unspecified")) {
            num = C023109s.A00;
        } else if (readString.equals("Front")) {
            num = C023109s.A01;
        } else if (readString.equals("Back")) {
            num = C023109s.A0C;
        } else if (readString.equals("LowPriority")) {
            num = C023109s.A0G;
        } else if (readString.equals("Urgent")) {
            num = C023109s.A0R;
        } else if (readString.equals("Urgent_front")) {
            num = C023109s.A0S;
        } else if (readString.equals("Urgent_wth_h3_p3")) {
            num = C023109s.A0V;
        } else if (readString.equals("Urgent_front_wth_h3_p3")) {
            num = C023109s.A0W;
        } else if (readString.equals("Urgent_front_wth_h3_p0")) {
            num = C023109s.A0X;
        } else {
            throw AnonymousClass001.A08(readString);
        }
        this.A0E = num;
        this.A0C = (C206849u6) C206849u6.CREATOR.createFromParcel(parcel);
        this.A09 = parcel.readLong();
        boolean z = true;
        this.A0I = AnonymousClass000.A1P(parcel.readByte());
        this.A0K = C165567td.A1Y(parcel);
        this.A0M = C165567td.A1Y(parcel);
        this.A08 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A0L = C165567td.A1Y(parcel);
        this.A0P = parcel.readString();
        String readString2 = parcel.readString();
        this.A0O = readString2 == null ? "" : readString2;
        this.A0N = parcel.readFloat();
        this.A0S = C165567td.A1Y(parcel);
        this.A0R = C165567td.A1Y(parcel);
        this.A0J = C165567td.A1Y(parcel);
        this.A0Q = parcel.readByte() == 0 ? false : z;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "Front";
            case 2:
                return "Back";
            case 3:
                return "LowPriority";
            case 4:
                return "Urgent";
            case 5:
                return "Urgent_front";
            case 6:
                return "Urgent_wth_h3_p3";
            case 7:
                return "Urgent_front_wth_h3_p3";
            case 8:
                return "Urgent_front_wth_h3_p0";
            default:
                return "Unspecified";
        }
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VideoPrefetchRequest");
        A0u.append("\nmCacheKey: ");
        A0u.append(this.A0F);
        A0u.append("\nmPrefetchOffset: ");
        A0u.append(this.A07);
        A0u.append("\nmPrefetchBytes: ");
        A0u.append(this.A02);
        A0u.append("\nmPrefetchSegment: ");
        A0u.append(this.A03);
        A0u.append("\nmStreamType: ");
        A0u.append(this.A04);
        A0u.append("\nmQueueBehavior: ");
        Integer num = this.A0E;
        if (num != null) {
            str = A00(num);
        } else {
            str = "null";
        }
        A0u.append(str);
        A0u.append("\nmAtomSize: ");
        A0u.append(this.A00);
        A0u.append("\nmBitRate: ");
        A0u.append(this.A01);
        A0u.append("\nmQualityLabel: ");
        A0u.append(this.A0H);
        A0u.append("\nmVideoTotalDurationMs: ");
        A0u.append(this.A05);
        A0u.append("\nmPrefetchSource: ");
        A0u.append(this.A0G);
        A0u.append("\nmVideoStatus: ");
        A0u.append(this.A0B.name());
        A0u.append("\nVideoPrefetchRequest.VideoSource");
        A0u.append("\n");
        C36351kA.A1K(this.A0D, A0u);
        A0u.append("\nmTargetContentReadyTimeMs: ");
        A0u.append(this.A09);
        A0u.append("\nmIsAudioOn: ");
        A0u.append(this.A0I);
        A0u.append("\nmShouldForceHighPriority: ");
        A0u.append(this.A0K);
        A0u.append("\nmUserOptedInLowLatency: ");
        A0u.append(this.A0M);
        A0u.append("\nmStartTimeMs: ");
        A0u.append(this.A08);
        A0u.append("\nmPrefetchDurationMs: ");
        A0u.append(this.A06);
        A0u.append("\nmUseHeroBgThread: ");
        A0u.append(this.A0L);
        A0u.append("\nmTag: ");
        A0u.append(this.A0P);
        A0u.append("\nmPrefetchingModule: ");
        A0u.append(this.A0O);
        A0u.append("\nmWatchTimePredictionSeconds: ");
        A0u.append(this.A0N);
        A0u.append("\nmIsThumbnail: ");
        A0u.append(this.A0S);
        A0u.append("\nmIsBackgroundPrefetch: ");
        A0u.append(this.A0R);
        A0u.append("\nmIsFollowUpPrefetch: ");
        A0u.append(this.A0J);
        A0u.append("\nmEnableForegroundPrefetchQualityExperimentation: ");
        return C36421kH.A0d(A0u, this.A0Q);
    }

    public C207169uf(B5W b5w, AnonymousClass5RZ r7, C206849u6 r8, C207239um r9, Integer num, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A0D = r9;
        this.A0F = str;
        this.A07 = j;
        this.A02 = i;
        this.A03 = -1;
        this.A04 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A0H = str2;
        this.A05 = i5;
        this.A0G = str3;
        this.A0B = r7;
        this.A0E = num;
        this.A0C = r8;
        this.A09 = j2;
        this.A0I = true;
        this.A0K = z;
        this.A0M = false;
        this.A08 = j3;
        this.A06 = j4;
        this.A0L = z2;
        this.A0P = str4;
        this.A0O = str5;
        this.A0N = -1.0f;
        this.A0S = z3;
        this.A0R = z4;
        this.A0J = false;
        this.A0Q = z5;
        this.A0A = b5w;
    }
}
