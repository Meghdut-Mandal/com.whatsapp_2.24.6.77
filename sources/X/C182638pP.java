package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.8pP  reason: invalid class name and case insensitive filesystem */
public class C182638pP extends C182688pU {
    public C24801Dv A00;
    public C19700wN A01;
    public AnonymousClass17Y A02;
    public C20830yE A03;
    public AnonymousClass1TA A04;
    public C47102dR A05;
    public AnonymousClass1X7 A06;
    public AnonymousClass13J A07;
    public C19770wU A08;
    public boolean A09;

    public /* bridge */ /* synthetic */ CharSequence A06(AnonymousClass141 r5, AnonymousClass3T1 r6) {
        C46972by r62 = (C46972by) r6;
        if (TextUtils.isEmpty(r62.A01)) {
            return "";
        }
        return AnonymousClass3TZ.A04(C166417vl.A01(r5, r62, this), C165597tg.A0a(C165587tf.A0D(getContext(), R.drawable.msg_status_doc), this.A01, r62.A01));
    }

    public C182638pP(Context context, C33301f4 r2) {
        super(context, r2);
        A04();
    }

    public void A0A(C46972by r4, List list) {
        super.A09(r4, list);
        this.A05.setMessage(r4, list);
        this.A05.setOnClickListener(new C48902iF(this, r4, 25));
    }
}
