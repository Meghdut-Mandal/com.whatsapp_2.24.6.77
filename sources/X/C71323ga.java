package X;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3ga  reason: invalid class name and case insensitive filesystem */
public final class C71323ga implements C30631aW {
    public final C19730wQ A00;
    public final C19970wo A01;
    public final C19630wG A02;
    public final C19420v0 A03;
    public final C18820ts A04;
    public final AnonymousClass12U A05;
    public final AnonymousClass1XF A06;

    public /* synthetic */ void BV3() {
    }

    private final void A00(int i) {
        String str;
        String str2;
        Context context = this.A02.A00;
        C19970wo r2 = this.A01;
        C19730wQ r0 = this.A00;
        C19420v0 r1 = this.A03;
        if (!r0.A0L()) {
            long A002 = C19970wo.A00(r2);
            if (i == 2) {
                str = "backup_token_foa_file_timestamp";
            } else {
                str = "backup_token_file_timestamp";
            }
            long A0V = r1.A0V(str);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("BackupTokenUtils/shouldUpdateBackupToken/current time is ");
            A0u.append(A002);
            C36321k7.A1V(", token last update time is ", A0u, A0V);
            File filesDir = context.getFilesDir();
            if (i == 2) {
                str2 = "foa_backup_token";
            } else {
                str2 = "backup_token";
            }
            if (!C36441kJ.A0w(filesDir, str2).exists() || A002 - A0V > TimeUnit.DAYS.toMillis(14)) {
                C36321k7.A1T("RegistrationDailyCron/shouldUpdateBackupToken/backupTokenType:", AnonymousClass000.A0u(), i);
                this.A06.A01(i);
            }
        }
    }

    public void BV2() {
        if (this.A05.A03()) {
            A00(1);
            A00(2);
        }
        C18820ts r1 = this.A04;
        C19900wh r3 = r1.A08;
        String A012 = r3.A01();
        if (!TextUtils.isEmpty(A012)) {
            Locale locale = r1.A05;
            String[] strArr = C26621Kw.A04;
            if (locale.toLanguageTag().equals(A012)) {
                C36341k9.A0u(r3.A01.edit(), "forced_language");
            }
        }
    }

    public C71323ga(C19730wQ r2, C19970wo r3, C19630wG r4, C19420v0 r5, C18820ts r6, AnonymousClass12U r7, AnonymousClass1XF r8) {
        C36321k7.A1B(r3, r2, r4, r6, r5);
        AnonymousClass00C.A0D(r7, 6);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = r8;
    }
}
