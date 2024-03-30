package X;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.1XR  reason: invalid class name */
public class AnonymousClass1XR {
    public final Handler A00 = new C35951jW(Looper.getMainLooper(), this);
    public final AnonymousClass19J A01;
    public final C20510xg A02;
    public final AnonymousClass1XS A03;
    public final HashMap A04 = new HashMap();
    public final C20810yC A05;
    public final AnonymousClass19A A06;

    public static void A00(AnonymousClass1XR r6, AnonymousClass11F r7) {
        AnonymousClass19A r4 = r6.A06;
        C35901jR r5 = new C35901jR();
        AnonymousClass6QB r3 = new AnonymousClass6QB("chatstate");
        if (C203539oF.A0J(r7, "to", Arrays.asList(new Class[]{AnonymousClass147.class, UserJid.class}), false)) {
            r3.A04(new AnonymousClass1AL((Jid) r7, "to"));
        }
        ConditionVariable conditionVariable = C18740tg.A00;
        r3.A06(r5.A00);
        r4.A0G(r3.A03(), 5);
        StringBuilder sb = new StringBuilder();
        sb.append("HandleMeComposing/write/paused; toJid=");
        sb.append(r7);
        Log.i(sb.toString());
    }

    public static void A01(AnonymousClass1XR r7, AnonymousClass11F r8, int i) {
        String str;
        AnonymousClass19A r4 = r7.A06;
        if (i == 1) {
            str = "audio";
        } else {
            str = null;
        }
        C35901jR r6 = new C35901jR("audio".equals(str));
        AnonymousClass6QB r5 = new AnonymousClass6QB("chatstate");
        if (C203539oF.A0J(r8, "to", Arrays.asList(new Class[]{AnonymousClass147.class, UserJid.class}), false)) {
            r5.A04(new AnonymousClass1AL((Jid) r8, "to"));
        }
        ConditionVariable conditionVariable = C18740tg.A00;
        r5.A06(r6.A00);
        r4.A0G(r5.A03(), 4);
        StringBuilder sb = new StringBuilder();
        sb.append("HandleMeComposing/sendComposing; toJid=");
        sb.append(r8);
        sb.append("; media=");
        sb.append(i);
        Log.i(sb.toString());
    }

    public AnonymousClass1XR(AnonymousClass19J r3, C20810yC r4, C20510xg r5, AnonymousClass1XS r6, AnonymousClass19A r7) {
        this.A05 = r4;
        this.A03 = r6;
        this.A06 = r7;
        this.A02 = r5;
        this.A01 = r3;
    }
}
