package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.6p5  reason: invalid class name and case insensitive filesystem */
public class C142566p5 implements AnonymousClass7fQ {
    public final C19700wN A00;
    public final C124635yY A01;
    public final C20810yC A02;
    public final C19600wD A03;

    public String A00(C121205sl r6) {
        byte[] bArr;
        try {
            bArr = C110525ao.A00("".getBytes(), r6.A02);
        } catch (Exception unused) {
            Log.e("ACSTokenProviderImpl/computeHMAC Failed to compute HMAC");
            this.A00.A0E("ACSTokenProviderImpl/computeHMAC", "Failed to compute HMAC", true);
            bArr = null;
        }
        if (bArr != null) {
            return Base64.encodeToString(bArr, 10);
        }
        return null;
    }

    public void B7m(C124405y8 r29, AnonymousClass6VU r30, String str) {
        int i;
        byte[] decode;
        C121205sl r8;
        int A012;
        AnonymousClass6VU r5 = r30;
        String str2 = str;
        AnonymousClass6KZ r3 = new AnonymousClass6KZ(this, r5, str2);
        try {
            C20810yC r2 = this.A02;
            C124405y8 r6 = new C124405y8(r2.A07(966), r2.A07(965), r2.A07(967), r2.A07(968), r2.A07(969), r2.A07(970), r2.A07(971), r2.A07(972));
            C124635yY r9 = this.A01;
            if (!r9.A07.contains(str2)) {
                this.A00.A0E("ACSTokenProviderImpl/generateACSToken", AnonymousClass000.A0q(" is not registered with ACSTokenManager", AnonymousClass000.A0v(str2)), false);
                r5.A0C(0);
                return;
            }
            Map map = r9.A09;
            if (!map.containsKey(str2)) {
                AnonymousClass6W6 r22 = new AnonymousClass6W6(r9.A05, str2);
                C147776xl r14 = new C147776xl(r9.A04);
                C19970wo r13 = r9.A02;
                C20810yC r12 = r9.A03;
                C19770wU r11 = r9.A06;
                C132576Ui r19 = new C132576Ui(r9.A00, r9.A01, r22, r14, r13, r12, r11, str2);
                AnonymousClass6W6.A01(r22, "token_length", r6.A06);
                AnonymousClass6W6.A01(r22, "shared_secret_length", r6.A04);
                AnonymousClass6W6.A02(r22, "max_time_to_live_in_sec", (long) r6.A07);
                AnonymousClass6W6.A01(r22, "max_redeem_count", r6.A03);
                AnonymousClass6W6.A01(r22, "lead_time_to_prefetch_sec", r6.A01);
                AnonymousClass6W6.A01(r22, "lead_redeem_count_to_prefetch", r6.A00);
                AnonymousClass6W6.A01(r22, "max_sign_retry_count", r6.A02);
                AnonymousClass6W6.A02(r22, "sign_retry_interval_sec", (long) r6.A05);
                map.put(str2, r19);
                r9.A08.put(str2, r22);
                r19.A08.execute(new C1496972k(r19, 26));
            }
            if (map.containsKey(str2)) {
                ((C132576Ui) map.get(str2)).A0A.add(r3);
            }
            if (map.containsKey(str2) && r9.A08.get(str2) != null) {
                C132576Ui r132 = (C132576Ui) map.get(str2);
                AnonymousClass6W6 r112 = r132.A04;
                String string = AnonymousClass6W6.A00(r112).getString("original_token_string", (String) null);
                long A09 = C36371kC.A09(r132.A06) - C36341k9.A0B(AnonymousClass6W6.A00(r112), "base_timestamp");
                byte[] bArr = null;
                if (string != null) {
                    if (AnonymousClass6W6.A00(r112).getInt("redeem_count", -1) >= AnonymousClass6W6.A00(r112).getInt("max_redeem_count", -1) || A09 >= C36341k9.A0B(AnonymousClass6W6.A00(r112), "max_time_to_live_in_sec")) {
                        decode = Base64.decode(string, 8);
                        if (!r132.A0E) {
                            r132.A08.execute(new C1496972k(r132, 23));
                            A012 = C36371kC.A01(AnonymousClass6W6.A00(r112), "token_not_ready_reason");
                        } else {
                            r8 = new C121205sl(decode, (byte[]) null, 13);
                        }
                    } else {
                        int i2 = AnonymousClass6W6.A00(r112).getInt("redeem_count", -1) + 1;
                        AnonymousClass6W6.A01(r112, "redeem_count", i2);
                        int i3 = AnonymousClass6W6.A00(r112).getInt("lead_redeem_count_to_prefetch", 0);
                        int i4 = AnonymousClass6W6.A00(r112).getInt("lead_time_to_prefetch_sec", 0);
                        if (i2 >= i3 || (A09 > C36341k9.A0B(AnonymousClass6W6.A00(r112), "max_time_to_live_in_sec") - ((long) i4) && !r132.A0E)) {
                            r132.A08.execute(new C1496972k(r132, 24));
                        }
                        decode = Base64.decode(string, 8);
                        String string2 = AnonymousClass6W6.A00(r112).getString("shared_secret_string", (String) null);
                        if (string2 != null) {
                            bArr = Base64.decode(string2, 8);
                        }
                        A012 = 0;
                        r112.A04(0);
                    }
                    r8 = new C121205sl(decode, bArr, A012);
                } else if (!r132.A0E) {
                    r132.A08.execute(new C1496972k(r132, 22));
                    r112.A04(13);
                    r8 = new C121205sl((byte[]) null, (byte[]) null, 13);
                } else {
                    r8 = new C121205sl((byte[]) null, (byte[]) null, C36371kC.A01(AnonymousClass6W6.A00(r112), "token_not_ready_reason"));
                }
                byte[] bArr2 = r8.A01;
                if (!(bArr2 == null || r8.A02 == null)) {
                    String A002 = A00(r8);
                    if (TextUtils.isEmpty(A002)) {
                        i = 2;
                        r5.A0C(i);
                        AnonymousClass6KZ.A00(r3, str2);
                    }
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append(Base64.encodeToString(bArr2, 10));
                    String A0p = AnonymousClass000.A0p("+", A002, A0u);
                    if (!C36431kI.A1Y(r5.A06)) {
                        r5.A01 = A0p;
                        AnonymousClass6VU.A03(r5);
                    }
                    AnonymousClass6KZ.A00(r3, str2);
                }
            }
            if (!this.A03.A09()) {
                i = 4;
                r5.A0C(i);
                AnonymousClass6KZ.A00(r3, str2);
            }
        } catch (Exception unused) {
            Log.e("ACSTokenProviderImpl/generateACSToken Exception while generating ACS token");
            this.A00.A0E("ACSTokenProviderImpl/generateACSToken", "Exception while generating ACS token", true);
            r5.A0C(5);
            AnonymousClass6KZ.A00(r3, str2);
        }
    }

    public C142566p5(C19700wN r1, C124635yY r2, C19600wD r3, C20810yC r4) {
        this.A02 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r3;
    }
}
