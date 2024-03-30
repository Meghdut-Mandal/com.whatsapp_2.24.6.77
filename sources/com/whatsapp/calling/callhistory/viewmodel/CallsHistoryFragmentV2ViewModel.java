package com.whatsapp.calling.callhistory.viewmodel;

import X.AnonymousClass04R;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass1C6;
import X.AnonymousClass1EL;
import X.AnonymousClass1HJ;
import X.AnonymousClass2RE;
import X.AnonymousClass3KV;
import X.AnonymousClass3UM;
import X.AnonymousClass3UY;
import X.AnonymousClass4WO;
import X.AnonymousClass5MP;
import X.AnonymousClass5MS;
import X.AnonymousClass681;
import X.AnonymousClass6SZ;
import X.AnonymousClass72P;
import X.C001700s;
import X.C106965Ma;
import X.C106975Mb;
import X.C106995Md;
import X.C107015Mf;
import X.C107165Mu;
import X.C124655ya;
import X.C143936rM;
import X.C18740tg;
import X.C18820ts;
import X.C19730wQ;
import X.C19770wU;
import X.C19930wk;
import X.C19970wo;
import X.C20040wv;
import X.C20350xQ;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C21100yf;
import X.C220412q;
import X.C222813r;
import X.C229216m;
import X.C26211Jh;
import X.C26621Kw;
import X.C27281Np;
import X.C30541aN;
import X.C34621hN;
import X.C34631hO;
import X.C34681hT;
import X.C34691hU;
import X.C34701hV;
import X.C34711hW;
import X.C34731hY;
import X.C34751ha;
import X.C34761hb;
import X.C34771hc;
import X.C34781hd;
import X.C34791he;
import X.C34801hf;
import X.C34811hg;
import X.C34821hh;
import X.C34831hi;
import X.C34841hj;
import X.C34851hk;
import X.C34861hl;
import X.C47842fr;
import X.C47862ft;
import X.C52312pE;
import X.C61243Bc;
import X.C63243Jh;
import X.C69673du;
import X.C69683dv;
import X.C69693dw;
import X.C69703dx;
import X.C69713dy;
import X.C69723dz;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;

public class CallsHistoryFragmentV2ViewModel extends AnonymousClass04R {
    public int A00;
    public C34851hk A01;
    public C69673du A02;
    public C69683dv A03;
    public C143936rM A04;
    public C106965Ma A05;
    public C106995Md A06;
    public AnonymousClass5MS A07;
    public C107165Mu A08;
    public C106975Mb A09;
    public AnonymousClass5MP A0A;
    public C19930wk A0B;
    public ArrayList A0C;
    public ArrayList A0D;
    public ArrayList A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final C001700s A0K = new C001700s();
    public final C21100yf A0L;
    public final C34621hN A0M;
    public final C34801hf A0N = new C34801hf(this);
    public final C34771hc A0O = new C34771hc(this);
    public final C34811hg A0P = new C34811hg(this);
    public final C34761hb A0Q = new C34761hb(this);
    public final C34781hd A0R = new C34781hd(this);
    public final C34791he A0S = new C34791he(this);
    public final C34821hh A0T = new C34821hh(this);
    public final C34691hU A0U;
    public final C34631hO A0V;
    public final C229216m A0W;
    public final AnonymousClass16D A0X;
    public final AnonymousClass171 A0Y;
    public final C19970wo A0Z;
    public final C18820ts A0a;
    public final AnonymousClass1HJ A0b;
    public final C220412q A0c;
    public final AnonymousClass17X A0d;
    public final C26211Jh A0e;
    public final C20810yC A0f;
    public final C20350xQ A0g;
    public final AnonymousClass1C6 A0h;
    public final C34831hi A0i;
    public final AnonymousClass13J A0j;
    public final ArrayList A0k;
    public final HashMap A0l;
    public final LinkedHashMap A0m;
    public final Lock A0n;
    public final C19730wQ A0o;
    public final C34751ha A0p;
    public final C30541aN A0q;
    public final C34731hY A0r;
    public final C34701hV A0s;
    public final C34711hW A0t;
    public final C27281Np A0u;
    public final AnonymousClass1EL A0v;
    public final C19770wU A0w;
    public final boolean A0x;

    public AnonymousClass681 A0V(AnonymousClass3KV r14, int i, long j) {
        C61243Bc r10;
        int i2 = R.color.f6nameremoved;
        int i3 = 0;
        if (i == 1) {
            i3 = R.drawable.joinable_call_log_button_background;
            i2 = R.color.f6nameremoved;
        }
        int i4 = r14.A00;
        boolean z = false;
        int i5 = R.drawable.ic_action_call;
        int i6 = R.string.f12nameremoved;
        if (i4 == 2) {
            z = true;
            i5 = R.drawable.ic_action_videocall;
            i6 = R.string.f12nameremoved;
        }
        int i7 = R.color.f6nameremoved;
        if (i != 2) {
            i7 = R.color.f6nameremoved;
            if (i == 0) {
                C18820ts r9 = this.A0a;
                long j2 = r14.A03;
                r10 = new C47862ft(new Object[]{C20040wv.A04(r9, j2), AnonymousClass3UM.A00(r9, j2)}, R.string.f12nameremoved);
                StringBuilder sb = new StringBuilder();
                sb.append(CallsHistoryFragmentV2.class.getName());
                sb.append(r14.A04.getRawString());
                sb.append(" ");
                sb.append(r14.A01);
                String obj = sb.toString();
                C124655ya r8 = new C124655ya();
                r8.A00 = i7;
                r8.A01 = i;
                r8.A06 = r10;
                String A002 = r14.A00();
                r8.A07 = A002;
                r8.A02 = i3;
                r8.A03 = i6;
                r8.A04 = i5;
                r8.A05 = i2;
                r8.A08 = obj;
                r8.A09 = z;
                AnonymousClass681 r1 = new AnonymousClass681();
                r1.A00 = r8.A00;
                r1.A01 = r8.A01;
                r1.A06 = r8.A06;
                r1.A07 = A002;
                r1.A02 = i3;
                r1.A03 = i6;
                r1.A04 = i5;
                r1.A05 = i2;
                r1.A08 = obj;
                r1.A09 = z;
                return r1;
            }
        }
        r10 = new C47842fr(AnonymousClass3UY.A0B(this.A0a, j));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CallsHistoryFragmentV2.class.getName());
        sb2.append(r14.A04.getRawString());
        sb2.append(" ");
        sb2.append(r14.A01);
        String obj2 = sb2.toString();
        C124655ya r82 = new C124655ya();
        r82.A00 = i7;
        r82.A01 = i;
        r82.A06 = r10;
        String A0022 = r14.A00();
        r82.A07 = A0022;
        r82.A02 = i3;
        r82.A03 = i6;
        r82.A04 = i5;
        r82.A05 = i2;
        r82.A08 = obj2;
        r82.A09 = z;
        AnonymousClass681 r12 = new AnonymousClass681();
        r12.A00 = r82.A00;
        r12.A01 = r82.A01;
        r12.A06 = r82.A06;
        r12.A07 = A0022;
        r12.A02 = i3;
        r12.A03 = i6;
        r12.A04 = i5;
        r12.A05 = i2;
        r12.A08 = obj2;
        r12.A09 = z;
        return r12;
    }

    public static String A02(AnonymousClass141 r3) {
        if (r3 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(CallsHistoryFragmentV2.class.getName());
        sb.append(AnonymousClass143.A03(r3.A0H));
        sb.append(" ");
        sb.append(r3.A0C);
        return sb.toString();
    }

    public static void A03(CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel) {
        ArrayList arrayList;
        Object obj;
        List list;
        ArrayList arrayList2;
        Object r1;
        if (C34681hT.A0H(callsHistoryFragmentV2ViewModel.A0f)) {
            callsHistoryFragmentV2ViewModel.A0C.add(new C34861hl((int) R.string.f12nameremoved));
            List list2 = callsHistoryFragmentV2ViewModel.A0F;
            if (list2 == null || list2.isEmpty()) {
                arrayList = callsHistoryFragmentV2ViewModel.A0C;
                obj = C69713dy.A00;
            } else {
                int min = Math.min(callsHistoryFragmentV2ViewModel.A0F.size(), 3);
                int i = 0;
                while (true) {
                    list = callsHistoryFragmentV2ViewModel.A0F;
                    if (i >= min) {
                        break;
                    }
                    C63243Jh r2 = (C63243Jh) list.get(i);
                    C52312pE r12 = r2.A02;
                    if (r12 == C52312pE.ONE_TO_ONE) {
                        AnonymousClass11F r13 = r2.A03;
                        C222813r r0 = UserJid.Companion;
                        UserJid A002 = C222813r.A00(r13);
                        if (A002 != null) {
                            arrayList2 = callsHistoryFragmentV2ViewModel.A0C;
                            r1 = new C69693dw(A002, -1, (List) null);
                        } else {
                            i++;
                        }
                    } else {
                        if (r12 == C52312pE.GROUP) {
                            AnonymousClass11F r14 = r2.A03;
                            AnonymousClass6SZ r02 = GroupJid.Companion;
                            GroupJid A003 = AnonymousClass6SZ.A00(r14);
                            if (A003 != null) {
                                arrayList2 = callsHistoryFragmentV2ViewModel.A0C;
                                r1 = new C69703dx(A003, (List) null, -1);
                            }
                        }
                        i++;
                    }
                    arrayList2.add(r1);
                    i++;
                }
                if (list.size() > 3) {
                    arrayList = callsHistoryFragmentV2ViewModel.A0C;
                    obj = C69723dz.A00;
                } else {
                    return;
                }
            }
            arrayList.add(obj);
        }
    }

    public static void A04(CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel) {
        int i;
        if (C34681hT.A0M(callsHistoryFragmentV2ViewModel.A0f) && (i = callsHistoryFragmentV2ViewModel.A00) > 0) {
            C18820ts r0 = callsHistoryFragmentV2ViewModel.A0a;
            String A062 = C26621Kw.A06(C18820ts.A01(r0.A00), String.valueOf(i));
            ArrayList arrayList = callsHistoryFragmentV2ViewModel.A0C;
            arrayList.add(new C34861hl(A062));
            C143936rM r6 = callsHistoryFragmentV2ViewModel.A04;
            if (r6 != null && r6.A00 < System.currentTimeMillis() + 604800000) {
                arrayList.add(r6);
            }
        }
    }

    public static void A05(CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel) {
        C34821hh r1 = callsHistoryFragmentV2ViewModel.A0T;
        if (!TextUtils.isEmpty(r1.A01)) {
            r1.filter(r1.A01);
            callsHistoryFragmentV2ViewModel.A0W();
            return;
        }
        new AnonymousClass4WO(callsHistoryFragmentV2ViewModel, 4).A02.executeOnExecutor(callsHistoryFragmentV2ViewModel.A0B, new Void[0]);
    }

    public static void A06(CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel, AnonymousClass3KV r9) {
        C143936rM r0;
        if (r9 == null) {
            r0 = null;
        } else {
            r0 = new C143936rM((AnonymousClass72P) null, callsHistoryFragmentV2ViewModel.A0V(r9, 0, 0), r9.A04, r9.A03, r9.A02);
        }
        callsHistoryFragmentV2ViewModel.A04 = r0;
    }

    public static void A07(CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        callsHistoryFragmentV2ViewModel.A0C = new ArrayList();
        C34851hk r3 = callsHistoryFragmentV2ViewModel.A01;
        if (r3 != null) {
            if (C20800yB.A00(C21000yV.A02, callsHistoryFragmentV2ViewModel.A0f, 4708) != 2) {
                callsHistoryFragmentV2ViewModel.A0C.add(r3);
            }
        }
        C69673du r1 = callsHistoryFragmentV2ViewModel.A02;
        if (r1 != null) {
            callsHistoryFragmentV2ViewModel.A0C.add(r1);
        }
        if (arrayList.size() > 0) {
            callsHistoryFragmentV2ViewModel.A0C.add(callsHistoryFragmentV2ViewModel.A0l.get(0));
            callsHistoryFragmentV2ViewModel.A0C.addAll(arrayList);
        }
        A04(callsHistoryFragmentV2ViewModel);
        A03(callsHistoryFragmentV2ViewModel);
        if (linkedHashMap.size() > 0) {
            callsHistoryFragmentV2ViewModel.A0C.add(callsHistoryFragmentV2ViewModel.A0l.get(1));
            callsHistoryFragmentV2ViewModel.A0C.addAll(linkedHashMap.values());
        }
        if (callsHistoryFragmentV2ViewModel.A0J && (!callsHistoryFragmentV2ViewModel.A0m.isEmpty() || !callsHistoryFragmentV2ViewModel.A0k.isEmpty())) {
            C69683dv r12 = callsHistoryFragmentV2ViewModel.A03;
            if (r12 == null) {
                r12 = new C69683dv();
                callsHistoryFragmentV2ViewModel.A03 = r12;
            }
            callsHistoryFragmentV2ViewModel.A0C.add(r12);
        }
        callsHistoryFragmentV2ViewModel.A0i.A0D(callsHistoryFragmentV2ViewModel.A0C);
    }

    public void A0R() {
        C34621hN r2 = this.A0M;
        r2.A0W.unregisterObserver(r2.A0V);
        r2.A0U.unregisterObserver(r2.A0T);
        r2.A0F.unregisterObserver(r2.A0E);
        C107015Mf r1 = r2.A03;
        if (r1 != null) {
            r1.A0D(true);
        }
        if (C34681hT.A0M(r2.A0L)) {
            r2.A0Q.unregisterObserver(r2.A0P);
            r2.A0O.unregisterObserver(r2.A0N);
        }
        r2.A07 = null;
        C20810yC r22 = this.A0f;
        if (C20800yB.A01(C21000yV.A01, r22, 3637)) {
            this.A0u.unregisterObserver(this.A0t);
        }
        if (C34681hT.A0H(r22)) {
            this.A0s.unregisterObserver(this.A0r);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r16.A0G() == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d0, code lost:
        if (r2 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        r3 = r4.A0x;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C195459Uj A0T(X.AnonymousClass72P r18, X.AnonymousClass141 r19, java.lang.String r20) {
        /*
            r17 = this;
            r2 = r18
            java.util.ArrayList r0 = r2.A03
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r9 = 0
            java.lang.Object r8 = r0.get(r9)
            X.C18740tg.A06(r8)
            X.5Nh r8 = (X.C107265Nh) r8
            r7 = 1
            r16 = r19
            if (r19 == 0) goto L_0x001e
            boolean r1 = r16.A0G()
            r0 = 1
            if (r1 != 0) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4 = r17
            if (r0 == 0) goto L_0x0031
            boolean r3 = r4.A0x
            if (r3 == 0) goto L_0x00a7
        L_0x0031:
            boolean r3 = r4.A0x
            X.0wQ r10 = r4.A0o
            java.util.ArrayList r0 = X.C65473Sf.A01(r8)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r12 = r0.iterator()
        L_0x0042:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r11 = r12.next()
            X.5Nf r11 = (X.C107255Nf) r11
            if (r3 != 0) goto L_0x0058
            com.whatsapp.jid.UserJid r0 = r11.A00
            boolean r0 = r10.A0M(r0)
            if (r0 == 0) goto L_0x005d
        L_0x0058:
            int r1 = r11.A01
            r0 = 5
            if (r1 != r0) goto L_0x0042
        L_0x005d:
            com.whatsapp.jid.UserJid r0 = r11.A00
            r5.add(r0)
            goto L_0x0042
        L_0x0063:
            r11 = 0
        L_0x0064:
            int r13 = r5.size()
            X.0yC r14 = r4.A0f
            int r12 = r5.size()
            r1 = 3675(0xe5b, float:5.15E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r0, r14, r1)
            r0 = 8
            if (r1 == 0) goto L_0x0095
            if (r12 <= r0) goto L_0x007d
            r0 = 5
        L_0x007d:
            int r0 = java.lang.Math.min(r13, r0)
            if (r11 >= r0) goto L_0x0097
            X.16D r1 = r4.A0X
            java.lang.Object r0 = r5.get(r11)
            X.11F r0 = (X.AnonymousClass11F) r0
            X.141 r0 = r1.A0D(r0)
            r6.add(r0)
            int r11 = r11 + 1
            goto L_0x0064
        L_0x0095:
            r0 = 3
            goto L_0x007d
        L_0x0097:
            int r0 = r6.size()
            if (r0 != 0) goto L_0x00a7
            r10.A0G()
            X.142 r0 = r10.A0E
            if (r0 == 0) goto L_0x00a7
            r6.add(r0)
        L_0x00a7:
            boolean r2 = r2.A08()
            X.1aN r0 = r4.A0q
            com.whatsapp.voipcalling.CallInfo r10 = r0.B9F()
            if (r10 == 0) goto L_0x00c7
            com.whatsapp.voipcalling.CallState r1 = r10.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r1 != r0) goto L_0x0197
            boolean r0 = r10.isAudioChat()
            if (r0 == 0) goto L_0x0197
            X.0yC r0 = r4.A0f
            boolean r0 = X.C34681hT.A0N(r0)
            if (r0 == 0) goto L_0x0197
        L_0x00c7:
            r12 = 0
        L_0x00c8:
            int r0 = r8.A08
            r14 = 2
            if (r0 != r14) goto L_0x0188
            r15 = 2131234349(0x7f080e2d, float:1.8084861E38)
            if (r2 == 0) goto L_0x0192
        L_0x00d2:
            r1 = 2131895994(0x7f1226ba, float:1.9426837E38)
        L_0x00d5:
            if (r12 == 0) goto L_0x017e
            r0 = 2131895928(0x7f122678, float:1.9426703E38)
        L_0x00da:
            r13 = 2131101091(0x7f0605a3, float:1.7814582E38)
            r10 = r20
            if (r20 != 0) goto L_0x00e4
            r13 = 2131102523(0x7f060b3b, float:1.7817486E38)
        L_0x00e4:
            X.9ef r11 = new X.9ef
            r11.<init>()
            r11.A00 = r15
            r11.A01 = r0
            r11.A0A = r6
            r11.A02 = r1
            r11.A0C = r12
            r11.A0E = r2
            int r1 = r8.A08
            r0 = 0
            if (r1 != r14) goto L_0x00fb
            r0 = 1
        L_0x00fb:
            if (r3 == 0) goto L_0x0175
            if (r0 == 0) goto L_0x016c
            r14 = 2131890785(0x7f121261, float:1.9416272E38)
        L_0x0102:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            X.2ft r0 = new X.2ft
            r0.<init>(r1, r14)
            r11.A07 = r0
            r11.A0B = r5
            r2 = 0
            if (r3 == 0) goto L_0x016a
            int r1 = r5.size()
            int r0 = r6.size()
            if (r1 <= r0) goto L_0x016a
            java.lang.Object[] r14 = new java.lang.Object[r7]
            int r1 = r5.size()
            int r0 = r6.size()
            int r1 = r1 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r14[r9] = r0
            r1 = 2131892766(0x7f121a1e, float:1.942029E38)
            X.2ft r0 = new X.2ft
            r0.<init>(r14, r1)
        L_0x0133:
            r11.A08 = r0
            if (r3 == 0) goto L_0x0146
            r1 = 2131897132(0x7f122b2c, float:1.9429145E38)
            if (r12 == 0) goto L_0x013f
            r1 = 2131896047(0x7f1226ef, float:1.9426944E38)
        L_0x013f:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            X.2ft r2 = new X.2ft
            r2.<init>(r0, r1)
        L_0x0146:
            r11.A06 = r2
            r11.A03 = r13
            if (r3 == 0) goto L_0x0155
            int r0 = r5.size()
            if (r0 > r7) goto L_0x0154
            if (r12 != 0) goto L_0x0155
        L_0x0154:
            r9 = 1
        L_0x0155:
            r11.A0F = r9
            X.9Uj r2 = r11.A00()
            java.util.ArrayList r0 = r8.A0C()
            int r1 = r0.size()
            r0 = r16
            X.9Uj r0 = r4.A0U(r2, r0, r10, r1)
            return r0
        L_0x016a:
            r0 = r2
            goto L_0x0133
        L_0x016c:
            r14 = 2131890786(0x7f121262, float:1.9416274E38)
            if (r2 == 0) goto L_0x0102
            r14 = 2131890784(0x7f121260, float:1.941627E38)
            goto L_0x0102
        L_0x0175:
            r14 = 2131895976(0x7f1226a8, float:1.94268E38)
            if (r12 == 0) goto L_0x0102
            r14 = 2131895977(0x7f1226a9, float:1.9426802E38)
            goto L_0x0102
        L_0x017e:
            r0 = 2131895996(0x7f1226bc, float:1.942684E38)
            if (r2 == 0) goto L_0x00da
            r0 = 2131895993(0x7f1226b9, float:1.9426835E38)
            goto L_0x00da
        L_0x0188:
            r15 = 2131231779(0x7f080423, float:1.8079649E38)
            if (r2 == 0) goto L_0x0192
            r15 = 2131231867(0x7f08047b, float:1.8079827E38)
            goto L_0x00d2
        L_0x0192:
            r1 = 2131895997(0x7f1226bd, float:1.9426843E38)
            goto L_0x00d5
        L_0x0197:
            X.6by r0 = r8.A04
            java.lang.String r0 = r0.A02
            java.lang.String r1 = X.C34681hT.A08(r0)
            java.lang.String r0 = r10.callId
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c7
            com.whatsapp.voipcalling.CallState r1 = r10.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x01c1
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r1 == r0) goto L_0x01c1
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x01c1
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 == r0) goto L_0x01c1
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r1 == r0) goto L_0x01c1
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x00c7
        L_0x01c1:
            r12 = 1
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A0T(X.72P, X.141, java.lang.String):X.9Uj");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r11.A0G() == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r11.A0G() == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C195459Uj A0U(X.C195459Uj r10, X.AnonymousClass141 r11, java.lang.String r12, int r13) {
        /*
            r9 = this;
            X.9ef r2 = new X.9ef
            r2.<init>(r10)
            if (r11 == 0) goto L_0x000e
            boolean r1 = r11.A0G()
            r0 = 1
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r2.A0D = r0
            boolean r8 = r9.A0x
            java.util.List r7 = r10.A0B
            X.16D r6 = r9.A0X
            X.171 r4 = r9.A0Y
            r5 = 1
            r3 = 0
            if (r11 == 0) goto L_0x0024
            boolean r1 = r11.A0G()
            r0 = 1
            if (r1 != 0) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r12 == 0) goto L_0x0054
            X.2fr r3 = new X.2fr
            r3.<init>(r12)
        L_0x002c:
            X.C18740tg.A06(r3)
            r2.A05 = r3
            if (r11 == 0) goto L_0x0052
            boolean r0 = r11.A0G()
            if (r0 == 0) goto L_0x0052
            if (r12 == 0) goto L_0x0052
            r0 = -1
            java.lang.String r0 = r4.A0Q(r11, r0)
            X.2fr r1 = new X.2fr
            r1.<init>(r0)
        L_0x0045:
            r2.A04 = r1
            java.lang.String r0 = A02(r11)
            r2.A09 = r0
            X.9Uj r0 = r2.A00()
            return r0
        L_0x0052:
            r1 = 0
            goto L_0x0045
        L_0x0054:
            if (r8 == 0) goto L_0x0071
            if (r11 == 0) goto L_0x0071
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = r4.A0H(r11)
        L_0x005e:
            X.2fr r3 = new X.2fr
            r3.<init>(r0)
            goto L_0x002c
        L_0x0064:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = -1
            java.lang.String r0 = r4.A0Q(r11, r0)
            r1[r3] = r0
            r0 = 2131890783(0x7f12125f, float:1.9416268E38)
            goto L_0x0078
        L_0x0071:
            if (r13 != 0) goto L_0x007e
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = 2131895999(0x7f1226bf, float:1.9426847E38)
        L_0x0078:
            X.2ft r3 = new X.2ft
            r3.<init>(r1, r0)
            goto L_0x002c
        L_0x007e:
            if (r0 == 0) goto L_0x008a
            if (r11 == 0) goto L_0x008a
            r0 = -1
            java.lang.String r0 = r4.A0Q(r11, r0)
            if (r0 == 0) goto L_0x008a
            goto L_0x005e
        L_0x008a:
            r0 = 3
            X.3Bc r3 = X.AnonymousClass3UD.A04(r6, r4, r7, r0, r3)
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A0U(X.9Uj, X.141, java.lang.String, int):X.9Uj");
    }

    public void A0W() {
        if (this.A0G) {
            this.A0w.Box(new AnonymousClass4WO(this, 3), new Void[0]);
        }
    }

    public void A0X(C34841hj r7) {
        if (!TextUtils.isEmpty(this.A0T.A01)) {
            int BH3 = r7.BH3();
            boolean z = false;
            if (BH3 >= 0) {
                z = true;
            }
            C18740tg.A0D(z, "search result is -1");
            C34691hU r5 = this.A0U;
            long j = (long) BH3;
            Integer A012 = A01(r7);
            if (r5.A00 == null) {
                C18740tg.A0D(false, "sessionId is null");
                return;
            }
            AnonymousClass2RE A002 = C34691hU.A00(r5);
            A002.A02 = A012;
            A002.A04 = Long.valueOf(j);
            A002.A01 = 0;
            A002.A03 = 4;
            r5.A02.Bly(A002);
        }
    }

    public void A0Y(C34841hj r7, boolean z) {
        if (!TextUtils.isEmpty(this.A0T.A01)) {
            int BH3 = r7.BH3();
            boolean z2 = false;
            if (BH3 >= 0) {
                z2 = true;
            }
            C18740tg.A0D(z2, "search result is -1");
            C34691hU r5 = this.A0U;
            long j = (long) BH3;
            Integer A012 = A01(r7);
            if (r5.A00 == null) {
                C18740tg.A0D(false, "sessionId is null");
                return;
            }
            AnonymousClass2RE A002 = C34691hU.A00(r5);
            A002.A02 = A012;
            A002.A04 = Long.valueOf(j);
            A002.A01 = 0;
            A002.A03 = 2;
            A002.A00 = Integer.valueOf(z ? 1 : 0);
            r5.A02.Bly(A002);
        }
    }

    public void A0Z(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        C34821hh r1 = this.A0T;
        if (!TextUtils.isEmpty(r1.A01)) {
            r1.filter(r1.A01);
        } else {
            A07(this, arrayList, linkedHashMap);
        }
        A0W();
    }

    public boolean A0a() {
        List list = this.A0F;
        if ((list == null || list.isEmpty()) && !this.A0C.isEmpty() && this.A0M.A04 == null) {
            if (C20800yB.A00(C21000yV.A02, this.A0f, 4708) != 2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static Integer A01(C34841hj r3) {
        int BD8 = r3.BD8();
        if (BD8 == 1) {
            return 0;
        }
        if (BD8 == 2 || BD8 == 3 || BD8 == 4 || BD8 == 7) {
            return 2;
        }
        if (BD8 == 8) {
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown itemType: ");
        sb.append(BD8);
        C18740tg.A0D(false, sb.toString());
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x020b, code lost:
        if (r0 == false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0217, code lost:
        if (r0 == false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0238, code lost:
        if (r0 == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r15 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        if (r0 == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0101, code lost:
        if (r10 == 5) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0131, code lost:
        if (r13.A0v.A01(r15) == false) goto L_0x0133;
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass689 A0S(X.AnonymousClass72P r14, X.AnonymousClass141 r15) {
        /*
            r13 = this;
            X.141 r1 = r14.A02()
            X.C18740tg.A06(r1)
            java.util.ArrayList r10 = r14.A03
            java.util.List r0 = java.util.Collections.unmodifiableList(r10)
            r8 = 0
            java.lang.Object r7 = r0.get(r8)
            X.C18740tg.A06(r7)
            X.5Nh r7 = (X.C107265Nh) r7
            boolean r0 = r14.A04()
            if (r0 == 0) goto L_0x0020
            r6 = 1
            if (r15 == 0) goto L_0x0021
        L_0x0020:
            r6 = 0
        L_0x0021:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3 = 0
            if (r6 == 0) goto L_0x0078
            X.0wQ r9 = r13.A0o
            java.util.ArrayList r0 = X.C65473Sf.A01(r7)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x003c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r2.next()
            X.5Nf r0 = (X.C107255Nf) r0
            com.whatsapp.jid.UserJid r1 = r0.A00
            boolean r0 = r9.A0M(r1)
            if (r0 != 0) goto L_0x003c
            r4.add(r1)
            goto L_0x003c
        L_0x0054:
            r2 = 0
        L_0x0055:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x0082
            X.16D r1 = r13.A0X
            java.lang.Object r0 = r4.get(r2)
            X.11F r0 = (X.AnonymousClass11F) r0
            X.141 r0 = r1.A08(r0)
            r1 = 3
            if (r0 == 0) goto L_0x006f
            if (r2 >= r1) goto L_0x006f
            r5.add(r0)
        L_0x006f:
            int r0 = r5.size()
            if (r0 >= r1) goto L_0x0082
            int r2 = r2 + 1
            goto L_0x0055
        L_0x0078:
            if (r15 == 0) goto L_0x0081
            boolean r0 = r14.A04()
            if (r0 == 0) goto L_0x0081
            r1 = r15
        L_0x0081:
            r3 = r1
        L_0x0082:
            X.16D r2 = r13.A0X
            X.171 r1 = r13.A0Y
            if (r3 != 0) goto L_0x028d
            r0 = 3
            X.3Bc r9 = X.AnonymousClass3UD.A04(r2, r1, r4, r0, r8)
            X.C18740tg.A06(r9)
        L_0x0090:
            java.lang.String r11 = A02(r15)
            if (r15 == 0) goto L_0x00c7
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00c7
            java.lang.Object r0 = r10.get(r8)
            X.5Nh r0 = (X.C107265Nh) r0
            com.whatsapp.jid.GroupJid r0 = r0.A0D
            if (r0 == 0) goto L_0x00c7
            boolean r0 = r14.A08()
            if (r0 != 0) goto L_0x00c7
            X.11F r12 = r15.A0H
            boolean r0 = r12 instanceof X.AnonymousClass147
            if (r0 == 0) goto L_0x00c7
            X.0yC r2 = r13.A0f
            X.0wQ r1 = r13.A0o
            X.17X r0 = r13.A0d
            X.144 r12 = (X.AnonymousClass144) r12
            X.17r r0 = r0.A07
            int r0 = r0.A0B(r12)
            boolean r0 = X.C34681hT.A0C(r1, r2, r0)
            r2 = 1
            if (r0 != 0) goto L_0x00c8
        L_0x00c7:
            r2 = 0
        L_0x00c8:
            X.3BN r1 = new X.3BN
            r1.<init>()
            int r0 = r10.size()
            r1.A00 = r0
            r0 = 2131887319(0x7f1204d7, float:1.9409242E38)
            r1.A01 = r0
            int r10 = r14.A00()
            if (r10 == 0) goto L_0x027f
            r0 = 1
            if (r10 == r0) goto L_0x0271
            r0 = 2
            if (r10 == r0) goto L_0x0263
            r0 = 4
            if (r10 == r0) goto L_0x0255
            r0 = 5
            if (r10 == r0) goto L_0x0247
            r10 = 0
        L_0x00eb:
            r1.A02 = r10
            int r10 = r14.A00()
            r12 = 2131234032(0x7f080cf0, float:1.8084218E38)
            if (r10 == 0) goto L_0x0106
            r0 = 1
            if (r10 == r0) goto L_0x0242
            r0 = 2
            if (r10 == r0) goto L_0x0242
            r0 = 4
            if (r10 == r0) goto L_0x0103
            r0 = 5
            r12 = 0
            if (r10 != r0) goto L_0x0106
        L_0x0103:
            r12 = 2131234304(0x7f080e00, float:1.808477E38)
        L_0x0106:
            r1.A03 = r12
            int r0 = X.AnonymousClass3UE.A02(r7)
            r1.A04 = r0
            int r10 = r7.A07
            r0 = 5
            if (r10 == r0) goto L_0x011d
            X.6by r0 = r7.A04
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x023d
            X.3Ir r0 = r7.A0C
            if (r0 != 0) goto L_0x023d
        L_0x011d:
            r0 = 2131101134(0x7f0605ce, float:1.781467E38)
        L_0x0120:
            r1.A05 = r0
            r1.A0A = r3
            r1.A0E = r5
            r1.A0B = r9
            if (r15 == 0) goto L_0x0133
            X.1EL r0 = r13.A0v
            boolean r3 = r0.A01(r15)
            r0 = 0
            if (r3 != 0) goto L_0x0134
        L_0x0133:
            r0 = 1
        L_0x0134:
            r1.A0G = r0
            boolean r0 = r14.A08()
            if (r0 == 0) goto L_0x013d
            r8 = 1
        L_0x013d:
            r1.A0I = r8
            r1.A0F = r4
            r1.A0H = r6
            X.0yC r4 = r13.A0f
            boolean r0 = X.C34681hT.A0I(r4)
            if (r0 != 0) goto L_0x023a
            boolean r0 = r14.A05()
            if (r0 == 0) goto L_0x021c
            r3 = 2131887478(0x7f120576, float:1.9409564E38)
        L_0x0154:
            r1.A08 = r3
            boolean r0 = X.C34681hT.A0I(r4)
            if (r0 == 0) goto L_0x0219
            boolean r0 = r14.A05()
            if (r0 != 0) goto L_0x0172
            boolean r0 = r14.A07()
            if (r0 == 0) goto L_0x0210
            r3 = 6307(0x18a3, float:8.838E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r4, r3)
            if (r0 == 0) goto L_0x0210
        L_0x0172:
            r3 = 2131234211(0x7f080da3, float:1.8084581E38)
        L_0x0175:
            r1.A07 = r3
            boolean r0 = X.C34681hT.A0I(r4)
            if (r0 == 0) goto L_0x020d
            boolean r0 = r14.A05()
            if (r0 == 0) goto L_0x01f0
            r3 = 2131887479(0x7f120577, float:1.9409566E38)
        L_0x0186:
            r1.A06 = r3
            r1.A0D = r11
            long r3 = r14.A01()
            r1.A09 = r3
            X.0ts r0 = r13.A0a
            long r3 = r14.A01()
            java.lang.String r4 = X.AnonymousClass3UY.A0B(r0, r3)
            r1.A0C = r4
            r1.A0J = r2
            X.689 r3 = new X.689
            r3.<init>()
            int r0 = r1.A00
            r3.A00 = r0
            int r0 = r1.A01
            r3.A01 = r0
            int r0 = r1.A02
            r3.A02 = r0
            int r0 = r1.A03
            r3.A03 = r0
            int r0 = r1.A04
            r3.A04 = r0
            X.141 r0 = r1.A0A
            r3.A0A = r0
            java.util.List r0 = r1.A0E
            r3.A0E = r0
            int r0 = r1.A05
            r3.A05 = r0
            X.3Bc r0 = r1.A0B
            r3.A0B = r0
            boolean r0 = r1.A0G
            r3.A0G = r0
            boolean r0 = r1.A0I
            r3.A0I = r0
            java.util.List r0 = r1.A0F
            r3.A0F = r0
            boolean r0 = r1.A0H
            r3.A0H = r0
            int r0 = r1.A08
            r3.A08 = r0
            int r0 = r1.A07
            r3.A07 = r0
            int r0 = r1.A06
            r3.A06 = r0
            java.lang.String r0 = r1.A0D
            r3.A0D = r0
            long r0 = r1.A09
            r3.A09 = r0
            r3.A0C = r4
            r3.A0J = r2
            return r3
        L_0x01f0:
            boolean r0 = r14.A07()
            if (r0 == 0) goto L_0x0204
            r3 = 6307(0x18a3, float:8.838E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r4, r3)
            if (r0 == 0) goto L_0x0204
            r3 = 2131887475(0x7f120573, float:1.9409558E38)
            goto L_0x0186
        L_0x0204:
            boolean r0 = r14.A06()
            r3 = 2131887477(0x7f120575, float:1.9409562E38)
            if (r0 != 0) goto L_0x0186
        L_0x020d:
            r3 = 0
            goto L_0x0186
        L_0x0210:
            boolean r0 = r14.A06()
            r3 = 2131234104(0x7f080d38, float:1.8084364E38)
            if (r0 != 0) goto L_0x0175
        L_0x0219:
            r3 = 0
            goto L_0x0175
        L_0x021c:
            boolean r0 = r14.A07()
            if (r0 == 0) goto L_0x0231
            r3 = 6307(0x18a3, float:8.838E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r4, r3)
            if (r0 == 0) goto L_0x0231
            r3 = 2131887474(0x7f120572, float:1.9409556E38)
            goto L_0x0154
        L_0x0231:
            boolean r0 = r14.A06()
            r3 = 2131887476(0x7f120574, float:1.940956E38)
            if (r0 != 0) goto L_0x0154
        L_0x023a:
            r3 = 0
            goto L_0x0154
        L_0x023d:
            r0 = 2131102509(0x7f060b2d, float:1.7817458E38)
            goto L_0x0120
        L_0x0242:
            r12 = 2131234028(0x7f080cec, float:1.808421E38)
            goto L_0x0106
        L_0x0247:
            boolean r0 = r14.A08()
            r10 = 2131887344(0x7f1204f0, float:1.9409292E38)
            if (r0 == 0) goto L_0x00eb
            r10 = 2131887342(0x7f1204ee, float:1.9409288E38)
            goto L_0x00eb
        L_0x0255:
            boolean r0 = r14.A08()
            r10 = 2131887343(0x7f1204ef, float:1.940929E38)
            if (r0 == 0) goto L_0x00eb
            r10 = 2131887341(0x7f1204ed, float:1.9409286E38)
            goto L_0x00eb
        L_0x0263:
            boolean r0 = r14.A08()
            r10 = 2131891106(0x7f1213a2, float:1.9416923E38)
            if (r0 == 0) goto L_0x00eb
            r10 = 2131891105(0x7f1213a1, float:1.941692E38)
            goto L_0x00eb
        L_0x0271:
            boolean r0 = r14.A08()
            r10 = 2131890457(0x7f121119, float:1.9415606E38)
            if (r0 == 0) goto L_0x00eb
            r10 = 2131890455(0x7f121117, float:1.9415602E38)
            goto L_0x00eb
        L_0x027f:
            boolean r0 = r14.A08()
            r10 = 2131892006(0x7f121726, float:1.9418748E38)
            if (r0 == 0) goto L_0x00eb
            r10 = 2131892005(0x7f121725, float:1.9418746E38)
            goto L_0x00eb
        L_0x028d:
            r0 = -1
            X.34G r0 = r1.A0C(r3, r0)
            java.lang.String r0 = r0.A01
            X.2fr r9 = new X.2fr
            r9.<init>(r0)
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.A0S(X.72P, X.141):X.689");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: X.1hk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.3du} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.1hk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: X.1hk} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CallsHistoryFragmentV2ViewModel(X.C19730wQ r13, X.C21100yf r14, X.C34621hN r15, X.C34691hU r16, X.C34631hO r17, X.C30541aN r18, X.C229216m r19, X.AnonymousClass16D r20, X.AnonymousClass171 r21, X.C19970wo r22, X.C18820ts r23, X.AnonymousClass1HJ r24, X.C220412q r25, X.AnonymousClass17X r26, X.C26211Jh r27, X.C34701hV r28, X.C20810yC r29, X.C20350xQ r30, X.C27281Np r31, X.AnonymousClass1EL r32, X.AnonymousClass1C6 r33, X.AnonymousClass13J r34, X.C19770wU r35) {
        /*
            r12 = this;
            r12.<init>()
            X.1hX r9 = new X.1hX
            r9.<init>(r12)
            r12.A0t = r9
            X.1hZ r8 = new X.1hZ
            r8.<init>(r12)
            r12.A0r = r8
            X.1ha r7 = new X.1ha
            r7.<init>(r12)
            r12.A0p = r7
            X.1hb r0 = new X.1hb
            r0.<init>(r12)
            r12.A0Q = r0
            X.1hc r0 = new X.1hc
            r0.<init>(r12)
            r12.A0O = r0
            X.1hd r0 = new X.1hd
            r0.<init>(r12)
            r12.A0R = r0
            X.1he r0 = new X.1he
            r0.<init>(r12)
            r12.A0S = r0
            X.1hf r0 = new X.1hf
            r0.<init>(r12)
            r12.A0N = r0
            X.1hg r0 = new X.1hg
            r0.<init>(r12)
            r12.A0P = r0
            X.00s r0 = new X.00s
            r0.<init>()
            r12.A0K = r0
            X.1hh r0 = new X.1hh
            r0.<init>(r12)
            r12.A0T = r0
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r12.A0l = r4
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r12.A0m = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r12.A0n = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.A0C = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.A0k = r0
            r2 = 0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.1hi r3 = new X.1hi
            r3.<init>(r0)
            r12.A0i = r3
            r0 = r22
            r12.A0Z = r0
            r6 = r29
            r12.A0f = r6
            r12.A0o = r13
            r1 = r35
            r12.A0w = r1
            r0 = r25
            r12.A0c = r0
            r12.A0L = r14
            r0 = r18
            r12.A0q = r0
            r0 = r33
            r12.A0h = r0
            r0 = r16
            r12.A0U = r0
            r0 = r20
            r12.A0X = r0
            r0 = r21
            r12.A0Y = r0
            r0 = r34
            r12.A0j = r0
            r0 = r23
            r12.A0a = r0
            r12.A0M = r15
            r0 = r30
            r12.A0g = r0
            r0 = r32
            r12.A0v = r0
            r0 = r24
            r12.A0b = r0
            r0 = r19
            r12.A0W = r0
            r0 = r27
            r12.A0e = r0
            r11 = r31
            r12.A0u = r11
            r10 = r28
            r12.A0s = r10
            r0 = r17
            r12.A0V = r0
            r0 = r26
            r12.A0d = r0
            r5 = 1
            X.0wk r0 = new X.0wk
            r0.<init>(r1, r5)
            r12.A0B = r0
            r0 = 3675(0xe5b, float:5.15E-42)
            X.0yV r1 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r1, r6, r0)
            r12.A0x = r0
            r0 = 6792(0x1a88, float:9.518E-42)
            boolean r0 = X.C20800yB.A01(r1, r6, r0)
            r0 = r0 ^ 1
            r12.A0H = r0
            r15.A07 = r7
            X.0yV r7 = X.C21000yV.A01
            r0 = 3637(0xe35, float:5.097E-42)
            boolean r0 = X.C20800yB.A01(r7, r6, r0)
            if (r0 == 0) goto L_0x0101
            r11.registerObserver(r9)
        L_0x0101:
            boolean r0 = X.C34681hT.A0H(r6)
            if (r0 == 0) goto L_0x010a
            r10.registerObserver(r8)
        L_0x010a:
            r0 = 5370(0x14fa, float:7.525E-42)
            int r0 = X.C20800yB.A00(r1, r6, r0)
            if (r0 != r5) goto L_0x0195
            X.3du r1 = new X.3du
            r1.<init>()
            r12.A02 = r1
        L_0x0119:
            java.util.ArrayList r0 = r12.A0C
            r0.add(r2, r1)
        L_0x011e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 2131887457(0x7f120561, float:1.9409522E38)
            X.1hl r0 = new X.1hl
            r0.<init>((int) r1)
            r4.put(r2, r0)
            boolean r0 = X.C34681hT.A0H(r6)
            if (r0 == 0) goto L_0x0143
            r0 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 2131887455(0x7f12055f, float:1.9409518E38)
            X.1hl r0 = new X.1hl
            r0.<init>((int) r1)
            r4.put(r2, r0)
        L_0x0143:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1 = 2131887458(0x7f120562, float:1.9409524E38)
            X.1hl r0 = new X.1hl
            r0.<init>((int) r1)
            r4.put(r2, r0)
            r0 = 3637(0xe35, float:5.097E-42)
            boolean r6 = X.C20800yB.A01(r7, r6, r0)
            r0 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 2131893874(0x7f121e72, float:1.9422537E38)
            if (r6 == 0) goto L_0x0185
            r1 = 2131887454(0x7f12055e, float:1.9409516E38)
            X.1hl r0 = new X.1hl
            r0.<init>((int) r1)
            r4.put(r2, r0)
            r0 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 2131887456(0x7f120560, float:1.940952E38)
            X.1hl r0 = new X.1hl
            r0.<init>((int) r1)
            r4.put(r2, r0)
            r0 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 2131887453(0x7f12055d, float:1.9409514E38)
        L_0x0185:
            X.1hl r0 = new X.1hl
            r0.<init>((int) r1)
            r4.put(r2, r0)
            r12.A0J = r5
            java.util.ArrayList r0 = r12.A0C
            r3.A0D(r0)
            return
        L_0x0195:
            r0 = 4708(0x1264, float:6.597E-42)
            int r1 = X.C20800yB.A00(r1, r6, r0)
            r0 = 2
            if (r1 == r0) goto L_0x011e
            X.1hk r1 = new X.1hk
            r1.<init>()
            r12.A01 = r1
            goto L_0x0119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel.<init>(X.0wQ, X.0yf, X.1hN, X.1hU, X.1hO, X.1aN, X.16m, X.16D, X.171, X.0wo, X.0ts, X.1HJ, X.12q, X.17X, X.1Jh, X.1hV, X.0yC, X.0xQ, X.1Np, X.1EL, X.1C6, X.13J, X.0wU):void");
    }
}
