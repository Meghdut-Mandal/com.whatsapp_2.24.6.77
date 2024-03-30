package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class AEE implements B1G {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C202319lY A01;
    public final /* synthetic */ C202629mK A02;
    public final /* synthetic */ C22956Az8 A03;
    public final /* synthetic */ AnonymousClass3T1 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public AEE(Context context, C202319lY r2, C202629mK r3, C22956Az8 az8, AnonymousClass3T1 r5, String str, boolean z) {
        this.A02 = r3;
        this.A00 = context;
        this.A05 = str;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = az8;
        this.A06 = z;
    }

    public void BXH() {
        this.A02.A03(this.A00, this.A01);
    }

    public void onSuccess() {
        AnonymousClass16U A012;
        String A032;
        UserJid A0b;
        B66 A013;
        C202629mK r3 = this.A02;
        Context context = this.A00;
        String str = this.A05;
        C202319lY r7 = this.A01;
        AnonymousClass3T1 r2 = this.A04;
        C22956Az8 az8 = this.A03;
        if (this.A06) {
            if (r2 == null) {
                A0b = null;
            } else {
                A0b = C36401kF.A0b(r2.A0J());
            }
            AVb aVb = new AVb(r3, az8, 8);
            if (r7.A0C != null) {
                AnonymousClass17Y r1 = r3.A00;
                if (r1.A0M()) {
                    r1.A05(0, R.string.f12nameremoved);
                    C36391kE.A1Q(new C183708rE(r3.A01, r3.A02, r3.A03, r7, A0b, r3.A05, r3.A06, r3.A07, aVb, 15), r3.A08);
                    return;
                }
                return;
            }
            C198699e3 A033 = r3.A06.A03(r7.A0G);
            if (A033 != null && (A013 = A033.A01(r7.A0I)) != null) {
                r3.A00.A05(0, R.string.f12nameremoved);
                B1E BFN = A013.BFN();
                C18740tg.A06(BFN);
                BFN.BnM(C24801Dv.A00(context), r7, new C147176wn(r7, r3, aVb));
                return;
            }
            return;
        }
        A8P a8p = r3.A04;
        Intent BCo = a8p.A08.A05().BCo(context);
        if (BCo == null) {
            Log.e("No Intent to start send payment to Collect Request");
            return;
        }
        BCo.putExtra("extra_referral_screen", str);
        if (r7.A0C != null) {
            BCo.putExtra("extra_request_message_key", r7.A0L);
            BCo.putExtra("extra_conversation_message_type", 3);
            String str2 = r7.A0K;
            if (str2 != null) {
                BCo.putExtra("extra_request_id", str2);
            }
            AnonymousClass11F r22 = r7.A0C;
            String str3 = "extra_jid";
            if (AnonymousClass143.A0G(r22)) {
                BCo.putExtra(str3, r22.getRawString());
                A032 = AnonymousClass143.A03(r7.A0D);
                str3 = "extra_receiver_jid";
            } else {
                A032 = AnonymousClass143.A03(r7.A0D);
            }
            BCo.putExtra(str3, A032);
        }
        if (!TextUtils.isEmpty(r7.A0K)) {
            BCo.putExtra("extra_transaction_id", r7.A0K);
        }
        BCo.putExtra("extra_transaction_type", r7.A03);
        C175708av r0 = r7.A0A;
        if (r0 != null) {
            BCo.putExtra("extra_payment_handle", C165617ti.A0P(C146356vT.A00(), String.class, r0.A0F(), "paymentHandle"));
            BCo.putExtra("extra_incoming_pay_request_id", r7.A0A.A0E());
        }
        AnonymousClass16X r02 = r7.A08;
        if (!(r02 == null || TextUtils.isEmpty(r02.toString()) || (A012 = a8p.A07.A01()) == null)) {
            BCo.putExtra("extra_payment_preset_amount", A012.B7c(a8p.A04, r7.A08));
        }
        ((C225314u) C24801Dv.A00(context)).A33(BCo, false);
    }
}
