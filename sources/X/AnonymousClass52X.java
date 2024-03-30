package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ScaleGestureDetector;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.WaDynamicRoundCornerImageView;
import com.whatsapp.WaImageView;
import com.whatsapp.WaRoundCornerImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.52X  reason: invalid class name */
public class AnonymousClass52X extends C97034oI implements AnonymousClass7gI {
    public Drawable A00;
    public ScaleGestureDetector A01;
    public WaRoundCornerImageView A02;
    public AnonymousClass60n A03;
    public AnonymousClass6L2 A04;
    public AnonymousClass7gI A05;
    public C1493370u A06;
    public Runnable A07;
    public boolean A08 = false;
    public C91214be A09;
    public String A0A;
    public final Rect A0B = AnonymousClass001.A06();
    public final View A0C;
    public final View A0D;
    public final View A0E;
    public final ViewGroup A0F;
    public final ViewTreeObserver.OnGlobalLayoutListener A0G;
    public final ConstraintLayout A0H;
    public final ConstraintLayout A0I;
    public final WaDynamicRoundCornerImageView A0J;
    public final WaImageView A0K;
    public final WaTextView A0L;
    public final AnonymousClass711 A0M;
    public final ThumbnailButton A0N;
    public final AnonymousClass1RJ A0O;
    public final AnonymousClass1RJ A0P;
    public final int A0Q;
    public final WaDynamicRoundCornerImageView A0R;
    public final AnonymousClass6ET A0S;
    public final AnonymousClass1RJ A0T;
    public final AnonymousClass7dH A0U;
    public final boolean A0V;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass52X(android.view.View r15, X.AnonymousClass16L r16, X.C116925lQ r17, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r18, X.AnonymousClass711 r19, X.AnonymousClass1Pp r20, X.AnonymousClass171 r21, X.C20810yC r22, boolean r23, boolean r24) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r20
            r13 = r21
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r4 = 0
            r14.A08 = r4
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            r14.A0B = r0
            r0 = 0
            X.70t r1 = new X.70t
            r1.<init>(r14)
            r14.A0U = r1
            r1 = 2131431842(0x7f0b11a2, float:1.8485425E38)
            android.view.View r1 = X.C012005e.A02(r15, r1)
            r14.A0D = r1
            r1 = 2131431295(0x7f0b0f7f, float:1.8484315E38)
            X.1RJ r1 = X.C36341k9.A0X(r15, r1)
            r14.A0T = r1
            r1 = 2131429358(0x7f0b07ee, float:1.8480386E38)
            android.view.View r1 = X.C012005e.A02(r15, r1)
            r14.A0C = r1
            r1 = 2131430416(0x7f0b0c10, float:1.8482532E38)
            com.whatsapp.WaImageView r1 = X.C36431kI.A0X(r15, r1)
            r14.A0K = r1
            r1 = 2131435117(0x7f0b1e6d, float:1.8492067E38)
            android.view.View r1 = X.C012005e.A02(r15, r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r14.A0I = r1
            r1 = 2131435132(0x7f0b1e7c, float:1.8492098E38)
            android.view.ViewGroup r5 = X.C36411kG.A0P(r15, r1)
            r14.A0F = r5
            r1 = 2131432343(0x7f0b1397, float:1.848644E38)
            android.view.View r3 = X.C012005e.A02(r15, r1)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r14.A0H = r3
            r1 = 2131428466(0x7f0b0472, float:1.8478577E38)
            android.view.View r1 = X.C012005e.A02(r15, r1)
            com.whatsapp.WaDynamicRoundCornerImageView r1 = (com.whatsapp.WaDynamicRoundCornerImageView) r1
            r14.A0J = r1
            r1 = 2131434706(0x7f0b1cd2, float:1.8491234E38)
            android.view.View r1 = X.C012005e.A02(r15, r1)
            com.whatsapp.WaDynamicRoundCornerImageView r1 = (com.whatsapp.WaDynamicRoundCornerImageView) r1
            r14.A0R = r1
            r1 = 2131432342(0x7f0b1396, float:1.8486439E38)
            android.view.View r2 = X.C012005e.A02(r15, r1)
            com.whatsapp.components.button.ThumbnailButton r2 = (com.whatsapp.components.button.ThumbnailButton) r2
            r14.A0N = r2
            r1 = 2131430575(0x7f0b0caf, float:1.8482855E38)
            android.view.View r1 = r15.findViewById(r1)
            com.whatsapp.WaRoundCornerImageView r1 = (com.whatsapp.WaRoundCornerImageView) r1
            r14.A02 = r1
            r1 = 2131434205(0x7f0b1add, float:1.8490217E38)
            X.1RJ r1 = X.C36341k9.A0X(r15, r1)
            r14.A0P = r1
            r1 = 2131431899(0x7f0b11db, float:1.848554E38)
            X.1RJ r1 = X.C36341k9.A0X(r15, r1)
            r14.A0O = r1
            r1 = r19
            r14.A0M = r1
            r1 = r24
            r14.A0V = r1
            if (r5 == 0) goto L_0x00b4
            r0 = 2131434239(0x7f0b1aff, float:1.8490286E38)
            android.view.View r0 = r5.findViewById(r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
        L_0x00b4:
            r14.A0L = r0
            r0 = 2131434502(0x7f0b1c06, float:1.849082E38)
            if (r23 == 0) goto L_0x00be
            r0 = 2131434638(0x7f0b1c8e, float:1.8491096E38)
        L_0x00be:
            android.view.View r1 = X.C012005e.A02(r15, r0)
            r14.A0E = r1
            boolean r0 = r1 instanceof android.view.SurfaceView
            if (r0 == 0) goto L_0x0169
            android.view.SurfaceView r1 = (android.view.SurfaceView) r1
            X.53Q r0 = new X.53Q
            r0.<init>(r1)
        L_0x00cf:
            r14.A0S = r0
            android.content.res.Resources$Theme r6 = X.C36361kB.A09(r15)
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r1 = 2130968849(0x7f040111, float:1.7546363E38)
            r0 = 1
            r6.resolveAttribute(r1, r5, r0)
            android.content.res.Resources r1 = r15.getResources()
            int r0 = r5.data
            if (r0 == 0) goto L_0x0165
            int r0 = r5.resourceId
        L_0x00eb:
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A00 = r0
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131165557(0x7f070175, float:1.7945334E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A01 = r0
            android.util.DisplayMetrics r0 = X.C36361kB.A0B(r15)
            int r0 = r0.widthPixels
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r2.A01 = r1
            android.content.res.Resources r1 = X.C36341k9.A0F(r15)
            r0 = 2131099848(0x7f0600c8, float:1.781206E38)
            int r2 = r1.getColor(r0)
            r14.A0Q = r2
            int r0 = r14.A00
            X.4be r1 = new X.4be
            r1.<init>(r0, r2)
            r14.A09 = r1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r4, r4, r4)
            r1.A00 = r0
            X.4be r4 = r14.A09
            android.view.View r2 = r14.A0H
            boolean r1 = r2 instanceof android.widget.FrameLayout
            java.lang.String r0 = "FrameLayout required as root to support corner rounding via overlay"
            X.C18740tg.A0D(r1, r0)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setForeground(r4)
            r1 = 4
            X.7sK r0 = new X.7sK
            r0.<init>(r14, r1)
            r14.A0G = r0
            r0 = 3153(0xc51, float:4.418E-42)
            r1 = r22
            int r1 = r1.A07(r0)
            r0 = 3
            if (r1 < r0) goto L_0x015b
            r2 = r8
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            java.util.List r1 = java.util.Collections.singletonList(r3)
            X.6L2 r0 = new X.6L2
            r0.<init>(r2, r1)
            r14.A04 = r0
        L_0x015b:
            r1 = 2
            X.7qX r0 = new X.7qX
            r0.<init>(r15, r14, r1)
            r15.addOnAttachStateChangeListener(r0)
            return
        L_0x0165:
            r0 = 2131165555(0x7f070173, float:1.794533E38)
            goto L_0x00eb
        L_0x0169:
            boolean r0 = r1 instanceof android.view.TextureView
            if (r0 == 0) goto L_0x0176
            android.view.TextureView r1 = (android.view.TextureView) r1
            X.53R r0 = new X.53R
            r0.<init>(r1)
            goto L_0x00cf
        L_0x0176:
            java.lang.String r0 = "videoView must be one of [SurfaceView, TextureView]"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass52X.<init>(android.view.View, X.16L, X.5lQ, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel, X.711, X.1Pp, X.171, X.0yC, boolean, boolean):void");
    }

    public void Bee() {
        boolean z = true;
        this.A08 = true;
        C1493370u r2 = this.A06;
        if (r2 != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(this.A0A);
            A0u.append("onRenderStarted  for ");
            C36321k7.A1N(r2.A0D, A0u);
            C129066Eu r3 = this.A05;
            if (r3 == null || !r3.A0J) {
                z = false;
            }
            this.A0K.post(new AnonymousClass752(this, r3, 11, z));
        }
        this.A0H.post(new C1501574e(this, 8));
    }

    private void A00() {
        int i;
        WaImageView waImageView = this.A0K;
        if (waImageView.getVisibility() == 0) {
            C129066Eu r0 = this.A05;
            if (r0 == null || r0.A0J) {
                i = 0;
            } else {
                i = this.A03;
            }
            waImageView.post(new C81283wl((Object) this, i, 15));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r3 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.graphics.Bitmap r3, X.AnonymousClass52X r4) {
        /*
            int r0 = r4.A03
            r2 = 0
            if (r0 == 0) goto L_0x0010
            com.whatsapp.WaImageView r0 = r4.A0K
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0010
            r1 = 1
            if (r3 != 0) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            com.whatsapp.WaImageView r0 = r4.A0K
            r0.setImageBitmap(r3)
            if (r3 != 0) goto L_0x001a
            r2 = 8
        L_0x001a:
            r0.setVisibility(r2)
            if (r1 == 0) goto L_0x0022
            r4.A00()
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass52X.A01(android.graphics.Bitmap, X.52X):void");
    }

    public void A0D(int i) {
        this.A02 = i;
        A0F(this.A0F, this.A0L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d4, code lost:
        if (r9.A0H.getVisibility() == 0) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x028e, code lost:
        if (r1 != 3) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03a0, code lost:
        if (r2 != false) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c1, code lost:
        if (r10.A0X != false) goto L_0x01c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.C129066Eu r10) {
        /*
            r9 = this;
            boolean r0 = r10.A0J
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "preview - "
        L_0x0006:
            r9.A0A = r0
            boolean r0 = r9.A0A()
            if (r0 == 0) goto L_0x0027
            X.6Eu r0 = r9.A05
            boolean r0 = X.C129066Eu.A00(r0, r10)
            if (r0 != 0) goto L_0x0027
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r9.A0A
            r1.append(r0)
            java.lang.String r0 = "bind() called with new participant before unbind()"
            X.C36341k9.A1O(r1, r0)
            r9.A0B()
        L_0x0027:
            X.70u r0 = r9.A06
            if (r0 != 0) goto L_0x004e
            com.whatsapp.jid.UserJid r1 = r10.A0b
            r0 = 0
            r9.A08 = r0
            X.711 r0 = r9.A0M
            X.70u r0 = r0.A03(r1)
            r9.A06 = r0
            java.util.Set r1 = r0.A0F
            monitor-enter(r1)
            goto L_0x003f
        L_0x003c:
            java.lang.String r0 = "display - "
            goto L_0x0006
        L_0x003f:
            r1.add(r9)     // Catch:{ all -> 0x0044 }
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            goto L_0x0047
        L_0x0044:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            throw r0
        L_0x0047:
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x004e
            r9.Bee()
        L_0x004e:
            X.6ET r5 = r9.A0S
            X.70u r1 = r9.A06
            X.70u r0 = r5.A01
            if (r0 != 0) goto L_0x03f6
            r5.A01 = r1
            boolean r0 = r5 instanceof X.AnonymousClass53R
            if (r0 == 0) goto L_0x03b8
            r0 = r5
            X.53R r0 = (X.AnonymousClass53R) r0
            android.view.TextureView r4 = r0.A01
            android.view.TextureView$SurfaceTextureListener r3 = r0.A00
            r4.setSurfaceTextureListener(r3)
            android.graphics.SurfaceTexture r2 = r4.getSurfaceTexture()
            if (r2 == 0) goto L_0x007b
            X.70u r0 = r0.A01
            if (r0 == 0) goto L_0x007b
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            r3.onSurfaceTextureAvailable(r2, r1, r0)
        L_0x007b:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = r9.A04
            if (r1 == 0) goto L_0x00b1
            boolean r0 = r9.A0A()
            if (r0 != 0) goto L_0x00b1
            r0 = 36
            X.7sz r4 = new X.7sz
            r4.<init>(r9, r0)
            r9.A09 = r4
            X.61t r3 = r1.A0X
            com.whatsapp.jid.UserJid r2 = r10.A0b
            java.util.Map r1 = r3.A01
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L_0x009e
            r0 = 0
            r1.put(r2, r0)
        L_0x009e:
            java.util.Map r0 = r3.A00
            r0.put(r2, r4)
            X.141 r3 = r10.A0a
            com.whatsapp.WaDynamicRoundCornerImageView r2 = r9.A0J
            r0 = 1
            r1 = 0
            r9.A0G(r2, r3, r0, r1)
            com.whatsapp.components.button.ThumbnailButton r0 = r9.A0N
            r9.A0G(r0, r3, r1, r1)
        L_0x00b1:
            r9.A05 = r10
            android.view.View r3 = r9.A0E
            boolean r0 = r10.A0J
            if (r0 == 0) goto L_0x03ae
            android.content.Context r1 = r3.getContext()
            r0 = 2131896229(0x7f1227a5, float:1.9427313E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x00c4:
            r3.setContentDescription(r0)
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x03a7
            com.whatsapp.WaRoundCornerImageView r7 = r9.A02
            if (r7 == 0) goto L_0x0100
            android.content.Context r8 = r7.getContext()
            android.graphics.drawable.Drawable r0 = r9.A00
            r6 = 0
            if (r0 != 0) goto L_0x00f8
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r2 = X.C36441kJ.A1O()
            r0 = 2131102402(0x7f060ac2, float:1.781724E38)
            int r0 = X.AnonymousClass00F.A00(r8, r0)
            r2[r6] = r0
            r1 = 1
            r0 = 2131099861(0x7f0600d5, float:1.7812087E38)
            int r0 = X.AnonymousClass00F.A00(r8, r0)
            r2[r1] = r0
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r4, r2)
            r9.A00 = r0
        L_0x00f8:
            r7.setVisibility(r6)
            android.graphics.drawable.Drawable r0 = r9.A00
            r7.setImageDrawable(r0)
        L_0x0100:
            boolean r4 = r10.A0F
            boolean r2 = r10.A0B
            boolean r1 = r10.A0D
            boolean r0 = r9.A0V
            if (r0 != 0) goto L_0x03a2
            if (r1 == 0) goto L_0x039b
            r0 = 2131165563(0x7f07017b, float:1.7945347E38)
        L_0x010f:
            android.view.View r2 = r9.A0H
            int r4 = X.C36371kC.A03(r2, r0)
            X.4be r0 = r9.A09
            if (r0 != 0) goto L_0x012f
            float r1 = (float) r4
            float r0 = r5.A00
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 == 0) goto L_0x012f
            r5.A00 = r1
            boolean r0 = r5 instanceof X.AnonymousClass53R
            if (r0 == 0) goto L_0x0387
            X.70u r0 = r5.A01
            if (r0 == 0) goto L_0x012f
            r0.setCornerRadius(r1)
        L_0x012f:
            int r0 = r9.A00
            if (r4 == r0) goto L_0x015f
            r9.A00 = r4
            X.4be r0 = r9.A09
            if (r0 == 0) goto L_0x0376
            int r0 = r9.A0Q
            X.4be r3 = new X.4be
            r3.<init>(r4, r0)
            r9.A09 = r3
            boolean r1 = r2 instanceof android.widget.FrameLayout
            java.lang.String r0 = "FrameLayout required as root to support corner rounding via overlay"
            X.C18740tg.A0D(r1, r0)
            r0 = r2
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setForeground(r3)
        L_0x014f:
            com.whatsapp.WaDynamicRoundCornerImageView r1 = r9.A0J
            int r0 = r9.A00
            float r0 = (float) r0
            r1.setRadius(r0)
            com.whatsapp.WaDynamicRoundCornerImageView r1 = r9.A0R
            int r0 = r9.A00
            float r0 = (float) r0
            r1.setRadius(r0)
        L_0x015f:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r9.A0I
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L_0x0175
            android.graphics.drawable.Drawable r1 = r6.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r9.A00
            float r0 = (float) r0
            r1.setCornerRadius(r0)
        L_0x0175:
            X.3Bc r7 = r10.A09
            boolean r0 = r10.A0W
            r5 = 0
            r4 = 8
            if (r0 != 0) goto L_0x0186
            boolean r0 = r9.A08
            if (r0 != 0) goto L_0x0371
            boolean r0 = r10.A0Z
            if (r0 == 0) goto L_0x0371
        L_0x0186:
            r9.A0J(r5)
        L_0x0189:
            if (r7 == 0) goto L_0x035b
            boolean r0 = r10.A0W
            if (r0 != 0) goto L_0x035b
            boolean r0 = r10.A0T
            if (r0 != 0) goto L_0x035b
            android.view.ViewGroup r3 = r9.A0F
            if (r3 == 0) goto L_0x01b7
            com.whatsapp.WaTextView r1 = r9.A0L
            if (r1 == 0) goto L_0x01b7
            r3.setVisibility(r5)
            X.6Eu r0 = r9.A05
            if (r0 == 0) goto L_0x01a8
            int r0 = r0.A03
            float r0 = (float) r0
            r3.setRotation(r0)
        L_0x01a8:
            java.lang.CharSequence r0 = X.C90474aD.A0V(r1, r7)
            r1.setText(r0)
            r1.setVisibility(r5)
            com.whatsapp.components.button.ThumbnailButton r0 = r9.A0N
            r0.setVisibility(r4)
        L_0x01b7:
            X.1RJ r3 = r9.A0T
            boolean r0 = r10.A0T
            if (r0 != 0) goto L_0x01c3
            boolean r1 = r10.A0X
            r0 = 8
            if (r1 == 0) goto L_0x01c4
        L_0x01c3:
            r0 = 0
        L_0x01c4:
            r3.A03(r0)
            android.view.View r7 = r9.A0D
            boolean r0 = r10.A0U
            if (r0 == 0) goto L_0x01d6
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.A0H
            int r1 = r0.getVisibility()
            r0 = 0
            if (r1 != 0) goto L_0x01d8
        L_0x01d6:
            r0 = 8
        L_0x01d8:
            r7.setVisibility(r0)
            X.6Eu r0 = r9.A05
            int r0 = r0.A03
            float r0 = (float) r0
            r7.setRotation(r0)
            boolean r0 = r10.A0U
            if (r0 != 0) goto L_0x01eb
            boolean r0 = r10.A0M
            if (r0 != 0) goto L_0x01f8
        L_0x01eb:
            android.graphics.drawable.Drawable r1 = r6.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r9.A01
            if (r1 == 0) goto L_0x01f8
            r1.setStroke(r0, r5)
        L_0x01f8:
            int r0 = r10.A04
            if (r0 == 0) goto L_0x0237
            X.1RJ r8 = r9.A0O
            android.view.View r1 = r8.A01()
            r0 = 2131430834(0x7f0b0db2, float:1.848338E38)
            android.widget.ImageView r6 = X.C36401kF.A0G(r1, r0)
            boolean r3 = X.C222013h.A07
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131167626(0x7f07098a, float:1.794953E38)
            if (r3 == 0) goto L_0x0217
            r0 = 2131167627(0x7f07098b, float:1.7949533E38)
        L_0x0217:
            int r1 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r0.width = r1
            r0.height = r1
            r6.setLayoutParams(r0)
            int r0 = r10.A04
            r6.setImageResource(r0)
            android.view.View r1 = r8.A01()
            X.6Eu r0 = r9.A05
            int r0 = r0.A03
            float r0 = (float) r0
            r1.setRotation(r0)
        L_0x0237:
            X.1RJ r6 = r9.A0O
            int r0 = r10.A04
            if (r0 == 0) goto L_0x0357
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.A0H
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0357
        L_0x0245:
            r6.A03(r5)
            X.6Eu r0 = r9.A05
            int r1 = r0.A06
            int r0 = r9.A03
            if (r0 == r1) goto L_0x02aa
            r9.A03 = r1
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            X.0BJ r3 = (X.AnonymousClass0BJ) r3
            r0 = -1
            r3.A0q = r0
            r3.A0o = r0
            r3.A0J = r0
            r3.A0D = r0
            int r1 = r9.A03
            r0 = 1
            r5 = 0
            if (r1 == r0) goto L_0x0351
            r0 = 2
            if (r1 == r0) goto L_0x034e
            r0 = 3
            if (r1 == r0) goto L_0x034a
            r3.A0o = r5
        L_0x026f:
            r3.A0q = r5
        L_0x0271:
            r7.setLayoutParams(r3)
            android.view.ViewGroup$LayoutParams r3 = r6.A02()
            X.0BJ r3 = (X.AnonymousClass0BJ) r3
            r0 = -1
            r3.A0q = r0
            r3.A0o = r0
            r3.A0J = r0
            r3.A0D = r0
            int r1 = r9.A03
            r0 = 1
            if (r1 == r0) goto L_0x0346
            r0 = 2
            if (r1 == r0) goto L_0x0340
            r0 = 3
            r3.A0J = r5
            if (r1 == r0) goto L_0x0342
        L_0x0290:
            r3.A0q = r5
        L_0x0292:
            r6.A06(r3)
            r9.A00()
            X.6L2 r3 = r9.A04
            if (r3 == 0) goto L_0x02aa
            int r1 = r9.A03
            r0 = 1
            r3.A03 = r0
            int r0 = r3.A02
            if (r1 == r0) goto L_0x02aa
            r3.A02 = r1
            X.AnonymousClass6L2.A00(r3)
        L_0x02aa:
            android.graphics.Bitmap r0 = r10.A07
            A01(r0, r9)
            boolean r0 = r10.A0P
            if (r0 != 0) goto L_0x02bb
            boolean r0 = r10.A0Q
            if (r0 != 0) goto L_0x02bb
            boolean r0 = r10.A0H
            if (r0 == 0) goto L_0x02dc
        L_0x02bb:
            boolean r0 = r10.A0H
            if (r0 == 0) goto L_0x02d3
            android.view.ScaleGestureDetector r0 = r9.A01
            if (r0 != 0) goto L_0x02d3
            android.content.Context r3 = r2.getContext()
            X.4dB r1 = new X.4dB
            r1.<init>(r9)
            android.view.ScaleGestureDetector r0 = new android.view.ScaleGestureDetector
            r0.<init>(r3, r1)
            r9.A01 = r0
        L_0x02d3:
            r1 = 1
            X.6HR r0 = new X.6HR
            r0.<init>(r10, r9, r1)
            r2.setOnTouchListener(r0)
        L_0x02dc:
            boolean r0 = r10.A0P
            if (r0 == 0) goto L_0x02e5
            r0 = 40
            X.C36411kG.A1C(r2, r9, r10, r0)
        L_0x02e5:
            boolean r0 = r10.A0Q
            if (r0 == 0) goto L_0x02f2
            r1 = 0
            X.7qO r0 = new X.7qO
            r0.<init>(r9, r10, r1)
            r2.setOnLongClickListener(r0)
        L_0x02f2:
            boolean r0 = r10.A0X
            if (r0 == 0) goto L_0x0321
            X.1RJ r3 = r9.A0P
            int r0 = r3.A00()
            if (r0 != r4) goto L_0x0321
            X.7gI r0 = r9.A05
            if (r0 != 0) goto L_0x0309
            X.6rp r0 = new X.6rp
            r0.<init>(r9)
            r9.A05 = r0
        L_0x0309:
            java.lang.Runnable r0 = r9.A07
            if (r0 != 0) goto L_0x0315
            r1 = 7
            X.74e r0 = new X.74e
            r0.<init>(r9, r1)
            r9.A07 = r0
        L_0x0315:
            r0 = 0
            r3.A03(r0)
            java.lang.Runnable r3 = r9.A07
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r3, r0)
        L_0x0320:
            return
        L_0x0321:
            boolean r0 = r10.A0X
            if (r0 != 0) goto L_0x0320
            X.1RJ r0 = r9.A0P
            r0.A03(r4)
            java.lang.Runnable r0 = r9.A07
            r3 = 0
            if (r0 == 0) goto L_0x0334
            r2.removeCallbacks(r0)
            r9.A07 = r3
        L_0x0334:
            X.7gI r1 = r9.A05
            if (r1 == 0) goto L_0x0320
            X.70u r0 = r9.A06
            r0.A0A(r1)
            r9.A05 = r3
            return
        L_0x0340:
            r3.A0o = r5
        L_0x0342:
            r3.A0D = r5
            goto L_0x0292
        L_0x0346:
            r3.A0o = r5
            goto L_0x0290
        L_0x034a:
            r3.A0J = r5
            goto L_0x026f
        L_0x034e:
            r3.A0J = r5
            goto L_0x0353
        L_0x0351:
            r3.A0o = r5
        L_0x0353:
            r3.A0D = r5
            goto L_0x0271
        L_0x0357:
            r5 = 8
            goto L_0x0245
        L_0x035b:
            android.view.ViewGroup r0 = r9.A0F
            if (r0 == 0) goto L_0x01b7
            r0.setVisibility(r4)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.A0H
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01b7
            com.whatsapp.components.button.ThumbnailButton r0 = r9.A0N
            r0.setVisibility(r5)
            goto L_0x01b7
        L_0x0371:
            r9.A0J(r4)
            goto L_0x0189
        L_0x0376:
            X.70u r0 = r9.A06
            if (r0 == 0) goto L_0x014f
            float r1 = (float) r4
            r0.setCornerRadius(r1)
            boolean r0 = r3 instanceof android.view.SurfaceView
            if (r0 == 0) goto L_0x014f
            X.C34081gQ.A04(r3, r1)
            goto L_0x014f
        L_0x0387:
            X.53Q r5 = (X.AnonymousClass53Q) r5
            X.70u r1 = r5.A01
            if (r1 == 0) goto L_0x012f
            float r0 = r5.A00
            r1.setCornerRadius(r0)
            android.view.SurfaceView r1 = r5.A01
            float r0 = r5.A00
            X.C34081gQ.A04(r1, r0)
            goto L_0x012f
        L_0x039b:
            if (r4 == 0) goto L_0x03a2
            r0 = 2131165568(0x7f070180, float:1.7945357E38)
            if (r2 == 0) goto L_0x010f
        L_0x03a2:
            r0 = 2131165556(0x7f070174, float:1.7945332E38)
            goto L_0x010f
        L_0x03a7:
            com.whatsapp.WaRoundCornerImageView r0 = r9.A02
            X.C36341k9.A0y(r0)
            goto L_0x0100
        L_0x03ae:
            X.171 r1 = r9.A0C
            X.141 r0 = r10.A0a
            java.lang.String r0 = r1.A0H(r0)
            goto L_0x00c4
        L_0x03b8:
            r2 = r5
            X.53Q r2 = (X.AnonymousClass53Q) r2
            android.view.SurfaceView r4 = r2.A01
            android.view.SurfaceHolder r1 = r4.getHolder()
            android.view.SurfaceHolder$Callback r0 = r2.A00
            r1.addCallback(r0)
            android.view.SurfaceHolder r0 = r4.getHolder()
            android.view.Surface r3 = r0.getSurface()
            if (r3 == 0) goto L_0x007b
            boolean r0 = r3.isValid()
            if (r0 == 0) goto L_0x007b
            X.70u r0 = r2.A01
            if (r0 == 0) goto L_0x007b
            X.C18740tg.A06(r3)
            r0.A0B(r3)
            X.70u r1 = r2.A01
            float r0 = r2.A00
            r1.setCornerRadius(r0)
            X.70u r2 = r2.A01
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            r2.A0D(r3, r1, r0)
            goto L_0x007b
        L_0x03f6:
            if (r0 == r1) goto L_0x007b
            java.lang.String r0 = "Callback must be disconnected before connecting a different callback"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass52X.A0H(X.6Eu):void");
    }

    public void A0I() {
        View view = this.A0E;
        if (view instanceof SurfaceView) {
            ((SurfaceView) view).setZOrderMediaOverlay(true);
        }
        this.A09 = null;
        View view2 = this.A0H;
        C18740tg.A0D(view2 instanceof FrameLayout, "FrameLayout required as root to support corner rounding via overlay");
        ((FrameLayout) view2).setForeground((Drawable) null);
    }

    public void A0J(int i) {
        AnonymousClass1RJ r1;
        this.A0H.setVisibility(i);
        WaTextView waTextView = this.A0L;
        int i2 = 8;
        if (waTextView != null && waTextView.getVisibility() == 0) {
            this.A0N.setVisibility(8);
        }
        if (i == 0) {
            this.A0D.setVisibility(8);
            r1 = this.A0O;
        } else {
            C129066Eu r0 = this.A05;
            if (r0 != null) {
                this.A0D.setVisibility(C36351kA.A00(r0.A0U ? 1 : 0));
                r1 = this.A0O;
                if (this.A05.A04 != 0) {
                    i2 = 0;
                }
            } else {
                return;
            }
        }
        r1.A03(i2);
    }

    public void A0B() {
        Object surface;
        AnonymousClass04S r5;
        if (A0A()) {
            CallGridViewModel callGridViewModel = this.A04;
            if (!(callGridViewModel == null || (r5 = this.A09) == null)) {
                C1258961t r1 = callGridViewModel.A0X;
                UserJid userJid = this.A05.A0b;
                Map map = r1.A01;
                if (map.containsKey(userJid)) {
                    Map map2 = r1.A00;
                    if (r5.equals(map2.get(userJid))) {
                        map2.remove(userJid);
                        map.remove(userJid);
                    }
                }
                this.A09 = null;
            }
            AnonymousClass6ET r4 = this.A0S;
            if (r4.A01 != null) {
                boolean z = r4 instanceof AnonymousClass53R;
                if (z) {
                    surface = ((AnonymousClass53R) r4).A01.getSurfaceTexture();
                } else {
                    surface = ((AnonymousClass53Q) r4).A01.getHolder().getSurface();
                }
                if (surface != null) {
                    r4.A01.A0C(surface);
                }
                r4.A01 = null;
                if (z) {
                    ((AnonymousClass53R) r4).A01.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
                } else {
                    AnonymousClass53Q r42 = (AnonymousClass53Q) r4;
                    r42.A01.getHolder().removeCallback(r42.A00);
                }
            }
            GradientDrawable gradientDrawable = (GradientDrawable) this.A0I.getBackground();
            int i = this.A01;
            if (gradientDrawable != null) {
                gradientDrawable.setStroke(i, 0);
            }
            this.A05 = null;
            View view = this.A0H;
            view.setOnClickListener((View.OnClickListener) null);
            view.setOnLongClickListener((View.OnLongClickListener) null);
            C1493370u r0 = this.A06;
            if (r0 != null) {
                r0.A0A(this);
            }
            this.A06 = null;
            this.A08 = false;
            this.A01 = null;
        }
    }
}
