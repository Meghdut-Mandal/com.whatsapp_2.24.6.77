package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3w4  reason: invalid class name and case insensitive filesystem */
public class C80853w4 implements Runnable {
    public final AppWidgetManager A00;
    public final Context A01;
    public final AnonymousClass18U A02;
    public final AnonymousClass1A6 A03;
    public final C18820ts A04;
    public final C220412q A05;
    public final C24541Cv A06;
    public final AtomicBoolean A07 = new AtomicBoolean();
    public final int[] A08;
    public final AnonymousClass17Y A09;

    public void run() {
        AtomicBoolean atomicBoolean = this.A07;
        if (!atomicBoolean.get()) {
            ArrayList A092 = this.A03.A09();
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = A092.iterator();
            while (it.hasNext()) {
                AnonymousClass11F A0a = C36401kF.A0a(it);
                if (!atomicBoolean.get()) {
                    int A022 = this.A05.A02(A0a);
                    if (A022 > 0) {
                        A0I.addAll(this.A06.A07(A0a, Math.min(A022, 100)));
                    }
                } else {
                    return;
                }
            }
            Collections.sort(A0I, C81693xQ.A00);
            this.A09.A0H(new AVa(this, A0I, 0));
        }
    }

    public C80853w4(AppWidgetManager appWidgetManager, Context context, AnonymousClass17Y r4, AnonymousClass18U r5, AnonymousClass1A6 r6, C18820ts r7, C220412q r8, C24541Cv r9, int[] iArr) {
        this.A01 = context;
        this.A09 = r4;
        this.A05 = r8;
        this.A02 = r5;
        this.A04 = r7;
        this.A00 = appWidgetManager;
        this.A06 = r9;
        this.A03 = r6;
        this.A08 = iArr;
    }
}
