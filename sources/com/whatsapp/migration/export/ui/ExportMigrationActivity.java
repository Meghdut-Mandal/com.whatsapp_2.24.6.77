package com.whatsapp.migration.export.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass3LW;
import X.AnonymousClass3TF;
import X.AnonymousClass6FO;
import X.AnonymousClass6Q7;
import X.AnonymousClass6WX;
import X.C03570Gk;
import X.C111795cr;
import X.C121775th;
import X.C1275968x;
import X.C1497272n;
import X.C163027pX;
import X.C163297py;
import X.C163437qC;
import X.C165187t1;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19630wG;
import X.C21010yW;
import X.C33101ei;
import X.C33171eq;
import X.C33771fu;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36441kJ;
import X.C39001qm;
import X.C80433vO;
import X.C90464aC;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.WaNetworkResourceImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.migration.export.service.MessagesExporterService;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public class ExportMigrationActivity extends AnonymousClass155 {
    public C33771fu A00;
    public WaNetworkResourceImageView A01;
    public WaTextView A02;
    public WaTextView A03;
    public WaTextView A04;
    public WaTextView A05;
    public WaTextView A06;
    public C33101ei A07;
    public C33171eq A08;
    public RoundCornerProgressBar A09;
    public C19630wG A0A;
    public C21010yW A0B;
    public AnonymousClass6FO A0C;
    public AnonymousClass6WX A0D;
    public ExportMigrationViewModel A0E;
    public C121775th A0F;
    public C1275968x A0G;
    public WDSButton A0H;
    public WDSButton A0I;
    public String A0J;
    public boolean A0K;

    public static void A01(ExportMigrationActivity exportMigrationActivity, int i) {
        Context context = exportMigrationActivity.A0A.A00;
        Log.i("xpm-export-service-cancelExport()");
        Intent A0I2 = C36441kJ.A0I("ACTION_CANCEL_EXPORT");
        A0I2.setClass(context, MessagesExporterService.class);
        A0I2.putExtra("IS_FIRST_PARTY", false);
        C111795cr.A01(context, A0I2);
        C36321k7.A1T("ExportMigrationActivity/cancelMigrationAndReturn/resultCode: ", AnonymousClass000.A0u(), i);
        exportMigrationActivity.setResult(i);
        exportMigrationActivity.finish();
    }

    public void A2F() {
        if (!this.A0K) {
            this.A0K = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C90464aC.A11(A0B2, this);
            C18830tt r3 = A0B2.A00;
            C90464aC.A0y(A0B2, r3, this, C36321k7.A05(A0B2, r3, this));
            this.A00 = C36351kA.A0P(A0B2);
            this.A0A = C36351kA.A0W(A0B2);
            this.A0B = C36351kA.A0g(A0B2);
            this.A0D = (AnonymousClass6WX) A0B2.AGq.get();
            this.A0G = new C1275968x((C21010yW) A0B2.A79.get());
            this.A0C = (AnonymousClass6FO) A0B2.A5N.get();
            this.A0F = (C121775th) r3.A1Z.get();
            this.A07 = (C33101ei) A0B2.A3f.get();
            this.A08 = (C33171eq) A0B2.A3i.get();
        }
    }

    public void onBackPressed() {
        A0G(new C1497272n(this, 19));
    }

    public ExportMigrationActivity(int i) {
        this.A0K = false;
        C163027pX.A00(this, 39);
    }

    public static void A07(ExportMigrationActivity exportMigrationActivity, long j) {
        ExportMigrationActivity exportMigrationActivity2 = exportMigrationActivity;
        String string = exportMigrationActivity.getString(R.string.f12nameremoved);
        String A042 = AnonymousClass3TF.A04(exportMigrationActivity.A00, j);
        C18820ts r4 = exportMigrationActivity2.A00;
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = r4.A0G(A042);
        exportMigrationActivity2.runOnUiThread(new C80433vO(exportMigrationActivity2, string, r4.A0L(A0L, R.plurals.f10nameremoved, j), j));
    }

    public static void A0F(ExportMigrationActivity exportMigrationActivity, Runnable runnable, Runnable runnable2, boolean z) {
        String string = exportMigrationActivity.getString(R.string.f12nameremoved);
        String string2 = exportMigrationActivity.getString(R.string.f12nameremoved);
        C39001qm A002 = AnonymousClass3LW.A00(exportMigrationActivity);
        A002.A0q(string);
        A002.A0p(string2);
        A002.A0r(z);
        A002.A0i(new C163297py(runnable, 35), exportMigrationActivity.getString(R.string.f12nameremoved));
        String string3 = exportMigrationActivity.getString(R.string.f12nameremoved);
        A002.A00.A0Q(new C163297py(runnable2, 36), string3);
        A002.A0b();
    }

    private void A0G(Runnable runnable) {
        String string = getString(R.string.f12nameremoved);
        if (!this.A0D.A08()) {
            this.A0G.A00(this.A0J, 15);
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0p(string);
        A002.A0i(new C163297py(this, 33), getString(R.string.f12nameremoved));
        String string2 = getString(R.string.f12nameremoved);
        A002.A00.A0Q(new C163437qC(runnable, this, 10), string2);
        A002.A0b();
    }

    public /* synthetic */ void A3i() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String A022 = this.A0C.A02();
        this.A0J = A022;
        this.A0G.A00(A022, 11);
        if (!this.A0D.A0E(843)) {
            this.A0G.A01(this.A0J, 18);
            Log.e("ExportMigrationActivity/verifyActivityStartRequest; disabled: platform migration feature is disabled");
            setResult(102);
        } else {
            try {
                C121775th r2 = this.A0F;
                synchronized (r2.A00) {
                }
                if (!r2.A02.A00("com.apple.movetoios")) {
                    this.A0G.A01(this.A0J, 19);
                    Log.e("ExportMigrationActivity/onCreate/security: Permission validation failed");
                    this.A03.A0E("xpm-export-activity-permission-denied", (String) null, false);
                    setResult(104);
                    this.A0C.A03();
                    super.finish();
                    return;
                } else if (!this.A0D.A08() && C36441kJ.A0n(this.A02) == null) {
                    this.A0G.A01(this.A0J, 21);
                    Log.e("ExportMigrationActivity/onCreate/user: no user logged in, skipping.");
                    startActivity(AnonymousClass190.A0B(this));
                    setResult(105);
                } else if (this.A0D.A08()) {
                    AnonymousClass6Q7 r3 = this.A0D.A08;
                    if (!AnonymousClass000.A1O(r3.A01.getComponentEnabledSetting(r3.A00))) {
                        C36341k9.A0u(C90464aC.A0C(r3.A02.A01), "/export/provider_closed/timestamp");
                        r3.A03();
                        r3.A01.setComponentEnabledSetting(r3.A00, 1, 1);
                    }
                    Log.i("ExportMigrationActivity/providerReady/finishing");
                    this.A0G.A01(this.A0J, 24);
                    Log.i("ExportMigrationActivity/activateContentProviderAndFinishActivity");
                    setResult(100);
                    finish();
                    return;
                } else {
                    this.A0G.A00(this.A0J, 1);
                    setContentView((int) R.layout.f9nameremoved);
                    setTitle(getString(R.string.f12nameremoved));
                    AnonymousClass07B supportActionBar = getSupportActionBar();
                    if (supportActionBar != null) {
                        supportActionBar.A0U(true);
                    }
                    this.A05 = (WaTextView) C03570Gk.A0B(this, R.id.export_migrate_title);
                    this.A04 = (WaTextView) C03570Gk.A0B(this, R.id.export_migrate_sub_title);
                    this.A06 = (WaTextView) C03570Gk.A0B(this, R.id.export_migrate_warning);
                    this.A02 = (WaTextView) C03570Gk.A0B(this, R.id.export_migrate_change_number_action);
                    this.A0H = (WDSButton) C03570Gk.A0B(this, R.id.export_migrate_main_action);
                    this.A0I = (WDSButton) C03570Gk.A0B(this, R.id.export_migrate_sub_action);
                    this.A01 = (WaNetworkResourceImageView) C03570Gk.A0B(this, R.id.export_migrate_image_view);
                    this.A09 = (RoundCornerProgressBar) C03570Gk.A0B(this, R.id.export_migrate_progress_bar);
                    this.A03 = (WaTextView) C03570Gk.A0B(this, R.id.export_migrate_progress_description);
                    ExportMigrationViewModel exportMigrationViewModel = (ExportMigrationViewModel) C36441kJ.A0b(this).A00(ExportMigrationViewModel.class);
                    this.A0E = exportMigrationViewModel;
                    C165187t1.A00(this, exportMigrationViewModel.A02, 12);
                    C165187t1.A00(this, this.A0E.A00, 13);
                    C165187t1.A00(this, this.A0E.A01, 11);
                    return;
                }
            } catch (SecurityException e) {
                this.A0G.A01(this.A0J, 20);
                Log.e("ExportMigrationActivity/onCreate/security: Permission validation failed", e);
                this.A03.A0D("xpm-export-activity-permission-denied", (String) null, e);
                setResult(104);
                this.A0C.A03();
                super.finish();
                return;
            }
        }
        this.A0C.A03();
        super.finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        A0G((Runnable) null);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r2.A01 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r3 = this;
            super.onResume()
            X.6WX r0 = r3.A0D
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0012
            com.whatsapp.migration.export.ui.ExportMigrationViewModel r1 = r3.A0E
            r0 = 5
        L_0x000e:
            r1.A0S(r0)
            return
        L_0x0012:
            X.6WX r2 = r3.A0D
            monitor-enter(r2)
            android.os.CancellationSignal r0 = r2.A00     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x001e
            java.util.concurrent.CountDownLatch r1 = r2.A01     // Catch:{ all -> 0x002e }
            r0 = 0
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0026
            com.whatsapp.migration.export.ui.ExportMigrationViewModel r1 = r3.A0E
            r0 = 1
            goto L_0x000e
        L_0x0026:
            X.0wU r1 = r3.A04
            r0 = 23
            X.C1497272n.A00(r1, r3, r0)
            return
        L_0x002e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.export.ui.ExportMigrationActivity.onResume():void");
    }

    public ExportMigrationActivity() {
        this(0);
    }
}
