package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1PR  reason: invalid class name */
public final class AnonymousClass1PR implements C19710wO {
    public final AnonymousClass164 A00;
    public final AnonymousClass1LV A01;
    public final C19420v0 A02;
    public final C20810yC A03;
    public final AnonymousClass16D A04;
    public final C220412q A05;
    public final AnonymousClass17X A06;

    public AnonymousClass1PR(AnonymousClass164 r2, AnonymousClass1LV r3, AnonymousClass16D r4, C19420v0 r5, C220412q r6, AnonymousClass17X r7, C20810yC r8) {
        AnonymousClass00C.A0D(r8, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r5, 4);
        AnonymousClass00C.A0D(r3, 5);
        AnonymousClass00C.A0D(r7, 6);
        AnonymousClass00C.A0D(r2, 7);
        this.A03 = r8;
        this.A05 = r6;
        this.A04 = r4;
        this.A02 = r5;
        this.A01 = r3;
        this.A06 = r7;
        this.A00 = r2;
    }

    public final void A00(Iterable iterable) {
        AnonymousClass00C.A0D(iterable, 0);
        if (C20800yB.A01(C21000yV.A02, this.A03, 6601)) {
            ArrayList<Jid> arrayList = new ArrayList<>();
            for (Object next : iterable) {
                AnonymousClass11F r2 = (AnonymousClass11F) next;
                if ((r2 instanceof GroupJid) && this.A05.A05((GroupJid) r2) == 1) {
                    arrayList.add(next);
                }
            }
            for (Jid rawString : arrayList) {
                this.A00.A01(new C156787aj(rawString.getRawString()));
            }
        }
    }

    public String BIB() {
        return "MemberSuggestedGroupsSyncManager";
    }

    public /* synthetic */ void BRL() {
    }

    public void BRM() {
        C19420v0 r5 = this.A02;
        int A0O = r5.A0O("member_suggested_groups_sync_version", 0);
        int A002 = C20800yB.A00(C21000yV.A02, this.A03, 6600);
        if (A0O >= A002) {
            StringBuilder sb = new StringBuilder();
            sb.append("MemberSuggestedGroupsSyncManager/at required version: ");
            sb.append(A0O);
            sb.append(" vs ");
            sb.append(A002);
            Log.i(sb.toString());
            return;
        }
        Log.i("MemberSuggestedGroupsSyncManager/starting jobs to resync member suggested groups for all eligible communities.");
        r5.A1c("member_suggested_groups_sync_version", A002);
        ArrayList A032 = this.A01.A03();
        ArrayList arrayList = new ArrayList();
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof GroupJid) {
                arrayList.add(next);
            }
        }
        A00(arrayList);
    }
}
