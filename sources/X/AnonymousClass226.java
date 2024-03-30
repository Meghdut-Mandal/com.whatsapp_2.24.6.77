package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.R;
import com.whatsapp.registration.RegisterName;

/* renamed from: X.226  reason: invalid class name */
public class AnonymousClass226 extends C36541kT {
    public int A00 = 0;
    public final /* synthetic */ RegisterName A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass226(C21060yb r8, C19970wo r9, C18820ts r10, RegisterName registerName) {
        super(registerName, r8, r9, r10, R.layout.f9nameremoved);
        this.A01 = registerName;
    }

    public static Integer A00(SharedPreferences sharedPreferences, AnonymousClass005 r1, String str) {
        if (sharedPreferences.contains(str)) {
            return Integer.valueOf(((SharedPreferences) r1.get()).getInt(str, -1));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x016f, code lost:
        if (X.C36391kE.A0H(r2).getBoolean("reg_profile_pic_tapped_key", false) != false) goto L_0x0171;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(int r23) {
        /*
            r22 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RegisterName/updatestate/state "
            r2 = r23
            X.C36321k7.A1T(r0, r1, r2)
            r6 = r22
            r6.A00 = r2
            r7 = 0
            r5 = 1
            if (r2 == r5) goto L_0x002f
            com.whatsapp.registration.RegisterName r1 = r6.A01
            X.12U r0 = r1.A0A
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x002f
            X.1QC r0 = r1.A1I
            r0.A02()
            r0 = 2131430911(0x7f0b0dff, float:1.8483536E38)
            X.C36411kG.A17(r6, r0, r7)
            r0 = 2131432691(0x7f0b14f3, float:1.8487147E38)
            X.C36411kG.A17(r6, r0, r7)
            return
        L_0x002f:
            r0 = 2131430911(0x7f0b0dff, float:1.8483536E38)
            android.view.View r0 = X.AnonymousClass0PN.A00(r6, r0)
            r2 = 4
            r0.setVisibility(r2)
            r0 = 2131432691(0x7f0b14f3, float:1.8487147E38)
            X.C36411kG.A17(r6, r0, r2)
            com.whatsapp.registration.RegisterName r4 = r6.A01
            android.content.SharedPreferences$Editor r1 = X.C36421kH.A0A(r4)
            java.lang.String r0 = "com.whatsapp.registername.initializer_start_time"
            X.C36341k9.A0u(r1, r0)
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x0052
            r0.setVisibility(r2)
        L_0x0052:
            android.os.Handler r0 = r4.A1m
            r0.removeMessages(r7)
            java.lang.String r0 = "RegisterName/sync/finished"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0zM r0 = r4.A0s
            r0.A02()
            X.0v0 r0 = r4.A09
            r0.A0u()
            android.content.SharedPreferences$Editor r1 = X.C36421kH.A0A(r4)
            java.lang.String r0 = "check_new_reg_from_referral"
            X.C36331k8.A0w(r1, r0, r5)
            X.0v0 r3 = r4.A09
            X.0wo r0 = r6.A04
            long r1 = X.C19970wo.A00(r0)
            android.content.SharedPreferences$Editor r3 = X.C19420v0.A00(r3)
            java.lang.String r0 = "registration_success_time_ms"
            X.C36341k9.A0w(r3, r0, r1)
            r2 = 0
            android.content.Intent r1 = X.AnonymousClass190.A09(r4)
            java.lang.String r0 = "show_payment_account_recovery"
            r1.putExtra(r0, r5)
            r4.startActivity(r1)
            r4.finish()
            com.whatsapp.registration.RegisterName.A1r = r2
            X.AnonymousClass3SJ.A00(r4, r7)
            X.1XF r0 = r4.A1F
            r9 = 2
            r0.A01(r9)
            android.content.SharedPreferences r0 = X.C36331k8.A06(r4)
            java.lang.String r3 = "eula_accepted_time"
            r1 = 0
            long r7 = r0.getLong(r3, r1)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0207
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            X.0yE r0 = r4.A0Z
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x00c1
            java.lang.Integer r0 = r4.A1Z
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x00c1
            r4.A1Z = r1
        L_0x00c1:
            X.35R r0 = r4.A17
            r21 = r0
            android.content.Context r14 = r6.getContext()
            X.0v0 r7 = r4.A09
            java.lang.Integer r0 = r4.A1Z
            int r20 = r0.intValue()
            java.lang.Integer r0 = r4.A1Y
            int r19 = r0.intValue()
            java.lang.Integer r11 = r4.A1W
            java.lang.Integer r9 = r4.A1X
            X.141 r10 = r4.A0i
            boolean r13 = r4.A1a
            boolean r8 = r4.A1c
            X.C36351kA.A1J(r14, r7, r5)
            X.2Ss r6 = new X.2Ss
            r6.<init>()
            long r17 = java.lang.System.currentTimeMillis()
            X.005 r2 = r7.A00
            android.content.SharedPreferences r12 = X.C36391kE.A0H(r2)
            r0 = 0
            long r15 = r12.getLong(r3, r0)
            long r17 = r17 - r15
            java.lang.Long r12 = java.lang.Long.valueOf(r17)
            r6.A0B = r12
            long r16 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r15 = X.C36391kE.A0H(r2)
            java.lang.String r12 = "message_store_verified_time"
            long r0 = r15.getLong(r12, r0)
            long r16 = r16 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r6.A0C = r0
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r2)
            java.lang.String r0 = "registration_attempt_skip_with_no_vertical"
            r12 = 0
            boolean r0 = r1.getBoolean(r0, r12)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A01 = r0
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r2)
            java.lang.String r0 = "registration_retry_fetching_biz_profile"
            boolean r0 = r1.getBoolean(r0, r12)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A05 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r6.A09 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r6.A06 = r0
            X.03c r0 = new X.03c
            r0.<init>(r14)
            boolean r0 = r0.A01()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A00 = r0
            if (r11 != 0) goto L_0x015f
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r2)
            java.lang.String r0 = "reg_backup_status_key"
            java.lang.Integer r11 = A00(r1, r2, r0)
        L_0x015f:
            r6.A07 = r11
            r11 = 0
            if (r13 != 0) goto L_0x0171
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r2)
            java.lang.String r0 = "reg_profile_pic_tapped_key"
            boolean r1 = r1.getBoolean(r0, r12)
            r0 = 0
            if (r1 == 0) goto L_0x0172
        L_0x0171:
            r0 = 1
        L_0x0172:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A04 = r0
            if (r10 == 0) goto L_0x0190
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r6.A03 = r0
            if (r8 == 0) goto L_0x0190
            if (r9 != 0) goto L_0x018e
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r2)
            java.lang.String r0 = "reg_profile_pic_source_key"
            java.lang.Integer r9 = A00(r1, r2, r0)
        L_0x018e:
            r6.A08 = r9
        L_0x0190:
            java.lang.String r0 = r7.A0e()
            byte[] r1 = X.C65983Uf.A0W(r0)
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            r6.A0E = r0
            java.lang.String r0 = r7.A0k()
            if (r0 == 0) goto L_0x01b9
            java.lang.String r0 = r7.A0j()
            if (r0 == 0) goto L_0x01b9
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r2)
            java.lang.String r0 = "pref_wfs_id_sign"
            java.lang.String r0 = X.C36371kC.A0t(r1, r0)
            if (r0 == 0) goto L_0x01b9
            r11 = 1
        L_0x01b9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r6.A02 = r0
            android.content.SharedPreferences r1 = X.C36391kE.A0H(r2)
            java.lang.String r0 = "pref_wfs_source"
            java.lang.Integer r0 = A00(r1, r2, r0)
            r6.A0A = r0
            r0 = r21
            X.0yC r1 = r0.A00
            r0 = 7315(0x1c93, float:1.025E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01e5
            android.content.SharedPreferences r2 = X.C36391kE.A0H(r2)
            java.lang.String r1 = "app_install_source"
            java.lang.String r0 = "unknown|unknown"
            java.lang.String r0 = r2.getString(r1, r0)
            r6.A0D = r0
        L_0x01e5:
            X.35R r8 = r4.A17
            X.005 r7 = r4.A1U
            X.0yW r1 = r4.A0u
            X.0wU r0 = r4.A04
            X.0wQ r9 = r4.A02
            X.0yN r10 = r4.A0t
            X.AnonymousClass00C.A0D(r7, r5)
            X.C36321k7.A19(r1, r0, r9, r10)
            r1.Blv(r6)
            r1.BP7()
            r11 = 11
            X.73N r6 = new X.73N
            r6.<init>(r7, r8, r9, r10, r11)
            r0.Boy(r6)
        L_0x0207:
            android.content.SharedPreferences r0 = X.C36331k8.A06(r4)
            java.lang.String r2 = "is_latam_tos_shown_during_reg"
            boolean r0 = X.C36371kC.A1U(r0, r2)
            if (r0 == 0) goto L_0x0226
            X.2NZ r1 = new X.2NZ
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.A00 = r0
            X.0yW r0 = r4.A0u
            X.AnonymousClass00C.A0D(r0, r5)
            r0.Blv(r1)
        L_0x0226:
            android.content.SharedPreferences$Editor r1 = X.C36421kH.A0A(r4)
            java.lang.String r0 = "message_store_verified_time"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            android.content.SharedPreferences$Editor r1 = r0.remove(r3)
            java.lang.String r0 = "registration_retry_fetching_biz_profile"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "registration_attempt_skip_with_no_vertical"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "registration_sibling_app_phone_number"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "registration_sibling_app_country_code"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "registration_sibling_app_min_storage_needed"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "sister_app_content_provider_is_enabled"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "direct_migration_start_time"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "direct_db_migration_timeout_in_secs"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "migrate_from_consumer_app_directly"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "direct_migration_session_id"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "google_migrate_import_start_time"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "registration_use_sms_retriever"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "reg_backup_status_key"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "reg_profile_pic_source_key"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "reg_profile_pic_tapped_key"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "email_address"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "registration_code"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "registration_code_request_method"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "pref_autoconf_secure_verifier"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "mbs_migration_phone_number"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "mbs_migration_countery_code"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "mbs_migration_session_id"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            android.content.SharedPreferences$Editor r1 = r0.remove(r2)
            java.lang.String r0 = "less_beep_beep_identi"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "less_beep_beep_time"
            X.C36341k9.A0u(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass226.A01(int):void");
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        AnonymousClass1RC.A02(C224314h.A01(getContext(), R.attr.f4nameremoved), this);
        getWindow().setFormat(1);
        getWindow().addFlags(ZipDecompressor.UNZIP_BUFFER_SIZE);
        getWindow().setSoftInputMode(3);
        if (bundle == null) {
            i = 0;
        } else {
            i = bundle.getInt("state");
        }
        A01(i);
        RegisterName registerName = this.A01;
        View findViewById = findViewById(R.id.pay_ed_contact_support);
        registerName.A00 = findViewById;
        if (findViewById != null) {
            AnonymousClass3Y6.A00(findViewById, this, 25);
        }
        if (registerName.A0K.A0F(false)) {
            ((TextView) AnonymousClass0PN.A00(this, R.id.splash_screen_title)).setText(R.string.f12nameremoved);
        }
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.putInt("state", this.A00);
        return onSaveInstanceState;
    }
}
