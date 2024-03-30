package com.whatsapp.home.ui;

import X.AnonymousClass00C;
import X.AnonymousClass00N;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RC;
import X.C011004s;
import X.C012005e;
import X.C164687sD;
import X.C18700tb;
import X.C19770wU;
import X.C20810yC;
import X.C224514j;
import X.C225314u;
import X.C27851Qb;
import X.C27861Qc;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C49292is;
import X.C80253v6;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

public final class StarredMessagesPlaceholderActivity extends C225314u {
    public int A00;
    public int A01;
    public View A02;
    public ViewGroup.LayoutParams A03;
    public ViewGroup A04;

    public class StarredMessagePlaceholderView extends LinearLayout implements C18700tb, AnonymousClass00N {
        public ImageView A00;
        public TextView A01;
        public C20810yC A02;
        public WallPaperView A03;
        public C32681e1 A04;
        public C19770wU A05;
        public AnonymousClass1QZ A06;
        public boolean A07;
        public TextView A08;

        public static final void setPlaceholderE2EText$lambda$0(StarredMessagePlaceholderView starredMessagePlaceholderView) {
            C225314u r1;
            AnonymousClass00C.A0D(starredMessagePlaceholderView, 0);
            E2EEDescriptionBottomSheet A032 = E2EEDescriptionBottomSheet.A03(12);
            Context context = starredMessagePlaceholderView.getContext();
            if ((context instanceof C225314u) && (r1 = (C225314u) context) != null) {
                r1.Btm(A032);
            }
        }

        public final void setAbProps(C20810yC r2) {
            AnonymousClass00C.A0D(r2, 0);
            this.A02 = r2;
        }

        public final void setLinkifier(C32681e1 r2) {
            AnonymousClass00C.A0D(r2, 0);
            this.A04 = r2;
        }

        public final void setWaWorkers(C19770wU r2) {
            AnonymousClass00C.A0D(r2, 0);
            this.A05 = r2;
        }

        private final void setPlaceholderE2EText(int i) {
            TextView textView = this.A08;
            if (textView != null) {
                textView.setText(getLinkifier().A03(textView.getContext(), new C80253v6(this, 18), C36381kD.A0t(this, i), "%s", C224514j.A00(textView.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)));
                C36331k8.A10(textView, getAbProps());
            }
        }

        public final Object generatedComponent() {
            AnonymousClass1QZ r0 = this.A06;
            if (r0 == null) {
                r0 = C36441kJ.A0v(this);
                this.A06 = r0;
            }
            return r0.generatedComponent();
        }

        public final C20810yC getAbProps() {
            C20810yC r0 = this.A02;
            if (r0 != null) {
                return r0;
            }
            throw C36321k7.A07();
        }

        public final C32681e1 getLinkifier() {
            C32681e1 r0 = this.A04;
            if (r0 != null) {
                return r0;
            }
            throw C36331k8.A0b();
        }

        public final C19770wU getWaWorkers() {
            C19770wU r0 = this.A05;
            if (r0 != null) {
                return r0;
            }
            throw C36321k7.A08();
        }

        public StarredMessagePlaceholderView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet);
            if (!this.A07) {
                this.A07 = true;
                C27861Qc.A0m((C27861Qc) ((C27851Qb) generatedComponent()), this);
            }
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C36331k8.A1F(new C49292is(C36371kC.A0B(this), C36441kJ.A0J(this), this.A03), getWaWorkers());
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            WallPaperView wallPaperView = this.A03;
            if (wallPaperView != null) {
                C36401kF.A1K(wallPaperView);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StarredMessagePlaceholderView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            AnonymousClass00C.A0D(context, 1);
            if (!this.A07) {
                this.A07 = true;
                C27861Qc.A0m((C27861Qc) ((C27851Qb) generatedComponent()), this);
            }
            View.inflate(context, R.layout.f9nameremoved, this);
            this.A00 = C36401kF.A0G(this, R.id.image_placeholder);
            this.A01 = C36391kE.A0O(this, R.id.txt_placeholder_title);
            this.A08 = C36391kE.A0O(this, R.id.txt_home_placeholder_sub_title);
            this.A03 = (WallPaperView) C012005e.A02(this, R.id.placeholder_background);
            ImageView imageView = this.A00;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.vec_ic_starred_placeholder);
            }
            TextView textView = this.A01;
            if (textView != null) {
                textView.setText(R.string.f12nameremoved);
            }
            setPlaceholderE2EText(R.string.f12nameremoved);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass1RC.A05(this, R.color.f6nameremoved);
        AnonymousClass1RC.A03(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        this.A04 = viewGroup;
        if (viewGroup != null) {
            C011004s.A07(viewGroup, new C164687sD(this, 0));
        }
    }
}
