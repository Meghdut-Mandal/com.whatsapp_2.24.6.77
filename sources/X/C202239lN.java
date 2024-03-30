package X;

import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9lN  reason: invalid class name and case insensitive filesystem */
public abstract class C202239lN {
    public String A00 = "payment_home";
    public boolean A01;
    public C206359tF A02;
    public List A03;
    public final AnonymousClass17Y A04;
    public final AnonymousClass155 A05;
    public final AnonymousClass1EW A06;
    public final C29221Vu A07;
    public final C24601Db A08;
    public final C29121Vk A09;
    public final C200049gU A0A;
    public final C23075B3f A0B;
    public final C196039Xk A0C;
    public final C23038B1j A0D;
    public final C19730wQ A0E;
    public final C19970wo A0F;
    public final AnonymousClass1YM A0G;
    public final C202939my A0H;
    public final AnonymousClass9SJ A0I;
    public final AnonymousClass6VG A0J;
    public final AnonymousClass1EZ A0K;

    public static void A01(C194449Pt r7, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C202239lN r9, String str) {
        C198799eD r5 = new C198799eD(r9.A0E, r9.A0F, r9.A09);
        r9.A0I.A00(new C203589oM(r7, r9, pinBottomSheetDialogFragment, r5, 2), r7, str);
    }

    public void A07(String str, String str2) {
        C21667AUj A032;
        A04();
        if (!TextUtils.isEmpty(str) && str.equals("STEP_UP")) {
            C36331k8.A0w(C90494aF.A0E(this.A08), "payment_step_up_update_ack", true);
            this.A00 = "push_notification";
            if (!(str2 == null || (A032 = this.A06.A03(str2)) == null)) {
                A032.A00 = false;
                if (this.A01) {
                    C23075B3f b3f = this.A0B;
                    String str3 = this.A00;
                    b3f.BOZ(A032, 1, (Integer) null, str3, str3);
                }
            }
            this.A0G.A03(str2);
        }
        if (this.A01) {
            ArrayList A042 = this.A06.A04();
            if (!A042.isEmpty()) {
                C21667AUj aUj = null;
                if (A042.size() == 1) {
                    aUj = (C21667AUj) C36441kJ.A12(A042);
                }
                this.A0B.BOZ(aUj, C36381kD.A0m(), (Integer) null, "payment_home", this.A00);
            }
        }
        this.A03 = AnonymousClass001.A0I();
    }

    private void A00() {
        FingerprintBottomSheet A012 = FingerprintBottomSheet.A0A.A01();
        C19970wo r3 = this.A0F;
        AnonymousClass9SL r4 = new AnonymousClass9SL(this.A0E, r3, this.A09, this.A0J, "AUTH");
        C196039Xk r6 = this.A0C;
        AnonymousClass155 r1 = this.A05;
        A012.A02 = new AnonymousClass8UY(r1, A012, r3, r4, new AGG(A012, this), r6);
        r1.Btl(A012, (String) null);
    }

    public void A02() {
        this.A0D.Bq3(false);
        this.A08.A08();
        if (!this.A03.isEmpty()) {
            this.A06.A06(this.A03);
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                this.A0G.A03(AnonymousClass001.A0C(it));
            }
        }
    }

    public void A03() {
        AnonymousClass155 r2 = this.A05;
        C202939my.A00(r2, (DialogInterface.OnDismissListener) null, r2.getString(R.string.f12nameremoved)).show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r3.A06.A04().size() > 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r3 = this;
            X.B1j r2 = r3.A0D
            X.1Db r0 = r3.A08
            X.9tF r0 = r0.A04()
            if (r0 != 0) goto L_0x0017
            X.1EW r0 = r3.A06
            java.util.ArrayList r0 = r0.A04()
            int r1 = r0.size()
            r0 = 0
            if (r1 <= 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            r2.Bq3(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202239lN.A04():void");
    }

    public void A05(C21667AUj aUj) {
        C206269sz r2;
        C21667AUj aUj2 = aUj;
        if (this.A01) {
            this.A0B.BOZ(aUj2, C36361kB.A0i(), C36381kD.A0m(), "payment_home", this.A00);
        }
        C206359tF r0 = aUj.A03;
        this.A02 = r0;
        if (r0 != null && (r2 = r0.A00) != null && r2.A00.equals("WEBVIEW")) {
            if (((C178748hC) r2).A00) {
                if (Build.VERSION.SDK_INT >= 23) {
                    AnonymousClass6VG r1 = this.A0J;
                    if (r1.A05() && r1.A02() == 1) {
                        A00();
                        return;
                    }
                }
                PinBottomSheetDialogFragment A002 = AnonymousClass9TJ.A00();
                A002.A09 = new BAM(A002, this, 1);
                this.A05.Btl(A002, (String) null);
                return;
            }
            A06((PinBottomSheetDialogFragment) null, (C203399nx) null);
        }
    }

    public void A06(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C203399nx r7) {
        new AnonymousClass9S6(this.A05, this.A04, this.A07, this.A09).A00(new C203039nA(pinBottomSheetDialogFragment, this, 1), this.A02, r7, (String) null);
    }

    public C202239lN(AnonymousClass17Y r2, C19730wQ r3, AnonymousClass155 r4, C19970wo r5, AnonymousClass1EW r6, AnonymousClass1EZ r7, AnonymousClass1YM r8, C29221Vu r9, C24601Db r10, C29121Vk r11, C202939my r12, AnonymousClass9SJ r13, C200049gU r14, C23075B3f b3f, AnonymousClass6VG r16, C196039Xk r17, C23038B1j b1j) {
        this.A0F = r5;
        this.A04 = r2;
        this.A0E = r3;
        this.A06 = r6;
        this.A0I = r13;
        this.A08 = r10;
        this.A0K = r7;
        this.A0C = r17;
        this.A09 = r11;
        this.A0B = b3f;
        this.A0H = r12;
        this.A07 = r9;
        this.A0J = r16;
        this.A0A = r14;
        this.A0G = r8;
        this.A05 = r4;
        this.A0D = b1j;
    }
}
