package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.events.EventStartAlarmReceiver;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3hV  reason: invalid class name and case insensitive filesystem */
public final class C71893hV implements AnonymousClass191 {
    public final C20810yC A00;
    public final C236519h A01;
    public final C19630wG A02;
    public final C29541Xa A03;
    public final C29581Xe A04;

    public final void A04(AnonymousClass2bT r7) {
        AnonymousClass00C.A0D(r7, 0);
        Log.i("EventStartAlarmManager Scheduling alarm for event start notification");
        C236519h r0 = this.A01;
        long j = r7.A00;
        r0.A00.A02(A00(r7), 0, j, true);
    }

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public void Bas(AnonymousClass3T1 r3, int i) {
        AnonymousClass00C.A0D(r3, 0);
        if (i != -1 && i != 22) {
            return;
        }
        if (r3.A1J.A02) {
            A02(r3);
        } else {
            A03(r3, false);
        }
    }

    public void Bau(AnonymousClass3T1 r2, int i) {
        AnonymousClass00C.A0D(r2, 0);
        if (i == 41) {
            A03(r2, true);
        }
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r1) {
    }

    public void Bax(AnonymousClass3T1 r3, AnonymousClass3T1 r4) {
        C36331k8.A1I(r3, r4);
        if ((r3 instanceof AnonymousClass2bT) && (r4 instanceof AnonymousClass2bT)) {
            Log.i("EventStartAlarmManager Event message is edited");
            A01((AnonymousClass2bT) r3, this);
            if (r4.A1J.A02) {
                A02(r4);
            } else {
                A03(r4, false);
            }
        }
    }

    public /* synthetic */ void Bay(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        C54122sR.A00(this, collection, i);
    }

    public /* synthetic */ void Bb5(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Bb7(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb8(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bbc(C28981Uw r1) {
    }

    public /* synthetic */ void Bbd(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bbe(C28981Uw r1, boolean z) {
    }

    public /* synthetic */ void Bbf(C28981Uw r1) {
    }

    public /* synthetic */ void Bbr() {
    }

    public /* synthetic */ void Bci(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bck(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    private final PendingIntent A00(AnonymousClass2bT r5) {
        Context context = this.A02.A00;
        Intent A0H = C36441kJ.A0H(context, EventStartAlarmReceiver.class);
        A0H.setAction("com.whatsapp.alarm.EVENT_START_ACTION");
        C64933Qa r0 = r5.A1J;
        AnonymousClass3UJ.A00(A0H, r0);
        PendingIntent A012 = C65743Th.A01(context, r0.hashCode(), A0H, 1073741824);
        AnonymousClass00C.A08(A012);
        return A012;
    }

    public static final void A01(AnonymousClass2bT r1, C71893hV r2) {
        Log.i("EventStartAlarmManager Cancelling scheduled alarm for event start notification alarm");
        C236519h r0 = r2.A01;
        PendingIntent A002 = r2.A00(r1);
        AlarmManager A05 = r0.A00.A00.A05();
        if (A05 != null) {
            A05.cancel(A002);
        }
    }

    private final void A02(AnonymousClass3T1 r3) {
        if (r3 instanceof AnonymousClass2bT) {
            AnonymousClass2bT r32 = (AnonymousClass2bT) r3;
            if (!this.A03.A04(r32) && this.A00.A0E(7306)) {
                A04(r32);
            }
        }
    }

    private final void A03(AnonymousClass3T1 r6, boolean z) {
        if (r6 instanceof AnonymousClass2bT) {
            AnonymousClass2bT r4 = (AnonymousClass2bT) r6;
            if (!this.A03.A04(r4) && this.A00.A0E(7306)) {
                C29581Xe r3 = this.A04;
                C86734Mb r2 = new C86734Mb(this, r6, z);
                AnonymousClass00C.A0D(r4, 0);
                r3.A00(r4, "EventStartAlarmManager", new AnonymousClass4M7(r3, r2));
            }
        }
    }

    public C71893hV(C236519h r1, C19630wG r2, C29541Xa r3, C29581Xe r4, C20810yC r5) {
        C36321k7.A1B(r2, r5, r1, r4, r3);
        this.A02 = r2;
        this.A00 = r5;
        this.A01 = r1;
        this.A04 = r4;
        this.A03 = r3;
    }

    public void Bb6(Collection collection, Map map) {
        ArrayList<AnonymousClass2bT> A0l = C36341k9.A0l(collection);
        for (Object next : collection) {
            if (next instanceof AnonymousClass2bT) {
                A0l.add(next);
            }
        }
        for (AnonymousClass2bT A012 : A0l) {
            A01(A012, this);
        }
    }

    public void Bb9(Collection collection) {
        ArrayList A0l = C36341k9.A0l(collection);
        for (Object next : collection) {
            if (next instanceof AnonymousClass2bT) {
                A0l.add(next);
            }
        }
        Iterator it = A0l.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l2 = C36391kE.A0l(it);
            if (A0l2.A1J.A02) {
                A02(A0l2);
            } else {
                A03(A0l2, false);
            }
        }
    }
}
