package com.whatsapp.conversationslist;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass11F;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass19J;
import X.AnonymousClass1A6;
import X.AnonymousClass1A7;
import X.AnonymousClass1NG;
import X.AnonymousClass3I6;
import X.AnonymousClass3IF;
import X.AnonymousClass5WV;
import X.C005502l;
import X.C007103b;
import X.C023509x;
import X.C108105Se;
import X.C109325Xd;
import X.C12790if;
import X.C15060md;
import X.C155747Xg;
import X.C155757Xh;
import X.C162747p5;
import X.C20810yC;
import X.C226815j;
import X.C28201Rs;
import X.C36321k7;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C90514aH;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ConversationsSuggestedContactsViewModel extends AnonymousClass04R {
    public C108105Se A00 = C108105Se.NOT_STARTED;
    public List A01 = AnonymousClass001.A0I();
    public List A02 = AnonymousClass001.A0I();
    public AnonymousClass5WV A03;
    public final AnonymousClass19J A04;
    public final AnonymousClass1NG A05;
    public final AnonymousClass16D A06;
    public final C20810yC A07;
    public final C28201Rs A08 = C36441kJ.A0t();
    public final C28201Rs A09 = C36441kJ.A0t();
    public final C28201Rs A0A = C36441kJ.A0t();
    public final C28201Rs A0B = C36441kJ.A0t();
    public final C28201Rs A0C = new C28201Rs(C36381kD.A0j());
    public final AnonymousClass005 A0D;
    public final C005502l A0E;
    public final C226815j A0F;
    public final AnonymousClass16I A0G;
    public final AnonymousClass1A6 A0H;

    public static final void A01(ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel, Set set) {
        C28201Rs r0;
        Object obj;
        Object remove;
        List list = conversationsSuggestedContactsViewModel.A02;
        int A072 = C36431kI.A07(list);
        if (A072 >= 0) {
            while (true) {
                int i = A072 - 1;
                if (C007103b.A0j(set, C36381kD.A0w(((AnonymousClass3IF) list.get(A072)).A00.A0H))) {
                    list.remove(A072);
                    List list2 = conversationsSuggestedContactsViewModel.A01;
                    AnonymousClass00C.A0D(list2, 0);
                    if (!list2.isEmpty() && (remove = list2.remove(0)) != null) {
                        list.add(remove);
                    }
                }
                if (i < 0) {
                    break;
                }
                A072 = i;
            }
        }
        if (list.size() <= 1) {
            r0 = conversationsSuggestedContactsViewModel.A0C;
            obj = C36381kD.A0j();
        } else {
            r0 = conversationsSuggestedContactsViewModel.A0A;
            obj = list;
        }
        r0.A0D(obj);
    }

    public void A0R() {
        this.A0G.unregisterObserver(this.A0F);
        this.A04.unregisterObserver(this.A03);
    }

    public final Set A0S() {
        ArrayList A0I;
        AnonymousClass1A6 r1 = this.A0H;
        r1.A02.A0H();
        AnonymousClass1A7 r4 = r1.A01;
        synchronized (r4) {
            A0I = AnonymousClass001.A0I();
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                AnonymousClass11F r12 = ((AnonymousClass3I6) it.next()).A01;
                if (r12 instanceof UserJid) {
                    A0I.add(r12);
                }
            }
        }
        return C15060md.A01(C15060md.A02(C155757Xh.A00, new C12790if(C155747Xg.A00, C90514aH.A0X(A0I))));
    }

    public final void A0T() {
        C108105Se r1 = this.A00;
        if (r1 != C108105Se.IN_PROGRESS && r1 != C108105Se.LOADED && r1 != C108105Se.CONVERSATIONS_THRESHOLD_REACHED) {
            AnonymousClass19J r12 = this.A04;
            if (r12.A06) {
                C36381kD.A1R(this.A0E, new ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1(this, (C023509x) null), C109325Xd.A00(this));
                return;
            }
            r12.registerObserver(this.A03);
        }
    }

    public final void A0U(AnonymousClass11F r5) {
        if (this.A00 == C108105Se.LOADED && r5 != null) {
            C36381kD.A1R(this.A0E, new ConversationsSuggestedContactsViewModel$updateSuggestionPicOrInfo$1(this, r5, (C023509x) null), C109325Xd.A00(this));
        }
    }

    public ConversationsSuggestedContactsViewModel(AnonymousClass19J r4, AnonymousClass1NG r5, AnonymousClass16D r6, AnonymousClass16I r7, AnonymousClass1A6 r8, C20810yC r9, AnonymousClass005 r10, C005502l r11) {
        C36321k7.A1B(r9, r6, r5, r7, r4);
        C36321k7.A13(r8, r10, r11);
        this.A07 = r9;
        this.A06 = r6;
        this.A05 = r5;
        this.A0G = r7;
        this.A04 = r4;
        this.A0H = r8;
        this.A0D = r10;
        this.A0E = r11;
        C162747p5 r2 = new C162747p5(this, 5);
        this.A0F = r2;
        this.A03 = new AnonymousClass5WV(this, 2);
        r7.registerObserver(r2);
    }
}
