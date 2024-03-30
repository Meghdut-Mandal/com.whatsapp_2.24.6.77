package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* renamed from: X.1Yo  reason: invalid class name and case insensitive filesystem */
public class C29931Yo {
    public final C18820ts A00;
    public final C20810yC A01;
    public final C29951Yq A02;
    public final C20690y0 A03;
    public final AnonymousClass17Y A04;
    public final C19420v0 A05;
    public final C24891Ee A06;
    public final C29991Yu A07;
    public final C29981Yt A08;
    public final C29971Ys A09;
    public final C30001Yv A0A;
    public final C29941Yp A0B;
    public final C30011Yw A0C;
    public final C19770wU A0D;

    public void A02(ImageView imageView, TextView textView, C135106c9 r9) {
        AnonymousClass088.A07(textView, 4, 20, 2, 2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = textView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        textView.setLayoutParams(layoutParams);
        C135106c9 r2 = r9;
        textView.setTextColor(r9.A0C);
        textView.requestLayout();
        ImageView imageView2 = imageView;
        imageView.setBackgroundColor(r9.A0A);
        if (!TextUtils.isEmpty(r9.A01)) {
            imageView.setContentDescription(r9.A01);
        }
        A03(imageView2, r2, imageView.getLayoutParams().width, imageView.getLayoutParams().height, false);
    }

    public void A03(ImageView imageView, C135106c9 r11, int i, int i2, boolean z) {
        C135106c9 r5 = r11;
        ImageView imageView2 = imageView;
        int i3 = i;
        int i4 = i2;
        if (r11.A02(this.A03.A0F()).exists()) {
            this.A09.A00(imageView, r11, i, i2);
        } else if (z) {
            if (C20800yB.A01(C21000yV.A02, this.A01, 1084)) {
                this.A02.A03(r11, this.A0B);
                return;
            }
            this.A0D.Box(new C162947pP(this, new C147256wv(imageView2, r5, this, i3, i4), 1), new Void[0]);
        } else {
            C19420v0.A00(this.A05).putBoolean("payment_background_batch_require_fetch", true).apply();
        }
    }

    public static void A00(C135106c9 r25, AnonymousClass7hG r26, C29931Yo r27) {
        C133136Wx r1;
        StringBuilder sb;
        C29931Yo r13 = r27;
        C20690y0 r12 = r13.A03;
        C135106c9 r7 = r25;
        boolean exists = r7.A02(r12.A0F()).exists();
        String str = r7.A0G;
        File file = null;
        if (!"image/webp".equals(str)) {
            sb = new StringBuilder();
            sb.append("PAY: PaymentBackgroundRepository/downloadPaymentBackground/unsupported mimetype=");
            sb.append(str);
        } else {
            File A022 = r7.A02(r12.A0F());
            if (!A022.exists()) {
                if (TextUtils.isEmpty(r7.A05)) {
                    sb = new StringBuilder();
                    sb.append("PAY: PaymentBackgroundRepository/downloadPaymentBackground/missing url for background id=");
                    sb.append(r7.A0F);
                } else {
                    C29991Yu r0 = r13.A07;
                    C19970wo r5 = r0.A03;
                    C20810yC r8 = r0.A05;
                    C104915By r2 = new C104915By(r0.A00, r0.A02, r5, r0.A04, r7, r8, r0.A06, r0.A07, r0.A08, A022);
                    AnonymousClass1ST r14 = r2.A01;
                    C160107kT A012 = r2.A01();
                    String str2 = r2.A00.A05;
                    C18740tg.A06(str2);
                    if (r14.A0F(A012, r2, (AnonymousClass68C) null, (AnonymousClass2bU) null, str2, false)) {
                        try {
                            r1 = (C133136Wx) r2.A02.get();
                        } catch (InterruptedException | ExecutionException e) {
                            Log.e("DuplicatePaymentBackgroundDownloadListener/waitForResult ", e);
                            r1 = new C133136Wx(1);
                        }
                    } else {
                        r2.B0M(r2);
                        r1 = r2.A02().A00;
                    }
                    if (!r1.A03()) {
                        A022 = null;
                    }
                }
            }
            file = A022;
            r13.A04.A0H(new C35411ie(r13, r26, r7, file, 3, exists));
        }
        Log.e(sb.toString());
        r13.A04.A0H(new C35411ie(r13, r26, r7, file, 3, exists));
    }

    public static void A01(C17790s2 r4, C29931Yo r5) {
        C24891Ee r2 = r5.A06;
        Log.i("PAY: PaymentBackgroundStore/getPaymentBackgroundsForPicker");
        ArrayList A012 = C24891Ee.A01(r2, "SELECT payment_background.background_id, file_size, width, height, mime_type, placeholder_color, text_color, subtext_color, media_key, media_key_timestamp, file_sha256, file_enc_sha256, direct_path, fullsize_url, description, lg FROM payment_background INNER JOIN payment_background_order ON payment_background_order.background_id=payment_background.background_id ORDER BY payment_background_order.background_order ASC", "payments/QUERY_PAYMENT_BACKGROUNDS_FOR_PICKER");
        StringBuilder sb = new StringBuilder();
        sb.append("PAY: PaymentBackgroundStore/getPaymentBackgroundsForPicker/result size=");
        sb.append(A012.size());
        Log.i(sb.toString());
        r5.A04.A0H(new C35631j0(r5, A012, r4, 49));
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            A00((C135106c9) it.next(), r4, r5);
        }
    }

    public void A04(C135106c9 r5) {
        if (!r5.A02(this.A03.A0F()).exists()) {
            if (C20800yB.A01(C21000yV.A02, this.A01, 1084)) {
                this.A02.A03(r5, this.A0B);
            } else {
                this.A0D.Box(new C162947pP(this, (Object) null, 1), new Void[0]);
            }
        }
    }

    public void A05(C135106c9 r7) {
        if (!C20800yB.A01(C21000yV.A02, this.A01, 1084) || r7.A02(this.A03.A0F()).exists()) {
            C19420v0 r5 = this.A05;
            if (r5.A0V("payment_backgrounds_batch_last_fetch_timestamp") == -1) {
                this.A0D.Box(new C162947pP(this, (Object) null, 1), new Void[0]);
            } else if (!r7.A02(this.A03.A0F()).exists()) {
                C19420v0.A00(r5).putBoolean("payment_background_batch_require_fetch", true).apply();
            }
        } else {
            this.A02.A03(r7, this.A0B);
        }
    }

    public C29931Yo(C20690y0 r1, AnonymousClass17Y r2, C19420v0 r3, C18820ts r4, C24891Ee r5, C20810yC r6, C29991Yu r7, C29981Yt r8, C29971Ys r9, C30001Yv r10, C29941Yp r11, C30011Yw r12, C29951Yq r13, C19770wU r14) {
        this.A01 = r6;
        this.A04 = r2;
        this.A0D = r14;
        this.A03 = r1;
        this.A00 = r4;
        this.A05 = r3;
        this.A06 = r5;
        this.A0B = r11;
        this.A02 = r13;
        this.A09 = r9;
        this.A08 = r8;
        this.A07 = r7;
        this.A0A = r10;
        this.A0C = r12;
    }
}
