package X;

import android.os.Build;
import android.view.View;
import com.whatsapp.KeyboardPopupLayout;

/* renamed from: X.3Gj  reason: invalid class name and case insensitive filesystem */
public class C62493Gj {
    public final AnonymousClass3OZ A00;
    public final C61403Bs A01;
    public final AnonymousClass1V6 A02;
    public final AnonymousClass1YV A03;
    public final AnonymousClass4SR A04;

    public AnonymousClass6YP A00(View view, AnonymousClass155 r15, C39821ts r16, AnonymousClass190 r17, C160207kd r18) {
        return this.A01.A00(view, r15, r15, r16, this.A00.A01(r15, view), this.A04.B43(r15, r17), r18, (AnonymousClass33M) null, true, C36381kD.A1U(Build.VERSION.SDK_INT, 26));
    }

    public AnonymousClass6YP A01(C225314u r14, KeyboardPopupLayout keyboardPopupLayout, C39821ts r16, AnonymousClass190 r17, C160207kd r18) {
        return this.A01.A00(keyboardPopupLayout, r14, r14, r16, this.A00.A01(r14, keyboardPopupLayout), this.A04.B43(r14, r17), r18, new AnonymousClass33M(this), false, C36381kD.A1U(Build.VERSION.SDK_INT, 26));
    }

    public C62493Gj(AnonymousClass3OZ r1, C61403Bs r2, AnonymousClass1V6 r3, AnonymousClass1YV r4, AnonymousClass4SR r5) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
    }
}
