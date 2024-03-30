package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.whatsapp.R;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: X.225  reason: invalid class name */
public class AnonymousClass225 extends C36541kT {
    public final /* synthetic */ C21360z5 A00;
    public final /* synthetic */ C33771fu A01;
    public final /* synthetic */ C33751fs A02;
    public final /* synthetic */ C20810yC A03;
    public final /* synthetic */ C21010yW A04;
    public final /* synthetic */ C24801Dv A05;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DateFormat dateInstance = DateFormat.getDateInstance(2, C36401kF.A0x(this.A02));
        Activity activity = this.A00;
        C21360z5 r12 = this.A00;
        Date A012 = r12.A01();
        Object[] objArr = new Object[2];
        C36421kH.A0k(activity, R.string.f12nameremoved, 0, objArr);
        objArr[1] = dateInstance.format(A012);
        ((TextView) findViewById(R.id.software_too_old)).setText(AnonymousClass14B.A01(activity, objArr, R.string.f12nameremoved));
        Object[] objArr2 = new Object[2];
        objArr2[0] = dateInstance.format(new Date());
        C36421kH.A0k(activity, R.string.f12nameremoved, 1, objArr2);
        SpannableString valueOf = SpannableString.valueOf(AnonymousClass14B.A01(activity, objArr2, R.string.f12nameremoved));
        URLSpan[] uRLSpanArr = (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("date-settings".equals(uRLSpan.getURL())) {
                    int spanStart = valueOf.getSpanStart(uRLSpan);
                    int spanEnd = valueOf.getSpanEnd(uRLSpan);
                    int spanFlags = valueOf.getSpanFlags(uRLSpan);
                    valueOf.removeSpan(uRLSpan);
                    valueOf.setSpan(new AnonymousClass4VU(this, 0), spanStart, spanEnd, spanFlags);
                }
            }
        }
        TextView textView = (TextView) findViewById(R.id.current_date);
        textView.setText(valueOf);
        textView.setMovementMethod(new LinkMovementMethod());
        C20810yC r10 = this.A03;
        C21010yW r11 = this.A04;
        long time = r12.A01().getTime();
        if (r10.A0E(3299)) {
            C45212Qm r1 = new C45212Qm();
            r1.A02 = C36361kB.A0i();
            r1.A00 = 0;
            r1.A03 = Long.valueOf(time);
            r11.Blv(r1);
        }
        C66973Ya r8 = new C66973Ya(this, r10, r11, r12, this.A01, this.A02, 0);
        findViewById(R.id.download).setOnClickListener(r8);
        findViewById(R.id.update_whatsapp).setOnClickListener(r8);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass225(Activity activity, C24801Dv r9, C21360z5 r10, C33771fu r11, C33751fs r12, C21060yb r13, C19970wo r14, C18820ts r15, C20810yC r16, C21010yW r17) {
        super(activity, r13, r14, r15, R.layout.f9nameremoved);
        this.A00 = r10;
        this.A05 = r9;
        this.A03 = r16;
        this.A04 = r17;
        this.A01 = r11;
        this.A02 = r12;
    }
}
