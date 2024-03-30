package com.whatsapp.biz.linkedaccounts;

import X.AnonymousClass000;
import X.AnonymousClass2FY;
import X.AnonymousClass3A6;
import X.AnonymousClass3C0;
import X.AnonymousClass5Lb;
import X.C012005e;
import X.C102164zP;
import X.C128636Da;
import X.C134766bZ;
import X.C18820ts;
import X.C196169Xz;
import X.C201549jr;
import X.C206549ta;
import X.C206949uI;
import X.C207109uZ;
import X.C21097A8i;
import X.C24801Dv;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C75033mZ;
import X.C75543nP;
import X.C80253v6;
import X.C89804Xy;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.media.MediaCard;
import java.text.NumberFormat;
import java.util.Set;

public class LinkedAccountsMediaCard extends MediaCard {
    public UserJid A00;
    public C24801Dv A01;
    public AnonymousClass3C0 A02;
    public C75543nP A03;
    public C196169Xz A04;
    public AnonymousClass5Lb A05;
    public boolean A06;
    public int A07;

    public LinkedAccountsMediaCard(Context context) {
        this(context, (AttributeSet) null);
    }

    public void A06(AttributeSet attributeSet) {
        if (this.A00 == null) {
            super.A06(attributeSet);
            ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
            layoutParams.height = getThumbnailPixelSize();
            this.A00.setLayoutParams(layoutParams);
            this.A07 = getThumbnailPixelSize();
            TextView A0O = C36391kE.A0O(this, R.id.media_card_info);
            TextView A0O2 = C36391kE.A0O(this, R.id.media_card_empty_info);
            A0O.setAllCaps(false);
            A0O2.setAllCaps(false);
            this.A04.A00 = this.A07;
        }
    }

    public void A09() {
        C75033mZ r1;
        C196169Xz r3 = this.A04;
        if (!r3.A02) {
            Set<C21097A8i> set = r3.A03;
            for (C21097A8i A022 : set) {
                r3.A02(A022);
            }
            set.clear();
            C102164zP r12 = r3.A01;
            if (r12 != null) {
                r12.A02(false);
                r3.A01 = null;
            }
            r3.A02 = true;
        }
        C75543nP r2 = this.A03;
        if (r2 != null && (r1 = r2.A00) != null && r2.equals(r1.A01)) {
            r1.A01 = null;
        }
    }

    public void setup(UserJid userJid, boolean z, C207109uZ r26, int i, Integer num, C206949uI r29, boolean z2, boolean z3, C201549jr r32) {
        C134766bZ r0;
        UserJid userJid2 = userJid;
        if (!userJid2.equals(this.A00)) {
            this.A00 = userJid2;
            C24801Dv r12 = this.A01;
            C18820ts r1 = this.A02;
            C206949uI r16 = r29;
            C201549jr r15 = r32;
            C18820ts r18 = r1;
            AnonymousClass5Lb r19 = this.A05;
            this.A03 = new C75543nP(r12, this.A02, this, r15, r16, r26, r18, r19, num, i, z3);
            this.A00.removeAllViews();
            if (!z || !this.A03.A02(userJid2)) {
                C75543nP r6 = this.A03;
                LinkedAccountsMediaCard linkedAccountsMediaCard = r6.A06;
                int i2 = r6.A03;
                Context context = r6.A04;
                int i3 = R.string.f12nameremoved;
                if (i2 == 0) {
                    i3 = R.string.f12nameremoved;
                }
                linkedAccountsMediaCard.setTitle(context.getString(i3));
                C206549ta r13 = r6.A09.A05;
                if (r13 != null) {
                    if (i2 == 0) {
                        r0 = r13.A00;
                    } else if (i2 == 1) {
                        r0 = r13.A01;
                    }
                    if (r0 != null) {
                        int i4 = r0.A00;
                        String str = r0.A01;
                        if (i4 > 0) {
                            int i5 = R.plurals.f10nameremoved;
                            if (i2 == 0) {
                                i5 = R.plurals.f10nameremoved;
                            }
                            String format = NumberFormat.getIntegerInstance(C36401kF.A0x(r6.A0A)).format((long) i4);
                            String quantityString = context.getResources().getQuantityString(i5, i4, new Object[]{str, format});
                            int i6 = 35;
                            if (AnonymousClass000.A0X(context).densityDpi <= 240) {
                                i6 = 25;
                            }
                            int length = quantityString.length();
                            if (length > i6) {
                                int i7 = length - i6;
                                int length2 = str.length();
                                if (i7 > length2) {
                                    str = "";
                                } else {
                                    String substring = str.substring(0, length2 - i7);
                                    if (substring.length() < length2) {
                                        str = AnonymousClass000.A0q("... ", AnonymousClass000.A0v(substring));
                                    }
                                }
                            }
                            str = context.getResources().getQuantityString(i5, i4, C36431kI.A1a(str, format, 2));
                        }
                        linkedAccountsMediaCard.setMediaInfo(str);
                    }
                }
                linkedAccountsMediaCard.setSeeMoreClickListener(new C89804Xy(r6, 1));
                C75543nP r4 = this.A03;
                if (!r4.A01) {
                    r4.A06.A07((View.OnClickListener) null, 3);
                    r4.A01 = true;
                }
                C75543nP r5 = this.A03;
                int i8 = this.A07;
                if (r5.A02(userJid2)) {
                    r5.A01(userJid2);
                    return;
                }
                C75033mZ A002 = r5.A05.A00(r5, new C128636Da(userJid2, i8, i8, r5.A03, false, false, false));
                r5.A00 = A002;
                if (!A002.A02.A09()) {
                    C75033mZ.A01(A002, -1);
                    return;
                }
                C80253v6.A01(A002.A05, A002, 49);
                A002.A00 = System.currentTimeMillis();
                return;
            }
            this.A03.A01(userJid2);
        }
    }

    public AnonymousClass2FY A02(ViewGroup.LayoutParams layoutParams, AnonymousClass3A6 r5, int i) {
        AnonymousClass2FY A022 = super.A02(layoutParams, r5, i);
        A022.A01 = getResources().getDimension(R.dimen.f7nameremoved);
        return A022;
    }

    public View getOpenProfileView() {
        View A0E = C36361kB.A0E(C36351kA.A0C(this), this, R.layout.f9nameremoved);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int i = this.A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        A0E.setLayoutParams(layoutParams);
        return C012005e.A02(A0E, R.id.linked_account_open_profile_layout);
    }

    public int getThumbnailPixelSize() {
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public LinkedAccountsMediaCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A06(attributeSet);
    }

    public LinkedAccountsMediaCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
