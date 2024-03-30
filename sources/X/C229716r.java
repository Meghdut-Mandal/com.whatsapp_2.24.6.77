package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.16r  reason: invalid class name and case insensitive filesystem */
public class C229716r extends C229616q {
    public final C19630wG A00;
    public final C19900wh A01;
    public final AnonymousClass11g A02;
    public final AnonymousClass12S A03;
    public final AnonymousClass12X A04;
    public final C230016u A05;

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (this) {
            String databaseName = getDatabaseName();
            C224114e A012 = C224014d.A01(sQLiteDatabase, this.A02, this.A03, databaseName);
            Log.i("creating contacts database version 95");
            C224714l.A02();
            try {
                SQLiteDatabase sQLiteDatabase2 = A012.A00;
                sQLiteDatabase2.beginTransaction();
                AnonymousClass38H r6 = new AnonymousClass38H(new AnonymousClass38G());
                C65063Qo r5 = new C65063Qo();
                Set<AnonymousClass15z> set = (Set) this.A04.A00.get();
                for (AnonymousClass15z B7q : set) {
                    B7q.B7q(r6, r5);
                }
                r5.A05(A012, "WaDatabaseHelper");
                r5.A02(A012, r6);
                for (AnonymousClass15z B7n : set) {
                    B7n.B7n(A012, r6, r5);
                }
                r5.A03(A012, "WaDatabaseHelper");
                for (AnonymousClass15z B7s : set) {
                    B7s.B7s(A012, r6, r5);
                }
                r5.A04(A012, "WaDatabaseHelper");
                C73893kj.A00(A012);
                sQLiteDatabase2.setTransactionSuccessful();
                this.A01.A01.edit().remove("force_wadb_check").apply();
                sQLiteDatabase2.endTransaction();
                C224714l.A02();
                this.A00 = A012;
            } catch (Throwable th) {
                C224714l.A02();
                throw th;
            }
        }
    }

    public C229716r(C19700wN r3, C19630wG r4, C19900wh r5, AnonymousClass11g r6, AnonymousClass12S r7, AnonymousClass12X r8, String str) {
        super(r4.A00, r3, str, 95);
        this.A05 = new C230016u();
        this.A00 = r4;
        this.A03 = r7;
        this.A04 = r8;
        this.A02 = r6;
        this.A01 = r5;
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Downgrading contacts database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.w(sb.toString());
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007f, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_hours_trigger");
        X.C224614k.A01(r7, "wa_biz_profiles_hours");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0089, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS group_admin_settings_deletion_trigger");
        X.C224614k.A01(r7, "wa_group_admin_settings");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0093, code lost:
        X.C224614k.A01(r7, "wa_block_list");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0098, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_categories_trigger");
        X.C224614k.A01(r7, "wa_biz_profiles_categories");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a2, code lost:
        X.C224614k.A01(r7, "wa_group_add_black_list");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a7, code lost:
        X.C224614k.A01(r7, "wa_props");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ac, code lost:
        X.C224614k.A01(r7, "wa_last_entry_point");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b1, code lost:
        r7.execSQL("DROP TABLE IF EXISTS wa_contact_capabilities");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b4, code lost:
        X.C224614k.A01(r7, "wa_last_seen_block_list");
        X.C224614k.A01(r7, "wa_profile_photo_block_list");
        X.C224614k.A01(r7, "wa_about_block_list");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c3, code lost:
        X.C224614k.A01(r7, "wa_trusted_contacts");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c8, code lost:
        X.C224614k.A01(r7, "wa_trusted_contacts_send");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cd, code lost:
        X.C224614k.A01(r7, "subgroup_info");
        r7.execSQL("DROP TABLE IF EXISTS group_relationship");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d7, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_linked_accounts_trigger");
        X.C224614k.A01(r7, "wa_biz_profiles_linked_accounts_table");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e1, code lost:
        X.C224614k.A01(r7, "group_membership_count");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e6, code lost:
        X.C224614k.A01(r7, "dismissed_chat");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00eb, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_service_areas_trigger");
        X.C224614k.A01(r7, "wa_biz_profiles_service_areas");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f5, code lost:
        X.C224614k.A01(r7, "group_membership_approval_requests");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fa, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS contact_bd_for_business_profiles");
        r7.execSQL("DROP TRIGGER IF EXISTS contact_bu_for_business_profiles");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0100, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS wa_biz_profiles_bd_direct_connection_allowed_country_codes_trigger");
        X.C224614k.A01(r7, "wa_biz_profiles_direct_connection_allowed_country_codes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010a, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS before_delete_dc_enabled_features_trigger");
        X.C224614k.A01(r7, "wa_biz_profiles_dc_enabled_features");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0114, code lost:
        X.C224614k.A01(r7, "quick_promotion_payload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0119, code lost:
        X.C224614k.A01(r7, "non_admin_group_membership_approval_requests");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011e, code lost:
        X.C224614k.A01(r7, "wa_biz_profiles_price_tiers");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0123, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_biz_profile_to_service_offerings_trigger");
        X.C224614k.A01(r7, "wa_biz_profile_to_service_offerings");
        X.C224614k.A01(r7, "wa_biz_category_service_offerings");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0132, code lost:
        X.C224614k.A01(r7, "recently_accepted_deeplink_invites");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0139, code lost:
        if (r9 < 19) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x013b, code lost:
        r2 = new android.content.ContentValues(1);
        r2.put("tag", (java.lang.String) null);
        r7.update("wa_biz_profiles", r2, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0149, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0049, code lost:
        X.C224614k.A01(r7, "system_contacts_version_table");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004e, code lost:
        X.C224614k.A01(r7, "wa_vnames");
        X.C224614k.A01(r7, "wa_vnames_localized");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0058, code lost:
        X.C224614k.A01(r7, "wa_contact_storage_usage");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005d, code lost:
        r7.execSQL("DROP TRIGGER IF EXISTS contact_bu_for_business_profiles");
        r7.execSQL("DROP TRIGGER IF EXISTS contact_bd_for_business_profiles");
        X.C224614k.A01(r7, "wa_biz_profiles");
        r7.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_websites_trigger");
        X.C224614k.A01(r7, "wa_biz_profiles_websites");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0070, code lost:
        X.C224614k.A01(r7, "wa_group_descriptions");
        X.C224614k.A01(r7, "wa_contacts");
        r7.execSQL("CREATE TABLE wa_biz_profiles (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, email TEXT, address TEXT, business_description TEXT, tag TEXT)");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Upgrading contacts database from version "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 1
            java.lang.String r5 = "DROP TABLE IF EXISTS wa_contact_capabilities"
            java.lang.String r3 = "wa_biz_profiles"
            java.lang.String r4 = "DROP TRIGGER IF EXISTS contact_bd_for_business_profiles"
            java.lang.String r2 = "DROP TRIGGER IF EXISTS contact_bu_for_business_profiles"
            switch(r8) {
                case 3: goto L_0x0046;
                case 4: goto L_0x0046;
                case 5: goto L_0x0046;
                case 6: goto L_0x0040;
                case 7: goto L_0x0049;
                case 8: goto L_0x0049;
                case 9: goto L_0x004e;
                case 10: goto L_0x004e;
                case 11: goto L_0x0058;
                case 12: goto L_0x0058;
                case 13: goto L_0x0058;
                case 14: goto L_0x0058;
                case 15: goto L_0x0058;
                case 16: goto L_0x0058;
                case 17: goto L_0x0058;
                case 18: goto L_0x005d;
                case 19: goto L_0x0070;
                case 20: goto L_0x007f;
                case 21: goto L_0x007f;
                case 22: goto L_0x007f;
                case 23: goto L_0x007f;
                case 24: goto L_0x007f;
                case 25: goto L_0x0089;
                case 26: goto L_0x0093;
                case 27: goto L_0x0093;
                case 28: goto L_0x0093;
                case 29: goto L_0x0098;
                case 30: goto L_0x0098;
                case 31: goto L_0x0098;
                case 32: goto L_0x00a2;
                case 33: goto L_0x00a2;
                case 34: goto L_0x00a7;
                case 35: goto L_0x00a7;
                case 36: goto L_0x00ac;
                case 37: goto L_0x00ac;
                case 38: goto L_0x00ac;
                case 39: goto L_0x00b1;
                case 40: goto L_0x00b4;
                case 41: goto L_0x00b4;
                case 42: goto L_0x00b4;
                case 43: goto L_0x00b4;
                case 44: goto L_0x00b4;
                case 45: goto L_0x00b4;
                case 46: goto L_0x00b4;
                case 47: goto L_0x00b4;
                case 48: goto L_0x00b4;
                case 49: goto L_0x00c3;
                case 50: goto L_0x00c3;
                case 51: goto L_0x00c8;
                case 52: goto L_0x00cd;
                case 53: goto L_0x00cd;
                case 54: goto L_0x00d7;
                case 55: goto L_0x00d7;
                case 56: goto L_0x00e1;
                case 57: goto L_0x00e1;
                case 58: goto L_0x00e1;
                case 59: goto L_0x00e1;
                case 60: goto L_0x00e6;
                case 61: goto L_0x00e6;
                case 62: goto L_0x00e6;
                case 63: goto L_0x00e6;
                case 64: goto L_0x00eb;
                case 65: goto L_0x00eb;
                case 66: goto L_0x00eb;
                case 67: goto L_0x00eb;
                case 68: goto L_0x00f5;
                case 69: goto L_0x00fa;
                case 70: goto L_0x00fa;
                case 71: goto L_0x0100;
                case 72: goto L_0x0100;
                case 73: goto L_0x0100;
                case 74: goto L_0x0100;
                case 75: goto L_0x0100;
                case 76: goto L_0x010a;
                case 77: goto L_0x010a;
                case 78: goto L_0x0114;
                case 79: goto L_0x0119;
                case 80: goto L_0x011e;
                case 81: goto L_0x011e;
                case 82: goto L_0x011e;
                case 83: goto L_0x011e;
                case 84: goto L_0x011e;
                case 85: goto L_0x011e;
                case 86: goto L_0x0123;
                case 87: goto L_0x0123;
                case 88: goto L_0x0123;
                case 89: goto L_0x0123;
                case 90: goto L_0x0132;
                case 91: goto L_0x0132;
                case 92: goto L_0x0132;
                case 93: goto L_0x0137;
                case 94: goto L_0x0137;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unrecognized old database version; oldVersion="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r6.onCreate(r7)
        L_0x003f:
            return
        L_0x0040:
            java.lang.String r0 = "DROP INDEX wa_contact_capabilities_jid_index"
            r7.execSQL(r0)
            goto L_0x0049
        L_0x0046:
            r7.execSQL(r5)
        L_0x0049:
            java.lang.String r0 = "system_contacts_version_table"
            X.C224614k.A01(r7, r0)
        L_0x004e:
            java.lang.String r0 = "wa_vnames"
            X.C224614k.A01(r7, r0)
            java.lang.String r0 = "wa_vnames_localized"
            X.C224614k.A01(r7, r0)
        L_0x0058:
            java.lang.String r0 = "wa_contact_storage_usage"
            X.C224614k.A01(r7, r0)
        L_0x005d:
            r7.execSQL(r2)
            r7.execSQL(r4)
            X.C224614k.A01(r7, r3)
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_websites_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_websites"
            X.C224614k.A01(r7, r0)
        L_0x0070:
            java.lang.String r0 = "wa_group_descriptions"
            X.C224614k.A01(r7, r0)
            java.lang.String r0 = "wa_contacts"
            X.C224614k.A01(r7, r0)
            java.lang.String r0 = "CREATE TABLE wa_biz_profiles (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, email TEXT, address TEXT, business_description TEXT, tag TEXT)"
            r7.execSQL(r0)
        L_0x007f:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_hours_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_hours"
            X.C224614k.A01(r7, r0)
        L_0x0089:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS group_admin_settings_deletion_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_group_admin_settings"
            X.C224614k.A01(r7, r0)
        L_0x0093:
            java.lang.String r0 = "wa_block_list"
            X.C224614k.A01(r7, r0)
        L_0x0098:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_categories_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_categories"
            X.C224614k.A01(r7, r0)
        L_0x00a2:
            java.lang.String r0 = "wa_group_add_black_list"
            X.C224614k.A01(r7, r0)
        L_0x00a7:
            java.lang.String r0 = "wa_props"
            X.C224614k.A01(r7, r0)
        L_0x00ac:
            java.lang.String r0 = "wa_last_entry_point"
            X.C224614k.A01(r7, r0)
        L_0x00b1:
            r7.execSQL(r5)
        L_0x00b4:
            java.lang.String r0 = "wa_last_seen_block_list"
            X.C224614k.A01(r7, r0)
            java.lang.String r0 = "wa_profile_photo_block_list"
            X.C224614k.A01(r7, r0)
            java.lang.String r0 = "wa_about_block_list"
            X.C224614k.A01(r7, r0)
        L_0x00c3:
            java.lang.String r0 = "wa_trusted_contacts"
            X.C224614k.A01(r7, r0)
        L_0x00c8:
            java.lang.String r0 = "wa_trusted_contacts_send"
            X.C224614k.A01(r7, r0)
        L_0x00cd:
            java.lang.String r0 = "subgroup_info"
            X.C224614k.A01(r7, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS group_relationship"
            r7.execSQL(r0)
        L_0x00d7:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_linked_accounts_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_linked_accounts_table"
            X.C224614k.A01(r7, r0)
        L_0x00e1:
            java.lang.String r0 = "group_membership_count"
            X.C224614k.A01(r7, r0)
        L_0x00e6:
            java.lang.String r0 = "dismissed_chat"
            X.C224614k.A01(r7, r0)
        L_0x00eb:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_service_areas_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_service_areas"
            X.C224614k.A01(r7, r0)
        L_0x00f5:
            java.lang.String r0 = "group_membership_approval_requests"
            X.C224614k.A01(r7, r0)
        L_0x00fa:
            r7.execSQL(r4)
            r7.execSQL(r2)
        L_0x0100:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS wa_biz_profiles_bd_direct_connection_allowed_country_codes_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_direct_connection_allowed_country_codes"
            X.C224614k.A01(r7, r0)
        L_0x010a:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS before_delete_dc_enabled_features_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profiles_dc_enabled_features"
            X.C224614k.A01(r7, r0)
        L_0x0114:
            java.lang.String r0 = "quick_promotion_payload"
            X.C224614k.A01(r7, r0)
        L_0x0119:
            java.lang.String r0 = "non_admin_group_membership_approval_requests"
            X.C224614k.A01(r7, r0)
        L_0x011e:
            java.lang.String r0 = "wa_biz_profiles_price_tiers"
            X.C224614k.A01(r7, r0)
        L_0x0123:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_biz_profile_to_service_offerings_trigger"
            r7.execSQL(r0)
            java.lang.String r0 = "wa_biz_profile_to_service_offerings"
            X.C224614k.A01(r7, r0)
            java.lang.String r0 = "wa_biz_category_service_offerings"
            X.C224614k.A01(r7, r0)
        L_0x0132:
            java.lang.String r0 = "recently_accepted_deeplink_invites"
            X.C224614k.A01(r7, r0)
        L_0x0137:
            r0 = 19
            if (r9 < r0) goto L_0x003f
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>(r1)
            r1 = 0
            java.lang.String r0 = "tag"
            r2.put(r0, r1)
            r7.update(r3, r2, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229716r.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public void A05() {
        super.A05();
        for (C230216w r0 : this.A05.getObservers()) {
            C229416o r2 = r0.A00;
            if (r2 instanceof C229516p) {
                C229516p r22 = (C229516p) r2;
                synchronized (r22.A09) {
                    r22.A01 = 0;
                }
            }
        }
    }

    public C224114e A07() {
        try {
            return C224014d.A01(super.A02(), this.A02, this.A03, getDatabaseName());
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w("Contacts database is corrupt. Removing...", e);
            A05();
            return C224014d.A01(super.A02(), this.A02, this.A03, getDatabaseName());
        } catch (SQLiteException e2) {
            e = e2;
            String obj = e.toString();
            if (obj.contains("file is encrypted")) {
                Log.w("Contacts database is encrypted. Removing...", e);
                A05();
                return C224014d.A01(super.A02(), this.A02, this.A03, getDatabaseName());
            }
            if (obj.contains("upgrade read-only database")) {
                Log.w("Client actually opened database as read-only and can't upgrade. Switching to writable...", e);
                return C224014d.A01(super.A02(), this.A02, this.A03, getDatabaseName());
            }
            throw e;
        } catch (StackOverflowError e3) {
            e = e3;
            Log.w("StackOverflowError during db init check");
            for (StackTraceElement methodName : e.getStackTrace()) {
                if (methodName.getMethodName().equals("onCorruption")) {
                    Log.w("Contacts database is corrupt. Found via StackOverflowError. Removing...");
                    A05();
                    return C224014d.A01(super.A02(), this.A02, this.A03, getDatabaseName());
                }
            }
            throw e;
        }
    }

    public C229716r(C19700wN r9, C19630wG r10, C19900wh r11, AnonymousClass11g r12, AnonymousClass12S r13, AnonymousClass12X r14) {
        this(r9, r10, r11, r12, r13, r14, "wa.db");
    }
}
