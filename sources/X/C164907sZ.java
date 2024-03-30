package X;

import com.whatsapp.R;
import com.whatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.7sZ  reason: invalid class name and case insensitive filesystem */
public class C164907sZ implements C160867li {
    public Object A00;
    public final int A01;

    public C164907sZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BT4() {
        if (this.A01 != 0) {
            Log.i("GoogleMigrateImporterViewModel/onCancellationCompleted()");
            ((GoogleMigrateImporterViewModel) this.A00).A0V(C36361kB.A0j());
            return;
        }
        AnonymousClass6Sk r2 = ((GoogleMigrateService) this.A00).A04;
        Log.i("GoogleMigrateNotificationManager/onCancellationComplete()");
        AnonymousClass6Sk.A01(r2, C36421kH.A0B(r2.A00).getString(R.string.f12nameremoved), (String) null, -1, true, true);
    }

    public void BT5() {
        if (this.A01 != 0) {
            Log.i("GoogleMigrateImporterViewModel/onCancellationStarted()");
            ((GoogleMigrateImporterViewModel) this.A00).A0U(7);
            return;
        }
        AnonymousClass6Sk r2 = ((GoogleMigrateService) this.A00).A04;
        Log.i("GoogleMigrateNotificationManager/onCancelling()");
        AnonymousClass6Sk.A01(r2, C36421kH.A0B(r2.A00).getString(R.string.f12nameremoved), (String) null, -1, false, false);
    }

    public void BU4(boolean z) {
        int i = this.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i != 0) {
            C36321k7.A1X("GoogleMigrateImporterViewModel/onComplete()/success = ", A0u, z);
            if (z) {
                GoogleMigrateImporterViewModel googleMigrateImporterViewModel = (GoogleMigrateImporterViewModel) this.A00;
                googleMigrateImporterViewModel.A0U(5);
                C36341k9.A17(googleMigrateImporterViewModel.A03, 100);
                return;
            }
            return;
        }
        C36321k7.A1X("GoogleMigrateService/onComplete/success = ", A0u, z);
        if (z) {
            GoogleMigrateService googleMigrateService = (GoogleMigrateService) this.A00;
            AnonymousClass6Sk r3 = googleMigrateService.A04;
            Log.i("GoogleMigrateNotificationManager/onComplete()");
            AnonymousClass6Sk.A01(r3, C36421kH.A0B(r3.A00).getString(R.string.f12nameremoved), (String) null, -1, true, false);
            Log.i("GoogleMigrateService/onComplete/sent import complete logging");
            googleMigrateService.A05.A07("google_migrate_import_complete", "google_migrate_import_complete_next");
        }
    }

    public void BZ4() {
        if (this.A01 != 0) {
            GoogleMigrateImporterViewModel googleMigrateImporterViewModel = (GoogleMigrateImporterViewModel) this.A00;
            googleMigrateImporterViewModel.A0U(3);
            C36341k9.A17(googleMigrateImporterViewModel.A03, -1);
            return;
        }
        ((GoogleMigrateService) this.A00).A04.A02(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r3 == 101) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdK(int r3) {
        /*
            r2 = this;
            int r0 = r2.A01
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "GoogleMigrateImporterViewModel/onPrepareBeforeRetryCompleted()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 301(0x12d, float:4.22E-43)
            if (r3 == r0) goto L_0x0016
            r0 = 104(0x68, float:1.46E-43)
            if (r3 == r0) goto L_0x0016
            r0 = 101(0x65, float:1.42E-43)
            r1 = 0
            if (r3 != r0) goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            java.lang.Object r0 = r2.A00
            com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel r0 = (com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel) r0
            if (r1 == 0) goto L_0x0038
            r0.A0S()
        L_0x0020:
            return
        L_0x0021:
            r0 = 301(0x12d, float:4.22E-43)
            if (r3 == r0) goto L_0x0020
            r0 = 104(0x68, float:1.46E-43)
            if (r3 == r0) goto L_0x0020
            r0 = 101(0x65, float:1.42E-43)
            if (r3 == r0) goto L_0x0020
            java.lang.Object r0 = r2.A00
            com.whatsapp.migration.android.integration.service.GoogleMigrateService r0 = (com.whatsapp.migration.android.integration.service.GoogleMigrateService) r0
            X.6Sk r1 = r0.A04
            r0 = 0
            r1.A02(r0)
            return
        L_0x0038:
            r0.A0T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164907sZ.BdK(int):void");
    }

    public void BdL() {
        if (this.A01 != 0) {
            Log.i("GoogleMigrateImporterViewModel/onPrepareBeforeRetryStarted()");
            ((GoogleMigrateImporterViewModel) this.A00).A0U(17);
            return;
        }
        AnonymousClass6Sk r2 = ((GoogleMigrateService) this.A00).A04;
        AnonymousClass6Sk.A01(r2, C36421kH.A0B(r2.A00).getString(R.string.f12nameremoved), (String) null, -1, true, false);
    }

    public void Bdg(int i) {
        int i2 = this.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i2 != 0) {
            C36321k7.A1T("GoogleMigrateImporterViewModel/onProgress(); progress=", A0u, i);
            GoogleMigrateImporterViewModel googleMigrateImporterViewModel = (GoogleMigrateImporterViewModel) this.A00;
            googleMigrateImporterViewModel.A0U(3);
            C36341k9.A17(googleMigrateImporterViewModel.A03, i);
            return;
        }
        C36321k7.A1T("GoogleMigrateService/onProgress; progress=", A0u, i);
        ((GoogleMigrateService) this.A00).A04.A02(i);
    }

    public void onError(int i) {
        int i2 = this.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i2 != 0) {
            C36321k7.A1T("GoogleMigrateImporterViewModel/onError()/errorCode = ", A0u, i);
            ((GoogleMigrateImporterViewModel) this.A00).A0U(C111115bl.A00(i));
            return;
        }
        C36321k7.A1T("GoogleMigrateService/onError/errorCode = ", A0u, i);
        AnonymousClass6Sk r3 = ((GoogleMigrateService) this.A00).A04;
        C19630wG r2 = r3.A00;
        AnonymousClass6Sk.A01(r3, C36421kH.A0B(r2).getString(R.string.f12nameremoved), C36421kH.A0B(r2).getString(R.string.f12nameremoved), -1, true, false);
    }
}
