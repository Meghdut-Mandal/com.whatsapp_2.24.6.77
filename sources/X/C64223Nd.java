package X;

import android.content.Intent;
import com.whatsapp.R;

/* renamed from: X.3Nd  reason: invalid class name and case insensitive filesystem */
public class C64223Nd {
    public final int A00;
    public final Intent A01;
    public final String A02;

    public C64223Nd(Intent intent) {
        this.A01 = intent;
        this.A02 = null;
        this.A00 = 0;
    }

    public C64223Nd(Intent intent, String str) {
        this.A01 = intent;
        this.A02 = str;
        this.A00 = R.drawable.clear;
    }
}
