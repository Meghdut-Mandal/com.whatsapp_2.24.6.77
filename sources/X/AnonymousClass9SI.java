package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.widget.TextView;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.9SI  reason: invalid class name */
public class AnonymousClass9SI {
    public C183808rO A00;
    public final C002000v A01 = new C002000v(32);
    public final AnonymousClass17Y A02;
    public final AnonymousClass9EU A03 = new AnonymousClass9EU();
    public final C19420v0 A04;
    public final C32681e1 A05;

    public AnonymousClass9SI(AnonymousClass17Y r3, C19420v0 r4, C32681e1 r5) {
        this.A02 = r3;
        this.A05 = r5;
        this.A04 = r4;
    }

    public void A00(TextView textView, AnonymousClass7gM r13, AnonymousClass3T1 r14, CharSequence charSequence) {
        textView.setTag(r14);
        Spannable spannable = (Spannable) this.A01.A04(charSequence.toString());
        if (spannable != null) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            if (valueOf != null) {
                C166197vK[] r10 = (C166197vK[]) spannable.getSpans(0, spannable.length(), C166197vK.class);
                URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
                if (r10 != null) {
                    for (C166197vK r3 : r10) {
                        C1901997g.A00(valueOf, spannable, r3, new C166197vK(r3.A00, r3.A01));
                    }
                }
                if (uRLSpanArr != null) {
                    for (URLSpan uRLSpan : uRLSpanArr) {
                        C1901997g.A00(valueOf, spannable, uRLSpan, new URLSpan(uRLSpan.getURL()));
                    }
                }
                r13.Bo4(valueOf);
                return;
            }
            return;
        }
        AnonymousClass9EU r4 = this.A03;
        LinkedBlockingDeque linkedBlockingDeque = r4.A00;
        Iterator it = linkedBlockingDeque.iterator();
        while (it.hasNext()) {
            C193409Li r1 = (C193409Li) it.next();
            if (r1.A00 == textView) {
                linkedBlockingDeque.remove(r1);
            }
        }
        linkedBlockingDeque.add(new C193409Li(textView, r13, r14, charSequence));
        if (this.A00 == null) {
            C183808rO r0 = new C183808rO(r4, this, this.A04.A0f());
            this.A00 = r0;
            r0.start();
        }
    }
}
