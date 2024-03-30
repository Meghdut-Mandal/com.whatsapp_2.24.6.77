package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionPickerView;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2j6  reason: invalid class name and case insensitive filesystem */
public class C49432j6 extends C132446Tt {
    public final C20310xM A00;
    public final AnonymousClass1A1 A01;
    public final CharSequence A02;
    public final /* synthetic */ MentionPickerView A03;

    public C49432j6(C20310xM r1, MentionPickerView mentionPickerView, AnonymousClass1A1 r3, CharSequence charSequence) {
        this.A03 = mentionPickerView;
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = charSequence;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        HashSet A16 = C36441kJ.A16();
        int i = 0;
        AnonymousClass147 r6 = ((AnonymousClass147[]) objArr)[0];
        if (r6 == null) {
            return A16;
        }
        Cursor cursor = this.A00.A0S(r6, 15, 1, -1).A00;
        try {
            cursor.moveToPrevious();
            while (cursor.moveToNext() && i < 15) {
                AnonymousClass3T1 A012 = this.A01.A01(cursor, r6);
                C18740tg.A06(A012);
                if (!(A012 instanceof AnonymousClass2bI)) {
                    if (C65713Te.A05(this.A03.A05, A012.A0w)) {
                        A16.add((UserJid) A012.A0J());
                    }
                }
                i++;
            }
            cursor.close();
            return A16;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Set set = (Set) obj;
        MentionPickerView mentionPickerView = this.A03;
        mentionPickerView.A0P = true;
        C41091wb r4 = mentionPickerView.A0L;
        C81473x4 r1 = r4.A03;
        if (r1 == null) {
            C19730wQ r3 = r4.A0D;
            AnonymousClass171 r2 = r4.A0F;
            r1 = new C81473x4(r3, r2, r2.A07((AnonymousClass141) null, C65533Sl.A01(r4.A0J)));
            r4.A03 = r1;
        }
        r1.A00 = set;
        mentionPickerView.A0L.getFilter().filter(this.A02);
    }
}
