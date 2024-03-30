package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1AK  reason: invalid class name */
public class AnonymousClass1AK {
    public final AnonymousClass1AC A00;
    public final AnonymousClass1AM A01;
    public final AnonymousClass1AE A02;
    public final AnonymousClass1AB A03;
    public final AnonymousClass1AN A04;

    public static void A00(AnonymousClass1AK r5, String str) {
        synchronized (r5) {
            Iterator it = AnonymousClass1AC.A03(new AAP(str), r5.A00, "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 ORDER BY _id ASC", "SyncdMutationsTable.SELECT_ALL_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES", (String[]) null).iterator();
            while (it.hasNext()) {
                r5.A03((C201669k5) it.next());
            }
        }
    }

    public void A04(String str) {
        Cursor A09;
        synchronized (this) {
            AnonymousClass1AC r7 = this.A00;
            List singletonList = Collections.singletonList(str);
            ArrayList arrayList = new ArrayList();
            if (!singletonList.isEmpty()) {
                AnonymousClass72Z r1 = new AnonymousClass72Z(singletonList.toArray(C19430v1.A0N), 975);
                AnonymousClass1M0 A032 = r7.A00.get();
                try {
                    Iterator it = r1.iterator();
                    while (it.hasNext()) {
                        String[] strArr = (String[]) it.next();
                        C224114e r3 = A032.A02;
                        int length = strArr.length;
                        StringBuilder sb = new StringBuilder();
                        sb.append("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 AND mutation_index IN ");
                        sb.append(AnonymousClass1M2.A00(length));
                        A09 = r3.A09(sb.toString(), "SyncdMutationsTable.buildSelectStoredMutationsWhereDependenciesMissingByIndices", strArr);
                        while (A09.moveToNext()) {
                            C201669k5 A012 = AnonymousClass1AC.A01(A09, r7);
                            if (A012 != null) {
                                arrayList.add(A012);
                            }
                        }
                        A09.close();
                    }
                    A032.close();
                } catch (Throwable th) {
                    try {
                        A032.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                A03((C201669k5) it2.next());
            }
        }
        return;
        throw th;
    }

    public void A05(Collection collection) {
        synchronized (this) {
            this.A00.A0G(collection);
        }
    }

    public C201669k5 A01(C202599mH r9) {
        StringBuilder sb;
        String str;
        String str2 = r9.A06[0];
        AnonymousClass1LZ A002 = this.A02.A00(str2);
        if (A002 == null) {
            sb = new StringBuilder();
            str = "mutation-handlers/handleMutation no mutation handlers found to handle mutation: ";
        } else if (A002.A0H()) {
            try {
                C201669k5 A0A = A002.A0A(r9, (String) null, false);
                if (A0A != null) {
                    A0A.A01 = r9.A05;
                    return A0A;
                }
            } catch (AnonymousClass1AD e) {
                this.A03.A08(e.errorCode, (String) null);
            }
            sb = new StringBuilder();
            str = "mutation-handlers/handleMutation the handler couldn't create a valid mutation for ";
        } else {
            sb = new StringBuilder();
            str = "mutation-handlers/handler was not active for ";
        }
        sb.append(str);
        sb.append(str2);
        Log.e(sb.toString());
        String str3 = r9.A04;
        Integer valueOf = Integer.valueOf(r9.A00);
        byte[] bArr = r9.A05;
        C18740tg.A06(bArr);
        throw new C176158bf(r9.A01, r9.A02, r9.A03, valueOf, str3, bArr, 6);
    }

    public void A03(C201669k5 r3) {
        AnonymousClass1AE r1 = this.A02;
        if (r3 != null) {
            String A07 = r3.A07();
            AnonymousClass00C.A08(A07);
            AnonymousClass1LZ A002 = r1.A00(A07);
            if (A002 != null) {
                A002.A0E(r3);
            }
        }
    }

    public AnonymousClass1AK(AnonymousClass1AB r1, AnonymousClass1AN r2, AnonymousClass1AC r3, AnonymousClass1AM r4, AnonymousClass1AE r5) {
        this.A02 = r5;
        this.A03 = r1;
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = r2;
    }

    public void A02(C201669k5 r4) {
        if (r4.A09() && (r4 instanceof C22936Aym) && AnonymousClass1AN.A00(r4.A07())) {
            AnonymousClass1AN r2 = this.A04;
            AnonymousClass11F chatJid = ((C22936Aym) r4).getChatJid();
            synchronized (r2) {
                Set set = r2.A00;
                if (set != null) {
                    set.add(chatJid);
                }
            }
        }
    }
}
