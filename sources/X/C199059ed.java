package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.AbstractCollection;

/* renamed from: X.9ed  reason: invalid class name and case insensitive filesystem */
public class C199059ed {
    public static final C20070wy A0D;
    public static final C20760y7 A0E;
    public static final C20760y7 A0F;
    public static final C20760y7 A0G;
    public final AnonymousClass171 A00;
    public final C18820ts A01;
    public final AnonymousClass1A5 A02;
    public final C24881Ed A03;
    public final AnonymousClass16U A04;
    public final C29121Vk A05;
    public final C24631De A06;
    public final C195479Ul A07;
    public final AnonymousClass6PS A08;
    public final C24611Dc A09;
    public final C179128jE A0A;
    public final AnonymousClass9FM A0B;
    public final C19770wU A0C;

    static {
        C227315o r1 = new C227315o();
        A00(r1, 404);
        A00(r1, 440);
        A00(r1, 442);
        A00(r1, 443);
        C20760y7 build = r1.build();
        A0F = build;
        C227315o r12 = new C227315o();
        r12.addAll(build);
        r12.add((Object) 11502);
        r12.add((Object) 17010);
        A00(r12, 11455);
        A00(r12, 11466);
        A00(r12, 4002);
        A00(r12, 11481);
        A00(r12, 11478);
        A00(r12, 11480);
        A00(r12, 11465);
        A00(r12, 11479);
        A00(r12, 12750);
        A00(r12, 20951);
        C20760y7 build2 = r12.build();
        A0G = build2;
        C227315o r13 = new C227315o();
        r13.addAll(build);
        r13.add((Object) 11502);
        r13.add((Object) 17010);
        A00(r13, 11503);
        A00(r13, 11495);
        C20760y7 build3 = r13.build();
        A0E = build3;
        C20090x0 r14 = new C20090x0();
        r14.put("pay-precheck", build2);
        r14.put("upi-accept-collect", build3);
        A0D = r14.build();
    }

    public C199059ed(AnonymousClass171 r2, C18820ts r3, AnonymousClass1A5 r4, C24881Ed r5, C29121Vk r6, C24631De r7, C195479Ul r8, AnonymousClass6PS r9, C24611Dc r10, C179128jE r11, AnonymousClass9FM r12, C19770wU r13) {
        AnonymousClass16U r0 = AnonymousClass16W.A05;
        this.A0A = r11;
        this.A0C = r13;
        this.A00 = r2;
        this.A01 = r3;
        this.A09 = r10;
        this.A04 = r0;
        this.A05 = r6;
        this.A07 = r8;
        this.A06 = r7;
        this.A08 = r9;
        this.A03 = r5;
        this.A02 = r4;
        this.A0B = r12;
    }

    public void A01(Context context, C202059ky r10, C193629Mf r11, String str) {
        C24611Dc r2;
        StringBuilder sb;
        String str2;
        int i;
        Object[] objArr;
        AnonymousClass9FM r22;
        String str3;
        Object obj;
        AnonymousClass16X r23;
        Object obj2 = A0D.get(str);
        C18740tg.A06(obj2);
        if (C36381kD.A1Z((AbstractCollection) obj2, r10.A00)) {
            C179128jE r6 = this.A0A;
            if (!AEA.A02(r6, str, r10.A00, false)) {
                int i2 = r10.A00;
                if (i2 != 4002) {
                    if (i2 != 11455) {
                        if (i2 == 11495) {
                            this.A09.A06(AnonymousClass000.A0r("collect request expired; showErrorAndFinish; error code: ", AnonymousClass000.A0u(), i2));
                            AVb.A00(this.A0C, this, r11, 20);
                            C24631De r1 = this.A06;
                            if (r1.A01() == null || (r23 = r11.A00) == null) {
                                str3 = r6.getString(R.string.f12nameremoved);
                            } else {
                                str3 = r1.A01().B7d(this.A01, r23);
                            }
                            r22 = this.A0B;
                            i = R.string.f12nameremoved;
                            objArr = new Object[2];
                            obj = r11.A04;
                            objArr[0] = obj;
                            objArr[1] = str3;
                            r22.A00.A4d(new C199729fr(i), String.valueOf(r10.A00), objArr);
                            return;
                        } else if (i2 == 12750) {
                            this.A09.A06(AnonymousClass000.A0r("request has been cancelled; showErrorAndFinish; error code: ", AnonymousClass000.A0u(), i2));
                            String str4 = r11.A02;
                            UserJid userJid = r11.A01;
                            if (userJid != null) {
                                str4 = this.A00.A0H(this.A02.A01(userJid));
                            }
                            r22 = this.A0B;
                            i = R.string.f12nameremoved;
                            objArr = new Object[]{str4};
                            r22.A00.A4d(new C199729fr(i), String.valueOf(r10.A00), objArr);
                            return;
                        } else if (i2 == 17010) {
                            AnonymousClass3SJ.A01(r6, 26);
                            return;
                        } else if (i2 != 20951) {
                            if (i2 != 11465) {
                                if (i2 != 11466) {
                                    if (i2 != 11502) {
                                        if (i2 != 11503) {
                                            switch (i2) {
                                                case 11478:
                                                case 11480:
                                                case 11481:
                                                    break;
                                                case 11479:
                                                    break;
                                                default:
                                                    return;
                                            }
                                        } else {
                                            String A012 = this.A08.A01(i2);
                                            AnonymousClass9FM r5 = this.A0B;
                                            String valueOf = String.valueOf(r10.A00);
                                            r5.A00.A4d(new C199729fr(R.string.f12nameremoved, A012), valueOf, new Object[0]);
                                            return;
                                        }
                                    }
                                }
                            }
                            this.A07.A00(context, r11.A01, (AnonymousClass9YX) null, (C23054B2a) null, (Boolean) null);
                            r2 = this.A09;
                            sb = AnonymousClass000.A0u();
                            str2 = "invalid receiver vpa; showErrorAndFinish; error code: ";
                            sb.append(str2);
                            sb.append(i2);
                        } else {
                            Bundle A072 = AnonymousClass001.A07();
                            A072.putInt("error_code", i2);
                            AnonymousClass3SJ.A02(r6, A072, 33);
                            return;
                        }
                    }
                    this.A09.A06("sender max transactions or max amount per day limit; showErrorAndFinish");
                    str3 = this.A04.B7e(this.A01, new BigDecimal(100000));
                    r22 = this.A0B;
                    i = R.string.f12nameremoved;
                    objArr = new Object[2];
                    obj = C36401kF.A0j();
                    objArr[0] = obj;
                    objArr[1] = str3;
                    r22.A00.A4d(new C199729fr(i), String.valueOf(r10.A00), objArr);
                    return;
                }
                this.A05.A09((AnonymousClass1XD) null);
                r2 = this.A09;
                sb = AnonymousClass000.A0u();
                str2 = "invalid sender vpa; showErrorAndFinish; get-methods; error code: ";
                sb.append(str2);
                sb.append(i2);
            } else {
                return;
            }
        } else {
            r2 = this.A09;
            sb = AnonymousClass000.A0v(str);
            sb.append(" error; showErrorAndFinish; error code: ");
            sb.append(r10);
        }
        C165607th.A1E(r2, sb);
        this.A0B.A00.A4Z(r10);
    }

    public static void A00(C227315o r1, int i) {
        r1.add((Object) Integer.valueOf(i));
    }
}
