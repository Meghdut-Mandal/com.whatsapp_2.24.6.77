package com.whatsapp.migration.android.view;

import X.AnonymousClass000;
import X.AnonymousClass04R;
import X.AnonymousClass1MM;
import X.AnonymousClass3NT;
import X.AnonymousClass3TX;
import X.AnonymousClass5FX;
import X.AnonymousClass6X5;
import X.C001700s;
import X.C160867li;
import X.C164907sZ;
import X.C19600wD;
import X.C19630wG;
import X.C20830yE;
import X.C229216m;
import X.C29501Ww;
import X.C36321k7;
import X.C36341k9;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import com.whatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.util.Log;

public class GoogleMigrateImporterViewModel extends AnonymousClass04R {
    public C001700s A00 = C36431kI.A0S();
    public C001700s A01 = C36431kI.A0S();
    public C001700s A02 = C36431kI.A0S();
    public C001700s A03 = C36431kI.A0S();
    public C001700s A04 = C36431kI.A0S();
    public final C19600wD A05;
    public final C229216m A06;
    public final C19630wG A07;
    public final C20830yE A08;
    public final AnonymousClass6X5 A09;
    public final AnonymousClass3TX A0A;
    public final AnonymousClass3NT A0B;
    public final AnonymousClass1MM A0C;
    public final C160867li A0D;
    public final AnonymousClass5FX A0E;
    public final C29501Ww A0F;

    public void A0R() {
        this.A0E.unregisterObserver(this.A0D);
    }

    public void A0S() {
        this.A0F.A03();
        A0U(18);
        this.A00.A0C(C36371kC.A0n());
        this.A09.A0B();
        Context context = this.A07.A00;
        AnonymousClass1MM r1 = this.A0C;
        Log.i("GoogleMigrateService/stopImport()");
        r1.A01(context, GoogleMigrateService.class);
    }

    public void A0T() {
        AnonymousClass3TX r3 = this.A0A;
        AnonymousClass3NT r2 = this.A0B;
        r3.A0B("google_migrate_import_started", (String) null, AnonymousClass3NT.A00(r2).getString("google_migrate_ios_funnel_id", (String) null), AnonymousClass3NT.A00(r2).getString("google_migrate_ios_export_duration", (String) null), 0);
        Context context = this.A07.A00;
        AnonymousClass1MM r22 = this.A0C;
        Log.i("GoogleMigrateService/startImport()");
        r22.A03(context, C36441kJ.A0I("com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_START_IMPORT"), GoogleMigrateService.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r5.A06.A00() == false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(boolean r6) {
        /*
            r5 = this;
            java.lang.String r2 = "google_migrate_confirm_continue_import"
            X.3TX r1 = r5.A0A
            if (r6 == 0) goto L_0x0053
            java.lang.String r0 = "google_migrate_recoverable_error"
            r1.A07(r0, r2)
            X.00s r1 = r5.A01
            java.lang.Object r0 = r1.A04()
            if (r0 == 0) goto L_0x0025
            int r1 = X.C36341k9.A07(r1)
            r0 = 6
            if (r1 == r0) goto L_0x0025
            r0 = 9
            if (r1 == r0) goto L_0x0051
            r0 = 11
            if (r1 == r0) goto L_0x004e
            switch(r1) {
                case 13: goto L_0x004b;
                case 14: goto L_0x0048;
                case 15: goto L_0x0045;
                case 16: goto L_0x0042;
                default: goto L_0x0025;
            }
        L_0x0025:
            r4 = 1
        L_0x0026:
            X.0wG r0 = r5.A07
            android.content.Context r3 = r0.A00
            X.1MM r2 = r5.A0C
            java.lang.String r0 = "GoogleMigrateService/prepareBeforeRetry()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_PREPARE_BEFORE_RETRY"
            android.content.Intent r1 = X.C36441kJ.A0I(r0)
            java.lang.String r0 = "migration_error_code"
            r1.putExtra(r0, r4)
            java.lang.Class<com.whatsapp.migration.android.integration.service.GoogleMigrateService> r0 = com.whatsapp.migration.android.integration.service.GoogleMigrateService.class
            r2.A03(r3, r1, r0)
            return
        L_0x0042:
            r4 = 102(0x66, float:1.43E-43)
            goto L_0x0026
        L_0x0045:
            r4 = 103(0x67, float:1.44E-43)
            goto L_0x0026
        L_0x0048:
            r4 = 101(0x65, float:1.42E-43)
            goto L_0x0026
        L_0x004b:
            r4 = 104(0x68, float:1.46E-43)
            goto L_0x0026
        L_0x004e:
            r4 = 301(0x12d, float:4.22E-43)
            goto L_0x0026
        L_0x0051:
            r4 = 2
            goto L_0x0026
        L_0x0053:
            java.lang.String r0 = "google_migrate_cancel_import_dialog"
            r1.A07(r0, r2)
            X.0yE r0 = r5.A08
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0069
            X.16m r0 = r5.A06
            boolean r1 = r0.A00()
            r0 = 3
            if (r1 != 0) goto L_0x006a
        L_0x0069:
            r0 = 1
        L_0x006a:
            r5.A0U(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel.A0W(boolean):void");
    }

    public GoogleMigrateImporterViewModel(C19600wD r4, C229216m r5, C19630wG r6, C20830yE r7, AnonymousClass6X5 r8, AnonymousClass5FX r9, C29501Ww r10, AnonymousClass3TX r11, AnonymousClass3NT r12, AnonymousClass1MM r13) {
        C164907sZ r0 = new C164907sZ(this, 1);
        this.A0D = r0;
        this.A07 = r6;
        this.A0A = r11;
        this.A0C = r13;
        this.A06 = r5;
        this.A08 = r7;
        this.A0F = r10;
        this.A0E = r9;
        this.A0B = r12;
        this.A05 = r4;
        this.A09 = r8;
        r9.registerObserver(r0);
        int A062 = r8.A06();
        if (A062 == 0) {
            Log.i("GoogleMigrateImporterViewModel/onCreate/REQUEST_FOR_PERMISSION state");
            A0U(0);
            return;
        }
        C36321k7.A1T("GoogleMigrateImporterViewModel/onCreate/already has state. Current screen = ", AnonymousClass000.A0u(), A062);
        A0U(A062);
        if (A062 == 2) {
            A0V(2);
        } else if (A062 == 3) {
            C36341k9.A17(this.A03, r8.A05());
            A0T();
        } else if (A062 == 18) {
            A0S();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r2 = java.lang.Integer.valueOf(r11);
        r1 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (X.C1901797e.A00(r2, r1.A04()) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        com.whatsapp.util.Log.i("GoogleMigrateImporterViewModel/currentScreen/post");
        r1.A0C(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(int r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GoogleMigrateImporterViewModel/currentScreen/setCurrentScreen: "
            X.C36321k7.A1T(r0, r1, r11)
            java.lang.String r0 = "google_migrate_recoverable_error"
            java.lang.String r4 = "unknown"
            r5 = 0
            switch(r11) {
                case 0: goto L_0x004a;
                case 1: goto L_0x0047;
                case 2: goto L_0x0011;
                case 3: goto L_0x0011;
                case 4: goto L_0x004d;
                case 5: goto L_0x0044;
                case 6: goto L_0x003f;
                case 7: goto L_0x0011;
                case 8: goto L_0x0011;
                case 9: goto L_0x003f;
                case 10: goto L_0x003c;
                case 11: goto L_0x0039;
                case 12: goto L_0x0036;
                case 13: goto L_0x0033;
                case 14: goto L_0x0030;
                case 15: goto L_0x002d;
                case 16: goto L_0x002a;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            X.00s r1 = r10.A01
            java.lang.Object r0 = r1.A04()
            boolean r0 = X.C1901797e.A00(r2, r0)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "GoogleMigrateImporterViewModel/currentScreen/post"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A0C(r2)
        L_0x0029:
            return
        L_0x002a:
            java.lang.String r5 = "encryption_no_connection"
            goto L_0x004c
        L_0x002d:
            java.lang.String r5 = "encryption_timed_out"
            goto L_0x004c
        L_0x0030:
            java.lang.String r5 = "encryption_key_not_found"
            goto L_0x004c
        L_0x0033:
            java.lang.String r5 = "encryption_key_mismatch"
            goto L_0x004c
        L_0x0036:
            java.lang.String r5 = "generic_recoverable"
            goto L_0x004c
        L_0x0039:
            java.lang.String r5 = "jabber_id_not_found"
            goto L_0x004c
        L_0x003c:
            java.lang.String r0 = "google_migrate_cancel_import_dialog"
            goto L_0x004c
        L_0x003f:
            java.lang.String r0 = "google_migrate_unrecoverable_error"
            java.lang.String r5 = "generic_unrecoverable"
            goto L_0x004c
        L_0x0044:
            java.lang.String r0 = "google_migrate_import_complete"
            goto L_0x004c
        L_0x0047:
            java.lang.String r0 = "google_migrate_rejected_permission"
            goto L_0x004c
        L_0x004a:
            java.lang.String r0 = "google_migrate_permission"
        L_0x004c:
            r4 = r0
        L_0x004d:
            X.3NT r3 = r10.A0B
            android.content.SharedPreferences r1 = X.AnonymousClass3NT.A00(r3)
            java.lang.String r0 = "google_migrate_ios_funnel_id"
            r2 = 0
            java.lang.String r6 = r1.getString(r0, r2)
            android.content.SharedPreferences r1 = X.AnonymousClass3NT.A00(r3)
            java.lang.String r0 = "google_migrate_ios_export_duration"
            java.lang.String r7 = r1.getString(r0, r2)
            X.3TX r3 = r10.A0A
            r8 = 0
            r3.A0B(r4, r5, r6, r7, r8)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel.A0U(int):void");
    }

    public void A0V(Integer num) {
        int i = 2;
        if (num.intValue() != 2) {
            this.A0A.A08("google_migrate_import_complete", "google_migrate_import_complete_next");
            i = 8;
        }
        A0U(i);
        this.A00.A0C(num);
        this.A09.A0B();
        Context context = this.A07.A00;
        AnonymousClass1MM r1 = this.A0C;
        Log.i("GoogleMigrateService/stopImport()");
        r1.A01(context, GoogleMigrateService.class);
    }
}
