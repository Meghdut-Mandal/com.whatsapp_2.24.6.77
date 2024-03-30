package X;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.1m2  reason: invalid class name and case insensitive filesystem */
public class C37231m2 extends ClickableSpan {
    public final Intent A00;

    public C37231m2(Intent intent) {
        this.A00 = intent;
    }

    public void onClick(View view) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("activity-intent-span/go intent=");
        Intent intent = this.A00;
        C36321k7.A1N(intent, A0u);
        C36371kC.A16(intent, view);
    }
}
