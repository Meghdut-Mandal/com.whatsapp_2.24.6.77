package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.media.GridLayoutManagerNonPredictiveAnimations;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import java.util.List;
import java.util.Map;

/* renamed from: X.4mq  reason: invalid class name and case insensitive filesystem */
public class C96134mq extends AnonymousClass0CZ {
    public int A00 = -1;
    public int A01;
    public List A02 = AnonymousClass001.A0I();
    public final /* synthetic */ AnonymousClass6Q0 A03;

    public C96134mq(AnonymousClass6Q0 r2) {
        this.A03 = r2;
    }

    private void A00(int i) {
        int i2 = this.A00;
        this.A00 = i;
        A07(i2);
        A07(this.A00);
        int max = Math.max(this.A00 - (this.A01 / 2), 0);
        AnonymousClass6Q0 r2 = this.A03;
        AnonymousClass0V2 r1 = r2.A04;
        if (max != r1.A00) {
            Boolean bool = C18750th.A01;
            r1.A00 = max;
            r2.A03.A0g(r1);
        }
    }

    public static void A01(C96134mq r9) {
        int i;
        int i2;
        ShapePickerRecyclerView shapePickerRecyclerView = r9.A03.A06;
        GridLayoutManagerNonPredictiveAnimations gridLayoutManagerNonPredictiveAnimations = shapePickerRecyclerView.A04;
        if (gridLayoutManagerNonPredictiveAnimations != null) {
            int A1S = gridLayoutManagerNonPredictiveAnimations.A1S();
            GridLayoutManagerNonPredictiveAnimations gridLayoutManagerNonPredictiveAnimations2 = shapePickerRecyclerView.A04;
            if (gridLayoutManagerNonPredictiveAnimations2 != null) {
                int A1U = gridLayoutManagerNonPredictiveAnimations2.A1U();
                if (A1S == 0) {
                    i = 0;
                } else if (A1U == shapePickerRecyclerView.getAdapterItemCount() - 1) {
                    i = C36431kI.A07(r9.A02);
                } else {
                    i = -1;
                    int i3 = Integer.MAX_VALUE;
                    for (int i4 = 0; i4 < r9.A02.size(); i4++) {
                        int A06 = C36351kA.A06(r9.A02, i4);
                        if (i4 < C36431kI.A07(r9.A02)) {
                            i2 = C36351kA.A06(r9.A02, i4 + 1) - 1;
                        } else {
                            i2 = Integer.MAX_VALUE;
                        }
                        int min = Math.min(AnonymousClass000.A05(A06, A1S), AnonymousClass000.A05(i2, (A1S + A1U) / 2));
                        if (min < i3) {
                            i = i4;
                            i3 = min;
                        }
                    }
                }
                r9.A00(i);
                return;
            }
            throw AnonymousClass001.A09("Must set adapter first");
        }
        throw AnonymousClass001.A09("Must set adapter first");
    }

    public static void A02(C96134mq r4, int i) {
        AnonymousClass6Q0 r1 = r4.A03;
        r1.A02 = false;
        r4.A00(i);
        ShapePickerRecyclerView shapePickerRecyclerView = r1.A06;
        int A06 = C36351kA.A06(r4.A02, i);
        GridLayoutManagerNonPredictiveAnimations gridLayoutManagerNonPredictiveAnimations = shapePickerRecyclerView.A04;
        if (gridLayoutManagerNonPredictiveAnimations != null) {
            Boolean bool = C18750th.A01;
            AnonymousClass0V2 r0 = shapePickerRecyclerView.A03;
            r0.A00 = A06;
            gridLayoutManagerNonPredictiveAnimations.A0g(r0);
            return;
        }
        throw AnonymousClass001.A09("Must set adapter first");
    }

    public long A0E(int i) {
        if (!this.A00) {
            return -1;
        }
        AnonymousClass6Q0 r6 = this.A03;
        if (r6 instanceof AnonymousClass5Cv) {
            AnonymousClass5Cv r62 = (AnonymousClass5Cv) r6;
            boolean z = r62.A01;
            if (z && i == 0) {
                return -1;
            }
            List list = r62.A03;
            if (z) {
                i--;
            }
            String str = ((AnonymousClass68B) list.get(i)).A0F;
            Map map = r62.A04;
            Number A0b = C90524aI.A0b(str, map);
            if (A0b == null) {
                long j = r62.A00;
                r62.A00 = 1 + j;
                A0b = Long.valueOf(j);
                map.put(str, A0b);
            }
            return A0b.longValue();
        }
        throw AnonymousClass001.A0E("You must override getStableId");
    }

    public int A0J() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r9, int i) {
        C96694nk r92 = (C96694nk) r9;
        int i2 = 0;
        boolean A1S = AnonymousClass000.A1S(this.A00, i);
        AnonymousClass6Q0 r5 = this.A03;
        if (r5 instanceof AnonymousClass5Cv) {
            AnonymousClass5Cv r52 = (AnonymousClass5Cv) r5;
            boolean z = r52.A01;
            if (!z || i != 0) {
                List list = r52.A03;
                if (z) {
                    i--;
                }
                AnonymousClass68B r6 = (AnonymousClass68B) list.get(i);
                String str = r6.A0F;
                ImageView imageView = r92.A01;
                if (!str.equals(imageView.getTag())) {
                    r52.A02.A0B(r6, new C148606z8(imageView, str));
                    View view = r92.A0H;
                    view.setContentDescription(C36391kE.A0v(view.getContext(), r6.A0H, AnonymousClass001.A0L(), 0, R.string.f12nameremoved));
                }
            } else {
                ImageView imageView2 = r92.A01;
                imageView2.setTag((Object) null);
                imageView2.setImageResource(R.drawable.ic_stickers_recents);
                View view2 = r92.A0H;
                C36331k8.A0q(view2.getContext(), view2, R.string.f12nameremoved);
            }
        } else {
            ImageView imageView3 = r92.A01;
            imageView3.setImageResource(C104995Cw.A01[i]);
            float f = 0.55f;
            if (A1S) {
                f = 1.0f;
            }
            imageView3.setAlpha(f);
            View view3 = r92.A0H;
            C36331k8.A0q(view3.getContext(), view3, C104995Cw.A02[i]);
        }
        View view4 = r92.A00;
        if (!A1S) {
            i2 = 8;
        }
        view4.setVisibility(i2);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass6Q0 r3 = this.A03;
        C96694nk r2 = new C96694nk(C36361kB.A0E(C36351kA.A0C(r3.A05), viewGroup, R.layout.f9nameremoved));
        r3.A01(r2, r3.A00);
        AnonymousClass3YG.A00(r2.A0H, this, r2, 42);
        return r2;
    }
}
