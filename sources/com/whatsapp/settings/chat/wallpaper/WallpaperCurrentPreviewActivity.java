package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass000;
import X.AnonymousClass07B;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1Pp;
import X.AnonymousClass1R1;
import X.AnonymousClass1RC;
import X.AnonymousClass1RY;
import X.AnonymousClass3T0;
import X.AnonymousClass3UF;
import X.C011504z;
import X.C03570Gk;
import X.C18800tq;
import X.C18830tt;
import X.C21710zg;
import X.C222013h;
import X.C224514j;
import X.C27111My;
import X.C27731Pn;
import X.C33511fU;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C48762i0;
import X.C62413Gb;
import X.C63463Kd;
import X.C65103Qt;
import X.C67403Zr;
import X.C89004Uw;
import X.C89364Wg;
import X.C89854Yd;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class WallpaperCurrentPreviewActivity extends AnonymousClass155 {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public Button A07;
    public ImageView A08;
    public ImageView A09;
    public ImageView A0A;
    public ImageView A0B;
    public ImageView A0C;
    public SeekBar A0D;
    public TextView A0E;
    public TextEmojiLabel A0F;
    public AnonymousClass1Pp A0G;
    public AnonymousClass16D A0H;
    public AnonymousClass171 A0I;
    public AnonymousClass1RY A0J;
    public C27731Pn A0K;
    public C63463Kd A0L;
    public AnonymousClass3T0 A0M;
    public C62413Gb A0N;
    public WallpaperImagePreview A0O;
    public WallpaperMockChatView A0P;
    public AnonymousClass07B A0Q;
    public boolean A0R;

    public int A2I() {
        return 78318969;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r0 != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.app.Activity r2, android.content.Intent r3, X.C62413Gb r4) {
        /*
            java.lang.String r0 = "chat_jid"
            X.11F r0 = X.C36401kF.A0Z(r3, r0)
            if (r0 == 0) goto L_0x0018
            if (r4 == 0) goto L_0x0011
            boolean r0 = r4.A03
            r1 = 2131896116(0x7f122734, float:1.9427084E38)
            if (r0 == 0) goto L_0x0014
        L_0x0011:
            r1 = 2131896114(0x7f122732, float:1.942708E38)
        L_0x0014:
            r2.setTitle(r1)
            return
        L_0x0018:
            boolean r0 = X.AnonymousClass1RC.A0A(r2)
            r1 = 2131896127(0x7f12273f, float:1.9427106E38)
            if (r0 == 0) goto L_0x0014
            r1 = 2131896117(0x7f122735, float:1.9427086E38)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity.A01(android.app.Activity, android.content.Intent, X.3Gb):void");
    }

    private void A07(AnonymousClass11F r3) {
        Integer num;
        this.A0N = this.A0M.A0B(this, r3);
        A01(this, getIntent(), this.A0N);
        Drawable A082 = this.A0M.A08(this.A0N);
        if (A082 != null) {
            this.A0O.setImageDrawable(A082);
        }
        if (this.A0D.getVisibility() == 0) {
            C62413Gb r0 = this.A0N;
            int i = 0;
            if (!(r0 == null || (num = r0.A01) == null)) {
                i = num.intValue();
            }
            this.A0D.setProgress(i);
        }
    }

    public void A2F() {
        if (!this.A0R) {
            this.A0R = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A0K = C36351kA.A0T(r2);
            this.A0G = C36361kB.A0V(r2);
            this.A0H = C36341k9.A0R(r2);
            this.A0I = C36341k9.A0S(r2);
            this.A0M = (AnonymousClass3T0) r1.A4L.get();
            this.A0L = (C63463Kd) A0L2.A3L.get();
        }
    }

    public WallpaperCurrentPreviewActivity(int i) {
        this.A0R = false;
        C89364Wg.A00(this, 41);
    }

    public static void A0F(WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity) {
        Point A062 = AnonymousClass3T0.A06(wallpaperCurrentPreviewActivity);
        AnonymousClass000.A16(wallpaperCurrentPreviewActivity.A07, A062.y, 0, View.MeasureSpec.makeMeasureSpec(A062.x, 1073741824));
        AnonymousClass000.A16(wallpaperCurrentPreviewActivity.A04, A062.y, 0, View.MeasureSpec.makeMeasureSpec(A062.x, 1073741824));
        boolean A0A2 = AnonymousClass1RC.A0A(wallpaperCurrentPreviewActivity);
        TextView textView = wallpaperCurrentPreviewActivity.A0E;
        int i = R.string.f12nameremoved;
        if (A0A2) {
            i = R.string.f12nameremoved;
        }
        textView.setText(i);
        int A002 = C65103Qt.A00(wallpaperCurrentPreviewActivity);
        float min = Math.min(0.56f, ((float) (((A062.y - wallpaperCurrentPreviewActivity.A04.getMeasuredHeight()) - wallpaperCurrentPreviewActivity.A07.getMeasuredHeight()) - wallpaperCurrentPreviewActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved))) / ((float) (A062.y + A002)));
        Point A063 = AnonymousClass3T0.A06(wallpaperCurrentPreviewActivity);
        int min2 = (int) Math.min(wallpaperCurrentPreviewActivity.getResources().getDimension(R.dimen.f7nameremoved), ((float) A063.x) * min);
        int i2 = (int) (((float) A063.y) * min);
        ViewGroup.LayoutParams layoutParams = wallpaperCurrentPreviewActivity.A05.getLayoutParams();
        int i3 = (int) (((float) wallpaperCurrentPreviewActivity.A00) * min);
        View A0B2 = C03570Gk.A0B(wallpaperCurrentPreviewActivity, R.id.wallpaper_preview_toolbar_container);
        ViewGroup.LayoutParams layoutParams2 = A0B2.getLayoutParams();
        layoutParams2.height = i3;
        layoutParams2.width = min2;
        A0B2.setLayoutParams(layoutParams2);
        View A0B3 = C03570Gk.A0B(wallpaperCurrentPreviewActivity, R.id.current_wallpaper_preview_view_container);
        ViewGroup.LayoutParams layoutParams3 = A0B3.getLayoutParams();
        layoutParams3.height = i2;
        layoutParams3.width = min2;
        A0B3.setLayoutParams(layoutParams3);
        int i4 = i2 + layoutParams.height;
        View A0B4 = C03570Gk.A0B(wallpaperCurrentPreviewActivity, R.id.wallpaper_preview_outline_container);
        ViewGroup.LayoutParams layoutParams4 = A0B4.getLayoutParams();
        layoutParams4.height = i4;
        layoutParams4.width = min2;
        A0B4.setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = wallpaperCurrentPreviewActivity.A01.getLayoutParams();
        layoutParams5.width = min2;
        wallpaperCurrentPreviewActivity.A01.setLayoutParams(layoutParams5);
        C48762i0 r1 = new C48762i0(wallpaperCurrentPreviewActivity, 46);
        wallpaperCurrentPreviewActivity.A01.setOnClickListener(r1);
        wallpaperCurrentPreviewActivity.A02.setOnClickListener(r1);
        wallpaperCurrentPreviewActivity.A06.setFocusable(false);
        wallpaperCurrentPreviewActivity.A06.setDescendantFocusability(393216);
        AnonymousClass11F A0Z = C36401kF.A0Z(wallpaperCurrentPreviewActivity.getIntent(), "chat_jid");
        TextView textView2 = wallpaperCurrentPreviewActivity.A0E;
        if (A0Z != null) {
            textView2.setVisibility(4);
        } else {
            textView2.setVisibility(0);
        }
        wallpaperCurrentPreviewActivity.A07(A0Z);
        ViewGroup.LayoutParams layoutParams6 = wallpaperCurrentPreviewActivity.A06.getLayoutParams();
        layoutParams6.height = Math.max(layoutParams6.height, wallpaperCurrentPreviewActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        ViewGroup viewGroup = wallpaperCurrentPreviewActivity.A06;
        ViewGroup.LayoutParams layoutParams7 = viewGroup.getLayoutParams();
        layoutParams7.height = (int) (((float) layoutParams7.height) * min);
        viewGroup.setLayoutParams(layoutParams7);
        if (wallpaperCurrentPreviewActivity.A0P.getChildCount() == 0) {
            wallpaperCurrentPreviewActivity.A0P.setMessages(wallpaperCurrentPreviewActivity.getString(R.string.f12nameremoved), wallpaperCurrentPreviewActivity.getString(R.string.f12nameremoved), (C89004Uw) null);
        }
        WallpaperMockChatView wallpaperMockChatView = wallpaperCurrentPreviewActivity.A0P;
        wallpaperMockChatView.A00.setVisibility(4);
        wallpaperMockChatView.A03.setVisibility(4);
        wallpaperMockChatView.A03.setMinLines(1);
        wallpaperMockChatView.A03.setMaxLines(1);
        wallpaperMockChatView.A02.setMinEms(5);
        C36391kE.A1K(wallpaperMockChatView.A02);
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(wallpaperMockChatView.A02);
        A0a.bottomMargin = wallpaperMockChatView.A03.getPaddingBottom() + wallpaperMockChatView.A04.getPaddingTop();
        wallpaperMockChatView.A02.setLayoutParams(A0a);
        wallpaperMockChatView.A01.setVisibility(4);
        wallpaperMockChatView.A04.setVisibility(4);
        wallpaperMockChatView.A04.setMinLines(1);
        wallpaperMockChatView.A04.setMaxLines(1);
        wallpaperCurrentPreviewActivity.A0F.setTextSize(0, (float) ((int) (C36441kJ.A00(wallpaperCurrentPreviewActivity.getResources(), R.dimen.f7nameremoved) * min)));
        if (A0Z == null) {
            wallpaperCurrentPreviewActivity.A0F.setText(R.string.f12nameremoved);
            wallpaperCurrentPreviewActivity.A0G.A06(wallpaperCurrentPreviewActivity.A09, R.drawable.avatar_contact);
        } else {
            AnonymousClass141 A0D2 = wallpaperCurrentPreviewActivity.A0H.A0D(A0Z);
            AnonymousClass1RY A064 = wallpaperCurrentPreviewActivity.A0K.A06("wallpaper-current-preview-contact-photo", -1.0f, (int) (C36441kJ.A00(wallpaperCurrentPreviewActivity.A09.getResources(), R.dimen.f7nameremoved) * min));
            wallpaperCurrentPreviewActivity.A0J = A064;
            A064.A08(wallpaperCurrentPreviewActivity.A09, A0D2);
            wallpaperCurrentPreviewActivity.A0F.setText(wallpaperCurrentPreviewActivity.A0I.A0H(A0D2));
        }
        boolean A0A3 = AnonymousClass1RC.A0A(wallpaperCurrentPreviewActivity);
        View view = wallpaperCurrentPreviewActivity.A03;
        if (!A0A3) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        wallpaperCurrentPreviewActivity.A0D.setThumb(new LayerDrawable(new Drawable[]{C36381kD.A0H(wallpaperCurrentPreviewActivity, R.drawable.wallpaper_dimmer_seekbar_button_background), AnonymousClass3UF.A02(wallpaperCurrentPreviewActivity, R.drawable.ic_dim, C224514j.A00(wallpaperCurrentPreviewActivity, R.attr.f4nameremoved, R.color.f6nameremoved))}));
        wallpaperCurrentPreviewActivity.A0D.setOnSeekBarChangeListener(new C67403Zr(wallpaperCurrentPreviewActivity));
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        C36321k7.A0s(A2K, this);
        return A2K;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 199 && i2 == -1) {
            A07(C36401kF.A0Z(getIntent(), "chat_jid"));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass1R1.A04((ViewGroup) C03570Gk.A0B(this, R.id.container), new C89854Yd(this, 14));
        AnonymousClass1R1.A03(this);
        setSupportActionBar((Toolbar) C03570Gk.A0B(this, R.id.wallpaper_preview_toolbar));
        AnonymousClass07B A0O2 = C36381kD.A0O(this);
        this.A0Q = A0O2;
        A0O2.A0U(true);
        A01(this, getIntent(), this.A0N);
        View A0B2 = C03570Gk.A0B(this, R.id.change_current_wallpaper);
        this.A01 = A0B2;
        C48762i0.A00(A0B2, this, 45);
        C33511fU.A03(C36401kF.A0H(this, R.id.wallpaper_dimmer_title));
        this.A00 = C65103Qt.A00(this);
        this.A03 = C03570Gk.A0B(this, R.id.wallpaper_dimmer_container);
        this.A0D = (SeekBar) C03570Gk.A0B(this, R.id.wallpaper_dimmer_seekbar);
        this.A04 = C03570Gk.A0B(this, R.id.wallpaper_dimmer_container);
        this.A07 = (Button) C03570Gk.A0B(this, R.id.change_current_wallpaper);
        this.A0A = C36431kI.A0P(this, R.id.emoji_picker_btn);
        this.A0B = C36431kI.A0P(this, R.id.input_attach_button);
        this.A08 = C36431kI.A0P(this, R.id.camera_btn);
        this.A0C = C36431kI.A0P(this, R.id.voice_note_btn);
        this.A0E = C36401kF.A0H(this, R.id.wallpaper_current_preview_theme_description);
        this.A06 = (ViewGroup) C03570Gk.A0B(this, R.id.text_entry_layout);
        this.A0O = (WallpaperImagePreview) C03570Gk.A0B(this, R.id.current_wallpaper_preview_view);
        this.A09 = C36431kI.A0P(this, R.id.conversation_contact_photo);
        this.A06 = (ViewGroup) C03570Gk.A0B(this, R.id.input_layout_content);
        this.A02 = C03570Gk.A0B(this, R.id.current_wallpaper_preview_view_container);
        this.A01 = C03570Gk.A0B(this, R.id.change_current_wallpaper);
        this.A05 = C03570Gk.A0B(this, R.id.wallpaper_preview_toolbar_container);
        this.A0P = (WallpaperMockChatView) C03570Gk.A0B(this, R.id.wallpaper_preview_default_chat_view);
        this.A0F = C36441kJ.A0e(this, R.id.conversation_contact_name);
        A0F(this);
        C011504z.A06(C03570Gk.A0B(this, R.id.conversation_contact_name), 2);
        C011504z.A06(C03570Gk.A0B(this, R.id.emoji_picker_btn), 2);
        C011504z.A06(C03570Gk.A0B(this, R.id.entry), 2);
        C011504z.A06(C03570Gk.A0B(this, R.id.input_attach_button), 2);
        C011504z.A06(C03570Gk.A0B(this, R.id.camera_btn), 2);
        C011504z.A06(C03570Gk.A0B(this, R.id.voice_note_btn), 2);
        C011504z.A06(((WallpaperMockChatView) C03570Gk.A0B(this, R.id.wallpaper_preview_default_chat_view)).A07, 2);
        if (C222013h.A07) {
            this.A06.setPadding(0, 0, 0, 0);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            this.A0A.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            this.A0B.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            this.A08.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            ViewGroup.LayoutParams layoutParams = this.A0B.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
            }
            this.A0C.setImageResource(R.drawable.input_mic_white_filled_wds);
        }
        C36401kF.A1C(this);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass1RY r0 = this.A0J;
        if (r0 != null) {
            r0.A02();
        }
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.chat_themes_button_group);
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
        }
    }

    public WallpaperCurrentPreviewActivity() {
        this(0);
    }
}
