package com.whatsapp.wds.components.list.listitem;

import X.AnonymousClass00C;
import X.AnonymousClass088;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RL;
import X.AnonymousClass1RR;
import X.AnonymousClass5S1;
import X.AnonymousClass5SS;
import X.AnonymousClass5ST;
import X.C107915Rj;
import X.C108155Sj;
import X.C108165Sk;
import X.C108385Th;
import X.C108445Tn;
import X.C108505Tt;
import X.C130646Lw;
import X.C146136v6;
import X.C18700tb;
import X.C18820ts;
import X.C20810yC;
import X.C224514j;
import X.C27851Qb;
import X.C27861Qc;
import X.C27991Qq;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36441kJ;
import X.C88894Ul;
import X.C90484aE;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.icon.WDSIcon;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import com.whatsapp.wds.components.toggle.WDSSwitch;
import java.util.Objects;

public final class WDSListItem extends ConstraintLayout implements C88894Ul, C18700tb {
    public View A00;
    public WaTextView A01;
    public WaTextView A02;
    public C18820ts A03;
    public C20810yC A04;
    public AnonymousClass1RL A05;
    public WDSIcon A06;
    public WDSIcon A07;
    public C130646Lw A08;
    public WDSProfilePhoto A09;
    public WDSSwitch A0A;
    public AnonymousClass1QZ A0B;
    public boolean A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public View A0I;
    public Boolean A0J;
    public final AnonymousClass1RR A0K;

    public final void A06() {
        C108385Th r0;
        C108385Th r02;
        C108385Th r03;
        C108385Th r04;
        AnonymousClass5SS r1;
        C108165Sk r3;
        C108445Tn r2;
        C108155Sj r12;
        C107915Rj r05;
        C108505Tt r06;
        C108505Tt r07;
        C130646Lw r5 = this.A08;
        AnonymousClass5S1 r4 = null;
        if (r5 != null) {
            r0 = r5.A04;
        } else {
            r0 = null;
        }
        setHorizontalMargins(r0);
        if (r5 != null) {
            r02 = r5.A06;
        } else {
            r02 = null;
        }
        setVerticalMargins(r02);
        if (r5 != null) {
            r03 = r5.A05;
        } else {
            r03 = null;
        }
        setVerticalInBetweenMargin(r03);
        if (r5 != null) {
            r04 = r5.A03;
        } else {
            r04 = null;
        }
        setHorizontalInBetweenMargin(r04);
        if ((isClickable() || isFocusable()) && this.A0D == 0) {
            TypedValue typedValue = new TypedValue();
            C36361kB.A09(this).resolveAttribute(16843534, typedValue, true);
            this.A0I.setBackgroundResource(typedValue.resourceId);
            this.A0D = typedValue.resourceId;
        }
        if (this.A02 != null) {
            if (r5 != null) {
                r07 = r5.A0K;
            } else {
                r07 = null;
            }
            setRowContentTextStyle(r07);
        }
        if (this.A01 != null) {
            if (r5 != null) {
                r06 = r5.A0J;
            } else {
                r06 = null;
            }
            setRowSubContentTextStyle(r06);
        }
        if (r5 != null) {
            int ordinal = r5.A0I.ordinal();
            if (ordinal == 2) {
                setStartAddonIconStyle(r5.A0E, r5.A0C, r5.A08, r5.A0A);
            } else if (ordinal == 3) {
                setStartAddonProfilePhotoStyle(Boolean.valueOf(r5.A0S), r5.A0L, r5.A0M, r5.A0N, r5.A0O);
            }
            r1 = r5.A0G;
        } else {
            r1 = null;
        }
        if (r1 == AnonymousClass5SS.ICON) {
            if (r5 != null) {
                r3 = r5.A0D;
                r2 = r5.A0B;
                r12 = r5.A07;
                r05 = r5.A09;
            } else {
                r3 = null;
                r2 = null;
                r12 = null;
                r05 = null;
            }
            setEndAddonIconStyle(r3, r2, r12, r05);
        }
        if (this.A00 != null) {
            if (r5 != null) {
                r4 = r5.A0F;
            }
            setRowDividerStyle(r4);
        }
    }

    public static final void A00(WDSListItem wDSListItem) {
        boolean z;
        C130646Lw r0 = wDSListItem.A08;
        if (r0 != null && r0.A0R && wDSListItem.A0J == null) {
            C20810yC r1 = wDSListItem.A04;
            if (r1 != null) {
                z = C36391kE.A0q(r1, 7852);
            } else {
                z = false;
            }
            wDSListItem.A0J = z;
            AnonymousClass00C.A0J(z, true);
        }
    }

    private final void setEndAddonIconStyle(C108165Sk r2, C108445Tn r3, C108155Sj r4, C107915Rj r5) {
        WDSIcon wDSIcon = this.A06;
        if (wDSIcon != null) {
            if (r2 != null) {
                wDSIcon.setVariant(r2);
            }
            if (r3 != null) {
                wDSIcon.setSize(r3);
            }
            if (r4 != null) {
                wDSIcon.setAction(r4);
            }
            if (r5 != null) {
                wDSIcon.setShape(r5);
            }
        }
    }

    private final void setHorizontalInBetweenMargin(C108385Th r8) {
        int intValue;
        AnonymousClass5ST r1;
        if (r8 != null && (intValue = Integer.valueOf(r8.dimen).intValue()) != this.A0F) {
            int A032 = C36371kC.A03(this, intValue);
            C130646Lw r4 = this.A08;
            AnonymousClass5SS r2 = null;
            if (r4 != null) {
                r1 = r4.A0I;
            } else {
                r1 = null;
            }
            int i = A032;
            if (r1 == AnonymousClass5ST.NONE) {
                i = 0;
            }
            if (r4 != null) {
                r2 = r4.A0G;
            }
            if (r2 == AnonymousClass5SS.NONE) {
                A032 = 0;
            }
            View findViewById = findViewById(R.id.row_content);
            if (findViewById != null) {
                findViewById.setPaddingRelative(i, findViewById.getPaddingTop(), A032, findViewById.getPaddingBottom());
            }
            this.A0F = intValue;
        }
    }

    private final void setHorizontalMargins(C108385Th r6) {
        int i;
        if (r6 != null && (i = r6.dimen) != this.A0E) {
            int A032 = C36371kC.A03(this, i);
            View view = this.A0I;
            view.setPadding(A032, view.getPaddingTop(), A032, view.getPaddingBottom());
            this.A0E = i;
        }
    }

    private final void setStartAddonIconStyle(C108165Sk r2, C108445Tn r3, C108155Sj r4, C107915Rj r5) {
        WDSIcon wDSIcon = this.A07;
        if (wDSIcon != null) {
            if (r2 != null) {
                wDSIcon.setVariant(r2);
            }
            if (r3 != null) {
                wDSIcon.setSize(r3);
            }
            if (r4 != null) {
                wDSIcon.setAction(r4);
            }
            if (r5 != null) {
                wDSIcon.setShape(r5);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r0 = new X.AnonymousClass5QI(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        r2.setProfileBadge(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setStartAddonProfilePhotoStyle(java.lang.Boolean r4, X.C108525Tv r5, X.AnonymousClass5TY r6, X.C108265Sv r7, X.AnonymousClass5S4 r8) {
        /*
            r3 = this;
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r2 = r3.A09
            if (r2 == 0) goto L_0x0060
            boolean r0 = X.C90494aF.A1Y(r4)
            r2.setStatusIndicatorEnabled(r0)
            if (r6 == 0) goto L_0x0010
            r2.setProfilePhotoSize(r6)
        L_0x0010:
            if (r5 == 0) goto L_0x0015
            r2.setProfilePhotoShape(r5)
        L_0x0015:
            if (r7 == 0) goto L_0x0047
            int r0 = r7.ordinal()
            switch(r0) {
                case 0: goto L_0x0043;
                case 1: goto L_0x003d;
                case 2: goto L_0x0037;
                case 3: goto L_0x0031;
                case 4: goto L_0x0029;
                case 5: goto L_0x0026;
                case 6: goto L_0x0023;
                default: goto L_0x001e;
            }
        L_0x001e:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0023:
            X.5TT r1 = X.AnonymousClass5TT.VOICE_CHAT
            goto L_0x002b
        L_0x0026:
            X.5TT r1 = X.AnonymousClass5TT.VOICE
            goto L_0x002b
        L_0x0029:
            X.5TT r1 = X.AnonymousClass5TT.VIDEO
        L_0x002b:
            X.5QI r0 = new X.5QI
            r0.<init>(r1)
            goto L_0x0044
        L_0x0031:
            X.2mq r0 = new X.2mq
            r0.<init>()
            goto L_0x0044
        L_0x0037:
            X.5QH r0 = new X.5QH
            r0.<init>()
            goto L_0x0044
        L_0x003d:
            X.5QF r0 = new X.5QF
            r0.<init>()
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r2.setProfileBadge(r0)
        L_0x0047:
            if (r8 == 0) goto L_0x0060
            int r1 = r8.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0064
            r0 = 1
            if (r1 == r0) goto L_0x0061
            r0 = 2
            if (r1 != r0) goto L_0x0067
            X.5TU r1 = X.AnonymousClass5TU.ERROR
        L_0x0058:
            X.5QJ r0 = new X.5QJ
            r0.<init>(r1)
            r2.setProfileStatus(r0)
        L_0x0060:
            return
        L_0x0061:
            X.5TU r1 = X.AnonymousClass5TU.UNSEEN
            goto L_0x0058
        L_0x0064:
            X.5TU r1 = X.AnonymousClass5TU.SEEN
            goto L_0x0058
        L_0x0067:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.list.listitem.WDSListItem.setStartAddonProfilePhotoStyle(java.lang.Boolean, X.5Tv, X.5TY, X.5Sv, X.5S4):void");
    }

    private final void setVerticalInBetweenMargin(C108385Th r10) {
        int i;
        int A032;
        if (r10 != null && (i = r10.dimen) != this.A0G && (A032 = C36371kC.A03(this, i)) >= 0) {
            WaTextView waTextView = this.A01;
            if (waTextView == null || waTextView.getVisibility() != 8) {
                WaTextView waTextView2 = this.A02;
                if (waTextView2 != null) {
                    waTextView2.setPadding(waTextView2.getPaddingLeft(), waTextView2.getPaddingTop(), waTextView2.getPaddingRight(), A032 / 2);
                }
            } else {
                WaTextView waTextView3 = this.A02;
                if (waTextView3 != null) {
                    waTextView3.setPadding(waTextView3.getPaddingLeft(), waTextView3.getPaddingTop(), waTextView3.getPaddingRight(), 0);
                }
            }
            WaTextView waTextView4 = this.A02;
            if (waTextView4 == null || waTextView4.getVisibility() != 8) {
                WaTextView waTextView5 = this.A01;
                if (waTextView5 != null) {
                    C36341k9.A0z(waTextView5, waTextView5.getPaddingLeft(), A032 / 2);
                }
            } else {
                WaTextView waTextView6 = this.A01;
                if (waTextView6 != null) {
                    C36341k9.A0z(waTextView6, waTextView6.getPaddingLeft(), 0);
                }
            }
            this.A0G = i;
        }
    }

    private final void setVerticalMargins(C108385Th r5) {
        int i;
        if (r5 != null && (i = r5.dimen) != this.A0H) {
            C90484aE.A17(this.A0I, C36371kC.A03(this, i), C36371kC.A03(this, i));
            this.A0H = i;
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0B;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public void setBadgeIcon(Drawable drawable) {
        WDSIcon wDSIcon = this.A06;
        if (wDSIcon == null) {
            return;
        }
        if (drawable == null) {
            wDSIcon.setVisibility(8);
            return;
        }
        wDSIcon.setVisibility(0);
        wDSIcon.setIcon(drawable);
    }

    public void setIcon(Drawable drawable) {
        WDSIcon wDSIcon = this.A07;
        if (wDSIcon == null) {
            return;
        }
        if (drawable == null) {
            wDSIcon.setVisibility(8);
            return;
        }
        wDSIcon.setVisibility(0);
        wDSIcon.setIcon(drawable);
    }

    public final void setRowContentTextStyle(C108505Tt r6) {
        WaTextView waTextView;
        if (r6 != null && (waTextView = this.A02) != null) {
            AnonymousClass088.A06(waTextView, r6.styleRes);
            int A002 = C224514j.A00(getContext(), r6.textColorAttrb, R.color.f6nameremoved);
            if (A002 == R.color.f6nameremoved) {
                TypedValue typedValue = new TypedValue();
                Resources.Theme A092 = C36361kB.A09(this);
                if (A092 != null) {
                    A092.resolveAttribute(r6.textColorAttrb, typedValue, true);
                }
                A002 = typedValue.resourceId;
            }
            C36331k8.A0r(getContext(), waTextView, A002);
        }
    }

    public final void setRowDividerStyle(AnonymousClass5S1 r6) {
        View view;
        ViewGroup.LayoutParams layoutParams;
        Resources resources;
        int i;
        if (r6 != null && (view = this.A00) != null) {
            int ordinal = r6.ordinal();
            if (ordinal == 1) {
                layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                resources = view.getResources();
                i = R.dimen.f7nameremoved;
            } else if (ordinal == 2) {
                layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                resources = view.getResources();
                i = R.dimen.f7nameremoved;
            } else if (ordinal == 0) {
                view.setVisibility(8);
                return;
            } else {
                return;
            }
            layoutParams.height = resources.getDimensionPixelSize(i);
            view.setLayoutParams(layoutParams);
            view.setVisibility(0);
        }
    }

    public final void setRowSubContentTextStyle(C108505Tt r5) {
        WaTextView waTextView;
        if (r5 != null && (waTextView = this.A01) != null) {
            AnonymousClass088.A06(waTextView, r5.styleRes);
            C36331k8.A0r(getContext(), waTextView, C224514j.A00(getContext(), r5.subTextColorAttrb, R.color.f6nameremoved));
        }
    }

    public final void setStartAddonProfilePhotoDrawable(Drawable drawable) {
        WDSProfilePhoto wDSProfilePhoto = this.A09;
        if (wDSProfilePhoto == null) {
            return;
        }
        if (drawable == null) {
            wDSProfilePhoto.setVisibility(8);
            return;
        }
        wDSProfilePhoto.setVisibility(0);
        wDSProfilePhoto.setImageDrawable(drawable);
    }

    public void setSubText(CharSequence charSequence) {
        WaTextView waTextView = this.A01;
        if (waTextView != null) {
            int i = 0;
            if (charSequence == null || charSequence.length() == 0) {
                i = 8;
            }
            waTextView.setVisibility(i);
            waTextView.setText(charSequence);
        }
    }

    public final void setText(CharSequence charSequence) {
        WaTextView waTextView = this.A02;
        if (waTextView != null) {
            int i = 0;
            if (charSequence == null || charSequence.length() == 0) {
                i = 8;
            }
            waTextView.setVisibility(i);
            waTextView.setText(charSequence);
        }
    }

    public WDSListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0C) {
            this.A0C = true;
            C27861Qc.A0t((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
    }

    public final C20810yC getAbProps() {
        return this.A04;
    }

    public final WDSIcon getEndAddonIcon() {
        return this.A06;
    }

    public final WDSSwitch getEndAddonSwitch() {
        return this.A0A;
    }

    public final WDSIcon getStartAddonIcon() {
        return this.A07;
    }

    public final WDSProfilePhoto getStartAddonProfilePhoto() {
        return this.A09;
    }

    public final AnonymousClass1RL getWaAsyncLayoutInflaterManager() {
        return this.A05;
    }

    public final C18820ts getWhatsAppLocale() {
        return this.A03;
    }

    public final void setAbProps(C20810yC r1) {
        this.A04 = r1;
    }

    public final void setEndAddonIcon(WDSIcon wDSIcon) {
        this.A06 = wDSIcon;
    }

    public final void setEndAddonSwitch(WDSSwitch wDSSwitch) {
        this.A0A = wDSSwitch;
    }

    public final void setStartAddonIcon(WDSIcon wDSIcon) {
        this.A07 = wDSIcon;
    }

    public final void setStartAddonProfilePhoto(WDSProfilePhoto wDSProfilePhoto) {
        this.A09 = wDSProfilePhoto;
    }

    public final void setWaAsyncLayoutInflaterManager(AnonymousClass1RL r1) {
        this.A05 = r1;
    }

    public final void setWhatsAppLocale(C18820ts r1) {
        this.A03 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A0C) {
            this.A0C = true;
            C27861Qc.A0t((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
        this.A0K = new C146136v6(this);
        this.A0I = this;
        if (attributeSet != null) {
            int[] iArr = C27991Qq.A0A;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            this.A08 = new C130646Lw(obtainStyledAttributes, this);
            A00(this);
            if (this.A08 == null) {
                Log.e("WDSListItem attributes missed");
            } else {
                WDSListItem wDSListItem = null;
                boolean z = this instanceof ViewGroup;
                View inflate = View.inflate(getContext(), R.layout.f9nameremoved, z ? this : null);
                AnonymousClass1RR r1 = this.A0K;
                AnonymousClass00C.A0B(inflate);
                r1.BZA(inflate, z ? this : wDSListItem, "auto-sync-inflated", R.layout.f9nameremoved);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setIcon(int i) {
        WDSIcon wDSIcon = this.A07;
        if (wDSIcon != null) {
            wDSIcon.setImageResource(i);
        }
    }

    public final void setSubText(int i) {
        WaTextView waTextView = this.A01;
        if (waTextView != null) {
            int i2 = 0;
            if (i == 0) {
                i2 = 8;
            }
            waTextView.setVisibility(i2);
            waTextView.setText(i);
        }
    }

    public void setText(int i) {
        WaTextView waTextView = this.A02;
        if (waTextView != null) {
            int i2 = 0;
            if (i == 0) {
                i2 = 8;
            }
            waTextView.setVisibility(i2);
            waTextView.setText(i);
        }
    }
}
