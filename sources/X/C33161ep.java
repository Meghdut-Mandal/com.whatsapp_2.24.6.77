package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1ep  reason: invalid class name and case insensitive filesystem */
public final class C33161ep implements C33151eo, C19680wL {
    public int A00;
    public boolean A01;
    public boolean A02;
    public int A03;
    public int A04 = 0;
    public long A05;
    public long A06;
    public BroadcastReceiver A07;
    public BroadcastReceiver A08;
    public BroadcastReceiver A09;
    public BroadcastReceiver A0A;
    public String A0B;
    public boolean A0C;
    public final C33101ei A0D;
    public final C19600wD A0E;
    public final C19630wG A0F;
    public final C25271Fq A0G;
    public final C20810yC A0H;
    public final C21570zS A0I;
    public final AtomicReference A0J = new AtomicReference(10);
    public final Handler A0K = new Handler(Looper.getMainLooper());
    public final C19700wN A0L;
    public final C33171eq A0M;
    public final C19970wo A0N;
    public final C19420v0 A0O;
    public final C18820ts A0P;
    public final AnonymousClass190 A0Q;
    public final C19770wU A0R;
    public volatile Notification A0S;

    public void A04() {
        this.A0S = null;
        C25271Fq r2 = this.A0G;
        r2.A03(5, "GoogleDriveNotificationManager1");
        r2.A03(46, "GoogleDriveNotificationManager1");
    }

    public synchronized void A05() {
        int i = this.A04 + 1;
        this.A04 = i;
        if (i <= 1) {
            Log.i("gdrive-notification-manager/register");
            this.A0J.set(10);
            this.A02 = false;
            this.A01 = false;
            this.A0C = false;
            this.A03 = 0;
            this.A00 = 0;
            this.A05 = 0;
            this.A06 = 0;
            this.A0B = null;
            if (this.A0S != null) {
                C19700wN r3 = this.A0L;
                StringBuilder sb = new StringBuilder();
                sb.append("numOfClientsRegistered=");
                sb.append(this.A04);
                r3.A0E("gdrive-notification-manager/register called with non-null last notification", sb.toString(), false);
            }
            this.A0S = null;
            this.A0K.post(new C35671j4(this, 11));
            this.A0M.A01(this);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x005b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0066 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0071 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f A[SYNTHETIC, Splitter:B:21:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a A[SYNTHETIC, Splitter:B:26:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075 A[SYNTHETIC, Splitter:B:31:0x0075] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A06() {
        /*
            r3 = this;
            monitor-enter(r3)
            android.app.Notification r2 = r3.A0S     // Catch:{ all -> 0x007e }
            java.util.concurrent.atomic.AtomicReference r0 = r3.A0J     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x007e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x0032
            if (r0 == 0) goto L_0x0032
            r3.A04()     // Catch:{ all -> 0x007e }
            int r1 = r0.intValue()     // Catch:{ all -> 0x007e }
            r0 = 15
            if (r1 == r0) goto L_0x001e
            r0 = 27
            if (r1 != r0) goto L_0x0032
        L_0x001e:
            boolean r0 = r3.A02     // Catch:{ all -> 0x007e }
            boolean r0 = r3.A07(r0)     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = "gdrive-notification-manager/re-posting important notification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x007e }
            X.1Fq r1 = r3.A0G     // Catch:{ all -> 0x007e }
            r0 = 46
            r1.A02(r0, r2)     // Catch:{ all -> 0x007e }
        L_0x0032:
            int r0 = r3.A04     // Catch:{ all -> 0x007e }
            int r0 = r0 + -1
            r3.A04 = r0     // Catch:{ all -> 0x007e }
            if (r0 > 0) goto L_0x007c
            java.lang.String r0 = "gdrive-notification-manager/unregister"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x007e }
            android.os.Handler r2 = r3.A0K     // Catch:{ all -> 0x007e }
            r1 = 12
            X.1j4 r0 = new X.1j4     // Catch:{ all -> 0x007e }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x007e }
            r2.post(r0)     // Catch:{ all -> 0x007e }
            X.1eq r0 = r3.A0M     // Catch:{ all -> 0x007e }
            r0.A02(r3)     // Catch:{ all -> 0x007e }
            android.content.BroadcastReceiver r1 = r3.A07     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x005b
            X.0wG r0 = r3.A0F     // Catch:{ IllegalArgumentException -> 0x005b }
            android.content.Context r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x005b }
            r0.unregisterReceiver(r1)     // Catch:{ IllegalArgumentException -> 0x005b }
        L_0x005b:
            android.content.BroadcastReceiver r1 = r3.A09     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0066
            X.0wG r0 = r3.A0F     // Catch:{ IllegalArgumentException -> 0x0066 }
            android.content.Context r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0066 }
            r0.unregisterReceiver(r1)     // Catch:{ IllegalArgumentException -> 0x0066 }
        L_0x0066:
            android.content.BroadcastReceiver r1 = r3.A08     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0071
            X.0wG r0 = r3.A0F     // Catch:{ IllegalArgumentException -> 0x0071 }
            android.content.Context r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0071 }
            r0.unregisterReceiver(r1)     // Catch:{ IllegalArgumentException -> 0x0071 }
        L_0x0071:
            android.content.BroadcastReceiver r1 = r3.A0A     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x007c
            X.0wG r0 = r3.A0F     // Catch:{ IllegalArgumentException -> 0x007c }
            android.content.Context r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x007c }
            r0.unregisterReceiver(r1)     // Catch:{ IllegalArgumentException -> 0x007c }
        L_0x007c:
            monitor-exit(r3)
            return
        L_0x007e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33161ep.A06():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(boolean r11) {
        /*
            r10 = this;
            r7 = 1
            if (r11 == 0) goto L_0x0009
            java.lang.String r0 = "gdrive-notification-manager/backup-error/backup-user-initiated/true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r7
        L_0x0009:
            X.0v0 r3 = r10.A0O
            int r6 = r3.A0C()
            r8 = 5184000000(0x134fd9000, double:2.561236308E-314)
            r2 = 2
            if (r6 == 0) goto L_0x008d
            if (r6 == r7) goto L_0x0088
            if (r6 == r2) goto L_0x0084
            r0 = 3
            if (r6 == r0) goto L_0x0035
            r0 = 4
            if (r6 == r0) goto L_0x008d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "gdrive-notification-manager/backup-error/unexpected-frequency/"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0035:
            int r5 = r3.A0M()
            int r0 = r5 + 1
            int r0 = r0 % r2
            r2 = 1
            if (r0 == 0) goto L_0x0055
            r2 = 0
            java.lang.String r0 = r3.A0c()
            if (r0 == 0) goto L_0x007e
            long r3 = r3.A0T(r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0054
            r7 = 0
        L_0x0054:
            r2 = r7
        L_0x0055:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "gdrive-notification-manager/backup-error/frequency="
            r1.append(r0)
            java.lang.String r0 = X.C34191gb.A03(r6)
            r1.append(r0)
            java.lang.String r0 = "/success-backup-fail-count="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "/show-notification="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x007e:
            java.lang.String r0 = "gdrive-notification-manager/backup-error/google-account-is-null/unexpected"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0055
        L_0x0084:
            r8 = 1209600000(0x48190800, double:5.97621805E-315)
            goto L_0x0035
        L_0x0088:
            r2 = 5
            r8 = 432000000(0x19bfcc00, double:2.13436359E-315)
            goto L_0x0035
        L_0x008d:
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            r2 = 1
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33161ep.A07(boolean):boolean");
    }

    public void BQb(boolean z) {
    }

    public synchronized void BRr(boolean z) {
        C07250Wx r5;
        synchronized (this) {
            AtomicReference atomicReference = this.A0J;
            int intValue = ((Integer) atomicReference.get()).intValue();
            if (intValue != 23 && (z || intValue != 15)) {
                if (!A07(this.A02)) {
                    atomicReference.set(23);
                }
                Log.i("gdrive-notification-manager/backup-end");
                this.A03 = 0;
                Context context = this.A0F.A00;
                int i = R.string.f12nameremoved;
                if (z) {
                    i = R.string.f12nameremoved;
                }
                String string = context.getString(i);
                String string2 = context.getString(R.string.f12nameremoved);
                if (AnonymousClass6Y6.A08(this.A0H)) {
                    C26981Mg.A00(new C162347oR(this, 3), context, new IntentFilter("clear_backup_worker"), (Handler) null, C19430v1.A0C, false);
                    r5 = new C07250Wx(R.drawable.ic_action_cancel, context.getString(R.string.f12nameremoved), A00("clear_backup_worker"));
                } else {
                    r5 = null;
                }
                A02(r5, string, string2, 1, -1, false, true);
            }
        }
    }

    public void BRu(long j, long j2) {
        int i;
        if (((Number) this.A0J.getAndSet(20)).intValue() != 20) {
            Log.i("gdrive-notification-manager/backup-paused-for-sdcard-missing");
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            Context context = this.A0F.A00;
            A02((C07250Wx) null, context.getString(R.string.f12nameremoved), context.getString(R.string.f12nameremoved), 3, i, false, false);
        }
    }

    public void BRv(long j, long j2) {
        int i;
        if (((Number) this.A0J.getAndSet(19)).intValue() != 19) {
            Log.i("gdrive-notification-manager/backup-paused-for-sdcard-unmounted");
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            Context context = this.A0F.A00;
            A02((C07250Wx) null, context.getString(R.string.f12nameremoved), context.getString(R.string.f12nameremoved), 3, i, false, false);
        }
    }

    public void BRw(long j, long j2) {
        int i;
        if (((Number) this.A0J.getAndSet(16)).intValue() != 16) {
            Log.i("gdrive-notification-manager/backup-paused-wifi-unavailable");
            if (this.A07 == null) {
                C162347oR r5 = new C162347oR(this, 1);
                this.A07 = r5;
                C26981Mg.A00(r5, this.A0F.A00, new IntentFilter("enable_backup_over_cellular"), (Handler) null, C19430v1.A0C, false);
            }
            C07250Wx r52 = null;
            if (this.A0E.A03(true) == 2) {
                r52 = new C07250Wx(R.drawable.ic_action_refresh, this.A0F.A00.getString(R.string.f12nameremoved), A00("enable_backup_over_cellular"));
            }
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            Context context = this.A0F.A00;
            A02(r52, context.getString(R.string.f12nameremoved), context.getString(R.string.f12nameremoved), 3, i, false, false);
        }
    }

    public void BRy() {
        if (((Number) this.A0J.getAndSet(11)).intValue() != 11) {
            Log.i("gdrive-notification-manager/backup-prep-start");
            Context context = this.A0F.A00;
            A02((C07250Wx) null, context.getString(R.string.f12nameremoved), context.getString(R.string.f12nameremoved), 2, -1, true, false);
        }
    }

    public void BWS() {
    }

    public synchronized void BX0(int i, Bundle bundle) {
        synchronized (this) {
            if (i != 10) {
                if (((Integer) this.A0J.getAndSet(15)).intValue() != 15) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("gdrive-notification-manager/backup-error/");
                    sb.append(C34191gb.A02(i));
                    Log.i(sb.toString());
                    if (A07(this.A02)) {
                        Context context = this.A0F.A00;
                        String string = context.getString(R.string.f12nameremoved);
                        int i2 = R.string.f12nameremoved;
                        if (i == 13) {
                            i2 = R.string.f12nameremoved;
                        }
                        A02((C07250Wx) null, string, context.getString(i2), 1, -1, false, true);
                    }
                }
            }
        }
    }

    public void Bac(long j, boolean z) {
        String str;
        if (((Number) this.A0J.getAndSet(33)).intValue() != 33) {
            StringBuilder sb = new StringBuilder();
            sb.append("gdrive-notification-manager/restore-end/");
            if (z) {
                str = "success";
            } else {
                str = "failed";
            }
            sb.append(str);
            sb.append(" restored: ");
            sb.append(j);
            Log.i(sb.toString());
        }
        if (!z || j != 0) {
            Context context = this.A0F.A00;
            A02((C07250Wx) null, context.getString(R.string.f12nameremoved), context.getString(R.string.f12nameremoved, new Object[]{AnonymousClass3TF.A03(this.A0P, j)}), 1, -1, false, true);
            return;
        }
        A04();
    }

    public void Bad(long j, long j2) {
        int i;
        if (((Number) this.A0J.getAndSet(29)).intValue() != 29) {
            Log.i("gdrive-notification-manager/restore-paused-data-unavailable");
            Context context = this.A0F.A00;
            String string = context.getString(R.string.f12nameremoved);
            String string2 = context.getString(R.string.f12nameremoved);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A02((C07250Wx) null, string, string2, 3, i, false, true);
        }
    }

    public void Bae(long j, long j2) {
        int i;
        if (((Number) this.A0J.getAndSet(30)).intValue() != 30) {
            Log.i("gdrive-notification-manager/restore-paused-for-battery");
            if (this.A0A == null) {
                C162347oR r6 = new C162347oR(this, 5);
                this.A0A = r6;
                C26981Mg.A00(r6, this.A0F.A00, new IntentFilter("enable_restore_over_low_battery"), (Handler) null, C19430v1.A0C, false);
            }
            Context context = this.A0F.A00;
            C07250Wx r62 = new C07250Wx(R.drawable.ic_action_refresh, context.getString(R.string.f12nameremoved), A00("enable_restore_over_low_battery"));
            String string = context.getString(R.string.f12nameremoved);
            String string2 = context.getString(R.string.f12nameremoved);
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            A02(r62, string, string2, 3, i, false, true);
        }
    }

    public void Baf(long j, long j2) {
        int i;
        if (((Number) this.A0J.getAndSet(32)).intValue() != 32) {
            Log.i("gdrive-notification-manager/restore-paused-sdcard-missing");
            Context context = this.A0F.A00;
            String string = context.getString(R.string.f12nameremoved);
            String string2 = context.getString(R.string.f12nameremoved);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A02((C07250Wx) null, string, string2, 3, i, false, true);
        }
    }

    public void Bag(long j, long j2) {
        int i;
        if (((Number) this.A0J.getAndSet(31)).intValue() != 31) {
            Log.i("gdrive-notification-manager/restore-paused-sdcard-unmounted");
            A04();
            Context context = this.A0F.A00;
            String string = context.getString(R.string.f12nameremoved);
            String string2 = context.getString(R.string.f12nameremoved);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A02((C07250Wx) null, string, string2, 3, i, false, true);
        }
    }

    public void Baj() {
        Context context = this.A0F.A00;
        String string = context.getString(R.string.f12nameremoved);
        if (((Number) this.A0J.getAndSet(24)).intValue() != 24) {
            Log.i("gdrive-notification-manager/restore-prep-start");
        }
        A02((C07250Wx) null, string, context.getString(R.string.f12nameremoved), 2, -1, true, false);
    }

    public void Bb1(boolean z) {
    }

    public void Bb2(long j, long j2) {
    }

    public void Bb3() {
    }

    public void Bfx() {
        if (((Number) this.A0J.getAndSet(21)).intValue() != 21) {
            Log.i("gdrive-notification-manager/backup-scrub-start");
            Context context = this.A0F.A00;
            A02((C07250Wx) null, context.getString(R.string.f12nameremoved), context.getString(R.string.f12nameremoved), 2, -1, true, false);
        }
    }

    public void Bjt() {
    }

    private PendingIntent A00(String str) {
        Intent intent = new Intent(str);
        intent.setPackage("com.whatsapp");
        return C65743Th.A01(this.A0F.A00, 0, intent, 0);
    }

    private C07700Yy A01() {
        Context context = this.A0F.A00;
        C07700Yy A022 = C20600xp.A02(context);
        A022.A0M = "chat_history_backup@1";
        A022.A0D = C65743Th.A00(context, 0, AnonymousClass190.A1E(context, (String) null, (String) null, 2), 0);
        A022.A0B.icon = R.drawable.notifybar;
        A022.A0A = 1;
        return A022;
    }

    private void A02(C07250Wx r6, String str, String str2, int i, int i2, boolean z, boolean z2) {
        this.A0B = str2;
        if (this.A0C) {
            A04();
        }
        C07700Yy A012 = A01();
        boolean z3 = true;
        if (i == 1) {
            A012.A07(0, 0, false);
        } else if (i != 2) {
            A012.A07(100, i2, false);
        } else {
            A012.A07(100, i2, true);
        }
        A012.A0I(z2);
        A012.A0J(z);
        A012.A0F(str);
        A012.A0E(str2);
        this.A01 = z;
        if (r6 == null) {
            z3 = false;
        }
        this.A0C = z3;
        if (r6 != null) {
            A012.A0Q.add(r6);
        }
        Notification A052 = A012.A05();
        this.A0S = A052;
        this.A0G.A02(5, A052);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r0 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r1 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification A03(android.content.res.Resources r5, java.lang.String r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C18770tn
            if (r0 == 0) goto L_0x0008
            X.0tn r5 = (X.C18770tn) r5
            android.content.res.Resources r5 = r5.A00
        L_0x0008:
            X.0Yy r2 = r4.A01()
            java.lang.String r0 = "action_restore"
            boolean r3 = r0.equals(r6)
            if (r3 != 0) goto L_0x001f
            java.lang.String r0 = "action_restore_media"
            boolean r1 = r0.equals(r6)
            r0 = 2131896640(0x7f122940, float:1.9428147E38)
            if (r1 == 0) goto L_0x0022
        L_0x001f:
            r0 = 2131896642(0x7f122942, float:1.9428151E38)
        L_0x0022:
            java.lang.String r0 = r5.getString(r0)
            r2.A0F(r0)
            java.lang.String r0 = "action_backup"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x004e
            if (r3 != 0) goto L_0x005d
            java.lang.String r0 = "action_restore_media"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "action_change_number"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "action_delete"
            boolean r0 = r0.equals(r6)
            r1 = 2131896494(0x7f1228ae, float:1.942785E38)
            if (r0 != 0) goto L_0x0051
        L_0x004e:
            r1 = 2131896639(0x7f12293f, float:1.9428145E38)
        L_0x0051:
            java.lang.String r0 = r5.getString(r1)
            r2.A0E(r0)
            android.app.Notification r0 = r2.A05()
            return r0
        L_0x005d:
            r1 = 2131896641(0x7f122941, float:1.942815E38)
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33161ep.A03(android.content.res.Resources, java.lang.String):android.app.Notification");
    }

    public void BRs(long j, long j2) {
        int i;
        Log.i("gdrive-notification-manager/backup-paused-for-data-connection");
        if (((Number) this.A0J.getAndSet(17)).intValue() != 17) {
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            Context context = this.A0F.A00;
            A02((C07250Wx) null, context.getString(R.string.f12nameremoved), context.getString(R.string.f12nameremoved), 3, i, false, false);
        }
    }

    public void BRt(long j, long j2) {
        int i;
        Log.i("gdrive-notification-manager/backup-paused-for-low-battery");
        if (((Number) this.A0J.getAndSet(18)).intValue() != 18) {
            if (this.A08 == null) {
                C162347oR r6 = new C162347oR(this, 2);
                this.A08 = r6;
                C26981Mg.A00(r6, this.A0F.A00, new IntentFilter("enable_backup_over_low_battery"), (Handler) null, C19430v1.A0C, false);
            }
            Context context = this.A0F.A00;
            C07250Wx r62 = new C07250Wx(R.drawable.ic_action_refresh, context.getString(R.string.f12nameremoved), A00("enable_backup_over_low_battery"));
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            A02(r62, context.getString(R.string.f12nameremoved), context.getString(R.string.f12nameremoved), 3, i, false, false);
        }
    }

    public void BRx(int i) {
        AtomicReference atomicReference = this.A0J;
        boolean z = false;
        if (((Number) atomicReference.get()).intValue() != 12) {
            z = true;
        }
        if (((Number) atomicReference.getAndSet(12)).intValue() != 12 || System.currentTimeMillis() - this.A06 >= 200) {
            this.A06 = System.currentTimeMillis();
            Context context = this.A0F.A00;
            String string = context.getString(R.string.f12nameremoved);
            int i2 = i;
            if (i >= 0 || z) {
                A02((C07250Wx) null, string, context.getString(R.string.f12nameremoved, new Object[]{this.A0P.A0N().format(((double) i2) / 100.0d)}), 2, -1, true, false);
            }
        }
    }

    public synchronized void BRz(long j, long j2) {
        int i;
        synchronized (this) {
            AtomicReference atomicReference = this.A0J;
            boolean z = false;
            if (((Integer) atomicReference.get()).intValue() != 14) {
                z = true;
            }
            if (((Integer) atomicReference.getAndSet(14)).intValue() != 14 || System.currentTimeMillis() - this.A06 >= 200) {
                this.A06 = System.currentTimeMillis();
                long j3 = j2;
                long j4 = j;
                if (j2 > 0) {
                    i = (int) ((100 * j) / j2);
                } else {
                    i = 0;
                }
                if (i - this.A03 > 0 || z) {
                    Log.i(String.format(Locale.ENGLISH, "gdrive-notification-manager/backup-progress %d/%d (%d)", new Object[]{Long.valueOf(j4), Long.valueOf(j3), Integer.valueOf(i)}));
                    this.A03 = i;
                    Context context = this.A0F.A00;
                    String string = context.getString(R.string.f12nameremoved);
                    C18820ts r7 = this.A0P;
                    String string2 = context.getString(R.string.f12nameremoved, new Object[]{AnonymousClass3TF.A03(r7, j4), AnonymousClass3TF.A03(r7, j3), r7.A0N().format(((double) i) / 100.0d)});
                    if (!string2.equals(this.A0B)) {
                        A02((C07250Wx) null, string, string2, 3, i, true, false);
                    }
                }
            }
        }
    }

    public void BS0() {
        this.A0J.getAndSet(13);
    }

    public void BUP(AnonymousClass3K7 r4) {
        this.A0R.Boy(new C35671j4(this, 10));
    }

    public void BX1(int i, Bundle bundle) {
        if (i != 10) {
            if (((Number) this.A0J.getAndSet(27)).intValue() != 27) {
                StringBuilder sb = new StringBuilder();
                sb.append("gdrive-notification-manager/media-restore-error/");
                sb.append(C34191gb.A02(i));
                Log.i(sb.toString());
                Context context = this.A0F.A00;
                A02((C07250Wx) null, context.getString(R.string.f12nameremoved), context.getString(R.string.f12nameremoved), 1, -1, false, true);
            }
        }
    }

    public void BX2(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive-notification-manager/msgstore-restore-error/");
        sb.append(C34191gb.A02(i));
        Log.i(sb.toString());
    }

    public void Bah(long j, long j2) {
        int i;
        if (((Number) this.A0J.getAndSet(28)).intValue() != 28) {
            Log.i("gdrive-notification-manager/restore-paused-wifi-unavailable");
            if (this.A09 == null) {
                C162347oR r5 = new C162347oR(this, 4);
                this.A09 = r5;
                C26981Mg.A00(r5, this.A0F.A00, new IntentFilter("enable_restore_over_cellular"), (Handler) null, C19430v1.A0C, false);
            }
            C07250Wx r52 = null;
            if (this.A0E.A03(true) == 2) {
                r52 = new C07250Wx(R.drawable.ic_action_refresh, this.A0F.A00.getString(R.string.f12nameremoved), A00("enable_restore_over_cellular"));
            }
            Context context = this.A0F.A00;
            String string = context.getString(R.string.f12nameremoved);
            String string2 = context.getString(R.string.f12nameremoved);
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            A02(r52, string, string2, 3, i, false, true);
        }
    }

    public synchronized void Bai(int i) {
        synchronized (this) {
            Context context = this.A0F.A00;
            String string = context.getString(R.string.f12nameremoved);
            AtomicReference atomicReference = this.A0J;
            if (((Integer) atomicReference.get()).intValue() != 25 || System.currentTimeMillis() - this.A05 >= 200) {
                this.A05 = System.currentTimeMillis();
                boolean z = false;
                if (((Integer) atomicReference.getAndSet(25)).intValue() != 25) {
                    z = true;
                }
                int i2 = i;
                if (i > 0 || z) {
                    A02((C07250Wx) null, string, context.getString(R.string.f12nameremoved, new Object[]{this.A0P.A0N().format(((double) i2) / 100.0d)}), 2, i2, true, false);
                }
            }
        }
    }

    public synchronized void Bak(long j, long j2) {
        int i;
        synchronized (this) {
            Context context = this.A0F.A00;
            String string = context.getString(R.string.f12nameremoved);
            AtomicReference atomicReference = this.A0J;
            if (((Integer) atomicReference.get()).intValue() != 26 || System.currentTimeMillis() - this.A06 >= 200) {
                this.A06 = System.currentTimeMillis();
                long j3 = j;
                long j4 = j2;
                if (((Integer) atomicReference.getAndSet(26)).intValue() != 26) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("gdrive-notification-manager/restore-progress ");
                    sb.append(j3);
                    sb.append("/");
                    sb.append(j4);
                    sb.append(" bytes.");
                    Log.i(sb.toString());
                }
                if (j2 > 0) {
                    i = (int) ((100 * j) / j2);
                } else {
                    i = -1;
                }
                this.A00 = i;
                C18820ts r4 = this.A0P;
                String string2 = context.getString(R.string.f12nameremoved, new Object[]{AnonymousClass3TF.A03(r4, j3), AnonymousClass3TF.A03(r4, j4), r4.A0N().format(((double) this.A00) / 100.0d)});
                if (!string2.equals(this.A0B)) {
                    A02((C07250Wx) null, string, string2, 3, this.A00, true, false);
                }
            }
        }
    }

    public C33161ep(C19700wN r3, C33101ei r4, C33171eq r5, C19600wD r6, C19970wo r7, C19630wG r8, C25271Fq r9, C19420v0 r10, C18820ts r11, C20810yC r12, AnonymousClass190 r13, C19770wU r14, C21570zS r15) {
        this.A0F = r8;
        this.A0N = r7;
        this.A0H = r12;
        this.A0L = r3;
        this.A0Q = r13;
        this.A0R = r14;
        this.A0P = r11;
        this.A0I = r15;
        this.A0O = r10;
        this.A0G = r9;
        this.A0E = r6;
        this.A0D = r4;
        this.A0M = r5;
    }

    public void BRq() {
        A04();
    }

    public void Bab() {
        A04();
    }
}
