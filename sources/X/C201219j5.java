package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.util.Log;

/* renamed from: X.9j5  reason: invalid class name and case insensitive filesystem */
public class C201219j5 {
    public final AnonymousClass1EU A00;
    public final C105775Gc A01;
    public final AnonymousClass17Y A02;
    public final C19730wQ A03;
    public final C19970wo A04;
    public final C19630wG A05;
    public final C29221Vu A06;
    public final C29121Vk A07;

    public static void A00(Drawable drawable, ImageView imageView, C207249un r8, C201219j5 r9, boolean z) {
        C175858bB r1 = (C175858bB) r8.A08;
        ImageView imageView2 = imageView;
        if (r1 == null || TextUtils.isEmpty(r1.A0E)) {
            Log.w(C36371kC.A0z("PAY: Failed to display card art, card art url missing, re-fetch: ", AnonymousClass000.A0u(), z));
            if (z) {
                A01(imageView, r8, r9);
                return;
            }
            return;
        }
        C105775Gc r0 = r9.A01;
        String str = r1.A0E;
        r0.A00().A00(drawable, drawable, imageView2, new AT5(imageView, r8, r9, z), str);
    }

    public static void A01(ImageView imageView, C207249un r17, C201219j5 r18) {
        C207249un r3 = r17;
        AnonymousClass8b7 r2 = (AnonymousClass8b7) r3.A08;
        if (r2 == null || TextUtils.isEmpty(r2.A0C)) {
            C36321k7.A1L(r2, "PAY: fetchCardArtImageContentDetails card method data invalid: ", AnonymousClass000.A0u());
            return;
        }
        C201219j5 r1 = r18;
        C19970wo r11 = r1.A04;
        Context context = r1.A05.A00;
        AnonymousClass17Y r9 = r1.A02;
        C19730wQ r10 = r1.A03;
        C29121Vk r13 = r1.A07;
        AnonymousClass9O6 r7 = new AnonymousClass9O6(context, r9, r10, r11, r1.A06, r13, new C194959Rx(imageView, r3, r2, r1), r3.A0A, r2.A0C);
        String str = r7.A07;
        if (!TextUtils.isEmpty(str)) {
            String str2 = r7.A08;
            if (!TextUtils.isEmpty(str2)) {
                String A002 = C237919w.A00(r7.A02, r7.A03);
                C29121Vk r92 = r7.A05;
                AnonymousClass1AL[] r32 = new AnonymousClass1AL[4];
                C36341k9.A1L("action", "get-image-content", r32, 0);
                C36341k9.A1L("credential-id", str, r32, 1);
                C36341k9.A1L("image-content-id", str2, r32, 2);
                C36341k9.A1L("nonce", A002, r32, 3);
                r92.A0H(new B7H(r7.A00, r7.A04, r7.A01, r7, 3), C203399nx.A04("account", r32), "get", AnonymousClass6X5.A0L);
                return;
            }
        }
        r7.A06.A00(C202059ky.A00(), str);
    }

    public C201219j5(AnonymousClass17Y r1, C19730wQ r2, C19970wo r3, C19630wG r4, C29221Vu r5, C29121Vk r6, AnonymousClass1EU r7, C105775Gc r8) {
        this.A05 = r4;
        this.A04 = r3;
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = r7;
        this.A01 = r8;
        this.A07 = r6;
        this.A06 = r5;
    }

    public void A02(C207249un r4, PaymentMethodRow paymentMethodRow) {
        C203449o2.A07(r4, paymentMethodRow);
        A00(C36421kH.A0B(this.A05).getDrawable(C203449o2.A00(((C175798b4) r4).A01)), paymentMethodRow.A00, r4, this, false);
    }
}
