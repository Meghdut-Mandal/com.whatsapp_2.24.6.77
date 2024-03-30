package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.HomeActivity;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.1RF  reason: invalid class name */
public class AnonymousClass1RF extends AnonymousClass07T implements AnonymousClass1RE {
    public final int A00;
    public final AnonymousClass1RG[] A01;
    public final /* synthetic */ HomeActivity A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1RF(AnonymousClass01z r2, HomeActivity homeActivity) {
        super(r2, 0);
        this.A02 = homeActivity;
        int size = HomeActivity.A2Y.size();
        this.A00 = size;
        this.A01 = new AnonymousClass1RG[size];
    }

    public static AnonymousClass1RG A00(AnonymousClass1RF r8, int i) {
        ImageView imageView;
        ColorStateList valueOf;
        AnonymousClass1RG[] r5 = r8.A01;
        if (r5[i] == null) {
            AnonymousClass1RG r4 = new AnonymousClass1RG();
            HomeActivity homeActivity = r8.A02;
            View inflate = homeActivity.getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
            r4.A02 = inflate;
            r4.A06 = (TextView) C012005e.A02(inflate, R.id.tab);
            r4.A05 = (TextView) C012005e.A02(r4.A02, R.id.badge);
            r4.A04 = (ImageView) C012005e.A02(r4.A02, R.id.icon);
            r4.A00 = (ViewGroup) C012005e.A02(r4.A02, R.id.tab_container);
            r4.A06.setText(r8.A0F(i));
            r4.A06.setContentDescription(r8.A0F(i));
            if (i != HomeActivity.A0G(400)) {
                AnonymousClass06T.A00(AnonymousClass00F.A04(homeActivity, R.color.f6nameremoved), r4.A04);
            }
            if (i == HomeActivity.A0G(300)) {
                r4.A04.setImageDrawable(AnonymousClass00E.A00(homeActivity, R.drawable.new_status_indicator).mutate());
                AnonymousClass1JZ.A05(r4.A04, homeActivity.A00, homeActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0);
            } else if (i == HomeActivity.A0G(400)) {
                AnonymousClass1JZ.A05(r4.A04, homeActivity.A00, homeActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0);
                if (Build.VERSION.SDK_INT > 21) {
                    AnonymousClass0BQ A03 = AnonymousClass0BQ.A03(homeActivity, R.drawable.ic_calls_tab_joinable_badge_flash);
                    homeActivity.A0N = A03;
                    r4.A04.setImageDrawable(A03);
                } else {
                    r4.A04.setImageResource(R.drawable.vec_ic_calls_tab_joinable_badge);
                }
            } else if (homeActivity.A18.A01() && i == HomeActivity.A0G(600)) {
                boolean z = C222013h.A05;
                int i2 = R.drawable.vec_ic_community_tab;
                if (z) {
                    i2 = R.drawable.vec_ic_community_wds;
                }
                C010804n A002 = C010804n.A00((Resources.Theme) null, homeActivity.getResources(), i2);
                AnonymousClass1JZ.A05(r4.A04, homeActivity.A00, 0, 0);
                C34081gQ.A05(r4.A00, homeActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), HomeActivity.A0I(homeActivity));
                r4.A06.setVisibility(8);
                r4.A04.setVisibility(0);
                r4.A04.setImageDrawable(A002);
                r4.A04.setContentDescription(homeActivity.getString(R.string.f12nameremoved));
                if (C222013h.A05) {
                    AnonymousClass1RJ r1 = new AnonymousClass1RJ(C012005e.A02(r4.A02, R.id.icon_badge));
                    if (r1.A00() != 0) {
                        r1.A03(0);
                        ImageView imageView2 = (ImageView) r1.A01();
                        r4.A03 = imageView2;
                        if (imageView2 != null) {
                            imageView2.setVisibility(8);
                        }
                    }
                    int dimensionPixelSize = homeActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                    r4.A04.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                }
            }
            if (C222013h.A05) {
                int A003 = AnonymousClass00F.A00(homeActivity, C224514j.A00(homeActivity, R.attr.f4nameremoved, R.color.f6nameremoved));
                int A004 = AnonymousClass00F.A00(homeActivity, C224514j.A00(homeActivity, R.attr.f4nameremoved, R.color.f6nameremoved));
                r4.A06.setTextColor(A003);
                if (i == HomeActivity.A0G(300)) {
                    imageView = r4.A04;
                    valueOf = ColorStateList.valueOf(A004);
                } else {
                    if (i != HomeActivity.A0G(400)) {
                        imageView = r4.A04;
                        valueOf = ColorStateList.valueOf(A003);
                    }
                    r4.A05.setTextColor(AnonymousClass00F.A00(homeActivity, C224514j.A00(homeActivity, R.attr.f4nameremoved, R.color.f6nameremoved)));
                }
                AnonymousClass06T.A00(valueOf, imageView);
                r4.A05.setTextColor(AnonymousClass00F.A00(homeActivity, C224514j.A00(homeActivity, R.attr.f4nameremoved, R.color.f6nameremoved)));
            }
            r5[i] = r4;
        }
        return r5[i];
    }

    public CharSequence A0F(int i) {
        return A0N(HomeActivity.A0J(this.A02, i));
    }

    public long A0L(int i) {
        return (long) HomeActivity.A0J(this.A02, i);
    }

    public AnonymousClass02E A0M(int i) {
        AnonymousClass004 r0;
        HomeActivity homeActivity = this.A02;
        int A0J = HomeActivity.A0J(homeActivity, i);
        if (A0J == 200) {
            return new ConversationsFragment();
        }
        if (!(A0J == 300 || A0J == 400)) {
            if (A0J != 600) {
                if (!(A0J == 700 || A0J == 800)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("The item position should be less or equal to:");
                    sb.append(this.A00);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (homeActivity.A18.A01()) {
                r0 = (AnonymousClass004) homeActivity.A25.get(Integer.valueOf(A0J));
                if (r0 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No HomeFragment mapping for community tab id: ");
                    sb2.append(A0J);
                    throw new IllegalStateException(sb2.toString());
                }
                return (AnonymousClass02E) r0.get();
            } else {
                throw new IllegalStateException("Invalid tab id: 600");
            }
        }
        r0 = (AnonymousClass004) homeActivity.A25.get(Integer.valueOf(A0J));
        if (r0 == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("No HomeFragment mapping for tab id: ");
            sb3.append(A0J);
            throw new IllegalStateException(sb3.toString());
        }
        return (AnonymousClass02E) r0.get();
    }

    public String A0N(int i) {
        HomeActivity homeActivity;
        int i2;
        HomeActivity homeActivity2;
        int i3;
        if (i == 200) {
            homeActivity = this.A02;
            i2 = R.string.f12nameremoved;
        } else if (i == 300) {
            homeActivity = this.A02;
            boolean A012 = AnonymousClass1GQ.A01((AnonymousClass1GQ) homeActivity.A1k.get(), 3877);
            i2 = R.string.f12nameremoved;
            if (A012) {
                i2 = R.string.f12nameremoved;
            }
        } else if (i != 400) {
            if (i == 600) {
                homeActivity2 = this.A02;
                if (!homeActivity2.A3p().A07) {
                    return "";
                }
                i3 = R.string.f12nameremoved;
            } else if (i == 700) {
                homeActivity2 = this.A02;
                if (!homeActivity2.A3p().A07) {
                    return "";
                }
                i3 = R.string.f12nameremoved;
            } else if (i == 800) {
                homeActivity = this.A02;
                i2 = R.string.f12nameremoved;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("The item position should be less or equal to:");
                sb.append(this.A00);
                throw new IllegalArgumentException(sb.toString());
            }
            return homeActivity2.getString(i3);
        } else {
            homeActivity = this.A02;
            C225915a r1 = homeActivity.A07;
            C225915a r0 = C225915a.RAIL;
            i2 = R.string.f12nameremoved;
            if (r1 == r0) {
                i2 = R.string.f12nameremoved;
            }
        }
        return homeActivity.getString(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (com.whatsapp.HomeActivity.A0J(r2, r5) == 700) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View BF1(int r5) {
        /*
            r4 = this;
            com.whatsapp.HomeActivity r2 = r4.A02
            com.whatsapp.PagerSlidingTabStrip r3 = r2.A04
            if (r3 == 0) goto L_0x001b
            int r1 = com.whatsapp.HomeActivity.A0J(r2, r5)
            r0 = 600(0x258, float:8.41E-43)
            if (r1 == r0) goto L_0x0017
            int r2 = com.whatsapp.HomeActivity.A0J(r2, r5)
            r1 = 700(0x2bc, float:9.81E-43)
            r0 = 1
            if (r2 != r1) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3.setShouldExpand(r0)
        L_0x001b:
            X.1RG r0 = A00(r4, r5)
            android.view.View r0 = r0.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RF.BF1(int):android.view.View");
    }

    public int A0H() {
        return this.A00;
    }
}
