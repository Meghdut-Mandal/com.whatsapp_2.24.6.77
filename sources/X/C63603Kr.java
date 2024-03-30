package X;

import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$clearPasscode$1;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$validatePasscode$1;
import com.whatsapp.util.Log;

/* renamed from: X.3Kr  reason: invalid class name and case insensitive filesystem */
public final class C63603Kr {
    public C52642pw A00 = C52642pw.A01;
    public C52712q3 A01 = C52712q3.PBKDF2_HMAC_SHA512;
    public final C25751Hn A02;
    public final C144576sT A03;
    public final C005502l A04;
    public final C005502l A05;
    public final AnonymousClass040 A06;
    public final C25731Hl A07;
    public final C20810yC A08;

    public final C53522rS A00(String str) {
        int i;
        AnonymousClass00C.A0D(str, 0);
        Log.i("ChatLockPasscodeManager/validateIfPasscodeMeetsRequirements");
        if (!AnonymousClass00C.A0J(C36371kC.A0y(str), str)) {
            i = 5;
        } else {
            int length = str.length();
            if (length > 1000) {
                i = 6;
            } else if (new C10880fN("\\p{So}").A03(str) || length >= 4) {
                return AnonymousClass2Ec.A00;
            } else {
                Log.e("ChatLockPasscodeManager/validateIfPasscodeMeetsRequirements: Failed Validation");
                i = 1;
            }
        }
        return new AnonymousClass2Ea(i);
    }

    public final void A01(String str, C006302t r6) {
        Log.i("ChatLockPasscodeManager/validatePasscode");
        if ((new C10880fN("\\p{So}").A03(str) || str.length() >= 4) && str.length() <= 1000) {
            C36381kD.A1R(this.A05, new ChatLockPasscodeManager$validatePasscode$1(this, str, (C023509x) null, r6), this.A06);
            return;
        }
        r6.invoke(new AnonymousClass2Ea(1));
    }

    public final void A02(C006302t r5) {
        Log.i("ChatLockPasscodeManager/clearPasscode");
        C36381kD.A1R(this.A05, new ChatLockPasscodeManager$clearPasscode$1(this, (C023509x) null, r5), this.A06);
    }

    public final boolean A03() {
        if (!this.A08.A0E(5854) || !this.A07.A04()) {
            return false;
        }
        return true;
    }

    public C63603Kr(C25731Hl r2, C25751Hn r3, C144576sT r4, C20810yC r5, C005502l r6, C005502l r7, AnonymousClass040 r8) {
        C36321k7.A1B(r5, r3, r4, r2, r6);
        C36321k7.A10(r7, r8);
        this.A08 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A07 = r2;
        this.A05 = r6;
        this.A04 = r7;
        this.A06 = r8;
    }
}
