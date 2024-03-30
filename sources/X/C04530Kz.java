package X;

import android.os.Parcel;

/* renamed from: X.0Kz  reason: invalid class name and case insensitive filesystem */
public class C04530Kz extends C10440eF {
    public static final C08160aI CREATOR = new C08160aI();
    public C15950oJ A00;
    public AnonymousClass0KG A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final boolean A05;
    public final int A06;
    public final int A07;
    public final Class A08;
    public final String A09;
    public final boolean A0A;

    public static C04530Kz A00(String str, int i) {
        return new C04530Kz((Class) null, str, 7, 7, i, true, true);
    }

    public final String toString() {
        AnonymousClass0UM r2 = new AnonymousClass0UM(this);
        r2.A00(Integer.valueOf(this.A06), "versionCode");
        r2.A00(Integer.valueOf(this.A02), "typeIn");
        r2.A00(Boolean.valueOf(this.A05), "typeInArray");
        r2.A00(Integer.valueOf(this.A07), "typeOut");
        r2.A00(Boolean.valueOf(this.A0A), "typeOutArray");
        r2.A00(this.A09, "outputFieldName");
        r2.A00(Integer.valueOf(this.A03), "safeParcelFieldId");
        String str = this.A04;
        if (str == null) {
            str = null;
        }
        r2.A00(str, "concreteTypeName");
        Class cls = this.A08;
        if (cls != null) {
            r2.A00(cls.getCanonicalName(), "concreteType.class");
        }
        C15950oJ r0 = this.A00;
        if (r0 != null) {
            r2.A00(r0.getClass().getCanonicalName(), "converterName");
        }
        return r2.toString();
    }

    public C04530Kz(C04460Ks r3, String str, String str2, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A06 = i;
        this.A02 = i2;
        this.A05 = z;
        this.A07 = i3;
        this.A0A = z2;
        this.A09 = str;
        this.A03 = i4;
        AnonymousClass0LA r1 = null;
        if (str2 == null) {
            this.A08 = null;
            this.A04 = null;
        } else {
            this.A08 = AnonymousClass0LI.class;
            this.A04 = str2;
        }
        if (r3 == null || (r1 = r3.A01) != null) {
            this.A00 = r1;
            return;
        }
        throw AnonymousClass001.A09("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C04460Ks r1;
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A06);
        AnonymousClass0Z9.A08(parcel, 2, this.A02);
        AnonymousClass0Z9.A0A(parcel, 3, this.A05);
        AnonymousClass0Z9.A08(parcel, 4, this.A07);
        AnonymousClass0Z9.A0A(parcel, 5, this.A0A);
        AnonymousClass0Z9.A0C(parcel, this.A09, 6, false);
        AnonymousClass0Z9.A08(parcel, 7, this.A03);
        String str = this.A04;
        if (str == null) {
            str = null;
        }
        AnonymousClass0Z9.A0C(parcel, str, 8, false);
        C15950oJ r2 = this.A00;
        if (r2 == null) {
            r1 = null;
        } else if (r2 instanceof AnonymousClass0LA) {
            r1 = new C04460Ks((AnonymousClass0LA) r2);
        } else {
            throw AnonymousClass001.A08("Unsupported safe parcelable field converter class.");
        }
        AnonymousClass0Z9.A0B(parcel, r1, 9, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public C04530Kz(Class cls, String str, int i, int i2, int i3, boolean z, boolean z2) {
        String canonicalName;
        this.A06 = 1;
        this.A02 = i;
        this.A05 = z;
        this.A07 = i2;
        this.A0A = z2;
        this.A09 = str;
        this.A03 = i3;
        this.A08 = cls;
        if (cls == null) {
            canonicalName = null;
        } else {
            canonicalName = cls.getCanonicalName();
        }
        this.A04 = canonicalName;
        this.A00 = null;
    }
}
