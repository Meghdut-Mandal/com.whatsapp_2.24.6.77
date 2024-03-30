package X;

import android.app.Activity;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.3eu  reason: invalid class name and case insensitive filesystem */
public class C70283eu implements AnonymousClass4UY {
    public C49472jB A00;
    public C50152kI A01;
    public String A02;
    public final Activity A03;
    public final AnonymousClass1NG A04;
    public final C19600wD A05;
    public final AnonymousClass16D A06;
    public final C62533Gn A07;
    public final C21159AAt A08;
    public final AnonymousClass19A A09;
    public final C19770wU A0A;

    public /* synthetic */ void BXf() {
    }

    public /* synthetic */ void BXh() {
    }

    public /* synthetic */ void BYu() {
    }

    public /* synthetic */ void Bgc(int i) {
    }

    public void A00() {
        C49472jB r0 = this.A00;
        if (r0 != null) {
            r0.A0D(true);
            this.A00 = null;
        }
        C50152kI r02 = this.A01;
        if (r02 != null) {
            r02.A0D(true);
            this.A01 = null;
        }
    }

    public void BXg(AnonymousClass141 r6) {
        Activity activity = this.A03;
        if (activity.isFinishing()) {
            return;
        }
        if (r6 != null) {
            this.A07.A01(r6, activity.getString(R.string.f12nameremoved));
            return;
        }
        C62533Gn r4 = this.A07;
        r4.A01((AnonymousClass141) null, activity.getString(R.string.f12nameremoved));
        String string = activity.getString(R.string.f12nameremoved);
        C66943Xx r2 = new C66943Xx(this, 27);
        AnonymousClass00C.A0D(string, 0);
        TextView textView = r4.A03;
        textView.setText(string);
        textView.setVisibility(0);
        textView.setOnClickListener(r2);
    }

    public C70283eu(Activity activity, AnonymousClass1NG r2, C19600wD r3, AnonymousClass16D r4, C62533Gn r5, C21159AAt aAt, AnonymousClass19A r7, C19770wU r8) {
        this.A03 = activity;
        this.A0A = r8;
        this.A09 = r7;
        this.A06 = r4;
        this.A04 = r2;
        this.A08 = aAt;
        this.A05 = r3;
        this.A07 = r5;
    }
}
