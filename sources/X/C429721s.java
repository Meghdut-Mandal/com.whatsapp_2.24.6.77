package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.21s  reason: invalid class name and case insensitive filesystem */
public class C429721s extends C33991gH {
    public int A00;
    public int A01;
    public AnonymousClass4P1 A02;
    public boolean A03;
    public boolean A04;
    public Runnable A05;
    public final C24791Du A06;
    public final AnonymousClass17Y A07;
    public final C21060yb A08;
    public final AnonymousClass3T1 A09;
    public final String A0A;

    public C429721s(Context context, C24791Du r4, AnonymousClass17Y r5, C21060yb r6, String str, int i) {
        super(context, i);
        this.A01 = 0;
        this.A00 = 4;
        this.A07 = r5;
        this.A08 = r6;
        this.A06 = r4;
        this.A0A = str;
        this.A09 = null;
    }

    public void A01() {
    }

    public void BjD(MotionEvent motionEvent, View view) {
        View view2 = view;
        super.BjD(motionEvent, view);
        if (this.A00) {
            Uri parse = Uri.parse(this.A0A);
            String scheme = parse.getScheme();
            if ("http".equals(scheme) || "https".equals(scheme) || "rtsp".equals(scheme) || "ftp".equals(scheme) || "tel".equals(scheme) || "wapay".equals(scheme) || "upi".equals(scheme)) {
                Runnable runnable = this.A05;
                if (runnable == null) {
                    runnable = new C1503574y(this, parse, view2, scheme, 3);
                    this.A05 = runnable;
                }
                this.A07.A0I(runnable, (long) ViewConfiguration.getLongPressTimeout());
                return;
            }
            return;
        }
        Runnable runnable2 = this.A05;
        if (runnable2 != null) {
            this.A07.A0G(runnable2);
        }
    }

    public void onClick(View view) {
        int i = this.A00;
        if (i == 1 || i == 2 || i == 3 || i == 6) {
            this.A06.Bp9(view.getContext(), Uri.parse(this.A0A), this.A09, this.A01, this.A00);
        } else {
            boolean z = this.A03;
            C24791Du r4 = this.A06;
            Context context = view.getContext();
            Uri parse = Uri.parse(this.A0A);
            AnonymousClass3T1 r1 = this.A09;
            if (z) {
                r4.Bp8(context, parse, r1, this.A01);
            } else {
                r4.Bp7(context, parse, r1);
            }
        }
        AnonymousClass4P1 r0 = this.A02;
        if (r0 != null) {
            r0.B2v();
        }
    }

    public static C429721s A00(Context context, URLSpan uRLSpan, C24791Du r6, AnonymousClass17Y r7, C21060yb r8) {
        return new C429721s(context, r6, r7, r8, uRLSpan.getURL());
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.A04);
    }

    public C429721s(Context context, C24791Du r9, AnonymousClass17Y r10, C21060yb r11, String str) {
        this(context, r9, r10, r11, (AnonymousClass3T1) null, str);
    }

    public C429721s(Context context, C24791Du r3, AnonymousClass17Y r4, C21060yb r5, AnonymousClass3T1 r6, String str) {
        super(context);
        this.A01 = 0;
        this.A00 = 4;
        this.A07 = r4;
        this.A08 = r5;
        this.A06 = r3;
        this.A0A = str;
        this.A09 = r6;
    }
}
