package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.1Gl  reason: invalid class name and case insensitive filesystem */
public class C25471Gl implements Parcelable {
    public static final C25471Gl A04;
    public static final C25471Gl A05;
    public static final C25471Gl A06;
    public static final C25471Gl A07;
    public static final C25471Gl A08;
    public static final C25471Gl A09;
    public static final C25471Gl A0A;
    public static final C25471Gl A0B;
    public static final C25471Gl A0C;
    public static final C25471Gl A0D;
    public static final C25471Gl A0E;
    public static final C25471Gl A0F;
    public static final C25471Gl A0G;
    public static final C25471Gl A0H;
    public static final C25471Gl A0I;
    public static final C25471Gl A0J;
    public static final C25471Gl A0K;
    public static final C25471Gl A0L;
    public static final C25471Gl A0M;
    public static final C25471Gl A0N;
    public static final C25471Gl A0O;
    public static final C25471Gl A0P;
    public static final C25471Gl A0Q;
    public static final C25471Gl A0R;
    public static final C25471Gl A0S;
    public static final C25471Gl A0T;
    public static final C25471Gl A0U;
    public static final C25471Gl A0V;
    public static final C25471Gl A0W;
    public static final C25471Gl A0X;
    public static final C25471Gl A0Y;
    public static final C25471Gl A0Z;
    public static final C25471Gl A0a;
    public static final C25471Gl A0b;
    public static final C25471Gl A0c;
    public static final C25471Gl A0d;
    public static final C25471Gl A0e;
    public static final C25471Gl A0f;
    public static final C25471Gl A0g;
    public static final C25471Gl A0h;
    public static final C25471Gl A0i;
    public static final C25471Gl A0j;
    public static final C25471Gl A0k;
    public static final C25471Gl A0l;
    public static final C25471Gl A0m;
    public static final C25471Gl A0n;
    public static final C25471Gl A0o;
    public static final C25471Gl A0p;
    public static final byte[] A0q;
    public static final byte[] A0r;
    public static final byte[] A0s;
    public static final byte[] A0t;
    public static final byte[] A0u;
    public static final byte[] A0v;
    public static final byte[] A0w;
    public static final byte[] A0x;
    public static final byte[] A0y;
    public static final byte[] A0z;
    public static final byte[] A10;
    public static final byte[] A11;
    public static final byte[] A12;
    public static final byte[] A13;
    public static final byte[] A14;
    public static final byte[] A15;
    public static final byte[] A16;
    public static final Parcelable.Creator CREATOR = new C36111jm(2);
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00)});
    }

    static {
        byte[] bytes = "WhatsApp Audio Keys".getBytes();
        A0s = bytes;
        byte[] bytes2 = "WhatsApp Image Keys".getBytes();
        A0x = bytes2;
        byte[] bytes3 = "WhatsApp Image Thumbnail Keys".getBytes();
        A0y = bytes3;
        byte[] bytes4 = "WhatsApp Video Keys".getBytes();
        A14 = bytes4;
        byte[] bytes5 = "WhatsApp Video Thumbnail Keys".getBytes();
        A15 = bytes5;
        byte[] bytes6 = "WhatsApp Document Keys".getBytes();
        A0v = bytes6;
        byte[] bytes7 = "WhatsApp Document Thumbnail Keys".getBytes();
        A0w = bytes7;
        byte[] bytes8 = "WhatsApp App State Keys".getBytes();
        A10 = bytes8;
        byte[] bytes9 = "WhatsApp History Keys".getBytes();
        A11 = bytes9;
        byte[] bytes10 = "WhatsApp Link Thumbnail Keys".getBytes();
        A0z = bytes10;
        byte[] bytes11 = "waffle_hkdf_info".getBytes();
        A16 = bytes11;
        byte[] bytes12 = "WhatsApp Payment Background Keys".getBytes();
        A12 = bytes12;
        byte[] bytes13 = "PAYMENT_DOC_UPLOAD".getBytes();
        A13 = bytes13;
        byte[] bytes14 = "ads-image".getBytes();
        A0q = bytes14;
        byte[] bytes15 = "avatar-image".getBytes();
        A0t = bytes15;
        byte[] bytes16 = "biz-flows".getBytes();
        A0u = bytes16;
        byte[] bytes17 = "ads-video".getBytes();
        A0r = bytes17;
        A05 = new C25471Gl("audio", "AUD", bytes, 2);
        A0L = new C25471Gl("ptt", "PTT", bytes, 2);
        A0k = new C25471Gl("audio", "AUD", bytes, 82);
        A0D = new C25471Gl("image", "IMG", bytes2, 1);
        A0E = new C25471Gl("thumbnail-image", (String) null, bytes3, 1);
        A0l = new C25471Gl("image", "IMG", bytes2, 42);
        A0b = new C25471Gl("image", "IMG", bytes2, 23);
        A0H = new C25471Gl("image", "IMG", bytes2, 23);
        A0G = new C25471Gl("image", "IMG", bytes2, 57);
        A08 = new C25471Gl("image", "IMG", bytes2, 37);
        A0Y = new C25471Gl("image", "IMG", bytes2, 44);
        A0d = new C25471Gl("sticker", "STK", bytes2, 20);
        A0g = new C25471Gl("image", (String) null, bytes2, 25);
        A0J = new C25471Gl("kyc-id", (String) null, bytes2, 1);
        A0i = new C25471Gl("video", "VID", bytes4, 3);
        A0c = new C25471Gl("ptv", "PTV", bytes4, 81);
        A0I = new C25471Gl("video", "VID", bytes4, 3);
        A0j = new C25471Gl("thumbnail-video", (String) null, bytes5, 3);
        A0m = new C25471Gl("video", "VID", bytes4, 43);
        A04 = new C25471Gl("gif", "VID", bytes4, 13);
        A0C = new C25471Gl("thumbnail-gif", (String) null, bytes5, 13);
        A0h = new C25471Gl("video", (String) null, bytes4, 28);
        A0f = new C25471Gl("gif", (String) null, bytes4, 29);
        A0A = new C25471Gl("document", "DOC", bytes6, 9);
        A0F = new C25471Gl("document", "DOC", bytes6, 9);
        A0e = new C25471Gl("document", (String) null, bytes6, 26);
        A0B = new C25471Gl("thumbnail-document", (String) null, bytes7, 9);
        A0K = new C25471Gl("thumbnail-link", (String) null, bytes10, 0);
        A0M = new C25471Gl("md-app-state", (String) null, bytes8, 100);
        A0N = new C25471Gl("md-msg-hist", "HIST_SYNC", bytes9, 35);
        A0o = new C25471Gl("waffle-image", (String) null, bytes11, 59);
        A0p = new C25471Gl("waffle-video", (String) null, bytes11, 60);
        A0n = new C25471Gl("waffle-gif", (String) null, bytes11, 61);
        A0Z = new C25471Gl("payment-bg-image", (String) null, bytes12, 65);
        A0a = new C25471Gl("payment-br-document", (String) null, bytes13, 1);
        A0O = new C25471Gl("ads-image", (String) null, bytes14, 1);
        A0P = new C25471Gl("ads-video", (String) null, bytes17, 3);
        A09 = new C25471Gl("biz-cover-photo", "IMG", bytes2, 1);
        A0T = new C25471Gl("newsletter-image", "IMG", bytes2, 1);
        A0X = new C25471Gl("newsletter-video", "VID", bytes4, 3);
        A0W = new C25471Gl("newsletter-thumbnail-link", (String) null, bytes10, 0);
        A0U = new C25471Gl("newsletter-ptt", "PTT", bytes, 2);
        A0Q = new C25471Gl("newsletter-audio", "AUD", bytes, 2);
        A0R = new C25471Gl("newsletter-document", "DOC", bytes6, 9);
        A0S = new C25471Gl("newsletter-gif", "VID", bytes4, 13);
        A0V = new C25471Gl("newsletter-sticker", "STK", bytes2, 20);
        A06 = new C25471Gl("avatar-image", "AVATAR_IMG", bytes15, 1);
        A07 = new C25471Gl("biz-flows", (String) null, bytes16, 1);
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("MmsType{type=");
        sb.append(this.A00);
        sb.append(", origin=");
        if (this == A0L || this == A0U) {
            i = 1;
        } else {
            i = 0;
            if (this == A0J) {
                i = 6;
            }
        }
        sb.append(i);
        sb.append(", fileType=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.A00);
        if (this == A0L || this == A0U) {
            i2 = 1;
        } else {
            i2 = 0;
            if (this == A0J) {
                i2 = 6;
            }
        }
        parcel.writeInt(i2);
    }

    public C25471Gl(String str, String str2, byte[] bArr, int i) {
        this.A00 = i;
        this.A03 = bArr;
        this.A02 = str;
        this.A01 = str2;
    }
}
