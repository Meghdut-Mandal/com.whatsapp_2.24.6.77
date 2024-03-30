package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1cL  reason: invalid class name and case insensitive filesystem */
public class C31761cL implements C31751cK, C236319f {
    public final C19460v5 A00;
    public final C19460v5 A01;
    public final C19460v5 A02;
    public final C19460v5 A03;
    public final C19460v5 A04;
    public final AnonymousClass17Y A05;
    public final C19730wQ A06;
    public final AnonymousClass1KK A07;
    public final C26421Kc A08;
    public final C31861cV A09;
    public final C31771cM A0A;
    public final C29461Ws A0B;
    public final AnonymousClass185 A0C;
    public final C20430xY A0D;
    public final C19970wo A0E;
    public final C19630wG A0F;
    public final C20310xM A0G;
    public final AnonymousClass1C4 A0H;
    public final C31891cY A0I;
    public final C19770wU A0J;
    public final Map A0K = new HashMap();
    public final C19460v5 A0L;
    public final C19460v5 A0M;
    public final C19460v5 A0N;
    public final C19460v5 A0O;
    public final C19460v5 A0P;
    public final C19460v5 A0Q;
    public final C19700wN A0R;
    public final C31781cN A0S;
    public final C19420v0 A0T;
    public final C20810yC A0U;
    public final C21010yW A0V;
    public final AnonymousClass19L A0W;
    public final C31871cW A0X;

    public int[] BCF() {
        return new int[]{202};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x015e, code lost:
        if (r2 == null) goto L_0x0160;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BJl(android.os.Message r22, int r23) {
        /*
            r21 = this;
            r3 = 0
            r0 = 202(0xca, float:2.83E-43)
            r1 = r23
            if (r1 != r0) goto L_0x00ea
            r0 = r22
            java.lang.Object r12 = r0.obj
            X.9nx r12 = (X.C203399nx) r12
            android.os.Bundle r1 = r0.getData()
            java.lang.String r0 = "stanzaKey"
            android.os.Parcelable r6 = r1.getParcelable(r0)
            X.9uj r6 = (X.C207209uj) r6
            r0 = r21
            X.19L r5 = r0.A0W
            long r1 = r6.A00
            r4 = 2
            X.9ju r2 = X.AnonymousClass19L.A00(r5, r4, r1)
            X.8eO r2 = (X.C177798eO) r2
            if (r2 == 0) goto L_0x0036
            X.9nx r1 = r12.A0b(r3)
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = r1.A00
            r2.A00 = r1
        L_0x0032:
            r1 = 3
            r2.A04(r1)
        L_0x0036:
            java.lang.String r1 = "verified_name"
            X.9nx r5 = r12.A0c(r1)
            java.lang.String r1 = "profile"
            X.9nx r15 = r12.A0c(r1)
            java.lang.String r1 = "remove"
            X.9nx r13 = r12.A0c(r1)
            java.lang.String r1 = "product_catalog"
            X.9nx r10 = r12.A0c(r1)
            java.lang.String r1 = "linked_accounts"
            X.9nx r20 = r12.A0c(r1)
            java.lang.String r1 = "suggestion"
            X.9nx r7 = r12.A0c(r1)
            java.lang.String r1 = "directory"
            X.9nx r11 = r12.A0c(r1)
            java.lang.String r1 = "report"
            X.9nx r9 = r12.A0c(r1)
            java.lang.String r1 = "ctwa_suggestion"
            r12.A0c(r1)
            java.lang.String r1 = "biz_integrity_warning_notification"
            r12.A0c(r1)
            java.lang.String r1 = "subscriptions"
            X.9nx r19 = r12.A0c(r1)
            java.lang.String r1 = "wa_ad_account_nonce"
            r12.A0c(r1)
            java.lang.String r1 = "privacy"
            X.9nx r8 = r12.A0c(r1)
            java.lang.String r1 = "campaign"
            X.9nx r18 = r12.A0c(r1)
            java.lang.String r1 = "mm_campaign"
            X.9nx r17 = r12.A0c(r1)
            X.6NS r16 = X.AnonymousClass6NS.A0F
            java.lang.String r4 = "hash"
            java.lang.String r14 = "jid"
            r1 = 0
            r3 = 1
            if (r5 == 0) goto L_0x00f0
            java.lang.Class<com.whatsapp.jid.UserJid> r7 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r13 = r5.A0X(r7, r14)
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13
            java.lang.String r8 = "verified_level"
            r7 = 0
            java.lang.String r10 = r5.A0i(r8, r7)
            java.lang.String r8 = "serial"
            long r17 = r5.A0V(r8, r1)
            java.lang.String r1 = "v"
            java.lang.String r8 = r5.A0i(r1, r7)
            java.lang.String r1 = "host_storage"
            java.lang.String r9 = r5.A0i(r1, r7)
            java.lang.String r1 = "actual_actors"
            java.lang.String r2 = r5.A0i(r1, r7)
            java.lang.String r1 = "privacy_mode_ts"
            java.lang.String r1 = r5.A0i(r1, r7)
            X.3ur r14 = new X.3ur
            r14.<init>((java.lang.String) r9, (java.lang.String) r2, (java.lang.String) r1)
            if (r13 == 0) goto L_0x00eb
            java.lang.String r1 = "1"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00e5
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00e5
            byte[] r15 = r5.A01
            int r16 = X.C111485cM.A00(r10)
            X.1cV r12 = r0.A09
            r12.A00(r13, r14, r15, r16, r17)
        L_0x00e5:
            X.1C4 r0 = r0.A0H
            r0.A01(r6)
        L_0x00ea:
            return r3
        L_0x00eb:
            java.lang.String r4 = r5.A0i(r4, r7)
            goto L_0x0160
        L_0x00f0:
            if (r15 == 0) goto L_0x0173
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = r15.A0X(r1, r14)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r1 = 0
            java.lang.String r4 = r15.A0i(r4, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x0158
            if (r2 == 0) goto L_0x0158
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "businessnotificationhandler/get-biz-profile jid="
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.Map r9 = r0.A0K
            java.lang.String r1 = r2.getRawString()
            boolean r1 = r9.containsKey(r1)
            if (r1 == 0) goto L_0x03c6
            java.lang.String r1 = r2.getRawString()
            java.lang.Object r1 = r9.get(r1)
            X.C18740tg.A06(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            long r4 = r1.longValue()
            X.0wo r1 = r0.A0E
            long r7 = X.C19970wo.A00(r1)
            long r7 = r7 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x03c6
            X.1KK r1 = r0.A07
            X.9uZ r8 = r1.A07(r2)
            X.17Y r4 = r0.A05
            r2 = 44
        L_0x014f:
            X.1iz r1 = new X.1iz
            r1.<init>(r0, r8, r2)
        L_0x0154:
            r4.A0H(r1)
            goto L_0x00e5
        L_0x0158:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x00e5
            if (r2 != 0) goto L_0x00e5
        L_0x0160:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            r2 = 0
            if (r1 != 0) goto L_0x00e5
            byte[] r1 = r4.getBytes()
            byte[] r4 = android.util.Base64.decode(r1, r2)
            java.util.Arrays.toString(r4)
            goto L_0x0196
        L_0x0173:
            if (r13 == 0) goto L_0x01b1
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r5 = r13.A0X(r1, r14)
            r1 = 0
            java.lang.String r2 = r13.A0i(r4, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x03df
            if (r5 != 0) goto L_0x03df
            byte[] r2 = r2.getBytes()
            r1 = 0
            byte[] r4 = android.util.Base64.decode(r2, r1)
            java.lang.String r1 = "businessnotificationhandler//biz-removed-jidhash"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x0196:
            X.5Tu r1 = X.C108515Tu.A0I
            X.6Pz r2 = new X.6Pz
            r2.<init>(r1)
            r2.A02 = r3
            r1 = r16
            r2.A00 = r1
            r2.A05(r4)
            X.6Pq r2 = r2.A01()
            X.0xY r1 = r0.A0D
            X.C20430xY.A00(r1, r2, r3)
            goto L_0x00e5
        L_0x01b1:
            if (r10 == 0) goto L_0x0235
            java.lang.String r1 = "product"
            X.9nx r4 = r10.A0c(r1)
            if (r4 == 0) goto L_0x03f9
            java.lang.String r1 = "businessnotificationhandler/product-changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r1 = "id"
            X.9nx r2 = r4.A0c(r1)
            java.lang.String r1 = "status_info"
            X.9nx r8 = r4.A0c(r1)
            r7 = 0
            if (r8 != 0) goto L_0x022e
            r1 = r7
        L_0x01d0:
            if (r2 != 0) goto L_0x0229
            r5 = r7
        L_0x01d3:
            if (r1 != 0) goto L_0x0224
            r4 = r7
        L_0x01d6:
            if (r8 != 0) goto L_0x0211
            r1 = r7
        L_0x01d9:
            r8 = r7
        L_0x01da:
            if (r1 == 0) goto L_0x01e0
            java.lang.String r7 = r1.A0e()
        L_0x01e0:
            boolean r1 = X.AnonymousClass14B.A0F(r5)
            if (r1 != 0) goto L_0x00e5
            boolean r1 = X.AnonymousClass14B.A0F(r4)
            if (r1 != 0) goto L_0x00e5
            X.1Ws r2 = r0.A0B
            r1 = 0
            X.9up r1 = r2.A06(r1, r5)
            if (r1 == 0) goto L_0x00e5
            int r4 = X.AnonymousClass962.A00(r4)
            X.9tw r2 = r1.A01
            if (r2 == 0) goto L_0x00e5
            int r1 = r2.A00
            if (r1 == r4) goto L_0x00e5
            r2.A00 = r4
            r2.A02 = r8
            r2.A01 = r7
            X.17Y r4 = r0.A05
            r2 = 5
            X.1il r1 = new X.1il
            r1.<init>(r2, r5, r0)
            goto L_0x0154
        L_0x0211:
            java.lang.String r1 = "reject_reason"
            X.9nx r2 = r8.A0c(r1)
            java.lang.String r1 = "commerce_url"
            X.9nx r1 = r8.A0c(r1)
            if (r2 == 0) goto L_0x01d9
            java.lang.String r8 = r2.A0e()
            goto L_0x01da
        L_0x0224:
            java.lang.String r4 = r1.A0e()
            goto L_0x01d6
        L_0x0229:
            java.lang.String r5 = r2.A0e()
            goto L_0x01d3
        L_0x022e:
            java.lang.String r1 = "status"
            X.9nx r1 = r8.A0c(r1)
            goto L_0x01d0
        L_0x0235:
            if (r20 != 0) goto L_0x00e5
            java.lang.String r4 = "notif_sub_type"
            r13 = 1000(0x3e8, double:4.94E-321)
            if (r7 == 0) goto L_0x02e0
            r10 = 0
            r7.A0i(r4, r10)
            java.lang.String r5 = r7.A0i(r4, r10)
            java.lang.String r4 = "cross_sell_smb_app"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x02e0
            java.lang.String r1 = "t"
            java.lang.String r4 = r12.A0i(r1, r10)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 / r13
            long r4 = X.AnonymousClass6R8.A01(r4, r1)
            java.lang.String r1 = "config"
            X.9nx r9 = r7.A0d(r1)
            java.lang.String r1 = "revoke"
            java.lang.String r1 = r9.A0i(r1, r10)
            boolean r8 = java.lang.Boolean.parseBoolean(r1)
            X.0yW r2 = r0.A0V
            X.0v0 r1 = r0.A0T
            X.1fk r7 = new X.1fk
            r7.<init>(r1, r2)
            if (r8 == 0) goto L_0x0438
            r4 = 0
            X.0v0 r5 = r7.A00
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r5)
            java.lang.String r1 = "biz_app_cross_sell_banner_click_count"
            android.content.SharedPreferences$Editor r1 = r2.putInt(r1, r4)
            r1.apply()
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r5)
            java.lang.String r1 = "biz_app_cross_sell_banner_dismiss_count"
            android.content.SharedPreferences$Editor r1 = r2.putInt(r1, r4)
            r1.apply()
            r1 = 0
            r8 = 4
            X.C33671fk.A00(r7, r8)
            android.content.SharedPreferences$Editor r9 = X.C19420v0.A00(r5)
            java.lang.String r8 = "biz_app_cross_sell_banner_expiry_days"
            android.content.SharedPreferences$Editor r8 = r9.putInt(r8, r4)
            r8.apply()
            java.lang.String r8 = "biz_app_cross_sell_banner_notif_time"
            r5.A1h(r8, r1)
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r5)
            java.lang.String r1 = "biz_app_cross_sell_banner_total_days"
            android.content.SharedPreferences$Editor r1 = r2.putInt(r1, r4)
            r1.apply()
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r5)
            java.lang.String r1 = "biz_app_cross_sell_banner_consecutive_days"
            android.content.SharedPreferences$Editor r1 = r2.putInt(r1, r4)
            r1.apply()
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r5)
            java.lang.String r1 = "biz_app_cross_sell_banner_cool_off_days"
            android.content.SharedPreferences$Editor r1 = r2.putInt(r1, r4)
            r1.apply()
            r1 = 5
            X.C33671fk.A00(r7, r1)
            java.lang.String r4 = "biz_app_upsell_banner_timestamp"
            r1 = -1
            r5.A1h(r4, r1)
            goto L_0x00e5
        L_0x02e0:
            if (r11 == 0) goto L_0x0335
            java.lang.String r2 = "type"
            r1 = 0
            java.lang.String r5 = r11.A0i(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0332
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r5.toUpperCase(r1)
            int r1 = r4.hashCode()
            switch(r1) {
                case -1786066693: goto L_0x0312;
                case -1344839652: goto L_0x0315;
                case -257068618: goto L_0x0318;
                case 1260847406: goto L_0x0325;
                default: goto L_0x02fc;
            }
        L_0x02fc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "BusinessNotificationHandler/handleDirectoryNotification notification not supported: "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = r2.toString()
        L_0x030d:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x00e5
        L_0x0312:
            java.lang.String r1 = "NUX_UPSELL"
            goto L_0x0327
        L_0x0315:
            java.lang.String r1 = "CONSUMER_LAUNCH"
            goto L_0x0327
        L_0x0318:
            java.lang.String r2 = "STATUS_UPDATE"
            boolean r1 = r4.equals(r2)
            if (r1 == 0) goto L_0x02fc
            r0.A00(r2)
            goto L_0x00e5
        L_0x0325:
            java.lang.String r1 = "PREPARE_FOR_CONSUMER_LAUNCH"
        L_0x0327:
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x02fc
            r0.A00(r5)
            goto L_0x00e5
        L_0x0332:
            java.lang.String r1 = "BusinessNotificationHandler/handleDirectoryNotification notification type is null"
            goto L_0x030d
        L_0x0335:
            if (r9 == 0) goto L_0x045e
            java.lang.String r4 = "creation"
            long r17 = r9.A0V(r4, r1)
            long r17 = r17 * r13
            X.0wo r4 = r0.A0E
            long r4 = X.C19970wo.A00(r4)
            r7 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r4 = r4 + r7
            long r4 = r4 / r13
            java.lang.String r7 = "expiration"
            long r19 = r9.A0V(r7, r4)
            long r19 = r19 * r13
            java.lang.String r4 = "url"
            X.9nx r13 = r9.A0c(r4)
            java.lang.String r4 = "direct_path"
            X.9nx r12 = r9.A0c(r4)
            java.lang.String r4 = "file_name"
            X.9nx r11 = r9.A0c(r4)
            java.lang.String r4 = "file_length"
            X.9nx r10 = r9.A0c(r4)
            java.lang.String r4 = "media_key"
            X.9nx r8 = r9.A0c(r4)
            java.lang.String r4 = "file_sha256"
            X.9nx r7 = r9.A0c(r4)
            java.lang.String r4 = "file_enc_sha256"
            X.9nx r5 = r9.A0c(r4)
            if (r13 == 0) goto L_0x0544
            if (r11 == 0) goto L_0x0544
            if (r10 == 0) goto L_0x0544
            if (r7 == 0) goto L_0x0544
            if (r5 == 0) goto L_0x0544
            if (r8 == 0) goto L_0x0544
            if (r12 == 0) goto L_0x0544
            java.lang.String r4 = r10.A0e()
            long r15 = X.AnonymousClass6R8.A01(r4, r1)
            java.lang.String r9 = r13.A0e()
            java.lang.String r10 = r12.A0e()
            X.C18740tg.A06(r10)
            java.lang.String r11 = r11.A0e()
            X.C18740tg.A06(r11)
            java.lang.String r12 = r8.A0e()
            X.C18740tg.A06(r12)
            java.lang.String r13 = r7.A0e()
            X.C18740tg.A06(r13)
            java.lang.String r14 = r5.A0e()
            X.C18740tg.A06(r14)
            X.3XD r8 = new X.3XD
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17, r19)
            X.17Y r4 = r0.A05
            r2 = 45
            goto L_0x014f
        L_0x03c6:
            java.lang.String r7 = r2.getRawString()
            X.0wo r1 = r0.A0E
            long r4 = X.C19970wo.A00(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r9.put(r7, r1)
            X.1KK r4 = r0.A07
            r1 = 0
            r4.A0E(r0, r2, r1)
            goto L_0x00e5
        L_0x03df:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x00e5
            if (r5 == 0) goto L_0x00e5
            java.lang.String r1 = "businessnotificationhandler/biz-removed-jid"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0wU r4 = r0.A0J
            r2 = 11
            X.1iV r1 = new X.1iV
            r1.<init>(r0, r5, r6, r2)
            r4.Boy(r1)
            return r3
        L_0x03f9:
            java.lang.String r1 = "collection"
            X.9nx r4 = r10.A0c(r1)
            if (r4 == 0) goto L_0x00e5
            java.lang.String r1 = "businessnotificationhandler/collection-changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0wQ r1 = r0.A06
            r1.A0G()
            com.whatsapp.jid.PhoneUserJid r11 = r1.A03
            if (r11 == 0) goto L_0x00ea
            java.lang.String r2 = "id"
            r1 = 0
            java.lang.String r7 = r4.A0i(r2, r1)
            java.lang.String r1 = "status_info"
            X.9nx r2 = r4.A0c(r1)
            boolean r1 = X.AnonymousClass14B.A0F(r7)
            if (r1 != 0) goto L_0x00e5
            if (r2 == 0) goto L_0x00e5
            X.9Wa r1 = X.C31781cN.A00(r2)
            X.1Ws r5 = r0.A0B
            X.9Wv r6 = r5.A05(r11, r7)
            if (r6 == 0) goto L_0x0537
            r6.A00 = r1
            X.AnonymousClass00C.A0D(r7, r3)
            monitor-enter(r5)
            goto L_0x04d3
        L_0x0438:
            java.lang.String r1 = "expires_in"
            java.lang.String r2 = r9.A0i(r1, r10)
            r1 = 30
            int r8 = X.AnonymousClass6R8.A00(r2, r1)
            r1 = 4
            X.C33671fk.A00(r7, r1)
            X.0v0 r7 = r7.A00
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r7)
            java.lang.String r1 = "biz_app_cross_sell_banner_expiry_days"
            android.content.SharedPreferences$Editor r1 = r2.putInt(r1, r8)
            r1.apply()
            java.lang.String r1 = "biz_app_cross_sell_banner_notif_time"
            r7.A1h(r1, r4)
            goto L_0x00e5
        L_0x045e:
            if (r19 == 0) goto L_0x0486
            X.0v5 r2 = r0.A04
            boolean r1 = r2.A05()
            if (r1 == 0) goto L_0x0473
            r2.A02()
            java.lang.String r1 = "handleSubscriptionNotification"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0473:
            X.0v5 r2 = r0.A00
            boolean r1 = r2.A05()
            if (r1 == 0) goto L_0x00e5
            r2.A02()
            java.lang.String r1 = "handleNotificationNode"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0486:
            if (r8 == 0) goto L_0x04a9
            java.lang.String r1 = "smb_data_sharing_with_meta_consent"
            X.9nx r4 = r8.A0c(r1)
            if (r4 == 0) goto L_0x00e5
            X.0v5 r2 = r0.A0N
            boolean r1 = r2.A05()
            if (r1 == 0) goto L_0x00e5
            r2.A02()
            java.lang.String r1 = "value"
            r0 = 0
            r4.A0i(r1, r0)
            java.lang.String r1 = "setLocalSmbDataSharingSetting"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x04a9:
            if (r18 == 0) goto L_0x04be
            X.0v5 r2 = r0.A02
            boolean r1 = r2.A05()
            if (r1 == 0) goto L_0x00e5
            r2.A02()
            java.lang.String r1 = "shouldHandlerNotification"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x04be:
            if (r17 == 0) goto L_0x00e5
            X.0v5 r2 = r0.A01
            boolean r1 = r2.A05()
            if (r1 == 0) goto L_0x00e5
            r2.A02()
            java.lang.String r1 = "handleNotification"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x04d3:
            X.9ct r10 = X.C29461Ws.A00(r5, r11)     // Catch:{ all -> 0x0533 }
            X.9ct r1 = X.C29461Ws.A00(r5, r11)     // Catch:{ all -> 0x0531 }
            java.util.Map r1 = r1.A05     // Catch:{ all -> 0x0531 }
            java.lang.Object r9 = r1.get(r7)     // Catch:{ all -> 0x0531 }
            X.9VT r9 = (X.AnonymousClass9VT) r9     // Catch:{ all -> 0x0531 }
            if (r9 == 0) goto L_0x0515
            r9.A01 = r6     // Catch:{ all -> 0x0533 }
            java.util.List r1 = r6.A04     // Catch:{ all -> 0x0533 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x0533 }
        L_0x04ed:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x0533 }
            if (r1 == 0) goto L_0x050b
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x0533 }
            X.9up r4 = (X.C207269up) r4     // Catch:{ all -> 0x0533 }
            java.util.Map r3 = r5.A02     // Catch:{ all -> 0x0533 }
            java.lang.String r2 = r4.A0F     // Catch:{ all -> 0x0533 }
            X.69b r1 = new X.69b     // Catch:{ all -> 0x0533 }
            r1.<init>(r11, r2)     // Catch:{ all -> 0x0533 }
            r3.put(r1, r4)     // Catch:{ all -> 0x0533 }
            java.util.Map r1 = r5.A03     // Catch:{ all -> 0x0533 }
            r1.put(r2, r11)     // Catch:{ all -> 0x0533 }
            goto L_0x04ed
        L_0x050b:
            java.util.Map r2 = r10.A05     // Catch:{ all -> 0x0533 }
            r2.remove(r7)     // Catch:{ all -> 0x0533 }
            java.lang.String r1 = r6.A03     // Catch:{ all -> 0x0533 }
            r2.put(r1, r9)     // Catch:{ all -> 0x0533 }
        L_0x0515:
            r4 = 0
            java.util.List r3 = r10.A03     // Catch:{ all -> 0x0533 }
            int r2 = r3.size()     // Catch:{ all -> 0x0533 }
        L_0x051c:
            if (r4 >= r2) goto L_0x0536
            java.lang.Object r1 = r3.get(r4)     // Catch:{ all -> 0x0533 }
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x0533 }
            if (r1 == 0) goto L_0x052e
            java.lang.String r1 = r6.A03     // Catch:{ all -> 0x0533 }
            r3.set(r4, r1)     // Catch:{ all -> 0x0533 }
            goto L_0x0536
        L_0x052e:
            int r4 = r4 + 1
            goto L_0x051c
        L_0x0531:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0533 }
        L_0x0533:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0536:
            monitor-exit(r5)
        L_0x0537:
            X.0v5 r0 = r0.A03
            r0.A02()
            java.lang.String r1 = "updateBizCollection"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0544:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31761cL.BJl(android.os.Message, int):boolean");
    }

    public void BYZ() {
    }

    public void BYa() {
    }

    private void A00(String str) {
        ((C18800tq) C19570wA.A00(C18800tq.class, this.A0F.A00)).AfI.A00.A0Z.get();
        C19700wN r2 = this.A0R;
        StringBuilder sb = new StringBuilder();
        sb.append("notificationType = ");
        sb.append(str);
        sb.append("; isSMB = ");
        sb.append(false);
        sb.append("; DirectoryEnabled = ");
        sb.append(false);
        r2.A0E("BusinessNotificationHandler/isSmbNotificationAllowed Trying to show a NUX Upsell notification to a not eligible user", sb.toString(), false);
    }

    public C31761cL(C19460v5 r2, C19460v5 r3, C19460v5 r4, C19460v5 r5, C19460v5 r6, C19460v5 r7, C19460v5 r8, C19460v5 r9, C19460v5 r10, C19460v5 r11, C19460v5 r12, C19700wN r13, AnonymousClass17Y r14, C19730wQ r15, AnonymousClass1KK r16, C26421Kc r17, C31861cV r18, C31771cM r19, C29461Ws r20, C31781cN r21, AnonymousClass185 r22, C20430xY r23, C19970wo r24, C19630wG r25, C19420v0 r26, C20310xM r27, C20810yC r28, C21010yW r29, AnonymousClass1C4 r30, AnonymousClass19L r31, C31891cY r32, C31871cW r33, C19770wU r34) {
        this.A0E = r24;
        this.A0U = r28;
        this.A05 = r14;
        this.A0R = r13;
        this.A0J = r34;
        this.A06 = r15;
        this.A0F = r25;
        this.A0V = r29;
        this.A0H = r30;
        this.A0G = r27;
        this.A0A = r19;
        this.A0S = r21;
        this.A0O = r2;
        this.A09 = r18;
        this.A0D = r23;
        this.A0B = r20;
        this.A0W = r31;
        this.A04 = r3;
        this.A0C = r22;
        this.A0T = r26;
        this.A00 = r5;
        this.A07 = r16;
        this.A0M = r4;
        this.A08 = r17;
        this.A0X = r33;
        this.A03 = r6;
        this.A0I = r32;
        this.A0L = r7;
        this.A0P = r8;
        this.A0Q = r9;
        this.A0N = r10;
        this.A02 = r11;
        this.A01 = r12;
    }
}
