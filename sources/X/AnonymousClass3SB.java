package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.3SB  reason: invalid class name */
public class AnonymousClass3SB {
    public long A00;
    public long A01;
    public String A02;
    public String A03;
    public final int A04;
    public final long A05;
    public final C198959eT A06;
    public final DeviceJid A07;
    public final C52782qA A08;
    public final String A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        AnonymousClass3SB r7 = (AnonymousClass3SB) obj;
        return this.A07.equals(r7.A07) && this.A08.equals(r7.A08) && AnonymousClass14B.A0G(this.A09, r7.A09) && this.A05 == r7.A05 && this.A04 == r7.A04 && this.A0A == r7.A0A && TextUtils.equals(this.A02, r7.A02);
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.A07;
        objArr[1] = this.A08;
        objArr[2] = this.A09;
        objArr[3] = Long.valueOf(this.A05);
        C36341k9.A1U(objArr, this.A04);
        objArr[5] = Boolean.valueOf(this.A0A);
        return AnonymousClass000.A0M(this.A02, objArr, 6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        return X.C36391kE.A0v(r4, r5.A09, new java.lang.Object[1], 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return r4.getString(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.Context r4, X.AnonymousClass3SB r5) {
        /*
            X.2qA r0 = r5.A08
            int r1 = r0.ordinal()
            r3 = 0
            r0 = 1
            switch(r1) {
                case 1: goto L_0x0043;
                case 2: goto L_0x003f;
                case 3: goto L_0x0037;
                case 4: goto L_0x0033;
                case 5: goto L_0x003b;
                case 6: goto L_0x002f;
                case 7: goto L_0x000b;
                case 8: goto L_0x000b;
                case 9: goto L_0x002b;
                case 10: goto L_0x0027;
                case 11: goto L_0x0023;
                case 12: goto L_0x001f;
                case 13: goto L_0x001b;
                case 14: goto L_0x000b;
                case 15: goto L_0x000b;
                case 16: goto L_0x002b;
                case 17: goto L_0x002b;
                case 18: goto L_0x000b;
                case 19: goto L_0x000b;
                case 20: goto L_0x000b;
                case 21: goto L_0x000b;
                case 22: goto L_0x0017;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r0 = r5.A09
            if (r0 != 0) goto L_0x0016
            r0 = 2131890753(0x7f121241, float:1.9416207E38)
        L_0x0012:
            java.lang.String r0 = r4.getString(r0)
        L_0x0016:
            return r0
        L_0x0017:
            r0 = 2131890752(0x7f121240, float:1.9416205E38)
            goto L_0x0012
        L_0x001b:
            r0 = 2131890750(0x7f12123e, float:1.94162E38)
            goto L_0x0012
        L_0x001f:
            r0 = 2131890743(0x7f121237, float:1.9416186E38)
            goto L_0x0012
        L_0x0023:
            r0 = 2131890741(0x7f121235, float:1.9416182E38)
            goto L_0x0012
        L_0x0027:
            r0 = 2131890748(0x7f12123c, float:1.9416197E38)
            goto L_0x0012
        L_0x002b:
            r2 = 2131890742(0x7f121236, float:1.9416184E38)
            goto L_0x0046
        L_0x002f:
            r2 = 2131890745(0x7f121239, float:1.941619E38)
            goto L_0x0046
        L_0x0033:
            r2 = 2131890749(0x7f12123d, float:1.9416199E38)
            goto L_0x0046
        L_0x0037:
            r2 = 2131890747(0x7f12123b, float:1.9416195E38)
            goto L_0x0046
        L_0x003b:
            r2 = 2131890751(0x7f12123f, float:1.9416203E38)
            goto L_0x0046
        L_0x003f:
            r2 = 2131890746(0x7f12123a, float:1.9416193E38)
            goto L_0x0046
        L_0x0043:
            r2 = 2131890744(0x7f121238, float:1.9416188E38)
        L_0x0046:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r5.A09
            java.lang.String r0 = X.C36391kE.A0v(r4, r0, r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3SB.A00(android.content.Context, X.3SB):java.lang.String");
    }

    public static String A01(Context context, AnonymousClass3SB r3, C20810yC r4) {
        String str = r3.A02;
        if (TextUtils.isEmpty(str) || !r4.A0E(4757)) {
            return A00(context, r3);
        }
        return str;
    }

    public boolean A02() {
        return AnonymousClass000.A1R((this.A01 > 0 ? 1 : (this.A01 == 0 ? 0 : -1)));
    }

    public AnonymousClass3SB(C198959eT r2, DeviceJid deviceJid, C52782qA r4, String str, String str2, String str3, int i, long j, long j2, long j3, boolean z) {
        C18740tg.A06(deviceJid);
        this.A07 = deviceJid;
        this.A08 = r4;
        this.A09 = AnonymousClass6RR.A00(str) ? null : str;
        this.A00 = j;
        this.A05 = j2;
        this.A01 = j3;
        this.A04 = i;
        this.A0A = z;
        this.A03 = str2;
        this.A02 = str3;
        this.A06 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Device jid: ");
        A0u.append(this.A07);
        A0u.append(", Platform type: ");
        A0u.append(this.A08);
        A0u.append(", Device OS: ");
        A0u.append(this.A09);
        A0u.append(", Last active: ");
        A0u.append(this.A00);
        A0u.append(", Login time: ");
        A0u.append(this.A05);
        A0u.append(", Logout time: ");
        A0u.append(this.A01);
        A0u.append(", ADV Key Index: ");
        A0u.append(this.A04);
        A0u.append(", full sync required: ");
        A0u.append(this.A0A);
        A0u.append(", Place Name: ");
        A0u.append(this.A03);
        A0u.append(", History sync config info: ");
        A0u.append(this.A06);
        A0u.append(", Nickname: ");
        return AnonymousClass000.A0q(this.A02, A0u);
    }
}
