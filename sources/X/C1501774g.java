package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.74g  reason: invalid class name and case insensitive filesystem */
public class C1501774g implements Runnable {
    public final C97484pl A00;
    public final /* synthetic */ AnonymousClass6VR A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1501774g(AnonymousClass6VR r1, String str) {
        this();
        this.A01 = r1;
        this.A02 = str;
    }

    public void run() {
        Cursor A002;
        String str;
        byte[] bArr;
        try {
            C138936iw r2 = (C138936iw) this.A01.A04.A0D();
            C138686iW A012 = C109355Xg.A01("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", this.A02);
            AnonymousClass6Q8 r7 = r2.A02;
            r7.A05();
            r7.A06();
            try {
                A002 = C109365Xh.A00(r7, A012, true);
                AnonymousClass008 r5 = new AnonymousClass008();
                AnonymousClass008 r4 = new AnonymousClass008();
                while (A002.moveToNext()) {
                    String string = A002.getString(0);
                    if (((ArrayList) r5.get(string)) == null) {
                        r5.put(string, AnonymousClass001.A0I());
                    }
                    String string2 = A002.getString(0);
                    if (((ArrayList) r4.get(string2)) == null) {
                        r4.put(string2, AnonymousClass001.A0I());
                    }
                }
                A002.moveToPosition(-1);
                C138936iw.A01(r5, r2);
                C138936iw.A00(r4, r2);
                ArrayList A0n = C90474aD.A0n(A002);
                while (A002.moveToNext()) {
                    if (A002.isNull(0)) {
                        str = null;
                    } else {
                        str = A002.getString(0);
                    }
                    Integer A05 = AnonymousClass6XU.A05(A002.getInt(1));
                    if (A002.isNull(2)) {
                        bArr = null;
                    } else {
                        bArr = A002.getBlob(2);
                    }
                    AnonymousClass6X2 A003 = AnonymousClass6X2.A00(bArr);
                    int i = A002.getInt(3);
                    int i2 = A002.getInt(4);
                    ArrayList arrayList = (ArrayList) r5.get(A002.getString(0));
                    if (arrayList == null) {
                        arrayList = AnonymousClass001.A0I();
                    }
                    ArrayList arrayList2 = (ArrayList) r4.get(A002.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = AnonymousClass001.A0I();
                    }
                    A0n.add(new AnonymousClass6DQ(A003, A05, str, arrayList, arrayList2, i, i2));
                }
                r7.A07();
                A002.close();
                A012.A00();
                AnonymousClass6Q8.A01(r7);
                this.A00.A06((List) AnonymousClass6QA.A0K.apply(A0n));
            } catch (Throwable th) {
                AnonymousClass6Q8.A01(r7);
                throw th;
            }
        } catch (Throwable th2) {
            this.A00.A07(th2);
        }
    }

    public C1501774g() {
        this.A00 = new C97484pl();
    }
}
