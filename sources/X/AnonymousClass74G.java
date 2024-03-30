package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.74G  reason: invalid class name */
public final /* synthetic */ class AnonymousClass74G implements Runnable {
    public final /* synthetic */ C207249un A00;
    public final /* synthetic */ C128786Dp A01;
    public final /* synthetic */ AnonymousClass5GE A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public /* synthetic */ AnonymousClass74G(C207249un r1, C128786Dp r2, AnonymousClass5GE r3, Boolean bool, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A07 = str;
        this.A01 = r2;
        this.A08 = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A06 = l;
        this.A05 = num;
        this.A03 = bool;
        this.A04 = num2;
    }

    public final void run() {
        AnonymousClass5GE r11 = this.A02;
        C207249un r13 = this.A00;
        String str = this.A07;
        C128786Dp r1 = this.A01;
        String str2 = this.A08;
        String str3 = this.A09;
        String str4 = this.A0A;
        Long l = this.A06;
        Integer num = this.A05;
        Boolean bool = this.A03;
        Integer num2 = this.A04;
        Context context = r11.A03.A00;
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(context.getPackageName(), "com.whatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity");
        A0D.putExtra("extra_bank_account", r13);
        A0D.putExtra("extra_india_upi_pin_op", str);
        A0D.putExtra("extra_fds_manager_id", r1.A04);
        String str5 = r11.A01;
        if (str5 == null) {
            throw C36331k8.A0d("observerId");
        }
        A0D.putExtra("extra_fcs_observer_id", str5);
        A0D.putExtra("extra_seq_number", str2);
        A0D.putExtra("extra_payee_name", str3);
        A0D.putExtra("extra_receiver_vpa", str4);
        A0D.putExtra("extra_payment_preset_amount", l);
        A0D.putExtra("extra_payment_offset", num);
        A0D.putExtra("is_asynchronous", bool);
        A0D.putExtra(C108355Te.ERROR_CODE.key, num2);
        C90494aF.A0r(context, A0D);
    }
}
