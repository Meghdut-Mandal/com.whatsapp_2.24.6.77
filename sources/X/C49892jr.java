package X;

import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2jr  reason: invalid class name and case insensitive filesystem */
public class C49892jr extends C132446Tt {
    public WeakReference A00;
    public final AnonymousClass17Y A01;
    public final C220612s A02;
    public final AnonymousClass1QD A03;
    public final C590932p A04;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r6) {
        /*
            r5 = this;
            X.32p r0 = r5.A04
            java.util.Set r3 = r0.A00
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0067
            int r0 = r3.size()
            boolean r1 = X.AnonymousClass000.A1O(r0)
            java.lang.String r0 = "Multiple bridges registered. Not supported."
            X.C18740tg.A0D(r1, r0)
            java.util.Iterator r0 = r3.iterator()
            java.lang.Object r0 = r0.next()
            X.6X5 r0 = (X.AnonymousClass6X5) r0
            if (r0 == 0) goto L_0x0067
            boolean r0 = r0.A0H()
        L_0x0027:
            java.lang.Integer r4 = X.C36361kB.A0i()
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/google-migrate-flow/import is still running"
        L_0x002f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r4
        L_0x0033:
            X.12s r0 = r5.A02
            X.12P r2 = r0.A00
            r1 = 0
            r0 = 0
            boolean r0 = r2.A0A(r1, r0)
            if (r0 != 0) goto L_0x00a2
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x006e
            int r0 = r3.size()
            boolean r1 = X.AnonymousClass000.A1O(r0)
            java.lang.String r0 = "Multiple bridges registered. Not supported."
            X.C18740tg.A0D(r1, r0)
            java.util.Iterator r0 = r3.iterator()
            java.lang.Object r0 = r0.next()
            X.6X5 r0 = (X.AnonymousClass6X5) r0
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/google-migrate-flow"
            goto L_0x002f
        L_0x0067:
            java.lang.String r0 = "GoogleMigrateUtil/isImportRunning/no-bridge"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            goto L_0x0027
        L_0x006e:
            java.lang.String r0 = "GoogleMigrateUtil/hasWhatsAppData/no-bridge"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0073:
            X.1QD r1 = r5.A03
            X.0v0 r0 = r1.A01
            boolean r0 = r0.A2D()
            if (r0 == 0) goto L_0x0080
            r1.A01()
        L_0x0080:
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            java.lang.String r0 = "mounted"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/media-storage-unreachable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 3
            goto L_0x00a8
        L_0x009b:
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/restore-from-backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            goto L_0x00a8
        L_0x00a2:
            java.lang.String r0 = "restore>DetermineRestoreStateBackgroundTask/msg-store-is-healthy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 4
        L_0x00a8:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49892jr.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A0A() {
        this.A01.A05(0, R.string.f12nameremoved);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C88004Ra r4;
        String str;
        Intent intent;
        Number number = (Number) obj;
        this.A01.A02();
        WeakReference weakReference = this.A00;
        if (weakReference != null && (r4 = (C88004Ra) weakReference.get()) != null && !r4.BLh()) {
            int intValue = number.intValue();
            RegisterName registerName = (RegisterName) r4;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("restore>RegisterName/onRestoreStateResult/result = ");
            if (intValue == 0) {
                str = "from-backup";
            } else if (intValue == 1) {
                str = "from-google-migrate";
            } else if (intValue == 2) {
                str = "from-consumer-app";
            } else if (intValue == 3) {
                str = "media-unreadable";
            } else if (intValue != 4) {
                str = AnonymousClass000.A0r("unspecified restore type: ", AnonymousClass000.A0u(), intValue);
            } else {
                str = "message-store-is-healthy";
            }
            C36321k7.A1a(A0u, str);
            if (intValue == 0) {
                RegisterName.A07(registerName);
            } else if (intValue == 1) {
                C19420v0 r0 = registerName.A09;
                C36341k9.A0w(C19420v0.A00(r0), "google_migrate_import_start_time", System.currentTimeMillis());
                try {
                    intent = C36441kJ.A0H(registerName, Class.forName("com.whatsapp.migration.android.view.GoogleMigrateImporterActivity"));
                } catch (ClassNotFoundException unused) {
                    Log.e("GoogleMigrateUtil/createStartIntent/class not found");
                    intent = null;
                }
                registerName.startActivityForResult(intent, 18);
            } else if (intValue == 2) {
                C19420v0 r02 = registerName.A09;
                C36341k9.A0w(C19420v0.A00(r02), "direct_migration_start_time", SystemClock.elapsedRealtime());
                long A002 = AnonymousClass1L0.A00(registerName, "com.whatsapp.w4b");
                C36321k7.A1V("RegisterName/checkForMigrateFromConsumerDirectly/providerAppVersionCode = ", AnonymousClass000.A0u(), A002);
                registerName.A1G.A00.A0A = Long.valueOf(A002);
                Intent A0D = C36431kI.A0D();
                A0D.setClassName(registerName.getPackageName(), "com.whatsapp.registration.directmigration.RestoreFromConsumerDatabaseActivity");
                registerName.startActivityForResult(A0D, 16);
            } else if (intValue == 3) {
                AnonymousClass3SJ.A01(registerName, 107);
            } else if (intValue == 4) {
                registerName.A1J.A07("profile_photo", "no_tap");
                registerName.A3o();
                registerName.A1W = 4;
                registerName.A09.A1G(System.currentTimeMillis() + 604800000);
            } else {
                throw AnonymousClass001.A09(AnonymousClass000.A0r("restore>RegisterName/onRestoreStateResult/result is not recognized/result = ", AnonymousClass000.A0u(), intValue));
            }
        }
    }

    public C49892jr(AnonymousClass17Y r2, C220612s r3, C88004Ra r4, AnonymousClass1QD r5, C590932p r6) {
        this.A01 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r3;
        this.A00 = AnonymousClass001.A0F(r4);
    }
}
