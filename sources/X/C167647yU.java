package X;

import android.os.Build;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7yU  reason: invalid class name and case insensitive filesystem */
public class C167647yU extends AnonymousClass04R {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final C001700s A03;
    public final C001700s A04;
    public final C001700s A05 = C36431kI.A0S();
    public final C001700s A06;
    public final C001700s A07;
    public final C001700s A08;
    public final C001700s A09;
    public final C001700s A0A;
    public final C001700s A0B;
    public final C195419Uf A0C;
    public final C63553Km A0D;
    public final AnonymousClass9UA A0E;
    public final C64183Mz A0F;
    public final C21104A8p A0G;
    public final C19600wD A0H;
    public final AnonymousClass171 A0I;
    public final UserJid A0J;
    public final C61223Ba A0K;
    public final C19770wU A0L;
    public final AtomicBoolean A0M = C36431kI.A1H();
    public final AnonymousClass9ZJ A0N;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r0 = r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0T(X.C207269up r3, int r4) {
        /*
            r2 = this;
            r1 = 0
            if (r3 == 0) goto L_0x001c
            boolean r0 = r3.A0H
            if (r0 == 0) goto L_0x001c
            if (r4 != 0) goto L_0x001c
            boolean r0 = r3.A02()
            if (r0 != 0) goto L_0x001c
            X.9tw r0 = r3.A01
            if (r0 == 0) goto L_0x001c
            int r0 = r0.A00
            if (r0 != 0) goto L_0x001c
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x001c
            r1 = 1
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167647yU.A0T(X.9up, int):boolean");
    }

    public C167647yU(C195419Uf r6, C63553Km r7, AnonymousClass9ZJ r8, AnonymousClass9UA r9, C64183Mz r10, C21104A8p a8p, C19600wD r12, AnonymousClass171 r13, UserJid userJid, C61223Ba r15, C19770wU r16, int i) {
        C001700s A0S = C36431kI.A0S();
        this.A07 = A0S;
        C001700s A0S2 = C36431kI.A0S();
        this.A0A = A0S2;
        this.A06 = C36431kI.A0S();
        C001700s A0S3 = C36431kI.A0S();
        this.A09 = A0S3;
        C001700s A0S4 = C36431kI.A0S();
        this.A04 = A0S4;
        this.A08 = C36431kI.A0S();
        this.A03 = C36431kI.A0S();
        this.A0B = C36431kI.A0S();
        this.A0J = userJid;
        this.A0I = r13;
        this.A0C = r6;
        this.A0G = a8p;
        this.A0H = r12;
        this.A02 = i;
        this.A0K = r15;
        this.A0D = r7;
        this.A0F = r10;
        this.A0N = r8;
        this.A0E = r9;
        this.A0L = r16;
        r6.A00 = A0S;
        r6.A02 = A0S2;
        a8p.A00 = A0S4;
        r6.A01 = A0S3;
    }

    public void A0S(ProductDetailActivity productDetailActivity) {
        if (productDetailActivity.getIntent().getBooleanExtra("is_from_product_detail_screen", false)) {
            if (Build.VERSION.SDK_INT < 29) {
                productDetailActivity.onStateNotSaved();
            }
            C36341k9.A18(this.A06, true);
            return;
        }
        productDetailActivity.onBackPressed();
    }
}
