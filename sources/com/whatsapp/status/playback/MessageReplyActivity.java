package com.whatsapp.status.playback;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass141;
import X.AnonymousClass14B;
import X.AnonymousClass15D;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass190;
import X.AnonymousClass1A1;
import X.AnonymousClass1AP;
import X.AnonymousClass1BB;
import X.AnonymousClass1BF;
import X.AnonymousClass1C2;
import X.AnonymousClass1CF;
import X.AnonymousClass1D5;
import X.AnonymousClass1GX;
import X.AnonymousClass1GZ;
import X.AnonymousClass1HA;
import X.AnonymousClass1JD;
import X.AnonymousClass1KK;
import X.AnonymousClass1N2;
import X.AnonymousClass1NG;
import X.AnonymousClass1RY;
import X.AnonymousClass1SV;
import X.AnonymousClass1V6;
import X.AnonymousClass1X4;
import X.AnonymousClass1XN;
import X.AnonymousClass1XY;
import X.AnonymousClass1YL;
import X.AnonymousClass24Y;
import X.AnonymousClass28e;
import X.AnonymousClass2M8;
import X.AnonymousClass2M9;
import X.AnonymousClass2MC;
import X.AnonymousClass2XH;
import X.AnonymousClass2ZI;
import X.AnonymousClass2j9;
import X.AnonymousClass39O;
import X.AnonymousClass3EH;
import X.AnonymousClass3EV;
import X.AnonymousClass3GT;
import X.AnonymousClass3HG;
import X.AnonymousClass3HH;
import X.AnonymousClass3L7;
import X.AnonymousClass3LW;
import X.AnonymousClass3MK;
import X.AnonymousClass3SJ;
import X.AnonymousClass3T1;
import X.AnonymousClass3TY;
import X.AnonymousClass3XN;
import X.AnonymousClass3XT;
import X.AnonymousClass3XU;
import X.AnonymousClass3YI;
import X.AnonymousClass3YY;
import X.AnonymousClass4T1;
import X.AnonymousClass4UO;
import X.AnonymousClass4XP;
import X.AnonymousClass4XV;
import X.AnonymousClass6YP;
import X.AnonymousClass6YV;
import X.C017907q;
import X.C122815vT;
import X.C133356Xz;
import X.C135066c4;
import X.C145166tS;
import X.C177528dw;
import X.C19890wg;
import X.C199859g8;
import X.C201709k9;
import X.C20830yE;
import X.C21010yW;
import X.C220412q;
import X.C226515g;
import X.C229216m;
import X.C23871Ae;
import X.C24341Cb;
import X.C25841Hw;
import X.C25851Hx;
import X.C27731Pn;
import X.C29731Xt;
import X.C35271iQ;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C39821ts;
import X.C52592pg;
import X.C54352so;
import X.C56452wJ;
import X.C57532yO;
import X.C603337l;
import X.C62253Fk;
import X.C62493Gj;
import X.C63193Jc;
import X.C63553Km;
import X.C64723Pe;
import X.C64813Pn;
import X.C65713Te;
import X.C65813To;
import X.C78053rU;
import X.C81173wa;
import X.C81203wd;
import X.C88314Sf;
import X.C89034Uz;
import X.C89604Xe;
import X.C95494lK;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.status.playback.avatar.AvatarReactionRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MessageReplyActivity extends AnonymousClass24Y implements AnonymousClass4UO, AnonymousClass4T1, AnonymousClass15D {
    public static final Interpolator A1d = C017907q.A00(0.32f, 0.0f, 0.67f, 0.0f);
    public static final Interpolator A1e = C017907q.A00(0.33f, 1.0f, 0.68f, 1.0f);
    public static final HashMap A1f = AnonymousClass001.A0J();
    public static final HashMap A1g = AnonymousClass001.A0J();
    public Bitmap A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public FrameLayout A04;
    public GridLayout A05;
    public GridLayout A06;
    public ImageButton A07;
    public ImageButton A08;
    public ImageButton A09;
    public MaterialButtonToggleGroup A0A;
    public C57532yO A0B;
    public AnonymousClass1XY A0C;
    public AnonymousClass1X4 A0D;
    public C63553Km A0E;
    public AnonymousClass1KK A0F;
    public C64723Pe A0G;
    public C89034Uz A0H;
    public C603337l A0I;
    public AnonymousClass1NG A0J;
    public C229216m A0K;
    public AnonymousClass16D A0L;
    public AnonymousClass171 A0M;
    public AnonymousClass1RY A0N;
    public C27731Pn A0O;
    public AnonymousClass28e A0P;
    public C63193Jc A0Q;
    public AnonymousClass1V6 A0R;
    public C201709k9 A0S;
    public C39821ts A0T;
    public C24341Cb A0U;
    public C20830yE A0V;
    public C25851Hx A0W;
    public AnonymousClass3HG A0X;
    public C220412q A0Y;
    public C25841Hw A0Z;
    public AnonymousClass1XN A0a;
    public EmojiSearchProvider A0b;
    public C21010yW A0c;
    public C54352so A0d;
    public AnonymousClass3HH A0e;
    public AnonymousClass2M8 A0f;
    public AnonymousClass2MC A0g;
    public AnonymousClass1GZ A0h;
    public AnonymousClass3L7 A0i;
    public AnonymousClass1CF A0j;
    public AnonymousClass11F A0k;
    public AnonymousClass2XH A0l;
    public AnonymousClass1D5 A0m;
    public AnonymousClass1YL A0n;
    public MentionableEntry A0o;
    public AnonymousClass39O A0p;
    public AnonymousClass3EV A0q;
    public AnonymousClass1JD A0r;
    public C19890wg A0s;
    public AnonymousClass1BF A0t;
    public C23871Ae A0u;
    public AnonymousClass3T1 A0v;
    public C199859g8 A0w;
    public C52592pg A0x = null;
    public AvatarReactionRepository A0y;
    public AnonymousClass2ZI A0z;
    public AnonymousClass1HA A10;
    public AnonymousClass1BB A11;
    public AnonymousClass1AP A12;
    public AnonymousClass1C2 A13;
    public AnonymousClass3GT A14;
    public AnonymousClass3EH A15;
    public C122815vT A16;
    public AnonymousClass1A1 A17;
    public C64813Pn A18;
    public AnonymousClass1GX A19;
    public AnonymousClass1SV A1A;
    public AnonymousClass13J A1B;
    public AnonymousClass2j9 A1C;
    public C65813To A1D;
    public AnonymousClass6YP A1E;
    public C62493Gj A1F;
    public AnonymousClass005 A1G;
    public boolean A1H = false;
    public boolean A1I = false;
    public boolean A1J = true;
    public boolean A1K;
    public AnimatorSet A1L;
    public View A1M;
    public View A1N;
    public MaterialButton A1O;
    public C78053rU A1P;
    public C95494lK A1Q;
    public C133356Xz A1R;
    public boolean A1S;
    public boolean A1T;
    public boolean A1U;
    public View A1V;
    public final C88314Sf A1W = new C89604Xe(this, 12);
    public final C62253Fk A1X = new C62253Fk(this);
    public final C226515g A1Y = new AnonymousClass3MK(this, 7);
    public final Set A1Z = C36441kJ.A16();
    public final Set A1a = C36441kJ.A16();
    public final Set A1b = C36441kJ.A16();
    public final int[] A1c = C36441kJ.A1O();

    private void A0K(Resources resources, View view, ViewGroup viewGroup, ImageView imageView, WaTextView waTextView, int[] iArr) {
        int[] iArr2 = iArr;
        ImageView imageView2 = imageView;
        imageView2.setImageDrawable(this.A0C.A06(resources, new AnonymousClass2M9(iArr2), 1.0f, -1));
        View view2 = view;
        C36421kH.A11(view2, this, 11);
        view2.setOnClickListener(new AnonymousClass3YI(new AnonymousClass3YY(this, viewGroup, view2, waTextView, iArr2, 6), this.A07));
    }

    public /* synthetic */ void A3j(Resources resources, View view, ViewGroup viewGroup, ImageView imageView, WaTextView waTextView, int[] iArr, boolean z) {
        AnonymousClass00C.A0D(iArr, 1);
        C19890wg r0 = this.A0s;
        if (z) {
            AnonymousClass3TY.A02(r0, iArr);
        } else {
            AnonymousClass3TY.A03(r0, iArr);
        }
        A0K(resources, view, viewGroup, imageView, waTextView, (int[]) iArr.clone());
    }

    public void A3k(AnonymousClass3XU r15) {
        AnonymousClass3XN r0;
        AnonymousClass3XN r02;
        if (C36351kA.A1X(this.A0J, this.A0k)) {
            AnonymousClass3SJ.A01(this, 106);
            return;
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        AnonymousClass11F r1 = this.A0k;
        A0I2.add(r1);
        AnonymousClass3XN r4 = r15.A01;
        if (r4.A01 > 0) {
            r0 = r4;
        } else {
            r0 = r15.A02;
        }
        int i = r0.A01;
        if (r4.A00 > 0) {
            r02 = r4;
        } else {
            r02 = r15.A02;
        }
        int i2 = r02.A00;
        String str = r15.A02.A02;
        String str2 = r4.A02;
        String str3 = r15.A03.A02;
        int i3 = r15.A00;
        int i4 = 22;
        if (r1 instanceof C177528dw) {
            i4 = 24;
        }
        startActivityForResult(AnonymousClass190.A1K(this, str, str2, str3, A0I2, i3, i4, false, false).putExtra("jid", this.A0k.getRawString()).putExtra("media_width", i).putExtra("media_height", i2).putExtra("mentions", C65713Te.A01(this.A0o.getMentions())).putExtra("caption", this.A0o.getStringText()).putExtra("usage_quote", true), 25);
    }

    public void B1Y() {
    }

    public void BoW() {
    }

    public static void A0L(Bitmap bitmap, MessageReplyActivity messageReplyActivity) {
        MaterialButton materialButton;
        messageReplyActivity.A00 = bitmap;
        Context context = messageReplyActivity.A04.getContext();
        Resources resources = context.getResources();
        if (messageReplyActivity.A00 == null || (materialButton = messageReplyActivity.A1O) == null) {
            MaterialButton materialButton2 = messageReplyActivity.A1O;
            if (materialButton2 != null) {
                materialButton2.setIconTint(AnonymousClass00F.A04(context, R.drawable.expression_tab_icon_color_selector));
                messageReplyActivity.A1O.setIconResource(R.drawable.ic_avatar_tray_normal);
                return;
            }
            return;
        }
        materialButton.setIconTint((ColorStateList) null);
        messageReplyActivity.A1O.setIcon(new BitmapDrawable(resources, messageReplyActivity.A00));
        if (messageReplyActivity.A0x != C52592pg.AVATAR) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            messageReplyActivity.A1O.A01.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            return;
        }
        messageReplyActivity.A1O.A01.clearColorFilter();
    }

    public static void A0O(MessageReplyActivity messageReplyActivity) {
        messageReplyActivity.A1M.setVisibility(8);
        MentionableEntry mentionableEntry = messageReplyActivity.A0o;
        if (mentionableEntry != null && AnonymousClass1N2.A00(mentionableEntry)) {
            messageReplyActivity.A0C.A01(messageReplyActivity.A0o);
        }
        messageReplyActivity.finish();
    }

    public static void A0Q(MessageReplyActivity messageReplyActivity) {
        if (messageReplyActivity.A1K) {
            String string = messageReplyActivity.getString(R.string.f12nameremoved);
            View A0K2 = C36381kD.A0K(messageReplyActivity.getLayoutInflater(), R.layout.f9nameremoved);
            C36391kE.A0O(A0K2, R.id.toast_text).setText(string);
            Toast toast = new Toast(messageReplyActivity.getApplicationContext());
            toast.setGravity(87, 0, 0);
            toast.setDuration(1);
            toast.setView(A0K2);
            toast.show();
        } else {
            messageReplyActivity.A05.A06(R.string.f12nameremoved, 0);
        }
        A1g.remove(messageReplyActivity.A0v.A1J);
        A1f.remove(messageReplyActivity.A0v.A1J);
        A0O(messageReplyActivity);
    }

    public static void A0i(MessageReplyActivity messageReplyActivity) {
        A1g.put(messageReplyActivity.A0v.A1J, messageReplyActivity.A0o.getStringText());
        A1f.put(messageReplyActivity.A0v.A1J, C65713Te.A01(messageReplyActivity.A0o.getMentions()));
    }

    public static void A0j(MessageReplyActivity messageReplyActivity, C135066c4 r4) {
        AnonymousClass141 A082 = messageReplyActivity.A0L.A08(messageReplyActivity.A0k);
        if (A082 != null && A082.A0C()) {
            C81173wa.A01(messageReplyActivity.A04, messageReplyActivity, 23);
        }
        messageReplyActivity.A04.Bp1(new C81203wd(messageReplyActivity, r4, 11));
    }

    public static void A0k(MessageReplyActivity messageReplyActivity, String str) {
        AnonymousClass141 A082 = messageReplyActivity.A0L.A08(messageReplyActivity.A0k);
        if (A082 != null && A082.A0C()) {
            C81173wa.A01(messageReplyActivity.A04, messageReplyActivity, 23);
        }
        messageReplyActivity.setResult(-1);
        String str2 = str;
        messageReplyActivity.A0D.A0I((C145166tS) null, (AnonymousClass3XT) null, messageReplyActivity.A0v, str2, Collections.singletonList(messageReplyActivity.A0k), messageReplyActivity.A0o.getMentions(), false, false);
        A0Q(messageReplyActivity);
    }

    public static void A0l(MessageReplyActivity messageReplyActivity, boolean z) {
        int i;
        if (C36351kA.A1X(messageReplyActivity.A0J, messageReplyActivity.A0k)) {
            i = 106;
        } else {
            AnonymousClass6YP r1 = messageReplyActivity.A1E;
            if (r1 != null) {
                if (r1.A0H != null) {
                    r1.A0T(true, false);
                } else if (r1.A0I != null) {
                    r1.A0S(false);
                    messageReplyActivity.A1E.A0Q(true);
                }
                A0Q(messageReplyActivity);
                return;
            }
            String trim = messageReplyActivity.A0o.getStringText().trim();
            if (!AnonymousClass6YV.A0P(messageReplyActivity.A08, messageReplyActivity.A0s, trim)) {
                messageReplyActivity.A05.A06(R.string.f12nameremoved, 1);
                return;
            }
            if (z) {
                trim = AnonymousClass14B.A0C(trim, 65536);
            } else if (trim.codePointCount(0, trim.length()) > 65536) {
                i = 17;
            }
            A0k(messageReplyActivity, trim);
            return;
        }
        AnonymousClass3SJ.A01(messageReplyActivity, i);
    }

    public void A3i() {
        if (this instanceof StatusReplyActivity) {
            StatusReplyActivity statusReplyActivity = (StatusReplyActivity) this;
            C29731Xt r2 = statusReplyActivity.A02;
            if (r2 != null) {
                AnonymousClass3T1 r4 = statusReplyActivity.A0v;
                AnonymousClass00C.A07(r4);
                r2.A0C.Boy(new C35271iQ(r2, 2, r4, 1, 8));
                return;
            }
            throw C36331k8.A0d("statusesStatsManager");
        }
    }

    public boolean A3l() {
        if (this.A0o.getText() == null || TextUtils.getTrimmedLength(this.A0o.getText()) == 0) {
            return true;
        }
        return false;
    }

    public void Bch(PickerSearchDialogFragment pickerSearchDialogFragment) {
        this.A1P.A02(pickerSearchDialogFragment);
    }

    public void BeM() {
        this.A0P.A0B();
    }

    public void Bix() {
        this.A0P.A0A();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A0g.A02()) {
            View view = this.A1N;
            int[] iArr = this.A1c;
            view.getLocationOnScreen(iArr);
            if (motionEvent.getRawY() >= ((float) iArr[1])) {
                if (motionEvent.getRawY() < ((float) C36431kI.A04(this.A1N, iArr[1]))) {
                    if (motionEvent.getAction() == 0) {
                        this.A1U = true;
                    } else if (motionEvent.getAction() == 1) {
                        if (this.A1U) {
                            this.A0g.A01(true);
                            this.A1N.requestFocus();
                        }
                        this.A1U = false;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (r8.A0I != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        r5 = r4.getIntExtra("provider", 0);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (r5 == 1) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (r5 == 2) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        r8.A05 = r0;
        r2.A0D.A0b(new X.AnonymousClass3SC(java.util.Collections.singletonList(r2.A0m.A03(r7, r8, (X.AnonymousClass3XT) null, r2.A0k, r2.A0v, r4.getStringExtra("caption"), (java.lang.String) null, X.C65713Te.A03(r4.getStringExtra("mentions")), (java.util.List) null, 13, 0, 0, false)), 1), r3, false, false);
        r2.A0g.A01(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
        A0Q(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
        if (r7 == null) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r21, int r22, android.content.Intent r23) {
        /*
            r20 = this;
            r2 = r20
            r3 = r21
            r1 = r22
            r4 = r23
            super.onActivityResult(r3, r1, r4)
            java.util.Set r0 = r2.A1Z
            java.util.Iterator r5 = r0.iterator()
        L_0x0011:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r5.next()
            X.4P8 r0 = (X.AnonymousClass4P8) r0
            boolean r0 = r0.BQk(r4, r3, r1)
            if (r0 == 0) goto L_0x0011
        L_0x0023:
            return
        L_0x0024:
            r0 = 8
            r6 = -1
            if (r3 == r0) goto L_0x00f4
            r0 = 9
            if (r3 == r0) goto L_0x00f4
            r0 = 22
            if (r3 == r0) goto L_0x00f4
            r0 = 25
            if (r3 == r0) goto L_0x0046
            r0 = 77
            if (r3 == r0) goto L_0x00f4
            r0 = 802(0x322, float:1.124E-42)
            if (r3 == r0) goto L_0x00f7
            r0 = 806(0x326, float:1.13E-42)
            if (r3 == r0) goto L_0x00f4
            r0 = 858(0x35a, float:1.202E-42)
            if (r3 == r0) goto L_0x00f4
            return
        L_0x0046:
            if (r1 != r6) goto L_0x0023
            java.lang.String r0 = "file_path"
            java.lang.String r3 = r4.getStringExtra(r0)
            java.lang.String r0 = "media_url"
            java.lang.String r1 = r4.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0060
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00c8
        L_0x0060:
            X.3Qj r8 = new X.3Qj
            r8.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r0 != 0) goto L_0x00ce
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r8.A0I = r0
            byte[] r3 = X.C25541Gs.A04(r0)
            r7 = r5
        L_0x0078:
            java.io.File r0 = r8.A0I
            if (r0 == 0) goto L_0x00c5
        L_0x007c:
            java.lang.String r0 = "provider"
            r1 = 0
            int r5 = r4.getIntExtra(r0, r1)
            r0 = 1
            if (r5 == r0) goto L_0x008a
            r0 = 2
            if (r5 == r0) goto L_0x008a
            r0 = 0
        L_0x008a:
            r8.A05 = r0
            X.1X4 r0 = r2.A0D
            X.1D5 r6 = r2.A0m
            X.11F r10 = r2.A0k
            java.lang.String r5 = "caption"
            java.lang.String r12 = r4.getStringExtra(r5)
            X.3T1 r11 = r2.A0v
            r9 = 0
            java.lang.String r5 = "mentions"
            java.lang.String r4 = r4.getStringExtra(r5)
            java.util.ArrayList r14 = X.C65713Te.A03(r4)
            r16 = 13
            r15 = r9
            r18 = 0
            r19 = 0
            r17 = 0
            r13 = r9
            X.2bU r4 = r6.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r6 = 1
            java.util.List r5 = java.util.Collections.singletonList(r4)
            X.3SC r4 = new X.3SC
            r4.<init>(r5, r6)
            r0.A0b(r4, r3, r1, r1)
            X.2MC r0 = r2.A0g
            r0.A01(r1)
        L_0x00c5:
            A0Q(r2)
        L_0x00c8:
            X.2M8 r0 = r2.A0f
            r0.dismiss()
            return
        L_0x00ce:
            android.net.Uri r7 = android.net.Uri.parse(r1)
            java.lang.String r0 = "media_width"
            int r0 = r4.getIntExtra(r0, r6)
            r8.A0A = r0
            java.lang.String r0 = "media_height"
            int r0 = r4.getIntExtra(r0, r6)
            r8.A06 = r0
            java.lang.String r0 = "preview_media_url"
            java.lang.String r1 = r4.getStringExtra(r0)
            if (r1 == 0) goto L_0x00f0
            X.1GZ r0 = r2.A0h
            byte[] r5 = r0.A03(r1)
        L_0x00f0:
            r3 = r5
            if (r7 != 0) goto L_0x007c
            goto L_0x0078
        L_0x00f4:
            if (r1 != r6) goto L_0x0023
            goto L_0x00fd
        L_0x00f7:
            if (r1 == r6) goto L_0x00fd
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x0023
        L_0x00fd:
            A0Q(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MessageReplyActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
        if (r0.A0D.A0E(1455) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0303, code lost:
        if (r0.A1B.BJo() == false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0084, code lost:
        if (X.C20800yB.A01(r5, r0.A0D, 6004) == false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r67) {
        /*
            r66 = this;
            r0 = r66
            r65 = r67
            r1 = r65
            super.onCreate(r1)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "isStatusReply"
            r1 = 0
            boolean r12 = r3.getBooleanExtra(r2, r1)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r2 = "isMediaViewReply"
            boolean r2 = r3.getBooleanExtra(r2, r1)
            r0.A1T = r2
            r2 = 1
            if (r12 == 0) goto L_0x002e
            X.0yC r4 = r0.A0D
            r3 = 1455(0x5af, float:2.039E-42)
            boolean r4 = r4.A0E(r3)
            r3 = 1
            if (r4 != 0) goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            r0.A1K = r3
            boolean r3 = X.C36381kD.A1X(r0)
            r0.A1S = r3
            X.1AP r8 = r0.A12
            X.0wU r4 = r0.A04
            X.005 r3 = r0.A1G
            X.1BB r7 = r0.A11
            X.0v0 r6 = r0.A09
            X.3GT r9 = r0.A14
            X.6Xz r5 = new X.6Xz
            r10 = r4
            r11 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.A1R = r5
            X.3rU r3 = new X.3rU
            r3.<init>(r5)
            r0.A1P = r3
            X.04H r4 = X.C36441kJ.A0b(r0)
            java.lang.Class<com.whatsapp.community.ConversationCommunityViewModel> r3 = com.whatsapp.community.ConversationCommunityViewModel.class
            X.04R r16 = r4.A00(r3)
            r3 = r16
            com.whatsapp.community.ConversationCommunityViewModel r3 = (com.whatsapp.community.ConversationCommunityViewModel) r3
            r16 = r3
            X.04H r4 = X.C36441kJ.A0b(r0)
            java.lang.Class<X.7yC> r3 = X.C167527yC.class
            X.04R r15 = r4.A00(r3)
            X.7yC r15 = (X.C167527yC) r15
            X.0yC r4 = r0.A0D
            X.0yV r5 = X.C21000yV.A01
            r3 = 4093(0xffd, float:5.736E-42)
            boolean r3 = X.C20800yB.A01(r5, r4, r3)
            if (r3 == 0) goto L_0x0086
            X.0yC r4 = r0.A0D
            r3 = 6004(0x1774, float:8.413E-42)
            boolean r4 = X.C20800yB.A01(r5, r4, r3)
            r3 = 1
            if (r4 != 0) goto L_0x0087
        L_0x0086:
            r3 = 0
        L_0x0087:
            r0.A1H = r3
            r3 = 2131625529(0x7f0e0639, float:1.8878269E38)
            android.content.Intent r3 = X.C36431kI.A0F(r0, r3)
            X.3Qa r4 = X.AnonymousClass3UJ.A02(r3)
            X.1A1 r3 = r0.A17     // Catch:{ all -> 0x079b }
            X.3T1 r5 = r3.A03(r4)     // Catch:{ all -> 0x079b }
            r0.A0v = r5
            if (r5 == 0) goto L_0x0786
            boolean r3 = r5 instanceof X.AnonymousClass2bI
            if (r3 != 0) goto L_0x0786
            X.3Qa r3 = r5.A1J
            X.11F r4 = r3.A00
            boolean r3 = r4 instanceof X.C177528dw
            r0.A1I = r3
            if (r3 == 0) goto L_0x076c
            X.11F r4 = r5.A0J()
            X.C18740tg.A06(r4)
        L_0x00b3:
            r0.A0k = r4
            r3 = 2131431357(0x7f0b0fbd, float:1.848444E38)
            android.view.View r3 = X.C03570Gk.A0B(r0, r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0.A03 = r3
            boolean r3 = r0.A1T
            if (r3 == 0) goto L_0x00f1
            int r4 = android.graphics.Color.argb(r1, r1, r1, r1)
            r3 = 2131102678(0x7f060bd6, float:1.78178E38)
            int r6 = X.AnonymousClass00F.A00(r0, r3)
            int[] r3 = X.C36441kJ.A1O()
            r3[r1] = r4
            r3[r2] = r6
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofArgb(r3)
            r3 = 300(0x12c, double:1.48E-321)
            r5.setDuration(r3)
            r3 = 11
            X.C53562rW.A00(r5, r0, r3)
            r4 = 3
            X.4VI r3 = new X.4VI
            r3.<init>(r0, r6, r4)
            r5.addListener(r3)
            r5.start()
        L_0x00f1:
            r3 = 2131431353(0x7f0b0fb9, float:1.8484433E38)
            android.view.View r3 = X.C03570Gk.A0B(r0, r3)
            r0.A01 = r3
            r3 = 2131428169(0x7f0b0349, float:1.8477975E38)
            android.view.View r3 = X.C03570Gk.A0B(r0, r3)
            r0.A1M = r3
            r3 = 2131429204(0x7f0b0754, float:1.8480074E38)
            android.view.View r3 = X.C03570Gk.A0B(r0, r3)
            r0.A1V = r3
            boolean r3 = r0.A1S
            if (r3 == 0) goto L_0x0754
            r3 = 2131434296(0x7f0b1b38, float:1.8490402E38)
            android.view.View r3 = X.C03570Gk.A0B(r0, r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r0.A04 = r3
            r3 = 2131433163(0x7f0b16cb, float:1.8488104E38)
            android.view.View r3 = X.C03570Gk.A0B(r0, r3)
            com.google.android.material.button.MaterialButtonToggleGroup r3 = (com.google.android.material.button.MaterialButtonToggleGroup) r3
            r0.A0A = r3
            r3 = 2131434298(0x7f0b1b3a, float:1.8490406E38)
            android.view.View r3 = X.C03570Gk.A0B(r0, r3)
            r0.A02 = r3
            android.widget.FrameLayout r4 = r0.A04
            r3 = 2131427844(0x7f0b0204, float:1.8477316E38)
            android.view.View r3 = X.C012005e.A02(r4, r3)
            android.widget.GridLayout r3 = (android.widget.GridLayout) r3
            r0.A05 = r3
            android.widget.FrameLayout r4 = r0.A04
            r3 = 2131431922(0x7f0b11f2, float:1.8485587E38)
            android.view.View r3 = X.C012005e.A02(r4, r3)
            android.widget.GridLayout r3 = (android.widget.GridLayout) r3
            r0.A06 = r3
            android.widget.FrameLayout r4 = r0.A04
            r3 = 2131427878(0x7f0b0226, float:1.8477385E38)
            android.view.View r3 = X.C012005e.A02(r4, r3)
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            r0.A1O = r3
        L_0x0156:
            r3 = 2131429777(0x7f0b0991, float:1.8481236E38)
            android.view.View r3 = r0.findViewById(r3)
            r0.A1N = r3
            r3 = 2131429201(0x7f0b0751, float:1.8480068E38)
            android.view.View r7 = r0.findViewById(r3)
            com.whatsapp.conversation.ConversationEntryActionButton r7 = (com.whatsapp.conversation.ConversationEntryActionButton) r7
            X.2yO r5 = r0.A0B
            X.0yC r6 = r0.A0D
            X.1CF r4 = r0.A0j
            X.11F r3 = r0.A0k
            boolean r3 = r4.A01(r3)
            if (r3 == 0) goto L_0x0750
            X.2ns r3 = X.C51472ns.VOICE_ONLY
        L_0x0178:
            X.3KZ r19 = X.C63743Lf.A00(r3, r6)
            r3 = 0
            X.AnonymousClass00C.A0D(r5, r2)
            X.3bR r4 = new X.3bR
            r21 = 0
            r22 = 0
            r18 = r5
            r20 = r3
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r22)
            X.04H r5 = new X.04H
            r5.<init>(r4, r0)
            java.lang.Class<X.1ts> r4 = X.C39821ts.class
            X.04R r4 = r5.A00(r4)
            X.1ts r4 = (X.C39821ts) r4
            r0.A0T = r4
            X.0ts r6 = r0.A00
            r4 = 2131433048(0x7f0b1658, float:1.848787E38)
            X.1RJ r5 = X.C36361kB.A0h(r0, r4)
            X.1ts r4 = r0.A0T
            X.AnonymousClass97U.A00(r0, r4, r3, r6, r5)
            X.1ts r6 = r0.A0T
            r5 = 2
            X.4Zx r4 = new X.4Zx
            r4.<init>(r0, r5)
            r7.A02(r0, r4, r6)
            r4 = 2131428534(0x7f0b04b6, float:1.8478715E38)
            android.view.View r6 = X.C03570Gk.A0B(r0, r4)
            android.widget.ImageButton r6 = (android.widget.ImageButton) r6
            r0.A07 = r6
            boolean r4 = X.C222013h.A07
            if (r4 == 0) goto L_0x01c9
            r6.setPadding(r1, r1, r1, r1)
        L_0x01c9:
            android.widget.ImageButton r7 = r0.A07
            X.13J r4 = r0.A1B
            boolean r6 = r4.BJo()
            r4 = 8
            int r6 = X.C36351kA.A00(r6)
            r7.setVisibility(r6)
            boolean r6 = r0.A1T
            if (r12 == 0) goto L_0x074a
            r8 = 6
        L_0x01df:
            android.widget.ImageButton r7 = r0.A07
            r6 = 24
            X.C67143Yr.A00(r7, r0, r8, r6)
            X.0yC r6 = r0.A0D
            com.whatsapp.WaImageButton r6 = X.C63733Le.A01(r0, r6)
            r0.A08 = r6
            X.C48772i1.A00(r6, r0, r5)
            android.view.LayoutInflater r8 = r0.getLayoutInflater()
            r7 = 2131626505(0x7f0e0a09, float:1.8880248E38)
            r6 = 2131435240(0x7f0b1ee8, float:1.8492317E38)
            android.view.ViewGroup r6 = X.C36421kH.A0E(r0, r6)
            r8.inflate(r7, r6, r2)
            X.4Zr r9 = new X.4Zr
            r9.<init>(r0, r5)
            X.3Gj r8 = r0.A1F
            android.view.View r7 = r0.A01
            X.C18740tg.A04(r7)
            X.190 r21 = X.C36441kJ.A0j()
            X.1ts r6 = r0.A0T
            r17 = r8
            r18 = r7
            r19 = r0
            r20 = r6
            r22 = r9
            X.6YP r9 = r17.A00(r18, r19, r20, r21, r22)
            r0.A1E = r9
            X.11F r8 = r0.A0k
            X.6Q9 r6 = r9.A0H
            boolean r6 = X.AnonymousClass000.A1V(r6)
            r7 = r6 ^ 1
            java.lang.String r6 = "Do not update the ptt receiver once the recording has started"
            X.C18740tg.A0F(r7, r6)
            r9.A0B = r8
            X.3T1 r6 = r0.A0v
            r9.A0D = r6
            r6 = 2131429985(0x7f0b0a61, float:1.8481658E38)
            android.view.View r8 = X.C03570Gk.A0B(r0, r6)
            com.whatsapp.mentions.MentionableEntry r8 = (com.whatsapp.mentions.MentionableEntry) r8
            r0.A0o = r8
            android.text.InputFilter[] r7 = new android.text.InputFilter[r2]
            X.4ZM r6 = new X.4ZM
            r6.<init>(r0, r2)
            r7[r1] = r6
            r8.setFilters(r7)
            X.3Od r8 = new X.3Od
            r8.<init>()
            com.whatsapp.mentions.MentionableEntry r7 = r0.A0o
            X.4XH r6 = new X.4XH
            r6.<init>(r8, r0, r2)
            r7.A0D = r6
            r6 = 2131430928(0x7f0b0e10, float:1.848357E38)
            android.view.View r6 = r0.findViewById(r6)
            r7 = 2131231750(0x7f080406, float:1.807959E38)
            r6.setBackgroundResource(r7)
            r6.setPadding(r1, r1, r1, r1)
            com.whatsapp.mentions.MentionableEntry r8 = r0.A0o
            X.11F r7 = r0.A0k
            boolean r7 = r8.A0I(r7)
            if (r7 == 0) goto L_0x029f
            com.whatsapp.mentions.MentionableEntry r9 = r0.A0o
            r9.A03 = r6
            X.4Y0 r7 = new X.4Y0
            r7.<init>(r6, r5)
            r9.A0A = r7
            r7 = 2131431569(0x7f0b1091, float:1.848487E38)
            android.view.View r8 = X.C03570Gk.A0B(r0, r7)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            X.11F r7 = r0.A0k
            r20 = 0
            r21 = 0
            r22 = 1
            r23 = 1
            r17 = r9
            r18 = r8
            r19 = r7
            r17.A0G(r18, r19, r20, r21, r22, r23)
        L_0x029f:
            java.util.HashMap r8 = A1g
            X.3T1 r7 = r0.A0v
            X.3Qa r7 = r7.A1J
            java.lang.Object r11 = r8.get(r7)
            java.lang.String r11 = (java.lang.String) r11
            boolean r7 = android.text.TextUtils.isEmpty(r11)
            if (r7 != 0) goto L_0x02ed
            A0h(r0)
            java.util.HashMap r8 = A1f
            X.3T1 r7 = r0.A0v
            X.3Qa r7 = r7.A1J
            java.lang.Object r7 = r8.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.util.ArrayList r8 = X.C65713Te.A03(r7)
            com.whatsapp.mentions.MentionableEntry r7 = r0.A0o
            r7.setMentionableText(r11, r8)
            X.1H2 r10 = r0.A0C
            X.0yb r9 = r0.A08
            X.0wg r8 = r0.A0s
            com.whatsapp.mentions.MentionableEntry r7 = r0.A0o
            android.text.Editable r18 = r7.getEditableText()
            com.whatsapp.mentions.MentionableEntry r7 = r0.A0o
            android.text.TextPaint r19 = r7.getPaint()
            r23 = 2131102076(0x7f06097c, float:1.781658E38)
            boolean r7 = r0.A1H
            r24 = r7
            r17 = r0
            r20 = r9
            r21 = r10
            r22 = r8
            X.AnonymousClass6YV.A0F(r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x02ed:
            boolean r8 = X.AnonymousClass14B.A0F(r11)
            r0.A1J = r8
            X.1ts r7 = r0.A0T
            r7.A0V(r8)
            android.widget.ImageButton r9 = r0.A07
            if (r8 == 0) goto L_0x0305
            X.13J r7 = r0.A1B
            boolean r8 = r7.BJo()
            r7 = 0
            if (r8 != 0) goto L_0x0307
        L_0x0305:
            r7 = 8
        L_0x0307:
            r9.setVisibility(r7)
            r7 = 2131434609(0x7f0b1c71, float:1.8491037E38)
            android.view.View r10 = X.C03570Gk.A0B(r0, r7)
            int r8 = r10.getPaddingLeft()
            int r7 = r10.getPaddingRight()
            int r9 = java.lang.Math.max(r8, r7)
            android.view.ViewGroup$MarginLayoutParams r8 = X.AnonymousClass000.A0a(r10)
            X.0ts r7 = r0.A00
            boolean r7 = X.C36351kA.A1Y(r7)
            if (r7 == 0) goto L_0x0746
            r8.rightMargin = r9
        L_0x032b:
            r10.setLayoutParams(r8)
            X.16D r8 = r0.A0L
            X.11F r7 = r0.A0k
            X.141 r9 = r8.A0D(r7)
            r7 = 5
            X.4WK r8 = new X.4WK
            r8.<init>(r0, r9, r7)
            com.whatsapp.mentions.MentionableEntry r7 = r0.A0o
            r7.addTextChangedListener(r8)
            boolean r7 = r0.A1H
            if (r7 == 0) goto L_0x0351
            com.whatsapp.mentions.MentionableEntry r9 = r0.A0o
            X.0ts r8 = r0.A00
            X.2g8 r7 = new X.2g8
            r7.<init>(r9, r8)
            r9.addTextChangedListener(r7)
        L_0x0351:
            com.whatsapp.mentions.MentionableEntry r8 = r0.A0o
            X.3f0 r7 = new X.3f0
            r7.<init>(r0)
            r8.A01 = r7
            X.C89384Wi.A00(r8, r0, r4)
            r7 = 2131429693(0x7f0b093d, float:1.8481066E38)
            android.view.View r8 = X.C03570Gk.A0B(r0, r7)
            r7 = 13
            X.C67103Yn.A00(r8, r0, r7)
            X.0yC r7 = r0.A0D
            android.widget.ImageButton r7 = X.C63733Le.A00(r0, r7)
            X.3GT r8 = r0.A14
            boolean r8 = r8.A01()
            if (r8 == 0) goto L_0x03a3
            X.0yC r11 = r0.A0D
            X.0v0 r10 = r0.A09
            X.5vT r9 = r0.A16
            X.3bK r8 = new X.3bK
            r8.<init>(r10, r11, r9)
            X.04H r9 = new X.04H
            r9.<init>(r8, r0)
            java.lang.Class<X.4lK> r8 = X.C95494lK.class
            X.04R r10 = r9.A00(r8)
            X.4lK r10 = (X.C95494lK) r10
            r0.A1Q = r10
            X.6Xz r8 = r0.A1R
            r8.A01 = r10
            X.17Y r9 = r0.A05
            X.3EH r8 = new X.3EH
            r8.<init>(r9, r10)
            r0.A15 = r8
            com.whatsapp.emoji.search.EmojiSearchProvider r8 = r0.A0b
            r8.A01(r3)
        L_0x03a3:
            boolean r9 = r0.A1T
            if (r12 == 0) goto L_0x073f
            r8 = 6
        L_0x03a8:
            java.lang.Integer r21 = java.lang.Integer.valueOf(r8)
            X.3HH r11 = r0.A0e
            X.11F r10 = r0.A0k
            r11.A05 = r10
            r11.A00 = r0
            android.view.ViewGroup r9 = r0.A03
            com.whatsapp.KeyboardPopupLayout r9 = (com.whatsapp.KeyboardPopupLayout) r9
            com.whatsapp.mentions.MentionableEntry r8 = r0.A0o
            java.lang.Integer r22 = X.C54212sa.A00(r10)
            r17 = r11
            r18 = r7
            r19 = r9
            r20 = r8
            r17.A01(r18, r19, r20, r21, r22)
            X.3HG r10 = r0.A0X
            X.AnonymousClass3HG.A00(r10, r11)
            X.4lK r9 = r0.A1Q
            X.6Xz r8 = r0.A1R
            X.3HE r8 = r10.A02(r9, r8)
            r11.A04 = r8
            X.2M8 r10 = r11.A00()
            r0.A0f = r10
            X.3rU r9 = r0.A1P
            X.11F r8 = r0.A0k
            r9.A01(r10, r8, r0)
            X.2M8 r9 = r0.A0f
            X.4Sf r8 = r0.A1W
            r9.A0H(r8)
            X.4ZL r8 = new X.4ZL
            r8.<init>(r0, r5)
            r9.A0A = r8
            X.0yW r13 = r0.A0c
            X.3L7 r12 = r0.A0i
            r8 = 2131430521(0x7f0b0c79, float:1.8482745E38)
            android.view.View r11 = r0.findViewById(r8)
            com.whatsapp.gifsearch.GifSearchContainer r11 = (com.whatsapp.gifsearch.GifSearchContainer) r11
            r8 = 2131429849(0x7f0b09d9, float:1.8481382E38)
            android.view.View r10 = r0.findViewById(r8)
            com.whatsapp.emoji.search.EmojiSearchContainer r10 = (com.whatsapp.emoji.search.EmojiSearchContainer) r10
            X.2M8 r8 = r0.A0f
            X.2MC r9 = new X.2MC
            r17 = r9
            r18 = r0
            r19 = r10
            r20 = r13
            r21 = r8
            r22 = r11
            r23 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r0.A0g = r9
            r8 = 9
            X.AnonymousClass3J6.A00(r9, r0, r8)
            X.4ZK r8 = new X.4ZK
            r8.<init>(r0, r1)
            r9.A00 = r8
            X.2M8 r10 = r0.A0f
            r8 = 4
            X.2vH r9 = new X.2vH
            r9.<init>(r0, r8)
            r10.A0L(r9)
            X.3rU r11 = r0.A1P
            X.2ty r9 = new X.2ty
            r9.<init>(r0, r2)
            r11.A01 = r9
            r10 = 3
            X.2vH r9 = new X.2vH
            r9.<init>(r0, r10)
            r11.A04 = r9
            X.6Xz r9 = r0.A1R
            X.1BB r10 = r9.A0B
            X.6Fn r9 = r9.A09
            r10.registerObserver(r9)
            boolean r10 = r0.A1K
            android.widget.FrameLayout r9 = r0.A04
            if (r10 != 0) goto L_0x067f
            r9.setVisibility(r4)
            android.view.LayoutInflater r6 = r0.getLayoutInflater()
            r4 = 2131625992(0x7f0e0808, float:1.8879208E38)
            android.view.View r10 = r6.inflate(r4, r3, r1)
            r3 = 2131433097(0x7f0b1689, float:1.848797E38)
            android.view.View r4 = r10.findViewById(r3)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            android.graphics.drawable.Drawable r3 = X.AnonymousClass3SN.A00(r0)
            r4.setForeground(r3)
            r3 = 2131433099(0x7f0b168b, float:1.8487974E38)
            android.view.View r3 = X.C03570Gk.A0B(r0, r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r3.setVisibility(r1)
            r3.addView(r10)
            r3 = 2131433109(0x7f0b1695, float:1.8487994E38)
            android.widget.TextView r9 = X.C36391kE.A0P(r10, r3)
            r3 = 2131433095(0x7f0b1687, float:1.8487966E38)
            android.widget.TextView r8 = X.C36391kE.A0P(r10, r3)
            r3 = 2131433106(0x7f0b1692, float:1.8487988E38)
            android.widget.TextView r6 = X.C36391kE.A0P(r10, r3)
            X.3Jc r4 = r0.A0Q
            android.content.res.Resources r3 = r0.getResources()
            float r3 = r4.A02(r3)
            X.C36421kH.A17(r9, r8, r6, r3)
            X.11F r3 = r0.A0k
            X.3JO r9 = new X.3JO
            r9.<init>(r3, r1, r1)
            X.9g8 r4 = r0.A0w
            X.3T1 r3 = r0.A0v
            boolean r3 = r4.A03(r3)
            if (r3 == 0) goto L_0x0668
            X.9g8 r6 = r0.A0w
            X.3T1 r4 = r0.A0v
            X.9k9 r3 = r0.A0S
            r6.A01(r10, r3, r4, r9)
        L_0x04c0:
            boolean r3 = r0.A1K
            if (r3 == 0) goto L_0x0632
            android.view.View r3 = r0.A1V
            r4 = 0
            r3.setAlpha(r4)
            android.widget.FrameLayout r3 = r0.A04
            r3.setAlpha(r4)
            android.animation.AnimatorSet r3 = X.C36441kJ.A0C()
            r0.A1L = r3
            android.widget.FrameLayout r6 = r0.A04
            android.util.Property r4 = android.view.View.ALPHA
            float[] r3 = new float[r2]
            r9 = 1065353216(0x3f800000, float:1.0)
            r3[r1] = r9
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r6, r4, r3)
            r3 = 150(0x96, double:7.4E-322)
            r8.setDuration(r3)
            android.view.animation.Interpolator r6 = A1d
            r8.setInterpolator(r6)
            android.view.View r1 = r0.A1V
            android.animation.ObjectAnimator r1 = X.C36401kF.A05(r1, r9)
            r1.setDuration(r3)
            r1.setInterpolator(r6)
            android.animation.AnimatorSet r3 = r0.A1L
            android.animation.Animator[] r1 = X.C36441kJ.A1P(r1, r8, r5)
            r3.playTogether(r1)
            X.3To r3 = r0.A1D
            X.11F r1 = r0.A0k
            X.37c r1 = r3.A05(r1)
            if (r1 == 0) goto L_0x0625
            A0n(r0, r2)
        L_0x050f:
            X.21J r3 = new X.21J
            r3.<init>(r0)
            android.view.View r1 = r0.A1M
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            X.0Ak r1 = (X.C02460Ak) r1
            r1.A00(r3)
            r1 = 11
            X.C89194Vp.A00(r3, r0, r1)
            android.view.View r1 = r0.A1M
            X.C48772i1.A00(r1, r0, r2)
            X.1NG r2 = r0.A0J
            X.11F r1 = r0.A0k
            boolean r1 = X.C36351kA.A1X(r2, r1)
            if (r1 == 0) goto L_0x0538
            r1 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass3SJ.A01(r0, r1)
        L_0x0538:
            X.2rr r35 = new X.2rr
            r35.<init>()
            X.0yC r1 = r0.A0D
            r43 = r1
            X.17Y r1 = r0.A05
            r64 = r1
            X.1N2 r1 = r0.A0C
            r56 = r1
            X.0wQ r1 = r0.A02
            r63 = r1
            X.0wN r1 = r0.A03
            r62 = r1
            X.1XY r1 = r0.A0C
            r61 = r1
            X.0y0 r1 = r0.A04
            r60 = r1
            X.0yW r1 = r0.A0c
            r44 = r1
            X.4Uz r1 = r0.A0H
            r29 = r1
            X.1X4 r1 = r0.A0D
            r25 = r1
            X.3Pe r1 = r0.A0G
            r28 = r1
            X.1YL r1 = r0.A0n
            r48 = r1
            X.0wx r1 = r0.A08
            r42 = r1
            X.2XH r1 = r0.A0l
            r47 = r1
            X.37l r1 = r0.A0I
            r30 = r1
            X.1GX r1 = r0.A19
            r58 = r1
            X.0yb r1 = r0.A08
            r39 = r1
            X.1NG r1 = r0.A0J
            r24 = r1
            X.1JD r1 = r0.A0r
            r23 = r1
            X.1Cb r1 = r0.A0U
            r22 = r1
            X.16m r1 = r0.A0K
            r21 = r1
            X.0yE r1 = r0.A0V
            r20 = r1
            X.0v0 r1 = r0.A09
            r19 = r1
            X.3Pn r1 = r0.A18
            r18 = r1
            X.3Km r14 = r0.A0E
            X.1KK r13 = r0.A0F
            X.1G4 r12 = r0.A0B
            X.0wg r11 = r0.A0s
            X.1V6 r10 = r0.A0R
            X.15g r9 = r0.A1Y
            X.11F r8 = r0.A0k
            android.view.ViewGroup r6 = r0.A03
            com.whatsapp.KeyboardPopupLayout r6 = (com.whatsapp.KeyboardPopupLayout) r6
            com.whatsapp.mentions.MentionableEntry r5 = r0.A0o
            X.3EV r4 = r0.A0q
            X.39O r3 = r0.A0p
            X.2so r2 = r0.A0d
            X.28e r1 = new X.28e
            r34 = r0
            r59 = 0
            r17 = r0
            r26 = r14
            r27 = r13
            r31 = r24
            r32 = r16
            r33 = r21
            r36 = r10
            r37 = r9
            r38 = r22
            r40 = r20
            r41 = r19
            r45 = r2
            r46 = r8
            r49 = r5
            r50 = r3
            r51 = r15
            r52 = r4
            r53 = r23
            r54 = r11
            r55 = r12
            r57 = r18
            r16 = r1
            r18 = r62
            r19 = r0
            r20 = r60
            r21 = r64
            r22 = r6
            r23 = r63
            r24 = r61
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            r0.A0P = r1
            java.util.Set r3 = r0.A1a
            r3.add(r1)
            java.util.Set r2 = r0.A1Z
            X.28e r1 = r0.A0P
            r2.add(r1)
            java.util.Set r2 = r0.A1b
            X.28e r1 = r0.A0P
            r2.add(r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x0613:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0773
            java.lang.Object r2 = r3.next()
            android.app.Application$ActivityLifecycleCallbacks r2 = (android.app.Application.ActivityLifecycleCallbacks) r2
            r1 = r65
            r2.onActivityCreated(r0, r1)
            goto L_0x0613
        L_0x0625:
            android.view.ViewGroup r1 = r0.A03
            android.view.ViewTreeObserver r3 = r1.getViewTreeObserver()
            r1 = 30
            X.C90104Zc.A00(r3, r0, r1)
            goto L_0x050f
        L_0x0632:
            r19 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.TranslateAnimation r1 = new android.view.animation.TranslateAnimation
            r20 = 1
            r21 = 0
            r22 = 1
            r24 = 1
            r25 = 0
            r18 = 1
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r3 = 200(0xc8, double:9.9E-322)
            r1.setDuration(r3)
            r3 = 300(0x12c, double:1.48E-321)
            r1.setStartOffset(r3)
            r1.setFillBefore(r2)
            r1.setFillAfter(r2)
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            r1.setInterpolator(r3)
            android.view.View r3 = r0.A1V
            r3.startAnimation(r1)
            goto L_0x050f
        L_0x0668:
            X.9k9 r8 = r0.A0S
            X.3T1 r6 = r0.A0v
            X.1RY r3 = r0.A0N
            if (r3 != 0) goto L_0x067a
            X.1Pn r4 = r0.A0O
            java.lang.String r3 = "message-reply-activity"
            X.1RY r3 = r4.A05(r0, r3)
            r0.A0N = r3
        L_0x067a:
            r8.A06(r10, r3, r6, r9)
            goto L_0x04c0
        L_0x067f:
            r9.setVisibility(r1)
            boolean r4 = X.C36381kD.A1X(r0)
            if (r4 == 0) goto L_0x0706
            X.1BF r4 = r0.A0t
            boolean r4 = r4.A01()
            if (r4 == 0) goto L_0x0739
            com.google.android.material.button.MaterialButtonToggleGroup r9 = r0.A0A
            if (r9 == 0) goto L_0x071e
            android.view.View r4 = r0.A02
            if (r4 == 0) goto L_0x071e
            r9.setVisibility(r1)
            android.view.View r4 = r0.A02
            r4.setVisibility(r1)
            X.2ZI r4 = r0.A0z
            X.3Fk r11 = r0.A1X
            r4.registerObserver(r11)
            com.google.android.material.button.MaterialButtonToggleGroup r4 = r0.A0A
            if (r4 == 0) goto L_0x06b5
            X.3bn r8 = new X.3bn
            r8.<init>(r0)
            java.util.LinkedHashSet r4 = r4.A06
            r4.add(r8)
        L_0x06b5:
            X.0v0 r4 = r0.A09
            java.lang.String r9 = "AVATAR"
            android.content.SharedPreferences r8 = X.C36341k9.A0E(r4)
            java.lang.String r4 = "status_reactions_type_selected_tab"
            java.lang.String r4 = r8.getString(r4, r9)
            X.2pg r10 = X.C52592pg.valueOf(r4)
            X.2pg r9 = X.C52592pg.EMOJI
            com.google.android.material.button.MaterialButtonToggleGroup r8 = r0.A0A
            r4 = 2131427878(0x7f0b0226, float:1.8477385E38)
            if (r10 != r9) goto L_0x06d3
            r4 = 2131429870(0x7f0b09ee, float:1.8481425E38)
        L_0x06d3:
            com.google.android.material.button.MaterialButtonToggleGroup.A01(r8, r4, r2)
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r10 = r0.A0y
            java.lang.ref.WeakReference r9 = X.AnonymousClass001.A0F(r11)
            java.io.File r8 = r10.A00
            if (r8 == 0) goto L_0x06eb
            java.lang.Object r4 = r9.get()
            X.3Fk r4 = (X.C62253Fk) r4
            if (r4 == 0) goto L_0x06eb
            r4.A00(r8)
        L_0x06eb:
            java.io.File r4 = r10.A00
            if (r4 != 0) goto L_0x0706
            X.02l r8 = r10.A04
            X.03h r4 = new X.03h
            r4.<init>(r3)
            X.02h r4 = X.C008803t.A02(r8, r4)
            X.041 r8 = X.C009403z.A02(r4)
            com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1 r4 = new com.whatsapp.status.playback.avatar.AvatarReactionRepository$startAsyncFetchAvatarDynamicIcon$1
            r4.<init>(r10, r9, r3)
            X.C36331k8.A1T(r4, r8)
        L_0x0706:
            r3 = 2131231753(0x7f080409, float:1.8079596E38)
            r6.setBackgroundResource(r3)
            boolean r3 = r0.A3l()
            if (r3 == 0) goto L_0x0717
            android.widget.FrameLayout r3 = r0.A04
            r3.setVisibility(r1)
        L_0x0717:
            android.widget.FrameLayout r3 = r0.A04
            A0M(r3, r0)
            goto L_0x04c0
        L_0x071e:
            X.1Ae r9 = r0.A0u
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r3 = "hasAvatar="
            r4.append(r3)
            X.1BF r3 = r0.A0t
            boolean r3 = r3.A01()
            java.lang.String r4 = X.C36421kH.A0d(r4, r3)
            java.lang.String r3 = "failed_to_setup_avatar_reactions_empty_toggle_type_views"
            r9.A02(r8, r3, r4)
            goto L_0x0706
        L_0x0739:
            android.widget.GridLayout r3 = r0.A06
            r3.setVisibility(r1)
            goto L_0x0706
        L_0x073f:
            r8 = 8
            if (r9 == 0) goto L_0x03a8
            r8 = 7
            goto L_0x03a8
        L_0x0746:
            r8.leftMargin = r9
            goto L_0x032b
        L_0x074a:
            r8 = 5
            if (r6 == 0) goto L_0x01df
            r8 = 7
            goto L_0x01df
        L_0x0750:
            X.2ns r3 = X.C51472ns.NONE
            goto L_0x0178
        L_0x0754:
            r3 = 2131434295(0x7f0b1b37, float:1.84904E38)
            android.view.View r4 = X.C03570Gk.A0B(r0, r3)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r0.A04 = r4
            r3 = 2131429832(0x7f0b09c8, float:1.8481348E38)
            android.view.View r3 = X.C012005e.A02(r4, r3)
            android.widget.GridLayout r3 = (android.widget.GridLayout) r3
            r0.A06 = r3
            goto L_0x0156
        L_0x076c:
            java.lang.String r3 = "chatJid must not be null"
            X.C18740tg.A07(r4, r3)
            goto L_0x00b3
        L_0x0773:
            X.0yC r2 = r0.A0D
            r1 = 0
            X.AnonymousClass00C.A0D(r2, r1)
            r1 = 4268(0x10ac, float:5.981E-42)
            boolean r1 = r2.A0E(r1)
            if (r1 != 0) goto L_0x0783
            android.widget.ImageButton r7 = r0.A08
        L_0x0783:
            r0.A09 = r7
            return
        L_0x0786:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "messagereply/message-deleted/"
            X.C36321k7.A1K(r4, r2, r3)
            X.17Y r3 = r0.A05
            r2 = 2131894512(0x7f1220f0, float:1.942383E38)
            r3.A06(r2, r1)
            r0.finish()
            return
        L_0x079b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MessageReplyActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        C39001qm r4;
        if (i == 17) {
            r4 = AnonymousClass3LW.A00(this);
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, 65536, 0);
            r4.A0p(getString(R.string.f12nameremoved, objArr));
            C39001qm.A0F(r4, this, 45, R.string.f12nameremoved);
            r4.A0f(new AnonymousClass4XP(this, 46), R.string.f12nameremoved);
        } else if (i != 106) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass141 A0D2 = this.A0L.A0D(this.A0k);
            r4 = AnonymousClass3LW.A00(this);
            Object[] objArr2 = new Object[1];
            C36361kB.A1F(this.A0M, A0D2, objArr2, 0);
            r4.A0p(getString(R.string.f12nameremoved, objArr2));
            C39001qm.A0J(r4, A0D2, this, 26, R.string.f12nameremoved);
            r4.A0f(new AnonymousClass4XP(this, 44), R.string.f12nameremoved);
            r4.A0e(new AnonymousClass4XV(this, 20));
        }
        return r4.create();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator it = this.A1b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public static AnimatorSet A0J(View view, View view2, ViewGroup viewGroup) {
        AnimatorSet A0C2 = C36441kJ.A0C();
        AnimatorSet A0C3 = C36441kJ.A0C();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{1.5f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{1.5f});
        ofFloat.setDuration(500);
        ofFloat2.setDuration(500);
        Interpolator interpolator = A1e;
        ofFloat.setInterpolator(interpolator);
        ofFloat2.setInterpolator(interpolator);
        A0C3.playTogether(C36441kJ.A1P(ofFloat, ofFloat2, 2));
        AnimatorSet A0C4 = C36441kJ.A0C();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{0.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{0.0f});
        ObjectAnimator A052 = C36401kF.A05(view, 0.0f);
        ofFloat3.setDuration(200);
        ofFloat4.setDuration(200);
        A052.setDuration(200);
        Interpolator interpolator2 = A1d;
        ofFloat3.setInterpolator(interpolator2);
        ofFloat4.setInterpolator(interpolator2);
        A052.setInterpolator(interpolator2);
        Animator[] animatorArr = new Animator[3];
        animatorArr[0] = ofFloat3;
        C36411kG.A1Q(ofFloat4, A052, animatorArr, 1);
        A0C4.playTogether(animatorArr);
        AnimatorSet A0C5 = C36441kJ.A0C();
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i).getId() != view.getId()) {
                ObjectAnimator A053 = C36401kF.A05(viewGroup.getChildAt(i), 0.0f);
                A053.setDuration(250);
                A053.setInterpolator(interpolator);
                A0I2.add(A053);
            }
        }
        if (view2 != null) {
            ObjectAnimator A054 = C36401kF.A05(view2, 0.0f);
            A054.setDuration(250);
            A054.setInterpolator(interpolator);
            A0I2.add(A054);
        }
        A0C5.playTogether(A0I2);
        A0C2.playTogether(C36441kJ.A1P(A0C3, A0C5, 2));
        A0C2.playSequentially(C36441kJ.A1P(A0C3, A0C4, 2));
        return A0C2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bb, code lost:
        if (r5 != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r14.A1S != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0M(android.view.View r22, com.whatsapp.status.playback.MessageReplyActivity r23) {
        /*
            r0 = 2131434297(0x7f0b1b39, float:1.8490404E38)
            r2 = r22
            com.whatsapp.WaTextView r11 = X.C36411kG.A0Z(r2, r0)
            r15 = 0
            r14 = r23
            if (r11 == 0) goto L_0x0025
            android.content.SharedPreferences r1 = X.C36331k8.A06(r14)
            java.lang.String r0 = "status_reactions_nux_shown_count"
            int r1 = r1.getInt(r0, r15)
            r0 = 2
            if (r1 > r0) goto L_0x0020
            boolean r1 = r14.A1S
            r0 = 0
            if (r1 == 0) goto L_0x0022
        L_0x0020:
            r0 = 8
        L_0x0022:
            r11.setVisibility(r0)
        L_0x0025:
            X.0yC r1 = r14.A0D
            r0 = 1852(0x73c, float:2.595E-42)
            java.lang.String r1 = r1.A09(r0)
            boolean r9 = r14.A1S
            java.util.List r0 = X.C56802wu.A02
            X.AnonymousClass00C.A0D(r1, r15)
            java.util.ArrayList r8 = X.AnonymousClass3TM.A01(r1)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            int r6 = r8.size()
            java.util.List r10 = X.C56802wu.A01
            int r0 = r10.size()
            if (r6 <= r0) goto L_0x0049
            r6 = r0
        L_0x0049:
            r5 = 0
        L_0x004a:
            if (r5 >= r6) goto L_0x0083
            if (r9 == 0) goto L_0x0081
            java.util.List r0 = X.C56802wu.A02
        L_0x0050:
            java.lang.Object r1 = X.C36421kH.A0Y(r0, r5)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r9 == 0) goto L_0x007f
            java.util.List r0 = X.C56802wu.A02
        L_0x005a:
            java.lang.Object r0 = r0.get(r5)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = X.C36411kG.A07(r1)
            int r3 = X.C36411kG.A07(r0)
            java.lang.Object r0 = r8.get(r5)
            int r1 = X.AnonymousClass000.A0I(r0)
            X.36o r0 = new X.36o
            r0.<init>(r4, r3, r1)
            r7.add(r0)
            int r5 = r5 + 1
            goto L_0x004a
        L_0x007f:
            r0 = r10
            goto L_0x005a
        L_0x0081:
            r0 = r10
            goto L_0x0050
        L_0x0083:
            java.util.Iterator r6 = r7.iterator()
        L_0x0087:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0140
            java.lang.Object r3 = r6.next()
            X.36o r3 = (X.C601236o) r3
            int r0 = r3.A00
            android.view.View r13 = X.C012005e.A02(r2, r0)
            com.whatsapp.emoji.EmojiContainerView r13 = (com.whatsapp.emoji.EmojiContainerView) r13
            int r0 = r3.A02
            android.widget.ImageView r10 = X.C36401kF.A0G(r2, r0)
            android.content.res.Resources r9 = X.C36341k9.A0F(r2)
            r1 = 1
            int[] r0 = new int[r1]
            int r4 = r3.A01
            r0[r15] = r4
            boolean r5 = X.AnonymousClass3UO.A02(r0)
            int[] r0 = new int[r1]
            r0[r15] = r4
            boolean r3 = X.AnonymousClass3UO.A03(r0)
            if (r3 != 0) goto L_0x00bd
            r0 = 0
            if (r5 == 0) goto L_0x00be
        L_0x00bd:
            r0 = 1
        L_0x00be:
            r13.A02 = r0
            if (r5 == 0) goto L_0x0105
            X.0wg r3 = r14.A0s
            int[] r0 = new int[r1]
            r0[r15] = r4
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r0 = X.AnonymousClass3TY.A04(r3, r0)
            X.1XQ r12 = new X.1XQ
            r12.<init>((int[]) r0)
            X.4XT r8 = new X.4XT
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
        L_0x00dc:
            r13.setOnLongClickListener(r8)
        L_0x00df:
            java.lang.String r0 = r12.toString()
            r10.setContentDescription(r0)
            r13.setClickable(r1)
            android.widget.GridLayout r1 = r14.A06
            int[] r0 = r12.A00
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            r16 = r14
            r17 = r9
            r18 = r13
            r19 = r1
            r20 = r10
            r21 = r11
            r22 = r0
            r16.A0K(r17, r18, r19, r20, r21, r22)
            goto L_0x0087
        L_0x0105:
            if (r3 == 0) goto L_0x0132
            X.0wg r3 = r14.A0s
            int[] r0 = new int[r1]
            r0[r15] = r4
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            int[] r0 = X.AnonymousClass3TY.A05(r3, r0)
            X.1XQ r12 = new X.1XQ
            r12.<init>((int[]) r0)
            X.4XT r8 = new X.4XT
            r23 = 1
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x00dc
        L_0x0132:
            int[] r0 = new int[r1]
            r0[r15] = r4
            X.1XQ r12 = new X.1XQ
            r12.<init>((int[]) r0)
            r0 = 0
            r13.setOnLongClickListener(r0)
            goto L_0x00df
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MessageReplyActivity.A0M(android.view.View, com.whatsapp.status.playback.MessageReplyActivity):void");
    }

    public static void A0h(MessageReplyActivity messageReplyActivity) {
        GridLayout gridLayout;
        if (C36381kD.A1X(messageReplyActivity)) {
            if (messageReplyActivity.A0x == C52592pg.EMOJI) {
                gridLayout = messageReplyActivity.A06;
            } else {
                gridLayout = messageReplyActivity.A05;
            }
            AnimatorSet A0C2 = C36441kJ.A0C();
            ArrayList A0I2 = AnonymousClass001.A0I();
            if (gridLayout != null) {
                for (int i = 0; i < gridLayout.getChildCount(); i++) {
                    ObjectAnimator A052 = C36401kF.A05(gridLayout.getChildAt(i), 0.0f);
                    A052.setDuration(150);
                    A052.setInterpolator(A1e);
                    A0I2.add(A052);
                }
            }
            View view = messageReplyActivity.A02;
            if (view != null) {
                ObjectAnimator A053 = C36401kF.A05(view, 0.0f);
                A053.setDuration(150);
                A053.setInterpolator(A1e);
                A0I2.add(A053);
            }
            A0C2.playTogether(A0I2);
            A0C2.start();
            return;
        }
        messageReplyActivity.A04.setVisibility(8);
    }

    public static boolean A0m(Configuration configuration, MessageReplyActivity messageReplyActivity) {
        if (C36381kD.A1X(messageReplyActivity) || configuration.orientation != 2 || messageReplyActivity.A0Z.A02()) {
            return false;
        }
        return true;
    }

    public static boolean A0n(MessageReplyActivity messageReplyActivity, boolean z) {
        if (!C36381kD.A1X(messageReplyActivity) || !z) {
            Rect A062 = AnonymousClass001.A06();
            messageReplyActivity.A03.getWindowVisibleDisplayFrame(A062);
            DisplayMetrics A0X2 = AnonymousClass000.A0X(messageReplyActivity);
            int height = messageReplyActivity.A03.getRootView().getHeight() - (A062.bottom - A062.top);
            if (((int) (((float) height) / A0X2.density)) <= 100 && !z) {
                return false;
            }
            int dimensionPixelSize = (A0X2.heightPixels - height) + messageReplyActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            ViewGroup.LayoutParams layoutParams = messageReplyActivity.A04.getLayoutParams();
            layoutParams.height = dimensionPixelSize;
            messageReplyActivity.A04.setLayoutParams(layoutParams);
        }
        messageReplyActivity.A1L.start();
        return true;
    }

    public void Btk(DialogFragment dialogFragment) {
        Btm(dialogFragment);
        getWindow().setSoftInputMode(1);
    }

    public AnonymousClass3T1 getQuotedMessage() {
        return this.A0v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (A3l() == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r5) {
        /*
            r4 = this;
            super.onConfigurationChanged(r5)
            boolean r0 = r4.A1K
            if (r0 == 0) goto L_0x0027
            android.widget.FrameLayout r3 = r4.A04
            r2 = 0
            if (r3 == 0) goto L_0x001e
            boolean r0 = A0m(r5, r4)
            if (r0 != 0) goto L_0x0019
            boolean r1 = r4.A3l()
            r0 = 0
            if (r1 != 0) goto L_0x001b
        L_0x0019:
            r0 = 8
        L_0x001b:
            r3.setVisibility(r0)
        L_0x001e:
            boolean r0 = A0m(r5, r4)
            if (r0 != 0) goto L_0x0027
            A0n(r4, r2)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.MessageReplyActivity.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A1P.A00();
        AnonymousClass6YP r0 = this.A1E;
        if (r0 != null) {
            r0.A0I();
            this.A1E = null;
        }
        AnonymousClass2M8 r02 = this.A0f;
        if (r02 != null) {
            r02.A0K();
        }
        AnonymousClass1HA r03 = this.A10;
        if (r03 != null) {
            r03.A06();
        }
        AnonymousClass1RY r04 = this.A0N;
        if (r04 != null) {
            r04.A02();
            this.A0N = null;
        }
        AnonymousClass2j9 r1 = this.A1C;
        if (r1 != null) {
            r1.A0D(true);
            this.A1C = null;
        }
        Set<Application.ActivityLifecycleCallbacks> set = this.A1a;
        for (Application.ActivityLifecycleCallbacks onActivityDestroyed : set) {
            onActivityDestroyed.onActivityDestroyed(this);
        }
        set.clear();
        this.A1Z.clear();
        this.A1b.clear();
        C133356Xz r05 = this.A1R;
        r05.A0B.unregisterObserver(r05.A09);
        this.A0z.unregisterObserver(this.A1X);
    }

    public void onPause() {
        super.onPause();
        AnonymousClass6YP r1 = this.A1E;
        if (r1 != null && r1.A0H != null) {
            r1.A0K();
        }
    }

    public void onResume() {
        super.onResume();
        for (Application.ActivityLifecycleCallbacks onActivityResumed : this.A1a) {
            onActivityResumed.onActivityResumed(this);
        }
    }

    public void onStart() {
        super.onStart();
        Window window = getWindow();
        int i = 4;
        if (this.A0f.isShowing()) {
            i = 2;
        }
        window.setSoftInputMode(i | 1);
        if (!this.A0f.isShowing() && (C36341k9.A04(this) != 2 || !C36381kD.A1X(this))) {
            this.A0o.A0C(true);
        }
        AnonymousClass2j9 r1 = this.A1C;
        if (r1 != null) {
            r1.A0D(true);
            this.A1C = null;
        }
        C56452wJ r4 = new C56452wJ(this, 1);
        AnonymousClass2j9 r12 = new AnonymousClass2j9(this.A0k, this.A17, r4, this.A1D);
        this.A1C = r12;
        C36331k8.A1F(r12, this.A04);
    }

    public void B1Z(int i) {
        A0Q(this);
    }
}
