package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Cp  reason: invalid class name and case insensitive filesystem */
public class C24481Cp {
    public static final long A0K = TimeUnit.DAYS.toMillis(60);
    public static final C24491Cq A0L = new C24491Cq();
    public Handler A00;
    public boolean A01 = false;
    public NotificationManager A02;
    public boolean A03 = false;
    public final AnonymousClass17Y A04;
    public final C226815j A05;
    public final AnonymousClass16I A06;
    public final C220412q A07;
    public final C24521Ct A08;
    public final C24381Cf A09;
    public final C24511Cs A0A;
    public final C233117z A0B;
    public final AnonymousClass19W A0C;
    public final AnonymousClass171 A0D;
    public final C21060yb A0E;
    public final C19970wo A0F;
    public final C19630wG A0G;
    public final C20830yE A0H;
    public final C19420v0 A0I;
    public final AnonymousClass1A5 A0J;

    public synchronized NotificationManager A03() {
        NotificationManager notificationManager;
        notificationManager = this.A02;
        if (notificationManager == null) {
            notificationManager = this.A0E.A07();
            this.A02 = notificationManager;
        }
        return notificationManager;
    }

    public synchronized String A05(Uri uri, CharSequence charSequence, String str, String str2, String str3, String str4, int i) {
        C24491Cq r4 = A0L;
        if (r4.A04(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("chat-settings-store/addNotificationChannel channel already exists for settingsId:");
            sb.append(AnonymousClass143.A04(str));
            Log.e(sb.toString());
            return r4.A00(str);
        }
        C19420v0 r6 = this.A0I;
        int i2 = ((SharedPreferences) r6.A00.get()).getInt("num_notification_channels_created", 0) + 1;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_");
        sb2.append(i2);
        String obj = sb2.toString();
        int i3 = i;
        NotificationChannel notificationChannel = new NotificationChannel(obj, charSequence, i3);
        String str5 = str4;
        if (!TextUtils.isEmpty(str5)) {
            notificationChannel.setGroup(str5);
        }
        Integer A032 = C20600xp.A03(str2);
        if (A032 != null) {
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(A032.intValue());
        } else {
            notificationChannel.enableLights(false);
        }
        long[] A0A2 = C20600xp.A0A(str3);
        if (A0A2 != null) {
            notificationChannel.setVibrationPattern(A0A2);
            notificationChannel.enableVibration(true);
        } else {
            notificationChannel.enableVibration(false);
        }
        notificationChannel.setSound(uri, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        notificationChannel.setLockscreenVisibility(0);
        if (!"group_chat_defaults".equals(str) && !"individual_chat_defaults".equals(str)) {
            AnonymousClass11F A022 = AnonymousClass11F.A00.A02(str);
            if (C19550w8.A07() && A022 != null) {
                AnonymousClass3ML.A00(notificationChannel, A022);
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("chat-settings-store/addNotificationChannel adding channel with id:");
        sb3.append(A01(obj));
        sb3.append(" importance:");
        sb3.append(i3);
        sb3.append(" lights:");
        sb3.append(notificationChannel.shouldShowLights());
        sb3.append(" color:");
        String hexString = Integer.toHexString(notificationChannel.getLightColor() & 16777215);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("000000".substring(hexString.length()));
        sb4.append(hexString);
        sb3.append(sb4.toString());
        sb3.append(" vibrate:");
        sb3.append(notificationChannel.shouldVibrate());
        sb3.append(" sounduri:");
        sb3.append(notificationChannel.getSound());
        Log.i(sb3.toString());
        C34101gS.A03(notificationChannel, A03());
        C19420v0.A00(r6).putInt("num_notification_channels_created", i2).apply();
        r4.A02(str, obj);
        return obj;
    }

    public synchronized void A0A() {
        synchronized (this) {
            if (Build.VERSION.SDK_INT >= 26 && this.A00 == null) {
                this.A00 = new Handler(this.A0C.A00(), new AnonymousClass3WX(this));
            }
            Handler handler = this.A00;
            C18740tg.A06(handler);
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessageDelayed(1, 3000);
            }
        }
    }

    public synchronized void A0B() {
        String str;
        if (this.A03) {
            for (NotificationChannel notificationChannel : C34101gS.A02(A03())) {
                if (!C34091gR.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId()) && "channel_group_chats".equals(notificationChannel.getGroup())) {
                    Pair A002 = C34111gT.A00(notificationChannel.getId());
                    if (A002 == null || (str = (String) A002.first) == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("chat-settings-store/updateChannelNames ignoring channel:");
                        sb.append(notificationChannel.getId());
                        Log.i(sb.toString());
                    } else {
                        CharSequence name = notificationChannel.getName();
                        String A072 = A07(str);
                        if (!TextUtils.equals(name, A072)) {
                            notificationChannel.getId();
                            C34101gS.A03(new NotificationChannel(notificationChannel.getId(), A072, notificationChannel.getImportance()), A03());
                        }
                    }
                }
            }
        }
    }

    public synchronized void A0C(NotificationChannel notificationChannel, String str, int i) {
        C19420v0 r6 = this.A0I;
        int i2 = ((SharedPreferences) r6.A00.get()).getInt("num_notification_channels_created", 0) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(i2);
        String obj = sb.toString();
        NotificationChannel notificationChannel2 = new NotificationChannel(obj, A07(str), i);
        notificationChannel2.setGroup("channel_group_chats");
        notificationChannel2.enableLights(notificationChannel.shouldShowLights());
        notificationChannel2.setLightColor(notificationChannel.getLightColor());
        notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
        notificationChannel2.setVibrationPattern(notificationChannel.getVibrationPattern());
        notificationChannel2.setSound(notificationChannel.getSound(), notificationChannel.getAudioAttributes());
        notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
        notificationChannel2.setShowBadge(notificationChannel.canShowBadge());
        notificationChannel2.setBypassDnd(notificationChannel.canBypassDnd());
        C24491Cq r2 = A0L;
        r2.A03(str, notificationChannel.getId());
        C34101gS.A05(A03(), notificationChannel.getId());
        C34101gS.A03(notificationChannel2, A03());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("chat-settings-store/unMuteChannelBySettingsId creating new channel:");
        sb2.append(notificationChannel2);
        Log.i(sb2.toString());
        r2.A02(str, obj);
        C19420v0.A00(r6).putInt("num_notification_channels_created", i2).apply();
    }

    public void A0D(Uri uri, CharSequence charSequence, String str, String str2, String str3, boolean z, boolean z2) {
        int i;
        String str4 = str;
        AnonymousClass143.A04(str);
        String A002 = A0L.A00(str);
        if (!C34091gR.A01.contains(A002)) {
            Uri uri2 = uri;
            String str5 = str2;
            String str6 = str3;
            if (A002 != null) {
                NotificationChannel A012 = C34101gS.A01(A03(), A002);
                boolean z3 = false;
                Integer A032 = C20600xp.A03(str5);
                boolean shouldShowLights = A012.shouldShowLights();
                if (A032 == null ? shouldShowLights : !(shouldShowLights && A032.equals(Integer.valueOf(A012.getLightColor())))) {
                    z3 = true;
                }
                long[] A0A2 = C20600xp.A0A(str6);
                boolean shouldVibrate = A012.shouldVibrate();
                if (A0A2 == null ? shouldVibrate : !shouldVibrate) {
                    z3 = true;
                }
                if (!Objects.equals(uri, A012.getSound())) {
                    z3 = true;
                }
                i = A012.getImportance();
                int i2 = 4;
                if (z) {
                    i2 = 3;
                }
                if (i == i2) {
                    i = i2;
                } else if (i >= 3) {
                    i = i2;
                    z3 = true;
                } else {
                    AnonymousClass143.A04(str);
                }
                if ((!C19550w8.A07() || !z2 || !TextUtils.isEmpty(A012.getConversationId())) && !z3) {
                    AnonymousClass143.A04(str);
                    return;
                }
                A0H(str);
            } else {
                i = 4;
                if (z) {
                    i = 3;
                }
            }
            A05(uri2, charSequence, str4, str5, str6, "channel_group_chats", i);
        }
    }

    public synchronized void A0E(C26901Ly r2) {
        A0G(((AnonymousClass1M0) r2).A02);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ContentValues A00(android.app.NotificationChannel r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.Integer r1 = X.C20600xp.A03(r7)
            java.lang.String r5 = "message_light"
            boolean r0 = r6.shouldShowLights()
            if (r1 == 0) goto L_0x00c0
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "000000"
        L_0x0015:
            r4.put(r5, r0)
        L_0x0018:
            long[] r2 = X.C20600xp.A0A(r8)
            java.lang.String r1 = "message_vibrate"
            boolean r0 = r6.shouldVibrate()
            if (r2 == 0) goto L_0x0080
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "0"
        L_0x0028:
            r4.put(r1, r0)
        L_0x002b:
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = "message_tone"
            android.net.Uri r0 = r6.getSound()
            if (r2 != 0) goto L_0x005a
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = ""
        L_0x003b:
            r4.put(r1, r0)
        L_0x003e:
            r0 = 4
            if (r10 == 0) goto L_0x0042
            r0 = 3
        L_0x0042:
            int r2 = r6.getImportance()
            if (r2 == r0) goto L_0x0059
            r0 = 3
            if (r2 < r0) goto L_0x0059
            r1 = 3
            r0 = 0
            if (r2 != r1) goto L_0x0050
            r0 = 1
        L_0x0050:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "low_pri_notifications"
            r4.put(r0, r1)
        L_0x0059:
            return r4
        L_0x005a:
            if (r0 == 0) goto L_0x003e
            android.net.Uri r0 = r6.getSound()
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            goto L_0x0075
        L_0x0069:
            android.net.Uri r0 = r6.getSound()
            java.lang.String r0 = r0.toString()
            boolean r0 = r9.equals(r0)
        L_0x0075:
            if (r0 != 0) goto L_0x003e
            android.net.Uri r0 = r6.getSound()
            java.lang.String r0 = r0.toString()
            goto L_0x003b
        L_0x0080:
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "1"
            goto L_0x0028
        L_0x0085:
            int r0 = r6.getLightColor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0018
            int r1 = r6.getLightColor()
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            java.lang.String r3 = java.lang.Integer.toHexString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r1 = r3.length()
            java.lang.String r0 = "000000"
            java.lang.String r0 = r0.substring(r1)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toUpperCase(r0)
            goto L_0x0015
        L_0x00c0:
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = "FFFFFF"
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24481Cp.A00(android.app.NotificationChannel, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.ContentValues");
    }

    public NotificationChannel A02(String str) {
        C24491Cq r2 = A0L;
        if (r2.A04(str)) {
            return C34101gS.A01(A03(), r2.A00(str));
        }
        return null;
    }

    public Uri A04(String str) {
        Uri parse;
        if (str == null) {
            parse = Uri.EMPTY;
        } else {
            parse = Uri.parse(str);
        }
        if (TextUtils.isEmpty(str) || AnonymousClass6YY.A0L(parse, this.A0E, this.A0H, true)) {
            return parse;
        }
        return Settings.System.DEFAULT_NOTIFICATION_URI;
    }

    public String A06(String str) {
        String A012 = A0L.A01(str);
        if (!"silent_notifications".equals(A012)) {
            return str;
        }
        if (C34101gS.A01(A03(), str).getImportance() <= 2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("chat-settings-store/repairSilentNotificationChannel repairing channel:");
        sb.append(AnonymousClass143.A04(A012));
        Log.i(sb.toString());
        A0H(A012);
        return A05((Uri) null, A07(A012), A012, (String) null, (String) null, (String) null, 2);
    }

    public String A07(String str) {
        Context context;
        int i;
        if ("individual_chat_defaults".equals(str)) {
            context = this.A0G.A00;
            i = R.string.f12nameremoved;
        } else if ("group_chat_defaults".equals(str)) {
            context = this.A0G.A00;
            i = R.string.f12nameremoved;
        } else if ("silent_notifications".equals(str)) {
            context = this.A0G.A00;
            i = R.string.f12nameremoved;
        } else if ("channel_notification".equals(str)) {
            context = this.A0G.A00;
            i = R.string.f12nameremoved;
        } else if ("voip_notification".equals(str)) {
            context = this.A0G.A00;
            i = R.string.f12nameremoved;
        } else {
            AnonymousClass11F A022 = AnonymousClass11F.A00.A02(str);
            if (A022 == null) {
                return null;
            }
            return this.A0D.A0H(this.A0J.A01(A022));
        }
        return context.getString(i);
    }

    public void A09() {
        if (Build.VERSION.SDK_INT >= 26) {
            Log.i("chat-settings-store/deleteDatabaseFiles success");
            A08();
        }
    }

    public void A0F(C224114e r3) {
        if (Build.VERSION.SDK_INT >= 26) {
            Log.i("chat-settings-store/onOpen targeting api 26");
            A0G(r3);
        }
    }

    public synchronized void A0G(C224114e r24) {
        Cursor A092;
        AnonymousClass11F A022;
        Pair A002;
        String str;
        String str2;
        synchronized (this) {
            C24491Cq r1 = A0L;
            synchronized (r1) {
                r1.A01.clear();
                r1.A00.clear();
            }
            this.A03 = false;
            C34091gR.A00(this.A0G.A00, this.A0E);
            List<NotificationChannel> A023 = C34101gS.A02(A03());
            C19420v0 r14 = this.A0I;
            AnonymousClass005 r5 = r14.A00;
            ((SharedPreferences) r5.get()).getInt("notification_channels_schema_version", 0);
            if (((SharedPreferences) r5.get()).getInt("notification_channels_schema_version", 0) >= 2) {
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                for (NotificationChannel notificationChannel : A023) {
                    if (!C34091gR.A01.contains(notificationChannel.getId())) {
                        Pair A003 = C34111gT.A00(notificationChannel.getId());
                        if (A003 != null) {
                            str2 = (String) A003.first;
                        } else {
                            str2 = null;
                        }
                        if ("individual_chat_defaults".equals(str2)) {
                            z = true;
                        } else if ("group_chat_defaults".equals(str2)) {
                            z2 = true;
                        } else if ("silent_notifications".equals(str2)) {
                            z3 = true;
                        }
                    }
                }
                if (z && z2 && z3) {
                    A023.size();
                    ((SharedPreferences) r5.get()).getInt("num_notification_channels_created", 0);
                    C34101gS.A04(A03());
                    for (NotificationChannel notificationChannel2 : A023) {
                        if (!C34091gR.A01.contains(notificationChannel2.getId()) && !"miscellaneous".equals(notificationChannel2.getId()) && (A002 = C34111gT.A00(notificationChannel2.getId())) != null && (str = (String) A002.first) != null) {
                            AnonymousClass143.A04(str);
                            r1.A02(str, notificationChannel2.getId());
                        }
                    }
                    this.A03 = true;
                    this.A04.Bp3(new C35731jA((Object) this, 38));
                }
            }
            A08();
            C34101gS.A04(A03());
            try {
                A092 = r24.A09("SELECT jid, message_light, message_vibrate, message_tone, use_custom_notifications, low_pri_notifications FROM settings", "CHAT_SETTINGS/GET_ALL_NOTIFICATION_CHANNELS", (String[]) null);
                int columnIndexOrThrow = A092.getColumnIndexOrThrow("jid");
                int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("message_light");
                int columnIndexOrThrow3 = A092.getColumnIndexOrThrow("message_vibrate");
                int columnIndexOrThrow4 = A092.getColumnIndexOrThrow("message_tone");
                int columnIndexOrThrow5 = A092.getColumnIndexOrThrow("use_custom_notifications");
                int columnIndexOrThrow6 = A092.getColumnIndexOrThrow("low_pri_notifications");
                while (A092.moveToNext()) {
                    String string = A092.getString(columnIndexOrThrow);
                    boolean z4 = false;
                    boolean z5 = false;
                    if (A092.getInt(columnIndexOrThrow5) == 1) {
                        z5 = true;
                    }
                    if (!"individual_chat_defaults".equals(string) && !"group_chat_defaults".equals(string)) {
                        if (z5 && (A022 = AnonymousClass11F.A00.A02(string)) != null) {
                            C220412q r11 = this.A07;
                            if (r11.A0M(A022)) {
                                if (r11.A08(A022) <= System.currentTimeMillis() - A0K) {
                                }
                            }
                        }
                    }
                    if (A092.getInt(columnIndexOrThrow6) == 1) {
                        z4 = true;
                    }
                    String A072 = A07(string);
                    int i = 4;
                    if (z4) {
                        i = 3;
                    }
                    A05(A04(A092.getString(columnIndexOrThrow4)), A072, string, A092.getString(columnIndexOrThrow2), A092.getString(columnIndexOrThrow3), "channel_group_chats", i);
                }
                A092.close();
            } catch (Exception e) {
                Log.e("chat-settings-store/syncNotificationChannels", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            if (!r1.A04("individual_chat_defaults")) {
                A05(Settings.System.DEFAULT_NOTIFICATION_URI, A07("individual_chat_defaults"), "individual_chat_defaults", "FFFFFF", "1", "channel_group_chats", 4);
            }
            if (!r1.A04("group_chat_defaults")) {
                A05(Settings.System.DEFAULT_NOTIFICATION_URI, A07("group_chat_defaults"), "group_chat_defaults", "FFFFFF", "1", "channel_group_chats", 4);
            }
            if (!r1.A04("silent_notifications")) {
                A05((Uri) null, A07("silent_notifications"), "silent_notifications", (String) null, (String) null, (String) null, 2);
            }
            this.A03 = true;
            C19420v0.A00(r14).putInt("notification_channels_schema_version", 2).apply();
            this.A04.Bp3(new C35731jA((Object) this, 38));
        }
        return;
        throw th;
    }

    public void A0H(String str) {
        C24491Cq r1 = A0L;
        String A002 = r1.A00(str);
        if (A002 != null && !C34091gR.A01.contains(A002)) {
            C34101gS.A05(A03(), A002);
            r1.A03(str, A002);
            StringBuilder sb = new StringBuilder();
            sb.append("chat-settings-store/deleteNotificationChannel/deleting channelId:");
            sb.append(A01(A002));
            sb.append(" for settingsId:");
            sb.append(AnonymousClass143.A04(str));
            Log.i(sb.toString());
        }
    }

    public boolean A0I(NotificationChannel notificationChannel, C26911Lz r20) {
        String str;
        StringBuilder sb;
        Cursor A092;
        NotificationChannel notificationChannel2 = notificationChannel;
        C26911Lz r3 = r20;
        String id = notificationChannel2.getId();
        Pair A002 = C34111gT.A00(id);
        if (A002 != null) {
            str = (String) A002.first;
        } else {
            str = null;
        }
        if (str == null) {
            sb.append("chat-settings-store/updateStoreFromNotificationChannel invalid channel id: ");
            sb.append(A01(id));
            Log.e(sb.toString());
            return false;
        }
        sb = new StringBuilder();
        sb.append("chat-settings-store/updateStoreFromNotificationChannel for id:");
        sb.append(A01(id));
        Log.i(sb.toString());
        try {
            C224114e r12 = ((AnonymousClass1M0) r3).A02;
            A092 = r12.A09("SELECT message_light, message_vibrate, message_tone, low_pri_notifications FROM settings WHERE jid = ?", "updateStoreFromNotificationChannel/QUERY_CHAT_SETTINGS", new String[]{str});
            if (A092.moveToNext()) {
                AnonymousClass143.A04(str);
                String string = A092.getString(A092.getColumnIndexOrThrow("message_light"));
                String string2 = A092.getString(A092.getColumnIndexOrThrow("message_vibrate"));
                String string3 = A092.getString(A092.getColumnIndexOrThrow("message_tone"));
                boolean z = false;
                if (A092.getInt(A092.getColumnIndexOrThrow("low_pri_notifications")) == 1) {
                    z = true;
                }
                ContentValues A003 = A00(notificationChannel2, string, string2, string3, z);
                if (A003.size() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("chat-settings-store/updateStoreFromNotificationChannel updating row for settingsId: ");
                    sb2.append(AnonymousClass143.A04(str));
                    sb2.append(" with values:");
                    sb2.append(A003);
                    Log.i(sb2.toString());
                    r12.A01(A003, "settings", "jid = ?", "updateStoreFromNotificationChannel/UPDATE_CHAT_SETTINGS", new String[]{str});
                }
                A092.close();
                return false;
            }
            AnonymousClass143.A04(str);
            if ("individual_chat_defaults".equals(str) || "group_chat_defaults".equals(str)) {
                ContentValues A004 = A00(notificationChannel2, "FFFFFF", "1", Settings.System.DEFAULT_NOTIFICATION_URI.toString(), false);
                if (A004.size() > 0) {
                    A004.put("jid", str);
                    if (!A004.containsKey("message_light")) {
                        A004.put("message_light", "FFFFFF");
                    }
                    if (!A004.containsKey("message_vibrate")) {
                        A004.put("message_vibrate", "1");
                    }
                    if (!A004.containsKey("message_tone")) {
                        A004.put("message_tone", Settings.System.DEFAULT_NOTIFICATION_URI.toString());
                    }
                    A004.put("message_popup", Integer.toString(0));
                    A004.put("call_tone", Settings.System.DEFAULT_RINGTONE_URI.toString());
                    A004.put("call_vibrate", "1");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("chat-settings-store/updateStoreFromNotificationChannel adding row for settingsId: ");
                    sb3.append(AnonymousClass143.A04(str));
                    Log.i(sb3.toString());
                    r12.A04("settings", "ChatSettingsStore/updateStoreFromNotificationChannel/INSERT_CHAT_SETTINGS", A004);
                }
                A092.close();
                return false;
            }
            if (!"silent_notifications".equals(str) && !"voip_notification".equals(str)) {
                C34101gS.A05(A03(), id);
                A0L.A03(str, id);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("chat-settings-store/updateStoreFromNotificationChannel deleting channel: ");
                sb4.append(A01(id));
                Log.i(sb4.toString());
            }
            A092.close();
            return false;
            A092.close();
            return true;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.i("chat-settings-store/updateStoreFromNotificationChannel", e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public boolean A0J(String str) {
        if (!"voip_notification".equals(A0L.A01(str)) || C34101gS.A01(A03(), str).getImportance() != 0) {
            return false;
        }
        return true;
    }

    public C24481Cp(AnonymousClass17Y r5, AnonymousClass16I r6, AnonymousClass171 r7, C21060yb r8, C19970wo r9, C19630wG r10, C20830yE r11, C19420v0 r12, C220412q r13, AnonymousClass1A5 r14, C24381Cf r15, C233117z r16, AnonymousClass19W r17) {
        C36001jb r0;
        C36021jd r02;
        boolean z = C24501Cr.A00;
        C36071ji r2 = null;
        if (z) {
            r0 = new C36001jb(this, 5);
        } else {
            r0 = null;
        }
        this.A05 = r0;
        if (z) {
            r02 = new C36021jd(this, 3);
        } else {
            r02 = null;
        }
        this.A0A = r02;
        this.A08 = z ? new C36071ji(this, 3) : r2;
        this.A0F = r9;
        this.A04 = r5;
        this.A0G = r10;
        this.A07 = r13;
        this.A0E = r8;
        this.A0D = r7;
        this.A06 = r6;
        this.A0H = r11;
        this.A0I = r12;
        this.A09 = r15;
        this.A0C = r17;
        this.A0J = r14;
        this.A0B = r16;
    }

    public static String A01(String str) {
        Pair A002 = C34111gT.A00(str);
        if (A002 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass143.A04((String) A002.first));
        sb.append("_");
        sb.append(A002.second);
        return sb.toString();
    }

    public void A08() {
        NotificationManager A032 = A03();
        C18740tg.A06(A032);
        for (NotificationChannel notificationChannel : C34101gS.A02(A032)) {
            if (!C34091gR.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId())) {
                StringBuilder sb = new StringBuilder();
                sb.append("chat-settings-store/deleteAllNotificationChannels/Deleting notification channel: ");
                sb.append(notificationChannel.getId());
                Log.i(sb.toString());
                C34101gS.A05(A032, notificationChannel.getId());
            }
        }
        C24491Cq r1 = A0L;
        synchronized (r1) {
            r1.A01.clear();
            r1.A00.clear();
        }
    }
}
