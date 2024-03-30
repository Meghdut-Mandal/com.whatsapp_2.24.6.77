package com.whatsapp.camera;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1QZ;
import X.C012005e;
import X.C18700tb;
import X.C20810yC;
import X.C21060yb;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C53182qu;
import X.C65103Qt;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class CameraActionsLayout extends RelativeLayout implements C18700tb {
    public static final Set A0I = new C53182qu(1);
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public C20810yC A08;
    public AnonymousClass1QZ A09;
    public boolean A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Map A0F;
    public final boolean A0G;
    public final Display A0H;

    public CameraActionsLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        Map map;
        Integer num;
        int i7;
        Integer num2;
        int i8;
        int i9;
        View view;
        int i10;
        int i11;
        super.onLayout(z, i, i2, i3, i4);
        if (this.A06 == null) {
            this.A06 = C012005e.A02(this, R.id.shutter);
            this.A05 = C012005e.A02(this, R.id.recording_progress);
            this.A01 = C012005e.A02(this, R.id.flash_btn);
            this.A07 = C012005e.A02(this, R.id.switch_camera_btn);
            this.A04 = C012005e.A02(this, R.id.recording_hint);
            this.A02 = C012005e.A02(this, R.id.gallery_btn);
            this.A00 = C012005e.A02(this, R.id.close_camera_btn);
            this.A03 = C012005e.A02(this, R.id.select_multiple);
        }
        if (z) {
            int rotation = this.A0H.getRotation();
            if (!this.A0G) {
                if (rotation == 1) {
                    this.A04.setVisibility(8);
                    map = this.A0F;
                    map.clear();
                    Integer A0U = C36421kH.A0U();
                    i8 = -1;
                    map.put(A0U, -1);
                    num2 = C36421kH.A0W();
                    map.put(num2, -1);
                    View view2 = this.A06;
                    i6 = this.A0E;
                    int i12 = i6;
                    A00(view2, map, i6, 0, i12, 0);
                    A00(this.A05, map, i6, 0, i12, 0);
                    map.clear();
                    Integer A0j = C36401kF.A0j();
                    map.put(A0j, -1);
                    map.put(A0U, -1);
                    View view3 = this.A07;
                    i5 = this.A0D;
                    int i13 = i5;
                    int i14 = i5;
                    Map map2 = map;
                    int i15 = i5;
                    A00(view3, map2, i5, i15, i13, i14);
                    map.clear();
                    num = C36431kI.A12();
                    map.put(num, -1);
                    map.put(A0U, -1);
                    A00(this.A02, map2, i5, i15, i13, i14);
                    map.clear();
                    map.put(A0j, -1);
                    i7 = 9;
                    Integer valueOf = Integer.valueOf(i7);
                    map.put(valueOf, i8);
                    i9 = i6;
                    int i16 = i5;
                    A00(this.A01, map, i6, i16, i9, i5);
                    map.clear();
                    map.put(num, i8);
                    map.put(valueOf, i8);
                    A00(this.A00, map, i6, i16, i9, i5);
                    map.clear();
                    map.put(valueOf, i8);
                    map.put(num2, i8);
                    view = this.A03;
                    i10 = 0;
                    i11 = 0;
                } else if (rotation != 3) {
                    map = this.A0F;
                    map.clear();
                    Integer A0j2 = C36361kB.A0j();
                    Integer valueOf2 = Integer.valueOf(R.id.recording_hint);
                    map.put(A0j2, valueOf2);
                    map.put(C36401kF.A0k(), -1);
                    Integer A12 = C36431kI.A12();
                    map.put(A12, -1);
                    View view4 = this.A06;
                    int i17 = this.A0D;
                    A00(view4, map, 0, 0, 0, i17);
                    A00(this.A05, map, 0, 0, 0, i17);
                    map.clear();
                    map.put(A0j2, valueOf2);
                    Integer A0U2 = C36421kH.A0U();
                    map.put(A0U2, -1);
                    map.put(A12, -1);
                    View view5 = this.A07;
                    i6 = this.A0E;
                    int i18 = this.A0B;
                    int i19 = i18 + i18;
                    i9 = i6;
                    A00(view5, map, i6, 0, i9, i19);
                    map.clear();
                    map.put(A0j2, valueOf2);
                    Integer A0i = C36401kF.A0i();
                    map.put(A0i, -1);
                    map.put(A12, -1);
                    A00(this.A02, map, i6, 0, i9, i19);
                    map.clear();
                    Integer A0j3 = C36401kF.A0j();
                    map.put(A0j3, -1);
                    map.put(A0U2, -1);
                    int i20 = i6;
                    int i21 = i6;
                    A00(this.A01, map, i6, i21, i9, i20);
                    map.clear();
                    map.put(A0j3, -1);
                    map.put(A0i, -1);
                    A00(this.A00, map, i6, i21, i9, i20);
                    map.clear();
                    map.put(A0U2, -1);
                    map.put(A12, -1);
                    view = this.A03;
                    i11 = this.A0C;
                    i10 = 0;
                } else {
                    this.A04.setVisibility(8);
                    map = this.A0F;
                    map.clear();
                    Integer A0i2 = C36401kF.A0i();
                    i8 = -1;
                    map.put(A0i2, -1);
                    num2 = C36421kH.A0W();
                    map.put(num2, -1);
                    View view6 = this.A06;
                    i6 = this.A0E;
                    int i22 = i6;
                    A00(view6, map, i6, 0, i22, 0);
                    A00(this.A05, map, i6, 0, i22, 0);
                    map.clear();
                    Integer A122 = C36431kI.A12();
                    map.put(A122, -1);
                    map.put(A0i2, -1);
                    View view7 = this.A07;
                    i5 = this.A0D;
                    int i23 = i5;
                    int i24 = i5;
                    Map map3 = map;
                    int i25 = i5;
                    A00(view7, map3, i5, i25, i23, i24);
                    map.clear();
                    num = C36401kF.A0j();
                    map.put(num, -1);
                    map.put(A0i2, -1);
                    A00(this.A02, map3, i5, i25, i23, i24);
                    map.clear();
                    map.put(A122, -1);
                    i7 = 11;
                    Integer valueOf3 = Integer.valueOf(i7);
                    map.put(valueOf3, i8);
                    i9 = i6;
                    int i162 = i5;
                    A00(this.A01, map, i6, i162, i9, i5);
                    map.clear();
                    map.put(num, i8);
                    map.put(valueOf3, i8);
                    A00(this.A00, map, i6, i162, i9, i5);
                    map.clear();
                    map.put(valueOf3, i8);
                    map.put(num2, i8);
                    view = this.A03;
                    i10 = 0;
                    i11 = 0;
                }
                A00(view, map, i6, i10, i9, i11);
            }
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A09;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public static void A00(View view, Map map, int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(view.getLayoutParams());
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            layoutParams.addRule(C36341k9.A0A(it), 0);
        }
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            layoutParams.addRule(AnonymousClass000.A0I(A11.getKey()), AnonymousClass000.A0I(A11.getValue()));
        }
        layoutParams.setMargins(i, i2, i3, i4);
        view.setLayoutParams(layoutParams);
    }

    public CameraActionsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0A) {
            this.A0A = true;
            this.A08 = C36341k9.A0V(C36391kE.A0W(generatedComponent()));
        }
        this.A0F = AnonymousClass001.A0J();
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A0G = C36371kC.A1T(AnonymousClass000.A0U(context).smallestScreenWidthDp, 600);
        WindowManager A012 = C21060yb.A01(context);
        Objects.requireNonNull(A012);
        this.A0H = A012.getDefaultDisplay();
        int A013 = C65103Qt.A01(context, 2.0f);
        int i2 = A013 * 4;
        this.A0E = i2;
        this.A0B = A013 * 6;
        int i3 = i2 + i2;
        this.A0D = i3;
        this.A0C = i3 * 10;
    }

    public CameraActionsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
