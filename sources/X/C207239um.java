package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9um  reason: invalid class name and case insensitive filesystem */
public final class C207239um implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(0);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Uri A04;
    public Uri A05;
    public C187698yO A06;
    public Integer A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public Map A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R = false;
    public byte[] A0S;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        Uri uri;
        Uri uri2;
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C207239um)) {
            return false;
        }
        C207239um r4 = (C207239um) obj;
        if (this.A07 == r4.A07 && (((uri = this.A05) == (uri2 = r4.A05) || (uri != null && uri.equals(uri2))) && ((str = this.A0H) == (str2 = r4.A0H) || (str != null && str.equals(str2))))) {
            C187698yO r1 = this.A06;
            C187698yO r0 = r4.A06;
            if (r1 != r0) {
                return r1 != null && r1.equals(r0);
            }
            return true;
        }
    }

    public static C207239um A00(Uri uri, Uri uri2, String str, String str2, String str3, Map map) {
        return new C207239um(uri, uri2, C187698yO.GENERAL, C023109s.A0C, str, str2, str3, "UNKNOWN", map, false, false);
    }

    public boolean A01() {
        String str = this.A0G;
        if (str != null) {
            return str.startsWith("av01");
        }
        String str2 = this.A0A;
        if (str2 == null || !str2.contains("codecs=\"av01")) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A07;
        int i = 0;
        int hashCode = (((C1895794j.A00(num).hashCode() + num.intValue()) * 31) + C165577te.A06(this.A0H)) * 31;
        Uri uri = this.A05;
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A05, 0);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A04, 0);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeString(C1895794j.A00(this.A07));
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A0M ? (byte) 1 : 0);
        parcel.writeByte(this.A0Q ? (byte) 1 : 0);
        parcel.writeString(this.A0F);
        Map map = this.A0I;
        parcel.writeInt(map.size());
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            parcel.writeString(C90494aF.A0f(A11));
            parcel.writeString(C90514aH.A10(A11));
        }
        parcel.writeByte(this.A0O ? (byte) 1 : 0);
        parcel.writeByte(this.A0P ? (byte) 1 : 0);
        parcel.writeByte(this.A0J ? (byte) 1 : 0);
        parcel.writeByte(this.A0N ? (byte) 1 : 0);
        parcel.writeString(this.A0E);
        parcel.writeByte(this.A0L ? (byte) 1 : 0);
        C36391kE.A1E(parcel, this.A06);
        parcel.writeByte(this.A0K ? (byte) 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A09);
        parcel.writeByteArray(this.A0S);
        parcel.writeByte(this.A0R ? (byte) 1 : 0);
    }

    public C207239um(Parcel parcel) {
        Integer num;
        boolean z = false;
        ClassLoader classLoader = C207239um.class.getClassLoader();
        this.A05 = (Uri) parcel.readParcelable(classLoader);
        this.A0H = parcel.readString();
        this.A0A = parcel.readString();
        this.A0G = parcel.readString();
        this.A04 = (Uri) parcel.readParcelable(classLoader);
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A0D = parcel.readString();
        String readString = parcel.readString();
        if (readString.equals("DASH_VOD")) {
            num = C023109s.A00;
        } else if (readString.equals("DASH_LIVE")) {
            num = C023109s.A01;
        } else if (readString.equals("PROGRESSIVE")) {
            num = C023109s.A0C;
        } else if (readString.equals("HLS")) {
            num = C023109s.A0G;
        } else if (readString.equals("BYTEARRAY")) {
            num = C023109s.A0R;
        } else {
            throw AnonymousClass001.A08(readString);
        }
        this.A07 = num;
        this.A02 = parcel.readLong();
        this.A03 = parcel.readLong();
        this.A01 = parcel.readInt();
        this.A0M = AnonymousClass000.A1S(parcel.readByte(), 1);
        this.A0Q = C165567td.A1Z(parcel);
        this.A0F = parcel.readString();
        int readInt = parcel.readInt();
        this.A0I = AnonymousClass001.A0J();
        for (int i = 0; i < readInt; i++) {
            this.A0I.put(parcel.readString(), parcel.readString());
        }
        this.A0O = C165567td.A1Z(parcel);
        this.A0P = C165567td.A1Z(parcel);
        this.A0J = C165567td.A1Z(parcel);
        this.A0N = C165567td.A1Z(parcel);
        this.A0E = parcel.readString();
        this.A0L = C165567td.A1Z(parcel);
        this.A06 = C187698yO.valueOf(parcel.readString());
        this.A0K = C165567td.A1Z(parcel);
        this.A08 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A09 = parcel.readString();
        this.A0S = parcel.createByteArray();
        this.A0R = parcel.readByte() == 1 ? true : z;
    }

    public String toString() {
        String str;
        Object valueOf;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Type: ");
        Integer num = this.A07;
        if (num != null) {
            str = C1895794j.A00(num);
        } else {
            str = "null";
        }
        A0u.append(str);
        String str2 = this.A0H;
        if (str2 != null) {
            A0u.append("\n\tId: ");
            A0u.append(str2);
        }
        Uri uri = this.A05;
        if (uri != null) {
            A0u.append("\n\tUri: ");
            A0u.append(uri);
        }
        String str3 = this.A0B;
        if (str3 != null) {
            A0u.append("\n\tOrigin: ");
            A0u.append(str3);
        }
        String str4 = this.A0C;
        if (str4 != null) {
            A0u.append("\n\tSubOrigin: ");
            A0u.append(str4);
        }
        String str5 = this.A0D;
        if (str5 != null) {
            A0u.append("\n\tPrefetchOrigin: ");
            A0u.append(str5);
        }
        A0u.append("\n\tDashMPD: ");
        String str6 = this.A0A;
        if (str6 == null) {
            valueOf = "NULL";
        } else {
            valueOf = Integer.valueOf(str6.length());
        }
        A0u.append(valueOf);
        String str7 = this.A0G;
        if (str7 != null) {
            A0u.append("\n\tCodec: ");
            A0u.append(str7);
        }
        Uri uri2 = this.A04;
        if (uri2 != null) {
            A0u.append("\n\tSubtitle: ");
            A0u.append(uri2);
        }
        A0u.append("\n\tliveLatency: ");
        A0u.append(this.A02);
        A0u.append("\n\tliveLatencyTolerance: ");
        A0u.append(this.A03);
        A0u.append("\n\tisSpherical: ");
        A0u.append(this.A0O);
        A0u.append("\n\tisSponsored: ");
        A0u.append(this.A0P);
        A0u.append("\n\tisAdBreak: ");
        A0u.append(this.A0J);
        A0u.append("\n\tisLiveTraceEnabled: ");
        A0u.append(this.A0N);
        A0u.append("\n\trenderMode: ");
        A0u.append(this.A0E);
        A0u.append("\n\tisBroadcast: ");
        A0u.append(this.A0L);
        A0u.append("\n\tcontentType: ");
        A0u.append(this.A06);
        A0u.append("\n\tisAudioDataListenerEnabled: ");
        A0u.append(this.A0K);
        A0u.append("\n\tliveViewerCount: ");
        A0u.append(this.A00);
        A0u.append("\n\tuseConcatenatedMediaSource: ");
        return C36421kH.A0d(A0u, this.A0R);
    }

    public C207239um(Uri uri, Uri uri2, C187698yO r9, Integer num, String str, String str2, String str3, String str4, Map map, boolean z, boolean z2) {
        this.A05 = uri;
        this.A0H = str;
        this.A0A = null;
        this.A0G = null;
        this.A04 = uri2;
        this.A0B = str2;
        this.A0C = str3;
        this.A0D = str4;
        this.A07 = num;
        this.A02 = -1;
        this.A03 = -1;
        this.A01 = -1;
        this.A0M = false;
        this.A0Q = false;
        this.A0F = null;
        this.A0I = map;
        this.A0O = z;
        this.A0P = z2;
        this.A0J = false;
        this.A0N = false;
        this.A0K = false;
        this.A0E = "AUDIO_VIDEO";
        this.A0L = false;
        this.A06 = r9;
        this.A08 = null;
        this.A00 = -1;
        this.A09 = null;
        this.A0S = null;
    }

    public C207239um() {
    }
}
