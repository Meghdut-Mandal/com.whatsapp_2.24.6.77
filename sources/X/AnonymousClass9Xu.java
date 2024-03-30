package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import org.json.JSONObject;

/* renamed from: X.9Xu  reason: invalid class name */
public class AnonymousClass9Xu {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final UserJid A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass9Xu r7 = (AnonymousClass9Xu) obj;
            if (!(this.A04.getRawString().equals(r7.A04.getRawString()) && TextUtils.equals(this.A06, r7.A06) && TextUtils.equals(this.A05, r7.A05) && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A00 == r7.A00 && this.A07 == r7.A07 && this.A02 == r7.A02 && this.A08 == r7.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A04;
        objArr[1] = this.A06;
        objArr[2] = this.A05;
        C165587tf.A1W(objArr, this.A01);
        C36341k9.A1U(objArr, this.A00);
        objArr[5] = Boolean.valueOf(this.A07);
        objArr[6] = Long.valueOf(this.A03);
        objArr[7] = Long.valueOf(this.A02);
        return AnonymousClass000.A0M(Boolean.valueOf(this.A08), objArr, 8);
    }

    public AnonymousClass9Xu(AnonymousClass9O3 r3) {
        this.A04 = r3.A06;
        this.A06 = r3.A08;
        this.A05 = r3.A07;
        this.A01 = r3.A04;
        this.A03 = r3.A05;
        this.A07 = r3.A02;
        this.A00 = r3.A00;
        this.A02 = r3.A01;
        this.A08 = r3.A03;
    }

    public String A00() {
        JSONObject A1B = C36441kJ.A1B();
        A1B.put("uj", this.A04.getRawString());
        A1B.put("s", this.A06);
        String str = this.A05;
        if (!TextUtils.isEmpty(str)) {
            A1B.put("a", str);
        }
        A1B.put("ct", this.A01);
        A1B.put("lit", this.A03);
        A1B.put("hcslm", this.A07);
        int i = this.A00;
        if (i != -1) {
            A1B.put("brc", i);
        }
        long j = this.A02;
        if (j != -1) {
            A1B.put("fmts", j);
        }
        A1B.put("wdtb", this.A08);
        return A1B.toString();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EntryPointConversionData{userJid=");
        A0u.append(this.A04);
        A0u.append(", source='");
        A0u.append(this.A06);
        A0u.append('\'');
        A0u.append(", app='");
        A0u.append(this.A05);
        A0u.append('\'');
        A0u.append(", creationTimeMillis=");
        A0u.append(this.A01);
        A0u.append(", bizCount=");
        A0u.append(this.A00);
        A0u.append(", hasUserSentLastMessage=");
        A0u.append(this.A07);
        A0u.append(", lastInteractionTimeMillis=");
        A0u.append(this.A03);
        A0u.append(", firstMessageTsSeconds=");
        A0u.append(this.A02);
        A0u.append(", wasDeliveredToBiz=");
        A0u.append(this.A08);
        return AnonymousClass000.A0s(A0u);
    }
}
