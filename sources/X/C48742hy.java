package X;

import android.view.View;

/* renamed from: X.2hy  reason: invalid class name and case insensitive filesystem */
public class C48742hy extends C33541fX {
    public Object A00;
    public final int A01;

    public C48742hy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static C48742hy A00(Object obj, int i) {
        return new C48742hy(obj, i);
    }

    public static void A01(View view, Object obj, int i) {
        view.setOnClickListener(new C48742hy(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0647, code lost:
        ((androidx.fragment.app.DialogFragment) r0).A1b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x064c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0653, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0655, code lost:
        X.C36391kE.A1K(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0658, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06e0, code lost:
        ((X.AnonymousClass2IR) r6.A00).A1f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x06e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:493:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r22) {
        /*
            r21 = this;
            r7 = r22
            r6 = r21
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0044;
                case 1: goto L_0x008b;
                case 2: goto L_0x0665;
                case 3: goto L_0x0692;
                case 4: goto L_0x0692;
                case 5: goto L_0x06a0;
                case 6: goto L_0x06a8;
                case 7: goto L_0x00b8;
                case 8: goto L_0x06e0;
                case 9: goto L_0x00d9;
                case 10: goto L_0x06b7;
                case 11: goto L_0x06d1;
                case 12: goto L_0x0140;
                case 13: goto L_0x0162;
                case 14: goto L_0x0195;
                case 15: goto L_0x06e8;
                case 16: goto L_0x01bf;
                case 17: goto L_0x06e0;
                case 18: goto L_0x0732;
                case 19: goto L_0x01f0;
                case 20: goto L_0x0211;
                case 21: goto L_0x0038;
                case 22: goto L_0x079c;
                case 23: goto L_0x07e1;
                case 24: goto L_0x080b;
                case 25: goto L_0x0817;
                case 26: goto L_0x0832;
                case 27: goto L_0x0324;
                case 28: goto L_0x033a;
                case 29: goto L_0x0354;
                case 30: goto L_0x036a;
                case 31: goto L_0x03b8;
                case 32: goto L_0x003c;
                case 33: goto L_0x03d8;
                case 34: goto L_0x084b;
                case 35: goto L_0x03e0;
                case 36: goto L_0x0853;
                case 37: goto L_0x0881;
                case 38: goto L_0x0892;
                case 39: goto L_0x055a;
                case 40: goto L_0x0619;
                case 41: goto L_0x064d;
                case 42: goto L_0x08ae;
                case 43: goto L_0x0659;
                case 44: goto L_0x08b8;
                case 45: goto L_0x08c0;
                case 46: goto L_0x08e0;
                case 47: goto L_0x08e9;
                case 48: goto L_0x08f2;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r3 = r6.A00
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.1EV r1 = r3.A1f
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0037
            X.1EU r0 = r3.A1g
            X.B66 r0 = r0.A05()
            java.lang.Class r0 = r0.BFV()
            if (r0 == 0) goto L_0x0037
            android.content.Intent r2 = X.C36441kJ.A0H(r3, r0)
            X.141 r0 = r3.A0y
            X.11F r0 = r0.A0H
            java.lang.String r1 = X.AnonymousClass143.A03(r0)
            java.lang.String r0 = "extra_jid"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            r3.startActivity(r0)
        L_0x0037:
            return
        L_0x0038:
            java.lang.Object r0 = r6.A00
            goto L_0x0647
        L_0x003c:
            java.lang.Object r0 = r6.A00
            com.whatsapp.emoji.search.EmojiSearchContainer r0 = (com.whatsapp.emoji.search.EmojiSearchContainer) r0
            com.whatsapp.InterceptingEditText r0 = r0.A04
            goto L_0x0655
        L_0x0044:
            java.lang.Object r4 = r6.A00
            X.2IC r4 = (X.AnonymousClass2IC) r4
            java.util.List r0 = r4.A08
            java.util.Iterator r3 = r0.iterator()
        L_0x004e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0037
            X.2bU r2 = X.C36441kJ.A0r(r3)
            boolean r0 = X.AnonymousClass2tU.A00(r2)
            if (r0 == 0) goto L_0x0071
            X.3P3 r0 = r4.A06
            X.C18740tg.A06(r0)
            java.util.Map r0 = r0.A03
            java.lang.Object r0 = r0.get(r2)
            X.4xO r0 = (X.C101344xO) r0
            if (r0 == 0) goto L_0x004e
            r0.cancel()
            goto L_0x004e
        L_0x0071:
            X.3Qj r0 = X.AnonymousClass2bU.A00(r2)
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x004e
            X.3Qa r0 = r2.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0085
            X.1Y4 r1 = r4.A04
            r0 = 0
            r1.A08(r2, r0)
        L_0x0085:
            X.1ST r0 = r4.A05
            r0.A0E(r2)
            goto L_0x004e
        L_0x008b:
            java.lang.Object r4 = r6.A00
            X.2IC r4 = (X.AnonymousClass2IC) r4
            java.util.List r0 = r4.A08
            java.util.Iterator r3 = r0.iterator()
        L_0x0095:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0037
            X.2bU r2 = X.C36441kJ.A0r(r3)
            X.3Qj r1 = X.AnonymousClass2bU.A00(r2)
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x0095
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x0095
            boolean r0 = X.C54732tQ.A00(r2)
            if (r0 != 0) goto L_0x0095
            X.1XY r1 = r4.A0U
            r0 = 1
            r1.A06(r2, r0, r0)
            goto L_0x0095
        L_0x00b8:
            java.lang.Object r1 = r6.A00
            X.2IQ r1 = (X.AnonymousClass2IQ) r1
            X.2bU r2 = r1.getFMessage()
            boolean r0 = X.AnonymousClass2tU.A00(r2)
            if (r0 == 0) goto L_0x090c
            X.3P3 r0 = r1.A06
            X.C18740tg.A06(r0)
            java.util.Map r0 = r0.A03
            java.lang.Object r0 = r0.get(r2)
            X.4xO r0 = (X.C101344xO) r0
            if (r0 == 0) goto L_0x0037
            r0.cancel()
            return
        L_0x00d9:
            java.lang.Object r7 = r6.A00
            X.8ZK r7 = (X.AnonymousClass8ZK) r7
            X.2bP r1 = r7.getFMessage()
            X.1Uw r8 = r1.A01
            if (r8 == 0) goto L_0x0037
            java.lang.String r9 = r1.A03
            if (r9 == 0) goto L_0x0037
            X.2bP r0 = r7.getFMessage()
            X.3Qa r0 = r0.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0923
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            X.2bP r0 = r7.getFMessage()
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            com.whatsapp.jid.UserJid r5 = X.C222813r.A00(r0)
            if (r5 == 0) goto L_0x0037
            long r1 = r1.A00
            X.005 r0 = r7.A28
            java.lang.Object r3 = r0.get()
            X.0y9 r3 = (X.C20780y9) r3
            java.lang.Class<X.0xt> r0 = X.C20640xt.class
            r3.A01(r0)
            com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet r4 = new com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet
            r4.<init>()
            android.os.Bundle r3 = X.AnonymousClass001.A07()
            java.lang.String r0 = "newsletter_jid"
            X.C36401kF.A14(r3, r8, r0)
            java.lang.String r0 = "arg_contact_jid"
            X.C36401kF.A14(r3, r5, r0)
            java.lang.String r0 = "newsletter_name"
            r3.putString(r0, r9)
            java.lang.String r0 = "invite_expiration_ts"
            r3.putLong(r0, r1)
            r4.A17(r3)
            android.content.Context r0 = r7.getContext()
            X.14u r0 = X.C225314u.A0N(r0)
            if (r0 == 0) goto L_0x0037
            r0.Btm(r4)
            return
        L_0x0140:
            java.lang.Object r3 = r6.A00
            X.3Sw r3 = (X.C65633Sw) r3
            X.2bU r2 = r3.A00
            X.3Qj r0 = X.AnonymousClass2bU.A00(r2)
            boolean r0 = r0.A0f
            if (r0 == 0) goto L_0x0037
            X.3Qa r0 = r2.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x015a
            X.1Y4 r1 = r3.A0D
            r0 = 0
            r1.A08(r2, r0)
        L_0x015a:
            X.1ST r1 = r3.A0E
            X.2bU r0 = r3.A00
            r1.A0E(r0)
            return
        L_0x0162:
            java.lang.Object r4 = r6.A00
            X.3Sw r4 = (X.C65633Sw) r4
            X.2bU r2 = r4.A00
            X.3Qj r1 = X.AnonymousClass2bU.A00(r2)
            boolean r0 = r1.A0V
            if (r0 == 0) goto L_0x0174
            boolean r0 = r1.A0c
            if (r0 == 0) goto L_0x0037
        L_0x0174:
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x0037
            boolean r0 = r2.A1h()
            if (r0 == 0) goto L_0x0037
            int r0 = r1.A09
            r3 = 1
            if (r0 == r3) goto L_0x0037
            r4.A02 = r3
            X.1X4 r2 = r4.A0B
            android.view.View r0 = r4.A08
            android.app.Activity r1 = X.C36361kB.A06(r0)
            X.14u r1 = (X.C225314u) r1
            X.2bU r0 = r4.A00
            r2.A0G(r1, r0, r3)
            return
        L_0x0195:
            java.lang.Object r3 = r6.A00
            X.3Sw r3 = (X.C65633Sw) r3
            X.0yE r2 = r3.A0C
            if (r2 == 0) goto L_0x01aa
            android.content.Context r1 = r7.getContext()
            X.3US r0 = com.whatsapp.RequestPermissionActivity.A0B
            boolean r0 = r0.A0J(r1, r2)
            if (r0 != 0) goto L_0x01aa
            return
        L_0x01aa:
            X.2bU r2 = r3.A00
            X.3Qj r1 = X.AnonymousClass2bU.A00(r2)
            boolean r0 = r1.A0V
            if (r0 != 0) goto L_0x0037
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x0037
            X.1XY r1 = r3.A0A
            r0 = 1
            r1.A06(r2, r0, r0)
            return
        L_0x01bf:
            java.lang.Object r3 = r6.A00
            X.2IO r3 = (X.AnonymousClass2IO) r3
            X.8o3 r1 = r3.getFMessage()
            X.3Qj r0 = X.AnonymousClass2bU.A00(r1)
            int r0 = r0.A09
            r2 = 1
            if (r0 != r2) goto L_0x01d9
            X.17Y r1 = r3.A0R
            r0 = 2131889808(0x7f120e90, float:1.941429E38)
            r1.A04(r0, r2)
            return
        L_0x01d9:
            X.1fX r0 = r3.A09
            r0.A02(r7)
            boolean r0 = r1.A1h()
            if (r0 == 0) goto L_0x0037
            X.0yC r0 = r3.A0G
            boolean r0 = X.C65703Td.A01(r0, r1)
            if (r0 == 0) goto L_0x09a2
            X.AnonymousClass2IO.A0D(r3)
            return
        L_0x01f0:
            java.lang.Object r6 = r6.A00
            X.3AE r6 = (X.AnonymousClass3AE) r6
            X.1sS r3 = r6.A03
            X.6tS r0 = r3.A01
            if (r0 == 0) goto L_0x0037
            X.36r r0 = r0.A05
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x09a8
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x09a8
            return
        L_0x0211:
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            java.lang.Object r6 = r6.A00
            X.2Ka r6 = (X.C43842Ka) r6
            boolean r0 = r7 instanceof com.whatsapp.reactions.ReactionEmojiTextView
            if (r0 != 0) goto L_0x0223
            java.lang.String r1 = "Given view is not ReactionEmojiTextView."
            r0 = 0
            X.C18740tg.A0D(r0, r1)
        L_0x0223:
            com.whatsapp.reactions.ReactionEmojiTextView r7 = (com.whatsapp.reactions.ReactionEmojiTextView) r7
            android.animation.AnimatorSet r0 = r6.A01
            if (r0 != 0) goto L_0x022f
            android.animation.AnimatorSet r0 = X.C36441kJ.A0C()
            r6.A01 = r0
        L_0x022f:
            r1 = 1
            r4 = 0
            boolean r0 = r0.isRunning()
            if (r0 != r1) goto L_0x023e
            android.animation.AnimatorSet r0 = r6.A01
            if (r0 == 0) goto L_0x023e
            r0.cancel()
        L_0x023e:
            int r3 = r6.getChildCount()
        L_0x0242:
            if (r4 >= r3) goto L_0x026a
            android.view.View r2 = r6.getChildAt(r4)
            boolean r0 = r2 instanceof com.whatsapp.reactions.ReactionEmojiTextView
            if (r0 == 0) goto L_0x0267
            com.whatsapp.reactions.ReactionEmojiTextView r2 = (com.whatsapp.reactions.ReactionEmojiTextView) r2
            if (r2 == 0) goto L_0x0267
            boolean r0 = r2.isSelected()
            if (r0 == 0) goto L_0x0267
            boolean r0 = r2.equals(r7)
            if (r0 != 0) goto L_0x0267
            android.animation.AnimatorSet r1 = r6.A01
            if (r1 == 0) goto L_0x0267
            android.animation.AnimatorSet r0 = X.C43842Ka.A00(r6, r2)
            r1.play(r0)
        L_0x0267:
            int r4 = r4 + 1
            goto L_0x0242
        L_0x026a:
            boolean r0 = r7.isSelected()
            android.animation.AnimatorSet r5 = r6.A01
            if (r0 == 0) goto L_0x0290
            if (r5 == 0) goto L_0x027b
            android.animation.AnimatorSet r4 = X.C43842Ka.A00(r6, r7)
        L_0x0278:
            r5.play(r4)
        L_0x027b:
            android.animation.AnimatorSet r2 = r6.A01
            if (r2 == 0) goto L_0x0288
            r1 = 2
            X.4VE r0 = new X.4VE
            r0.<init>(r6, r7, r1)
            r2.addListener(r0)
        L_0x0288:
            android.animation.AnimatorSet r0 = r6.A01
            if (r0 == 0) goto L_0x0037
            r0.start()
            return
        L_0x0290:
            if (r5 == 0) goto L_0x027b
            r6.getSystemFeatures()
            android.animation.AnimatorSet r4 = X.C36441kJ.A0C()
            r8 = 1065353216(0x3f800000, float:1.0)
            r10 = 1060320051(0x3f333333, float:0.7)
            r0 = 80
            r2 = 2
            float[] r3 = new float[r2]
            r2 = 0
            r3[r2] = r8
            r2 = 1
            r3[r2] = r10
            java.lang.String r13 = "foregroundScale"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r7, r13, r3)
            android.animation.ObjectAnimator r9 = r2.setDuration(r0)
            X.AnonymousClass00C.A08(r9)
            android.view.animation.Interpolator r11 = X.C56812wv.A01
            r9.setInterpolator(r11)
            r8 = 2
            X.4VD r0 = new X.4VD
            r0.<init>(r7, r10, r8)
            r9.addListener(r0)
            android.animation.Animator[] r12 = new android.animation.Animator[r8]
            r14 = 0
            r12[r14] = r9
            r2 = 1060320051(0x3f333333, float:0.7)
            r10 = 1065353216(0x3f800000, float:1.0)
            r0 = 80
            float[] r3 = new float[r8]
            r3[r14] = r2
            r2 = 1
            r3[r2] = r10
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r7, r13, r3)
            android.animation.ObjectAnimator r1 = r2.setDuration(r0)
            X.AnonymousClass00C.A08(r1)
            r1.setInterpolator(r11)
            X.4VD r0 = new X.4VD
            r0.<init>(r7, r10, r8)
            r1.addListener(r0)
            r11 = 1
            r12[r11] = r1
            r4.playSequentially(r12)
            r0 = 0
            r2 = 250(0xfa, double:1.235E-321)
            float[] r1 = new float[r8]
            r1[r14] = r0
            r1[r11] = r10
            java.lang.String r0 = "backgroundScale"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r0, r1)
            android.animation.ObjectAnimator r1 = r0.setDuration(r2)
            X.AnonymousClass00C.A08(r1)
            X.4VD r0 = new X.4VD
            r0.<init>(r7, r10, r11)
            r1.addListener(r0)
            android.view.animation.Interpolator r0 = X.C65753Ti.A00
            r1.setInterpolator(r0)
            android.animation.Animator[] r0 = X.C36441kJ.A1P(r9, r1, r8)
            r4.playTogether(r0)
            r0 = 10
            X.AnonymousClass4VL.A00(r4, r7, r0)
            goto L_0x0278
        L_0x0324:
            java.lang.Object r3 = r6.A00
            X.3H8 r3 = (X.AnonymousClass3H8) r3
            X.4QD r2 = r3.A02
            r1 = 3
            if (r2 == 0) goto L_0x0336
            X.2M8 r2 = (X.AnonymousClass2M8) r2
            int r0 = r2.A00
            if (r0 == r1) goto L_0x0037
            X.AnonymousClass2M8.A05(r2, r1)
        L_0x0336:
            r3.A00()
            return
        L_0x033a:
            java.lang.Object r0 = r6.A00
            X.39w r0 = (X.C609239w) r0
            X.4QD r1 = r0.A00
            java.lang.String r0 = "customPopUpWindowListener"
            if (r1 != 0) goto L_0x0349
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0349:
            X.2M8 r1 = (X.AnonymousClass2M8) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0037
            r0 = 0
            X.AnonymousClass2M8.A05(r1, r0)
            return
        L_0x0354:
            java.lang.Object r3 = r6.A00
            X.3mU r3 = (X.C74983mU) r3
            X.4QD r2 = r3.A00
            r1 = 1
            if (r2 == 0) goto L_0x0366
            X.2M8 r2 = (X.AnonymousClass2M8) r2
            int r0 = r2.A00
            if (r0 == r1) goto L_0x0037
            X.AnonymousClass2M8.A05(r2, r1)
        L_0x0366:
            r3.A00()
            return
        L_0x036a:
            java.lang.Object r3 = r6.A00
            X.3HE r3 = (X.AnonymousClass3HE) r3
            X.4QD r2 = r3.A01
            X.2M8 r2 = (X.AnonymousClass2M8) r2
            int r1 = r2.A00
            r0 = 2
            if (r1 == r0) goto L_0x0037
            X.AnonymousClass2M8.A05(r2, r0)
            X.4QD r0 = r3.A01
            X.22t r0 = (X.AnonymousClass22t) r0
            r0.A0F()
            X.399 r0 = r3.A02
            X.00T r0 = r0.A01
            android.view.View r0 = X.C36401kF.A0F(r0)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0037
            X.3BO r0 = r3.A06
            X.0v0 r0 = r0.A04
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "sticker_store_onboarding_badge_shown"
            X.C36331k8.A0w(r1, r0, r2)
            X.399 r0 = r3.A02
            r1 = 8
            X.00T r0 = r0.A01
            X.C36341k9.A1R(r0, r1)
            X.399 r0 = r3.A02
            X.00T r0 = r0.A01
            android.view.View r0 = X.C36401kF.A0F(r0)
            android.view.animation.Animation r0 = r0.getAnimation()
            if (r0 == 0) goto L_0x0037
            r0.cancel()
            return
        L_0x03b8:
            java.lang.Object r2 = r6.A00
            X.22t r2 = (X.AnonymousClass22t) r2
            X.4QT r0 = r2.A0A
            if (r0 == 0) goto L_0x03c7
            boolean r0 = r0.BM4()
            if (r0 != 0) goto L_0x03c7
            return
        L_0x03c7:
            r2.BoZ()
            com.whatsapp.emoji.search.EmojiSearchProvider r1 = r2.A0M
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0037
            X.3E4 r0 = r2.A0B
            if (r0 == 0) goto L_0x0037
            r0.A00(r1)
            return
        L_0x03d8:
            java.lang.Object r0 = r6.A00
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r0
            com.whatsapp.InterceptingEditText r0 = r0.A04
            goto L_0x0653
        L_0x03e0:
            java.lang.Object r3 = r6.A00
            com.whatsapp.events.EventCreateOrEditFragment r3 = (com.whatsapp.events.EventCreateOrEditFragment) r3
            X.1us r0 = r3.A0H
            r2 = 0
            if (r0 != 0) goto L_0x03f0
            java.lang.String r0 = "eventCreateOrEditViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03f0:
            com.whatsapp.WaEditText r1 = r3.A06
            if (r1 == 0) goto L_0x0557
            android.text.Editable r1 = r1.getText()
        L_0x03f8:
            java.lang.String r4 = java.lang.String.valueOf(r1)
            X.00T r1 = r3.A0Y
            java.lang.Object r1 = X.C36381kD.A0p(r1)
            java.util.Calendar r1 = (java.util.Calendar) r1
            java.util.Date r1 = r1.getTime()
            long r16 = r1.getTime()
            com.whatsapp.WaEditText r1 = r3.A04
            if (r1 == 0) goto L_0x0414
            android.text.Editable r2 = r1.getText()
        L_0x0414:
            java.lang.String r3 = java.lang.String.valueOf(r2)
            X.05K r7 = r0.A0F
            java.lang.Object r1 = r7.getValue()
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            X.2oU r2 = r1.A00
            X.2oU r1 = X.C51852oU.LOADING
            if (r2 != r1) goto L_0x0438
            X.2nW r3 = X.C51252nW.ERROR
            r1 = 2131889375(0x7f120cdf, float:1.9413412E38)
        L_0x042b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            X.3IN r2 = new X.3IN
            r2.<init>(r3, r1)
        L_0x0434:
            X.C40071us.A03(r2, r0)
            return
        L_0x0438:
            r1 = 0
            java.lang.String r15 = X.AnonymousClass6YV.A0B(r4, r1)
            X.AnonymousClass00C.A08(r15)
            java.lang.String r11 = X.AnonymousClass6YV.A0B(r3, r1)
            X.AnonymousClass00C.A08(r11)
            int r1 = r15.length()
            r2 = 2
            r3 = 0
            if (r1 != 0) goto L_0x0455
            X.2nW r3 = X.C51252nW.ERROR
            r1 = 2131889399(0x7f120cf7, float:1.941346E38)
            goto L_0x042b
        L_0x0455:
            X.0wo r4 = r0.A03
            long r5 = X.C19970wo.A00(r4)
            int r1 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0465
            X.2nW r3 = X.C51252nW.ERROR
            r1 = 2131889420(0x7f120d0c, float:1.9413503E38)
            goto L_0x042b
        L_0x0465:
            java.lang.Object r1 = r7.getValue()
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            X.2oU r1 = r1.A00
            int r1 = r1.ordinal()
            r6 = 0
            if (r1 != r2) goto L_0x0554
            java.lang.Object r1 = r7.getValue()
            X.3Q2 r1 = (X.AnonymousClass3Q2) r1
            java.lang.String r12 = r1.A02
        L_0x047c:
            X.2nV r1 = r0.A08
            int r2 = r1.ordinal()
            r1 = 1
            if (r2 == r3) goto L_0x04ef
            if (r2 != r1) goto L_0x04de
            X.2bT r1 = X.C40071us.A01(r0)
            if (r1 == 0) goto L_0x0037
            boolean r2 = r1.A06
            if (r2 != 0) goto L_0x09cf
            X.05K r5 = r0.A0G
            java.lang.Object r2 = r5.getValue()
            X.3QB r2 = (X.AnonymousClass3QB) r2
            X.2nz r3 = r2.A02
            X.2nz r2 = X.C51542nz.DELETED
            if (r3 == r2) goto L_0x09cf
            X.1X4 r2 = r0.A01
            long r18 = X.C19970wo.A00(r4)
            X.1Xa r7 = r0.A07
            X.11F r8 = r0.A09
            com.whatsapp.location.PlaceInfo r3 = X.AnonymousClass3QB.A00(r5)
            if (r3 == 0) goto L_0x04ed
            double r3 = r3.A01
            java.lang.Double r9 = java.lang.Double.valueOf(r3)
        L_0x04b5:
            com.whatsapp.location.PlaceInfo r3 = X.AnonymousClass3QB.A00(r5)
            if (r3 == 0) goto L_0x04eb
            double r3 = r3.A02
            java.lang.Double r10 = java.lang.Double.valueOf(r3)
        L_0x04c1:
            com.whatsapp.location.PlaceInfo r3 = X.AnonymousClass3QB.A00(r5)
            if (r3 == 0) goto L_0x04e9
            java.lang.String r14 = r3.A06
        L_0x04c9:
            com.whatsapp.location.PlaceInfo r3 = X.AnonymousClass3QB.A00(r5)
            if (r3 == 0) goto L_0x04e7
            java.lang.String r13 = r3.A04
        L_0x04d1:
            r20 = 0
            X.2bT r5 = X.C54222sb.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20)
            X.0wU r4 = r2.A1J
            r3 = 8
            X.C36371kC.A1Q(r4, r2, r5, r1, r3)
        L_0x04de:
            X.2nW r1 = X.C51252nW.SUCCESS
            X.3IN r2 = new X.3IN
            r2.<init>(r1, r6)
            goto L_0x0434
        L_0x04e7:
            r13 = r6
            goto L_0x04d1
        L_0x04e9:
            r14 = r6
            goto L_0x04c9
        L_0x04eb:
            r10 = r6
            goto L_0x04c1
        L_0x04ed:
            r9 = r6
            goto L_0x04b5
        L_0x04ef:
            X.1X4 r1 = r0.A01
            long r18 = X.C19970wo.A00(r4)
            X.1Xa r7 = r0.A07
            X.11F r8 = r0.A09
            X.05K r4 = r0.A0G
            com.whatsapp.location.PlaceInfo r2 = X.AnonymousClass3QB.A00(r4)
            if (r2 == 0) goto L_0x054e
            double r2 = r2.A01
            java.lang.Double r9 = java.lang.Double.valueOf(r2)
        L_0x0507:
            com.whatsapp.location.PlaceInfo r2 = X.AnonymousClass3QB.A00(r4)
            if (r2 == 0) goto L_0x054c
            double r2 = r2.A02
            java.lang.Double r10 = java.lang.Double.valueOf(r2)
        L_0x0513:
            com.whatsapp.location.PlaceInfo r2 = X.AnonymousClass3QB.A00(r4)
            if (r2 == 0) goto L_0x054a
            java.lang.String r14 = r2.A06
        L_0x051b:
            com.whatsapp.location.PlaceInfo r2 = X.AnonymousClass3QB.A00(r4)
            if (r2 == 0) goto L_0x0548
            java.lang.String r13 = r2.A04
        L_0x0523:
            long r2 = r0.A00
            X.1Xa r4 = r1.A0i
            boolean r4 = r4.A05(r8)
            if (r4 == 0) goto L_0x04de
            r20 = 0
            X.2bT r9 = X.C54222sb.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20)
            r7 = 0
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0550
            X.0wU r5 = r1.A1J
            X.735 r4 = new X.735
            r10 = 0
            r7 = r4
            r8 = r1
            r11 = r2
            r7.<init>(r8, r9, r10, r11)
            r5.Boy(r4)
            goto L_0x04de
        L_0x0548:
            r13 = r6
            goto L_0x0523
        L_0x054a:
            r14 = r6
            goto L_0x051b
        L_0x054c:
            r10 = r6
            goto L_0x0513
        L_0x054e:
            r9 = r6
            goto L_0x0507
        L_0x0550:
            X.C36401kF.A1E(r1, r9)
            goto L_0x04de
        L_0x0554:
            r12 = r6
            goto L_0x047c
        L_0x0557:
            r1 = r2
            goto L_0x03f8
        L_0x055a:
            java.lang.Object r3 = r6.A00
            X.2M8 r3 = (X.AnonymousClass2M8) r3
            int r0 = r3.A00
            if (r0 != 0) goto L_0x056d
            X.4QT r0 = r3.A0A
            if (r0 == 0) goto L_0x056d
            boolean r0 = r0.BM4()
            if (r0 != 0) goto L_0x056d
            return
        L_0x056d:
            r3.BoZ()
            int r0 = r3.A00
            if (r0 != 0) goto L_0x0581
            com.whatsapp.emoji.search.EmojiSearchProvider r1 = r3.A0M
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0581
            X.3E4 r0 = r3.A0B
            if (r0 == 0) goto L_0x0581
            r0.A00(r1)
        L_0x0581:
            int r1 = r3.A00
            r0 = 1
            if (r1 == r0) goto L_0x05ce
            r0 = 2
            if (r1 == r0) goto L_0x058d
            r0 = 3
            if (r1 == r0) goto L_0x058d
            return
        L_0x058d:
            X.3HE r5 = r3.A0D
            if (r5 == 0) goto L_0x0037
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r3.A0M
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0037
            X.3rU r0 = r5.A03
            if (r0 == 0) goto L_0x0037
            X.5H9 r4 = r5.A05
            if (r4 == 0) goto L_0x05b9
            X.3rU r3 = r4.A07
            if (r3 == 0) goto L_0x05b9
            X.5Kv r0 = r4.A0A
            r2 = 0
            if (r0 == 0) goto L_0x05cc
            java.util.List r1 = r0.A06
        L_0x05aa:
            X.5Kt r0 = r4.A0B
            if (r0 == 0) goto L_0x05b0
            java.util.List r2 = r0.A02
        L_0x05b0:
            X.6Xz r0 = r4.A0c
            java.util.ArrayList r0 = r0.A03(r1, r2)
            r3.A03(r0)
        L_0x05b9:
            X.3rU r3 = r5.A03
            X.15D r1 = r3.A02
            if (r1 == 0) goto L_0x0037
            X.2M8 r0 = r3.A00
            if (r0 == 0) goto L_0x0037
            r0 = 1
            r3.A07 = r0
            com.whatsapp.picker.search.StickerSearchDialogFragment r0 = new com.whatsapp.picker.search.StickerSearchDialogFragment
            r0.<init>()
            goto L_0x05f0
        L_0x05cc:
            r1 = r2
            goto L_0x05aa
        L_0x05ce:
            X.3mU r2 = r3.A0C
            if (r2 == 0) goto L_0x0037
            X.0yf r1 = r3.A09
            X.0yi r0 = X.C21100yf.A0y
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x05fd
            X.3rU r3 = r2.A04
            if (r3 == 0) goto L_0x05fd
            X.15D r1 = r3.A02
            if (r1 == 0) goto L_0x0037
            X.2M8 r0 = r3.A00
            if (r0 == 0) goto L_0x0037
            r0 = 1
            r3.A07 = r0
            com.whatsapp.picker.search.GifSearchDialogFragment r0 = new com.whatsapp.picker.search.GifSearchDialogFragment
            r0.<init>()
        L_0x05f0:
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r1.Btk(r0)
            X.2M8 r0 = r3.A00
            if (r0 == 0) goto L_0x0037
            r0.dismiss()
            return
        L_0x05fd:
            X.36s r5 = r2.A02
            if (r5 == 0) goto L_0x0037
            X.3L7 r4 = r2.A07
            X.2M8 r1 = r5.A01
            com.whatsapp.WaEditText r0 = r1.A0L
            r1.A0B(r0)
            X.2MC r3 = r5.A02
            com.whatsapp.gifsearch.GifSearchContainer r2 = r3.A02
            android.app.Activity r1 = r5.A00
            X.3mT r0 = new X.3mT
            r0.<init>(r3, r4)
            r2.A02(r1, r3, r4, r0)
            return
        L_0x0619:
            java.lang.Object r2 = r6.A00
            com.whatsapp.gifsearch.GifSearchContainer r2 = (com.whatsapp.gifsearch.GifSearchContainer) r2
            X.3J6 r0 = r2.A0A
            if (r0 == 0) goto L_0x0625
            r0.A03()
            return
        L_0x0625:
            com.whatsapp.WaEditText r1 = r2.A06
            if (r1 == 0) goto L_0x0630
            X.1N2 r0 = r2.getImeUtils()
            r0.A01(r1)
        L_0x0630:
            r0 = 8
            r2.setVisibility(r0)
            X.3L7 r1 = r2.A0F
            if (r1 == 0) goto L_0x0640
            X.0yW r0 = r2.getWamRuntime()
            X.C54402st.A00(r0, r1)
        L_0x0640:
            r0 = 0
            r2.A0F = r0
            X.4O7 r0 = r2.A0E
            if (r0 == 0) goto L_0x0037
        L_0x0647:
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1b()
            return
        L_0x064d:
            java.lang.Object r0 = r6.A00
            com.whatsapp.gifsearch.GifSearchContainer r0 = (com.whatsapp.gifsearch.GifSearchContainer) r0
            com.whatsapp.WaEditText r0 = r0.A06
        L_0x0653:
            if (r0 == 0) goto L_0x0037
        L_0x0655:
            X.C36391kE.A1K(r0)
            return
        L_0x0659:
            java.lang.Object r0 = r6.A00
            com.whatsapp.glasses.BluetoothPermissionDialogFragment r0 = (com.whatsapp.glasses.BluetoothPermissionDialogFragment) r0
            android.app.Dialog r0 = r0.A00
            if (r0 == 0) goto L_0x0037
            r0.dismiss()
            return
        L_0x0665:
            java.lang.Object r6 = r6.A00
            X.2IC r6 = (X.AnonymousClass2IC) r6
            r5 = 1
            X.3E2 r4 = r6.A02
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.List r0 = r6.A08
            java.util.Iterator r2 = r0.iterator()
        L_0x0676:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x068a
            X.2bU r1 = X.C36441kJ.A0r(r2)
            boolean r0 = X.AnonymousClass2IC.A0D(r6, r1)
            if (r0 != 0) goto L_0x0676
            r3.add(r1)
            goto L_0x0676
        L_0x068a:
            android.content.Context r0 = r6.getContext()
            r4.A00(r0, r3, r5)
            return
        L_0x0692:
            java.lang.Object r0 = r6.A00
            X.2IR r0 = (X.AnonymousClass2IR) r0
            X.1X4 r1 = r0.A0Z
            X.3T1 r0 = r0.A0K
            X.2bL r0 = (X.AnonymousClass2bL) r0
            r1.A0a(r0)
            return
        L_0x06a0:
            java.lang.Object r0 = r6.A00
            X.2IQ r0 = (X.AnonymousClass2IQ) r0
            r0.A2F()
            return
        L_0x06a8:
            java.lang.Object r0 = r6.A00
            X.2IQ r0 = (X.AnonymousClass2IQ) r0
            X.1XY r2 = r0.A0U
            X.2bU r1 = r0.getFMessage()
            r0 = 1
            r2.A06(r1, r0, r0)
            return
        L_0x06b7:
            java.lang.Object r2 = r6.A00
            X.8ZY r2 = (X.AnonymousClass8ZY) r2
            android.view.animation.Interpolator r0 = X.AnonymousClass8ZY.A0b
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r1 = r2.A0O
            r0 = 1
            r1.setPlayWhenReadyAndActive(r0)
            X.34K r1 = r2.A03
            X.3T1 r0 = r2.A0K
            X.2bU r0 = (X.AnonymousClass2bU) r0
            X.3Qa r0 = r0.A1J
            r1.A00 = r0
            r2.A2F()
            return
        L_0x06d1:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 27
            if (r1 < r0) goto L_0x06e0
            java.lang.Object r1 = r6.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.performHapticFeedback(r0)
        L_0x06e0:
            java.lang.Object r0 = r6.A00
            X.2IR r0 = (X.AnonymousClass2IR) r0
            r0.A1f()
            return
        L_0x06e8:
            java.lang.Object r7 = r6.A00
            X.3Sw r7 = (X.C65633Sw) r7
            X.2bU r2 = r7.A00
            X.2bx r2 = (X.C46962bx) r2
            X.1Ap r0 = r7.A0F
            X.6c4 r6 = r0.A00(r2)
            com.whatsapp.stickers.StickerView r1 = r7.A0G
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x06ff
            r1.A05()
        L_0x06ff:
            X.3Qa r1 = r2.A1J
            X.11F r0 = r1.A00
            java.lang.String r5 = X.C36381kD.A0w(r0)
            X.336 r0 = r7.A0H
            boolean r4 = r1.A02
            X.2pV r3 = X.C52482pV.MESSAGE
            r2 = 0
            X.0yC r1 = r0.A00
            r0 = 7678(0x1dfe, float:1.0759E-41)
            boolean r0 = X.AnonymousClass1Ax.A03(r1, r0)
            if (r0 == 0) goto L_0x072a
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r1 = X.C55552uo.A00(r6, r3, r5, r4, r2)
        L_0x071c:
            android.view.View r0 = r7.A08
            android.content.Context r0 = r0.getContext()
            X.14u r0 = X.C36381kD.A0S(r0)
            r0.Btm(r1)
            return
        L_0x072a:
            com.whatsapp.stickers.info.StickerInfoDialogFragment r1 = com.whatsapp.stickers.info.StickerInfoDialogFragment.A03(r6, r5, r4)
            X.AnonymousClass00C.A0B(r1)
            goto L_0x071c
        L_0x0732:
            java.lang.Object r0 = r6.A00
            X.3AE r0 = (X.AnonymousClass3AE) r0
            X.4Tu r1 = r0.A02
            X.4Zu r1 = (X.C90284Zu) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x077d
            java.lang.Object r4 = r1.A00
            X.3fk r4 = (X.C70803fk) r4
            X.1sS r1 = r4.A2z
            java.lang.String r0 = r1.A06
            r1.A0W(r0)
            java.util.HashMap r1 = X.C70803fk.A7c
            X.141 r0 = r4.A3Y
            com.whatsapp.jid.Jid r0 = X.C36411kG.A0h(r0)
            java.lang.Object r3 = r1.get(r0)
            X.398 r3 = (X.AnonymousClass398) r3
            if (r3 == 0) goto L_0x0779
            X.36b r0 = r4.A3A
            X.1YG r2 = r0.A02
            X.11F r0 = r4.A45
            com.whatsapp.jid.UserJid r1 = X.C36401kF.A0b(r0)
            r0 = 5
            X.AnonymousClass1YG.A01(r2, r1, r0)
            X.3HK r1 = r4.A3E
            boolean r3 = r3.A03
            X.11F r0 = r1.A0A
            if (r0 == 0) goto L_0x0779
            X.3Ol r2 = r1.A0P
            java.lang.String r1 = r0.getRawString()
            r0 = 6
            X.C64553Ol.A00(r2, r1, r0, r3)
        L_0x0779:
            r4.A1p()
            return
        L_0x077d:
            java.lang.Object r3 = r1.A00
            com.whatsapp.conversation.EditMessageActivity r3 = (com.whatsapp.conversation.EditMessageActivity) r3
            X.1tF r2 = r3.A09
            if (r2 != 0) goto L_0x078c
            java.lang.String r0 = "editMessageViewModel"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x078c:
            X.1sS r1 = r2.A08
            java.lang.String r0 = r1.A06
            r1.A0W(r0)
            r0 = 1
            r2.A02 = r0
            r0 = 8
            com.whatsapp.conversation.EditMessageActivity.A0G(r3, r0)
            return
        L_0x079c:
            java.lang.Object r5 = r6.A00
            X.3fk r5 = (X.C70803fk) r5
            X.141 r0 = r5.A3Y
            com.whatsapp.jid.UserJid r4 = X.C36351kA.A0l(r0)
            X.9Y1 r3 = r5.A1v
            java.lang.String r2 = r5.A65
            java.lang.String r1 = r5.A64
            r0 = 7
            r3.A02(r0, r2, r1)
            X.9Y1 r2 = r5.A1v
            X.9Sx r1 = X.C36321k7.A03(r2)
            X.9Y1 r0 = r5.A1v
            X.C36321k7.A0p(r1, r0)
            r0 = 42
            X.C36401kF.A1F(r1, r0)
            r1.A00 = r4
            r2.A03(r1)
            X.0wU r2 = X.C70803fk.A0K(r5)
            r1 = 31
            X.3wT r0 = new X.3wT
            r0.<init>((java.lang.Object) r6, (int) r1)
            r2.Boy(r0)
            X.4V6 r3 = r5.A2l
            X.3Ba r2 = r5.A4N
            r1 = 4
            r0 = 0
            com.whatsapp.biz.cart.view.fragment.CartFragment r0 = r2.A00(r4, r0, r1)
            r3.Btm(r0)
            return
        L_0x07e1:
            java.lang.Object r3 = r6.A00
            X.3fk r3 = (X.C70803fk) r3
            X.1uh r1 = r3.A2x
            r0 = 0
            r1.A0a(r0)
            android.view.ViewGroup r0 = r3.A0T
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0807
            int r2 = r3.A06
            if (r2 < 0) goto L_0x0807
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "conversation/hidelinkpreview/start "
            X.C36321k7.A1T(r0, r1, r2)
            android.view.ViewGroup r1 = r3.A0T
            android.view.View r0 = r3.A0G
            X.C70803fk.A0U(r0, r1, r3)
        L_0x0807:
            r3.A21()
            return
        L_0x080b:
            java.lang.Object r0 = r6.A00
            X.2Kf r0 = (X.C43892Kf) r0
            android.view.ViewGroup r1 = r0.A02
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0817:
            java.lang.Object r2 = r6.A00
            X.1fA r2 = (X.C33341fA) r2
            r0 = 1
            X.2RI r1 = new X.2RI
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
            X.0yW r0 = r2.A07
            r0.Bly(r1)
            com.whatsapp.conversationslist.ConversationsFragment r0 = r2.A06
            r0.A1g()
            return
        L_0x0832:
            java.lang.Object r3 = r6.A00
            X.02E r3 = (X.AnonymousClass02E) r3
            android.content.Context r0 = r3.A0a()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.interopui.compose.InteropComposeSelectIntegratorActivity"
            r2.setClassName(r1, r0)
            r3.A1C(r2)
            return
        L_0x084b:
            java.lang.Object r0 = r6.A00
            X.4QV r0 = (X.AnonymousClass4QV) r0
            r0.BRn()
            return
        L_0x0853:
            java.lang.Object r5 = r6.A00
            X.02E r5 = (X.AnonymousClass02E) r5
            X.1qm r4 = X.AnonymousClass3LW.A04(r5)
            r0 = 2131889369(0x7f120cd9, float:1.94134E38)
            r4.A0c(r0)
            r3 = 2131896227(0x7f1227a3, float:1.942731E38)
            X.0Ab r2 = r5.A0m()
            r1 = 42
            X.3Uk r0 = new X.3Uk
            r0.<init>(r5, r1)
            r4.A0m(r2, r0, r3)
            r2 = 2131891584(0x7f121580, float:1.9417892E38)
            X.0Ab r1 = r5.A0m()
            r0 = 0
            r4.A0l(r1, r0, r2)
            r4.A0b()
            return
        L_0x0881:
            java.lang.Object r0 = r6.A00
            com.whatsapp.events.EventInfoFragment r0 = (com.whatsapp.events.EventInfoFragment) r0
            X.00T r0 = r0.A0B
            java.lang.Object r1 = r0.getValue()
            X.1uu r1 = (X.C40091uu) r1
            r0 = 1
            r1.A0S(r0)
            return
        L_0x0892:
            java.lang.Object r0 = r6.A00
            com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment r0 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment) r0
            X.00T r0 = r0.A0P
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel r4 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel) r4
            X.040 r3 = X.C109325Xd.A00(r4)
            X.02l r2 = r4.A0F
            r1 = 0
            com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$onCreateAvatarButton$1 r0 = new com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$onCreateAvatarButton$1
            r0.<init>(r4, r1)
            X.C36381kD.A1R(r2, r0, r3)
            return
        L_0x08ae:
            java.lang.Object r1 = r6.A00
            com.whatsapp.gifsearch.GifSearchContainer r1 = (com.whatsapp.gifsearch.GifSearchContainer) r1
            java.lang.String r0 = r1.A0K
            com.whatsapp.gifsearch.GifSearchContainer.A00(r1, r0)
            return
        L_0x08b8:
            java.lang.Object r0 = r6.A00
            com.whatsapp.group.GroupAdminPickerActivity r0 = (com.whatsapp.group.GroupAdminPickerActivity) r0
            com.whatsapp.group.GroupAdminPickerActivity.A01(r0)
            return
        L_0x08c0:
            java.lang.Object r3 = r6.A00
            com.whatsapp.group.GroupChangedParticipantsBottomSheet r3 = (com.whatsapp.group.GroupChangedParticipantsBottomSheet) r3
            android.widget.FrameLayout r0 = r3.A01
            r2 = 0
            if (r0 == 0) goto L_0x08d2
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x08d2
            r0 = -2
            r1.height = r0
        L_0x08d2:
            android.widget.LinearLayout r0 = r3.A02
            X.C36361kB.A14(r0)
            android.view.View r0 = r3.A00
            X.C36331k8.A0y(r0)
            com.whatsapp.group.GroupChangedParticipantsBottomSheet.A05(r3, r2)
            return
        L_0x08e0:
            java.lang.Object r1 = r6.A00
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            r0 = 2
            com.whatsapp.group.GroupChatInfoActivity.A1D(r1, r0)
            return
        L_0x08e9:
            java.lang.Object r1 = r6.A00
            com.whatsapp.group.GroupChatInfoActivity r1 = (com.whatsapp.group.GroupChatInfoActivity) r1
            r0 = 1
            com.whatsapp.group.GroupChatInfoActivity.A1H(r1, r0)
            return
        L_0x08f2:
            java.lang.Object r2 = r6.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.2Sc r1 = r2.A1A
            if (r1 == 0) goto L_0x0900
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A09 = r0
        L_0x0900:
            X.141 r0 = r2.A0y
            X.11F r0 = r0.A0H
            android.content.Intent r0 = X.AnonymousClass190.A0k(r2, r0)
            r2.startActivity(r0)
            return
        L_0x090c:
            X.2bU r0 = r1.getFMessage()
            boolean r0 = X.C54732tQ.A00(r0)
            if (r0 != 0) goto L_0x091d
            X.1Y4 r1 = r1.A04
            r0 = 1
            r1.A08(r2, r0)
            return
        L_0x091d:
            X.1ST r0 = r1.A05
            r0.A0E(r2)
            return
        L_0x0923:
            long r11 = r1.A00
            android.app.Activity r0 = X.C36361kB.A06(r7)
            java.lang.String r3 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.AnonymousClass00C.A0E(r0, r3)
            java.lang.ref.WeakReference r10 = X.AnonymousClass001.A0F(r0)
            X.005 r0 = r7.A2C
            java.lang.Object r1 = r0.get()
            com.whatsapp.newsletter.NewsletterLinkLauncher r1 = (com.whatsapp.newsletter.NewsletterLinkLauncher) r1
            android.content.Context r4 = X.C36371kC.A0B(r7)
            X.4NM r6 = new X.4NM
            r6.<init>(r7, r8, r9, r10, r11)
            X.00T r5 = r1.A0I
            java.lang.Object r2 = r5.getValue()
            X.1GQ r2 = (X.AnonymousClass1GQ) r2
            r0 = 3877(0xf25, float:5.433E-42)
            boolean r0 = X.AnonymousClass1GQ.A02(r2, r0)
            if (r0 == 0) goto L_0x0962
            X.00T r0 = r1.A0H
            java.lang.Object r0 = r0.getValue()
            X.1Di r0 = (X.C24671Di) r0
            X.AnonymousClass00C.A08(r0)
            r0.A07(r4)
            return
        L_0x0962:
            java.lang.Object r0 = r5.getValue()
            X.1GQ r0 = (X.AnonymousClass1GQ) r0
            boolean r0 = X.C36391kE.A1Z(r0)
            if (r0 != 0) goto L_0x0981
            X.00T r0 = r1.A0H
            java.lang.Object r3 = r0.getValue()
            X.1Di r3 = (X.C24671Di) r3
            X.AnonymousClass00C.A08(r3)
            r2 = 0
            X.2o4 r1 = X.C51592o4.VIEW
            r0 = 0
            r3.A08(r4, r2, r1, r0)
            return
        L_0x0981:
            android.app.Activity r8 = X.C24801Dv.A00(r4)
            X.AnonymousClass00C.A0E(r8, r3)
            X.14u r8 = (X.C225314u) r8
            X.1Ts r0 = X.C28711Ts.ADMIN_INVITE
            int r12 = r0.A00()
            X.00T r0 = r1.A0L
            java.lang.Object r7 = r0.getValue()
            X.3UC r7 = (X.AnonymousClass3UC) r7
            X.AnonymousClass00C.A08(r7)
            r9 = 0
            r10 = r9
            r11 = r6
            r7.A09(r8, r9, r10, r11, r12)
            return
        L_0x09a2:
            java.lang.String r0 = "streamdownload/unable to open playback"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x09a8:
            com.whatsapp.webpagepreview.WebPagePreviewView r2 = r6.A05
            r0 = 1
            r2.setImageProgressBarVisibility(r0)
            r1 = 0
            boolean r0 = r6.A06
            r2.A0O(r1, r0)
            X.0wU r5 = r6.A04
            X.0y0 r4 = r6.A01
            X.6tS r0 = r3.A01
            X.36r r0 = r0.A05
            java.lang.String r3 = r0.A02
            java.lang.String r2 = r0.A01
            r0 = 1
            X.4Z7 r1 = new X.4Z7
            r1.<init>(r6, r0)
            X.5MI r0 = new X.5MI
            r0.<init>(r4, r1, r3, r2)
            X.C36441kJ.A1E(r0, r5)
            return
        L_0x09cf:
            X.C40071us.A02(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48742hy.A02(android.view.View):void");
    }
}
