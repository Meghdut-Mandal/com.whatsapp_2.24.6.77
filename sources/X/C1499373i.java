package X;

import com.whatsapp.xfamily.crossposting.snackbar.CrosspostSnackbarManager$displaySnackBar$1$1;
import java.lang.ref.WeakReference;

/* renamed from: X.73i  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1499373i implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C33541fX A02;
    public final /* synthetic */ C132686Uv A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C1499373i(C33541fX r1, C132686Uv r2, String str, int i, int i2, boolean z) {
        this.A03 = r2;
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
        this.A05 = z;
    }

    public final void run() {
        AnonymousClass15K r3;
        C132686Uv r5 = this.A03;
        String str = this.A04;
        int i = this.A00;
        int i2 = this.A01;
        C33541fX r4 = this.A02;
        boolean z = this.A05;
        WeakReference A002 = r5.A03.A00(str);
        if (A002 != null && (r3 = (AnonymousClass15K) A002.get()) != null) {
            if (r3.BAc().compareTo(AnonymousClass01P.STARTED) >= 0) {
                AnonymousClass3ZU A003 = C132686Uv.A00(r4, r5, str, i, i2);
                if (A003 != null) {
                    A003.A02();
                }
            } else if (z) {
                r3.getLifecycle().A04(new CrosspostSnackbarManager$displaySnackBar$1$1(r3, r4, r5, str, i, i2));
            }
        }
    }
}
