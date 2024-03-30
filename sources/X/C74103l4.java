package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.3l4  reason: invalid class name and case insensitive filesystem */
public class C74103l4 implements AnonymousClass4T5 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DialogFragment A01;
    public final /* synthetic */ C64993Qh A02;
    public final /* synthetic */ AnonymousClass2IR A03;
    public final /* synthetic */ AnonymousClass3T1 A04;
    public final /* synthetic */ AnonymousClass3P8 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C74103l4(Context context, DialogFragment dialogFragment, C64993Qh r3, AnonymousClass2IR r4, AnonymousClass3T1 r5, AnonymousClass3P8 r6, String str, boolean z) {
        this.A02 = r3;
        this.A01 = dialogFragment;
        this.A06 = str;
        this.A05 = r6;
        this.A07 = z;
        this.A00 = context;
        this.A04 = r5;
        this.A03 = r4;
    }

    public void BQe() {
        this.A01.A1b();
        String str = this.A06;
        if (str != null && !str.isEmpty()) {
            this.A05.A01 = str;
        }
        if (this.A07) {
            this.A02.A03(this.A00, this.A04, this.A05);
            return;
        }
        AnonymousClass2IR r4 = this.A03;
        if (r4 != null) {
            C64993Qh.A00(this.A00, this.A02, r4, this.A04, this.A05);
        }
    }

    public void BT2() {
        this.A01.A1b();
    }
}
