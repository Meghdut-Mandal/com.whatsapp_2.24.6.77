package com.whatsapp.storage;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00E;
import X.AnonymousClass16L;
import X.AnonymousClass1QZ;
import X.AnonymousClass2Ty;
import X.AnonymousClass3K8;
import X.AnonymousClass3UF;
import X.AnonymousClass3Z0;
import X.AnonymousClass4TB;
import X.AnonymousClass4X0;
import X.C18700tb;
import X.C18740tg;
import X.C18800tq;
import X.C21060yb;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36441kJ;
import X.C38251o7;
import X.C45942Ti;
import X.C74833mF;
import X.C74913mN;
import X.C81183wb;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.List;

public class StorageUsageMediaPreviewView extends LinearLayout implements C18700tb {
    public static final Bitmap A0C = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public int A00;
    public AnonymousClass16L A01;
    public C21060yb A02;
    public AnonymousClass1QZ A03;
    public String A04;
    public List A05;
    public boolean A06;
    public final int A07;
    public final Drawable A08;
    public final int A09;
    public final int A0A;
    public final AnonymousClass3K8 A0B;

    public StorageUsageMediaPreviewView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void setPreviewMediaItemsInternal(List list, int i, String str) {
        ViewGroup.LayoutParams layoutParams;
        AnonymousClass2Ty r15;
        int measuredWidth = getMeasuredWidth();
        int i2 = this.A09;
        int i3 = (measuredWidth + (i2 / 2)) / i2;
        int measuredWidth2 = getMeasuredWidth();
        int i4 = this.A0A;
        int i5 = (measuredWidth2 - ((i3 - 1) * i4)) / i3;
        List list2 = list;
        int min = Math.min(list2.size(), i3);
        Drawable A002 = AnonymousClass00E.A00(getContext(), R.drawable.balloon_incoming_frame);
        int A022 = C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        C18740tg.A06(A002);
        Drawable A082 = AnonymousClass3UF.A08(A002, A022);
        for (int i6 = 0; i6 < min; i6++) {
            C74833mF r14 = (C74833mF) list2.get(i6);
            if (i6 != min - 1 || i <= min) {
                C45942Ti r152 = new C45942Ti(getContext());
                r152.A00 = 3;
                r152.setFrameDrawable(A082);
                addView(r152);
                layoutParams = r152.getLayoutParams();
                r15 = r152;
            } else {
                AnonymousClass2Ty r153 = new AnonymousClass2Ty(getContext());
                C38251o7 r13 = new C38251o7(getContext());
                int i7 = i - min;
                AnonymousClass2Ty r0 = r13.A00;
                if (r0 != null) {
                    r13.removeView(r0);
                }
                r13.addView(r153, 0);
                r13.A00 = r153;
                WaTextView waTextView = r13.A03;
                Context context = r13.getContext();
                Object[] A0L = AnonymousClass001.A0L();
                AnonymousClass000.A1L(A0L, i7, 0);
                C36341k9.A0s(context, waTextView, A0L, R.string.f12nameremoved);
                r13.setFrameDrawable(A082);
                addView(r13);
                layoutParams = r13.getLayoutParams();
                r15 = r153;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (i6 != 0) {
                marginLayoutParams.leftMargin = i4;
            }
            marginLayoutParams.width = i5;
            marginLayoutParams.height = i5;
            r15.setMediaItem(r14);
            C36411kG.A1D(r15);
            r15.setSelector((Drawable) null);
            AnonymousClass3K8 r1 = this.A0B;
            r1.A01((AnonymousClass4TB) r15.getTag());
            C74913mN r02 = new C74913mN(r14, this, str, i5);
            r15.setTag(r02);
            r1.A02(r02, new AnonymousClass4X0(r14, r15, r02, this, 2));
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public void setPreviewMediaItems(List list, int i, String str) {
        this.A05 = list;
        this.A00 = i;
        this.A04 = str;
        removeAllViews();
        if (list.size() == 0) {
            return;
        }
        if (getMeasuredWidth() == 0) {
            addOnLayoutChangeListener(new AnonymousClass3Z0(this, str, list, i));
        } else {
            setPreviewMediaItemsInternal(list, i, str);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A05 != null && this.A04 != null) {
            post(C81183wb.A00(this, 16));
        }
    }

    public StorageUsageMediaPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A06) {
            this.A06 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A01 = C36401kF.A0S(A0W);
            this.A02 = C36351kA.A0U(A0W);
        }
        setOrientation(0);
        this.A0A = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A09 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int A022 = C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A07 = A022;
        this.A08 = new ColorDrawable(A022);
        this.A0B = new AnonymousClass3K8(C36341k9.A0H(), this.A01, this.A02, "storage-usage-media-preview");
    }

    public StorageUsageMediaPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
