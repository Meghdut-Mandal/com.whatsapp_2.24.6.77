package com.whatsapp.notification;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass04H;
import X.AnonymousClass11F;
import X.AnonymousClass13T;
import X.AnonymousClass141;
import X.AnonymousClass14B;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass185;
import X.AnonymousClass191;
import X.AnonymousClass1A5;
import X.AnonymousClass1A6;
import X.AnonymousClass1CF;
import X.AnonymousClass1CR;
import X.AnonymousClass1E9;
import X.AnonymousClass1EL;
import X.AnonymousClass1FR;
import X.AnonymousClass1G4;
import X.AnonymousClass1H2;
import X.AnonymousClass1HA;
import X.AnonymousClass1LI;
import X.AnonymousClass1ML;
import X.AnonymousClass1N0;
import X.AnonymousClass1N2;
import X.AnonymousClass1NG;
import X.AnonymousClass1P5;
import X.AnonymousClass1Pp;
import X.AnonymousClass1Q0;
import X.AnonymousClass1RY;
import X.AnonymousClass1SV;
import X.AnonymousClass1T1;
import X.AnonymousClass1V6;
import X.AnonymousClass1X4;
import X.AnonymousClass1XN;
import X.AnonymousClass1Y3;
import X.AnonymousClass1YV;
import X.AnonymousClass22t;
import X.AnonymousClass2FY;
import X.AnonymousClass2HC;
import X.AnonymousClass32X;
import X.AnonymousClass32Y;
import X.AnonymousClass3HF;
import X.AnonymousClass3J6;
import X.AnonymousClass3KZ;
import X.AnonymousClass3LW;
import X.AnonymousClass3SF;
import X.AnonymousClass3SJ;
import X.AnonymousClass3T1;
import X.AnonymousClass3XT;
import X.AnonymousClass3Y4;
import X.AnonymousClass4W0;
import X.AnonymousClass4W3;
import X.AnonymousClass4WB;
import X.AnonymousClass4WJ;
import X.AnonymousClass4ZL;
import X.AnonymousClass4ZM;
import X.AnonymousClass6O1;
import X.AnonymousClass6YP;
import X.AnonymousClass6YV;
import X.AnonymousClass97U;
import X.C03570Gk;
import X.C111765co;
import X.C1261362r;
import X.C135066c4;
import X.C145166tS;
import X.C148826zU;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19420v0;
import X.C19630wG;
import X.C19700wN;
import X.C19890wg;
import X.C19970wo;
import X.C199859g8;
import X.C201709k9;
import X.C20500xf;
import X.C20810yC;
import X.C21060yb;
import X.C220412q;
import X.C222713q;
import X.C225314u;
import X.C226815j;
import X.C22908AyK;
import X.C233117z;
import X.C235618y;
import X.C23981Ap;
import X.C24361Cd;
import X.C24511Cs;
import X.C24541Cv;
import X.C24801Dv;
import X.C27111My;
import X.C27361Nx;
import X.C27731Pn;
import X.C27761Ps;
import X.C28361Si;
import X.C28371Sj;
import X.C32001cn;
import X.C32621dv;
import X.C33771fu;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C39821ts;
import X.C39941uJ;
import X.C42761zR;
import X.C42801zV;
import X.C46962bx;
import X.C51472ns;
import X.C53912s6;
import X.C54212sa;
import X.C55752v8;
import X.C57532yO;
import X.C62493Gj;
import X.C63193Jc;
import X.C63743Lf;
import X.C64933Qa;
import X.C65373Ru;
import X.C68163bR;
import X.C81123wV;
import X.C88214Rv;
import X.C88314Sf;
import X.C89344We;
import X.C89384Wi;
import X.C89604Xe;
import X.C89704Xo;
import X.C90254Zr;
import X.C90314Zx;
import X.C90394a5;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.text.InputFilter;
import android.text.method.TextKeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.conversation.ConversationEntryActionButton;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class PopupNotification extends C225314u {
    public float A00;
    public Sensor A01;
    public SensorEventListener A02;
    public SensorManager A03;
    public PowerManager.WakeLock A04;
    public View.OnClickListener A05;
    public View A06;
    public View A07;
    public TextView A08;
    public C24801Dv A09;
    public C32621dv A0A;
    public C57532yO A0B;
    public C88314Sf A0C;
    public C65373Ru A0D;
    public AnonymousClass13T A0E;
    public AnonymousClass1T1 A0F;
    public AnonymousClass1LI A0G;
    public C33771fu A0H;
    public AnonymousClass1X4 A0I;
    public AnonymousClass1NG A0J;
    public C24361Cd A0K;
    public C42801zV A0L;
    public AnonymousClass1Pp A0M;
    public AnonymousClass16D A0N;
    public AnonymousClass16I A0O;
    public AnonymousClass185 A0P;
    public AnonymousClass171 A0Q;
    public C235618y A0R;
    public AnonymousClass1RY A0S;
    public C27731Pn A0T;
    public C27761Ps A0U;
    public C63193Jc A0V;
    public AnonymousClass1Y3 A0W;
    public AnonymousClass2HC A0X;
    public AnonymousClass1A6 A0Y;
    public AnonymousClass3HF A0Z;
    public AnonymousClass1V6 A0a;
    public C201709k9 A0b;
    public C39821ts A0c;
    public C19970wo A0d;
    public C19630wG A0e;
    public C18820ts A0f;
    public C220412q A0g;
    public AnonymousClass1A5 A0h;
    public AnonymousClass17X A0i;
    public C24541Cv A0j;
    public AnonymousClass16J A0k;
    public AnonymousClass141 A0l;
    public C1261362r A0m;
    public AnonymousClass6O1 A0n;
    public AnonymousClass1XN A0o;
    public AnonymousClass3J6 A0p;
    public EmojiSearchProvider A0q;
    public C20500xf A0r;
    public C233117z A0s;
    public AnonymousClass1EL A0t;
    public AnonymousClass1CF A0u;
    public AnonymousClass11F A0v;
    public AnonymousClass1P5 A0w;
    public C28371Sj A0x;
    public C28361Si A0y;
    public AnonymousClass32Y A0z;
    public PopupNotificationViewPager A10;
    public AnonymousClass1FR A11;
    public C19890wg A12;
    public AnonymousClass1YV A13;
    public AnonymousClass1ML A14;
    public C27361Nx A15;
    public AnonymousClass3T1 A16;
    public C199859g8 A17;
    public AnonymousClass1G4 A18;
    public AnonymousClass1CR A19;
    public C23981Ap A1A;
    public AnonymousClass1HA A1B;
    public AnonymousClass1E9 A1C;
    public AnonymousClass1Q0 A1D;
    public AnonymousClass1N2 A1E;
    public AnonymousClass1SV A1F;
    public AnonymousClass6YP A1G;
    public C62493Gj A1H;
    public Integer A1I;
    public List A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public int A1N;
    public View A1O;
    public Button A1P;
    public TextView A1Q;
    public TextView A1R;
    public AnonymousClass3SF A1S;
    public boolean A1T;
    public final Handler A1U;
    public final Handler A1V;
    public final Runnable A1W;
    public final Runnable A1X;
    public final HashSet A1Y;
    public final HashSet A1Z;
    public final C32001cn A1a;
    public final C226815j A1b;
    public final AnonymousClass191 A1c;
    public final C24511Cs A1d;
    public final AnonymousClass32X A1e;
    public final HashSet A1f;

    public static void A0K(PopupNotification popupNotification) {
        PopupNotification popupNotification2 = popupNotification;
        AnonymousClass141 r5 = popupNotification.A0l;
        if (r5 != null) {
            Bitmap A072 = popupNotification.A0U.A07(popupNotification2, r5, popupNotification.getResources().getDimension(R.dimen.f7nameremoved), popupNotification.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), true);
            ImageView A0P2 = C36431kI.A0P(popupNotification2, R.id.popup_thumb);
            if (A072 == null) {
                AnonymousClass1Pp r2 = popupNotification2.A0M;
                A072 = r2.A03(A0P2.getContext(), r2.A02(popupNotification2.A0l));
            }
            A0P2.setImageBitmap(A072);
        }
    }

    public boolean BLh() {
        return false;
    }

    public void Bnv() {
    }

    public void Btl(DialogFragment dialogFragment, String str) {
    }

    public void Btm(DialogFragment dialogFragment) {
    }

    public void Bu2(int i, int i2) {
    }

    public void Bwu(String str) {
    }

    public void onCreate(Bundle bundle) {
        C51472ns r0;
        requestWindowFeature(1);
        C36361kB.A0C(this).setLayoutDirection(3);
        getWindow().setStatusBarColor(AnonymousClass00F.A00(this, 17170445));
        super.onCreate(bundle);
        boolean A012 = this.A18.A01();
        int i = R.color.f6nameremoved;
        if (A012) {
            i = R.color.f6nameremoved;
        }
        C36341k9.A0r(this, getWindow(), i);
        SensorManager A0A2 = this.A08.A0A();
        C18740tg.A06(A0A2);
        this.A03 = A0A2;
        this.A01 = A0A2.getDefaultSensor(8);
        this.A1K = C55752v8.A00(this.A0D);
        PowerManager A0G2 = this.A08.A0G();
        if (A0G2 == null) {
            Log.w("popupnotification/create pm=null");
        } else {
            this.A04 = C111765co.A00(A0G2, "popupnotification", 268435466);
        }
        setContentView(getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null, false));
        this.A10 = (PopupNotificationViewPager) findViewById(R.id.message_view_pager);
        AnonymousClass2HC r4 = (AnonymousClass2HC) findViewById(R.id.entry);
        this.A0X = r4;
        r4.setFilters(new InputFilter[]{new AnonymousClass4ZM(this, 0)});
        this.A1P = (Button) findViewById(R.id.popup_action_btn);
        this.A1S = this.A0G.B3q(this, C36421kH.A0I(this, R.id.popup_title));
        this.A08 = C36391kE.A0Q(this, R.id.conversation_contact_status);
        this.A1Q = C36391kE.A0Q(this, R.id.popup_count);
        ImageView A0Q2 = C36411kG.A0Q(this, R.id.next_btn);
        C36361kB.A13(getResources().getDrawable(R.drawable.selector_media_next), A0Q2, this.A0f);
        this.A06 = findViewById(R.id.next_btn_ext);
        ImageView A0Q3 = C36411kG.A0Q(this, R.id.prev_btn);
        C36361kB.A13(getResources().getDrawable(R.drawable.selector_media_prev), A0Q3, this.A0f);
        this.A07 = findViewById(R.id.prev_btn_ext);
        this.A1R = C36391kE.A0Q(this, R.id.read_only_chat_info);
        this.A1O = findViewById(R.id.emoji_popup_anchor);
        ConversationEntryActionButton conversationEntryActionButton = (ConversationEntryActionButton) findViewById(R.id.conversation_entry_action_button);
        C57532yO r1 = this.A0B;
        C20810yC r11 = this.A0D;
        AnonymousClass141 r02 = this.A0l;
        if (r02 == null || this.A0u.A01(C36351kA.A0j(r02))) {
            r0 = C51472ns.VOICE_ONLY;
        } else {
            r0 = C51472ns.NONE;
        }
        AnonymousClass3KZ A002 = C63743Lf.A00(r0, r11);
        AnonymousClass00C.A0D(r1, 1);
        this.A0c = (C39821ts) new AnonymousClass04H(new C68163bR(r1, A002, (AnonymousClass11F) null, false, false), this).A00(C39821ts.class);
        AnonymousClass97U.A00(this, this.A0c, (C39941uJ) null, this.A0f, C36361kB.A0h(this, R.id.push_to_record_media_tooltip));
        conversationEntryActionButton.A02(this, new C90314Zx(this, 1), this.A0c);
        C42801zV r12 = new C42801zV(new C42761zR(this));
        this.A0L = r12;
        this.A10.setAdapter(r12);
        C53912s6.A00(this.A10, this, 9);
        this.A10.A0K(new C89704Xo(this, 1));
        AnonymousClass3Y4.A00(findViewById(R.id.popup_ok_btn), this, 45);
        AnonymousClass3Y4 r13 = new AnonymousClass3Y4(this, 46);
        this.A05 = r13;
        this.A1P.setOnClickListener(r13);
        AnonymousClass3Y4 r14 = new AnonymousClass3Y4(this, 47);
        A0Q2.setOnClickListener(r14);
        this.A06.setOnClickListener(r14);
        AnonymousClass3Y4 r15 = new AnonymousClass3Y4(this, 48);
        A0Q3.setOnClickListener(r15);
        this.A07.setOnClickListener(r15);
        View findViewById = findViewById(R.id.input_layout);
        findViewById.setBackgroundResource(R.drawable.ib_new_round);
        findViewById.setPadding(0, 0, 0, 0);
        View A0B2 = C03570Gk.A0B(this, R.id.text_entry_layout);
        int max = Math.max(A0B2.getPaddingLeft(), A0B2.getPaddingRight());
        ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(A0B2);
        if (C36351kA.A1Y(this.A0f)) {
            A0a2.rightMargin = max;
        } else {
            A0a2.leftMargin = max;
        }
        A0B2.setLayoutParams(A0a2);
        AnonymousClass3Y4.A00(this.A0X, this, 49);
        getLayoutInflater().inflate(R.layout.f9nameremoved, C36421kH.A0E(this, R.id.voice_note_stub), true);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) findViewById(R.id.root_layout);
        C90254Zr r16 = new C90254Zr(this, 1);
        this.A1G = this.A1H.A01(this, keyboardPopupLayout, this.A0c, C36441kJ.A0j(), r16);
        this.A0c.A0V(AnonymousClass14B.A0F(this.A0X.getText()));
        this.A0X.addTextChangedListener(new AnonymousClass4WJ(this, 15));
        this.A0X.setOnEditorActionListener(new C89384Wi(this, 7));
        C20810yC r20 = this.A0D;
        AnonymousClass1N2 r19 = this.A1E;
        C19700wN r18 = this.A03;
        AnonymousClass1H2 r17 = this.A0C;
        AnonymousClass1XN r162 = this.A0o;
        C21060yb r152 = this.A08;
        C18820ts r142 = this.A0f;
        C1261362r r122 = this.A0m;
        EmojiSearchProvider emojiSearchProvider = this.A0q;
        C19420v0 r8 = this.A09;
        C19890wg r5 = this.A12;
        AnonymousClass2HC r42 = this.A0X;
        String stringExtra = getIntent().getStringExtra("popup_notification_extra_quick_reply_jid");
        C222713q r2 = AnonymousClass11F.A00;
        Integer A003 = C54212sa.A00(r2.A02(stringExtra));
        AnonymousClass1N2 r30 = r19;
        ImageButton imageButton = (ImageButton) findViewById(R.id.emoji_picker_btn);
        AnonymousClass22t r143 = new AnonymousClass22t(this, imageButton, r18, keyboardPopupLayout, r42, r152, r8, r142, r122, this.A0n, r162, r17, emojiSearchProvider, r20, r5, r30, 21, A003);
        r143.A0H(this.A0C);
        r143.A0A = new AnonymousClass4ZL(this, 1);
        AnonymousClass3J6 r110 = new AnonymousClass3J6(this, r143, (EmojiSearchContainer) findViewById(R.id.popup_search_container));
        this.A0p = r110;
        AnonymousClass3J6.A00(r110, this, 6);
        if (getIntent().getBooleanExtra("popup_notification_extra_dismiss_notification", false)) {
            this.A0y.A0H(false);
            AnonymousClass1YV.A02(this.A13, true);
        }
        AnonymousClass11F A022 = r2.A02(getIntent().getStringExtra("popup_notification_extra_quick_reply_jid"));
        C36321k7.A1K(A022, "popupnotification/set-quick-reply-jid:", AnonymousClass000.A0u());
        this.A0v = A022;
        A3K();
        this.A0k.registerObserver(this.A1c);
        this.A0O.registerObserver(this.A1b);
        this.A0K.registerObserver(this.A1a);
        this.A0s.registerObserver(this.A1d);
        if (this.A0E.A00() > 0) {
            AnonymousClass3SJ.A01(this, 115);
        }
        if (this.A0v != null) {
            getWindow().setSoftInputMode(4);
        }
        this.A0z.A00 = this.A1e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.whatsapp.TextEmojiLabel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.whatsapp.components.button.ThumbnailButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.8Z4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.2FY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.whatsapp.TextEmojiLabel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: android.widget.RelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: X.8Zi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: X.2FY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: X.2FY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v39, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: X.8Zl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: X.8Zl} */
    /* JADX WARNING: type inference failed for: r12v0, types: [android.text.SpannableStringBuilder] */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0046 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.View A01(com.whatsapp.notification.PopupNotification r17, X.AnonymousClass3T1 r18) {
        /*
            r5 = r18
            int r1 = r5.A1I
            r4 = 0
            r7 = 2
            r3 = 1
            r6 = r17
            if (r1 == 0) goto L_0x054d
            if (r1 == r3) goto L_0x052b
            if (r1 == r7) goto L_0x0500
            r0 = 3
            if (r1 == r0) goto L_0x0491
            r0 = 4
            if (r1 == r0) goto L_0x0401
            r0 = 5
            if (r1 == r0) goto L_0x0326
            r0 = 7
            if (r1 == r0) goto L_0x054d
            r0 = 9
            if (r1 == r0) goto L_0x0280
            r0 = 20
            if (r1 == r0) goto L_0x0262
            r0 = 37
            if (r1 == r0) goto L_0x052b
            r0 = 23
            if (r1 == r0) goto L_0x052b
            r0 = 24
            if (r1 == r0) goto L_0x022d
            switch(r1) {
                case 13: goto L_0x00c5;
                case 14: goto L_0x00f3;
                case 15: goto L_0x01eb;
                case 16: goto L_0x0143;
                default: goto L_0x0032;
            }
        L_0x0032:
            switch(r1) {
                case 42: goto L_0x0047;
                case 43: goto L_0x0047;
                case 44: goto L_0x0052;
                default: goto L_0x0035;
            }
        L_0x0035:
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r6)
        L_0x003a:
            boolean r13 = X.C66013Ui.A0t(r5)
            if (r13 != 0) goto L_0x05bf
            X.3T1 r0 = r5.A0S()
            if (r0 != 0) goto L_0x05bf
            return r2
        L_0x0047:
            r1 = r5
            X.2bU r1 = (X.AnonymousClass2bU) r1
            android.view.View$OnClickListener r0 = r6.A05
            X.8Zi r2 = new X.8Zi
            r2.<init>(r6, r0, r1)
            goto L_0x003a
        L_0x0052:
            r10 = r5
            X.2bw r10 = (X.C46952bw) r10
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131624651(0x7f0e02cb, float:1.8876488E38)
            r12 = 0
            android.view.View r2 = r1.inflate(r0, r4, r12)
            r0 = 2131434654(0x7f0b1c9e, float:1.8491128E38)
            android.widget.ImageView r9 = X.C36391kE.A0N(r2, r0)
            r0 = 2131431735(0x7f0b1137, float:1.8485208E38)
            android.widget.TextView r11 = X.C36391kE.A0P(r2, r0)
            r0 = 2131432249(0x7f0b1339, float:1.848625E38)
            android.widget.TextView r1 = X.C36391kE.A0P(r2, r0)
            r0 = 2131432248(0x7f0b1338, float:1.8486248E38)
            android.widget.TextView r13 = X.C36391kE.A0P(r2, r0)
            X.0ts r0 = r6.A0f
            java.lang.String r0 = X.C65853Ts.A03(r0, r10)
            r1.setText(r0)
            X.0ts r0 = r6.A0f
            java.lang.String r8 = X.C65853Ts.A02(r6, r0, r10)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 8
            if (r0 == 0) goto L_0x00be
            r13.setVisibility(r1)
        L_0x0097:
            java.lang.String r0 = r10.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ba
            r11.setVisibility(r12)
            java.lang.String r0 = r10.A06
            r11.setText(r0)
        L_0x00a7:
            X.1SV r8 = r6.A1F
            r1 = 2131232351(0x7f08065f, float:1.8080809E38)
            X.3tS r0 = new X.3tS
            r0.<init>(r9, r8, r1)
            r8.A0C(r9, r10, r0)
            android.view.View$OnClickListener r0 = r6.A05
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x00ba:
            r11.setVisibility(r1)
            goto L_0x00a7
        L_0x00be:
            r13.setText(r8)
            r13.setVisibility(r12)
            goto L_0x0097
        L_0x00c5:
            r9 = r5
            X.2bU r9 = (X.AnonymousClass2bU) r9
            X.2FY r2 = new X.2FY
            r2.<init>(r6)
            r0 = 2131432834(0x7f0b1582, float:1.8487437E38)
            r2.setId(r0)
            r6.A07(r2)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131233137(0x7f080971, float:1.8082403E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.A04 = r0
            X.1SV r8 = r6.A1F
            r11 = 0
            r1 = 2131233164(0x7f08098c, float:1.8082458E38)
            X.3tS r0 = new X.3tS
            r0.<init>(r2, r8, r1)
            r8.A0D(r2, r9, r0)
            goto L_0x04da
        L_0x00f3:
            r1 = r5
            X.2bW r1 = (X.AnonymousClass2bW) r1
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r6)
            X.0wG r0 = r6.A0e
            java.lang.String r0 = X.C55732v6.A00(r0, r1)
            r9.setText(r0)
            X.3Jc r0 = r6.A0V
            X.C63193Jc.A00(r6, r9, r0)
            r8 = 17
            r9.setGravity(r8)
            r1 = 2130970398(0x7f04071e, float:1.7549505E38)
            r0 = 2131102028(0x7f06094c, float:1.7816482E38)
            X.C36321k7.A0M(r6, r9, r1, r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131233717(0x7f080bb5, float:1.808358E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r9.setCompoundDrawablesWithIntrinsicBounds(r0, r4, r4, r4)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166778(0x7f07063a, float:1.794781E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r9.setCompoundDrawablePadding(r0)
            r9.setPadding(r0, r0, r0, r0)
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r6)
            r2.setGravity(r8)
            r2.addView(r9)
            goto L_0x003a
        L_0x0143:
            r9 = r5
            X.2br r9 = (X.C46902br) r9
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r6)
            r0 = 17
            r2.setGravity(r0)
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131624632(0x7f0e02b8, float:1.887645E38)
            android.view.View r10 = r1.inflate(r0, r2, r3)
            r0 = 2131431259(0x7f0b0f5b, float:1.8484242E38)
            android.widget.TextView r1 = X.C36391kE.A0P(r10, r0)
            java.lang.String r0 = r9.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r15 = 8
            if (r0 != 0) goto L_0x01e7
            java.lang.String r0 = r9.A03
            r1.setText(r0)
        L_0x0171:
            r0 = 2131431263(0x7f0b0f5f, float:1.848425E38)
            android.view.View r13 = r10.findViewById(r0)
            r0 = 2131431264(0x7f0b0f60, float:1.8484252E38)
            android.view.View r12 = r10.findViewById(r0)
            r0 = 2131431265(0x7f0b0f61, float:1.8484254E38)
            android.view.View r8 = r10.findViewById(r0)
            r0 = 2131431268(0x7f0b0f64, float:1.848426E38)
            android.widget.TextView r11 = X.C36391kE.A0P(r10, r0)
            X.0wo r0 = r6.A0d
            long r17 = X.C19970wo.A00(r0)
            X.1P5 r0 = r6.A0w
            long r0 = r0.A0I(r9)
            r14 = 0
            int r16 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r16 <= 0) goto L_0x01d3
            X.C36361kB.A15(r13, r12, r8, r14)
            android.content.res.Resources r12 = r6.getResources()
            r8 = 2131100217(0x7f060239, float:1.781281E38)
            X.C36351kA.A15(r12, r11, r8)
            r13 = 2131890806(0x7f121276, float:1.9416314E38)
            java.lang.Object[] r12 = new java.lang.Object[r3]
            X.0ts r8 = r6.A0f
            java.lang.String r0 = X.AnonymousClass3UM.A00(r8, r0)
            r12[r14] = r0
            X.C36341k9.A0s(r6, r11, r12, r13)
        L_0x01bb:
            r0 = 2131434654(0x7f0b1c9e, float:1.8491128E38)
            android.view.View r8 = r10.findViewById(r0)
            com.whatsapp.components.button.ThumbnailButton r8 = (com.whatsapp.components.button.ThumbnailButton) r8
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166778(0x7f07063a, float:1.794781E38)
            X.C36361kB.A10(r1, r8, r0)
            X.AnonymousClass288.A00(r8, r6, r9)
            goto L_0x003a
        L_0x01d3:
            X.C36361kB.A15(r13, r12, r8, r15)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131101151(0x7f0605df, float:1.7814704E38)
            X.C36351kA.A15(r1, r11, r0)
            r0 = 2131890818(0x7f121282, float:1.9416339E38)
            r11.setText(r0)
            goto L_0x01bb
        L_0x01e7:
            r1.setVisibility(r15)
            goto L_0x0171
        L_0x01eb:
            com.whatsapp.TextEmojiLabel r2 = new com.whatsapp.TextEmojiLabel
            r2.<init>(r6)
            r0 = 2131432837(0x7f0b1585, float:1.8487443E38)
            r2.setId(r0)
            r0 = 2131893742(0x7f121dee, float:1.942227E38)
            java.lang.String r9 = r6.getString(r0)
            X.3Jc r0 = r6.A0V
            X.C63193Jc.A00(r6, r2, r0)
            r0 = 17
            r2.setGravity(r0)
            r1 = 2130970398(0x7f04071e, float:1.7549505E38)
            r0 = 2131102028(0x7f06094c, float:1.7816482E38)
            X.C36321k7.A0M(r6, r2, r1, r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165656(0x7f0701d8, float:1.7945535E38)
            int r8 = r1.getDimensionPixelSize(r0)
            int r1 = X.C36361kB.A02(r6, r0)
            r0 = 0
            r2.setPadding(r8, r0, r1, r0)
            r2.A0J(r9, r4, r0, r3)
            X.0yC r0 = r6.A0D
            X.C36331k8.A1A(r0, r2)
            goto L_0x003a
        L_0x022d:
            r10 = r5
            X.2bQ r10 = (X.AnonymousClass2bQ) r10
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131624613(0x7f0e02a5, float:1.887641E38)
            android.view.View r2 = X.C36361kB.A0E(r1, r4, r0)
            r0 = 2131430643(0x7f0b0cf3, float:1.8482993E38)
            android.widget.TextView r1 = X.C36391kE.A0P(r2, r0)
            r0 = 2131427833(0x7f0b01f9, float:1.8477293E38)
            android.widget.ImageView r9 = X.C36391kE.A0N(r2, r0)
            java.lang.String r0 = r10.A05
            r1.setText(r0)
            X.1SV r8 = r6.A1F
            r1 = 2131231040(0x7f080140, float:1.807815E38)
            X.3tS r0 = new X.3tS
            r0.<init>(r9, r8, r1)
            r8.A0C(r9, r10, r0)
            android.view.View$OnClickListener r0 = r6.A05
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x0262:
            r8 = r5
            X.2bx r8 = (X.C46962bx) r8
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131624693(0x7f0e02f5, float:1.8876573E38)
            android.view.View r2 = X.C36361kB.A0E(r1, r4, r0)
            r0 = 2131432844(0x7f0b158c, float:1.8487457E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.stickers.StickerView r0 = (com.whatsapp.stickers.StickerView) r0
            if (r0 == 0) goto L_0x003a
            A0M(r6, r8, r0)
            goto L_0x003a
        L_0x0280:
            r10 = r5
            X.2by r10 = (X.C46972by) r10
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r6)
            r0 = 2131432833(0x7f0b1581, float:1.8487435E38)
            r2.setId(r0)
            r0 = 17
            r2.setGravity(r0)
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131624598(0x7f0e0296, float:1.887638E38)
            android.view.View r8 = r1.inflate(r0, r2, r3)
            r0 = 2131430834(0x7f0b0db2, float:1.848338E38)
            android.widget.ImageView r14 = X.C36391kE.A0N(r8, r0)
            android.widget.TextView r11 = X.C36351kA.A0E(r8)
            r0 = 2131430902(0x7f0b0df6, float:1.8483518E38)
            android.widget.TextView r9 = X.C36391kE.A0P(r8, r0)
            r0 = 2131428278(0x7f0b03b6, float:1.8478196E38)
            android.view.View r12 = r8.findViewById(r0)
            r0 = 2131430271(0x7f0b0b7f, float:1.8482238E38)
            android.widget.TextView r13 = X.C36391kE.A0P(r8, r0)
            r0 = 2131428276(0x7f0b03b4, float:1.8478192E38)
            android.view.View r1 = r8.findViewById(r0)
            r0 = 2131430272(0x7f0b0b80, float:1.848224E38)
            android.widget.TextView r8 = X.C36391kE.A0P(r8, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MS.A00(r6, r10)
            r14.setImageDrawable(r0)
            boolean r0 = X.AnonymousClass2bU.A02(r10)
            if (r0 == 0) goto L_0x031e
            r0 = 2131895249(0x7f1223d1, float:1.9425326E38)
            r11.setText(r0)
        L_0x02df:
            r11 = 0
            r13.setVisibility(r11)
            r1.setVisibility(r11)
            X.0ts r14 = r6.A0f
            long r0 = r10.A00
            java.lang.String r0 = X.AnonymousClass3TF.A02(r14, r0)
            r13.setText(r0)
            int r0 = r10.A00
            if (r0 == 0) goto L_0x031a
            r9.setVisibility(r11)
            r12.setVisibility(r11)
            X.0ts r0 = r6.A0f
            java.lang.String r0 = X.C25561Gu.A01(r0, r10)
            r9.setText(r0)
        L_0x0304:
            java.lang.String r0 = r10.A05
            java.lang.String r1 = X.AnonymousClass1Ax.A02(r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toUpperCase(r0)
            r8.setText(r0)
            android.view.View$OnClickListener r0 = r6.A05
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x031a:
            X.C36421kH.A0x(r9, r12)
            goto L_0x0304
        L_0x031e:
            java.lang.String r0 = r10.A1a()
            r11.setText(r0)
            goto L_0x02df
        L_0x0326:
            r12 = r5
            X.2bs r12 = (X.C46912bs) r12
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r6)
            r0 = 2131432836(0x7f0b1584, float:1.848744E38)
            r2.setId(r0)
            r0 = 17
            r2.setGravity(r0)
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131624639(0x7f0e02bf, float:1.8876463E38)
            android.view.View r11 = r1.inflate(r0, r2, r3)
            r0 = 2131432740(0x7f0b1524, float:1.8487246E38)
            android.widget.TextView r10 = X.C36391kE.A0P(r11, r0)
            r0 = 2131432739(0x7f0b1523, float:1.8487244E38)
            android.widget.TextView r9 = X.C36391kE.A0P(r11, r0)
            java.lang.String r0 = r12.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r13 = 8
            if (r0 == 0) goto L_0x037a
            r10.setVisibility(r13)
            r9.setVisibility(r13)
        L_0x0362:
            r0 = 2131434654(0x7f0b1c9e, float:1.8491128E38)
            android.view.View r8 = r11.findViewById(r0)
            com.whatsapp.components.button.ThumbnailButton r8 = (com.whatsapp.components.button.ThumbnailButton) r8
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166778(0x7f07063a, float:1.794781E38)
            X.C36361kB.A10(r1, r8, r0)
            X.AnonymousClass288.A00(r8, r6, r12)
            goto L_0x003a
        L_0x037a:
            r1 = 0
            r10.setVisibility(r1)
            java.lang.String r0 = r12.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03fe
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "https://maps.google.com/maps?q="
            r8.append(r0)
            java.lang.String r15 = r12.A1a()
            java.lang.String r14 = "\\s+"
            java.lang.String r0 = "+"
            java.lang.String r0 = r15.replaceAll(r14, r0)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r8.append(r0)
            java.lang.String r0 = "&sll="
            java.lang.String r8 = X.AnonymousClass2bL.A00(r12, r0, r8)
        L_0x03a8:
            r10.setAutoLinkMask(r1)
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "<a href=\""
            r14.append(r0)
            r14.append(r8)
            java.lang.String r0 = "\">"
            r14.append(r0)
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r12.A01
            r15.append(r0)
            java.lang.String r0 = ""
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r15)
            java.lang.String r0 = android.text.Html.escapeHtml(r0)
            r14.append(r0)
            java.lang.String r0 = "</a>"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r14)
            X.C36361kB.A1P(r0, r10)
            java.lang.String r0 = r12.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03fa
            r9.setVisibility(r1)
            java.lang.String r0 = r12.A00
            r9.setText(r0)
        L_0x03eb:
            r1 = 14
            X.9v1 r0 = new X.9v1
            r0.<init>(r1, r8, r6)
            r10.setOnClickListener(r0)
            r9.setOnClickListener(r0)
            goto L_0x0362
        L_0x03fa:
            r9.setVisibility(r13)
            goto L_0x03eb
        L_0x03fe:
            java.lang.String r8 = r12.A02
            goto L_0x03a8
        L_0x0401:
            r12 = r5
            X.2bX r12 = (X.AnonymousClass2bX) r12
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r6)
            java.lang.String r1 = r12.A00
            r0 = 128(0x80, float:1.794E-43)
            java.lang.String r0 = X.AnonymousClass14B.A0C(r1, r0)
            r9.setText(r0)
            X.3Jc r0 = r6.A0V
            X.C63193Jc.A00(r6, r9, r0)
            r8 = 17
            r9.setGravity(r8)
            r1 = 2130970398(0x7f04071e, float:1.7549505E38)
            r0 = 2131102028(0x7f06094c, float:1.7816482E38)
            X.C36321k7.A0M(r6, r9, r1, r0)
            X.0wG r11 = r6.A0e
            X.16D r10 = r6.A0N
            X.0yb r2 = r6.A08
            X.0ts r1 = r6.A0f
            X.3Ql r0 = new X.3Ql
            r0.<init>(r10, r2, r11, r1)
            X.363 r0 = r0.A03(r12)
            if (r0 == 0) goto L_0x048f
            X.3Sx r0 = r0.A01
            byte[] r2 = r0.A0B
            if (r2 == 0) goto L_0x048f
            r1 = 0
            int r0 = r2.length
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeByteArray(r2, r1, r0)
        L_0x0446:
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131233717(0x7f080bb5, float:1.808358E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r10 == 0) goto L_0x048b
            int r2 = r0.getIntrinsicWidth()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131168599(0x7f070d57, float:1.7951504E38)
            float r0 = r1.getDimension(r0)
            android.graphics.Bitmap r0 = X.AnonymousClass1GW.A07(r10, r0, r2)
            android.graphics.drawable.BitmapDrawable r0 = X.C36421kH.A0C(r6, r0)
            r9.setCompoundDrawablesWithIntrinsicBounds(r0, r4, r4, r4)
        L_0x046d:
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166778(0x7f07063a, float:1.794781E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r9.setCompoundDrawablePadding(r0)
            r9.setPadding(r0, r0, r0, r0)
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r6)
            r2.setGravity(r8)
            r2.addView(r9)
            goto L_0x003a
        L_0x048b:
            r9.setCompoundDrawablesWithIntrinsicBounds(r0, r4, r4, r4)
            goto L_0x046d
        L_0x048f:
            r10 = r4
            goto L_0x0446
        L_0x0491:
            r9 = r5
            X.2bU r9 = (X.AnonymousClass2bU) r9
            X.2FY r2 = new X.2FY
            r2.<init>(r6)
            r0 = 2131432838(0x7f0b1586, float:1.8487445E38)
            r2.setId(r0)
            r6.A07(r2)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131233139(0x7f080973, float:1.8082407E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.A04 = r0
            X.1SV r8 = r6.A1F
            r11 = 0
            r1 = 2131233164(0x7f08098c, float:1.8082458E38)
            X.3tS r0 = new X.3tS
            r0.<init>(r2, r8, r1)
            r8.A0D(r2, r9, r0)
            int r0 = r9.A0B     // Catch:{ IllegalArgumentException -> 0x04f9 }
            if (r0 == 0) goto L_0x04cb
            X.0ts r8 = r6.A0f     // Catch:{ IllegalArgumentException -> 0x04f9 }
            int r0 = r9.A0B     // Catch:{ IllegalArgumentException -> 0x04f9 }
            long r0 = (long) r0     // Catch:{ IllegalArgumentException -> 0x04f9 }
            java.lang.String r11 = X.AnonymousClass3UY.A07(r8, r0)     // Catch:{ IllegalArgumentException -> 0x04f9 }
            goto L_0x04e7
        L_0x04cb:
            long r0 = r9.A00     // Catch:{ IllegalArgumentException -> 0x04f9 }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x04e7
            X.0ts r8 = r6.A0f     // Catch:{ IllegalArgumentException -> 0x04f9 }
            java.lang.String r11 = X.AnonymousClass3TF.A02(r8, r0)     // Catch:{ IllegalArgumentException -> 0x04f9 }
            goto L_0x04e7
        L_0x04da:
            int r0 = r9.A0B     // Catch:{ IllegalArgumentException -> 0x04f9 }
            if (r0 == 0) goto L_0x04ea
            X.0ts r8 = r6.A0f     // Catch:{ IllegalArgumentException -> 0x04f9 }
            int r0 = r9.A0B     // Catch:{ IllegalArgumentException -> 0x04f9 }
            long r0 = (long) r0     // Catch:{ IllegalArgumentException -> 0x04f9 }
            java.lang.String r11 = X.AnonymousClass3UY.A07(r8, r0)     // Catch:{ IllegalArgumentException -> 0x04f9 }
        L_0x04e7:
            r2.A05 = r11     // Catch:{ IllegalArgumentException -> 0x04f9 }
            goto L_0x04f9
        L_0x04ea:
            long r0 = r9.A00     // Catch:{ IllegalArgumentException -> 0x04f9 }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x04e7
            X.0ts r8 = r6.A0f     // Catch:{ IllegalArgumentException -> 0x04f9 }
            java.lang.String r11 = X.AnonymousClass3TF.A02(r8, r0)     // Catch:{ IllegalArgumentException -> 0x04f9 }
            goto L_0x04e7
        L_0x04f9:
            android.view.View$OnClickListener r0 = r6.A05
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x0500:
            r8 = r5
            X.2bi r8 = (X.C46812bi) r8
            int r0 = r8.A09
            if (r0 != r3) goto L_0x0524
            X.1RY r1 = r6.A0S
            if (r1 != 0) goto L_0x0515
            X.1Pn r1 = r6.A0T
            java.lang.String r0 = "popup-notification"
            X.1RY r1 = r1.A05(r6, r0)
            r6.A0S = r1
        L_0x0515:
            X.1V6 r0 = r6.A0a
            X.8Zl r2 = new X.8Zl
            r13 = r6
            r9 = r2
            r10 = r6
            r11 = r1
            r12 = r0
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x003a
        L_0x0524:
            X.8Z4 r2 = new X.8Z4
            r2.<init>(r6, r6, r8)
            goto L_0x003a
        L_0x052b:
            com.whatsapp.components.button.ThumbnailButton r2 = new com.whatsapp.components.button.ThumbnailButton
            r2.<init>(r6)
            r0 = 2131432835(0x7f0b1583, float:1.8487439E38)
            r2.setId(r0)
            r6.A07(r2)
            X.1SV r8 = r6.A1F
            r1 = 2131233158(0x7f080986, float:1.8082446E38)
            X.3tS r0 = new X.3tS
            r0.<init>(r2, r8, r1)
            r8.A0D(r2, r5, r0)
            android.view.View$OnClickListener r0 = r6.A05
            r2.setOnClickListener(r0)
            goto L_0x003a
        L_0x054d:
            com.whatsapp.TextEmojiLabel r2 = new com.whatsapp.TextEmojiLabel
            r2.<init>(r6)
            r0 = 2131432839(0x7f0b1587, float:1.8487447E38)
            r2.setId(r0)
            X.9lY r0 = r5.A0M
            r8 = 0
            if (r0 == 0) goto L_0x05ac
            X.1FR r0 = r6.A11
            java.lang.String r9 = r0.A0Z(r5)
        L_0x0563:
            boolean r0 = r5.A1H()
            if (r0 == 0) goto L_0x057d
            android.text.SpannableStringBuilder r9 = X.C36441kJ.A0P(r9)
            X.1Sj r10 = r6.A0x
            X.3Qa r0 = r5.A1J
            X.11F r1 = r0.A00
            java.util.List r0 = r5.A0w
            r15 = 1
            r11 = r6
            r12 = r9
            r13 = r1
            r14 = r0
            r10.A04(r11, r12, r13, r14, r15)
        L_0x057d:
            X.3Jc r0 = r6.A0V
            X.C63193Jc.A00(r6, r2, r0)
            r0 = 17
            r2.setGravity(r0)
            r1 = 2130970398(0x7f04071e, float:1.7549505E38)
            r0 = 2131102028(0x7f06094c, float:1.7816482E38)
            X.C36321k7.A0M(r6, r2, r1, r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165656(0x7f0701d8, float:1.7945535E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = X.C36361kB.A02(r6, r0)
            r2.setPadding(r1, r8, r0, r8)
            r2.A0J(r9, r4, r8, r3)
            X.0yC r0 = r6.A0D
            X.C36331k8.A1A(r0, r2)
            goto L_0x003a
        L_0x05ac:
            boolean r0 = r5 instanceof X.AnonymousClass2bI
            if (r0 == 0) goto L_0x05ba
            X.1T1 r1 = r6.A0F
            r0 = r5
            X.2bI r0 = (X.AnonymousClass2bI) r0
            java.lang.String r9 = r1.A0O(r0, r8)
            goto L_0x0563
        L_0x05ba:
            java.lang.String r9 = r5.A0b()
            goto L_0x0563
        L_0x05bf:
            android.view.LayoutInflater r1 = r6.getLayoutInflater()
            r0 = 2131625993(0x7f0e0809, float:1.887921E38)
            r8 = 0
            android.view.View r9 = r1.inflate(r0, r4, r8)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r0 = 2131433097(0x7f0b1689, float:1.848797E38)
            android.view.View r10 = r9.findViewById(r0)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            X.3T1 r0 = r5.A0S()
            if (r0 == 0) goto L_0x06d9
            r10.setVisibility(r8)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3SN.A00(r6)
            r10.setForeground(r0)
            r0 = 2131433109(0x7f0b1695, float:1.8487994E38)
            android.widget.TextView r12 = X.C36391kE.A0P(r10, r0)
            r0 = 2131433095(0x7f0b1687, float:1.8487966E38)
            android.widget.TextView r11 = X.C36391kE.A0P(r10, r0)
            r0 = 2131433106(0x7f0b1692, float:1.8487988E38)
            android.widget.TextView r4 = X.C36391kE.A0P(r10, r0)
            X.3Jc r1 = r6.A0V
            android.content.res.Resources r0 = r6.getResources()
            float r0 = r1.A02(r0)
            X.C36421kH.A17(r12, r11, r4, r0)
            X.3Qa r0 = r5.A1J
            X.11F r0 = r0.A00
            X.3JO r11 = new X.3JO
            r11.<init>(r0, r8, r8)
            X.3T1 r5 = r5.A0S()
            X.9g8 r0 = r6.A17
            boolean r0 = r0.A03(r5)
            if (r0 == 0) goto L_0x06c4
            X.9g8 r1 = r6.A17
            X.9k9 r0 = r6.A0b
            r1.A01(r10, r0, r5, r11)
        L_0x0624:
            if (r13 == 0) goto L_0x06bc
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166170(0x7f0703da, float:1.7946578E38)
            int r13 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166169(0x7f0703d9, float:1.7946576E38)
            int r12 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166171(0x7f0703db, float:1.794658E38)
            int r11 = r1.getDimensionPixelSize(r0)
            r0 = -1
            r10 = -2
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r0, r10)
            r0 = 3
            r5.gravity = r0
            android.content.Context r0 = r6.getApplicationContext()
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r0)
            r1.setOrientation(r8)
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()
            java.lang.String r4 = X.C19430v1.A09
            r14.append(r4)
            r0 = 2131889710(0x7f120e2e, float:1.9414091E38)
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r4, r14)
            com.whatsapp.TextEmojiLabel r4 = new com.whatsapp.TextEmojiLabel
            r4.<init>(r6)
            r4.setText(r0)
            android.content.res.Resources r14 = r6.getResources()
            r0 = 2131102394(0x7f060aba, float:1.7817225E38)
            X.C36351kA.A15(r14, r4, r0)
            android.graphics.Typeface r0 = r4.getTypeface()
            r4.setTypeface(r0, r7)
            r4.setSingleLine()
            r4.setLines(r3)
            X.3Jc r3 = r6.A0V
            android.content.res.Resources r0 = r6.getResources()
            float r0 = r3.A02(r0)
            r4.setTextSize(r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r0)
            r4.setCompoundDrawablePadding(r12)
            r1.setPadding(r13, r11, r13, r8)
            r1.addView(r4, r10, r10)
            r9.addView(r1, r8, r5)
            X.0ts r0 = r6.A0f
            boolean r1 = X.C36401kF.A1X(r0)
            r0 = 2131232309(0x7f080635, float:1.8080724E38)
            if (r1 == 0) goto L_0x06c0
            r4.setCompoundDrawablesWithIntrinsicBounds(r8, r8, r0, r8)
        L_0x06bc:
            r9.addView(r2)
            return r9
        L_0x06c0:
            r4.setCompoundDrawablesWithIntrinsicBounds(r0, r8, r8, r8)
            goto L_0x06bc
        L_0x06c4:
            X.9k9 r4 = r6.A0b
            X.1RY r0 = r6.A0S
            if (r0 != 0) goto L_0x06d4
            X.1Pn r1 = r6.A0T
            java.lang.String r0 = "popup-notification"
            X.1RY r0 = r1.A05(r6, r0)
            r6.A0S = r0
        L_0x06d4:
            r4.A06(r10, r0, r5, r11)
            goto L_0x0624
        L_0x06d9:
            r0 = 8
            r10.setVisibility(r0)
            goto L_0x0624
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.A01(com.whatsapp.notification.PopupNotification, X.3T1):android.view.View");
    }

    public static void A0F(PopupNotification popupNotification) {
        if (!popupNotification.A1J.isEmpty()) {
            A0L(popupNotification, popupNotification.A10.getCurrentItem());
        }
    }

    public static void A0H(PopupNotification popupNotification) {
        Class<AnonymousClass11F> cls = AnonymousClass11F.class;
        popupNotification.A0W.A01(C36441kJ.A0k(popupNotification.A0l, cls), 2, true, true);
        InputMethodManager A0N2 = popupNotification.A08.A0N();
        if (A0N2 != null && A0N2.isFullscreenMode()) {
            A0N2.hideSoftInputFromWindow(popupNotification.A0X.getWindowToken(), 0);
        }
        int currentItem = popupNotification.A10.getCurrentItem();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("popupnotification/moveToNextMessageOrExit/ message_pos:");
        A0u2.append(currentItem);
        A0u2.append(" messages.size:");
        C36321k7.A1Y(A0u2, popupNotification.A1J.size());
        popupNotification.A1f.add(C36411kG.A0n(popupNotification.A1J, currentItem).A1J);
        if (popupNotification.A1J.size() == 1 || (popupNotification.A0v != null && popupNotification.A1N == 1)) {
            A0I(popupNotification);
            popupNotification.finish();
            return;
        }
        int i = currentItem + 1;
        if (currentItem == C36421kH.A06(popupNotification.A1J, 1)) {
            i = currentItem - 1;
        }
        popupNotification.A1I = Integer.valueOf(currentItem);
        popupNotification.A10.A0J(i, true);
        if (popupNotification.A1J.size() == 1) {
            A0G(popupNotification);
        }
        AnonymousClass3T1 r0 = popupNotification.A16;
        if (r0 != null) {
            popupNotification.A1Z.add(r0.A1J);
        }
        AnonymousClass141 r02 = popupNotification.A0l;
        if (r02 != null) {
            popupNotification.A1Y.add(r02.A06(cls));
        }
    }

    public static void A0J(PopupNotification popupNotification) {
        AnonymousClass141 r1 = popupNotification.A0l;
        if (r1 == null) {
            return;
        }
        if (C36331k8.A1Y(popupNotification.A0J, r1)) {
            AnonymousClass3SJ.A01(popupNotification, 106);
            return;
        }
        String A0f2 = C36331k8.A0f(popupNotification.A0X);
        if (A0f2.length() > 0) {
            if (AnonymousClass6YV.A0P(popupNotification.A08, popupNotification.A12, A0f2)) {
                popupNotification.A0I.A0I((C145166tS) null, (AnonymousClass3XT) null, (AnonymousClass3T1) null, A0f2, Collections.singletonList(C36411kG.A0h(popupNotification.A0l)), (List) null, false, false);
                TextKeyListener.clear(popupNotification.A0X.getText());
            } else {
                popupNotification.A05.A06(R.string.f12nameremoved, 1);
            }
            A0H(popupNotification);
            return;
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("popupnotification/sendentry/empty text ");
        C36321k7.A1Y(A0u2, popupNotification.A1J.size());
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0L(com.whatsapp.notification.PopupNotification r10, int r11) {
        /*
        L_0x0000:
            java.util.List r0 = r10.A1J
            int r0 = r0.size()
            if (r11 >= 0) goto L_0x000a
            int r11 = r11 + r0
            goto L_0x0000
        L_0x000a:
            int r11 = r11 % r0
            java.util.List r0 = r10.A1J
            X.3T1 r0 = X.C36411kG.A0n(r0, r11)
            r10.A16 = r0
            X.3Qa r0 = r0.A1J
            X.11F r4 = r0.A00
            X.6YP r2 = r10.A1G
            X.6Q9 r0 = r2.A0H
            if (r0 != 0) goto L_0x002a
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "Do not update the ptt receiver once the recording has started"
            X.C18740tg.A0F(r1, r0)
            r2.A0B = r4
        L_0x002a:
            X.1A5 r0 = r10.A0h
            X.141 r0 = r0.A01(r4)
            r10.A0l = r0
            boolean r0 = r0.A0G()
            r3 = 1
            r2 = 8
            r1 = 0
            if (r0 == 0) goto L_0x0155
            X.17X r0 = r10.A0i
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            boolean r0 = r0.A0C(r4)
            if (r0 != 0) goto L_0x011b
            android.view.View r0 = r10.A1O
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.A1R
            r0.setVisibility(r1)
            android.widget.TextView r5 = r10.A1R
            X.141 r0 = r10.A0l
            boolean r4 = r0.A0i
            r0 = 2131887538(0x7f1205b2, float:1.9409686E38)
            if (r4 == 0) goto L_0x005e
            r0 = 2131887536(0x7f1205b0, float:1.9409682E38)
        L_0x005e:
            r5.setText(r0)
        L_0x0061:
            X.1ML r0 = r10.A14
            int r0 = r0.A00
            r5 = 3
            if (r0 == r5) goto L_0x007f
            X.141 r0 = r10.A0l
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x007f
            X.141 r0 = r10.A0l
            com.whatsapp.jid.Jid r4 = X.C36431kI.A0h(r0)
            X.11F r4 = (X.AnonymousClass11F) r4
            if (r4 == 0) goto L_0x007f
            X.1Nx r0 = r10.A15
            r0.A07(r4)
        L_0x007f:
            java.util.List r0 = r10.A1J
            int r0 = r0.size()
            if (r0 == r3) goto L_0x008b
            boolean r0 = r10.A1M
            if (r0 == 0) goto L_0x00a1
        L_0x008b:
            java.util.HashSet r4 = r10.A1Z
            X.3T1 r0 = r10.A16
            X.3Qa r0 = r0.A1J
            r4.add(r0)
            java.util.HashSet r4 = r10.A1Y
            X.141 r0 = r10.A0l
            com.whatsapp.jid.Jid r0 = X.C36411kG.A0h(r0)
            r4.add(r0)
            r10.A1M = r1
        L_0x00a1:
            A0K(r10)
            r4 = 2131895662(0x7f12256e, float:1.9426163E38)
            X.3T1 r0 = r10.A16
            int r0 = r0.A1I
            if (r0 != r5) goto L_0x00b0
            r4 = 2131896167(0x7f122767, float:1.9427188E38)
        L_0x00b0:
            android.widget.Button r0 = r10.A1P
            r0.setText(r4)
            X.3SF r4 = r10.A1S
            X.141 r0 = r10.A0l
            r4.A05(r0)
            X.141 r0 = r10.A0l
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x00fc
            X.3T1 r0 = r10.A16
            X.11F r5 = r0.A0J()
            if (r5 == 0) goto L_0x0115
            X.C18740tg.A06(r5)
            android.widget.TextView r4 = r10.A08
            X.171 r2 = r10.A0Q
            X.16D r0 = r10.A0N
            java.lang.String r0 = X.C36381kD.A0u(r0, r2, r5)
            r4.setText(r0)
            android.widget.TextView r0 = r10.A08
            r0.setVisibility(r1)
        L_0x00e1:
            android.widget.TextView r5 = r10.A1Q
            r4 = 2131890946(0x7f121302, float:1.9416598E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0M()
            int r0 = r11 + 1
            X.AnonymousClass000.A1L(r2, r0, r1)
            java.util.List r0 = r10.A1J
            int r0 = r0.size()
            X.AnonymousClass000.A1L(r2, r0, r3)
            X.C36341k9.A0s(r10, r5, r2, r4)
            return
        L_0x00fc:
            X.1dv r4 = r10.A0A
            X.141 r0 = r10.A0l
            java.lang.String r4 = r4.A00(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0115
            android.widget.TextView r0 = r10.A08
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.A08
            r0.setText(r4)
            goto L_0x00e1
        L_0x0115:
            android.widget.TextView r0 = r10.A08
            r0.setVisibility(r2)
            goto L_0x00e1
        L_0x011b:
            X.17X r0 = r10.A0i
            boolean r0 = r0.A0C(r4)
            if (r0 == 0) goto L_0x0155
            X.141 r0 = r10.A0l
            boolean r0 = r0.A0d
            if (r0 == 0) goto L_0x0155
            X.17X r0 = r10.A0i
            boolean r0 = r0.A0D(r4)
            if (r0 != 0) goto L_0x0155
            android.view.View r0 = r10.A1O
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.A1R
            r0.setVisibility(r1)
            android.widget.TextView r6 = r10.A1R
            r5 = 2131890059(0x7f120f8b, float:1.94148E38)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r0 = "000000"
            java.lang.String r0 = X.C36391kE.A0v(r10, r0, r4, r1, r5)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.String r0 = r0.toString()
            r6.setText(r0)
            goto L_0x0061
        L_0x0155:
            X.1EL r4 = r10.A0t
            X.141 r0 = r10.A0l
            boolean r0 = r4.A01(r0)
            if (r0 != 0) goto L_0x0193
            X.0yC r6 = r10.A0D
            X.185 r5 = r10.A0P
            X.141 r0 = r10.A0l
            com.whatsapp.jid.UserJid r4 = X.C36391kE.A0i(r0)
            X.0xf r0 = r10.A0r
            boolean r0 = X.C63823Lo.A01(r5, r6, r0, r4)
            if (r0 != 0) goto L_0x0193
            X.0yC r6 = r10.A0D
            X.0xf r7 = r10.A0r
            X.18y r5 = r10.A0R
            X.1E9 r9 = r10.A1C
            X.185 r4 = r10.A0P
            X.141 r0 = r10.A0l
            com.whatsapp.jid.UserJid r8 = X.C36411kG.A0k(r0)
            boolean r0 = X.AnonymousClass3RK.A00(r4, r5, r6, r7, r8, r9)
            if (r0 != 0) goto L_0x0193
            android.view.View r0 = r10.A1O
            r0.setVisibility(r1)
        L_0x018c:
            android.widget.TextView r0 = r10.A1R
            r0.setVisibility(r2)
            goto L_0x0061
        L_0x0193:
            android.view.View r0 = r10.A1O
            r0.setVisibility(r2)
            goto L_0x018c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.A0L(com.whatsapp.notification.PopupNotification, int):void");
    }

    public static void A0M(PopupNotification popupNotification, C46962bx r7, StickerView stickerView) {
        C135066c4 A002 = popupNotification.A1A.A00(r7);
        StickerView stickerView2 = stickerView;
        if (A002.A0A == null) {
            stickerView.setImageResource(R.drawable.sticker_error_in_conversation);
        }
        int dimensionPixelSize = C36341k9.A0F(stickerView).getDimensionPixelSize(R.dimen.f7nameremoved);
        popupNotification.A1B.A09(stickerView2, A002, (C88214Rv) null, dimensionPixelSize, dimensionPixelSize, false, false);
    }

    public static boolean A0O(PopupNotification popupNotification) {
        if (C36361kB.A0n(popupNotification.A0X).length() > 0 || popupNotification.A1G.A0H != null) {
            return true;
        }
        return false;
    }

    public void A2F() {
        if (!this.A1T) {
            this.A1T = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r3 = r1.A00;
            this.A0B = (AnonymousClass1N0) r3.A3P.get();
            this.A0e = C36351kA.A0W(r1);
            this.A0d = C36351kA.A0V(r1);
            this.A0H = C36351kA.A0P(r1);
            this.A1E = C36401kF.A0f(r1);
            this.A0x = (C28371Sj) r1.A4r.get();
            this.A0g = C36351kA.A0a(r1);
            this.A0I = C36361kB.A0T(r1);
            this.A0r = r1.AzV();
            this.A0o = C36351kA.A0d(r1);
            this.A09 = C36351kA.A0J(r1);
            this.A0T = C36351kA.A0T(r1);
            this.A11 = C36431kI.A0p(r1);
            this.A0M = C36361kB.A0V(r1);
            this.A0N = C36341k9.A0R(r1);
            this.A0A = (C32621dv) r1.A2G.get();
            this.A17 = (C199859g8) r3.ABh.get();
            this.A1A = (C23981Ap) r1.A83.get();
            this.A0f = C36341k9.A0T(r1);
            this.A0m = C36371kC.A0b(r3);
            this.A0Q = C36341k9.A0S(r1);
            this.A14 = (AnonymousClass1ML) r1.A5T.get();
            this.A15 = (C27361Nx) r1.A6d.get();
            this.A1D = (AnonymousClass1Q0) r1.A0L.get();
            this.A0J = C36381kD.A0V(r1);
            this.A0V = C36371kC.A0V(r1);
            this.A0t = C36381kD.A0d(r1);
            this.A0j = (C24541Cv) r1.A4O.get();
            this.A0R = C36401kF.A0U(r1);
            this.A19 = C36371kC.A0j(r1);
            this.A1F = C36401kF.A0g(r1);
            this.A13 = (AnonymousClass1YV) r1.A5S.get();
            this.A0b = C27111My.A1O(A0L2);
            this.A0u = C36361kB.A0b(r1);
            this.A0K = C36371kC.A0T(r1);
            this.A0D = (C65373Ru) r3.ACO.get();
            this.A0q = C36351kA.A0f(r3);
            this.A0y = C36371kC.A0g(r1);
            this.A1C = (AnonymousClass1E9) r1.A8c.get();
            this.A0P = C36371kC.A0U(r1);
            this.A0Y = C36401kF.A0V(r1);
            this.A0w = C36411kG.A0l(r1);
            this.A1B = (AnonymousClass1HA) r1.A84.get();
            this.A0W = (AnonymousClass1Y3) r1.A2N.get();
            this.A18 = (AnonymousClass1G4) r1.A7Z.get();
            this.A0i = C36351kA.A0b(r1);
            this.A0z = (AnonymousClass32Y) r1.AWe.get();
            this.A12 = C36351kA.A0m(r1);
            this.A0E = (AnonymousClass13T) r1.A7q.get();
            this.A0F = (AnonymousClass1T1) r1.A8V.get();
            this.A0U = C36361kB.A0W(r1);
            this.A0Z = (AnonymousClass3HF) r3.A2h.get();
            this.A0a = (AnonymousClass1V6) r1.A4v.get();
            this.A0h = C36371kC.A0X(r1);
            this.A0s = C36371kC.A0c(r1);
            this.A0n = C36351kA.A0c(r3);
            this.A1H = C27111My.A3c(A0L2);
            this.A0G = C36361kB.A0S(r1);
            this.A0B = (C57532yO) A0L2.A1L.get();
            this.A0k = C36361kB.A0Z(r1);
            this.A0O = C36351kA.A0S(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (A0O(r9) != false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3K() {
        /*
            r9 = this;
            java.lang.String r0 = "popupnotification/initpopup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = 0
            r9.A1M = r3
            r0 = 0
            r9.A1I = r0
            com.whatsapp.notification.PopupNotificationViewPager r0 = r9.A10
            int r0 = r0.getCurrentItem()
            r2 = 1
            if (r0 != 0) goto L_0x001b
            boolean r0 = A0O(r9)
            r8 = 1
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r8 = 0
        L_0x001c:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r9.A1N = r3
            X.1A6 r0 = r9.A0Y
            java.util.ArrayList r0 = r0.A04()
            java.util.Iterator r7 = r0.iterator()
        L_0x002c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0088
            X.11F r6 = X.C36401kF.A0a(r7)
            X.12q r0 = r9.A0g
            int r5 = r0.A02(r6)
            if (r5 <= 0) goto L_0x002c
            X.1CR r0 = r9.A19
            X.3LI r1 = X.C36361kB.A0d(r6, r0)
            X.11F r0 = r9.A0v
            if (r0 == 0) goto L_0x004e
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x005f
        L_0x004e:
            boolean r0 = r1.A0A()
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = r1.A06()
            int r0 = java.lang.Integer.parseInt(r0)
            if (r0 != 0) goto L_0x005f
            goto L_0x002c
        L_0x005f:
            X.1Cv r0 = r9.A0j
            java.util.ArrayList r0 = r0.A07(r6, r5)
            java.util.Iterator r6 = r0.iterator()
        L_0x0069:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0081
            X.3T1 r5 = X.C36391kE.A0l(r6)
            java.util.HashSet r1 = r9.A1f
            X.3Qa r0 = r5.A1J
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0069
            r4.add(r5)
            goto L_0x0069
        L_0x0081:
            int r0 = r9.A1N
            int r0 = r0 + 1
            r9.A1N = r0
            goto L_0x002c
        L_0x0088:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "popupnotification/count:"
            r1.append(r0)
            int r0 = r4.size()
            X.C36321k7.A1Y(r1, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00a2
            r9.finish()
        L_0x00a1:
            return
        L_0x00a2:
            int r0 = r4.size()
            if (r0 != r2) goto L_0x01a1
            A0G(r9)
        L_0x00ab:
            X.3xQ r0 = X.C81693xQ.A00
            java.util.Collections.sort(r4, r0)
            r9.A1J = r4
            X.1zV r0 = r9.A0L
            r0.A09()
            com.whatsapp.notification.PopupNotificationViewPager r1 = r9.A10
            X.1zV r0 = r9.A0L
            r1.setAdapter(r0)
            X.3T1 r0 = r9.A16
            if (r0 == 0) goto L_0x0197
            if (r8 == 0) goto L_0x0164
            boolean r0 = r9.A1L
            if (r0 == 0) goto L_0x0197
            com.whatsapp.notification.PopupNotificationViewPager r0 = r9.A10
            r0.A0O(r2, r3, r2)
            A0L(r9, r2)
            java.util.List r0 = r9.A1J
            int r0 = r0.size()
            if (r2 < r0) goto L_0x0161
            java.util.List r0 = r9.A1J
            int r0 = r0.size()
            int r0 = -r0
        L_0x00df:
            com.whatsapp.notification.PopupNotificationViewPager r4 = r9.A10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r4.A01 = r1
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x00f7
            if (r1 == 0) goto L_0x00f7
            int r0 = r1.intValue()
            r4.A0J(r0, r2)
            r0 = 0
            r4.A01 = r0
        L_0x00f7:
            r0 = 2130772025(0x7f010039, float:1.7147157E38)
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r9, r0)
            r4 = 2
            r0 = 2
            if (r8 == 0) goto L_0x0103
            r0 = 1
        L_0x0103:
            int r0 = r0 * 200
            long r0 = (long) r0
            r5.setDuration(r0)
            r5.setFillAfter(r2)
            android.widget.TextView r0 = r9.A1Q
            r0.startAnimation(r5)
            java.util.List r0 = r9.A1J
            X.3T1 r0 = X.C36411kG.A0n(r0, r3)
            X.1CR r1 = r9.A19
            X.11F r0 = X.C64933Qa.A01(r0)
            X.3LI r0 = X.C36361kB.A0d(r0, r1)
            java.lang.String r0 = r0.A06()
            int r1 = java.lang.Integer.parseInt(r0)
            if (r1 == r4) goto L_0x012e
            r0 = 3
            if (r1 != r0) goto L_0x00a1
        L_0x012e:
            android.view.Window r1 = r9.getWindow()
            r0 = 524288(0x80000, float:7.34684E-40)
            r1.addFlags(r0)
            java.lang.String r0 = "popupnotification/wakeupifneeded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            r9.A00 = r0
            android.os.Handler r4 = r9.A1V
            java.lang.Runnable r2 = r9.A1X
            r4.removeCallbacks(r2)
            r0 = 600(0x258, double:2.964E-321)
            r4.postDelayed(r2, r0)
            android.hardware.SensorEventListener r0 = r9.A02
            if (r0 != 0) goto L_0x00a1
            android.hardware.Sensor r2 = r9.A01
            if (r2 == 0) goto L_0x00a1
            X.3WM r1 = new X.3WM
            r1.<init>(r9)
            r9.A02 = r1
            android.hardware.SensorManager r0 = r9.A03
            r0.registerListener(r1, r2, r3)
            return
        L_0x0161:
            r0 = 0
            goto L_0x00df
        L_0x0164:
            java.util.List r0 = r9.A1J
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
        L_0x016b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0184
            X.3T1 r0 = X.C36391kE.A0l(r5)
            X.3Qa r1 = r0.A1J
            X.3T1 r0 = r9.A16
            X.3Qa r0 = r0.A1J
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0184
            int r4 = r4 + 1
            goto L_0x016b
        L_0x0184:
            java.util.List r0 = r9.A1J
            int r0 = r0.size()
            if (r4 != r0) goto L_0x018d
            r4 = 0
        L_0x018d:
            com.whatsapp.notification.PopupNotificationViewPager r0 = r9.A10
            r0.A0J(r4, r3)
            A0L(r9, r4)
            goto L_0x00f7
        L_0x0197:
            com.whatsapp.notification.PopupNotificationViewPager r0 = r9.A10
            r0.A0J(r3, r3)
            A0L(r9, r3)
            goto L_0x00f7
        L_0x01a1:
            r0 = 2131431890(0x7f0b11d2, float:1.8485522E38)
            X.C36341k9.A13(r9, r0, r3)
            r0 = 2131431888(0x7f0b11d0, float:1.8485518E38)
            X.C36341k9.A13(r9, r0, r3)
            android.view.View r0 = r9.A06
            r0.setVisibility(r3)
            android.view.View r0 = r9.A07
            r0.setVisibility(r3)
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.A3K():void");
    }

    public void BO5(int i) {
        this.A05.A06(i, 0);
    }

    public void BO6(String str) {
        this.A05.A0E(str, 0);
    }

    public void BO9(Object[] objArr, int i, int i2) {
        this.A05.A0E(getString(i2, objArr), 0);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C148826zU r0 = this.A0a.A00;
        if ((r0 == null || !r0.A0N) && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public Dialog onCreateDialog(int i) {
        if (i == 106) {
            C39001qm A002 = AnonymousClass3LW.A00(this);
            Object[] A0L2 = AnonymousClass001.A0L();
            C36361kB.A1F(this.A0Q, this.A0l, A0L2, 0);
            A002.A0p(getString(R.string.f12nameremoved, A0L2));
            C39001qm.A0B(A002, this, 42, R.string.f12nameremoved);
            C39001qm.A0G(A002, this, 43, R.string.f12nameremoved);
            return A002.create();
        } else if (i != 115) {
            return super.onCreateDialog(i);
        } else {
            Log.i("popupnotification/dialog-software-about-to-expire");
            return this.A0D.A02(this, this.A0H);
        }
    }

    public void onNewIntent(Intent intent) {
        Log.i("popupnotification/new-intent");
        super.onNewIntent(intent);
        setIntent(intent);
        AnonymousClass11F A0Z2 = C36401kF.A0Z(getIntent(), "popup_notification_extra_quick_reply_jid");
        C36321k7.A1K(A0Z2, "popupnotification/set-quick-reply-jid:", AnonymousClass000.A0u());
        this.A0v = A0Z2;
        if (intent.getBooleanExtra("popup_notification_extra_dismiss_notification", false)) {
            this.A0y.A0H(false);
            AnonymousClass1YV.A02(this.A13, true);
        }
        A3K();
    }

    public PopupNotification(int i) {
        this.A1T = false;
        C89344We.A00(this, 34);
    }

    private void A07(ThumbnailButton thumbnailButton) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        thumbnailButton.setMinimumHeight(dimensionPixelSize);
        thumbnailButton.setMaxHeight(dimensionPixelSize);
        thumbnailButton.setAdjustViewBounds(true);
        thumbnailButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C36361kB.A10(getResources(), thumbnailButton, R.dimen.f7nameremoved);
        thumbnailButton.A01 = getResources().getDimension(R.dimen.f7nameremoved);
        if (thumbnailButton instanceof AnonymousClass2FY) {
            AnonymousClass2FY r4 = (AnonymousClass2FY) thumbnailButton;
            r4.A00 = ((float) dimensionPixelSize) / 7.0f;
            r4.A03 = 5;
        }
    }

    public static void A0G(PopupNotification popupNotification) {
        int A092 = C36391kE.A09(popupNotification, R.id.navigation_holder);
        C36341k9.A13(popupNotification, R.id.navigation_divider, A092);
        popupNotification.A06.setVisibility(A092);
        popupNotification.A07.setVisibility(A092);
    }

    public static void A0I(PopupNotification popupNotification) {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("popupnotification/clearnotifications:");
        HashSet hashSet = popupNotification.A1Y;
        C36321k7.A1Y(A0u2, hashSet.size());
        AnonymousClass1YV.A02(popupNotification.A13, true);
        popupNotification.A0v = null;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0a2 = C36401kF.A0a(it);
            ArrayList A0I2 = AnonymousClass001.A0I();
            int A022 = popupNotification.A0g.A02(A0a2);
            HashSet hashSet2 = popupNotification.A1Z;
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C64933Qa r1 = (C64933Qa) it2.next();
                AnonymousClass11F r0 = r1.A00;
                if (r0 != null && r0.equals(A0a2)) {
                    A0I2.add(r1);
                }
            }
            StringBuilder A0u3 = AnonymousClass000.A0u();
            C36341k9.A1N("popupnotification/msg:", A0u3, A0I2);
            C36321k7.A1T("/", A0u3, A022);
            if (A0I2.size() == A022) {
                popupNotification.A0W.A01(A0a2, 2, true, true);
                hashSet2.removeAll(A0I2);
            }
        }
        popupNotification.A0z.A00 = null;
        popupNotification.A0y.A09();
    }

    public void onBackPressed() {
        A0I(this);
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass1HA r0 = this.A1B;
        if (r0 != null) {
            r0.A06();
        }
        AnonymousClass1RY r02 = this.A0S;
        if (r02 != null) {
            r02.A02();
            this.A0S = null;
        }
        AnonymousClass6YP r03 = this.A1G;
        if (r03 != null) {
            r03.A0I();
        }
        this.A0v = null;
        this.A1U.removeCallbacks(this.A1W);
        this.A1V.removeCallbacks(this.A1X);
        PowerManager.WakeLock wakeLock = this.A04;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.A04.release();
        }
        SensorEventListener sensorEventListener = this.A02;
        if (sensorEventListener != null) {
            this.A03.unregisterListener(sensorEventListener);
        }
        this.A0a.A06();
        this.A0k.unregisterObserver(this.A1c);
        this.A0O.unregisterObserver(this.A1b);
        this.A0K.unregisterObserver(this.A1a);
        this.A0s.unregisterObserver(this.A1d);
        this.A0z.A00 = null;
    }

    public void onPause() {
        super.onPause();
        this.A1G.A0T(false, false);
        this.A13.A04();
    }

    public void onStart() {
        super.onStart();
        this.A1L = true;
    }

    public void onStop() {
        super.onStop();
        this.A1L = false;
        this.A1G.A0T(false, false);
    }

    public void A35(C22908AyK ayK, int i, int i2, int i3) {
        C36401kF.A1D(this, i, i2);
    }

    public void A37(C22908AyK ayK, int i, int i2, int i3, int i4) {
        C36401kF.A1D(this, i, i2);
    }

    public void BO8(C22908AyK ayK, Object[] objArr, int i, int i2, int i3) {
        BO9(objArr, i, i2);
    }

    public PopupNotification() {
        this(0);
        this.A1J = AnonymousClass001.A0I();
        this.A1Z = C36441kJ.A16();
        this.A1f = C36441kJ.A16();
        this.A1Y = C36441kJ.A16();
        this.A1K = false;
        this.A1e = new AnonymousClass32X(this);
        this.A1c = C90394a5.A00(this, 25);
        this.A1b = AnonymousClass4W3.A00(this, 27);
        this.A1a = new AnonymousClass4W0(this, 14);
        this.A1d = new AnonymousClass4WB(this, 20);
        this.A0C = new C89604Xe(this, 9);
        this.A00 = 5.0f;
        this.A1U = C36341k9.A0H();
        this.A1W = new C81123wV(this, 37);
        this.A1V = C36341k9.A0H();
        this.A1X = new C81123wV(this, 38);
    }
}
