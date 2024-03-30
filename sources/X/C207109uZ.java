package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9uZ  reason: invalid class name and case insensitive filesystem */
public final class C207109uZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(21);
    public final int A00;
    public final C206699tp A01;
    public final C206609tg A02;
    public final AnonymousClass3XK A03;
    public final AnonymousClass3XP A04;
    public final C206549ta A05;
    public final C134676bQ A06;
    public final AnonymousClass3XS A07;
    public final UserJid A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final List A0N;
    public final List A0O;
    public final List A0P;
    public final List A0Q;
    public final List A0R;
    public final List A0S;
    public final List A0T;
    public final List A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeParcelable(this.A08, i);
        parcel.writeString(this.A0L);
        parcel.writeTypedList(this.A0O);
        parcel.writeStringList(this.A0U);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeByte(this.A0Y ? (byte) 1 : 0);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0E);
        parcel.writeByte(this.A0W ? (byte) 1 : 0);
        parcel.writeByte(this.A0X ? (byte) 1 : 0);
        parcel.writeByte(this.A0c ? (byte) 1 : 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeByte(this.A0Z ? (byte) 1 : 0);
        parcel.writeParcelable(this.A04, i);
        parcel.writeTypedList(this.A0T);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0I);
        parcel.writeByte(this.A0V ? (byte) 1 : 0);
        parcel.writeTypedList(this.A0R);
        parcel.writeStringList(this.A0Q);
        parcel.writeByte(this.A0b ? (byte) 1 : 0);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A0B);
        parcel.writeTypedList(this.A0N);
        Integer num = this.A09;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        parcel.writeByte(this.A0a ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0K);
        parcel.writeString(AnonymousClass3LO.A00(this.A0P));
        parcel.writeString(C129326Gl.A00(this.A0S));
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A01, i);
        parcel.writeByte(this.A0d ? (byte) 1 : 0);
    }

    public final boolean A00() {
        Iterator it = this.A0U.iterator();
        while (it.hasNext()) {
            String A0C2 = AnonymousClass001.A0C(it);
            if (A0C2 != null && A0C2.length() != 0) {
                return false;
            }
        }
        String str = this.A0G;
        if (str != null && str.length() != 0) {
            return false;
        }
        String str2 = this.A0H;
        if ((str2 == null || str2.length() == 0) && this.A07.equals(AnonymousClass3XS.A04) && this.A03 == null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C207109uZ)) {
            return false;
        }
        C207109uZ r7 = (C207109uZ) obj;
        if (!AnonymousClass00C.A0J(this.A08, r7.A08)) {
            return false;
        }
        String str = this.A0L;
        String str2 = "";
        String str3 = str2;
        if (str == null) {
            str = str2;
        }
        String str4 = r7.A0L;
        if (str4 == null) {
            str4 = str2;
        }
        if (!str.equals(str4) || !AnonymousClass00C.A0J(this.A0O, r7.A0O) || !AnonymousClass00C.A0J(this.A0U, r7.A0U)) {
            return false;
        }
        String str5 = this.A0H;
        if (str5 == null) {
            str5 = str2;
        }
        String str6 = r7.A0H;
        if (str6 == null) {
            str6 = str2;
        }
        if (!str5.equals(str6)) {
            return false;
        }
        String str7 = this.A0G;
        if (str7 == null) {
            str7 = str2;
        }
        String str8 = r7.A0G;
        if (str8 == null) {
            str8 = str2;
        }
        if (!str7.equals(str8) || !AnonymousClass00C.A0J(this.A07, r7.A07) || !AnonymousClass00C.A0J(this.A03, r7.A03) || this.A0Y != r7.A0Y) {
            return false;
        }
        String str9 = this.A0D;
        if (str9 == null) {
            str9 = str2;
        }
        String str10 = r7.A0D;
        if (str10 == null) {
            str10 = str2;
        }
        if (!str9.equals(str10)) {
            return false;
        }
        String str11 = this.A0J;
        if (str11 == null) {
            str11 = str2;
        }
        String str12 = r7.A0J;
        if (str12 == null) {
            str12 = str2;
        }
        if (!str11.equals(str12) || this.A0W != r7.A0W) {
            return false;
        }
        String str13 = this.A0M;
        if (str13 == null) {
            str13 = str2;
        }
        String str14 = r7.A0M;
        if (str14 == null) {
            str14 = str2;
        }
        if (!str13.equals(str14)) {
            return false;
        }
        String str15 = this.A0E;
        if (str15 == null) {
            str15 = str2;
        }
        String str16 = r7.A0E;
        if (str16 == null) {
            str16 = str2;
        }
        if (!str15.equals(str16) || this.A0X != r7.A0X || this.A0c != r7.A0c || !AnonymousClass00C.A0J(this.A05, r7.A05) || !AnonymousClass00C.A0J(this.A02, r7.A02) || this.A0Z != r7.A0Z || !AnonymousClass00C.A0J(this.A04, r7.A04) || !AnonymousClass00C.A0J(this.A0T, r7.A0T)) {
            return false;
        }
        String str17 = this.A0F;
        if (str17 == null) {
            str17 = str2;
        }
        String str18 = r7.A0F;
        if (str18 == null) {
            str18 = str2;
        }
        if (!str17.equals(str18)) {
            return false;
        }
        String str19 = this.A0I;
        if (str19 == null) {
            str19 = str2;
        }
        String str20 = r7.A0I;
        if (str20 != null) {
            str2 = str20;
        }
        if (!str19.equals(str2) || this.A0V != r7.A0V || !AnonymousClass00C.A0J(this.A0R, r7.A0R)) {
            return false;
        }
        List list = this.A0Q;
        List list2 = r7.A0Q;
        if (list != null) {
            if (list2 == null) {
                return false;
            }
            ArrayList A15 = C36441kJ.A15(list);
            ArrayList A152 = C36441kJ.A15(list2);
            A15.removeAll(C36381kD.A13(str3, (String) null));
            A152.removeAll(C36381kD.A13(str3, (String) null));
            if (!A15.equals(A152)) {
                return false;
            }
        } else if (list2 != null) {
            return false;
        }
        if (this.A0b != r7.A0b || !AnonymousClass00C.A0J(this.A06, r7.A06) || !AnonymousClass00C.A0J(this.A0B, r7.A0B) || !AnonymousClass00C.A0J(this.A0N, r7.A0N) || !AnonymousClass00C.A0J(this.A09, r7.A09) || this.A0a != r7.A0a || this.A00 != r7.A00 || !AnonymousClass00C.A0J(this.A0K, r7.A0K) || !AnonymousClass00C.A0J(this.A0C, r7.A0C) || !AnonymousClass00C.A0J(this.A0P, r7.A0P) || !AnonymousClass00C.A0J(this.A0S, r7.A0S) || !AnonymousClass00C.A0J(this.A0A, r7.A0A) || !AnonymousClass00C.A0J(this.A01, r7.A01) || this.A0d != r7.A0d) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A052 = C36351kA.A05(this.A0O, ((((AnonymousClass000.A0J(this.A08) * 31) + C165577te.A06(this.A0L)) * 31) + C165577te.A06(this.A0M)) * 31);
        List list = this.A0T;
        List list2 = this.A0R;
        int A082 = C36381kD.A08(this.A0B, (((((C36351kA.A05(list2, (((((C36351kA.A05(list, (((((((((((((((((((((((((((((C36351kA.A05(this.A0U, A052) + C165577te.A06(this.A0H)) * 31) + C165577te.A06(this.A0G)) * 31) + AnonymousClass000.A0J(this.A07)) * 31) + AnonymousClass000.A0J(this.A03)) * 31) + (this.A0Y ? 1 : 0)) * 31) + C165577te.A06(this.A0D)) * 31) + C165577te.A06(this.A0J)) * 31) + C165577te.A06(this.A0E)) * 31) + (this.A0W ? 1 : 0)) * 31) + (this.A0X ? 1 : 0)) * 31) + (this.A0c ? 1 : 0)) * 31) + AnonymousClass000.A0J(this.A05)) * 31) + AnonymousClass000.A0J(this.A02)) * 31) + (this.A0Z ? 1 : 0)) * 31) + AnonymousClass000.A0J(this.A04)) * 31) + C165577te.A06(this.A0F)) * 31) + C165577te.A06(this.A0I)) * 31) + (this.A0V ? 1 : 0)) * 31) + AnonymousClass000.A0J(this.A0Q)) * 31) + (this.A0b ? 1 : 0)) * 31) + AnonymousClass000.A0J(this.A06)) * 31);
        int A053 = (((C36351kA.A05(this.A0S, C36351kA.A05(this.A0P, (((((((C36351kA.A05(this.A0N, A082) + AnonymousClass000.A0J(this.A09)) * 31) + (this.A0a ? 1 : 0)) * 31) + this.A00) * 31) + C165577te.A06(this.A0K)) * 31)) + C165577te.A06(this.A0C)) * 31) + C165577te.A06(this.A0A)) * 31;
        C206699tp r0 = this.A01;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return ((A053 + i) * 31) + (this.A0d ? 1 : 0);
    }

    public C207109uZ(Parcel parcel) {
        List<T> unmodifiableList;
        this.A08 = (UserJid) C36411kG.A0H(parcel, UserJid.class);
        this.A0L = parcel.readString();
        List unmodifiableList2 = Collections.unmodifiableList(parcel.createTypedArrayList(C134986bw.CREATOR));
        AnonymousClass00C.A08(unmodifiableList2);
        this.A0O = unmodifiableList2;
        List<T> unmodifiableList3 = Collections.unmodifiableList(parcel.createStringArrayList());
        AnonymousClass00C.A08(unmodifiableList3);
        this.A0U = unmodifiableList3;
        this.A0H = parcel.readString();
        this.A0G = parcel.readString();
        AnonymousClass3XS r0 = (AnonymousClass3XS) C36411kG.A0H(parcel, AnonymousClass3XS.class);
        this.A07 = r0 == null ? AnonymousClass3XS.A04 : r0;
        this.A03 = (AnonymousClass3XK) C36411kG.A0H(parcel, AnonymousClass3XK.class);
        boolean z = true;
        this.A0Y = AnonymousClass000.A1P(parcel.readByte());
        this.A0M = parcel.readString();
        this.A0D = parcel.readString();
        this.A0J = parcel.readString();
        this.A0E = parcel.readString();
        this.A0W = C165567td.A1Y(parcel);
        this.A0X = C165567td.A1Y(parcel);
        this.A0c = C165567td.A1Y(parcel);
        this.A05 = (C206549ta) C36411kG.A0H(parcel, C206549ta.class);
        this.A02 = (C206609tg) C36411kG.A0H(parcel, C206609tg.class);
        this.A0Z = C165567td.A1Y(parcel);
        this.A04 = (AnonymousClass3XP) C36411kG.A0H(parcel, AnonymousClass3XP.class);
        List unmodifiableList4 = Collections.unmodifiableList(parcel.readArrayList(C134756bY.class.getClassLoader()));
        AnonymousClass00C.A0E(unmodifiableList4, "null cannot be cast to non-null type kotlin.collections.List<com.whatsapp.contact.BusinessServiceArea?>");
        this.A0T = unmodifiableList4;
        this.A0F = parcel.readString();
        this.A0I = parcel.readString();
        this.A0V = C165567td.A1Y(parcel);
        List unmodifiableList5 = Collections.unmodifiableList(parcel.createTypedArrayList(C206469tS.A01));
        AnonymousClass00C.A08(unmodifiableList5);
        this.A0R = unmodifiableList5;
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        Integer num = null;
        if (createStringArrayList == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(createStringArrayList);
        }
        this.A0Q = unmodifiableList;
        this.A0b = C165567td.A1Y(parcel);
        this.A06 = (C134676bQ) C36411kG.A0H(parcel, C134676bQ.class);
        String readString = parcel.readString();
        this.A0B = readString == null ? "UNBLOCKED" : readString;
        List unmodifiableList6 = Collections.unmodifiableList(parcel.createTypedArrayList(C134806bd.CREATOR));
        AnonymousClass00C.A08(unmodifiableList6);
        this.A0N = unmodifiableList6;
        int readInt = parcel.readInt();
        if (readInt != -1) {
            num = Integer.valueOf(readInt);
            if (num == null) {
                num = null;
            } else if (readInt < 0 || readInt > 100) {
                num = C36381kD.A0m();
            }
        }
        this.A09 = num;
        this.A0a = C165567td.A1Y(parcel);
        this.A00 = parcel.readInt();
        this.A0K = parcel.readString();
        this.A0P = AnonymousClass3LO.A01(parcel.readString());
        this.A0S = C129326Gl.A01(parcel.readString());
        this.A0C = parcel.readString();
        this.A0A = parcel.readString();
        this.A01 = (C206699tp) C36411kG.A0H(parcel, C206699tp.class);
        this.A0d = parcel.readByte() == 0 ? false : z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessProfile{jid='");
        A0u.append(this.A08);
        A0u.append("', tag='");
        A0u.append(this.A0L);
        A0u.append("', websites=");
        A0u.append(this.A0U);
        A0u.append(", email='");
        A0u.append(this.A0H);
        A0u.append("', description='");
        A0u.append(this.A0G);
        A0u.append("', address='");
        A0u.append(this.A07);
        A0u.append("', vertical='");
        A0u.append(this.A0M);
        A0u.append("', categories='");
        A0u.append(this.A0O);
        A0u.append("', hours='");
        A0u.append(this.A03);
        A0u.append("', has_catalog='");
        A0u.append(this.A0Y);
        A0u.append("', commerceExperience='");
        A0u.append(this.A0D);
        A0u.append("', shopUrl='");
        A0u.append(this.A0J);
        A0u.append("', commerceManagerUrl='");
        A0u.append(this.A0E);
        A0u.append("', cart_enabled='");
        A0u.append(this.A0W);
        A0u.append("', directConnectionEnabled='");
        A0u.append(this.A0X);
        A0u.append("', shopBanned='");
        A0u.append(this.A0c);
        A0u.append("', isGalaxyBusiness='");
        A0u.append(this.A0Z);
        A0u.append(", coverPhoto='");
        AnonymousClass3XP r2 = this.A04;
        String str = "null";
        if (r2 != null) {
            str = r2.toString();
        }
        A0u.append(str);
        A0u.append("', serviceAreas='");
        A0u.append(this.A0T);
        A0u.append("', customUrl='");
        A0u.append(this.A0F);
        A0u.append("', memberSince='");
        A0u.append(this.A0I);
        A0u.append("', capiCallingEnabled='");
        A0u.append(this.A0V);
        A0u.append("', directConnectionEnabledFeatures='");
        A0u.append(this.A0R);
        A0u.append("', directConnectionAllowedCountryCodes=");
        A0u.append(this.A0Q);
        A0u.append("', isResponsive='");
        A0u.append(this.A0b);
        A0u.append("', priceTier='");
        A0u.append(this.A06);
        A0u.append("', businessBlockedStatus='");
        A0u.append(this.A0B);
        A0u.append("', businessServiceOfferings=");
        A0u.append(this.A0N);
        A0u.append(", surveySamplingRate='");
        A0u.append(this.A09);
        A0u.append("', isOfferingsEligible='");
        A0u.append(this.A0a);
        A0u.append(", automatedType='");
        A0u.append(this.A00);
        A0u.append(", botDescription='");
        A0u.append(this.A0A);
        A0u.append(", subDescription='");
        A0u.append(this.A0K);
        A0u.append(", commandsDescription='");
        A0u.append(this.A0C);
        A0u.append(", commands='");
        A0u.append(this.A0P);
        A0u.append(", prompts='");
        A0u.append(this.A0S);
        A0u.append(", businessAccountSettings='");
        A0u.append(this.A01);
        A0u.append(", supportWelcomeRequestMessage='");
        A0u.append(this.A0d);
        return AnonymousClass000.A0q("'}", A0u);
    }

    public C207109uZ(C206699tp r2, C206609tg r3, AnonymousClass3XK r4, AnonymousClass3XP r5, C206549ta r6, C134676bQ r7, AnonymousClass3XS r8, UserJid userJid, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        List unmodifiableList;
        this.A08 = userJid;
        this.A0L = str;
        List unmodifiableList2 = Collections.unmodifiableList(list);
        AnonymousClass00C.A08(unmodifiableList2);
        this.A0O = unmodifiableList2;
        List unmodifiableList3 = Collections.unmodifiableList(list2);
        AnonymousClass00C.A08(unmodifiableList3);
        this.A0U = unmodifiableList3;
        this.A0H = str2;
        this.A0G = str3;
        this.A07 = r8;
        this.A03 = r4;
        this.A0Y = z;
        this.A0D = str4;
        this.A0J = str5;
        this.A0E = str6;
        this.A0W = z2;
        this.A0M = str7;
        this.A0X = z3;
        this.A0c = z4;
        this.A05 = r6;
        this.A02 = r3;
        this.A0Z = z5;
        this.A04 = r5;
        List unmodifiableList4 = Collections.unmodifiableList(list3);
        AnonymousClass00C.A08(unmodifiableList4);
        this.A0T = unmodifiableList4;
        this.A0F = str8;
        this.A0I = str9;
        this.A0V = z6;
        List unmodifiableList5 = Collections.unmodifiableList(list4);
        AnonymousClass00C.A08(unmodifiableList5);
        this.A0R = unmodifiableList5;
        if (list5 == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(list5);
        }
        this.A0Q = unmodifiableList;
        this.A0b = z7;
        this.A06 = r7;
        this.A0B = str10;
        this.A0N = list6;
        this.A09 = num;
        this.A0a = z8;
        this.A00 = i;
        this.A0A = str11;
        this.A0K = str12;
        this.A0C = str13;
        this.A0P = list7;
        this.A0S = list8;
        this.A01 = r2;
        this.A0d = z9;
    }
}
