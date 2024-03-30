package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: X.1Hx  reason: invalid class name and case insensitive filesystem */
public class C25851Hx {
    public AnonymousClass1IO A00;
    public AnonymousClass1IO A01;
    public C20810yC A02;
    public final AnonymousClass1IL A03;
    public final C19970wo A04;
    public final AnonymousClass1IN A05;
    public final C25861Hy A06;

    public static void A00(C25851Hx r2, AnonymousClass9Xu r3) {
        try {
            r2.A01.A00.A00("entry_point_conversions_for_sending").edit().putString(r3.A04.getRawString(), r3.A00()).apply();
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("CTWA: EntryPointConversionStore/updateConversion/json error");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public void A02(UserJid userJid, String str, String str2, long j, long j2) {
        AnonymousClass9TX r8;
        C20810yC r82 = this.A02;
        C21000yV r7 = C21000yV.A02;
        UserJid userJid2 = userJid;
        String str3 = str;
        String str4 = str2;
        long j3 = j;
        if (C20800yB.A01(r7, r82, 6122)) {
            if (userJid == null || str == null) {
                r8 = new AnonymousClass54P();
            } else {
                r8 = new C175408aR(userJid2, str3, str4, j3, -1, false);
            }
            this.A05.A04(r8);
            return;
        }
        AnonymousClass9Xu r6 = new AnonymousClass9Xu(new AnonymousClass9O3(userJid2, str3, str4, j3, j2));
        AnonymousClass1IO r1 = this.A01;
        AnonymousClass9Xu A012 = r1.A01(r6.A04);
        if (A012 == null) {
            r1.A03(r6);
        } else if (System.currentTimeMillis() - A012.A03 > TimeUnit.DAYS.toMillis((long) C20800yB.A00(r7, r82, 3017))) {
            A00(this, r6);
        }
    }

    public C25851Hx(C19970wo r3, AnonymousClass1IN r4, C25861Hy r5, AnonymousClass1IL r6, C20810yC r7, C19890wg r8) {
        this.A02 = r7;
        this.A04 = r3;
        this.A06 = r5;
        this.A05 = r4;
        this.A03 = r6;
        this.A01 = new AnonymousClass1IO(r8, "entry_point_conversions_for_sending");
        this.A00 = new AnonymousClass1IO(r8, "entry_point_conversions_for_logging");
    }

    public static void A01(C25851Hx r8, AnonymousClass1IO r9) {
        Iterator it = r9.A02().iterator();
        while (it.hasNext()) {
            AnonymousClass9Xu r4 = (AnonymousClass9Xu) it.next();
            if (System.currentTimeMillis() - r4.A03 > TimeUnit.DAYS.toMillis((long) C20800yB.A00(C21000yV.A02, r8.A02, 3017))) {
                r9.A00.A00(r9.A01).edit().remove(r4.A04.getRawString()).apply();
            }
        }
    }
}
