package X;

import android.accounts.AccountManager;
import android.app.KeyguardManager;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.1XF  reason: invalid class name */
public class AnonymousClass1XF {
    public final C19970wo A00;
    public final C19630wG A01;
    public final C19420v0 A02;
    public final AnonymousClass1XG A03;
    public final C19770wU A04;
    public final C21060yb A05;
    public final C20810yC A06;
    public final C21010yW A07;
    public final AnonymousClass19A A08;
    public final AnonymousClass1XH A09;

    public static void A00(AnonymousClass1XF r5, Exception exc, boolean z) {
        int i;
        KeyguardManager A062 = r5.A05.A06();
        if (A062 != null && C19550w8.A05()) {
            if (C20800yB.A01(C21000yV.A02, r5.A06, 5681)) {
                AnonymousClass2PV r2 = new AnonymousClass2PV();
                Context context = r5.A01.A00;
                Boolean bool = C18750th.A03;
                AccountManager accountManager = AccountManager.get(context);
                int i2 = -1;
                if (accountManager != null) {
                    try {
                        i2 = accountManager.getAccountsByType("com.google").length;
                    } catch (Exception unused) {
                    }
                }
                r2.A01 = Long.valueOf((long) i2);
                if (exc != null) {
                    int i3 = Log.level;
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    r2.A02 = stringWriter.toString();
                }
                if (A062.isDeviceSecure()) {
                    i = 4;
                    if (z) {
                        i = 3;
                    }
                } else {
                    i = 2;
                }
                r2.A00 = Integer.valueOf(i);
                r5.A07.Bly(r2);
            }
        }
    }

    public void A01(int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("BackupTokenProtocolHelper/sendBackupTokenRequest/backupTokenType:");
        int i2 = i;
        sb.append(i2);
        Log.i(sb.toString());
        String A0h = this.A02.A0h();
        if (AnonymousClass14B.A0F(A0h)) {
            return;
        }
        if (i2 != 2 || this.A09.A01()) {
            byte[] A0G = C18750th.A0G();
            AnonymousClass19A r14 = this.A08;
            String A092 = r14.A09();
            C203399nx r10 = new C203399nx("token", A0G, (AnonymousClass1AL[]) null);
            if (i2 == 2) {
                str = "foa";
            } else {
                str = "blockstore";
            }
            C203399nx r9 = new C203399nx(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str, (AnonymousClass1AL[]) null);
            r14.A0F(new C76693pI(this, A0h, A0G, i2), new C203399nx("iq", new AnonymousClass1AL[]{new AnonymousClass1AL("to", "s.whatsapp.net"), new AnonymousClass1AL("xmlns", "w:auth:backup:token"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092)}, new C203399nx[]{r10, r9}), A092, 226, 32000);
            return;
        }
        Log.i("BackupTokenProtocolHelper/sendBackupTokenRequest/foa backup token is not eligible");
    }

    public AnonymousClass1XF(C21060yb r1, C19970wo r2, C19630wG r3, C19420v0 r4, C20810yC r5, C21010yW r6, AnonymousClass19A r7, AnonymousClass1XH r8, AnonymousClass1XG r9, C19770wU r10) {
        this.A00 = r2;
        this.A06 = r5;
        this.A01 = r3;
        this.A04 = r10;
        this.A07 = r6;
        this.A08 = r7;
        this.A05 = r1;
        this.A02 = r4;
        this.A03 = r9;
        this.A09 = r8;
    }
}
