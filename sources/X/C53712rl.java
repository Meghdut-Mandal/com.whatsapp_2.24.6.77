package X;

import android.database.Cursor;

/* renamed from: X.2rl  reason: invalid class name and case insensitive filesystem */
public abstract class C53712rl {
    public static boolean A01(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str)) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        if (r6 == 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01f4, code lost:
        if (r3.getInt(r5) != 1) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x020a, code lost:
        if (r3.getInt(r5) != 1) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0220, code lost:
        if (r3.getInt(r5) != 1) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02c4, code lost:
        if (r3.getInt(r5) != 1) goto L_0x02c6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass141 A00(android.database.Cursor r21) {
        /*
            java.lang.String r0 = "jid"
            r3 = r21
            java.lang.String r0 = X.C36341k9.A0f(r3, r0)
            X.11F r0 = X.C36421kH.A0N(r0)
            X.141 r2 = new X.141
            r2.<init>(r0)
            java.lang.String r0 = "status"
            java.lang.String r0 = X.C36341k9.A0f(r3, r0)
            r2.A0X = r0
            java.lang.String r0 = "status_timestamp"
            long r0 = X.C36351kA.A07(r3, r0)
            r2.A0D = r0
            java.lang.String r0 = "_id"
            long r0 = X.C36351kA.A07(r3, r0)
            r2.A0L(r0)
            java.lang.String r0 = "phone_type"
            int r0 = X.C36351kA.A03(r3, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0L = r0
            java.lang.String r0 = "phone_label"
            java.lang.String r0 = X.C36341k9.A0f(r3, r0)
            r2.A0V = r0
            java.lang.String r0 = "history_sync_initial_phash"
            java.lang.String r0 = X.C36341k9.A0f(r3, r0)
            r2.A0S = r0
            java.lang.String r0 = "number"
            java.lang.String r8 = X.C36341k9.A0f(r3, r0)
            java.lang.String r0 = "raw_contact_id"
            long r4 = X.C36351kA.A07(r3, r0)
            r9 = -3
            r13 = 0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x006a
            r6 = -2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x006a
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x006a
            r6 = -5
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
        L_0x006a:
            if (r8 == 0) goto L_0x007e
            r0 = 5
            int r1 = r8.length()
            if (r0 > r1) goto L_0x007e
            r0 = 20
            if (r1 > r0) goto L_0x007e
            X.3IL r0 = new X.3IL
            r0.<init>(r4, r8)
            r2.A0F = r0
        L_0x007e:
            boolean r6 = X.C36431kI.A1W(r2)
            r1 = 0
            r0 = 1
            if (r6 == 0) goto L_0x0094
            r7 = -4
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0091
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            r4 = 0
            if (r6 != 0) goto L_0x0092
        L_0x0091:
            r4 = 1
        L_0x0092:
            r2.A0n = r4
        L_0x0094:
            java.lang.String r4 = "is_wa_created_contact"
            int r5 = r3.getColumnIndexOrThrow(r4)
            boolean r4 = r3.isNull(r5)
            if (r4 != 0) goto L_0x0366
            int r4 = r3.getInt(r5)
            boolean r4 = X.AnonymousClass000.A1S(r4, r0)
            r2.A0s = r4
        L_0x00aa:
            java.lang.String r4 = "sync_policy"
            int r5 = r3.getColumnIndexOrThrow(r4)
            boolean r4 = r3.isNull(r5)
            r7 = -1
            if (r4 != 0) goto L_0x0362
            int r4 = r3.getInt(r5)
            r2.A07 = r4
        L_0x00bd:
            java.lang.String r4 = "display_name"
            java.lang.String r5 = X.C36341k9.A0f(r3, r4)
            X.3IL r4 = r2.A0F
            if (r4 != 0) goto L_0x035e
            boolean r4 = r2.A0G()
            if (r4 != 0) goto L_0x035e
            X.11F r4 = r2.A0H
            boolean r4 = r4 instanceof X.C177618e5
            if (r4 != 0) goto L_0x035e
            boolean r4 = r2.A0n
            if (r4 != 0) goto L_0x035e
            int r4 = r2.A07
            if (r4 == r0) goto L_0x035e
            r2.A0N = r5
        L_0x00dd:
            java.lang.String r4 = "is_whatsapp_user"
            boolean r4 = A01(r3, r4)
            r2.A0z = r4
            java.lang.String r4 = "unseen_msg_count"
            int r4 = r3.getColumnIndexOrThrow(r4)
            r3.getInt(r4)
            java.lang.String r4 = "photo_ts"
            int r4 = X.C36351kA.A03(r3, r4)
            r2.A05 = r4
            java.lang.String r4 = "thumb_ts"
            int r4 = X.C36351kA.A03(r3, r4)
            r2.A06 = r4
            java.lang.String r4 = "photo_id_timestamp"
            long r4 = X.C36351kA.A07(r3, r4)
            r2.A0C = r4
            java.lang.String r4 = "given_name"
            java.lang.String r4 = X.C36341k9.A0f(r3, r4)
            r2.A0R = r4
            java.lang.String r4 = "family_name"
            java.lang.String r4 = X.C36341k9.A0f(r3, r4)
            r2.A0Q = r4
            java.lang.String r4 = "wa_name"
            java.lang.String r4 = X.C36341k9.A0f(r3, r4)
            r2.A0a = r4
            java.lang.String r4 = "sort_name"
            java.lang.String r4 = X.C36341k9.A0f(r3, r4)
            r2.A0W = r4
            java.lang.String r4 = "nickname"
            java.lang.String r4 = X.C36341k9.A0f(r3, r4)
            r2.A0U = r4
            java.lang.String r4 = "company"
            java.lang.String r4 = X.C36341k9.A0f(r3, r4)
            r2.A0O = r4
            java.lang.String r4 = "title"
            java.lang.String r4 = X.C36341k9.A0f(r3, r4)
            r2.A0Z = r4
            java.lang.String r4 = "status_autodownload_disabled"
            boolean r4 = A01(r3, r4)
            r2.A14 = r4
            java.lang.String r4 = "keep_timestamp"
            long r4 = X.C36351kA.A07(r3, r4)
            r2.A0B = r4
            java.lang.String r4 = "is_spam_reported"
            boolean r4 = A01(r3, r4)
            r2.A0w = r4
            java.lang.String r4 = "description"
            java.lang.String r19 = X.C36341k9.A0f(r3, r4)
            r10 = 0
            if (r19 != 0) goto L_0x0328
            X.3QL r4 = X.AnonymousClass3QL.A05
            r2.A0K = r4
        L_0x0163:
            java.lang.String r4 = "restrict_mode"
            boolean r4 = A01(r3, r4)
            r2.A13 = r4
            java.lang.String r4 = "announcement_group"
            boolean r4 = A01(r3, r4)
            r2.A0d = r4
            java.lang.String r4 = "no_frequently_forwarded"
            boolean r4 = A01(r3, r4)
            r2.A11 = r4
            java.lang.String r4 = "ephemeral_duration"
            int r4 = X.C36351kA.A03(r3, r4)
            r2.A02 = r4
            java.lang.String r4 = "creator_jid"
            java.lang.String r4 = X.C36341k9.A0f(r3, r4)
            com.whatsapp.jid.UserJid r4 = X.C36431kI.A0l(r4)
            r2.A0I = r4
            java.lang.String r4 = "in_app_support"
            boolean r4 = A01(r3, r4)
            r2.A0i = r4
            java.lang.String r4 = "is_suspended"
            boolean r4 = A01(r3, r4)
            r2.A0r = r4
            java.lang.String r4 = "group_state"
            int r4 = X.C36351kA.A03(r3, r4)
            r2.A03 = r4
            java.lang.String r4 = "require_membership_approval"
            boolean r4 = A01(r3, r4)
            r2.A12 = r4
            java.lang.String r4 = "member_add_mode"
            int r4 = X.C36351kA.A03(r3, r4)
            r2.A04 = r4
            java.lang.String r4 = "incognito"
            boolean r4 = A01(r3, r4)
            r2.A0j = r4
            java.lang.String r4 = "is_pending_requests_banner_acknowledged"
            boolean r4 = A01(r3, r4)
            r2.A0u = r4
            java.lang.String r4 = "is_pending_suggestions_banner_acknowledged"
            boolean r4 = A01(r3, r4)
            r2.A0v = r4
            java.lang.String r4 = "is_name_group_banner_dismissed"
            boolean r4 = A01(r3, r4)
            r2.A10 = r4
            java.lang.String r4 = "addressing_mode"
            java.lang.String r4 = X.C36341k9.A0f(r3, r4)
            java.lang.String r4 = X.C54102sP.A00(r4)
            r2.A0M = r4
            java.lang.String r4 = "allow_non_admin_subgroup_creation"
            int r5 = r3.getColumnIndexOrThrow(r4)
            boolean r4 = r3.isNull(r5)
            if (r4 != 0) goto L_0x01f6
            int r5 = r3.getInt(r5)
            r4 = 1
            if (r5 == r0) goto L_0x01f7
        L_0x01f6:
            r4 = 0
        L_0x01f7:
            r2.A0c = r4
            java.lang.String r4 = "history_enabled"
            int r5 = r3.getColumnIndexOrThrow(r4)
            boolean r4 = r3.isNull(r5)
            if (r4 != 0) goto L_0x020c
            int r5 = r3.getInt(r5)
            r4 = 1
            if (r5 == r0) goto L_0x020d
        L_0x020c:
            r4 = 0
        L_0x020d:
            r2.A0h = r4
            java.lang.String r4 = "auto_add_disabled"
            int r5 = r3.getColumnIndexOrThrow(r4)
            boolean r4 = r3.isNull(r5)
            if (r4 != 0) goto L_0x0222
            int r5 = r3.getInt(r5)
            r4 = 1
            if (r5 == r0) goto L_0x0223
        L_0x0222:
            r4 = 0
        L_0x0223:
            r2.A0e = r4
            java.lang.String r4 = "verified_level"
            int r4 = X.C36351kA.A03(r3, r4)
            r6 = 1
            if (r4 == r0) goto L_0x0235
            r6 = 2
            if (r4 == r6) goto L_0x0235
            r6 = 3
            if (r4 == r6) goto L_0x0235
            r6 = 0
        L_0x0235:
            r2.A08 = r6
            java.lang.String r4 = "verified_name"
            java.lang.String r16 = X.C36341k9.A0f(r3, r4)
            java.lang.String r5 = "identity_unconfirmed_since"
            int r4 = r3.getColumnIndexOrThrow(r5)
            boolean r8 = r3.isNull(r4)
            java.lang.String r4 = "issuer"
            java.lang.String r15 = X.C36341k9.A0f(r3, r4)
            if (r8 != 0) goto L_0x02fe
            r2.A08 = r1
        L_0x0251:
            java.lang.String r4 = "serial"
            long r19 = X.C36351kA.A07(r3, r4)
            int r18 = X.C36351kA.A03(r3, r5)
            java.lang.String r4 = "host_storage"
            java.lang.String r4 = X.C36341k9.A0f(r3, r4)
            int r9 = X.AnonymousClass3MC.A01(r4)
            java.lang.String r4 = "actual_actors"
            java.lang.String r4 = X.C36341k9.A0f(r3, r4)
            int r8 = X.AnonymousClass3MC.A00(r4)
            java.lang.String r4 = "privacy_mode_ts"
            long r4 = X.C36351kA.A07(r3, r4)
            X.3ur r14 = new X.3ur
            r14.<init>((int) r9, (long) r4, (int) r8)
            r2.A0M(r10)
            r2.A0T = r15
            com.whatsapp.jid.UserJid r13 = X.C36411kG.A0k(r2)
            boolean r21 = X.C197029b1.A00(r13)
            X.3L0 r12 = new X.3L0
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r21)
            r2.A0E = r12
            java.lang.String r4 = "is_sidelist_synced"
            boolean r4 = A01(r3, r4)
            r2.A0y = r4
            java.lang.String r4 = "is_business_synced"
            boolean r4 = A01(r3, r4)
            r2.A0t = r4
            java.lang.String r4 = "disappearing_mode_duration"
            int r4 = X.C36351kA.A03(r3, r4)
            r2.A01 = r4
            java.lang.String r4 = "disappearing_mode_timestamp"
            int r4 = X.C36351kA.A03(r3, r4)
            long r4 = (long) r4
            r2.A09 = r4
            java.lang.String r4 = "is_report_to_admin_enabled"
            int r5 = r3.getColumnIndex(r4)
            if (r5 <= r7) goto L_0x02c6
            boolean r4 = r3.isNull(r5)
            if (r4 != 0) goto L_0x02c6
            int r5 = r3.getInt(r5)
            r4 = 1
            if (r5 == r0) goto L_0x02c7
        L_0x02c6:
            r4 = 0
        L_0x02c7:
            r2.A0p = r4
            java.lang.String r4 = "is_starred"
            int r5 = r3.getColumnIndexOrThrow(r4)
            boolean r4 = r3.isNull(r5)
            if (r4 != 0) goto L_0x02fb
            int r4 = r3.getInt(r5)
            boolean r4 = X.AnonymousClass000.A1S(r4, r0)
            r2.A0q = r4
        L_0x02df:
            java.lang.String r4 = "automated_type"
            int r4 = X.C36351kA.A03(r3, r4)
            r2.A00 = r4
            java.lang.String r4 = "status_emoji"
            java.lang.String r4 = X.C36341k9.A0f(r3, r4)
            r2.A0Y = r4
            java.lang.String r4 = "is_contact_synced"
            int r3 = X.C36351kA.A03(r3, r4)
            if (r3 != r0) goto L_0x02f8
            r1 = 1
        L_0x02f8:
            r2.A0k = r1
            return r2
        L_0x02fb:
            r2.A0q = r1
            goto L_0x02df
        L_0x02fe:
            if (r16 == 0) goto L_0x0324
            java.lang.String r8 = "expires"
            int r4 = r3.getColumnIndexOrThrow(r8)
            boolean r4 = r3.isNull(r4)
            if (r4 != 0) goto L_0x0324
            long r11 = X.C36351kA.A07(r3, r8)
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0324
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = X.C36391kE.A0B(r8)
            int r4 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0324
            r2.A08 = r1
            goto L_0x0251
        L_0x0324:
            r10 = r16
            goto L_0x0251
        L_0x0328:
            java.lang.String r4 = "description_id_string"
            java.lang.String r18 = X.C36341k9.A0f(r3, r4)
            java.lang.String r4 = "description_setter_jid"
            java.lang.String r8 = X.C36341k9.A0f(r3, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r18)
            if (r4 == 0) goto L_0x033c
            r18 = r10
        L_0x033c:
            java.lang.String r4 = "description_time"
            int r4 = X.C36351kA.A03(r3, r4)
            long r4 = (long) r4
            boolean r6 = android.text.TextUtils.isEmpty(r8)
            if (r6 == 0) goto L_0x0359
            r17 = r10
        L_0x034b:
            X.3QL r6 = new X.3QL
            r15 = r6
            r16 = r10
            r20 = r4
            r15.<init>(r16, r17, r18, r19, r20)
            r2.A0K = r6
            goto L_0x0163
        L_0x0359:
            com.whatsapp.jid.UserJid r17 = X.C36431kI.A0l(r8)
            goto L_0x034b
        L_0x035e:
            r2.A0P = r5
            goto L_0x00dd
        L_0x0362:
            r2.A07 = r7
            goto L_0x00bd
        L_0x0366:
            r2.A0s = r1
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53712rl.A00(android.database.Cursor):X.141");
    }
}
