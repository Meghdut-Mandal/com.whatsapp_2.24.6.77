package X;

import android.content.SharedPreferences;
import android.os.PowerManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* renamed from: X.0xY  reason: invalid class name and case insensitive filesystem */
public class C20430xY implements C20420xX, AnonymousClass00M {
    public final C19460v5 A00;
    public final C19700wN A01;
    public final C19730wQ A02;
    public final C19600wD A03;
    public final AnonymousClass16D A04;
    public final C27381Nz A05;
    public final AnonymousClass1O6 A06;
    public final C19970wo A07;
    public final C20810yC A08;
    public final C19460v5 A09;
    public final C19460v5 A0A;
    public final C27341Nv A0B;
    public final AnonymousClass164 A0C;
    public final AnonymousClass19J A0D;
    public final C21060yb A0E;
    public final AnonymousClass15x A0F;
    public final AnonymousClass16E A0G;
    public final C27371Ny A0H;
    public final C27331Nu A0I;
    public final AnonymousClass1ML A0J;
    public final C19770wU A0K;

    public C106765Lg A04(C108515Tu r7, Collection collection) {
        collection.size();
        return A03(AnonymousClass6NS.A0G, r7, collection, true, true);
    }

    public /* synthetic */ void BYl() {
    }

    public /* synthetic */ void BYm() {
    }

    public /* synthetic */ void BYn() {
    }

    public /* synthetic */ void BYp() {
    }

    public static C106765Lg A00(C20430xY r5, C131586Pq r6, boolean z) {
        C106765Lg r4 = new C106765Lg(z);
        r6.A02(r4);
        C27381Nz r3 = r5.A05;
        r3.A0R.execute(new C35681j5(r3, r6, 7));
        return r4;
    }

    public static void A01(C20430xY r6, AnonymousClass6NS r7, C108515Tu r8, Collection collection, boolean z) {
        PowerManager.WakeLock A002;
        long j;
        SharedPreferences.Editor edit;
        String str;
        if (r6.A0D.A02()) {
            if (C20800yB.A01(C21000yV.A02, r6.A08, 4097)) {
                Log.i("contactsyncmethods/forceFullSync offline in progress, sync latter");
                if (r6.A02.A0L()) {
                    j = 0;
                    edit = AnonymousClass1O6.A00(r6.A06).edit();
                    str = "status_full_sync_wait";
                } else if (r7.A02) {
                    j = 0;
                    edit = AnonymousClass1O6.A00(r6.A06).edit();
                    str = "contact_full_sync_wait";
                } else if (r7.A08) {
                    j = 0;
                    edit = AnonymousClass1O6.A00(r6.A06).edit();
                    str = "sidelist_full_sync_wait";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("contactsyncmethods/forceFullSync unexpected full sync, syncType=");
                    sb.append(r8);
                    sb.append("; protocols=");
                    sb.append(r7);
                    Log.e(sb.toString());
                    return;
                }
                edit.putLong(str, j).apply();
                return;
            }
        }
        PowerManager A0G2 = r6.A0E.A0G();
        if (A0G2 == null) {
            Log.w("contactsyncmethods/forceFullSync pm=null");
            A002 = null;
        } else {
            A002 = C111765co.A00(A0G2, "fullsync", 1);
        }
        if (A002 != null) {
            try {
                A002.acquire(300000);
                Log.i("contactsyncmethods/forceFullSync/wl/acquire");
            } catch (RuntimeException e) {
                Log.e("contactsyncmethods/forceFullSync", e);
                r6.A01.A0E("contactsyncmethods/forceFullSync", e.getMessage(), true);
            } catch (Throwable th) {
                if (A002 != null && A002.isHeld()) {
                    A002.release();
                    Log.i("contactsyncmethods/forceFullSync/wl/release");
                }
                throw th;
            }
        }
        C131666Pz r1 = new C131666Pz(r8);
        r1.A02 = true;
        r1.A01 = z;
        r1.A00 = r7;
        r1.A07.addAll(collection);
        r6.A02(r1.A01());
        if (A002 != null && A002.isHeld()) {
            A002.release();
            Log.i("contactsyncmethods/forceFullSync/wl/release");
        }
    }

    public C131626Pu A02(C131586Pq r2) {
        if (!this.A03.A09()) {
            Log.i("contactsyncmethods/network_unavailable");
            return C131626Pu.A04;
        }
        try {
            return (C131626Pu) A00(this, r2, false).get();
        } catch (InterruptedException | ExecutionException unused) {
            return C131626Pu.A03;
        }
    }

    public void A05() {
        C19730wQ r1 = this.A02;
        r1.A0G();
        if (r1.A00 != null && !r1.A0L()) {
            this.A0K.Boy(new C35671j4(this, 46));
        }
    }

    public void A06() {
        C18740tg.A0F(!this.A02.A0L(), "ContactSyncMethods/requestBackgroundFullSyncWithRetry/should not be executed by companions");
        C131666Pz r2 = new C131666Pz(C108515Tu.A03);
        r2.A00 = AnonymousClass6NS.A0C;
        r2.A04 = true;
        A00(this, r2.A01(), true);
    }

    public void A07() {
        C108515Tu r0;
        Log.i("ContactSyncMethods/requestOnChangeDeltaSync");
        C18740tg.A0F(!this.A02.A0L(), "ContactSyncMethods/requestOnChangeDeltaSync/companions should not perform delta sync");
        if (this.A0J.A00 == 3) {
            r0 = C108515Tu.A02;
        } else {
            r0 = C108515Tu.A08;
        }
        C131666Pz r2 = new C131666Pz(r0);
        r2.A03 = true;
        r2.A04 = true;
        r2.A00 = AnonymousClass6NS.A0C;
        A00(this, r2.A01(), true);
    }

    public void A08() {
        C108515Tu r0;
        if (!this.A02.A0L()) {
            if (this.A0J.A00 == 3) {
                r0 = C108515Tu.A02;
            } else {
                r0 = C108515Tu.A08;
            }
            C131666Pz r2 = new C131666Pz(r0);
            r2.A03 = true;
            r2.A04 = true;
            r2.A00 = AnonymousClass6NS.A0C;
            r2.A02 = true;
            A00(this, r2.A01(), true);
        }
    }

    public void A09(AnonymousClass141 r11) {
        Class<UserJid> cls = UserJid.class;
        UserJid userJid = (UserJid) r11.A06(cls);
        if (userJid != null) {
            C19730wQ r1 = this.A02;
            r1.A0G();
            if (!userJid.equals(r1.A03) && !(userJid instanceof C177638e7) && r11.A0F == null) {
                if (r1.A0L()) {
                    A03(AnonymousClass6NS.A0D, C108515Tu.A0B, Collections.singleton(r11.A06(cls)), false, true);
                } else if (!r11.A0y) {
                    C131666Pz r2 = new C131666Pz(C108515Tu.A09);
                    r2.A04 = true;
                    r2.A00 = AnonymousClass6NS.A0C;
                    r2.A04(userJid);
                    A00(this, r2.A01(), true);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        if (r10 <= 1800000) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(boolean r18) {
        /*
            r17 = this;
            r3 = r17
            X.0wQ r0 = r3.A02
            boolean r16 = r0.A0L()
            r6 = 1
            r7 = 0
            X.1O6 r9 = r3.A06
            android.content.SharedPreferences r4 = X.AnonymousClass1O6.A00(r9)
            if (r16 == 0) goto L_0x010b
            java.lang.String r2 = "last_status_full_sync"
        L_0x0015:
            r0 = -1
            long r1 = r4.getLong(r2, r0)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0020
            r6 = 0
        L_0x0020:
            X.0wo r0 = r3.A07
            long r14 = X.C19970wo.A00(r0)
            r12 = 1800000(0x1b7740, double:8.89318E-318)
            if (r16 != 0) goto L_0x00b2
            android.content.SharedPreferences r2 = X.AnonymousClass1O6.A00(r9)
            java.lang.String r7 = "contact_full_sync_wait"
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r10 = r2.getLong(r7, r0)
            long r10 = r10 - r14
            android.content.SharedPreferences r4 = X.AnonymousClass1O6.A00(r9)
            java.lang.String r2 = "last_contact_full_sync"
            r0 = -1
            long r0 = r4.getLong(r2, r0)
            long r10 = r10 + r0
            if (r6 != 0) goto L_0x004d
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r5 = 0
            if (r0 > 0) goto L_0x004e
        L_0x004d:
            r5 = 1
        L_0x004e:
            android.content.SharedPreferences r4 = X.AnonymousClass1O6.A00(r9)
            android.content.SharedPreferences r2 = X.AnonymousClass1O6.A00(r9)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r2.getLong(r7, r0)
            java.lang.String r2 = "sidelist_full_sync_wait"
            long r7 = r4.getLong(r2, r0)
            long r7 = r7 - r14
            android.content.SharedPreferences r4 = X.AnonymousClass1O6.A00(r9)
            java.lang.String r2 = "last_sidelist_full_sync"
            r0 = -1
            long r0 = r4.getLong(r2, r0)
            long r7 = r7 + r0
            int r1 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L_0x0077
            r0 = 1
        L_0x0077:
            if (r5 == 0) goto L_0x00ad
            X.6NS r2 = X.AnonymousClass6NS.A0I
        L_0x007b:
            X.5Tu r1 = X.C108515Tu.A03
            java.util.Set r0 = java.util.Collections.emptySet()
            A01(r3, r2, r1, r0, r6)
        L_0x0084:
            if (r18 == 0) goto L_0x0136
            if (r6 == 0) goto L_0x0136
            java.lang.String r0 = "contactsyncmethods/fullSyncAndInitialize/fullsync/neversynced"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r16 != 0) goto L_0x0094
            X.1Nu r0 = r3.A0I
            r0.A00()
        L_0x0094:
            X.1Nv r1 = r3.A0B
            r0 = 0
            r1.A01(r0)
            X.0v5 r1 = r3.A09
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x010f
            r1.A02()
            java.lang.String r1 = "loadSettingToSharedPreferences"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x00ad:
            if (r0 == 0) goto L_0x0084
            X.6NS r2 = X.AnonymousClass6NS.A0J
            goto L_0x007b
        L_0x00b2:
            android.content.SharedPreferences r5 = X.AnonymousClass1O6.A00(r9)
            android.content.SharedPreferences r4 = X.AnonymousClass1O6.A00(r9)
            java.lang.String r2 = "contact_full_sync_wait"
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = r4.getLong(r2, r0)
            java.lang.String r0 = "status_full_sync_wait"
            long r7 = r5.getLong(r0, r1)
            long r7 = r7 - r14
            android.content.SharedPreferences r4 = X.AnonymousClass1O6.A00(r9)
            java.lang.String r2 = "last_status_full_sync"
            r0 = -1
            long r0 = r4.getLong(r2, r0)
            long r7 = r7 + r0
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0084
            X.6NS r5 = X.AnonymousClass6NS.A0D
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.16D r0 = r3.A04
            java.util.ArrayList r0 = r0.A0H()
            java.util.Iterator r2 = r0.iterator()
        L_0x00ec:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r1 = r2.next()
            X.141 r1 = (X.AnonymousClass141) r1
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x00ec
            r4.add(r0)
            goto L_0x00ec
        L_0x0104:
            X.5Tu r0 = X.C108515Tu.A04
            A01(r3, r5, r0, r4, r6)
            goto L_0x0084
        L_0x010b:
            java.lang.String r2 = "last_contact_full_sync"
            goto L_0x0015
        L_0x010f:
            X.1Ny r0 = r3.A0H
            r0.A00()
            X.15x r0 = r3.A0F
            X.12P r0 = r0.A00
            r0.A06()
            java.io.File r0 = r0.A03
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0136
            X.16E r0 = r3.A0G
            boolean r0 = r0.A0H()
            if (r0 != 0) goto L_0x0136
            X.164 r1 = r3.A0C
            X.0v5 r0 = r3.A0A
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r0 = X.C110985bY.A00(r0)
            r1.A01(r0)
        L_0x0136:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20430xY.A0A(boolean):void");
    }

    public void BYo() {
        this.A0K.Boy(new C35671j4(this, 47));
    }

    public C20430xY(C19460v5 r2, C19460v5 r3, C19460v5 r4, C19700wN r5, C19730wQ r6, C27341Nv r7, AnonymousClass164 r8, AnonymousClass19J r9, C19600wD r10, AnonymousClass16D r11, C27381Nz r12, AnonymousClass1O6 r13, C21060yb r14, C19970wo r15, AnonymousClass15x r16, AnonymousClass16E r17, C27371Ny r18, C20810yC r19, C27331Nu r20, AnonymousClass1ML r21, C19770wU r22) {
        this.A07 = r15;
        this.A08 = r19;
        this.A01 = r5;
        this.A02 = r6;
        this.A0K = r22;
        this.A0G = r17;
        this.A0C = r8;
        this.A04 = r11;
        this.A0E = r14;
        this.A0J = r21;
        this.A0D = r9;
        this.A00 = r2;
        this.A0I = r20;
        this.A0B = r7;
        this.A0A = r3;
        this.A0H = r18;
        this.A0F = r16;
        this.A09 = r4;
        this.A03 = r10;
        this.A05 = r12;
        this.A06 = r13;
    }

    public C106765Lg A03(AnonymousClass6NS r7, C108515Tu r8, Collection collection, boolean z, boolean z2) {
        C18740tg.A0B(r7.A00());
        boolean z3 = false;
        if (r8.scope == AnonymousClass5SE.MULTI_PROTOCOLS_QUERY) {
            z3 = true;
        }
        C18740tg.A0B(z3);
        collection.size();
        C131666Pz r5 = new C131666Pz(r8);
        r5.A02 = z;
        r5.A00 = r7;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (!C20800yB.A01(C21000yV.A02, this.A08, 3311)) {
                this.A04.A0D(userJid);
            }
            r5.A04(userJid);
        }
        return A00(this, r5.A01(), z2);
    }
}
