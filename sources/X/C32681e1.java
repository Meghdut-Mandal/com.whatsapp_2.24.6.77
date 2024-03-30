package X;

import android.content.Context;
import android.os.ConditionVariable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1e1  reason: invalid class name and case insensitive filesystem */
public class C32681e1 {
    public final C32741e7 A00;
    public final C32731e6 A01;
    public final AnonymousClass1DU A02;
    public final C32771eA A03;
    public final AnonymousClass1EV A04;
    public final AnonymousClass1EU A05;
    public final Context A06;
    public final AnonymousClass17Y A07;
    public final C32691e2 A08;
    public final C21060yb A09;
    public final C19420v0 A0A;
    public final C32711e4 A0B;

    public SpannableString A01(Context context, String str, Runnable[] runnableArr, String[] strArr, String[] strArr2) {
        Context context2 = context;
        C32711e4 r0 = this.A0B;
        if (context == null) {
            context2 = this.A06;
        }
        return r0.A03(context2, str, runnableArr, strArr, strArr2);
    }

    public SpannableString A00(Context context, String str) {
        if (context == null) {
            context = this.A06;
        }
        return C32711e4.A00(context, str);
    }

    public SpannableStringBuilder A03(Context context, Runnable runnable, String str, String str2, int i) {
        if (context == null) {
            context = this.A06;
        }
        return C32711e4.A02(context, runnable, str, str2, i);
    }

    public void A04(Context context, Spannable spannable) {
        Context context2;
        try {
            Linkify.addLinks(spannable, 10);
            this.A02.A06(spannable);
            C1901697d.A00(spannable, this.A0A.A0f());
            AnonymousClass1EU r1 = this.A05;
            AnonymousClass1EV r0 = this.A04;
            C1901497b.A00(spannable, r0, r1);
            C1901597c.A00(spannable, r0, r1);
        } catch (Exception unused) {
        }
        ArrayList A0C = AnonymousClass6YV.A0C(spannable);
        if (A0C != null && !A0C.isEmpty()) {
            Iterator it = A0C.iterator();
            while (it.hasNext()) {
                URLSpan uRLSpan = (URLSpan) it.next();
                String url = uRLSpan.getURL();
                if (context != null) {
                    context2 = context;
                } else {
                    context2 = this.A06;
                }
                spannable.setSpan(new C429721s(context2, this.A08, this.A07, this.A09, url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
            }
            Iterator it2 = A0C.iterator();
            while (it2.hasNext()) {
                spannable.removeSpan(it2.next());
            }
        }
    }

    public C32681e1(AnonymousClass17Y r2, C32691e2 r3, C32741e7 r4, C21060yb r5, C19630wG r6, C19420v0 r7, C32731e6 r8, AnonymousClass1DU r9, C32771eA r10, AnonymousClass1EV r11, AnonymousClass1EU r12, C32711e4 r13) {
        this.A06 = r6.A00;
        this.A07 = r2;
        this.A02 = r9;
        this.A08 = r3;
        this.A01 = r8;
        this.A00 = r4;
        this.A0B = r13;
        this.A09 = r5;
        this.A05 = r12;
        this.A0A = r7;
        this.A03 = r10;
        this.A04 = r11;
        ConditionVariable conditionVariable = C18740tg.A00;
    }

    public SpannableStringBuilder A02(Context context, Runnable runnable, String str, String str2) {
        return A03(context, runnable, str, str2, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
    }
}
