package X;

import android.os.Bundle;
import android.util.Range;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4mn  reason: invalid class name and case insensitive filesystem */
public class C96104mn extends AnonymousClass0CZ {
    public static final Range A0J = new Range(C36361kB.A0j(), C36371kC.A0o());
    public int A00 = R.style.f13nameremoved;
    public RecyclerView A01;
    public C116925lQ A02;
    public AnonymousClass60n A03;
    public CallGridViewModel A04;
    public boolean A05;
    public boolean A06;
    public final C226815j A07 = new C162747p5(this, 1);
    public final List A08 = AnonymousClass001.A0I();
    public final C115395io A09;
    public final C115455iu A0A;
    public final C20810yC A0B;
    public final C115405ip A0C;
    public final C115415iq A0D;
    public final C115425ir A0E;
    public final C115435is A0F;
    public final C115445it A0G;
    public final C145156tR A0H;
    public final AnonymousClass13J A0I;

    public void A0I(RecyclerView recyclerView) {
        this.A01 = null;
    }

    public C97034oI A0M(View view, int i) {
        return A0N(view, i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r16 != 0) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r3 != 2) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C97034oI A0N(android.view.View r15, int r16, boolean r17) {
        /*
            r14 = this;
            r2 = 0
            r1 = 2
            r0 = 1
            r4 = r15
            r3 = r16
            if (r3 == r1) goto L_0x0046
            if (r3 == r0) goto L_0x0046
            r12 = 0
            switch(r16) {
                case 3: goto L_0x00fc;
                case 4: goto L_0x00d2;
                case 5: goto L_0x00a8;
                case 6: goto L_0x00fc;
                case 7: goto L_0x00fc;
                case 8: goto L_0x00fc;
                case 9: goto L_0x008e;
                case 10: goto L_0x0072;
                case 11: goto L_0x0048;
                default: goto L_0x000e;
            }
        L_0x000e:
            if (r16 == 0) goto L_0x0014
        L_0x0010:
            if (r3 == r0) goto L_0x0014
            if (r3 != r1) goto L_0x0015
        L_0x0014:
            r2 = 1
        L_0x0015:
            java.lang.String r0 = "Unknown view holder type"
            X.C18740tg.A0D(r2, r0)
            X.5io r1 = r14.A09
            X.5lQ r6 = r14.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r7 = r14.A04
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1Mz r0 = r1.A00
            X.0tq r1 = r0.A01
            X.0yC r11 = X.C36341k9.A0V(r1)
            X.171 r10 = X.C36341k9.A0S(r1)
            X.1Pp r9 = X.C36361kB.A0V(r1)
            X.004 r0 = r1.A8v
            java.lang.Object r8 = r0.get()
            X.711 r8 = (X.AnonymousClass711) r8
            X.16L r5 = X.C90504aG.A0L(r1)
            X.52X r3 = new X.52X
            r13 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L_0x0046:
            r12 = 1
            goto L_0x0010
        L_0x0048:
            X.5iu r1 = r14.A0A
            X.5lQ r7 = r14.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r14.A04
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1Mz r0 = r1.A00
            X.0tq r0 = r0.A01
            X.0yC r12 = X.C36341k9.A0V(r0)
            X.171 r10 = X.C36341k9.A0S(r0)
            X.1Pp r9 = X.C36361kB.A0V(r0)
            X.16L r6 = X.C90504aG.A0L(r0)
            X.0ts r11 = X.C36341k9.A0T(r0)
            X.1LI r5 = X.C36361kB.A0S(r0)
            X.52a r3 = new X.52a
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        L_0x0072:
            X.5is r1 = r14.A0F
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r6 = r14.A04
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1Mz r0 = r1.A00
            X.0tq r0 = r0.A01
            X.16L r5 = X.C90504aG.A0L(r0)
            X.1Pp r7 = X.C36361kB.A0V(r0)
            X.171 r8 = X.C36341k9.A0S(r0)
            X.52W r3 = new X.52W
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x008e:
            X.5it r1 = r14.A0G
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1Mz r0 = r1.A00
            X.0tq r0 = r0.A01
            X.171 r2 = X.C36341k9.A0S(r0)
            X.1Pp r1 = X.C36361kB.A0V(r0)
            X.16L r0 = X.C90504aG.A0L(r0)
            X.52V r3 = new X.52V
            r3.<init>(r15, r0, r1, r2)
            return r3
        L_0x00a8:
            X.5ip r1 = r14.A0C
            X.5lQ r7 = r14.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r14.A04
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1Mz r0 = r1.A00
            X.0tq r0 = r0.A01
            X.0yC r12 = X.C36341k9.A0V(r0)
            X.171 r10 = X.C36341k9.A0S(r0)
            X.1Pp r9 = X.C36361kB.A0V(r0)
            X.16L r6 = X.C90504aG.A0L(r0)
            X.0ts r11 = X.C36341k9.A0T(r0)
            X.1LI r5 = X.C36361kB.A0S(r0)
            X.52Y r3 = new X.52Y
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        L_0x00d2:
            X.5ir r1 = r14.A0E
            X.5lQ r7 = r14.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r14.A04
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1Mz r0 = r1.A00
            X.0tq r0 = r0.A01
            X.0yC r12 = X.C36341k9.A0V(r0)
            X.171 r10 = X.C36341k9.A0S(r0)
            X.1Pp r9 = X.C36361kB.A0V(r0)
            X.16L r6 = X.C90504aG.A0L(r0)
            X.0ts r11 = X.C36341k9.A0T(r0)
            X.1LI r5 = X.C36361kB.A0S(r0)
            X.52Z r3 = new X.52Z
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        L_0x00fc:
            X.5iq r1 = r14.A0D
            X.5lQ r7 = r14.A02
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r14.A04
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1Mz r0 = r1.A00
            X.0tq r0 = r0.A01
            X.0yC r12 = X.C36341k9.A0V(r0)
            X.171 r10 = X.C36341k9.A0S(r0)
            X.1Pp r9 = X.C36361kB.A0V(r0)
            X.16L r6 = X.C90504aG.A0L(r0)
            X.0ts r11 = X.C36341k9.A0T(r0)
            X.1LI r5 = X.C36361kB.A0S(r0)
            X.52b r3 = new X.52b
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96104mn.A0N(android.view.View, int, boolean):X.4oI");
    }

    public int A0J() {
        return this.A08.size();
    }

    public /* bridge */ /* synthetic */ void A0K(AnonymousClass0D3 r1) {
        ((C97034oI) r1).A0B();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ad, code lost:
        r3 = (X.AnonymousClass52X) r8;
     */
    /* renamed from: A0P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C97034oI r8, java.util.List r9, int r10) {
        /*
            r7 = this;
            if (r10 < 0) goto L_0x00c7
            java.util.List r5 = r7.A08
            int r0 = r5.size()
            if (r10 >= r0) goto L_0x00c7
            java.lang.Object r0 = r5.get(r10)
            X.6Eu r0 = (X.C129066Eu) r0
            r8.A0H(r0)
            int r0 = r9.size()
            r4 = 0
            if (r0 <= 0) goto L_0x0043
            java.lang.Object r0 = r9.get(r4)
            boolean r0 = r0 instanceof android.os.Bundle
            if (r0 == 0) goto L_0x0043
            java.lang.Object r1 = r9.get(r4)
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r0 = "update_contact"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x0043
            boolean r0 = r8 instanceof X.C1028252b
            if (r0 == 0) goto L_0x00a9
            r2 = r8
            X.52b r2 = (X.C1028252b) r2
            X.6Eu r1 = r2.A05
            if (r1 == 0) goto L_0x0043
            com.whatsapp.WaDynamicRoundCornerImageView r0 = r2.A0H
            if (r0 == 0) goto L_0x0043
            r0 = 1
            r2.A0J(r1, r0)
        L_0x0043:
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x004c
            r1 = 2
        L_0x0048:
            r8.A0D(r1)
        L_0x004b:
            return
        L_0x004c:
            boolean r0 = r8 instanceof X.C1028252b
            if (r0 == 0) goto L_0x004b
            androidx.recyclerview.widget.RecyclerView r0 = r7.A01
            if (r0 == 0) goto L_0x004b
            boolean r0 = r7 instanceof X.AnonymousClass52T
            if (r0 != 0) goto L_0x004b
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x004b
            int r6 = r5.size()
            X.6tR r2 = r7.A0H
            androidx.recyclerview.widget.RecyclerView r0 = r7.A01
            int r1 = r0.getHeight()
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r7.A04
            if (r0 == 0) goto L_0x0075
            X.1hi r0 = r0.A0j
            boolean r0 = X.C36351kA.A1W(r0)
            if (r0 == 0) goto L_0x0075
            r4 = 1
        L_0x0075:
            int r5 = r2.A00(r6, r1, r4)
            java.lang.String r0 = "VoiceParticipantViewHolder/setItemViewHeight get called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.view.View r4 = r8.A0H
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            int r2 = r3.height
            if (r2 == r5) goto L_0x009e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoiceParticipantViewHolder/setItemViewHeight Height Mismatch, layoutParams.height: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", itemViewHeightPx: "
            X.C36321k7.A1T(r0, r1, r5)
            r3.height = r5
            r4.setLayoutParams(r3)
        L_0x009e:
            r1 = 2
            if (r6 > r1) goto L_0x00a3
            r1 = 0
            goto L_0x0048
        L_0x00a3:
            r0 = 8
            if (r6 > r0) goto L_0x0048
            r1 = 1
            goto L_0x0048
        L_0x00a9:
            boolean r0 = r8 instanceof X.AnonymousClass52X
            if (r0 == 0) goto L_0x0043
            r3 = r8
            X.52X r3 = (X.AnonymousClass52X) r3
            X.6Eu r0 = r3.A05
            if (r0 == 0) goto L_0x0043
            X.141 r2 = r0.A0a
            com.whatsapp.WaDynamicRoundCornerImageView r1 = r3.A0J
            r0 = 1
            r3.A0G(r1, r2, r0, r0)
            X.6Eu r0 = r3.A05
            X.141 r1 = r0.A0a
            com.whatsapp.components.button.ThumbnailButton r0 = r3.A0N
            r3.A0G(r0, r1, r4, r4)
            goto L_0x0043
        L_0x00c7:
            java.lang.String r0 = "CallGridAdapter/onCreateViewHolder index out of bounds"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96104mn.A0D(X.4oI, java.util.List, int):void");
    }

    public void A0Q(UserJid userJid) {
        if (userJid != null) {
            int i = 0;
            while (true) {
                List list = this.A08;
                if (i >= list.size()) {
                    return;
                }
                if (!userJid.equals(((C129066Eu) list.get(i)).A0b)) {
                    i++;
                } else if (i != -1) {
                    Bundle A072 = AnonymousClass001.A07();
                    A072.putBoolean("update_contact", true);
                    this.A01.A04(A072, i, 1);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public void A0R(List list) {
        List list2 = this.A08;
        AnonymousClass0X4 A002 = C06880Vl.A00(new C95564lp(list2, list));
        this.A06 = C36381kD.A1U(list2.size(), list.size());
        list2.clear();
        list2.addAll(list);
        A002.A02(this);
    }

    public int getItemViewType(int i) {
        C129066Eu r1;
        C129066Eu r12;
        if (this instanceof AnonymousClass52T) {
            if (i < 0) {
                return 9;
            }
            List list = this.A08;
            if (i >= list.size() || (r12 = (C129066Eu) list.get(i)) == null || r12.A0B) {
                return 9;
            }
            if (r12.A0A) {
                return 3;
            }
            return 0;
        } else if (i < 0) {
            return 9;
        } else {
            List list2 = this.A08;
            if (i >= list2.size() || (r1 = (C129066Eu) list2.get(i)) == null || r1.A0B) {
                return 9;
            }
            if (r1.A0I) {
                return 10;
            }
            if (this.A05) {
                return 3;
            }
            int size = list2.size();
            if (r1.A0K) {
                if (!r1.A0A) {
                    return 0;
                }
                if (size <= 4) {
                    return 6;
                }
                return 3;
            } else if (size == 1) {
                if (r1.A0C) {
                    return 4;
                }
                return 5;
            } else if (!A0J.contains(Integer.valueOf(size)) || !this.A0B.A0E(5055)) {
                return 3;
            } else {
                return 6;
            }
        }
    }

    public C96104mn(C115395io r3, C115405ip r4, C115415iq r5, C115425ir r6, C115435is r7, C115445it r8, C115455iu r9, C145156tR r10, C20810yC r11, AnonymousClass13J r12) {
        this.A0B = r11;
        this.A09 = r3;
        this.A0C = r4;
        this.A0D = r5;
        this.A0E = r6;
        this.A0F = r7;
        this.A0G = r8;
        this.A0A = r9;
        this.A0I = r12;
        this.A0H = r10;
    }

    public View A0L(int i, ViewGroup viewGroup) {
        LayoutInflater from;
        int i2;
        C004602b r1 = new C004602b(viewGroup.getContext(), this.A00);
        switch (i) {
            case 1:
                from = LayoutInflater.from(r1);
                i2 = R.layout.f9nameremoved;
                break;
            case 3:
                from = LayoutInflater.from(r1);
                i2 = R.layout.f9nameremoved;
                break;
            case 4:
                from = LayoutInflater.from(r1);
                i2 = R.layout.f9nameremoved;
                break;
            case 5:
                from = LayoutInflater.from(r1);
                i2 = R.layout.f9nameremoved;
                break;
            case 6:
                from = LayoutInflater.from(r1);
                i2 = R.layout.f9nameremoved;
                break;
            case 7:
                from = LayoutInflater.from(r1);
                i2 = R.layout.f9nameremoved;
                break;
            case 8:
                from = LayoutInflater.from(r1);
                i2 = R.layout.f9nameremoved;
                break;
            case 9:
                FrameLayout frameLayout = new FrameLayout(r1);
                C90474aD.A0z(frameLayout);
                return frameLayout;
            case 10:
                from = LayoutInflater.from(r1);
                i2 = R.layout.f9nameremoved;
                break;
            case 11:
                from = LayoutInflater.from(r1);
                i2 = R.layout.f9nameremoved;
                break;
            default:
                from = LayoutInflater.from(r1);
                i2 = R.layout.f9nameremoved;
                break;
        }
        return from.inflate(i2, viewGroup, false);
    }

    /* renamed from: A0O */
    public void BSE(C97034oI r2, int i) {
        A0D(r2, AnonymousClass001.A0I(), i);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        C36321k7.A1T("CallGridAdapter/onCreateViewHolder, viewType: ", AnonymousClass000.A0u(), i);
        C97034oI A0M = A0M(A0L(i, viewGroup), i);
        boolean z = true;
        if (!(i == 7 || i == 8 || i == 1)) {
            z = false;
        }
        A0M.A07 = z;
        AnonymousClass60n r1 = this.A03;
        if (A0M instanceof C1028252b) {
            ((C1028252b) A0M).A03 = r1;
        } else if (A0M instanceof AnonymousClass52X) {
            ((AnonymousClass52X) A0M).A03 = r1;
            return A0M;
        } else if (A0M instanceof AnonymousClass52W) {
            ((AnonymousClass52W) A0M).A00 = r1;
            return A0M;
        }
        return A0M;
    }

    public void A0H(RecyclerView recyclerView) {
        this.A01 = recyclerView;
    }
}
