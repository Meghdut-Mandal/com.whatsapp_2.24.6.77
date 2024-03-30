package X;

import android.text.TextUtils;
import android.widget.ImageButton;
import com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;

/* renamed from: X.65z  reason: invalid class name and case insensitive filesystem */
public abstract class C1268765z {
    public final C108225Sr A00;

    public void A00() {
        float f;
        float f2;
        C146646vw r0;
        if (this instanceof AnonymousClass5LM) {
            AnonymousClass6VH r3 = ((AnonymousClass5LM) this).A00.A08;
            AnonymousClass6E4 r2 = r3.A02;
            r2.A04.clear();
            r2.A01(0.0d);
            C90484aE.A16(r3.A00);
            AnonymousClass6VH.A01(r3, 0);
            AnonymousClass3MU.A01(r3.A00, true, false);
            AnonymousClass3MU.A01(r3.A01, false, false);
            return;
        }
        if (this instanceof AnonymousClass5LL) {
            r0 = ((AnonymousClass5LL) this).A00;
        } else if (this instanceof AnonymousClass5LK) {
            r0 = ((AnonymousClass5LK) this).A00;
        } else if (this instanceof AnonymousClass5LJ) {
            C146646vw r1 = ((AnonymousClass5LJ) this).A00;
            boolean z = r1.A0D;
            AnonymousClass6VH r4 = r1.A08;
            if (z) {
                f = r1.A00;
            } else {
                f = 0.0f;
            }
            float A01 = C36441kJ.A01(r4.A00) / 5.5f;
            C18820ts r02 = r4.A05;
            if (r02 != null) {
                boolean A1X = C36401kF.A1X(r02);
                CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) r4.A08;
                float f3 = creationModeBottomBar.A01;
                if (A1X) {
                    f2 = f3 - A01;
                } else {
                    f2 = (-f3) + A01;
                }
                float f4 = f + f2;
                C18820ts r03 = r4.A05;
                if (r03 != null) {
                    if (!C36351kA.A1Y(r03) ? f4 < 0.0f : f4 > 0.0f) {
                        f4 = 0.0f;
                    }
                    C18820ts r04 = r4.A05;
                    if (r04 != null) {
                        boolean A1Y = C36351kA.A1Y(r04);
                        float f5 = creationModeBottomBar.A00;
                        if (!A1Y ? f4 > f5 : f4 < f5) {
                            f4 = f5;
                        }
                        AnonymousClass6VH.A00(r4, f4);
                        return;
                    }
                    throw C36321k7.A09();
                }
                throw C36321k7.A09();
            }
            throw C36321k7.A09();
        } else {
            CreationModeBottomBar creationModeBottomBar2 = (CreationModeBottomBar) ((AnonymousClass5LI) this).A00.A0J;
            ImageButton imageButton = creationModeBottomBar2.A04;
            if (imageButton == null) {
                throw C36331k8.A0d("sendButton");
            }
            imageButton.setEnabled(false);
            ImageButton imageButton2 = creationModeBottomBar2.A04;
            if (imageButton2 == null) {
                throw C36331k8.A0d("sendButton");
            }
            AnonymousClass3MU.A01(imageButton2, false, false);
            ImageButton imageButton3 = creationModeBottomBar2.A03;
            if (imageButton3 == null) {
                throw C36331k8.A0d("micButton");
            }
            AnonymousClass3MU.A01(imageButton3, false, false);
            return;
        }
        r0.A0J.BsD(r0.A03, r0.A09);
    }

    public void A01(CharSequence charSequence) {
        C146646vw r7;
        if (this instanceof AnonymousClass5LM) {
            AnonymousClass5LM r1 = (AnonymousClass5LM) this;
            if (TextUtils.getTrimmedLength(charSequence) > 0) {
                r7 = r1.A00;
                AnonymousClass6VH r6 = r7.A08;
                int i = r7.A03;
                String str = r7.A09;
                AnonymousClass00C.A0D(str, 1);
                ImageButton imageButton = r6.A01;
                imageButton.setEnabled(true);
                C18820ts r12 = r6.A05;
                if (r12 != null) {
                    C36321k7.A0L(imageButton.getContext(), imageButton, r12, i);
                    imageButton.setContentDescription(str);
                    AnonymousClass3MU.A01(imageButton, true, true);
                    AnonymousClass3MU.A01(r6.A00, false, true);
                } else {
                    throw C36321k7.A09();
                }
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass5LL) {
            return;
        } else {
            if (this instanceof AnonymousClass5LK) {
                AnonymousClass5LK r13 = (AnonymousClass5LK) this;
                if (TextUtils.getTrimmedLength(charSequence) <= 0) {
                    C146646vw r4 = r13.A00;
                    boolean A1b = C36331k8.A1b(r4.A0K);
                    AnonymousClass6VH r3 = r4.A08;
                    if (A1b) {
                        r3.A03(125);
                        r4.A06 = new AnonymousClass5LM(r4);
                        r4.A0B = false;
                        return;
                    }
                    ImageButton imageButton2 = r3.A01;
                    imageButton2.setEnabled(false);
                    AnonymousClass3MU.A01(r3.A00, false, false);
                    AnonymousClass3MU.A01(imageButton2, false, true);
                    r4.A06 = new AnonymousClass5LI(r4);
                    return;
                }
                return;
            } else if (!(this instanceof AnonymousClass5LJ)) {
                AnonymousClass5LI r14 = (AnonymousClass5LI) this;
                if (TextUtils.getTrimmedLength(charSequence) > 0) {
                    r7 = r14.A00;
                    AnonymousClass6VH r62 = r7.A08;
                    int i2 = r7.A03;
                    String str2 = r7.A09;
                    AnonymousClass00C.A0D(str2, 1);
                    ImageButton imageButton3 = r62.A01;
                    imageButton3.setEnabled(true);
                    C18820ts r15 = r62.A05;
                    if (r15 != null) {
                        C36321k7.A0L(imageButton3.getContext(), imageButton3, r15, i2);
                        imageButton3.setContentDescription(str2);
                        AnonymousClass3MU.A01(r62.A00, false, true);
                        AnonymousClass3MU.A01(imageButton3, true, true);
                    } else {
                        throw C36321k7.A09();
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        r7.A06 = new AnonymousClass5LK(r7);
    }

    public C1268765z(C108225Sr r1) {
        this.A00 = r1;
    }
}
