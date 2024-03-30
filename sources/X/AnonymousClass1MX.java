package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1MX  reason: invalid class name */
public abstract class AnonymousClass1MX extends AnonymousClass1MW {
    public void A01(Context context, Intent intent) {
        StringBuilder sb;
        String str;
        C36011jc r4 = (C36011jc) this;
        int i = r4.A01;
        String action = intent.getAction();
        switch (i) {
            case 0:
                if ("com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION".equals(action)) {
                    AtomicBoolean atomicBoolean = C20720y3.A14;
                    ((C20720y3) r4.A00).A0Z.BoM();
                    return;
                }
                return;
            case 1:
                if (!"com.whatsapp.MessageHandler.RECONNECT_ACTION".equals(action)) {
                    sb = new StringBuilder();
                    str = "MessageHandler/unknown intent received in reconnect receiver ";
                    break;
                } else {
                    Log.i("MessageHandler/reconnect");
                    ((C20720y3) r4.A00).A0B(intent.getIntExtra("connect_reason", 0));
                    return;
                }
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("xmpp/handler/logout-timer/timeout");
                sb2.append(action);
                Log.i(sb2.toString());
                if (!"com.whatsapp.MessageHandler.LOGOUT_ACTION".equals(action)) {
                    sb = new StringBuilder();
                    str = "unknown intent received in logout receiver ";
                    break;
                } else {
                    AnonymousClass1MV r42 = (AnonymousClass1MV) r4.A00;
                    C18740tg.A06(r42.A00);
                    if (!r42.A07.A02()) {
                        AnonymousClass1MV.A01(r42, action);
                        C20720y3.A01(r42.A00);
                        return;
                    } else if (r42.A00.A0I.A00() || r42.A03.A00) {
                        Log.i("xmpp/handler/logout-timer/reset");
                        if (AnonymousClass1MV.A03(r42, action)) {
                            AnonymousClass1MV.A02(r42, action);
                        }
                        r42.A06.A08();
                        return;
                    } else {
                        C20720y3 r0 = r42.A00;
                        C18740tg.A06(r0);
                        C31901cZ r2 = r0.A07;
                        if (r2 != null) {
                            r2.Bpn(false, 7);
                        } else {
                            Log.i("MessageHandler/onDoLogout ignoring due to null sending channel");
                        }
                        AnonymousClass19O r1 = r42.A08;
                        if (!r1.A05 && AnonymousClass19O.A02(r1, "xmpp-bg-to-logout")) {
                            r1.A05 = true;
                        }
                        Handler handler = r42.A02;
                        handler.sendMessage(handler.obtainMessage(3, "com.whatsapp.MessageHandler.LOGOUT_ACTION"));
                        return;
                    }
                }
        }
        sb.append(str);
        sb.append(intent);
        Log.w(sb.toString());
    }

    public void onReceive(Context context, Intent intent) {
        Boolean valueOf;
        ComponentName component;
        ComponentName component2;
        A00(context);
        AnonymousClass00C.A0D(context, 0);
        AnonymousClass00C.A0D(intent, 1);
        C19580wB r1 = (C19580wB) ((C18800tq) C18810tr.A00(context, C18800tq.class)).AfI.A00.A08.get();
        if (intent.getAction() == null && (component2 = intent.getComponent()) != null) {
            component2.getClassName();
        }
        for (C122275ua r5 : r1.getObservers()) {
            Boolean bool = false;
            int i = r5.A01.A00.A02;
            if (i == Integer.MIN_VALUE) {
                valueOf = null;
            } else {
                boolean z = false;
                if (i != 0) {
                    z = true;
                }
                valueOf = Boolean.valueOf(z);
            }
            if (bool.equals(valueOf)) {
                String action = intent.getAction();
                if (action == null && ((component = intent.getComponent()) == null || (action = component.getClassName()) == null)) {
                    C19700wN r2 = r5.A00;
                    StringBuilder sb = new StringBuilder();
                    sb.append("intent: ");
                    sb.append(intent);
                    r2.A0E("wake-up-action-null", sb.toString(), false);
                } else {
                    r5.A03.Boy(new AnonymousClass751(20, action, r5));
                }
            }
        }
        A01(context, intent);
    }
}
