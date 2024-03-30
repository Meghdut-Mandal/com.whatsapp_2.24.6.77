package X;

import android.content.ContentValues;
import com.whatsapp.textstatus.AddTextStatusActivity;

/* renamed from: X.3vH  reason: invalid class name and case insensitive filesystem */
public class C80363vH implements Runnable {
    public long A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C80363vH(Object obj, String str, int i, long j) {
        this.A03 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A00 = j;
    }

    public final void run() {
        if (this.A03 != 0) {
            String str = this.A02;
            long j = this.A00;
            AnonymousClass32S r0 = ((AnonymousClass3DT) this.A01).A00;
            C18740tg.A00();
            AnonymousClass1M0 A04 = r0.A00.A04();
            try {
                ContentValues A0E = C36441kJ.A0E();
                A0E.put("chat_jid", str);
                C36341k9.A0p(A0E, "page_number", j);
                A04.A02.A06("draft_voice_note_metadata", "draft_voice_note_metadata.INSERT_OR_PAGE_NUMBER_FOR_CHAT_JID", A0E);
                A04.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            AddTextStatusActivity addTextStatusActivity = (AddTextStatusActivity) this.A01;
            String str2 = this.A02;
            long j2 = this.A00;
            AnonymousClass00C.A0D(str2, 1);
            AnonymousClass1YZ r4 = addTextStatusActivity.A0A;
            if (r4 != null) {
                int i = 60;
                int length = str2.length();
                if (60 > length) {
                    i = length;
                }
                r4.A02(j2, C36431kI.A16(0, i, str2), false, addTextStatusActivity.A0E);
                return;
            }
            throw C36331k8.A0d("myEvolvedAbout");
        }
    }
}
