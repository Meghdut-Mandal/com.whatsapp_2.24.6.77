package X;

import android.text.Spannable;
import android.text.style.URLSpan;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.comments.MessageText;

/* renamed from: X.3f9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70433f9 implements AnonymousClass7gM {
    public final /* synthetic */ MessageText A00;
    public final /* synthetic */ AnonymousClass3T1 A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C70433f9(MessageText messageText, AnonymousClass3T1 r2, boolean z) {
        this.A00 = messageText;
        this.A01 = r2;
        this.A02 = z;
    }

    public final void Bo4(Spannable spannable) {
        String string;
        String url;
        MessageText messageText = this.A00;
        AnonymousClass3T1 r13 = this.A01;
        boolean z = this.A02;
        Spannable spannable2 = spannable;
        long A002 = (long) messageText.getSuspiciousLinkHelper().A00(C36371kC.A0B(messageText), spannable2, r13);
        URLSpan[] A1b = C36381kD.A1b(spannable2);
        AnonymousClass00C.A0B(A1b);
        for (URLSpan uRLSpan : A1b) {
            if (!(uRLSpan == null || (url = uRLSpan.getURL()) == null)) {
                int spanStart = spannable2.getSpanStart(uRLSpan);
                int spanEnd = spannable2.getSpanEnd(uRLSpan);
                int spanFlags = spannable2.getSpanFlags(uRLSpan);
                C429721s A012 = messageText.getPhoneLinkHelper().A01(messageText.getContext(), r13, url);
                if (A012 == null) {
                    A012 = messageText.getGroupLinkHelper().A00(C36371kC.A0B(messageText), r13, url);
                }
                messageText.getLinkifierUtils();
                Object[] spans = spannable2.getSpans(spanStart, spanEnd, C48952iK.class);
                AnonymousClass00C.A08(spans);
                C48952iK[] r15 = (C48952iK[]) spans;
                int length = r15.length;
                int i = 0;
                if (length != 0) {
                    A012.A04 = true;
                    do {
                        r15[i].A02 = true;
                        i++;
                    } while (i < length);
                }
                spannable2.setSpan(A012, spanStart, spanEnd, spanFlags);
            }
        }
        if (r12 != 0 && !z) {
            C33521fV.A08(messageText, messageText.A02, messageText.getAbProps());
        }
        AnonymousClass1RJ r1 = messageText.A0D;
        if (r1 != null) {
            if (A002 > 0) {
                WaTextView waTextView = (WaTextView) C36391kE.A0L(r1, 0);
                if (A002 > 1) {
                    C18820ts whatsAppLocale = waTextView.getWhatsAppLocale();
                    Object[] A0L = AnonymousClass001.A0L();
                    AnonymousClass000.A1M(A0L, 0, A002);
                    string = whatsAppLocale.A0L(A0L, R.plurals.f10nameremoved, A002);
                } else {
                    string = waTextView.getContext().getString(R.string.f12nameremoved);
                }
                waTextView.setText(string);
            } else {
                r1.A03(8);
            }
        }
        C36431kI.A1M(messageText, spannable2);
    }
}
