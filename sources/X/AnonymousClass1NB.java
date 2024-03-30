package X;

import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1NB  reason: invalid class name */
public final class AnonymousClass1NB {
    public AnonymousClass0BQ A00;
    public AnonymousClass07V A01;
    public final int A02;
    public final AnonymousClass056 A03 = new AnonymousClass056(80);
    public final AnonymousClass056 A04 = new AnonymousClass056(3);
    public final C18820ts A05;
    public final AnonymousClass1GQ A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final AnonymousClass1NA A0F;

    public AnonymousClass1NB(C18820ts r9, C20810yC r10, AnonymousClass1NA r11, AnonymousClass1GQ r12, AnonymousClass13J r13) {
        AnonymousClass00C.A0D(r13, 1);
        AnonymousClass00C.A0D(r10, 2);
        AnonymousClass00C.A0D(r9, 4);
        AnonymousClass00C.A0D(r12, 5);
        this.A0F = r11;
        this.A05 = r9;
        this.A06 = r12;
        boolean z = r11.A01;
        this.A07 = z;
        this.A08 = false | (z & C20800yB.A01(C21000yV.A01, r10, 3625));
        C21000yV r2 = C21000yV.A02;
        int A002 = C20800yB.A00(r2, r10, 5378);
        this.A02 = A002;
        List asList = Arrays.asList(new Integer[]{10, 12});
        AnonymousClass00C.A08(asList);
        this.A0E = asList.contains(Integer.valueOf(A002));
        this.A0C = C20800yB.A01(r2, r10, 4459);
        this.A0B = C20800yB.A01(r2, r10, 4458);
        this.A0A = C20800yB.A01(r2, r10, 4562);
        this.A0D = C20800yB.A01(r2, r10, 5376);
        this.A09 = C20800yB.A01(r2, r10, 6988);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = X.C15040mb.A05(0, r5.getChildCount());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.view.View A00(android.view.View r5) {
        /*
            r4 = this;
            java.lang.Class<X.07f> r1 = X.C016807f.class
            if (r5 == 0) goto L_0x0010
            boolean r0 = r1.isInstance(r5)
            if (r0 == 0) goto L_0x0011
            java.lang.Object r5 = r1.cast(r5)
            android.view.View r5 = (android.view.View) r5
        L_0x0010:
            return r5
        L_0x0011:
            boolean r0 = r5 instanceof android.view.ViewGroup
            r3 = 0
            if (r0 == 0) goto L_0x0039
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 == 0) goto L_0x0039
            r1 = 0
            int r0 = r5.getChildCount()
            X.0mZ r0 = X.C15040mb.A05(r1, r0)
            int r2 = r0.A00
            int r1 = r0.A01
            if (r2 > r1) goto L_0x0039
        L_0x0029:
            android.view.View r0 = r5.getChildAt(r2)
            android.view.View r0 = r4.A00(r0)
            if (r0 == 0) goto L_0x0034
            return r0
        L_0x0034:
            if (r2 == r1) goto L_0x0039
            int r2 = r2 + 1
            goto L_0x0029
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NB.A00(android.view.View):android.view.View");
    }

    private final AnonymousClass081 A02(MenuItem menuItem) {
        View A002 = A00(this.A01);
        if (A002 != null) {
            return (AnonymousClass081) A002.findViewById(menuItem.getItemId());
        }
        return null;
    }

    private final void A03(MenuItem menuItem, AnonymousClass07V r6, C1899796i r7) {
        AnonymousClass081 A022;
        View findViewById;
        View findViewById2;
        if (!AnonymousClass00C.A0J(r7, C177228dS.A00)) {
            AnonymousClass08H r0 = (AnonymousClass08H) r6.A04.A0N.get(menuItem.getItemId());
            if (r0 != null) {
                r0.A08(false);
            }
            AnonymousClass081 A023 = A02(menuItem);
            if (!(A023 == null || (findViewById2 = A023.findViewById(R.id.bottom_nav_indicator_badge)) == null)) {
                findViewById2.setVisibility(8);
            }
        }
        if (!(r7 instanceof C177208dQ)) {
            AnonymousClass08H r02 = (AnonymousClass08H) r6.A04.A0N.get(menuItem.getItemId());
            if (r02 != null) {
                r02.A08(false);
            }
        }
        if (!AnonymousClass00C.A0J(r7, C177218dR.A00) && (A022 = A02(menuItem)) != null && (findViewById = A022.findViewById(R.id.animated_icon)) != null) {
            findViewById.setVisibility(8);
            AnonymousClass0BQ r03 = this.A00;
            if (r03 != null) {
                r03.stop();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0139 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A04(int r18) {
        /*
            r17 = this;
            r1 = r17
            boolean r15 = r1.A07
            r0 = 600(0x258, float:8.41E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r0 = 800(0x320, float:1.121E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r0 = 400(0x190, float:5.6E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r16 = 0
            r2 = 5
            r14 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r13 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            r0 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r12 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            if (r15 != 0) goto L_0x0076
            X.011[] r2 = new X.AnonymousClass011[r2]
            X.011 r0 = new X.011
            r0.<init>(r8, r11)
            r2[r16] = r0
            X.011 r0 = new X.011
            r0.<init>(r10, r9)
            r2[r13] = r0
            X.011 r0 = new X.011
            r0.<init>(r5, r4)
        L_0x0050:
            r2[r14] = r0
            X.011 r1 = new X.011
            r1.<init>(r7, r3)
        L_0x0057:
            r0 = 3
            r2[r0] = r1
            X.011 r0 = new X.011
            r0.<init>(r6, r3)
        L_0x005f:
            r2[r12] = r0
            java.util.LinkedHashMap r1 = X.C000400e.A07(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0139
            int r0 = r0.intValue()
            return r0
        L_0x0076:
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x0090
            X.011[] r2 = new X.AnonymousClass011[r2]
            X.011 r0 = new X.011
            r0.<init>(r10, r11)
            r2[r16] = r0
            X.011 r0 = new X.011
            r0.<init>(r5, r9)
            r2[r13] = r0
            X.011 r0 = new X.011
            r0.<init>(r8, r4)
            goto L_0x0050
        L_0x0090:
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x00b1
            X.011[] r2 = new X.AnonymousClass011[r2]
            X.011 r0 = new X.011
            r0.<init>(r10, r11)
            r2[r16] = r0
            X.011 r0 = new X.011
            r0.<init>(r5, r9)
            r2[r13] = r0
            X.011 r0 = new X.011
            r0.<init>(r7, r4)
        L_0x00a9:
            r2[r14] = r0
            X.011 r1 = new X.011
            r1.<init>(r8, r3)
            goto L_0x0057
        L_0x00b1:
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x00cb
            X.011[] r2 = new X.AnonymousClass011[r2]
            X.011 r0 = new X.011
            r0.<init>(r10, r11)
            r2[r16] = r0
            X.011 r0 = new X.011
            r0.<init>(r7, r9)
            r2[r13] = r0
            X.011 r0 = new X.011
            r0.<init>(r5, r4)
            goto L_0x00a9
        L_0x00cb:
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x00f5
            X.011[] r2 = new X.AnonymousClass011[r2]
            X.011 r0 = new X.011
            r0.<init>(r10, r11)
            r2[r16] = r0
            X.011 r0 = new X.011
            r0.<init>(r7, r9)
            r2[r13] = r0
            X.011 r0 = new X.011
            r0.<init>(r8, r4)
            r2[r14] = r0
            X.011 r1 = new X.011
            r1.<init>(r6, r4)
            r0 = 3
            r2[r0] = r1
            X.011 r0 = new X.011
            r0.<init>(r5, r3)
            goto L_0x005f
        L_0x00f5:
            boolean r1 = r1.A0D
            X.011[] r2 = new X.AnonymousClass011[r2]
            X.011 r0 = new X.011
            if (r1 == 0) goto L_0x011f
            r0.<init>(r5, r11)
            r2[r16] = r0
            X.011 r0 = new X.011
            r0.<init>(r10, r9)
            r2[r13] = r0
            X.011 r0 = new X.011
            r0.<init>(r8, r4)
            r2[r14] = r0
            X.011 r1 = new X.011
            r1.<init>(r6, r4)
            r0 = 3
            r2[r0] = r1
            X.011 r0 = new X.011
            r0.<init>(r7, r3)
            goto L_0x005f
        L_0x011f:
            r0.<init>(r10, r11)
            r2[r16] = r0
            X.011 r0 = new X.011
            r0.<init>(r7, r9)
            r2[r13] = r0
            X.011 r0 = new X.011
            r0.<init>(r8, r4)
            r2[r14] = r0
            X.011 r1 = new X.011
            r1.<init>(r5, r3)
            goto L_0x0057
        L_0x0139:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NB.A04(int):int");
    }

    public final void A05(Context context, C1899896j r8, int i) {
        AnonymousClass081 A022;
        AnonymousClass07V r2 = this.A01;
        if (r2 == null) {
            return;
        }
        if (i < 0 || i > r2.A03.size()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to set badge for invalid tab id, index: ");
            sb.append(i);
            sb.append(", count: ");
            sb.append(r2.getChildCount());
            String obj = sb.toString();
            Log.e(obj);
            C18740tg.A0D(false, obj);
            return;
        }
        MenuItem item = r2.A03.getItem(i);
        if (item == null) {
            return;
        }
        if (r8 instanceof C177238dT) {
            C1899796i r1 = ((C177238dT) r8).A00;
            A03(item, r2, r1);
            if (r1 instanceof C177208dQ) {
                int i2 = ((C177208dQ) r1).A00;
                AnonymousClass08H A012 = A01(context, item, r2);
                A012.A06();
                int A013 = C65103Qt.A01(context, 6.0f);
                C07190Wr r12 = A012.A08;
                C08800bL r4 = r12.A04;
                Integer valueOf = Integer.valueOf(A013);
                r4.A0E = valueOf;
                C08800bL r3 = r12.A03;
                r3.A0E = valueOf;
                AnonymousClass08H.A04(A012);
                r4.A0D = valueOf;
                r3.A0D = valueOf;
                AnonymousClass08H.A04(A012);
                Integer valueOf2 = Integer.valueOf(C65103Qt.A01(context, 8.0f));
                r4.A0G = valueOf2;
                r3.A0G = valueOf2;
                AnonymousClass08H.A04(A012);
                r4.A0F = valueOf2;
                r3.A0F = valueOf2;
                AnonymousClass08H.A04(A012);
                Locale A014 = C18820ts.A01(this.A05.A00);
                if (!A014.equals(r3.A0H)) {
                    r4.A0H = A014;
                    r3.A0H = A014;
                    A012.invalidateSelf();
                }
                if (r3.A04 != 3) {
                    r4.A04 = 3;
                    r3.A04 = 3;
                    AnonymousClass08H.A03(A012);
                }
                int max = Math.max(0, i2);
                if (r3.A05 != max) {
                    r4.A05 = max;
                    r3.A05 = max;
                    A012.A09.A02 = true;
                    AnonymousClass08H.A04(A012);
                    A012.invalidateSelf();
                }
                A012.A08(true);
            } else if (AnonymousClass00C.A0J(r1, C177228dS.A00)) {
                if (this.A0E) {
                    AnonymousClass081 A023 = A02(item);
                    if (A023 != null) {
                        View findViewById = A023.findViewById(R.id.bottom_nav_indicator_badge);
                        if (findViewById == null) {
                            int i3 = this.A02;
                            int i4 = R.layout.f9nameremoved;
                            if (i3 == 12) {
                                i4 = R.layout.f9nameremoved;
                            }
                            findViewById = LayoutInflater.from(context).inflate(i4, A023, true);
                            AnonymousClass00C.A08(findViewById);
                        }
                        findViewById.setVisibility(0);
                        return;
                    }
                    return;
                }
                AnonymousClass08H A015 = A01(context, item, r2);
                A015.A06();
                int A016 = C65103Qt.A01(context, 2.0f);
                C07190Wr r13 = A015.A08;
                C08800bL r22 = r13.A04;
                Integer valueOf3 = Integer.valueOf(A016);
                r22.A0E = valueOf3;
                C08800bL r14 = r13.A03;
                r14.A0E = valueOf3;
                AnonymousClass08H.A04(A015);
                r22.A0D = valueOf3;
                r14.A0D = valueOf3;
                AnonymousClass08H.A04(A015);
                Integer valueOf4 = Integer.valueOf(C65103Qt.A01(context, 6.0f));
                r22.A0G = valueOf4;
                r14.A0G = valueOf4;
                AnonymousClass08H.A04(A015);
                r22.A0F = valueOf4;
                r14.A0F = valueOf4;
                AnonymousClass08H.A04(A015);
                A015.A08(true);
            } else if (AnonymousClass00C.A0J(r1, C177218dR.A00) && (A022 = A02(item)) != null) {
                View findViewById2 = A022.findViewById(R.id.animated_icon);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                } else {
                    Context context2 = r2.getContext();
                    AnonymousClass00C.A08(context2);
                    ImageView imageView = (ImageView) LayoutInflater.from(context2).inflate(R.layout.f9nameremoved, A022, true).findViewById(R.id.animated_icon);
                    if (Build.VERSION.SDK_INT > 21) {
                        AnonymousClass0BQ r0 = this.A00;
                        if (r0 == null) {
                            r0 = AnonymousClass0BQ.A03(context2, R.drawable.ic_calls_tab_joinable_badge_flash);
                            if (r0 != null) {
                                this.A00 = r0;
                            }
                        }
                        imageView.setImageDrawable(r0);
                        r0.start();
                    } else {
                        imageView.setImageResource(R.drawable.vec_ic_calls_tab_joinable_badge);
                    }
                }
                AnonymousClass0BQ r02 = this.A00;
                if (r02 != null) {
                    r02.start();
                }
            }
        } else if (AnonymousClass00C.A0J(r8, C177248dU.A00)) {
            A03(item, r2, (C1899796i) null);
        }
    }

    public static final AnonymousClass08H A01(Context context, MenuItem menuItem, AnonymousClass07V r9) {
        int itemId = menuItem.getItemId();
        C016807f r3 = r9.A04;
        if (itemId != -1) {
            SparseArray sparseArray = r3.A0N;
            AnonymousClass08H r4 = (AnonymousClass08H) sparseArray.get(itemId);
            if (r4 == null) {
                r4 = new AnonymousClass08H(r3.getContext(), (C08800bL) null);
                sparseArray.put(itemId, r4);
            }
            if (itemId != -1) {
                AnonymousClass081[] r5 = r3.A0J;
                if (r5 != null) {
                    int length = r5.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        AnonymousClass081 r1 = r5[i];
                        if (r1.getId() == itemId) {
                            r1.setBadge(r4);
                            break;
                        }
                        i++;
                    }
                }
                int A002 = AnonymousClass00F.A00(context, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
                C07190Wr r12 = r4.A08;
                C08800bL r32 = r12.A04;
                Integer valueOf = Integer.valueOf(A002);
                r32.A0A = valueOf;
                C08800bL r2 = r12.A03;
                r2.A0A = valueOf;
                AnonymousClass08H.A01(r4);
                if (r2.A0B.intValue() != 8388661) {
                    r32.A0B = 8388661;
                    r2.A0B = 8388661;
                    AnonymousClass08H.A02(r4);
                }
                return r4;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(itemId);
            sb.append(" is not a valid view id");
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(itemId);
        sb2.append(" is not a valid view id");
        throw new IllegalArgumentException(sb2.toString());
    }
}
