package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.expressionstray.emoji.view.EmojiImageView;
import com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader;
import com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader$loadEmoji$job$2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.4mP  reason: invalid class name and case insensitive filesystem */
public final class C95864mP extends C02920Ck {
    public static final C02830Cb A07 = new C162467od(3);
    public final int A00;
    public final int A01;
    public final Paint A02;
    public final EmojiImageViewLoader A03;
    public final C1270066o A04;
    public final C009003v A05;
    public final C009003v A06;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 0) {
            return new C1033955e(C36371kC.A0I(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved));
        }
        if (i == 1) {
            View inflate = C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
            Paint paint = this.A02;
            C009003v r5 = this.A06;
            C009003v r6 = this.A05;
            EmojiImageViewLoader emojiImageViewLoader = this.A03;
            List list = AnonymousClass0D3.A0I;
            AnonymousClass00C.A0B(inflate);
            return new C1034155g(paint, inflate, emojiImageViewLoader, r5, r6);
        } else if (i == 2) {
            View inflate2 = C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
            AnonymousClass00C.A0E(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) inflate2;
            int i2 = this.A01;
            for (int i3 = 0; i3 < i2; i3++) {
                viewGroup2.addView(C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup2, false), new LinearLayout.LayoutParams(0, this.A00, 1.0f));
            }
            return new C1034055f(this.A02, viewGroup2, this.A03, this.A06, this.A05);
        } else {
            throw AnonymousClass001.A09("Unknown view type.");
        }
    }

    public C95864mP(Paint paint, EmojiImageViewLoader emojiImageViewLoader, C1270066o r4, C009003v r5, C009003v r6, int i, int i2) {
        super(A07);
        this.A03 = emojiImageViewLoader;
        this.A02 = paint;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r4;
        this.A06 = r5;
        this.A05 = r6;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r20, int i) {
        C1270066o r3;
        int intValue;
        String str;
        String str2;
        C163377q6 r0;
        C163377q6 r02;
        int i2 = i;
        C96514nS r32 = (C96514nS) r20;
        AnonymousClass00C.A0D(r32, 0);
        C1256760v r4 = (C1256760v) A0L(i2);
        if (r4 instanceof C1034355i) {
            if (r32 instanceof C1034155g) {
                C1034355i r42 = (C1034355i) r4;
                Integer num = r42.A02;
                if (num != null) {
                    this.A04.A00(num.intValue(), "emoji_view_bind_start", (String) null);
                }
                C1034155g r33 = (C1034155g) r32;
                int[] iArr = r42.A04;
                AnonymousClass2M9 r9 = new AnonymousClass2M9(iArr);
                long A002 = C1898996a.A00(r9, false);
                EmojiImageViewLoader emojiImageViewLoader = r33.A01;
                EmojiImageView emojiImageView = r33.A00;
                emojiImageViewLoader.A01(r9, emojiImageView, num, A002);
                emojiImageView.setOnClickListener(new AnonymousClass3YL(r33, i2, 10, r42));
                if (AnonymousClass3UO.A03(iArr) || AnonymousClass3UO.A02(iArr)) {
                    emojiImageView.setLongClickable(true);
                    r02 = new C163377q6(r33, i2, 1, r42);
                } else {
                    emojiImageView.setLongClickable(false);
                    r02 = null;
                }
                emojiImageView.setOnLongClickListener(r02);
                if (num != null) {
                    r3 = this.A04;
                    intValue = num.intValue();
                    str = null;
                    str2 = "emoji_view_bind_end";
                } else {
                    return;
                }
            } else {
                throw AnonymousClass000.A0f(r32, "Impossible to bind EmojiItem to ", AnonymousClass000.A0u());
            }
        } else if (r4 instanceof C1034255h) {
            C1034255h r43 = (C1034255h) r4;
            AnonymousClass00C.A0D(r43, 0);
            C36351kA.A0E(r32.A0H).setText(r43.A00);
            return;
        } else if (r4 instanceof C1034455j) {
            C1034455j r44 = (C1034455j) r4;
            Integer num2 = r44.A02;
            if (num2 != null) {
                this.A04.A00(num2.intValue(), "emoji_row_bind_start", (String) null);
            }
            C1034055f r34 = (C1034055f) r32;
            int i3 = i * this.A01;
            View view = r34.A0H;
            AnonymousClass00C.A0E(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = new C18660tW(view, 0).iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    throw C36351kA.A0v();
                }
                View view2 = (View) next;
                EmojiImageView emojiImageView2 = (EmojiImageView) view2.findViewById(R.id.emoji);
                int[] iArr2 = (int[]) AnonymousClass02R.A08(r44.A04, i4);
                if (iArr2 == null) {
                    view2.setVisibility(4);
                    if (emojiImageView2 != null) {
                        emojiImageView2.A00((int[]) null, (Drawable) null);
                    }
                } else {
                    view2.setVisibility(0);
                    if (emojiImageView2 != null) {
                        emojiImageView2.setPaint(r34.A00);
                        AnonymousClass2M9 r12 = new AnonymousClass2M9(iArr2);
                        A0I.add(new AnonymousClass6BM(r12, emojiImageView2, C1898996a.A00(r12, false)));
                        int i6 = i4 + i3;
                        emojiImageView2.setOnClickListener(new AnonymousClass3YL(r34, i6, 9, iArr2));
                        if (AnonymousClass3UO.A03(iArr2) || AnonymousClass3UO.A02(iArr2)) {
                            emojiImageView2.setLongClickable(true);
                            r0 = new C163377q6(r34, i6, 0, iArr2);
                        } else {
                            emojiImageView2.setLongClickable(false);
                            r0 = null;
                        }
                        emojiImageView2.setOnLongClickListener(r0);
                    }
                }
                i4 = i5;
            }
            if (A0I.size() > 0) {
                EmojiImageViewLoader emojiImageViewLoader2 = r34.A01;
                ArrayList<C128966Eh> A0z = C36351kA.A0z(A0I);
                Iterator it2 = A0I.iterator();
                while (it2.hasNext()) {
                    AnonymousClass6BM r35 = (AnonymousClass6BM) it2.next();
                    long j = r35.A00;
                    AnonymousClass3PG r13 = r35.A01;
                    WeakReference A0F = AnonymousClass001.A0F(r35.A02);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("emoji_");
                    A0u.append(j);
                    A0u.append('/');
                    A0z.add(new C128966Eh(r13, new C1275368r(AnonymousClass000.A0o(r13, A0u)), num2, A0F, j));
                }
                for (C128966Eh r1 : A0z) {
                    EmojiImageView emojiImageView3 = (EmojiImageView) r1.A04.get();
                    if (emojiImageView3 != null) {
                        Object tag = emojiImageView3.getTag();
                        C1275368r r14 = r1.A03;
                        if (!AnonymousClass00C.A0J(tag, r14)) {
                            emojiImageView3.A00((int[]) null, (Drawable) null);
                        }
                        emojiImageView3.setTag(r14);
                    }
                }
                ArrayList A0z2 = C36351kA.A0z(A0z);
                for (C128966Eh r03 : A0z) {
                    A0z2.add(r03.A03.toString());
                }
                C1275368r r7 = new C1275368r(C007103b.A0Q(", ", "", "", A0z2, (C006302t) null));
                HashMap hashMap = emojiImageViewLoader2.A03;
                C007403e r04 = (C007403e) hashMap.remove(r7);
                if (r04 != null) {
                    r04.B2S((CancellationException) null);
                }
                if (num2 != null) {
                    emojiImageViewLoader2.A02.A00(num2.intValue(), "emoji_image_loader_launch_batch", (String) null);
                }
                hashMap.put(r7, C36391kE.A12(new EmojiImageViewLoader$loadEmoji$job$2(new AnonymousClass6AB(num2, A0z), emojiImageViewLoader2, (C023509x) null), (AnonymousClass040) emojiImageViewLoader2.A04.getValue()));
            }
            if (num2 != null) {
                r3 = this.A04;
                intValue = num2.intValue();
                str = null;
                str2 = "emoji_row_bind_end";
            } else {
                return;
            }
        } else {
            return;
        }
        r3.A00(intValue, str2, str);
    }

    public int getItemViewType(int i) {
        Object A0L = A0L(i);
        if (A0L instanceof C1034455j) {
            return 2;
        }
        if (A0L instanceof C1034355i) {
            return 1;
        }
        if (A0L instanceof C1034255h) {
            return 0;
        }
        throw C36441kJ.A18();
    }
}
