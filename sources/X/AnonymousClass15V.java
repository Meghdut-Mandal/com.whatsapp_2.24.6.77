package X;

import android.os.Bundle;
import com.whatsapp.dialogs.ProgressDialogFragment;

/* renamed from: X.15V  reason: invalid class name */
public class AnonymousClass15V {
    public static boolean A02;
    public static final String A03 = ProgressDialogFragment.class.getName();
    public ProgressDialogFragment A00;
    public final C225314u A01;

    public void A00(int i, int i2) {
        if (this.A00 == null) {
            ProgressDialogFragment A032 = ProgressDialogFragment.A03(i, i2);
            this.A00 = A032;
            A032.A1f(this.A01.getSupportFragmentManager(), A03);
        }
        A02 = true;
    }

    public void A01(String str, String str2) {
        if (this.A00 == null) {
            ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("message", str2);
            progressDialogFragment.A17(bundle);
            this.A00 = progressDialogFragment;
            progressDialogFragment.A1f(this.A01.getSupportFragmentManager(), A03);
        }
        A02 = true;
    }

    public AnonymousClass15V(C225314u r1) {
        this.A01 = r1;
    }
}
