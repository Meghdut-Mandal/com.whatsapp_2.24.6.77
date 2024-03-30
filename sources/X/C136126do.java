package X;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.whatsapp.R;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6do  reason: invalid class name and case insensitive filesystem */
public class C136126do implements RemoteViewsService.RemoteViewsFactory {
    public final Context A00;
    public final C19700wN A01;
    public final AnonymousClass18U A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass171 A04;
    public final C19970wo A05;
    public final C18820ts A06;
    public final C20600xp A07;
    public final ArrayList A08 = AnonymousClass001.A0I();

    public long getItemId(int i) {
        return (long) i;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public int getCount() {
        return this.A08.size();
    }

    public RemoteViews getViewAt(int i) {
        ArrayList arrayList = this.A08;
        if (i >= arrayList.size()) {
            return null;
        }
        RemoteViews remoteViews = new RemoteViews(this.A00.getPackageName(), R.layout.f9nameremoved);
        C123125vz r5 = (C123125vz) arrayList.get(i);
        remoteViews.setTextViewText(R.id.heading, r5.A02);
        remoteViews.setTextViewText(R.id.content, r5.A01);
        remoteViews.setTextViewText(R.id.date, r5.A04);
        remoteViews.setContentDescription(R.id.date, r5.A03);
        Intent A0D = C36431kI.A0D();
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("jid", AnonymousClass143.A03(r5.A00));
        A0D.putExtras(A072);
        remoteViews.setOnClickFillInIntent(R.id.widget_row, A0D);
        return remoteViews;
    }

    public void onCreate() {
        Log.i("widgetviewsfactory/oncreate");
        onDataSetChanged();
    }

    public void onDataSetChanged() {
        Log.i("widgetviewsfactory/ondatasetchanged");
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ArrayList arrayList = WidgetProvider.A0A;
            ArrayList arrayList2 = this.A08;
            arrayList2.clear();
            if (arrayList != null && this.A02.A07()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass3T1 A0l = C36391kE.A0l(it);
                    C123125vz r2 = new C123125vz();
                    AnonymousClass11F r4 = A0l.A1J.A00;
                    if (r4 == null) {
                        this.A01.A0E("UnexpectedNull/WidgetViewsFactory/ChatJID", (String) null, true);
                    }
                    AnonymousClass141 A0D = this.A03.A0D(r4);
                    r2.A00 = r4;
                    r2.A02 = AnonymousClass3TB.A02(this.A04.A0H(A0D));
                    r2.A01 = this.A07.A0F(A0D, A0l, false, false, true);
                    C19970wo r5 = this.A05;
                    C18820ts r42 = this.A06;
                    r2.A04 = AnonymousClass3UY.A0F(r42, r5.A08(A0l.A0I), false);
                    r2.A03 = AnonymousClass3UY.A0F(r42, r5.A08(A0l.A0I), true);
                    arrayList2.add(r2);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public void onDestroy() {
        Log.i("widgetviewsfactory/ondestroy");
    }

    public C136126do(Context context, C19700wN r3, AnonymousClass18U r4, AnonymousClass16D r5, AnonymousClass171 r6, C19970wo r7, C18820ts r8, C20600xp r9) {
        this.A05 = r7;
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = r8;
        this.A07 = r9;
    }
}
