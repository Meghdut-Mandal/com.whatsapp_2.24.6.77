package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediacomposer.doodle.penmode.PenModeView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.4aZ  reason: invalid class name and case insensitive filesystem */
public final class C90694aZ extends Dialog {
    public int A00 = -1;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public WaImageView A04;
    public WaImageView A05;
    public ColorPickerComponent A06;
    public AnonymousClass6OU A07;
    public C91184bb A08;
    public PenModeView A09;
    public WDSButton A0A;
    public final int A0B = getContext().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    public final int A0C = getContext().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    public final int A0D = getContext().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    public final View.OnLayoutChangeListener A0E = new C163327q1((Object) this, 6);
    public final C117425mF A0F;
    public final C129126Fh A0G;
    public final C1270866x A0H;
    public final int[] A0I;
    public final C117435mG A0J;
    public final C1265564m A0K;
    public final AnonymousClass65u A0L = new AnonymousClass65u(this);
    public final AnonymousClass622 A0M;
    public final boolean A0N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90694aZ(Activity activity, C117425mF r4, C117435mG r5, C1265564m r6, AnonymousClass622 r7, C129126Fh r8, C1270866x r9, int[] iArr, boolean z) {
        super(activity, R.style.f13nameremoved);
        AnonymousClass00C.A0D(r7, 4);
        this.A0F = r4;
        this.A0K = r6;
        this.A0M = r7;
        this.A0J = r5;
        this.A0I = iArr;
        this.A0N = z;
        this.A0G = r8;
        this.A0H = r9;
    }

    public void onBackPressed() {
        AnonymousClass6OU r0 = this.A07;
        if (r0 == null) {
            throw C36331k8.A0d("penDialogController");
        } else if (!r0.A02) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            setContentView(R.layout.f9nameremoved);
            View findViewById = findViewById(R.id.doodle_pen_root);
            AnonymousClass00C.A08(findViewById);
            this.A02 = findViewById;
            View findViewById2 = findViewById(R.id.pen_dialog_done);
            AnonymousClass00C.A08(findViewById2);
            this.A0A = (WDSButton) findViewById2;
            View findViewById3 = findViewById(R.id.pen_dialog_pen);
            AnonymousClass00C.A08(findViewById3);
            this.A04 = (WaImageView) findViewById3;
            View findViewById4 = findViewById(R.id.pen_dialog_undo);
            AnonymousClass00C.A08(findViewById4);
            this.A05 = (WaImageView) findViewById4;
            View findViewById5 = findViewById(R.id.canvas);
            AnonymousClass00C.A08(findViewById5);
            this.A03 = (ViewGroup) findViewById5;
            View findViewById6 = findViewById(R.id.pen_dialog_color_picker_component);
            AnonymousClass00C.A08(findViewById6);
            this.A06 = (ColorPickerComponent) findViewById6;
            View findViewById7 = findViewById(R.id.pen_mode_view);
            AnonymousClass00C.A08(findViewById7);
            this.A09 = (PenModeView) findViewById7;
            View findViewById8 = findViewById(R.id.doodle_pen_top_bar);
            AnonymousClass00C.A08(findViewById8);
            this.A01 = findViewById8;
            window.setLayout(-1, -1);
            window.setFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            if (Build.VERSION.SDK_INT >= 28) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
            }
            View view = this.A02;
            if (view == null) {
                throw C36331k8.A0d("rootLayout");
            }
            view.addOnLayoutChangeListener(this.A0E);
            WDSButton wDSButton = this.A0A;
            if (wDSButton == null) {
                throw C36331k8.A0d("doneButton");
            }
            C135466ck.A00(wDSButton, this, 23);
            ViewGroup viewGroup = this.A03;
            if (viewGroup == null) {
                throw C36331k8.A0d("canvas");
            }
            AnonymousClass6UI.A00(viewGroup, this, 8);
            Context context = getContext();
            AnonymousClass00C.A08(context);
            C91184bb r1 = new C91184bb(context, R.drawable.new_pen);
            this.A08 = r1;
            WaImageView waImageView = this.A04;
            if (waImageView == null) {
                throw C36331k8.A0d("penButton");
            }
            waImageView.setImageDrawable(r1);
            ColorPickerComponent colorPickerComponent = this.A06;
            if (colorPickerComponent == null) {
                throw C36331k8.A0d("colorPicker");
            }
            colorPickerComponent.A02();
            ColorPickerComponent colorPickerComponent2 = this.A06;
            if (colorPickerComponent2 == null) {
                throw C36331k8.A0d("colorPicker");
            }
            colorPickerComponent2.A03((AnonymousClass6FL) null, new C146666vy(this), (C158437gv) null);
            Context context2 = getContext();
            AnonymousClass00C.A08(context2);
            C91184bb r4 = new C91184bb(context2, R.drawable.new_undo);
            r4.A00(AnonymousClass00F.A00(getContext(), R.color.f6nameremoved));
            WaImageView waImageView2 = this.A05;
            if (waImageView2 == null) {
                throw C36331k8.A0d("undoButton");
            }
            waImageView2.setImageDrawable(r4);
            WaImageView waImageView3 = this.A05;
            if (waImageView3 == null) {
                throw C36331k8.A0d("undoButton");
            }
            C135466ck.A00(waImageView3, this, 22);
            WaImageView waImageView4 = this.A05;
            if (waImageView4 == null) {
                throw C36331k8.A0d("undoButton");
            }
            waImageView4.setOnLongClickListener(new C163337q2(this, 2));
            PenModeView penModeView = this.A09;
            if (penModeView == null) {
                throw C36331k8.A0d("penModeView");
            }
            penModeView.A00 = new C146766w8(this);
            int A002 = AnonymousClass00F.A00(getContext(), R.color.f6nameremoved);
            int i = this.A0F.A00;
            int i2 = this.A0B;
            AnonymousClass6OU r42 = new AnonymousClass6OU(this.A0J, this.A0K, this.A0L, this.A0M, i, A002, i2);
            this.A07 = r42;
            int i3 = r42.A05;
            r42.A00 = i3;
            r42.A0A.A01(i3);
            r42.A02(2, r42.A06);
            AnonymousClass6OU.A00(r42, false);
            if (!this.A0N) {
                PenModeView penModeView2 = this.A09;
                if (penModeView2 == null) {
                    throw C36331k8.A0d("penModeView");
                }
                C36351kA.A1A(penModeView2, R.id.pen_mode_blur, 8);
                C36351kA.A1A(penModeView2, R.id.pen_mode_blur_space, 8);
            }
        }
    }
}
