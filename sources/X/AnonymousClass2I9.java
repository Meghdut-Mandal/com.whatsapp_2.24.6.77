package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2I9  reason: invalid class name */
public class AnonymousClass2I9 extends AnonymousClass8ZR {
    public C20690y0 A00;
    public int A01;
    public int A02;
    public long A03 = 0;
    public View A04 = findViewById(R.id.control_frame);
    public View A05 = findViewById(R.id.text_and_date);
    public ViewGroup A06 = C36411kG.A0P(this, R.id.video_containter);
    public ImageView A07 = C36391kE.A0N(this, R.id.gif_attribution);
    public TextView A08 = C36391kE.A0P(this, R.id.control_btn);
    public TextView A09 = C36391kE.A0P(this, R.id.info);
    public TextEmojiLabel A0A = C36401kF.A0P(this, R.id.caption);
    public WaFrameLayout A0B = ((WaFrameLayout) C012005e.A02(this, R.id.media_container));
    public C64853Pr A0C;
    public C50372ke A0D;
    public ConversationRowVideo$RowVideoView A0E = ((ConversationRowVideo$RowVideoView) findViewById(R.id.thumb));
    public AnonymousClass1RJ A0F = C36341k9.A0Y(this, R.id.cancel_download);
    public AnonymousClass1RJ A0G = C36341k9.A0Y(this, R.id.progress_bar);
    public C62683Hc A0H;
    public final C160527l9 A0I = new C53702rk(this, 2);
    public final C33541fX A0J = new C48912iG(this, 49);

    public void A1Y() {
        A0G(false);
        AnonymousClass2IR.A0d(this, false);
    }

    public boolean A2K() {
        return true;
    }

    private void A0B() {
        C20830yE r0;
        File file;
        if (this.A0G.A0E(2281) && C37541mm.A09(this) && (r0 = this.A02) != null && r0.A04() != C51512nw.DENIED && (file = AnonymousClass2bU.A00((AnonymousClass2bU) this.A0K).A0I) != null && C36381kD.A1V(Uri.fromFile(file))) {
            this.A04.setVisibility(4);
            this.A0R.A0H(C80233v4.A00(this, 11));
        }
    }

    private void A0C() {
        C50372ke r1 = this.A0D;
        r1.A0M(0);
        r1.A0D();
        WaFrameLayout waFrameLayout = this.A0B;
        ViewGroup.LayoutParams layoutParams = waFrameLayout.getLayoutParams();
        this.A06.setVisibility(8);
        layoutParams.width = -1;
        layoutParams.height = -1;
        waFrameLayout.setLayoutParams(layoutParams);
    }

    public static void A0D(AnonymousClass2I9 r3) {
        Log.w("viewmessage/ no file");
        AnonymousClass3T1 r1 = r3.A0K;
        if (r3.A2J()) {
            return;
        }
        if (r3.A0d.Bt6()) {
            C225314u r12 = (C225314u) C36361kB.A05(r3);
            if (r12 != null) {
                r3.A0L.A03(r12);
                return;
            }
            return;
        }
        Context context = r3.getContext();
        C64933Qa r0 = r1.A1J;
        C36371kC.A16(AnonymousClass190.A0X(context, r0.A00, r0.hashCode()), r3);
    }

    public static void A0E(AnonymousClass2I9 r4) {
        WaFrameLayout waFrameLayout = r4.A0B;
        int width = waFrameLayout.getWidth();
        int height = waFrameLayout.getHeight();
        ViewGroup.LayoutParams layoutParams = waFrameLayout.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = height;
        waFrameLayout.setLayoutParams(layoutParams);
        waFrameLayout.setClipChildren(true);
        r4.A06.setVisibility(0);
        r4.A0D.A0M(4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0G(boolean r22) {
        /*
            r21 = this;
            r15 = r21
            X.3T1 r0 = r15.A0K
            X.2bU r0 = (X.AnonymousClass2bU) r0
            X.2cZ r0 = (X.C47002cZ) r0
            X.3Qa r4 = r0.A1J
            r15.hashCode()
            X.3Qj r5 = X.AnonymousClass2bU.A00(r0)
            if (r22 == 0) goto L_0x001f
            android.widget.TextView r2 = r15.A08
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r2.setTag(r1)
            r15.A0C()
        L_0x001f:
            android.widget.TextView r2 = r15.A09
            r1 = 8
            r2.setVisibility(r1)
            android.widget.TextView r8 = r15.A08
            r13 = 0
            r8.setVisibility(r13)
            X.3T1 r7 = r15.A0K
            X.1E2 r6 = r15.A1W
            X.0yC r3 = r15.A0G
            boolean r14 = X.AnonymousClass3T2.A00(r3, r6, r7)
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r3 = r15.A0E
            r11 = 1
            r3.setIsGif(r11)
            X.2bU r6 = r15.getFMessage()
            boolean r6 = X.C66013Ui.A0z(r6)
            if (r6 == 0) goto L_0x012b
            r8.setVisibility(r1)
            r12 = r22 ^ 1
            android.view.View r7 = r15.A04
            X.1RJ r9 = r15.A0G
            X.1RJ r10 = r15.A0F
            X.AnonymousClass2IQ.A0Q(r7, r8, r9, r10, r11, r12, r13, r14)
            r3.setVisibility(r13)
            r2.setVisibility(r1)
            boolean r1 = r4.A02
            if (r1 == 0) goto L_0x0128
            X.1fX r2 = r15.A0B
        L_0x0060:
            r3.setOnClickListener(r2)
            android.view.ViewGroup r1 = r15.A06
            r1.setOnClickListener(r2)
            X.1fX r1 = r15.A08
            r8.setOnClickListener(r1)
            r9.A05(r1)
        L_0x0070:
            r2 = 1
        L_0x0071:
            r15.A1d()
            android.view.View$OnLongClickListener r6 = r15.A2W
            r3.setOnLongClickListener(r6)
            android.view.ViewGroup r1 = r15.A06
            r1.setOnLongClickListener(r6)
            com.whatsapp.WaFrameLayout r8 = r15.A0B
            boolean r10 = r4.A02
            android.content.Context r1 = r15.getContext()
            if (r10 == 0) goto L_0x0122
            android.graphics.drawable.Drawable r9 = X.AnonymousClass3SN.A02(r1)
        L_0x008c:
            android.content.Context r6 = r8.getContext()
            r4 = 2130968814(0x7f0400ee, float:1.7546292E38)
            r1 = 2131099933(0x7f06011d, float:1.7812233E38)
            if (r10 == 0) goto L_0x009e
            r4 = 2130968816(0x7f0400f0, float:1.7546296E38)
            r1 = 2131099935(0x7f06011f, float:1.7812237E38)
        L_0x009e:
            int r7 = X.C224514j.A00(r6, r4, r1)
            android.content.Context r6 = r8.getContext()
            r4 = 2130968815(0x7f0400ef, float:1.7546294E38)
            r1 = 2131099934(0x7f06011e, float:1.7812235E38)
            if (r10 == 0) goto L_0x00b4
            r4 = 2130968817(0x7f0400f1, float:1.7546298E38)
            r1 = 2131099936(0x7f060120, float:1.781224E38)
        L_0x00b4:
            int r1 = X.C224514j.A00(r6, r4, r1)
            r8.A03 = r7
            r8.A02 = r1
            r8.setForeground(r9)
            android.content.Context r1 = r15.getContext()
            int r4 = X.C65123Qv.A01(r1)
            int r1 = X.AnonymousClass1SV.A00(r0, r4)
            if (r1 > 0) goto L_0x00d1
            int r1 = r4 * 9
            int r1 = r1 / 16
        L_0x00d1:
            r15.A01 = r1
            r15.A02 = r4
            r3.A02(r4, r1, r2)
            X.1SV r4 = r15.A1y
            X.7l9 r1 = r15.A0I
            r4.A0C(r3, r0, r1)
            int r1 = r0.A0B
            if (r1 != 0) goto L_0x00eb
            java.io.File r1 = r5.A0I
            int r1 = X.AnonymousClass1GW.A04(r1)
            r0.A0B = r1
        L_0x00eb:
            X.3T1 r1 = r15.A0K
            X.2bU r1 = (X.AnonymousClass2bU) r1
            X.3Qj r1 = X.AnonymousClass2bU.A00(r1)
            int r4 = r1.A05
            android.widget.ImageView r3 = r15.A07
            if (r4 == r2) goto L_0x0118
            r2 = 2
            r1 = 2131231935(0x7f0804bf, float:1.8079965E38)
            if (r4 == r2) goto L_0x011b
            r1 = 8
            r3.setVisibility(r1)
        L_0x0104:
            android.view.View r2 = r15.A05
            com.whatsapp.TextEmojiLabel r1 = r15.A0A
            r15.A2G(r2, r1)
            r15.hashCode()
            r15.A2I(r0)
            r15.A20(r0)
            r15.A1z(r0)
            return
        L_0x0118:
            r1 = 2131231934(0x7f0804be, float:1.8079963E38)
        L_0x011b:
            r3.setImageResource(r1)
            r3.setVisibility(r13)
            goto L_0x0104
        L_0x0122:
            android.graphics.drawable.Drawable r9 = X.AnonymousClass3SN.A00(r1)
            goto L_0x008c
        L_0x0128:
            r2 = 0
            goto L_0x0060
        L_0x012b:
            boolean r6 = X.C37541mm.A09(r15)
            if (r6 == 0) goto L_0x0203
            android.view.View r7 = r15.A04
            X.1RJ r9 = r15.A0G
            X.1RJ r10 = r15.A0F
            r11 = 0
            r12 = 0
            X.AnonymousClass2IQ.A0Q(r7, r8, r9, r10, r11, r12, r13, r14)
            android.view.View r7 = X.C36391kE.A0L(r10, r13)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6 = 2131232335(0x7f08064f, float:1.8080776E38)
            r7.setImageResource(r6)
            if (r14 == 0) goto L_0x01a5
            r2.setVisibility(r13)
            X.0ts r6 = r15.A0E
            boolean r6 = X.C36351kA.A1Y(r6)
            if (r6 == 0) goto L_0x0195
            r6 = 2131232362(0x7f08066a, float:1.8080831E38)
            r2.setCompoundDrawablesWithIntrinsicBounds(r6, r13, r13, r13)
        L_0x015b:
            r8.setVisibility(r1)
            android.view.ViewGroup r6 = r15.A06
            X.1fX r1 = r15.A0B
            r6.setOnClickListener(r1)
            android.content.Context r2 = r6.getContext()
            r1 = 2131895684(0x7f122584, float:1.9426208E38)
            X.C36331k8.A0q(r2, r6, r1)
            r2 = 16
            X.3YF r1 = new X.3YF
            r1.<init>(r15, r0, r2)
            r8.setOnClickListener(r1)
            r3.setOnClickListener(r1)
            android.content.Context r2 = r3.getContext()
            r1 = 2131893092(0x7f121b64, float:1.942095E38)
            X.C36331k8.A0q(r2, r3, r1)
            X.0yC r2 = r15.A0G
            r1 = 2281(0x8e9, float:3.196E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x01a9
            r15.A0B()
            goto L_0x0070
        L_0x0195:
            android.content.Context r7 = r15.getContext()
            r6 = 2131232362(0x7f08066a, float:1.8080831E38)
            android.graphics.drawable.Drawable r7 = X.AnonymousClass00E.A00(r7, r6)
            r6 = 0
            r2.setCompoundDrawablesWithIntrinsicBounds(r6, r6, r7, r6)
            goto L_0x015b
        L_0x01a5:
            r2.setVisibility(r1)
            goto L_0x015b
        L_0x01a9:
            X.3Pr r6 = r15.A0C
            if (r6 == 0) goto L_0x0070
            monitor-enter(r6)
            java.util.Map r1 = r6.A00     // Catch:{ all -> 0x0267 }
            r9 = 0
            if (r1 == 0) goto L_0x01d4
            java.lang.Object r7 = r1.get(r4)     // Catch:{ all -> 0x0267 }
            X.00I r7 = (X.AnonymousClass00I) r7     // Catch:{ all -> 0x0267 }
            if (r7 == 0) goto L_0x01d4
            X.0yC r8 = r6.A01     // Catch:{ all -> 0x0267 }
            java.lang.Object r1 = r7.A00     // Catch:{ all -> 0x0267 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0267 }
            long r1 = r1.longValue()     // Catch:{ all -> 0x0267 }
            java.lang.Object r7 = r7.A01     // Catch:{ all -> 0x0267 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0267 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0267 }
            boolean r1 = X.C64853Pr.A00(r8, r7, r1)     // Catch:{ all -> 0x0267 }
            if (r1 == 0) goto L_0x01d4
            r9 = 1
        L_0x01d4:
            monitor-exit(r6)
            if (r9 == 0) goto L_0x0070
            X.3T1 r1 = r15.A0K
            X.2bU r1 = (X.AnonymousClass2bU) r1
            X.3Qj r1 = X.AnonymousClass2bU.A00(r1)
            java.io.File r1 = r1.A0I
            if (r1 == 0) goto L_0x01fe
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            boolean r1 = X.C36381kD.A1V(r1)
            if (r1 == 0) goto L_0x01fe
            A0E(r15)
            int r2 = r6.A01(r0)
            X.2ke r1 = r15.A0D
            r1.A0e(r0, r2)
            r1.A0C()
            goto L_0x0070
        L_0x01fe:
            A0D(r15)
            goto L_0x0070
        L_0x0203:
            X.1RJ r10 = r15.A0F
            r10.A03(r1)
            r2.setVisibility(r1)
            X.2bU r1 = r15.getFMessage()
            boolean r1 = X.C54732tQ.A00(r1)
            if (r1 != 0) goto L_0x0242
            r1 = 2131893722(0x7f121dda, float:1.9422229E38)
            r2 = 2131893722(0x7f121dda, float:1.9422229E38)
            r8.setText(r1)
            android.content.Context r1 = r15.getContext()
            X.C36331k8.A0q(r1, r8, r2)
            r1 = 2131232898(0x7f080882, float:1.8081918E38)
            r8.setCompoundDrawablesWithIntrinsicBounds(r1, r13, r13, r13)
            X.1fX r1 = r15.A0A
            r8.setOnClickListener(r1)
            X.1fX r1 = r15.A0B
        L_0x0232:
            r3.setOnClickListener(r1)
            r12 = r22 ^ 1
            android.view.View r7 = r15.A04
            X.1RJ r9 = r15.A0G
            r2 = 1
            r11 = 0
            X.AnonymousClass2IQ.A0Q(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0071
        L_0x0242:
            java.util.List r18 = java.util.Collections.singletonList(r0)
            long r1 = r0.A00
            r17 = 0
            r16 = r8
            r19 = r1
            r15.A1r(r16, r17, r18, r19)
            android.content.Context r2 = r8.getContext()
            r1 = 2131887288(0x7f1204b8, float:1.9409179E38)
            X.C36331k8.A0q(r2, r8, r1)
            r1 = 2131232890(0x7f08087a, float:1.8081902E38)
            r8.setCompoundDrawablesWithIntrinsicBounds(r1, r13, r13, r13)
            X.1fX r1 = r15.A0J
            r8.setOnClickListener(r1)
            goto L_0x0232
        L_0x0267:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2I9.A0G(boolean):void");
    }

    public boolean A1F() {
        if (!C66013Ui.A0W(this.A0V, this.A0G, this.A0K, this.A1o) || !this.A0d.BtS()) {
            return false;
        }
        return true;
    }

    public boolean A1K() {
        if (!C66013Ui.A0W(this.A0V, this.A0G, this.A0K, this.A1o) || !this.A0d.BtQ()) {
            return false;
        }
        return true;
    }

    public int A1R(int i) {
        if (!AnonymousClass2bU.A02((AnonymousClass2bU) this.A0K)) {
            return super.A1R(i);
        }
        return 0;
    }

    public void A1d() {
        AnonymousClass1RJ r2 = this.A0G;
        AnonymousClass1Y4 r0 = this.A04;
        C18740tg.A06(r0);
        A2E(r2, AnonymousClass3SU.A01(r0, (AnonymousClass2bU) this.A0K, r2));
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, this.A0K);
        super.A22(r2, z);
        if (z || A1W) {
            A0G(A1W);
        }
    }

    public boolean A26() {
        return AnonymousClass2bU.A02((AnonymousClass2bU) this.A0K);
    }

    public int getBroadcastDrawableId() {
        if (AnonymousClass2bU.A02((AnonymousClass2bU) this.A0K)) {
            return R.drawable.broadcast_status_icon_onmedia;
        }
        return R.drawable.broadcast_status_icon;
    }

    public C181788o2 getFMessage() {
        return (C181788o2) ((AnonymousClass2bU) this.A0K);
    }

    public int getReactionsViewVerticalOverlap() {
        if (AnonymousClass2bU.A02((AnonymousClass2bU) this.A0K)) {
            return getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        }
        return super.getReactionsViewVerticalOverlap();
    }

    public void onDetachedFromWindow() {
        C64933Qa r1 = this.A0K.A1J;
        hashCode();
        super.onDetachedFromWindow();
        A0C();
        C64853Pr r0 = this.A0C;
        if (r0 != null) {
            r0.A03(r1);
        }
    }

    public void onStartTemporaryDetach() {
        C64853Pr r9;
        long j;
        AnonymousClass00I r1;
        AnonymousClass2bU r3 = (AnonymousClass2bU) this.A0K;
        C64933Qa r10 = r3.A1J;
        hashCode();
        super.onStartTemporaryDetach();
        if (this.A0D.A06() != 1) {
            long j2 = this.A03;
            if (j2 > 0 && (r9 = this.A0C) != null) {
                long A0A2 = C36441kJ.A0A(j2);
                synchronized (r9) {
                    C20810yC r8 = r9.A01;
                    if (r3.A0B <= 1) {
                        j = 600;
                    } else {
                        j = C36371kC.A07(r3.A0B);
                    }
                    int i = (int) (A0A2 / j);
                    Map map = r9.A00;
                    if (!(map == null || (r1 = (AnonymousClass00I) map.get(r10)) == null)) {
                        long longValue = ((Long) r1.A00).longValue() + A0A2;
                        int intValue = ((Integer) r1.A01).intValue();
                        if (i > 0) {
                            intValue += i;
                        }
                        r9.A00.put(r10, C36441kJ.A0W(Long.valueOf(longValue), Integer.valueOf(intValue)));
                        C64853Pr.A00(r8, intValue, longValue);
                    }
                }
                this.A03 = 0;
            }
        }
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof C181788o2);
        super.setFMessage(r2);
    }

    public AnonymousClass2I9(Context context, C89004Uw r8, C181788o2 r9) {
        super(context, r8, r9);
        C64853Pr r0;
        this.A08.setTextSize(0, C36441kJ.A00(getResources(), R.dimen.f7nameremoved));
        AnonymousClass17Y r4 = this.A0R;
        C62683Hc r3 = this.A0H;
        this.A0D = new C50372ke(this.A0E, this.A06, r4, r3);
        this.A0D.A0R(new AnonymousClass4XB(this, new AtomicBoolean(false), 0));
        C89004Uw r1 = this.A0c;
        if (r1 != null) {
            r0 = (C64853Pr) r1.BAB(C64853Pr.class);
        } else {
            r0 = null;
        }
        this.A0C = r0;
        TextEmojiLabel textEmojiLabel = this.A0A;
        if (textEmojiLabel != null) {
            C36331k8.A1A(this.A0G, textEmojiLabel);
        }
        this.A0G.A07(C79413tg.A00);
        A0G(true);
    }

    public static void A0F(AnonymousClass2I9 r2, C181788o2 r3) {
        C64853Pr r1;
        if (!C37541mm.A09(r2)) {
            return;
        }
        if ((r2.A02 == null || C37541mm.A0A(r2)) && (r1 = r2.A0C) != null) {
            r1.A02(r3.A1J);
            A0E(r2);
            int A012 = r1.A01(r3);
            C50372ke r0 = r2.A0D;
            r0.A0e(r3, A012);
            r0.A0C();
        }
    }

    public boolean A1E() {
        return C37541mm.A08(this);
    }

    public void A1f() {
        boolean A1V;
        AnonymousClass17Y r1;
        int i;
        String str;
        super.A1f();
        if (this.A02 == null || C37541mm.A0A(this)) {
            AnonymousClass2bU r4 = (AnonymousClass2bU) this.A0K;
            C65013Qj A002 = AnonymousClass2bU.A00(r4);
            C64933Qa r5 = r4.A1J;
            boolean z = r5.A02;
            if (z || A002.A0V) {
                if (z && !A002.A0V && !A002.A0U && (str = A002.A0K) != null && AnonymousClass1GW.A0H(this.A00, str).exists()) {
                    r1 = this.A0R;
                    i = R.string.f12nameremoved;
                } else if (A002.A09 == 1) {
                    r1 = this.A0R;
                    i = R.string.f12nameremoved;
                } else {
                    File file = A002.A0I;
                    if (file == null) {
                        A1V = false;
                    } else {
                        A1V = C36381kD.A1V(Uri.fromFile(file));
                    }
                    C37541mm.A03(A002, r4, z);
                    if (!A1V) {
                        A0D(this);
                        return;
                    }
                    View findViewById = findViewById(R.id.media_container);
                    boolean Bt6 = this.A0d.Bt6();
                    AnonymousClass3FI r12 = new AnonymousClass3FI(getContext());
                    r12.A0A = Bt6;
                    AnonymousClass11F r0 = r5.A00;
                    C18740tg.A06(r0);
                    r12.A05 = r0;
                    r12.A06 = r5;
                    Intent A003 = r12.A00();
                    if (findViewById != null) {
                        AnonymousClass3U9.A08(getContext(), A003, findViewById);
                        AnonymousClass3CG.A01(getContext(), getContext(), A003, findViewById, r4);
                        return;
                    }
                    return;
                }
                r1.A04(i, 1);
            }
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getMainChildMaxWidth() {
        if (C37541mm.A07(this)) {
            return 0;
        }
        int A022 = AnonymousClass3R4.A02(this);
        int i = this.A01;
        int i2 = this.A02;
        if (i > i2) {
            return Math.max((int) ((((float) A022) / ((float) i)) * ((float) i2)), AnonymousClass3R4.A01(getContext(), 36));
        }
        return A022;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onAttachedToWindow() {
        hashCode();
        super.onAttachedToWindow();
        A0B();
    }

    public void onFinishTemporaryDetach() {
        hashCode();
        super.onFinishTemporaryDetach();
    }

    public void onWindowFocusChanged(boolean z) {
        hashCode();
        super.onWindowFocusChanged(z);
        if (!this.A0G.A0E(2281)) {
            return;
        }
        if (z) {
            A0B();
        } else if (this.A0D.A06() != 1 && this.A03 > 0 && this.A0C != null) {
            A0C();
            this.A03 = 0;
        }
    }
}
