package X;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.whatsapp.R;

/* renamed from: X.3UR  reason: invalid class name */
public abstract class AnonymousClass3UR {
    public static void A03(View view, AnonymousClass1V6 r2) {
        r2.A0A(false);
        View findViewById = view.findViewById(R.id.out_of_chat_playback_holder);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            r2.A04();
        }
    }

    public static void A04(View view, AnonymousClass1V6 r4, AnonymousClass005 r5) {
        r4.A0A(false);
        View findViewById = view.findViewById(R.id.out_of_chat_playback_holder);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            if (viewGroup.getLayoutTransition() == null) {
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.addTransitionListener(new C66083Up(layoutTransition, findViewById, viewGroup));
                viewGroup.setLayoutTransition(layoutTransition);
            }
            findViewById.setVisibility(8);
            A09(r4, r5);
        }
    }

    public static void A09(AnonymousClass1V6 r4, AnonymousClass005 r5) {
        r4.A0A(false);
        r4.A06();
        r4.A07();
        AnonymousClass1V7 A0o = C36431kI.A0o(r5);
        if (A0o.A01) {
            A0o.A06.unregisterObserver(A0o.A08);
            A0o.A01 = false;
        }
        C36431kI.A0o(r5).A00 = null;
    }

    public static void A0A(AnonymousClass1V6 r2, AnonymousClass005 r3) {
        C46812bi r0;
        synchronized (r2) {
            C148826zU r02 = r2.A00;
            if (r02 != null) {
                r0 = r02.A0J;
            } else {
                r0 = r2.A01;
            }
            r2.A02 = r0;
        }
        r2.A0A(false);
        r2.A06();
        r2.A07();
        AnonymousClass1V7 A0o = C36431kI.A0o(r3);
        if (A0o.A01) {
            A0o.A06.unregisterObserver(A0o.A08);
            A0o.A01 = false;
        }
        C36431kI.A0o(r3).A00 = null;
    }

    public static void A0B(C19420v0 r4, AnonymousClass11F r5) {
        SharedPreferences.Editor A00;
        SharedPreferences A0E;
        String str;
        if (r5 != null) {
            if (r5 instanceof C177618e5) {
                A00 = C19420v0.A00(r4);
                A0E = C36341k9.A0E(r4);
                str = "ptt_out_of_chat_broadcast";
            } else if (AnonymousClass143.A0G(r5)) {
                A00 = C19420v0.A00(r4);
                A0E = C36341k9.A0E(r4);
                str = "ptt_out_of_chat_group";
            } else {
                boolean A0H = AnonymousClass143.A0H(r5);
                A00 = C19420v0.A00(r4);
                A0E = C36341k9.A0E(r4);
                if (A0H) {
                    str = "ptt_out_of_chat_interop";
                } else {
                    str = "ptt_out_of_chat_individual";
                }
            }
            C36341k9.A0w(A00, str, C36341k9.A0B(A0E, str) + 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.view.View r15, X.C19730wQ r16, X.AnonymousClass16D r17, X.AnonymousClass171 r18, X.AnonymousClass1RY r19, X.AnonymousClass1V6 r20, X.C18820ts r21) {
        /*
            r0 = 2131432267(0x7f0b134b, float:1.8486287E38)
            android.view.View r3 = X.C012005e.A02(r15, r0)
            com.whatsapp.WaImageButton r3 = (com.whatsapp.WaImageButton) r3
            boolean r0 = r20.A0B()
            if (r0 == 0) goto L_0x01b7
            A05(r3)
        L_0x0012:
            X.6zU r2 = r20.A00()
            X.2bi r12 = r20.A01()
            if (r12 == 0) goto L_0x010b
            r0 = 2131432269(0x7f0b134d, float:1.848629E38)
            android.view.View r1 = X.C012005e.A02(r15, r0)
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r1 = (com.whatsapp.voicerecorder.VoiceNoteSeekBar) r1
            r0 = 0
            r1.setEnabled(r0)
            r1.setLongClickable(r0)
            r0 = 1
            r1.A03 = r0
            if (r2 == 0) goto L_0x0044
            int r0 = r2.A01
            r1.setMax(r0)
            int r0 = r2.A0A()
            r1.setProgress(r0)
            X.3fV r0 = new X.3fV
            r0.<init>(r3, r12, r1)
            r2.A0G = r0
        L_0x0044:
            r0 = 2131432264(0x7f0b1348, float:1.848628E38)
            android.widget.ImageView r11 = X.C36401kF.A0G(r15, r0)
            r0 = 2131432262(0x7f0b1346, float:1.8486276E38)
            android.view.View r10 = X.C012005e.A02(r15, r0)
            r0 = 2131432258(0x7f0b1342, float:1.8486268E38)
            android.widget.ImageView r9 = X.C36401kF.A0G(r15, r0)
            r0 = 2131432263(0x7f0b1347, float:1.8486279E38)
            android.view.View r8 = X.C012005e.A02(r15, r0)
            r0 = 2131432260(0x7f0b1344, float:1.8486272E38)
            android.view.View r7 = X.C012005e.A02(r15, r0)
            X.3Qa r6 = r12.A1J
            X.11F r5 = r6.A00
            boolean r4 = r5 instanceof X.C28981Uw
            X.3Jw r0 = r12.A0W()
            r3 = 0
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r2 = 8
            r13 = r19
            r14 = r17
            if (r4 != 0) goto L_0x01b4
            if (r0 == 0) goto L_0x013d
            X.3Jw r0 = r12.A0W()
            X.1Uw r0 = r0.A01
        L_0x0086:
            X.C18740tg.A06(r0)
            X.11F r0 = (X.AnonymousClass11F) r0
            X.141 r0 = r14.A0D(r0)
            r13.A08(r11, r0)
            r10.setVisibility(r2)
            r9.setVisibility(r2)
            boolean r1 = r12.A1l()
            int r0 = X.C36351kA.A00(r1)
            r8.setVisibility(r0)
            if (r1 == 0) goto L_0x00a7
            r3 = 8
        L_0x00a7:
            r7.setVisibility(r3)
        L_0x00aa:
            r0 = 2131432270(0x7f0b134e, float:1.8486293E38)
            com.whatsapp.TextEmojiLabel r2 = X.C36401kF.A0O(r15, r0)
            android.content.Context r8 = r15.getContext()
            X.3Jw r0 = r12.A0W()
            r7 = 1
            r3 = 0
            boolean r1 = X.AnonymousClass000.A1V(r0)
            boolean r0 = r6.A02
            r6 = r18
            if (r0 == 0) goto L_0x0110
            if (r4 != 0) goto L_0x0110
            if (r1 != 0) goto L_0x0136
            r0 = 2131896229(0x7f1227a5, float:1.9427313E38)
            java.lang.String r8 = r8.getString(r0)
        L_0x00d0:
            boolean r0 = X.AnonymousClass143.A0G(r5)
            if (r0 == 0) goto L_0x00f3
            if (r5 == 0) goto L_0x00f3
            X.141 r0 = r14.A0D(r5)
            java.lang.String r5 = r6.A0I(r0)
            boolean r4 = X.C36401kF.A1X(r21)
            java.lang.String r1 = " • "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            if (r4 == 0) goto L_0x010c
            X.AnonymousClass000.A1D(r5, r1, r8, r0)
        L_0x00ef:
            java.lang.String r8 = r0.toString()
        L_0x00f3:
            r2.setSelected(r7)
            r1 = 0
            r0 = 100
            r2.A0J(r8, r1, r0, r3)
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            if (r0 == 0) goto L_0x010b
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            r0 = 26
            X.C90104Zc.A00(r1, r2, r0)
        L_0x010b:
            return
        L_0x010c:
            X.AnonymousClass000.A1D(r8, r1, r5, r0)
            goto L_0x00ef
        L_0x0110:
            if (r1 != 0) goto L_0x0136
            r1 = r5
            boolean r0 = X.AnonymousClass143.A0G(r5)
            if (r0 == 0) goto L_0x011d
            X.11F r1 = r12.A0J()
        L_0x011d:
            if (r1 == 0) goto L_0x010b
            X.141 r1 = r14.A0D(r1)
            java.lang.String r8 = r6.A0K(r1)
            if (r8 != 0) goto L_0x00d0
            boolean r0 = X.AnonymousClass143.A0G(r5)
            int r0 = X.C36391kE.A00(r0)
            java.lang.String r8 = r6.A0R(r1, r0, r3)
            goto L_0x00d0
        L_0x0136:
            X.3Jw r0 = r12.A0W()
            X.1Uw r1 = r0.A01
            goto L_0x011d
        L_0x013d:
            boolean r0 = r12.A1l()
            if (r0 != 0) goto L_0x015d
            r0 = 2131231011(0x7f080123, float:1.807809E38)
            r11.setImageResource(r0)
            r10.setVisibility(r2)
            r0 = 2131231936(0x7f0804c0, float:1.8079967E38)
        L_0x014f:
            r9.setImageResource(r0)
            r9.setVisibility(r3)
            r8.setVisibility(r2)
        L_0x0158:
            r7.setVisibility(r2)
            goto L_0x00aa
        L_0x015d:
            int r1 = r12.A09
            r0 = 1
            if (r1 == r0) goto L_0x017f
            java.lang.String r1 = r12.A05
            java.lang.String r0 = "audio/ogg; codecs=opus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x017f
            boolean r0 = X.C66013Ui.A0t(r12)
            if (r0 != 0) goto L_0x017f
        L_0x0172:
            r0 = 2131231011(0x7f080123, float:1.807809E38)
            r11.setImageResource(r0)
            r10.setVisibility(r2)
            r0 = 2131233038(0x7f08090e, float:1.8082202E38)
            goto L_0x014f
        L_0x017f:
            boolean r0 = r12.A1k()
            if (r0 != 0) goto L_0x0172
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x01a4
            r1 = r16
            r1.A0G()
            X.142 r0 = r1.A0E
            if (r0 == 0) goto L_0x00aa
            r1.A0G()
            X.142 r0 = r1.A0E
        L_0x0197:
            r13.A08(r11, r0)
            r10.setVisibility(r2)
            r9.setVisibility(r2)
            r8.setVisibility(r3)
            goto L_0x0158
        L_0x01a4:
            r1 = r5
            boolean r0 = X.AnonymousClass143.A0G(r5)
            if (r0 == 0) goto L_0x01af
            X.11F r1 = r12.A0J()
        L_0x01af:
            X.141 r0 = X.C36441kJ.A0i(r14, r1)
            goto L_0x0197
        L_0x01b4:
            r0 = r5
            goto L_0x0086
        L_0x01b7:
            A06(r3)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UR.A01(android.view.View, X.0wQ, X.16D, X.171, X.1RY, X.1V6, X.0ts):void");
    }

    public static void A02(View view, AnonymousClass1V6 r3) {
        AnonymousClass379 r1;
        C148826zU A00 = r3.A00();
        if (A00 != null && view != null && (r1 = A00.A0I) != null && r1.A00 == view) {
            r1.A00 = null;
        }
    }

    public static void A05(ImageButton imageButton) {
        imageButton.setImageResource(R.drawable.inline_audio_pause);
        C36331k8.A0q(imageButton.getContext(), imageButton, R.string.f12nameremoved);
    }

    public static void A06(ImageButton imageButton) {
        C36391kE.A18(imageButton.getContext(), imageButton, R.drawable.inline_audio_play);
        C36331k8.A0q(imageButton.getContext(), imageButton, R.string.f12nameremoved);
    }

    public static void A07(AnonymousClass1V6 r1) {
        C148826zU A00 = r1.A00();
        if (A00 != null) {
            A00.A09 = null;
        }
    }

    public static void A08(AnonymousClass1V6 r2, C19420v0 r3, AnonymousClass11F r4) {
        if (r2.A0B()) {
            synchronized (r2) {
                C148826zU r1 = r2.A00;
                if (r1 != null) {
                    r1.A0T = false;
                    r1.A0f.A01();
                }
            }
            r2.A0A(true);
            A0B(r3, r4);
        }
    }

    public static Pair A00(Activity activity, View view, View view2, AnonymousClass17Y r27, C19730wQ r28, AnonymousClass16D r29, AnonymousClass171 r30, AnonymousClass1RY r31, C27731Pn r32, AnonymousClass3HF r33, AnonymousClass1V6 r34, C19420v0 r35, C18820ts r36, C20810yC r37, C19770wU r38, AnonymousClass005 r39, AnonymousClass005 r40, String str) {
        AnonymousClass1RY r11 = r31;
        View view3 = view2;
        Activity activity2 = activity;
        if (r31 == null) {
            r11 = r32.A05(activity2.getBaseContext(), AnonymousClass000.A0p("out-of-chat-", str, AnonymousClass000.A0u()));
        }
        C18820ts r15 = r36;
        C19420v0 r14 = r35;
        AnonymousClass1V6 r13 = r34;
        AnonymousClass3HF r12 = r33;
        AnonymousClass005 r3 = r39;
        C19730wQ r8 = r28;
        AnonymousClass16D r9 = r29;
        AnonymousClass171 r10 = r30;
        if (view2 == null) {
            view3 = C012005e.A02(view, R.id.out_of_chat_playback_holder);
            activity2.getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) view3, true);
            C012005e.A02(view3, R.id.out_of_chat_close_btn).setOnClickListener(new AnonymousClass9v5(r13, r3, 16));
            C012005e.A02(view3, R.id.out_of_chat_playback_btn).setOnClickListener(new C67043Yh(activity2, view3, r8, r9, r10, r11, r12, r13, r14, r15));
            C012005e.A02(view3, R.id.out_of_chat_layout).setOnClickListener(new AnonymousClass9v5(r13, r3, 17));
        }
        C148826zU A00 = r13.A00();
        if (A00 != null) {
            C20810yC r16 = r37;
            A00.A0F = new C70643fU(activity2, view3, r27, r8, r9, r10, r11, r12, r13, r14, r15, r16, r38, r40);
            A00.A09 = activity2;
        }
        C148826zU A002 = r13.A00();
        if (A002 != null) {
            A002.A0I = new AnonymousClass379(view3, r13, r3);
        }
        A01(view3, r8, r9, r10, r11, r13, r15);
        view3.setVisibility(0);
        AnonymousClass1V7 A0o = C36431kI.A0o(r3);
        if (!A0o.A01) {
            A0o.A06.registerObserver(A0o.A08);
            A0o.A01 = true;
        }
        if (r13.A0B()) {
            r13.A05();
        }
        C148826zU A003 = r13.A00();
        if (A003 != null) {
            A003.A0S = true;
        }
        return C36441kJ.A0Q(view3, r11);
    }
}
