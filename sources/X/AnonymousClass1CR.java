package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1CR  reason: invalid class name */
public class AnonymousClass1CR extends AnonymousClass1CP implements AnonymousClass1CQ, AnonymousClass00M {
    public C24481Cp A00;
    public Set A01;
    public C34041gM A02;
    public final AnonymousClass17Y A03;
    public final C19730wQ A04;
    public final AnonymousClass16D A05;
    public final C24341Cb A06;
    public final C19630wG A07;
    public final C19420v0 A08;
    public final AnonymousClass1CY A09;
    public final C220412q A0A;
    public final C24381Cf A0B;
    public final C20810yC A0C;
    public final C20500xf A0D;
    public final C24401Ch A0E;
    public final C24371Ce A0F;
    public final C24391Cg A0G;
    public final AnonymousClass1CS A0H;
    public final Map A0I;
    public final C19700wN A0J;
    public final C24361Cd A0K;
    public final AnonymousClass1AO A0L;
    public final AnonymousClass16I A0M;
    public final AnonymousClass171 A0N;
    public final C21060yb A0O;
    public final C19970wo A0P;
    public final C20830yE A0Q;
    public final AnonymousClass1A5 A0R;
    public final AnonymousClass11g A0S;
    public final AnonymousClass12S A0T;
    public final C233117z A0U;
    public final AnonymousClass13J A0V;
    public final AnonymousClass19W A0W;
    public final Object A0X;
    public final String A0Y;
    public final boolean A0Z;

    public synchronized C34041gM A0P() {
        if (this.A02 == null) {
            C19630wG r4 = this.A07;
            C34041gM r2 = new C34041gM(this.A0J, r4, this.A0S, this.A0T, this.A0Y);
            this.A02 = r2;
            if (this.A0Z) {
                C24481Cp r1 = this.A00;
                C19660wJ r0 = r2.A01;
                C18740tg.A06(r1);
                r0.A00.add(r1);
            }
        }
        return this.A02;
    }

    public Long A0T(AnonymousClass11F r4) {
        return A03(r4, 0, false);
    }

    public Long A0U(AnonymousClass11F r5, long j) {
        boolean z = false;
        if (j > 0) {
            z = true;
        }
        C18740tg.A0D(z, "Pinned time should be strictly positive");
        return A03(r5, j, true);
    }

    public LinkedHashMap A0W() {
        Cursor A092;
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        synchronized (this.A0X) {
            try {
                AnonymousClass1M0 A032 = A0P().get();
                try {
                    A092 = A032.A02.A09("SELECT jid, pinned_time FROM settings WHERE pinned != 0 ORDER BY pinned_time DESC", "getPinnedJids/QUERY_CHAT_SETTINGS", (String[]) null);
                    int columnIndex = A092.getColumnIndex("jid");
                    int columnIndex2 = A092.getColumnIndex("pinned_time");
                    while (A092.moveToNext()) {
                        AnonymousClass11F A022 = AnonymousClass11F.A00.A02(A092.getString(columnIndex));
                        long j = A092.getLong(columnIndex2);
                        if (A022 != null) {
                            linkedHashMap.put(A022, Long.valueOf(j));
                        }
                    }
                    A092.close();
                    A032.close();
                    if (C20800yB.A01(C21000yV.A01, this.A0C, 6045)) {
                        this.A01 = linkedHashMap.keySet();
                    }
                } catch (Throwable th) {
                    A032.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.i("chat-settings-store/get-pinned-jids", e);
                A0Y();
                throw e;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return linkedHashMap;
        throw th;
    }

    public synchronized void A0a() {
        C34041gM r0 = this.A02;
        if (r0 != null) {
            r0.close();
            if (this.A0Z) {
                C34041gM r02 = this.A02;
                C24481Cp r1 = this.A00;
                C19660wJ r03 = r02.A01;
                C18740tg.A06(r1);
                r03.A00.remove(r1);
            }
            this.A02 = null;
        }
    }

    public AnonymousClass1CR(C19700wN r2, AnonymousClass17Y r3, C19730wQ r4, C24361Cd r5, AnonymousClass1AO r6, AnonymousClass16D r7, AnonymousClass16I r8, AnonymousClass171 r9, C24341Cb r10, C21060yb r11, C19970wo r12, C19630wG r13, C20830yE r14, C19420v0 r15, AnonymousClass1CY r16, C24421Cj r17, C220412q r18, AnonymousClass1A5 r19, C24381Cf r20, AnonymousClass11g r21, AnonymousClass12S r22, C20810yC r23, C20500xf r24, C233117z r25, C24401Ch r26, C24371Ce r27, C24391Cg r28, AnonymousClass1CS r29, AnonymousClass13J r30, AnonymousClass19W r31, String str, boolean z) {
        super(r17);
        this.A0I = new ConcurrentHashMap();
        this.A01 = null;
        this.A0X = new Object();
        this.A07 = r13;
        this.A0P = r12;
        this.A0C = r23;
        this.A03 = r3;
        this.A0J = r2;
        this.A0H = r29;
        this.A04 = r4;
        this.A0A = r18;
        this.A0D = r24;
        this.A0T = r22;
        this.A05 = r7;
        this.A0V = r30;
        this.A0O = r11;
        this.A0N = r9;
        this.A09 = r16;
        this.A0L = r6;
        this.A0M = r8;
        this.A06 = r10;
        this.A0K = r5;
        this.A0F = r27;
        this.A0Q = r14;
        this.A08 = r15;
        this.A0B = r20;
        this.A0W = r31;
        this.A0S = r21;
        this.A0G = r28;
        this.A0E = r26;
        this.A0R = r19;
        this.A0U = r25;
        this.A0Y = str;
        this.A0Z = z;
        A05();
    }

    public static AnonymousClass3LI A02(AnonymousClass1CR r6, String str) {
        Cursor A092;
        Map map = r6.A0I;
        AnonymousClass3LI r1 = (AnonymousClass3LI) map.get(str);
        if (r1 == null) {
            try {
                AnonymousClass1M0 A032 = r6.A0P().get();
                try {
                    A092 = A032.A02.A09(C56612wb.A01, "loadChatSettings/QUERY_CHAT_SETTINGS", new String[]{str});
                    if (A092.moveToNext()) {
                        r1 = r6.A00(A092);
                        A092.close();
                        A032.close();
                    } else {
                        A092.close();
                        A032.close();
                        r1 = A01(r6);
                        if (C28981Uw.A03.A01(str) != null) {
                            r1.A03 = 1;
                        }
                    }
                    r1.A0F = str;
                    map.put(str, r1);
                } catch (Throwable th) {
                    A032.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e("chat-settings-store/get", e);
                r6.A0Y();
                throw e;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return r1;
        throw th;
    }

    private Long A03(AnonymousClass11F r19, long j, boolean z) {
        AnonymousClass1M0 A042;
        long j2 = j;
        AnonymousClass11F r9 = r19;
        boolean z2 = z;
        if (z) {
            this.A0L.A00(r9, 7);
        }
        AnonymousClass3LI A022 = A02(this, r9.getRawString());
        boolean z3 = A022.A0I;
        long j3 = A022.A06;
        try {
            A042 = A0P().A04();
            A022.A0I = z2;
            if (!z) {
                j2 = 0;
            }
            A022.A06 = j2;
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("pinned", Boolean.valueOf(A022.A0I));
            contentValues.put("pinned_time", Long.valueOf(A022.A06));
            C224114e r12 = A042.A02;
            boolean z4 = true;
            if (r12.A01(contentValues, "settings", "jid =?", "ChatSettingsStore/setPin/UPDATE_CHAT_SETTINGS", new String[]{r9.getRawString()}) == 0) {
                contentValues.put("jid", r9.getRawString());
                r12.A04("settings", "ChatSettingsStore/setPin/INSERT_CHAT_SETTINGS", contentValues);
            }
            if (z3 == z2 && j3 == A022.A06) {
                z4 = false;
            }
            A042.close();
            this.A0B.A00();
            if (z4) {
                if (C20800yB.A01(C21000yV.A01, this.A0C, 6045)) {
                    new LinkedHashSet(A0W().keySet());
                }
            }
            if (z4) {
                return Long.valueOf(j3);
            }
            return null;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/set-pin", e);
            A0Y();
            throw e;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static LinkedHashSet A04(AnonymousClass1CR r6) {
        Cursor A092;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            AnonymousClass1M0 A032 = r6.A0P().get();
            try {
                A092 = A032.A02.A09("SELECT jid FROM settings WHERE use_custom_notifications != 0", "getCustomNotificationJids/QUERY_CHAT_SETTINGS", (String[]) null);
                int columnIndexOrThrow = A092.getColumnIndexOrThrow("jid");
                while (A092.moveToNext()) {
                    AnonymousClass11F A022 = AnonymousClass11F.A00.A02(A092.getString(columnIndexOrThrow));
                    if (A022 != null) {
                        linkedHashSet.add(A022);
                    }
                }
                A092.close();
                A032.close();
                return linkedHashSet;
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/get-pinned-jids", e);
            r6.A0Y();
            throw e;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    private void A05() {
        C19970wo r5 = this.A0P;
        AnonymousClass17Y r1 = this.A03;
        C19630wG r6 = this.A07;
        C220412q r9 = this.A0A;
        C21060yb r4 = this.A0O;
        AnonymousClass171 r3 = this.A0N;
        this.A00 = new C24481Cp(r1, this.A0M, r3, r4, r5, r6, this.A0Q, this.A08, r9, this.A0R, this.A0B, this.A0U, this.A0W);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00fc, code lost:
        if (r13.A01() == 0) goto L_0x00fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.AnonymousClass3LI r13, X.AnonymousClass1CR r14) {
        /*
            r0 = 8
            android.content.ContentValues r8 = new android.content.ContentValues
            r8.<init>(r0)
            boolean r0 = r13.A0L
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "use_custom_notifications"
            r8.put(r0, r1)
            java.lang.String r1 = r13.A07()
            java.lang.String r0 = "message_tone"
            r8.put(r0, r1)
            java.lang.String r1 = r13.A08()
            java.lang.String r0 = "message_vibrate"
            r8.put(r0, r1)
            java.lang.String r1 = r13.A06()
            java.lang.String r0 = "message_popup"
            r8.put(r0, r1)
            java.lang.String r1 = r13.A05()
            java.lang.String r0 = "message_light"
            r8.put(r0, r1)
            java.lang.String r1 = r13.A03()
            java.lang.String r0 = "call_tone"
            r8.put(r0, r1)
            java.lang.String r1 = r13.A04()
            java.lang.String r0 = "call_vibrate"
            r8.put(r0, r1)
            boolean r0 = r13.A0I
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "pinned"
            r8.put(r0, r1)
            long r0 = r13.A06
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "pinned_time"
            r8.put(r0, r1)
            boolean r0 = r13.A0K
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "status_muted"
            r8.put(r0, r1)
            boolean r0 = r13.A0C()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "low_pri_notifications"
            r8.put(r0, r1)
            int r0 = r13.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "media_visibility"
            r8.put(r0, r1)
            X.3LI r0 = r13.A02()
            boolean r0 = r0.A0H
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "mute_reactions"
            r8.put(r0, r1)
            int r0 = r13.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "notifications_auto_muted"
            r8.put(r0, r1)
            int r0 = r13.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "push_recording_button_mode"
            r8.put(r0, r1)
            X.37Q r0 = r13.A08
            java.lang.String r2 = "wallpaper_light_value"
            java.lang.String r1 = "wallpaper_light_type"
            r4 = 0
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = r0.A01
            r8.put(r1, r0)
            X.37Q r0 = r13.A08
            java.lang.String r0 = r0.A02
            r8.put(r2, r0)
        L_0x00bb:
            X.37Q r0 = r13.A07
            java.lang.String r3 = "wallpaper_dark_opacity"
            java.lang.String r2 = "wallpaper_dark_value"
            java.lang.String r1 = "wallpaper_dark_type"
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r0.A01
            r8.put(r1, r0)
            X.37Q r0 = r13.A07
            java.lang.String r0 = r0.A02
            r8.put(r2, r0)
            X.37Q r0 = r13.A07
            java.lang.Integer r0 = r0.A00
            r8.put(r3, r0)
        L_0x00d8:
            long r3 = r13.A01()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x011a
            long r0 = r13.A01()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "mute_end"
            r8.put(r0, r1)
            boolean r0 = r13.A0J
            if (r0 != 0) goto L_0x00fe
            long r4 = r13.A01()
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x00ff
        L_0x00fe:
            r0 = 1
        L_0x00ff:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "muted_notifications"
            r8.put(r0, r1)
            goto L_0x011a
        L_0x0109:
            r8.put(r1, r4)
            r8.put(r2, r4)
            r8.put(r3, r4)
            goto L_0x00d8
        L_0x0113:
            r8.put(r1, r4)
            r8.put(r2, r4)
            goto L_0x00bb
        L_0x011a:
            X.1gM r0 = r14.A0P()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01d9 }
            X.1M0 r0 = r0.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01d9 }
            boolean r1 = A0B(r13)     // Catch:{ all -> 0x01cf }
            java.lang.String r9 = "settings"
            r6 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0161
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cf }
            r2.<init>()     // Catch:{ all -> 0x01cf }
            java.lang.String r1 = "chat-settings-store/save-chat-settings deleting row for id:"
            r2.append(r1)     // Catch:{ all -> 0x01cf }
            java.lang.String r1 = r13.A0F     // Catch:{ all -> 0x01cf }
            java.lang.String r1 = X.AnonymousClass143.A04(r1)     // Catch:{ all -> 0x01cf }
            r2.append(r1)     // Catch:{ all -> 0x01cf }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01cf }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x01cf }
            X.14e r4 = r0.A02     // Catch:{ all -> 0x01cf }
            java.lang.String r3 = "jid = ?"
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ all -> 0x01cf }
            java.lang.String r1 = r13.A0F     // Catch:{ all -> 0x01cf }
            r2[r6] = r1     // Catch:{ all -> 0x01cf }
            java.lang.String r1 = "saveChatSettings/DELETE_CHAT_SETTINGS"
            r4.A03(r9, r3, r1, r2)     // Catch:{ all -> 0x01cf }
            boolean r1 = X.C24501Cr.A00     // Catch:{ all -> 0x01cf }
            if (r1 == 0) goto L_0x01a3
            X.1Cp r2 = r14.A00     // Catch:{ all -> 0x01cf }
            java.lang.String r1 = r13.A0F     // Catch:{ all -> 0x01cf }
            r2.A0H(r1)     // Catch:{ all -> 0x01cf }
            goto L_0x01a3
        L_0x0161:
            X.14e r7 = r0.A02     // Catch:{ all -> 0x01cf }
            java.lang.String r10 = "jid = ?"
            java.lang.String[] r12 = new java.lang.String[r5]     // Catch:{ all -> 0x01cf }
            java.lang.String r1 = r13.A0F     // Catch:{ all -> 0x01cf }
            r12[r6] = r1     // Catch:{ all -> 0x01cf }
            java.lang.String r11 = "saveChatSettings/UPDATE_CHAT_SETTINGS"
            int r1 = r7.A01(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01cf }
            if (r1 != 0) goto L_0x017f
            java.lang.String r2 = "jid"
            java.lang.String r1 = r13.A0F     // Catch:{ all -> 0x01cf }
            r8.put(r2, r1)     // Catch:{ all -> 0x01cf }
            java.lang.String r1 = "saveChatSettings/INSERT_CHAT_SETTINGS"
            r7.A04(r9, r1, r8)     // Catch:{ all -> 0x01cf }
        L_0x017f:
            boolean r1 = X.C24501Cr.A00     // Catch:{ all -> 0x01cf }
            if (r1 == 0) goto L_0x01a3
            java.lang.String r1 = "individual_chat_defaults"
            java.lang.String r5 = r13.A0F     // Catch:{ all -> 0x01cf }
            boolean r1 = r1.equals(r5)     // Catch:{ all -> 0x01cf }
            if (r1 != 0) goto L_0x01ab
            java.lang.String r1 = "group_chat_defaults"
            boolean r1 = r1.equals(r5)     // Catch:{ all -> 0x01cf }
            if (r1 != 0) goto L_0x01ab
            boolean r1 = r13.A0L     // Catch:{ all -> 0x01cf }
            if (r1 != 0) goto L_0x01ab
            X.AnonymousClass143.A04(r5)     // Catch:{ all -> 0x01cf }
            X.1Cp r2 = r14.A00     // Catch:{ all -> 0x01cf }
            java.lang.String r1 = r13.A0F     // Catch:{ all -> 0x01cf }
            r2.A0H(r1)     // Catch:{ all -> 0x01cf }
        L_0x01a3:
            java.util.Map r2 = r14.A0I     // Catch:{ all -> 0x01cf }
            java.lang.String r1 = r13.A0F     // Catch:{ all -> 0x01cf }
            r2.remove(r1)     // Catch:{ all -> 0x01cf }
            goto L_0x01cb
        L_0x01ab:
            X.1Cp r2 = r14.A00     // Catch:{ all -> 0x01cf }
            java.lang.String r4 = r2.A07(r5)     // Catch:{ all -> 0x01cf }
            java.lang.String r6 = r13.A05()     // Catch:{ all -> 0x01cf }
            java.lang.String r7 = r13.A08()     // Catch:{ all -> 0x01cf }
            java.lang.String r1 = r13.A07()     // Catch:{ all -> 0x01cf }
            android.net.Uri r3 = android.net.Uri.parse(r1)     // Catch:{ all -> 0x01cf }
            boolean r8 = r13.A0C()     // Catch:{ all -> 0x01cf }
            boolean r9 = r13.A0L     // Catch:{ all -> 0x01cf }
            r2.A0D(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01cf }
            goto L_0x01a3
        L_0x01cb:
            r0.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01d9 }
            return
        L_0x01cf:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x01d4 }
            goto L_0x01d8
        L_0x01d4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01d9 }
        L_0x01d8:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x01d9 }
        L_0x01d9:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/save"
            com.whatsapp.util.Log.i(r0, r1)
            r14.A0Y()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CR.A06(X.3LI, X.1CR):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if ("individual_chat_defaults".equals(r2) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0B(X.AnonymousClass3LI r7) {
        /*
            java.lang.String r2 = r7.A0F
            java.lang.String r0 = "group_chat_defaults"
            boolean r0 = r0.equals(r2)
            r6 = 0
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "individual_chat_defaults"
            boolean r0 = r0.equals(r2)
            r1 = 0
            if (r0 == 0) goto L_0x0015
        L_0x0014:
            r1 = 1
        L_0x0015:
            X.3Ro r0 = X.C28981Uw.A03
            X.1Uw r0 = r0.A01(r2)
            r5 = 0
            if (r0 == 0) goto L_0x001f
            r5 = 1
        L_0x001f:
            if (r1 != 0) goto L_0x00c3
            long r1 = r7.A01
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00c3
            long r1 = r7.A05
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00c3
            boolean r0 = r7.A0L
            if (r0 != 0) goto L_0x00c3
            boolean r0 = r7.A0K
            if (r0 != 0) goto L_0x00c3
            X.3LI r2 = r7.A02()
            java.lang.String r1 = r7.A07()
            java.lang.String r0 = r2.A07()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00c3
            java.lang.String r1 = r7.A08()
            java.lang.String r0 = r2.A08()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00c3
            java.lang.String r1 = r7.A06()
            java.lang.String r0 = r2.A06()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00c3
            java.lang.String r1 = r7.A05()
            java.lang.String r0 = r2.A05()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00c3
            java.lang.String r1 = r7.A03()
            java.lang.String r0 = r2.A03()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00c3
            java.lang.String r1 = r7.A04()
            java.lang.String r0 = r2.A04()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00c3
            boolean r1 = r7.A0C()
            boolean r0 = r2.A0C()
            if (r1 != r0) goto L_0x00c3
            r1 = 1
            int r0 = r7.A03
            if (r5 == 0) goto L_0x00c4
            if (r0 != r1) goto L_0x00c3
        L_0x00a0:
            X.3LI r0 = r7.A02()
            boolean r1 = r0.A0H
            X.3LI r0 = r2.A02()
            boolean r0 = r0.A0H
            if (r1 != r0) goto L_0x00c3
            X.37Q r0 = r7.A08
            if (r0 != 0) goto L_0x00c3
            X.37Q r0 = r7.A07
            if (r0 != 0) goto L_0x00c3
            boolean r0 = r7.A0I
            if (r0 != 0) goto L_0x00c3
            int r0 = r7.A02
            if (r0 != 0) goto L_0x00c3
            int r0 = r7.A04
            if (r0 != 0) goto L_0x00c3
            r6 = 1
        L_0x00c3:
            return r6
        L_0x00c4:
            if (r0 != 0) goto L_0x00c3
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CR.A0B(X.3LI):boolean");
    }

    public static boolean A0C(AnonymousClass1CR r6, String str) {
        if (!C24501Cr.A00) {
            return false;
        }
        AnonymousClass1M0 A042 = r6.A0P().A04();
        try {
            C24491Cq r3 = C24481Cp.A0L;
            String A002 = r3.A00(str);
            if (A002 != null) {
                NotificationManager A072 = r6.A0O.A07();
                C18740tg.A06(A072);
                if (r6.A00.A0I(C34101gS.A01(A072, A002), A042)) {
                    r6.A0I.remove(r3.A01(A002));
                    A042.close();
                    return true;
                }
            }
            A042.close();
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02c9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a6, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        com.whatsapp.util.Log.e("chat-settings-store/backup failed", r2);
        r2 = new X.AnonymousClass6PN("chat-settings");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02be, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02bf, code lost:
        r15.A0P().A05();
        r9.unlock();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02a6 A[ExcHandler: IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r2v4 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x00a2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass6PN A0O(X.AnonymousClass5U6 r53) {
        /*
            r52 = this;
            r13 = r52
            X.0wG r12 = r13.A07
            X.0wo r0 = r13.A0P
            r26 = r0
            X.0yC r0 = r13.A0C
            r37 = r0
            X.17Y r0 = r13.A03
            r51 = r0
            X.0wN r0 = r13.A0J
            r50 = r0
            X.1CS r0 = r13.A0H
            r43 = r0
            X.0wQ r0 = r13.A04
            r49 = r0
            X.12q r0 = r13.A0A
            r32 = r0
            X.0xf r0 = r13.A0D
            r38 = r0
            X.12S r0 = r13.A0T
            r36 = r0
            X.16D r0 = r13.A05
            r19 = r0
            X.13J r0 = r13.A0V
            r18 = r0
            X.0yb r0 = r13.A0O
            r17 = r0
            X.171 r0 = r13.A0N
            r16 = r0
            X.1CY r0 = r13.A09
            r30 = r0
            X.1AO r0 = r13.A0L
            r20 = r0
            X.16I r15 = r13.A0M
            X.1Cb r0 = r13.A06
            r48 = r0
            X.1Cd r14 = r13.A0K
            X.1Ce r11 = r13.A0F
            X.0yE r10 = r13.A0Q
            X.0v0 r9 = r13.A08
            X.1Cf r8 = r13.A0B
            X.19W r7 = r13.A0W
            X.11g r6 = r13.A0S
            X.1Cg r0 = r13.A0G
            r42 = r0
            X.1Ch r5 = r13.A0E
            X.1A5 r4 = r13.A0R
            X.17z r3 = r13.A0U
            X.1Cj r2 = r13.A03
            java.lang.String r46 = "chatsettingsbackup.db"
            r1 = 0
            X.1CR r0 = new X.1CR
            r47 = 0
            r21 = r19
            r22 = r15
            r23 = r16
            r24 = r48
            r25 = r17
            r27 = r12
            r28 = r10
            r29 = r9
            r31 = r2
            r33 = r4
            r34 = r8
            r35 = r6
            r39 = r3
            r40 = r5
            r41 = r11
            r44 = r18
            r45 = r7
            r15 = r0
            r16 = r50
            r17 = r51
            r18 = r49
            r19 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            X.1gM r2 = r13.A0P()
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r2.A02
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r9 = r2.writeLock()
            r9.lock()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r5.<init>()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r2 = "chat-settings-store/copy "
            r5.append(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.1gM r4 = r13.A0P()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.0wG r2 = r4.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            android.content.Context r3 = r2.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r2 = r4.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.io.File r2 = r3.getDatabasePath(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r5.append(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r2 = " -> "
            r5.append(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.1gM r4 = r0.A0P()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.0wG r2 = r4.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            android.content.Context r3 = r2.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r2 = r4.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.io.File r2 = r3.getDatabasePath(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r5.append(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r2 = r5.toString()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.1gM r2 = r0.A0P()     // Catch:{ SQLiteDatabaseCorruptException -> 0x028c, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.1M0 r8 = r2.A04()     // Catch:{ SQLiteDatabaseCorruptException -> 0x028c, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.71s r7 = r8.B1k()     // Catch:{ all -> 0x0282 }
            X.1gM r2 = r13.A0P()     // Catch:{ all -> 0x0278 }
            X.1M0 r5 = r2.get()     // Catch:{ all -> 0x0278 }
            X.14e r6 = r5.A02     // Catch:{ all -> 0x026e }
            java.lang.String r4 = X.C56612wb.A00     // Catch:{ all -> 0x026e }
            r3 = 0
            java.lang.String r2 = "copyChatSettingsDb/QUERY_CHAT_SETTINGS"
            android.database.Cursor r6 = r6.A09(r4, r2, r3)     // Catch:{ all -> 0x026e }
            r6.getCount()     // Catch:{ all -> 0x0262 }
        L_0x00fc:
            boolean r2 = r6.moveToNext()     // Catch:{ all -> 0x0262 }
            if (r2 == 0) goto L_0x0137
            X.3LI r4 = r13.A00(r6)     // Catch:{ all -> 0x0262 }
            java.lang.String r2 = r4.A0F     // Catch:{ all -> 0x0262 }
            if (r2 == 0) goto L_0x0122
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r3.<init>()     // Catch:{ all -> 0x0262 }
            java.lang.String r2 = "chat-settings-store/copy-chat-settings "
            r3.append(r2)     // Catch:{ all -> 0x0262 }
            r3.append(r4)     // Catch:{ all -> 0x0262 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0262 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0262 }
            A06(r4, r0)     // Catch:{ all -> 0x0262 }
            goto L_0x00fc
        L_0x0122:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0262 }
            r3.<init>()     // Catch:{ all -> 0x0262 }
            java.lang.String r2 = "chat-settings-store/backup/null-jid/skipped "
            r3.append(r2)     // Catch:{ all -> 0x0262 }
            r3.append(r4)     // Catch:{ all -> 0x0262 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0262 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0262 }
            goto L_0x00fc
        L_0x0137:
            r7.A00()     // Catch:{ all -> 0x0262 }
            r6.close()     // Catch:{ all -> 0x026e }
            r5.close()     // Catch:{ all -> 0x0278 }
            r7.close()     // Catch:{ all -> 0x0282 }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x028c, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r2 = "chat-settings-store/backup/close-backup-db"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.1gM r2 = r0.A0P()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r2.A06()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.1gM r2 = r0.A0P()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r2.close()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            boolean r2 = r48.A02()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            if (r2 == 0) goto L_0x016d
            java.lang.String r1 = "chat-settings-store/backup/skip no media or read-only media"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r1 = "chat-settings"
            X.6PN r2 = new X.6PN     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r2.<init>(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            goto L_0x02b3
        L_0x016d:
            X.5U6 r2 = X.AnonymousClass5U6.CRYPT13     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r8 = r53
            if (r8 != r2) goto L_0x01a8
            X.179 r2 = r13.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.io.File r3 = r2.A02()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r2 = "chatsettingsbackup.db.crypt1"
            java.io.File r4 = new java.io.File     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r4.<init>(r3, r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
        L_0x0180:
            java.io.File r2 = r13.A0E(r8)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.util.ArrayList r2 = r13.A0K(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
        L_0x018c:
            boolean r2 = r5.hasNext()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            if (r2 == 0) goto L_0x01d2
            java.lang.Object r3 = r5.next()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            boolean r2 = r3.equals(r4)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            if (r2 != 0) goto L_0x018c
            boolean r2 = r3.exists()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            if (r2 == 0) goto L_0x018c
            r3.delete()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            goto L_0x018c
        L_0x01a8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r3.<init>()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r2 = "chatsettingsbackup.db.crypt"
            r3.append(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            int r2 = r8.version     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r3.append(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.5U6 r2 = X.AnonymousClass5U6.UNENCRYPTED     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            if (r8 != r2) goto L_0x01c6
            X.0yF r2 = r13.A04     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.io.File r4 = r2.A00(r3)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            goto L_0x0180
        L_0x01c6:
            X.179 r2 = r13.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.io.File r2 = r2.A02()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.io.File r4 = new java.io.File     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r4.<init>(r2, r3)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            goto L_0x0180
        L_0x01d2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r3.<init>()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r2 = "chat-settings-store/backup/to "
            r3.append(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r3.append(r4)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.1Ck r5 = r13.A01     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.0yF r2 = r13.A04     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r3 = 0
            r24 = r3
            r17 = r48
            r18 = r30
            r19 = r2
            r20 = r42
            r21 = r8
            r22 = r43
            r23 = r4
            r14 = r49
            r15 = r3
            r16 = r5
            X.6QE r7 = X.C109765Za.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            android.content.Context r2 = r12.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            boolean r2 = r7.A08(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            if (r2 != 0) goto L_0x021a
            java.lang.String r1 = "chat-settings-store/backup/prepare for backup failed"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r1 = "chat-settings"
            X.6PN r2 = new X.6PN     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r2.<init>(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            goto L_0x02b3
        L_0x021a:
            X.1gM r6 = r0.A0P()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.0wG r2 = r6.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            android.content.Context r5 = r2.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r2 = r6.A02     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.io.File r2 = r5.getDatabasePath(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r7.A07(r3, r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.io.File r2 = r13.A0E(r8)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.AnonymousClass00C.A0D(r2, r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.util.ArrayList r2 = r13.A0K(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            boolean r1 = r2.isEmpty()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r1 = r1 ^ 1
            r14 = 0
            if (r1 == 0) goto L_0x024c
            java.lang.Object r1 = X.C007103b.A0N(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.io.File r1 = (java.io.File) r1     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            if (r1 == 0) goto L_0x024c
            long r14 = r1.length()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
        L_0x024c:
            java.lang.String r13 = "chat-settings"
            r16 = 1
            X.6PN r10 = new X.6PN     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r11 = r4
            r12 = r3
            r10.<init>(r11, r12, r13, r14, r16)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.1gM r0 = r0.A0P()
            r0.A05()
            r9.unlock()
            return r10
        L_0x0262:
            r2 = move-exception
            if (r6 == 0) goto L_0x026d
            r6.close()     // Catch:{ all -> 0x0269 }
            goto L_0x026d
        L_0x0269:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x026e }
        L_0x026d:
            throw r2     // Catch:{ all -> 0x026e }
        L_0x026e:
            r2 = move-exception
            r5.close()     // Catch:{ all -> 0x0273 }
            goto L_0x0277
        L_0x0273:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x0278 }
        L_0x0277:
            throw r2     // Catch:{ all -> 0x0278 }
        L_0x0278:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x027d }
            goto L_0x0281
        L_0x027d:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ all -> 0x0282 }
        L_0x0281:
            throw r2     // Catch:{ all -> 0x0282 }
        L_0x0282:
            r2 = move-exception
            r8.close()     // Catch:{ all -> 0x0287 }
            goto L_0x028b
        L_0x0287:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x028c, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
        L_0x028b:
            throw r2     // Catch:{ SQLiteDatabaseCorruptException -> 0x028c, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
        L_0x028c:
            r2 = move-exception
            java.lang.String r1 = "chat-settings-store/copy"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r1 = "chat-settings-store/backup/failed-to-copy"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            X.1gM r1 = r0.A0P()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r1.close()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            java.lang.String r1 = "chat-settings"
            X.6PN r2 = new X.6PN     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            r2.<init>(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x02a6 }
            goto L_0x02b3
        L_0x02a6:
            r2 = move-exception
            java.lang.String r1 = "chat-settings-store/backup failed"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x02be }
            java.lang.String r1 = "chat-settings"
            X.6PN r2 = new X.6PN     // Catch:{ all -> 0x02be }
            r2.<init>(r1)     // Catch:{ all -> 0x02be }
        L_0x02b3:
            X.1gM r0 = r0.A0P()
            r0.A05()
            r9.unlock()
            return r2
        L_0x02be:
            r1 = move-exception
            X.1gM r0 = r0.A0P()
            r0.A05()
            r9.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CR.A0O(X.5U6):X.6PN");
    }

    public AnonymousClass3LI A0Q() {
        AnonymousClass3LI A022 = A02(this, "group_chat_defaults");
        if (A022.A0D == null) {
            A022.A0D = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A022.A0E)) {
            A022.A0E = "1";
        }
        if (TextUtils.isEmpty(A022.A0C)) {
            A022.A0C = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A022.A0B)) {
            A022.A0B = "FFFFFF";
        }
        return A022;
    }

    public AnonymousClass3LI A0R() {
        AnonymousClass3LI A022 = A02(this, "individual_chat_defaults");
        if (A022.A0D == null) {
            A022.A0D = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A022.A0E)) {
            A022.A0E = "1";
        }
        if (TextUtils.isEmpty(A022.A0C)) {
            A022.A0C = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A022.A0B)) {
            A022.A0B = "FFFFFF";
        }
        if (A022.A09 == null) {
            A022.A09 = Settings.System.DEFAULT_RINGTONE_URI.toString();
        }
        if (TextUtils.isEmpty(A022.A0A)) {
            A022.A0A = "1";
        }
        return A022;
    }

    public AnonymousClass3LI A0S(AnonymousClass11F r3) {
        return (AnonymousClass3LI) this.A0I.get(r3.getRawString());
    }

    public ArrayList A0V() {
        Cursor A092;
        ArrayList arrayList = new ArrayList();
        try {
            AnonymousClass1M0 A032 = A0P().get();
            try {
                A092 = A032.A02.A09(C56612wb.A00, "getSettings/QUERY_CHAT_SETTINGS", (String[]) null);
                while (A092.moveToNext()) {
                    arrayList.add(A00(A092));
                }
                A092.close();
                A032.close();
                return arrayList;
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            Log.e("getSettings/QUERY_CHAT_SETTINGS/settings/exception", e);
            return arrayList;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    @Deprecated
    public Set A0X() {
        Set set = this.A01;
        if (set == null) {
            return new LinkedHashSet(A0W().keySet());
        }
        return set;
    }

    public void A0Y() {
        this.A0I.clear();
        A0P().A05();
        A0a();
        A05();
    }

    public void A0Z() {
        String A012;
        if (C24501Cr.A00) {
            AnonymousClass1M0 A042 = A0P().A04();
            try {
                NotificationManager A072 = this.A0O.A07();
                C18740tg.A06(A072);
                for (NotificationChannel notificationChannel : C34101gS.A02(A072)) {
                    if (!C34091gR.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId()) && this.A00.A0I(notificationChannel, A042) && (A012 = C24481Cp.A0L.A01(notificationChannel.getId())) != null) {
                        this.A0I.remove(A012);
                    }
                }
                A042.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public void A0e(AnonymousClass3LI r3) {
        if (!r3.A0L) {
            r3 = r3.A02();
        }
        A09(this, r3.A0F, Settings.System.DEFAULT_NOTIFICATION_URI.toString());
        Log.i("chat-settings-store/set-underlying-message-tone-to-default updated message tone to default");
    }

    public void A0f(boolean z) {
        AnonymousClass3LI A022 = A02(this, "group_chat_defaults");
        if (z != A022.A0G) {
            A022.A0G = z;
            A06(A022, this);
        }
    }

    public void A0g(boolean z) {
        AnonymousClass3LI A022 = A02(this, "individual_chat_defaults");
        if (z != A022.A0G) {
            A022.A0G = z;
            A06(A022, this);
        }
    }

    public boolean A0h() {
        String string;
        C20810yC r7 = this.A0C;
        C21000yV r6 = C21000yV.A02;
        if (!C20800yB.A01(r6, r7, 3354)) {
            return false;
        }
        if (C20800yB.A01(r6, r7, 5418)) {
            AnonymousClass005 r3 = this.A08.A00;
            int i = ((SharedPreferences) r3.get()).getInt("push_to_video_sending_enabled", -1);
            if (i == 0) {
                return false;
            }
            if (i != 1) {
                int A002 = C20800yB.A00(r6, r7, 5419);
                if (A002 == -1) {
                    return false;
                }
                if (!(A002 == 0 || (string = ((SharedPreferences) r3.get()).getString("push_to_video_sending_enabled_default_info", (String) null)) == null)) {
                    boolean z = !string.endsWith("0");
                    if (Boolean.valueOf(z) == null || z) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public boolean A0k(AnonymousClass11F r2) {
        Set set = this.A01;
        if (set != null) {
            return set.contains(r2);
        }
        return A02(this, r2.getRawString()).A0I;
    }

    public HashSet B8Z() {
        Cursor A092;
        String str;
        String str2;
        HashSet hashSet = new HashSet();
        AnonymousClass3LI A0R2 = A0R();
        AnonymousClass37Q r1 = A0R2.A07;
        if (!(r1 == null || !"USER_PROVIDED".equalsIgnoreCase(r1.A01) || (str2 = r1.A02) == null)) {
            hashSet.add(str2);
        }
        AnonymousClass37Q r12 = A0R2.A08;
        if (!(r12 == null || !"USER_PROVIDED".equalsIgnoreCase(r12.A01) || (str = r12.A02) == null)) {
            hashSet.add(str);
        }
        try {
            AnonymousClass1M0 A032 = A0P().get();
            try {
                A092 = A032.A02.A09("SELECT wallpaper_light_value FROM settings WHERE wallpaper_light_type = ?", "getSettings/QUERY_WALLPAPER", new String[]{"USER_PROVIDED"});
                while (A092.moveToNext()) {
                    hashSet.add(A092.getString(A092.getColumnIndexOrThrow("wallpaper_light_value")));
                }
                A092.close();
                A032.close();
                return hashSet;
            } catch (Throwable th) {
                A032.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("chat-settings-store/get-wallpaper-files", e);
            throw e;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public AnonymousClass37Q BJC(AnonymousClass11F r2, boolean z) {
        AnonymousClass3LI A022;
        if (r2 == null) {
            A022 = A0R();
        } else {
            A022 = A02(this, r2.getRawString());
        }
        if (z) {
            return A022.A07;
        }
        return A022.A08;
    }

    public void BpI(AnonymousClass11F r2, AnonymousClass37Q r3, boolean z) {
        AnonymousClass3LI A022;
        if (r2 == null) {
            A022 = A0R();
        } else {
            A022 = A02(this, r2.getRawString());
        }
        if (z) {
            A022.A07 = r3;
        } else {
            A022.A08 = r3;
        }
        A06(A022, this);
    }

    private AnonymousClass3LI A00(Cursor cursor) {
        AnonymousClass3LI A012 = A01(this);
        A012.A0F = cursor.getString(cursor.getColumnIndexOrThrow("jid"));
        A012.A01 = cursor.getLong(cursor.getColumnIndexOrThrow("mute_end"));
        boolean z = true;
        boolean z2 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("muted_notifications")) == 1) {
            z2 = true;
        }
        A012.A0J = z2;
        boolean z3 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("use_custom_notifications")) == 1) {
            z3 = true;
        }
        A012.A0L = z3;
        A012.A0D = cursor.getString(cursor.getColumnIndexOrThrow("message_tone"));
        A012.A0E = cursor.getString(cursor.getColumnIndexOrThrow("message_vibrate"));
        A012.A0C = cursor.getString(cursor.getColumnIndexOrThrow("message_popup"));
        A012.A0B = cursor.getString(cursor.getColumnIndexOrThrow("message_light"));
        A012.A09 = cursor.getString(cursor.getColumnIndexOrThrow("call_tone"));
        A012.A0A = cursor.getString(cursor.getColumnIndexOrThrow("call_vibrate"));
        boolean z4 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("status_muted")) == 1) {
            z4 = true;
        }
        A012.A0K = z4;
        boolean z5 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("pinned")) == 1) {
            z5 = true;
        }
        A012.A0I = z5;
        A012.A06 = cursor.getLong(cursor.getColumnIndexOrThrow("pinned_time"));
        boolean z6 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("low_pri_notifications")) == 1) {
            z6 = true;
        }
        A012.A0G = z6;
        A012.A03 = cursor.getInt(cursor.getColumnIndexOrThrow("media_visibility"));
        if (cursor.getInt(cursor.getColumnIndexOrThrow("mute_reactions")) != 1) {
            z = false;
        }
        A012.A0H = z;
        if ("0".equals(A012.A0B)) {
            A012.A0B = "000000";
        }
        String string = cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_light_type"));
        if (string != null) {
            A012.A08 = new AnonymousClass37Q(0, string, cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_light_value")));
        }
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_dark_type"));
        if (string2 != null) {
            A012.A07 = new AnonymousClass37Q(Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("wallpaper_dark_opacity"))), string2, cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_dark_value")));
        }
        A012.A02 = cursor.getInt(cursor.getColumnIndexOrThrow("notifications_auto_muted"));
        A012.A04 = cursor.getInt(cursor.getColumnIndexOrThrow("push_recording_button_mode"));
        A012.A05 = cursor.getLong(cursor.getColumnIndexOrThrow("call_mute_end_time"));
        return A012;
    }

    public static AnonymousClass3LI A01(AnonymousClass1CR r8) {
        AnonymousClass1CR r7 = r8;
        if (C19550w8.A03()) {
            return new C47192dt(r8.A0O, r8.A0P, r8.A0Q, r7, r8.A00);
        }
        return new AnonymousClass3LI(r8.A0O, r8.A0P, r8.A0Q, r8);
    }

    public static void A07(AnonymousClass1CR r2, String str, String str2) {
        AnonymousClass3LI A022 = A02(r2, str);
        if (!TextUtils.equals(str2, A022.A0B)) {
            A022.A0B = str2;
            A06(A022, r2);
        }
    }

    public static void A08(AnonymousClass1CR r2, String str, String str2) {
        AnonymousClass3LI A022 = A02(r2, str);
        if (!TextUtils.equals(str2, A022.A0C)) {
            A022.A0C = str2;
            A06(A022, r2);
        }
    }

    public static void A09(AnonymousClass1CR r2, String str, String str2) {
        AnonymousClass3LI A022 = A02(r2, str);
        if (!TextUtils.equals(str2, A022.A0D)) {
            A022.A0D = str2;
            A06(A022, r2);
        }
    }

    public static void A0A(AnonymousClass1CR r2, String str, String str2) {
        AnonymousClass3LI A022 = A02(r2, str);
        if (!TextUtils.equals(str2, A022.A0E)) {
            A022.A0E = str2;
            A06(A022, r2);
        }
    }

    public void A0b(AnonymousClass11F r3, int i) {
        AnonymousClass3LI A022 = A02(this, r3.getRawString());
        if (i != A022.A02) {
            A022.A02 = i;
            A06(A022, this);
        }
    }

    public void A0c(AnonymousClass11F r14, long j) {
        AnonymousClass1M0 A042;
        AnonymousClass3LI A022 = A02(this, r14.getRawString());
        if (j != A022.A05) {
            try {
                A042 = A0P().A04();
                A022.A05 = j;
                if (A0B(A022)) {
                    A042.A02.A03("settings", "jid = ?", "ChatSettingsStore/setCallMute/DELETE_CHAT_SETTINGS", new String[]{r14.getRawString()});
                    this.A0I.remove(r14.getRawString());
                } else {
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("call_mute_end_time", Long.valueOf(j));
                    C224114e r7 = A042.A02;
                    if (r7.A01(contentValues, "settings", "jid = ?", "ChatSettingsStore/setCallMute/UPDATE_CHAT_SETTINGS", new String[]{r14.getRawString()}) == 0) {
                        contentValues.put("jid", r14.getRawString());
                        r7.A04("settings", "ChatSettingsStore/setCallMute/INSERT_CHAT_SETTINGS", contentValues);
                    }
                }
                A042.close();
                this.A03.A0H(new C35761jD(this, r14, 47));
                return;
            } catch (SQLiteDatabaseCorruptException e) {
                Log.i("chat-settings-store/setcallmute", e);
                A0Y();
                throw e;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            return;
        }
        throw th;
    }

    public void A0d(AnonymousClass11F r15, boolean z) {
        AnonymousClass3LI A022 = A02(this, r15.getRawString());
        if (C24501Cr.A00 && A022.A0L) {
            this.A00.A0H(r15.getRawString());
        }
        AnonymousClass1M0 A042 = A0P().A04();
        if (z) {
            try {
                if (A022.A0L) {
                    A022.A00 = System.currentTimeMillis();
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("deleted", Long.valueOf(A022.A00));
                    A042.A02.A01(contentValues, "settings", "jid = ?", "setChatDeleted/UPDATE_CHAT_SETTINGS", new String[]{r15.getRawString()});
                } else {
                    this.A0I.remove(r15.getRawString());
                    A042.A02.A03("settings", "jid = ?", "setChatDeleted/DELETE_CHAT_SETTINGS", new String[]{r15.getRawString()});
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        A042.close();
    }

    public boolean A0i(AnonymousClass11F r7) {
        boolean z;
        NotificationChannel A022;
        AnonymousClass3LI A023 = A02(this, r7.getRawString());
        if (!C24501Cr.A00 || !A023.A0L || (A022 = this.A00.A02(r7.getRawString())) == null || A022.getImportance() >= 3) {
            z = false;
        } else {
            Log.i("chat-settings-store//cancelMute unmuting channel");
            this.A00.A0C(A022, r7.getRawString(), C34101gS.A00(A023.A0C()));
            z = true;
        }
        boolean A0m = A0m(r7, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("chat-settings-store//cancelMute for jid:");
        sb.append(r7);
        sb.append(" channelChanged:");
        sb.append(z);
        sb.append(" dbchanged:");
        sb.append(A0m);
        Log.i(sb.toString());
        if (z || A0m) {
            return true;
        }
        return false;
    }

    public boolean A0j(AnonymousClass11F r2) {
        return A02(this, r2.getRawString()).A0A();
    }

    public boolean A0l(AnonymousClass11F r2) {
        return A02(this, r2.getRawString()).A0K;
    }

    public boolean A0m(AnonymousClass11F r12, long j) {
        AnonymousClass1M0 A042;
        AnonymousClass3LI A022 = A02(this, r12.getRawString());
        if (j == A022.A01) {
            return false;
        }
        try {
            A042 = A0P().A04();
            A022.A01 = j;
            if (A0B(A022)) {
                A042.A02.A03("settings", "jid = ?", "ChatSettingsStore/setMute/DELETE_CHAT_SETTINGS", new String[]{r12.getRawString()});
                this.A0I.remove(r12.getRawString());
            } else {
                A022.A0J = false;
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("mute_end", Long.valueOf(j));
                contentValues.put("muted_notifications", false);
                C224114e r5 = A042.A02;
                if (r5.A01(contentValues, "settings", "jid = ?", "ChatSettingsStore/setMute/UPDATE_CHAT_SETTINGS", new String[]{r12.getRawString()}) == 0) {
                    contentValues.put("jid", r12.getRawString());
                    r5.A04("settings", "ChatSettingsStore/setMute/INSERT_CHAT_SETTINGS", contentValues);
                }
            }
            A042.close();
            this.A03.A0H(new C35761jD(this, r12, 48));
            return true;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/setmute", e);
            A0Y();
            throw e;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public boolean A0n(UserJid userJid) {
        AnonymousClass3LI A022 = A02(this, userJid.getRawString());
        if (!A022.A0K) {
            return false;
        }
        A022.A0K = false;
        A06(A022, this);
        this.A03.A0H(new C35761jD(this, userJid, 49));
        return true;
    }

    public boolean A0o(UserJid userJid) {
        AnonymousClass3LI A022 = A02(this, userJid.getRawString());
        if (A022.A0K) {
            return false;
        }
        A022.A0K = true;
        A06(A022, this);
        this.A03.A0H(new C35761jD(this, userJid, 49));
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1CR(X.C19700wN r34, X.AnonymousClass17Y r35, X.C19730wQ r36, X.C24361Cd r37, X.AnonymousClass1AO r38, X.AnonymousClass16D r39, X.AnonymousClass16I r40, X.AnonymousClass171 r41, X.C24341Cb r42, X.C21060yb r43, X.C19970wo r44, X.C19630wG r45, X.C20830yE r46, X.C19420v0 r47, X.AnonymousClass1CY r48, X.C24421Cj r49, X.C220412q r50, X.AnonymousClass1A5 r51, X.C24381Cf r52, X.AnonymousClass11g r53, X.AnonymousClass12S r54, X.C20810yC r55, X.C20500xf r56, X.C233117z r57, X.C24401Ch r58, X.C24371Ce r59, X.C24391Cg r60, X.AnonymousClass1CS r61, X.AnonymousClass13J r62, X.AnonymousClass19W r63) {
        /*
            r33 = this;
            java.lang.String r31 = "chatsettings.db"
            r32 = 1
            r28 = r61
            r27 = r60
            r2 = r35
            r5 = r38
            r6 = r39
            r7 = r40
            r8 = r41
            r9 = r42
            r10 = r43
            r11 = r44
            r12 = r45
            r3 = r36
            r29 = r62
            r0 = r33
            r4 = r37
            r30 = r63
            r1 = r34
            r13 = r46
            r14 = r47
            r15 = r48
            r16 = r49
            r17 = r50
            r18 = r51
            r19 = r52
            r20 = r53
            r21 = r54
            r22 = r55
            r23 = r56
            r24 = r57
            r25 = r58
            r26 = r59
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1CR.<init>(X.0wN, X.17Y, X.0wQ, X.1Cd, X.1AO, X.16D, X.16I, X.171, X.1Cb, X.0yb, X.0wo, X.0wG, X.0yE, X.0v0, X.1CY, X.1Cj, X.12q, X.1A5, X.1Cf, X.11g, X.12S, X.0yC, X.0xf, X.17z, X.1Ch, X.1Ce, X.1Cg, X.1CS, X.13J, X.19W):void");
    }
}
