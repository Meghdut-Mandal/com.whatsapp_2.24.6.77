package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.bonsai.BonsaiConversationTitleViewModel;

/* renamed from: X.28d  reason: invalid class name */
public abstract class AnonymousClass28d extends AnonymousClass18Q implements Application.ActivityLifecycleCallbacks {
    public Configuration A00;
    public View A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public ViewGroup A05;
    public ViewStub A06;
    public ViewTreeObserver.OnGlobalLayoutListener A07;
    public ImageView A08;
    public ProgressBar A09;
    public TextView A0A;
    public TextView A0B;
    public Toolbar A0C;
    public TextEmojiLabel A0D;
    public AnonymousClass3SF A0E;
    public AnonymousClass3SF A0F;
    public WaImageView A0G;
    public C54002sF A0H;
    public AnonymousClass141 A0I;
    public AnonymousClass1RJ A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public ViewTreeObserver.OnGlobalLayoutListener A0N;
    public C49732jb A0O;
    public C32931eR A0P;
    public C1272367m A0Q;
    public View A0R;
    public C32831eG A0S;
    public final View.OnClickListener A0T = new C66953Xy(this, 0);
    public final AnonymousClass01L A0U;
    public final C32621dv A0V;
    public final AnonymousClass17Y A0W;
    public final AnonymousClass1LI A0X;
    public final AnonymousClass3CG A0Y;
    public final AnonymousClass171 A0Z;
    public final C18820ts A0a;
    public final AnonymousClass1YG A0b;
    public final AnonymousClass1A5 A0c;
    public final C20810yC A0d;
    public final AnonymousClass11F A0e;
    public final C19770wU A0f;
    public final Runnable A0g = C80223v3.A00(this, 15);
    public final String A0h;
    public final C19730wQ A0i;
    public final AnonymousClass16A A0j = new AnonymousClass3U3(this, 1);
    public final C26421Kc A0k;
    public final C32001cn A0l = new AnonymousClass4W0(this, 5);
    public final C24361Cd A0m;
    public final AnonymousClass1Pp A0n;
    public final C226815j A0o = AnonymousClass4W3.A00(this, 12);
    public final AnonymousClass16I A0p;
    public final C27761Ps A0q;
    public final C24511Cs A0r = new AnonymousClass4WB(this, 10);
    public final C233117z A0s;
    public final AnonymousClass1EM A0t;
    public final Runnable A0u = C80223v3.A00(this, 14);
    public final AnonymousClass1H2 A0v;
    public final AnonymousClass13J A0w;

    public void onActivityCreated(Activity activity, Bundle bundle) {
        AnonymousClass00C.A0D(activity, 0);
        Configuration A0U2 = AnonymousClass000.A0U(activity);
        AnonymousClass00C.A08(A0U2);
        this.A00 = A0U2;
        this.A0I = this.A0c.A01(this.A0e);
        A0I(activity);
        this.A0p.registerObserver(this.A0o);
        this.A0m.registerObserver(this.A0l);
        this.A0k.registerObserver(this.A0j);
        this.A0s.registerObserver(this.A0r);
    }

    public void onActivityStopped(Activity activity) {
        ViewTreeObserver viewTreeObserver;
        AnonymousClass00C.A0D(activity, 0);
        super.onActivityStopped(activity);
        AnonymousClass3SF r0 = this.A0F;
        if (r0 != null) {
            ViewTreeObserver viewTreeObserver2 = r0.A01.getViewTreeObserver();
            if (viewTreeObserver2 != null) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.A0N);
            }
            View view = this.A03;
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.A07);
                return;
            }
            return;
        }
        throw C36331k8.A0d("contactNameViewController");
    }

    public AnonymousClass28d(AnonymousClass01L r26, C32621dv r27, AnonymousClass17Y r28, C19730wQ r29, AnonymousClass1LI r30, AnonymousClass3CG r31, C26421Kc r32, C24361Cd r33, AnonymousClass1Pp r34, AnonymousClass16I r35, AnonymousClass171 r36, C27761Ps r37, C18820ts r38, AnonymousClass1YG r39, AnonymousClass1A5 r40, AnonymousClass141 r41, AnonymousClass1H2 r42, C20810yC r43, C233117z r44, AnonymousClass11F r45, AnonymousClass1EM r46, AnonymousClass13J r47, C19770wU r48, String str) {
        C20810yC r9 = r43;
        C19770wU r4 = r48;
        AnonymousClass17Y r22 = r28;
        C19730wQ r21 = r29;
        AnonymousClass01L r24 = r26;
        C36321k7.A1B(r24, r9, r22, r21, r4);
        AnonymousClass1H2 r10 = r42;
        AnonymousClass1EM r6 = r46;
        AnonymousClass13J r5 = r47;
        C32621dv r23 = r27;
        AnonymousClass1Pp r17 = r34;
        C36321k7.A1C(r10, r17, r23, r6, r5);
        C18820ts r13 = r38;
        AnonymousClass171 r15 = r36;
        C36341k9.A1G(r15, r13);
        AnonymousClass16I r16 = r35;
        AnonymousClass00C.A0D(r16, 14);
        C24361Cd r18 = r33;
        AnonymousClass00C.A0D(r18, 15);
        C26421Kc r19 = r32;
        AnonymousClass00C.A0D(r19, 16);
        C27761Ps r14 = r37;
        AnonymousClass1A5 r12 = r40;
        C233117z r8 = r44;
        AnonymousClass11F r7 = r45;
        AnonymousClass1LI r20 = r30;
        C36321k7.A1E(r14, r12, r8, r20, r7);
        AnonymousClass141 r11 = r41;
        AnonymousClass00C.A0D(r11, 22);
        this.A0U = r24;
        this.A0d = r9;
        this.A0W = r22;
        this.A0i = r21;
        this.A0f = r4;
        this.A0v = r10;
        this.A0n = r17;
        this.A0V = r23;
        this.A0t = r6;
        this.A0w = r5;
        this.A0Z = r15;
        this.A0a = r13;
        this.A0Y = r31;
        this.A0p = r16;
        this.A0m = r18;
        this.A0k = r19;
        this.A0q = r14;
        this.A0c = r12;
        this.A0s = r8;
        this.A0X = r20;
        this.A0e = r7;
        this.A0I = r11;
        this.A0b = r39;
        this.A0h = str;
    }

    public static BonsaiConversationTitleViewModel A00(C43312Gv r0) {
        return (BonsaiConversationTitleViewModel) r0.A03.getValue();
    }

    public static final void A01(AnonymousClass28d r2) {
        if (r2.A0S == null || r2.A0Q == null || r2.A0P == null) {
            C18800tq A0P2 = C36371kC.A0P(r2.A0U);
            r2.A0S = A0P2.AzZ();
            r2.A0Q = (C1272367m) A0P2.AfI.A00.A2K.get();
            r2.A0P = C36431kI.A0g(A0P2);
        }
    }

    public final ViewGroup A07() {
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null) {
            return viewGroup;
        }
        throw C36331k8.A0d("actionBar");
    }

    public final ViewGroup A08() {
        ViewGroup viewGroup = this.A05;
        if (viewGroup != null) {
            return viewGroup;
        }
        throw C36331k8.A0d("contactHolder");
    }

    public final ImageView A09() {
        ImageView imageView = this.A08;
        if (imageView != null) {
            return imageView;
        }
        throw C36331k8.A0d("contactPhoto");
    }

    public final TextEmojiLabel A0A() {
        TextEmojiLabel textEmojiLabel = this.A0D;
        if (textEmojiLabel != null) {
            return textEmojiLabel;
        }
        throw C36331k8.A0d("contactStatus");
    }

    public void A0B() {
        if (this instanceof C43332Gy) {
            C43332Gy r1 = (C43332Gy) this;
            C36331k8.A0y(r1.A0G);
            C43332Gy.A04(r1);
        } else if (this instanceof AnonymousClass2Gu) {
            AnonymousClass2Gu r2 = (AnonymousClass2Gu) this;
            String str = r2.A00.A01;
            if (str != null) {
                r2.A0D.A0I(str);
                r2.A0D.setEllipsize(TextUtils.TruncateAt.END);
            }
        } else if (this instanceof AnonymousClass2Gw) {
            AnonymousClass2Gw r22 = (AnonymousClass2Gw) this;
            String A012 = r22.A0V.A01(r22.A0I);
            if (!r22.A0I.A0i && A012 != null) {
                r22.A0D.setText(A012);
                r22.A0D.setVisibility(0);
            } else if (r22.A0H != null) {
                AnonymousClass2Gw.A04(r22);
            }
        } else if (this instanceof C43322Gx) {
            C43322Gx r12 = (C43322Gx) this;
            C43322Gx.A05(r12);
            C43322Gx.A04(r12);
            if (r12.A0H == null) {
                r12.A05 = true;
                return;
            }
            r12.A05 = false;
            C43322Gx.A03(r12);
        } else {
            A0D();
        }
    }

    public final void A0D() {
        if (this.A0Z.A0f(this.A0I) || this.A0I.A0F == null) {
            boolean A0N2 = this.A0I.A0N();
            AnonymousClass3SF r0 = this.A0F;
            if (r0 != null) {
                r0.A03(A0N2 ? 1 : 0);
                return;
            }
            throw C36331k8.A0d("contactNameViewController");
        }
    }

    public boolean A0F() {
        int i;
        AnonymousClass171 r3 = this.A0Z;
        boolean A0e2 = r3.A0e(this.A0I);
        AnonymousClass141 r1 = this.A0I;
        if (r1.A0F == null || (!A0e2 ? !r1.A0A() : !r1.A0C() || !((i = r1.A08) == 2 || i == 3)) || r3.A0f(this.A0I)) {
            return false;
        }
        return true;
    }

    public void A0G(AnonymousClass141 r9) {
        if (AnonymousClass143.A0H(this.A0e)) {
            A01(this);
        }
        A09().setVisibility(0);
        AnonymousClass1RJ r0 = this.A0J;
        if (r0 != null) {
            r0.A03(8);
        }
        ImageView A092 = A09();
        AnonymousClass1Pp r3 = this.A0n;
        AnonymousClass1EM r7 = this.A0t;
        C27761Ps r4 = this.A0q;
        AnonymousClass141 r6 = r9;
        if (r9 != null) {
            C49732jb r1 = new C49732jb(A092, r3, r4, new AnonymousClass316(this), r6, r7);
            C36391kE.A1Q(r1, this.A0f);
            this.A0O = r1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        if ((r0 instanceof X.C50912mq) != false) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H() {
        /*
            r7 = this;
            X.1A5 r1 = r7.A0c
            X.11F r0 = r7.A0e
            X.141 r1 = r1.A01(r0)
            r7.A0I = r1
            X.0wQ r0 = r7.A0i
            boolean r0 = X.C36361kB.A1X(r0, r1)
            if (r0 == 0) goto L_0x008a
            X.0yC r0 = r7.A0d
            boolean r0 = X.C36391kE.A1X(r0)
            if (r0 == 0) goto L_0x008a
            X.3SF r3 = r7.A0F
            if (r3 == 0) goto L_0x00a9
            X.141 r2 = r7.A0I
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.A07(r2, r1, r1, r0)
        L_0x0026:
            com.whatsapp.WaImageView r0 = r7.A0G
            r2 = 0
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0071
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0071
        L_0x0033:
            android.widget.TextView r0 = r7.A0B
            if (r0 == 0) goto L_0x00a2
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x0061
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0061
            android.widget.TextView r0 = r7.A0B
            if (r0 == 0) goto L_0x009b
            android.content.Context r4 = r0.getContext()
            android.widget.TextView r3 = r7.A0B
            if (r3 == 0) goto L_0x0094
            if (r4 == 0) goto L_0x005e
            r2 = 2131894900(0x7f122274, float:1.9424618E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.CharSequence r0 = r3.getText()
            java.lang.String r2 = X.C36391kE.A0v(r4, r0, r1, r6, r2)
        L_0x005e:
            r3.setContentDescription(r2)
        L_0x0061:
            X.2jb r0 = r7.A0O
            if (r0 == 0) goto L_0x0068
            r0.A0D(r5)
        L_0x0068:
            X.141 r0 = r7.A0I
            r7.A0G(r0)
            r7.A0B()
            return
        L_0x0071:
            boolean r0 = r7.A0L
            if (r0 == 0) goto L_0x0061
            android.widget.ImageView r1 = r7.A09()
            boolean r0 = r1 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x0088
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1
            if (r1 == 0) goto L_0x0088
            X.6K4 r0 = r1.A03
        L_0x0083:
            boolean r0 = r0 instanceof X.C50912mq
            if (r0 == 0) goto L_0x0061
            goto L_0x0033
        L_0x0088:
            r0 = r2
            goto L_0x0083
        L_0x008a:
            X.3SF r1 = r7.A0F
            if (r1 == 0) goto L_0x00b0
            X.141 r0 = r7.A0I
            r1.A05(r0)
            goto L_0x0026
        L_0x0094:
            java.lang.String r0 = "contactNameView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x009b:
            java.lang.String r0 = "contactNameView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00a2:
            java.lang.String r0 = "contactNameView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00a9:
            java.lang.String r0 = "contactNameViewController"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00b0:
            java.lang.String r0 = "contactNameViewController"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass28d.A0H():void");
    }

    public void A0I(Activity activity) {
        ViewGroup viewGroup;
        TextEmojiLabel textEmojiLabel;
        AnonymousClass01L r4 = this.A0U;
        AnonymousClass07B A0O2 = C36381kD.A0O(r4);
        AnonymousClass00C.A08(A0O2);
        Context A0A2 = A0O2.A0A();
        AnonymousClass00C.A08(A0A2);
        boolean z = this instanceof C43312Gv;
        if (z) {
            C43312Gv r3 = (C43312Gv) this;
            boolean A022 = AnonymousClass1MI.A02(r3.A0d, C21000yV.A01, 6218);
            r3.A0L = A022;
            int i = R.layout.f9nameremoved;
            if (A022) {
                i = R.layout.f9nameremoved;
            }
            View A0J2 = C36431kI.A0J(LayoutInflater.from(A0A2), i);
            AnonymousClass00C.A0E(A0J2, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup = (ViewGroup) A0J2;
            r3.A00 = viewGroup.findViewById(R.id.bot_information_icon);
        } else {
            int i2 = R.layout.f9nameremoved;
            boolean A023 = AnonymousClass1MI.A02(this.A0d, C21000yV.A01, 6218);
            this.A0L = A023;
            if (A023) {
                i2 = R.layout.f9nameremoved;
            }
            View A0J3 = C36431kI.A0J(LayoutInflater.from(A0A2), i2);
            AnonymousClass00C.A0E(A0J3, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup = (ViewGroup) A0J3;
        }
        AnonymousClass00C.A0D(viewGroup, 0);
        this.A04 = viewGroup;
        A0C();
        this.A0R = A07().findViewById(R.id.contact_photo_view);
        ImageView A0M2 = C36361kB.A0M(A07(), R.id.conversation_contact_photo);
        AnonymousClass00C.A0D(A0M2, 0);
        this.A08 = A0M2;
        if (this.A0L) {
            C33521fV.A02(A09());
        }
        this.A0G = C36421kH.A0J(A07(), R.id.ephemeral_status);
        ViewGroup viewGroup2 = (ViewGroup) C36361kB.A0F(A07(), R.id.conversation_contact);
        AnonymousClass00C.A0D(viewGroup2, 0);
        this.A05 = viewGroup2;
        TextView A0M3 = C36341k9.A0M(A07(), R.id.conversation_contact_name);
        AnonymousClass00C.A0D(A0M3, 0);
        this.A0B = A0M3;
        AnonymousClass1LI r32 = this.A0X;
        AnonymousClass3SF A012 = AnonymousClass3SF.A01(A08(), r32, R.id.conversation_contact_name);
        this.A0F = A012;
        TextEmojiLabel textEmojiLabel2 = A012.A01;
        AnonymousClass00C.A07(textEmojiLabel2);
        AnonymousClass17Y r6 = this.A0W;
        this.A0N = new AnonymousClass3ZL(textEmojiLabel2, r6, this.A0u);
        AnonymousClass3SF r0 = this.A0F;
        if (r0 != null) {
            ViewTreeObserver viewTreeObserver = r0.A01.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.A0N);
            }
            View findViewById = A08().findViewById(R.id.conversation_contact_status_holder);
            this.A03 = findViewById;
            if (findViewById != null) {
                this.A07 = new AnonymousClass3ZK(findViewById, r6, this.A0g);
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.A07);
                this.A0E = AnonymousClass3SF.A01(findViewById, r32, R.id.business_name);
            }
            this.A02 = A08().findViewById(R.id.business_holder);
            TextEmojiLabel A0R2 = C36361kB.A0R(A08(), R.id.conversation_contact_status);
            AnonymousClass00C.A0D(A0R2, 0);
            this.A0D = A0R2;
            this.A0A = C36391kE.A0P(A08(), R.id.business_separator);
            View findViewById2 = A07().findViewById(R.id.conversation_interop_profile_photo);
            if (findViewById2 != null) {
                this.A0J = new AnonymousClass1RJ(findViewById2);
            }
            A08().setClickable(true);
            this.A06 = C36431kI.A0M(A07(), R.id.change_photo_progress_stub);
            Toolbar toolbar = this.A0C;
            if (toolbar != null) {
                toolbar.addView(A07());
            } else {
                AnonymousClass07B A0O3 = C36381kD.A0O(r4);
                AnonymousClass00C.A08(A0O3);
                A0O3.A0V(true);
                if (z) {
                    Configuration configuration = ((C43312Gv) this).A00;
                    if (configuration == null) {
                        throw C36331k8.A0d("currentConfig");
                    } else if (!AnonymousClass000.A1S(configuration.orientation, 2)) {
                        C013405v r2 = new C013405v(-1, -2, 1);
                        AnonymousClass07B A0O4 = C36381kD.A0O(r4);
                        AnonymousClass00C.A08(A0O4);
                        A0O4.A0O(A07(), r2);
                    }
                }
                AnonymousClass07B A0O5 = C36381kD.A0O(r4);
                AnonymousClass00C.A08(A0O5);
                A0O5.A0N(A07());
            }
            if (C222013h.A0C) {
                AnonymousClass3SF r02 = this.A0F;
                if (r02 != null) {
                    AnonymousClass088.A06(r02.A01, R.style.f13nameremoved);
                    AnonymousClass088.A06(A0A(), R.style.f13nameremoved);
                    AnonymousClass3SF r03 = this.A0E;
                    if (r03 != null && (textEmojiLabel = r03.A01) != null) {
                        AnonymousClass088.A06(textEmojiLabel, R.style.f13nameremoved);
                        return;
                    }
                    return;
                }
                throw C36331k8.A0d("contactNameViewController");
            }
            return;
        }
        throw C36331k8.A0d("contactNameViewController");
    }

    public void onActivityDestroyed(Activity activity) {
        C49732jb r1 = this.A0O;
        if (r1 != null) {
            r1.A0D(true);
            this.A0O = null;
        }
        this.A0p.unregisterObserver(this.A0o);
        this.A0m.unregisterObserver(this.A0l);
        this.A0k.unregisterObserver(this.A0j);
        this.A0s.unregisterObserver(this.A0r);
    }

    public void A0C() {
        int i = R.id.back;
        if (this.A0L) {
            i = R.id.whatsapp_toolbar_home;
        }
        View findViewById = A07().findViewById(i);
        this.A01 = findViewById;
        if (findViewById != null) {
            C33521fV.A02(findViewById);
            if (Build.VERSION.SDK_INT > 21) {
                int paddingLeft = findViewById.getPaddingLeft();
                int paddingRight = findViewById.getPaddingRight();
                C18820ts r2 = this.A0a;
                AnonymousClass07B A0O2 = C36381kD.A0O(this.A0U);
                AnonymousClass00C.A08(A0O2);
                C36361kB.A0z(A0O2.A0A(), findViewById, r2, R.drawable.conversation_navigate_up_background);
                AnonymousClass1JZ.A05(findViewById, r2, paddingLeft, paddingRight);
            }
            findViewById.setOnClickListener(this.A0T);
        }
    }

    public final void A0E(View.OnClickListener onClickListener) {
        A08().setOnClickListener(onClickListener);
        View view = this.A0R;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void onActivityResumed(Activity activity) {
        A0H();
        A0A().setSelected(true);
    }
}
