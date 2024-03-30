package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6ij  reason: invalid class name and case insensitive filesystem */
public class C138806ij implements AnonymousClass7e8 {
    public static final String A04 = AnonymousClass6VD.A01("CommandHandler");
    public final Context A00;
    public final AnonymousClass6EO A01;
    public final Object A02 = C36441kJ.A11();
    public final Map A03 = AnonymousClass001.A0J();

    public static void A00(Intent intent, AnonymousClass69L r3) {
        intent.putExtra("KEY_WORKSPEC_ID", r3.A01);
        intent.putExtra("KEY_WORKSPEC_GENERATION", r3.A00);
    }

    public void BX7(AnonymousClass69L r8, boolean z) {
        synchronized (this.A02) {
            C138876iq r5 = (C138876iq) this.A03.remove(r8);
            this.A01.A00(r8);
            if (r5 != null) {
                AnonymousClass6VD A002 = AnonymousClass6VD.A00();
                String str = C138876iq.A0C;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("onExecuted ");
                AnonymousClass69L r2 = r5.A08;
                A0u.append(r2);
                A002.A04(str, C36371kC.A0z(", ", A0u, z));
                C138876iq.A00(r5);
                if (z) {
                    Intent A0H = C36441kJ.A0H(r5.A04, SystemAlarmService.class);
                    A0H.setAction("ACTION_SCHEDULE_WORK");
                    A00(A0H, r2);
                    C90504aG.A1I(r5.A06, A0H, r5.A09, r5.A03);
                }
                if (r5.A02) {
                    Intent A0H2 = C36441kJ.A0H(r5.A04, SystemAlarmService.class);
                    A0H2.setAction("ACTION_CONSTRAINTS_CHANGED");
                    C90504aG.A1I(r5.A06, A0H2, r5.A09, r5.A03);
                }
            }
        }
    }

    public C138806ij(Context context, AnonymousClass6EO r3) {
        this.A00 = context;
        this.A01 = r3;
    }

    public void A01(Intent intent, C138816ik r13, int i) {
        List<C114465hI> list;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            AnonymousClass6VD.A02(AnonymousClass6VD.A00(), intent, "Handling constraints changed ", A04, AnonymousClass000.A0u());
            Context context = this.A00;
            AnonymousClass6VR r1 = r13.A05;
            C208209xr r5 = new C208209xr((B0S) null, r1.A09);
            ArrayList BH0 = r1.A04.A0D().BH0();
            Iterator it = BH0.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                C132316Tb r12 = ((AnonymousClass6QA) it.next()).A09;
                z |= r12.A04;
                z2 |= r12.A05;
                z3 |= r12.A07;
                z4 |= C36371kC.A1W(r12.A02, C023109s.A00);
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            Intent A0I = C36441kJ.A0I("androidx.work.impl.background.systemalarm.UpdateProxies");
            A0I.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            A0I.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(A0I);
            r5.BoB(BH0);
            ArrayList A0v = C36401kF.A0v(BH0);
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = BH0.iterator();
            while (it2.hasNext()) {
                AnonymousClass6QA r4 = (AnonymousClass6QA) it2.next();
                String str = r4.A0J;
                if (currentTimeMillis >= r4.A04() && (!(!AnonymousClass00C.A0J(C132316Tb.A08, r4.A09)) || r5.A00(str))) {
                    A0v.add(r4);
                }
            }
            Iterator it3 = A0v.iterator();
            while (it3.hasNext()) {
                AnonymousClass6QA r0 = (AnonymousClass6QA) it3.next();
                String str2 = r0.A0J;
                AnonymousClass69L A002 = C109445Xp.A00(r0);
                Intent A0H = C36441kJ.A0H(context, SystemAlarmService.class);
                A0H.setAction("ACTION_DELAY_MET");
                A00(A0H, A002);
                AnonymousClass6VD A003 = AnonymousClass6VD.A00();
                String str3 = C112555e5.A00;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("Creating a delay_met command for workSpec with id (");
                A0u.append(str2);
                AnonymousClass6VD.A03(A003, ")", str3, A0u);
                C90504aG.A1I(r13, A0H, ((C138956iy) r13.A08).A02, i);
            }
            r5.reset();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            AnonymousClass6VD A004 = AnonymousClass6VD.A00();
            String str4 = A04;
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("Handling reschedule ");
            A0u2.append(intent);
            A004.A04(str4, AnonymousClass000.A0r(", ", A0u2, i));
            r13.A05.A06();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
                AnonymousClass6VD.A00();
                String str5 = A04;
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("Invalid request for ");
                A0u3.append(action);
                A0u3.append(" , requires ");
                A0u3.append("KEY_WORKSPEC_ID");
                Log.e(str5, AnonymousClass000.A0q(" .", A0u3));
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                AnonymousClass69L r6 = new AnonymousClass69L(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                AnonymousClass6VD A005 = AnonymousClass6VD.A00();
                String str6 = A04;
                AnonymousClass6VD.A02(A005, r6, "Handling schedule work for ", str6, AnonymousClass000.A0u());
                WorkDatabase workDatabase = r13.A05.A04;
                workDatabase.A06();
                try {
                    AnonymousClass6QA BJH = workDatabase.A0D().BJH(r6.A01);
                    if (BJH == null) {
                        AnonymousClass6VD.A00();
                        StringBuilder A0v2 = AnonymousClass000.A0v("Skipping scheduling ");
                        A0v2.append(r6);
                        A0v2.append(" because it's no longer in the DB");
                        AnonymousClass000.A1A(A0v2, str6);
                    } else if (AnonymousClass6GL.A01(BJH.A0E)) {
                        AnonymousClass6VD.A00();
                        StringBuilder A0v3 = AnonymousClass000.A0v("Skipping scheduling ");
                        A0v3.append(r6);
                        A0v3.append("because it is finished.");
                        AnonymousClass000.A1A(A0v3, str6);
                    } else {
                        long A042 = BJH.A04();
                        if (!(!AnonymousClass00C.A0J(C132316Tb.A08, BJH.A09))) {
                            AnonymousClass6VD A006 = AnonymousClass6VD.A00();
                            StringBuilder A0u4 = AnonymousClass000.A0u();
                            A0u4.append("Setting up Alarms for ");
                            A0u4.append(r6);
                            A006.A04(str6, C36381kD.A0z("at ", A0u4, A042));
                            C132856Vn.A01(this.A00, workDatabase, r6, A042);
                        } else {
                            AnonymousClass6VD A007 = AnonymousClass6VD.A00();
                            StringBuilder A0u5 = AnonymousClass000.A0u();
                            A0u5.append("Opportunistically setting an alarm for ");
                            A0u5.append(r6);
                            A007.A04(str6, C36381kD.A0z("at ", A0u5, A042));
                            Context context2 = this.A00;
                            C132856Vn.A01(context2, workDatabase, r6, A042);
                            Intent A0H2 = C36441kJ.A0H(context2, SystemAlarmService.class);
                            A0H2.setAction("ACTION_CONSTRAINTS_CHANGED");
                            C90504aG.A1I(r13, A0H2, ((C138956iy) r13.A08).A02, i);
                        }
                        workDatabase.A07();
                    }
                } finally {
                    AnonymousClass6Q8.A01(workDatabase);
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                synchronized (this.A02) {
                    AnonymousClass69L r52 = new AnonymousClass69L(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                    AnonymousClass6VD A008 = AnonymousClass6VD.A00();
                    String str7 = A04;
                    AnonymousClass6VD.A02(A008, r52, "Handing delay met for ", str7, AnonymousClass000.A0u());
                    Map map = this.A03;
                    if (!map.containsKey(r52)) {
                        C138876iq r42 = new C138876iq(this.A00, this.A01.A01(r52), r13, i);
                        map.put(r52, r42);
                        String str8 = r42.A08.A01;
                        Context context3 = r42.A04;
                        StringBuilder A0v4 = AnonymousClass000.A0v(str8);
                        A0v4.append(" (");
                        A0v4.append(r42.A03);
                        r42.A01 = AnonymousClass6I2.A00(context3, C90474aD.A0f(A0v4));
                        AnonymousClass6VD A009 = AnonymousClass6VD.A00();
                        String str9 = C138876iq.A0C;
                        StringBuilder A0u6 = AnonymousClass000.A0u();
                        A0u6.append("Acquiring wakelock ");
                        A0u6.append(r42.A01);
                        A0u6.append("for WorkSpec ");
                        AnonymousClass6VD.A03(A009, str8, str9, A0u6);
                        r42.A01.acquire();
                        AnonymousClass6QA BJH2 = r42.A06.A05.A04.A0D().BJH(str8);
                        if (BJH2 == null) {
                            r42.A0A.execute(new AnonymousClass759((Object) r42, 18));
                        } else {
                            boolean z5 = !AnonymousClass00C.A0J(C132316Tb.A08, BJH2.A09);
                            r42.A02 = z5;
                            if (!z5) {
                                AnonymousClass6VD A0010 = AnonymousClass6VD.A00();
                                StringBuilder A0u7 = AnonymousClass000.A0u();
                                A0u7.append("No constraints for ");
                                AnonymousClass6VD.A03(A0010, str8, str9, A0u7);
                                r42.BR2(Collections.singletonList(BJH2));
                            } else {
                                r42.A07.BoB(Collections.singletonList(BJH2));
                            }
                        }
                    } else {
                        AnonymousClass6VD A0011 = AnonymousClass6VD.A00();
                        StringBuilder A0u8 = AnonymousClass000.A0u();
                        A0u8.append("WorkSpec ");
                        A0u8.append(r52);
                        AnonymousClass6VD.A03(A0011, " is is already being handled for ACTION_DELAY_MET", str7, A0u8);
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string = extras2.getString("KEY_WORKSPEC_ID");
                if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                    int i2 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                    ArrayList A14 = C36441kJ.A14(1);
                    C114465hI A0012 = this.A01.A00(new AnonymousClass69L(string, i2));
                    list = A14;
                    if (A0012 != null) {
                        A14.add(A0012);
                        list = A14;
                    }
                } else {
                    list = this.A01.A02(string);
                }
                for (C114465hI r43 : list) {
                    AnonymousClass6VD A0013 = AnonymousClass6VD.A00();
                    String str10 = A04;
                    StringBuilder A0u9 = AnonymousClass000.A0u();
                    A0u9.append("Handing stopWork work for ");
                    AnonymousClass6VD.A03(A0013, string, str10, A0u9);
                    AnonymousClass6VR r02 = r13.A05;
                    r02.A09(r43);
                    Context context4 = this.A00;
                    WorkDatabase workDatabase2 = r02.A04;
                    AnonymousClass69L r7 = r43.A00;
                    C158967iX A0A = workDatabase2.A0A();
                    C128086Au BI6 = A0A.BI6(r7);
                    if (BI6 != null) {
                        C132856Vn.A02(context4, r7, BI6.A01);
                        AnonymousClass6VD A0014 = AnonymousClass6VD.A00();
                        String str11 = C132856Vn.A00;
                        StringBuilder A0u10 = AnonymousClass000.A0u();
                        A0u10.append("Removing SystemIdInfo for workSpecId (");
                        A0u10.append(r7);
                        AnonymousClass6VD.A03(A0014, ")", str11, A0u10);
                        String str12 = r7.A01;
                        int i3 = r7.A00;
                        C138906it r44 = (C138906it) A0A;
                        AnonymousClass6Q8 r53 = r44.A00;
                        r53.A05();
                        AnonymousClass6P9 r45 = r44.A01;
                        C161957nk A022 = r45.A02();
                        A022.B1q(1, str12);
                        A022.B1o(2, (long) i3);
                        r53.A06();
                        try {
                            C97274ok.A00(r53, A022);
                        } finally {
                            AnonymousClass6Q8.A01(r53);
                            r45.A03(A022);
                        }
                    }
                    r13.BX7(r7, false);
                }
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                AnonymousClass69L r54 = new AnonymousClass69L(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
                boolean z6 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                AnonymousClass6VD A0015 = AnonymousClass6VD.A00();
                String str13 = A04;
                StringBuilder A0u11 = AnonymousClass000.A0u();
                A0u11.append("Handling onExecutionCompleted ");
                A0u11.append(intent);
                A0015.A04(str13, AnonymousClass000.A0r(", ", A0u11, i));
                BX7(r54, z6);
            } else {
                AnonymousClass6VD.A00();
                Log.w(A04, AnonymousClass000.A0l(intent, "Ignoring intent ", AnonymousClass000.A0u()));
            }
        }
    }
}
