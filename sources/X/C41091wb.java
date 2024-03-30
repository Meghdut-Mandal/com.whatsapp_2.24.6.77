package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.community.SubgroupWithParentView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;

/* renamed from: X.1wb  reason: invalid class name and case insensitive filesystem */
public class C41091wb extends AnonymousClass0CZ implements Filterable {
    public int A00;
    public int A01 = -1;
    public int A02;
    public C81473x4 A03;
    public String A04 = "";
    public List A05 = AnonymousClass001.A0I();
    public List A06 = AnonymousClass001.A0I();
    public boolean A07;
    public C38071nf A08;
    public final int A09;
    public final int A0A;
    public final C19460v5 A0B;
    public final AnonymousClass17Y A0C;
    public final C19730wQ A0D;
    public final AnonymousClass1LI A0E;
    public final AnonymousClass171 A0F;
    public final AnonymousClass1RY A0G;
    public final C19970wo A0H;
    public final C18820ts A0I;
    public final AnonymousClass11F A0J;
    public final AnonymousClass4R8 A0K;
    public final C28371Sj A0L;
    public final boolean A0M;
    public final C20810yC A0N;

    public int A0J() {
        return this.A06.size();
    }

    public void BSE(AnonymousClass0D3 r30, int i) {
        String A012;
        AnonymousClass0D3 r6 = r30;
        int i2 = i;
        if (r6 instanceof C42671zC) {
            C42671zC r62 = (C42671zC) r6;
            C41091wb r7 = r62.A07;
            AnonymousClass350 r8 = (AnonymousClass350) r7.A06.get(i2);
            Object obj = r8.A01;
            C18740tg.A06(obj);
            if (obj instanceof C597134z) {
                int i3 = r8.A00;
                C597134z r5 = (C597134z) obj;
                if (r7.A0B.A03() != null) {
                    C42671zC.A00(r62, i2);
                    C80153uw r4 = r5.A00;
                    AnonymousClass3SF r2 = r62.A03;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("/");
                    r2.A09((List) null, A00(AnonymousClass000.A0q(r4.A01, A0u), r7.A04));
                    TextEmojiLabel textEmojiLabel = r62.A01;
                    textEmojiLabel.setVisibility(0);
                    textEmojiLabel.setText(r4.A00);
                    textEmojiLabel.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                    textEmojiLabel.setMarqueeRepeatLimit(1);
                    textEmojiLabel.setSingleLine();
                    textEmojiLabel.postDelayed(new C1497272n(r62, 8), 1000);
                    if (i3 == 32) {
                        r62.A04.setImageResource(R.drawable.vec_default_bot_imagine_cmd_icon);
                    }
                    r62.A00.setOnClickListener(new C135546cs(r62, r5, r4, i3, 3));
                    return;
                }
                return;
            }
            TextEmojiLabel textEmojiLabel2 = r62.A01;
            textEmojiLabel2.setEllipsize(TextUtils.TruncateAt.END);
            AnonymousClass141 r52 = (AnonymousClass141) obj;
            AnonymousClass147 A013 = C65533Sl.A01(r7.A0J);
            AnonymousClass34G A002 = r7.A0L.A00(r52, A013);
            String str = A002.A01;
            String str2 = str;
            C18740tg.A06(str2);
            AnonymousClass3SF r22 = r62.A03;
            r22.A09((List) null, A00(str, r7.A04));
            r22.A03(r52.A0O() ? 1 : 0);
            C52022ol r0 = A002.A00;
            C52022ol r28 = r0;
            C52022ol r18 = C52022ol.PUSH_NAME;
            if (r0 == r18) {
                str2 = AnonymousClass171.A03(r7.A0F, r52, R.string.f12nameremoved);
            }
            AnonymousClass1RY r15 = r7.A0G;
            ThumbnailButton thumbnailButton = r62.A04;
            r15.A08(thumbnailButton, r52);
            if (r52.A0G()) {
                thumbnailButton.setVisibility(8);
                AnonymousClass1RJ r222 = r62.A05;
                SubgroupWithParentView subgroupWithParentView = (SubgroupWithParentView) r222.A01();
                Context context = subgroupWithParentView.getContext();
                int dimensionPixelSize = subgroupWithParentView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                subgroupWithParentView.A00 = dimensionPixelSize;
                subgroupWithParentView.A01.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
                layoutParams.gravity = 8388693;
                ThumbnailButton thumbnailButton2 = subgroupWithParentView.A03;
                thumbnailButton2.setLayoutParams(layoutParams);
                ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(thumbnailButton2);
                A0a.setMargins(thumbnailButton2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), thumbnailButton2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), thumbnailButton2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), thumbnailButton2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
                thumbnailButton2.setLayoutParams(A0a);
                thumbnailButton2.A00 = C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved);
                subgroupWithParentView.setSubgroupProfilePhotoBorderColor(C224514j.A00(thumbnailButton2.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
                if (r7.A0M) {
                    subgroupWithParentView.setSubgroupProfilePhotoBorderColor(C224514j.A00(subgroupWithParentView.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
                }
                subgroupWithParentView.setSubgroupProfilePhoto(r52, 2, r15);
                r222.A03(0);
            } else {
                thumbnailButton.setVisibility(0);
                r62.A05.A03(8);
            }
            FrameLayout frameLayout = r62.A00;
            frameLayout.setOnClickListener(new AnonymousClass3YT(r62, r52, A002, r8, 9));
            C42671zC.A00(r62, i2);
            AnonymousClass171 r3 = r7.A0F;
            AnonymousClass34G A0B2 = r3.A0B(r28, r52, r3.A07(r52, A013));
            String str3 = A0B2.A01;
            C19460v5 r10 = r7.A0B;
            if (!r10.A05() || r8.A00 != 8) {
                if (!TextUtils.isEmpty(str3)) {
                    textEmojiLabel2.setText(A00(str3, r7.A04));
                    textEmojiLabel2.setVisibility(0);
                    if (A0B2.A00 == r18) {
                        str3 = AnonymousClass171.A03(r3, r52, R.string.f12nameremoved);
                    }
                }
                textEmojiLabel2.setVisibility(8);
            } else {
                AnonymousClass1K5 r1 = (AnonymousClass1K5) r10.A02();
                if (!r1.A02.A02() && (A012 = r1.A03.A01(R.string.f12nameremoved)) != null) {
                    textEmojiLabel2.setText(A012);
                    textEmojiLabel2.setVisibility(0);
                }
                textEmojiLabel2.setVisibility(8);
            }
            TextEmojiLabel textEmojiLabel3 = r62.A02;
            if (textEmojiLabel3 != null) {
                String A014 = AnonymousClass3SX.A01(textEmojiLabel3.getContext(), r7.A0H, r52);
                if (!AnonymousClass14B.A0F(A014)) {
                    textEmojiLabel3.setText(A014);
                }
            }
            Context context2 = frameLayout.getContext();
            Object[] A1b = C36411kG.A1b(str2);
            A1b[1] = str3;
            C36371kC.A14(context2, frameLayout, A1b, R.string.f12nameremoved);
        } else if (r6 instanceof C42171yO) {
            C42171yO r63 = (C42171yO) r6;
            r63.A01.setText(AnonymousClass000.A0I(((AnonymousClass350) r63.A02.A06.get(i2)).A01));
        }
    }

    public Filter getFilter() {
        C38071nf r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C38071nf r02 = new C38071nf(this);
        this.A08 = r02;
        return r02;
    }

    public int getItemViewType(int i) {
        if (i < 0 || i >= this.A06.size()) {
            return 1;
        }
        return ((AnonymousClass350) this.A06.get(i)).A00;
    }

    public C41091wb(Context context, C19460v5 r4, AnonymousClass17Y r5, C19730wQ r6, AnonymousClass1LI r7, AnonymousClass171 r8, C27731Pn r9, C19970wo r10, C18820ts r11, C20810yC r12, AnonymousClass11F r13, AnonymousClass4R8 r14, C28371Sj r15, boolean z, boolean z2) {
        int i;
        this.A0H = r10;
        this.A0N = r12;
        this.A0L = r15;
        this.A0C = r5;
        this.A0D = r6;
        this.A0F = r8;
        this.A0I = r11;
        this.A0B = r4;
        this.A0E = r7;
        this.A0G = r9.A04(context, "mentions-adapter");
        this.A0K = r14;
        this.A0J = r13;
        this.A0M = z;
        if (z) {
            this.A00 = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
            this.A02 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
            i = C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        } else {
            this.A00 = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
            this.A02 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
            i = R.color.f6nameremoved;
        }
        this.A09 = AnonymousClass00F.A00(context, i);
        this.A0A = C36441kJ.A05(context.getResources(), R.dimen.f7nameremoved);
        this.A07 = z2;
    }

    public static CharSequence A00(String str, String str2) {
        int indexOf = str.toLowerCase().indexOf(str2);
        int length = str2.length();
        if (length <= 0 || indexOf < 0) {
            return str;
        }
        SpannableStringBuilder A0P = C36441kJ.A0P(str);
        A0P.setSpan(new StyleSpan(1), indexOf, length + indexOf, 33);
        return A0P;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r7 != 32) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0D3 BUw(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            android.content.Context r4 = r6.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r4)
            r0 = 1
            if (r7 == r0) goto L_0x0021
            r0 = 2
            r2 = 0
            if (r7 == r0) goto L_0x003d
            r0 = 4
            if (r7 == r0) goto L_0x002e
            r0 = 8
            if (r7 == r0) goto L_0x003d
            r1 = 16
            r0 = 2131625508(0x7f0e0624, float:1.8878226E38)
            if (r7 == r1) goto L_0x0040
            r0 = 32
            if (r7 == r0) goto L_0x003d
        L_0x0021:
            java.util.List r0 = X.AnonymousClass0D3.A0I
            android.view.View r1 = new android.view.View
            r1.<init>(r4)
            X.2UP r0 = new X.2UP
            r0.<init>(r1)
            return r0
        L_0x002e:
            r0 = 2131625505(0x7f0e0621, float:1.887822E38)
            android.view.View r0 = r3.inflate(r0, r6, r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            X.1yO r1 = new X.1yO
            r1.<init>(r0, r5)
            return r1
        L_0x003d:
            r0 = 2131625507(0x7f0e0623, float:1.8878224E38)
        L_0x0040:
            android.view.View r0 = r3.inflate(r0, r6, r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            X.1zC r1 = new X.1zC
            r1.<init>(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41091wb.BUw(android.view.ViewGroup, int):X.0D3");
    }
}
