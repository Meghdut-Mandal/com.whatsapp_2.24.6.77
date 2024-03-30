package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.8YI  reason: invalid class name */
public class AnonymousClass8YI extends AnonymousClass1LZ {
    public final C19730wQ A00;
    public final C21158AAs A01;
    public final AnonymousClass1AB A02;
    public final AnonymousClass1A6 A03;
    public final AnonymousClass1DH A04;
    public final C19970wo A05;
    public final C19420v0 A06;
    public final AnonymousClass1DP A07;
    public final AnonymousClass163 A08;
    public final C220412q A09;

    public String A0B() {
        return "regular_low";
    }

    public String A0C() {
        return "setting_unarchiveChats";
    }

    public boolean A0H() {
        return true;
    }

    private void A00(AnonymousClass11F r4, boolean z) {
        C65073Qp A0W = C36371kC.A0W(this.A09, r4);
        if (A0W != null && A0W.A0i != z) {
            C36321k7.A1X("UnarchiveChatsSettingsHAndler/setArchive -", AnonymousClass000.A0u(), z);
            A0W.A0i = z;
            this.A08.A0E(A0W);
            this.A07.A00();
        }
    }

    public C201669k5 A0A(C202599mH r12, String str, boolean z) {
        String[] strArr = r12.A06;
        C199769fw r3 = r12.A01;
        AnonymousClass8SS r2 = r12.A03;
        if (strArr.length != 1 || !"setting_unarchiveChats".equals(C165617ti.A0a(strArr)) || !C199769fw.A03.equals(r3) || r2 == null || !C165577te.A1W(r2.bitField0_) || (r2.bitField0_ & 262144) == 0) {
            return null;
        }
        long j = r2.timestamp_;
        C201539jo r6 = r12.A02;
        AnonymousClass8OS r0 = r2.unarchiveChatsSetting_;
        if (r0 == null) {
            r0 = AnonymousClass8OS.DEFAULT_INSTANCE;
        }
        return new C175998bP(r6, str, j, r0.unarchiveChats_);
    }

    public List A0D(boolean z) {
        C19420v0 r1 = this.A06;
        if (!r1.A2F() || this.A00.A0L()) {
            Log.i("unarchive-chats-setting-handler/createBootstrapMutations/empty");
            return Collections.emptyList();
        }
        Log.i("unarchive-chats-setting-handler/createBootstrapMutations");
        if (z) {
            return A0I();
        }
        return Collections.singletonList(new C175998bP((C201539jo) null, (String) null, C19970wo.A00(this.A05), r1.A2G()));
    }

    public /* bridge */ /* synthetic */ void A0G(C201669k5 r10, C201669k5 r11) {
        Cursor A092;
        C175998bP r102 = (C175998bP) r10;
        if (this.A00.A0L()) {
            if (r102.A05 == C199769fw.A03) {
                C19420v0 r3 = this.A06;
                if (!r3.A2F()) {
                    AnonymousClass1DH r1 = this.A04;
                    C18740tg.A0C(r1.A00.A0L());
                    C36331k8.A0w(C19420v0.A00(r1.A02), "archive_v2_enabled", true);
                }
                boolean z = r102.A00;
                C36331k8.A0w(C19420v0.A00(r3), "notify_new_message_for_archived_chats", z);
                if (z) {
                    AnonymousClass1AC r8 = this.A00;
                    ArrayList A0I = AnonymousClass001.A0I();
                    AnonymousClass1M0 A032 = r8.A00.get();
                    try {
                        C224114e r32 = A032.A02;
                        String[] A1S = C36441kJ.A1S();
                        A1S[0] = "archive";
                        C36431kI.A1O(A1S, 0, 1);
                        A092 = r32.A09("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE mutation_name = ? AND are_dependencies_missing = ?", "syncd_mutationsSELECT_STORED_MUTATIONS_BY_MUTATION_NAME_AND_DEPENDENCY", A1S);
                        while (A092.moveToNext()) {
                            C201669k5 A012 = AnonymousClass1AC.A01(A092, r8);
                            if (A012 != null) {
                                A0I.add(A012);
                            }
                        }
                        A092.close();
                        A032.close();
                        ListIterator listIterator = A0I.listIterator();
                        while (listIterator.hasNext()) {
                            if (!((C176078bX) listIterator.next()).A02) {
                                listIterator.remove();
                            }
                        }
                        Iterator it = A0I.iterator();
                        while (it.hasNext()) {
                            C176078bX r33 = (C176078bX) it.next();
                            C21158AAs aAs = this.A01;
                            AnonymousClass11F r2 = r33.A01;
                            int A002 = C202679mP.A00(aAs.A04(r2, false), r33.A00);
                            if (A002 == 0 || !(A002 == 1 || A002 == 2)) {
                                Log.i("UnarchiveChatsSettingHandler/handleSettingOn/setArchivedState - false");
                                A00(r2, false);
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            A032.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    ArrayList A042 = AnonymousClass1AC.A04(this.A00, "archive", false);
                    ListIterator listIterator2 = A042.listIterator();
                    while (listIterator2.hasNext()) {
                        if (!((C176078bX) listIterator2.next()).A02) {
                            listIterator2.remove();
                        }
                    }
                    Iterator it2 = A042.iterator();
                    while (it2.hasNext()) {
                        Log.i("UnarchiveChatsSettingHandler/handleSettingOff/setArchivedState - true");
                        A00(((C176078bX) it2.next()).A01, true);
                    }
                }
            } else {
                return;
            }
        }
        A07(r102);
        return;
        throw th;
    }

    public List A0I() {
        Cursor A092;
        if (this.A00.A0L()) {
            C18740tg.A0D(false, "unarchive-chats-setting-handler/Companion should not create Unarchive Chats Setting mutation");
            return Collections.emptyList();
        }
        Log.i("unarchive-chats-setting-handler/onUnarchiveChatsSettingChanged");
        ArrayList A0I = AnonymousClass001.A0I();
        HashSet A0k = C90524aI.A0k(this.A03.A05());
        AnonymousClass1AC r0 = this.A00;
        ArrayList A0I2 = AnonymousClass001.A0I();
        AnonymousClass1M0 A032 = r0.A00.get();
        try {
            C224114e r7 = A032.A02;
            String[] A1S = C36441kJ.A1S();
            A1S[0] = "archive";
            C36431kI.A1O(A1S, 0, 1);
            A092 = r7.A09("SELECT chat_jid FROM syncd_mutations WHERE mutation_name = ? AND are_dependencies_missing = ?", "syncd_mutations.SELECT_CHAT_JIDS_BY_MUTATION_NAME_AND_DEPENDENCY", A1S);
            int columnIndexOrThrow = A092.getColumnIndexOrThrow("chat_jid");
            while (A092.moveToNext()) {
                AnonymousClass11F A0N = C36421kH.A0N(A092.getString(columnIndexOrThrow));
                C18740tg.A06(A0N);
                A0I2.add(A0N);
            }
            A092.close();
            A032.close();
            ListIterator listIterator = A0I2.listIterator();
            C19420v0 r3 = this.A06;
            if (r3.A2G()) {
                while (listIterator.hasNext()) {
                    if (!A0k.contains(listIterator.next())) {
                        listIterator.remove();
                    }
                }
                Iterator it = A0I2.iterator();
                while (it.hasNext()) {
                    AnonymousClass11F r9 = (AnonymousClass11F) it.next();
                    this.A02.A07(1);
                    C19970wo r5 = this.A05;
                    A0I.add(new C176108ba(r9, C19970wo.A00(r5), false));
                    A0I.add(new C176078bX(this.A01.A04(r9, false), r9, C19970wo.A00(r5), true));
                }
            } else {
                while (listIterator.hasNext()) {
                    if (A0k.contains(listIterator.next())) {
                        listIterator.remove();
                    }
                }
                Iterator it2 = A0I2.iterator();
                while (it2.hasNext()) {
                    AnonymousClass11F r10 = (AnonymousClass11F) it2.next();
                    A0I.add(new C176078bX(this.A01.A04(r10, false), r10, C19970wo.A00(this.A05), false));
                }
            }
            ArrayList A15 = C36441kJ.A15(A0I);
            A15.add(new C175998bP((C201539jo) null, (String) null, C19970wo.A00(this.A05), r3.A2G()));
            return A15;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass8YI(C19730wQ r1, C21158AAs aAs, AnonymousClass1AB r3, AnonymousClass1A6 r4, AnonymousClass1DH r5, C19970wo r6, C19420v0 r7, AnonymousClass1DP r8, AnonymousClass163 r9, C220412q r10, AnonymousClass1AC r11) {
        super(r11);
        this.A05 = r6;
        this.A08 = r9;
        this.A00 = r1;
        this.A09 = r10;
        this.A04 = r5;
        this.A07 = r8;
        this.A01 = aAs;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r1) {
        A05(r1);
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r1) {
        A06(r1);
    }
}
