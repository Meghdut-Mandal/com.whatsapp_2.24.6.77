package com.whatsapp.corruptinstallation;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass155;
import X.AnonymousClass3DY;
import X.AnonymousClass3XH;
import X.AnonymousClass3Y0;
import X.C18800tq;
import X.C18830tt;
import X.C33771fu;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C37231m2;
import X.C66963Xz;
import X.C89334Wd;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public final class CorruptInstallationActivity extends AnonymousClass155 {
    public AnonymousClass3DY A00;
    public C33771fu A01;
    public boolean A02;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36351kA.A0P(A0B);
            this.A00 = C36361kB.A0Q(A0B);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        TextView A0Q = C36391kE.A0Q(this, R.id.corrupt_installation_contact_support_textview);
        Spanned fromHtml = Html.fromHtml(getString(R.string.f12nameremoved));
        AnonymousClass00C.A08(fromHtml);
        SpannableStringBuilder A0P = C36441kJ.A0P(fromHtml);
        URLSpan[] A1b = C36381kD.A1b(fromHtml);
        if (A1b != null) {
            for (URLSpan uRLSpan : A1b) {
                if ("contact-support".equals(uRLSpan.getURL())) {
                    Log.i("contact-support link found");
                    int spanStart = A0P.getSpanStart(uRLSpan);
                    int spanEnd = A0P.getSpanEnd(uRLSpan);
                    int spanFlags = A0P.getSpanFlags(uRLSpan);
                    A0P.removeSpan(uRLSpan);
                    AnonymousClass3DY r11 = this.A00;
                    if (r11 != null) {
                        A0P.setSpan(new C37231m2(r11.A01(this, (Bundle) null, (AnonymousClass3XH) null, (Integer) null, "corrupt-install", (String) null, (ArrayList) null, (ArrayList) null, false)), spanStart, spanEnd, spanFlags);
                    } else {
                        throw C36331k8.A0d("sendFeedback");
                    }
                }
            }
        }
        A0Q.setText(A0P);
        C36391kE.A1J(A0Q);
        C33771fu r0 = this.A01;
        if (r0 != null) {
            if (!r0.A02()) {
                View findViewById = findViewById(R.id.btn_uninstall);
                TextView A0Q2 = C36391kE.A0Q(this, R.id.corrupt_installation_description_website_distribution_textview);
                C36391kE.A1J(A0Q2);
                C36361kB.A1P(C36351kA.A0x(this, "https://www.whatsapp.com/android/", AnonymousClass001.A0L(), 0, R.string.f12nameremoved), A0Q2);
                C66963Xz.A00(findViewById, this, 49);
                i = R.id.play_store_div;
            } else {
                AnonymousClass3Y0.A01(findViewById(R.id.btn_play_store), this, 0);
                i = R.id.website_div;
            }
            C36341k9.A13(this, i, 8);
            return;
        }
        throw C36331k8.A0d("upgrade");
    }

    public CorruptInstallationActivity(int i) {
        this.A02 = false;
        C89334Wd.A00(this, 10);
    }

    public CorruptInstallationActivity() {
        this(0);
    }
}
