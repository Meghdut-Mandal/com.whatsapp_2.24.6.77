package X;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import java.util.Objects;

/* renamed from: X.1WR  reason: invalid class name */
public class AnonymousClass1WR {
    public String A00;
    public boolean A01;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final C19700wN A03;
    public final C19420v0 A04;
    public final AnonymousClass19A A05;
    public final AnonymousClass005 A06;
    public final C19730wQ A07;
    public final AnonymousClass19J A08;
    public final C19630wG A09;
    public final C27621Oz A0A;
    public final C27601Ox A0B;
    public final C19770wU A0C;

    public String A00() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        A01((C23068B2x) null);
        String string = ((SharedPreferences) this.A04.A00.get()).getString("my_current_status", (String) null);
        if (string == null) {
            return this.A09.A00.getString(R.string.f12nameremoved);
        }
        return string;
    }

    public void A01(C23068B2x b2x) {
        if (!this.A01) {
            C19630wG r3 = this.A09;
            C19770wU r8 = this.A0C;
            C193909Nj r1 = new C193909Nj(this.A03, r3, this.A0A, this.A0B, this.A05, new C21613ASf(this, b2x), r8);
            C19730wQ r0 = this.A07;
            r0.A0G();
            PhoneUserJid phoneUserJid = r0.A03;
            C18740tg.A06(phoneUserJid);
            r1.A06.Boy(new AnonymousClass735(r1, phoneUserJid, 6, 0));
            this.A01 = true;
        }
    }

    public void A02(String str, String str2) {
        this.A00 = str;
        this.A01 = false;
        this.A04.A1j(str, str2);
        Handler handler = this.A02;
        Object obj = this.A06.get();
        Objects.requireNonNull(obj);
        handler.post(new C35641j1(obj, 1));
    }

    public AnonymousClass1WR(C19700wN r3, C19730wQ r4, AnonymousClass19J r5, C19630wG r6, C19420v0 r7, C27621Oz r8, C27601Ox r9, AnonymousClass19A r10, C19770wU r11, AnonymousClass005 r12) {
        this.A09 = r6;
        this.A0C = r11;
        this.A03 = r3;
        this.A07 = r4;
        this.A05 = r10;
        this.A08 = r5;
        this.A04 = r7;
        this.A0A = r8;
        this.A0B = r9;
        this.A06 = r12;
    }
}
