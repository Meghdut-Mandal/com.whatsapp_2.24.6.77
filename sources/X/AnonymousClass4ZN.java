package X;

import android.view.View;
import com.whatsapp.CircularProgressBar;

/* renamed from: X.4ZN  reason: invalid class name */
public class AnonymousClass4ZN implements C34871hm {
    public int A00;
    public int A01;
    public boolean A02;
    public final int A03;

    public AnonymousClass4ZN(int i, int i2, int i3, boolean z) {
        this.A03 = i3;
        this.A02 = z;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void BZ9(View view) {
        boolean z = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        CircularProgressBar circularProgressBar = (CircularProgressBar) view;
        circularProgressBar.setIndeterminate(z);
        circularProgressBar.setProgress(i);
        circularProgressBar.A0A = i2;
    }
}
