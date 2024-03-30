package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.util.Log;

/* renamed from: X.1Io  reason: invalid class name and case insensitive filesystem */
public class C26021Io {
    public C34061gO A00;
    public Handler A01;
    public Runnable A02;
    public final C19630wG A03;
    public final C19730wQ A04;
    public final AnonymousClass1A6 A05;
    public final C21060yb A06;
    public final C220412q A07;
    public final C24541Cv A08;
    public final C26031Ip A09;
    public final AnonymousClass1CR A0A;

    public synchronized Handler A00() {
        Handler handler;
        handler = this.A01;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("update_widget", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A01 = handler;
        }
        return handler;
    }

    public synchronized void A01() {
        C19630wG r5 = this.A03;
        Context context = r5.A00;
        Class<WidgetProvider> cls = WidgetProvider.class;
        try {
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, cls));
            if (appWidgetIds != null && appWidgetIds.length > 0) {
                Intent intent = new Intent(context, cls);
                intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
                intent.putExtra("appWidgetIds", appWidgetIds);
                context.sendBroadcast(intent);
            }
        } catch (RuntimeException e) {
            Log.e("widgetprovider/getAppWidgetIds failed", e);
        }
        C26031Ip r0 = this.A09;
        C26041Iq A002 = r0.A00(context);
        if (!(A002 == null || A002 == r0.A01)) {
            if (this.A02 == null) {
                C19730wQ r2 = this.A04;
                C220412q r6 = this.A07;
                C21060yb r4 = this.A06;
                C24541Cv r7 = this.A08;
                AnonymousClass1CR r10 = this.A0A;
                AnonymousClass1A6 r3 = this.A05;
                C34061gO r8 = this.A00;
                if (r8 == null) {
                    r8 = (C34061gO) ((C18800tq) C18810tr.A00(context, C18800tq.class)).AfI.A00.A2j.get();
                    this.A00 = r8;
                }
                this.A02 = new C80813w0(r2, r3, r4, r5, r6, r7, r8, A002, r10);
            }
            A00().removeCallbacks(this.A02);
            A00().post(this.A02);
        }
    }

    public C26021Io(C19730wQ r1, AnonymousClass1A6 r2, C21060yb r3, C19630wG r4, C220412q r5, C24541Cv r6, C26031Ip r7, AnonymousClass1CR r8) {
        this.A03 = r4;
        this.A04 = r1;
        this.A07 = r5;
        this.A06 = r3;
        this.A09 = r7;
        this.A08 = r6;
        this.A0A = r8;
        this.A05 = r2;
    }
}
