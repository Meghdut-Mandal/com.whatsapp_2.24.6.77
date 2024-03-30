package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONObject;

/* renamed from: X.54V  reason: invalid class name */
public class AnonymousClass54V extends AnonymousClass1CP {
    public boolean A00 = false;
    public final C19420v0 A01;
    public final C19900wh A02;
    public final C19730wQ A03;
    public final C24341Cb A04;
    public final C19630wG A05;
    public final AnonymousClass1CY A06;
    public final C24391Cg A07;
    public final AnonymousClass1CS A08;

    public String A0J() {
        return "backup-settings";
    }

    public void A0F() {
        if (this.A00) {
            C002300y.A00(this.A02.A00());
            this.A00 = false;
        }
    }

    public ArrayList A0K(File file) {
        return AnonymousClass6YO.A07(file, "backup_settings.json", AnonymousClass6YO.A06(AnonymousClass5U6.CRYPT14));
    }

    public synchronized boolean A0N(Context context, File file) {
        AnonymousClass5U6 r8;
        FileInputStream A0U;
        int i;
        int i2;
        synchronized (this) {
            try {
                C20840yF r6 = this.A04;
                File A002 = r6.A00("backup_settings.json");
                File file2 = file;
                file2.length();
                int A012 = AnonymousClass6YO.A01(file2.getName(), "backup_settings.json");
                if (A012 <= 0 || (r8 = AnonymousClass5U6.A02(A012)) == null) {
                    r8 = AnonymousClass5U6.UNENCRYPTED;
                }
                AnonymousClass1CS r9 = this.A08;
                C109765Za.A00(this.A03, (C132716Uy) null, this.A01, this.A04, this.A06, r6, this.A07, r8, r9, file2, (Boolean) null).A05(this.A05, (C158587hk) null, A002, 0, 0, false);
                try {
                    A0U = C90524aI.A0U(A002);
                    JSONObject A013 = AnonymousClass14X.A01(A0U);
                    if (A013 == null) {
                        Log.w("backup_settings/restore/could not read JSON metadata from the backup file");
                        A0U.close();
                    } else {
                        if (A013.has("backupFrequency") && (i2 = A013.getInt("backupFrequency")) >= 0) {
                            this.A01.A2R(i2);
                        }
                        if (A013.has("backupNetworkSettings") && (i = A013.getInt("backupNetworkSettings")) >= 0) {
                            C36341k9.A0x(C19420v0.A00(this.A01), "interface_gdrive_backup_network_setting", String.valueOf(i));
                        }
                        if (A013.has("includeVideosInBackup")) {
                            this.A01.A1u(A013.getBoolean("includeVideosInBackup"));
                        }
                        if (A013.has("localSettings")) {
                            JSONObject jSONObject = A013.getJSONObject("localSettings");
                            if (jSONObject != null) {
                                this.A01.A1p(jSONObject);
                            } else {
                                Log.i("backup_settings/restore/settings/local-settings-object-is-null");
                            }
                        }
                        if (A013.has("night_mode_settings")) {
                            int i3 = A013.getInt("night_mode_settings");
                            C19900wh r2 = this.A02;
                            if (i3 != r2.A00()) {
                                C36341k9.A0v(r2.A01.edit(), "night_mode", i3);
                                this.A00 = true;
                            }
                        }
                        A0U.close();
                        return true;
                    }
                } catch (Exception e) {
                    Log.e("backup_settingsbackup/exception while reading temp JSON file", e);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (Exception e2) {
                Log.w("backup_settings/restore/error", e2);
            }
        }
        return false;
        throw th;
    }

    public synchronized AnonymousClass6PN A0O(AnonymousClass5U6 r21) {
        AnonymousClass6PN r13;
        OutputStreamWriter outputStreamWriter;
        synchronized (this) {
            C20840yF r10 = this.A04;
            File A002 = r10.A00("backup_settings.json");
            try {
                FileOutputStream A0W = C90524aI.A0W(A002);
                try {
                    outputStreamWriter = new OutputStreamWriter(A0W, C19430v1.A0B);
                    HashMap A0J = AnonymousClass001.A0J();
                    C19420v0 r1 = this.A01;
                    C90504aG.A1C(r1, A0J);
                    A0J.put("localSettings", r1.A0n());
                    A0J.put("night_mode_settings", Integer.valueOf(this.A02.A00()));
                    outputStreamWriter.write(new JSONObject(A0J).toString(2));
                    outputStreamWriter.close();
                    A0W.close();
                    try {
                        AnonymousClass5U6 r12 = r21;
                        File A032 = AnonymousClass5U6.A03(this, r12, "backup_settings.json.crypt", AnonymousClass000.A0u());
                        C36321k7.A1K(A032, "backup_settings/backup/to ", AnonymousClass000.A0u());
                        AnonymousClass1CS r132 = this.A08;
                        AnonymousClass6QE A003 = C109765Za.A00(this.A03, (C132716Uy) null, this.A01, this.A04, this.A06, r10, this.A07, r12, r132, A032, (Boolean) null);
                        if (!A003.A08(this.A05.A00)) {
                            Log.w("backup_settings/backup/prepare for backup failed");
                            r13 = new AnonymousClass6PN("backup-settings");
                        } else {
                            A003.A07((AnonymousClass7fT) null, A002);
                            r13 = new AnonymousClass6PN(A032, (Long) null, "backup-settings", C90514aH.A0K(this, r12), true);
                        }
                    } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                        Log.e("backup_settings/backup failed", e);
                        r13 = new AnonymousClass6PN("backup-settings");
                    }
                } catch (Throwable th) {
                    A0W.close();
                    throw th;
                }
            } catch (Exception e2) {
                C36321k7.A1M(A002, "backup_settings/backup/exception while writing to temp file", AnonymousClass000.A0u(), e2);
                r13 = new AnonymousClass6PN("backup-settings");
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return r13;
        throw th;
    }

    public AnonymousClass54V(C19730wQ r2, C24341Cb r3, C19630wG r4, C19420v0 r5, C19900wh r6, AnonymousClass1CY r7, C24421Cj r8, C24391Cg r9, AnonymousClass1CS r10) {
        super(r8);
        this.A05 = r4;
        this.A08 = r10;
        this.A03 = r2;
        this.A06 = r7;
        this.A04 = r3;
        this.A01 = r5;
        this.A07 = r9;
        this.A02 = r6;
    }

    public void A0L(C1042758y r2, double d) {
        r2.A0F = Double.valueOf(d);
    }

    public void A0M(C1042758y r2, double d) {
        r2.A0E = Double.valueOf(d);
    }
}
