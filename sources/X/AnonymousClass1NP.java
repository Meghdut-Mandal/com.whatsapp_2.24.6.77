package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.1NP  reason: invalid class name */
public final class AnonymousClass1NP {
    public final AnonymousClass17Y A00;
    public final AnonymousClass1NS A01;
    public final C24361Cd A02;
    public final C19970wo A03;
    public final C19420v0 A04;
    public final C20310xM A05;
    public final C238019x A06;
    public final AnonymousClass1NQ A07;
    public final AnonymousClass1NR A08;

    public AnonymousClass1NP(AnonymousClass17Y r2, AnonymousClass1NS r3, AnonymousClass1NQ r4, AnonymousClass1NR r5, C24361Cd r6, C19970wo r7, C19420v0 r8, C20310xM r9, C238019x r10) {
        AnonymousClass00C.A0D(r10, 1);
        AnonymousClass00C.A0D(r9, 2);
        AnonymousClass00C.A0D(r7, 3);
        AnonymousClass00C.A0D(r8, 4);
        AnonymousClass00C.A0D(r4, 5);
        AnonymousClass00C.A0D(r5, 6);
        AnonymousClass00C.A0D(r2, 7);
        AnonymousClass00C.A0D(r3, 9);
        this.A06 = r10;
        this.A05 = r9;
        this.A03 = r7;
        this.A04 = r8;
        this.A07 = r4;
        this.A08 = r5;
        this.A00 = r2;
        this.A02 = r6;
        this.A01 = r3;
    }

    public final void A02(UserJid userJid, String str, String str2, int i) {
        String str3;
        UserJid userJid2 = userJid;
        AnonymousClass00C.A0D(userJid2, 2);
        AnonymousClass1NQ r2 = this.A07;
        int i2 = i;
        C121305sv r1 = new C121305sv(this, userJid2, i2);
        AnonymousClass19A r10 = r2.A00;
        String A09 = r10.A09();
        Log.i("bizOptOutHandler/sendSetOptOutListRequest");
        if (i2 == 1) {
            str3 = "unblock";
        } else {
            str3 = "block";
        }
        AnonymousClass2lL r4 = new AnonymousClass2lL(userJid2, A09, str3, str, str2);
        C203399nx r12 = r4.A00;
        AnonymousClass00C.A08(r12);
        r10.A0K(new C35921jT(r4, new C119075pC(r2, r1), 0), r12, A09, 427, 20000);
    }

    public final boolean A03(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 1);
        AnonymousClass9HQ r4 = new AnonymousClass9HQ(userJid, (String) null);
        SharedPreferences A002 = this.A08.A00.A00("biz_opt_out");
        AnonymousClass00C.A08(A002);
        String string = A002.getString(AnonymousClass1NR.A00(r4), new JSONObject().toString());
        if (string == null) {
            string = new JSONObject().toString();
        }
        AnonymousClass00C.A0B(string);
        if (new JSONObject(string).optInt(String.valueOf(0), 1) == 0) {
            return true;
        }
        return false;
    }

    private final void A00(AnonymousClass9HQ r6, String str, int i) {
        AnonymousClass1NR r1 = this.A08;
        AnonymousClass00C.A0D(r6, 2);
        SharedPreferences A002 = r1.A00.A00("biz_opt_out");
        AnonymousClass00C.A08(A002);
        String A003 = AnonymousClass1NR.A00(r6);
        String string = A002.getString(A003, new JSONObject().toString());
        if (string == null) {
            string = new JSONObject().toString();
        }
        AnonymousClass00C.A0B(string);
        JSONObject jSONObject = new JSONObject(string);
        jSONObject.put(String.valueOf(0), i);
        String obj = jSONObject.toString();
        AnonymousClass00C.A08(obj);
        A002.edit().putString(A003, obj).apply();
        C19420v0.A00(this.A04).putString("biz_opt_out_dhash", str).apply();
    }

    public static final void A01(AnonymousClass9HR r7, AnonymousClass1NP r8, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass9HR r0 = (AnonymousClass9HR) it.next();
            r8.A00(r0.A01, str, r0.A00);
        }
        AnonymousClass9HQ r02 = r7.A01;
        UserJid userJid = r02.A00;
        if (userJid != null) {
            int i = r7.A00;
            r8.A00(r02, str, i);
            C238019x r1 = r8.A06;
            AnonymousClass2cM r2 = new AnonymousClass2cM(r1.A01.A02(userJid, true), C19970wo.A00(r8.A03));
            r2.A01 = 0;
            r2.A00 = i;
            r8.A05.A0Q(r2, -1);
        }
    }
}
