package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.3KW  reason: invalid class name */
public class AnonymousClass3KW {
    public final AnonymousClass17Y A00;
    public final C29411Wn A01;
    public final AnonymousClass1RU A02;
    public final C19630wG A03;
    public final C25271Fq A04;
    public final C19420v0 A05;
    public final C20810yC A06;
    public final C29501Ww A07;
    public final AnonymousClass12U A08;
    public final C65563So A09;
    public final C21520zN A0A;

    public boolean A02(AnonymousClass3XC r4, boolean z) {
        if (!z || r4 == null || TextUtils.isEmpty(r4.A01)) {
            return false;
        }
        String str = r4.A04;
        return !TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str);
    }

    public Intent A00(Context context, AnonymousClass3XC r5, int i) {
        Log.i("banmanager/createBanAppealActivityIntent");
        boolean z = r5.A05;
        String str = r5.A04;
        C18740tg.A06(str);
        return AnonymousClass190.A1A(context, r5.A01, Integer.parseInt(str), i, z);
    }

    public boolean A01() {
        boolean A1a;
        int A002 = this.A08.A00();
        if (A002 == 9 || A002 == 10) {
            A1a = C36421kH.A1a(C36371kC.A0t(C36341k9.A0E(this.A09.A06), "support_ban_appeal_token"));
        } else {
            A1a = false;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BanManager/canFetchOrSubmitBanAppeal returning ");
        A0u.append(A1a);
        C36321k7.A1T(", reg_state: ", A0u, A002);
        return A1a;
    }

    public AnonymousClass3KW(AnonymousClass17Y r1, C29411Wn r2, AnonymousClass1RU r3, C19630wG r4, C25271Fq r5, C19420v0 r6, C21520zN r7, C20810yC r8, C29501Ww r9, AnonymousClass12U r10, C65563So r11) {
        this.A06 = r8;
        this.A00 = r1;
        this.A03 = r4;
        this.A0A = r7;
        this.A02 = r3;
        this.A01 = r2;
        this.A09 = r11;
        this.A07 = r9;
        this.A05 = r6;
        this.A04 = r5;
        this.A08 = r10;
    }
}
