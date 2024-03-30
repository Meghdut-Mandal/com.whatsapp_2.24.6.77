package X;

import android.content.SharedPreferences;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.1J5  reason: invalid class name */
public final class AnonymousClass1J5 implements AnonymousClass0z8, AnonymousClass1FP {
    public long A00;
    public long A01;
    public final C21360z5 A02;
    public final C19970wo A03;
    public final C20810yC A04;
    public final C21010yW A05;
    public final C19930wk A06;
    public final AnonymousClass00T A07 = new AnonymousClass00U(new AnonymousClass1JA(this));
    public final AnonymousClass1J6 A08;
    public final AnonymousClass1J7 A09;
    public volatile long A0A;

    public AnonymousClass1J5(C21360z5 r3, C19970wo r4, C20810yC r5, C21010yW r6, AnonymousClass1J6 r7, AnonymousClass1J7 r8, C19770wU r9) {
        AnonymousClass00C.A0D(r9, 1);
        AnonymousClass00C.A0D(r4, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r3, 4);
        AnonymousClass00C.A0D(r6, 5);
        AnonymousClass00C.A0D(r7, 6);
        AnonymousClass00C.A0D(r8, 7);
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A05 = r6;
        this.A08 = r7;
        this.A09 = r8;
        this.A06 = new C19930wk(r9, false);
    }

    private final void A00() {
        if (this.A01 > 0) {
            long j = ((this.A0A - this.A01) + 1) - this.A00;
            AnonymousClass1J7 r8 = this.A09;
            long j2 = this.A0A;
            synchronized (r8) {
                AnonymousClass1J7.A00(r8).putLong("timespent_last_activity_time", j2).putLong("timespent_session_total", ((SharedPreferences) r8.A01.getValue()).getLong("timespent_session_total", 0) + j).apply();
            }
            this.A01 = 0;
            this.A0A = 0;
            this.A00 = 0;
        }
    }

    private final void A01(long j) {
        long time = this.A02.A01().getTime() / 1000;
        if (1711380747 <= j && j <= time) {
            AnonymousClass1J7 r6 = this.A09;
            synchronized (r6) {
                if (((SharedPreferences) r6.A01.getValue()).getLong("timespent_start_time", 0) == 0) {
                    AnonymousClass1J7.A00(r6).putLong("timespent_start_time", j).apply();
                }
            }
        }
    }

    private final void A02(long j) {
        AnonymousClass1J7 r2 = this.A09;
        synchronized (r2) {
            AnonymousClass1J7.A00(r2).putLong("timespent_end_time", j).apply();
        }
    }

    public static final void A03(AnonymousClass1J5 r5) {
        long A002 = C19970wo.A00(r5.A03) / ((long) 1000);
        boolean z = false;
        if (A002 < r5.A0A) {
            z = true;
        }
        long max = Math.max(r5.A0A, A002);
        r5.A00();
        r5.A02(max);
        if (r5.A06(A002) || z) {
            r5.A05(z);
        }
    }

    public static final void A04(AnonymousClass1J5 r10) {
        long A002 = C19970wo.A00(r10.A03) / ((long) 1000);
        if (A002 != r10.A0A) {
            boolean z = false;
            if (A002 < r10.A0A) {
                z = true;
            }
            long max = Math.max(r10.A0A, A002);
            if (A002 - r10.A0A > 30 || z) {
                r10.A00();
                if (r10.A06(A002) || z) {
                    r10.A02(max);
                    r10.A05(z);
                    r10.A01(A002);
                }
                r10.A01 = A002;
            }
            r10.A0A = A002;
        }
    }

    private final void A05(boolean z) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("PST8PDT"));
        instance.add(6, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long timeInMillis = instance.getTimeInMillis() / ((long) 1000);
        AnonymousClass1J7 r6 = this.A09;
        synchronized (r6) {
            AnonymousClass1J7.A00(r6).putLong("timespent_rollover_time", timeInMillis).apply();
        }
        A08();
        synchronized (r6) {
            SharedPreferences.Editor A002 = AnonymousClass1J7.A00(r6);
            AnonymousClass00T r9 = r6.A01;
            long j = ((SharedPreferences) r9.getValue()).getLong("timespent_start_time", 0);
            if (j > 0) {
                A002.putLong("timespent_saved_start_time", j).putLong("timespent_saved_duration", (((SharedPreferences) r9.getValue()).getLong("timespent_end_time", 0) - j) + 1).putLong("timespent_saved_session_total", ((SharedPreferences) r9.getValue()).getLong("timespent_session_total", 0)).putLong("timespent_saved_foreground_count", ((SharedPreferences) r9.getValue()).getLong("timespent_foreground_count", 0)).putBoolean("timespent_saved_time_altered", z);
            }
            A002.putLong("timespent_start_time", 0).putLong("timespent_session_total", 0).putLong("timespent_end_time", 0).putLong("timespent_foreground_count", 0).apply();
        }
    }

    private final boolean A06(long j) {
        long j2;
        AnonymousClass1J7 r4 = this.A09;
        synchronized (r4) {
            j2 = ((SharedPreferences) r4.A01.getValue()).getLong("timespent_rollover_time", 0);
        }
        if (j2 < j || j < this.A0A) {
            return true;
        }
        return false;
    }

    public final void A07() {
        AnonymousClass00T r7;
        long j;
        long A002 = C19970wo.A00(this.A03) / ((long) 1000);
        AnonymousClass1J7 r6 = this.A09;
        synchronized (r6) {
            r7 = r6.A01;
            j = ((SharedPreferences) r7.getValue()).getLong("timespent_last_activity_time", 0);
        }
        this.A0A = j;
        int i = 1;
        boolean z = false;
        if (A002 < this.A0A) {
            z = true;
        }
        if (A06(A002) || z) {
            A05(z);
        }
        A01(A002);
        if (A002 != this.A0A) {
            i = 0;
        }
        this.A00 = (long) i;
        this.A01 = A002;
        this.A0A = A002;
        synchronized (r6) {
            AnonymousClass1J7.A00(r6).putLong("timespent_foreground_count", ((SharedPreferences) r7.getValue()).getLong("timespent_foreground_count", 0) + 1).apply();
        }
    }

    public final void A08() {
        AnonymousClass00T r5;
        long j;
        long j2;
        long j3;
        long j4;
        boolean z;
        long j5;
        long j6;
        long j7;
        long j8;
        boolean z2;
        long j9;
        AnonymousClass1J7 r6 = this.A09;
        if (r6.A01() > 0) {
            synchronized (r6) {
                r5 = r6.A01;
                j = ((SharedPreferences) r5.getValue()).getLong("timespent_summary_sequence", 0);
            }
            long A012 = r6.A01();
            synchronized (r6) {
                j2 = ((SharedPreferences) r5.getValue()).getLong("timespent_saved_duration", 0);
            }
            synchronized (r6) {
                j3 = ((SharedPreferences) r5.getValue()).getLong("timespent_saved_session_total", 0);
            }
            synchronized (r6) {
                j4 = ((SharedPreferences) r5.getValue()).getLong("timespent_saved_foreground_count", 0);
            }
            synchronized (r6) {
                z = ((SharedPreferences) r5.getValue()).getBoolean("timespent_saved_time_altered", false);
            }
            AnonymousClass2RV r13 = new AnonymousClass2RV();
            r13.A03 = Long.valueOf(A012);
            r13.A00 = Long.valueOf(j2);
            r13.A02 = Long.valueOf(j3);
            Long valueOf = Long.valueOf(j);
            r13.A05 = valueOf;
            r13.A01 = Long.valueOf(j4);
            if (z) {
                j5 = 1;
            } else {
                j5 = 0;
            }
            r13.A04 = Long.valueOf(j5);
            this.A05.Blw(r13);
            AnonymousClass1J6 r4 = this.A08;
            long A013 = r6.A01();
            synchronized (r6) {
                j6 = ((SharedPreferences) r5.getValue()).getLong("timespent_saved_duration", 0);
            }
            synchronized (r6) {
                j7 = ((SharedPreferences) r5.getValue()).getLong("timespent_saved_session_total", 0);
            }
            synchronized (r6) {
                j8 = ((SharedPreferences) r5.getValue()).getLong("timespent_saved_foreground_count", 0);
            }
            synchronized (r6) {
                z2 = ((SharedPreferences) r5.getValue()).getBoolean("timespent_saved_time_altered", false);
            }
            AnonymousClass2RR r52 = new AnonymousClass2RR();
            r52.A03 = Long.valueOf(A013);
            r52.A00 = Long.valueOf(j6);
            r52.A02 = Long.valueOf(j7);
            r52.A05 = valueOf;
            r52.A01 = Long.valueOf(j8);
            if (z2) {
                j9 = 1;
            } else {
                j9 = 0;
            }
            r52.A04 = Long.valueOf(j9);
            r4.A00.Blw(r52);
            long j10 = (j % ((long) 9999)) + 1;
            synchronized (r6) {
                AnonymousClass1J7.A00(r6).putLong("timespent_saved_start_time", 0).putLong("timespent_saved_duration", 0).putLong("timespent_saved_session_total", 0).putLong("timespent_saved_foreground_count", 0).putBoolean("timespent_saved_time_altered", false).putLong("timespent_summary_sequence", j10).apply();
            }
        }
    }

    public final void A09() {
        if (((Boolean) this.A07.getValue()).booleanValue()) {
            this.A06.execute(new C35731jA((Object) this, 43));
        } else {
            A04(this);
        }
    }

    public void BRC() {
        if (((Boolean) this.A07.getValue()).booleanValue()) {
            this.A06.execute(new C35731jA((Object) this, 45));
        } else {
            A07();
        }
    }

    public void onAppBackgrounded() {
        if (((Boolean) this.A07.getValue()).booleanValue()) {
            this.A06.execute(new C35731jA((Object) this, 44));
        } else {
            A03(this);
        }
    }

    public void BYy() {
        A08();
    }
}
