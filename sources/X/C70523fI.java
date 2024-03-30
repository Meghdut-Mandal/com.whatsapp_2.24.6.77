package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.jid.UserJid;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.3fI  reason: invalid class name and case insensitive filesystem */
public class C70523fI implements C89004Uw, C87704Pv {
    public AnonymousClass0V9 A00;
    public C19460v5 A01;
    public C19460v5 A02;
    public C19460v5 A03;
    public C19460v5 A04;
    public C24801Dv A05;
    public C61333Bl A06;
    public AnonymousClass1X4 A07;
    public AnonymousClass1KK A08;
    public AnonymousClass1LV A09;
    public AnonymousClass196 A0A;
    public C229216m A0B;
    public AnonymousClass16D A0C;
    public AnonymousClass3QX A0D;
    public AnonymousClass185 A0E;
    public AnonymousClass171 A0F;
    public C235618y A0G;
    public C27731Pn A0H;
    public C33751fs A0I;
    public AnonymousClass31A A0J;
    public C64853Pr A0K;
    public AnonymousClass3QY A0L;
    public C88994Uv A0M;
    public MessageSelectionViewModel A0N;
    public C38861qL A0O;
    public AnonymousClass3HC A0P;
    public AnonymousClass3HF A0Q;
    public AnonymousClass1V6 A0R;
    public C21060yb A0S;
    public C19630wG A0T;
    public C20830yE A0U;
    public C220412q A0V;
    public C20310xM A0W;
    public AnonymousClass17X A0X;
    public AnonymousClass3QW A0Y;
    public AnonymousClass16J A0Z;
    public AnonymousClass1NO A0a;
    public AnonymousClass1DW A0b;
    public EmojiSearchProvider A0c;
    public C21010yW A0d;
    public AnonymousClass17V A0e;
    public C20350xQ A0f;
    public AnonymousClass1EL A0g;
    public AnonymousClass1JL A0h;
    public AnonymousClass1CF A0i;
    public AnonymousClass1DU A0j;
    public AnonymousClass1Y4 A0k;
    public AnonymousClass1ST A0l;
    public C28371Sj A0m;
    public AnonymousClass1XS A0n;
    public AnonymousClass3O0 A0o;
    public AnonymousClass1EV A0p;
    public AnonymousClass1EU A0q;
    public AnonymousClass3T1 A0r;
    public AnonymousClass1AW A0s;
    public AnonymousClass1EO A0t;
    public ReactionsTrayViewModel A0u;
    public AnonymousClass3ZU A0v;
    public AnonymousClass1HA A0w;
    public AnonymousClass1A1 A0x;
    public C20380xT A0y;
    public C32661dz A0z;
    public AnonymousClass1EM A10;
    public C32681e1 A11;
    public C62683Hc A12;
    public C65643Sx A13;
    public HashMap A14;
    public AnonymousClass9SI A15;
    public final PopupWindow.OnDismissListener A16 = new C89944Ym(this, 1);
    public final HashSet A17 = C36441kJ.A16();

    public /* synthetic */ void B0z(Drawable drawable, View view) {
    }

    public /* synthetic */ void B1j(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bdt() {
    }

    public /* synthetic */ void Bel(AnonymousClass3T1 r1, boolean z) {
    }

    public /* synthetic */ void Bth(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass3T1 r1) {
    }

    public static AnonymousClass155 A00(C70523fI r0) {
        return r0.A0M.BoP();
    }

    public static void A02(C70523fI r3) {
        if (r3.A0N == null) {
            MessageSelectionViewModel messageSelectionViewModel = (MessageSelectionViewModel) C36441kJ.A0b(r3.A0M.getViewModelStoreOwner()).A00(MessageSelectionViewModel.class);
            r3.A0N = messageSelectionViewModel;
            C88554Td.A00(A00(r3), messageSelectionViewModel.A01, r3, 33);
            C88554Td.A00(A00(r3), r3.A0N.A00, r3, 31);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0110, code lost:
        r7 = new X.C89464Wq(r6, r1, r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A03(int r45) {
        /*
            r44 = this;
            r0 = 13
            r2 = r44
            r3 = r45
            if (r3 == r0) goto L_0x0016
            r4 = 19
            if (r3 == r4) goto L_0x0117
            switch(r45) {
                case 23: goto L_0x00e5;
                case 24: goto L_0x00fb;
                case 25: goto L_0x0133;
                default: goto L_0x000f;
            }
        L_0x000f:
            X.4Uv r0 = r2.A0M
            android.app.Dialog r0 = r0.BiX(r3)
            return r0
        L_0x0016:
            X.3Gh r0 = r2.A04()
            if (r0 == 0) goto L_0x00de
            java.util.HashMap r0 = r0.A03
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x00de
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "conversation/dialog/delete/"
            r3.append(r1)
            int r1 = r0.size()
            X.C36321k7.A1Y(r3, r1)
            X.155 r5 = A00(r2)
            X.4Uv r1 = r2.A0M
            X.0wo r25 = r1.getTime()
            X.4Uv r1 = r2.A0M
            X.0yC r32 = r1.getABProps()
            X.4Uv r1 = r2.A0M
            X.17Y r19 = r1.getGlobalUI()
            X.4Uv r1 = r2.A0M
            X.0wU r40 = r1.getWaWorkers()
            X.0yW r1 = r2.A0d
            r22 = r1
            X.4Uv r1 = r2.A0M
            X.1H2 r31 = r1.getEmojiLoader()
            X.1X4 r1 = r2.A07
            r21 = r1
            X.16D r4 = r2.A0C
            X.1DW r1 = r2.A0b
            r20 = r1
            X.171 r3 = r2.A0F
            X.4Uv r1 = r2.A0M
            X.0ts r27 = r1.getWhatsAppLocale()
            X.18y r1 = r2.A0G
            r24 = r1
            X.1EL r1 = r2.A0g
            r18 = r1
            X.1CF r1 = r2.A0i
            r16 = r1
            X.17V r15 = r2.A0e
            X.185 r14 = r2.A0E
            X.4Uv r1 = r2.A0M
            X.0v0 r26 = r1.getWaSharedPreferences()
            X.0v5 r13 = r2.A02
            X.17X r12 = r2.A0X
            X.3O0 r11 = r2.A0o
            java.util.Collection r0 = r0.values()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            r6 = 0
            X.4Uv r8 = r2.A0M
            java.util.Objects.requireNonNull(r8)
            r7 = 1
            X.4Yn r0 = new X.4Yn
            r0.<init>(r8, r7)
            X.4Uv r7 = r2.A0M
            X.4Ov r17 = r7.B4o()
            X.1AW r10 = r2.A0s
            X.1EO r9 = r2.A0t
            X.12q r8 = r2.A0V
            r7 = 0
            X.4Wo r2 = new X.4Wo
            r2.<init>(r5, r7)
            java.lang.String r41 = X.AnonymousClass3SH.A01(r5, r4, r3, r6, r1)
            r43 = 1
            r28 = r8
            r29 = r12
            r30 = r20
            r33 = r22
            r34 = r15
            r35 = r18
            r36 = r16
            r37 = r11
            r38 = r10
            r39 = r9
            r42 = r1
            r18 = r0
            r20 = r21
            r21 = r4
            r22 = r14
            r23 = r3
            r14 = r5
            r15 = r13
            r16 = r2
            X.0FM r0 = X.AnonymousClass3SH.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            return r0
        L_0x00de:
            java.lang.String r0 = "conversation/dialog/delete no messages"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x000f
        L_0x00e5:
            X.11F r9 = A01(r2)
            X.155 r6 = A00(r2)
            X.1Dv r5 = r2.A05
            X.0xT r10 = r2.A0y
            X.1fs r8 = r2.A0I
            X.4Uv r0 = r2.A0M
            X.0v0 r1 = r0.getWaSharedPreferences()
            r11 = 1
            goto L_0x0110
        L_0x00fb:
            X.11F r9 = A01(r2)
            X.155 r6 = A00(r2)
            X.1Dv r5 = r2.A05
            X.0xT r10 = r2.A0y
            X.1fs r8 = r2.A0I
            X.4Uv r0 = r2.A0M
            X.0v0 r1 = r0.getWaSharedPreferences()
            r11 = 0
        L_0x0110:
            r0 = 0
            X.4Wq r7 = new X.4Wq
            r7.<init>(r6, r1, r3, r0)
            goto L_0x014d
        L_0x0117:
            X.11F r9 = A01(r2)
            X.155 r6 = A00(r2)
            X.1Dv r5 = r2.A05
            X.0xT r10 = r2.A0y
            X.1fs r8 = r2.A0I
            X.4Uv r0 = r2.A0M
            X.0v0 r1 = r0.getWaSharedPreferences()
            r11 = 0
            r0 = 1
            X.4Wq r7 = new X.4Wq
            r7.<init>(r6, r1, r4, r0)
            goto L_0x014d
        L_0x0133:
            X.11F r9 = A01(r2)
            X.155 r6 = A00(r2)
            X.1Dv r5 = r2.A05
            X.0xT r10 = r2.A0y
            X.1fs r8 = r2.A0I
            X.4Uv r0 = r2.A0M
            X.0v0 r0 = r0.getWaSharedPreferences()
            r11 = 1
            X.4Wq r7 = new X.4Wq
            r7.<init>(r6, r0, r3, r11)
        L_0x014d:
            X.0FM r0 = X.C53132qp.A00(r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70523fI.A03(int):android.app.Dialog");
    }

    public C62473Gh A04() {
        MessageSelectionViewModel messageSelectionViewModel = this.A0N;
        if (messageSelectionViewModel == null) {
            return null;
        }
        return (C62473Gh) messageSelectionViewModel.A00.A04();
    }

    public void A06() {
        this.A15 = new AnonymousClass9SI(this.A0M.getGlobalUI(), this.A0M.getWaSharedPreferences(), this.A11);
        this.A0L = this.A06.A00(A00(this).getSupportFragmentManager(), AnonymousClass2XJ.A01(this.A0M.getWaWorkers()));
        if (this.A0h.A09()) {
            AnonymousClass3HC r4 = this.A0P;
            Iterator A0y2 = AnonymousClass000.A0y(r4.A0F);
            while (A0y2.hasNext()) {
                C89014Ux r2 = (C89014Ux) AnonymousClass000.A11(A0y2).getKey();
                C36421kH.A1M(r2, r4.A0E, r2.BCS());
            }
        }
        this.A0P.A01(A00(this));
    }

    public void A07() {
        MessageSelectionViewModel messageSelectionViewModel = this.A0N;
        if (messageSelectionViewModel != null) {
            messageSelectionViewModel.A0S();
        }
        AnonymousClass3QY r1 = this.A0L;
        AnonymousClass1RY r0 = r1.A00;
        if (r0 != null) {
            r0.A02();
        }
        r1.A09.A06();
        r1.A0A.A0A();
        AnonymousClass9SI r2 = this.A15;
        C183808rO r12 = r2.A00;
        if (r12 != null) {
            r12.A02 = true;
            r12.interrupt();
            r2.A00 = null;
        }
        this.A0J.A00.clear();
        this.A0M.BiZ();
    }

    public void A08() {
        C64853Pr r1 = this.A0K;
        synchronized (r1) {
            Map map = r1.A00;
            if (map != null) {
                map.clear();
            }
        }
        this.A12.A01();
    }

    public void A0B(int i) {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A0u;
        C18740tg.A06(reactionsTrayViewModel);
        if (i == 0) {
            this.A0M.B5e();
            if (!this.A0u.A03) {
                return;
            }
            if (this.A0M.getABProps().A0E(3792)) {
                this.A0M.BKA();
                return;
            }
            AnonymousClass22t BBT = this.A0M.BBT((Integer) null);
            if (BBT != null) {
                BBT.dismiss();
            }
        } else if (i == 1) {
            C38861qL r1 = this.A0O;
            if (r1 != null) {
                r1.A00(reactionsTrayViewModel.A00);
                AnonymousClass3T1 r0 = this.A0u.A0G;
                C18740tg.A06(r0);
                AnonymousClass11F r12 = r0.A1J.A00;
                if (r12 != null) {
                    this.A0n.A00(r12);
                }
            }
        } else if (i == 2) {
            C594934d r2 = C65753Ti.A02;
            AnonymousClass22t BBT2 = this.A0M.BBT(C54212sa.A00(A01(this)));
            if (BBT2 != null) {
                BBT2.A09 = r2;
                BBT2.A0E();
            }
            this.A0M.B5e();
        }
    }

    public void A0C(int i, int i2, Intent intent) {
        String str;
        List<C607439e> list;
        if (i == 41) {
            if (i2 == -1) {
                if (intent != null) {
                    Uri data = intent.getData();
                    C18740tg.A06(data);
                    str = data.getLastPathSegment();
                } else {
                    str = null;
                }
                ArrayList A0I2 = AnonymousClass001.A0I();
                ArrayList A0I3 = AnonymousClass001.A0I();
                C65643Sx r0 = this.A13;
                if (!(r0 == null || (list = r0.A06) == null)) {
                    for (C607439e r1 : list) {
                        A0I3.add(r1.A02);
                        UserJid userJid = r1.A01;
                        if (userJid != null) {
                            A0I2.add(userJid);
                        } else {
                            A0I2.add((Object) null);
                        }
                    }
                    this.A0D.A02(this.A13.A03(), str, A0I3, A0I2);
                }
            }
            this.A0z.A01();
        }
    }

    public void A0D(Configuration configuration) {
        int i;
        this.A0P.A01(A00(this));
        ReactionsTrayViewModel reactionsTrayViewModel = this.A0u;
        if (reactionsTrayViewModel != null && (i = configuration.orientation) != reactionsTrayViewModel.A01) {
            reactionsTrayViewModel.A01 = i;
            reactionsTrayViewModel.A0S(0);
        }
    }

    public void B7Q() {
        MessageSelectionViewModel messageSelectionViewModel = this.A0N;
        if (messageSelectionViewModel != null) {
            messageSelectionViewModel.A0S();
        }
    }

    public Object BAB(Class cls) {
        if (cls == C64853Pr.class) {
            return this.A0K;
        }
        if (cls == AnonymousClass9SI.class) {
            return this.A15;
        }
        return null;
    }

    public int BF0(AnonymousClass3T1 r4) {
        Number A102;
        HashMap hashMap = this.A14;
        if (hashMap == null || (A102 = C36441kJ.A10(r4.A1J, hashMap)) == null) {
            return 1;
        }
        return A102.intValue();
    }

    public boolean BK6() {
        MessageSelectionViewModel messageSelectionViewModel = this.A0N;
        if (messageSelectionViewModel == null) {
            return false;
        }
        Number A0z2 = C36441kJ.A0z(messageSelectionViewModel.A01);
        if (A0z2 == null || A0z2.intValue() != 0) {
            return true;
        }
        return false;
    }

    public boolean BMT(AnonymousClass3T1 r3) {
        MessageSelectionViewModel messageSelectionViewModel = this.A0N;
        if (messageSelectionViewModel != null) {
            AnonymousClass00C.A0D(r3, 0);
            C62473Gh r0 = (C62473Gh) messageSelectionViewModel.A00.A04();
            if (r0 != null) {
                if (!r0.A03.containsKey(r3.A1J)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public void BrT(AnonymousClass3T1 r3, int i) {
        HashMap hashMap = this.A14;
        if (hashMap == null) {
            hashMap = AnonymousClass001.A0J();
            this.A14 = hashMap;
        }
        C36341k9.A1K(r3.A1J, hashMap, i);
    }

    public void BsB(List list, boolean z) {
        MessageSelectionViewModel messageSelectionViewModel = this.A0N;
        if (messageSelectionViewModel != null) {
            AnonymousClass00C.A0D(list, 0);
            C001700s r5 = messageSelectionViewModel.A00;
            C62473Gh r4 = (C62473Gh) r5.A04();
            if (r4 != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass3T1 A0l2 = C36391kE.A0l(it);
                    C64933Qa r1 = A0l2.A1J;
                    HashMap hashMap = r4.A03;
                    if (z) {
                        hashMap.put(r1, A0l2);
                    } else {
                        hashMap.remove(r1);
                    }
                }
                r5.A0D(r4);
            }
        }
    }

    public void Btg(Bitmap bitmap, C65643Sx r6) {
        this.A13 = r6;
        C39001qm A002 = AnonymousClass3LW.A00(A00(this));
        A002.A0c(R.string.f12nameremoved);
        A002.A0h(new AnonymousClass4XI(bitmap, r6, this, 7), R.string.f12nameremoved);
        A002.A0f(new AnonymousClass4XI(bitmap, r6, this, 8), R.string.f12nameremoved);
        C36341k9.A11(A002);
    }

    public void Bu3(View view, AnonymousClass3T1 r10, int i, boolean z) {
        Number A0z2;
        MessageSelectionViewModel messageSelectionViewModel = this.A0N;
        if (messageSelectionViewModel == null || (A0z2 = C36441kJ.A0z(messageSelectionViewModel.A01)) == null || A0z2.intValue() != 2) {
            if (this.A0u == null) {
                ReactionsTrayViewModel reactionsTrayViewModel = (ReactionsTrayViewModel) C36441kJ.A0b(this.A0M.getViewModelStoreOwner()).A00(ReactionsTrayViewModel.class);
                this.A0u = reactionsTrayViewModel;
                AnonymousClass3UW.A00(A00(this), reactionsTrayViewModel.A0D, reactionsTrayViewModel, this, 12);
                C34831hi r3 = reactionsTrayViewModel.A0B;
                AnonymousClass155 A002 = A00(this);
                C88994Uv r1 = this.A0M;
                Objects.requireNonNull(r1);
                C88554Td.A00(A002, r3, r1, 34);
                C88554Td.A00(A00(this), reactionsTrayViewModel.A0C, this, 32);
            }
            this.A0u.A0U(r10);
            C18820ts whatsAppLocale = this.A0M.getWhatsAppLocale();
            C21060yb systemServices = this.A0M.getSystemServices();
            View view2 = view;
            this.A0O = new C38861qL(view2, A00(this), systemServices, whatsAppLocale, r10, this.A0u, z);
            this.A0u.A0T(i);
        }
    }

    public boolean Bvv(AnonymousClass3T1 r6) {
        MessageSelectionViewModel messageSelectionViewModel = this.A0N;
        if (messageSelectionViewModel != null) {
            AnonymousClass00C.A0D(r6, 0);
            C001700s r4 = messageSelectionViewModel.A00;
            C62473Gh r3 = (C62473Gh) r4.A04();
            if (r3 != null) {
                C64933Qa r2 = r6.A1J;
                HashMap hashMap = r3.A03;
                boolean z = !hashMap.containsKey(r2);
                if (z) {
                    hashMap.put(r2, r6);
                } else {
                    hashMap.remove(r2);
                }
                r4.A0D(r3);
                if (!z) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public void Bwy(AnonymousClass3T1 r3) {
        this.A17.add(r3.A1J);
    }

    public C89014Ux getConversationRowCustomizer() {
        return this.A0M.getConversationRowCustomizer();
    }

    public AnonymousClass012 getLifecycleOwner() {
        return this.A0M.getLifecycleOwner();
    }

    public static AnonymousClass11F A01(C70523fI r0) {
        C62473Gh A042 = r0.A04();
        if (A042 == null) {
            return null;
        }
        return C66013Ui.A05(A042.A01());
    }

    public ArrayList A05() {
        ArrayList A0I2 = AnonymousClass001.A0I();
        C62473Gh A042 = A04();
        if (A042 != null) {
            A0I2.addAll(A042.A03.values());
        } else {
            AnonymousClass3T1 r0 = this.A0r;
            if (r0 != null) {
                if (this.A0x.A03(r0.A1J) != null) {
                    A0I2.add(this.A0r);
                    return A0I2;
                }
            }
        }
        return A0I2;
    }

    public void A09() {
        AnonymousClass155 A002 = A00(this);
        AnonymousClass155 A003 = A00(this);
        AnonymousClass00C.A0D(A003, 0);
        AnonymousClass1RC.A04(A002, C224314h.A00(A003));
    }

    public void A0A() {
        AnonymousClass1RC.A04(A00(this), C224514j.A00(A00(this), R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    public void B7f(AnonymousClass3T1 r7) {
        long j;
        int i;
        B7Q();
        this.A0r = r7;
        AnonymousClass3OM r2 = new AnonymousClass3OM(A00(this));
        boolean z = true;
        r2.A09 = true;
        C19460v5 r1 = this.A01;
        if (r1.A05()) {
            r1.A02();
            throw AnonymousClass001.A0A("isEligible");
        }
        r2.A0J = C36381kD.A0j();
        C64933Qa r4 = r7.A1J;
        r2.A01 = r4.A00;
        r2.A0b = Collections.singletonList(r4);
        int i2 = r7.A1I;
        AnonymousClass3OM.A03(r2, i2);
        if (r7 instanceof C181798o3) {
            j = C36371kC.A07(((AnonymousClass2bU) r7).A0B);
        } else {
            j = 0;
        }
        r2.A0T = Long.valueOf(j);
        if (i2 == 0) {
            String A0b2 = r7.A0b();
            C18740tg.A06(A0b2);
            i = A0b2.length();
        } else {
            i = 0;
        }
        r2.A0R = Integer.valueOf(i);
        r2.A0N = Integer.valueOf(C66013Ui.A0u(r7) ? 1 : 0);
        r2.A0C = Boolean.valueOf(AnonymousClass000.A1S(r7.A0A & 1, 1));
        r2.A0A = Boolean.valueOf(AnonymousClass000.A1S(r7.A0A & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH));
        r2.A0B = Boolean.valueOf(C66013Ui.A0l(r7));
        if (!(r7 instanceof C46812bi) || r7.A09 != 1 || !r4.A02) {
            z = false;
        }
        r2.A0D = Boolean.valueOf(z);
        A00(this).startActivityForResult(AnonymousClass3OM.A00(r2), 2);
    }

    public /* synthetic */ boolean BMS() {
        return false;
    }

    public /* synthetic */ boolean BMm() {
        return false;
    }

    public /* synthetic */ boolean BPt() {
        return true;
    }

    public void BpV(AnonymousClass3T1 r3) {
        GoogleSearchDialogFragment.A03(A00(this), this.A0M.getServerProps(), r3);
    }

    public /* synthetic */ boolean BtT() {
        return false;
    }

    public /* synthetic */ boolean Btp() {
        return false;
    }

    public void Bur(AnonymousClass3T1 r7) {
        A02(this);
        MessageSelectionViewModel messageSelectionViewModel = this.A0N;
        C18740tg.A06(messageSelectionViewModel);
        AnonymousClass00C.A0D(r7, 0);
        C001700s r3 = messageSelectionViewModel.A00;
        C62473Gh A002 = C62473Gh.A00(messageSelectionViewModel.A02, (C62473Gh) r3.A04(), messageSelectionViewModel.A03, messageSelectionViewModel, 0);
        A002.A03.put(r7.A1J, r7);
        r3.A0D(A002);
        this.A0M.BgA();
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public /* synthetic */ C001600r getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ C001600r getLastMessageLiveData() {
        return null;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        return null;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public /* synthetic */ boolean BNW(AnonymousClass3T1 r2) {
        return false;
    }
}
