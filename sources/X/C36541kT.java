package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.1kT  reason: invalid class name and case insensitive filesystem */
public abstract class C36541kT extends Dialog {
    public final Activity A00;
    public final C21060yb A01;
    public final C18820ts A02;
    public final int A03;
    public final C19970wo A04;

    public void onCreate(Bundle bundle) {
        AnonymousClass1JZ.A08(getWindow(), this.A02);
        super.onCreate(bundle);
        setContentView(C36361kB.A0E(this.A00.getLayoutInflater(), (ViewGroup) null, this.A03));
        getWindow().setLayout(-1, -1);
    }

    public C36541kT(Activity activity, C21060yb r3, C19970wo r4, C18820ts r5, int i) {
        super(activity, R.style.f13nameremoved);
        this.A04 = r4;
        this.A02 = r5;
        this.A00 = activity;
        this.A03 = i;
        this.A01 = r3;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }
}
