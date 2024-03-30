package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.whatsapp.migration.export.api.ExportMigrationContentProvider;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Q7  reason: invalid class name */
public class AnonymousClass6Q7 {
    public static final long A06;
    public static final long A07;
    public final ComponentName A00;
    public final PackageManager A01;
    public final AnonymousClass6FO A02;
    public final Context A03;
    public final C19700wN A04;
    public final C19970wo A05;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A07 = timeUnit.toMillis(2);
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        A06 = C90484aE.A0K(timeUnit);
    }

    public void A02() {
        AnonymousClass6FO r0 = this.A02;
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass005 r2 = r0.A01;
        C36341k9.A0w(C90464aC.A0C(r2), "/export/provider_closed/timestamp", currentTimeMillis);
        C36341k9.A0u(C90464aC.A0C(r2), "/export/provider/timestamp");
        PackageManager packageManager = this.A01;
        ComponentName componentName = this.A00;
        packageManager.setComponentEnabledSetting(componentName, 0, 1);
        if (AnonymousClass000.A1O(packageManager.getComponentEnabledSetting(componentName))) {
            this.A04.A0E("xpm-provider-disable-failed", A01(), false);
        }
    }

    public AnonymousClass6Q7(Context context, C19700wN r4, C19970wo r5, AnonymousClass6FO r6) {
        this.A05 = r5;
        this.A03 = context;
        this.A01 = context.getPackageManager();
        this.A04 = r4;
        this.A02 = r6;
        this.A00 = new ComponentName(context, ExportMigrationContentProvider.class);
    }

    public String A00() {
        long currentTimeMillis = System.currentTimeMillis();
        long A0B = C36341k9.A0B(C36391kE.A0H(this.A02.A01), "/export/provider_closed/timestamp");
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("providerState: ");
        A0u.append(this.A01.getComponentEnabledSetting(this.A00));
        A0u.append("; closedUnsuccessfully: ");
        A0u.append(A0B);
        A0u.append("; currentTime: ");
        A0u.append(currentTimeMillis);
        return AnonymousClass000.A0q(";", A0u);
    }

    public String A01() {
        String str;
        String str2;
        int length;
        long currentTimeMillis = System.currentTimeMillis();
        long A0B = C36341k9.A0B(C36391kE.A0H(this.A02.A01), "/export/provider/timestamp");
        Context context = this.A03;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            try {
                str = C90524aI.A0S(applicationInfo.dataDir).getCanonicalFile().toString();
            } catch (IOException e) {
                StringBuilder A0v = AnonymousClass000.A0v("<failed: ");
                A0v.append(e);
                str = AnonymousClass000.A0q(">", A0v);
            }
        } else {
            str = null;
        }
        try {
            Signature[] signatureArr = this.A01.getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null || (length = signatureArr.length) == 0) {
                str2 = "<no signatures>";
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("providerState: ");
                A0u.append(this.A01.getComponentEnabledSetting(this.A00));
                A0u.append("; lastAccessTime: ");
                A0u.append(A0B);
                A0u.append("; currentTime: ");
                A0u.append(currentTimeMillis);
                A0u.append("; dataDir: ");
                A0u.append(str);
                A0u.append("; signature: ");
                A0u.append(str2);
                return AnonymousClass000.A0q(";", A0u);
            }
            if (length > 1) {
                str2 = "<multiple signatures>";
            } else {
                try {
                    str2 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(signatureArr[0].toByteArray()), 11);
                } catch (NoSuchAlgorithmException e2) {
                    StringBuilder A0v2 = AnonymousClass000.A0v("<failed: ");
                    A0v2.append(e2);
                    A0v2.append(">");
                    str2 = A0v2.toString();
                }
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("providerState: ");
            A0u2.append(this.A01.getComponentEnabledSetting(this.A00));
            A0u2.append("; lastAccessTime: ");
            A0u2.append(A0B);
            A0u2.append("; currentTime: ");
            A0u2.append(currentTimeMillis);
            A0u2.append("; dataDir: ");
            A0u2.append(str);
            A0u2.append("; signature: ");
            A0u2.append(str2);
            return AnonymousClass000.A0q(";", A0u2);
        } catch (PackageManager.NameNotFoundException e3) {
            StringBuilder A0v3 = AnonymousClass000.A0v("<failed: ");
            A0v3.append(e3);
            str2 = AnonymousClass000.A0q(">", A0v3);
        }
    }

    public void A03() {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass005 r10 = this.A02.A01;
        long j = C36391kE.A0H(r10).getLong("/export/provider/timestamp", 0);
        long j2 = currentTimeMillis - j;
        if (j == 0 || j2 < 0 || j2 > 60000) {
            C36341k9.A0w(C90464aC.A0C(r10), "/export/provider/timestamp", currentTimeMillis);
        }
    }
}
