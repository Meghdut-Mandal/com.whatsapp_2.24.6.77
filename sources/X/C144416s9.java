package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6s9  reason: invalid class name and case insensitive filesystem */
public class C144416s9 implements C160637lL, Parcelable {
    public static final Parcelable.Creator CREATOR = new C163937r0(20);
    public double A00;
    public int A01 = 0;
    public Double A02;
    public String A03;
    public String A04;
    public List A05;
    public List A06;
    public final int A07;
    public final int A08;
    public final C134676bQ A09;
    public final Double A0A;
    public final Double A0B;
    public final Double A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final List A0K;
    public final List A0L;
    public final List A0M;
    public final List A0N;
    public final List A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C144416s9 r5 = (C144416s9) obj;
            if (this.A07 != r5.A07 || !this.A0F.equals(r5.A0F) || !C1901797e.A00(this.A0D, r5.A0D) || !this.A0B.equals(r5.A0B) || !this.A0C.equals(r5.A0C) || !this.A0I.equals(r5.A0I) || !this.A0L.equals(r5.A0L) || !C1901797e.A00(this.A0G, r5.A0G) || this.A0P != r5.A0P || !C1901797e.A00(this.A06, r5.A06) || this.A01 != r5.A01) {
                return false;
            }
        }
        return true;
    }

    public static C144416s9 A00(C144416s9 r40) {
        C144416s9 r0 = r40;
        String str = r0.A0E;
        boolean z = r0.A0S;
        boolean z2 = r0.A0P;
        String str2 = r0.A0F;
        boolean z3 = r0.A0Q;
        String str3 = r0.A0D;
        String str4 = r0.A0J;
        Double d = r0.A0B;
        Double d2 = r0.A0C;
        Double valueOf = Double.valueOf(r0.A00);
        boolean z4 = r0.A0R;
        String str5 = r0.A0I;
        C134676bQ r11 = r0.A09;
        List list = r0.A0L;
        String str6 = r0.A0G;
        int i = r0.A07;
        Double d3 = r0.A0A;
        String str7 = r0.A0H;
        Double d4 = r0.A02;
        int i2 = r0.A08;
        List list2 = r0.A0M;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        return new C144416s9(r11, d, d2, valueOf, d3, d4, str8, str9, str10, str11, str5, str6, str7, list, list2, r0.A0N, r0.A0O, r0.A0K, i, i2, z, z2, z3, z4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
        if (r1 != 2) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C144416s9 A01(org.json.JSONObject r40) {
        /*
            java.lang.String r7 = "id"
            r0 = r40
            java.lang.String r23 = r0.optString(r7)
            java.lang.String r1 = "jid"
            java.lang.String r24 = r0.getString(r1)
            java.lang.String r1 = "verified_name"
            java.lang.String r27 = r0.getString(r1)
            java.lang.String r1 = "profile_pic_url"
            java.lang.String r28 = r0.optString(r1)
            java.lang.String r1 = "address"
            java.lang.String r25 = r0.optString(r1)
            java.lang.String r1 = "vertical"
            java.lang.String r26 = r0.optString(r1)
            java.lang.String r11 = "latitude"
            java.lang.Double r18 = X.C90504aG.A0b(r11, r0)
            java.lang.String r10 = "longitude"
            java.lang.Double r19 = X.C90504aG.A0b(r10, r0)
            java.lang.String r1 = "responsive"
            boolean r37 = r0.optBoolean(r1)
            java.lang.String r2 = "categories"
            boolean r1 = r0.has(r2)
            if (r1 == 0) goto L_0x0061
            org.json.JSONArray r3 = r0.getJSONArray(r2)
            java.util.ArrayList r15 = X.AnonymousClass001.A0I()
            r2 = 0
        L_0x0049:
            int r1 = r3.length()
            if (r2 >= r1) goto L_0x0065
            java.lang.Object r1 = r3.get(r2)
            boolean r1 = r1 instanceof java.lang.String
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = r3.getString(r2)
            r15.add(r1)
        L_0x005e:
            int r2 = r2 + 1
            goto L_0x0049
        L_0x0061:
            java.util.List r15 = java.util.Collections.emptyList()
        L_0x0065:
            java.lang.String r2 = "business_operating"
            boolean r1 = r0.has(r2)
            if (r1 == 0) goto L_0x007a
            int r1 = r0.optInt(r2)
            r8 = 0
            if (r1 == 0) goto L_0x007b
            r8 = 1
            if (r1 == r8) goto L_0x007b
            r8 = 2
            if (r1 == r8) goto L_0x007b
        L_0x007a:
            r8 = 3
        L_0x007b:
            java.lang.String r1 = "verified_level"
            int r1 = r0.optInt(r1)
            r12 = 1
            if (r1 == r12) goto L_0x0088
            r12 = 2
            if (r1 == r12) goto L_0x0088
            r12 = 0
        L_0x0088:
            java.lang.String r1 = "biz_pre_rank_score"
            java.lang.Double r21 = X.C90504aG.A0b(r1, r0)
            java.lang.String r1 = "ranking_result_id"
            java.lang.String r29 = r0.optString(r1)
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()
            java.lang.String r1 = "linked_accounts"
            boolean r2 = r0.has(r1)
            if (r2 == 0) goto L_0x00ef
            org.json.JSONArray r4 = r0.getJSONArray(r1)
            X.C18740tg.A06(r4)
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()
            if (r4 == 0) goto L_0x00ef
            r3 = 0
        L_0x00ae:
            int r1 = r4.length()
            if (r3 >= r1) goto L_0x00ef
            org.json.JSONObject r2 = r4.getJSONObject(r3)     // Catch:{ JSONException -> 0x00e6 }
            java.lang.String r9 = r2.getString(r7)     // Catch:{ JSONException -> 0x00e6 }
            X.C18740tg.A05(r9)     // Catch:{ JSONException -> 0x00e6 }
            java.lang.String r1 = "type"
            boolean r5 = r2.has(r1)     // Catch:{ JSONException -> 0x00e6 }
            if (r5 == 0) goto L_0x00ec
            int r1 = r2.getInt(r1)     // Catch:{ JSONException -> 0x00e6 }
            java.lang.String r5 = "fanCount"
            int r6 = r2.optInt(r5)     // Catch:{ JSONException -> 0x00e6 }
            r5 = 0
            if (r1 == 0) goto L_0x00d8
            r2 = 1
            if (r1 != r2) goto L_0x00ec
            goto L_0x00db
        L_0x00d8:
            java.lang.String r2 = "facebook"
            goto L_0x00dd
        L_0x00db:
            java.lang.String r2 = "instagram"
        L_0x00dd:
            X.6bZ r1 = new X.6bZ     // Catch:{ JSONException -> 0x00e6 }
            r1.<init>(r9, r2, r6, r5)     // Catch:{ JSONException -> 0x00e6 }
            r14.add(r1)     // Catch:{ JSONException -> 0x00e6 }
            goto L_0x00ec
        L_0x00e6:
            r2 = move-exception
            java.lang.String r1 = "MinifiedBusinessProfile/readLinkedAccountsArray: could not parse one of the LinkedAccount json object"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x00ec:
            int r3 = r3 + 1
            goto L_0x00ae
        L_0x00ef:
            r13 = 0
            java.lang.String r1 = "service_areas"
            boolean r2 = r0.has(r1)
            if (r2 == 0) goto L_0x012f
            org.json.JSONArray r4 = r0.getJSONArray(r1)
            X.C18740tg.A06(r4)
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()
            r2 = 0
        L_0x0104:
            int r1 = r4.length()
            if (r2 >= r1) goto L_0x012f
            org.json.JSONObject r1 = r4.getJSONObject(r2)
            double r32 = r1.getDouble(r11)
            double r34 = r1.getDouble(r10)
            java.lang.String r3 = "radius"
            int r36 = r1.getInt(r3)
            java.lang.String r3 = "description"
            java.lang.String r31 = r1.getString(r3)
            X.6bY r1 = new X.6bY
            r30 = r1
            r30.<init>(r31, r32, r34, r36)
            r13.add(r1)
            int r2 = r2 + 1
            goto L_0x0104
        L_0x012f:
            java.lang.String r1 = "has_catalog"
            boolean r38 = r0.optBoolean(r1)
            java.lang.String r1 = "has_post_image"
            boolean r40 = r0.optBoolean(r1)
            java.lang.String r1 = "has_description"
            boolean r39 = r0.optBoolean(r1)
            java.lang.String r1 = "price_tier"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            r4 = 0
            if (r1 != 0) goto L_0x01a5
            r10 = r4
        L_0x014b:
            java.lang.String r6 = "offerings"
            org.json.JSONArray r5 = r0.optJSONArray(r6)
            if (r5 == 0) goto L_0x01b9
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r0 = 0
        L_0x0158:
            int r1 = r5.length()
            if (r0 >= r1) goto L_0x01b9
            org.json.JSONObject r2 = r5.getJSONObject(r0)
            java.lang.String r1 = "category"
            org.json.JSONObject r1 = r2.getJSONObject(r1)
            int r11 = r1.getInt(r7)
            java.lang.String r3 = "name"
            java.lang.String r31 = r1.getString(r3)
            org.json.JSONArray r9 = r2.getJSONArray(r6)
            r2 = 0
        L_0x0177:
            int r1 = r9.length()
            if (r2 >= r1) goto L_0x01a2
            org.json.JSONObject r1 = r9.getJSONObject(r0)
            java.lang.String r33 = r1.getString(r7)
            java.lang.String r3 = "is_offered"
            boolean r35 = r1.getBoolean(r3)
            java.lang.String r3 = "localized_display_name"
            java.lang.String r34 = r1.getString(r3)
            java.lang.String r32 = java.lang.Integer.toString(r11)
            X.6bd r1 = new X.6bd
            r30 = r1
            r30.<init>(r31, r32, r33, r34, r35)
            r4.add(r1)
            int r2 = r2 + 1
            goto L_0x0177
        L_0x01a2:
            int r0 = r0 + 1
            goto L_0x0158
        L_0x01a5:
            int r3 = r1.getInt(r7)
            java.lang.String r2 = "symbol"
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r1 = java.lang.Integer.toString(r3)
            X.6bQ r10 = new X.6bQ
            r10.<init>(r1, r4, r2)
            goto L_0x014b
        L_0x01b9:
            r20 = 0
            java.util.ArrayList r31 = X.AnonymousClass001.A0I()
            X.6s9 r16 = new X.6s9
            r22 = r20
            r30 = r15
            r32 = r14
            r33 = r4
            r34 = r13
            r35 = r8
            r36 = r12
            r17 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144416s9.A01(org.json.JSONObject):X.6s9");
    }

    public boolean A02() {
        Double d = this.A0B;
        Double valueOf = Double.valueOf(Double.NaN);
        if (!d.equals(valueOf)) {
            Double d2 = this.A0C;
            if (d2.equals(valueOf) || d.doubleValue() == 0.0d || d2.doubleValue() == 0.0d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void B2B(Location location) {
        double d;
        double d2;
        Location location2 = new Location("");
        if (A02()) {
            location2.setLatitude(this.A0B.doubleValue());
            d2 = this.A0C.doubleValue();
        } else {
            List list = this.A0K;
            if (list == null || list.isEmpty() || !TextUtils.isEmpty(this.A0D)) {
                d = 0.0d;
                this.A00 = d;
            }
            location2.setLatitude(((C134756bY) list.get(0)).A00);
            d2 = ((C134756bY) list.get(0)).A01;
        }
        location2.setLongitude(d2);
        d = (double) location.distanceTo(location2);
        this.A00 = d;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A0F;
        objArr[1] = this.A0B;
        objArr[2] = this.A0C;
        objArr[3] = this.A0I;
        objArr[4] = this.A0L;
        C36371kC.A1S(objArr, this.A07);
        objArr[6] = Boolean.valueOf(this.A0P);
        objArr[7] = this.A06;
        return AnonymousClass000.A0M(Integer.valueOf(this.A01), objArr, 8);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0J);
        parcel.writeDouble(this.A0B.doubleValue());
        parcel.writeDouble(this.A0C.doubleValue());
        parcel.writeStringList(this.A0L);
        parcel.writeString(this.A0I);
        parcel.writeInt(this.A07);
        parcel.writeString(this.A0G);
        parcel.writeDouble(this.A0A.doubleValue());
        parcel.writeString(this.A0H);
        parcel.writeList(this.A0N);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeList(this.A0K);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeStringList(this.A06);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A01);
        parcel.writeList(this.A0M);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeStringList(this.A05);
        parcel.writeParcelable(this.A09, i);
        parcel.writeList(this.A0O);
    }

    public C144416s9(Parcel parcel) {
        boolean z = false;
        this.A0E = C90514aH.A0u(parcel);
        this.A0F = C90514aH.A0u(parcel);
        this.A0D = parcel.readString();
        this.A0J = C90514aH.A0u(parcel);
        Double valueOf = Double.valueOf(parcel.readDouble());
        C18740tg.A06(valueOf);
        this.A0B = valueOf;
        Double valueOf2 = Double.valueOf(parcel.readDouble());
        C18740tg.A06(valueOf2);
        this.A0C = valueOf2;
        ArrayList A0I2 = AnonymousClass001.A0I();
        this.A0L = A0I2;
        parcel.readStringList(A0I2);
        this.A0I = C90514aH.A0u(parcel);
        int readInt = parcel.readInt();
        C18740tg.A06(Integer.valueOf(readInt));
        this.A07 = readInt;
        this.A0G = parcel.readString();
        this.A0A = Double.valueOf(parcel.readDouble());
        this.A0H = parcel.readString();
        ArrayList A0I3 = AnonymousClass001.A0I();
        this.A0N = A0I3;
        parcel.readList(A0I3, C134766bZ.class.getClassLoader());
        this.A0S = AnonymousClass000.A1S(parcel.readInt(), 1);
        ArrayList A0I4 = AnonymousClass001.A0I();
        this.A0K = A0I4;
        parcel.readList(A0I4, C134756bY.class.getClassLoader());
        this.A0P = AnonymousClass000.A1S(parcel.readInt(), 1);
        ArrayList A0I5 = AnonymousClass001.A0I();
        this.A06 = A0I5;
        parcel.readStringList(A0I5);
        this.A08 = parcel.readInt();
        this.A01 = parcel.readInt();
        ArrayList A0I6 = AnonymousClass001.A0I();
        this.A0M = A0I6;
        parcel.readList(A0I6, C206619th.class.getClassLoader());
        this.A0Q = AnonymousClass000.A1S(parcel.readInt(), 1);
        this.A0R = parcel.readInt() == 1 ? true : z;
        ArrayList A0I7 = AnonymousClass001.A0I();
        this.A05 = A0I7;
        parcel.readStringList(A0I7);
        this.A09 = (C134676bQ) C36411kG.A0H(parcel, C134676bQ.class);
        ArrayList A0I8 = AnonymousClass001.A0I();
        this.A0O = A0I8;
        parcel.readList(A0I8, C134806bd.class.getClassLoader());
    }

    public double BBC() {
        return this.A00;
    }

    public Double BG7() {
        return this.A02;
    }

    public Double BG8() {
        return this.A0A;
    }

    public void Brg(Double d) {
        this.A02 = d;
    }

    public C144416s9(C134676bQ r3, Double d, Double d2, Double d3, Double d4, Double d5, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, List list4, List list5, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        double doubleValue;
        this.A0E = str;
        this.A0F = str2;
        this.A0D = str3;
        this.A0J = str4;
        this.A0B = d;
        this.A0C = d2;
        this.A09 = r3;
        this.A0S = z;
        this.A0L = list;
        this.A0P = z2;
        this.A0I = str5;
        this.A0M = list2;
        this.A07 = i;
        this.A0G = str6;
        this.A0A = d4;
        this.A0N = list3;
        this.A0H = str7;
        this.A0Q = z3;
        this.A08 = i2;
        this.A0R = z4;
        this.A0O = list4;
        this.A0K = list5;
        if (d3 == null) {
            doubleValue = 0.0d;
        } else {
            doubleValue = d3.doubleValue();
        }
        this.A00 = doubleValue;
        this.A02 = d5;
    }
}
