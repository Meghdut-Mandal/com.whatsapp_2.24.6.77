package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* renamed from: X.6bj  reason: invalid class name and case insensitive filesystem */
public final class C134866bj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C134206af();
    public AnonymousClass6QO A00;
    public final int A01;
    public final int A02;
    public final Point A03;
    public final Rect A04;
    public final Uri A05;
    public final File A06;
    public final File A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134866bj) {
                C134866bj r5 = (C134866bj) obj;
                if (!AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A09, r5.A09) || !AnonymousClass00C.A0J(this.A0C, r5.A0C) || !AnonymousClass00C.A0J(this.A0A, r5.A0A) || !AnonymousClass00C.A0J(this.A0B, r5.A0B) || this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A04, r5.A04) || this.A0D != r5.A0D || !AnonymousClass00C.A0J(this.A03, r5.A03) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String absolutePath;
        String absolutePath2;
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeValue(this.A08);
        File file = this.A07;
        if (file == null) {
            absolutePath = null;
        } else {
            absolutePath = file.getAbsolutePath();
        }
        parcel.writeString(absolutePath);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A02);
        File file2 = this.A06;
        if (file2 == null) {
            absolutePath2 = null;
        } else {
            absolutePath2 = file2.getAbsolutePath();
        }
        parcel.writeString(absolutePath2);
        parcel.writeParcelable(this.A04, i);
        parcel.writeByte(this.A0D ? (byte) 1 : 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
    }

    public int hashCode() {
        return ((C53202qw.A00((((((((((((((((((C36391kE.A0A(this.A05) + AnonymousClass000.A0H(this.A08)) * 31) + AnonymousClass000.A0H(this.A07)) * 31) + C36341k9.A09(this.A09)) * 31) + C36341k9.A09(this.A0C)) * 31) + C36341k9.A09(this.A0A)) * 31) + C36341k9.A09(this.A0B)) * 31) + this.A02) * 31) + AnonymousClass000.A0H(this.A06)) * 31) + AnonymousClass000.A0H(this.A04)) * 31, this.A0D) + C36411kG.A09(this.A03)) * 31) + this.A01;
    }

    public C134866bj(Point point, Rect rect, Uri uri, File file, File file2, Integer num, String str, String str2, String str3, String str4, int i, int i2, boolean z) {
        this.A05 = uri;
        this.A08 = num;
        this.A07 = file;
        this.A09 = str;
        this.A0C = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A02 = i;
        this.A06 = file2;
        this.A04 = rect;
        this.A0D = z;
        this.A03 = point;
        this.A01 = i2;
        C18740tg.A06(uri);
        AnonymousClass00C.A08(uri);
        AnonymousClass6QO r0 = new AnonymousClass6QO(uri);
        this.A00 = r0;
        r0.A0G(num);
        this.A00.A0F(file);
        this.A00.A0H(str);
        this.A00.A0J(str2);
        this.A00.A0I(str3);
        AnonymousClass6QO r1 = this.A00;
        synchronized (r1) {
            r1.A0B = str4;
        }
        AnonymousClass6QO r12 = this.A00;
        synchronized (r12) {
            r12.A01 = i;
        }
        AnonymousClass6QO r13 = this.A00;
        synchronized (r13) {
            r13.A08 = file2;
        }
        AnonymousClass6QO r14 = this.A00;
        synchronized (r14) {
            r14.A05 = rect;
        }
        AnonymousClass6QO r15 = this.A00;
        synchronized (r15) {
            r15.A0E = z;
        }
        AnonymousClass6QO r16 = this.A00;
        synchronized (r16) {
            r16.A04 = point;
        }
        this.A00.A0E(i2);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MediaPreviewItemParcel(uri=");
        A0u.append(this.A05);
        A0u.append(", type=");
        A0u.append(this.A08);
        A0u.append(", file=");
        A0u.append(this.A07);
        A0u.append(", caption=");
        A0u.append(this.A09);
        A0u.append(", mentionsKey=");
        A0u.append(this.A0C);
        A0u.append(", doodle=");
        A0u.append(this.A0A);
        A0u.append(", editState=");
        A0u.append(this.A0B);
        A0u.append(", rotation=");
        A0u.append(this.A02);
        A0u.append(", cropFile=");
        A0u.append(this.A06);
        A0u.append(", cropRect=");
        A0u.append(this.A04);
        A0u.append(", isSendAsGif=");
        A0u.append(this.A0D);
        A0u.append(", trim=");
        A0u.append(this.A03);
        A0u.append(", filterId=");
        return C36321k7.A0G(A0u, this.A01);
    }
}
