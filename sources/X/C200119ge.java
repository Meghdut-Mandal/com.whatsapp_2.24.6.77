package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9ge  reason: invalid class name and case insensitive filesystem */
public final class C200119ge {
    public final C19730wQ A00;
    public final C198319dG A01;
    public final C199349fA A02;

    public final boolean A05(C23028B0y b0y, AnonymousClass9NZ r38) {
        C23028B0y b0y2 = b0y;
        AnonymousClass00C.A0D(b0y2, 1);
        C198319dG r0 = this.A01;
        AnonymousClass19A r24 = r0.A0F;
        AnonymousClass3L6 r25 = r0.A0G;
        C29461Ws r15 = r0.A03;
        AnonymousClass1KK r14 = r0.A02;
        C31791cO r1 = new C31791cO(r0.A0A, 0);
        C19600wD r12 = r0.A0B;
        C199349fA r11 = r0.A0E;
        AnonymousClass9NZ r28 = r38;
        AnonymousClass1KK r17 = r14;
        C29461Ws r18 = r15;
        AnonymousClass8VD r16 = new AnonymousClass8VD(r17, r18, b0y2, r1, r12, r28, r11, r24, r25);
        C198409dV r10 = r0.A05;
        C19770wU r9 = r0.A0J;
        C194309Pd r8 = r0.A04;
        C193349Lc r7 = new C193349Lc(r8, r10);
        C603237k r6 = r0.A07;
        AnonymousClass9IN A002 = C198319dG.A00(r0);
        C19730wQ r5 = r0.A01;
        Object obj = r0.A0K.get();
        AnonymousClass00C.A08(obj);
        C195189Sv r3 = r0.A08;
        C23028B0y b0y3 = b0y2;
        return A00(new AnonymousClass8W2(r5, r17, r18, (C202279lS) obj, r8, r10, r7, r6, r3, b0y3, r16, r12, r28, r0.A0C, r0.A0D, r11, r24, r25, A002, r9), this);
    }

    public static final boolean A00(C177058d8 r3, C200119ge r4) {
        if (r4.A02.A00.A0E(1319)) {
            try {
                JSONObject A1B = C36441kJ.A1B();
                A1B.put("code", 2498048);
                A1B.put("description", "Commerce features are not available.");
                r3.A03(new C132286Sy(A1B), 451);
                return true;
            } catch (JSONException e) {
                Log.e(e.getMessage());
                r3.BWk(e);
                return true;
            }
        } else if (r3 instanceof AnonymousClass8W3) {
            AnonymousClass8W3 r32 = (AnonymousClass8W3) r3;
            if (!r32.A04.A09()) {
                r32.A02.BXK(r32.A01, -1);
                return true;
            }
            AnonymousClass9XP r2 = r32.A01;
            if (r2.A05 == null) {
                r32.A06.A02("view_collection_details_tag");
            }
            r32.A06();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("GetSingleCollectionGraphQLService/sendRequest jid=");
            A0u.append(r2.A04);
            C36321k7.A1a(A0u, " success");
            return true;
        } else if (r3 instanceof AnonymousClass8W1) {
            AnonymousClass8W1 r33 = (AnonymousClass8W1) r3;
            if (!r33.A06.A09()) {
                return true;
            }
            C177058d8.A02(r33, r33.A03.A01);
            return true;
        } else if (r3 instanceof AnonymousClass8W2) {
            AnonymousClass8W2 r34 = (AnonymousClass8W2) r3;
            if (!r34.A06.A09()) {
                r34.A04.BXY(r34.A07, -1);
                return true;
            }
            UserJid userJid = r34.A07.A01;
            AnonymousClass00C.A07(userJid);
            C177058d8.A02(r34, userJid);
            return true;
        } else if (r3 instanceof AnonymousClass8W4) {
            AnonymousClass8W4 r35 = (AnonymousClass8W4) r3;
            if (!r35.A05.A09()) {
                Log.i("GetProductCatalogGraphQLService/sendRequest failed : no network access");
                return true;
            }
            UserJid userJid2 = r35.A06.A07;
            AnonymousClass00C.A07(userJid2);
            C177058d8.A02(r35, userJid2);
            return true;
        } else if (r3 instanceof AnonymousClass8W0) {
            AnonymousClass8W0 r36 = (AnonymousClass8W0) r3;
            if (!r36.A04.A09()) {
                r36.A00.A01(r36.A02, -1);
                return true;
            }
            C177058d8.A02(r36, r36.A02.A05);
            return true;
        } else if (r3 instanceof C174308Vz) {
            C174308Vz r37 = (C174308Vz) r3;
            if (!r37.A04.A09()) {
                r37.A03.BXJ(r37.A01, -1);
                return true;
            }
            C177058d8.A02(r37, r37.A01.A02);
            return true;
        } else {
            C174298Vy r38 = (C174298Vy) r3;
            if (!r38.A03.A09()) {
                C174298Vy.A00(r38, -1);
                return true;
            }
            r38.A06();
            return true;
        }
    }

    public final void A01(C128516Co r12, C23023B0t b0t) {
        C198319dG r1 = this.A01;
        C198409dV r3 = r1.A05;
        C19770wU r10 = r1.A0J;
        C174228Vq r0 = r1.A06;
        C194309Pd r2 = r1.A04;
        C193349Lc r4 = new C193349Lc(r2, r0);
        C603237k r5 = r1.A07;
        AnonymousClass9IN A002 = C198319dG.A00(r1);
        A00(new C174308Vz(r12, r2, r3, r4, r5, r1.A08, b0t, r1.A0B, A002, r10), this);
    }

    public final void A02(C199899gC r36, C22917AyT ayT) {
        C198319dG r0 = this.A01;
        AnonymousClass19A r16 = r0.A0F;
        AnonymousClass1KK r15 = r0.A02;
        AnonymousClass1LA r14 = r0.A0H;
        C31791cO r5 = new C31791cO(r0.A0A, 1);
        C19700wN r11 = r0.A00;
        C199899gC r13 = r36;
        UserJid userJid = r13.A01;
        String str = r13.A03;
        String str2 = r13.A02;
        List list = r13.A04;
        C199349fA r10 = r0.A0E;
        C22917AyT ayT2 = ayT;
        AnonymousClass8VC r23 = new AnonymousClass8VC(r11, r15, ayT2, r5, userJid, r10, r16, r14, str, str2, list);
        C198409dV r9 = r0.A05;
        C19770wU r8 = r0.A0J;
        C194309Pd r7 = r0.A04;
        C193349Lc r6 = new C193349Lc(r7, r9);
        C603237k r52 = r0.A07;
        AnonymousClass9IN A002 = C198319dG.A00(r0);
        AnonymousClass3L6 r4 = r0.A0G;
        C195189Sv r3 = r0.A08;
        C603237k r19 = r52;
        C195189Sv r20 = r3;
        C193349Lc r18 = r6;
        C198409dV r17 = r9;
        C194309Pd r162 = r7;
        C19700wN r142 = r11;
        A00(new AnonymousClass8W1(r142, r15, r162, r17, r18, r19, r20, r13, ayT2, r23, r0.A0B, r0.A0C, r10, r16, r4, r14, A002, r8), this);
    }

    public final void A03(AnonymousClass9XP r27, C23027B0x b0x) {
        C198319dG r6 = this.A01;
        AnonymousClass3L6 r3 = r6.A0G;
        AnonymousClass19A r7 = r6.A0F;
        C19600wD r15 = r6.A0B;
        C31781cN r5 = new C31781cN(new C31791cO(r6.A0A, 0));
        AnonymousClass9XP r12 = r27;
        C23027B0x b0x2 = b0x;
        AnonymousClass8V8 r16 = new AnonymousClass8V8(r6.A02, r12, r5, b0x2, r15, r6.A0E, r7, r3, r6.A0I);
        C198409dV r8 = r6.A05;
        C19770wU r1 = r6.A0J;
        C194309Pd r72 = r6.A04;
        C193349Lc r9 = new C193349Lc(r72, r8);
        C603237k r10 = r6.A07;
        AnonymousClass9IN A002 = C198319dG.A00(r6);
        A00(new AnonymousClass8W3(r72, r8, r9, r10, r6.A08, r12, b0x2, r16, r15, r6.A0C, r3, A002, r1), this);
    }

    public final boolean A04(C23025B0v b0v, C200939iV r31) {
        C198319dG r0 = this.A01;
        C19700wN r8 = r0.A00;
        AnonymousClass3L6 r6 = r0.A0G;
        AnonymousClass19A r4 = r0.A0F;
        C31791cO r1 = new C31791cO(r0.A0A, 0);
        C19600wD r3 = r0.A0B;
        AnonymousClass1KK r9 = r0.A02;
        C199349fA r2 = r0.A0E;
        C23025B0v b0v2 = b0v;
        C200939iV r18 = r31;
        AnonymousClass8VF r19 = new AnonymousClass8VF(r8, r9, b0v2, r1, r3, r18, r2, r4, r6);
        C198409dV r11 = r0.A05;
        C19770wU r12 = r0.A0J;
        C194309Pd r10 = r0.A04;
        C193349Lc r122 = new C193349Lc(r10, r11);
        C603237k r13 = r0.A07;
        AnonymousClass9IN A002 = C198319dG.A00(r0);
        return A00(new AnonymousClass8W4(r8, r9, r10, r11, r122, r13, r0.A08, b0v2, r19, r3, r18, r0.A0C, r2, r4, r6, A002, r12), this);
    }

    public C200119ge(C19730wQ r1, C198319dG r2, C199349fA r3) {
        C36321k7.A0z(r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
