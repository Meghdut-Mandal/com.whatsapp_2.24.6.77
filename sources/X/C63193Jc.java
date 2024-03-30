package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.3Jc  reason: invalid class name and case insensitive filesystem */
public class C63193Jc {
    public int A00 = 0;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public final C18820ts A03;

    public float A01(Resources resources) {
        float f = this.A01;
        if (f == 0.0f) {
            f = resources.getDimension(R.dimen.f7nameremoved) / resources.getDisplayMetrics().scaledDensity;
            this.A01 = f;
        }
        int i = 0;
        int i2 = this.A00;
        if (i2 == -1) {
            i = -2;
        } else if (i2 == 1) {
            i = 4;
        }
        return f + ((float) i);
    }

    public float A02(Resources resources) {
        return (A03(resources, this.A00) * 24.0f) / 27.0f;
    }

    public float A03(Resources resources, int i) {
        if (this.A02 == 0.0f) {
            this.A02 = resources.getDimension(R.dimen.f7nameremoved) / resources.getDisplayMetrics().scaledDensity;
        }
        int i2 = 0;
        if (i == -1) {
            i2 = -2;
        } else if (i == 1) {
            i2 = 4;
        }
        C18820ts r2 = this.A03;
        if (r2.A06().equals("ar") || r2.A06().equals("fa")) {
            i2++;
        }
        return this.A02 + ((float) i2);
    }

    public C63193Jc(C18820ts r2) {
        this.A03 = r2;
    }

    public static void A00(Context context, TextView textView, C63193Jc r3) {
        textView.setTextSize(r3.A03(context.getResources(), r3.A00));
    }
}
