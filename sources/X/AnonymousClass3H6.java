package X;

import android.app.ProgressDialog;
import com.whatsapp.R;
import com.whatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.whatsapp.deviceauth.BiometricAuthPlugin;

/* renamed from: X.3H6  reason: invalid class name */
public class AnonymousClass3H6 {
    public ProgressDialog A00;
    public final AnonymousClass155 A01;
    public final LinkedDevicesSharedViewModel A02;
    public final C87514Pc A03;
    public final BiometricAuthPlugin A04;
    public final C19460v5 A05;
    public final C19460v5 A06;
    public final C19700wN A07;
    public final AnonymousClass17Y A08;
    public final C21060yb A09;
    public final AnonymousClass1LU A0A;
    public final C20810yC A0B;

    public void A00() {
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A02;
        C28201Rs r1 = linkedDevicesSharedViewModel.A0O;
        AnonymousClass155 r2 = this.A01;
        C53592rZ.A01(r2, r1, this, 27);
        C53592rZ.A01(r2, linkedDevicesSharedViewModel.A0P, this, 30);
        C53592rZ.A01(r2, linkedDevicesSharedViewModel.A0Q, this, 31);
        C53592rZ.A01(r2, linkedDevicesSharedViewModel.A0L, this, 28);
        C53592rZ.A01(r2, linkedDevicesSharedViewModel.A0K, this, 29);
        C53592rZ.A01(r2, linkedDevicesSharedViewModel.A0U, this, 32);
        C53592rZ.A01(r2, linkedDevicesSharedViewModel.A05, this, 26);
        C53592rZ.A01(r2, linkedDevicesSharedViewModel.A0M, this, 25);
    }

    public void A01(int i) {
        C28201Rs r1;
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A02;
        if (i == -1 || i == 4) {
            if (linkedDevicesSharedViewModel.A00 != C51192nQ.PHONE_NUMBER_AND_CODE || !linkedDevicesSharedViewModel.A09.A01()) {
                r1 = linkedDevicesSharedViewModel.A0S;
            } else {
                r1 = linkedDevicesSharedViewModel.A0R;
            }
            r1.A0D((Object) null);
            return;
        }
        linkedDevicesSharedViewModel.A0J.A00(3);
    }

    public AnonymousClass3H6(C19460v5 r11, C19460v5 r12, C19700wN r13, AnonymousClass17Y r14, AnonymousClass155 r15, C87514Pc r16, C21060yb r17, AnonymousClass1LU r18, C20810yC r19) {
        C20810yC r7 = r19;
        this.A0B = r7;
        this.A08 = r14;
        this.A07 = r13;
        this.A05 = r11;
        C21060yb r5 = r17;
        this.A09 = r5;
        this.A0A = r18;
        this.A06 = r12;
        AnonymousClass155 r2 = r15;
        this.A01 = r15;
        this.A02 = (LinkedDevicesSharedViewModel) C36441kJ.A0b(r15).A00(LinkedDevicesSharedViewModel.class);
        this.A04 = new BiometricAuthPlugin(r2, r13, r14, r5, new C89414Wl(this, 1), r7, R.string.f12nameremoved, 0);
        this.A03 = r16;
    }
}
