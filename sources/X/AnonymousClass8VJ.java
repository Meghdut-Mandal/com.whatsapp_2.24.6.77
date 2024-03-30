package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CatalogHeader;
import com.whatsapp.biz.catalog.view.CategoryMediaCard;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.8VJ  reason: invalid class name */
public class AnonymousClass8VJ extends AnonymousClass8WR implements AnonymousClass4PF {
    public long A00 = 1;
    public String A01;
    public String A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Activity A07;
    public final AnonymousClass3DY A08;
    public final C29461Ws A09;
    public final C194299Oz A0A;
    public final C167507yA A0B;
    public final AnonymousClass1KP A0C;
    public final C88374Sl A0D;
    public final AnonymousClass16D A0E;
    public final AnonymousClass185 A0F;
    public final AnonymousClass171 A0G;
    public final C19420v0 A0H;
    public final C18820ts A0I;
    public final C20810yC A0J;
    public final AnonymousClass1CF A0K;
    public final Map A0L = AnonymousClass001.A0J();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8VJ(android.app.Activity r11, X.C24801Dv r12, X.C19730wQ r13, X.AnonymousClass3DY r14, X.C29461Ws r15, X.C202279lS r16, X.C196089Xp r17, X.C194299Oz r18, X.C167507yA r19, X.AnonymousClass1KP r20, X.C88374Sl r21, X.AnonymousClass16D r22, X.AnonymousClass185 r23, X.AnonymousClass171 r24, X.C19420v0 r25, X.C18820ts r26, X.C20810yC r27, X.AnonymousClass1CF r28, com.whatsapp.jid.UserJid r29) {
        /*
            r10 = this;
            r2 = 1
            r8 = r27
            X.AnonymousClass00C.A0D(r8, r2)
            r6 = r16
            r1 = r28
            r5 = r13
            X.C36321k7.A19(r13, r14, r6, r1)
            r9 = r29
            r7 = r17
            X.C36321k7.A13(r15, r9, r7)
            r0 = 10
            r4 = r12
            X.AnonymousClass00C.A0D(r12, r0)
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.A08 = r14
            r10.A0K = r1
            r10.A09 = r15
            r10.A07 = r11
            r0 = 1
            r10.A00 = r0
            java.util.HashMap r0 = X.AnonymousClass001.A0J()
            r10.A0L = r0
            r10.A0B(r2)
            r1 = 0
            r10.A06 = r1
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r10.A03 = r0
            r10.A05 = r1
            r10.A0J = r8
            r0 = r22
            r10.A0E = r0
            r0 = r24
            r10.A0G = r0
            r0 = r26
            r10.A0I = r0
            r0 = r23
            r10.A0F = r0
            r0 = r25
            r10.A0H = r0
            r0 = r21
            r10.A0D = r0
            r0 = r19
            r10.A0B = r0
            r0 = r18
            r10.A0A = r0
            r0 = r20
            r10.A0C = r0
            r10.A0U(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8VJ.<init>(android.app.Activity, X.1Dv, X.0wQ, X.3DY, X.1Ws, X.9lS, X.9Xp, X.9Oz, X.7yA, X.1KP, X.4Sl, X.16D, X.185, X.171, X.0v0, X.0ts, X.0yC, X.1CF, com.whatsapp.jid.UserJid):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0159, code lost:
        if (r0.A01 != false) goto L_0x015b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(com.whatsapp.jid.UserJid r14) {
        /*
            r13 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r14, r0)
            java.util.List r5 = r13.A00
            r5.clear()
            android.app.Activity r6 = r13.A07
            android.content.res.Configuration r0 = X.AnonymousClass000.A0U(r6)
            int r1 = r0.orientation
            r0 = 1
            if (r1 != r0) goto L_0x0017
            r13.A0Q()
        L_0x0017:
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x0051
            X.9Oz r3 = r13.A0A
            X.0v0 r7 = r13.A0H
            com.whatsapp.jid.UserJid r2 = r13.A06
            java.lang.String r0 = r2.getRawString()
            java.lang.String r1 = r7.A0l(r0)
            java.lang.String r0 = r13.A02
            java.lang.String r4 = r3.A00(r1, r0)
            java.lang.String r3 = r2.getRawString()
            android.content.SharedPreferences r2 = X.C36341k9.A0E(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "dc_location_name_"
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)
            java.lang.String r0 = X.C36371kC.A0t(r2, r0)
            if (r4 == 0) goto L_0x00f1
            if (r0 == 0) goto L_0x00f1
            X.8WO r1 = new X.8WO
            r1.<init>(r4, r0)
        L_0x004e:
            r5.add(r1)
        L_0x0051:
            boolean r0 = r13.A04
            if (r0 == 0) goto L_0x0067
            X.8WK r0 = new X.8WK
            r0.<init>()
            r5.add(r0)
            java.util.List r1 = r13.A03
            X.4zf r0 = new X.4zf
            r0.<init>(r1)
            r5.add(r0)
        L_0x0067:
            boolean r0 = r13.A05
            if (r0 == 0) goto L_0x0107
            X.1Ws r8 = r13.A09
            java.util.ArrayList r12 = r8.A08(r14)
            java.util.Iterator r11 = r12.iterator()
            r4 = 0
            r7 = 0
        L_0x0077:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x014b
            java.lang.Object r2 = r11.next()
            X.9Wv r2 = (X.C195929Wv) r2
            X.9Wa r0 = r2.A00
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0077
            java.util.List r3 = r2.A04
            java.util.Iterator r1 = r3.iterator()
        L_0x008f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r1.next()
            X.9up r0 = (X.C207269up) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x008f
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.lang.String r7 = r2.A03
            java.lang.String r1 = r2.A02
            X.4zg r0 = new X.4zg
            r0.<init>(r7, r1, r4)
            r9.add(r0)
            X.9Wa r2 = r2.A00
            int r1 = r2.A00
            r0 = 2
            if (r1 != r0) goto L_0x00c0
            X.8WP r0 = new X.8WP
            r0.<init>(r2, r7)
            r9.add(r0)
        L_0x00c0:
            r10 = 0
            java.util.Iterator r4 = r3.iterator()
        L_0x00c5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r3 = r4.next()
            X.9up r3 = (X.C207269up) r3
            r0 = 3
            if (r10 == r0) goto L_0x00eb
            boolean r0 = r13.A0V(r3)
            if (r0 == 0) goto L_0x00c5
            long r0 = r13.A0L(r3)
            X.8WQ r2 = new X.8WQ
            r2.<init>(r3, r0)
            r2.A02 = r7
            r9.add(r2)
            int r10 = r10 + 1
            goto L_0x00c5
        L_0x00eb:
            r5.addAll(r9)
            r4 = 1
            r7 = 1
            goto L_0x0077
        L_0x00f1:
            java.lang.String r2 = r13.A01
            if (r2 == 0) goto L_0x0051
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131893174(0x7f121bb6, float:1.9421117E38)
            java.lang.String r0 = r1.getString(r0)
            X.8WO r1 = new X.8WO
            r1.<init>(r2, r0)
            goto L_0x004e
        L_0x0107:
            r7 = 0
        L_0x0108:
            X.1Ws r0 = r13.A09
            java.util.List r4 = r0.A09(r14)
            if (r4 == 0) goto L_0x015b
            if (r7 != 0) goto L_0x0116
            boolean r0 = r13.A04
            if (r0 == 0) goto L_0x0128
        L_0x0116:
            r3 = 1
            r0 = 2131887924(0x7f120734, float:1.9410469E38)
            java.lang.String r2 = r6.getString(r0)
            java.lang.String r1 = "catalog_products_all_items_collection_id"
            X.4zg r0 = new X.4zg
            r0.<init>(r1, r2, r3)
            r5.add(r0)
        L_0x0128:
            java.util.Iterator r4 = r4.iterator()
        L_0x012c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x015b
            java.lang.Object r3 = r4.next()
            X.9up r3 = (X.C207269up) r3
            boolean r0 = r13.A0V(r3)
            if (r0 == 0) goto L_0x012c
            long r1 = r13.A0L(r3)
            X.8WQ r0 = new X.8WQ
            r0.<init>(r3, r1)
            r5.add(r0)
            goto L_0x012c
        L_0x014b:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0108
            X.9VS r0 = r8.A03(r14)
            if (r0 == 0) goto L_0x0108
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0108
        L_0x015b:
            int r1 = r13.A00()
            r0 = -1
            if (r1 != r0) goto L_0x0171
            X.8WN r0 = new X.8WN
            r0.<init>()
            r5.add(r0)
            int r0 = X.C36431kI.A07(r5)
            r13.A08(r0)
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8VJ.A0U(com.whatsapp.jid.UserJid):void");
    }

    public AnonymousClass367 B9s(int i) {
        int i2 = 0;
        String str = null;
        if (i < 0) {
            return null;
        }
        boolean z = false;
        int i3 = -1;
        int i4 = -1;
        while (true) {
            AnonymousClass9EL r1 = (AnonymousClass9EL) this.A00.get(i2);
            if (r1 instanceof C102284zg) {
                i3++;
                str = ((C102284zg) r1).A02;
                z = true;
                i4 = -1;
            }
            if (r1 instanceof AnonymousClass8WQ) {
                if (!z) {
                    return null;
                }
                i4++;
            }
            if (i2 != i) {
                i2++;
            } else if (!z) {
                return null;
            } else {
                if ("catalog_products_all_items_collection_id".equals(str)) {
                    return new AnonymousClass367((String) null, String.valueOf(i4), (String) null);
                }
                return new AnonymousClass367(String.valueOf(i3), String.valueOf(i4), str);
            }
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass0D3 A0M;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (i2 == 2) {
            UserJid userJid = this.A06;
            C19730wQ r8 = this.A03;
            C24801Dv r7 = this.A02;
            AnonymousClass16D r9 = this.A0E;
            AnonymousClass171 r11 = this.A0G;
            return new C102334zl(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved), r7, r8, r9, this.A0F, r11, userJid);
        } else if (i2 == 5) {
            Activity activity = this.A07;
            UserJid userJid2 = this.A06;
            C19730wQ r72 = this.A03;
            C18820ts r15 = this.A0I;
            C196089Xp r92 = this.A05;
            C88374Sl r14 = this.A0D;
            AnonymousClass9ED r82 = new AnonymousClass9ED(897462978);
            AnonymousClass1KP r12 = this.A0C;
            List list = AnonymousClass0D3.A0I;
            return C109925Zq.A00(activity, viewGroup2, r72, r82, r92, this, this, r12, (AnonymousClass4PG) null, r14, r15, userJid2);
        } else if (i2 == 7) {
            return new C102324zk(C36361kB.A0E(C36331k8.A09(viewGroup2), viewGroup2, R.layout.f9nameremoved), this.A02, this, this, this.A06);
        } else if (i2 != 10) {
            switch (i) {
                case 14:
                    C22919AyV ayV = (C22919AyV) this.A07;
                    List list2 = AnonymousClass0D3.A0I;
                    C36331k8.A1I(viewGroup2, ayV);
                    View inflate = C36351kA.A0C(viewGroup2).inflate(R.layout.f9nameremoved, viewGroup2, false);
                    C48732hx.A00(inflate, ayV, 40);
                    ayV.setPostcodeAndLocationViews(inflate);
                    return new AnonymousClass8WU(inflate);
                case 15:
                    C196089Xp r4 = this.A05;
                    C167507yA r3 = this.A0B;
                    List list3 = AnonymousClass0D3.A0I;
                    AnonymousClass00C.A0D(viewGroup2, 0);
                    C36321k7.A0x(r4, r3);
                    View inflate2 = C36351kA.A0C(viewGroup2).inflate(R.layout.f9nameremoved, viewGroup2, false);
                    AnonymousClass00C.A0E(inflate2, "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.CategoryMediaCard");
                    return new C102314zj(r4, (CategoryMediaCard) inflate2, r3);
                case 16:
                    C167507yA r2 = this.A0B;
                    List list4 = AnonymousClass0D3.A0I;
                    C36331k8.A1I(viewGroup2, r2);
                    return new C102304zi(C90514aH.A0Q(C36351kA.A0C(viewGroup2), viewGroup2, R.layout.f9nameremoved), r2);
                default:
                    AnonymousClass00C.A0D(viewGroup2, 0);
                    if (i2 == 1) {
                        UserJid userJid3 = this.A06;
                        A0M = new C102294zh(this.A02, this.A03, (CatalogHeader) C36331k8.A09(viewGroup2).inflate(R.layout.f9nameremoved, viewGroup2, false), userJid3);
                    } else {
                        A0M = super.A0M(viewGroup2, i2);
                    }
                    AnonymousClass00C.A0B(A0M);
                    return A0M;
            }
        } else {
            Context context = viewGroup2.getContext();
            List list5 = AnonymousClass0D3.A0I;
            AnonymousClass00C.A0D(context, 0);
            return new AnonymousClass8WS(C90514aH.A0Q(LayoutInflater.from(context), viewGroup2, R.layout.f9nameremoved));
        }
    }

    private final int A00() {
        List list = this.A00;
        if (list.size() <= 0 || !(C36401kF.A0n(list) instanceof AnonymousClass8WN)) {
            return -1;
        }
        return C36431kI.A07(list);
    }

    public final void A0Q() {
        List list = this.A00;
        if (list.size() <= 0 || !(list.get(0) instanceof AnonymousClass8WL)) {
            list.add(0, new AnonymousClass8WL());
            A08(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r0 != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R() {
        /*
            r4 = this;
            X.9lS r2 = r4.A04
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0043
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0043
            r4.A0N()
        L_0x000d:
            int r1 = r4.A00()
            r0 = -1
            if (r1 == r0) goto L_0x0040
            java.util.List r0 = r4.A00
            java.lang.Object r3 = r0.get(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.model.FooterDisplayItem"
            X.AnonymousClass00C.A0E(r3, r0)
            X.8WN r3 = (X.AnonymousClass8WN) r3
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0041
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0041
            X.1Ws r2 = r4.A09
            com.whatsapp.jid.UserJid r1 = r4.A06
            X.AnonymousClass00C.A07(r1)
            boolean r0 = r2.A0I(r1)
            if (r0 != 0) goto L_0x003d
            boolean r0 = r2.A0H(r1)
            r1 = 3
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            r1 = 1
        L_0x003e:
            r3.A00 = r1
        L_0x0040:
            return
        L_0x0041:
            r1 = 5
            goto L_0x003e
        L_0x0043:
            r4.A0O()
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8VJ.A0R():void");
    }

    public final void A0S(int i) {
        int i2;
        if (i == 404) {
            UserJid userJid = this.A06;
            AnonymousClass00C.A07(userJid);
            A0U(userJid);
            A06();
        }
        C202279lS r1 = this.A04;
        if (r1.A02 || r1.A01) {
            A0O();
        } else {
            A0N();
        }
        int A002 = A00();
        if (A002 != -1) {
            Object obj = this.A00.get(A002);
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.model.FooterDisplayItem");
            AnonymousClass8WN r3 = (AnonymousClass8WN) obj;
            if (i != -1) {
                i2 = 1;
                if (i != 404) {
                    if (i != 406) {
                        C36321k7.A1U("business-catalog-list-adapter/request-catalog/fetch-catalog-error/error: ", AnonymousClass000.A0u(), i);
                        i2 = 2;
                    } else {
                        Activity activity = this.A07;
                        C19730wQ r32 = this.A03;
                        AnonymousClass3DY r5 = this.A08;
                        AnonymousClass1CF r6 = this.A0K;
                        WeakReference weakReference = C1892392u.A00;
                        if (weakReference == null || weakReference.get() == null || !((Dialog) weakReference.get()).isShowing()) {
                            r32.A0G();
                            Me me = r32.A00;
                            C39001qm A003 = AnonymousClass3LW.A00(activity);
                            A003.A0c(R.string.f12nameremoved);
                            A003.A0r(true);
                            A003.A0h((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
                            A003.A0g(new AnonymousClass4XC(r5, r6, activity, me, 0), R.string.f12nameremoved);
                            AnonymousClass0FM create = A003.create();
                            C1892392u.A00 = AnonymousClass001.A0F(create);
                            create.show();
                        }
                        A07(A002);
                    }
                }
            } else {
                i2 = 4;
            }
            r3.A00 = i2;
            A07(A002);
        }
    }

    public void A0T(C207269up r11) {
        List list = this.A00;
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            AnonymousClass9EL r2 = (AnonymousClass9EL) list.get(i);
            if (r2 instanceof AnonymousClass8WQ) {
                AnonymousClass8WQ r22 = (AnonymousClass8WQ) r2;
                if (AnonymousClass00C.A0J(r22.A01.A0F, r11.A0F)) {
                    r22.A01 = r11;
                    r22.A00 = A0L(r11);
                    A07(i);
                    z = false;
                }
            }
        }
        if (!A0V(r11)) {
            if (!z) {
                HashSet A0k = C90524aI.A0k(C36441kJ.A15(C36411kG.A15(r11.A0F)));
                int A072 = C36431kI.A07(list);
                if (A072 >= 0) {
                    while (true) {
                        int i2 = A072 - 1;
                        AnonymousClass9EL r1 = (AnonymousClass9EL) list.get(A072);
                        if (r1 instanceof AnonymousClass8WQ) {
                            C207269up r0 = ((AnonymousClass8WQ) r1).A01;
                            AnonymousClass00C.A07(r0);
                            if (A0k.contains(r0.A0F)) {
                                list.remove(A072);
                                A09(A072);
                            }
                        }
                        if (i2 >= 0) {
                            A072 = i2;
                        } else {
                            return;
                        }
                    }
                }
            }
        } else if (z) {
            int size2 = list.size();
            int i3 = 0;
            boolean z2 = false;
            boolean z3 = false;
            for (int i4 = 0; i4 < size2; i4++) {
                AnonymousClass9EL r7 = (AnonymousClass9EL) list.get(i4);
                C36361kB.A1I(r7);
                int i5 = r7.A00;
                if (!(i5 == 16 || i5 == 15 || i5 == 1 || i5 == 14)) {
                    if (!(r7 instanceof C102284zg)) {
                        if (!(r7 instanceof AnonymousClass8WQ)) {
                            if (!(r7 instanceof AnonymousClass8WP)) {
                                break;
                            }
                        } else if (AnonymousClass14B.A0F(((AnonymousClass8WQ) r7).A02)) {
                            break;
                        }
                    } else {
                        if ("catalog_products_all_items_collection_id".equals(((C102284zg) r7).A02)) {
                            z3 = true;
                        }
                        i3++;
                        z2 = true;
                    }
                }
                i3++;
            }
            if ((!z2 || z3) && i3 != -1) {
                list.add(i3, new AnonymousClass8WQ(r11, A0L(r11)));
                A08(i3);
            }
        }
    }

    public static void A01(AnonymousClass8VJ r0, UserJid userJid) {
        r0.A0U(userJid);
        r0.A0R();
        r0.A06();
    }

    public long A0E(int i) {
        String str;
        StringBuilder sb;
        String str2;
        switch (getItemViewType(i)) {
            case 1:
                return -2;
            case 2:
                return -3;
            case 3:
                return -4;
            case 4:
                return -5;
            case 5:
                Object obj = this.A00.get(i);
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.model.ProductDisplayItem");
                AnonymousClass8WQ r2 = (AnonymousClass8WQ) obj;
                str = AnonymousClass000.A0q(r2.A01.A0F, AnonymousClass000.A0v("product_"));
                String str3 = r2.A02;
                if (str3 != null) {
                    str = AnonymousClass000.A0p("_in_collection_", str3, AnonymousClass000.A0v(str));
                    break;
                }
                break;
            case 6:
                return -6;
            case 7:
                Object obj2 = this.A00.get(i);
                AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type com.whatsapp.biz.collection.view.adapter.model.CollectionHeaderDisplayItem");
                sb = AnonymousClass000.A0u();
                sb.append("collection_");
                str2 = ((C102284zg) obj2).A02;
                break;
            case 8:
                Object obj3 = this.A00.get(i);
                AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type com.whatsapp.biz.collection.view.adapter.model.CollectionReviewStatusBannerDisplayItem");
                sb = AnonymousClass000.A0u();
                sb.append("collection_review_status_banner");
                str2 = ((AnonymousClass8WP) obj3).A01;
                break;
            case 9:
                return -7;
            case 10:
                return -8;
            case 11:
                return -10;
            case 12:
                AnonymousClass00C.A0E(this.A00.get(i), "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.model.OrderCatalogPickerDisplayItem");
                throw AnonymousClass001.A0A("orderProduct");
            case 13:
                return -9;
            case 14:
                return -11;
            case 15:
                return -12;
            case 16:
                return -13;
            default:
                return 0;
        }
        str = AnonymousClass000.A0q(str2, sb);
        Map map = this.A0L;
        if (!map.containsKey(str)) {
            long j = this.A00;
            this.A00 = 1 + j;
            map.put(str, Long.valueOf(j));
        }
        return C36431kI.A09(C000200c.A00(str, map));
    }

    public boolean A0V(C207269up r3) {
        if (!r3.A01()) {
            return false;
        }
        Integer num = this.A0B.A01;
        if (num == null || num.intValue() != 404) {
            return true;
        }
        return false;
    }
}
