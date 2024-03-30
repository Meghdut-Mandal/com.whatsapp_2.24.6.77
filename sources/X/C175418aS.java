package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.8aS  reason: invalid class name and case insensitive filesystem */
public final class C175418aS extends C175468aX {
    public static final long A09 = TimeUnit.DAYS.toMillis(7);
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175418aS(UserJid userJid, String str, String str2, String str3, List list, int i, long j, boolean z, boolean z2, boolean z3) {
        super(userJid, 1);
        C36321k7.A0z(str, str2);
        this.A02 = str;
        this.A03 = str2;
        this.A05 = list;
        this.A01 = j;
        this.A06 = z;
        this.A07 = z2;
        this.A04 = str3;
        this.A00 = i;
        this.A08 = z3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C36381kD.A1Y(this, obj)) {
                return false;
            }
            C175418aS r7 = (C175418aS) obj;
            if (!(this.A00 == r7.A00 && AnonymousClass00C.A0J(this.A00.getRawString(), r7.A00.getRawString()) && AnonymousClass00C.A0J(this.A02, r7.A02) && AnonymousClass00C.A0J(this.A03, r7.A03) && this.A01 == r7.A01 && AnonymousClass00C.A0J(this.A04, r7.A04) && this.A00 == r7.A00 && AnonymousClass00C.A0J(this.A05, r7.A05) && this.A06 == r7.A06 && this.A07 == r7.A07 && this.A08 == r7.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[10];
        boolean A1b = C36361kB.A1b(objArr, this.A00);
        objArr[1] = this.A00.getRawString();
        objArr[2] = this.A02;
        objArr[3] = this.A03;
        C165607th.A1T(objArr, this.A01);
        objArr[5] = this.A04;
        C36381kD.A1T(objArr, this.A00);
        objArr[7] = Boolean.valueOf(this.A06);
        objArr[8] = Boolean.valueOf(this.A07);
        return AnonymousClass000.A0M(Integer.valueOf(AnonymousClass000.A0M(this.A05, new Object[1], A1b ? 1 : 0)), objArr, 9);
    }

    public final JSONObject A02() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("brj", this.A00.getRawString());
        A1B.put("ap", this.A02);
        A1B.put("s", this.A03);
        A1B.put("ct", this.A01);
        String str = this.A04;
        if (str.length() > 0) {
            A1B.put("tb_t", str);
            A1B.put("tb_a", this.A00);
        }
        List<C52142ox> list = this.A05;
        if (list != null) {
            JSONArray A0u = C90524aI.A0u();
            for (C52142ox r0 : list) {
                A0u.put(r0.label);
            }
            A1B.put("cf", A0u);
        }
        A1B.put("lrt", this.A06);
        A1B.put("cde", this.A07);
        A1B.put("aae", this.A08);
        return A1B;
    }

    public String toString() {
        ArrayList arrayList;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("\n        CtwaAdsEntryPoint(\n            businessRemoteJid = ");
        A0u.append(this.A00);
        A0u.append(",\n            adsPayload = ");
        A0u.append(this.A02);
        A0u.append(",\n            adsSource = ");
        A0u.append(this.A03);
        A0u.append(",\n            clientFilters = ");
        List<C52142ox> list = this.A05;
        if (list != null) {
            arrayList = C36321k7.A0J(list);
            for (C52142ox r0 : list) {
                arrayList.add(r0.label);
            }
        } else {
            arrayList = null;
        }
        A0u.append(arrayList);
        A0u.append(",\n            creationTimeMs = ");
        A0u.append(this.A01);
        A0u.append(",\n            adsLoggingRequiresTos = ");
        A0u.append(this.A06);
        A0u.append(",\n            consumerDisclosureEnabled = ");
        A0u.append(this.A07);
        A0u.append(",\n            trustBannerType = ");
        A0u.append(this.A04);
        A0u.append(",\n            trustBannerPerformedAction = ");
        A0u.append(this.A00);
        return AnonymousClass091.A01(AnonymousClass000.A0q("\n        )\n    ", A0u));
    }
}
