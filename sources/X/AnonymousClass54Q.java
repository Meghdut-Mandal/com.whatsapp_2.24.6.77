package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.54Q  reason: invalid class name */
public final class AnonymousClass54Q extends AnonymousClass1CP {
    public final C24401Ch A00;
    public final AnonymousClass005 A01;
    public final C19730wQ A02;
    public final C24341Cb A03;
    public final C19630wG A04;
    public final AnonymousClass1CY A05;
    public final C24391Cg A06;
    public final AnonymousClass1CS A07;
    public final AnonymousClass005 A08;

    public String A0J() {
        return "chatlock_backup";
    }

    public ArrayList A0K(File file) {
        AnonymousClass00C.A0D(file, 0);
        return AnonymousClass6YO.A07(file, "chatlock_backup.bkup", AnonymousClass6YO.A06(AnonymousClass5U6.CRYPT14));
    }

    public boolean A0N(Context context, File file) {
        AnonymousClass5U6 r10;
        File file2 = file;
        AnonymousClass00C.A0D(file2, 1);
        try {
            File A012 = ((C25751Hn) this.A01.get()).A01();
            int A013 = AnonymousClass6YO.A01(file2.getName(), "chatlock_backup.bkup");
            if (A013 <= 0 || (r10 = AnonymousClass5U6.A02(A013)) == null) {
                r10 = AnonymousClass5U6.UNENCRYPTED;
            }
            AnonymousClass1CS r11 = this.A07;
            C19730wQ r3 = this.A02;
            AnonymousClass1CY r7 = this.A05;
            C109765Za.A00(r3, (C132716Uy) null, this.A01, this.A03, r7, this.A04, this.A06, r10, r11, file2, (Boolean) null).A05(this.A04, (C158587hk) null, A012, 0, 0, false);
            return true;
        } catch (IOException e) {
            Log.e("ChatLockBackup/restore failed", e);
            return false;
        }
    }

    public AnonymousClass6PN A0O(AnonymousClass5U6 r19) {
        AnonymousClass5U6 r10 = r19;
        AnonymousClass00C.A0D(r10, 0);
        if (!((C235718z) this.A08.get()).A0J()) {
            return null;
        }
        File A012 = ((C25751Hn) this.A01.get()).A01();
        File A032 = AnonymousClass5U6.A03(this, r10, "chatlock_backup.bkup.crypt", AnonymousClass000.A0u());
        try {
            AnonymousClass1CS r11 = this.A07;
            C19730wQ r3 = this.A02;
            AnonymousClass1CY r7 = this.A05;
            AnonymousClass6QE A002 = C109765Za.A00(r3, (C132716Uy) null, this.A01, this.A03, r7, this.A04, this.A06, r10, r11, A032, (Boolean) null);
            if (!A002.A08(this.A04.A00)) {
                Log.e("ChatLockBackup/backup prepare for backup failed");
                return new AnonymousClass6PN((File) null, (Long) null, "chatlock_backup", 0, false);
            }
            A002.A07((AnonymousClass7fT) null, A012);
            return new AnonymousClass6PN(A032, (Long) null, "chatlock_backup", C90514aH.A0K(this, r10), true);
        } catch (IOException e) {
            Log.e("ChatLockBackup/backup backup failed", e);
            return new AnonymousClass6PN((File) null, (Long) null, "chatlock_backup", 0, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass54Q(C19730wQ r2, C24341Cb r3, C19630wG r4, AnonymousClass1CY r5, C24421Cj r6, C24401Ch r7, C24391Cg r8, AnonymousClass1CS r9, AnonymousClass005 r10, AnonymousClass005 r11) {
        super(r6);
        C36321k7.A1B(r4, r9, r2, r5, r3);
        C36321k7.A13(r10, r8, r7);
        AnonymousClass00C.A0D(r11, 9);
        this.A04 = r4;
        this.A07 = r9;
        this.A02 = r2;
        this.A05 = r5;
        this.A03 = r3;
        this.A08 = r10;
        this.A06 = r8;
        this.A00 = r7;
        this.A01 = r11;
    }
}
