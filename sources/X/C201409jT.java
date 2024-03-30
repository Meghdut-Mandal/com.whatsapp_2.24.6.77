package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9jT  reason: invalid class name and case insensitive filesystem */
public class C201409jT {
    @Deprecated
    public static final C201409jT A0Q;
    public static final C201409jT A0R;
    @Deprecated
    public static final AnonymousClass7c0 CREATOR = AnonymousClass9z7.A00;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final C20070wy A0G;
    public final C20760y7 A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C201409jT r5 = (C201409jT) obj;
            if (!(this.A06 == r5.A06 && this.A05 == r5.A05 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A0A == r5.A0A && this.A09 == r5.A09 && this.A08 == r5.A08 && this.A07 == r5.A07 && this.A0P == r5.A0P && this.A0F == r5.A0F && this.A0E == r5.A0E && this.A0L.equals(r5.A0L) && this.A0D == r5.A0D && this.A0I.equals(r5.A0I) && this.A0B == r5.A0B && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A0J.equals(r5.A0J) && this.A0K.equals(r5.A0K) && this.A0C == r5.A0C && this.A00 == r5.A00 && this.A0O == r5.A0O && this.A0N == r5.A0N && this.A0M == r5.A0M && this.A0G.equals(r5.A0G) && this.A0H.equals(r5.A0H))) {
                return false;
            }
        }
        return true;
    }

    static {
        C201409jT r0 = new C201409jT(new C198339dI());
        A0R = r0;
        A0Q = r0;
    }

    public int hashCode() {
        return C36401kF.A02(this.A0H, C36351kA.A05(this.A0G, (((((((((((((((((((((((((((((((((((((((((((((((this.A06 + 31) * 31) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A0A) * 31) + this.A09) * 31) + this.A08) * 31) + this.A07) * 31) + (this.A0P ? 1 : 0)) * 31) + this.A0F) * 31) + this.A0E) * 31) + this.A0L.hashCode()) * 31) + this.A0D) * 31) + this.A0I.hashCode()) * 31) + this.A0B) * 31) + this.A02) * 31) + this.A01) * 31) + this.A0J.hashCode()) * 31) + this.A0K.hashCode()) * 31) + this.A0C) * 31) + this.A00) * 31) + (this.A0O ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31) + (this.A0M ? 1 : 0)) * 31));
    }

    public C201409jT(Parcel parcel) {
        ClassLoader classLoader = C201409jT.class.getClassLoader();
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A0E = parcel.readInt();
        this.A0P = AnonymousClass000.A1P(parcel.readInt());
        ArrayList A0I2 = AnonymousClass001.A0I();
        parcel.readList(A0I2, classLoader);
        this.A0L = C23931Ak.copyOf((Collection) A0I2);
        this.A0D = parcel.readInt();
        ArrayList A0I3 = AnonymousClass001.A0I();
        parcel.readList(A0I3, classLoader);
        this.A0I = C23931Ak.copyOf((Collection) A0I3);
        this.A0B = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        ArrayList A0I4 = AnonymousClass001.A0I();
        parcel.readList(A0I4, classLoader);
        this.A0J = C23931Ak.copyOf((Collection) A0I4);
        ArrayList A0I5 = AnonymousClass001.A0I();
        parcel.readList(A0I5, classLoader);
        this.A0K = C23931Ak.copyOf((Collection) A0I5);
        this.A0C = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A0O = AnonymousClass000.A1P(parcel.readInt());
        this.A0N = AnonymousClass000.A1P(parcel.readInt());
        this.A0M = AnonymousClass000.A1P(parcel.readInt());
        HashMap A0J2 = AnonymousClass001.A0J();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            Parcelable A0H2 = C36411kG.A0H(parcel, C206389tK.class);
            parcel.readParcelable(C206249sx.class.getClassLoader());
            A0J2.put(A0H2, (Object) null);
        }
        this.A0G = C20070wy.copyOf((Map) A0J2);
        ArrayList A0I6 = AnonymousClass001.A0I();
        parcel.readList(A0I6, classLoader);
        this.A0H = C20760y7.copyOf((Collection) A0I6);
    }

    public C201409jT(C198339dI r2) {
        this.A06 = r2.A06;
        this.A05 = r2.A05;
        this.A04 = r2.A04;
        this.A03 = r2.A03;
        this.A0A = r2.A0A;
        this.A09 = r2.A09;
        this.A08 = r2.A08;
        this.A07 = r2.A07;
        this.A0F = r2.A0F;
        this.A0E = r2.A0E;
        this.A0P = r2.A0P;
        this.A0L = r2.A0L;
        this.A0D = r2.A0D;
        this.A0I = r2.A0I;
        this.A0B = r2.A0B;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A0J = r2.A0J;
        this.A0K = r2.A0K;
        this.A0C = r2.A0C;
        this.A00 = r2.A00;
        this.A0O = r2.A0O;
        this.A0N = r2.A0N;
        this.A0M = r2.A0M;
        this.A0G = C20070wy.copyOf((Map) r2.A0G);
        this.A0H = C20760y7.copyOf((Collection) r2.A0H);
    }
}
