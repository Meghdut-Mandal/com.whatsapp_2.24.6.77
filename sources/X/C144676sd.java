package X;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

/* renamed from: X.6sd  reason: invalid class name and case insensitive filesystem */
public class C144676sd implements C30631aW {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;

    public /* synthetic */ void BV2() {
    }

    public void BV3() {
        C19700wN r2;
        String A002;
        String str;
        ((AnonymousClass6X5) this.A02.get()).A08();
        AnonymousClass005 r4 = this.A00;
        AnonymousClass6F7 r3 = (AnonymousClass6F7) r4.get();
        PhoneUserJid A0n = C36441kJ.A0n(r3.A00);
        synchronized (r3) {
            AnonymousClass6FO r1 = r3.A01;
            C123895xG A012 = r1.A01();
            if (!(A012 == null || A0n == null || r3.A04(A0n, A012))) {
                r1.A04();
                Log.i("ExportEncryptionManager/onCheckPrefetchedKeyConsistency(); cleared prefetched key, a different user is now logged in or key is old");
            }
        }
        ((AnonymousClass6F7) r4.get()).A01();
        AnonymousClass005 r12 = this.A01;
        ((AnonymousClass6WX) r12.get()).A06();
        AnonymousClass6WX r8 = (AnonymousClass6WX) r12.get();
        AnonymousClass6Q7 r7 = r8.A08;
        PackageManager packageManager = r7.A01;
        ComponentName componentName = r7.A00;
        boolean z = false;
        if (AnonymousClass000.A1O(packageManager.getComponentEnabledSetting(componentName))) {
            AnonymousClass005 r10 = r7.A02.A01;
            if (C36391kE.A0H(r10).getLong("/export/provider/timestamp", 0) != 0 && Math.abs(System.currentTimeMillis() - C36391kE.A0H(r10).getLong("/export/provider/timestamp", 0)) > AnonymousClass6Q7.A07) {
                z = true;
            }
        }
        if (z) {
            r7.A01();
            r2 = r8.A02;
            A002 = r7.A01();
            str = "xpm-export-provider-expired";
        } else if (!AnonymousClass000.A1O(packageManager.getComponentEnabledSetting(componentName))) {
            AnonymousClass005 r6 = r7.A02.A01;
            if (C36391kE.A0H(r6).getLong("/export/provider_closed/timestamp", 0) != 0 && Math.abs(System.currentTimeMillis() - C36391kE.A0H(r6).getLong("/export/provider_closed/timestamp", 0)) > AnonymousClass6Q7.A06) {
                r7.A00();
                r2 = r8.A02;
                A002 = r7.A00();
                str = "xpm-export-metadata-expired";
            } else {
                return;
            }
        } else {
            return;
        }
        r2.A0E(str, A002, false);
        r8.A05();
    }

    public C144676sd(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }
}
