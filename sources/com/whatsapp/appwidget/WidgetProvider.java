package com.whatsapp.appwidget;

import X.AnonymousClass000;
import X.AnonymousClass17Y;
import X.AnonymousClass18U;
import X.AnonymousClass190;
import X.AnonymousClass1A6;
import X.AnonymousClass3M9;
import X.AnonymousClass3T1;
import X.C18820ts;
import X.C18830tt;
import X.C220412q;
import X.C24541Cv;
import X.C26021Io;
import X.C36321k7;
import X.C36331k8;
import X.C36421kH;
import X.C36441kJ;
import X.C56042vd;
import X.C64933Qa;
import X.C65743Th;
import X.C80853w4;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.widget.RemoteViews;
import com.whatsapp.R;
import java.util.ArrayList;

public class WidgetProvider extends AppWidgetProvider {
    public static ArrayList A0A;
    public AnonymousClass17Y A00;
    public C26021Io A01;
    public AnonymousClass18U A02;
    public AnonymousClass1A6 A03;
    public C18820ts A04;
    public C220412q A05;
    public C24541Cv A06;
    public C80853w4 A07;
    public final Object A08;
    public volatile boolean A09;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r5 != 0) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAppWidgetOptionsChanged(android.content.Context r7, android.appwidget.AppWidgetManager r8, int r9, android.os.Bundle r10) {
        /*
            r6 = this;
            if (r10 == 0) goto L_0x0023
            java.lang.String r0 = "appWidgetMinWidth"
            int r4 = r10.getInt(r0)
            java.lang.String r0 = "appWidgetMinHeight"
            int r5 = r10.getInt(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "widgetprovider/onappwidgetoptionschanged "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "x"
            X.C36321k7.A1T(r0, r1, r5)
            if (r4 == 0) goto L_0x0023
            if (r5 != 0) goto L_0x0029
        L_0x0023:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x0029:
            X.18U r1 = r6.A02
            X.0ts r2 = r6.A04
            r0 = r7
            r3 = r9
            android.widget.RemoteViews r0 = A00(r0, r1, r2, r3, r4, r5)
            r8.updateAppWidget(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.WidgetProvider.onAppWidgetOptionsChanged(android.content.Context, android.appwidget.AppWidgetManager, int, android.os.Bundle):void");
    }

    public void onReceive(Context context, Intent intent) {
        try {
            if (!this.A09) {
                synchronized (this.A08) {
                    if (!this.A09) {
                        C18830tt.APF(C56042vd.A00(context), this);
                        this.A09 = true;
                    }
                }
            }
            super.onReceive(context, intent);
        } catch (BadParcelableException unused) {
        }
    }

    public WidgetProvider(int i) {
        this.A09 = false;
        this.A08 = C36441kJ.A11();
    }

    public static RemoteViews A00(Context context, AnonymousClass18U r8, C18820ts r9, int i, int i2, int i3) {
        Intent A032;
        String str;
        Intent A033;
        int i4;
        boolean A042 = r8.A04();
        if (i2 <= 100 || i3 <= 100) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.f9nameremoved);
            ArrayList arrayList = A0A;
            if (arrayList != null) {
                int size = arrayList.size();
                remoteViews.setTextViewText(R.id.count, Integer.toString(size));
                float f = 30.0f;
                if (i2 < 100) {
                    if (size > 99) {
                        f = 14.0f;
                    } else if (size > 9) {
                        f = 20.0f;
                    }
                }
                remoteViews.setFloat(R.id.count, "setTextSize", f);
            }
            if (A042) {
                A032 = AnonymousClass190.A09(context);
            } else {
                A032 = AnonymousClass190.A03(context);
            }
            remoteViews.setOnClickPendingIntent(R.id.header, C65743Th.A03(context, A032, 1));
            return remoteViews;
        }
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.f9nameremoved);
        ArrayList arrayList2 = A0A;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            if (size2 > 0) {
                boolean A043 = C64933Qa.A04((AnonymousClass3T1) arrayList2.get(0));
                int i5 = R.plurals.f10nameremoved;
                if (A043) {
                    i5 = R.plurals.f10nameremoved;
                }
                str = C36331k8.A0g(r9, size2, 0, i5);
                remoteViews2.setViewVisibility(R.id.subtitle, 0);
            } else {
                str = context.getString(R.string.f12nameremoved);
                remoteViews2.setViewVisibility(R.id.subtitle, 8);
            }
        } else {
            str = "";
        }
        remoteViews2.setTextViewText(R.id.subtitle, str);
        Intent A0H = C36441kJ.A0H(context, WidgetService.class);
        A0H.putExtra("appWidgetId", i);
        C36421kH.A0n(A0H, A0H.toUri(1));
        remoteViews2.setRemoteAdapter(i, R.id.list_view_widget, A0H);
        Intent A0F = AnonymousClass190.A0F(context, 0);
        A0F.setAction("android.intent.action.VIEW");
        AnonymousClass3M9.A02(A0F, "WidgetProvider");
        int i6 = 134217728;
        C65743Th.A05(A0F, 134217728);
        if (C65743Th.A02) {
            i6 = 167772160;
        }
        remoteViews2.setPendingIntentTemplate(R.id.list_view_widget, PendingIntent.getActivity(context, 1, A0F, i6));
        if (A042) {
            A033 = AnonymousClass190.A09(context);
        } else {
            A033 = AnonymousClass190.A03(context);
        }
        remoteViews2.setOnClickPendingIntent(R.id.header, C65743Th.A03(context, A033, 1));
        remoteViews2.setEmptyView(R.id.list_view_widget, R.id.empty_view);
        if (!r8.A07()) {
            boolean A1W = C36421kH.A1W(r8);
            i4 = R.string.f12nameremoved;
            if (A1W) {
                i4 = R.string.f12nameremoved;
            }
        } else {
            i4 = R.string.f12nameremoved;
        }
        remoteViews2.setTextViewText(R.id.empty_view, context.getString(i4));
        return remoteViews2;
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("widgetprovider/update ");
        int[] iArr2 = iArr;
        C36321k7.A1Y(A0u, iArr.length);
        C80853w4 r0 = this.A07;
        if (r0 != null) {
            r0.A07.set(true);
            this.A01.A00().removeCallbacks(this.A07);
        }
        AnonymousClass17Y r4 = this.A00;
        C220412q r8 = this.A05;
        Context context2 = context;
        AppWidgetManager appWidgetManager2 = appWidgetManager;
        this.A07 = new C80853w4(appWidgetManager2, context2, r4, this.A02, this.A03, this.A04, r8, this.A06, iArr2);
        this.A01.A00().post(this.A07);
        super.onUpdate(context, appWidgetManager, iArr);
    }

    public WidgetProvider() {
        this(0);
    }
}
