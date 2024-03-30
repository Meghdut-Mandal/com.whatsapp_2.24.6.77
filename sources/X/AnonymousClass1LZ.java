package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1LZ  reason: invalid class name */
public abstract class AnonymousClass1LZ {
    public final AnonymousClass1AC A00;

    public final void A07(C201669k5 r3) {
        r3.A08(false);
        this.A00.A0H(Collections.singleton(r3));
    }

    public final void A08(C201669k5 r3) {
        r3.A08(true);
        this.A00.A0H(Collections.singleton(r3));
    }

    public C201669k5 A0A(C202599mH r14, String str, boolean z) {
        Long l;
        C201669k5 r4;
        C26661La r5 = (C26661La) this;
        AnonymousClass00C.A0D(r14, 2);
        String[] strArr = r14.A06;
        AnonymousClass00C.A07(strArr);
        AnonymousClass8SS r3 = r14.A03;
        C199769fw r0 = C199769fw.A03;
        C199769fw r1 = r14.A01;
        if (!AnonymousClass00C.A0J(r0, r1) || r3 == null || !r3.A0u()) {
            StringBuilder sb = new StringBuilder();
            sb.append("PropertySyncHandler failed to parse mutation, operation: ");
            sb.append(r1);
            sb.append(", ");
            if (r3 != null) {
                l = Long.valueOf(r3.timestamp_);
            } else {
                l = null;
            }
            sb.append(l);
            Log.w(sb.toString());
            return null;
        }
        Object A0L = r5.A0L(r3);
        int ordinal = r5.A0I().ordinal();
        long j = r3.timestamp_;
        String str2 = (String) AnonymousClass02R.A08(strArr, 1);
        C201539jo r6 = r14.A02;
        String str3 = str;
        boolean z2 = z;
        if (ordinal != 0) {
            r4 = new C175958bL(r5, r6, A0L, str2, str3, j, z2);
        } else {
            r4 = new AnonymousClass8YS(r5, r6, A0L, str2, str3, j, z2);
        }
        return r4;
    }

    public String A0C() {
        return ((C26661La) this).A0J().mutationName;
    }

    public List A0D(boolean z) {
        C26661La r5 = (C26661La) this;
        List<AnonymousClass3I4> A0M = r5.A0M();
        ArrayList arrayList = new ArrayList(AnonymousClass03U.A06(A0M, 10));
        for (AnonymousClass3I4 r1 : A0M) {
            C26011In r0 = r5.A00;
            AnonymousClass00C.A0D(r1, 0);
            long A002 = C19970wo.A00(r0.A00);
            arrayList.add(new C175958bL(r5, (C201539jo) null, r1.A00, r1.A01, (String) null, A002, false));
        }
        return arrayList;
    }

    public void A0F(C201669k5 r3) {
        C26661La r1 = (C26661La) this;
        C175958bL r32 = (C175958bL) r3;
        AnonymousClass00C.A0D(r32, 0);
        if (r1.A0N(r32)) {
            r1.A06(r32);
        } else {
            r1.A04(r32);
        }
    }

    public void A0G(C201669k5 r7, C201669k5 r8) {
        C26661La r5 = (C26661La) this;
        C175958bL r72 = (C175958bL) r7;
        AnonymousClass00C.A0D(r72, 0);
        if (r8 != null && r8.A04 >= r72.A04) {
            r5.A07(r72);
        } else if (r5.A0N(r72)) {
            r5.A09(r72, r8);
        } else {
            r5.A08(r72);
        }
    }

    public final void A04(C201669k5 r2) {
        this.A00.A0F(r2);
    }

    public final void A05(C201669k5 r8) {
        C1495671s B1k;
        String str;
        AnonymousClass1M0 A04 = this.A00.A00.A04();
        try {
            B1k = A04.B1k();
            C224114e r5 = A04.A02;
            String[] strArr = new String[3];
            strArr[0] = r8.A07();
            if (r8 instanceof C22936Aym) {
                str = ((C22936Aym) r8).getChatJid().getRawString();
            } else {
                str = null;
            }
            strArr[1] = str;
            strArr[2] = r8.A06();
            r5.A0E("UPDATE syncd_mutations SET are_dependencies_missing = 0, mutation_name = ?, chat_jid = ?  WHERE mutation_index = ? ", "SyncdMutationsStore.MARK_MUTATION_AS_APPLIED_BY_INDEX", strArr);
            B1k.A00();
            B1k.close();
            A04.close();
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A06(C201669k5 r3) {
        this.A00.A0I(Collections.singleton(r3.A07));
    }

    public final void A09(C201669k5 r3, C201669k5 r4) {
        if (r4 != null) {
            this.A00.A0F(r4);
        }
        this.A00.A0H(Collections.singleton(r3));
    }

    public void A0E(C201669k5 r3) {
        if (this instanceof C26661La) {
            C26661La r1 = (C26661La) this;
            C175958bL r32 = (C175958bL) r3;
            AnonymousClass00C.A0D(r32, 0);
            if (r1.A0N(r32)) {
                r1.A05(r32);
            }
        }
    }

    public AnonymousClass1LZ(AnonymousClass1AC r1) {
        this.A00 = r1;
    }

    public String A0B() {
        return "regular_low";
    }

    public boolean A0H() {
        return true;
    }
}
