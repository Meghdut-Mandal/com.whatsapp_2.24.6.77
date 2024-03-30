package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.73y  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1500973y implements Runnable {
    public final /* synthetic */ AnonymousClass11F A00;
    public final /* synthetic */ AnonymousClass71E A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C1500973y(AnonymousClass11F r1, AnonymousClass71E r2, String str, String str2, String str3, String str4, boolean z) {
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r1;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = z;
    }

    public final void run() {
        UserJid userJid;
        Integer num;
        AnonymousClass9Xu r0;
        String str;
        String str2;
        C23043B1o b1o;
        C207219uk BA8;
        C207089uX r02;
        AnonymousClass71E r5 = this.A01;
        String str3 = this.A02;
        String str4 = this.A03;
        AnonymousClass11F r9 = this.A00;
        String str5 = this.A04;
        String str6 = this.A05;
        boolean z = this.A06;
        String valueOf = String.valueOf(str4);
        AnonymousClass3T1 A032 = r5.A06.A03(new C64933Qa(r9, valueOf, false));
        JSONObject A1B = C36441kJ.A1B();
        try {
            A1B.put("cta", str6);
            A1B.put("flow_id", str5);
            A1B.put("extensions_message_id", C132586Uj.A00.A02(r5.A02, valueOf, false));
            String A0b = C90464aC.A0b(str3);
            AnonymousClass00C.A08(A0b);
            A1B.put("session_id", A0b);
        } catch (JSONException e) {
            Log.w(C36331k8.A0i("SendExtensionsResponseMessage/sendWamEvent/", AnonymousClass000.A0u(), e));
        }
        Object obj = null;
        if (r9 instanceof UserJid) {
            userJid = (UserJid) r9;
            if (userJid != null) {
                num = Integer.valueOf(C110465ai.A00(r5.A01.A02(userJid)));
                r0 = r5.A03.A01.A01(userJid);
            }
            num = null;
            r0 = null;
        } else {
            userJid = null;
            num = null;
            r0 = null;
        }
        AnonymousClass6NP r8 = r5.A05;
        String A0y = C36381kD.A0y(A1B);
        if (r0 != null) {
            str = r0.A06;
            str2 = r0.A05;
        } else {
            str = null;
            str2 = null;
        }
        r8.A01(userJid, A032, num, A0y, str, str2, valueOf, 2);
        if ((A032 instanceof C23043B1o) && (b1o = (C23043B1o) A032) != null && (BA8 = b1o.BA8()) != null && BA8.A00 == 5 && (r02 = BA8.A04) != null) {
            Iterator it = r02.A03.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C90504aG.A1X(next, str6)) {
                    obj = next;
                    break;
                }
            }
            C206569tc r2 = (C206569tc) obj;
            if (r2 != null) {
                r2.A00 = z;
            }
            r5.A04.A0k(A032);
        }
    }
}
