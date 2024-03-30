package X;

import android.content.ContentValues;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Jr  reason: invalid class name and case insensitive filesystem */
public class C26311Jr {
    public static final int A0B = ((int) TimeUnit.DAYS.toSeconds(60));
    public final C19730wQ A00;
    public final AnonymousClass163 A01;
    public final AnonymousClass12P A02;
    public final C20170x8 A03;
    public final C26321Js A04;
    public final C26341Ju A05;
    public final C20310xM A06;
    public final AnonymousClass1DQ A07;
    public final C26351Jv A08;
    public final C238019x A09;
    public final AnonymousClass1A1 A0A;

    public LinkedHashMap A00(AnonymousClass11F r6) {
        ArrayList A072 = this.A03.A07(this.A05.A00(), this.A01.A08(r6));
        StringBuilder sb = new StringBuilder();
        sb.append("MessageAddOnPinInChatManager/getPinnedMessagesParentsInLimit/pinnedAddOns size:");
        sb.append(A072.size());
        Log.i(sb.toString());
        LinkedHashMap linkedHashMap = new LinkedHashMap(A072.size());
        Iterator it = A072.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A002 = C65733Tg.A00((AnonymousClass2bM) it.next(), this.A0A);
            if (A002 != null) {
                C64933Qa r1 = A002.A1J;
                if (!linkedHashMap.containsKey(r1)) {
                    linkedHashMap.put(r1, A002);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageAddOnPinInChatManager/getPinnedMessagesParentsInLimit/pinnedParentMessages size:");
        sb2.append(linkedHashMap.size());
        Log.i(sb2.toString());
        return linkedHashMap;
    }

    public void A01(C1495671s r20, C26911Lz r21, long j) {
        Integer num;
        int A002 = this.A05.A00();
        C20170x8 r7 = this.A03;
        ArrayList A072 = r7.A07(-1, j);
        StringBuilder sb = new StringBuilder();
        sb.append("MessageAddOnPinInChatManager/unpinOldPinsIfExceedLimit/pinnedAddOns size:");
        sb.append(A072.size());
        Log.i(sb.toString());
        while (A002 < A072.size()) {
            AnonymousClass5J2 r3 = (AnonymousClass5J2) A072.get(A002);
            r3.A00 = 0;
            long j2 = r3.A1N;
            AnonymousClass1M0 A052 = r7.A03.A05();
            try {
                ContentValues contentValues = new ContentValues(6);
                contentValues.put("key_id", r3.A1J.A01);
                contentValues.put("timestamp", Long.valueOf(r3.A0I));
                contentValues.put("status", Integer.valueOf(r3.A0D));
                int A1X = r3.A1X();
                Long l = null;
                if (A1X <= 0) {
                    num = null;
                } else {
                    num = Integer.valueOf(A1X);
                }
                contentValues.put("expiry_duration_in_secs", num);
                long j3 = r3.A00;
                if (j3 > 0) {
                    l = Long.valueOf(j3);
                }
                contentValues.put("expiry_timestamp", l);
                contentValues.put("server_timestamp", Long.valueOf(r3.A02));
                A052.A02.A01(contentValues, "message_add_on", "_id = ?", "MessageAddOnStore/updateMessageAddOn", new String[]{String.valueOf(j2)});
                A052.close();
                long j4 = r3.A1N;
                C224114e r11 = ((AnonymousClass1M0) r21).A02;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("message_add_on_row_id", Long.valueOf(j4));
                contentValues2.put("pin_in_chat_state", Integer.valueOf(r3.A00));
                contentValues2.put("sender_timestamp", Long.valueOf(r3.A01));
                r11.A01(contentValues2, "message_add_on_pin_in_chat", "message_add_on_row_id = ?", "MessageAddOnPinInChatStore/updateMessageAddOnPinInChat", new String[]{String.valueOf(j4)});
                AnonymousClass3T1 A003 = C65733Tg.A00(r3, this.A0A);
                if (A003 != null) {
                    r3.A04 = new C195759Vv(A003.A0J(), A003.A1J);
                    A02(r20, A003, r3);
                    Message.obtain(this.A07.A02, 2, 34, 0, A003).sendToTarget();
                }
                A002++;
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public void A03(AnonymousClass5J2 r8) {
        AnonymousClass11F A0L;
        C64933Qa r0 = r8.A1J;
        AnonymousClass11F r6 = r0.A00;
        if (r6 != null) {
            if (r0.A02) {
                C19730wQ r02 = this.A00;
                r02.A0G();
                A0L = r02.A03;
            } else {
                A0L = r8.A0L();
            }
            if (r8.A00 == 1) {
                C20310xM r4 = this.A06;
                C238019x r03 = this.A09;
                C181138mz r04 = new C181138mz(r03.A01.A02(r6, true), r8.A0I);
                r04.A0q(A0L);
                r4.A0h(r04);
            }
        }
    }

    public C26311Jr(C19730wQ r1, AnonymousClass163 r2, C20310xM r3, AnonymousClass1DQ r4, AnonymousClass12P r5, C26351Jv r6, C20170x8 r7, C26321Js r8, C26341Ju r9, C238019x r10, AnonymousClass1A1 r11) {
        this.A01 = r2;
        this.A00 = r1;
        this.A07 = r4;
        this.A0A = r11;
        this.A06 = r3;
        this.A03 = r7;
        this.A04 = r8;
        this.A02 = r5;
        this.A09 = r10;
        this.A05 = r9;
        this.A08 = r6;
    }

    public void A02(C1495671s r3, AnonymousClass3T1 r4, AnonymousClass5J2 r5) {
        C18740tg.A0D(r3.A01(), "CoreMessageStore methods must be called within a live DB transaction");
        r4.A1V = r5;
        if (!r4.A1S(8)) {
            r4.A0i(8);
            this.A06.A0j(r4);
        }
        this.A06.A0W.A0B(r4);
    }
}
