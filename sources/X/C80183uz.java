package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3uz  reason: invalid class name and case insensitive filesystem */
public abstract class C80183uz implements Comparable {
    public final int A00;
    public final AnonymousClass4V7 A01;

    public final void A08() {
        ((C87694Pu) this.A01).getConversationBanners().A01(getClass(), false);
    }

    public static AnonymousClass155 A05(C80183uz r0) {
        return r0.A01.BoP();
    }

    public View A06() {
        if (this instanceof AnonymousClass2HI) {
            return ((AnonymousClass2HI) this).A00;
        }
        if (this instanceof AnonymousClass2HJ) {
            return ((AnonymousClass2HJ) this).A00;
        }
        if (this instanceof AnonymousClass2HK) {
            return ((AnonymousClass2HK) this).A00;
        }
        if (this instanceof AnonymousClass2HM) {
            return ((AnonymousClass2HM) this).A01;
        }
        if (this instanceof AnonymousClass2HP) {
            return ((AnonymousClass2HP) this).A01;
        }
        if (this instanceof AnonymousClass2HN) {
            return ((AnonymousClass2HN) this).A01;
        }
        if (this instanceof AnonymousClass2HO) {
            return ((AnonymousClass2HO) this).A00;
        }
        return ((AnonymousClass2HL) this).A01;
    }

    /* JADX WARNING: Removed duplicated region for block: B:169:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x045f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07() {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.AnonymousClass2HI
            if (r0 == 0) goto L_0x00c8
            r4 = r12
            X.2HI r4 = (X.AnonymousClass2HI) r4
            android.view.View r0 = r4.A00     // Catch:{ Exception -> 0x00b0 }
            if (r0 != 0) goto L_0x0027
            X.4V7 r0 = r4.A04     // Catch:{ Exception -> 0x00b0 }
            X.155 r0 = r0.BoP()     // Catch:{ Exception -> 0x00b0 }
            android.view.LayoutInflater r2 = r0.getLayoutInflater()     // Catch:{ Exception -> 0x00b0 }
            r1 = 2131626337(0x7f0e0961, float:1.8879907E38)
            android.view.ViewGroup r0 = r4.A03     // Catch:{ Exception -> 0x00b0 }
            android.view.View r1 = r2.inflate(r1, r0)     // Catch:{ Exception -> 0x00b0 }
            r0 = 2131434503(0x7f0b1c07, float:1.8490822E38)
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ Exception -> 0x00b0 }
            r4.A00 = r0     // Catch:{ Exception -> 0x00b0 }
        L_0x0027:
            X.4On r0 = r4.A02     // Catch:{ Exception -> 0x00b0 }
            if (r0 == 0) goto L_0x0048
            android.view.ViewGroup r3 = r4.A03     // Catch:{ Exception -> 0x00b0 }
            r0 = 2131434505(0x7f0b1c09, float:1.8490826E38)
            android.view.View r2 = X.C36361kB.A0F(r3, r0)     // Catch:{ Exception -> 0x00b0 }
            X.3Jt r1 = r4.A01     // Catch:{ Exception -> 0x00b0 }
            if (r1 == 0) goto L_0x003c
            r0 = 5
            X.AnonymousClass3YF.A00(r2, r4, r1, r0)     // Catch:{ Exception -> 0x00b0 }
        L_0x003c:
            r0 = 2131434504(0x7f0b1c08, float:1.8490824E38)
            android.view.View r1 = X.C36361kB.A0F(r3, r0)     // Catch:{ Exception -> 0x00b0 }
            r0 = 18
            X.C66953Xy.A00(r1, r4, r0)     // Catch:{ Exception -> 0x00b0 }
        L_0x0048:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r0 = "SurveyConversationBanner/show qp.IsNull="
            r2.append(r0)     // Catch:{ Exception -> 0x00b0 }
            X.4On r0 = r4.A02     // Catch:{ Exception -> 0x00b0 }
            r1 = 1
            r5 = 0
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r2.append(r0)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r0 = " surveyInfo.isNull="
            r2.append(r0)     // Catch:{ Exception -> 0x00b0 }
            X.3Jt r0 = r4.A01     // Catch:{ Exception -> 0x00b0 }
            if (r0 == 0) goto L_0x0066
            r1 = 0
        L_0x0066:
            java.lang.String r2 = X.C36421kH.A0d(r2, r1)     // Catch:{ Exception -> 0x00b0 }
            X.3Sp r7 = r4.A07     // Catch:{ Exception -> 0x00b0 }
            X.2aL r1 = r4.A08     // Catch:{ Exception -> 0x00b0 }
            com.whatsapp.jid.UserJid r0 = r4.A09     // Catch:{ Exception -> 0x00b0 }
            X.0yC r6 = r4.A05     // Catch:{ Exception -> 0x00b0 }
            X.C53832rx.A00(r6, r7, r1, r0, r2)     // Catch:{ Exception -> 0x00b0 }
            X.4On r0 = r4.A02     // Catch:{ Exception -> 0x00b0 }
            r1 = 8
            if (r0 == 0) goto L_0x00a8
            X.3Jt r3 = r4.A01     // Catch:{ Exception -> 0x00b0 }
            if (r3 == 0) goto L_0x00a8
            r2 = 3
            X.2Qa r1 = new X.2Qa     // Catch:{ Exception -> 0x00b0 }
            r1.<init>()     // Catch:{ Exception -> 0x00b0 }
            r0 = 2
            X.C45092Qa.A00(r1, r7, r3, r0, r2)     // Catch:{ Exception -> 0x00b0 }
            X.4On r3 = r4.A02     // Catch:{ Exception -> 0x00b0 }
            if (r3 == 0) goto L_0x0096
            X.1bg r2 = r4.A0B     // Catch:{ Exception -> 0x00b0 }
            r1 = 11389(0x2c7d, float:1.596E-41)
            X.8zX r0 = X.C188408zX.IMPRESSION     // Catch:{ Exception -> 0x00b0 }
            r2.A00(r0, r3, r1)     // Catch:{ Exception -> 0x00b0 }
        L_0x0096:
            android.view.View r1 = r4.A00     // Catch:{ Exception -> 0x00b0 }
            if (r1 == 0) goto L_0x00f0
            r0 = 4470(0x1176, float:6.264E-42)
            boolean r0 = r6.A0E(r0)     // Catch:{ Exception -> 0x00b0 }
            if (r0 != 0) goto L_0x00a4
            r5 = 8
        L_0x00a4:
            r1.setVisibility(r5)     // Catch:{ Exception -> 0x00b0 }
            return
        L_0x00a8:
            android.view.View r0 = r4.A00     // Catch:{ Exception -> 0x00b0 }
            if (r0 == 0) goto L_0x00f0
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x00b0 }
            return
        L_0x00b0:
            r3 = move-exception
            X.3Sp r2 = r4.A07
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SurveyConversationBanner/show exception="
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass0VY.A00(r3)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r2.A02(r0)
            return
        L_0x00c8:
            boolean r0 = r12 instanceof X.AnonymousClass2HJ
            if (r0 == 0) goto L_0x00f1
            r3 = r12
            X.2HJ r3 = (X.AnonymousClass2HJ) r3
            android.view.View r0 = r3.A00
            if (r0 != 0) goto L_0x00f0
            X.155 r0 = A05(r3)
            android.view.LayoutInflater r2 = r0.getLayoutInflater()
            r1 = 2131625651(0x7f0e06b3, float:1.8878516E38)
            android.view.ViewGroup r0 = r3.A01
            android.view.View r1 = r2.inflate(r1, r0)
            r0 = 2131432637(0x7f0b14bd, float:1.8487037E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A00 = r0
            r3.A0D()
        L_0x00f0:
            return
        L_0x00f1:
            boolean r0 = r12 instanceof X.AnonymousClass2HK
            if (r0 == 0) goto L_0x0115
            r3 = r12
            X.2HK r3 = (X.AnonymousClass2HK) r3
            X.155 r0 = A05(r3)
            android.view.LayoutInflater r2 = r0.getLayoutInflater()
            r0 = 2131625585(0x7f0e0671, float:1.8878382E38)
            android.view.ViewGroup r1 = r3.A01
            r2.inflate(r0, r1)
            r0 = 2131431869(0x7f0b11bd, float:1.848548E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            r3.A00 = r0
            X.AnonymousClass2HK.A00(r3)
            return
        L_0x0115:
            boolean r0 = r12 instanceof X.AnonymousClass2HM
            if (r0 == 0) goto L_0x0159
            r3 = r12
            X.2HM r3 = (X.AnonymousClass2HM) r3
            android.view.View r0 = r3.A01
            if (r0 != 0) goto L_0x00f0
            X.155 r1 = A05(r3)
            X.AnonymousClass00C.A08(r1)
            android.content.Context r0 = r1.getApplicationContext()
            X.AnonymousClass00C.A08(r0)
            X.0tq r0 = X.C36371kC.A0P(r0)
            X.0yC r0 = r0.Azp()
            boolean r0 = X.AnonymousClass1MI.A00(r0)
            r2 = 2131625503(0x7f0e061f, float:1.8878216E38)
            if (r0 == 0) goto L_0x0142
            r2 = 2131625504(0x7f0e0620, float:1.8878218E38)
        L_0x0142:
            android.view.LayoutInflater r1 = r1.getLayoutInflater()
            android.view.ViewGroup r0 = r3.A03
            android.view.View r1 = r1.inflate(r2, r0)
            r0 = 2131432651(0x7f0b14cb, float:1.8487065E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A01 = r0
            X.AnonymousClass2HM.A00(r3)
            return
        L_0x0159:
            boolean r0 = r12 instanceof X.AnonymousClass2HP
            if (r0 == 0) goto L_0x016d
            r6 = r12
            X.2HP r6 = (X.AnonymousClass2HP) r6
            X.5Nh r0 = r6.A08
            r8 = 0
            if (r0 != 0) goto L_0x037c
            X.3KV r0 = r6.A07
            if (r0 != 0) goto L_0x037c
            r6.A0A(r8)
            return
        L_0x016d:
            boolean r0 = r12 instanceof X.AnonymousClass2HN
            if (r0 == 0) goto L_0x019d
            r3 = r12
            X.2HN r3 = (X.AnonymousClass2HN) r3
            android.view.View r0 = r3.A01
            if (r0 != 0) goto L_0x00f0
            boolean r0 = r3.A08
            r2 = 2131625114(0x7f0e049a, float:1.8877427E38)
            if (r0 == 0) goto L_0x0182
            r2 = 2131625115(0x7f0e049b, float:1.8877429E38)
        L_0x0182:
            X.155 r0 = A05(r3)
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            android.view.ViewGroup r0 = r3.A04
            android.view.View r1 = r1.inflate(r2, r0)
            r0 = 2131432647(0x7f0b14c7, float:1.8487057E38)
            android.view.View r0 = r1.findViewById(r0)
            r3.A01 = r0
            X.AnonymousClass2HN.A00(r3)
            return
        L_0x019d:
            boolean r0 = r12 instanceof X.AnonymousClass2HO
            if (r0 == 0) goto L_0x0201
            r2 = r12
            X.2HO r2 = (X.AnonymousClass2HO) r2
            android.view.View r0 = r2.A00
            if (r0 != 0) goto L_0x00f0
            X.155 r1 = A05(r2)
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            android.content.Context r0 = r1.getApplicationContext()
            X.AnonymousClass00C.A08(r0)
            X.0tq r0 = X.C36371kC.A0P(r0)
            X.0yC r0 = r0.Azp()
            boolean r0 = X.AnonymousClass1MI.A00(r0)
            r3 = 2131624366(0x7f0e01ae, float:1.887591E38)
            if (r0 == 0) goto L_0x01cb
            r3 = 2131624367(0x7f0e01af, float:1.8875912E38)
        L_0x01cb:
            android.view.LayoutInflater r1 = r1.getLayoutInflater()
            android.view.ViewGroup r0 = r2.A04
            android.view.View r1 = r1.inflate(r3, r0)
            r0 = 2131428725(0x7f0b0575, float:1.8479103E38)
            android.view.View r0 = r1.findViewById(r0)
            r2.A00 = r0
            X.AnonymousClass2HO.A00(r2)
            r4 = 1
            r5 = 0
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r6 = 1
            r7 = 0
            r8 = 1
            r10 = 1
            r11 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 6
            X.C89234Vt.A00(r3, r2, r0)
            r0 = 400(0x190, double:1.976E-321)
            r3.setDuration(r0)
            android.view.View r0 = r2.A00
            X.C18740tg.A04(r0)
            r0.startAnimation(r3)
            return
        L_0x0201:
            r5 = r12
            X.2HL r5 = (X.AnonymousClass2HL) r5
            android.view.ViewGroup r4 = r5.A01
            int r0 = r4.getVisibility()
            r9 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00f0
            int r0 = r4.getChildCount()
            if (r0 > 0) goto L_0x0215
            r9 = 0
        L_0x0215:
            boolean r0 = r5 instanceof X.AnonymousClass2HH
            if (r0 == 0) goto L_0x0279
            r8 = r5
            X.2HH r8 = (X.AnonymousClass2HH) r8
            android.view.ViewGroup r0 = r8.A01
            r0.removeAllViews()
            r0 = 2131626215(0x7f0e08e7, float:1.887966E38)
            android.view.View r2 = r8.A0D(r0)
            r0 = 2131434105(0x7f0b1a79, float:1.8490015E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 17
            X.C66953Xy.A00(r1, r8, r0)
            r0 = 2131434107(0x7f0b1a7b, float:1.8490019E38)
            androidx.recyclerview.widget.RecyclerView r7 = X.C36441kJ.A0c(r2, r0)
            X.3CE r6 = r8.A04
            X.1RY r2 = r8.A05
            X.AnonymousClass00C.A0B(r7)
            X.1d1 r0 = r8.A08
            r1 = 1
            X.3oA r0 = r6.A00(r7, r2, r0, r1)
            r8.A02 = r0
            r0.A00()
            r8.A00 = r7
            r8.A03 = r1
            X.AnonymousClass2HH.A00(r8)
        L_0x0255:
            X.155 r0 = A05(r5)
            X.07B r1 = r0.getSupportActionBar()
            if (r1 == 0) goto L_0x0263
            r0 = 0
            r1.A0F(r0)
        L_0x0263:
            float r0 = r5.A00
            X.C011004s.A05(r4, r0)
            r4.setVisibility(r3)
            if (r9 == 0) goto L_0x00f0
            r0 = 41
            X.3v3 r2 = X.C80223v3.A00(r5, r0)
            r0 = 10
            r4.postDelayed(r2, r0)
            return
        L_0x0279:
            boolean r0 = r5 instanceof X.AnonymousClass2HF
            if (r0 == 0) goto L_0x02c3
            r2 = r5
            X.2HF r2 = (X.AnonymousClass2HF) r2
            android.view.ViewGroup r6 = r2.A01
            r6.removeAllViews()
            X.0yC r0 = r2.A02
            boolean r1 = X.AnonymousClass1MI.A00(r0)
            r0 = 2131625849(0x7f0e0779, float:1.8878918E38)
            if (r1 == 0) goto L_0x0293
            r0 = 2131625851(0x7f0e077b, float:1.8878922E38)
        L_0x0293:
            r2.A0D(r0)
            X.1Ju r0 = r2.A04
            int r1 = r0.A00()
            r0 = 1
            if (r1 <= r0) goto L_0x02aa
            r0 = 2131432727(0x7f0b1517, float:1.848722E38)
            android.view.View r0 = X.C012005e.A02(r6, r0)
            com.whatsapp.pininchat.banner.PinInChatBannerMultiplePinsIndicator r0 = (com.whatsapp.pininchat.banner.PinInChatBannerMultiplePinsIndicator) r0
            r2.A00 = r0
        L_0x02aa:
            com.whatsapp.pininchat.banner.PinInChatBannerViewModel r1 = r2.A03
            X.00s r0 = r1.A01
            X.3T1 r0 = X.C36431kI.A0r(r0)
            if (r0 == 0) goto L_0x0255
            X.AnonymousClass2HF.A01(r2, r0)
            X.1hi r0 = r1.A06
            java.lang.Object r0 = r0.A04()
            X.3Ib r0 = (X.C62923Ib) r0
            X.AnonymousClass2HF.A00(r2, r0)
            goto L_0x0255
        L_0x02c3:
            boolean r0 = r5 instanceof X.AnonymousClass2HG
            if (r0 == 0) goto L_0x0325
            r2 = r5
            X.2HG r2 = (X.AnonymousClass2HG) r2
            android.view.ViewGroup r6 = r2.A01
            r0 = 2131430625(0x7f0b0ce1, float:1.8482956E38)
            android.view.View r0 = r6.findViewById(r0)
            if (r0 != 0) goto L_0x030f
            r6.removeAllViews()
            r0 = 32
            X.2iG r1 = new X.2iG
            r1.<init>(r2, r0)
            X.155 r0 = A05(r2)
            X.AnonymousClass00C.A0D(r0, r3)
            android.content.Context r0 = r0.getApplicationContext()
            X.AnonymousClass00C.A08(r0)
            X.0tq r0 = X.C36371kC.A0P(r0)
            X.0yC r0 = r0.Azp()
            boolean r0 = X.AnonymousClass1MI.A00(r0)
            if (r0 == 0) goto L_0x0314
            r0 = 2131624534(0x7f0e0256, float:1.887625E38)
            r2.A0D(r0)
            r0 = 2131430621(0x7f0b0cdd, float:1.8482948E38)
            android.view.View r0 = r6.findViewById(r0)
            com.whatsapp.wds.components.banners.WDSBannerCompact r0 = (com.whatsapp.wds.components.banners.WDSBannerCompact) r0
            r2.A01 = r0
            r0.setOnDismissListener((android.view.View.OnClickListener) r1)
        L_0x030f:
            X.AnonymousClass2HG.A01(r2)
            goto L_0x0255
        L_0x0314:
            r0 = 2131624533(0x7f0e0255, float:1.8876248E38)
            r2.A0D(r0)
            r0 = 2131430622(0x7f0b0cde, float:1.848295E38)
            android.view.View r0 = r6.findViewById(r0)
            r0.setOnClickListener(r1)
            goto L_0x030f
        L_0x0325:
            r6 = r5
            X.2HE r6 = (X.AnonymousClass2HE) r6
            com.whatsapp.wds.components.banners.WDSBannerCompact r0 = r6.A01
            if (r0 != 0) goto L_0x0255
            android.widget.ImageView r0 = r6.A00
            if (r0 != 0) goto L_0x0255
            android.view.ViewGroup r1 = r6.A01
            r1.removeAllViews()
            r0 = 31
            X.2iG r2 = new X.2iG
            r2.<init>(r6, r0)
            X.0yC r0 = r6.A03
            boolean r0 = X.AnonymousClass1MI.A00(r0)
            if (r0 == 0) goto L_0x0366
            r0 = 2131624523(0x7f0e024b, float:1.8876228E38)
            r6.A0D(r0)
            r0 = 2131428917(0x7f0b0635, float:1.8479492E38)
            android.view.View r1 = X.C012005e.A02(r1, r0)
            com.whatsapp.wds.components.banners.WDSBannerCompact r1 = (com.whatsapp.wds.components.banners.WDSBannerCompact) r1
            r6.A01 = r1
            if (r1 == 0) goto L_0x035d
            r0 = 2131887298(0x7f1204c2, float:1.94092E38)
            r1.setText((int) r0)
        L_0x035d:
            com.whatsapp.wds.components.banners.WDSBannerCompact r0 = r6.A01
            if (r0 == 0) goto L_0x0255
            r0.setOnDismissListener((android.view.View.OnClickListener) r2)
            goto L_0x0255
        L_0x0366:
            r0 = 2131624522(0x7f0e024a, float:1.8876226E38)
            r6.A0D(r0)
            r0 = 2131428916(0x7f0b0634, float:1.847949E38)
            android.widget.ImageView r0 = X.C36401kF.A0G(r1, r0)
            r6.A00 = r0
            if (r0 == 0) goto L_0x0255
            r0.setOnClickListener(r2)
            goto L_0x0255
        L_0x037c:
            android.view.View r0 = r6.A01
            if (r0 != 0) goto L_0x0468
            X.1Pm r1 = r6.A0L
            X.1NK r0 = r6.A0K
            r1.registerObserver(r0)
            X.155 r0 = A05(r6)
            android.view.LayoutInflater r2 = r0.getLayoutInflater()
            r0 = 2131625320(0x7f0e0568, float:1.8877845E38)
            android.view.ViewGroup r1 = r6.A0C
            r2.inflate(r0, r1)
            r0 = 2131431091(0x7f0b0eb3, float:1.8483901E38)
            android.view.View r5 = X.C012005e.A02(r1, r0)
            r6.A01 = r5
            if (r5 == 0) goto L_0x0468
            r0 = 2131432618(0x7f0b14aa, float:1.8486999E38)
            android.view.View r3 = X.C012005e.A02(r5, r0)
            com.whatsapp.calling.PeerAvatarLayout r3 = (com.whatsapp.calling.PeerAvatarLayout) r3
            r6.A06 = r3
            if (r3 == 0) goto L_0x03c9
            r0 = 2131166921(0x7f0706c9, float:1.79481E38)
            r3.A04 = r0
            android.content.Context r2 = r3.getContext()
            r1 = 2130968908(0x7f04014c, float:1.7546483E38)
            r0 = 2131100072(0x7f0601a8, float:1.7812515E38)
            int r1 = X.C224514j.A00(r2, r1, r0)
            r0 = 2131166920(0x7f0706c8, float:1.7948099E38)
            r3.A01 = r0
            r3.A00 = r1
        L_0x03c9:
            r0 = 2131434724(0x7f0b1ce4, float:1.849127E38)
            com.whatsapp.WaTextView r0 = X.C36401kF.A0Q(r5, r0)
            r6.A05 = r0
            r0 = 2131434453(0x7f0b1bd5, float:1.849072E38)
            com.whatsapp.WaTextView r0 = X.C36401kF.A0Q(r5, r0)
            r6.A04 = r0
            r0 = 2131431055(0x7f0b0e8f, float:1.8483828E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.C36431kI.A0y(r5, r0)
            r6.A0A = r0
            if (r0 == 0) goto L_0x03e9
            r0.setEnabled(r8)
        L_0x03e9:
            X.0yC r4 = r6.A0I
            r0 = 5460(0x1554, float:7.651E-42)
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x0404
            r0 = 6121(0x17e9, float:8.577E-42)
            boolean r0 = r4.A0E(r0)
            if (r0 != 0) goto L_0x0404
            r0 = 2131431056(0x7f0b0e90, float:1.848383E38)
            com.whatsapp.WaImageView r0 = X.C36431kI.A0X(r5, r0)
            r6.A03 = r0
        L_0x0404:
            X.5Nh r0 = r6.A08
            if (r0 == 0) goto L_0x04a4
            int r2 = r0.A08
            boolean r1 = r0.A0K
        L_0x040c:
            com.whatsapp.wds.components.button.WDSButton r7 = r6.A0A
            if (r7 == 0) goto L_0x0451
            if (r2 == 0) goto L_0x0489
            r0 = 1
            if (r2 == r0) goto L_0x0489
            r0 = 2
            if (r2 != r0) goto L_0x0451
            r0 = 2131234349(0x7f080e2d, float:1.8084861E38)
        L_0x041b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0451
            int r2 = r0.intValue()
            r0 = 6121(0x17e9, float:8.577E-42)
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x0474
            X.00T r3 = r6.A0M
            java.lang.Object r1 = r3.getValue()
            X.6C3 r1 = (X.AnonymousClass6C3) r1
            android.content.Context r0 = X.C36371kC.A0B(r7)
            X.0BQ r2 = r1.A00(r0, r2, r8)
            if (r2 == 0) goto L_0x0451
            java.lang.Object r1 = r3.getValue()
            X.6C3 r1 = (X.AnonymousClass6C3) r1
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r7)
            r1.A02 = r0
            r7.setIcon((android.graphics.drawable.Drawable) r2)
            r2.start()
        L_0x0451:
            com.whatsapp.wds.components.button.WDSButton r1 = r6.A0A
            if (r1 == 0) goto L_0x0459
            r0 = 3
            X.AnonymousClass3YF.A00(r1, r6, r5, r0)
        L_0x0459:
            boolean r0 = X.C34681hT.A0N(r4)
            if (r0 == 0) goto L_0x0468
            r1 = 4
            X.3YF r0 = new X.3YF
            r0.<init>(r6, r5, r1)
            r5.setOnClickListener(r0)
        L_0x0468:
            X.0wU r1 = r6.A0J
            r0 = 44
            X.3v3 r0 = X.C80223v3.A00(r6, r0)
            r1.Bp1(r0)
            return
        L_0x0474:
            X.00T r1 = r6.A0M
            boolean r0 = r1.BM2()
            if (r0 == 0) goto L_0x0485
            java.lang.Object r0 = r1.getValue()
            X.6C3 r0 = (X.AnonymousClass6C3) r0
            r0.A02()
        L_0x0485:
            r7.setIcon((int) r2)
            goto L_0x0451
        L_0x0489:
            r0 = 6121(0x17e9, float:8.577E-42)
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x049a
            r0 = 2131233888(0x7f080c60, float:1.8083926E38)
            if (r1 == 0) goto L_0x041b
            r0 = 2131233887(0x7f080c5f, float:1.8083924E38)
            goto L_0x041b
        L_0x049a:
            r0 = 2131231779(0x7f080423, float:1.8079649E38)
            if (r1 == 0) goto L_0x041b
            r0 = 2131231867(0x7f08047b, float:1.8079827E38)
            goto L_0x041b
        L_0x04a4:
            X.3KV r0 = r6.A07
            if (r0 == 0) goto L_0x0451
            r2 = 1
            int r1 = r0.A00
            r0 = 2
            boolean r1 = X.AnonymousClass000.A1S(r1, r0)
            goto L_0x040c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80183uz.A07():void");
    }

    public void A09(C87684Pt r9, boolean z) {
        Animator animator;
        View view;
        View view2;
        if (this instanceof AnonymousClass2HI) {
            C36331k8.A0y(((AnonymousClass2HI) this).A00);
        } else if (this instanceof AnonymousClass2HJ) {
            AnonymousClass2HJ r2 = (AnonymousClass2HJ) this;
            if (r2.A0C() && (view2 = r2.A00) != null) {
                view2.setVisibility(8);
                r2.A01.removeView(r2.A00);
                r2.A00 = null;
            }
        } else if (this instanceof AnonymousClass2HK) {
            AnonymousClass2HK r22 = (AnonymousClass2HK) this;
            if (r22.A0C() && (view = r22.A00) != null) {
                view.setVisibility(8);
                r22.A01.removeView(view);
                r22.A00 = null;
            }
        } else if (this instanceof AnonymousClass2HM) {
            AnonymousClass2HM r3 = (AnonymousClass2HM) this;
            if (z) {
                TranslateAnimation A0M = C36371kC.A0M();
                C89214Vr.A00(A0M, r9, r3, 7);
                A0M.setDuration(400);
                View view3 = r3.A01;
                if (view3 != null) {
                    view3.startAnimation(A0M);
                }
            } else {
                C36331k8.A0y(r3.A01);
                r3.A03.removeView(r3.A01);
                r3.A01 = null;
                r9.BYs();
            }
            C80223v3.A02(r3.A05, r3, 45);
        } else if (this instanceof AnonymousClass2HP) {
            AnonymousClass2HP r23 = (AnonymousClass2HP) this;
            r23.A0L.unregisterObserver(r23.A0K);
            AnonymousClass2HP.A03(r23);
            AnonymousClass00T r1 = r23.A0M;
            if (r1.BM2()) {
                ((AnonymousClass6C3) r1.getValue()).A02();
            }
            C36331k8.A0y(r23.A01);
            r23.A0C.removeView(r23.A01);
            r23.A01 = null;
            r23.A05 = null;
            r23.A04 = null;
            r23.A06 = null;
            r23.A08 = null;
            r23.A07 = null;
            r23.A00 = 9;
            r23.A03 = null;
            r23.A0A = null;
            r9.BYs();
        } else if (this instanceof AnonymousClass2HN) {
            AnonymousClass2HN r32 = (AnonymousClass2HN) this;
            if (z) {
                TranslateAnimation A0M2 = C36371kC.A0M();
                C89214Vr.A00(A0M2, r32, r9, 6);
                A0M2.setDuration(400);
                View view4 = r32.A01;
                C18740tg.A04(view4);
                view4.startAnimation(A0M2);
            } else {
                C36421kH.A0s(r32.A01);
                r32.A04.removeView(r32.A01);
                r32.A01 = null;
                r9.BYs();
            }
            r32.A03 = true;
            C80223v3.A02(r32.A07, r32, 43);
        } else if (this instanceof AnonymousClass2HO) {
            AnonymousClass2HO r33 = (AnonymousClass2HO) this;
            if (z) {
                TranslateAnimation A0M3 = C36371kC.A0M();
                C89214Vr.A00(A0M3, r33, r9, 5);
                A0M3.setDuration(400);
                View view5 = r33.A00;
                C18740tg.A04(view5);
                view5.startAnimation(A0M3);
                return;
            }
            C36421kH.A0s(r33.A00);
            r33.A04.removeView(r33.A00);
            r33.A00 = null;
            r9.BYs();
        } else {
            AnonymousClass2HL r5 = (AnonymousClass2HL) this;
            if (z) {
                if (r5.A01.BMF()) {
                    TranslateAnimation A0M4 = C36371kC.A0M();
                    A0M4.setDuration(220);
                    A0M4.setInterpolator(new AccelerateInterpolator());
                    r5.A01.startAnimation(A0M4);
                } else {
                    ArrayList A0I = AnonymousClass001.A0I();
                    ViewGroup viewGroup = r5.A01;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", new float[]{0.0f, -C36441kJ.A02(viewGroup)});
                    AnonymousClass00C.A0B(ofFloat);
                    A0I.add(ofFloat);
                    if (!(r5 instanceof AnonymousClass2HH) && (animator = (Animator) r5.A02.getValue()) != null) {
                        A0I.add(animator);
                    }
                    AnimatorSet A0C = C36441kJ.A0C();
                    A0C.playTogether(A0I);
                    A0C.addListener(new AnonymousClass4VE(r5, r9, 0));
                    A0C.setDuration(220).start();
                    return;
                }
            }
            AnonymousClass2HL.A02(r5, r9);
        }
    }

    public final void A0A(boolean z) {
        C62313Fr conversationBanners = ((C87694Pu) this.A01).getConversationBanners();
        Class<?> cls = getClass();
        AnonymousClass00C.A0D(cls, 0);
        C80183uz A002 = conversationBanners.A00.A00(cls);
        if (A002 != null && A002.equals(conversationBanners.A00())) {
            A002.A09(new C70393f5(A002, conversationBanners), z);
        }
    }

    public boolean A0B() {
        boolean z;
        C65073Qp A0Z;
        AnonymousClass3QL r0;
        int i;
        AnonymousClass141 A09;
        String str;
        if (this instanceof AnonymousClass2HI) {
            AnonymousClass2HI r2 = (AnonymousClass2HI) this;
            C65573Sp r4 = r2.A07;
            r4.A02("SurveyConversationBanner/canShow without jidFilter");
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("SurveyConversationBanner/canShow qp.IsNull=");
            z = true;
            A0u.append(AnonymousClass000.A1W(r2.A02));
            A0u.append(" surveyInfo.isNull=");
            String A0d = C36421kH.A0d(A0u, AnonymousClass000.A1W(r2.A01));
            AnonymousClass2aL r5 = r2.A08;
            UserJid userJid = r2.A09;
            C20810yC r3 = r2.A05;
            C53832rx.A00(r3, r4, r5, userJid, A0d);
            if (r2.A02 == null || r2.A01 == null) {
                C36331k8.A1F(new C49592jN(r3, r4, r5, userJid, r2.A0B, AnonymousClass001.A0F(r2)), r2.A0A);
                return false;
            }
        } else if (this instanceof AnonymousClass2HJ) {
            AnonymousClass2HJ r52 = (AnonymousClass2HJ) this;
            C220412q r22 = r52.A02;
            AnonymousClass141 r1 = r52.A03;
            C65073Qp A0W = C36371kC.A0W(r22, r1.A0H);
            if (A0W != null && (r1.A0H instanceof C28981Uw)) {
                C44072La r42 = (C44072La) A0W;
                if (!r42.A0L() || ((!r52.A04.A01.A0E(6146) && r42.A01 == (1 << C52432pQ.SUSPENSION.bitPosition)) || r42.A01 == 0)) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (this instanceof AnonymousClass2HK) {
            AnonymousClass2HK r6 = (AnonymousClass2HK) this;
            C65533Sl r02 = AnonymousClass147.A01;
            AnonymousClass147 A03 = C65533Sl.A03(r6.A06);
            if (!(A03 == null || (A09 = r6.A02.A09(A03)) == null)) {
                C20810yC r32 = r6.A05;
                if (AnonymousClass3M0.A00(A09, r32) && (str = A09.A0V) != null) {
                    long A002 = C19970wo.A00(r6.A03) - Long.parseLong(str);
                    if (A002 > TimeUnit.SECONDS.toMillis(C36441kJ.A0B(r32, 5016)) || A002 < TimeUnit.SECONDS.toMillis(C36441kJ.A0B(r32, 5119)) || ((A09.A13 && !r6.A04.A0D(A03)) || A09.A10 || !r32.A0E(5002))) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        } else {
            if (this instanceof AnonymousClass2HM) {
                AnonymousClass2HM r23 = (AnonymousClass2HM) this;
                AnonymousClass141 A07 = r23.A04.A07(r23.A02);
                if (A07 == null || A07.A0v) {
                    return false;
                }
                i = r23.A00;
            } else if (this instanceof AnonymousClass2HP) {
                AnonymousClass2HP r12 = (AnonymousClass2HP) this;
                if (r12.A08 != null) {
                    return true;
                }
                AnonymousClass3KV r03 = r12.A07;
                z = false;
                if (r03 != null) {
                    return true;
                }
            } else if (this instanceof AnonymousClass2HN) {
                AnonymousClass2HN r13 = (AnonymousClass2HN) this;
                if (r13.A02 == null || r13.A03) {
                    return false;
                }
                i = r13.A00;
            } else if (this instanceof AnonymousClass2HH) {
                AnonymousClass2HH r14 = (AnonymousClass2HH) this;
                boolean A012 = AnonymousClass2HH.A01(r14);
                List A0w = C36401kF.A0w(r14.A09.A00);
                if (A0w == null) {
                    A0w = C023409w.A00;
                }
                int size = A0w.size();
                int A072 = r14.A06.A07(7560);
                if (A072 < 1) {
                    A072 = 1;
                }
                boolean A1T = C36371kC.A1T(size, A072);
                if (!A012 || !A1T) {
                    return false;
                }
                return true;
            } else if (this instanceof AnonymousClass2HF) {
                return AnonymousClass000.A1V(((AnonymousClass2HF) this).A03.A01.A04());
            } else {
                if (this instanceof AnonymousClass2HG) {
                    AnonymousClass2HG r24 = (AnonymousClass2HG) this;
                    if (!r24.A05 || r24.A02.A04(C21100yf.A22) <= 0 || (A0Z = C36351kA.A0Z(r24.A04, C36411kG.A0h(r24.A00))) == null || !A0Z.A0p || (r0 = r24.A00.A0K) == null) {
                        return false;
                    }
                    z = true;
                    if (TextUtils.isEmpty(r0.A03)) {
                        return false;
                    }
                } else if (this instanceof AnonymousClass2HE) {
                    AnonymousClass2HE r25 = (AnonymousClass2HE) this;
                    if (C36371kC.A1U(C36341k9.A0E(r25.A02), "cag_replies_promotion_banner_closed")) {
                        return false;
                    }
                    C20810yC r26 = r25.A03;
                    if (!r26.A0E(5656)) {
                        return false;
                    }
                    z = true;
                    if (!C20800yB.A01(C21000yV.A01, r26, 4727)) {
                        return false;
                    }
                } else {
                    AnonymousClass2HO r53 = (AnonymousClass2HO) this;
                    if (r53.A0A || r53.A0B) {
                        return false;
                    }
                    Class<UserJid> cls = UserJid.class;
                    C65073Qp A0W2 = C36371kC.A0W(r53.A07.A02, (AnonymousClass11F) C36381kD.A0e(r53.A01, cls));
                    if (A0W2 == null || A0W2.A0C == -1 || r53.A02 == null || C36381kD.A0e(r53.A01, cls).equals(r53.A02)) {
                        return false;
                    }
                    z = true;
                    if (r53.A06.A0D(r53.A02).A0F != null) {
                        return false;
                    }
                }
            }
            z = true;
            if (i <= 0) {
                return false;
            }
        }
        return z;
    }

    public final boolean A0C() {
        return C36361kB.A1a(((C87694Pu) this.A01).getConversationBanners().A00(), this);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.A00, ((C80183uz) obj).A00);
    }

    public C80183uz(AnonymousClass4V7 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
