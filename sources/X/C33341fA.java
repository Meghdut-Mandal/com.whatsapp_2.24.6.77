package X;

import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Objects;

/* renamed from: X.1fA  reason: invalid class name and case insensitive filesystem */
public abstract class C33341fA {
    public C50312kY A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass1NG A03;
    public final AnonymousClass16D A04;
    public final AnonymousClass16K A05;
    public final ConversationsFragment A06;
    public final C21010yW A07;
    public final C19930wk A08;

    public void A02() {
        AnonymousClass16D r2 = this.A04;
        this.A00 = new C50312kY(this.A03, r2, this.A05, this, 15, false, true);
    }

    public void A04() {
        C33351fB r4 = (C33351fB) this;
        if (r4.A01 != null && C18820ts.A00(r4.A0C).A06) {
            r4.A01.postDelayed(new C35691j6(r4, 4), 300);
        }
        if (r4.A02 != null && C18820ts.A00(r4.A0C).A06) {
            r4.A02.setRotationY(180.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        r4 = r5.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.view.ViewGroup r8, X.AnonymousClass01I r9, java.util.ArrayList r10, java.util.ArrayList r11) {
        /*
            r7 = this;
            r5 = r7
            X.1fB r5 = (X.C33351fB) r5
            boolean r0 = r11.isEmpty()
            r2 = 1
            r6 = 0
            if (r0 == 0) goto L_0x003d
            X.1RJ r0 = r5.A09
            if (r0 == 0) goto L_0x0039
            r0.A03(r6)
            X.1RJ r0 = r5.A09
            android.view.View r1 = r0.A01()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r0 = r1.getChildCount()
            if (r0 != 0) goto L_0x0039
            com.whatsapp.conversationslist.ConversationsFragment r4 = r5.A06
            android.content.Context r3 = r4.A1D()
            if (r3 == 0) goto L_0x0039
            com.whatsapp.EmptyTellAFriendView r2 = new com.whatsapp.EmptyTellAFriendView
            r2.<init>((android.content.Context) r3, (boolean) r6)
            r1.addView(r2)
            r1 = 4
            X.1iE r0 = new X.1iE
            r0.<init>(r4, r3, r1)
            r2.setInviteButtonClickListener(r0)
        L_0x0039:
            r5.A07(r6)
            return
        L_0x003d:
            X.1RJ r1 = r5.A09
            if (r1 == 0) goto L_0x0046
            r0 = 8
            r1.A03(r0)
        L_0x0046:
            int r0 = r11.size()
            r5.A0B(r9, r10, r0)
            int r0 = r10.size()
            if (r0 <= r2) goto L_0x0039
            int r0 = r11.size()
            r5.A0A(r8, r9, r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33341fA.A05(android.view.ViewGroup, X.01I, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void A06(ViewGroup viewGroup, boolean z) {
        C33351fB r3 = (C33351fB) this;
        r3.A00 = viewGroup;
        r3.A07 = (TextView) viewGroup.findViewById(R.id.title);
        r3.A03 = (ImageView) r3.A00.findViewById(R.id.empty_illustration);
        r3.A01 = (HorizontalScrollView) r3.A00.findViewById(R.id.contacts_scroll_view);
        r3.A04 = (LinearLayout) r3.A00.findViewById(R.id.contacts_container);
        C33351fB.A00(r3.A00.getResources().getConfiguration(), r3.A00, z);
        TextView textView = (TextView) r3.A00.findViewById(R.id.prompt);
        r3.A06 = textView;
        Objects.requireNonNull(textView);
        textView.setOnClickListener(new C35161iF((Object) r3, 30));
        r3.A00.findViewById(R.id.title).setOnClickListener(new C35161iF((Object) r3, 31));
        r3.A08 = new AnonymousClass1RJ(viewGroup.findViewById(R.id.empty_nux_shimmer_view));
        r3.A05 = (RelativeLayout) viewGroup.findViewById(R.id.empty_nux_container);
        r3.A09 = new AnonymousClass1RJ(viewGroup.findViewById(R.id.invite_contacts_container));
    }

    public void A03() {
        C33371fD r2;
        C33371fD r1;
        if (this instanceof C33361fC) {
            C33361fC r4 = (C33361fC) this;
            if (r4.A02 || (r2 = r4.A00) == (r1 = C33371fD.IN_PROGRESS)) {
                r4.A07(true);
            } else if (r2 == C33371fD.NOT_STARTED || r2 == C33371fD.FAILED) {
                r4.A00 = r1;
                r4.A07(true);
                AnonymousClass19J r12 = r4.A03;
                if (r12.A06) {
                    AnonymousClass040 r3 = r4.A07;
                    AnonymousClass0A2.A02(C023109s.A00, r4.A06, new ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1(r4, (C023509x) null), r3);
                    return;
                }
                C33381fE r0 = r4.A01;
                r12.unregisterObserver(r0);
                r12.registerObserver(r0);
            }
        } else if (this.A02) {
            A04();
            A08();
            C19930wk r32 = this.A08;
            r32.A02();
            A02();
            if (this.A00 != null) {
                A07(true);
                this.A00.A02.executeOnExecutor(r32, new Object[0]);
            }
            this.A02 = false;
        }
    }

    public void A07(boolean z) {
        if (this instanceof C33351fB) {
            C33351fB r3 = (C33351fB) this;
            AnonymousClass1RJ r2 = r3.A08;
            int i = 0;
            if (r2 != null) {
                int i2 = 8;
                if (z) {
                    i2 = 0;
                }
                r2.A03(i2);
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) r3.A08.A01();
                if (z) {
                    shimmerFrameLayout.A03();
                } else {
                    shimmerFrameLayout.A04();
                }
            }
            RelativeLayout relativeLayout = r3.A05;
            if (relativeLayout != null) {
                if (z) {
                    i = 8;
                }
                relativeLayout.setVisibility(i);
            }
        }
    }

    public void A08() {
        C50312kY r1 = this.A00;
        if (r1 != null) {
            r1.A0D(true);
        }
        A07(false);
        this.A02 = false;
    }

    public C33341fA(AnonymousClass1NG r3, AnonymousClass16D r4, AnonymousClass16K r5, ConversationsFragment conversationsFragment, C21010yW r7, C19770wU r8) {
        this.A08 = new C19930wk(r8, false);
        this.A07 = r7;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
        this.A06 = conversationsFragment;
    }
}
